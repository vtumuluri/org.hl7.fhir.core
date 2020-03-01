package org.hl7.fhir.android.generated.dstu2.CompositionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class CompositionAttestationModeEnumFactory implements EnumFactory<CompositionAttestationMode> {

    public CompositionAttestationMode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("personal".equals(codeString))
            return CompositionAttestationMode.PERSONAL;
        if ("professional".equals(codeString))
            return CompositionAttestationMode.PROFESSIONAL;
        if ("legal".equals(codeString))
            return CompositionAttestationMode.LEGAL;
        if ("official".equals(codeString))
            return CompositionAttestationMode.OFFICIAL;
        throw new IllegalArgumentException("Unknown CompositionAttestationMode code '" + codeString + "'");
    }

    public Enumeration<CompositionAttestationMode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("personal".equals(codeString))
            return new Enumeration<CompositionAttestationMode>(this, CompositionAttestationMode.PERSONAL);
        if ("professional".equals(codeString))
            return new Enumeration<CompositionAttestationMode>(this, CompositionAttestationMode.PROFESSIONAL);
        if ("legal".equals(codeString))
            return new Enumeration<CompositionAttestationMode>(this, CompositionAttestationMode.LEGAL);
        if ("official".equals(codeString))
            return new Enumeration<CompositionAttestationMode>(this, CompositionAttestationMode.OFFICIAL);
        throw new FHIRException("Unknown CompositionAttestationMode code '" + codeString + "'");
    }

    public String toCode(CompositionAttestationMode code) {
        if (code == CompositionAttestationMode.PERSONAL)
            return "personal";
        if (code == CompositionAttestationMode.PROFESSIONAL)
            return "professional";
        if (code == CompositionAttestationMode.LEGAL)
            return "legal";
        if (code == CompositionAttestationMode.OFFICIAL)
            return "official";
        return "?";
    }
}
