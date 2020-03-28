package org.hl7.fhir.android.generated.dstu2.SupplyRequestEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.SupplyRequestEnum.SupplyRequestStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.SupplyRequestEnum.SupplyRequestStatus;

public enum SupplyRequestStatus {

    /**
     * Supply has been requested, but not dispensed.
     */
    REQUESTED,
    /**
     * Supply has been received by the requestor.
     */
    COMPLETED,
    /**
     * The supply will not be completed because the supplier was unable or unwilling to supply the item.
     */
    FAILED,
    /**
     * The orderer of the supply cancelled the request.
     */
    CANCELLED,
    /**
     * added to help the parsers
     */
    NULL;

    public static SupplyRequestStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("requested".equals(codeString))
            return REQUESTED;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("failed".equals(codeString))
            return FAILED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        throw new FHIRException("Unknown SupplyRequestStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case REQUESTED:
                return "requested";
            case COMPLETED:
                return "completed";
            case FAILED:
                return "failed";
            case CANCELLED:
                return "cancelled";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case REQUESTED:
                return "http://hl7.org/fhir/supplyrequest-status";
            case COMPLETED:
                return "http://hl7.org/fhir/supplyrequest-status";
            case FAILED:
                return "http://hl7.org/fhir/supplyrequest-status";
            case CANCELLED:
                return "http://hl7.org/fhir/supplyrequest-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case REQUESTED:
                return "Supply has been requested, but not dispensed.";
            case COMPLETED:
                return "Supply has been received by the requestor.";
            case FAILED:
                return "The supply will not be completed because the supplier was unable or unwilling to supply the item.";
            case CANCELLED:
                return "The orderer of the supply cancelled the request.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case REQUESTED:
                return "Requested";
            case COMPLETED:
                return "Received";
            case FAILED:
                return "Failed";
            case CANCELLED:
                return "Cancelled";
            default:
                return "?";
        }
    }
}
