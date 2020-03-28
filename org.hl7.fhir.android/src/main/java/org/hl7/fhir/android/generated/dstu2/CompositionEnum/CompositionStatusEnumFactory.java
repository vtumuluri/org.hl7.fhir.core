package org.hl7.fhir.android.generated.dstu2.CompositionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class CompositionStatusEnumFactory implements EnumFactory<CompositionStatus> {

    public CompositionStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("preliminary".equals(codeString))
            return CompositionStatus.PRELIMINARY;
        if ("final".equals(codeString))
            return CompositionStatus.FINAL;
        if ("amended".equals(codeString))
            return CompositionStatus.AMENDED;
        if ("entered-in-error".equals(codeString))
            return CompositionStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown CompositionStatus code '" + codeString + "'");
    }

    public Enumeration<CompositionStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("preliminary".equals(codeString))
            return new Enumeration<CompositionStatus>(this, CompositionStatus.PRELIMINARY);
        if ("final".equals(codeString))
            return new Enumeration<CompositionStatus>(this, CompositionStatus.FINAL);
        if ("amended".equals(codeString))
            return new Enumeration<CompositionStatus>(this, CompositionStatus.AMENDED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<CompositionStatus>(this, CompositionStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown CompositionStatus code '" + codeString + "'");
    }

    public String toCode(CompositionStatus code) {
        if (code == CompositionStatus.PRELIMINARY)
            return "preliminary";
        if (code == CompositionStatus.FINAL)
            return "final";
        if (code == CompositionStatus.AMENDED)
            return "amended";
        if (code == CompositionStatus.ENTEREDINERROR)
            return "entered-in-error";
        return "?";
    }
}
