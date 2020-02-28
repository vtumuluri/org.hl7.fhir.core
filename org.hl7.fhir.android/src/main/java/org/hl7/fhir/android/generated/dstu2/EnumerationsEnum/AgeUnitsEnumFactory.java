package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AgeUnitsEnumFactory implements EnumFactory<AgeUnits> {

    public AgeUnits fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("min".equals(codeString))
            return AgeUnits.MIN;
        if ("h".equals(codeString))
            return AgeUnits.H;
        if ("d".equals(codeString))
            return AgeUnits.D;
        if ("wk".equals(codeString))
            return AgeUnits.WK;
        if ("mo".equals(codeString))
            return AgeUnits.MO;
        if ("a".equals(codeString))
            return AgeUnits.A;
        throw new IllegalArgumentException("Unknown AgeUnits code '" + codeString + "'");
    }

    public Enumeration<AgeUnits> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("min".equals(codeString))
            return new Enumeration<AgeUnits>(this, AgeUnits.MIN);
        if ("h".equals(codeString))
            return new Enumeration<AgeUnits>(this, AgeUnits.H);
        if ("d".equals(codeString))
            return new Enumeration<AgeUnits>(this, AgeUnits.D);
        if ("wk".equals(codeString))
            return new Enumeration<AgeUnits>(this, AgeUnits.WK);
        if ("mo".equals(codeString))
            return new Enumeration<AgeUnits>(this, AgeUnits.MO);
        if ("a".equals(codeString))
            return new Enumeration<AgeUnits>(this, AgeUnits.A);
        throw new FHIRException("Unknown AgeUnits code '" + codeString + "'");
    }

    public String toCode(AgeUnits code) {
        if (code == AgeUnits.MIN)
            return "min";
        if (code == AgeUnits.H)
            return "h";
        if (code == AgeUnits.D)
            return "d";
        if (code == AgeUnits.WK)
            return "wk";
        if (code == AgeUnits.MO)
            return "mo";
        if (code == AgeUnits.A)
            return "a";
        return "?";
    }
}
