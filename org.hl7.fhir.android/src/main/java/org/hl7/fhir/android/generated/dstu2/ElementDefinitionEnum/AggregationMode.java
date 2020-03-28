package org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrength;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrengthEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverity;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentationEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentation;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationMode;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRulesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRules;

public enum AggregationMode {

    /**
     * The reference is a local reference to a contained resource.
     */
    CONTAINED,
    /**
     * The reference to a resource that has to be resolved externally to the resource that includes the reference.
     */
    REFERENCED,
    /**
     * The resource the reference points to will be found in the same bundle as the resource that includes the reference.
     */
    BUNDLED,
    /**
     * added to help the parsers
     */
    NULL;

    public static AggregationMode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("contained".equals(codeString))
            return CONTAINED;
        if ("referenced".equals(codeString))
            return REFERENCED;
        if ("bundled".equals(codeString))
            return BUNDLED;
        throw new FHIRException("Unknown AggregationMode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CONTAINED:
                return "contained";
            case REFERENCED:
                return "referenced";
            case BUNDLED:
                return "bundled";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CONTAINED:
                return "http://hl7.org/fhir/resource-aggregation-mode";
            case REFERENCED:
                return "http://hl7.org/fhir/resource-aggregation-mode";
            case BUNDLED:
                return "http://hl7.org/fhir/resource-aggregation-mode";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CONTAINED:
                return "The reference is a local reference to a contained resource.";
            case REFERENCED:
                return "The reference to a resource that has to be resolved externally to the resource that includes the reference.";
            case BUNDLED:
                return "The resource the reference points to will be found in the same bundle as the resource that includes the reference.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CONTAINED:
                return "Contained";
            case REFERENCED:
                return "Referenced";
            case BUNDLED:
                return "Bundled";
            default:
                return "?";
        }
    }
}
