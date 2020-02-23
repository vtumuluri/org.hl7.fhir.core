package org.hl7.fhir.android.generated.dstu2.MedicationStatementEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum MedicationStatementStatus {

    /**
     * The medication is still being taken.
     */
    ACTIVE,
    /**
     * The medication is no longer being taken.
     */
    COMPLETED,
    /**
     * The statement was entered in error.
     */
    ENTEREDINERROR,
    /**
     * The medication may be taken at some time in the future.
     */
    INTENDED,
    /**
     * added to help the parsers
     */
    NULL;

    public static MedicationStatementStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        if ("intended".equals(codeString))
            return INTENDED;
        throw new FHIRException("Unknown MedicationStatementStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ACTIVE:
                return "active";
            case COMPLETED:
                return "completed";
            case ENTEREDINERROR:
                return "entered-in-error";
            case INTENDED:
                return "intended";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ACTIVE:
                return "http://hl7.org/fhir/medication-statement-status";
            case COMPLETED:
                return "http://hl7.org/fhir/medication-statement-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/medication-statement-status";
            case INTENDED:
                return "http://hl7.org/fhir/medication-statement-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ACTIVE:
                return "The medication is still being taken.";
            case COMPLETED:
                return "The medication is no longer being taken.";
            case ENTEREDINERROR:
                return "The statement was entered in error.";
            case INTENDED:
                return "The medication may be taken at some time in the future.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ACTIVE:
                return "Active";
            case COMPLETED:
                return "Completed";
            case ENTEREDINERROR:
                return "Entered in Error";
            case INTENDED:
                return "Intended";
            default:
                return "?";
        }
    }
}
