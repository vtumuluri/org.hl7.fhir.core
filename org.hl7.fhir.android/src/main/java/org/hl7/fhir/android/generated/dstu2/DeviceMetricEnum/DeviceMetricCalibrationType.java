package org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum;

import org.hl7.fhir.exceptions.FHIRException;

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
