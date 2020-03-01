package org.hl7.fhir.android.generated.dstu2.List_Enum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ListStatus {

    /**
     * The list is considered to be an active part of the patient's record.
     */
    CURRENT,
    /**
     * The list is "old" and should no longer be considered accurate or relevant.
     */
    RETIRED,
    /**
     * The list was never accurate.  It is retained for medico-legal purposes only.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static ListStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("current".equals(codeString))
            return CURRENT;
        if ("retired".equals(codeString))
            return RETIRED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown ListStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CURRENT:
                return "current";
            case RETIRED:
                return "retired";
            case ENTEREDINERROR:
                return "entered-in-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CURRENT:
                return "http://hl7.org/fhir/list-status";
            case RETIRED:
                return "http://hl7.org/fhir/list-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/list-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CURRENT:
                return "The list is considered to be an active part of the patient's record.";
            case RETIRED:
                return "The list is \"old\" and should no longer be considered accurate or relevant.";
            case ENTEREDINERROR:
                return "The list was never accurate.  It is retained for medico-legal purposes only.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CURRENT:
                return "Current";
            case RETIRED:
                return "Retired";
            case ENTEREDINERROR:
                return "Entered In Error";
            default:
                return "?";
        }
    }
}
