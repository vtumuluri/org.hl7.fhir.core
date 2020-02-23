package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum DocumentMode {

    /**
     * The application produces documents of the specified type.
     */
    PRODUCER,
    /**
     * The application consumes documents of the specified type.
     */
    CONSUMER,
    /**
     * added to help the parsers
     */
    NULL;

    public static DocumentMode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("producer".equals(codeString))
            return PRODUCER;
        if ("consumer".equals(codeString))
            return CONSUMER;
        throw new FHIRException("Unknown DocumentMode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PRODUCER:
                return "producer";
            case CONSUMER:
                return "consumer";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PRODUCER:
                return "http://hl7.org/fhir/document-mode";
            case CONSUMER:
                return "http://hl7.org/fhir/document-mode";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PRODUCER:
                return "The application produces documents of the specified type.";
            case CONSUMER:
                return "The application consumes documents of the specified type.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PRODUCER:
                return "Producer";
            case CONSUMER:
                return "Consumer";
            default:
                return "?";
        }
    }
}
