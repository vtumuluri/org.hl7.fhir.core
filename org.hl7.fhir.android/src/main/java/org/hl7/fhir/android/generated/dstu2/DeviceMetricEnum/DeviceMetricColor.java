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

public enum DeviceMetricColor {

    /**
     * Color for representation - black.
     */
    BLACK,
    /**
     * Color for representation - red.
     */
    RED,
    /**
     * Color for representation - green.
     */
    GREEN,
    /**
     * Color for representation - yellow.
     */
    YELLOW,
    /**
     * Color for representation - blue.
     */
    BLUE,
    /**
     * Color for representation - magenta.
     */
    MAGENTA,
    /**
     * Color for representation - cyan.
     */
    CYAN,
    /**
     * Color for representation - white.
     */
    WHITE,
    /**
     * added to help the parsers
     */
    NULL;

    public static DeviceMetricColor fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("black".equals(codeString))
            return BLACK;
        if ("red".equals(codeString))
            return RED;
        if ("green".equals(codeString))
            return GREEN;
        if ("yellow".equals(codeString))
            return YELLOW;
        if ("blue".equals(codeString))
            return BLUE;
        if ("magenta".equals(codeString))
            return MAGENTA;
        if ("cyan".equals(codeString))
            return CYAN;
        if ("white".equals(codeString))
            return WHITE;
        throw new FHIRException("Unknown DeviceMetricColor code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case BLACK:
                return "black";
            case RED:
                return "red";
            case GREEN:
                return "green";
            case YELLOW:
                return "yellow";
            case BLUE:
                return "blue";
            case MAGENTA:
                return "magenta";
            case CYAN:
                return "cyan";
            case WHITE:
                return "white";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case BLACK:
                return "http://hl7.org/fhir/metric-color";
            case RED:
                return "http://hl7.org/fhir/metric-color";
            case GREEN:
                return "http://hl7.org/fhir/metric-color";
            case YELLOW:
                return "http://hl7.org/fhir/metric-color";
            case BLUE:
                return "http://hl7.org/fhir/metric-color";
            case MAGENTA:
                return "http://hl7.org/fhir/metric-color";
            case CYAN:
                return "http://hl7.org/fhir/metric-color";
            case WHITE:
                return "http://hl7.org/fhir/metric-color";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case BLACK:
                return "Color for representation - black.";
            case RED:
                return "Color for representation - red.";
            case GREEN:
                return "Color for representation - green.";
            case YELLOW:
                return "Color for representation - yellow.";
            case BLUE:
                return "Color for representation - blue.";
            case MAGENTA:
                return "Color for representation - magenta.";
            case CYAN:
                return "Color for representation - cyan.";
            case WHITE:
                return "Color for representation - white.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case BLACK:
                return "Color Black";
            case RED:
                return "Color Red";
            case GREEN:
                return "Color Green";
            case YELLOW:
                return "Color Yellow";
            case BLUE:
                return "Color Blue";
            case MAGENTA:
                return "Color Magenta";
            case CYAN:
                return "Color Cyan";
            case WHITE:
                return "Color White";
            default:
                return "?";
        }
    }
}
