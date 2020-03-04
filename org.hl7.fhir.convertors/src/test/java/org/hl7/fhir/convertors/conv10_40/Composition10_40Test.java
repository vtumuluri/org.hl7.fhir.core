package org.hl7.fhir.convertors.conv10_40;

import org.hl7.fhir.convertors.testgenerator.basetests.BaseTest10_40;
import org.hl7.fhir.convertors.testgenerator.utils.ResourceUtils;
import org.hl7.fhir.convertors.testgenerator.utils.ResourceVersion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.io.File;
import java.io.IOException;

/**
 * 10_40 - conversion code ie "10_40" * Composition - resource name ie "Patient" * dstu2 - low fhir version ie "dstu3" * r4 - high fhir version ie "r5" *
 */
class Composition10_40Test extends BaseTest10_40 {

    protected final static String CLASS_NAME = "Composition";

    protected final static ResourceVersion HIGH_FHIR_VERSION = ResourceVersion.fromCode("r4");

    protected final static ResourceVersion LOW_FHIR_VERSION = ResourceVersion.fromCode("dstu2");

    @ParameterizedTest(name = "{index} :: {0}")
    @DisplayName("Conversion from dstu2 -> r4 -> dstu2")
    @MethodSource("dataSourceLow")
    void testConvertFromLowToHigh(String filename, File testFile) throws IOException {
        String beforeJsonString = ResourceUtils.loadStringFromResourceFile(testFile);
        org.hl7.fhir.dstu2.formats.JsonParser parser = new org.hl7.fhir.dstu2.formats.JsonParser();
        org.hl7.fhir.dstu2.model.Resource parsedResource = parser.parse(beforeJsonString);
        org.hl7.fhir.dstu2.model.Resource convertedResource = roundTrip(parsedResource);
        String afterJsonString = parser.composeString(convertedResource);
        displayDifference(beforeJsonString, afterJsonString);
        Assertions.fail();
    }

    @ParameterizedTest(name = "{index} :: {0}")
    @DisplayName("Conversion from r4 -> dstu2 -> r4")
    @MethodSource("dataSourceHigh")
    void testConvertFromHighToLow(String filename, File testFile) throws IOException {
        String beforeJsonString = ResourceUtils.loadStringFromResourceFile(testFile);
        org.hl7.fhir.r4.formats.JsonParser parser = new org.hl7.fhir.r4.formats.JsonParser();
        org.hl7.fhir.r4.model.Resource parsedResource = parser.parse(beforeJsonString);
        org.hl7.fhir.r4.model.Resource convertedResource = roundTrip(parsedResource);
        String afterJsonString = parser.composeString(convertedResource);
        displayDifference(beforeJsonString, afterJsonString);
        Assertions.fail();
    }

    @Override
    protected String getClassName() {
        return CLASS_NAME;
    }

    @Override
    protected ResourceVersion getLowFhirVersion() {
        return LOW_FHIR_VERSION;
    }

    @Override
    protected ResourceVersion getHighFhirVersion() {
        return HIGH_FHIR_VERSION;
    }
}
