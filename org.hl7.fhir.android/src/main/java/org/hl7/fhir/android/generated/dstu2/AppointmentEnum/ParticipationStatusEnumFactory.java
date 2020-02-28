package org.hl7.fhir.android.generated.dstu2.AppointmentEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ParticipationStatusEnumFactory implements EnumFactory<ParticipationStatus> {

    public ParticipationStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("accepted".equals(codeString))
            return ParticipationStatus.ACCEPTED;
        if ("declined".equals(codeString))
            return ParticipationStatus.DECLINED;
        if ("tentative".equals(codeString))
            return ParticipationStatus.TENTATIVE;
        if ("needs-action".equals(codeString))
            return ParticipationStatus.NEEDSACTION;
        throw new IllegalArgumentException("Unknown ParticipationStatus code '" + codeString + "'");
    }

    public Enumeration<ParticipationStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("accepted".equals(codeString))
            return new Enumeration<ParticipationStatus>(this, ParticipationStatus.ACCEPTED);
        if ("declined".equals(codeString))
            return new Enumeration<ParticipationStatus>(this, ParticipationStatus.DECLINED);
        if ("tentative".equals(codeString))
            return new Enumeration<ParticipationStatus>(this, ParticipationStatus.TENTATIVE);
        if ("needs-action".equals(codeString))
            return new Enumeration<ParticipationStatus>(this, ParticipationStatus.NEEDSACTION);
        throw new FHIRException("Unknown ParticipationStatus code '" + codeString + "'");
    }

    public String toCode(ParticipationStatus code) {
        if (code == ParticipationStatus.ACCEPTED)
            return "accepted";
        if (code == ParticipationStatus.DECLINED)
            return "declined";
        if (code == ParticipationStatus.TENTATIVE)
            return "tentative";
        if (code == ParticipationStatus.NEEDSACTION)
            return "needs-action";
        return "?";
    }
}
