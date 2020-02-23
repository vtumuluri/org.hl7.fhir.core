package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum MessageEvent {

    /**
     * Change the status of a Medication Administration to show that it is complete.
     */
    MEDICATIONADMINISTRATIONCOMPLETE,
    /**
     * Someone wishes to record that the record of administration of a medication is in error and should be ignored.
     */
    MEDICATIONADMINISTRATIONNULLIFICATION,
    /**
     * Indicates that a medication has been recorded against the patient's record.
     */
    MEDICATIONADMINISTRATIONRECORDING,
    /**
     * Update a Medication Administration record.
     */
    MEDICATIONADMINISTRATIONUPDATE,
    /**
     * Notification of a change to an administrative resource (either create or update). Note that there is no delete, though some administrative resources have status or period elements for this use.
     */
    ADMINNOTIFY,
    /**
     * Provide a diagnostic report, or update a previously provided diagnostic report.
     */
    DIAGNOSTICREPORTPROVIDE,
    /**
     * Provide a simple observation or update a previously provided simple observation.
     */
    OBSERVATIONPROVIDE,
    /**
     * Notification that two patient records actually identify the same patient.
     */
    PATIENTLINK,
    /**
     * Notification that previous advice that two patient records concern the same patient is now considered incorrect.
     */
    PATIENTUNLINK,
    /**
     * The definition of a value set is used to create a simple collection of codes suitable for use for data entry or validation. An expanded value set will be returned, or an error message.
     */
    VALUESETEXPAND,
    /**
     * added to help the parsers
     */
    NULL;

    public static MessageEvent fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("MedicationAdministration-Complete".equals(codeString))
            return MEDICATIONADMINISTRATIONCOMPLETE;
        if ("MedicationAdministration-Nullification".equals(codeString))
            return MEDICATIONADMINISTRATIONNULLIFICATION;
        if ("MedicationAdministration-Recording".equals(codeString))
            return MEDICATIONADMINISTRATIONRECORDING;
        if ("MedicationAdministration-Update".equals(codeString))
            return MEDICATIONADMINISTRATIONUPDATE;
        if ("admin-notify".equals(codeString))
            return ADMINNOTIFY;
        if ("diagnosticreport-provide".equals(codeString))
            return DIAGNOSTICREPORTPROVIDE;
        if ("observation-provide".equals(codeString))
            return OBSERVATIONPROVIDE;
        if ("patient-link".equals(codeString))
            return PATIENTLINK;
        if ("patient-unlink".equals(codeString))
            return PATIENTUNLINK;
        if ("valueset-expand".equals(codeString))
            return VALUESETEXPAND;
        throw new FHIRException("Unknown MessageEvent code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case MEDICATIONADMINISTRATIONCOMPLETE:
                return "MedicationAdministration-Complete";
            case MEDICATIONADMINISTRATIONNULLIFICATION:
                return "MedicationAdministration-Nullification";
            case MEDICATIONADMINISTRATIONRECORDING:
                return "MedicationAdministration-Recording";
            case MEDICATIONADMINISTRATIONUPDATE:
                return "MedicationAdministration-Update";
            case ADMINNOTIFY:
                return "admin-notify";
            case DIAGNOSTICREPORTPROVIDE:
                return "diagnosticreport-provide";
            case OBSERVATIONPROVIDE:
                return "observation-provide";
            case PATIENTLINK:
                return "patient-link";
            case PATIENTUNLINK:
                return "patient-unlink";
            case VALUESETEXPAND:
                return "valueset-expand";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case MEDICATIONADMINISTRATIONCOMPLETE:
                return "http://hl7.org/fhir/message-events";
            case MEDICATIONADMINISTRATIONNULLIFICATION:
                return "http://hl7.org/fhir/message-events";
            case MEDICATIONADMINISTRATIONRECORDING:
                return "http://hl7.org/fhir/message-events";
            case MEDICATIONADMINISTRATIONUPDATE:
                return "http://hl7.org/fhir/message-events";
            case ADMINNOTIFY:
                return "http://hl7.org/fhir/message-events";
            case DIAGNOSTICREPORTPROVIDE:
                return "http://hl7.org/fhir/message-events";
            case OBSERVATIONPROVIDE:
                return "http://hl7.org/fhir/message-events";
            case PATIENTLINK:
                return "http://hl7.org/fhir/message-events";
            case PATIENTUNLINK:
                return "http://hl7.org/fhir/message-events";
            case VALUESETEXPAND:
                return "http://hl7.org/fhir/message-events";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case MEDICATIONADMINISTRATIONCOMPLETE:
                return "Change the status of a Medication Administration to show that it is complete.";
            case MEDICATIONADMINISTRATIONNULLIFICATION:
                return "Someone wishes to record that the record of administration of a medication is in error and should be ignored.";
            case MEDICATIONADMINISTRATIONRECORDING:
                return "Indicates that a medication has been recorded against the patient's record.";
            case MEDICATIONADMINISTRATIONUPDATE:
                return "Update a Medication Administration record.";
            case ADMINNOTIFY:
                return "Notification of a change to an administrative resource (either create or update). Note that there is no delete, though some administrative resources have status or period elements for this use.";
            case DIAGNOSTICREPORTPROVIDE:
                return "Provide a diagnostic report, or update a previously provided diagnostic report.";
            case OBSERVATIONPROVIDE:
                return "Provide a simple observation or update a previously provided simple observation.";
            case PATIENTLINK:
                return "Notification that two patient records actually identify the same patient.";
            case PATIENTUNLINK:
                return "Notification that previous advice that two patient records concern the same patient is now considered incorrect.";
            case VALUESETEXPAND:
                return "The definition of a value set is used to create a simple collection of codes suitable for use for data entry or validation. An expanded value set will be returned, or an error message.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case MEDICATIONADMINISTRATIONCOMPLETE:
                return "MedicationAdministration-Complete";
            case MEDICATIONADMINISTRATIONNULLIFICATION:
                return "MedicationAdministration-Nullification";
            case MEDICATIONADMINISTRATIONRECORDING:
                return "MedicationAdministration-Recording";
            case MEDICATIONADMINISTRATIONUPDATE:
                return "MedicationAdministration-Update";
            case ADMINNOTIFY:
                return "admin-notify";
            case DIAGNOSTICREPORTPROVIDE:
                return "diagnosticreport-provide";
            case OBSERVATIONPROVIDE:
                return "observation-provide";
            case PATIENTLINK:
                return "patient-link";
            case PATIENTUNLINK:
                return "patient-unlink";
            case VALUESETEXPAND:
                return "valueset-expand";
            default:
                return "?";
        }
    }
}
