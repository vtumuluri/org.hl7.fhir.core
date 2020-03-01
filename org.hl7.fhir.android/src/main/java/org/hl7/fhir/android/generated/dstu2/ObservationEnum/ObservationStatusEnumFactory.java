package org.hl7.fhir.android.generated.dstu2.ObservationEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ObservationStatusEnumFactory implements EnumFactory<ObservationStatus> {

    public ObservationStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("registered".equals(codeString))
            return ObservationStatus.REGISTERED;
        if ("preliminary".equals(codeString))
            return ObservationStatus.PRELIMINARY;
        if ("final".equals(codeString))
            return ObservationStatus.FINAL;
        if ("amended".equals(codeString))
            return ObservationStatus.AMENDED;
        if ("cancelled".equals(codeString))
            return ObservationStatus.CANCELLED;
        if ("entered-in-error".equals(codeString))
            return ObservationStatus.ENTEREDINERROR;
        if ("unknown".equals(codeString))
            return ObservationStatus.UNKNOWN;
        throw new IllegalArgumentException("Unknown ObservationStatus code '" + codeString + "'");
    }

    public Enumeration<ObservationStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("registered".equals(codeString))
            return new Enumeration<ObservationStatus>(this, ObservationStatus.REGISTERED);
        if ("preliminary".equals(codeString))
            return new Enumeration<ObservationStatus>(this, ObservationStatus.PRELIMINARY);
        if ("final".equals(codeString))
            return new Enumeration<ObservationStatus>(this, ObservationStatus.FINAL);
        if ("amended".equals(codeString))
            return new Enumeration<ObservationStatus>(this, ObservationStatus.AMENDED);
        if ("cancelled".equals(codeString))
            return new Enumeration<ObservationStatus>(this, ObservationStatus.CANCELLED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<ObservationStatus>(this, ObservationStatus.ENTEREDINERROR);
        if ("unknown".equals(codeString))
            return new Enumeration<ObservationStatus>(this, ObservationStatus.UNKNOWN);
        throw new FHIRException("Unknown ObservationStatus code '" + codeString + "'");
    }

    public String toCode(ObservationStatus code) {
        if (code == ObservationStatus.REGISTERED)
            return "registered";
        if (code == ObservationStatus.PRELIMINARY)
            return "preliminary";
        if (code == ObservationStatus.FINAL)
            return "final";
        if (code == ObservationStatus.AMENDED)
            return "amended";
        if (code == ObservationStatus.CANCELLED)
            return "cancelled";
        if (code == ObservationStatus.ENTEREDINERROR)
            return "entered-in-error";
        if (code == ObservationStatus.UNKNOWN)
            return "unknown";
        return "?";
    }
}
