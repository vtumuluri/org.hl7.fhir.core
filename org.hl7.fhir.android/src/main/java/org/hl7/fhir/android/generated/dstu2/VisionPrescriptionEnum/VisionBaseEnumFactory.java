package org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class VisionBaseEnumFactory implements EnumFactory<VisionBase> {

    public VisionBase fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("up".equals(codeString))
            return VisionBase.UP;
        if ("down".equals(codeString))
            return VisionBase.DOWN;
        if ("in".equals(codeString))
            return VisionBase.IN;
        if ("out".equals(codeString))
            return VisionBase.OUT;
        throw new IllegalArgumentException("Unknown VisionBase code '" + codeString + "'");
    }

    public Enumeration<VisionBase> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("up".equals(codeString))
            return new Enumeration<VisionBase>(this, VisionBase.UP);
        if ("down".equals(codeString))
            return new Enumeration<VisionBase>(this, VisionBase.DOWN);
        if ("in".equals(codeString))
            return new Enumeration<VisionBase>(this, VisionBase.IN);
        if ("out".equals(codeString))
            return new Enumeration<VisionBase>(this, VisionBase.OUT);
        throw new FHIRException("Unknown VisionBase code '" + codeString + "'");
    }

    public String toCode(VisionBase code) {
        if (code == VisionBase.UP)
            return "up";
        if (code == VisionBase.DOWN)
            return "down";
        if (code == VisionBase.IN)
            return "in";
        if (code == VisionBase.OUT)
            return "out";
        return "?";
    }
}
