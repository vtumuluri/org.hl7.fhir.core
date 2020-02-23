package org.hl7.fhir.android.generated.dstu2.SubscriptionEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class SubscriptionChannelTypeEnumFactory implements EnumFactory<SubscriptionChannelType> {

    public SubscriptionChannelType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("rest-hook".equals(codeString))
            return SubscriptionChannelType.RESTHOOK;
        if ("websocket".equals(codeString))
            return SubscriptionChannelType.WEBSOCKET;
        if ("email".equals(codeString))
            return SubscriptionChannelType.EMAIL;
        if ("sms".equals(codeString))
            return SubscriptionChannelType.SMS;
        if ("message".equals(codeString))
            return SubscriptionChannelType.MESSAGE;
        throw new IllegalArgumentException("Unknown SubscriptionChannelType code '" + codeString + "'");
    }

    public Enumeration<SubscriptionChannelType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("rest-hook".equals(codeString))
            return new Enumeration<SubscriptionChannelType>(this, SubscriptionChannelType.RESTHOOK);
        if ("websocket".equals(codeString))
            return new Enumeration<SubscriptionChannelType>(this, SubscriptionChannelType.WEBSOCKET);
        if ("email".equals(codeString))
            return new Enumeration<SubscriptionChannelType>(this, SubscriptionChannelType.EMAIL);
        if ("sms".equals(codeString))
            return new Enumeration<SubscriptionChannelType>(this, SubscriptionChannelType.SMS);
        if ("message".equals(codeString))
            return new Enumeration<SubscriptionChannelType>(this, SubscriptionChannelType.MESSAGE);
        throw new FHIRException("Unknown SubscriptionChannelType code '" + codeString + "'");
    }

    public String toCode(SubscriptionChannelType code) {
        if (code == SubscriptionChannelType.RESTHOOK)
            return "rest-hook";
        if (code == SubscriptionChannelType.WEBSOCKET)
            return "websocket";
        if (code == SubscriptionChannelType.EMAIL)
            return "email";
        if (code == SubscriptionChannelType.SMS)
            return "sms";
        if (code == SubscriptionChannelType.MESSAGE)
            return "message";
        return "?";
    }
}
