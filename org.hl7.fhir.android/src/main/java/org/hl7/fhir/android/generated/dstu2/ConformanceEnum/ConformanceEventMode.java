package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ConformanceEventMode {

    /**
     * The application sends requests and receives responses.
     */
    SENDER,
    /**
     * The application receives requests and sends responses.
     */
    RECEIVER,
    /**
     * added to help the parsers
     */
    NULL;

    public static ConformanceEventMode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("sender".equals(codeString))
            return SENDER;
        if ("receiver".equals(codeString))
            return RECEIVER;
        throw new FHIRException("Unknown ConformanceEventMode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case SENDER:
                return "sender";
            case RECEIVER:
                return "receiver";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case SENDER:
                return "http://hl7.org/fhir/message-conformance-event-mode";
            case RECEIVER:
                return "http://hl7.org/fhir/message-conformance-event-mode";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case SENDER:
                return "The application sends requests and receives responses.";
            case RECEIVER:
                return "The application receives requests and sends responses.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case SENDER:
                return "Sender";
            case RECEIVER:
                return "Receiver";
            default:
                return "?";
        }
    }
}
