package org.hl7.fhir.android.generated.dstu2.SubscriptionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SubscriptionStatusEnumFactory implements EnumFactory<SubscriptionStatus> {

    public SubscriptionStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("requested".equals(codeString))
            return SubscriptionStatus.REQUESTED;
        if ("active".equals(codeString))
            return SubscriptionStatus.ACTIVE;
        if ("error".equals(codeString))
            return SubscriptionStatus.ERROR;
        if ("off".equals(codeString))
            return SubscriptionStatus.OFF;
        throw new IllegalArgumentException("Unknown SubscriptionStatus code '" + codeString + "'");
    }

    public Enumeration<SubscriptionStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("requested".equals(codeString))
            return new Enumeration<SubscriptionStatus>(this, SubscriptionStatus.REQUESTED);
        if ("active".equals(codeString))
            return new Enumeration<SubscriptionStatus>(this, SubscriptionStatus.ACTIVE);
        if ("error".equals(codeString))
            return new Enumeration<SubscriptionStatus>(this, SubscriptionStatus.ERROR);
        if ("off".equals(codeString))
            return new Enumeration<SubscriptionStatus>(this, SubscriptionStatus.OFF);
        throw new FHIRException("Unknown SubscriptionStatus code '" + codeString + "'");
    }

    public String toCode(SubscriptionStatus code) {
        if (code == SubscriptionStatus.REQUESTED)
            return "requested";
        if (code == SubscriptionStatus.ACTIVE)
            return "active";
        if (code == SubscriptionStatus.ERROR)
            return "error";
        if (code == SubscriptionStatus.OFF)
            return "off";
        return "?";
    }
}
