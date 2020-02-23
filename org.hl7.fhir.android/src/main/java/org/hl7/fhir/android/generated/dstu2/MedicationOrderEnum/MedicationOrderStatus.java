package org.hl7.fhir.android.generated.dstu2.MedicationOrderEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum MedicationOrderStatus {

    /**
     * The prescription is 'actionable', but not all actions that are implied by it have occurred yet.
     */
    ACTIVE,
    /**
     * Actions implied by the prescription are to be temporarily halted, but are expected to continue later.  May also be called "suspended".
     */
    ONHOLD,
    /**
     * All actions that are implied by the prescription have occurred.
     */
    COMPLETED,
    /**
     * The prescription was entered in error.
     */
    ENTEREDINERROR,
    /**
     * Actions implied by the prescription are to be permanently halted, before all of them occurred.
     */
    STOPPED,
    /**
     * The prescription is not yet 'actionable', i.e. it is a work in progress, requires sign-off or verification, and needs to be run through decision support process.
     */
    DRAFT,
    /**
     * added to help the parsers
     */
    NULL;

    public static MedicationOrderStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("on-hold".equals(codeString))
            return ONHOLD;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        if ("stopped".equals(codeString))
            return STOPPED;
        if ("draft".equals(codeString))
            return DRAFT;
        throw new FHIRException("Unknown MedicationOrderStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ACTIVE:
                return "active";
            case ONHOLD:
                return "on-hold";
            case COMPLETED:
                return "completed";
            case ENTEREDINERROR:
                return "entered-in-error";
            case STOPPED:
                return "stopped";
            case DRAFT:
                return "draft";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ACTIVE:
                return "http://hl7.org/fhir/medication-order-status";
            case ONHOLD:
                return "http://hl7.org/fhir/medication-order-status";
            case COMPLETED:
                return "http://hl7.org/fhir/medication-order-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/medication-order-status";
            case STOPPED:
                return "http://hl7.org/fhir/medication-order-status";
            case DRAFT:
                return "http://hl7.org/fhir/medication-order-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ACTIVE:
                return "The prescription is 'actionable', but not all actions that are implied by it have occurred yet.";
            case ONHOLD:
                return "Actions implied by the prescription are to be temporarily halted, but are expected to continue later.  May also be called \"suspended\".";
            case COMPLETED:
                return "All actions that are implied by the prescription have occurred.";
            case ENTEREDINERROR:
                return "The prescription was entered in error.";
            case STOPPED:
                return "Actions implied by the prescription are to be permanently halted, before all of them occurred.";
            case DRAFT:
                return "The prescription is not yet 'actionable', i.e. it is a work in progress, requires sign-off or verification, and needs to be run through decision support process.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ACTIVE:
                return "Active";
            case ONHOLD:
                return "On Hold";
            case COMPLETED:
                return "Completed";
            case ENTEREDINERROR:
                return "Entered In Error";
            case STOPPED:
                return "Stopped";
            case DRAFT:
                return "Draft";
            default:
                return "?";
        }
    }
}
