package org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum;

import org.hl7.fhir.exceptions.FHIRException;

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
