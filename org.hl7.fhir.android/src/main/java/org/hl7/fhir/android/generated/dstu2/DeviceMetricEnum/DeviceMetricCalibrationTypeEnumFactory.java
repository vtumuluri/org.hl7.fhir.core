package org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DeviceMetricCalibrationTypeEnumFactory implements EnumFactory<DeviceMetricCalibrationType> {

    public DeviceMetricCalibrationType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("unspecified".equals(codeString))
            return DeviceMetricCalibrationType.UNSPECIFIED;
        if ("offset".equals(codeString))
            return DeviceMetricCalibrationType.OFFSET;
        if ("gain".equals(codeString))
            return DeviceMetricCalibrationType.GAIN;
        if ("two-point".equals(codeString))
            return DeviceMetricCalibrationType.TWOPOINT;
        throw new IllegalArgumentException("Unknown DeviceMetricCalibrationType code '" + codeString + "'");
    }

    public Enumeration<DeviceMetricCalibrationType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("unspecified".equals(codeString))
            return new Enumeration<DeviceMetricCalibrationType>(this, DeviceMetricCalibrationType.UNSPECIFIED);
        if ("offset".equals(codeString))
            return new Enumeration<DeviceMetricCalibrationType>(this, DeviceMetricCalibrationType.OFFSET);
        if ("gain".equals(codeString))
            return new Enumeration<DeviceMetricCalibrationType>(this, DeviceMetricCalibrationType.GAIN);
        if ("two-point".equals(codeString))
            return new Enumeration<DeviceMetricCalibrationType>(this, DeviceMetricCalibrationType.TWOPOINT);
        throw new FHIRException("Unknown DeviceMetricCalibrationType code '" + codeString + "'");
    }

    public String toCode(DeviceMetricCalibrationType code) {
        if (code == DeviceMetricCalibrationType.UNSPECIFIED)
            return "unspecified";
        if (code == DeviceMetricCalibrationType.OFFSET)
            return "offset";
        if (code == DeviceMetricCalibrationType.GAIN)
            return "gain";
        if (code == DeviceMetricCalibrationType.TWOPOINT)
            return "two-point";
        return "?";
    }
}
