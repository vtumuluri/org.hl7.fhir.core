package org.hl7.fhir.android.generated.dstu2.AppointmentResponseEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ParticipantStatus {

    /**
     * The appointment participant has accepted that they can attend the appointment at the time specified in the AppointmentResponse.
     */
    ACCEPTED,
    /**
     * The appointment participant has declined the appointment.
     */
    DECLINED,
    /**
     * The appointment participant has tentatively accepted the appointment.
     */
    TENTATIVE,
    /**
     * The participant has in-process the appointment.
     */
    INPROCESS,
    /**
     * The participant has completed the appointment.
     */
    COMPLETED,
    /**
     * This is the intitial status of an appointment participant until a participant has replied. It implies that there is no commitment for the appointment.
     */
    NEEDSACTION,
    /**
     * added to help the parsers
     */
    NULL;

    public static ParticipantStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("accepted".equals(codeString))
            return ACCEPTED;
        if ("declined".equals(codeString))
            return DECLINED;
        if ("tentative".equals(codeString))
            return TENTATIVE;
        if ("in-process".equals(codeString))
            return INPROCESS;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("needs-action".equals(codeString))
            return NEEDSACTION;
        throw new FHIRException("Unknown ParticipantStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ACCEPTED:
                return "accepted";
            case DECLINED:
                return "declined";
            case TENTATIVE:
                return "tentative";
            case INPROCESS:
                return "in-process";
            case COMPLETED:
                return "completed";
            case NEEDSACTION:
                return "needs-action";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ACCEPTED:
                return "http://hl7.org/fhir/participantstatus";
            case DECLINED:
                return "http://hl7.org/fhir/participantstatus";
            case TENTATIVE:
                return "http://hl7.org/fhir/participantstatus";
            case INPROCESS:
                return "http://hl7.org/fhir/participantstatus";
            case COMPLETED:
                return "http://hl7.org/fhir/participantstatus";
            case NEEDSACTION:
                return "http://hl7.org/fhir/participantstatus";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ACCEPTED:
                return "The appointment participant has accepted that they can attend the appointment at the time specified in the AppointmentResponse.";
            case DECLINED:
                return "The appointment participant has declined the appointment.";
            case TENTATIVE:
                return "The appointment participant has tentatively accepted the appointment.";
            case INPROCESS:
                return "The participant has in-process the appointment.";
            case COMPLETED:
                return "The participant has completed the appointment.";
            case NEEDSACTION:
                return "This is the intitial status of an appointment participant until a participant has replied. It implies that there is no commitment for the appointment.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ACCEPTED:
                return "Accepted";
            case DECLINED:
                return "Declined";
            case TENTATIVE:
                return "Tentative";
            case INPROCESS:
                return "In Process";
            case COMPLETED:
                return "Completed";
            case NEEDSACTION:
                return "Needs Action";
            default:
                return "?";
        }
    }
}
