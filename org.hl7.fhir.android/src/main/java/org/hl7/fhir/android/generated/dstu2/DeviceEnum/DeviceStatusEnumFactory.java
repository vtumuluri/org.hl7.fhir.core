package org.hl7.fhir.android.generated.dstu2.DeviceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DeviceStatusEnumFactory implements EnumFactory<DeviceStatus> {

    public DeviceStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("available".equals(codeString))
            return DeviceStatus.AVAILABLE;
        if ("not-available".equals(codeString))
            return DeviceStatus.NOTAVAILABLE;
        if ("entered-in-error".equals(codeString))
            return DeviceStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown DeviceStatus code '" + codeString + "'");
    }

    public Enumeration<DeviceStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("available".equals(codeString))
            return new Enumeration<DeviceStatus>(this, DeviceStatus.AVAILABLE);
        if ("not-available".equals(codeString))
            return new Enumeration<DeviceStatus>(this, DeviceStatus.NOTAVAILABLE);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<DeviceStatus>(this, DeviceStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown DeviceStatus code '" + codeString + "'");
    }

    public String toCode(DeviceStatus code) {
        if (code == DeviceStatus.AVAILABLE)
            return "available";
        if (code == DeviceStatus.NOTAVAILABLE)
            return "not-available";
        if (code == DeviceStatus.ENTEREDINERROR)
            return "entered-in-error";
        return "?";
    }
}
