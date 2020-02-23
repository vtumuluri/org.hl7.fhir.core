package org.hl7.fhir.android.generated.dstu2.DeviceComponentEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class MeasmntPrincipleEnumFactory implements EnumFactory<MeasmntPrinciple> {

    public MeasmntPrinciple fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("other".equals(codeString))
            return MeasmntPrinciple.OTHER;
        if ("chemical".equals(codeString))
            return MeasmntPrinciple.CHEMICAL;
        if ("electrical".equals(codeString))
            return MeasmntPrinciple.ELECTRICAL;
        if ("impedance".equals(codeString))
            return MeasmntPrinciple.IMPEDANCE;
        if ("nuclear".equals(codeString))
            return MeasmntPrinciple.NUCLEAR;
        if ("optical".equals(codeString))
            return MeasmntPrinciple.OPTICAL;
        if ("thermal".equals(codeString))
            return MeasmntPrinciple.THERMAL;
        if ("biological".equals(codeString))
            return MeasmntPrinciple.BIOLOGICAL;
        if ("mechanical".equals(codeString))
            return MeasmntPrinciple.MECHANICAL;
        if ("acoustical".equals(codeString))
            return MeasmntPrinciple.ACOUSTICAL;
        if ("manual".equals(codeString))
            return MeasmntPrinciple.MANUAL;
        throw new IllegalArgumentException("Unknown MeasmntPrinciple code '" + codeString + "'");
    }

    public Enumeration<MeasmntPrinciple> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("other".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.OTHER);
        if ("chemical".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.CHEMICAL);
        if ("electrical".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.ELECTRICAL);
        if ("impedance".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.IMPEDANCE);
        if ("nuclear".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.NUCLEAR);
        if ("optical".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.OPTICAL);
        if ("thermal".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.THERMAL);
        if ("biological".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.BIOLOGICAL);
        if ("mechanical".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.MECHANICAL);
        if ("acoustical".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.ACOUSTICAL);
        if ("manual".equals(codeString))
            return new Enumeration<MeasmntPrinciple>(this, MeasmntPrinciple.MANUAL);
        throw new FHIRException("Unknown MeasmntPrinciple code '" + codeString + "'");
    }

    public String toCode(MeasmntPrinciple code) {
        if (code == MeasmntPrinciple.OTHER)
            return "other";
        if (code == MeasmntPrinciple.CHEMICAL)
            return "chemical";
        if (code == MeasmntPrinciple.ELECTRICAL)
            return "electrical";
        if (code == MeasmntPrinciple.IMPEDANCE)
            return "impedance";
        if (code == MeasmntPrinciple.NUCLEAR)
            return "nuclear";
        if (code == MeasmntPrinciple.OPTICAL)
            return "optical";
        if (code == MeasmntPrinciple.THERMAL)
            return "thermal";
        if (code == MeasmntPrinciple.BIOLOGICAL)
            return "biological";
        if (code == MeasmntPrinciple.MECHANICAL)
            return "mechanical";
        if (code == MeasmntPrinciple.ACOUSTICAL)
            return "acoustical";
        if (code == MeasmntPrinciple.MANUAL)
            return "manual";
        return "?";
    }
}
