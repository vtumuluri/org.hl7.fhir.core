package org.hl7.fhir.android.generated.dstu2.TestScriptEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ContentTypeEnumFactory implements EnumFactory<ContentType> {

    public ContentType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("xml".equals(codeString))
            return ContentType.XML;
        if ("json".equals(codeString))
            return ContentType.JSON;
        throw new IllegalArgumentException("Unknown ContentType code '" + codeString + "'");
    }

    public Enumeration<ContentType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("xml".equals(codeString))
            return new Enumeration<ContentType>(this, ContentType.XML);
        if ("json".equals(codeString))
            return new Enumeration<ContentType>(this, ContentType.JSON);
        throw new FHIRException("Unknown ContentType code '" + codeString + "'");
    }

    public String toCode(ContentType code) {
        if (code == ContentType.XML)
            return "xml";
        if (code == ContentType.JSON)
            return "json";
        return "?";
    }
}
