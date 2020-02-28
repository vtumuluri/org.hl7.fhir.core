package org.hl7.fhir.android.parser.utils;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassUtils {

  public static final String PACKAGE_DECLARATION_BASE_CLASS = "org.hl7.fhir.android.generated.%1$s";


  /**
   * Searched the passed in {@link ClassOrInterfaceDeclaration} for all Enum classes and extracts them into a new java
   * file. In addition to extracting the found enum files, we also search for the associated EnumFactoryClass
   *
   * @param c The {@link ClassOrInterfaceDeclaration} to search
   */
  public static void extractInnerClasses(CompilationUnit baseCompilationUnit, ClassOrInterfaceDeclaration c, String destinationDirectory, String fhirVersion) throws IOException {

    String projectDirectory = new File("").getAbsolutePath();

    Set<ClassOrInterfaceDeclaration> foundClasses = getClassDeclarations(c);

    if (!foundClasses.isEmpty()) {
      // Enums exist within this class, we need to extract them, and their corresponding EnumFactories to separate files
      final String targetDirectory = projectDirectory + destinationDirectory;

      for (ClassOrInterfaceDeclaration dec : foundClasses) {
        generateClass(baseCompilationUnit, fhirVersion, targetDirectory, dec);
        baseCompilationUnit.setPackageDeclaration(String.format(PACKAGE_DECLARATION_BASE_CLASS, fhirVersion));
      }
    }
  }

  /**
   * Generates the new class, and removes the current {@link ClassOrInterfaceDeclaration} from the containing
   * {@link ClassOrInterfaceDeclaration}
   *
   * @param baseCompilationUnit
   * @param fhirVersion
   * @param targetDirectory
   * @param c
   * @throws IOException
   */
  public static void generateClass(CompilationUnit baseCompilationUnit, String fhirVersion, String targetDirectory, ClassOrInterfaceDeclaration c) throws IOException {
    CompilationUnit compilationUnit = new CompilationUnit();
    ClassOrInterfaceDeclaration generatedClass = compilationUnit.addClass(c.getNameAsString());
    ParserUtils.copyClassOrInterfaceDeclaration(c, generatedClass);
    baseCompilationUnit.getImports().forEach(compilationUnit::addImport);
    compilationUnit.setPackageDeclaration(String.format(PACKAGE_DECLARATION_BASE_CLASS, fhirVersion));
    generatedClass.setModifier(Modifier.Keyword.STATIC, false);
    FileUtils.writeStringToFile(compilationUnit.toString(), targetDirectory + "/" + c.getNameAsString() + ".java");
    c.remove();
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

}
