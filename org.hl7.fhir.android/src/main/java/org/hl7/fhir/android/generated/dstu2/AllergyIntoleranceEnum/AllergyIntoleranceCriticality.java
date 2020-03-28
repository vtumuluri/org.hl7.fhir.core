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

public enum AllergyIntoleranceCriticality {

    /**
     * The potential clinical impact of a future reaction is estimated as low risk: exposure to substance is unlikely to result in a life threatening or organ system threatening outcome. Future exposure to the Substance is considered a relative contra-indication.
     */
    CRITL,
    /**
     * The potential clinical impact of a future reaction is estimated as high risk: exposure to substance may result in a life threatening or organ system threatening outcome. Future exposure to the Substance may be considered an absolute contra-indication.
     */
    CRITH,
    /**
     * Unable to assess the potential clinical impact with the information available.
     */
    CRITU,
    /**
     * added to help the parsers
     */
    NULL;

    public static AllergyIntoleranceCriticality fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("CRITL".equals(codeString))
            return CRITL;
        if ("CRITH".equals(codeString))
            return CRITH;
        if ("CRITU".equals(codeString))
            return CRITU;
        throw new FHIRException("Unknown AllergyIntoleranceCriticality code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CRITL:
                return "CRITL";
            case CRITH:
                return "CRITH";
            case CRITU:
                return "CRITU";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CRITL:
                return "http://hl7.org/fhir/allergy-intolerance-criticality";
            case CRITH:
                return "http://hl7.org/fhir/allergy-intolerance-criticality";
            case CRITU:
                return "http://hl7.org/fhir/allergy-intolerance-criticality";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CRITL:
                return "The potential clinical impact of a future reaction is estimated as low risk: exposure to substance is unlikely to result in a life threatening or organ system threatening outcome. Future exposure to the Substance is considered a relative contra-indication.";
            case CRITH:
                return "The potential clinical impact of a future reaction is estimated as high risk: exposure to substance may result in a life threatening or organ system threatening outcome. Future exposure to the Substance may be considered an absolute contra-indication.";
            case CRITU:
                return "Unable to assess the potential clinical impact with the information available.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CRITL:
                return "Low Risk";
            case CRITH:
                return "High Risk";
            case CRITU:
                return "Unable to determine";
            default:
                return "?";
        }
    }
}
