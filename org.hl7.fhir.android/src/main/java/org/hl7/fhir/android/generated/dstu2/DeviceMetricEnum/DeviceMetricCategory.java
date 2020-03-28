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

public enum DeviceMetricCategory {

    /**
     * DeviceObservations generated for this DeviceMetric are measured.
     */
    MEASUREMENT,
    /**
     * DeviceObservations generated for this DeviceMetric is a setting that will influence the behavior of the Device.
     */
    SETTING,
    /**
     * DeviceObservations generated for this DeviceMetric are calculated.
     */
    CALCULATION,
    /**
     * The category of this DeviceMetric is unspecified.
     */
    UNSPECIFIED,
    /**
     * added to help the parsers
     */
    NULL;

    public static DeviceMetricCategory fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("measurement".equals(codeString))
            return MEASUREMENT;
        if ("setting".equals(codeString))
            return SETTING;
        if ("calculation".equals(codeString))
            return CALCULATION;
        if ("unspecified".equals(codeString))
            return UNSPECIFIED;
        throw new FHIRException("Unknown DeviceMetricCategory code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case MEASUREMENT:
                return "measurement";
            case SETTING:
                return "setting";
            case CALCULATION:
                return "calculation";
            case UNSPECIFIED:
                return "unspecified";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case MEASUREMENT:
                return "http://hl7.org/fhir/metric-category";
            case SETTING:
                return "http://hl7.org/fhir/metric-category";
            case CALCULATION:
                return "http://hl7.org/fhir/metric-category";
            case UNSPECIFIED:
                return "http://hl7.org/fhir/metric-category";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case MEASUREMENT:
                return "DeviceObservations generated for this DeviceMetric are measured.";
            case SETTING:
                return "DeviceObservations generated for this DeviceMetric is a setting that will influence the behavior of the Device.";
            case CALCULATION:
                return "DeviceObservations generated for this DeviceMetric are calculated.";
            case UNSPECIFIED:
                return "The category of this DeviceMetric is unspecified.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case MEASUREMENT:
                return "Measurement";
            case SETTING:
                return "Setting";
            case CALCULATION:
                return "Calculation";
            case UNSPECIFIED:
                return "Unspecified";
            default:
                return "?";
        }
    }
}
