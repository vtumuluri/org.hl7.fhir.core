package org.hl7.fhir.android.generated.dstu2.LocationEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum LocationStatus {

    /**
     * The location is operational.
     */
    ACTIVE,
    /**
     * The location is temporarily closed.
     */
    SUSPENDED,
    /**
     * The location is no longer used.
     */
    INACTIVE,
    /**
     * added to help the parsers
     */
    NULL;

    public static LocationStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("suspended".equals(codeString))
            return SUSPENDED;
        if ("inactive".equals(codeString))
            return INACTIVE;
        throw new FHIRException("Unknown LocationStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ACTIVE:
                return "active";
            case SUSPENDED:
                return "suspended";
            case INACTIVE:
                return "inactive";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ACTIVE:
                return "http://hl7.org/fhir/location-status";
            case SUSPENDED:
                return "http://hl7.org/fhir/location-status";
            case INACTIVE:
                return "http://hl7.org/fhir/location-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ACTIVE:
                return "The location is operational.";
            case SUSPENDED:
                return "The location is temporarily closed.";
            case INACTIVE:
                return "The location is no longer used.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ACTIVE:
                return "Active";
            case SUSPENDED:
                return "Suspended";
            case INACTIVE:
                return "Inactive";
            default:
                return "?";
        }
    }
}
