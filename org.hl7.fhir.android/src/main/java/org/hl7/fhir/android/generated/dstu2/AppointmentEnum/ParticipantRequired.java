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

public enum ParticipantRequired {

    /**
     * The participant is required to attend the appointment.
     */
    REQUIRED,
    /**
     * The participant may optionally attend the appointment.
     */
    OPTIONAL,
    /**
     * The participant is excluded from the appointment, and may not be informed of the appointment taking place. (Appointment is about them, not for them - such as 2 doctors discussing results about a patient's test).
     */
    INFORMATIONONLY,
    /**
     * added to help the parsers
     */
    NULL;

    public static ParticipantRequired fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("required".equals(codeString))
            return REQUIRED;
        if ("optional".equals(codeString))
            return OPTIONAL;
        if ("information-only".equals(codeString))
            return INFORMATIONONLY;
        throw new FHIRException("Unknown ParticipantRequired code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case REQUIRED:
                return "required";
            case OPTIONAL:
                return "optional";
            case INFORMATIONONLY:
                return "information-only";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case REQUIRED:
                return "http://hl7.org/fhir/participantrequired";
            case OPTIONAL:
                return "http://hl7.org/fhir/participantrequired";
            case INFORMATIONONLY:
                return "http://hl7.org/fhir/participantrequired";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case REQUIRED:
                return "The participant is required to attend the appointment.";
            case OPTIONAL:
                return "The participant may optionally attend the appointment.";
            case INFORMATIONONLY:
                return "The participant is excluded from the appointment, and may not be informed of the appointment taking place. (Appointment is about them, not for them - such as 2 doctors discussing results about a patient's test).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case REQUIRED:
                return "Required";
            case OPTIONAL:
                return "Optional";
            case INFORMATIONONLY:
                return "Information Only";
            default:
                return "?";
        }
    }
}
