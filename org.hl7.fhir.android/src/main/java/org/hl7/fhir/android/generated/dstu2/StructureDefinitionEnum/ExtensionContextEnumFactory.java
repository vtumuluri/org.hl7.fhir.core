package org.hl7.fhir.android.generated.dstu2.StructureDefinitionEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ExtensionContextEnumFactory implements EnumFactory<ExtensionContext> {

    public ExtensionContext fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("resource".equals(codeString))
            return ExtensionContext.RESOURCE;
        if ("datatype".equals(codeString))
            return ExtensionContext.DATATYPE;
        if ("mapping".equals(codeString))
            return ExtensionContext.MAPPING;
        if ("extension".equals(codeString))
            return ExtensionContext.EXTENSION;
        throw new IllegalArgumentException("Unknown ExtensionContext code '" + codeString + "'");
    }

    public Enumeration<ExtensionContext> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("resource".equals(codeString))
            return new Enumeration<ExtensionContext>(this, ExtensionContext.RESOURCE);
        if ("datatype".equals(codeString))
            return new Enumeration<ExtensionContext>(this, ExtensionContext.DATATYPE);
        if ("mapping".equals(codeString))
            return new Enumeration<ExtensionContext>(this, ExtensionContext.MAPPING);
        if ("extension".equals(codeString))
            return new Enumeration<ExtensionContext>(this, ExtensionContext.EXTENSION);
        throw new FHIRException("Unknown ExtensionContext code '" + codeString + "'");
    }

    public String toCode(ExtensionContext code) {
        if (code == ExtensionContext.RESOURCE)
            return "resource";
        if (code == ExtensionContext.DATATYPE)
            return "datatype";
        if (code == ExtensionContext.MAPPING)
            return "mapping";
        if (code == ExtensionContext.EXTENSION)
            return "extension";
        return "?";
    }
}
