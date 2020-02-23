package org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DeviceMetricOperationalStatusEnumFactory implements EnumFactory<DeviceMetricOperationalStatus> {

    public DeviceMetricOperationalStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("on".equals(codeString))
            return DeviceMetricOperationalStatus.ON;
        if ("off".equals(codeString))
            return DeviceMetricOperationalStatus.OFF;
        if ("standby".equals(codeString))
            return DeviceMetricOperationalStatus.STANDBY;
        throw new IllegalArgumentException("Unknown DeviceMetricOperationalStatus code '" + codeString + "'");
    }

    public Enumeration<DeviceMetricOperationalStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("on".equals(codeString))
            return new Enumeration<DeviceMetricOperationalStatus>(this, DeviceMetricOperationalStatus.ON);
        if ("off".equals(codeString))
            return new Enumeration<DeviceMetricOperationalStatus>(this, DeviceMetricOperationalStatus.OFF);
        if ("standby".equals(codeString))
            return new Enumeration<DeviceMetricOperationalStatus>(this, DeviceMetricOperationalStatus.STANDBY);
        throw new FHIRException("Unknown DeviceMetricOperationalStatus code '" + codeString + "'");
    }

    public String toCode(DeviceMetricOperationalStatus code) {
        if (code == DeviceMetricOperationalStatus.ON)
            return "on";
        if (code == DeviceMetricOperationalStatus.OFF)
            return "off";
        if (code == DeviceMetricOperationalStatus.STANDBY)
            return "standby";
        return "?";
    }
}
