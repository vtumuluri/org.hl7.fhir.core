package org.hl7.fhir.android.generated.dstu2.EpisodeOfCareEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum EpisodeOfCareStatus {

    /**
     * This episode of care is planned to start at the date specified in the period.start. During this status an organization may perform assessments to determine if they are eligible to receive services, or be organizing to make resources available to provide care services.
     */
    PLANNED,
    /**
     * This episode has been placed on a waitlist, pending the episode being made active (or cancelled).
     */
    WAITLIST,
    /**
     * This episode of care is current.
     */
    ACTIVE,
    /**
     * This episode of care is on hold, the organization has limited responsibility for the patient (such as while on respite).
     */
    ONHOLD,
    /**
     * This episode of care is finished at the organization is not expecting to be providing care to the patient. Can also be known as "closed", "completed" or other similar terms.
     */
    FINISHED,
    /**
     * The episode of care was cancelled, or withdrawn from service, often selected during the planned stage as the patient may have gone elsewhere, or the circumstances have changed and the organization is unable to provide the care. It indicates that services terminated outside the planned/expected workflow.
     */
    CANCELLED,
    /**
     * added to help the parsers
     */
    NULL;

    public static EpisodeOfCareStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("planned".equals(codeString))
            return PLANNED;
        if ("waitlist".equals(codeString))
            return WAITLIST;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("onhold".equals(codeString))
            return ONHOLD;
        if ("finished".equals(codeString))
            return FINISHED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        throw new FHIRException("Unknown EpisodeOfCareStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PLANNED:
                return "planned";
            case WAITLIST:
                return "waitlist";
            case ACTIVE:
                return "active";
            case ONHOLD:
                return "onhold";
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
                return "http://hl7.org/fhir/episode-of-care-status";
            case WAITLIST:
                return "http://hl7.org/fhir/episode-of-care-status";
            case ACTIVE:
                return "http://hl7.org/fhir/episode-of-care-status";
            case ONHOLD:
                return "http://hl7.org/fhir/episode-of-care-status";
            case FINISHED:
                return "http://hl7.org/fhir/episode-of-care-status";
            case CANCELLED:
                return "http://hl7.org/fhir/episode-of-care-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PLANNED:
                return "This episode of care is planned to start at the date specified in the period.start. During this status an organization may perform assessments to determine if they are eligible to receive services, or be organizing to make resources available to provide care services.";
            case WAITLIST:
                return "This episode has been placed on a waitlist, pending the episode being made active (or cancelled).";
            case ACTIVE:
                return "This episode of care is current.";
            case ONHOLD:
                return "This episode of care is on hold, the organization has limited responsibility for the patient (such as while on respite).";
            case FINISHED:
                return "This episode of care is finished at the organization is not expecting to be providing care to the patient. Can also be known as \"closed\", \"completed\" or other similar terms.";
            case CANCELLED:
                return "The episode of care was cancelled, or withdrawn from service, often selected during the planned stage as the patient may have gone elsewhere, or the circumstances have changed and the organization is unable to provide the care. It indicates that services terminated outside the planned/expected workflow.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PLANNED:
                return "Planned";
            case WAITLIST:
                return "Waitlist";
            case ACTIVE:
                return "Active";
            case ONHOLD:
                return "On Hold";
            case FINISHED:
                return "Finished";
            case CANCELLED:
                return "Cancelled";
            default:
                return "?";
        }
    }
}
