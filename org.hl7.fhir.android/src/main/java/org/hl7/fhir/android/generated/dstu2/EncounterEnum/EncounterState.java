package org.hl7.fhir.android.generated.dstu2.EncounterEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum EncounterState {

    /**
     * The Encounter has not yet started.
     */
    PLANNED,
    /**
     * The Patient is present for the encounter, however is not currently meeting with a practitioner.
     */
    ARRIVED,
    /**
     * The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
     */
    INPROGRESS,
    /**
     * The Encounter has begun, but the patient is temporarily on leave.
     */
    ONLEAVE,
    /**
     * The Encounter has ended.
     */
    FINISHED,
    /**
     * The Encounter has ended before it has begun.
     */
    CANCELLED,
    /**
     * added to help the parsers
     */
    NULL;

    public static EncounterState fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("planned".equals(codeString))
            return PLANNED;
        if ("arrived".equals(codeString))
            return ARRIVED;
        if ("in-progress".equals(codeString))
            return INPROGRESS;
        if ("onleave".equals(codeString))
            return ONLEAVE;
        if ("finished".equals(codeString))
            return FINISHED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        throw new FHIRException("Unknown EncounterState code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PLANNED:
                return "planned";
            case ARRIVED:
                return "arrived";
            case INPROGRESS:
                return "in-progress";
            case ONLEAVE:
                return "onleave";
            case FINISHED:
                return "finished";
            case CANCELLED:
                return "cancelled";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PLANNED:
                return "http://hl7.org/fhir/encounter-state";
            case ARRIVED:
                return "http://hl7.org/fhir/encounter-state";
            case INPROGRESS:
                return "http://hl7.org/fhir/encounter-state";
            case ONLEAVE:
                return "http://hl7.org/fhir/encounter-state";
            case FINISHED:
                return "http://hl7.org/fhir/encounter-state";
            case CANCELLED:
                return "http://hl7.org/fhir/encounter-state";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PLANNED:
                return "The Encounter has not yet started.";
            case ARRIVED:
                return "The Patient is present for the encounter, however is not currently meeting with a practitioner.";
            case INPROGRESS:
                return "The Encounter has begun and the patient is present / the practitioner and the patient are meeting.";
            case ONLEAVE:
                return "The Encounter has begun, but the patient is temporarily on leave.";
            case FINISHED:
                return "The Encounter has ended.";
            case CANCELLED:
                return "The Encounter has ended before it has begun.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PLANNED:
                return "Planned";
            case ARRIVED:
                return "Arrived";
            case INPROGRESS:
                return "in Progress";
            case ONLEAVE:
                return "On Leave";
            case FINISHED:
                return "Finished";
            case CANCELLED:
                return "Cancelled";
            default:
                return "?";
        }
    }
}
