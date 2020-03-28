package org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ConstraintSeverityEnumFactory implements EnumFactory<ConstraintSeverity> {

    public ConstraintSeverity fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("error".equals(codeString))
            return ConstraintSeverity.ERROR;
        if ("warning".equals(codeString))
            return ConstraintSeverity.WARNING;
        throw new IllegalArgumentException("Unknown ConstraintSeverity code '" + codeString + "'");
    }

    public Enumeration<ConstraintSeverity> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("error".equals(codeString))
            return new Enumeration<ConstraintSeverity>(this, ConstraintSeverity.ERROR);
        if ("warning".equals(codeString))
            return new Enumeration<ConstraintSeverity>(this, ConstraintSeverity.WARNING);
        throw new FHIRException("Unknown ConstraintSeverity code '" + codeString + "'");
    }

    public String toCode(ConstraintSeverity code) {
        if (code == ConstraintSeverity.ERROR)
            return "error";
        if (code == ConstraintSeverity.WARNING)
            return "warning";
        return "?";
    }
}
