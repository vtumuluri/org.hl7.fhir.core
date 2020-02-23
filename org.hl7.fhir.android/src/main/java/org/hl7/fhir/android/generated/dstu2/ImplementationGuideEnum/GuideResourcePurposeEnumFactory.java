package org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class GuideResourcePurposeEnumFactory implements EnumFactory<GuideResourcePurpose> {

    public GuideResourcePurpose fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("example".equals(codeString))
            return GuideResourcePurpose.EXAMPLE;
        if ("terminology".equals(codeString))
            return GuideResourcePurpose.TERMINOLOGY;
        if ("profile".equals(codeString))
            return GuideResourcePurpose.PROFILE;
        if ("extension".equals(codeString))
            return GuideResourcePurpose.EXTENSION;
        if ("dictionary".equals(codeString))
            return GuideResourcePurpose.DICTIONARY;
        if ("logical".equals(codeString))
            return GuideResourcePurpose.LOGICAL;
        throw new IllegalArgumentException("Unknown GuideResourcePurpose code '" + codeString + "'");
    }

    public Enumeration<GuideResourcePurpose> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("example".equals(codeString))
            return new Enumeration<GuideResourcePurpose>(this, GuideResourcePurpose.EXAMPLE);
        if ("terminology".equals(codeString))
            return new Enumeration<GuideResourcePurpose>(this, GuideResourcePurpose.TERMINOLOGY);
        if ("profile".equals(codeString))
            return new Enumeration<GuideResourcePurpose>(this, GuideResourcePurpose.PROFILE);
        if ("extension".equals(codeString))
            return new Enumeration<GuideResourcePurpose>(this, GuideResourcePurpose.EXTENSION);
        if ("dictionary".equals(codeString))
            return new Enumeration<GuideResourcePurpose>(this, GuideResourcePurpose.DICTIONARY);
        if ("logical".equals(codeString))
            return new Enumeration<GuideResourcePurpose>(this, GuideResourcePurpose.LOGICAL);
        throw new FHIRException("Unknown GuideResourcePurpose code '" + codeString + "'");
    }

    public String toCode(GuideResourcePurpose code) {
        if (code == GuideResourcePurpose.EXAMPLE)
            return "example";
        if (code == GuideResourcePurpose.TERMINOLOGY)
            return "terminology";
        if (code == GuideResourcePurpose.PROFILE)
            return "profile";
        if (code == GuideResourcePurpose.EXTENSION)
            return "extension";
        if (code == GuideResourcePurpose.DICTIONARY)
            return "dictionary";
        if (code == GuideResourcePurpose.LOGICAL)
            return "logical";
        return "?";
    }
}
