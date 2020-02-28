package org.hl7.fhir.android.generated.dstu2.CommunicationRequestEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum CommunicationRequestStatus {

    /**
     * The request has been proposed.
     */
    PROPOSED,
    /**
     * The request has been planned.
     */
    PLANNED,
    /**
     * The request has been placed.
     */
    REQUESTED,
    /**
     * The receiving system has received the request but not yet decided whether it will be performed.
     */
    RECEIVED,
    /**
     * The receiving system has accepted the order, but work has not yet commenced.
     */
    ACCEPTED,
    /**
     * The work to fulfill the order is happening.
     */
    INPROGRESS,
    /**
     * The work has been complete, the report(s) released, and no further work is planned.
     */
    COMPLETED,
    /**
     * The request has been held by originating system/user request.
     */
    SUSPENDED,
    /**
     * The receiving system has declined to fulfill the request
     */
    REJECTED,
    /**
     * The communication was attempted, but due to some procedural error, it could not be completed.
     */
    FAILED,
    /**
     * added to help the parsers
     */
    NULL;

    public static CommunicationRequestStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return PROPOSED;
        if ("planned".equals(codeString))
            return PLANNED;
        if ("requested".equals(codeString))
            return REQUESTED;
        if ("received".equals(codeString))
            return RECEIVED;
        if ("accepted".equals(codeString))
            return ACCEPTED;
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
        throw new FHIRException("Unknown CommunicationRequestStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PROPOSED:
                return "proposed";
            case PLANNED:
                return "planned";
            case REQUESTED:
                return "requested";
            case RECEIVED:
                return "received";
            case ACCEPTED:
                return "accepted";
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
            case PROPOSED:
                return "http://hl7.org/fhir/communication-request-status";
            case PLANNED:
                return "http://hl7.org/fhir/communication-request-status";
            case REQUESTED:
                return "http://hl7.org/fhir/communication-request-status";
            case RECEIVED:
                return "http://hl7.org/fhir/communication-request-status";
            case ACCEPTED:
                return "http://hl7.org/fhir/communication-request-status";
            case INPROGRESS:
                return "http://hl7.org/fhir/communication-request-status";
            case COMPLETED:
                return "http://hl7.org/fhir/communication-request-status";
            case SUSPENDED:
                return "http://hl7.org/fhir/communication-request-status";
            case REJECTED:
                return "http://hl7.org/fhir/communication-request-status";
            case FAILED:
                return "http://hl7.org/fhir/communication-request-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PROPOSED:
                return "The request has been proposed.";
            case PLANNED:
                return "The request has been planned.";
            case REQUESTED:
                return "The request has been placed.";
            case RECEIVED:
                return "The receiving system has received the request but not yet decided whether it will be performed.";
            case ACCEPTED:
                return "The receiving system has accepted the order, but work has not yet commenced.";
            case INPROGRESS:
                return "The work to fulfill the order is happening.";
            case COMPLETED:
                return "The work has been complete, the report(s) released, and no further work is planned.";
            case SUSPENDED:
                return "The request has been held by originating system/user request.";
            case REJECTED:
                return "The receiving system has declined to fulfill the request";
            case FAILED:
                return "The communication was attempted, but due to some procedural error, it could not be completed.";
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
            case REQUESTED:
                return "Requested";
            case RECEIVED:
                return "Received";
            case ACCEPTED:
                return "Accepted";
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
