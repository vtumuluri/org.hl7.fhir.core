package org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum DiagnosticOrderStatus {

    /**
     * The request has been proposed.
     */
    PROPOSED,
    /**
     * The request is in preliminary form prior to being sent.
     */
    DRAFT,
    /**
     * The request has been planned.
     */
    PLANNED,
    /**
     * The request has been placed.
     */
    REQUESTED,
    /**
     * The receiving system has received the order, but not yet decided whether it will be performed.
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
     * The work is complete, and the outcomes are being reviewed for approval.
     */
    REVIEW,
    /**
     * The work has been completed, the report(s) released, and no further work is planned.
     */
    COMPLETED,
    /**
     * The request has been withdrawn.
     */
    CANCELLED,
    /**
     * The request has been held by originating system/user request.
     */
    SUSPENDED,
    /**
     * The receiving system has declined to fulfill the request.
     */
    REJECTED,
    /**
     * The diagnostic investigation was attempted, but due to some procedural error, it could not be completed.
     */
    FAILED,
    /**
     * added to help the parsers
     */
    NULL;

    public static DiagnosticOrderStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return PROPOSED;
        if ("draft".equals(codeString))
            return DRAFT;
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
        if ("review".equals(codeString))
            return REVIEW;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        if ("suspended".equals(codeString))
            return SUSPENDED;
        if ("rejected".equals(codeString))
            return REJECTED;
        if ("failed".equals(codeString))
            return FAILED;
        throw new FHIRException("Unknown DiagnosticOrderStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PROPOSED:
                return "proposed";
            case DRAFT:
                return "draft";
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
            case REVIEW:
                return "review";
            case COMPLETED:
                return "completed";
            case CANCELLED:
                return "cancelled";
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
                return "http://hl7.org/fhir/diagnostic-order-status";
            case DRAFT:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case PLANNED:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case REQUESTED:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case RECEIVED:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case ACCEPTED:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case INPROGRESS:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case REVIEW:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case COMPLETED:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case CANCELLED:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case SUSPENDED:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case REJECTED:
                return "http://hl7.org/fhir/diagnostic-order-status";
            case FAILED:
                return "http://hl7.org/fhir/diagnostic-order-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PROPOSED:
                return "The request has been proposed.";
            case DRAFT:
                return "The request is in preliminary form prior to being sent.";
            case PLANNED:
                return "The request has been planned.";
            case REQUESTED:
                return "The request has been placed.";
            case RECEIVED:
                return "The receiving system has received the order, but not yet decided whether it will be performed.";
            case ACCEPTED:
                return "The receiving system has accepted the order, but work has not yet commenced.";
            case INPROGRESS:
                return "The work to fulfill the order is happening.";
            case REVIEW:
                return "The work is complete, and the outcomes are being reviewed for approval.";
            case COMPLETED:
                return "The work has been completed, the report(s) released, and no further work is planned.";
            case CANCELLED:
                return "The request has been withdrawn.";
            case SUSPENDED:
                return "The request has been held by originating system/user request.";
            case REJECTED:
                return "The receiving system has declined to fulfill the request.";
            case FAILED:
                return "The diagnostic investigation was attempted, but due to some procedural error, it could not be completed.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PROPOSED:
                return "Proposed";
            case DRAFT:
                return "Draft";
            case PLANNED:
                return "Planned";
            case REQUESTED:
                return "Requested";
            case RECEIVED:
                return "Received";
            case ACCEPTED:
                return "Accepted";
            case INPROGRESS:
                return "In-Progress";
            case REVIEW:
                return "Review";
            case COMPLETED:
                return "Completed";
            case CANCELLED:
                return "Cancelled";
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
