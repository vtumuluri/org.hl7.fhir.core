package org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DiagnosticOrderStatusEnumFactory implements EnumFactory<DiagnosticOrderStatus> {

    public DiagnosticOrderStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("proposed".equals(codeString))
            return DiagnosticOrderStatus.PROPOSED;
        if ("draft".equals(codeString))
            return DiagnosticOrderStatus.DRAFT;
        if ("planned".equals(codeString))
            return DiagnosticOrderStatus.PLANNED;
        if ("requested".equals(codeString))
            return DiagnosticOrderStatus.REQUESTED;
        if ("received".equals(codeString))
            return DiagnosticOrderStatus.RECEIVED;
        if ("accepted".equals(codeString))
            return DiagnosticOrderStatus.ACCEPTED;
        if ("in-progress".equals(codeString))
            return DiagnosticOrderStatus.INPROGRESS;
        if ("review".equals(codeString))
            return DiagnosticOrderStatus.REVIEW;
        if ("completed".equals(codeString))
            return DiagnosticOrderStatus.COMPLETED;
        if ("cancelled".equals(codeString))
            return DiagnosticOrderStatus.CANCELLED;
        if ("suspended".equals(codeString))
            return DiagnosticOrderStatus.SUSPENDED;
        if ("rejected".equals(codeString))
            return DiagnosticOrderStatus.REJECTED;
        if ("failed".equals(codeString))
            return DiagnosticOrderStatus.FAILED;
        throw new IllegalArgumentException("Unknown DiagnosticOrderStatus code '" + codeString + "'");
    }

    public Enumeration<DiagnosticOrderStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.PROPOSED);
        if ("draft".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.DRAFT);
        if ("planned".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.PLANNED);
        if ("requested".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.REQUESTED);
        if ("received".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.RECEIVED);
        if ("accepted".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.ACCEPTED);
        if ("in-progress".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.INPROGRESS);
        if ("review".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.REVIEW);
        if ("completed".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.COMPLETED);
        if ("cancelled".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.CANCELLED);
        if ("suspended".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.SUSPENDED);
        if ("rejected".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.REJECTED);
        if ("failed".equals(codeString))
            return new Enumeration<DiagnosticOrderStatus>(this, DiagnosticOrderStatus.FAILED);
        throw new FHIRException("Unknown DiagnosticOrderStatus code '" + codeString + "'");
    }

    public String toCode(DiagnosticOrderStatus code) {
        if (code == DiagnosticOrderStatus.PROPOSED)
            return "proposed";
        if (code == DiagnosticOrderStatus.DRAFT)
            return "draft";
        if (code == DiagnosticOrderStatus.PLANNED)
            return "planned";
        if (code == DiagnosticOrderStatus.REQUESTED)
            return "requested";
        if (code == DiagnosticOrderStatus.RECEIVED)
            return "received";
        if (code == DiagnosticOrderStatus.ACCEPTED)
            return "accepted";
        if (code == DiagnosticOrderStatus.INPROGRESS)
            return "in-progress";
        if (code == DiagnosticOrderStatus.REVIEW)
            return "review";
        if (code == DiagnosticOrderStatus.COMPLETED)
            return "completed";
        if (code == DiagnosticOrderStatus.CANCELLED)
            return "cancelled";
        if (code == DiagnosticOrderStatus.SUSPENDED)
            return "suspended";
        if (code == DiagnosticOrderStatus.REJECTED)
            return "rejected";
        if (code == DiagnosticOrderStatus.FAILED)
            return "failed";
        return "?";
    }
}
