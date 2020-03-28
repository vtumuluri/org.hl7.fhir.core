package org.hl7.fhir.android.generated.dstu2.HealthcareServiceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DaysOfWeekEnumFactory implements EnumFactory<DaysOfWeek> {

    public DaysOfWeek fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("mon".equals(codeString))
            return DaysOfWeek.MON;
        if ("tue".equals(codeString))
            return DaysOfWeek.TUE;
        if ("wed".equals(codeString))
            return DaysOfWeek.WED;
        if ("thu".equals(codeString))
            return DaysOfWeek.THU;
        if ("fri".equals(codeString))
            return DaysOfWeek.FRI;
        if ("sat".equals(codeString))
            return DaysOfWeek.SAT;
        if ("sun".equals(codeString))
            return DaysOfWeek.SUN;
        throw new IllegalArgumentException("Unknown DaysOfWeek code '" + codeString + "'");
    }

    public Enumeration<DaysOfWeek> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("mon".equals(codeString))
            return new Enumeration<DaysOfWeek>(this, DaysOfWeek.MON);
        if ("tue".equals(codeString))
            return new Enumeration<DaysOfWeek>(this, DaysOfWeek.TUE);
        if ("wed".equals(codeString))
            return new Enumeration<DaysOfWeek>(this, DaysOfWeek.WED);
        if ("thu".equals(codeString))
            return new Enumeration<DaysOfWeek>(this, DaysOfWeek.THU);
        if ("fri".equals(codeString))
            return new Enumeration<DaysOfWeek>(this, DaysOfWeek.FRI);
        if ("sat".equals(codeString))
            return new Enumeration<DaysOfWeek>(this, DaysOfWeek.SAT);
        if ("sun".equals(codeString))
            return new Enumeration<DaysOfWeek>(this, DaysOfWeek.SUN);
        throw new FHIRException("Unknown DaysOfWeek code '" + codeString + "'");
    }

    public String toCode(DaysOfWeek code) {
        if (code == DaysOfWeek.MON)
            return "mon";
        if (code == DaysOfWeek.TUE)
            return "tue";
        if (code == DaysOfWeek.WED)
            return "wed";
        if (code == DaysOfWeek.THU)
            return "thu";
        if (code == DaysOfWeek.FRI)
            return "fri";
        if (code == DaysOfWeek.SAT)
            return "sat";
        if (code == DaysOfWeek.SUN)
            return "sun";
        return "?";
    }
}
