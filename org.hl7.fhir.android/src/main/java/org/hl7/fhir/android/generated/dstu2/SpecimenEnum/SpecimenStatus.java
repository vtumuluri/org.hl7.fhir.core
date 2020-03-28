package org.hl7.fhir.android.generated.dstu2.SpecimenEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.SpecimenEnum.SpecimenStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.SpecimenEnum.SpecimenStatus;

public enum SpecimenStatus {

    /**
     * The physical specimen is present and in good condition.
     */
    AVAILABLE,
    /**
     * There is no physical specimen because it is either lost, destroyed or consumed.
     */
    UNAVAILABLE,
    /**
     * The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old.
     */
    UNSATISFACTORY,
    /**
     * The specimen was entered in error and therefore nullified.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static SpecimenStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("available".equals(codeString))
            return AVAILABLE;
        if ("unavailable".equals(codeString))
            return UNAVAILABLE;
        if ("unsatisfactory".equals(codeString))
            return UNSATISFACTORY;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown SpecimenStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case AVAILABLE:
                return "available";
            case UNAVAILABLE:
                return "unavailable";
            case UNSATISFACTORY:
                return "unsatisfactory";
            case ENTEREDINERROR:
                return "entered-in-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case AVAILABLE:
                return "http://hl7.org/fhir/specimen-status";
            case UNAVAILABLE:
                return "http://hl7.org/fhir/specimen-status";
            case UNSATISFACTORY:
                return "http://hl7.org/fhir/specimen-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/specimen-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case AVAILABLE:
                return "The physical specimen is present and in good condition.";
            case UNAVAILABLE:
                return "There is no physical specimen because it is either lost, destroyed or consumed.";
            case UNSATISFACTORY:
                return "The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old.";
            case ENTEREDINERROR:
                return "The specimen was entered in error and therefore nullified.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case AVAILABLE:
                return "Available";
            case UNAVAILABLE:
                return "Unavailable";
            case UNSATISFACTORY:
                return "Unsatisfactory";
            case ENTEREDINERROR:
                return "Entered-in-error";
            default:
                return "?";
        }
    }
}
