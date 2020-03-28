package org.hl7.fhir.android.generated.dstu2.ConditionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ConditionVerificationStatusEnumFactory implements EnumFactory<ConditionVerificationStatus> {

    public ConditionVerificationStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("provisional".equals(codeString))
            return ConditionVerificationStatus.PROVISIONAL;
        if ("differential".equals(codeString))
            return ConditionVerificationStatus.DIFFERENTIAL;
        if ("confirmed".equals(codeString))
            return ConditionVerificationStatus.CONFIRMED;
        if ("refuted".equals(codeString))
            return ConditionVerificationStatus.REFUTED;
        if ("entered-in-error".equals(codeString))
            return ConditionVerificationStatus.ENTEREDINERROR;
        if ("unknown".equals(codeString))
            return ConditionVerificationStatus.UNKNOWN;
        throw new IllegalArgumentException("Unknown ConditionVerificationStatus code '" + codeString + "'");
    }

    public Enumeration<ConditionVerificationStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("provisional".equals(codeString))
            return new Enumeration<ConditionVerificationStatus>(this, ConditionVerificationStatus.PROVISIONAL);
        if ("differential".equals(codeString))
            return new Enumeration<ConditionVerificationStatus>(this, ConditionVerificationStatus.DIFFERENTIAL);
        if ("confirmed".equals(codeString))
            return new Enumeration<ConditionVerificationStatus>(this, ConditionVerificationStatus.CONFIRMED);
        if ("refuted".equals(codeString))
            return new Enumeration<ConditionVerificationStatus>(this, ConditionVerificationStatus.REFUTED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<ConditionVerificationStatus>(this, ConditionVerificationStatus.ENTEREDINERROR);
        if ("unknown".equals(codeString))
            return new Enumeration<ConditionVerificationStatus>(this, ConditionVerificationStatus.UNKNOWN);
        throw new FHIRException("Unknown ConditionVerificationStatus code '" + codeString + "'");
    }

    public String toCode(ConditionVerificationStatus code) {
        if (code == ConditionVerificationStatus.PROVISIONAL)
            return "provisional";
        if (code == ConditionVerificationStatus.DIFFERENTIAL)
            return "differential";
        if (code == ConditionVerificationStatus.CONFIRMED)
            return "confirmed";
        if (code == ConditionVerificationStatus.REFUTED)
            return "refuted";
        if (code == ConditionVerificationStatus.ENTEREDINERROR)
            return "entered-in-error";
        if (code == ConditionVerificationStatus.UNKNOWN)
            return "unknown";
        return "?";
    }
}
