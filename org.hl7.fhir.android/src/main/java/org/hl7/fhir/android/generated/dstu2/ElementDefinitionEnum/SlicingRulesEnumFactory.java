package org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SlicingRulesEnumFactory implements EnumFactory<SlicingRules> {

    public SlicingRules fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("closed".equals(codeString))
            return SlicingRules.CLOSED;
        if ("open".equals(codeString))
            return SlicingRules.OPEN;
        if ("openAtEnd".equals(codeString))
            return SlicingRules.OPENATEND;
        throw new IllegalArgumentException("Unknown SlicingRules code '" + codeString + "'");
    }

    public Enumeration<SlicingRules> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("closed".equals(codeString))
            return new Enumeration<SlicingRules>(this, SlicingRules.CLOSED);
        if ("open".equals(codeString))
            return new Enumeration<SlicingRules>(this, SlicingRules.OPEN);
        if ("openAtEnd".equals(codeString))
            return new Enumeration<SlicingRules>(this, SlicingRules.OPENATEND);
        throw new FHIRException("Unknown SlicingRules code '" + codeString + "'");
    }

    public String toCode(SlicingRules code) {
        if (code == SlicingRules.CLOSED)
            return "closed";
        if (code == SlicingRules.OPEN)
            return "open";
        if (code == SlicingRules.OPENATEND)
            return "openAtEnd";
        return "?";
    }
}
