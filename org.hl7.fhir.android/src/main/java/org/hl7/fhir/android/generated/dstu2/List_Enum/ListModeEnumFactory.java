package org.hl7.fhir.android.generated.dstu2.List_Enum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ListModeEnumFactory implements EnumFactory<ListMode> {

    public ListMode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("working".equals(codeString))
            return ListMode.WORKING;
        if ("snapshot".equals(codeString))
            return ListMode.SNAPSHOT;
        if ("changes".equals(codeString))
            return ListMode.CHANGES;
        throw new IllegalArgumentException("Unknown ListMode code '" + codeString + "'");
    }

    public Enumeration<ListMode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("working".equals(codeString))
            return new Enumeration<ListMode>(this, ListMode.WORKING);
        if ("snapshot".equals(codeString))
            return new Enumeration<ListMode>(this, ListMode.SNAPSHOT);
        if ("changes".equals(codeString))
            return new Enumeration<ListMode>(this, ListMode.CHANGES);
        throw new FHIRException("Unknown ListMode code '" + codeString + "'");
    }

    public String toCode(ListMode code) {
        if (code == ListMode.WORKING)
            return "working";
        if (code == ListMode.SNAPSHOT)
            return "snapshot";
        if (code == ListMode.CHANGES)
            return "changes";
        return "?";
    }
}
