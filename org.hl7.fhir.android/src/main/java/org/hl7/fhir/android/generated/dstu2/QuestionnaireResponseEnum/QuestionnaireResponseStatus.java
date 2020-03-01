package org.hl7.fhir.android.generated.dstu2.QuestionnaireResponseEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum QuestionnaireResponseStatus {

    /**
     * This QuestionnaireResponse has been partially filled out with answers, but changes or additions are still expected to be made to it.
     */
    INPROGRESS,
    /**
     * This QuestionnaireResponse has been filled out with answers, and the current content is regarded as definitive.
     */
    COMPLETED,
    /**
     * This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.
     */
    AMENDED,
    /**
     * added to help the parsers
     */
    NULL;

    public static QuestionnaireResponseStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return INPROGRESS;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("amended".equals(codeString))
            return AMENDED;
        throw new FHIRException("Unknown QuestionnaireResponseStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INPROGRESS:
                return "in-progress";
            case COMPLETED:
                return "completed";
            case AMENDED:
                return "amended";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INPROGRESS:
                return "http://hl7.org/fhir/questionnaire-answers-status";
            case COMPLETED:
                return "http://hl7.org/fhir/questionnaire-answers-status";
            case AMENDED:
                return "http://hl7.org/fhir/questionnaire-answers-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INPROGRESS:
                return "This QuestionnaireResponse has been partially filled out with answers, but changes or additions are still expected to be made to it.";
            case COMPLETED:
                return "This QuestionnaireResponse has been filled out with answers, and the current content is regarded as definitive.";
            case AMENDED:
                return "This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INPROGRESS:
                return "In Progress";
            case COMPLETED:
                return "Completed";
            case AMENDED:
                return "Amended";
            default:
                return "?";
        }
    }
}
