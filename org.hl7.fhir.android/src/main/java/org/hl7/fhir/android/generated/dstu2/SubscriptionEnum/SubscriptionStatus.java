package org.hl7.fhir.android.generated.dstu2.SubscriptionEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum SubscriptionStatus {

    /**
     * The client has requested the subscription, and the server has not yet set it up.
     */
    REQUESTED,
    /**
     * The subscription is active.
     */
    ACTIVE,
    /**
     * The server has an error executing the notification.
     */
    ERROR,
    /**
     * Too many errors have occurred or the subscription has expired.
     */
    OFF,
    /**
     * added to help the parsers
     */
    NULL;

    public static SubscriptionStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("requested".equals(codeString))
            return REQUESTED;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("error".equals(codeString))
            return ERROR;
        if ("off".equals(codeString))
            return OFF;
        throw new FHIRException("Unknown SubscriptionStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case REQUESTED:
                return "requested";
            case ACTIVE:
                return "active";
            case ERROR:
                return "error";
            case OFF:
                return "off";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case REQUESTED:
                return "http://hl7.org/fhir/subscription-status";
            case ACTIVE:
                return "http://hl7.org/fhir/subscription-status";
            case ERROR:
                return "http://hl7.org/fhir/subscription-status";
            case OFF:
                return "http://hl7.org/fhir/subscription-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case REQUESTED:
                return "The client has requested the subscription, and the server has not yet set it up.";
            case ACTIVE:
                return "The subscription is active.";
            case ERROR:
                return "The server has an error executing the notification.";
            case OFF:
                return "Too many errors have occurred or the subscription has expired.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case REQUESTED:
                return "Requested";
            case ACTIVE:
                return "Active";
            case ERROR:
                return "Error";
            case OFF:
                return "Off";
            default:
                return "?";
        }
    }
}
