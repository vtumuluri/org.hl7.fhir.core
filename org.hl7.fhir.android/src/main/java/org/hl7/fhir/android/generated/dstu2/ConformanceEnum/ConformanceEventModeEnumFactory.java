package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ConformanceEventModeEnumFactory implements EnumFactory<ConformanceEventMode> {

    public ConformanceEventMode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("sender".equals(codeString))
            return ConformanceEventMode.SENDER;
        if ("receiver".equals(codeString))
            return ConformanceEventMode.RECEIVER;
        throw new IllegalArgumentException("Unknown ConformanceEventMode code '" + codeString + "'");
    }

    public Enumeration<ConformanceEventMode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("sender".equals(codeString))
            return new Enumeration<ConformanceEventMode>(this, ConformanceEventMode.SENDER);
        if ("receiver".equals(codeString))
            return new Enumeration<ConformanceEventMode>(this, ConformanceEventMode.RECEIVER);
        throw new FHIRException("Unknown ConformanceEventMode code '" + codeString + "'");
    }

    public String toCode(ConformanceEventMode code) {
        if (code == ConformanceEventMode.SENDER)
            return "sender";
        if (code == ConformanceEventMode.RECEIVER)
            return "receiver";
        return "?";
    }
}
