package org.hl7.fhir.android.generated.dstu2.FlagEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class FlagStatusEnumFactory implements EnumFactory<FlagStatus> {

    public FlagStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
            return FlagStatus.ACTIVE;
        if ("inactive".equals(codeString))
            return FlagStatus.INACTIVE;
        if ("entered-in-error".equals(codeString))
            return FlagStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown FlagStatus code '" + codeString + "'");
    }

    public Enumeration<FlagStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return new Enumeration<FlagStatus>(this, FlagStatus.ACTIVE);
        if ("inactive".equals(codeString))
            return new Enumeration<FlagStatus>(this, FlagStatus.INACTIVE);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<FlagStatus>(this, FlagStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown FlagStatus code '" + codeString + "'");
    }

    public String toCode(FlagStatus code) {
        if (code == FlagStatus.ACTIVE)
            return "active";
        if (code == FlagStatus.INACTIVE)
            return "inactive";
        if (code == FlagStatus.ENTEREDINERROR)
            return "entered-in-error";
        return "?";
    }
}
