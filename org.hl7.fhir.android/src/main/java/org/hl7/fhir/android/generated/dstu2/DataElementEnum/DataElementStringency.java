package org.hl7.fhir.android.generated.dstu2.DataElementEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DataElementEnum.DataElementStringencyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DataElementEnum.DataElementStringency;

public enum DataElementStringency {

    /**
     * The data element is sufficiently well-constrained that multiple pieces of data captured according to the constraints of the data element will be comparable (though in some cases, a degree of automated conversion/normalization may be required).
     */
    COMPARABLE,
    /**
     * The data element is fully specified down to a single value set, single unit of measure, single data type, etc.  Multiple pieces of data associated with this data element are fully comparable.
     */
    FULLYSPECIFIED,
    /**
     * The data element allows multiple units of measure having equivalent meaning; e.g. "cc" (cubic centimeter) and "mL" (milliliter).
     */
    EQUIVALENT,
    /**
     * The data element allows multiple units of measure that are convertable between each other (e.g. inches and centimeters) and/or allows data to be captured in multiple value sets for which a known mapping exists allowing conversion of meaning.
     */
    CONVERTABLE,
    /**
     * A convertable data element where unit conversions are different only by a power of 10; e.g. g, mg, kg.
     */
    SCALEABLE,
    /**
     * The data element is unconstrained in units, choice of data types and/or choice of vocabulary such that automated comparison of data captured using the data element is not possible.
     */
    FLEXIBLE,
    /**
     * added to help the parsers
     */
    NULL;

    public static DataElementStringency fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("comparable".equals(codeString))
            return COMPARABLE;
        if ("fully-specified".equals(codeString))
            return FULLYSPECIFIED;
        if ("equivalent".equals(codeString))
            return EQUIVALENT;
        if ("convertable".equals(codeString))
            return CONVERTABLE;
        if ("scaleable".equals(codeString))
            return SCALEABLE;
        if ("flexible".equals(codeString))
            return FLEXIBLE;
        throw new FHIRException("Unknown DataElementStringency code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case COMPARABLE:
                return "comparable";
            case FULLYSPECIFIED:
                return "fully-specified";
            case EQUIVALENT:
                return "equivalent";
            case CONVERTABLE:
                return "convertable";
            case SCALEABLE:
                return "scaleable";
            case FLEXIBLE:
                return "flexible";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case COMPARABLE:
                return "http://hl7.org/fhir/dataelement-stringency";
            case FULLYSPECIFIED:
                return "http://hl7.org/fhir/dataelement-stringency";
            case EQUIVALENT:
                return "http://hl7.org/fhir/dataelement-stringency";
            case CONVERTABLE:
                return "http://hl7.org/fhir/dataelement-stringency";
            case SCALEABLE:
                return "http://hl7.org/fhir/dataelement-stringency";
            case FLEXIBLE:
                return "http://hl7.org/fhir/dataelement-stringency";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case COMPARABLE:
                return "The data element is sufficiently well-constrained that multiple pieces of data captured according to the constraints of the data element will be comparable (though in some cases, a degree of automated conversion/normalization may be required).";
            case FULLYSPECIFIED:
                return "The data element is fully specified down to a single value set, single unit of measure, single data type, etc.  Multiple pieces of data associated with this data element are fully comparable.";
            case EQUIVALENT:
                return "The data element allows multiple units of measure having equivalent meaning; e.g. \"cc\" (cubic centimeter) and \"mL\" (milliliter).";
            case CONVERTABLE:
                return "The data element allows multiple units of measure that are convertable between each other (e.g. inches and centimeters) and/or allows data to be captured in multiple value sets for which a known mapping exists allowing conversion of meaning.";
            case SCALEABLE:
                return "A convertable data element where unit conversions are different only by a power of 10; e.g. g, mg, kg.";
            case FLEXIBLE:
                return "The data element is unconstrained in units, choice of data types and/or choice of vocabulary such that automated comparison of data captured using the data element is not possible.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case COMPARABLE:
                return "Comparable";
            case FULLYSPECIFIED:
                return "Fully Specified";
            case EQUIVALENT:
                return "Equivalent";
            case CONVERTABLE:
                return "Convertable";
            case SCALEABLE:
                return "Scaleable";
            case FLEXIBLE:
                return "Flexible";
            default:
                return "?";
        }
    }
}
