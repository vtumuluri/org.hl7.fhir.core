package org.hl7.fhir.android.generated.dstu2.NamingSystemEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class NamingSystemIdentifierTypeEnumFactory implements EnumFactory<NamingSystemIdentifierType> {

    public NamingSystemIdentifierType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("oid".equals(codeString))
            return NamingSystemIdentifierType.OID;
        if ("uuid".equals(codeString))
            return NamingSystemIdentifierType.UUID;
        if ("uri".equals(codeString))
            return NamingSystemIdentifierType.URI;
        if ("other".equals(codeString))
            return NamingSystemIdentifierType.OTHER;
        throw new IllegalArgumentException("Unknown NamingSystemIdentifierType code '" + codeString + "'");
    }

    public Enumeration<NamingSystemIdentifierType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("oid".equals(codeString))
            return new Enumeration<NamingSystemIdentifierType>(this, NamingSystemIdentifierType.OID);
        if ("uuid".equals(codeString))
            return new Enumeration<NamingSystemIdentifierType>(this, NamingSystemIdentifierType.UUID);
        if ("uri".equals(codeString))
            return new Enumeration<NamingSystemIdentifierType>(this, NamingSystemIdentifierType.URI);
        if ("other".equals(codeString))
            return new Enumeration<NamingSystemIdentifierType>(this, NamingSystemIdentifierType.OTHER);
        throw new FHIRException("Unknown NamingSystemIdentifierType code '" + codeString + "'");
    }

    public String toCode(NamingSystemIdentifierType code) {
        if (code == NamingSystemIdentifierType.OID)
            return "oid";
        if (code == NamingSystemIdentifierType.UUID)
            return "uuid";
        if (code == NamingSystemIdentifierType.URI)
            return "uri";
        if (code == NamingSystemIdentifierType.OTHER)
            return "other";
        return "?";
    }
}
