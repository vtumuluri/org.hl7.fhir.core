package org.hl7.fhir.android.generated.dstu2.TimingEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class EventTimingEnumFactory implements EnumFactory<EventTiming> {

    public EventTiming fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("HS".equals(codeString))
            return EventTiming.HS;
        if ("WAKE".equals(codeString))
            return EventTiming.WAKE;
        if ("C".equals(codeString))
            return EventTiming.C;
        if ("CM".equals(codeString))
            return EventTiming.CM;
        if ("CD".equals(codeString))
            return EventTiming.CD;
        if ("CV".equals(codeString))
            return EventTiming.CV;
        if ("AC".equals(codeString))
            return EventTiming.AC;
        if ("ACM".equals(codeString))
            return EventTiming.ACM;
        if ("ACD".equals(codeString))
            return EventTiming.ACD;
        if ("ACV".equals(codeString))
            return EventTiming.ACV;
        if ("PC".equals(codeString))
            return EventTiming.PC;
        if ("PCM".equals(codeString))
            return EventTiming.PCM;
        if ("PCD".equals(codeString))
            return EventTiming.PCD;
        if ("PCV".equals(codeString))
            return EventTiming.PCV;
        throw new IllegalArgumentException("Unknown EventTiming code '" + codeString + "'");
    }

    public Enumeration<EventTiming> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("HS".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.HS);
        if ("WAKE".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.WAKE);
        if ("C".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.C);
        if ("CM".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.CM);
        if ("CD".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.CD);
        if ("CV".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.CV);
        if ("AC".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.AC);
        if ("ACM".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.ACM);
        if ("ACD".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.ACD);
        if ("ACV".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.ACV);
        if ("PC".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.PC);
        if ("PCM".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.PCM);
        if ("PCD".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.PCD);
        if ("PCV".equals(codeString))
            return new Enumeration<EventTiming>(this, EventTiming.PCV);
        throw new FHIRException("Unknown EventTiming code '" + codeString + "'");
    }

    public String toCode(EventTiming code) {
        if (code == EventTiming.HS)
            return "HS";
        if (code == EventTiming.WAKE)
            return "WAKE";
        if (code == EventTiming.C)
            return "C";
        if (code == EventTiming.CM)
            return "CM";
        if (code == EventTiming.CD)
            return "CD";
        if (code == EventTiming.CV)
            return "CV";
        if (code == EventTiming.AC)
            return "AC";
        if (code == EventTiming.ACM)
            return "ACM";
        if (code == EventTiming.ACD)
            return "ACD";
        if (code == EventTiming.ACV)
            return "ACV";
        if (code == EventTiming.PC)
            return "PC";
        if (code == EventTiming.PCM)
            return "PCM";
        if (code == EventTiming.PCD)
            return "PCD";
        if (code == EventTiming.PCV)
            return "PCV";
        return "?";
    }
}
