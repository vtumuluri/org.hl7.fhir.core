package org.hl7.fhir.android.generated.dstu2.MessageHeaderEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ResponseType {

    /**
     * The message was accepted and processed without error.
     */
    OK,
    /**
     * Some internal unexpected error occurred - wait and try again. Note - this is usually used for things like database unavailable, which may be expected to resolve, though human intervention may be required.
     */
    TRANSIENTERROR,
    /**
     * The message was rejected because of some content in it. There is no point in re-sending without change. The response narrative SHALL describe the issue.
     */
    FATALERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static ResponseType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("ok".equals(codeString))
            return OK;
        if ("transient-error".equals(codeString))
            return TRANSIENTERROR;
        if ("fatal-error".equals(codeString))
            return FATALERROR;
        throw new FHIRException("Unknown ResponseType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case OK:
                return "ok";
            case TRANSIENTERROR:
                return "transient-error";
            case FATALERROR:
                return "fatal-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case OK:
                return "http://hl7.org/fhir/response-code";
            case TRANSIENTERROR:
                return "http://hl7.org/fhir/response-code";
            case FATALERROR:
                return "http://hl7.org/fhir/response-code";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case OK:
                return "The message was accepted and processed without error.";
            case TRANSIENTERROR:
                return "Some internal unexpected error occurred - wait and try again. Note - this is usually used for things like database unavailable, which may be expected to resolve, though human intervention may be required.";
            case FATALERROR:
                return "The message was rejected because of some content in it. There is no point in re-sending without change. The response narrative SHALL describe the issue.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case OK:
                return "OK";
            case TRANSIENTERROR:
                return "Transient Error";
            case FATALERROR:
                return "Fatal Error";
            default:
                return "?";
        }
    }
}
