package org.hl7.fhir.android.generated.dstu2.DeviceUseRequestEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DeviceUseRequestStatusEnumFactory implements EnumFactory<DeviceUseRequestStatus> {

    public DeviceUseRequestStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("proposed".equals(codeString))
            return DeviceUseRequestStatus.PROPOSED;
        if ("planned".equals(codeString))
            return DeviceUseRequestStatus.PLANNED;
        if ("requested".equals(codeString))
            return DeviceUseRequestStatus.REQUESTED;
        if ("received".equals(codeString))
            return DeviceUseRequestStatus.RECEIVED;
        if ("accepted".equals(codeString))
            return DeviceUseRequestStatus.ACCEPTED;
        if ("in-progress".equals(codeString))
            return DeviceUseRequestStatus.INPROGRESS;
        if ("completed".equals(codeString))
            return DeviceUseRequestStatus.COMPLETED;
        if ("suspended".equals(codeString))
            return DeviceUseRequestStatus.SUSPENDED;
        if ("rejected".equals(codeString))
            return DeviceUseRequestStatus.REJECTED;
        if ("aborted".equals(codeString))
            return DeviceUseRequestStatus.ABORTED;
        throw new IllegalArgumentException("Unknown DeviceUseRequestStatus code '" + codeString + "'");
    }

    public Enumeration<DeviceUseRequestStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return new Enumeration<DeviceUseRequestStatus>(this, DeviceUseRequestStatus.PROPOSED);
        if ("planned".equals(codeString))
            return new Enumeration<DeviceUseRequestStatus>(this, DeviceUseRequestStatus.PLANNED);
        if ("requested".equals(codeString))
            return new Enumeration<DeviceUseRequestStatus>(this, DeviceUseRequestStatus.REQUESTED);
        if ("received".equals(codeString))
            return new Enumeration<DeviceUseRequestStatus>(this, DeviceUseRequestStatus.RECEIVED);
        if ("accepted".equals(codeString))
            return new Enumeration<DeviceUseRequestStatus>(this, DeviceUseRequestStatus.ACCEPTED);
        if ("in-progress".equals(codeString))
            return new Enumeration<DeviceUseRequestStatus>(this, DeviceUseRequestStatus.INPROGRESS);
        if ("completed".equals(codeString))
            return new Enumeration<DeviceUseRequestStatus>(this, DeviceUseRequestStatus.COMPLETED);
        if ("suspended".equals(codeString))
            return new Enumeration<DeviceUseRequestStatus>(this, DeviceUseRequestStatus.SUSPENDED);
        if ("rejected".equals(codeString))
            return new Enumeration<DeviceUseRequestStatus>(this, DeviceUseRequestStatus.REJECTED);
        if ("aborted".equals(codeString))
            return new Enumeration<DeviceUseRequestStatus>(this, DeviceUseRequestStatus.ABORTED);
        throw new FHIRException("Unknown DeviceUseRequestStatus code '" + codeString + "'");
    }

    public String toCode(DeviceUseRequestStatus code) {
        if (code == DeviceUseRequestStatus.PROPOSED)
            return "proposed";
        if (code == DeviceUseRequestStatus.PLANNED)
            return "planned";
        if (code == DeviceUseRequestStatus.REQUESTED)
            return "requested";
        if (code == DeviceUseRequestStatus.RECEIVED)
            return "received";
        if (code == DeviceUseRequestStatus.ACCEPTED)
            return "accepted";
        if (code == DeviceUseRequestStatus.INPROGRESS)
            return "in-progress";
        if (code == DeviceUseRequestStatus.COMPLETED)
            return "completed";
        if (code == DeviceUseRequestStatus.SUSPENDED)
            return "suspended";
        if (code == DeviceUseRequestStatus.REJECTED)
            return "rejected";
        if (code == DeviceUseRequestStatus.ABORTED)
            return "aborted";
        return "?";
    }
}
