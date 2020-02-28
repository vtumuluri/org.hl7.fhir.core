package org.hl7.fhir.android.generated.dstu2.NamingSystemEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class NamingSystemTypeEnumFactory implements EnumFactory<NamingSystemType> {

    public NamingSystemType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("codesystem".equals(codeString))
            return NamingSystemType.CODESYSTEM;
        if ("identifier".equals(codeString))
            return NamingSystemType.IDENTIFIER;
        if ("root".equals(codeString))
            return NamingSystemType.ROOT;
        throw new IllegalArgumentException("Unknown NamingSystemType code '" + codeString + "'");
    }

    public Enumeration<NamingSystemType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("codesystem".equals(codeString))
            return new Enumeration<NamingSystemType>(this, NamingSystemType.CODESYSTEM);
        if ("identifier".equals(codeString))
            return new Enumeration<NamingSystemType>(this, NamingSystemType.IDENTIFIER);
        if ("root".equals(codeString))
            return new Enumeration<NamingSystemType>(this, NamingSystemType.ROOT);
        throw new FHIRException("Unknown NamingSystemType code '" + codeString + "'");
    }

    public String toCode(NamingSystemType code) {
        if (code == NamingSystemType.CODESYSTEM)
            return "codesystem";
        if (code == NamingSystemType.IDENTIFIER)
            return "identifier";
        if (code == NamingSystemType.ROOT)
            return "root";
        return "?";
    }
}
