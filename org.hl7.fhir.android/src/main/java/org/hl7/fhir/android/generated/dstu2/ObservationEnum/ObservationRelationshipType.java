package org.hl7.fhir.android.generated.dstu2.ObservationEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationRelationshipTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationRelationshipType;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationStatus;

public enum ObservationRelationshipType {

    /**
     * This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
     */
    HASMEMBER,
    /**
     * The target resource (Observation or QuestionnaireResponse) is part of the information from which this observation value is derived. (e.g. calculated anion gap, Apgar score)  NOTE:  "derived-from" is only logical choice when referencing QuestionnaireResponse.
     */
    DERIVEDFROM,
    /**
     * This observation follows the target observation (e.g. timed tests such as Glucose Tolerance Test).
     */
    SEQUELTO,
    /**
     * This observation replaces a previous observation (i.e. a revised value). The target observation is now obsolete.
     */
    REPLACES,
    /**
     * The value of the target observation qualifies (refines) the semantics of the source observation (e.g. a lipemia measure target from a plasma measure).
     */
    QUALIFIEDBY,
    /**
     * The value of the target observation interferes (degrades quality, or prevents valid observation) with the semantics of the source observation (e.g. a hemolysis measure target from a plasma potassium measure which has no value).
     */
    INTERFEREDBY,
    /**
     * added to help the parsers
     */
    NULL;

    public static ObservationRelationshipType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("has-member".equals(codeString))
            return HASMEMBER;
        if ("derived-from".equals(codeString))
            return DERIVEDFROM;
        if ("sequel-to".equals(codeString))
            return SEQUELTO;
        if ("replaces".equals(codeString))
            return REPLACES;
        if ("qualified-by".equals(codeString))
            return QUALIFIEDBY;
        if ("interfered-by".equals(codeString))
            return INTERFEREDBY;
        throw new FHIRException("Unknown ObservationRelationshipType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case HASMEMBER:
                return "has-member";
            case DERIVEDFROM:
                return "derived-from";
            case SEQUELTO:
                return "sequel-to";
            case REPLACES:
                return "replaces";
            case QUALIFIEDBY:
                return "qualified-by";
            case INTERFEREDBY:
                return "interfered-by";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case HASMEMBER:
                return "http://hl7.org/fhir/observation-relationshiptypes";
            case DERIVEDFROM:
                return "http://hl7.org/fhir/observation-relationshiptypes";
            case SEQUELTO:
                return "http://hl7.org/fhir/observation-relationshiptypes";
            case REPLACES:
                return "http://hl7.org/fhir/observation-relationshiptypes";
            case QUALIFIEDBY:
                return "http://hl7.org/fhir/observation-relationshiptypes";
            case INTERFEREDBY:
                return "http://hl7.org/fhir/observation-relationshiptypes";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case HASMEMBER:
                return "This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.";
            case DERIVEDFROM:
                return "The target resource (Observation or QuestionnaireResponse) is part of the information from which this observation value is derived. (e.g. calculated anion gap, Apgar score)  NOTE:  \"derived-from\" is only logical choice when referencing QuestionnaireResponse.";
            case SEQUELTO:
                return "This observation follows the target observation (e.g. timed tests such as Glucose Tolerance Test).";
            case REPLACES:
                return "This observation replaces a previous observation (i.e. a revised value). The target observation is now obsolete.";
            case QUALIFIEDBY:
                return "The value of the target observation qualifies (refines) the semantics of the source observation (e.g. a lipemia measure target from a plasma measure).";
            case INTERFEREDBY:
                return "The value of the target observation interferes (degrades quality, or prevents valid observation) with the semantics of the source observation (e.g. a hemolysis measure target from a plasma potassium measure which has no value).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case HASMEMBER:
                return "Has Member";
            case DERIVEDFROM:
                return "Derived From";
            case SEQUELTO:
                return "Sequel To";
            case REPLACES:
                return "Replaces";
            case QUALIFIEDBY:
                return "Qualified By";
            case INTERFEREDBY:
                return "Interfered By";
            default:
                return "?";
        }
    }
}
