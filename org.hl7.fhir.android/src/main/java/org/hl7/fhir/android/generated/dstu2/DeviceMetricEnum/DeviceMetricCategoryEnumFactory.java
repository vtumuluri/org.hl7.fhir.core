package org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DeviceMetricCategoryEnumFactory implements EnumFactory<DeviceMetricCategory> {

    public DeviceMetricCategory fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("measurement".equals(codeString))
            return DeviceMetricCategory.MEASUREMENT;
        if ("setting".equals(codeString))
            return DeviceMetricCategory.SETTING;
        if ("calculation".equals(codeString))
            return DeviceMetricCategory.CALCULATION;
        if ("unspecified".equals(codeString))
            return DeviceMetricCategory.UNSPECIFIED;
        throw new IllegalArgumentException("Unknown DeviceMetricCategory code '" + codeString + "'");
    }

    public Enumeration<DeviceMetricCategory> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("measurement".equals(codeString))
            return new Enumeration<DeviceMetricCategory>(this, DeviceMetricCategory.MEASUREMENT);
        if ("setting".equals(codeString))
            return new Enumeration<DeviceMetricCategory>(this, DeviceMetricCategory.SETTING);
        if ("calculation".equals(codeString))
            return new Enumeration<DeviceMetricCategory>(this, DeviceMetricCategory.CALCULATION);
        if ("unspecified".equals(codeString))
            return new Enumeration<DeviceMetricCategory>(this, DeviceMetricCategory.UNSPECIFIED);
        throw new FHIRException("Unknown DeviceMetricCategory code '" + codeString + "'");
    }

    public String toCode(DeviceMetricCategory code) {
        if (code == DeviceMetricCategory.MEASUREMENT)
            return "measurement";
        if (code == DeviceMetricCategory.SETTING)
            return "setting";
        if (code == DeviceMetricCategory.CALCULATION)
            return "calculation";
        if (code == DeviceMetricCategory.UNSPECIFIED)
            return "unspecified";
        return "?";
    }
}
