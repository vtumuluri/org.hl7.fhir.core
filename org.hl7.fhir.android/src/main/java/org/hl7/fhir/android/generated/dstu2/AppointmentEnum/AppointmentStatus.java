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

public enum AppointmentStatus {

    /**
     * None of the participant(s) have finalized their acceptance of the appointment request, and the start/end time may not be set yet.
     */
    PROPOSED,
    /**
     * Some or all of the participant(s) have not finalized their acceptance of the appointment request.
     */
    PENDING,
    /**
     * All participant(s) have been considered and the appointment is confirmed to go ahead at the date/times specified.
     */
    BOOKED,
    /**
     * Some of the patients have arrived.
     */
    ARRIVED,
    /**
     * This appointment has completed and may have resulted in an encounter.
     */
    FULFILLED,
    /**
     * The appointment has been cancelled.
     */
    CANCELLED,
    /**
     * Some or all of the participant(s) have not/did not appear for the appointment (usually the patient).
     */
    NOSHOW,
    /**
     * added to help the parsers
     */
    NULL;

    public static AppointmentStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return PROPOSED;
        if ("pending".equals(codeString))
            return PENDING;
        if ("booked".equals(codeString))
            return BOOKED;
        if ("arrived".equals(codeString))
            return ARRIVED;
        if ("fulfilled".equals(codeString))
            return FULFILLED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        if ("noshow".equals(codeString))
            return NOSHOW;
        throw new FHIRException("Unknown AppointmentStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PROPOSED:
                return "proposed";
            case PENDING:
                return "pending";
            case BOOKED:
                return "booked";
            case ARRIVED:
                return "arrived";
            case FULFILLED:
                return "fulfilled";
            case CANCELLED:
                return "cancelled";
            case NOSHOW:
                return "noshow";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PROPOSED:
                return "http://hl7.org/fhir/appointmentstatus";
            case PENDING:
                return "http://hl7.org/fhir/appointmentstatus";
            case BOOKED:
                return "http://hl7.org/fhir/appointmentstatus";
            case ARRIVED:
                return "http://hl7.org/fhir/appointmentstatus";
            case FULFILLED:
                return "http://hl7.org/fhir/appointmentstatus";
            case CANCELLED:
                return "http://hl7.org/fhir/appointmentstatus";
            case NOSHOW:
                return "http://hl7.org/fhir/appointmentstatus";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PROPOSED:
                return "None of the participant(s) have finalized their acceptance of the appointment request, and the start/end time may not be set yet.";
            case PENDING:
                return "Some or all of the participant(s) have not finalized their acceptance of the appointment request.";
            case BOOKED:
                return "All participant(s) have been considered and the appointment is confirmed to go ahead at the date/times specified.";
            case ARRIVED:
                return "Some of the patients have arrived.";
            case FULFILLED:
                return "This appointment has completed and may have resulted in an encounter.";
            case CANCELLED:
                return "The appointment has been cancelled.";
            case NOSHOW:
                return "Some or all of the participant(s) have not/did not appear for the appointment (usually the patient).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PROPOSED:
                return "Proposed";
            case PENDING:
                return "Pending";
            case BOOKED:
                return "Booked";
            case ARRIVED:
                return "Arrived";
            case FULFILLED:
                return "Fulfilled";
            case CANCELLED:
                return "Cancelled";
            case NOSHOW:
                return "No Show";
            default:
                return "?";
        }
    }
}
