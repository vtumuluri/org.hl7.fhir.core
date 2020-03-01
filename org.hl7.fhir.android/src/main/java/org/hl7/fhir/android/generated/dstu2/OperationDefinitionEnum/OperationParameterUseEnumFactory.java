package org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class OperationParameterUseEnumFactory implements EnumFactory<OperationParameterUse> {

    public OperationParameterUse fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in".equals(codeString))
            return OperationParameterUse.IN;
        if ("out".equals(codeString))
            return OperationParameterUse.OUT;
        throw new IllegalArgumentException("Unknown OperationParameterUse code '" + codeString + "'");
    }

    public Enumeration<OperationParameterUse> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in".equals(codeString))
            return new Enumeration<OperationParameterUse>(this, OperationParameterUse.IN);
        if ("out".equals(codeString))
            return new Enumeration<OperationParameterUse>(this, OperationParameterUse.OUT);
        throw new FHIRException("Unknown OperationParameterUse code '" + codeString + "'");
    }

    public String toCode(OperationParameterUse code) {
        if (code == OperationParameterUse.IN)
            return "in";
        if (code == OperationParameterUse.OUT)
            return "out";
        return "?";
    }
}
