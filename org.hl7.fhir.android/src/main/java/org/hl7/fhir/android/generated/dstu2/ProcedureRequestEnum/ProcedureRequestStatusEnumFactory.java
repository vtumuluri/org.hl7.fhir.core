package org.hl7.fhir.android.generated.dstu2.ProcedureRequestEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ProcedureRequestStatusEnumFactory implements EnumFactory<ProcedureRequestStatus> {

    public ProcedureRequestStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("proposed".equals(codeString))
            return ProcedureRequestStatus.PROPOSED;
        if ("draft".equals(codeString))
            return ProcedureRequestStatus.DRAFT;
        if ("requested".equals(codeString))
            return ProcedureRequestStatus.REQUESTED;
        if ("received".equals(codeString))
            return ProcedureRequestStatus.RECEIVED;
        if ("accepted".equals(codeString))
            return ProcedureRequestStatus.ACCEPTED;
        if ("in-progress".equals(codeString))
            return ProcedureRequestStatus.INPROGRESS;
        if ("completed".equals(codeString))
            return ProcedureRequestStatus.COMPLETED;
        if ("suspended".equals(codeString))
            return ProcedureRequestStatus.SUSPENDED;
        if ("rejected".equals(codeString))
            return ProcedureRequestStatus.REJECTED;
        if ("aborted".equals(codeString))
            return ProcedureRequestStatus.ABORTED;
        throw new IllegalArgumentException("Unknown ProcedureRequestStatus code '" + codeString + "'");
    }

    public Enumeration<ProcedureRequestStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return new Enumeration<ProcedureRequestStatus>(this, ProcedureRequestStatus.PROPOSED);
        if ("draft".equals(codeString))
            return new Enumeration<ProcedureRequestStatus>(this, ProcedureRequestStatus.DRAFT);
        if ("requested".equals(codeString))
            return new Enumeration<ProcedureRequestStatus>(this, ProcedureRequestStatus.REQUESTED);
        if ("received".equals(codeString))
            return new Enumeration<ProcedureRequestStatus>(this, ProcedureRequestStatus.RECEIVED);
        if ("accepted".equals(codeString))
            return new Enumeration<ProcedureRequestStatus>(this, ProcedureRequestStatus.ACCEPTED);
        if ("in-progress".equals(codeString))
            return new Enumeration<ProcedureRequestStatus>(this, ProcedureRequestStatus.INPROGRESS);
        if ("completed".equals(codeString))
            return new Enumeration<ProcedureRequestStatus>(this, ProcedureRequestStatus.COMPLETED);
        if ("suspended".equals(codeString))
            return new Enumeration<ProcedureRequestStatus>(this, ProcedureRequestStatus.SUSPENDED);
        if ("rejected".equals(codeString))
            return new Enumeration<ProcedureRequestStatus>(this, ProcedureRequestStatus.REJECTED);
        if ("aborted".equals(codeString))
            return new Enumeration<ProcedureRequestStatus>(this, ProcedureRequestStatus.ABORTED);
        throw new FHIRException("Unknown ProcedureRequestStatus code '" + codeString + "'");
    }

    public String toCode(ProcedureRequestStatus code) {
        if (code == ProcedureRequestStatus.PROPOSED)
            return "proposed";
        if (code == ProcedureRequestStatus.DRAFT)
            return "draft";
        if (code == ProcedureRequestStatus.REQUESTED)
            return "requested";
        if (code == ProcedureRequestStatus.RECEIVED)
            return "received";
        if (code == ProcedureRequestStatus.ACCEPTED)
            return "accepted";
        if (code == ProcedureRequestStatus.INPROGRESS)
            return "in-progress";
        if (code == ProcedureRequestStatus.COMPLETED)
            return "completed";
        if (code == ProcedureRequestStatus.SUSPENDED)
            return "suspended";
        if (code == ProcedureRequestStatus.REJECTED)
            return "rejected";
        if (code == ProcedureRequestStatus.ABORTED)
            return "aborted";
        return "?";
    }
}
