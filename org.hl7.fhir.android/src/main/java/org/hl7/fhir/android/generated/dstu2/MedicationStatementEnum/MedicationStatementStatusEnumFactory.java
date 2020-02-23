package org.hl7.fhir.android.generated.dstu2.MedicationStatementEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class MedicationStatementStatusEnumFactory implements EnumFactory<MedicationStatementStatus> {

    public MedicationStatementStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
            return MedicationStatementStatus.ACTIVE;
        if ("completed".equals(codeString))
            return MedicationStatementStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
            return MedicationStatementStatus.ENTEREDINERROR;
        if ("intended".equals(codeString))
            return MedicationStatementStatus.INTENDED;
        throw new IllegalArgumentException("Unknown MedicationStatementStatus code '" + codeString + "'");
    }

    public Enumeration<MedicationStatementStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return new Enumeration<MedicationStatementStatus>(this, MedicationStatementStatus.ACTIVE);
        if ("completed".equals(codeString))
            return new Enumeration<MedicationStatementStatus>(this, MedicationStatementStatus.COMPLETED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<MedicationStatementStatus>(this, MedicationStatementStatus.ENTEREDINERROR);
        if ("intended".equals(codeString))
            return new Enumeration<MedicationStatementStatus>(this, MedicationStatementStatus.INTENDED);
        throw new FHIRException("Unknown MedicationStatementStatus code '" + codeString + "'");
    }

    public String toCode(MedicationStatementStatus code) {
        if (code == MedicationStatementStatus.ACTIVE)
            return "active";
        if (code == MedicationStatementStatus.COMPLETED)
            return "completed";
        if (code == MedicationStatementStatus.ENTEREDINERROR)
            return "entered-in-error";
        if (code == MedicationStatementStatus.INTENDED)
            return "intended";
        return "?";
    }
}
