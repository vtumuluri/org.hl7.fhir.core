package org.hl7.fhir.android.generated.dstu2.MedicationAdministrationEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationAdministrationEnum.MedicationAdministrationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.MedicationAdministrationEnum.MedicationAdministrationStatus;

public enum MedicationAdministrationStatus {

    /**
     * The administration has started but has not yet completed.
     */
    INPROGRESS,
    /**
     * Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called "suspended".
     */
    ONHOLD,
    /**
     * All actions that are implied by the administration have occurred.
     */
    COMPLETED,
    /**
     * The administration was entered in error and therefore nullified.
     */
    ENTEREDINERROR,
    /**
     * Actions implied by the administration have been permanently halted, before all of them occurred.
     */
    STOPPED,
    /**
     * added to help the parsers
     */
    NULL;

    public static MedicationAdministrationStatus fromCode(String codeString) throws FHIRException {
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
        throw new FHIRException("Unknown MedicationAdministrationStatus code '" + codeString + "'");
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
                return "http://hl7.org/fhir/medication-admin-status";
            case ONHOLD:
                return "http://hl7.org/fhir/medication-admin-status";
            case COMPLETED:
                return "http://hl7.org/fhir/medication-admin-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/medication-admin-status";
            case STOPPED:
                return "http://hl7.org/fhir/medication-admin-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INPROGRESS:
                return "The administration has started but has not yet completed.";
            case ONHOLD:
                return "Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called \"suspended\".";
            case COMPLETED:
                return "All actions that are implied by the administration have occurred.";
            case ENTEREDINERROR:
                return "The administration was entered in error and therefore nullified.";
            case STOPPED:
                return "Actions implied by the administration have been permanently halted, before all of them occurred.";
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
                return "Entered in Error";
            case STOPPED:
                return "Stopped";
            default:
                return "?";
        }
    }
}
