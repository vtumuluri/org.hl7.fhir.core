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

public enum LocationMode {

    /**
     * The Location resource represents a specific instance of a location (e.g. Operating Theatre 1A).
     */
    INSTANCE,
    /**
     * The Location represents a class of locations (e.g. Any Operating Theatre) although this class of locations could be constrained within a specific boundary (such as organization, or parent location, address etc.).
     */
    KIND,
    /**
     * added to help the parsers
     */
    NULL;

    public static LocationMode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("instance".equals(codeString))
            return INSTANCE;
        if ("kind".equals(codeString))
            return KIND;
        throw new FHIRException("Unknown LocationMode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INSTANCE:
                return "instance";
            case KIND:
                return "kind";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INSTANCE:
                return "http://hl7.org/fhir/location-mode";
            case KIND:
                return "http://hl7.org/fhir/location-mode";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INSTANCE:
                return "The Location resource represents a specific instance of a location (e.g. Operating Theatre 1A).";
            case KIND:
                return "The Location represents a class of locations (e.g. Any Operating Theatre) although this class of locations could be constrained within a specific boundary (such as organization, or parent location, address etc.).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INSTANCE:
                return "Instance";
            case KIND:
                return "Kind";
            default:
                return "?";
        }
    }
}
