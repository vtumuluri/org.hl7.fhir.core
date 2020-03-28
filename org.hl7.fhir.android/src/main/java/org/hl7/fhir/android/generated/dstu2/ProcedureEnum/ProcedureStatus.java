package org.hl7.fhir.android.generated.dstu2.ProcedureEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.ProcedureEnum.ProcedureStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ProcedureEnum.ProcedureStatus;

public enum ProcedureStatus {

    /**
     * The procedure is still occurring.
     */
    INPROGRESS,
    /**
     * The procedure was terminated without completing successfully.
     */
    ABORTED,
    /**
     * All actions involved in the procedure have taken place.
     */
    COMPLETED,
    /**
     * The statement was entered in error and Is not valid.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static ProcedureStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return INPROGRESS;
        if ("aborted".equals(codeString))
            return ABORTED;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown ProcedureStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INPROGRESS:
                return "in-progress";
            case ABORTED:
                return "aborted";
            case COMPLETED:
                return "completed";
            case ENTEREDINERROR:
                return "entered-in-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INPROGRESS:
                return "http://hl7.org/fhir/procedure-status";
            case ABORTED:
                return "http://hl7.org/fhir/procedure-status";
            case COMPLETED:
                return "http://hl7.org/fhir/procedure-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/procedure-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INPROGRESS:
                return "The procedure is still occurring.";
            case ABORTED:
                return "The procedure was terminated without completing successfully.";
            case COMPLETED:
                return "All actions involved in the procedure have taken place.";
            case ENTEREDINERROR:
                return "The statement was entered in error and Is not valid.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INPROGRESS:
                return "In Progress";
            case ABORTED:
                return "Aboted";
            case COMPLETED:
                return "Completed";
            case ENTEREDINERROR:
                return "Entered in Error";
            default:
                return "?";
        }
    }
}
