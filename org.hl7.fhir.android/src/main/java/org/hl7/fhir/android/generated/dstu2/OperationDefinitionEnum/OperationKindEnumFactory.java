package org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class OperationKindEnumFactory implements EnumFactory<OperationKind> {

    public OperationKind fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("operation".equals(codeString))
            return OperationKind.OPERATION;
        if ("query".equals(codeString))
            return OperationKind.QUERY;
        throw new IllegalArgumentException("Unknown OperationKind code '" + codeString + "'");
    }

    public Enumeration<OperationKind> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("operation".equals(codeString))
            return new Enumeration<OperationKind>(this, OperationKind.OPERATION);
        if ("query".equals(codeString))
            return new Enumeration<OperationKind>(this, OperationKind.QUERY);
        throw new FHIRException("Unknown OperationKind code '" + codeString + "'");
    }

    public String toCode(OperationKind code) {
        if (code == OperationKind.OPERATION)
            return "operation";
        if (code == OperationKind.QUERY)
            return "query";
        return "?";
    }
}
