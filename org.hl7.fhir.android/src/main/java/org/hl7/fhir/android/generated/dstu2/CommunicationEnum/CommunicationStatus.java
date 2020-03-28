package org.hl7.fhir.android.generated.dstu2.CommunicationEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum CommunicationStatus {

    /**
     * The communication transmission is ongoing.
     */
    INPROGRESS,
    /**
     * The message transmission is complete, i.e., delivered to the recipient's destination.
     */
    COMPLETED,
    /**
     * The communication transmission has been held by originating system/user request.
     */
    SUSPENDED,
    /**
     * The receiving system has declined to accept the message.
     */
    REJECTED,
    /**
     * There was a failure in transmitting the message out.
     */
    FAILED,
    /**
     * added to help the parsers
     */
    NULL;

    public static CommunicationStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return INPROGRESS;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("suspended".equals(codeString))
            return SUSPENDED;
        if ("rejected".equals(codeString))
            return REJECTED;
        if ("failed".equals(codeString))
            return FAILED;
        throw new FHIRException("Unknown CommunicationStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INPROGRESS:
                return "in-progress";
            case COMPLETED:
                return "completed";
            case SUSPENDED:
                return "suspended";
            case REJECTED:
                return "rejected";
            case FAILED:
                return "failed";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INPROGRESS:
                return "http://hl7.org/fhir/communication-status";
            case COMPLETED:
                return "http://hl7.org/fhir/communication-status";
            case SUSPENDED:
                return "http://hl7.org/fhir/communication-status";
            case REJECTED:
                return "http://hl7.org/fhir/communication-status";
            case FAILED:
                return "http://hl7.org/fhir/communication-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INPROGRESS:
                return "The communication transmission is ongoing.";
            case COMPLETED:
                return "The message transmission is complete, i.e., delivered to the recipient's destination.";
            case SUSPENDED:
                return "The communication transmission has been held by originating system/user request.";
            case REJECTED:
                return "The receiving system has declined to accept the message.";
            case FAILED:
                return "There was a failure in transmitting the message out.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INPROGRESS:
                return "In Progress";
            case COMPLETED:
                return "Completed";
            case SUSPENDED:
                return "Suspended";
            case REJECTED:
                return "Rejected";
            case FAILED:
                return "Failed";
            default:
                return "?";
        }
    }
}
