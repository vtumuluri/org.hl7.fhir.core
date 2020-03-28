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

public enum AuditEventAction {

    /**
     * Create a new database object, such as placing an order.
     */
    C,
    /**
     * Display or print data, such as a doctor census.
     */
    R,
    /**
     * Update data, such as revise patient information.
     */
    U,
    /**
     * Delete items, such as a doctor master file record.
     */
    D,
    /**
     * Perform a system or application function such as log-on, program execution or use of an object's method, or perform a query/search operation.
     */
    E,
    /**
     * added to help the parsers
     */
    NULL;

    public static AuditEventAction fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("C".equals(codeString))
            return C;
        if ("R".equals(codeString))
            return R;
        if ("U".equals(codeString))
            return U;
        if ("D".equals(codeString))
            return D;
        if ("E".equals(codeString))
            return E;
        throw new FHIRException("Unknown AuditEventAction code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case C:
                return "C";
            case R:
                return "R";
            case U:
                return "U";
            case D:
                return "D";
            case E:
                return "E";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case C:
                return "http://hl7.org/fhir/audit-event-action";
            case R:
                return "http://hl7.org/fhir/audit-event-action";
            case U:
                return "http://hl7.org/fhir/audit-event-action";
            case D:
                return "http://hl7.org/fhir/audit-event-action";
            case E:
                return "http://hl7.org/fhir/audit-event-action";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case C:
                return "Create a new database object, such as placing an order.";
            case R:
                return "Display or print data, such as a doctor census.";
            case U:
                return "Update data, such as revise patient information.";
            case D:
                return "Delete items, such as a doctor master file record.";
            case E:
                return "Perform a system or application function such as log-on, program execution or use of an object's method, or perform a query/search operation.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case C:
                return "Create";
            case R:
                return "Read/View/Print";
            case U:
                return "Update";
            case D:
                return "Delete";
            case E:
                return "Execute";
            default:
                return "?";
        }
    }
}
