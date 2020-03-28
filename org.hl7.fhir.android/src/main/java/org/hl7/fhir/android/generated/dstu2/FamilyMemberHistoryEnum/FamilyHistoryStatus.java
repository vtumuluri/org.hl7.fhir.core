package org.hl7.fhir.android.generated.dstu2.FamilyMemberHistoryEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum FamilyHistoryStatus {

    /**
     * Some health information is known and captured, but not complete - see notes for details.
     */
    PARTIAL,
    /**
     * All relevant health information is known and captured.
     */
    COMPLETED,
    /**
     * This instance should not have been part of this patient's medical record.
     */
    ENTEREDINERROR,
    /**
     * Health information for this individual is unavailable/unknown.
     */
    HEALTHUNKNOWN,
    /**
     * added to help the parsers
     */
    NULL;

    public static FamilyHistoryStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("partial".equals(codeString))
            return PARTIAL;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        if ("health-unknown".equals(codeString))
            return HEALTHUNKNOWN;
        throw new FHIRException("Unknown FamilyHistoryStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PARTIAL:
                return "partial";
            case COMPLETED:
                return "completed";
            case ENTEREDINERROR:
                return "entered-in-error";
            case HEALTHUNKNOWN:
                return "health-unknown";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PARTIAL:
                return "http://hl7.org/fhir/history-status";
            case COMPLETED:
                return "http://hl7.org/fhir/history-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/history-status";
            case HEALTHUNKNOWN:
                return "http://hl7.org/fhir/history-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PARTIAL:
                return "Some health information is known and captured, but not complete - see notes for details.";
            case COMPLETED:
                return "All relevant health information is known and captured.";
            case ENTEREDINERROR:
                return "This instance should not have been part of this patient's medical record.";
            case HEALTHUNKNOWN:
                return "Health information for this individual is unavailable/unknown.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PARTIAL:
                return "Partial";
            case COMPLETED:
                return "Completed";
            case ENTEREDINERROR:
                return "Entered in error";
            case HEALTHUNKNOWN:
                return "Health unknown";
            default:
                return "?";
        }
    }
}
