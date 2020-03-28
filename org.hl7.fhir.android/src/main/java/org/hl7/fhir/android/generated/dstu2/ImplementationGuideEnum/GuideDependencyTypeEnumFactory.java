package org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class GuideDependencyTypeEnumFactory implements EnumFactory<GuideDependencyType> {

    public GuideDependencyType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("reference".equals(codeString))
            return GuideDependencyType.REFERENCE;
        if ("inclusion".equals(codeString))
            return GuideDependencyType.INCLUSION;
        throw new IllegalArgumentException("Unknown GuideDependencyType code '" + codeString + "'");
    }

    public Enumeration<GuideDependencyType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("reference".equals(codeString))
            return new Enumeration<GuideDependencyType>(this, GuideDependencyType.REFERENCE);
        if ("inclusion".equals(codeString))
            return new Enumeration<GuideDependencyType>(this, GuideDependencyType.INCLUSION);
        throw new FHIRException("Unknown GuideDependencyType code '" + codeString + "'");
    }

    public String toCode(GuideDependencyType code) {
        if (code == GuideDependencyType.REFERENCE)
            return "reference";
        if (code == GuideDependencyType.INCLUSION)
            return "inclusion";
        return "?";
    }
}
