package org.hl7.fhir.android.parser;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import org.apache.commons.io.FilenameUtils;
import org.hl7.fhir.android.parser.utils.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParserAndroid {

  public static final String EXPRESSION_NODE = "ExpressionNode";
  public static final String TYPE_DETAILS = "TypeDetails";
  public static final String CONSTANTS = "Constants";
  public static final String DSTU2 = "dstu2";
  public static final String DSTU3 = "dstu3";
  public static final String R4 = "r4";
  public static final String R5 = "r5";
  public static final List<String> SUPPORTED_FHIR_VERSIONS = Arrays.asList(DSTU2, DSTU3, R4, R5);

  public static final String MODEL_DIR = "model/";
  public static final String MODEL_SRC_DIR = "/org.hl7.fhir.%1$s/src/main/java/org/hl7/fhir/%1$s/model/";
  public static final String MODEL_GENERATED_DIR = "/org.hl7.fhir.android/src/main/java/org/hl7/fhir/android/generated/";
  public static final String MODEL_DEST_DIR = MODEL_GENERATED_DIR + "%1$s/";
  public static final String CODESYSTEMS_DEST_DIR = MODEL_DEST_DIR + "codesystems/";
  public static final String PACKAGE_BASE_CLASS = "org.hl7.fhir.android.generated.%1$s";

  public static final List<String> IGNORED_CLASSES = Arrays.asList(EXPRESSION_NODE, TYPE_DETAILS, CONSTANTS);

  public static final Map<File, CompilationUnit> mGeneratedClassMap = new HashMap<>();
  public static final Map<File, CompilationUnit> mGeneratedEnumMap = new HashMap<>();
  public static final Map<String, String> mOldImportToNewEnumImportMap = new HashMap<>();

  /**
   * For enums, will need TypeConverters, no generic type converter exists, so each enum will need a generated converter
   * Might be possible to have one kotlin extension as such:
   * https://stackoverflow.com/questions/51102431/android-room-type-convert-multiple-enum-types
   * https://developer.android.com/reference/androidx/room/TypeConverter
   * <p>
   * PrimitiveTypes wilted there own massive tables, where all are sorted. IE IntegerType table, BinaryBase64Type table, etc
   * <p>
   * To maintain population of POJO when queried, will need to use @Relation annotation on object fields
   * https://developer.android.com/reference/androidx/room/Relation#entityColumn()
   *
   * @Embedded exists as an option to flatten types down to store within a parent type
   * https://developer.android.com/training/data-storage/room/relationships
   * <p>
   * Might be worthwhile to sanitize the models first
   * 1. Pull all nested classes out
   * 2. Pull all enums into their own classes/dir
   * 3. Remove all fhir annotations
   */
  public static void main(String[] args) {
    final String projectDirectory = new File("").getAbsolutePath();

    try {
      generateFolderStructure();
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(0);
    }

    try {
      ParserUtils.initializeResolver(projectDirectory);
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(0);
    }

    //SUPPORTED_FHIR_VERSIONS.forEach(version -> {
    String version = "dstu3";
      List<File> resourceList = FileUtils.listAllJavaFilesInDirectory(projectDirectory + String.format(MODEL_SRC_DIR, version));

      resourceList.forEach(file -> {
        try {
          String srcDirectory = file.getPath().substring(0, file.getPath().lastIndexOf('/') + 1);
          String subDirectory = srcDirectory.substring(srcDirectory.lastIndexOf(MODEL_DIR) + MODEL_DIR.length());
          populateGeneratedClassMap(srcDirectory, file, String.format(MODEL_DEST_DIR, version) + subDirectory, version, mGeneratedClassMap, mGeneratedEnumMap);
        } catch (IOException e) {
          e.printStackTrace();
        }
      });
    System.out.println();
      mGeneratedEnumMap.keySet().forEach(key -> {
        try {
          ClassUtils.cleanImports(mOldImportToNewEnumImportMap, mGeneratedEnumMap.get(key), version);
          FileUtils.writeDataToFile(key, mGeneratedEnumMap.get(key));
        } catch (IOException e) {
          System.out.println("Error writing enum " + key.getName() + "::\n" + e.getMessage());;
        }
      });

      mGeneratedClassMap.keySet().forEach(key -> {
        if (IGNORED_CLASSES.stream().noneMatch(FilenameUtils.removeExtension(key.getName())::equals)) {
          try {
            ClassUtils.cleanImports(mOldImportToNewEnumImportMap, mGeneratedClassMap.get(key), version);
            String cleanedContents = ClassUtils.cleanLooseReferences(mGeneratedClassMap.get(key), version);
            FileUtils.writeDataToFile(key, cleanedContents);
          } catch (IOException e) {
            System.out.println("Error writing class " + key.getName() + "::\n" + e.getMessage());
          }
        }
      });
    //});
  }

  /**
   * Generates the base folder structure for our generated AndroidFiles
   */
  public static void generateFolderStructure() throws IOException {
    final String projectDirectory = new File("").getAbsolutePath();
    final String generatedDir = projectDirectory + MODEL_GENERATED_DIR;

    FileUtils.deleteDirectory(generatedDir);
    FileUtils.createDirectory(generatedDir);

    SUPPORTED_FHIR_VERSIONS.forEach(version -> {
      FileUtils.createDirectory(projectDirectory + String.format(MODEL_DEST_DIR, version));
      FileUtils.createDirectory(projectDirectory + String.format(CODESYSTEMS_DEST_DIR, version));
    });
  }

  public static void populateGeneratedClassMap(String srcdirectory, File file, String destDir,
                                               String fhirVersion, Map<File, CompilationUnit> generatedClassMap,
                                               Map<File, CompilationUnit> generatedEnumMap) throws IOException {
    String filePathWithExtension = srcdirectory + file.getName();
    CompilationUnit topLevelCompilationUnit = ParserUtils.getCompilationUnit(filePathWithExtension);
    AnnotationUtils.sanitizeAllClassAnnotations(topLevelCompilationUnit);

    String classname = FilenameUtils.removeExtension(file.getName());

    switch (ParserUtils.getFileType(topLevelCompilationUnit, classname)) {
      case CLASS:
        ClassOrInterfaceDeclaration classDeclaration = ParserUtils.loadClass(topLevelCompilationUnit, classname);
        EnumUtils.extractInnerEnumClasses(topLevelCompilationUnit, classDeclaration, destDir, fhirVersion, generatedEnumMap, mOldImportToNewEnumImportMap);
        ClassUtils.extractInnerClasses(topLevelCompilationUnit, classDeclaration, destDir, fhirVersion, generatedClassMap);
        // pull all nested classes out
        break;
      case ENUM:
        EnumDeclaration enumDeclaration = ParserUtils.loadEnum(topLevelCompilationUnit, classname);
        break;
      case INTERFACE:
        ClassOrInterfaceDeclaration interfaceDeclaration = ParserUtils.loadInterface(topLevelCompilationUnit, classname);
        break;
      case UNKNOWN:
      default:
        System.out.println("Unknown declaration type for file <" + classname + ">...exiting");
        System.exit(0);
    }

    topLevelCompilationUnit.setPackageDeclaration(ClassUtils.generatePackageDeclaration(destDir));
    //ClassUtils.removeExplicitPackageReferences(topLevelCompilationUnit, fhirVersion);
    String projectDirectory = new File("").getAbsolutePath();
    generatedClassMap.put(new File(projectDirectory + destDir + file.getName()), topLevelCompilationUnit);
  }




}

