package org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DocumentRelationshipTypeEnumFactory implements EnumFactory<DocumentRelationshipType> {

    public DocumentRelationshipType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("replaces".equals(codeString))
            return DocumentRelationshipType.REPLACES;
        if ("transforms".equals(codeString))
            return DocumentRelationshipType.TRANSFORMS;
        if ("signs".equals(codeString))
            return DocumentRelationshipType.SIGNS;
        if ("appends".equals(codeString))
            return DocumentRelationshipType.APPENDS;
        throw new IllegalArgumentException("Unknown DocumentRelationshipType code '" + codeString + "'");
    }

    public Enumeration<DocumentRelationshipType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("replaces".equals(codeString))
            return new Enumeration<DocumentRelationshipType>(this, DocumentRelationshipType.REPLACES);
        if ("transforms".equals(codeString))
            return new Enumeration<DocumentRelationshipType>(this, DocumentRelationshipType.TRANSFORMS);
        if ("signs".equals(codeString))
            return new Enumeration<DocumentRelationshipType>(this, DocumentRelationshipType.SIGNS);
        if ("appends".equals(codeString))
            return new Enumeration<DocumentRelationshipType>(this, DocumentRelationshipType.APPENDS);
        throw new FHIRException("Unknown DocumentRelationshipType code '" + codeString + "'");
    }

    public String toCode(DocumentRelationshipType code) {
        if (code == DocumentRelationshipType.REPLACES)
            return "replaces";
        if (code == DocumentRelationshipType.TRANSFORMS)
            return "transforms";
        if (code == DocumentRelationshipType.SIGNS)
            return "signs";
        if (code == DocumentRelationshipType.APPENDS)
            return "appends";
        return "?";
    }
}
