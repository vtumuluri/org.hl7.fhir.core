package org.hl7.fhir.android.generated.dstu2.PatientEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum LinkType {

    /**
     * The patient resource containing this link must no longer be used. The link points forward to another patient resource that must be used in lieu of the patient resource that contains this link.
     */
    REPLACE,
    /**
     * The patient resource containing this link is in use and valid but not considered the main source of information about a patient. The link points forward to another patient resource that should be consulted to retrieve additional patient information.
     */
    REFER,
    /**
     * The patient resource containing this link is in use and valid, but points to another patient resource that is known to contain data about the same person. Data in this resource might overlap or contradict information found in the other patient resource. This link does not indicate any relative importance of the resources concerned, and both should be regarded as equally valid.
     */
    SEEALSO,
    /**
     * added to help the parsers
     */
    NULL;

    public static LinkType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("replace".equals(codeString))
            return REPLACE;
        if ("refer".equals(codeString))
            return REFER;
        if ("seealso".equals(codeString))
            return SEEALSO;
        throw new FHIRException("Unknown LinkType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case REPLACE:
                return "replace";
            case REFER:
                return "refer";
            case SEEALSO:
                return "seealso";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case REPLACE:
                return "http://hl7.org/fhir/link-type";
            case REFER:
                return "http://hl7.org/fhir/link-type";
            case SEEALSO:
                return "http://hl7.org/fhir/link-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case REPLACE:
                return "The patient resource containing this link must no longer be used. The link points forward to another patient resource that must be used in lieu of the patient resource that contains this link.";
            case REFER:
                return "The patient resource containing this link is in use and valid but not considered the main source of information about a patient. The link points forward to another patient resource that should be consulted to retrieve additional patient information.";
            case SEEALSO:
                return "The patient resource containing this link is in use and valid, but points to another patient resource that is known to contain data about the same person. Data in this resource might overlap or contradict information found in the other patient resource. This link does not indicate any relative importance of the resources concerned, and both should be regarded as equally valid.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case REPLACE:
                return "Replace";
            case REFER:
                return "Refer";
            case SEEALSO:
                return "See also";
            default:
                return "?";
        }
    }
}
