package org.hl7.fhir.android.generated.dstu2.ProcedureRequestEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ProcedureRequestPriority {

    /**
     * The request has a normal priority.
     */
    ROUTINE,
    /**
     * The request should be done urgently.
     */
    URGENT,
    /**
     * The request is time-critical.
     */
    STAT,
    /**
     * The request should be acted on as soon as possible.
     */
    ASAP,
    /**
     * added to help the parsers
     */
    NULL;

    public static ProcedureRequestPriority fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("routine".equals(codeString))
            return ROUTINE;
        if ("urgent".equals(codeString))
            return URGENT;
        if ("stat".equals(codeString))
            return STAT;
        if ("asap".equals(codeString))
            return ASAP;
        throw new FHIRException("Unknown ProcedureRequestPriority code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ROUTINE:
                return "routine";
            case URGENT:
                return "urgent";
            case STAT:
                return "stat";
            case ASAP:
                return "asap";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ROUTINE:
                return "http://hl7.org/fhir/procedure-request-priority";
            case URGENT:
                return "http://hl7.org/fhir/procedure-request-priority";
            case STAT:
                return "http://hl7.org/fhir/procedure-request-priority";
            case ASAP:
                return "http://hl7.org/fhir/procedure-request-priority";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ROUTINE:
                return "The request has a normal priority.";
            case URGENT:
                return "The request should be done urgently.";
            case STAT:
                return "The request is time-critical.";
            case ASAP:
                return "The request should be acted on as soon as possible.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ROUTINE:
                return "Routine";
            case URGENT:
                return "Urgent";
            case STAT:
                return "Stat";
            case ASAP:
                return "ASAP";
            default:
                return "?";
        }
    }
}
