package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class MessageSignificanceCategoryEnumFactory implements EnumFactory<MessageSignificanceCategory> {

    public MessageSignificanceCategory fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Consequence".equals(codeString))
            return MessageSignificanceCategory.CONSEQUENCE;
        if ("Currency".equals(codeString))
            return MessageSignificanceCategory.CURRENCY;
        if ("Notification".equals(codeString))
            return MessageSignificanceCategory.NOTIFICATION;
        throw new IllegalArgumentException("Unknown MessageSignificanceCategory code '" + codeString + "'");
    }

    public Enumeration<MessageSignificanceCategory> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("Consequence".equals(codeString))
            return new Enumeration<MessageSignificanceCategory>(this, MessageSignificanceCategory.CONSEQUENCE);
        if ("Currency".equals(codeString))
            return new Enumeration<MessageSignificanceCategory>(this, MessageSignificanceCategory.CURRENCY);
        if ("Notification".equals(codeString))
            return new Enumeration<MessageSignificanceCategory>(this, MessageSignificanceCategory.NOTIFICATION);
        throw new FHIRException("Unknown MessageSignificanceCategory code '" + codeString + "'");
    }

    public String toCode(MessageSignificanceCategory code) {
        if (code == MessageSignificanceCategory.CONSEQUENCE)
            return "Consequence";
        if (code == MessageSignificanceCategory.CURRENCY)
            return "Currency";
        if (code == MessageSignificanceCategory.NOTIFICATION)
            return "Notification";
        return "?";
    }
}
