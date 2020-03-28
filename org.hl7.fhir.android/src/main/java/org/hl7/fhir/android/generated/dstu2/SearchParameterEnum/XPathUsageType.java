package org.hl7.fhir.android.generated.dstu2.SearchParameterEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum XPathUsageType {

    /**
     * The search parameter is derived directly from the selected nodes based on the type definitions.
     */
    NORMAL,
    /**
     * The search parameter is derived by a phonetic transform from the selected nodes.
     */
    PHONETIC,
    /**
     * The search parameter is based on a spatial transform of the selected nodes.
     */
    NEARBY,
    /**
     * The search parameter is based on a spatial transform of the selected nodes, using physical distance from the middle.
     */
    DISTANCE,
    /**
     * The interpretation of the xpath statement is unknown (and can't be automated).
     */
    OTHER,
    /**
     * added to help the parsers
     */
    NULL;

    public static XPathUsageType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("normal".equals(codeString))
            return NORMAL;
        if ("phonetic".equals(codeString))
            return PHONETIC;
        if ("nearby".equals(codeString))
            return NEARBY;
        if ("distance".equals(codeString))
            return DISTANCE;
        if ("other".equals(codeString))
            return OTHER;
        throw new FHIRException("Unknown XPathUsageType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case NORMAL:
                return "normal";
            case PHONETIC:
                return "phonetic";
            case NEARBY:
                return "nearby";
            case DISTANCE:
                return "distance";
            case OTHER:
                return "other";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case NORMAL:
                return "http://hl7.org/fhir/search-xpath-usage";
            case PHONETIC:
                return "http://hl7.org/fhir/search-xpath-usage";
            case NEARBY:
                return "http://hl7.org/fhir/search-xpath-usage";
            case DISTANCE:
                return "http://hl7.org/fhir/search-xpath-usage";
            case OTHER:
                return "http://hl7.org/fhir/search-xpath-usage";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case NORMAL:
                return "The search parameter is derived directly from the selected nodes based on the type definitions.";
            case PHONETIC:
                return "The search parameter is derived by a phonetic transform from the selected nodes.";
            case NEARBY:
                return "The search parameter is based on a spatial transform of the selected nodes.";
            case DISTANCE:
                return "The search parameter is based on a spatial transform of the selected nodes, using physical distance from the middle.";
            case OTHER:
                return "The interpretation of the xpath statement is unknown (and can't be automated).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case NORMAL:
                return "Normal";
            case PHONETIC:
                return "Phonetic";
            case NEARBY:
                return "Nearby";
            case DISTANCE:
                return "Distance";
            case OTHER:
                return "Other";
            default:
                return "?";
        }
    }
}
