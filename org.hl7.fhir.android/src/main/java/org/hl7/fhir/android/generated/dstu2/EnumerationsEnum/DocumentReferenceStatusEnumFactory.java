package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DocumentReferenceStatusEnumFactory implements EnumFactory<DocumentReferenceStatus> {

    public DocumentReferenceStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("current".equals(codeString))
            return DocumentReferenceStatus.CURRENT;
        if ("superseded".equals(codeString))
            return DocumentReferenceStatus.SUPERSEDED;
        if ("entered-in-error".equals(codeString))
            return DocumentReferenceStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown DocumentReferenceStatus code '" + codeString + "'");
    }

    public Enumeration<DocumentReferenceStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("current".equals(codeString))
            return new Enumeration<DocumentReferenceStatus>(this, DocumentReferenceStatus.CURRENT);
        if ("superseded".equals(codeString))
            return new Enumeration<DocumentReferenceStatus>(this, DocumentReferenceStatus.SUPERSEDED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<DocumentReferenceStatus>(this, DocumentReferenceStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown DocumentReferenceStatus code '" + codeString + "'");
    }

    public String toCode(DocumentReferenceStatus code) {
        if (code == DocumentReferenceStatus.CURRENT)
            return "current";
        if (code == DocumentReferenceStatus.SUPERSEDED)
            return "superseded";
        if (code == DocumentReferenceStatus.ENTEREDINERROR)
            return "entered-in-error";
        return "?";
    }
}
