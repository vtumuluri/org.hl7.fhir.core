package org.hl7.fhir.android.generated.dstu2.SupplyDeliveryEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.SupplyDeliveryEnum.SupplyDeliveryStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.SupplyDeliveryEnum.SupplyDeliveryStatus;

public enum SupplyDeliveryStatus {

    /**
     * Supply has been requested, but not delivered.
     */
    INPROGRESS,
    /**
     * Supply has been delivered ("completed").
     */
    COMPLETED,
    /**
     * Dispensing was not completed.
     */
    ABANDONED,
    /**
     * added to help the parsers
     */
    NULL;

    public static SupplyDeliveryStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return INPROGRESS;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("abandoned".equals(codeString))
            return ABANDONED;
        throw new FHIRException("Unknown SupplyDeliveryStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INPROGRESS:
                return "in-progress";
            case COMPLETED:
                return "completed";
            case ABANDONED:
                return "abandoned";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INPROGRESS:
                return "http://hl7.org/fhir/supplydelivery-status";
            case COMPLETED:
                return "http://hl7.org/fhir/supplydelivery-status";
            case ABANDONED:
                return "http://hl7.org/fhir/supplydelivery-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INPROGRESS:
                return "Supply has been requested, but not delivered.";
            case COMPLETED:
                return "Supply has been delivered (\"completed\").";
            case ABANDONED:
                return "Dispensing was not completed.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INPROGRESS:
                return "In Progress";
            case COMPLETED:
                return "Delivered";
            case ABANDONED:
                return "Abandoned";
            default:
                return "?";
        }
    }
}
