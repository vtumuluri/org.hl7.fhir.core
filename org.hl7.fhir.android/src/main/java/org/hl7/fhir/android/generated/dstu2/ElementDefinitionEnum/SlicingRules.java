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

public enum SlicingRules {

    /**
     * No additional content is allowed other than that described by the slices in this profile.
     */
    CLOSED,
    /**
     * Additional content is allowed anywhere in the list.
     */
    OPEN,
    /**
     * Additional content is allowed, but only at the end of the list. Note that using this requires that the slices be ordered, which makes it hard to share uses. This should only be done where absolutely required.
     */
    OPENATEND,
    /**
     * added to help the parsers
     */
    NULL;

    public static SlicingRules fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("closed".equals(codeString))
            return CLOSED;
        if ("open".equals(codeString))
            return OPEN;
        if ("openAtEnd".equals(codeString))
            return OPENATEND;
        throw new FHIRException("Unknown SlicingRules code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CLOSED:
                return "closed";
            case OPEN:
                return "open";
            case OPENATEND:
                return "openAtEnd";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CLOSED:
                return "http://hl7.org/fhir/resource-slicing-rules";
            case OPEN:
                return "http://hl7.org/fhir/resource-slicing-rules";
            case OPENATEND:
                return "http://hl7.org/fhir/resource-slicing-rules";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CLOSED:
                return "No additional content is allowed other than that described by the slices in this profile.";
            case OPEN:
                return "Additional content is allowed anywhere in the list.";
            case OPENATEND:
                return "Additional content is allowed, but only at the end of the list. Note that using this requires that the slices be ordered, which makes it hard to share uses. This should only be done where absolutely required.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CLOSED:
                return "Closed";
            case OPEN:
                return "Open";
            case OPENATEND:
                return "Open at End";
            default:
                return "?";
        }
    }
}
