package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class RestfulConformanceModeEnumFactory implements EnumFactory<RestfulConformanceMode> {

    public RestfulConformanceMode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("client".equals(codeString))
            return RestfulConformanceMode.CLIENT;
        if ("server".equals(codeString))
            return RestfulConformanceMode.SERVER;
        throw new IllegalArgumentException("Unknown RestfulConformanceMode code '" + codeString + "'");
    }

    public Enumeration<RestfulConformanceMode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("client".equals(codeString))
            return new Enumeration<RestfulConformanceMode>(this, RestfulConformanceMode.CLIENT);
        if ("server".equals(codeString))
            return new Enumeration<RestfulConformanceMode>(this, RestfulConformanceMode.SERVER);
        throw new FHIRException("Unknown RestfulConformanceMode code '" + codeString + "'");
    }

    public String toCode(RestfulConformanceMode code) {
        if (code == RestfulConformanceMode.CLIENT)
            return "client";
        if (code == RestfulConformanceMode.SERVER)
            return "server";
        return "?";
    }
}
