package org.hl7.fhir.android.generated.dstu2.ObservationEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ObservationRelationshipTypeEnumFactory implements EnumFactory<ObservationRelationshipType> {

    public ObservationRelationshipType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("has-member".equals(codeString))
            return ObservationRelationshipType.HASMEMBER;
        if ("derived-from".equals(codeString))
            return ObservationRelationshipType.DERIVEDFROM;
        if ("sequel-to".equals(codeString))
            return ObservationRelationshipType.SEQUELTO;
        if ("replaces".equals(codeString))
            return ObservationRelationshipType.REPLACES;
        if ("qualified-by".equals(codeString))
            return ObservationRelationshipType.QUALIFIEDBY;
        if ("interfered-by".equals(codeString))
            return ObservationRelationshipType.INTERFEREDBY;
        throw new IllegalArgumentException("Unknown ObservationRelationshipType code '" + codeString + "'");
    }

    public Enumeration<ObservationRelationshipType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("has-member".equals(codeString))
            return new Enumeration<ObservationRelationshipType>(this, ObservationRelationshipType.HASMEMBER);
        if ("derived-from".equals(codeString))
            return new Enumeration<ObservationRelationshipType>(this, ObservationRelationshipType.DERIVEDFROM);
        if ("sequel-to".equals(codeString))
            return new Enumeration<ObservationRelationshipType>(this, ObservationRelationshipType.SEQUELTO);
        if ("replaces".equals(codeString))
            return new Enumeration<ObservationRelationshipType>(this, ObservationRelationshipType.REPLACES);
        if ("qualified-by".equals(codeString))
            return new Enumeration<ObservationRelationshipType>(this, ObservationRelationshipType.QUALIFIEDBY);
        if ("interfered-by".equals(codeString))
            return new Enumeration<ObservationRelationshipType>(this, ObservationRelationshipType.INTERFEREDBY);
        throw new FHIRException("Unknown ObservationRelationshipType code '" + codeString + "'");
    }

    public String toCode(ObservationRelationshipType code) {
        if (code == ObservationRelationshipType.HASMEMBER)
            return "has-member";
        if (code == ObservationRelationshipType.DERIVEDFROM)
            return "derived-from";
        if (code == ObservationRelationshipType.SEQUELTO)
            return "sequel-to";
        if (code == ObservationRelationshipType.REPLACES)
            return "replaces";
        if (code == ObservationRelationshipType.QUALIFIEDBY)
            return "qualified-by";
        if (code == ObservationRelationshipType.INTERFEREDBY)
            return "interfered-by";
        return "?";
    }
}
