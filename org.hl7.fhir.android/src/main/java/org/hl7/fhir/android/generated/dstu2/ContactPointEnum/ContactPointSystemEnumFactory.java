package org.hl7.fhir.android.generated.dstu2.ContactPointEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ContactPointSystemEnumFactory implements EnumFactory<ContactPointSystem> {

    public ContactPointSystem fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("phone".equals(codeString))
            return ContactPointSystem.PHONE;
        if ("fax".equals(codeString))
            return ContactPointSystem.FAX;
        if ("email".equals(codeString))
            return ContactPointSystem.EMAIL;
        if ("pager".equals(codeString))
            return ContactPointSystem.PAGER;
        if ("other".equals(codeString))
            return ContactPointSystem.OTHER;
        throw new IllegalArgumentException("Unknown ContactPointSystem code '" + codeString + "'");
    }

    public Enumeration<ContactPointSystem> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("phone".equals(codeString))
            return new Enumeration<ContactPointSystem>(this, ContactPointSystem.PHONE);
        if ("fax".equals(codeString))
            return new Enumeration<ContactPointSystem>(this, ContactPointSystem.FAX);
        if ("email".equals(codeString))
            return new Enumeration<ContactPointSystem>(this, ContactPointSystem.EMAIL);
        if ("pager".equals(codeString))
            return new Enumeration<ContactPointSystem>(this, ContactPointSystem.PAGER);
        if ("other".equals(codeString))
            return new Enumeration<ContactPointSystem>(this, ContactPointSystem.OTHER);
        throw new FHIRException("Unknown ContactPointSystem code '" + codeString + "'");
    }

    public String toCode(ContactPointSystem code) {
        if (code == ContactPointSystem.PHONE)
            return "phone";
        if (code == ContactPointSystem.FAX)
            return "fax";
        if (code == ContactPointSystem.EMAIL)
            return "email";
        if (code == ContactPointSystem.PAGER)
            return "pager";
        if (code == ContactPointSystem.OTHER)
            return "other";
        return "?";
    }
}
