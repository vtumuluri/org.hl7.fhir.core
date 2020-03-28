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

public enum DeviceMetricOperationalStatus {

    /**
     * The DeviceMetric is operating and will generate DeviceObservations.
     */
    ON,
    /**
     * The DeviceMetric is not operating.
     */
    OFF,
    /**
     * The DeviceMetric is operating, but will not generate any DeviceObservations.
     */
    STANDBY,
    /**
     * added to help the parsers
     */
    NULL;

    public static DeviceMetricOperationalStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("on".equals(codeString))
            return ON;
        if ("off".equals(codeString))
            return OFF;
        if ("standby".equals(codeString))
            return STANDBY;
        throw new FHIRException("Unknown DeviceMetricOperationalStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ON:
                return "on";
            case OFF:
                return "off";
            case STANDBY:
                return "standby";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ON:
                return "http://hl7.org/fhir/metric-operational-status";
            case OFF:
                return "http://hl7.org/fhir/metric-operational-status";
            case STANDBY:
                return "http://hl7.org/fhir/metric-operational-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ON:
                return "The DeviceMetric is operating and will generate DeviceObservations.";
            case OFF:
                return "The DeviceMetric is not operating.";
            case STANDBY:
                return "The DeviceMetric is operating, but will not generate any DeviceObservations.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ON:
                return "On";
            case OFF:
                return "Off";
            case STANDBY:
                return "Standby";
            default:
                return "?";
        }
    }
}
