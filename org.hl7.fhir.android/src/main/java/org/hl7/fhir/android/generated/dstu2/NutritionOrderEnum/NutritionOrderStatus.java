package org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum.NutritionOrderStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum.NutritionOrderStatus;

public enum NutritionOrderStatus {

    /**
     * The request has been proposed.
     */
    PROPOSED,
    /**
     * The request is in preliminary form prior to being sent.
     */
    DRAFT,
    /**
     * The request has been planned.
     */
    PLANNED,
    /**
     * The request has been placed.
     */
    REQUESTED,
    /**
     * The request is 'actionable', but not all actions that are implied by it have occurred yet.
     */
    ACTIVE,
    /**
     * Actions implied by the request have been temporarily halted, but are expected to continue later. May also be called "suspended".
     */
    ONHOLD,
    /**
     * All actions that are implied by the order have occurred and no continuation is planned (this will rarely be made explicit).
     */
    COMPLETED,
    /**
     * The request has been withdrawn and is no longer actionable.
     */
    CANCELLED,
    /**
     * added to help the parsers
     */
    NULL;

    public static NutritionOrderStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return PROPOSED;
        if ("draft".equals(codeString))
            return DRAFT;
        if ("planned".equals(codeString))
            return PLANNED;
        if ("requested".equals(codeString))
            return REQUESTED;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("on-hold".equals(codeString))
            return ONHOLD;
        if ("completed".equals(codeString))
            return COMPLETED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        throw new FHIRException("Unknown NutritionOrderStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PROPOSED:
                return "proposed";
            case DRAFT:
                return "draft";
            case PLANNED:
                return "planned";
            case REQUESTED:
                return "requested";
            case ACTIVE:
                return "active";
            case ONHOLD:
                return "on-hold";
            case COMPLETED:
                return "completed";
            case CANCELLED:
                return "cancelled";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PROPOSED:
                return "http://hl7.org/fhir/nutrition-order-status";
            case DRAFT:
                return "http://hl7.org/fhir/nutrition-order-status";
            case PLANNED:
                return "http://hl7.org/fhir/nutrition-order-status";
            case REQUESTED:
                return "http://hl7.org/fhir/nutrition-order-status";
            case ACTIVE:
                return "http://hl7.org/fhir/nutrition-order-status";
            case ONHOLD:
                return "http://hl7.org/fhir/nutrition-order-status";
            case COMPLETED:
                return "http://hl7.org/fhir/nutrition-order-status";
            case CANCELLED:
                return "http://hl7.org/fhir/nutrition-order-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PROPOSED:
                return "The request has been proposed.";
            case DRAFT:
                return "The request is in preliminary form prior to being sent.";
            case PLANNED:
                return "The request has been planned.";
            case REQUESTED:
                return "The request has been placed.";
            case ACTIVE:
                return "The request is 'actionable', but not all actions that are implied by it have occurred yet.";
            case ONHOLD:
                return "Actions implied by the request have been temporarily halted, but are expected to continue later. May also be called \"suspended\".";
            case COMPLETED:
                return "All actions that are implied by the order have occurred and no continuation is planned (this will rarely be made explicit).";
            case CANCELLED:
                return "The request has been withdrawn and is no longer actionable.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PROPOSED:
                return "Proposed";
            case DRAFT:
                return "Draft";
            case PLANNED:
                return "Planned";
            case REQUESTED:
                return "Requested";
            case ACTIVE:
                return "Active";
            case ONHOLD:
                return "On-Hold";
            case COMPLETED:
                return "Completed";
            case CANCELLED:
                return "Cancelled";
            default:
                return "?";
        }
    }
}
