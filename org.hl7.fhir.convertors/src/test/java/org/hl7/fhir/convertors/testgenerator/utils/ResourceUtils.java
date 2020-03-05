package org.hl7.fhir.convertors.testgenerator.utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResourceUtils {

    public static final String RESOURCE_DIRECTORY_PATH = "examples/%1$s/";
    public static final String TEST_RESOURCE_FILE_FILTER = "%1$s-";
    public static final String RESOURCE_TYPE = "resourceType";


    public static List<File> loadTestFilesForClass(String className, String fhirVersion) throws IOException {
        List<File> listOfJsonResourceTestFiles = getListOfJsonResourceTestFiles(fhirVersion);
        List<File> fileList = listOfJsonResourceTestFiles.stream()
                .filter(file -> StringUtils.startsWithIgnoreCase(file.getName(), String.format(TEST_RESOURCE_FILE_FILTER, className)))
                .filter(file -> getResourceNameFromJSON(loadJsonObject(file)).equals(className))
                .collect(Collectors.toList());
        return fileList;
    }

    public static List<JsonObject> loadTestResourcesForClass(String className, String fhirVersion) throws IOException {
        List<File> listOfJsonResourceTestFiles = getListOfJsonResourceTestFiles(fhirVersion);
        List<JsonObject> jsonObjects = listOfJsonResourceTestFiles.stream()
                .filter(file -> StringUtils.startsWithIgnoreCase(file.getName(), String.format(TEST_RESOURCE_FILE_FILTER, className)))
                .map(file -> loadJsonObject(file))
                .filter(jsonObj -> getResourceNameFromJSON(jsonObj).equals(className))
                .collect(Collectors.toList());
        return jsonObjects;
    }

    public static JsonObject loadJsonObject(File file) {
        String fileContents = null;
        try {
            fileContents = loadStringFromResourceFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonObject jsonObject = (JsonObject) new JsonParser().parse(fileContents);
        return jsonObject;
    }

    public static List<File> getListOfJsonResourceTestFiles(String fhirVersion) throws IOException {
        File directory = new File(ResourceUtils.class.getClassLoader().getResource(String.format(RESOURCE_DIRECTORY_PATH, fhirVersion)).getFile());
        return Arrays.asList(directory.listFiles());
    }

    /**
     * Loads the string data from the file at the given resource path.
     *
     * @param file Path location for the resource file to read in.
     * @return {@link String} of the file contents.
     * @throws IOException if no such file exists at the given path.
     */
    public static String loadStringFromResourceFile(File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        //creating an InputStreamReader object
        InputStreamReader isReader = new InputStreamReader(inputStream);
        //Creating a BufferedReader object
        BufferedReader reader = new BufferedReader(isReader);
        StringBuffer sb = new StringBuffer();
        String str;
        while ((str = reader.readLine()) != null) {
            sb.append(str);
        }
        return sb.toString();
    }

    /**
     * Parses the passed in JSON {@link String} and returns the name of the primitive with the label removed
     * in the resulting {@link JsonObject}, which for our purposes, is the name of the FHIR resource.
     *
     * @param parsedObject {@link JsonObject} resource.
     * @return {@link String} name of the resource, eg. "Patient", "Bundle", "Group"
     * @throws JsonSyntaxException
     */
    protected static String getResourceNameFromJSON(JsonObject parsedObject) throws JsonSyntaxException {
        return parsedObject.getAsJsonPrimitive(RESOURCE_TYPE).getAsString();
    }
}
