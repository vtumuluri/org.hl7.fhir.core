package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum UnknownContentCode {

    /**
     * The application does not accept either unknown elements or extensions.
     */
    NO,
    /**
     * The application accepts unknown extensions, but not unknown elements.
     */
    EXTENSIONS,
    /**
     * The application accepts unknown elements, but not unknown extensions.
     */
    ELEMENTS,
    /**
     * The application accepts unknown elements and extensions.
     */
    BOTH,
    /**
     * added to help the parsers
     */
    NULL;

    public static UnknownContentCode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("no".equals(codeString))
            return NO;
        if ("extensions".equals(codeString))
            return EXTENSIONS;
        if ("elements".equals(codeString))
            return ELEMENTS;
        if ("both".equals(codeString))
            return BOTH;
        throw new FHIRException("Unknown UnknownContentCode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case NO:
                return "no";
            case EXTENSIONS:
                return "extensions";
            case ELEMENTS:
                return "elements";
            case BOTH:
                return "both";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case NO:
                return "http://hl7.org/fhir/unknown-content-code";
            case EXTENSIONS:
                return "http://hl7.org/fhir/unknown-content-code";
            case ELEMENTS:
                return "http://hl7.org/fhir/unknown-content-code";
            case BOTH:
                return "http://hl7.org/fhir/unknown-content-code";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case NO:
                return "The application does not accept either unknown elements or extensions.";
            case EXTENSIONS:
                return "The application accepts unknown extensions, but not unknown elements.";
            case ELEMENTS:
                return "The application accepts unknown elements, but not unknown extensions.";
            case BOTH:
                return "The application accepts unknown elements and extensions.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case NO:
                return "Neither Elements or Extensions";
            case EXTENSIONS:
                return "Unknown Extensions";
            case ELEMENTS:
                return "Unknown Elements";
            case BOTH:
                return "Unknown Elements and Extensions";
            default:
                return "?";
        }
    }
}
