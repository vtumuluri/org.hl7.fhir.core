package org.hl7.fhir.android.generated.dstu2.LocationEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class LocationStatusEnumFactory implements EnumFactory<LocationStatus> {

    public LocationStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
            return LocationStatus.ACTIVE;
        if ("suspended".equals(codeString))
            return LocationStatus.SUSPENDED;
        if ("inactive".equals(codeString))
            return LocationStatus.INACTIVE;
        throw new IllegalArgumentException("Unknown LocationStatus code '" + codeString + "'");
    }

    public Enumeration<LocationStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return new Enumeration<LocationStatus>(this, LocationStatus.ACTIVE);
        if ("suspended".equals(codeString))
            return new Enumeration<LocationStatus>(this, LocationStatus.SUSPENDED);
        if ("inactive".equals(codeString))
            return new Enumeration<LocationStatus>(this, LocationStatus.INACTIVE);
        throw new FHIRException("Unknown LocationStatus code '" + codeString + "'");
    }

    public String toCode(LocationStatus code) {
        if (code == LocationStatus.ACTIVE)
            return "active";
        if (code == LocationStatus.SUSPENDED)
            return "suspended";
        if (code == LocationStatus.INACTIVE)
            return "inactive";
        return "?";
    }
}
