package org.hl7.fhir.android.generated.dstu2.QuantityEnum;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.List;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.QuantityEnum.QuantityComparatorEnumFactory;
import org.hl7.fhir.android.generated.dstu2.QuantityEnum.QuantityComparator;

public enum QuantityComparator {

    /**
     * The actual value is less than the given value.
     */
    LESS_THAN,
    /**
     * The actual value is less than or equal to the given value.
     */
    LESS_OR_EQUAL,
    /**
     * The actual value is greater than or equal to the given value.
     */
    GREATER_OR_EQUAL,
    /**
     * The actual value is greater than the given value.
     */
    GREATER_THAN,
    /**
     * added to help the parsers
     */
    NULL;

    public static QuantityComparator fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("<".equals(codeString))
            return LESS_THAN;
        if ("<=".equals(codeString))
            return LESS_OR_EQUAL;
        if (">=".equals(codeString))
            return GREATER_OR_EQUAL;
        if (">".equals(codeString))
            return GREATER_THAN;
        throw new FHIRException("Unknown QuantityComparator code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case LESS_THAN:
                return "<";
            case LESS_OR_EQUAL:
                return "<=";
            case GREATER_OR_EQUAL:
                return ">=";
            case GREATER_THAN:
                return ">";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case LESS_THAN:
                return "http://hl7.org/fhir/quantity-comparator";
            case LESS_OR_EQUAL:
                return "http://hl7.org/fhir/quantity-comparator";
            case GREATER_OR_EQUAL:
                return "http://hl7.org/fhir/quantity-comparator";
            case GREATER_THAN:
                return "http://hl7.org/fhir/quantity-comparator";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case LESS_THAN:
                return "The actual value is less than the given value.";
            case LESS_OR_EQUAL:
                return "The actual value is less than or equal to the given value.";
            case GREATER_OR_EQUAL:
                return "The actual value is greater than or equal to the given value.";
            case GREATER_THAN:
                return "The actual value is greater than the given value.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case LESS_THAN:
                return "Less than";
            case LESS_OR_EQUAL:
                return "Less or Equal to";
            case GREATER_OR_EQUAL:
                return "Greater or Equal to";
            case GREATER_THAN:
                return "Greater than";
            default:
                return "?";
        }
    }
}
