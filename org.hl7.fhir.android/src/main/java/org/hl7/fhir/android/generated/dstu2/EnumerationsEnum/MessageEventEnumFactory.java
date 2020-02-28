package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class MessageEventEnumFactory implements EnumFactory<MessageEvent> {

    public MessageEvent fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("MedicationAdministration-Complete".equals(codeString))
            return MessageEvent.MEDICATIONADMINISTRATIONCOMPLETE;
        if ("MedicationAdministration-Nullification".equals(codeString))
            return MessageEvent.MEDICATIONADMINISTRATIONNULLIFICATION;
        if ("MedicationAdministration-Recording".equals(codeString))
            return MessageEvent.MEDICATIONADMINISTRATIONRECORDING;
        if ("MedicationAdministration-Update".equals(codeString))
            return MessageEvent.MEDICATIONADMINISTRATIONUPDATE;
        if ("admin-notify".equals(codeString))
            return MessageEvent.ADMINNOTIFY;
        if ("diagnosticreport-provide".equals(codeString))
            return MessageEvent.DIAGNOSTICREPORTPROVIDE;
        if ("observation-provide".equals(codeString))
            return MessageEvent.OBSERVATIONPROVIDE;
        if ("patient-link".equals(codeString))
            return MessageEvent.PATIENTLINK;
        if ("patient-unlink".equals(codeString))
            return MessageEvent.PATIENTUNLINK;
        if ("valueset-expand".equals(codeString))
            return MessageEvent.VALUESETEXPAND;
        throw new IllegalArgumentException("Unknown MessageEvent code '" + codeString + "'");
    }

    public Enumeration<MessageEvent> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("MedicationAdministration-Complete".equals(codeString))
            return new Enumeration<MessageEvent>(this, MessageEvent.MEDICATIONADMINISTRATIONCOMPLETE);
        if ("MedicationAdministration-Nullification".equals(codeString))
            return new Enumeration<MessageEvent>(this, MessageEvent.MEDICATIONADMINISTRATIONNULLIFICATION);
        if ("MedicationAdministration-Recording".equals(codeString))
            return new Enumeration<MessageEvent>(this, MessageEvent.MEDICATIONADMINISTRATIONRECORDING);
        if ("MedicationAdministration-Update".equals(codeString))
            return new Enumeration<MessageEvent>(this, MessageEvent.MEDICATIONADMINISTRATIONUPDATE);
        if ("admin-notify".equals(codeString))
            return new Enumeration<MessageEvent>(this, MessageEvent.ADMINNOTIFY);
        if ("diagnosticreport-provide".equals(codeString))
            return new Enumeration<MessageEvent>(this, MessageEvent.DIAGNOSTICREPORTPROVIDE);
        if ("observation-provide".equals(codeString))
            return new Enumeration<MessageEvent>(this, MessageEvent.OBSERVATIONPROVIDE);
        if ("patient-link".equals(codeString))
            return new Enumeration<MessageEvent>(this, MessageEvent.PATIENTLINK);
        if ("patient-unlink".equals(codeString))
            return new Enumeration<MessageEvent>(this, MessageEvent.PATIENTUNLINK);
        if ("valueset-expand".equals(codeString))
            return new Enumeration<MessageEvent>(this, MessageEvent.VALUESETEXPAND);
        throw new FHIRException("Unknown MessageEvent code '" + codeString + "'");
    }

    public String toCode(MessageEvent code) {
        if (code == MessageEvent.MEDICATIONADMINISTRATIONCOMPLETE)
            return "MedicationAdministration-Complete";
        if (code == MessageEvent.MEDICATIONADMINISTRATIONNULLIFICATION)
            return "MedicationAdministration-Nullification";
        if (code == MessageEvent.MEDICATIONADMINISTRATIONRECORDING)
            return "MedicationAdministration-Recording";
        if (code == MessageEvent.MEDICATIONADMINISTRATIONUPDATE)
            return "MedicationAdministration-Update";
        if (code == MessageEvent.ADMINNOTIFY)
            return "admin-notify";
        if (code == MessageEvent.DIAGNOSTICREPORTPROVIDE)
            return "diagnosticreport-provide";
        if (code == MessageEvent.OBSERVATIONPROVIDE)
            return "observation-provide";
        if (code == MessageEvent.PATIENTLINK)
            return "patient-link";
        if (code == MessageEvent.PATIENTUNLINK)
            return "patient-unlink";
        if (code == MessageEvent.VALUESETEXPAND)
            return "valueset-expand";
        return "?";
    }
}
