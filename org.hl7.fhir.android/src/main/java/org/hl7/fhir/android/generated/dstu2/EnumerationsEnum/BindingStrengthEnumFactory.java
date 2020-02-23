package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class BindingStrengthEnumFactory implements EnumFactory<BindingStrength> {

    public BindingStrength fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("required".equals(codeString))
            return BindingStrength.REQUIRED;
        if ("extensible".equals(codeString))
            return BindingStrength.EXTENSIBLE;
        if ("preferred".equals(codeString))
            return BindingStrength.PREFERRED;
        if ("example".equals(codeString))
            return BindingStrength.EXAMPLE;
        throw new IllegalArgumentException("Unknown BindingStrength code '" + codeString + "'");
    }

    public Enumeration<BindingStrength> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("required".equals(codeString))
            return new Enumeration<BindingStrength>(this, BindingStrength.REQUIRED);
        if ("extensible".equals(codeString))
            return new Enumeration<BindingStrength>(this, BindingStrength.EXTENSIBLE);
        if ("preferred".equals(codeString))
            return new Enumeration<BindingStrength>(this, BindingStrength.PREFERRED);
        if ("example".equals(codeString))
            return new Enumeration<BindingStrength>(this, BindingStrength.EXAMPLE);
        throw new FHIRException("Unknown BindingStrength code '" + codeString + "'");
    }

    public String toCode(BindingStrength code) {
        if (code == BindingStrength.REQUIRED)
            return "required";
        if (code == BindingStrength.EXTENSIBLE)
            return "extensible";
        if (code == BindingStrength.PREFERRED)
            return "preferred";
        if (code == BindingStrength.EXAMPLE)
            return "example";
        return "?";
    }
}
