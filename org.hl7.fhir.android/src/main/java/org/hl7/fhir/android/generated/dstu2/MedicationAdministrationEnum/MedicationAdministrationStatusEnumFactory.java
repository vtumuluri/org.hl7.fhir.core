package org.hl7.fhir.android.generated.dstu2.MedicationAdministrationEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class MedicationAdministrationStatusEnumFactory implements EnumFactory<MedicationAdministrationStatus> {

    public MedicationAdministrationStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
            return MedicationAdministrationStatus.INPROGRESS;
        if ("on-hold".equals(codeString))
            return MedicationAdministrationStatus.ONHOLD;
        if ("completed".equals(codeString))
            return MedicationAdministrationStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
            return MedicationAdministrationStatus.ENTEREDINERROR;
        if ("stopped".equals(codeString))
            return MedicationAdministrationStatus.STOPPED;
        throw new IllegalArgumentException("Unknown MedicationAdministrationStatus code '" + codeString + "'");
    }

    public Enumeration<MedicationAdministrationStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return new Enumeration<MedicationAdministrationStatus>(this, MedicationAdministrationStatus.INPROGRESS);
        if ("on-hold".equals(codeString))
            return new Enumeration<MedicationAdministrationStatus>(this, MedicationAdministrationStatus.ONHOLD);
        if ("completed".equals(codeString))
            return new Enumeration<MedicationAdministrationStatus>(this, MedicationAdministrationStatus.COMPLETED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<MedicationAdministrationStatus>(this, MedicationAdministrationStatus.ENTEREDINERROR);
        if ("stopped".equals(codeString))
            return new Enumeration<MedicationAdministrationStatus>(this, MedicationAdministrationStatus.STOPPED);
        throw new FHIRException("Unknown MedicationAdministrationStatus code '" + codeString + "'");
    }

    public String toCode(MedicationAdministrationStatus code) {
        if (code == MedicationAdministrationStatus.INPROGRESS)
            return "in-progress";
        if (code == MedicationAdministrationStatus.ONHOLD)
            return "on-hold";
        if (code == MedicationAdministrationStatus.COMPLETED)
            return "completed";
        if (code == MedicationAdministrationStatus.ENTEREDINERROR)
            return "entered-in-error";
        if (code == MedicationAdministrationStatus.STOPPED)
            return "stopped";
        return "?";
    }
}
