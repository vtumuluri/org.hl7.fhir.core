package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AdministrativeGender {

    /**
     * Male
     */
    MALE,
    /**
     * Female
     */
    FEMALE,
    /**
     * Other
     */
    OTHER,
    /**
     * Unknown
     */
    UNKNOWN,
    /**
     * added to help the parsers
     */
    NULL;

    public static AdministrativeGender fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("male".equals(codeString))
            return MALE;
        if ("female".equals(codeString))
            return FEMALE;
        if ("other".equals(codeString))
            return OTHER;
        if ("unknown".equals(codeString))
            return UNKNOWN;
        throw new FHIRException("Unknown AdministrativeGender code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case MALE:
                return "male";
            case FEMALE:
                return "female";
            case OTHER:
                return "other";
            case UNKNOWN:
                return "unknown";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case MALE:
                return "http://hl7.org/fhir/administrative-gender";
            case FEMALE:
                return "http://hl7.org/fhir/administrative-gender";
            case OTHER:
                return "http://hl7.org/fhir/administrative-gender";
            case UNKNOWN:
                return "http://hl7.org/fhir/administrative-gender";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case MALE:
                return "Male";
            case FEMALE:
                return "Female";
            case OTHER:
                return "Other";
            case UNKNOWN:
                return "Unknown";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case MALE:
                return "Male";
            case FEMALE:
                return "Female";
            case OTHER:
                return "Other";
            case UNKNOWN:
                return "Unknown";
            default:
                return "?";
        }
    }
}
