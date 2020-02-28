package org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum QuestionnaireStatus {

    /**
     * This Questionnaire is not ready for official use.
     */
    DRAFT,
    /**
     * This Questionnaire is ready for use.
     */
    PUBLISHED,
    /**
     * This Questionnaire should no longer be used to gather data.
     */
    RETIRED,
    /**
     * added to help the parsers
     */
    NULL;

    public static QuestionnaireStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("draft".equals(codeString))
            return DRAFT;
        if ("published".equals(codeString))
            return PUBLISHED;
        if ("retired".equals(codeString))
            return RETIRED;
        throw new FHIRException("Unknown QuestionnaireStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case DRAFT:
                return "draft";
            case PUBLISHED:
                return "published";
            case RETIRED:
                return "retired";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case DRAFT:
                return "http://hl7.org/fhir/questionnaire-status";
            case PUBLISHED:
                return "http://hl7.org/fhir/questionnaire-status";
            case RETIRED:
                return "http://hl7.org/fhir/questionnaire-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case DRAFT:
                return "This Questionnaire is not ready for official use.";
            case PUBLISHED:
                return "This Questionnaire is ready for use.";
            case RETIRED:
                return "This Questionnaire should no longer be used to gather data.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case DRAFT:
                return "Draft";
            case PUBLISHED:
                return "Published";
            case RETIRED:
                return "Retired";
            default:
                return "?";
        }
    }
}
