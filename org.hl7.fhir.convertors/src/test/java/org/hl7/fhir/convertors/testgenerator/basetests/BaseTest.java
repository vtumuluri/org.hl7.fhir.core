package org.hl7.fhir.convertors.testgenerator.basetests;

import com.google.common.collect.MapDifference;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.hl7.fhir.convertors.testgenerator.utils.JsonComparisonUtils;
import org.hl7.fhir.convertors.testgenerator.utils.ResourceUtils;
import org.hl7.fhir.convertors.testgenerator.utils.ResourceVersion;
import org.junit.jupiter.api.TestInstance;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest {

    protected abstract String getClassName();
    protected abstract ResourceVersion getLowFhirVersion();
    protected abstract ResourceVersion getHighFhirVersion();

    protected Stream<Object[]> dataSourceLow() throws IOException {
        List<File> testFiles = ResourceUtils.loadTestFilesForClass(getClassName(), getLowFhirVersion().getValue());
        List<Object[]> objects = new ArrayList<>(testFiles.size());
        for (File f : testFiles) {
            objects.add(new Object[]{f.getName(), f});
        }
        return objects.stream();
    }

    protected Stream<Object[]> dataSourceHigh() throws IOException {
        List<File> testFiles = ResourceUtils.loadTestFilesForClass(getClassName(), getHighFhirVersion().getValue());
        List<Object[]> objects = new ArrayList<>(testFiles.size());
        for (File f : testFiles) {
            objects.add(new Object[]{f.getName(), f});
        }
        return objects.stream();
    }

    public static void displayDifference(String originalJson, String convertedJson) {
        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, Object>>(){}.getType();

        Map<String, Object> beforeConversion = gson.fromJson(originalJson, type);
        Map<String, Object> afterConversion = gson.fromJson(convertedJson, type);

        MapDifference<String, Object> difference = JsonComparisonUtils.compareJson(beforeConversion, afterConversion);
        System.out.println(JsonComparisonUtils.getPrettyPrintOutput(difference));
    }

}
