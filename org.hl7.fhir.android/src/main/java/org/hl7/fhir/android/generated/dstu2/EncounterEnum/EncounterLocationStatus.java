package org.hl7.fhir.android.generated.dstu2.EncounterEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterStateEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterState;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatus;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClassEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClass;

public enum EncounterLocationStatus {

    /**
     * The patient is planned to be moved to this location at some point in the future.
     */
    PLANNED,
    /**
     *  The patient is currently at this location, or was between the period specified.
     *
     * A system may update these records when the patient leaves the location to either reserved, or completed
     */
    ACTIVE,
    /**
     * This location is held empty for this patient.
     */
    RESERVED,
    /**
     *  The patient was at this location during the period specified.
     *
     * Not to be used when the patient is currently at the location
     */
    COMPLETED,
    /**
     * added to help the parsers
     */
    NULL;

    public static EncounterLocationStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("planned".equals(codeString))
            return PLANNED;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("reserved".equals(codeString))
            return RESERVED;
        if ("completed".equals(codeString))
            return COMPLETED;
        throw new FHIRException("Unknown EncounterLocationStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PLANNED:
                return "planned";
            case ACTIVE:
                return "active";
            case RESERVED:
                return "reserved";
            case COMPLETED:
                return "completed";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PLANNED:
                return "http://hl7.org/fhir/encounter-location-status";
            case ACTIVE:
                return "http://hl7.org/fhir/encounter-location-status";
            case RESERVED:
                return "http://hl7.org/fhir/encounter-location-status";
            case COMPLETED:
                return "http://hl7.org/fhir/encounter-location-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PLANNED:
                return "The patient is planned to be moved to this location at some point in the future.";
            case ACTIVE:
                return "The patient is currently at this location, or was between the period specified.\n\nA system may update these records when the patient leaves the location to either reserved, or completed";
            case RESERVED:
                return "This location is held empty for this patient.";
            case COMPLETED:
                return "The patient was at this location during the period specified.\n\nNot to be used when the patient is currently at the location";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PLANNED:
                return "Planned";
            case ACTIVE:
                return "Active";
            case RESERVED:
                return "Reserved";
            case COMPLETED:
                return "Completed";
            default:
                return "?";
        }
    }
}
