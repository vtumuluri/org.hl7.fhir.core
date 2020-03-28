package org.hl7.fhir.android.generated.dstu2.MessageHeaderEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ResponseTypeEnumFactory implements EnumFactory<ResponseType> {

    public ResponseType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("ok".equals(codeString))
            return ResponseType.OK;
        if ("transient-error".equals(codeString))
            return ResponseType.TRANSIENTERROR;
        if ("fatal-error".equals(codeString))
            return ResponseType.FATALERROR;
        throw new IllegalArgumentException("Unknown ResponseType code '" + codeString + "'");
    }

    public Enumeration<ResponseType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("ok".equals(codeString))
            return new Enumeration<ResponseType>(this, ResponseType.OK);
        if ("transient-error".equals(codeString))
            return new Enumeration<ResponseType>(this, ResponseType.TRANSIENTERROR);
        if ("fatal-error".equals(codeString))
            return new Enumeration<ResponseType>(this, ResponseType.FATALERROR);
        throw new FHIRException("Unknown ResponseType code '" + codeString + "'");
    }

    public String toCode(ResponseType code) {
        if (code == ResponseType.OK)
            return "ok";
        if (code == ResponseType.TRANSIENTERROR)
            return "transient-error";
        if (code == ResponseType.FATALERROR)
            return "fatal-error";
        return "?";
    }
}
