package org.hl7.fhir.android.generated.dstu2.EpisodeOfCareEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class EpisodeOfCareStatusEnumFactory implements EnumFactory<EpisodeOfCareStatus> {

    public EpisodeOfCareStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("planned".equals(codeString))
            return EpisodeOfCareStatus.PLANNED;
        if ("waitlist".equals(codeString))
            return EpisodeOfCareStatus.WAITLIST;
        if ("active".equals(codeString))
            return EpisodeOfCareStatus.ACTIVE;
        if ("onhold".equals(codeString))
            return EpisodeOfCareStatus.ONHOLD;
        if ("finished".equals(codeString))
            return EpisodeOfCareStatus.FINISHED;
        if ("cancelled".equals(codeString))
            return EpisodeOfCareStatus.CANCELLED;
        throw new IllegalArgumentException("Unknown EpisodeOfCareStatus code '" + codeString + "'");
    }

    public Enumeration<EpisodeOfCareStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("planned".equals(codeString))
            return new Enumeration<EpisodeOfCareStatus>(this, EpisodeOfCareStatus.PLANNED);
        if ("waitlist".equals(codeString))
            return new Enumeration<EpisodeOfCareStatus>(this, EpisodeOfCareStatus.WAITLIST);
        if ("active".equals(codeString))
            return new Enumeration<EpisodeOfCareStatus>(this, EpisodeOfCareStatus.ACTIVE);
        if ("onhold".equals(codeString))
            return new Enumeration<EpisodeOfCareStatus>(this, EpisodeOfCareStatus.ONHOLD);
        if ("finished".equals(codeString))
            return new Enumeration<EpisodeOfCareStatus>(this, EpisodeOfCareStatus.FINISHED);
        if ("cancelled".equals(codeString))
            return new Enumeration<EpisodeOfCareStatus>(this, EpisodeOfCareStatus.CANCELLED);
        throw new FHIRException("Unknown EpisodeOfCareStatus code '" + codeString + "'");
    }

    public String toCode(EpisodeOfCareStatus code) {
        if (code == EpisodeOfCareStatus.PLANNED)
            return "planned";
        if (code == EpisodeOfCareStatus.WAITLIST)
            return "waitlist";
        if (code == EpisodeOfCareStatus.ACTIVE)
            return "active";
        if (code == EpisodeOfCareStatus.ONHOLD)
            return "onhold";
        if (code == EpisodeOfCareStatus.FINISHED)
            return "finished";
        if (code == EpisodeOfCareStatus.CANCELLED)
            return "cancelled";
        return "?";
    }
}
