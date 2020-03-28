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

public enum VisionEyes {

    /**
     * Right Eye
     */
    RIGHT,
    /**
     * Left Eye
     */
    LEFT,
    /**
     * added to help the parsers
     */
    NULL;

    public static VisionEyes fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("right".equals(codeString))
            return RIGHT;
        if ("left".equals(codeString))
            return LEFT;
        throw new FHIRException("Unknown VisionEyes code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case RIGHT:
                return "right";
            case LEFT:
                return "left";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case RIGHT:
                return "http://hl7.org/fhir/vision-eye-codes";
            case LEFT:
                return "http://hl7.org/fhir/vision-eye-codes";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case RIGHT:
                return "Right Eye";
            case LEFT:
                return "Left Eye";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case RIGHT:
                return "Right Eye";
            case LEFT:
                return "Left Eye";
            default:
                return "?";
        }
    }
}
