package org.hl7.fhir.android.generated.dstu2.HumanNameEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class NameUseEnumFactory implements EnumFactory<NameUse> {

    public NameUse fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("usual".equals(codeString))
            return NameUse.USUAL;
        if ("official".equals(codeString))
            return NameUse.OFFICIAL;
        if ("temp".equals(codeString))
            return NameUse.TEMP;
        if ("nickname".equals(codeString))
            return NameUse.NICKNAME;
        if ("anonymous".equals(codeString))
            return NameUse.ANONYMOUS;
        if ("old".equals(codeString))
            return NameUse.OLD;
        if ("maiden".equals(codeString))
            return NameUse.MAIDEN;
        throw new IllegalArgumentException("Unknown NameUse code '" + codeString + "'");
    }

    public Enumeration<NameUse> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("usual".equals(codeString))
            return new Enumeration<NameUse>(this, NameUse.USUAL);
        if ("official".equals(codeString))
            return new Enumeration<NameUse>(this, NameUse.OFFICIAL);
        if ("temp".equals(codeString))
            return new Enumeration<NameUse>(this, NameUse.TEMP);
        if ("nickname".equals(codeString))
            return new Enumeration<NameUse>(this, NameUse.NICKNAME);
        if ("anonymous".equals(codeString))
            return new Enumeration<NameUse>(this, NameUse.ANONYMOUS);
        if ("old".equals(codeString))
            return new Enumeration<NameUse>(this, NameUse.OLD);
        if ("maiden".equals(codeString))
            return new Enumeration<NameUse>(this, NameUse.MAIDEN);
        throw new FHIRException("Unknown NameUse code '" + codeString + "'");
    }

    public String toCode(NameUse code) {
        if (code == NameUse.USUAL)
            return "usual";
        if (code == NameUse.OFFICIAL)
            return "official";
        if (code == NameUse.TEMP)
            return "temp";
        if (code == NameUse.NICKNAME)
            return "nickname";
        if (code == NameUse.ANONYMOUS)
            return "anonymous";
        if (code == NameUse.OLD)
            return "old";
        if (code == NameUse.MAIDEN)
            return "maiden";
        return "?";
    }
}
