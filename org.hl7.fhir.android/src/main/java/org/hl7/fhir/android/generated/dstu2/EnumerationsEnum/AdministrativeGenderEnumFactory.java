package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AdministrativeGenderEnumFactory implements EnumFactory<AdministrativeGender> {

    public AdministrativeGender fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("male".equals(codeString))
            return AdministrativeGender.MALE;
        if ("female".equals(codeString))
            return AdministrativeGender.FEMALE;
        if ("other".equals(codeString))
            return AdministrativeGender.OTHER;
        if ("unknown".equals(codeString))
            return AdministrativeGender.UNKNOWN;
        throw new IllegalArgumentException("Unknown AdministrativeGender code '" + codeString + "'");
    }

    public Enumeration<AdministrativeGender> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("male".equals(codeString))
            return new Enumeration<AdministrativeGender>(this, AdministrativeGender.MALE);
        if ("female".equals(codeString))
            return new Enumeration<AdministrativeGender>(this, AdministrativeGender.FEMALE);
        if ("other".equals(codeString))
            return new Enumeration<AdministrativeGender>(this, AdministrativeGender.OTHER);
        if ("unknown".equals(codeString))
            return new Enumeration<AdministrativeGender>(this, AdministrativeGender.UNKNOWN);
        throw new FHIRException("Unknown AdministrativeGender code '" + codeString + "'");
    }

    public String toCode(AdministrativeGender code) {
        if (code == AdministrativeGender.MALE)
            return "male";
        if (code == AdministrativeGender.FEMALE)
            return "female";
        if (code == AdministrativeGender.OTHER)
            return "other";
        if (code == AdministrativeGender.UNKNOWN)
            return "unknown";
        return "?";
    }
}
