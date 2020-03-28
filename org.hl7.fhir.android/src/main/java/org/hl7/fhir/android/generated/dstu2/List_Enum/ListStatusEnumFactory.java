package org.hl7.fhir.android.generated.dstu2.List_Enum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ListStatusEnumFactory implements EnumFactory<ListStatus> {

    public ListStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("current".equals(codeString))
            return ListStatus.CURRENT;
        if ("retired".equals(codeString))
            return ListStatus.RETIRED;
        if ("entered-in-error".equals(codeString))
            return ListStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown ListStatus code '" + codeString + "'");
    }

    public Enumeration<ListStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("current".equals(codeString))
            return new Enumeration<ListStatus>(this, ListStatus.CURRENT);
        if ("retired".equals(codeString))
            return new Enumeration<ListStatus>(this, ListStatus.RETIRED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<ListStatus>(this, ListStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown ListStatus code '" + codeString + "'");
    }

    public String toCode(ListStatus code) {
        if (code == ListStatus.CURRENT)
            return "current";
        if (code == ListStatus.RETIRED)
            return "retired";
        if (code == ListStatus.ENTEREDINERROR)
            return "entered-in-error";
        return "?";
    }
}
