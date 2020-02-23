package org.hl7.fhir.android.generated.dstu2.AuditEventEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AuditEventActionEnumFactory implements EnumFactory<AuditEventAction> {

    public AuditEventAction fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("C".equals(codeString))
            return AuditEventAction.C;
        if ("R".equals(codeString))
            return AuditEventAction.R;
        if ("U".equals(codeString))
            return AuditEventAction.U;
        if ("D".equals(codeString))
            return AuditEventAction.D;
        if ("E".equals(codeString))
            return AuditEventAction.E;
        throw new IllegalArgumentException("Unknown AuditEventAction code '" + codeString + "'");
    }

    public Enumeration<AuditEventAction> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("C".equals(codeString))
            return new Enumeration<AuditEventAction>(this, AuditEventAction.C);
        if ("R".equals(codeString))
            return new Enumeration<AuditEventAction>(this, AuditEventAction.R);
        if ("U".equals(codeString))
            return new Enumeration<AuditEventAction>(this, AuditEventAction.U);
        if ("D".equals(codeString))
            return new Enumeration<AuditEventAction>(this, AuditEventAction.D);
        if ("E".equals(codeString))
            return new Enumeration<AuditEventAction>(this, AuditEventAction.E);
        throw new FHIRException("Unknown AuditEventAction code '" + codeString + "'");
    }

    public String toCode(AuditEventAction code) {
        if (code == AuditEventAction.C)
            return "C";
        if (code == AuditEventAction.R)
            return "R";
        if (code == AuditEventAction.U)
            return "U";
        if (code == AuditEventAction.D)
            return "D";
        if (code == AuditEventAction.E)
            return "E";
        return "?";
    }
}
