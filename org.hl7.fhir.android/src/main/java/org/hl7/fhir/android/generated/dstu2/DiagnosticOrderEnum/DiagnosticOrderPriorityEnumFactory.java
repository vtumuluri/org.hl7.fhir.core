package org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DiagnosticOrderPriorityEnumFactory implements EnumFactory<DiagnosticOrderPriority> {

    public DiagnosticOrderPriority fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("routine".equals(codeString))
            return DiagnosticOrderPriority.ROUTINE;
        if ("urgent".equals(codeString))
            return DiagnosticOrderPriority.URGENT;
        if ("stat".equals(codeString))
            return DiagnosticOrderPriority.STAT;
        if ("asap".equals(codeString))
            return DiagnosticOrderPriority.ASAP;
        throw new IllegalArgumentException("Unknown DiagnosticOrderPriority code '" + codeString + "'");
    }

    public Enumeration<DiagnosticOrderPriority> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("routine".equals(codeString))
            return new Enumeration<DiagnosticOrderPriority>(this, DiagnosticOrderPriority.ROUTINE);
        if ("urgent".equals(codeString))
            return new Enumeration<DiagnosticOrderPriority>(this, DiagnosticOrderPriority.URGENT);
        if ("stat".equals(codeString))
            return new Enumeration<DiagnosticOrderPriority>(this, DiagnosticOrderPriority.STAT);
        if ("asap".equals(codeString))
            return new Enumeration<DiagnosticOrderPriority>(this, DiagnosticOrderPriority.ASAP);
        throw new FHIRException("Unknown DiagnosticOrderPriority code '" + codeString + "'");
    }

    public String toCode(DiagnosticOrderPriority code) {
        if (code == DiagnosticOrderPriority.ROUTINE)
            return "routine";
        if (code == DiagnosticOrderPriority.URGENT)
            return "urgent";
        if (code == DiagnosticOrderPriority.STAT)
            return "stat";
        if (code == DiagnosticOrderPriority.ASAP)
            return "asap";
        return "?";
    }
}
