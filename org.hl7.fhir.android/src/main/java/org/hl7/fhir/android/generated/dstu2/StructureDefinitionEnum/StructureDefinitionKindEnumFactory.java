package org.hl7.fhir.android.generated.dstu2.StructureDefinitionEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class StructureDefinitionKindEnumFactory implements EnumFactory<StructureDefinitionKind> {

    public StructureDefinitionKind fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("datatype".equals(codeString))
            return StructureDefinitionKind.DATATYPE;
        if ("resource".equals(codeString))
            return StructureDefinitionKind.RESOURCE;
        if ("logical".equals(codeString))
            return StructureDefinitionKind.LOGICAL;
        throw new IllegalArgumentException("Unknown StructureDefinitionKind code '" + codeString + "'");
    }

    public Enumeration<StructureDefinitionKind> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("datatype".equals(codeString))
            return new Enumeration<StructureDefinitionKind>(this, StructureDefinitionKind.DATATYPE);
        if ("resource".equals(codeString))
            return new Enumeration<StructureDefinitionKind>(this, StructureDefinitionKind.RESOURCE);
        if ("logical".equals(codeString))
            return new Enumeration<StructureDefinitionKind>(this, StructureDefinitionKind.LOGICAL);
        throw new FHIRException("Unknown StructureDefinitionKind code '" + codeString + "'");
    }

    public String toCode(StructureDefinitionKind code) {
        if (code == StructureDefinitionKind.DATATYPE)
            return "datatype";
        if (code == StructureDefinitionKind.RESOURCE)
            return "resource";
        if (code == StructureDefinitionKind.LOGICAL)
            return "logical";
        return "?";
    }
}
