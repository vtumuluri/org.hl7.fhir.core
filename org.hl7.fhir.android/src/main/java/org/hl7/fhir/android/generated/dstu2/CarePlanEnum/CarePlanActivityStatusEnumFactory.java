package org.hl7.fhir.android.generated.dstu2.CarePlanEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class CarePlanActivityStatusEnumFactory implements EnumFactory<CarePlanActivityStatus> {

    public CarePlanActivityStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-started".equals(codeString))
            return CarePlanActivityStatus.NOTSTARTED;
        if ("scheduled".equals(codeString))
            return CarePlanActivityStatus.SCHEDULED;
        if ("in-progress".equals(codeString))
            return CarePlanActivityStatus.INPROGRESS;
        if ("on-hold".equals(codeString))
            return CarePlanActivityStatus.ONHOLD;
        if ("completed".equals(codeString))
            return CarePlanActivityStatus.COMPLETED;
        if ("cancelled".equals(codeString))
            return CarePlanActivityStatus.CANCELLED;
        throw new IllegalArgumentException("Unknown CarePlanActivityStatus code '" + codeString + "'");
    }

    public Enumeration<CarePlanActivityStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("not-started".equals(codeString))
            return new Enumeration<CarePlanActivityStatus>(this, CarePlanActivityStatus.NOTSTARTED);
        if ("scheduled".equals(codeString))
            return new Enumeration<CarePlanActivityStatus>(this, CarePlanActivityStatus.SCHEDULED);
        if ("in-progress".equals(codeString))
            return new Enumeration<CarePlanActivityStatus>(this, CarePlanActivityStatus.INPROGRESS);
        if ("on-hold".equals(codeString))
            return new Enumeration<CarePlanActivityStatus>(this, CarePlanActivityStatus.ONHOLD);
        if ("completed".equals(codeString))
            return new Enumeration<CarePlanActivityStatus>(this, CarePlanActivityStatus.COMPLETED);
        if ("cancelled".equals(codeString))
            return new Enumeration<CarePlanActivityStatus>(this, CarePlanActivityStatus.CANCELLED);
        throw new FHIRException("Unknown CarePlanActivityStatus code '" + codeString + "'");
    }

    public String toCode(CarePlanActivityStatus code) {
        if (code == CarePlanActivityStatus.NOTSTARTED)
            return "not-started";
        if (code == CarePlanActivityStatus.SCHEDULED)
            return "scheduled";
        if (code == CarePlanActivityStatus.INPROGRESS)
            return "in-progress";
        if (code == CarePlanActivityStatus.ONHOLD)
            return "on-hold";
        if (code == CarePlanActivityStatus.COMPLETED)
            return "completed";
        if (code == CarePlanActivityStatus.CANCELLED)
            return "cancelled";
        return "?";
    }
}
