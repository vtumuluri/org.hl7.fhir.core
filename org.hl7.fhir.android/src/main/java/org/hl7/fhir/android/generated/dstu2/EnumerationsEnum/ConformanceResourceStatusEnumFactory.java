package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ConformanceResourceStatusEnumFactory implements EnumFactory<ConformanceResourceStatus> {

    public ConformanceResourceStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
            return ConformanceResourceStatus.DRAFT;
        if ("active".equals(codeString))
            return ConformanceResourceStatus.ACTIVE;
        if ("retired".equals(codeString))
            return ConformanceResourceStatus.RETIRED;
        throw new IllegalArgumentException("Unknown ConformanceResourceStatus code '" + codeString + "'");
    }

    public Enumeration<ConformanceResourceStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("draft".equals(codeString))
            return new Enumeration<ConformanceResourceStatus>(this, ConformanceResourceStatus.DRAFT);
        if ("active".equals(codeString))
            return new Enumeration<ConformanceResourceStatus>(this, ConformanceResourceStatus.ACTIVE);
        if ("retired".equals(codeString))
            return new Enumeration<ConformanceResourceStatus>(this, ConformanceResourceStatus.RETIRED);
        throw new FHIRException("Unknown ConformanceResourceStatus code '" + codeString + "'");
    }

    public String toCode(ConformanceResourceStatus code) {
        if (code == ConformanceResourceStatus.DRAFT)
            return "draft";
        if (code == ConformanceResourceStatus.ACTIVE)
            return "active";
        if (code == ConformanceResourceStatus.RETIRED)
            return "retired";
        return "?";
    }
}
