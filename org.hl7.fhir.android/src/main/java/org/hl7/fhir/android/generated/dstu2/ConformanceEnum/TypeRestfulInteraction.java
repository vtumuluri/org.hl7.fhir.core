package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum TypeRestfulInteraction {

    /**
     * null
     */
    READ,
    /**
     * null
     */
    VREAD,
    /**
     * null
     */
    UPDATE,
    /**
     * null
     */
    DELETE,
    /**
     * null
     */
    HISTORYINSTANCE,
    /**
     * null
     */
    VALIDATE,
    /**
     * null
     */
    HISTORYTYPE,
    /**
     * null
     */
    CREATE,
    /**
     * null
     */
    SEARCHTYPE,
    /**
     * added to help the parsers
     */
    NULL;

    public static TypeRestfulInteraction fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("read".equals(codeString))
            return READ;
        if ("vread".equals(codeString))
            return VREAD;
        if ("update".equals(codeString))
            return UPDATE;
        if ("delete".equals(codeString))
            return DELETE;
        if ("history-instance".equals(codeString))
            return HISTORYINSTANCE;
        if ("validate".equals(codeString))
            return VALIDATE;
        if ("history-type".equals(codeString))
            return HISTORYTYPE;
        if ("create".equals(codeString))
            return CREATE;
        if ("search-type".equals(codeString))
            return SEARCHTYPE;
        throw new FHIRException("Unknown TypeRestfulInteraction code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case READ:
                return "read";
            case VREAD:
                return "vread";
            case UPDATE:
                return "update";
            case DELETE:
                return "delete";
            case HISTORYINSTANCE:
                return "history-instance";
            case VALIDATE:
                return "validate";
            case HISTORYTYPE:
                return "history-type";
            case CREATE:
                return "create";
            case SEARCHTYPE:
                return "search-type";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case READ:
                return "http://hl7.org/fhir/restful-interaction";
            case VREAD:
                return "http://hl7.org/fhir/restful-interaction";
            case UPDATE:
                return "http://hl7.org/fhir/restful-interaction";
            case DELETE:
                return "http://hl7.org/fhir/restful-interaction";
            case HISTORYINSTANCE:
                return "http://hl7.org/fhir/restful-interaction";
            case VALIDATE:
                return "http://hl7.org/fhir/restful-interaction";
            case HISTORYTYPE:
                return "http://hl7.org/fhir/restful-interaction";
            case CREATE:
                return "http://hl7.org/fhir/restful-interaction";
            case SEARCHTYPE:
                return "http://hl7.org/fhir/restful-interaction";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case READ:
                return "";
            case VREAD:
                return "";
            case UPDATE:
                return "";
            case DELETE:
                return "";
            case HISTORYINSTANCE:
                return "";
            case VALIDATE:
                return "";
            case HISTORYTYPE:
                return "";
            case CREATE:
                return "";
            case SEARCHTYPE:
                return "";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case READ:
                return "read";
            case VREAD:
                return "vread";
            case UPDATE:
                return "update";
            case DELETE:
                return "delete";
            case HISTORYINSTANCE:
                return "history-instance";
            case VALIDATE:
                return "validate";
            case HISTORYTYPE:
                return "history-type";
            case CREATE:
                return "create";
            case SEARCHTYPE:
                return "search-type";
            default:
                return "?";
        }
    }
}
