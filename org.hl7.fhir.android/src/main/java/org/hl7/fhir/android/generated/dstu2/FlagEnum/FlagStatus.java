package org.hl7.fhir.android.generated.dstu2.FlagEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum FlagStatus {

    /**
     * A current flag that should be displayed to a user. A system may use the category to determine which roles should view the flag.
     */
    ACTIVE,
    /**
     * The flag does not need to be displayed any more.
     */
    INACTIVE,
    /**
     * The flag was added in error, and should no longer be displayed.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static FlagStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("inactive".equals(codeString))
            return INACTIVE;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown FlagStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ACTIVE:
                return "active";
            case INACTIVE:
                return "inactive";
            case ENTEREDINERROR:
                return "entered-in-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ACTIVE:
                return "http://hl7.org/fhir/flag-status";
            case INACTIVE:
                return "http://hl7.org/fhir/flag-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/flag-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ACTIVE:
                return "A current flag that should be displayed to a user. A system may use the category to determine which roles should view the flag.";
            case INACTIVE:
                return "The flag does not need to be displayed any more.";
            case ENTEREDINERROR:
                return "The flag was added in error, and should no longer be displayed.";
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
            case ENTEREDINERROR:
                return "Entered in Error";
            default:
                return "?";
        }
    }
}
