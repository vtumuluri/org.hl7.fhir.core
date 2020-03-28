package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SpecialValuesEnumFactory implements EnumFactory<SpecialValues> {

    public SpecialValues fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("true".equals(codeString))
            return SpecialValues.TRUE;
        if ("false".equals(codeString))
            return SpecialValues.FALSE;
        if ("trace".equals(codeString))
            return SpecialValues.TRACE;
        if ("sufficient".equals(codeString))
            return SpecialValues.SUFFICIENT;
        if ("withdrawn".equals(codeString))
            return SpecialValues.WITHDRAWN;
        if ("nil-known".equals(codeString))
            return SpecialValues.NILKNOWN;
        throw new IllegalArgumentException("Unknown SpecialValues code '" + codeString + "'");
    }

    public Enumeration<SpecialValues> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("true".equals(codeString))
            return new Enumeration<SpecialValues>(this, SpecialValues.TRUE);
        if ("false".equals(codeString))
            return new Enumeration<SpecialValues>(this, SpecialValues.FALSE);
        if ("trace".equals(codeString))
            return new Enumeration<SpecialValues>(this, SpecialValues.TRACE);
        if ("sufficient".equals(codeString))
            return new Enumeration<SpecialValues>(this, SpecialValues.SUFFICIENT);
        if ("withdrawn".equals(codeString))
            return new Enumeration<SpecialValues>(this, SpecialValues.WITHDRAWN);
        if ("nil-known".equals(codeString))
            return new Enumeration<SpecialValues>(this, SpecialValues.NILKNOWN);
        throw new FHIRException("Unknown SpecialValues code '" + codeString + "'");
    }

    public String toCode(SpecialValues code) {
        if (code == SpecialValues.TRUE)
            return "true";
        if (code == SpecialValues.FALSE)
            return "false";
        if (code == SpecialValues.TRACE)
            return "trace";
        if (code == SpecialValues.SUFFICIENT)
            return "sufficient";
        if (code == SpecialValues.WITHDRAWN)
            return "withdrawn";
        if (code == SpecialValues.NILKNOWN)
            return "nil-known";
        return "?";
    }
}
