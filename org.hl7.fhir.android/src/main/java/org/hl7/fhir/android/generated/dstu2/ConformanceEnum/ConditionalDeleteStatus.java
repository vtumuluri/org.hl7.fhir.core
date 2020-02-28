package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ConditionalDeleteStatus {

    /**
     * No support for conditional deletes.
     */
    NOTSUPPORTED,
    /**
     * Conditional deletes are supported, but only single resources at a time.
     */
    SINGLE,
    /**
     * Conditional deletes are supported, and multiple resources can be deleted in a single interaction.
     */
    MULTIPLE,
    /**
     * added to help the parsers
     */
    NULL;

    public static ConditionalDeleteStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("not-supported".equals(codeString))
            return NOTSUPPORTED;
        if ("single".equals(codeString))
            return SINGLE;
        if ("multiple".equals(codeString))
            return MULTIPLE;
        throw new FHIRException("Unknown ConditionalDeleteStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case NOTSUPPORTED:
                return "not-supported";
            case SINGLE:
                return "single";
            case MULTIPLE:
                return "multiple";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case NOTSUPPORTED:
                return "http://hl7.org/fhir/conditional-delete-status";
            case SINGLE:
                return "http://hl7.org/fhir/conditional-delete-status";
            case MULTIPLE:
                return "http://hl7.org/fhir/conditional-delete-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case NOTSUPPORTED:
                return "No support for conditional deletes.";
            case SINGLE:
                return "Conditional deletes are supported, but only single resources at a time.";
            case MULTIPLE:
                return "Conditional deletes are supported, and multiple resources can be deleted in a single interaction.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case NOTSUPPORTED:
                return "Not Supported";
            case SINGLE:
                return "Single Deletes Supported";
            case MULTIPLE:
                return "Multiple Deletes Supported";
            default:
                return "?";
        }
    }
}
