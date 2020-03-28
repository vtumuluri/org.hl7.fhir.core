package org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum OperationKind {

    /**
     * This operation is invoked as an operation.
     */
    OPERATION,
    /**
     * This operation is a named query, invoked using the search mechanism.
     */
    QUERY,
    /**
     * added to help the parsers
     */
    NULL;

    public static OperationKind fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("operation".equals(codeString))
            return OPERATION;
        if ("query".equals(codeString))
            return QUERY;
        throw new FHIRException("Unknown OperationKind code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case OPERATION:
                return "operation";
            case QUERY:
                return "query";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case OPERATION:
                return "http://hl7.org/fhir/operation-kind";
            case QUERY:
                return "http://hl7.org/fhir/operation-kind";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case OPERATION:
                return "This operation is invoked as an operation.";
            case QUERY:
                return "This operation is a named query, invoked using the search mechanism.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case OPERATION:
                return "Operation";
            case QUERY:
                return "Query";
            default:
                return "?";
        }
    }
}
