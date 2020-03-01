package org.hl7.fhir.android.generated.dstu2.SupplyDeliveryEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SupplyDeliveryStatusEnumFactory implements EnumFactory<SupplyDeliveryStatus> {

    public SupplyDeliveryStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
            return SupplyDeliveryStatus.INPROGRESS;
        if ("completed".equals(codeString))
            return SupplyDeliveryStatus.COMPLETED;
        if ("abandoned".equals(codeString))
            return SupplyDeliveryStatus.ABANDONED;
        throw new IllegalArgumentException("Unknown SupplyDeliveryStatus code '" + codeString + "'");
    }

    public Enumeration<SupplyDeliveryStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return new Enumeration<SupplyDeliveryStatus>(this, SupplyDeliveryStatus.INPROGRESS);
        if ("completed".equals(codeString))
            return new Enumeration<SupplyDeliveryStatus>(this, SupplyDeliveryStatus.COMPLETED);
        if ("abandoned".equals(codeString))
            return new Enumeration<SupplyDeliveryStatus>(this, SupplyDeliveryStatus.ABANDONED);
        throw new FHIRException("Unknown SupplyDeliveryStatus code '" + codeString + "'");
    }

    public String toCode(SupplyDeliveryStatus code) {
        if (code == SupplyDeliveryStatus.INPROGRESS)
            return "in-progress";
        if (code == SupplyDeliveryStatus.COMPLETED)
            return "completed";
        if (code == SupplyDeliveryStatus.ABANDONED)
            return "abandoned";
        return "?";
    }
}
