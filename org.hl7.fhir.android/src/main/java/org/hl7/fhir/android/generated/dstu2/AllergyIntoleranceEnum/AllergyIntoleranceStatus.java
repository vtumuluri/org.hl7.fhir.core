package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AllergyIntoleranceStatus {

    /**
     * An active record of a reaction to the identified Substance.
     */
    ACTIVE,
    /**
     * A low level of certainty about the propensity for a reaction to the identified Substance.
     */
    UNCONFIRMED,
    /**
     * A high level of certainty about the propensity for a reaction to the identified Substance, which may include clinical evidence by testing or rechallenge.
     */
    CONFIRMED,
    /**
     * An inactive record of a reaction to the identified Substance.
     */
    INACTIVE,
    /**
     * A reaction to the identified Substance has been clinically reassessed by testing or rechallenge and considered to be resolved.
     */
    RESOLVED,
    /**
     * A propensity for a reaction to the identified Substance has been disproven with a high level of clinical certainty, which may include testing or rechallenge, and is refuted.
     */
    REFUTED,
    /**
     * The statement was entered in error and is not valid.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static AllergyIntoleranceStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("unconfirmed".equals(codeString))
            return UNCONFIRMED;
        if ("confirmed".equals(codeString))
            return CONFIRMED;
        if ("inactive".equals(codeString))
            return INACTIVE;
        if ("resolved".equals(codeString))
            return RESOLVED;
        if ("refuted".equals(codeString))
            return REFUTED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown AllergyIntoleranceStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ACTIVE:
                return "active";
            case UNCONFIRMED:
                return "unconfirmed";
            case CONFIRMED:
                return "confirmed";
            case INACTIVE:
                return "inactive";
            case RESOLVED:
                return "resolved";
            case REFUTED:
                return "refuted";
            case ENTEREDINERROR:
                return "entered-in-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ACTIVE:
                return "http://hl7.org/fhir/allergy-intolerance-status";
            case UNCONFIRMED:
                return "http://hl7.org/fhir/allergy-intolerance-status";
            case CONFIRMED:
                return "http://hl7.org/fhir/allergy-intolerance-status";
            case INACTIVE:
                return "http://hl7.org/fhir/allergy-intolerance-status";
            case RESOLVED:
                return "http://hl7.org/fhir/allergy-intolerance-status";
            case REFUTED:
                return "http://hl7.org/fhir/allergy-intolerance-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/allergy-intolerance-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ACTIVE:
                return "An active record of a reaction to the identified Substance.";
            case UNCONFIRMED:
                return "A low level of certainty about the propensity for a reaction to the identified Substance.";
            case CONFIRMED:
                return "A high level of certainty about the propensity for a reaction to the identified Substance, which may include clinical evidence by testing or rechallenge.";
            case INACTIVE:
                return "An inactive record of a reaction to the identified Substance.";
            case RESOLVED:
                return "A reaction to the identified Substance has been clinically reassessed by testing or rechallenge and considered to be resolved.";
            case REFUTED:
                return "A propensity for a reaction to the identified Substance has been disproven with a high level of clinical certainty, which may include testing or rechallenge, and is refuted.";
            case ENTEREDINERROR:
                return "The statement was entered in error and is not valid.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ACTIVE:
                return "Active";
            case UNCONFIRMED:
                return "Unconfirmed";
            case CONFIRMED:
                return "Confirmed";
            case INACTIVE:
                return "Inactive";
            case RESOLVED:
                return "Resolved";
            case REFUTED:
                return "Refuted";
            case ENTEREDINERROR:
                return "Entered In Error";
            default:
                return "?";
        }
    }
}
