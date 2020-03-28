package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ConformanceResourceStatus {

    /**
     * This resource is still under development.
     */
    DRAFT,
    /**
     * This resource is ready for normal use.
     */
    ACTIVE,
    /**
     * This resource has been withdrawn or superseded and should no longer be used.
     */
    RETIRED,
    /**
     * added to help the parsers
     */
    NULL;

    public static ConformanceResourceStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("draft".equals(codeString))
            return DRAFT;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("retired".equals(codeString))
            return RETIRED;
        throw new FHIRException("Unknown ConformanceResourceStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case DRAFT:
                return "draft";
            case ACTIVE:
                return "active";
            case RETIRED:
                return "retired";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case DRAFT:
                return "http://hl7.org/fhir/conformance-resource-status";
            case ACTIVE:
                return "http://hl7.org/fhir/conformance-resource-status";
            case RETIRED:
                return "http://hl7.org/fhir/conformance-resource-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case DRAFT:
                return "This resource is still under development.";
            case ACTIVE:
                return "This resource is ready for normal use.";
            case RETIRED:
                return "This resource has been withdrawn or superseded and should no longer be used.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case DRAFT:
                return "Draft";
            case ACTIVE:
                return "Active";
            case RETIRED:
                return "Retired";
            default:
                return "?";
        }
    }
}
