package org.hl7.fhir.android.generated.dstu2.OrderResponseEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.OrderResponseEnum.OrderStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.OrderResponseEnum.OrderStatus;

public enum OrderStatus {

    /**
     * The order is known, but no processing has occurred at this time
     */
    PENDING,
    /**
     * The order is undergoing initial processing to determine whether it will be accepted (usually this involves human review)
     */
    REVIEW,
    /**
     * The order was rejected because of a workflow/business logic reason
     */
    REJECTED,
    /**
     * The order was unable to be processed because of a technical error (i.e. unexpected error)
     */
    ERROR,
    /**
     * The order has been accepted, and work is in progress.
     */
    ACCEPTED,
    /**
     * Processing the order was halted at the initiators request.
     */
    CANCELLED,
    /**
     * The order has been cancelled and replaced by another.
     */
    REPLACED,
    /**
     * Processing the order was stopped because of some workflow/business logic reason.
     */
    ABORTED,
    /**
     * The order has been completed.
     */
    COMPLETED,
    /**
     * added to help the parsers
     */
    NULL;

    public static OrderStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("pending".equals(codeString))
            return PENDING;
        if ("review".equals(codeString))
            return REVIEW;
        if ("rejected".equals(codeString))
            return REJECTED;
        if ("error".equals(codeString))
            return ERROR;
        if ("accepted".equals(codeString))
            return ACCEPTED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        if ("replaced".equals(codeString))
            return REPLACED;
        if ("aborted".equals(codeString))
            return ABORTED;
        if ("completed".equals(codeString))
            return COMPLETED;
        throw new FHIRException("Unknown OrderStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PENDING:
                return "pending";
            case REVIEW:
                return "review";
            case REJECTED:
                return "rejected";
            case ERROR:
                return "error";
            case ACCEPTED:
                return "accepted";
            case CANCELLED:
                return "cancelled";
            case REPLACED:
                return "replaced";
            case ABORTED:
                return "aborted";
            case COMPLETED:
                return "completed";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PENDING:
                return "http://hl7.org/fhir/order-status";
            case REVIEW:
                return "http://hl7.org/fhir/order-status";
            case REJECTED:
                return "http://hl7.org/fhir/order-status";
            case ERROR:
                return "http://hl7.org/fhir/order-status";
            case ACCEPTED:
                return "http://hl7.org/fhir/order-status";
            case CANCELLED:
                return "http://hl7.org/fhir/order-status";
            case REPLACED:
                return "http://hl7.org/fhir/order-status";
            case ABORTED:
                return "http://hl7.org/fhir/order-status";
            case COMPLETED:
                return "http://hl7.org/fhir/order-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PENDING:
                return "The order is known, but no processing has occurred at this time";
            case REVIEW:
                return "The order is undergoing initial processing to determine whether it will be accepted (usually this involves human review)";
            case REJECTED:
                return "The order was rejected because of a workflow/business logic reason";
            case ERROR:
                return "The order was unable to be processed because of a technical error (i.e. unexpected error)";
            case ACCEPTED:
                return "The order has been accepted, and work is in progress.";
            case CANCELLED:
                return "Processing the order was halted at the initiators request.";
            case REPLACED:
                return "The order has been cancelled and replaced by another.";
            case ABORTED:
                return "Processing the order was stopped because of some workflow/business logic reason.";
            case COMPLETED:
                return "The order has been completed.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PENDING:
                return "Pending";
            case REVIEW:
                return "Review";
            case REJECTED:
                return "Rejected";
            case ERROR:
                return "Error";
            case ACCEPTED:
                return "Accepted";
            case CANCELLED:
                return "Cancelled";
            case REPLACED:
                return "Replaced";
            case ABORTED:
                return "Aborted";
            case COMPLETED:
                return "Completed";
            default:
                return "?";
        }
    }
}
