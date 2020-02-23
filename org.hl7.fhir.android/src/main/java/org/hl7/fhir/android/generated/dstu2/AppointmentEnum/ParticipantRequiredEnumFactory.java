package org.hl7.fhir.android.generated.dstu2.AppointmentEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ParticipantRequiredEnumFactory implements EnumFactory<ParticipantRequired> {

    public ParticipantRequired fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("required".equals(codeString))
            return ParticipantRequired.REQUIRED;
        if ("optional".equals(codeString))
            return ParticipantRequired.OPTIONAL;
        if ("information-only".equals(codeString))
            return ParticipantRequired.INFORMATIONONLY;
        throw new IllegalArgumentException("Unknown ParticipantRequired code '" + codeString + "'");
    }

    public Enumeration<ParticipantRequired> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("required".equals(codeString))
            return new Enumeration<ParticipantRequired>(this, ParticipantRequired.REQUIRED);
        if ("optional".equals(codeString))
            return new Enumeration<ParticipantRequired>(this, ParticipantRequired.OPTIONAL);
        if ("information-only".equals(codeString))
            return new Enumeration<ParticipantRequired>(this, ParticipantRequired.INFORMATIONONLY);
        throw new FHIRException("Unknown ParticipantRequired code '" + codeString + "'");
    }

    public String toCode(ParticipantRequired code) {
        if (code == ParticipantRequired.REQUIRED)
            return "required";
        if (code == ParticipantRequired.OPTIONAL)
            return "optional";
        if (code == ParticipantRequired.INFORMATIONONLY)
            return "information-only";
        return "?";
    }
}
