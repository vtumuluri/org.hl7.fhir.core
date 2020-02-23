package org.hl7.fhir.android.generated.dstu2.IdentifierEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class IdentifierUseEnumFactory implements EnumFactory<IdentifierUse> {

    public IdentifierUse fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("usual".equals(codeString))
            return IdentifierUse.USUAL;
        if ("official".equals(codeString))
            return IdentifierUse.OFFICIAL;
        if ("temp".equals(codeString))
            return IdentifierUse.TEMP;
        if ("secondary".equals(codeString))
            return IdentifierUse.SECONDARY;
        throw new IllegalArgumentException("Unknown IdentifierUse code '" + codeString + "'");
    }

    public Enumeration<IdentifierUse> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("usual".equals(codeString))
            return new Enumeration<IdentifierUse>(this, IdentifierUse.USUAL);
        if ("official".equals(codeString))
            return new Enumeration<IdentifierUse>(this, IdentifierUse.OFFICIAL);
        if ("temp".equals(codeString))
            return new Enumeration<IdentifierUse>(this, IdentifierUse.TEMP);
        if ("secondary".equals(codeString))
            return new Enumeration<IdentifierUse>(this, IdentifierUse.SECONDARY);
        throw new FHIRException("Unknown IdentifierUse code '" + codeString + "'");
    }

    public String toCode(IdentifierUse code) {
        if (code == IdentifierUse.USUAL)
            return "usual";
        if (code == IdentifierUse.OFFICIAL)
            return "official";
        if (code == IdentifierUse.TEMP)
            return "temp";
        if (code == IdentifierUse.SECONDARY)
            return "secondary";
        return "?";
    }
}
