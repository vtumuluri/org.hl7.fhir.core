package org.hl7.fhir.android.generated.dstu2.MedicationDispenseEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class MedicationDispenseStatusEnumFactory implements EnumFactory<MedicationDispenseStatus> {

    public MedicationDispenseStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
            return MedicationDispenseStatus.INPROGRESS;
        if ("on-hold".equals(codeString))
            return MedicationDispenseStatus.ONHOLD;
        if ("completed".equals(codeString))
            return MedicationDispenseStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
            return MedicationDispenseStatus.ENTEREDINERROR;
        if ("stopped".equals(codeString))
            return MedicationDispenseStatus.STOPPED;
        throw new IllegalArgumentException("Unknown MedicationDispenseStatus code '" + codeString + "'");
    }

    public Enumeration<MedicationDispenseStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return new Enumeration<MedicationDispenseStatus>(this, MedicationDispenseStatus.INPROGRESS);
        if ("on-hold".equals(codeString))
            return new Enumeration<MedicationDispenseStatus>(this, MedicationDispenseStatus.ONHOLD);
        if ("completed".equals(codeString))
            return new Enumeration<MedicationDispenseStatus>(this, MedicationDispenseStatus.COMPLETED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<MedicationDispenseStatus>(this, MedicationDispenseStatus.ENTEREDINERROR);
        if ("stopped".equals(codeString))
            return new Enumeration<MedicationDispenseStatus>(this, MedicationDispenseStatus.STOPPED);
        throw new FHIRException("Unknown MedicationDispenseStatus code '" + codeString + "'");
    }

    public String toCode(MedicationDispenseStatus code) {
        if (code == MedicationDispenseStatus.INPROGRESS)
            return "in-progress";
        if (code == MedicationDispenseStatus.ONHOLD)
            return "on-hold";
        if (code == MedicationDispenseStatus.COMPLETED)
            return "completed";
        if (code == MedicationDispenseStatus.ENTEREDINERROR)
            return "entered-in-error";
        if (code == MedicationDispenseStatus.STOPPED)
            return "stopped";
        return "?";
    }
}
