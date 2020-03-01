package org.hl7.fhir.android.generated.dstu2.TestScriptEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AssertionDirectionType {

    /**
     * The assertion is evaluated on the response. This is the default value.
     */
    RESPONSE,
    /**
     * The assertion is evaluated on the request.
     */
    REQUEST,
    /**
     * added to help the parsers
     */
    NULL;

    public static AssertionDirectionType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("response".equals(codeString))
            return RESPONSE;
        if ("request".equals(codeString))
            return REQUEST;
        throw new FHIRException("Unknown AssertionDirectionType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case RESPONSE:
                return "response";
            case REQUEST:
                return "request";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case RESPONSE:
                return "http://hl7.org/fhir/assert-direction-codes";
            case REQUEST:
                return "http://hl7.org/fhir/assert-direction-codes";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case RESPONSE:
                return "The assertion is evaluated on the response. This is the default value.";
            case REQUEST:
                return "The assertion is evaluated on the request.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case RESPONSE:
                return "response";
            case REQUEST:
                return "request";
            default:
                return "?";
        }
    }
}
