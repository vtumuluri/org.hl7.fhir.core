package org.hl7.fhir.android.generated.dstu2.ValueSetEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class FilterOperatorEnumFactory implements EnumFactory<FilterOperator> {

    public FilterOperator fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("=".equals(codeString))
            return FilterOperator.EQUAL;
        if ("is-a".equals(codeString))
            return FilterOperator.ISA;
        if ("is-not-a".equals(codeString))
            return FilterOperator.ISNOTA;
        if ("regex".equals(codeString))
            return FilterOperator.REGEX;
        if ("in".equals(codeString))
            return FilterOperator.IN;
        if ("not-in".equals(codeString))
            return FilterOperator.NOTIN;
        throw new IllegalArgumentException("Unknown FilterOperator code '" + codeString + "'");
    }

    public Enumeration<FilterOperator> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("=".equals(codeString))
            return new Enumeration<FilterOperator>(this, FilterOperator.EQUAL);
        if ("is-a".equals(codeString))
            return new Enumeration<FilterOperator>(this, FilterOperator.ISA);
        if ("is-not-a".equals(codeString))
            return new Enumeration<FilterOperator>(this, FilterOperator.ISNOTA);
        if ("regex".equals(codeString))
            return new Enumeration<FilterOperator>(this, FilterOperator.REGEX);
        if ("in".equals(codeString))
            return new Enumeration<FilterOperator>(this, FilterOperator.IN);
        if ("not-in".equals(codeString))
            return new Enumeration<FilterOperator>(this, FilterOperator.NOTIN);
        throw new FHIRException("Unknown FilterOperator code '" + codeString + "'");
    }

    public String toCode(FilterOperator code) {
        if (code == FilterOperator.EQUAL)
            return "=";
        if (code == FilterOperator.ISA)
            return "is-a";
        if (code == FilterOperator.ISNOTA)
            return "is-not-a";
        if (code == FilterOperator.REGEX)
            return "regex";
        if (code == FilterOperator.IN)
            return "in";
        if (code == FilterOperator.NOTIN)
            return "not-in";
        return "?";
    }
}
