package org.hl7.fhir.android.generated.dstu2.ProcedureEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ProcedureStatusEnumFactory implements EnumFactory<ProcedureStatus> {

    public ProcedureStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
            return ProcedureStatus.INPROGRESS;
        if ("aborted".equals(codeString))
            return ProcedureStatus.ABORTED;
        if ("completed".equals(codeString))
            return ProcedureStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
            return ProcedureStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown ProcedureStatus code '" + codeString + "'");
    }

    public Enumeration<ProcedureStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return new Enumeration<ProcedureStatus>(this, ProcedureStatus.INPROGRESS);
        if ("aborted".equals(codeString))
            return new Enumeration<ProcedureStatus>(this, ProcedureStatus.ABORTED);
        if ("completed".equals(codeString))
            return new Enumeration<ProcedureStatus>(this, ProcedureStatus.COMPLETED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<ProcedureStatus>(this, ProcedureStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown ProcedureStatus code '" + codeString + "'");
    }

    public String toCode(ProcedureStatus code) {
        if (code == ProcedureStatus.INPROGRESS)
            return "in-progress";
        if (code == ProcedureStatus.ABORTED)
            return "aborted";
        if (code == ProcedureStatus.COMPLETED)
            return "completed";
        if (code == ProcedureStatus.ENTEREDINERROR)
            return "entered-in-error";
        return "?";
    }
}
