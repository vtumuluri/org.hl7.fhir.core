package org.hl7.fhir.android.generated.dstu2.MediaEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DigitalMediaTypeEnumFactory implements EnumFactory<DigitalMediaType> {

    public DigitalMediaType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("photo".equals(codeString))
            return DigitalMediaType.PHOTO;
        if ("video".equals(codeString))
            return DigitalMediaType.VIDEO;
        if ("audio".equals(codeString))
            return DigitalMediaType.AUDIO;
        throw new IllegalArgumentException("Unknown DigitalMediaType code '" + codeString + "'");
    }

    public Enumeration<DigitalMediaType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("photo".equals(codeString))
            return new Enumeration<DigitalMediaType>(this, DigitalMediaType.PHOTO);
        if ("video".equals(codeString))
            return new Enumeration<DigitalMediaType>(this, DigitalMediaType.VIDEO);
        if ("audio".equals(codeString))
            return new Enumeration<DigitalMediaType>(this, DigitalMediaType.AUDIO);
        throw new FHIRException("Unknown DigitalMediaType code '" + codeString + "'");
    }

    public String toCode(DigitalMediaType code) {
        if (code == DigitalMediaType.PHOTO)
            return "photo";
        if (code == DigitalMediaType.VIDEO)
            return "video";
        if (code == DigitalMediaType.AUDIO)
            return "audio";
        return "?";
    }
}
