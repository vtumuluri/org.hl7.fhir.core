package org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class VisionEyesEnumFactory implements EnumFactory<VisionEyes> {

    public VisionEyes fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("right".equals(codeString))
            return VisionEyes.RIGHT;
        if ("left".equals(codeString))
            return VisionEyes.LEFT;
        throw new IllegalArgumentException("Unknown VisionEyes code '" + codeString + "'");
    }

    public Enumeration<VisionEyes> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("right".equals(codeString))
            return new Enumeration<VisionEyes>(this, VisionEyes.RIGHT);
        if ("left".equals(codeString))
            return new Enumeration<VisionEyes>(this, VisionEyes.LEFT);
        throw new FHIRException("Unknown VisionEyes code '" + codeString + "'");
    }

    public String toCode(VisionEyes code) {
        if (code == VisionEyes.RIGHT)
            return "right";
        if (code == VisionEyes.LEFT)
            return "left";
        return "?";
    }
}
