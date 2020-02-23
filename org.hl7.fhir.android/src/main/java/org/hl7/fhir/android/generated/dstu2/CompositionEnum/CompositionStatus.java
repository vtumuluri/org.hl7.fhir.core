package org.hl7.fhir.android.generated.dstu2.CompositionEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum CompositionStatus {

    /**
     * This is a preliminary composition or document (also known as initial or interim). The content may be incomplete or unverified.
     */
    PRELIMINARY,
    /**
     * This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition.
     */
    FINAL,
    /**
     * The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as "final" and the composition is complete and verified by an authorized person.
     */
    AMENDED,
    /**
     * The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static CompositionStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("preliminary".equals(codeString))
            return PRELIMINARY;
        if ("final".equals(codeString))
            return FINAL;
        if ("amended".equals(codeString))
            return AMENDED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown CompositionStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PRELIMINARY:
                return "preliminary";
            case FINAL:
                return "final";
            case AMENDED:
                return "amended";
            case ENTEREDINERROR:
                return "entered-in-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PRELIMINARY:
                return "http://hl7.org/fhir/composition-status";
            case FINAL:
                return "http://hl7.org/fhir/composition-status";
            case AMENDED:
                return "http://hl7.org/fhir/composition-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/composition-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PRELIMINARY:
                return "This is a preliminary composition or document (also known as initial or interim). The content may be incomplete or unverified.";
            case FINAL:
                return "This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition.";
            case AMENDED:
                return "The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as \"final\" and the composition is complete and verified by an authorized person.";
            case ENTEREDINERROR:
                return "The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PRELIMINARY:
                return "Preliminary";
            case FINAL:
                return "Final";
            case AMENDED:
                return "Amended";
            case ENTEREDINERROR:
                return "Entered in Error";
            default:
                return "?";
        }
    }
}
