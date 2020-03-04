package org.hl7.fhir.convertors.testgenerator.utils;

public enum ResourceVersion {
    DSTU2("dstu2"),
    DSTU3("dstu3"),
    R4("r4"),
    R5("r5");

    private final String value;

    ResourceVersion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
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
