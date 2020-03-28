package org.hl7.fhir.android.generated.dstu2.ImagingStudyEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ImagingStudyEnum.InstanceAvailabilityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImagingStudyEnum.InstanceAvailability;

public enum InstanceAvailability {

    /**
     * null
     */
    ONLINE,
    /**
     * null
     */
    OFFLINE,
    /**
     * null
     */
    NEARLINE,
    /**
     * null
     */
    UNAVAILABLE,
    /**
     * added to help the parsers
     */
    NULL;

    public static InstanceAvailability fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("ONLINE".equals(codeString))
            return ONLINE;
        if ("OFFLINE".equals(codeString))
            return OFFLINE;
        if ("NEARLINE".equals(codeString))
            return NEARLINE;
        if ("UNAVAILABLE".equals(codeString))
            return UNAVAILABLE;
        throw new FHIRException("Unknown InstanceAvailability code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ONLINE:
                return "ONLINE";
            case OFFLINE:
                return "OFFLINE";
            case NEARLINE:
                return "NEARLINE";
            case UNAVAILABLE:
                return "UNAVAILABLE";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ONLINE:
                return "http://nema.org/dicom/dicm";
            case OFFLINE:
                return "http://nema.org/dicom/dicm";
            case NEARLINE:
                return "http://nema.org/dicom/dicm";
            case UNAVAILABLE:
                return "http://nema.org/dicom/dicm";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ONLINE:
                return "";
            case OFFLINE:
                return "";
            case NEARLINE:
                return "";
            case UNAVAILABLE:
                return "";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ONLINE:
                return "ONLINE";
            case OFFLINE:
                return "OFFLINE";
            case NEARLINE:
                return "NEARLINE";
            case UNAVAILABLE:
                return "UNAVAILABLE";
            default:
                return "?";
        }
    }
}
