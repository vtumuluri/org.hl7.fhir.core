package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ConformanceStatementKindEnumFactory implements EnumFactory<ConformanceStatementKind> {

    public ConformanceStatementKind fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("instance".equals(codeString))
            return ConformanceStatementKind.INSTANCE;
        if ("capability".equals(codeString))
            return ConformanceStatementKind.CAPABILITY;
        if ("requirements".equals(codeString))
            return ConformanceStatementKind.REQUIREMENTS;
        throw new IllegalArgumentException("Unknown ConformanceStatementKind code '" + codeString + "'");
    }

    public Enumeration<ConformanceStatementKind> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("instance".equals(codeString))
            return new Enumeration<ConformanceStatementKind>(this, ConformanceStatementKind.INSTANCE);
        if ("capability".equals(codeString))
            return new Enumeration<ConformanceStatementKind>(this, ConformanceStatementKind.CAPABILITY);
        if ("requirements".equals(codeString))
            return new Enumeration<ConformanceStatementKind>(this, ConformanceStatementKind.REQUIREMENTS);
        throw new FHIRException("Unknown ConformanceStatementKind code '" + codeString + "'");
    }

    public String toCode(ConformanceStatementKind code) {
        if (code == ConformanceStatementKind.INSTANCE)
            return "instance";
        if (code == ConformanceStatementKind.CAPABILITY)
            return "capability";
        if (code == ConformanceStatementKind.REQUIREMENTS)
            return "requirements";
        return "?";
    }
}
