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

public enum PropertyRepresentation {

    /**
     * In XML, this property is represented as an attribute not an element.
     */
    XMLATTR,
    /**
     * added to help the parsers
     */
    NULL;

    public static PropertyRepresentation fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("xmlAttr".equals(codeString))
            return XMLATTR;
        throw new FHIRException("Unknown PropertyRepresentation code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case XMLATTR:
                return "xmlAttr";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case XMLATTR:
                return "http://hl7.org/fhir/property-representation";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case XMLATTR:
                return "In XML, this property is represented as an attribute not an element.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case XMLATTR:
                return "XML Attribute";
            default:
                return "?";
        }
    }
}
