package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ConformanceStatementKind {

    /**
     * The Conformance instance represents the present capabilities of a specific system instance.  This is the kind returned by OPTIONS for a FHIR server end-point.
     */
    INSTANCE,
    /**
     * The Conformance instance represents the capabilities of a system or piece of software, independent of a particular installation.
     */
    CAPABILITY,
    /**
     * The Conformance instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.
     */
    REQUIREMENTS,
    /**
     * added to help the parsers
     */
    NULL;

    public static ConformanceStatementKind fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("instance".equals(codeString))
            return INSTANCE;
        if ("capability".equals(codeString))
            return CAPABILITY;
        if ("requirements".equals(codeString))
            return REQUIREMENTS;
        throw new FHIRException("Unknown ConformanceStatementKind code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INSTANCE:
                return "instance";
            case CAPABILITY:
                return "capability";
            case REQUIREMENTS:
                return "requirements";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INSTANCE:
                return "http://hl7.org/fhir/conformance-statement-kind";
            case CAPABILITY:
                return "http://hl7.org/fhir/conformance-statement-kind";
            case REQUIREMENTS:
                return "http://hl7.org/fhir/conformance-statement-kind";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INSTANCE:
                return "The Conformance instance represents the present capabilities of a specific system instance.  This is the kind returned by OPTIONS for a FHIR server end-point.";
            case CAPABILITY:
                return "The Conformance instance represents the capabilities of a system or piece of software, independent of a particular installation.";
            case REQUIREMENTS:
                return "The Conformance instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INSTANCE:
                return "Instance";
            case CAPABILITY:
                return "Capability";
            case REQUIREMENTS:
                return "Requirements";
            default:
                return "?";
        }
    }
}
