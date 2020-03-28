package org.hl7.fhir.android.generated.dstu2.AuditEventEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventActionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventAction;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcomeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcome;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkType;

public enum AuditEventOutcome {

    /**
     * The operation completed successfully (whether with warnings or not).
     */
    _0,
    /**
     * The action was not successful due to some kind of catered for error (often equivalent to an HTTP 400 response).
     */
    _4,
    /**
     * The action was not successful due to some kind of unexpected error (often equivalent to an HTTP 500 response).
     */
    _8,
    /**
     * An error of such magnitude occurred that the system is no longer available for use (i.e. the system died).
     */
    _12,
    /**
     * added to help the parsers
     */
    NULL;

    public static AuditEventOutcome fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("0".equals(codeString))
            return _0;
        if ("4".equals(codeString))
            return _4;
        if ("8".equals(codeString))
            return _8;
        if ("12".equals(codeString))
            return _12;
        throw new FHIRException("Unknown AuditEventOutcome code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case _0:
                return "0";
            case _4:
                return "4";
            case _8:
                return "8";
            case _12:
                return "12";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case _0:
                return "http://hl7.org/fhir/audit-event-outcome";
            case _4:
                return "http://hl7.org/fhir/audit-event-outcome";
            case _8:
                return "http://hl7.org/fhir/audit-event-outcome";
            case _12:
                return "http://hl7.org/fhir/audit-event-outcome";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case _0:
                return "The operation completed successfully (whether with warnings or not).";
            case _4:
                return "The action was not successful due to some kind of catered for error (often equivalent to an HTTP 400 response).";
            case _8:
                return "The action was not successful due to some kind of unexpected error (often equivalent to an HTTP 500 response).";
            case _12:
                return "An error of such magnitude occurred that the system is no longer available for use (i.e. the system died).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case _0:
                return "Success";
            case _4:
                return "Minor failure";
            case _8:
                return "Serious failure";
            case _12:
                return "Major failure";
            default:
                return "?";
        }
    }
}
