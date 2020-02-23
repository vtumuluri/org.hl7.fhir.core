package org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum OperationParameterUse {

    /**
     * This is an input parameter.
     */
    IN,
    /**
     * This is an output parameter.
     */
    OUT,
    /**
     * added to help the parsers
     */
    NULL;

    public static OperationParameterUse fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in".equals(codeString))
            return IN;
        if ("out".equals(codeString))
            return OUT;
        throw new FHIRException("Unknown OperationParameterUse code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case IN:
                return "in";
            case OUT:
                return "out";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case IN:
                return "http://hl7.org/fhir/operation-parameter-use";
            case OUT:
                return "http://hl7.org/fhir/operation-parameter-use";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case IN:
                return "This is an input parameter.";
            case OUT:
                return "This is an output parameter.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case IN:
                return "In";
            case OUT:
                return "Out";
            default:
                return "?";
        }
    }
}
