package org.hl7.fhir.android.generated.dstu2.CarePlanEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum CarePlanRelationship {

    /**
     * The referenced plan is considered to be part of this plan.
     */
    INCLUDES,
    /**
     * This plan takes the places of the referenced plan.
     */
    REPLACES,
    /**
     * This plan provides details about how to perform activities defined at a higher level by the referenced plan.
     */
    FULFILLS,
    /**
     * added to help the parsers
     */
    NULL;

    public static CarePlanRelationship fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("includes".equals(codeString))
            return INCLUDES;
        if ("replaces".equals(codeString))
            return REPLACES;
        if ("fulfills".equals(codeString))
            return FULFILLS;
        throw new FHIRException("Unknown CarePlanRelationship code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INCLUDES:
                return "includes";
            case REPLACES:
                return "replaces";
            case FULFILLS:
                return "fulfills";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INCLUDES:
                return "http://hl7.org/fhir/care-plan-relationship";
            case REPLACES:
                return "http://hl7.org/fhir/care-plan-relationship";
            case FULFILLS:
                return "http://hl7.org/fhir/care-plan-relationship";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INCLUDES:
                return "The referenced plan is considered to be part of this plan.";
            case REPLACES:
                return "This plan takes the places of the referenced plan.";
            case FULFILLS:
                return "This plan provides details about how to perform activities defined at a higher level by the referenced plan.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INCLUDES:
                return "Includes";
            case REPLACES:
                return "Replaces";
            case FULFILLS:
                return "Fulfills";
            default:
                return "?";
        }
    }
}
