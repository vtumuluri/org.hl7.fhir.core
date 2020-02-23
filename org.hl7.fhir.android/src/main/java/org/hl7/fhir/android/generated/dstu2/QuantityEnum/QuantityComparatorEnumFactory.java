package org.hl7.fhir.android.generated.dstu2.QuantityEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class QuantityComparatorEnumFactory implements EnumFactory<QuantityComparator> {

    public QuantityComparator fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("<".equals(codeString))
            return QuantityComparator.LESS_THAN;
        if ("<=".equals(codeString))
            return QuantityComparator.LESS_OR_EQUAL;
        if (">=".equals(codeString))
            return QuantityComparator.GREATER_OR_EQUAL;
        if (">".equals(codeString))
            return QuantityComparator.GREATER_THAN;
        throw new IllegalArgumentException("Unknown QuantityComparator code '" + codeString + "'");
    }

    public Enumeration<QuantityComparator> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("<".equals(codeString))
            return new Enumeration<QuantityComparator>(this, QuantityComparator.LESS_THAN);
        if ("<=".equals(codeString))
            return new Enumeration<QuantityComparator>(this, QuantityComparator.LESS_OR_EQUAL);
        if (">=".equals(codeString))
            return new Enumeration<QuantityComparator>(this, QuantityComparator.GREATER_OR_EQUAL);
        if (">".equals(codeString))
            return new Enumeration<QuantityComparator>(this, QuantityComparator.GREATER_THAN);
        throw new FHIRException("Unknown QuantityComparator code '" + codeString + "'");
    }

    public String toCode(QuantityComparator code) {
        if (code == QuantityComparator.LESS_THAN)
            return "<";
        if (code == QuantityComparator.LESS_OR_EQUAL)
            return "<=";
        if (code == QuantityComparator.GREATER_OR_EQUAL)
            return ">=";
        if (code == QuantityComparator.GREATER_THAN)
            return ">";
        return "?";
    }
}
