package org.hl7.fhir.android.generated.dstu2.GoalEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum GoalStatus {

    /**
     * A goal is proposed for this patient
     */
    PROPOSED,
    /**
     * A goal is planned for this patient
     */
    PLANNED,
    /**
     * A proposed goal was accepted
     */
    ACCEPTED,
    /**
     * A proposed goal was rejected
     */
    REJECTED,
    /**
     * The goal is being sought but has not yet been reached.  (Also applies if goal was reached in the past but there has been regression and goal is being sought again)
     */
    INPROGRESS,
    /**
     * The goal has been met and no further action is needed
     */
    ACHIEVED,
    /**
     * The goal has been met, but ongoing activity is needed to sustain the goal objective
     */
    SUSTAINING,
    /**
     * The goal remains a long term objective but is no longer being actively pursued for a temporary period of time.
     */
    ONHOLD,
    /**
     * The goal is no longer being sought
     */
    CANCELLED,
    /**
     * added to help the parsers
     */
    NULL;

    public static GoalStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return PROPOSED;
        if ("planned".equals(codeString))
            return PLANNED;
        if ("accepted".equals(codeString))
            return ACCEPTED;
        if ("rejected".equals(codeString))
            return REJECTED;
        if ("in-progress".equals(codeString))
            return INPROGRESS;
        if ("achieved".equals(codeString))
            return ACHIEVED;
        if ("sustaining".equals(codeString))
            return SUSTAINING;
        if ("on-hold".equals(codeString))
            return ONHOLD;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        throw new FHIRException("Unknown GoalStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PROPOSED:
                return "proposed";
            case PLANNED:
                return "planned";
            case ACCEPTED:
                return "accepted";
            case REJECTED:
                return "rejected";
            case INPROGRESS:
                return "in-progress";
            case ACHIEVED:
                return "achieved";
            case SUSTAINING:
                return "sustaining";
            case ONHOLD:
                return "on-hold";
            case CANCELLED:
                return "cancelled";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PROPOSED:
                return "http://hl7.org/fhir/goal-status";
            case PLANNED:
                return "http://hl7.org/fhir/goal-status";
            case ACCEPTED:
                return "http://hl7.org/fhir/goal-status";
            case REJECTED:
                return "http://hl7.org/fhir/goal-status";
            case INPROGRESS:
                return "http://hl7.org/fhir/goal-status";
            case ACHIEVED:
                return "http://hl7.org/fhir/goal-status";
            case SUSTAINING:
                return "http://hl7.org/fhir/goal-status";
            case ONHOLD:
                return "http://hl7.org/fhir/goal-status";
            case CANCELLED:
                return "http://hl7.org/fhir/goal-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PROPOSED:
                return "A goal is proposed for this patient";
            case PLANNED:
                return "A goal is planned for this patient";
            case ACCEPTED:
                return "A proposed goal was accepted";
            case REJECTED:
                return "A proposed goal was rejected";
            case INPROGRESS:
                return "The goal is being sought but has not yet been reached.  (Also applies if goal was reached in the past but there has been regression and goal is being sought again)";
            case ACHIEVED:
                return "The goal has been met and no further action is needed";
            case SUSTAINING:
                return "The goal has been met, but ongoing activity is needed to sustain the goal objective";
            case ONHOLD:
                return "The goal remains a long term objective but is no longer being actively pursued for a temporary period of time.";
            case CANCELLED:
                return "The goal is no longer being sought";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PROPOSED:
                return "Proposed";
            case PLANNED:
                return "Planned";
            case ACCEPTED:
                return "Accepted";
            case REJECTED:
                return "Rejected";
            case INPROGRESS:
                return "In Progress";
            case ACHIEVED:
                return "Achieved";
            case SUSTAINING:
                return "Sustaining";
            case ONHOLD:
                return "On Hold";
            case CANCELLED:
                return "Cancelled";
            default:
                return "?";
        }
    }
}
