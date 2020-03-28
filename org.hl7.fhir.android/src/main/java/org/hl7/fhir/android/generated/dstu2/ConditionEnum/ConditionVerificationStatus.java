package org.hl7.fhir.android.generated.dstu2.ConditionEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConditionEnum.ConditionVerificationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConditionEnum.ConditionVerificationStatus;

public enum ConditionVerificationStatus {

    /**
     * This is a tentative diagnosis - still a candidate that is under consideration.
     */
    PROVISIONAL,
    /**
     * One of a set of potential (and typically mutually exclusive) diagnosis asserted to further guide the diagnostic process and preliminary treatment.
     */
    DIFFERENTIAL,
    /**
     * There is sufficient diagnostic and/or clinical evidence to treat this as a confirmed condition.
     */
    CONFIRMED,
    /**
     * This condition has been ruled out by diagnostic and clinical evidence.
     */
    REFUTED,
    /**
     * The statement was entered in error and is not valid.
     */
    ENTEREDINERROR,
    /**
     * The condition status is unknown.  Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
     */
    UNKNOWN,
    /**
     * added to help the parsers
     */
    NULL;

    public static ConditionVerificationStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("provisional".equals(codeString))
            return PROVISIONAL;
        if ("differential".equals(codeString))
            return DIFFERENTIAL;
        if ("confirmed".equals(codeString))
            return CONFIRMED;
        if ("refuted".equals(codeString))
            return REFUTED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        if ("unknown".equals(codeString))
            return UNKNOWN;
        throw new FHIRException("Unknown ConditionVerificationStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PROVISIONAL:
                return "provisional";
            case DIFFERENTIAL:
                return "differential";
            case CONFIRMED:
                return "confirmed";
            case REFUTED:
                return "refuted";
            case ENTEREDINERROR:
                return "entered-in-error";
            case UNKNOWN:
                return "unknown";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PROVISIONAL:
                return "http://hl7.org/fhir/condition-ver-status";
            case DIFFERENTIAL:
                return "http://hl7.org/fhir/condition-ver-status";
            case CONFIRMED:
                return "http://hl7.org/fhir/condition-ver-status";
            case REFUTED:
                return "http://hl7.org/fhir/condition-ver-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/condition-ver-status";
            case UNKNOWN:
                return "http://hl7.org/fhir/condition-ver-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PROVISIONAL:
                return "This is a tentative diagnosis - still a candidate that is under consideration.";
            case DIFFERENTIAL:
                return "One of a set of potential (and typically mutually exclusive) diagnosis asserted to further guide the diagnostic process and preliminary treatment.";
            case CONFIRMED:
                return "There is sufficient diagnostic and/or clinical evidence to treat this as a confirmed condition.";
            case REFUTED:
                return "This condition has been ruled out by diagnostic and clinical evidence.";
            case ENTEREDINERROR:
                return "The statement was entered in error and is not valid.";
            case UNKNOWN:
                return "The condition status is unknown.  Note that \"unknown\" is a value of last resort and every attempt should be made to provide a meaningful value other than \"unknown\".";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PROVISIONAL:
                return "Provisional";
            case DIFFERENTIAL:
                return "Differential";
            case CONFIRMED:
                return "Confirmed";
            case REFUTED:
                return "Refuted";
            case ENTEREDINERROR:
                return "Entered In Error";
            case UNKNOWN:
                return "Unknown";
            default:
                return "?";
        }
    }
}
