package org.hl7.fhir.android.generated.dstu2.PatientEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class LinkTypeEnumFactory implements EnumFactory<LinkType> {

    public LinkType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("replace".equals(codeString))
            return LinkType.REPLACE;
        if ("refer".equals(codeString))
            return LinkType.REFER;
        if ("seealso".equals(codeString))
            return LinkType.SEEALSO;
        throw new IllegalArgumentException("Unknown LinkType code '" + codeString + "'");
    }

    public Enumeration<LinkType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("replace".equals(codeString))
            return new Enumeration<LinkType>(this, LinkType.REPLACE);
        if ("refer".equals(codeString))
            return new Enumeration<LinkType>(this, LinkType.REFER);
        if ("seealso".equals(codeString))
            return new Enumeration<LinkType>(this, LinkType.SEEALSO);
        throw new FHIRException("Unknown LinkType code '" + codeString + "'");
    }

    public String toCode(LinkType code) {
        if (code == LinkType.REPLACE)
            return "replace";
        if (code == LinkType.REFER)
            return "refer";
        if (code == LinkType.SEEALSO)
            return "seealso";
        return "?";
    }
}
