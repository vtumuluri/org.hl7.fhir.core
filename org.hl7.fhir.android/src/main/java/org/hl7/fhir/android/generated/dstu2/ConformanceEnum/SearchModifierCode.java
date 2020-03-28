package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseConformance;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKind;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicy;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatus;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionMode;

public enum SearchModifierCode {

    /**
     * The search parameter returns resources that have a value or not.
     */
    MISSING,
    /**
     * The search parameter returns resources that have a value that exactly matches the supplied parameter (the whole string, including casing and accents).
     */
    EXACT,
    /**
     * The search parameter returns resources that include the supplied parameter value anywhere within the field being searched.
     */
    CONTAINS,
    /**
     * The search parameter returns resources that do not contain a match .
     */
    NOT,
    /**
     * The search parameter is processed as a string that searches text associated with the code/value - either CodeableConcept.text, Coding.display, or Identifier.type.text.
     */
    TEXT,
    /**
     * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is in the specified value set.
     */
    IN,
    /**
     * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is not in the specified value set.
     */
    NOTIN,
    /**
     * The search parameter tests whether the value in a resource is subsumed by the specified value (is-a, or hierarchical relationships).
     */
    BELOW,
    /**
     * The search parameter tests whether the value in a resource subsumes the specified value (is-a, or hierarchical relationships).
     */
    ABOVE,
    /**
     * The search parameter only applies to the Resource Type specified as a modifier (e.g. the modifier is not actually :type, but :Patient etc.).
     */
    TYPE,
    /**
     * added to help the parsers
     */
    NULL;

    public static SearchModifierCode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("missing".equals(codeString))
            return MISSING;
        if ("exact".equals(codeString))
            return EXACT;
        if ("contains".equals(codeString))
            return CONTAINS;
        if ("not".equals(codeString))
            return NOT;
        if ("text".equals(codeString))
            return TEXT;
        if ("in".equals(codeString))
            return IN;
        if ("not-in".equals(codeString))
            return NOTIN;
        if ("below".equals(codeString))
            return BELOW;
        if ("above".equals(codeString))
            return ABOVE;
        if ("type".equals(codeString))
            return TYPE;
        throw new FHIRException("Unknown SearchModifierCode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case MISSING:
                return "missing";
            case EXACT:
                return "exact";
            case CONTAINS:
                return "contains";
            case NOT:
                return "not";
            case TEXT:
                return "text";
            case IN:
                return "in";
            case NOTIN:
                return "not-in";
            case BELOW:
                return "below";
            case ABOVE:
                return "above";
            case TYPE:
                return "type";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case MISSING:
                return "http://hl7.org/fhir/search-modifier-code";
            case EXACT:
                return "http://hl7.org/fhir/search-modifier-code";
            case CONTAINS:
                return "http://hl7.org/fhir/search-modifier-code";
            case NOT:
                return "http://hl7.org/fhir/search-modifier-code";
            case TEXT:
                return "http://hl7.org/fhir/search-modifier-code";
            case IN:
                return "http://hl7.org/fhir/search-modifier-code";
            case NOTIN:
                return "http://hl7.org/fhir/search-modifier-code";
            case BELOW:
                return "http://hl7.org/fhir/search-modifier-code";
            case ABOVE:
                return "http://hl7.org/fhir/search-modifier-code";
            case TYPE:
                return "http://hl7.org/fhir/search-modifier-code";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case MISSING:
                return "The search parameter returns resources that have a value or not.";
            case EXACT:
                return "The search parameter returns resources that have a value that exactly matches the supplied parameter (the whole string, including casing and accents).";
            case CONTAINS:
                return "The search parameter returns resources that include the supplied parameter value anywhere within the field being searched.";
            case NOT:
                return "The search parameter returns resources that do not contain a match .";
            case TEXT:
                return "The search parameter is processed as a string that searches text associated with the code/value - either CodeableConcept.text, Coding.display, or Identifier.type.text.";
            case IN:
                return "The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is in the specified value set.";
            case NOTIN:
                return "The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is not in the specified value set.";
            case BELOW:
                return "The search parameter tests whether the value in a resource is subsumed by the specified value (is-a, or hierarchical relationships).";
            case ABOVE:
                return "The search parameter tests whether the value in a resource subsumes the specified value (is-a, or hierarchical relationships).";
            case TYPE:
                return "The search parameter only applies to the Resource Type specified as a modifier (e.g. the modifier is not actually :type, but :Patient etc.).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case MISSING:
                return "Missing";
            case EXACT:
                return "Exact";
            case CONTAINS:
                return "Contains";
            case NOT:
                return "Not";
            case TEXT:
                return "Text";
            case IN:
                return "In";
            case NOTIN:
                return "Not In";
            case BELOW:
                return "Below";
            case ABOVE:
                return "Above";
            case TYPE:
                return "Type";
            default:
                return "?";
        }
    }
}
