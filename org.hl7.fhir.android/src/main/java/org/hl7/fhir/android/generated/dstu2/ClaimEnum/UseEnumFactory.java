package org.hl7.fhir.android.generated.dstu2.ClaimEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class UseEnumFactory implements EnumFactory<Use> {

    public Use fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
            return Use.COMPLETE;
        if ("proposed".equals(codeString))
            return Use.PROPOSED;
        if ("exploratory".equals(codeString))
            return Use.EXPLORATORY;
        if ("other".equals(codeString))
            return Use.OTHER;
        throw new IllegalArgumentException("Unknown Use code '" + codeString + "'");
    }

    public Enumeration<Use> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("complete".equals(codeString))
            return new Enumeration<Use>(this, Use.COMPLETE);
        if ("proposed".equals(codeString))
            return new Enumeration<Use>(this, Use.PROPOSED);
        if ("exploratory".equals(codeString))
            return new Enumeration<Use>(this, Use.EXPLORATORY);
        if ("other".equals(codeString))
            return new Enumeration<Use>(this, Use.OTHER);
        throw new FHIRException("Unknown Use code '" + codeString + "'");
    }

    public String toCode(Use code) {
        if (code == Use.COMPLETE)
            return "complete";
        if (code == Use.PROPOSED)
            return "proposed";
        if (code == Use.EXPLORATORY)
            return "exploratory";
        if (code == Use.OTHER)
            return "other";
        return "?";
    }
}
