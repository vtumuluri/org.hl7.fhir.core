package org.hl7.fhir.android.generated.dstu2.CarePlanEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum CarePlanStatus {

    /**
     * The plan has been suggested but no commitment to it has yet been made.
     */
    PROPOSED,
    /**
     * The plan is in development or awaiting use but is not yet intended to be acted upon.
     */
    DRAFT,
    /**
     * The plan is intended to be followed and used as part of patient care.
     */
    ACTIVE,
    /**
     * The plan is no longer in use and is not expected to be followed or used in patient care.
     */
    COMPLETED,
    /**
     * The plan has been terminated prior to reaching completion (though it may have been replaced by a new plan).
     */
    CANCELLED,
    /**
     * added to help the parsers
     */
    NULL;

    public static CarePlanStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return PROPOSED;
        if ("draft".equals(codeString))
            return DRAFT;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        throw new FHIRException("Unknown CarePlanStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PROPOSED:
                return "proposed";
            case DRAFT:
                return "draft";
            case ACTIVE:
                return "active";
            case COMPLETED:
                return "completed";
            case CANCELLED:
                return "cancelled";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PROPOSED:
                return "http://hl7.org/fhir/care-plan-status";
            case DRAFT:
                return "http://hl7.org/fhir/care-plan-status";
            case ACTIVE:
                return "http://hl7.org/fhir/care-plan-status";
            case COMPLETED:
                return "http://hl7.org/fhir/care-plan-status";
            case CANCELLED:
                return "http://hl7.org/fhir/care-plan-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PROPOSED:
                return "The plan has been suggested but no commitment to it has yet been made.";
            case DRAFT:
                return "The plan is in development or awaiting use but is not yet intended to be acted upon.";
            case ACTIVE:
                return "The plan is intended to be followed and used as part of patient care.";
            case COMPLETED:
                return "The plan is no longer in use and is not expected to be followed or used in patient care.";
            case CANCELLED:
                return "The plan has been terminated prior to reaching completion (though it may have been replaced by a new plan).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PROPOSED:
                return "Proposed";
            case DRAFT:
                return "Pending";
            case ACTIVE:
                return "Active";
            case COMPLETED:
                return "Completed";
            case CANCELLED:
                return "Cancelled";
            default:
                return "?";
        }
    }
}
