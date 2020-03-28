package org.hl7.fhir.android.generated.dstu2.LocationEnum;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationMode;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationStatus;

public enum LocationStatus {

    /**
     * The location is operational.
     */
    ACTIVE,
    /**
     * The location is temporarily closed.
     */
    SUSPENDED,
    /**
     * The location is no longer used.
     */
    INACTIVE,
    /**
     * added to help the parsers
     */
    NULL;

    public static LocationStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("suspended".equals(codeString))
            return SUSPENDED;
        if ("inactive".equals(codeString))
            return INACTIVE;
        throw new FHIRException("Unknown LocationStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ACTIVE:
                return "active";
            case SUSPENDED:
                return "suspended";
            case INACTIVE:
                return "inactive";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ACTIVE:
                return "http://hl7.org/fhir/location-status";
            case SUSPENDED:
                return "http://hl7.org/fhir/location-status";
            case INACTIVE:
                return "http://hl7.org/fhir/location-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ACTIVE:
                return "The location is operational.";
            case SUSPENDED:
                return "The location is temporarily closed.";
            case INACTIVE:
                return "The location is no longer used.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ACTIVE:
                return "Active";
            case SUSPENDED:
                return "Suspended";
            case INACTIVE:
                return "Inactive";
            default:
                return "?";
        }
    }
}
