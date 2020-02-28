package org.hl7.fhir.android.generated.dstu2.HumanNameEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum NameUse {

    /**
     * Known as/conventional/the one you normally use
     */
    USUAL,
    /**
     * The formal name as registered in an official (government) registry, but which name might not be commonly used. May be called "legal name".
     */
    OFFICIAL,
    /**
     * A temporary name. Name.period can provide more detailed information. This may also be used for temporary names assigned at birth or in emergency situations.
     */
    TEMP,
    /**
     * A name that is used to address the person in an informal manner, but is not part of their formal or usual name
     */
    NICKNAME,
    /**
     * Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons)
     */
    ANONYMOUS,
    /**
     * This name is no longer in use (or was never correct, but retained for records)
     */
    OLD,
    /**
     * A name used prior to marriage. Marriage naming customs vary greatly around the world. This name use is for use by applications that collect and store "maiden" names. Though the concept of maiden name is often gender specific, the use of this term is not gender specific. The use of this term does not imply any particular history for a person's name, nor should the maiden name be determined algorithmically.
     */
    MAIDEN,
    /**
     * added to help the parsers
     */
    NULL;

    public static NameUse fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("usual".equals(codeString))
            return USUAL;
        if ("official".equals(codeString))
            return OFFICIAL;
        if ("temp".equals(codeString))
            return TEMP;
        if ("nickname".equals(codeString))
            return NICKNAME;
        if ("anonymous".equals(codeString))
            return ANONYMOUS;
        if ("old".equals(codeString))
            return OLD;
        if ("maiden".equals(codeString))
            return MAIDEN;
        throw new FHIRException("Unknown NameUse code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case USUAL:
                return "usual";
            case OFFICIAL:
                return "official";
            case TEMP:
                return "temp";
            case NICKNAME:
                return "nickname";
            case ANONYMOUS:
                return "anonymous";
            case OLD:
                return "old";
            case MAIDEN:
                return "maiden";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case USUAL:
                return "http://hl7.org/fhir/name-use";
            case OFFICIAL:
                return "http://hl7.org/fhir/name-use";
            case TEMP:
                return "http://hl7.org/fhir/name-use";
            case NICKNAME:
                return "http://hl7.org/fhir/name-use";
            case ANONYMOUS:
                return "http://hl7.org/fhir/name-use";
            case OLD:
                return "http://hl7.org/fhir/name-use";
            case MAIDEN:
                return "http://hl7.org/fhir/name-use";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case USUAL:
                return "Known as/conventional/the one you normally use";
            case OFFICIAL:
                return "The formal name as registered in an official (government) registry, but which name might not be commonly used. May be called \"legal name\".";
            case TEMP:
                return "A temporary name. Name.period can provide more detailed information. This may also be used for temporary names assigned at birth or in emergency situations.";
            case NICKNAME:
                return "A name that is used to address the person in an informal manner, but is not part of their formal or usual name";
            case ANONYMOUS:
                return "Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons)";
            case OLD:
                return "This name is no longer in use (or was never correct, but retained for records)";
            case MAIDEN:
                return "A name used prior to marriage. Marriage naming customs vary greatly around the world. This name use is for use by applications that collect and store \"maiden\" names. Though the concept of maiden name is often gender specific, the use of this term is not gender specific. The use of this term does not imply any particular history for a person's name, nor should the maiden name be determined algorithmically.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case USUAL:
                return "Usual";
            case OFFICIAL:
                return "Official";
            case TEMP:
                return "Temp";
            case NICKNAME:
                return "Nickname";
            case ANONYMOUS:
                return "Anonymous";
            case OLD:
                return "Old";
            case MAIDEN:
                return "Maiden";
            default:
                return "?";
        }
    }
}
