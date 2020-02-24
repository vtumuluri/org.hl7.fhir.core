package org.hl7.fhir.android.parser.parserutils;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.TypeParameter;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class EnumUtils {

  /*
   * %1$s - FHIR version level. ie: dstu2, dstu3, r4, r5
   * %2$s - Name of the base resource class the enum was extracted from. ie: Account, Patient, Observation
   * %3$s - Name of the extracted enum. ie: AccountStatus, DayOfWeek
   */
  public static final String BASE_CLASS_ENUM_IMPORT = "org.hl7.fhir.android.generated.%1$s.%2$sEnum.%3$s";
  public static final String BASE_CLASS_ENUM_FACTORY_IMPORT = "org.hl7.fhir.android.generated.%1$s.%2$sEnum.%3$sEnumFactory";
  public static final String PACKAGE_DECLARATION_BASE_CLASS = "org.hl7.fhir.android.generated.%1$s";
  public static final String PACKAGE_DECLARATION_ENUM_CLASS = PACKAGE_DECLARATION_BASE_CLASS + ".%2$sEnum";
  public static final String PACKAGE_DECLARATION_ENUM_FACTORY_CLASS = PACKAGE_DECLARATION_BASE_CLASS + ".%2$sEnum";
  public static final String IMPORT_GENERATED_ENUM = "org.hl7.fhir.android.generated.%1$s.%2$sEnum.%3$s";
  public static final String IMPORT_FHIR_EXCEPTION = "org.hl7.fhir.exceptions.FHIRException";
  public static final String IMPORT_FHIR_BASE = "org.hl7.fhir.android.generated.%1$s.Base";
  public static final String IMPORT_FHIR_ENUM_FACTORY = "org.hl7.fhir.android.generated.%1$s.EnumFactory";
  public static final String IMPORT_FHIR_ENUMERATION = "org.hl7.fhir.android.generated.%1$s.Enumeration";
  public static final String IMPORT_FHIR_PRIMITIVE_TYPE = "org.hl7.fhir.android.generated.%1$s.PrimitiveType";

  /*
   * %1$s - Name of the base resource class the enum was extracted from. ie: Account, Patient, Observation
   */
  public static final String GENERATED_FOLDER_NAME = "/%1$sEnum";

  /*
   * %1$s - Name of the enum class corresponding to this EnumFactory. ie: AccountStatus -> AccountStatusEnumFactory
   */
  public static final String ENUM_FACTORY_NAME_FORMAT = "%1$sEnumFactory";

  public static final List<String> BASE_RESOURCE_CLASS_ADDITIONAL_IMPORTS = Arrays.asList(BASE_CLASS_ENUM_IMPORT,
    BASE_CLASS_ENUM_FACTORY_IMPORT);
  public static final List<String> GENERATED_ENUM_IMPORT_LIST = Arrays.asList(IMPORT_FHIR_EXCEPTION);
  public static final List<String> GENERATED_ENUM_FACTORY_IMPORT_LIST = Arrays.asList(IMPORT_FHIR_BASE,
    IMPORT_FHIR_ENUM_FACTORY, IMPORT_FHIR_ENUMERATION, IMPORT_FHIR_PRIMITIVE_TYPE, IMPORT_GENERATED_ENUM, IMPORT_FHIR_EXCEPTION);

  public static void extractOuterEnumClasses(String directoryToSearch, String destinationDirectory, String fhirVersion) {
    List<String> allFiles = FileUtils.listAllJavaFilesInDirectory(directoryToSearch);

  }

  /**
   * Searched the passed in {@link ClassOrInterfaceDeclaration} for all Enum classes and extracts them into a new java
   * file. In addition to extracting the found enum files, we also search for the associated EnumFactoryClass
   *
   * @param c The {@link ClassOrInterfaceDeclaration} to search
   */
  public static void extractInnerEnumClasses(CompilationUnit baseCompilationUnit, ClassOrInterfaceDeclaration c, String destinationDirectory, String fhirVersion) throws IOException {

    String projectDirectory = new File("").getAbsolutePath();

    Set<EnumDeclaration> foundEnums = getEnumDeclarations(c);

    if (!foundEnums.isEmpty()) {
      // Enums exist within this class, we need to extract them, and their corresponding EnumFactories to separate files
      final String targetDirectory = projectDirectory + destinationDirectory + String.format(GENERATED_FOLDER_NAME, c.getName());
      FileUtils.createDirectory(targetDirectory);

      for (EnumDeclaration e : foundEnums) {
        generateEnumClass(c, fhirVersion, targetDirectory, e);
        generateEnumFactoryClass(c, fhirVersion, targetDirectory, e, c.getNameAsString());

        baseCompilationUnit.setPackageDeclaration(String.format(PACKAGE_DECLARATION_BASE_CLASS, fhirVersion));
        BASE_RESOURCE_CLASS_ADDITIONAL_IMPORTS.forEach(i -> {
          baseCompilationUnit.addImport(String.format(i, fhirVersion, c.getNameAsString(), e.getNameAsString()));
        });
      }
    }
  }

  /**
   * Generates the EnumFactory class and removes the current {@link EnumDeclaration} from the containing
   * {@link ClassOrInterfaceDeclaration}
   *
   * @param c
   * @param fhirVersion
   * @param e
   */
  public static void generateEnumFactoryClass(ClassOrInterfaceDeclaration c, String fhirVersion, String targetDirectory, EnumDeclaration e, String parentClassName) throws IOException {
    List<ClassOrInterfaceDeclaration> collect = new ArrayList<>();

    c.accept(new VoidVisitorAdapter<List<ClassOrInterfaceDeclaration>>() {
      @Override
      public void visit(ClassOrInterfaceDeclaration classOrInterfaceDeclaration, List<ClassOrInterfaceDeclaration> arg) {
        super.visit(classOrInterfaceDeclaration, arg);
        if (classOrInterfaceDeclaration.getNameAsString().equals(String.format(ENUM_FACTORY_NAME_FORMAT, e.getNameAsString()))) {
          collect.add(classOrInterfaceDeclaration);
        }
      }
    }, collect);

    for (ClassOrInterfaceDeclaration classOrInterfaceDeclaration : collect) {
      CompilationUnit compilationUnit = new CompilationUnit();
      ClassOrInterfaceDeclaration generatedEnumFactory = compilationUnit.addClass(String.format(ENUM_FACTORY_NAME_FORMAT, e.getNameAsString()));
      ParserUtils.copyClassOrInterfaceDeclaration(classOrInterfaceDeclaration, generatedEnumFactory);
      generatedEnumFactory.setModifier(Modifier.Keyword.STATIC, false);
      compilationUnit.setPackageDeclaration(String.format(PACKAGE_DECLARATION_ENUM_FACTORY_CLASS, fhirVersion, parentClassName));
      GENERATED_ENUM_FACTORY_IMPORT_LIST.forEach(i -> {
        compilationUnit.addImport(String.format(i, fhirVersion, c.getNameAsString(), e.getNameAsString()));
      });
      FileUtils.writeStringToFile(compilationUnit.toString(), targetDirectory + "/" + classOrInterfaceDeclaration.getNameAsString() + ".java");
      classOrInterfaceDeclaration.remove();
    }
  }

  /**
   * Generates the new enum class, and removes the current {@link EnumDeclaration} from the containing
   * {@link ClassOrInterfaceDeclaration}
   *
   * @param c
   * @param fhirVersion
   * @param targetDirectory
   * @param e
   * @throws IOException
   */
  public static void generateEnumClass(ClassOrInterfaceDeclaration c, String fhirVersion, String targetDirectory, EnumDeclaration e) throws IOException {
    CompilationUnit compilationUnit = new CompilationUnit();
    ParserUtils.copyEnumDeclaration(e, compilationUnit.addEnum(e.getNameAsString()));
    compilationUnit.setImports(new NodeList<>());
    compilationUnit.setPackageDeclaration(String.format(PACKAGE_DECLARATION_ENUM_CLASS, fhirVersion, c.getName()));
    GENERATED_ENUM_IMPORT_LIST.forEach(i -> {
      compilationUnit.addImport(String.format(i, fhirVersion));
    });
    FileUtils.writeStringToFile(compilationUnit.toString(), targetDirectory + "/" + e.getNameAsString() + ".java");
    e.remove();
  }


  /**
   * Searches the passed in {@link ClassOrInterfaceDeclaration} for all {@link EnumDeclaration} and returns them in
   * a {@link List}
   *
   * @param c {@link ClassOrInterfaceDeclaration} to search within
   * @return {@link List<EnumDeclaration>}
   */
  public static Set<EnumDeclaration> getEnumDeclarations(ClassOrInterfaceDeclaration c) {
    Set<EnumDeclaration> foundEnums = new HashSet<>();

    c.accept(new ModifierVisitor<Void>() {
      @Override
      public Visitable visit(EnumDeclaration enumDec, Void arg) {
        super.visit(enumDec, arg);
        foundEnums.add(enumDec);

        System.out.println(enumDec.getNameAsString());
        return enumDec;
      }
    }, null);

    return foundEnums;
  }
}
