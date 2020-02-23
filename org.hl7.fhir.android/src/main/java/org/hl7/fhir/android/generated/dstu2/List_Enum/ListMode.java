package org.hl7.fhir.android.generated.dstu2.List_Enum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ListMode {

    /**
     * This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes
     */
    WORKING,
    /**
     * This list was prepared as a snapshot. It should not be assumed to be current
     */
    SNAPSHOT,
    /**
     * A list that indicates where changes have been made or recommended
     */
    CHANGES,
    /**
     * added to help the parsers
     */
    NULL;

    public static ListMode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("working".equals(codeString))
            return WORKING;
        if ("snapshot".equals(codeString))
            return SNAPSHOT;
        if ("changes".equals(codeString))
            return CHANGES;
        throw new FHIRException("Unknown ListMode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case WORKING:
                return "working";
            case SNAPSHOT:
                return "snapshot";
            case CHANGES:
                return "changes";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case WORKING:
                return "http://hl7.org/fhir/list-mode";
            case SNAPSHOT:
                return "http://hl7.org/fhir/list-mode";
            case CHANGES:
                return "http://hl7.org/fhir/list-mode";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case WORKING:
                return "This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes";
            case SNAPSHOT:
                return "This list was prepared as a snapshot. It should not be assumed to be current";
            case CHANGES:
                return "A list that indicates where changes have been made or recommended";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case WORKING:
                return "Working List";
            case SNAPSHOT:
                return "Snapshot List";
            case CHANGES:
                return "Change List";
            default:
                return "?";
        }
    }
}
