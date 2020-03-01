package org.hl7.fhir.android.generated.dstu2.DeviceUseRequestEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DeviceUseRequestPriorityEnumFactory implements EnumFactory<DeviceUseRequestPriority> {

    public DeviceUseRequestPriority fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("routine".equals(codeString))
            return DeviceUseRequestPriority.ROUTINE;
        if ("urgent".equals(codeString))
            return DeviceUseRequestPriority.URGENT;
        if ("stat".equals(codeString))
            return DeviceUseRequestPriority.STAT;
        if ("asap".equals(codeString))
            return DeviceUseRequestPriority.ASAP;
        throw new IllegalArgumentException("Unknown DeviceUseRequestPriority code '" + codeString + "'");
    }

    public Enumeration<DeviceUseRequestPriority> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("routine".equals(codeString))
            return new Enumeration<DeviceUseRequestPriority>(this, DeviceUseRequestPriority.ROUTINE);
        if ("urgent".equals(codeString))
            return new Enumeration<DeviceUseRequestPriority>(this, DeviceUseRequestPriority.URGENT);
        if ("stat".equals(codeString))
            return new Enumeration<DeviceUseRequestPriority>(this, DeviceUseRequestPriority.STAT);
        if ("asap".equals(codeString))
            return new Enumeration<DeviceUseRequestPriority>(this, DeviceUseRequestPriority.ASAP);
        throw new FHIRException("Unknown DeviceUseRequestPriority code '" + codeString + "'");
    }

    public String toCode(DeviceUseRequestPriority code) {
        if (code == DeviceUseRequestPriority.ROUTINE)
            return "routine";
        if (code == DeviceUseRequestPriority.URGENT)
            return "urgent";
        if (code == DeviceUseRequestPriority.STAT)
            return "stat";
        if (code == DeviceUseRequestPriority.ASAP)
            return "asap";
        return "?";
    }
}
