package org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum IssueSeverity {

    /**
     * The issue caused the action to fail, and no further checking could be performed.
     */
    FATAL,
    /**
     * The issue is sufficiently important to cause the action to fail.
     */
    ERROR,
    /**
     * The issue is not important enough to cause the action to fail, but may cause it to be performed suboptimally or in a way that is not as desired.
     */
    WARNING,
    /**
     * The issue has no relation to the degree of success of the action.
     */
    INFORMATION,
    /**
     * added to help the parsers
     */
    NULL;

    public static IssueSeverity fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("fatal".equals(codeString))
            return FATAL;
        if ("error".equals(codeString))
            return ERROR;
        if ("warning".equals(codeString))
            return WARNING;
        if ("information".equals(codeString))
            return INFORMATION;
        throw new FHIRException("Unknown IssueSeverity code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case FATAL:
                return "fatal";
            case ERROR:
                return "error";
            case WARNING:
                return "warning";
            case INFORMATION:
                return "information";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case FATAL:
                return "http://hl7.org/fhir/issue-severity";
            case ERROR:
                return "http://hl7.org/fhir/issue-severity";
            case WARNING:
                return "http://hl7.org/fhir/issue-severity";
            case INFORMATION:
                return "http://hl7.org/fhir/issue-severity";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case FATAL:
                return "The issue caused the action to fail, and no further checking could be performed.";
            case ERROR:
                return "The issue is sufficiently important to cause the action to fail.";
            case WARNING:
                return "The issue is not important enough to cause the action to fail, but may cause it to be performed suboptimally or in a way that is not as desired.";
            case INFORMATION:
                return "The issue has no relation to the degree of success of the action.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case FATAL:
                return "Fatal";
            case ERROR:
                return "Error";
            case WARNING:
                return "Warning";
            case INFORMATION:
                return "Information";
            default:
                return "?";
        }
    }
}
