package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AllergyIntoleranceCategoryEnumFactory implements EnumFactory<AllergyIntoleranceCategory> {

    public AllergyIntoleranceCategory fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("food".equals(codeString))
            return AllergyIntoleranceCategory.FOOD;
        if ("medication".equals(codeString))
            return AllergyIntoleranceCategory.MEDICATION;
        if ("environment".equals(codeString))
            return AllergyIntoleranceCategory.ENVIRONMENT;
        if ("other".equals(codeString))
            return AllergyIntoleranceCategory.OTHER;
        throw new IllegalArgumentException("Unknown AllergyIntoleranceCategory code '" + codeString + "'");
    }

    public Enumeration<AllergyIntoleranceCategory> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("food".equals(codeString))
            return new Enumeration<AllergyIntoleranceCategory>(this, AllergyIntoleranceCategory.FOOD);
        if ("medication".equals(codeString))
            return new Enumeration<AllergyIntoleranceCategory>(this, AllergyIntoleranceCategory.MEDICATION);
        if ("environment".equals(codeString))
            return new Enumeration<AllergyIntoleranceCategory>(this, AllergyIntoleranceCategory.ENVIRONMENT);
        if ("other".equals(codeString))
            return new Enumeration<AllergyIntoleranceCategory>(this, AllergyIntoleranceCategory.OTHER);
        throw new FHIRException("Unknown AllergyIntoleranceCategory code '" + codeString + "'");
    }

    public String toCode(AllergyIntoleranceCategory code) {
        if (code == AllergyIntoleranceCategory.FOOD)
            return "food";
        if (code == AllergyIntoleranceCategory.MEDICATION)
            return "medication";
        if (code == AllergyIntoleranceCategory.ENVIRONMENT)
            return "environment";
        if (code == AllergyIntoleranceCategory.OTHER)
            return "other";
        return "?";
    }
}
