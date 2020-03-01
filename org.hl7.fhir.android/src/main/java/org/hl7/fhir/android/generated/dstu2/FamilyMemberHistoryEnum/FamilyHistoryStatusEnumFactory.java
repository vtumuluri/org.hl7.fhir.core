package org.hl7.fhir.android.generated.dstu2.FamilyMemberHistoryEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class FamilyHistoryStatusEnumFactory implements EnumFactory<FamilyHistoryStatus> {

    public FamilyHistoryStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("partial".equals(codeString))
            return FamilyHistoryStatus.PARTIAL;
        if ("completed".equals(codeString))
            return FamilyHistoryStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
            return FamilyHistoryStatus.ENTEREDINERROR;
        if ("health-unknown".equals(codeString))
            return FamilyHistoryStatus.HEALTHUNKNOWN;
        throw new IllegalArgumentException("Unknown FamilyHistoryStatus code '" + codeString + "'");
    }

    public Enumeration<FamilyHistoryStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("partial".equals(codeString))
            return new Enumeration<FamilyHistoryStatus>(this, FamilyHistoryStatus.PARTIAL);
        if ("completed".equals(codeString))
            return new Enumeration<FamilyHistoryStatus>(this, FamilyHistoryStatus.COMPLETED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<FamilyHistoryStatus>(this, FamilyHistoryStatus.ENTEREDINERROR);
        if ("health-unknown".equals(codeString))
            return new Enumeration<FamilyHistoryStatus>(this, FamilyHistoryStatus.HEALTHUNKNOWN);
        throw new FHIRException("Unknown FamilyHistoryStatus code '" + codeString + "'");
    }

    public String toCode(FamilyHistoryStatus code) {
        if (code == FamilyHistoryStatus.PARTIAL)
            return "partial";
        if (code == FamilyHistoryStatus.COMPLETED)
            return "completed";
        if (code == FamilyHistoryStatus.ENTEREDINERROR)
            return "entered-in-error";
        if (code == FamilyHistoryStatus.HEALTHUNKNOWN)
            return "health-unknown";
        return "?";
    }
}
