package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class UnknownContentCodeEnumFactory implements EnumFactory<UnknownContentCode> {

    public UnknownContentCode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("no".equals(codeString))
            return UnknownContentCode.NO;
        if ("extensions".equals(codeString))
            return UnknownContentCode.EXTENSIONS;
        if ("elements".equals(codeString))
            return UnknownContentCode.ELEMENTS;
        if ("both".equals(codeString))
            return UnknownContentCode.BOTH;
        throw new IllegalArgumentException("Unknown UnknownContentCode code '" + codeString + "'");
    }

    public Enumeration<UnknownContentCode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("no".equals(codeString))
            return new Enumeration<UnknownContentCode>(this, UnknownContentCode.NO);
        if ("extensions".equals(codeString))
            return new Enumeration<UnknownContentCode>(this, UnknownContentCode.EXTENSIONS);
        if ("elements".equals(codeString))
            return new Enumeration<UnknownContentCode>(this, UnknownContentCode.ELEMENTS);
        if ("both".equals(codeString))
            return new Enumeration<UnknownContentCode>(this, UnknownContentCode.BOTH);
        throw new FHIRException("Unknown UnknownContentCode code '" + codeString + "'");
    }

    public String toCode(UnknownContentCode code) {
        if (code == UnknownContentCode.NO)
            return "no";
        if (code == UnknownContentCode.EXTENSIONS)
            return "extensions";
        if (code == UnknownContentCode.ELEMENTS)
            return "elements";
        if (code == UnknownContentCode.BOTH)
            return "both";
        return "?";
    }
}
