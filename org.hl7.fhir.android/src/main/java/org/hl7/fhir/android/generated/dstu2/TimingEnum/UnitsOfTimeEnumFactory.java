package org.hl7.fhir.android.generated.dstu2.TimingEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class UnitsOfTimeEnumFactory implements EnumFactory<UnitsOfTime> {

    public UnitsOfTime fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("s".equals(codeString))
            return UnitsOfTime.S;
        if ("min".equals(codeString))
            return UnitsOfTime.MIN;
        if ("h".equals(codeString))
            return UnitsOfTime.H;
        if ("d".equals(codeString))
            return UnitsOfTime.D;
        if ("wk".equals(codeString))
            return UnitsOfTime.WK;
        if ("mo".equals(codeString))
            return UnitsOfTime.MO;
        if ("a".equals(codeString))
            return UnitsOfTime.A;
        throw new IllegalArgumentException("Unknown UnitsOfTime code '" + codeString + "'");
    }

    public Enumeration<UnitsOfTime> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("s".equals(codeString))
            return new Enumeration<UnitsOfTime>(this, UnitsOfTime.S);
        if ("min".equals(codeString))
            return new Enumeration<UnitsOfTime>(this, UnitsOfTime.MIN);
        if ("h".equals(codeString))
            return new Enumeration<UnitsOfTime>(this, UnitsOfTime.H);
        if ("d".equals(codeString))
            return new Enumeration<UnitsOfTime>(this, UnitsOfTime.D);
        if ("wk".equals(codeString))
            return new Enumeration<UnitsOfTime>(this, UnitsOfTime.WK);
        if ("mo".equals(codeString))
            return new Enumeration<UnitsOfTime>(this, UnitsOfTime.MO);
        if ("a".equals(codeString))
            return new Enumeration<UnitsOfTime>(this, UnitsOfTime.A);
        throw new FHIRException("Unknown UnitsOfTime code '" + codeString + "'");
    }

    public String toCode(UnitsOfTime code) {
        if (code == UnitsOfTime.S)
            return "s";
        if (code == UnitsOfTime.MIN)
            return "min";
        if (code == UnitsOfTime.H)
            return "h";
        if (code == UnitsOfTime.D)
            return "d";
        if (code == UnitsOfTime.WK)
            return "wk";
        if (code == UnitsOfTime.MO)
            return "mo";
        if (code == UnitsOfTime.A)
            return "a";
        return "?";
    }
}
