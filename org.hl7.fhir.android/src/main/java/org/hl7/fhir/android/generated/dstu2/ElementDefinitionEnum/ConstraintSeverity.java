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

public enum ConstraintSeverity {

    /**
     * If the constraint is violated, the resource is not conformant.
     */
    ERROR,
    /**
     * If the constraint is violated, the resource is conformant, but it is not necessarily following best practice.
     */
    WARNING,
    /**
     * added to help the parsers
     */
    NULL;

    public static ConstraintSeverity fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("error".equals(codeString))
            return ERROR;
        if ("warning".equals(codeString))
            return WARNING;
        throw new FHIRException("Unknown ConstraintSeverity code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ERROR:
                return "error";
            case WARNING:
                return "warning";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ERROR:
                return "http://hl7.org/fhir/constraint-severity";
            case WARNING:
                return "http://hl7.org/fhir/constraint-severity";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ERROR:
                return "If the constraint is violated, the resource is not conformant.";
            case WARNING:
                return "If the constraint is violated, the resource is conformant, but it is not necessarily following best practice.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ERROR:
                return "Error";
            case WARNING:
                return "Warning";
            default:
                return "?";
        }
    }
}
