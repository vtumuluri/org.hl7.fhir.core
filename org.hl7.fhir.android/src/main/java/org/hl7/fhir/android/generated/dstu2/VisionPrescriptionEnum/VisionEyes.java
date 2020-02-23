package org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum;

import org.hl7.fhir.exceptions.FHIRException;

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
