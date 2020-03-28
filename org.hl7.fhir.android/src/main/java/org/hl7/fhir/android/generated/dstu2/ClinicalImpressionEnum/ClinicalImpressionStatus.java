package org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum.ClinicalImpressionStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum.ClinicalImpressionStatus;

public enum ClinicalImpressionStatus {

    /**
     * The assessment is still on-going and results are not yet final.
     */
    INPROGRESS,
    /**
     * The assessment is done and the results are final.
     */
    COMPLETED,
    /**
     * This assessment was never actually done and the record is erroneous (e.g. Wrong patient).
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static ClinicalImpressionStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return INPROGRESS;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown ClinicalImpressionStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INPROGRESS:
                return "in-progress";
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
                return "http://hl7.org/fhir/clinical-impression-status";
            case COMPLETED:
                return "http://hl7.org/fhir/clinical-impression-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/clinical-impression-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INPROGRESS:
                return "The assessment is still on-going and results are not yet final.";
            case COMPLETED:
                return "The assessment is done and the results are final.";
            case ENTEREDINERROR:
                return "This assessment was never actually done and the record is erroneous (e.g. Wrong patient).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INPROGRESS:
                return "In progress";
            case COMPLETED:
                return "Completed";
            case ENTEREDINERROR:
                return "Entered in Error";
            default:
                return "?";
        }
    }
}
