package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class NoteTypeEnumFactory implements EnumFactory<NoteType> {

    public NoteType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("display".equals(codeString))
            return NoteType.DISPLAY;
        if ("print".equals(codeString))
            return NoteType.PRINT;
        if ("printoper".equals(codeString))
            return NoteType.PRINTOPER;
        throw new IllegalArgumentException("Unknown NoteType code '" + codeString + "'");
    }

    public Enumeration<NoteType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("display".equals(codeString))
            return new Enumeration<NoteType>(this, NoteType.DISPLAY);
        if ("print".equals(codeString))
            return new Enumeration<NoteType>(this, NoteType.PRINT);
        if ("printoper".equals(codeString))
            return new Enumeration<NoteType>(this, NoteType.PRINTOPER);
        throw new FHIRException("Unknown NoteType code '" + codeString + "'");
    }

    public String toCode(NoteType code) {
        if (code == NoteType.DISPLAY)
            return "display";
        if (code == NoteType.PRINT)
            return "print";
        if (code == NoteType.PRINTOPER)
            return "printoper";
        return "?";
    }
}
