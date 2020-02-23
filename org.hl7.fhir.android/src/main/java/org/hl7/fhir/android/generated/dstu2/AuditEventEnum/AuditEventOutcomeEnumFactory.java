package org.hl7.fhir.android.generated.dstu2.AuditEventEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AuditEventOutcomeEnumFactory implements EnumFactory<AuditEventOutcome> {

    public AuditEventOutcome fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("0".equals(codeString))
            return AuditEventOutcome._0;
        if ("4".equals(codeString))
            return AuditEventOutcome._4;
        if ("8".equals(codeString))
            return AuditEventOutcome._8;
        if ("12".equals(codeString))
            return AuditEventOutcome._12;
        throw new IllegalArgumentException("Unknown AuditEventOutcome code '" + codeString + "'");
    }

    public Enumeration<AuditEventOutcome> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("0".equals(codeString))
            return new Enumeration<AuditEventOutcome>(this, AuditEventOutcome._0);
        if ("4".equals(codeString))
            return new Enumeration<AuditEventOutcome>(this, AuditEventOutcome._4);
        if ("8".equals(codeString))
            return new Enumeration<AuditEventOutcome>(this, AuditEventOutcome._8);
        if ("12".equals(codeString))
            return new Enumeration<AuditEventOutcome>(this, AuditEventOutcome._12);
        throw new FHIRException("Unknown AuditEventOutcome code '" + codeString + "'");
    }

    public String toCode(AuditEventOutcome code) {
        if (code == AuditEventOutcome._0)
            return "0";
        if (code == AuditEventOutcome._4)
            return "4";
        if (code == AuditEventOutcome._8)
            return "8";
        if (code == AuditEventOutcome._12)
            return "12";
        return "?";
    }
}
