package org.hl7.fhir.convertors.testgenerator.constants;

public enum ResourceVersion {
    DSTU2("dstu2", "http://hl7.org/fhir/DSTU2/examples-json.zip"),
    DSTU3("dstu3", null), // TODO: Current example files on HL7 website are not valid
    R4("r4", "http://hl7.org/fhir/examples-json.zip"),
    R5("r5", "http://hl7.org/fhir/2020Feb/examples-json.zip");

    private final String value;
    private final String url;

    ResourceVersion(String value, String url) {
        this.value = value;
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public String getUrl() {
        return url;
    }

    public static ResourceVersion fromCode(String code) {
        switch (code) {
            case "dstu2":
                return DSTU2;
            case "dstu3":
                return DSTU3;
            case "r4":
                return R4;
            case "r5":
                return R5;
            default:
                return null;
        }
    }
}

