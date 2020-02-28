package org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum GuideDependencyType {

    /**
     * The guide is referred to by URL.
     */
    REFERENCE,
    /**
     * The guide is embedded in this guide when published.
     */
    INCLUSION,
    /**
     * added to help the parsers
     */
    NULL;

    public static GuideDependencyType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("reference".equals(codeString))
            return REFERENCE;
        if ("inclusion".equals(codeString))
            return INCLUSION;
        throw new FHIRException("Unknown GuideDependencyType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case REFERENCE:
                return "reference";
            case INCLUSION:
                return "inclusion";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case REFERENCE:
                return "http://hl7.org/fhir/guide-dependency-type";
            case INCLUSION:
                return "http://hl7.org/fhir/guide-dependency-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case REFERENCE:
                return "The guide is referred to by URL.";
            case INCLUSION:
                return "The guide is embedded in this guide when published.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case REFERENCE:
                return "Reference";
            case INCLUSION:
                return "Inclusion";
            default:
                return "?";
        }
    }
}
