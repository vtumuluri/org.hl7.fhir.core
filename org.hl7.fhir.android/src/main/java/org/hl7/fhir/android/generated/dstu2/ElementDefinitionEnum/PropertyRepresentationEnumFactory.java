package org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class PropertyRepresentationEnumFactory implements EnumFactory<PropertyRepresentation> {

    public PropertyRepresentation fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("xmlAttr".equals(codeString))
            return PropertyRepresentation.XMLATTR;
        throw new IllegalArgumentException("Unknown PropertyRepresentation code '" + codeString + "'");
    }

    public Enumeration<PropertyRepresentation> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("xmlAttr".equals(codeString))
            return new Enumeration<PropertyRepresentation>(this, PropertyRepresentation.XMLATTR);
        throw new FHIRException("Unknown PropertyRepresentation code '" + codeString + "'");
    }

    public String toCode(PropertyRepresentation code) {
        if (code == PropertyRepresentation.XMLATTR)
            return "xmlAttr";
        return "?";
    }
}
