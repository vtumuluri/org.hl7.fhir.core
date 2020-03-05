package org.hl7.fhir.convertors.testgenerator.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtils {

    /**
     * Returns the base filename without the conversion version suffix at the end.
     * eg. Account10_30 -> Account
     *
     * @param filename Filename with suffix, as {@link String}
     * @param version Verion suffix to remove.
     * @return Base filename as {   @link String}
     */
    public static String removeVersionFromFileName(String filename, String version) {
        return (filename.replace(version, ""));
    }

    /**
     * Returns a list of all java files within the passed in directory path, without extension.
     *
     * @param path {@link String} filepath
     * @return {@link List < String >} of all filenames
     */
    public static List<String> listAllJavaFilesInDirectory(String path) {
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

    public static void writeStringToFile(String string, String filepath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
        writer.write(string);
        writer.close();
    }

}
