package org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class IssueSeverityEnumFactory implements EnumFactory<IssueSeverity> {

    public IssueSeverity fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("fatal".equals(codeString))
            return IssueSeverity.FATAL;
        if ("error".equals(codeString))
            return IssueSeverity.ERROR;
        if ("warning".equals(codeString))
            return IssueSeverity.WARNING;
        if ("information".equals(codeString))
            return IssueSeverity.INFORMATION;
        throw new IllegalArgumentException("Unknown IssueSeverity code '" + codeString + "'");
    }

    public Enumeration<IssueSeverity> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("fatal".equals(codeString))
            return new Enumeration<IssueSeverity>(this, IssueSeverity.FATAL);
        if ("error".equals(codeString))
            return new Enumeration<IssueSeverity>(this, IssueSeverity.ERROR);
        if ("warning".equals(codeString))
            return new Enumeration<IssueSeverity>(this, IssueSeverity.WARNING);
        if ("information".equals(codeString))
            return new Enumeration<IssueSeverity>(this, IssueSeverity.INFORMATION);
        throw new FHIRException("Unknown IssueSeverity code '" + codeString + "'");
    }

    public String toCode(IssueSeverity code) {
        if (code == IssueSeverity.FATAL)
            return "fatal";
        if (code == IssueSeverity.ERROR)
            return "error";
        if (code == IssueSeverity.WARNING)
            return "warning";
        if (code == IssueSeverity.INFORMATION)
            return "information";
        return "?";
    }
}
