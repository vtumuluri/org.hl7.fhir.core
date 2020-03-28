package org.hl7.fhir.android.generated.dstu2.BundleEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum SearchEntryMode {

    /**
     * This resource matched the search specification.
     */
    MATCH,
    /**
     * This resource is returned because it is referred to from another resource in the search set.
     */
    INCLUDE,
    /**
     * An OperationOutcome that provides additional information about the processing of a search.
     */
    OUTCOME,
    /**
     * added to help the parsers
     */
    NULL;

    public static SearchEntryMode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("match".equals(codeString))
            return MATCH;
        if ("include".equals(codeString))
            return INCLUDE;
        if ("outcome".equals(codeString))
            return OUTCOME;
        throw new FHIRException("Unknown SearchEntryMode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case MATCH:
                return "match";
            case INCLUDE:
                return "include";
            case OUTCOME:
                return "outcome";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case MATCH:
                return "http://hl7.org/fhir/search-entry-mode";
            case INCLUDE:
                return "http://hl7.org/fhir/search-entry-mode";
            case OUTCOME:
                return "http://hl7.org/fhir/search-entry-mode";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case MATCH:
                return "This resource matched the search specification.";
            case INCLUDE:
                return "This resource is returned because it is referred to from another resource in the search set.";
            case OUTCOME:
                return "An OperationOutcome that provides additional information about the processing of a search.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case MATCH:
                return "Match";
            case INCLUDE:
                return "Include";
            case OUTCOME:
                return "Outcome";
            default:
                return "?";
        }
    }
}
