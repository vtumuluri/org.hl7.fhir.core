package org.hl7.fhir.android.generated.dstu2.NarrativeEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class NarrativeStatusEnumFactory implements EnumFactory<NarrativeStatus> {

    public NarrativeStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("generated".equals(codeString))
            return NarrativeStatus.GENERATED;
        if ("extensions".equals(codeString))
            return NarrativeStatus.EXTENSIONS;
        if ("additional".equals(codeString))
            return NarrativeStatus.ADDITIONAL;
        if ("empty".equals(codeString))
            return NarrativeStatus.EMPTY;
        throw new IllegalArgumentException("Unknown NarrativeStatus code '" + codeString + "'");
    }

    public Enumeration<NarrativeStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("generated".equals(codeString))
            return new Enumeration<NarrativeStatus>(this, NarrativeStatus.GENERATED);
        if ("extensions".equals(codeString))
            return new Enumeration<NarrativeStatus>(this, NarrativeStatus.EXTENSIONS);
        if ("additional".equals(codeString))
            return new Enumeration<NarrativeStatus>(this, NarrativeStatus.ADDITIONAL);
        if ("empty".equals(codeString))
            return new Enumeration<NarrativeStatus>(this, NarrativeStatus.EMPTY);
        throw new FHIRException("Unknown NarrativeStatus code '" + codeString + "'");
    }

    public String toCode(NarrativeStatus code) {
        if (code == NarrativeStatus.GENERATED)
            return "generated";
        if (code == NarrativeStatus.EXTENSIONS)
            return "extensions";
        if (code == NarrativeStatus.ADDITIONAL)
            return "additional";
        if (code == NarrativeStatus.EMPTY)
            return "empty";
        return "?";
    }
}
