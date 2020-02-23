package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SearchParamTypeEnumFactory implements EnumFactory<SearchParamType> {

    public SearchParamType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("number".equals(codeString))
            return SearchParamType.NUMBER;
        if ("date".equals(codeString))
            return SearchParamType.DATE;
        if ("string".equals(codeString))
            return SearchParamType.STRING;
        if ("token".equals(codeString))
            return SearchParamType.TOKEN;
        if ("reference".equals(codeString))
            return SearchParamType.REFERENCE;
        if ("composite".equals(codeString))
            return SearchParamType.COMPOSITE;
        if ("quantity".equals(codeString))
            return SearchParamType.QUANTITY;
        if ("uri".equals(codeString))
            return SearchParamType.URI;
        throw new IllegalArgumentException("Unknown SearchParamType code '" + codeString + "'");
    }

    public Enumeration<SearchParamType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("number".equals(codeString))
            return new Enumeration<SearchParamType>(this, SearchParamType.NUMBER);
        if ("date".equals(codeString))
            return new Enumeration<SearchParamType>(this, SearchParamType.DATE);
        if ("string".equals(codeString))
            return new Enumeration<SearchParamType>(this, SearchParamType.STRING);
        if ("token".equals(codeString))
            return new Enumeration<SearchParamType>(this, SearchParamType.TOKEN);
        if ("reference".equals(codeString))
            return new Enumeration<SearchParamType>(this, SearchParamType.REFERENCE);
        if ("composite".equals(codeString))
            return new Enumeration<SearchParamType>(this, SearchParamType.COMPOSITE);
        if ("quantity".equals(codeString))
            return new Enumeration<SearchParamType>(this, SearchParamType.QUANTITY);
        if ("uri".equals(codeString))
            return new Enumeration<SearchParamType>(this, SearchParamType.URI);
        throw new FHIRException("Unknown SearchParamType code '" + codeString + "'");
    }

    public String toCode(SearchParamType code) {
        if (code == SearchParamType.NUMBER)
            return "number";
        if (code == SearchParamType.DATE)
            return "date";
        if (code == SearchParamType.STRING)
            return "string";
        if (code == SearchParamType.TOKEN)
            return "token";
        if (code == SearchParamType.REFERENCE)
            return "reference";
        if (code == SearchParamType.COMPOSITE)
            return "composite";
        if (code == SearchParamType.QUANTITY)
            return "quantity";
        if (code == SearchParamType.URI)
            return "uri";
        return "?";
    }
}
