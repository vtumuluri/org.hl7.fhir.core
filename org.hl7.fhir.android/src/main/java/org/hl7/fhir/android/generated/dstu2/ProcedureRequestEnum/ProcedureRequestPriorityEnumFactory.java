package org.hl7.fhir.android.generated.dstu2.ProcedureRequestEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ProcedureRequestPriorityEnumFactory implements EnumFactory<ProcedureRequestPriority> {

    public ProcedureRequestPriority fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("routine".equals(codeString))
            return ProcedureRequestPriority.ROUTINE;
        if ("urgent".equals(codeString))
            return ProcedureRequestPriority.URGENT;
        if ("stat".equals(codeString))
            return ProcedureRequestPriority.STAT;
        if ("asap".equals(codeString))
            return ProcedureRequestPriority.ASAP;
        throw new IllegalArgumentException("Unknown ProcedureRequestPriority code '" + codeString + "'");
    }

    public Enumeration<ProcedureRequestPriority> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("routine".equals(codeString))
            return new Enumeration<ProcedureRequestPriority>(this, ProcedureRequestPriority.ROUTINE);
        if ("urgent".equals(codeString))
            return new Enumeration<ProcedureRequestPriority>(this, ProcedureRequestPriority.URGENT);
        if ("stat".equals(codeString))
            return new Enumeration<ProcedureRequestPriority>(this, ProcedureRequestPriority.STAT);
        if ("asap".equals(codeString))
            return new Enumeration<ProcedureRequestPriority>(this, ProcedureRequestPriority.ASAP);
        throw new FHIRException("Unknown ProcedureRequestPriority code '" + codeString + "'");
    }

    public String toCode(ProcedureRequestPriority code) {
        if (code == ProcedureRequestPriority.ROUTINE)
            return "routine";
        if (code == ProcedureRequestPriority.URGENT)
            return "urgent";
        if (code == ProcedureRequestPriority.STAT)
            return "stat";
        if (code == ProcedureRequestPriority.ASAP)
            return "asap";
        return "?";
    }
}
