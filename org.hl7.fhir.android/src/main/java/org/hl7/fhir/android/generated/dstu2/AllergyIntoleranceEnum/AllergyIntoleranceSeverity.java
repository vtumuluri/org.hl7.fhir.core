package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AllergyIntoleranceSeverity {

    /**
     * Causes mild physiological effects.
     */
    MILD,
    /**
     * Causes moderate physiological effects.
     */
    MODERATE,
    /**
     * Causes severe physiological effects.
     */
    SEVERE,
    /**
     * added to help the parsers
     */
    NULL;

    public static AllergyIntoleranceSeverity fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("mild".equals(codeString))
            return MILD;
        if ("moderate".equals(codeString))
            return MODERATE;
        if ("severe".equals(codeString))
            return SEVERE;
        throw new FHIRException("Unknown AllergyIntoleranceSeverity code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case MILD:
                return "mild";
            case MODERATE:
                return "moderate";
            case SEVERE:
                return "severe";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case MILD:
                return "http://hl7.org/fhir/reaction-event-severity";
            case MODERATE:
                return "http://hl7.org/fhir/reaction-event-severity";
            case SEVERE:
                return "http://hl7.org/fhir/reaction-event-severity";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case MILD:
                return "Causes mild physiological effects.";
            case MODERATE:
                return "Causes moderate physiological effects.";
            case SEVERE:
                return "Causes severe physiological effects.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case MILD:
                return "Mild";
            case MODERATE:
                return "Moderate";
            case SEVERE:
                return "Severe";
            default:
                return "?";
        }
    }
}
