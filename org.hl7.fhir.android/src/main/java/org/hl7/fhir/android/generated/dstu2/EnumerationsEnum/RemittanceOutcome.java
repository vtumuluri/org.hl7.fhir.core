package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum RemittanceOutcome {

    /**
     * The processing completed without errors.
     */
    COMPLETE,
    /**
     * The processing identified errors.
     */
    ERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static RemittanceOutcome fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("complete".equals(codeString))
            return COMPLETE;
        if ("error".equals(codeString))
            return ERROR;
        throw new FHIRException("Unknown RemittanceOutcome code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case COMPLETE:
                return "complete";
            case ERROR:
                return "error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case COMPLETE:
                return "http://hl7.org/fhir/remittance-outcome";
            case ERROR:
                return "http://hl7.org/fhir/remittance-outcome";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case COMPLETE:
                return "The processing completed without errors.";
            case ERROR:
                return "The processing identified errors.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case COMPLETE:
                return "Complete";
            case ERROR:
                return "Error";
            default:
                return "?";
        }
    }
}
