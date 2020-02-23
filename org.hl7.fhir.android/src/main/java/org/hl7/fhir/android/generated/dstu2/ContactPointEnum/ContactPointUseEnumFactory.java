package org.hl7.fhir.android.generated.dstu2.ContactPointEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ContactPointUseEnumFactory implements EnumFactory<ContactPointUse> {

    public ContactPointUse fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("home".equals(codeString))
            return ContactPointUse.HOME;
        if ("work".equals(codeString))
            return ContactPointUse.WORK;
        if ("temp".equals(codeString))
            return ContactPointUse.TEMP;
        if ("old".equals(codeString))
            return ContactPointUse.OLD;
        if ("mobile".equals(codeString))
            return ContactPointUse.MOBILE;
        throw new IllegalArgumentException("Unknown ContactPointUse code '" + codeString + "'");
    }

    public Enumeration<ContactPointUse> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("home".equals(codeString))
            return new Enumeration<ContactPointUse>(this, ContactPointUse.HOME);
        if ("work".equals(codeString))
            return new Enumeration<ContactPointUse>(this, ContactPointUse.WORK);
        if ("temp".equals(codeString))
            return new Enumeration<ContactPointUse>(this, ContactPointUse.TEMP);
        if ("old".equals(codeString))
            return new Enumeration<ContactPointUse>(this, ContactPointUse.OLD);
        if ("mobile".equals(codeString))
            return new Enumeration<ContactPointUse>(this, ContactPointUse.MOBILE);
        throw new FHIRException("Unknown ContactPointUse code '" + codeString + "'");
    }

    public String toCode(ContactPointUse code) {
        if (code == ContactPointUse.HOME)
            return "home";
        if (code == ContactPointUse.WORK)
            return "work";
        if (code == ContactPointUse.TEMP)
            return "temp";
        if (code == ContactPointUse.OLD)
            return "old";
        if (code == ContactPointUse.MOBILE)
            return "mobile";
        return "?";
    }
}
