package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AllergyIntoleranceTypeEnumFactory implements EnumFactory<AllergyIntoleranceType> {

    public AllergyIntoleranceType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("allergy".equals(codeString))
            return AllergyIntoleranceType.ALLERGY;
        if ("intolerance".equals(codeString))
            return AllergyIntoleranceType.INTOLERANCE;
        throw new IllegalArgumentException("Unknown AllergyIntoleranceType code '" + codeString + "'");
    }

    public Enumeration<AllergyIntoleranceType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("allergy".equals(codeString))
            return new Enumeration<AllergyIntoleranceType>(this, AllergyIntoleranceType.ALLERGY);
        if ("intolerance".equals(codeString))
            return new Enumeration<AllergyIntoleranceType>(this, AllergyIntoleranceType.INTOLERANCE);
        throw new FHIRException("Unknown AllergyIntoleranceType code '" + codeString + "'");
    }

    public String toCode(AllergyIntoleranceType code) {
        if (code == AllergyIntoleranceType.ALLERGY)
            return "allergy";
        if (code == AllergyIntoleranceType.INTOLERANCE)
            return "intolerance";
        return "?";
    }
}
