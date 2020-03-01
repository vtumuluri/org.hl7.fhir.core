package org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class GuidePageKindEnumFactory implements EnumFactory<GuidePageKind> {

    public GuidePageKind fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("page".equals(codeString))
            return GuidePageKind.PAGE;
        if ("example".equals(codeString))
            return GuidePageKind.EXAMPLE;
        if ("list".equals(codeString))
            return GuidePageKind.LIST;
        if ("include".equals(codeString))
            return GuidePageKind.INCLUDE;
        if ("directory".equals(codeString))
            return GuidePageKind.DIRECTORY;
        if ("dictionary".equals(codeString))
            return GuidePageKind.DICTIONARY;
        if ("toc".equals(codeString))
            return GuidePageKind.TOC;
        if ("resource".equals(codeString))
            return GuidePageKind.RESOURCE;
        throw new IllegalArgumentException("Unknown GuidePageKind code '" + codeString + "'");
    }

    public Enumeration<GuidePageKind> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("page".equals(codeString))
            return new Enumeration<GuidePageKind>(this, GuidePageKind.PAGE);
        if ("example".equals(codeString))
            return new Enumeration<GuidePageKind>(this, GuidePageKind.EXAMPLE);
        if ("list".equals(codeString))
            return new Enumeration<GuidePageKind>(this, GuidePageKind.LIST);
        if ("include".equals(codeString))
            return new Enumeration<GuidePageKind>(this, GuidePageKind.INCLUDE);
        if ("directory".equals(codeString))
            return new Enumeration<GuidePageKind>(this, GuidePageKind.DIRECTORY);
        if ("dictionary".equals(codeString))
            return new Enumeration<GuidePageKind>(this, GuidePageKind.DICTIONARY);
        if ("toc".equals(codeString))
            return new Enumeration<GuidePageKind>(this, GuidePageKind.TOC);
        if ("resource".equals(codeString))
            return new Enumeration<GuidePageKind>(this, GuidePageKind.RESOURCE);
        throw new FHIRException("Unknown GuidePageKind code '" + codeString + "'");
    }

    public String toCode(GuidePageKind code) {
        if (code == GuidePageKind.PAGE)
            return "page";
        if (code == GuidePageKind.EXAMPLE)
            return "example";
        if (code == GuidePageKind.LIST)
            return "list";
        if (code == GuidePageKind.INCLUDE)
            return "include";
        if (code == GuidePageKind.DIRECTORY)
            return "directory";
        if (code == GuidePageKind.DICTIONARY)
            return "dictionary";
        if (code == GuidePageKind.TOC)
            return "toc";
        if (code == GuidePageKind.RESOURCE)
            return "resource";
        return "?";
    }
}
