package org.hl7.fhir.android.generated.dstu2.SearchParameterEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class XPathUsageTypeEnumFactory implements EnumFactory<XPathUsageType> {

    public XPathUsageType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("normal".equals(codeString))
            return XPathUsageType.NORMAL;
        if ("phonetic".equals(codeString))
            return XPathUsageType.PHONETIC;
        if ("nearby".equals(codeString))
            return XPathUsageType.NEARBY;
        if ("distance".equals(codeString))
            return XPathUsageType.DISTANCE;
        if ("other".equals(codeString))
            return XPathUsageType.OTHER;
        throw new IllegalArgumentException("Unknown XPathUsageType code '" + codeString + "'");
    }

    public Enumeration<XPathUsageType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("normal".equals(codeString))
            return new Enumeration<XPathUsageType>(this, XPathUsageType.NORMAL);
        if ("phonetic".equals(codeString))
            return new Enumeration<XPathUsageType>(this, XPathUsageType.PHONETIC);
        if ("nearby".equals(codeString))
            return new Enumeration<XPathUsageType>(this, XPathUsageType.NEARBY);
        if ("distance".equals(codeString))
            return new Enumeration<XPathUsageType>(this, XPathUsageType.DISTANCE);
        if ("other".equals(codeString))
            return new Enumeration<XPathUsageType>(this, XPathUsageType.OTHER);
        throw new FHIRException("Unknown XPathUsageType code '" + codeString + "'");
    }

    public String toCode(XPathUsageType code) {
        if (code == XPathUsageType.NORMAL)
            return "normal";
        if (code == XPathUsageType.PHONETIC)
            return "phonetic";
        if (code == XPathUsageType.NEARBY)
            return "nearby";
        if (code == XPathUsageType.DISTANCE)
            return "distance";
        if (code == XPathUsageType.OTHER)
            return "other";
        return "?";
    }
}
