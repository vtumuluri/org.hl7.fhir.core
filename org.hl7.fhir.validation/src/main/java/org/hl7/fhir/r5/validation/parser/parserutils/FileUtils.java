package org.hl7.fhir.r5.validation.parser.parserutils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtils {

    /**
     * Returns a list of all java files within the passed in directory path, without extension.
     *
     * @param path {@link String} filepath
     * @return {@link List < String >} of all filenames
     */
    protected static List<String> listAllJavaFilesInDirectory(String path) {
        List<String> result = new ArrayList<>();
        try (Stream<Path> walk = Files.walk(Paths.get(path))) {
            walk.map(Path::toString)
                    .filter(f -> f.endsWith(".java"))
                    .map(FileUtils::pullFileNameFromPath)
                    .collect(Collectors.toCollection(() -> result));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Takes the passed in file path and extracts the filename without extension.
     *
     * @param path
     * @return
     */
    protected static String pullFileNameFromPath(String path) {
        int lastSlashIndex = path.lastIndexOf('/');
        int lastPeriodIndex = path.lastIndexOf('.');
        return path.substring(lastSlashIndex + 1, lastPeriodIndex);
    }

    /**
     * Attempts to delete the file at the given path.
     *
     * @param path
     */
    public static void deleteFile(String path) {
        File file = new File(path);
        if (file.delete()) {
            System.out.println("File <" + path + "> deleted successfully");
        } else {
            System.out.println("Failed to delete the file <" + path + ">");
        }
    }

    /**
     * Writes the passed in String to the file at the given filepath.
     *
     * @param string   File content to write
     * @param filepath Absolute path to the file
     * @throws IOException
     */
    public static void writeStringToFile(String string, String filepath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
        writer.write(string);
        writer.close();
    }
}
