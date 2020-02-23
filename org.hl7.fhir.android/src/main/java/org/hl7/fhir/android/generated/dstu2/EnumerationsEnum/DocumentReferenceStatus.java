package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum DocumentReferenceStatus {

    /**
     * This is the current reference for this document.
     */
    CURRENT,
    /**
     * This reference has been superseded by another reference.
     */
    SUPERSEDED,
    /**
     * This reference was created in error.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static DocumentReferenceStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("current".equals(codeString))
            return CURRENT;
        if ("superseded".equals(codeString))
            return SUPERSEDED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown DocumentReferenceStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CURRENT:
                return "current";
            case SUPERSEDED:
                return "superseded";
            case ENTEREDINERROR:
                return "entered-in-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CURRENT:
                return "http://hl7.org/fhir/document-reference-status";
            case SUPERSEDED:
                return "http://hl7.org/fhir/document-reference-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/document-reference-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CURRENT:
                return "This is the current reference for this document.";
            case SUPERSEDED:
                return "This reference has been superseded by another reference.";
            case ENTEREDINERROR:
                return "This reference was created in error.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CURRENT:
                return "Current";
            case SUPERSEDED:
                return "Superseded";
            case ENTEREDINERROR:
                return "Entered in Error";
            default:
                return "?";
        }
    }
}
