package org.hl7.fhir.android.generated.dstu2.AccountEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AccountStatus {

    /**
     * This account is active and may be used.
     */
    ACTIVE,
    /**
     * This account is inactive and should not be used to track financial information.
     */
    INACTIVE,
    /**
     * added to help the parsers
     */
    NULL;

    public static AccountStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("inactive".equals(codeString))
            return INACTIVE;
        throw new FHIRException("Unknown AccountStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ACTIVE:
                return "active";
            case INACTIVE:
                return "inactive";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ACTIVE:
                return "http://hl7.org/fhir/account-status";
            case INACTIVE:
                return "http://hl7.org/fhir/account-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ACTIVE:
                return "This account is active and may be used.";
            case INACTIVE:
                return "This account is inactive and should not be used to track financial information.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ACTIVE:
                return "Active";
            case INACTIVE:
                return "Inactive";
            default:
                return "?";
        }
    }
}
