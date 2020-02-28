package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AllergyIntoleranceCategory {

    /**
     * Any substance consumed to provide nutritional support for the body.
     */
    FOOD,
    /**
     * Substances administered to achieve a physiological effect.
     */
    MEDICATION,
    /**
     * Substances that are encountered in the environment.
     */
    ENVIRONMENT,
    /**
     * Other substances that are not covered by any other category.
     */
    OTHER,
    /**
     * added to help the parsers
     */
    NULL;

    public static AllergyIntoleranceCategory fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("food".equals(codeString))
            return FOOD;
        if ("medication".equals(codeString))
            return MEDICATION;
        if ("environment".equals(codeString))
            return ENVIRONMENT;
        if ("other".equals(codeString))
            return OTHER;
        throw new FHIRException("Unknown AllergyIntoleranceCategory code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case FOOD:
                return "food";
            case MEDICATION:
                return "medication";
            case ENVIRONMENT:
                return "environment";
            case OTHER:
                return "other";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case FOOD:
                return "http://hl7.org/fhir/allergy-intolerance-category";
            case MEDICATION:
                return "http://hl7.org/fhir/allergy-intolerance-category";
            case ENVIRONMENT:
                return "http://hl7.org/fhir/allergy-intolerance-category";
            case OTHER:
                return "http://hl7.org/fhir/allergy-intolerance-category";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case FOOD:
                return "Any substance consumed to provide nutritional support for the body.";
            case MEDICATION:
                return "Substances administered to achieve a physiological effect.";
            case ENVIRONMENT:
                return "Substances that are encountered in the environment.";
            case OTHER:
                return "Other substances that are not covered by any other category.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case FOOD:
                return "Food";
            case MEDICATION:
                return "Medication";
            case ENVIRONMENT:
                return "Environment";
            case OTHER:
                return "Other";
            default:
                return "?";
        }
    }
}
