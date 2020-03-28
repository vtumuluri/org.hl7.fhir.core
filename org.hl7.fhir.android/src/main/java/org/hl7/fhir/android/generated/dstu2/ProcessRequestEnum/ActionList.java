package org.hl7.fhir.android.generated.dstu2.ProcessRequestEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ProcessRequestEnum.ActionListEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ProcessRequestEnum.ActionList;

public enum ActionList {

    /**
     * Cancel, reverse or nullify the target resource.
     */
    CANCEL,
    /**
     * Check for previously un-read/ not-retrieved resources.
     */
    POLL,
    /**
     * Re-process the target resource.
     */
    REPROCESS,
    /**
     * Retrieve the processing status of the target resource.
     */
    STATUS,
    /**
     * added to help the parsers
     */
    NULL;

    public static ActionList fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("cancel".equals(codeString))
            return CANCEL;
        if ("poll".equals(codeString))
            return POLL;
        if ("reprocess".equals(codeString))
            return REPROCESS;
        if ("status".equals(codeString))
            return STATUS;
        throw new FHIRException("Unknown ActionList code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CANCEL:
                return "cancel";
            case POLL:
                return "poll";
            case REPROCESS:
                return "reprocess";
            case STATUS:
                return "status";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CANCEL:
                return "http://hl7.org/fhir/actionlist";
            case POLL:
                return "http://hl7.org/fhir/actionlist";
            case REPROCESS:
                return "http://hl7.org/fhir/actionlist";
            case STATUS:
                return "http://hl7.org/fhir/actionlist";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CANCEL:
                return "Cancel, reverse or nullify the target resource.";
            case POLL:
                return "Check for previously un-read/ not-retrieved resources.";
            case REPROCESS:
                return "Re-process the target resource.";
            case STATUS:
                return "Retrieve the processing status of the target resource.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CANCEL:
                return "Cancel, Reverse or Nullify";
            case POLL:
                return "Poll";
            case REPROCESS:
                return "Re-Process";
            case STATUS:
                return "Status Check";
            default:
                return "?";
        }
    }
}
