package org.hl7.fhir.android.generated.dstu2.GroupEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum GroupType {

    /**
     * Group contains "person" Patient resources
     */
    PERSON,
    /**
     * Group contains "animal" Patient resources
     */
    ANIMAL,
    /**
     * Group contains healthcare practitioner resources
     */
    PRACTITIONER,
    /**
     * Group contains Device resources
     */
    DEVICE,
    /**
     * Group contains Medication resources
     */
    MEDICATION,
    /**
     * Group contains Substance resources
     */
    SUBSTANCE,
    /**
     * added to help the parsers
     */
    NULL;

    public static GroupType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("person".equals(codeString))
            return PERSON;
        if ("animal".equals(codeString))
            return ANIMAL;
        if ("practitioner".equals(codeString))
            return PRACTITIONER;
        if ("device".equals(codeString))
            return DEVICE;
        if ("medication".equals(codeString))
            return MEDICATION;
        if ("substance".equals(codeString))
            return SUBSTANCE;
        throw new FHIRException("Unknown GroupType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PERSON:
                return "person";
            case ANIMAL:
                return "animal";
            case PRACTITIONER:
                return "practitioner";
            case DEVICE:
                return "device";
            case MEDICATION:
                return "medication";
            case SUBSTANCE:
                return "substance";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PERSON:
                return "http://hl7.org/fhir/group-type";
            case ANIMAL:
                return "http://hl7.org/fhir/group-type";
            case PRACTITIONER:
                return "http://hl7.org/fhir/group-type";
            case DEVICE:
                return "http://hl7.org/fhir/group-type";
            case MEDICATION:
                return "http://hl7.org/fhir/group-type";
            case SUBSTANCE:
                return "http://hl7.org/fhir/group-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PERSON:
                return "Group contains \"person\" Patient resources";
            case ANIMAL:
                return "Group contains \"animal\" Patient resources";
            case PRACTITIONER:
                return "Group contains healthcare practitioner resources";
            case DEVICE:
                return "Group contains Device resources";
            case MEDICATION:
                return "Group contains Medication resources";
            case SUBSTANCE:
                return "Group contains Substance resources";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PERSON:
                return "Person";
            case ANIMAL:
                return "Animal";
            case PRACTITIONER:
                return "Practitioner";
            case DEVICE:
                return "Device";
            case MEDICATION:
                return "Medication";
            case SUBSTANCE:
                return "Substance";
            default:
                return "?";
        }
    }
}
