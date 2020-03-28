package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AllergyIntoleranceCriticalityEnumFactory implements EnumFactory<AllergyIntoleranceCriticality> {

    public AllergyIntoleranceCriticality fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("CRITL".equals(codeString))
            return AllergyIntoleranceCriticality.CRITL;
        if ("CRITH".equals(codeString))
            return AllergyIntoleranceCriticality.CRITH;
        if ("CRITU".equals(codeString))
            return AllergyIntoleranceCriticality.CRITU;
        throw new IllegalArgumentException("Unknown AllergyIntoleranceCriticality code '" + codeString + "'");
    }

    public Enumeration<AllergyIntoleranceCriticality> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("CRITL".equals(codeString))
            return new Enumeration<AllergyIntoleranceCriticality>(this, AllergyIntoleranceCriticality.CRITL);
        if ("CRITH".equals(codeString))
            return new Enumeration<AllergyIntoleranceCriticality>(this, AllergyIntoleranceCriticality.CRITH);
        if ("CRITU".equals(codeString))
            return new Enumeration<AllergyIntoleranceCriticality>(this, AllergyIntoleranceCriticality.CRITU);
        throw new FHIRException("Unknown AllergyIntoleranceCriticality code '" + codeString + "'");
    }

    public String toCode(AllergyIntoleranceCriticality code) {
        if (code == AllergyIntoleranceCriticality.CRITL)
            return "CRITL";
        if (code == AllergyIntoleranceCriticality.CRITH)
            return "CRITH";
        if (code == AllergyIntoleranceCriticality.CRITU)
            return "CRITU";
        return "?";
    }
}
