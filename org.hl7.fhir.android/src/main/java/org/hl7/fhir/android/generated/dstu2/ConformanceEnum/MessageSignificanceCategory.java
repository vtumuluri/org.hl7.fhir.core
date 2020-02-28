package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum MessageSignificanceCategory {

    /**
     * The message represents/requests a change that should not be processed more than once; e.g. Making a booking for an appointment.
     */
    CONSEQUENCE,
    /**
     * The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful.
     */
    CURRENCY,
    /**
     * The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications.
     */
    NOTIFICATION,
    /**
     * added to help the parsers
     */
    NULL;

    public static MessageSignificanceCategory fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("Consequence".equals(codeString))
            return CONSEQUENCE;
        if ("Currency".equals(codeString))
            return CURRENCY;
        if ("Notification".equals(codeString))
            return NOTIFICATION;
        throw new FHIRException("Unknown MessageSignificanceCategory code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CONSEQUENCE:
                return "Consequence";
            case CURRENCY:
                return "Currency";
            case NOTIFICATION:
                return "Notification";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CONSEQUENCE:
                return "http://hl7.org/fhir/message-significance-category";
            case CURRENCY:
                return "http://hl7.org/fhir/message-significance-category";
            case NOTIFICATION:
                return "http://hl7.org/fhir/message-significance-category";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CONSEQUENCE:
                return "The message represents/requests a change that should not be processed more than once; e.g. Making a booking for an appointment.";
            case CURRENCY:
                return "The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful.";
            case NOTIFICATION:
                return "The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CONSEQUENCE:
                return "Consequence";
            case CURRENCY:
                return "Currency";
            case NOTIFICATION:
                return "Notification";
            default:
                return "?";
        }
    }
}
