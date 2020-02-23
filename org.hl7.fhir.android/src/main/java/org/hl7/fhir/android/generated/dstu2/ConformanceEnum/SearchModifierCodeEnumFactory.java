package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SearchModifierCodeEnumFactory implements EnumFactory<SearchModifierCode> {

    public SearchModifierCode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("missing".equals(codeString))
            return SearchModifierCode.MISSING;
        if ("exact".equals(codeString))
            return SearchModifierCode.EXACT;
        if ("contains".equals(codeString))
            return SearchModifierCode.CONTAINS;
        if ("not".equals(codeString))
            return SearchModifierCode.NOT;
        if ("text".equals(codeString))
            return SearchModifierCode.TEXT;
        if ("in".equals(codeString))
            return SearchModifierCode.IN;
        if ("not-in".equals(codeString))
            return SearchModifierCode.NOTIN;
        if ("below".equals(codeString))
            return SearchModifierCode.BELOW;
        if ("above".equals(codeString))
            return SearchModifierCode.ABOVE;
        if ("type".equals(codeString))
            return SearchModifierCode.TYPE;
        throw new IllegalArgumentException("Unknown SearchModifierCode code '" + codeString + "'");
    }

    public Enumeration<SearchModifierCode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("missing".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.MISSING);
        if ("exact".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.EXACT);
        if ("contains".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.CONTAINS);
        if ("not".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.NOT);
        if ("text".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.TEXT);
        if ("in".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.IN);
        if ("not-in".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.NOTIN);
        if ("below".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.BELOW);
        if ("above".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.ABOVE);
        if ("type".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.TYPE);
        throw new FHIRException("Unknown SearchModifierCode code '" + codeString + "'");
    }

    public String toCode(SearchModifierCode code) {
        if (code == SearchModifierCode.MISSING)
            return "missing";
        if (code == SearchModifierCode.EXACT)
            return "exact";
        if (code == SearchModifierCode.CONTAINS)
            return "contains";
        if (code == SearchModifierCode.NOT)
            return "not";
        if (code == SearchModifierCode.TEXT)
            return "text";
        if (code == SearchModifierCode.IN)
            return "in";
        if (code == SearchModifierCode.NOTIN)
            return "not-in";
        if (code == SearchModifierCode.BELOW)
            return "below";
        if (code == SearchModifierCode.ABOVE)
            return "above";
        if (code == SearchModifierCode.TYPE)
            return "type";
        return "?";
    }
}
