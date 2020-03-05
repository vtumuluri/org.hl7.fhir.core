package org.hl7.fhir.convertors.testgenerator.utils;

import org.apache.commons.io.FileUtils;
import org.hl7.fhir.convertors.testgenerator.constants.ResourceVersion;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class NetworkUtils {

    public static final int CONNECTION_TIMEOUT = 5000;
    public static final int READ_TIMEOUT = 10000;
    public static final String ZIP = ".zip";
    public static final String EXAMPLES = "Examples";

    public static File downloadExampleFiles(ResourceVersion version) throws IOException {
        File destinationFile = generateExampleFile(version);
        FileUtils.copyURLToFile(new URL(version.getUrl()),
                destinationFile,
                CONNECTION_TIMEOUT,
                READ_TIMEOUT);
        return destinationFile;
    }

    public static File generateExampleFile(ResourceVersion version) throws IOException {
        return File.createTempFile(version.getValue() + EXAMPLES, ZIP);
    }
}
