package org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationType;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricColorEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricColor;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationStateEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationState;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricOperationalStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricOperationalStatus;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCategory;

public enum DeviceMetricCalibrationState {

    /**
     * The metric has not been calibrated.
     */
    NOTCALIBRATED,
    /**
     * The metric needs to be calibrated.
     */
    CALIBRATIONREQUIRED,
    /**
     * The metric has been calibrated.
     */
    CALIBRATED,
    /**
     * The state of calibration of this metric is unspecified.
     */
    UNSPECIFIED,
    /**
     * added to help the parsers
     */
    NULL;

    public static DeviceMetricCalibrationState fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("not-calibrated".equals(codeString))
            return NOTCALIBRATED;
        if ("calibration-required".equals(codeString))
            return CALIBRATIONREQUIRED;
        if ("calibrated".equals(codeString))
            return CALIBRATED;
        if ("unspecified".equals(codeString))
            return UNSPECIFIED;
        throw new FHIRException("Unknown DeviceMetricCalibrationState code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case NOTCALIBRATED:
                return "not-calibrated";
            case CALIBRATIONREQUIRED:
                return "calibration-required";
            case CALIBRATED:
                return "calibrated";
            case UNSPECIFIED:
                return "unspecified";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case NOTCALIBRATED:
                return "http://hl7.org/fhir/metric-calibration-state";
            case CALIBRATIONREQUIRED:
                return "http://hl7.org/fhir/metric-calibration-state";
            case CALIBRATED:
                return "http://hl7.org/fhir/metric-calibration-state";
            case UNSPECIFIED:
                return "http://hl7.org/fhir/metric-calibration-state";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case NOTCALIBRATED:
                return "The metric has not been calibrated.";
            case CALIBRATIONREQUIRED:
                return "The metric needs to be calibrated.";
            case CALIBRATED:
                return "The metric has been calibrated.";
            case UNSPECIFIED:
                return "The state of calibration of this metric is unspecified.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case NOTCALIBRATED:
                return "Not Calibrated";
            case CALIBRATIONREQUIRED:
                return "Calibration Required";
            case CALIBRATED:
                return "Calibrated";
            case UNSPECIFIED:
                return "Unspecified";
            default:
                return "?";
        }
    }
}
