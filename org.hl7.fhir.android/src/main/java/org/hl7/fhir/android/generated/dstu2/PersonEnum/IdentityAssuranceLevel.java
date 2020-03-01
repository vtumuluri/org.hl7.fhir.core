package org.hl7.fhir.android.generated.dstu2.PersonEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum IdentityAssuranceLevel {

    /**
     * Little or no confidence in the asserted identity's accuracy.
     */
    LEVEL1,
    /**
     * Some confidence in the asserted identity's accuracy.
     */
    LEVEL2,
    /**
     * High confidence in the asserted identity's accuracy.
     */
    LEVEL3,
    /**
     * Very high confidence in the asserted identity's accuracy.
     */
    LEVEL4,
    /**
     * added to help the parsers
     */
    NULL;

    public static IdentityAssuranceLevel fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("level1".equals(codeString))
            return LEVEL1;
        if ("level2".equals(codeString))
            return LEVEL2;
        if ("level3".equals(codeString))
            return LEVEL3;
        if ("level4".equals(codeString))
            return LEVEL4;
        throw new FHIRException("Unknown IdentityAssuranceLevel code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case LEVEL1:
                return "level1";
            case LEVEL2:
                return "level2";
            case LEVEL3:
                return "level3";
            case LEVEL4:
                return "level4";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case LEVEL1:
                return "http://hl7.org/fhir/identity-assuranceLevel";
            case LEVEL2:
                return "http://hl7.org/fhir/identity-assuranceLevel";
            case LEVEL3:
                return "http://hl7.org/fhir/identity-assuranceLevel";
            case LEVEL4:
                return "http://hl7.org/fhir/identity-assuranceLevel";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case LEVEL1:
                return "Little or no confidence in the asserted identity's accuracy.";
            case LEVEL2:
                return "Some confidence in the asserted identity's accuracy.";
            case LEVEL3:
                return "High confidence in the asserted identity's accuracy.";
            case LEVEL4:
                return "Very high confidence in the asserted identity's accuracy.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case LEVEL1:
                return "Level 1";
            case LEVEL2:
                return "Level 2";
            case LEVEL3:
                return "Level 3";
            case LEVEL4:
                return "Level 4";
            default:
                return "?";
        }
    }
}
