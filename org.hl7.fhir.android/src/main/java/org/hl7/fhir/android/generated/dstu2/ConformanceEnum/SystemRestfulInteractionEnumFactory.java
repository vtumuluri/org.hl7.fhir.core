package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SystemRestfulInteractionEnumFactory implements EnumFactory<SystemRestfulInteraction> {

    public SystemRestfulInteraction fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("transaction".equals(codeString))
            return SystemRestfulInteraction.TRANSACTION;
        if ("search-system".equals(codeString))
            return SystemRestfulInteraction.SEARCHSYSTEM;
        if ("history-system".equals(codeString))
            return SystemRestfulInteraction.HISTORYSYSTEM;
        throw new IllegalArgumentException("Unknown SystemRestfulInteraction code '" + codeString + "'");
    }

    public Enumeration<SystemRestfulInteraction> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("transaction".equals(codeString))
            return new Enumeration<SystemRestfulInteraction>(this, SystemRestfulInteraction.TRANSACTION);
        if ("search-system".equals(codeString))
            return new Enumeration<SystemRestfulInteraction>(this, SystemRestfulInteraction.SEARCHSYSTEM);
        if ("history-system".equals(codeString))
            return new Enumeration<SystemRestfulInteraction>(this, SystemRestfulInteraction.HISTORYSYSTEM);
        throw new FHIRException("Unknown SystemRestfulInteraction code '" + codeString + "'");
    }

    public String toCode(SystemRestfulInteraction code) {
        if (code == SystemRestfulInteraction.TRANSACTION)
            return "transaction";
        if (code == SystemRestfulInteraction.SEARCHSYSTEM)
            return "search-system";
        if (code == SystemRestfulInteraction.HISTORYSYSTEM)
            return "history-system";
        return "?";
    }
}
