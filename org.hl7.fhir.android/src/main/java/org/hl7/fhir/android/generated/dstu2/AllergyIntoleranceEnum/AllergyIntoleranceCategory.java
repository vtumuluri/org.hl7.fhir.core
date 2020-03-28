package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCertaintyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCertainty;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceType;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCriticalityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCriticality;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceSeverity;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCategory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceStatus;

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
