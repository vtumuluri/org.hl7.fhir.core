package org.hl7.fhir.android.generated.dstu2.BundleEnum;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerbEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerb;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryMode;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleType;

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
