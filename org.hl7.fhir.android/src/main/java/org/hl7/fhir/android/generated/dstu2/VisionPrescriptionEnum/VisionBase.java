package org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionBaseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionBase;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionEyesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionEyes;

public enum VisionBase {

    /**
     * top
     */
    UP,
    /**
     * bottom
     */
    DOWN,
    /**
     * inner edge
     */
    IN,
    /**
     * outer edge
     */
    OUT,
    /**
     * added to help the parsers
     */
    NULL;

    public static VisionBase fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("up".equals(codeString))
            return UP;
        if ("down".equals(codeString))
            return DOWN;
        if ("in".equals(codeString))
            return IN;
        if ("out".equals(codeString))
            return OUT;
        throw new FHIRException("Unknown VisionBase code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case UP:
                return "up";
            case DOWN:
                return "down";
            case IN:
                return "in";
            case OUT:
                return "out";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case UP:
                return "http://hl7.org/fhir/vision-base-codes";
            case DOWN:
                return "http://hl7.org/fhir/vision-base-codes";
            case IN:
                return "http://hl7.org/fhir/vision-base-codes";
            case OUT:
                return "http://hl7.org/fhir/vision-base-codes";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case UP:
                return "top";
            case DOWN:
                return "bottom";
            case IN:
                return "inner edge";
            case OUT:
                return "outer edge";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case UP:
                return "Up";
            case DOWN:
                return "Down";
            case IN:
                return "In";
            case OUT:
                return "Out";
            default:
                return "?";
        }
    }
}
