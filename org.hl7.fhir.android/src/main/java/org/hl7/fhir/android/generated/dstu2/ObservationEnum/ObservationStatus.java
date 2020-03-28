package org.hl7.fhir.android.generated.dstu2.ObservationEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationRelationshipTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationRelationshipType;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationStatus;

public enum ObservationStatus {

    /**
     * The existence of the observation is registered, but there is no result yet available.
     */
    REGISTERED,
    /**
     * This is an initial or interim observation: data may be incomplete or unverified.
     */
    PRELIMINARY,
    /**
     * The observation is complete and verified by an authorized person.
     */
    FINAL,
    /**
     * The observation has been modified subsequent to being Final, and is complete and verified by an authorized person.
     */
    AMENDED,
    /**
     * The observation is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     */
    CANCELLED,
    /**
     * The observation has been withdrawn following previous final release.
     */
    ENTEREDINERROR,
    /**
     * The observation status is unknown.  Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
     */
    UNKNOWN,
    /**
     * added to help the parsers
     */
    NULL;

    public static ObservationStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("registered".equals(codeString))
            return REGISTERED;
        if ("preliminary".equals(codeString))
            return PRELIMINARY;
        if ("final".equals(codeString))
            return FINAL;
        if ("amended".equals(codeString))
            return AMENDED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        if ("unknown".equals(codeString))
            return UNKNOWN;
        throw new FHIRException("Unknown ObservationStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case REGISTERED:
                return "registered";
            case PRELIMINARY:
                return "preliminary";
            case FINAL:
                return "final";
            case AMENDED:
                return "amended";
            case CANCELLED:
                return "cancelled";
            case ENTEREDINERROR:
                return "entered-in-error";
            case UNKNOWN:
                return "unknown";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case REGISTERED:
                return "http://hl7.org/fhir/observation-status";
            case PRELIMINARY:
                return "http://hl7.org/fhir/observation-status";
            case FINAL:
                return "http://hl7.org/fhir/observation-status";
            case AMENDED:
                return "http://hl7.org/fhir/observation-status";
            case CANCELLED:
                return "http://hl7.org/fhir/observation-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/observation-status";
            case UNKNOWN:
                return "http://hl7.org/fhir/observation-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case REGISTERED:
                return "The existence of the observation is registered, but there is no result yet available.";
            case PRELIMINARY:
                return "This is an initial or interim observation: data may be incomplete or unverified.";
            case FINAL:
                return "The observation is complete and verified by an authorized person.";
            case AMENDED:
                return "The observation has been modified subsequent to being Final, and is complete and verified by an authorized person.";
            case CANCELLED:
                return "The observation is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\").";
            case ENTEREDINERROR:
                return "The observation has been withdrawn following previous final release.";
            case UNKNOWN:
                return "The observation status is unknown.  Note that \"unknown\" is a value of last resort and every attempt should be made to provide a meaningful value other than \"unknown\".";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case REGISTERED:
                return "Registered";
            case PRELIMINARY:
                return "Preliminary";
            case FINAL:
                return "Final";
            case AMENDED:
                return "Amended";
            case CANCELLED:
                return "cancelled";
            case ENTEREDINERROR:
                return "Entered in Error";
            case UNKNOWN:
                return "Unknown Status";
            default:
                return "?";
        }
    }
}
