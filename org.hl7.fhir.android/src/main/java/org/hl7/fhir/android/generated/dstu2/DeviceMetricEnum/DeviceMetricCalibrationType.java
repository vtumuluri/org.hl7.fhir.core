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

public enum DeviceMetricCalibrationType {

    /**
     * TODO
     */
    UNSPECIFIED,
    /**
     * TODO
     */
    OFFSET,
    /**
     * TODO
     */
    GAIN,
    /**
     * TODO
     */
    TWOPOINT,
    /**
     * added to help the parsers
     */
    NULL;

    public static DeviceMetricCalibrationType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("unspecified".equals(codeString))
            return UNSPECIFIED;
        if ("offset".equals(codeString))
            return OFFSET;
        if ("gain".equals(codeString))
            return GAIN;
        if ("two-point".equals(codeString))
            return TWOPOINT;
        throw new FHIRException("Unknown DeviceMetricCalibrationType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case UNSPECIFIED:
                return "unspecified";
            case OFFSET:
                return "offset";
            case GAIN:
                return "gain";
            case TWOPOINT:
                return "two-point";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case UNSPECIFIED:
                return "http://hl7.org/fhir/metric-calibration-type";
            case OFFSET:
                return "http://hl7.org/fhir/metric-calibration-type";
            case GAIN:
                return "http://hl7.org/fhir/metric-calibration-type";
            case TWOPOINT:
                return "http://hl7.org/fhir/metric-calibration-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case UNSPECIFIED:
                return "TODO";
            case OFFSET:
                return "TODO";
            case GAIN:
                return "TODO";
            case TWOPOINT:
                return "TODO";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case UNSPECIFIED:
                return "Unspecified";
            case OFFSET:
                return "Offset";
            case GAIN:
                return "Gain";
            case TWOPOINT:
                return "Two Point";
            default:
                return "?";
        }
    }
}
