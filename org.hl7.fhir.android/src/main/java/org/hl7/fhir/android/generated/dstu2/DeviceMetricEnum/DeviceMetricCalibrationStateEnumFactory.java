package org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DeviceMetricCalibrationStateEnumFactory implements EnumFactory<DeviceMetricCalibrationState> {

    public DeviceMetricCalibrationState fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-calibrated".equals(codeString))
            return DeviceMetricCalibrationState.NOTCALIBRATED;
        if ("calibration-required".equals(codeString))
            return DeviceMetricCalibrationState.CALIBRATIONREQUIRED;
        if ("calibrated".equals(codeString))
            return DeviceMetricCalibrationState.CALIBRATED;
        if ("unspecified".equals(codeString))
            return DeviceMetricCalibrationState.UNSPECIFIED;
        throw new IllegalArgumentException("Unknown DeviceMetricCalibrationState code '" + codeString + "'");
    }

    public Enumeration<DeviceMetricCalibrationState> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("not-calibrated".equals(codeString))
            return new Enumeration<DeviceMetricCalibrationState>(this, DeviceMetricCalibrationState.NOTCALIBRATED);
        if ("calibration-required".equals(codeString))
            return new Enumeration<DeviceMetricCalibrationState>(this, DeviceMetricCalibrationState.CALIBRATIONREQUIRED);
        if ("calibrated".equals(codeString))
            return new Enumeration<DeviceMetricCalibrationState>(this, DeviceMetricCalibrationState.CALIBRATED);
        if ("unspecified".equals(codeString))
            return new Enumeration<DeviceMetricCalibrationState>(this, DeviceMetricCalibrationState.UNSPECIFIED);
        throw new FHIRException("Unknown DeviceMetricCalibrationState code '" + codeString + "'");
    }

    public String toCode(DeviceMetricCalibrationState code) {
        if (code == DeviceMetricCalibrationState.NOTCALIBRATED)
            return "not-calibrated";
        if (code == DeviceMetricCalibrationState.CALIBRATIONREQUIRED)
            return "calibration-required";
        if (code == DeviceMetricCalibrationState.CALIBRATED)
            return "calibrated";
        if (code == DeviceMetricCalibrationState.UNSPECIFIED)
            return "unspecified";
        return "?";
    }
}
