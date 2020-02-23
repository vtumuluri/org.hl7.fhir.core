package org.hl7.fhir.android.generated.dstu2.GroupEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class GroupTypeEnumFactory implements EnumFactory<GroupType> {

    public GroupType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("person".equals(codeString))
            return GroupType.PERSON;
        if ("animal".equals(codeString))
            return GroupType.ANIMAL;
        if ("practitioner".equals(codeString))
            return GroupType.PRACTITIONER;
        if ("device".equals(codeString))
            return GroupType.DEVICE;
        if ("medication".equals(codeString))
            return GroupType.MEDICATION;
        if ("substance".equals(codeString))
            return GroupType.SUBSTANCE;
        throw new IllegalArgumentException("Unknown GroupType code '" + codeString + "'");
    }

    public Enumeration<GroupType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("person".equals(codeString))
            return new Enumeration<GroupType>(this, GroupType.PERSON);
        if ("animal".equals(codeString))
            return new Enumeration<GroupType>(this, GroupType.ANIMAL);
        if ("practitioner".equals(codeString))
            return new Enumeration<GroupType>(this, GroupType.PRACTITIONER);
        if ("device".equals(codeString))
            return new Enumeration<GroupType>(this, GroupType.DEVICE);
        if ("medication".equals(codeString))
            return new Enumeration<GroupType>(this, GroupType.MEDICATION);
        if ("substance".equals(codeString))
            return new Enumeration<GroupType>(this, GroupType.SUBSTANCE);
        throw new FHIRException("Unknown GroupType code '" + codeString + "'");
    }

    public String toCode(GroupType code) {
        if (code == GroupType.PERSON)
            return "person";
        if (code == GroupType.ANIMAL)
            return "animal";
        if (code == GroupType.PRACTITIONER)
            return "practitioner";
        if (code == GroupType.DEVICE)
            return "device";
        if (code == GroupType.MEDICATION)
            return "medication";
        if (code == GroupType.SUBSTANCE)
            return "substance";
        return "?";
    }
}
