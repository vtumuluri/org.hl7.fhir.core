package org.hl7.fhir.android.generated.dstu2.SupplyRequestEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SupplyRequestStatusEnumFactory implements EnumFactory<SupplyRequestStatus> {

    public SupplyRequestStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("requested".equals(codeString))
            return SupplyRequestStatus.REQUESTED;
        if ("completed".equals(codeString))
            return SupplyRequestStatus.COMPLETED;
        if ("failed".equals(codeString))
            return SupplyRequestStatus.FAILED;
        if ("cancelled".equals(codeString))
            return SupplyRequestStatus.CANCELLED;
        throw new IllegalArgumentException("Unknown SupplyRequestStatus code '" + codeString + "'");
    }

    public Enumeration<SupplyRequestStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("requested".equals(codeString))
            return new Enumeration<SupplyRequestStatus>(this, SupplyRequestStatus.REQUESTED);
        if ("completed".equals(codeString))
            return new Enumeration<SupplyRequestStatus>(this, SupplyRequestStatus.COMPLETED);
        if ("failed".equals(codeString))
            return new Enumeration<SupplyRequestStatus>(this, SupplyRequestStatus.FAILED);
        if ("cancelled".equals(codeString))
            return new Enumeration<SupplyRequestStatus>(this, SupplyRequestStatus.CANCELLED);
        throw new FHIRException("Unknown SupplyRequestStatus code '" + codeString + "'");
    }

    public String toCode(SupplyRequestStatus code) {
        if (code == SupplyRequestStatus.REQUESTED)
            return "requested";
        if (code == SupplyRequestStatus.COMPLETED)
            return "completed";
        if (code == SupplyRequestStatus.FAILED)
            return "failed";
        if (code == SupplyRequestStatus.CANCELLED)
            return "cancelled";
        return "?";
    }
}
