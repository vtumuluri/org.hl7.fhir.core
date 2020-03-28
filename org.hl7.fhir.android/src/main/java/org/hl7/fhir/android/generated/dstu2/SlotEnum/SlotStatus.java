package org.hl7.fhir.android.generated.dstu2.SlotEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.SlotEnum.SlotStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.SlotEnum.SlotStatus;

public enum SlotStatus {

    /**
     * Indicates that the time interval is busy because one  or more events have been scheduled for that interval.
     */
    BUSY,
    /**
     * Indicates that the time interval is free for scheduling.
     */
    FREE,
    /**
     * Indicates that the time interval is busy and that the interval can not be scheduled.
     */
    BUSYUNAVAILABLE,
    /**
     * Indicates that the time interval is busy because one or more events have been tentatively scheduled for that interval.
     */
    BUSYTENTATIVE,
    /**
     * added to help the parsers
     */
    NULL;

    public static SlotStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("busy".equals(codeString))
            return BUSY;
        if ("free".equals(codeString))
            return FREE;
        if ("busy-unavailable".equals(codeString))
            return BUSYUNAVAILABLE;
        if ("busy-tentative".equals(codeString))
            return BUSYTENTATIVE;
        throw new FHIRException("Unknown SlotStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case BUSY:
                return "busy";
            case FREE:
                return "free";
            case BUSYUNAVAILABLE:
                return "busy-unavailable";
            case BUSYTENTATIVE:
                return "busy-tentative";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case BUSY:
                return "http://hl7.org/fhir/slotstatus";
            case FREE:
                return "http://hl7.org/fhir/slotstatus";
            case BUSYUNAVAILABLE:
                return "http://hl7.org/fhir/slotstatus";
            case BUSYTENTATIVE:
                return "http://hl7.org/fhir/slotstatus";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case BUSY:
                return "Indicates that the time interval is busy because one  or more events have been scheduled for that interval.";
            case FREE:
                return "Indicates that the time interval is free for scheduling.";
            case BUSYUNAVAILABLE:
                return "Indicates that the time interval is busy and that the interval can not be scheduled.";
            case BUSYTENTATIVE:
                return "Indicates that the time interval is busy because one or more events have been tentatively scheduled for that interval.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case BUSY:
                return "Busy";
            case FREE:
                return "Free";
            case BUSYUNAVAILABLE:
                return "Busy (Unavailable)";
            case BUSYTENTATIVE:
                return "Busy (Tentative)";
            default:
                return "?";
        }
    }
}
