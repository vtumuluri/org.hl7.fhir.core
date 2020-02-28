package org.hl7.fhir.android.generated.dstu2.SpecimenEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SpecimenStatusEnumFactory implements EnumFactory<SpecimenStatus> {

    public SpecimenStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("available".equals(codeString))
            return SpecimenStatus.AVAILABLE;
        if ("unavailable".equals(codeString))
            return SpecimenStatus.UNAVAILABLE;
        if ("unsatisfactory".equals(codeString))
            return SpecimenStatus.UNSATISFACTORY;
        if ("entered-in-error".equals(codeString))
            return SpecimenStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown SpecimenStatus code '" + codeString + "'");
    }

    public Enumeration<SpecimenStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("available".equals(codeString))
            return new Enumeration<SpecimenStatus>(this, SpecimenStatus.AVAILABLE);
        if ("unavailable".equals(codeString))
            return new Enumeration<SpecimenStatus>(this, SpecimenStatus.UNAVAILABLE);
        if ("unsatisfactory".equals(codeString))
            return new Enumeration<SpecimenStatus>(this, SpecimenStatus.UNSATISFACTORY);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<SpecimenStatus>(this, SpecimenStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown SpecimenStatus code '" + codeString + "'");
    }

    public String toCode(SpecimenStatus code) {
        if (code == SpecimenStatus.AVAILABLE)
            return "available";
        if (code == SpecimenStatus.UNAVAILABLE)
            return "unavailable";
        if (code == SpecimenStatus.UNSATISFACTORY)
            return "unsatisfactory";
        if (code == SpecimenStatus.ENTEREDINERROR)
            return "entered-in-error";
        return "?";
    }
}
