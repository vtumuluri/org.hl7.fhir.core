package org.hl7.fhir.android.generated.dstu2.MedicationDispenseEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationDispenseEnum.MedicationDispenseStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.MedicationDispenseEnum.MedicationDispenseStatus;

public enum MedicationDispenseStatus {

    /**
     * The dispense has started but has not yet completed.
     */
    INPROGRESS,
    /**
     * Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called "suspended"
     */
    ONHOLD,
    /**
     * All actions that are implied by the dispense have occurred.
     */
    COMPLETED,
    /**
     * The dispense was entered in error and therefore nullified.
     */
    ENTEREDINERROR,
    /**
     * Actions implied by the dispense have been permanently halted, before all of them occurred.
     */
    STOPPED,
    /**
     * added to help the parsers
     */
    NULL;

    public static MedicationDispenseStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return INPROGRESS;
        if ("on-hold".equals(codeString))
            return ONHOLD;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        if ("stopped".equals(codeString))
            return STOPPED;
        throw new FHIRException("Unknown MedicationDispenseStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INPROGRESS:
                return "in-progress";
            case ONHOLD:
                return "on-hold";
            case COMPLETED:
                return "completed";
            case ENTEREDINERROR:
                return "entered-in-error";
            case STOPPED:
                return "stopped";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INPROGRESS:
                return "http://hl7.org/fhir/medication-dispense-status";
            case ONHOLD:
                return "http://hl7.org/fhir/medication-dispense-status";
            case COMPLETED:
                return "http://hl7.org/fhir/medication-dispense-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/medication-dispense-status";
            case STOPPED:
                return "http://hl7.org/fhir/medication-dispense-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INPROGRESS:
                return "The dispense has started but has not yet completed.";
            case ONHOLD:
                return "Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called \"suspended\"";
            case COMPLETED:
                return "All actions that are implied by the dispense have occurred.";
            case ENTEREDINERROR:
                return "The dispense was entered in error and therefore nullified.";
            case STOPPED:
                return "Actions implied by the dispense have been permanently halted, before all of them occurred.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INPROGRESS:
                return "In Progress";
            case ONHOLD:
                return "On Hold";
            case COMPLETED:
                return "Completed";
            case ENTEREDINERROR:
                return "Entered in-Error";
            case STOPPED:
                return "Stopped";
            default:
                return "?";
        }
    }
}
