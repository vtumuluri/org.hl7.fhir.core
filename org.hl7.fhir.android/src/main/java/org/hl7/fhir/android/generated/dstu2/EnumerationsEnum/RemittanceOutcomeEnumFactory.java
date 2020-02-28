package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class RemittanceOutcomeEnumFactory implements EnumFactory<RemittanceOutcome> {

    public RemittanceOutcome fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
            return RemittanceOutcome.COMPLETE;
        if ("error".equals(codeString))
            return RemittanceOutcome.ERROR;
        throw new IllegalArgumentException("Unknown RemittanceOutcome code '" + codeString + "'");
    }

    public Enumeration<RemittanceOutcome> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("complete".equals(codeString))
            return new Enumeration<RemittanceOutcome>(this, RemittanceOutcome.COMPLETE);
        if ("error".equals(codeString))
            return new Enumeration<RemittanceOutcome>(this, RemittanceOutcome.ERROR);
        throw new FHIRException("Unknown RemittanceOutcome code '" + codeString + "'");
    }

    public String toCode(RemittanceOutcome code) {
        if (code == RemittanceOutcome.COMPLETE)
            return "complete";
        if (code == RemittanceOutcome.ERROR)
            return "error";
        return "?";
    }
}
