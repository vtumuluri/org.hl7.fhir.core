package org.hl7.fhir.android.generated.dstu2.ReferralRequestEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ReferralStatusEnumFactory implements EnumFactory<ReferralStatus> {

    public ReferralStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
            return ReferralStatus.DRAFT;
        if ("requested".equals(codeString))
            return ReferralStatus.REQUESTED;
        if ("active".equals(codeString))
            return ReferralStatus.ACTIVE;
        if ("cancelled".equals(codeString))
            return ReferralStatus.CANCELLED;
        if ("accepted".equals(codeString))
            return ReferralStatus.ACCEPTED;
        if ("rejected".equals(codeString))
            return ReferralStatus.REJECTED;
        if ("completed".equals(codeString))
            return ReferralStatus.COMPLETED;
        throw new IllegalArgumentException("Unknown ReferralStatus code '" + codeString + "'");
    }

    public Enumeration<ReferralStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("draft".equals(codeString))
            return new Enumeration<ReferralStatus>(this, ReferralStatus.DRAFT);
        if ("requested".equals(codeString))
            return new Enumeration<ReferralStatus>(this, ReferralStatus.REQUESTED);
        if ("active".equals(codeString))
            return new Enumeration<ReferralStatus>(this, ReferralStatus.ACTIVE);
        if ("cancelled".equals(codeString))
            return new Enumeration<ReferralStatus>(this, ReferralStatus.CANCELLED);
        if ("accepted".equals(codeString))
            return new Enumeration<ReferralStatus>(this, ReferralStatus.ACCEPTED);
        if ("rejected".equals(codeString))
            return new Enumeration<ReferralStatus>(this, ReferralStatus.REJECTED);
        if ("completed".equals(codeString))
            return new Enumeration<ReferralStatus>(this, ReferralStatus.COMPLETED);
        throw new FHIRException("Unknown ReferralStatus code '" + codeString + "'");
    }

    public String toCode(ReferralStatus code) {
        if (code == ReferralStatus.DRAFT)
            return "draft";
        if (code == ReferralStatus.REQUESTED)
            return "requested";
        if (code == ReferralStatus.ACTIVE)
            return "active";
        if (code == ReferralStatus.CANCELLED)
            return "cancelled";
        if (code == ReferralStatus.ACCEPTED)
            return "accepted";
        if (code == ReferralStatus.REJECTED)
            return "rejected";
        if (code == ReferralStatus.COMPLETED)
            return "completed";
        return "?";
    }
}
