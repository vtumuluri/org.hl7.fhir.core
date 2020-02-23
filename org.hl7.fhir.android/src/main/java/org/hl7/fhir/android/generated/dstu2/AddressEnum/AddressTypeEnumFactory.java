package org.hl7.fhir.android.generated.dstu2.AddressEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AddressTypeEnumFactory implements EnumFactory<AddressType> {

    public AddressType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("postal".equals(codeString))
            return AddressType.POSTAL;
        if ("physical".equals(codeString))
            return AddressType.PHYSICAL;
        if ("both".equals(codeString))
            return AddressType.BOTH;
        throw new IllegalArgumentException("Unknown AddressType code '" + codeString + "'");
    }

    public Enumeration<AddressType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("postal".equals(codeString))
            return new Enumeration<AddressType>(this, AddressType.POSTAL);
        if ("physical".equals(codeString))
            return new Enumeration<AddressType>(this, AddressType.PHYSICAL);
        if ("both".equals(codeString))
            return new Enumeration<AddressType>(this, AddressType.BOTH);
        throw new FHIRException("Unknown AddressType code '" + codeString + "'");
    }

    public String toCode(AddressType code) {
        if (code == AddressType.POSTAL)
            return "postal";
        if (code == AddressType.PHYSICAL)
            return "physical";
        if (code == AddressType.BOTH)
            return "both";
        return "?";
    }
}
