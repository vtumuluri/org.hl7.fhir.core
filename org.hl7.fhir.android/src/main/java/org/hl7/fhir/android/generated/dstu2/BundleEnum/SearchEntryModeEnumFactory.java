package org.hl7.fhir.android.generated.dstu2.BundleEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SearchEntryModeEnumFactory implements EnumFactory<SearchEntryMode> {

    public SearchEntryMode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("match".equals(codeString))
            return SearchEntryMode.MATCH;
        if ("include".equals(codeString))
            return SearchEntryMode.INCLUDE;
        if ("outcome".equals(codeString))
            return SearchEntryMode.OUTCOME;
        throw new IllegalArgumentException("Unknown SearchEntryMode code '" + codeString + "'");
    }

    public Enumeration<SearchEntryMode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("match".equals(codeString))
            return new Enumeration<SearchEntryMode>(this, SearchEntryMode.MATCH);
        if ("include".equals(codeString))
            return new Enumeration<SearchEntryMode>(this, SearchEntryMode.INCLUDE);
        if ("outcome".equals(codeString))
            return new Enumeration<SearchEntryMode>(this, SearchEntryMode.OUTCOME);
        throw new FHIRException("Unknown SearchEntryMode code '" + codeString + "'");
    }

    public String toCode(SearchEntryMode code) {
        if (code == SearchEntryMode.MATCH)
            return "match";
        if (code == SearchEntryMode.INCLUDE)
            return "include";
        if (code == SearchEntryMode.OUTCOME)
            return "outcome";
        return "?";
    }
}
