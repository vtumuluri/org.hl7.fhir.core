package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AllergyIntoleranceStatusEnumFactory implements EnumFactory<AllergyIntoleranceStatus> {

    public AllergyIntoleranceStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
            return AllergyIntoleranceStatus.ACTIVE;
        if ("unconfirmed".equals(codeString))
            return AllergyIntoleranceStatus.UNCONFIRMED;
        if ("confirmed".equals(codeString))
            return AllergyIntoleranceStatus.CONFIRMED;
        if ("inactive".equals(codeString))
            return AllergyIntoleranceStatus.INACTIVE;
        if ("resolved".equals(codeString))
            return AllergyIntoleranceStatus.RESOLVED;
        if ("refuted".equals(codeString))
            return AllergyIntoleranceStatus.REFUTED;
        if ("entered-in-error".equals(codeString))
            return AllergyIntoleranceStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown AllergyIntoleranceStatus code '" + codeString + "'");
    }

    public Enumeration<AllergyIntoleranceStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return new Enumeration<AllergyIntoleranceStatus>(this, AllergyIntoleranceStatus.ACTIVE);
        if ("unconfirmed".equals(codeString))
            return new Enumeration<AllergyIntoleranceStatus>(this, AllergyIntoleranceStatus.UNCONFIRMED);
        if ("confirmed".equals(codeString))
            return new Enumeration<AllergyIntoleranceStatus>(this, AllergyIntoleranceStatus.CONFIRMED);
        if ("inactive".equals(codeString))
            return new Enumeration<AllergyIntoleranceStatus>(this, AllergyIntoleranceStatus.INACTIVE);
        if ("resolved".equals(codeString))
            return new Enumeration<AllergyIntoleranceStatus>(this, AllergyIntoleranceStatus.RESOLVED);
        if ("refuted".equals(codeString))
            return new Enumeration<AllergyIntoleranceStatus>(this, AllergyIntoleranceStatus.REFUTED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<AllergyIntoleranceStatus>(this, AllergyIntoleranceStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown AllergyIntoleranceStatus code '" + codeString + "'");
    }

    public String toCode(AllergyIntoleranceStatus code) {
        if (code == AllergyIntoleranceStatus.ACTIVE)
            return "active";
        if (code == AllergyIntoleranceStatus.UNCONFIRMED)
            return "unconfirmed";
        if (code == AllergyIntoleranceStatus.CONFIRMED)
            return "confirmed";
        if (code == AllergyIntoleranceStatus.INACTIVE)
            return "inactive";
        if (code == AllergyIntoleranceStatus.RESOLVED)
            return "resolved";
        if (code == AllergyIntoleranceStatus.REFUTED)
            return "refuted";
        if (code == AllergyIntoleranceStatus.ENTEREDINERROR)
            return "entered-in-error";
        return "?";
    }
}
