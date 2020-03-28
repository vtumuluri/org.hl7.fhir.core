package org.hl7.fhir.android.generated.dstu2.SlotEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SlotStatusEnumFactory implements EnumFactory<SlotStatus> {

    public SlotStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("busy".equals(codeString))
            return SlotStatus.BUSY;
        if ("free".equals(codeString))
            return SlotStatus.FREE;
        if ("busy-unavailable".equals(codeString))
            return SlotStatus.BUSYUNAVAILABLE;
        if ("busy-tentative".equals(codeString))
            return SlotStatus.BUSYTENTATIVE;
        throw new IllegalArgumentException("Unknown SlotStatus code '" + codeString + "'");
    }

    public Enumeration<SlotStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("busy".equals(codeString))
            return new Enumeration<SlotStatus>(this, SlotStatus.BUSY);
        if ("free".equals(codeString))
            return new Enumeration<SlotStatus>(this, SlotStatus.FREE);
        if ("busy-unavailable".equals(codeString))
            return new Enumeration<SlotStatus>(this, SlotStatus.BUSYUNAVAILABLE);
        if ("busy-tentative".equals(codeString))
            return new Enumeration<SlotStatus>(this, SlotStatus.BUSYTENTATIVE);
        throw new FHIRException("Unknown SlotStatus code '" + codeString + "'");
    }

    public String toCode(SlotStatus code) {
        if (code == SlotStatus.BUSY)
            return "busy";
        if (code == SlotStatus.FREE)
            return "free";
        if (code == SlotStatus.BUSYUNAVAILABLE)
            return "busy-unavailable";
        if (code == SlotStatus.BUSYTENTATIVE)
            return "busy-tentative";
        return "?";
    }
}
