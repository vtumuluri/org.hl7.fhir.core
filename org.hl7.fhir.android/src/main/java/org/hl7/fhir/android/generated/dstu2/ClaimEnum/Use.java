package org.hl7.fhir.android.generated.dstu2.ClaimEnum;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimType;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.UseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.Use;

public enum Use {

    /**
     * The treatment is complete and this represents a Claim for the services.
     */
    COMPLETE,
    /**
     * The treatment is proposed and this represents a Pre-authorization for the services.
     */
    PROPOSED,
    /**
     * The treatment is proposed and this represents a Pre-determination for the services.
     */
    EXPLORATORY,
    /**
     * A locally defined or otherwise resolved status.
     */
    OTHER,
    /**
     * added to help the parsers
     */
    NULL;

    public static Use fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("complete".equals(codeString))
            return COMPLETE;
        if ("proposed".equals(codeString))
            return PROPOSED;
        if ("exploratory".equals(codeString))
            return EXPLORATORY;
        if ("other".equals(codeString))
            return OTHER;
        throw new FHIRException("Unknown Use code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case COMPLETE:
                return "complete";
            case PROPOSED:
                return "proposed";
            case EXPLORATORY:
                return "exploratory";
            case OTHER:
                return "other";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case COMPLETE:
                return "http://hl7.org/fhir/claim-use-link";
            case PROPOSED:
                return "http://hl7.org/fhir/claim-use-link";
            case EXPLORATORY:
                return "http://hl7.org/fhir/claim-use-link";
            case OTHER:
                return "http://hl7.org/fhir/claim-use-link";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case COMPLETE:
                return "The treatment is complete and this represents a Claim for the services.";
            case PROPOSED:
                return "The treatment is proposed and this represents a Pre-authorization for the services.";
            case EXPLORATORY:
                return "The treatment is proposed and this represents a Pre-determination for the services.";
            case OTHER:
                return "A locally defined or otherwise resolved status.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case COMPLETE:
                return "Complete";
            case PROPOSED:
                return "Proposed";
            case EXPLORATORY:
                return "Exploratory";
            case OTHER:
                return "Other";
            default:
                return "?";
        }
    }
}
