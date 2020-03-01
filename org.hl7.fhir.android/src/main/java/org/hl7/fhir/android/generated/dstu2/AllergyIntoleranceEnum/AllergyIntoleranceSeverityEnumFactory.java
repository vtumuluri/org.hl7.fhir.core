package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AllergyIntoleranceSeverityEnumFactory implements EnumFactory<AllergyIntoleranceSeverity> {

    public AllergyIntoleranceSeverity fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("mild".equals(codeString))
            return AllergyIntoleranceSeverity.MILD;
        if ("moderate".equals(codeString))
            return AllergyIntoleranceSeverity.MODERATE;
        if ("severe".equals(codeString))
            return AllergyIntoleranceSeverity.SEVERE;
        throw new IllegalArgumentException("Unknown AllergyIntoleranceSeverity code '" + codeString + "'");
    }

    public Enumeration<AllergyIntoleranceSeverity> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("mild".equals(codeString))
            return new Enumeration<AllergyIntoleranceSeverity>(this, AllergyIntoleranceSeverity.MILD);
        if ("moderate".equals(codeString))
            return new Enumeration<AllergyIntoleranceSeverity>(this, AllergyIntoleranceSeverity.MODERATE);
        if ("severe".equals(codeString))
            return new Enumeration<AllergyIntoleranceSeverity>(this, AllergyIntoleranceSeverity.SEVERE);
        throw new FHIRException("Unknown AllergyIntoleranceSeverity code '" + codeString + "'");
    }

    public String toCode(AllergyIntoleranceSeverity code) {
        if (code == AllergyIntoleranceSeverity.MILD)
            return "mild";
        if (code == AllergyIntoleranceSeverity.MODERATE)
            return "moderate";
        if (code == AllergyIntoleranceSeverity.SEVERE)
            return "severe";
        return "?";
    }
}
