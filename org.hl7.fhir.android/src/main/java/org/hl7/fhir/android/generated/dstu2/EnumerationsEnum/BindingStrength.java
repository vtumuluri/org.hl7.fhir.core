package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum BindingStrength {

    /**
     * To be conformant, instances of this element SHALL include a code from the specified value set.
     */
    REQUIRED,
    /**
     * To be conformant, instances of this element SHALL include a code from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the valueset does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.
     */
    EXTENSIBLE,
    /**
     * Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.
     */
    PREFERRED,
    /**
     * Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.
     */
    EXAMPLE,
    /**
     * added to help the parsers
     */
    NULL;

    public static BindingStrength fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("required".equals(codeString))
            return REQUIRED;
        if ("extensible".equals(codeString))
            return EXTENSIBLE;
        if ("preferred".equals(codeString))
            return PREFERRED;
        if ("example".equals(codeString))
            return EXAMPLE;
        throw new FHIRException("Unknown BindingStrength code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case REQUIRED:
                return "required";
            case EXTENSIBLE:
                return "extensible";
            case PREFERRED:
                return "preferred";
            case EXAMPLE:
                return "example";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case REQUIRED:
                return "http://hl7.org/fhir/binding-strength";
            case EXTENSIBLE:
                return "http://hl7.org/fhir/binding-strength";
            case PREFERRED:
                return "http://hl7.org/fhir/binding-strength";
            case EXAMPLE:
                return "http://hl7.org/fhir/binding-strength";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case REQUIRED:
                return "To be conformant, instances of this element SHALL include a code from the specified value set.";
            case EXTENSIBLE:
                return "To be conformant, instances of this element SHALL include a code from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the valueset does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.";
            case PREFERRED:
                return "Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.";
            case EXAMPLE:
                return "Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case REQUIRED:
                return "Required";
            case EXTENSIBLE:
                return "Extensible";
            case PREFERRED:
                return "Preferred";
            case EXAMPLE:
                return "Example";
            default:
                return "?";
        }
    }
}
