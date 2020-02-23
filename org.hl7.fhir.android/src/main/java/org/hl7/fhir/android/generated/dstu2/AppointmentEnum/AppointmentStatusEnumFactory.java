package org.hl7.fhir.android.generated.dstu2.AppointmentEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AppointmentStatusEnumFactory implements EnumFactory<AppointmentStatus> {

    public AppointmentStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("proposed".equals(codeString))
            return AppointmentStatus.PROPOSED;
        if ("pending".equals(codeString))
            return AppointmentStatus.PENDING;
        if ("booked".equals(codeString))
            return AppointmentStatus.BOOKED;
        if ("arrived".equals(codeString))
            return AppointmentStatus.ARRIVED;
        if ("fulfilled".equals(codeString))
            return AppointmentStatus.FULFILLED;
        if ("cancelled".equals(codeString))
            return AppointmentStatus.CANCELLED;
        if ("noshow".equals(codeString))
            return AppointmentStatus.NOSHOW;
        throw new IllegalArgumentException("Unknown AppointmentStatus code '" + codeString + "'");
    }

    public Enumeration<AppointmentStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return new Enumeration<AppointmentStatus>(this, AppointmentStatus.PROPOSED);
        if ("pending".equals(codeString))
            return new Enumeration<AppointmentStatus>(this, AppointmentStatus.PENDING);
        if ("booked".equals(codeString))
            return new Enumeration<AppointmentStatus>(this, AppointmentStatus.BOOKED);
        if ("arrived".equals(codeString))
            return new Enumeration<AppointmentStatus>(this, AppointmentStatus.ARRIVED);
        if ("fulfilled".equals(codeString))
            return new Enumeration<AppointmentStatus>(this, AppointmentStatus.FULFILLED);
        if ("cancelled".equals(codeString))
            return new Enumeration<AppointmentStatus>(this, AppointmentStatus.CANCELLED);
        if ("noshow".equals(codeString))
            return new Enumeration<AppointmentStatus>(this, AppointmentStatus.NOSHOW);
        throw new FHIRException("Unknown AppointmentStatus code '" + codeString + "'");
    }

    public String toCode(AppointmentStatus code) {
        if (code == AppointmentStatus.PROPOSED)
            return "proposed";
        if (code == AppointmentStatus.PENDING)
            return "pending";
        if (code == AppointmentStatus.BOOKED)
            return "booked";
        if (code == AppointmentStatus.ARRIVED)
            return "arrived";
        if (code == AppointmentStatus.FULFILLED)
            return "fulfilled";
        if (code == AppointmentStatus.CANCELLED)
            return "cancelled";
        if (code == AppointmentStatus.NOSHOW)
            return "noshow";
        return "?";
    }
}
