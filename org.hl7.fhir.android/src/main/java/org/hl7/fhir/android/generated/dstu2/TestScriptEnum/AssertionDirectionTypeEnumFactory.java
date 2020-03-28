package org.hl7.fhir.android.generated.dstu2.TestScriptEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AssertionDirectionTypeEnumFactory implements EnumFactory<AssertionDirectionType> {

    public AssertionDirectionType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("response".equals(codeString))
            return AssertionDirectionType.RESPONSE;
        if ("request".equals(codeString))
            return AssertionDirectionType.REQUEST;
        throw new IllegalArgumentException("Unknown AssertionDirectionType code '" + codeString + "'");
    }

    public Enumeration<AssertionDirectionType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("response".equals(codeString))
            return new Enumeration<AssertionDirectionType>(this, AssertionDirectionType.RESPONSE);
        if ("request".equals(codeString))
            return new Enumeration<AssertionDirectionType>(this, AssertionDirectionType.REQUEST);
        throw new FHIRException("Unknown AssertionDirectionType code '" + codeString + "'");
    }

    public String toCode(AssertionDirectionType code) {
        if (code == AssertionDirectionType.RESPONSE)
            return "response";
        if (code == AssertionDirectionType.REQUEST)
            return "request";
        return "?";
    }
}
