package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AllergyIntoleranceCertaintyEnumFactory implements EnumFactory<AllergyIntoleranceCertainty> {

    public AllergyIntoleranceCertainty fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("unlikely".equals(codeString))
            return AllergyIntoleranceCertainty.UNLIKELY;
        if ("likely".equals(codeString))
            return AllergyIntoleranceCertainty.LIKELY;
        if ("confirmed".equals(codeString))
            return AllergyIntoleranceCertainty.CONFIRMED;
        throw new IllegalArgumentException("Unknown AllergyIntoleranceCertainty code '" + codeString + "'");
    }

    public Enumeration<AllergyIntoleranceCertainty> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("unlikely".equals(codeString))
            return new Enumeration<AllergyIntoleranceCertainty>(this, AllergyIntoleranceCertainty.UNLIKELY);
        if ("likely".equals(codeString))
            return new Enumeration<AllergyIntoleranceCertainty>(this, AllergyIntoleranceCertainty.LIKELY);
        if ("confirmed".equals(codeString))
            return new Enumeration<AllergyIntoleranceCertainty>(this, AllergyIntoleranceCertainty.CONFIRMED);
        throw new FHIRException("Unknown AllergyIntoleranceCertainty code '" + codeString + "'");
    }

    public String toCode(AllergyIntoleranceCertainty code) {
        if (code == AllergyIntoleranceCertainty.UNLIKELY)
            return "unlikely";
        if (code == AllergyIntoleranceCertainty.LIKELY)
            return "likely";
        if (code == AllergyIntoleranceCertainty.CONFIRMED)
            return "confirmed";
        return "?";
    }
}
