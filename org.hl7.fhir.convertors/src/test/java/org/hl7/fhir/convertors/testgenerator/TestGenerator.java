package org.hl7.fhir.convertors.testgenerator;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.hl7.fhir.convertors.testgenerator.utils.FileUtils;
import org.hl7.fhir.convertors.testgenerator.utils.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestGenerator {

    public static final String FILE_PATH = "/org.hl7.fhir.convertors/src/main/java/org/hl7/fhir/convertors/conv%1$s/";
    public static final String TEST_DEST_DIRECTORY = "/org.hl7.fhir.convertors/src/test/java/org/hl7/fhir/convertors/conv%1$s/";
    public static final String TEST_FILENAME = "%1$sTest.java";

    public static final List<String> TEST_FOLDER = Arrays.asList("10_30", "10_40", "10_50", "14_30", "14_40", "14_50",
            "30_40", "30_50", "40_50");

    public static void main(String[] args) {
        String version = "10_40";
        String path = new File("").getAbsolutePath() + String.format(FILE_PATH, version);

        List<String> filenames = FileUtils.listAllJavaFilesInDirectory(path);
        filenames.forEach(filename -> {
            try {
                generateTestForClass(path, filename, version, "dstu2", "r4");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        System.out.println();
    }

    public static void generateTestForClass(String filepath, String filename, String version, String lowFhirVersion, String highFhirVersion) throws IOException {
        File fileTemplate = new File(ResourceUtils.class.getClassLoader().getResource("TestTemplate.txt").getFile());
        /**
         * %1$s - conversion code ie "10_40"
         * %2$s - resource name ie "Patient"
         * %3$s - low fhir version ie "dstu3"
         * %4$s - high fhir version ie "r5"
         **/
        String template = ResourceUtils.loadStringFromResourceFile(fileTemplate);
        String filledTemplate = String.format(template, version, FileUtils.removeVersionFromFileName(filename, version), lowFhirVersion, highFhirVersion);

        String baseDir = new File("").getAbsolutePath();
        String absPathToFile = baseDir + String.format(TEST_DEST_DIRECTORY, version) + String.format(TEST_FILENAME, filename);
        CompilationUnit compilationUnit = StaticJavaParser.parse(filledTemplate);
        FileUtils.writeStringToFile(compilationUnit.toString(), absPathToFile);
        System.out.println();
    }

}
