package org.hl7.fhir.android.generated.dstu2.AddressEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AddressUseEnumFactory implements EnumFactory<AddressUse> {

    public AddressUse fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("home".equals(codeString))
            return AddressUse.HOME;
        if ("work".equals(codeString))
            return AddressUse.WORK;
        if ("temp".equals(codeString))
            return AddressUse.TEMP;
        if ("old".equals(codeString))
            return AddressUse.OLD;
        throw new IllegalArgumentException("Unknown AddressUse code '" + codeString + "'");
    }

    public Enumeration<AddressUse> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("home".equals(codeString))
            return new Enumeration<AddressUse>(this, AddressUse.HOME);
        if ("work".equals(codeString))
            return new Enumeration<AddressUse>(this, AddressUse.WORK);
        if ("temp".equals(codeString))
            return new Enumeration<AddressUse>(this, AddressUse.TEMP);
        if ("old".equals(codeString))
            return new Enumeration<AddressUse>(this, AddressUse.OLD);
        throw new FHIRException("Unknown AddressUse code '" + codeString + "'");
    }

    public String toCode(AddressUse code) {
        if (code == AddressUse.HOME)
            return "home";
        if (code == AddressUse.WORK)
            return "work";
        if (code == AddressUse.TEMP)
            return "temp";
        if (code == AddressUse.OLD)
            return "old";
        return "?";
    }
}
