package org.hl7.fhir.android.generated.dstu2.DeviceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum DeviceStatus {

    /**
     * The Device is available for use.
     */
    AVAILABLE,
    /**
     * The Device is no longer available for use (e.g. lost, expired, damaged).
     */
    NOTAVAILABLE,
    /**
     * The Device was entered in error and voided.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static DeviceStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("available".equals(codeString))
            return AVAILABLE;
        if ("not-available".equals(codeString))
            return NOTAVAILABLE;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown DeviceStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case AVAILABLE:
                return "available";
            case NOTAVAILABLE:
                return "not-available";
            case ENTEREDINERROR:
                return "entered-in-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case AVAILABLE:
                return "http://hl7.org/fhir/devicestatus";
            case NOTAVAILABLE:
                return "http://hl7.org/fhir/devicestatus";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/devicestatus";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case AVAILABLE:
                return "The Device is available for use.";
            case NOTAVAILABLE:
                return "The Device is no longer available for use (e.g. lost, expired, damaged).";
            case ENTEREDINERROR:
                return "The Device was entered in error and voided.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case AVAILABLE:
                return "Available";
            case NOTAVAILABLE:
                return "Not Available";
            case ENTEREDINERROR:
                return "Entered in Error";
            default:
                return "?";
        }
    }
}
