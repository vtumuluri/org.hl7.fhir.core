package org.hl7.fhir.android.generated.dstu2.CarePlanEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class CarePlanRelationshipEnumFactory implements EnumFactory<CarePlanRelationship> {

    public CarePlanRelationship fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("includes".equals(codeString))
            return CarePlanRelationship.INCLUDES;
        if ("replaces".equals(codeString))
            return CarePlanRelationship.REPLACES;
        if ("fulfills".equals(codeString))
            return CarePlanRelationship.FULFILLS;
        throw new IllegalArgumentException("Unknown CarePlanRelationship code '" + codeString + "'");
    }

    public Enumeration<CarePlanRelationship> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("includes".equals(codeString))
            return new Enumeration<CarePlanRelationship>(this, CarePlanRelationship.INCLUDES);
        if ("replaces".equals(codeString))
            return new Enumeration<CarePlanRelationship>(this, CarePlanRelationship.REPLACES);
        if ("fulfills".equals(codeString))
            return new Enumeration<CarePlanRelationship>(this, CarePlanRelationship.FULFILLS);
        throw new FHIRException("Unknown CarePlanRelationship code '" + codeString + "'");
    }

    public String toCode(CarePlanRelationship code) {
        if (code == CarePlanRelationship.INCLUDES)
            return "includes";
        if (code == CarePlanRelationship.REPLACES)
            return "replaces";
        if (code == CarePlanRelationship.FULFILLS)
            return "fulfills";
        return "?";
    }
}
