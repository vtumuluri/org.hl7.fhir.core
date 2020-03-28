package org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class NutritionOrderStatusEnumFactory implements EnumFactory<NutritionOrderStatus> {

    public NutritionOrderStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("proposed".equals(codeString))
            return NutritionOrderStatus.PROPOSED;
        if ("draft".equals(codeString))
            return NutritionOrderStatus.DRAFT;
        if ("planned".equals(codeString))
            return NutritionOrderStatus.PLANNED;
        if ("requested".equals(codeString))
            return NutritionOrderStatus.REQUESTED;
        if ("active".equals(codeString))
            return NutritionOrderStatus.ACTIVE;
        if ("on-hold".equals(codeString))
            return NutritionOrderStatus.ONHOLD;
        if ("completed".equals(codeString))
            return NutritionOrderStatus.COMPLETED;
        if ("cancelled".equals(codeString))
            return NutritionOrderStatus.CANCELLED;
        throw new IllegalArgumentException("Unknown NutritionOrderStatus code '" + codeString + "'");
    }

    public Enumeration<NutritionOrderStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return new Enumeration<NutritionOrderStatus>(this, NutritionOrderStatus.PROPOSED);
        if ("draft".equals(codeString))
            return new Enumeration<NutritionOrderStatus>(this, NutritionOrderStatus.DRAFT);
        if ("planned".equals(codeString))
            return new Enumeration<NutritionOrderStatus>(this, NutritionOrderStatus.PLANNED);
        if ("requested".equals(codeString))
            return new Enumeration<NutritionOrderStatus>(this, NutritionOrderStatus.REQUESTED);
        if ("active".equals(codeString))
            return new Enumeration<NutritionOrderStatus>(this, NutritionOrderStatus.ACTIVE);
        if ("on-hold".equals(codeString))
            return new Enumeration<NutritionOrderStatus>(this, NutritionOrderStatus.ONHOLD);
        if ("completed".equals(codeString))
            return new Enumeration<NutritionOrderStatus>(this, NutritionOrderStatus.COMPLETED);
        if ("cancelled".equals(codeString))
            return new Enumeration<NutritionOrderStatus>(this, NutritionOrderStatus.CANCELLED);
        throw new FHIRException("Unknown NutritionOrderStatus code '" + codeString + "'");
    }

    public String toCode(NutritionOrderStatus code) {
        if (code == NutritionOrderStatus.PROPOSED)
            return "proposed";
        if (code == NutritionOrderStatus.DRAFT)
            return "draft";
        if (code == NutritionOrderStatus.PLANNED)
            return "planned";
        if (code == NutritionOrderStatus.REQUESTED)
            return "requested";
        if (code == NutritionOrderStatus.ACTIVE)
            return "active";
        if (code == NutritionOrderStatus.ONHOLD)
            return "on-hold";
        if (code == NutritionOrderStatus.COMPLETED)
            return "completed";
        if (code == NutritionOrderStatus.CANCELLED)
            return "cancelled";
        return "?";
    }
}
