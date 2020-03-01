package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum RestfulConformanceMode {

    /**
     * The application acts as a client for this resource.
     */
    CLIENT,
    /**
     * The application acts as a server for this resource.
     */
    SERVER,
    /**
     * added to help the parsers
     */
    NULL;

    public static RestfulConformanceMode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("client".equals(codeString))
            return CLIENT;
        if ("server".equals(codeString))
            return SERVER;
        throw new FHIRException("Unknown RestfulConformanceMode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CLIENT:
                return "client";
            case SERVER:
                return "server";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CLIENT:
                return "http://hl7.org/fhir/restful-conformance-mode";
            case SERVER:
                return "http://hl7.org/fhir/restful-conformance-mode";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CLIENT:
                return "The application acts as a client for this resource.";
            case SERVER:
                return "The application acts as a server for this resource.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CLIENT:
                return "Client";
            case SERVER:
                return "Server";
            default:
                return "?";
        }
    }
}
