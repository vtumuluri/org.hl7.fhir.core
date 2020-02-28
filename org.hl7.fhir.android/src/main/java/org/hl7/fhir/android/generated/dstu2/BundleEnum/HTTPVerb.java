package org.hl7.fhir.android.generated.dstu2.BundleEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum HTTPVerb {

    /**
     * HTTP GET
     */
    GET,
    /**
     * HTTP POST
     */
    POST,
    /**
     * HTTP PUT
     */
    PUT,
    /**
     * HTTP DELETE
     */
    DELETE,
    /**
     * added to help the parsers
     */
    NULL;

    public static HTTPVerb fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("GET".equals(codeString))
            return GET;
        if ("POST".equals(codeString))
            return POST;
        if ("PUT".equals(codeString))
            return PUT;
        if ("DELETE".equals(codeString))
            return DELETE;
        throw new FHIRException("Unknown HTTPVerb code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case GET:
                return "GET";
            case POST:
                return "POST";
            case PUT:
                return "PUT";
            case DELETE:
                return "DELETE";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case GET:
                return "http://hl7.org/fhir/http-verb";
            case POST:
                return "http://hl7.org/fhir/http-verb";
            case PUT:
                return "http://hl7.org/fhir/http-verb";
            case DELETE:
                return "http://hl7.org/fhir/http-verb";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case GET:
                return "HTTP GET";
            case POST:
                return "HTTP POST";
            case PUT:
                return "HTTP PUT";
            case DELETE:
                return "HTTP DELETE";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case GET:
                return "GET";
            case POST:
                return "POST";
            case PUT:
                return "PUT";
            case DELETE:
                return "DELETE";
            default:
                return "?";
        }
    }
}
