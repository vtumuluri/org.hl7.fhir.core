package org.hl7.fhir.android.parser.utils;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;
import javafx.util.Pair;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ClassUtils {

  public static final String PACKAGE_DECLARATION_BASE_CLASS = "org.hl7.fhir.android.generated.%1$s";
  public static final String OLD_EXPLICIT_PACKAGE_DEC = "org.hl7.fhir.%1$s.model.";
  public static final String NEW_EXPLICIT_PACKAGE_DEC = "org.hl7.fhir.android.generated.%1$s.";
  public static final String OLD_ENUMERATION_IMPORT = "org.hl7.fhir.%1$s.model.Enumerations.";
  public static final String NEW_ENUMERATION_IMPORT = "org.hl7.fhir.android.generated.%1$s.EnumerationsEnum.%2$s";


  /**
   * Searched the passed in {@link ClassOrInterfaceDeclaration} for all Enum classes and extracts them into a new java
   * file. In addition to extracting the found enum files, we also search for the associated EnumFactoryClass
   *
   * @param c The {@link ClassOrInterfaceDeclaration} to search
   * @param generatedClassMap
   */
  public static void extractInnerClasses(CompilationUnit baseCompilationUnit, ClassOrInterfaceDeclaration c, String destinationDirectory, String fhirVersion, Map<File, CompilationUnit> generatedClassMap) throws IOException {
    String projectDirectory = new File("").getAbsolutePath();

    Set<ClassOrInterfaceDeclaration> foundClasses = getClassDeclarations(c);
    final String targetDirectory = projectDirectory + destinationDirectory;
    CompilationUnit fileContent = null;

    if (!foundClasses.isEmpty()) {
      // Classes exist within this class, we need to extract them to separate files
      for (ClassOrInterfaceDeclaration dec : foundClasses) {
        fileContent = generateClassData(baseCompilationUnit, fhirVersion, dec);
        baseCompilationUnit.setPackageDeclaration(String.format(PACKAGE_DECLARATION_BASE_CLASS, fhirVersion));
        generatedClassMap.put(new File(targetDirectory + "/" + dec.getNameAsString() + ".java"), fileContent);
      }
    }
  }

  /**
   * Generates the new class, and removes the current {@link ClassOrInterfaceDeclaration} from the containing
   * {@link ClassOrInterfaceDeclaration}
   *
   * @param baseCompilationUnit
   * @param fhirVersion
   * @param c
   * @throws IOException
   */
  public static CompilationUnit generateClassData(CompilationUnit baseCompilationUnit, String fhirVersion, ClassOrInterfaceDeclaration c) {
    CompilationUnit compilationUnit = new CompilationUnit();
    ClassOrInterfaceDeclaration generatedClass = compilationUnit.addClass(c.getNameAsString());
    ParserUtils.copyClassOrInterfaceDeclaration(c, generatedClass);
    baseCompilationUnit.getImports().forEach(compilationUnit::addImport);
    baseCompilationUnit.setPackageDeclaration(String.format(PACKAGE_DECLARATION_BASE_CLASS, fhirVersion));
    compilationUnit.setPackageDeclaration(String.format(PACKAGE_DECLARATION_BASE_CLASS, fhirVersion));
    generatedClass.setModifier(Modifier.Keyword.STATIC, false);
    c.remove();
    return compilationUnit;
  }

  /**
   * Searches the passes in compilation unit for explicit package references to the old version of the FHIR Model files,
   * and then removes them. (We shouldn't need to keep them in, as we've flattened the folder structure.
   *
   * @param fileContents {@link CompilationUnit} to search.
   * @param currentFhirVersion {@link String} the current fhir version string we will use to construct the search string. ie
   *                                  "dstu2" -> org.hl7.fhir.dstu2.model.
   * @return The resulting String body of the parsed {@link CompilationUnit}
   */
  public static void removeExplicitPackageReferences(CompilationUnit fileContents, String currentFhirVersion) {
    NodeList<ImportDeclaration> imports = fileContents.getImports();
    NodeList<ImportDeclaration> newImports = new NodeList<>();
    imports.forEach(i -> {
      // Order here matters, do enumerations class fixes first, then the rest
      if (i.getNameAsString().contains(String.format(OLD_ENUMERATION_IMPORT, currentFhirVersion))) {
        i.setName(String.format(NEW_ENUMERATION_IMPORT, currentFhirVersion, i.getNameAsString().substring(i.getNameAsString().lastIndexOf('.') + 1)));
      }
      if(i.getNameAsString().contains(String.format(OLD_EXPLICIT_PACKAGE_DEC, currentFhirVersion))) {
          i.setName(i.getNameAsString().replace(String.format(OLD_EXPLICIT_PACKAGE_DEC, currentFhirVersion), String.format(NEW_EXPLICIT_PACKAGE_DEC, currentFhirVersion)));
      }
      newImports.add(new ImportDeclaration(i.getName(), i.isStatic(), i.isAsterisk()));
    });
    fileContents.setImports(newImports);
  }

  /**
   * Searches the passed in {@link ClassOrInterfaceDeclaration} for all {@link ClassOrInterfaceDeclaration} and returns
   * them in a {@link List}
   *
   * @param c {@link ClassOrInterfaceDeclaration} to search within
   * @return {@link List<ClassOrInterfaceDeclaration>}
   */
  public static Set<ClassOrInterfaceDeclaration> getClassDeclarations(ClassOrInterfaceDeclaration c) {
    Set<ClassOrInterfaceDeclaration> foundClasses = new HashSet<>();

    c.accept(new ModifierVisitor<Void>() {
      @Override
      public Visitable visit(ClassOrInterfaceDeclaration classDec, Void arg) {
        super.visit(classDec, arg);
        // We don't want to pull the containing class as one of our declarations
        if (!classDec.getNameAsString().equals(c.getNameAsString())) {
          foundClasses.add(classDec);
        }
        System.out.println(classDec.getNameAsString());
        return classDec;
      }
    }, null);

    return foundClasses;
  }

  public static void cleanImports(Map<String, String> mOldImportToNewEnumImportMap, CompilationUnit compilationUnit, String currentFhirVersion) {
    compilationUnit.getImports().forEach(i -> {
      // Replace all newly mapped enum and enumfactory imports
      if (mOldImportToNewEnumImportMap.containsKey(i.getNameAsString())) {
        i.setName(mOldImportToNewEnumImportMap.get(i.getNameAsString()));
      }
      // Replace all resource reference imports
      if(i.getNameAsString().contains(String.format(OLD_EXPLICIT_PACKAGE_DEC, currentFhirVersion))) {
        i.setName(i.getNameAsString().replace(String.format(OLD_EXPLICIT_PACKAGE_DEC, currentFhirVersion), String.format(NEW_EXPLICIT_PACKAGE_DEC, currentFhirVersion)));
      }
    });
  }

  public static String cleanLooseReferences(CompilationUnit compilationUnit, String dstu2) {
    return compilationUnit.toString().replaceAll(String.format(OLD_EXPLICIT_PACKAGE_DEC, dstu2), "");
  }
}
