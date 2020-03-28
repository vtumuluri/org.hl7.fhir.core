package org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ConstraintSeverity {

    /**
     * If the constraint is violated, the resource is not conformant.
     */
    ERROR,
    /**
     * If the constraint is violated, the resource is conformant, but it is not necessarily following best practice.
     */
    WARNING,
    /**
     * added to help the parsers
     */
    NULL;

    public static ConstraintSeverity fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("error".equals(codeString))
            return ERROR;
        if ("warning".equals(codeString))
            return WARNING;
        throw new FHIRException("Unknown ConstraintSeverity code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ERROR:
                return "error";
            case WARNING:
                return "warning";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ERROR:
                return "http://hl7.org/fhir/constraint-severity";
            case WARNING:
                return "http://hl7.org/fhir/constraint-severity";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ERROR:
                return "If the constraint is violated, the resource is not conformant.";
            case WARNING:
                return "If the constraint is violated, the resource is conformant, but it is not necessarily following best practice.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ERROR:
                return "Error";
            case WARNING:
                return "Warning";
            default:
                return "?";
        }
    }
}
