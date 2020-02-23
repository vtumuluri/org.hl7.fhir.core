package org.hl7.fhir.android.generated.dstu2.LocationEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class LocationModeEnumFactory implements EnumFactory<LocationMode> {

    public LocationMode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("instance".equals(codeString))
            return LocationMode.INSTANCE;
        if ("kind".equals(codeString))
            return LocationMode.KIND;
        throw new IllegalArgumentException("Unknown LocationMode code '" + codeString + "'");
    }

    public Enumeration<LocationMode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("instance".equals(codeString))
            return new Enumeration<LocationMode>(this, LocationMode.INSTANCE);
        if ("kind".equals(codeString))
            return new Enumeration<LocationMode>(this, LocationMode.KIND);
        throw new FHIRException("Unknown LocationMode code '" + codeString + "'");
    }

    public String toCode(LocationMode code) {
        if (code == LocationMode.INSTANCE)
            return "instance";
        if (code == LocationMode.KIND)
            return "kind";
        return "?";
    }
}
