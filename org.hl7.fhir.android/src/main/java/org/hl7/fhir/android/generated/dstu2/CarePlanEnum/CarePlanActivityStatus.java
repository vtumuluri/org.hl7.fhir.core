package org.hl7.fhir.android.generated.dstu2.CarePlanEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum CarePlanActivityStatus {

    /**
     * Activity is planned but no action has yet been taken.
     */
    NOTSTARTED,
    /**
     * Appointment or other booking has occurred but activity has not yet begun.
     */
    SCHEDULED,
    /**
     * Activity has been started but is not yet complete.
     */
    INPROGRESS,
    /**
     * Activity was started but has temporarily ceased with an expectation of resumption at a future time.
     */
    ONHOLD,
    /**
     * The activities have been completed (more or less) as planned.
     */
    COMPLETED,
    /**
     * The activities have been ended prior to completion (perhaps even before they were started).
     */
    CANCELLED,
    /**
     * added to help the parsers
     */
    NULL;

    public static CarePlanActivityStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("not-started".equals(codeString))
            return NOTSTARTED;
        if ("scheduled".equals(codeString))
            return SCHEDULED;
        if ("in-progress".equals(codeString))
            return INPROGRESS;
        if ("on-hold".equals(codeString))
            return ONHOLD;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        throw new FHIRException("Unknown CarePlanActivityStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case NOTSTARTED:
                return "not-started";
            case SCHEDULED:
                return "scheduled";
            case INPROGRESS:
                return "in-progress";
            case ONHOLD:
                return "on-hold";
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
            case NOTSTARTED:
                return "http://hl7.org/fhir/care-plan-activity-status";
            case SCHEDULED:
                return "http://hl7.org/fhir/care-plan-activity-status";
            case INPROGRESS:
                return "http://hl7.org/fhir/care-plan-activity-status";
            case ONHOLD:
                return "http://hl7.org/fhir/care-plan-activity-status";
            case COMPLETED:
                return "http://hl7.org/fhir/care-plan-activity-status";
            case CANCELLED:
                return "http://hl7.org/fhir/care-plan-activity-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case NOTSTARTED:
                return "Activity is planned but no action has yet been taken.";
            case SCHEDULED:
                return "Appointment or other booking has occurred but activity has not yet begun.";
            case INPROGRESS:
                return "Activity has been started but is not yet complete.";
            case ONHOLD:
                return "Activity was started but has temporarily ceased with an expectation of resumption at a future time.";
            case COMPLETED:
                return "The activities have been completed (more or less) as planned.";
            case CANCELLED:
                return "The activities have been ended prior to completion (perhaps even before they were started).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case NOTSTARTED:
                return "Not Started";
            case SCHEDULED:
                return "Scheduled";
            case INPROGRESS:
                return "In Progress";
            case ONHOLD:
                return "On Hold";
            case COMPLETED:
                return "Completed";
            case CANCELLED:
                return "Cancelled";
            default:
                return "?";
        }
    }
}
