package org.hl7.fhir.android.generated.dstu2.AppointmentResponseEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ParticipantStatusEnumFactory implements EnumFactory<ParticipantStatus> {

    public ParticipantStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("accepted".equals(codeString))
            return ParticipantStatus.ACCEPTED;
        if ("declined".equals(codeString))
            return ParticipantStatus.DECLINED;
        if ("tentative".equals(codeString))
            return ParticipantStatus.TENTATIVE;
        if ("in-process".equals(codeString))
            return ParticipantStatus.INPROCESS;
        if ("completed".equals(codeString))
            return ParticipantStatus.COMPLETED;
        if ("needs-action".equals(codeString))
            return ParticipantStatus.NEEDSACTION;
        throw new IllegalArgumentException("Unknown ParticipantStatus code '" + codeString + "'");
    }

    public Enumeration<ParticipantStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("accepted".equals(codeString))
            return new Enumeration<ParticipantStatus>(this, ParticipantStatus.ACCEPTED);
        if ("declined".equals(codeString))
            return new Enumeration<ParticipantStatus>(this, ParticipantStatus.DECLINED);
        if ("tentative".equals(codeString))
            return new Enumeration<ParticipantStatus>(this, ParticipantStatus.TENTATIVE);
        if ("in-process".equals(codeString))
            return new Enumeration<ParticipantStatus>(this, ParticipantStatus.INPROCESS);
        if ("completed".equals(codeString))
            return new Enumeration<ParticipantStatus>(this, ParticipantStatus.COMPLETED);
        if ("needs-action".equals(codeString))
            return new Enumeration<ParticipantStatus>(this, ParticipantStatus.NEEDSACTION);
        throw new FHIRException("Unknown ParticipantStatus code '" + codeString + "'");
    }

    public String toCode(ParticipantStatus code) {
        if (code == ParticipantStatus.ACCEPTED)
            return "accepted";
        if (code == ParticipantStatus.DECLINED)
            return "declined";
        if (code == ParticipantStatus.TENTATIVE)
            return "tentative";
        if (code == ParticipantStatus.INPROCESS)
            return "in-process";
        if (code == ParticipantStatus.COMPLETED)
            return "completed";
        if (code == ParticipantStatus.NEEDSACTION)
            return "needs-action";
        return "?";
    }
}
