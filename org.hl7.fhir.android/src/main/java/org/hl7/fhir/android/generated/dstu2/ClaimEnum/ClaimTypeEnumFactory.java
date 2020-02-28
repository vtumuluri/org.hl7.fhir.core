package org.hl7.fhir.android.generated.dstu2.ClaimEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ClaimTypeEnumFactory implements EnumFactory<ClaimType> {

    public ClaimType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("institutional".equals(codeString))
            return ClaimType.INSTITUTIONAL;
        if ("oral".equals(codeString))
            return ClaimType.ORAL;
        if ("pharmacy".equals(codeString))
            return ClaimType.PHARMACY;
        if ("professional".equals(codeString))
            return ClaimType.PROFESSIONAL;
        if ("vision".equals(codeString))
            return ClaimType.VISION;
        throw new IllegalArgumentException("Unknown ClaimType code '" + codeString + "'");
    }

    public Enumeration<ClaimType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("institutional".equals(codeString))
            return new Enumeration<ClaimType>(this, ClaimType.INSTITUTIONAL);
        if ("oral".equals(codeString))
            return new Enumeration<ClaimType>(this, ClaimType.ORAL);
        if ("pharmacy".equals(codeString))
            return new Enumeration<ClaimType>(this, ClaimType.PHARMACY);
        if ("professional".equals(codeString))
            return new Enumeration<ClaimType>(this, ClaimType.PROFESSIONAL);
        if ("vision".equals(codeString))
            return new Enumeration<ClaimType>(this, ClaimType.VISION);
        throw new FHIRException("Unknown ClaimType code '" + codeString + "'");
    }

    public String toCode(ClaimType code) {
        if (code == ClaimType.INSTITUTIONAL)
            return "institutional";
        if (code == ClaimType.ORAL)
            return "oral";
        if (code == ClaimType.PHARMACY)
            return "pharmacy";
        if (code == ClaimType.PROFESSIONAL)
            return "professional";
        if (code == ClaimType.VISION)
            return "vision";
        return "?";
    }
}
