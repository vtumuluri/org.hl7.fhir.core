package org.hl7.fhir.android.parser;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import org.hl7.fhir.android.parser.parserutils.EnumUtils;
import org.hl7.fhir.android.parser.parserutils.FileUtils;
import org.hl7.fhir.android.parser.parserutils.ParserUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ParserAndroid {

  public static final String DSTU2 = "dstu2";
  public static final String DSTU3 = "dstu3";
  public static final String R4 = "r4";
  public static final String R5 = "r5";
  public static final List<String> SUPPORTED_FHIR_VERSIONS = Arrays.asList(DSTU2, DSTU3, R4, R5);

  public static final String MODEL_SRC_DIR = "/org.hl7.fhir.%1$s/src/main/java/org/hl7/fhir/%1$s/model/";
  public static final String MODEL_GENERATED_DIR = "/org.hl7.fhir.android/src/main/java/org/hl7/fhir/android/generated/";
  public static final String MODEL_DEST_DIR = MODEL_GENERATED_DIR + "%1$s/";

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

    List<String> resourceList = FileUtils.listAllJavaFilesInDirectory(projectDirectory + String.format(MODEL_SRC_DIR, "dstu2"));

    resourceList.forEach(name -> {
      try {
        createRoomFiles(String.format(MODEL_SRC_DIR, "dstu2"), name, ".java", String.format(MODEL_DEST_DIR, "dstu2"), "dstu2");
      } catch (IOException e) {
        e.printStackTrace();
      }
    });

//    try {
//      createRoomFiles(String.format(MODEL_SRC_DIR, "dstu2"), "Account", ".java", String.format(MODEL_DEST_DIR, "dstu2"), "dstu2");
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
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
    });
  }

  public static void createRoomFiles(String srcdirectory, String filename, String extension, String destDir, String fhirVersion) throws IOException {
    String projectDirectory = new File("").getAbsolutePath();
    String filePathWithExtension = projectDirectory + srcdirectory + filename + extension;
    CompilationUnit topLevelCompilationUnit = ParserUtils.getCompilationUnit(filePathWithExtension);
    if (topLevelCompilationUnit == null) return;

    ClassOrInterfaceDeclaration classOrInterfaceDeclaration = ParserUtils.initializeTypeSovlerAndParser(topLevelCompilationUnit,
      projectDirectory, filename);
    if (classOrInterfaceDeclaration == null) return;
    //TODO have to deal with ResourceType class here

    EnumUtils.extractEnumClasses(topLevelCompilationUnit, classOrInterfaceDeclaration, destDir, fhirVersion);

    FileUtils.writeStringToFile(topLevelCompilationUnit.toString(), projectDirectory + String.format(MODEL_DEST_DIR, fhirVersion) + filename + ".java");
  }




}

