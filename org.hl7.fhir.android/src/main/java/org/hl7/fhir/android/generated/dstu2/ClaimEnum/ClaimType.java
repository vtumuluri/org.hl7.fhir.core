package org.hl7.fhir.android.generated.dstu2.ClaimEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ClaimType {

    /**
     * A claim for Institution based, typically in-patient, goods and services.
     */
    INSTITUTIONAL,
    /**
     * A claim for Oral Health (Dentist, Denturist, Hygienist) goods and services.
     */
    ORAL,
    /**
     * A claim for Pharmacy based goods and services.
     */
    PHARMACY,
    /**
     * A claim for Professional, typically out-patient, goods and services.
     */
    PROFESSIONAL,
    /**
     * A claim for Vision (Ophthamologist, Optometrist and Optician) goods and services.
     */
    VISION,
    /**
     * added to help the parsers
     */
    NULL;

    public static ClaimType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("institutional".equals(codeString))
            return INSTITUTIONAL;
        if ("oral".equals(codeString))
            return ORAL;
        if ("pharmacy".equals(codeString))
            return PHARMACY;
        if ("professional".equals(codeString))
            return PROFESSIONAL;
        if ("vision".equals(codeString))
            return VISION;
        throw new FHIRException("Unknown ClaimType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INSTITUTIONAL:
                return "institutional";
            case ORAL:
                return "oral";
            case PHARMACY:
                return "pharmacy";
            case PROFESSIONAL:
                return "professional";
            case VISION:
                return "vision";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INSTITUTIONAL:
                return "http://hl7.org/fhir/claim-type-link";
            case ORAL:
                return "http://hl7.org/fhir/claim-type-link";
            case PHARMACY:
                return "http://hl7.org/fhir/claim-type-link";
            case PROFESSIONAL:
                return "http://hl7.org/fhir/claim-type-link";
            case VISION:
                return "http://hl7.org/fhir/claim-type-link";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INSTITUTIONAL:
                return "A claim for Institution based, typically in-patient, goods and services.";
            case ORAL:
                return "A claim for Oral Health (Dentist, Denturist, Hygienist) goods and services.";
            case PHARMACY:
                return "A claim for Pharmacy based goods and services.";
            case PROFESSIONAL:
                return "A claim for Professional, typically out-patient, goods and services.";
            case VISION:
                return "A claim for Vision (Ophthamologist, Optometrist and Optician) goods and services.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INSTITUTIONAL:
                return "Institutional";
            case ORAL:
                return "Oral Health";
            case PHARMACY:
                return "Pharmacy";
            case PROFESSIONAL:
                return "Professional";
            case VISION:
                return "Vision";
            default:
                return "?";
        }
    }
}
