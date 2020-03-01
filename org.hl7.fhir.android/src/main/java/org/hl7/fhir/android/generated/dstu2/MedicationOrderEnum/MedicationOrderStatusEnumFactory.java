package org.hl7.fhir.android.generated.dstu2.MedicationOrderEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class MedicationOrderStatusEnumFactory implements EnumFactory<MedicationOrderStatus> {

    public MedicationOrderStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
            return MedicationOrderStatus.ACTIVE;
        if ("on-hold".equals(codeString))
            return MedicationOrderStatus.ONHOLD;
        if ("completed".equals(codeString))
            return MedicationOrderStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
            return MedicationOrderStatus.ENTEREDINERROR;
        if ("stopped".equals(codeString))
            return MedicationOrderStatus.STOPPED;
        if ("draft".equals(codeString))
            return MedicationOrderStatus.DRAFT;
        throw new IllegalArgumentException("Unknown MedicationOrderStatus code '" + codeString + "'");
    }

    public Enumeration<MedicationOrderStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return new Enumeration<MedicationOrderStatus>(this, MedicationOrderStatus.ACTIVE);
        if ("on-hold".equals(codeString))
            return new Enumeration<MedicationOrderStatus>(this, MedicationOrderStatus.ONHOLD);
        if ("completed".equals(codeString))
            return new Enumeration<MedicationOrderStatus>(this, MedicationOrderStatus.COMPLETED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<MedicationOrderStatus>(this, MedicationOrderStatus.ENTEREDINERROR);
        if ("stopped".equals(codeString))
            return new Enumeration<MedicationOrderStatus>(this, MedicationOrderStatus.STOPPED);
        if ("draft".equals(codeString))
            return new Enumeration<MedicationOrderStatus>(this, MedicationOrderStatus.DRAFT);
        throw new FHIRException("Unknown MedicationOrderStatus code '" + codeString + "'");
    }

    public String toCode(MedicationOrderStatus code) {
        if (code == MedicationOrderStatus.ACTIVE)
            return "active";
        if (code == MedicationOrderStatus.ONHOLD)
            return "on-hold";
        if (code == MedicationOrderStatus.COMPLETED)
            return "completed";
        if (code == MedicationOrderStatus.ENTEREDINERROR)
            return "entered-in-error";
        if (code == MedicationOrderStatus.STOPPED)
            return "stopped";
        if (code == MedicationOrderStatus.DRAFT)
            return "draft";
        return "?";
    }
}
