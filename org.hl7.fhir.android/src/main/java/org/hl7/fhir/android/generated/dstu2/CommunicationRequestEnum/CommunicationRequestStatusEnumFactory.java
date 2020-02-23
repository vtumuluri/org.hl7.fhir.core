package org.hl7.fhir.android.generated.dstu2.CommunicationRequestEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class CommunicationRequestStatusEnumFactory implements EnumFactory<CommunicationRequestStatus> {

    public CommunicationRequestStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("proposed".equals(codeString))
            return CommunicationRequestStatus.PROPOSED;
        if ("planned".equals(codeString))
            return CommunicationRequestStatus.PLANNED;
        if ("requested".equals(codeString))
            return CommunicationRequestStatus.REQUESTED;
        if ("received".equals(codeString))
            return CommunicationRequestStatus.RECEIVED;
        if ("accepted".equals(codeString))
            return CommunicationRequestStatus.ACCEPTED;
        if ("in-progress".equals(codeString))
            return CommunicationRequestStatus.INPROGRESS;
        if ("completed".equals(codeString))
            return CommunicationRequestStatus.COMPLETED;
        if ("suspended".equals(codeString))
            return CommunicationRequestStatus.SUSPENDED;
        if ("rejected".equals(codeString))
            return CommunicationRequestStatus.REJECTED;
        if ("failed".equals(codeString))
            return CommunicationRequestStatus.FAILED;
        throw new IllegalArgumentException("Unknown CommunicationRequestStatus code '" + codeString + "'");
    }

    public Enumeration<CommunicationRequestStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return new Enumeration<CommunicationRequestStatus>(this, CommunicationRequestStatus.PROPOSED);
        if ("planned".equals(codeString))
            return new Enumeration<CommunicationRequestStatus>(this, CommunicationRequestStatus.PLANNED);
        if ("requested".equals(codeString))
            return new Enumeration<CommunicationRequestStatus>(this, CommunicationRequestStatus.REQUESTED);
        if ("received".equals(codeString))
            return new Enumeration<CommunicationRequestStatus>(this, CommunicationRequestStatus.RECEIVED);
        if ("accepted".equals(codeString))
            return new Enumeration<CommunicationRequestStatus>(this, CommunicationRequestStatus.ACCEPTED);
        if ("in-progress".equals(codeString))
            return new Enumeration<CommunicationRequestStatus>(this, CommunicationRequestStatus.INPROGRESS);
        if ("completed".equals(codeString))
            return new Enumeration<CommunicationRequestStatus>(this, CommunicationRequestStatus.COMPLETED);
        if ("suspended".equals(codeString))
            return new Enumeration<CommunicationRequestStatus>(this, CommunicationRequestStatus.SUSPENDED);
        if ("rejected".equals(codeString))
            return new Enumeration<CommunicationRequestStatus>(this, CommunicationRequestStatus.REJECTED);
        if ("failed".equals(codeString))
            return new Enumeration<CommunicationRequestStatus>(this, CommunicationRequestStatus.FAILED);
        throw new FHIRException("Unknown CommunicationRequestStatus code '" + codeString + "'");
    }

    public String toCode(CommunicationRequestStatus code) {
        if (code == CommunicationRequestStatus.PROPOSED)
            return "proposed";
        if (code == CommunicationRequestStatus.PLANNED)
            return "planned";
        if (code == CommunicationRequestStatus.REQUESTED)
            return "requested";
        if (code == CommunicationRequestStatus.RECEIVED)
            return "received";
        if (code == CommunicationRequestStatus.ACCEPTED)
            return "accepted";
        if (code == CommunicationRequestStatus.INPROGRESS)
            return "in-progress";
        if (code == CommunicationRequestStatus.COMPLETED)
            return "completed";
        if (code == CommunicationRequestStatus.SUSPENDED)
            return "suspended";
        if (code == CommunicationRequestStatus.REJECTED)
            return "rejected";
        if (code == CommunicationRequestStatus.FAILED)
            return "failed";
        return "?";
    }
}
