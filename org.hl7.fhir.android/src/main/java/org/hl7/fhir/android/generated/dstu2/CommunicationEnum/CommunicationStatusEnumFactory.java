package org.hl7.fhir.android.generated.dstu2.CommunicationEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class CommunicationStatusEnumFactory implements EnumFactory<CommunicationStatus> {

    public CommunicationStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
            return CommunicationStatus.INPROGRESS;
        if ("completed".equals(codeString))
            return CommunicationStatus.COMPLETED;
        if ("suspended".equals(codeString))
            return CommunicationStatus.SUSPENDED;
        if ("rejected".equals(codeString))
            return CommunicationStatus.REJECTED;
        if ("failed".equals(codeString))
            return CommunicationStatus.FAILED;
        throw new IllegalArgumentException("Unknown CommunicationStatus code '" + codeString + "'");
    }

    public Enumeration<CommunicationStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return new Enumeration<CommunicationStatus>(this, CommunicationStatus.INPROGRESS);
        if ("completed".equals(codeString))
            return new Enumeration<CommunicationStatus>(this, CommunicationStatus.COMPLETED);
        if ("suspended".equals(codeString))
            return new Enumeration<CommunicationStatus>(this, CommunicationStatus.SUSPENDED);
        if ("rejected".equals(codeString))
            return new Enumeration<CommunicationStatus>(this, CommunicationStatus.REJECTED);
        if ("failed".equals(codeString))
            return new Enumeration<CommunicationStatus>(this, CommunicationStatus.FAILED);
        throw new FHIRException("Unknown CommunicationStatus code '" + codeString + "'");
    }

    public String toCode(CommunicationStatus code) {
        if (code == CommunicationStatus.INPROGRESS)
            return "in-progress";
        if (code == CommunicationStatus.COMPLETED)
            return "completed";
        if (code == CommunicationStatus.SUSPENDED)
            return "suspended";
        if (code == CommunicationStatus.REJECTED)
            return "rejected";
        if (code == CommunicationStatus.FAILED)
            return "failed";
        return "?";
    }
}
