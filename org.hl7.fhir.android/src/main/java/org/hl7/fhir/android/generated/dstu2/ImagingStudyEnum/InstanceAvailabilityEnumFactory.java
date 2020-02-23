package org.hl7.fhir.android.generated.dstu2.ImagingStudyEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class InstanceAvailabilityEnumFactory implements EnumFactory<InstanceAvailability> {

    public InstanceAvailability fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("ONLINE".equals(codeString))
            return InstanceAvailability.ONLINE;
        if ("OFFLINE".equals(codeString))
            return InstanceAvailability.OFFLINE;
        if ("NEARLINE".equals(codeString))
            return InstanceAvailability.NEARLINE;
        if ("UNAVAILABLE".equals(codeString))
            return InstanceAvailability.UNAVAILABLE;
        throw new IllegalArgumentException("Unknown InstanceAvailability code '" + codeString + "'");
    }

    public Enumeration<InstanceAvailability> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("ONLINE".equals(codeString))
            return new Enumeration<InstanceAvailability>(this, InstanceAvailability.ONLINE);
        if ("OFFLINE".equals(codeString))
            return new Enumeration<InstanceAvailability>(this, InstanceAvailability.OFFLINE);
        if ("NEARLINE".equals(codeString))
            return new Enumeration<InstanceAvailability>(this, InstanceAvailability.NEARLINE);
        if ("UNAVAILABLE".equals(codeString))
            return new Enumeration<InstanceAvailability>(this, InstanceAvailability.UNAVAILABLE);
        throw new FHIRException("Unknown InstanceAvailability code '" + codeString + "'");
    }

    public String toCode(InstanceAvailability code) {
        if (code == InstanceAvailability.ONLINE)
            return "ONLINE";
        if (code == InstanceAvailability.OFFLINE)
            return "OFFLINE";
        if (code == InstanceAvailability.NEARLINE)
            return "NEARLINE";
        if (code == InstanceAvailability.UNAVAILABLE)
            return "UNAVAILABLE";
        return "?";
    }
}
