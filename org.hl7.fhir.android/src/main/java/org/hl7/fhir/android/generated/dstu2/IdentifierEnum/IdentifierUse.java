package org.hl7.fhir.android.generated.dstu2.IdentifierEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum IdentifierUse {

    /**
     * The identifier recommended for display and use in real-world interactions.
     */
    USUAL,
    /**
     * The identifier considered to be most trusted for the identification of this item.
     */
    OFFICIAL,
    /**
     * A temporary identifier.
     */
    TEMP,
    /**
     * An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.
     */
    SECONDARY,
    /**
     * added to help the parsers
     */
    NULL;

    public static IdentifierUse fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("usual".equals(codeString))
            return USUAL;
        if ("official".equals(codeString))
            return OFFICIAL;
        if ("temp".equals(codeString))
            return TEMP;
        if ("secondary".equals(codeString))
            return SECONDARY;
        throw new FHIRException("Unknown IdentifierUse code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case USUAL:
                return "usual";
            case OFFICIAL:
                return "official";
            case TEMP:
                return "temp";
            case SECONDARY:
                return "secondary";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case USUAL:
                return "http://hl7.org/fhir/identifier-use";
            case OFFICIAL:
                return "http://hl7.org/fhir/identifier-use";
            case TEMP:
                return "http://hl7.org/fhir/identifier-use";
            case SECONDARY:
                return "http://hl7.org/fhir/identifier-use";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case USUAL:
                return "The identifier recommended for display and use in real-world interactions.";
            case OFFICIAL:
                return "The identifier considered to be most trusted for the identification of this item.";
            case TEMP:
                return "A temporary identifier.";
            case SECONDARY:
                return "An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.";
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
            case SECONDARY:
                return "Secondary";
            default:
                return "?";
        }
    }
}
