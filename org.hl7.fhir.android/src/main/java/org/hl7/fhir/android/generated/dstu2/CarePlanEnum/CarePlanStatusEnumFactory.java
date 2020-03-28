package org.hl7.fhir.android.generated.dstu2.CarePlanEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class CarePlanStatusEnumFactory implements EnumFactory<CarePlanStatus> {

    public CarePlanStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("proposed".equals(codeString))
            return CarePlanStatus.PROPOSED;
        if ("draft".equals(codeString))
            return CarePlanStatus.DRAFT;
        if ("active".equals(codeString))
            return CarePlanStatus.ACTIVE;
        if ("completed".equals(codeString))
            return CarePlanStatus.COMPLETED;
        if ("cancelled".equals(codeString))
            return CarePlanStatus.CANCELLED;
        throw new IllegalArgumentException("Unknown CarePlanStatus code '" + codeString + "'");
    }

    public Enumeration<CarePlanStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return new Enumeration<CarePlanStatus>(this, CarePlanStatus.PROPOSED);
        if ("draft".equals(codeString))
            return new Enumeration<CarePlanStatus>(this, CarePlanStatus.DRAFT);
        if ("active".equals(codeString))
            return new Enumeration<CarePlanStatus>(this, CarePlanStatus.ACTIVE);
        if ("completed".equals(codeString))
            return new Enumeration<CarePlanStatus>(this, CarePlanStatus.COMPLETED);
        if ("cancelled".equals(codeString))
            return new Enumeration<CarePlanStatus>(this, CarePlanStatus.CANCELLED);
        throw new FHIRException("Unknown CarePlanStatus code '" + codeString + "'");
    }

    public String toCode(CarePlanStatus code) {
        if (code == CarePlanStatus.PROPOSED)
            return "proposed";
        if (code == CarePlanStatus.DRAFT)
            return "draft";
        if (code == CarePlanStatus.ACTIVE)
            return "active";
        if (code == CarePlanStatus.COMPLETED)
            return "completed";
        if (code == CarePlanStatus.CANCELLED)
            return "cancelled";
        return "?";
    }
}
