package org.hl7.fhir.android.generated.dstu2.AppointmentEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.AppointmentStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.AppointmentStatus;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipationStatus;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipantRequiredEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipantRequired;

public enum ParticipationStatus {

    /**
     * The participant has accepted the appointment.
     */
    ACCEPTED,
    /**
     * The participant has declined the appointment and will not participate in the appointment.
     */
    DECLINED,
    /**
     * The participant has  tentatively accepted the appointment. This could be automatically created by a system and requires further processing before it can be accepted. There is no commitment that attendance will occur.
     */
    TENTATIVE,
    /**
     * The participant needs to indicate if they accept the appointment by changing this status to one of the other statuses.
     */
    NEEDSACTION,
    /**
     * added to help the parsers
     */
    NULL;

    public static ParticipationStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("accepted".equals(codeString))
            return ACCEPTED;
        if ("declined".equals(codeString))
            return DECLINED;
        if ("tentative".equals(codeString))
            return TENTATIVE;
        if ("needs-action".equals(codeString))
            return NEEDSACTION;
        throw new FHIRException("Unknown ParticipationStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case ACCEPTED:
                return "accepted";
            case DECLINED:
                return "declined";
            case TENTATIVE:
                return "tentative";
            case NEEDSACTION:
                return "needs-action";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case ACCEPTED:
                return "http://hl7.org/fhir/participationstatus";
            case DECLINED:
                return "http://hl7.org/fhir/participationstatus";
            case TENTATIVE:
                return "http://hl7.org/fhir/participationstatus";
            case NEEDSACTION:
                return "http://hl7.org/fhir/participationstatus";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case ACCEPTED:
                return "The participant has accepted the appointment.";
            case DECLINED:
                return "The participant has declined the appointment and will not participate in the appointment.";
            case TENTATIVE:
                return "The participant has  tentatively accepted the appointment. This could be automatically created by a system and requires further processing before it can be accepted. There is no commitment that attendance will occur.";
            case NEEDSACTION:
                return "The participant needs to indicate if they accept the appointment by changing this status to one of the other statuses.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case ACCEPTED:
                return "Accepted";
            case DECLINED:
                return "Declined";
            case TENTATIVE:
                return "Tentative";
            case NEEDSACTION:
                return "Needs Action";
            default:
                return "?";
        }
    }
}
