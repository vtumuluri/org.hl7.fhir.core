package org.hl7.fhir.android.generated.dstu2.BundleEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class HTTPVerbEnumFactory implements EnumFactory<HTTPVerb> {

    public HTTPVerb fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("GET".equals(codeString))
            return HTTPVerb.GET;
        if ("POST".equals(codeString))
            return HTTPVerb.POST;
        if ("PUT".equals(codeString))
            return HTTPVerb.PUT;
        if ("DELETE".equals(codeString))
            return HTTPVerb.DELETE;
        throw new IllegalArgumentException("Unknown HTTPVerb code '" + codeString + "'");
    }

    public Enumeration<HTTPVerb> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("GET".equals(codeString))
            return new Enumeration<HTTPVerb>(this, HTTPVerb.GET);
        if ("POST".equals(codeString))
            return new Enumeration<HTTPVerb>(this, HTTPVerb.POST);
        if ("PUT".equals(codeString))
            return new Enumeration<HTTPVerb>(this, HTTPVerb.PUT);
        if ("DELETE".equals(codeString))
            return new Enumeration<HTTPVerb>(this, HTTPVerb.DELETE);
        throw new FHIRException("Unknown HTTPVerb code '" + codeString + "'");
    }

    public String toCode(HTTPVerb code) {
        if (code == HTTPVerb.GET)
            return "GET";
        if (code == HTTPVerb.POST)
            return "POST";
        if (code == HTTPVerb.PUT)
            return "PUT";
        if (code == HTTPVerb.DELETE)
            return "DELETE";
        return "?";
    }
}
