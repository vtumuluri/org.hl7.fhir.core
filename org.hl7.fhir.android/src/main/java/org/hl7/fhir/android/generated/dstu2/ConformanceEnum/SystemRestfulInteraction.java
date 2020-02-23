package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum SystemRestfulInteraction {

    /**
     * null
     */
    TRANSACTION,
    /**
     * null
     */
    SEARCHSYSTEM,
    /**
     * null
     */
    HISTORYSYSTEM,
    /**
     * added to help the parsers
     */
    NULL;

    public static SystemRestfulInteraction fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("transaction".equals(codeString))
            return TRANSACTION;
        if ("search-system".equals(codeString))
            return SEARCHSYSTEM;
        if ("history-system".equals(codeString))
            return HISTORYSYSTEM;
        throw new FHIRException("Unknown SystemRestfulInteraction code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case TRANSACTION:
                return "transaction";
            case SEARCHSYSTEM:
                return "search-system";
            case HISTORYSYSTEM:
                return "history-system";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case TRANSACTION:
                return "http://hl7.org/fhir/restful-interaction";
            case SEARCHSYSTEM:
                return "http://hl7.org/fhir/restful-interaction";
            case HISTORYSYSTEM:
                return "http://hl7.org/fhir/restful-interaction";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case TRANSACTION:
                return "";
            case SEARCHSYSTEM:
                return "";
            case HISTORYSYSTEM:
                return "";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case TRANSACTION:
                return "transaction";
            case SEARCHSYSTEM:
                return "search-system";
            case HISTORYSYSTEM:
                return "history-system";
            default:
                return "?";
        }
    }
}
