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

public enum MessageSignificanceCategory {

    /**
     * The message represents/requests a change that should not be processed more than once; e.g. Making a booking for an appointment.
     */
    CONSEQUENCE,
    /**
     * The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful.
     */
    CURRENCY,
    /**
     * The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications.
     */
    NOTIFICATION,
    /**
     * added to help the parsers
     */
    NULL;

    public static MessageSignificanceCategory fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("Consequence".equals(codeString))
            return CONSEQUENCE;
        if ("Currency".equals(codeString))
            return CURRENCY;
        if ("Notification".equals(codeString))
            return NOTIFICATION;
        throw new FHIRException("Unknown MessageSignificanceCategory code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CONSEQUENCE:
                return "Consequence";
            case CURRENCY:
                return "Currency";
            case NOTIFICATION:
                return "Notification";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CONSEQUENCE:
                return "http://hl7.org/fhir/message-significance-category";
            case CURRENCY:
                return "http://hl7.org/fhir/message-significance-category";
            case NOTIFICATION:
                return "http://hl7.org/fhir/message-significance-category";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CONSEQUENCE:
                return "The message represents/requests a change that should not be processed more than once; e.g. Making a booking for an appointment.";
            case CURRENCY:
                return "The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful.";
            case NOTIFICATION:
                return "The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CONSEQUENCE:
                return "Consequence";
            case CURRENCY:
                return "Currency";
            case NOTIFICATION:
                return "Notification";
            default:
                return "?";
        }
    }
}
