package org.hl7.fhir.android.generated.dstu2.ValueSetEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperatorEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperator;

public enum FilterOperator {

    /**
     * The specified property of the code equals the provided value.
     */
    EQUAL,
    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself.
     */
    ISA,
    /**
     * The specified property of the code does not have an is-a relationship with the provided value.
     */
    ISNOTA,
    /**
     * The specified property of the code  matches the regex specified in the provided value.
     */
    REGEX,
    /**
     * The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list).
     */
    IN,
    /**
     * The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list).
     */
    NOTIN,
    /**
     * added to help the parsers
     */
    NULL;

    public static FilterOperator fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("=".equals(codeString))
            return EQUAL;
        if ("is-a".equals(codeString))
            return ISA;
        if ("is-not-a".equals(codeString))
            return ISNOTA;
        if ("regex".equals(codeString))
            return REGEX;
        if ("in".equals(codeString))
            return IN;
        if ("not-in".equals(codeString))
            return NOTIN;
        throw new FHIRException("Unknown FilterOperator code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case EQUAL:
                return "=";
            case ISA:
                return "is-a";
            case ISNOTA:
                return "is-not-a";
            case REGEX:
                return "regex";
            case IN:
                return "in";
            case NOTIN:
                return "not-in";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case EQUAL:
                return "http://hl7.org/fhir/filter-operator";
            case ISA:
                return "http://hl7.org/fhir/filter-operator";
            case ISNOTA:
                return "http://hl7.org/fhir/filter-operator";
            case REGEX:
                return "http://hl7.org/fhir/filter-operator";
            case IN:
                return "http://hl7.org/fhir/filter-operator";
            case NOTIN:
                return "http://hl7.org/fhir/filter-operator";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case EQUAL:
                return "The specified property of the code equals the provided value.";
            case ISA:
                return "Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself.";
            case ISNOTA:
                return "The specified property of the code does not have an is-a relationship with the provided value.";
            case REGEX:
                return "The specified property of the code  matches the regex specified in the provided value.";
            case IN:
                return "The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list).";
            case NOTIN:
                return "The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case EQUAL:
                return "Equals";
            case ISA:
                return "Is A (by subsumption)";
            case ISNOTA:
                return "Not (Is A) (by subsumption)";
            case REGEX:
                return "Regular Expression";
            case IN:
                return "In Set";
            case NOTIN:
                return "Not in Set";
            default:
                return "?";
        }
    }
}
