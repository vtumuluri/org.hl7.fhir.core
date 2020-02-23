package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ConditionalDeleteStatusEnumFactory implements EnumFactory<ConditionalDeleteStatus> {

    public ConditionalDeleteStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-supported".equals(codeString))
            return ConditionalDeleteStatus.NOTSUPPORTED;
        if ("single".equals(codeString))
            return ConditionalDeleteStatus.SINGLE;
        if ("multiple".equals(codeString))
            return ConditionalDeleteStatus.MULTIPLE;
        throw new IllegalArgumentException("Unknown ConditionalDeleteStatus code '" + codeString + "'");
    }

    public Enumeration<ConditionalDeleteStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("not-supported".equals(codeString))
            return new Enumeration<ConditionalDeleteStatus>(this, ConditionalDeleteStatus.NOTSUPPORTED);
        if ("single".equals(codeString))
            return new Enumeration<ConditionalDeleteStatus>(this, ConditionalDeleteStatus.SINGLE);
        if ("multiple".equals(codeString))
            return new Enumeration<ConditionalDeleteStatus>(this, ConditionalDeleteStatus.MULTIPLE);
        throw new FHIRException("Unknown ConditionalDeleteStatus code '" + codeString + "'");
    }

    public String toCode(ConditionalDeleteStatus code) {
        if (code == ConditionalDeleteStatus.NOTSUPPORTED)
            return "not-supported";
        if (code == ConditionalDeleteStatus.SINGLE)
            return "single";
        if (code == ConditionalDeleteStatus.MULTIPLE)
            return "multiple";
        return "?";
    }
}
