package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class TypeRestfulInteractionEnumFactory implements EnumFactory<TypeRestfulInteraction> {

    public TypeRestfulInteraction fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("read".equals(codeString))
            return TypeRestfulInteraction.READ;
        if ("vread".equals(codeString))
            return TypeRestfulInteraction.VREAD;
        if ("update".equals(codeString))
            return TypeRestfulInteraction.UPDATE;
        if ("delete".equals(codeString))
            return TypeRestfulInteraction.DELETE;
        if ("history-instance".equals(codeString))
            return TypeRestfulInteraction.HISTORYINSTANCE;
        if ("validate".equals(codeString))
            return TypeRestfulInteraction.VALIDATE;
        if ("history-type".equals(codeString))
            return TypeRestfulInteraction.HISTORYTYPE;
        if ("create".equals(codeString))
            return TypeRestfulInteraction.CREATE;
        if ("search-type".equals(codeString))
            return TypeRestfulInteraction.SEARCHTYPE;
        throw new IllegalArgumentException("Unknown TypeRestfulInteraction code '" + codeString + "'");
    }

    public Enumeration<TypeRestfulInteraction> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("read".equals(codeString))
            return new Enumeration<TypeRestfulInteraction>(this, TypeRestfulInteraction.READ);
        if ("vread".equals(codeString))
            return new Enumeration<TypeRestfulInteraction>(this, TypeRestfulInteraction.VREAD);
        if ("update".equals(codeString))
            return new Enumeration<TypeRestfulInteraction>(this, TypeRestfulInteraction.UPDATE);
        if ("delete".equals(codeString))
            return new Enumeration<TypeRestfulInteraction>(this, TypeRestfulInteraction.DELETE);
        if ("history-instance".equals(codeString))
            return new Enumeration<TypeRestfulInteraction>(this, TypeRestfulInteraction.HISTORYINSTANCE);
        if ("validate".equals(codeString))
            return new Enumeration<TypeRestfulInteraction>(this, TypeRestfulInteraction.VALIDATE);
        if ("history-type".equals(codeString))
            return new Enumeration<TypeRestfulInteraction>(this, TypeRestfulInteraction.HISTORYTYPE);
        if ("create".equals(codeString))
            return new Enumeration<TypeRestfulInteraction>(this, TypeRestfulInteraction.CREATE);
        if ("search-type".equals(codeString))
            return new Enumeration<TypeRestfulInteraction>(this, TypeRestfulInteraction.SEARCHTYPE);
        throw new FHIRException("Unknown TypeRestfulInteraction code '" + codeString + "'");
    }

    public String toCode(TypeRestfulInteraction code) {
        if (code == TypeRestfulInteraction.READ)
            return "read";
        if (code == TypeRestfulInteraction.VREAD)
            return "vread";
        if (code == TypeRestfulInteraction.UPDATE)
            return "update";
        if (code == TypeRestfulInteraction.DELETE)
            return "delete";
        if (code == TypeRestfulInteraction.HISTORYINSTANCE)
            return "history-instance";
        if (code == TypeRestfulInteraction.VALIDATE)
            return "validate";
        if (code == TypeRestfulInteraction.HISTORYTYPE)
            return "history-type";
        if (code == TypeRestfulInteraction.CREATE)
            return "create";
        if (code == TypeRestfulInteraction.SEARCHTYPE)
            return "search-type";
        return "?";
    }
}
