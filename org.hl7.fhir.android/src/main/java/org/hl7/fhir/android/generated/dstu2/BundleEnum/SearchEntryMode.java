package org.hl7.fhir.android.generated.dstu2.BundleEnum;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerbEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerb;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryMode;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleType;

public enum SearchEntryMode {

    /**
     * This resource matched the search specification.
     */
    MATCH,
    /**
     * This resource is returned because it is referred to from another resource in the search set.
     */
    INCLUDE,
    /**
     * An OperationOutcome that provides additional information about the processing of a search.
     */
    OUTCOME,
    /**
     * added to help the parsers
     */
    NULL;

    public static SearchEntryMode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("match".equals(codeString))
            return MATCH;
        if ("include".equals(codeString))
            return INCLUDE;
        if ("outcome".equals(codeString))
            return OUTCOME;
        throw new FHIRException("Unknown SearchEntryMode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case MATCH:
                return "match";
            case INCLUDE:
                return "include";
            case OUTCOME:
                return "outcome";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case MATCH:
                return "http://hl7.org/fhir/search-entry-mode";
            case INCLUDE:
                return "http://hl7.org/fhir/search-entry-mode";
            case OUTCOME:
                return "http://hl7.org/fhir/search-entry-mode";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case MATCH:
                return "This resource matched the search specification.";
            case INCLUDE:
                return "This resource is returned because it is referred to from another resource in the search set.";
            case OUTCOME:
                return "An OperationOutcome that provides additional information about the processing of a search.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case MATCH:
                return "Match";
            case INCLUDE:
                return "Include";
            case OUTCOME:
                return "Outcome";
            default:
                return "?";
        }
    }
}
