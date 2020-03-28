package org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum SlicingRules {

    /**
     * No additional content is allowed other than that described by the slices in this profile.
     */
    CLOSED,
    /**
     * Additional content is allowed anywhere in the list.
     */
    OPEN,
    /**
     * Additional content is allowed, but only at the end of the list. Note that using this requires that the slices be ordered, which makes it hard to share uses. This should only be done where absolutely required.
     */
    OPENATEND,
    /**
     * added to help the parsers
     */
    NULL;

    public static SlicingRules fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("closed".equals(codeString))
            return CLOSED;
        if ("open".equals(codeString))
            return OPEN;
        if ("openAtEnd".equals(codeString))
            return OPENATEND;
        throw new FHIRException("Unknown SlicingRules code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CLOSED:
                return "closed";
            case OPEN:
                return "open";
            case OPENATEND:
                return "openAtEnd";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CLOSED:
                return "http://hl7.org/fhir/resource-slicing-rules";
            case OPEN:
                return "http://hl7.org/fhir/resource-slicing-rules";
            case OPENATEND:
                return "http://hl7.org/fhir/resource-slicing-rules";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CLOSED:
                return "No additional content is allowed other than that described by the slices in this profile.";
            case OPEN:
                return "Additional content is allowed anywhere in the list.";
            case OPENATEND:
                return "Additional content is allowed, but only at the end of the list. Note that using this requires that the slices be ordered, which makes it hard to share uses. This should only be done where absolutely required.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CLOSED:
                return "Closed";
            case OPEN:
                return "Open";
            case OPENATEND:
                return "Open at End";
            default:
                return "?";
        }
    }
}
