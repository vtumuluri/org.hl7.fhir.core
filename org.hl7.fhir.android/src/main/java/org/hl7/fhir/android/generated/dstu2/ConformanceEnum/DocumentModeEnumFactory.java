package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DocumentModeEnumFactory implements EnumFactory<DocumentMode> {

    public DocumentMode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("producer".equals(codeString))
            return DocumentMode.PRODUCER;
        if ("consumer".equals(codeString))
            return DocumentMode.CONSUMER;
        throw new IllegalArgumentException("Unknown DocumentMode code '" + codeString + "'");
    }

    public Enumeration<DocumentMode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("producer".equals(codeString))
            return new Enumeration<DocumentMode>(this, DocumentMode.PRODUCER);
        if ("consumer".equals(codeString))
            return new Enumeration<DocumentMode>(this, DocumentMode.CONSUMER);
        throw new FHIRException("Unknown DocumentMode code '" + codeString + "'");
    }

    public String toCode(DocumentMode code) {
        if (code == DocumentMode.PRODUCER)
            return "producer";
        if (code == DocumentMode.CONSUMER)
            return "consumer";
        return "?";
    }
}
