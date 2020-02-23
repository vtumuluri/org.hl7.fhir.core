package org.hl7.fhir.android.generated.dstu2.DiagnosticReportEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum DiagnosticReportStatus {

    /**
     * The existence of the report is registered, but there is nothing yet available.
     */
    REGISTERED,
    /**
     * This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.
     */
    PARTIAL,
    /**
     * The report is complete and verified by an authorized person.
     */
    FINAL,
    /**
     * The report has been modified subsequent to being Final, and is complete and verified by an authorized person. New content has been added, but existing content hasn't changed
     */
    CORRECTED,
    /**
     * The report has been modified subsequent to being Final, and is complete and verified by an authorized person. New content has been added, but existing content hasn't changed.
     */
    APPENDED,
    /**
     * The report is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     */
    CANCELLED,
    /**
     * The report has been withdrawn following a previous final release.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static DiagnosticReportStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("registered".equals(codeString))
            return REGISTERED;
        if ("partial".equals(codeString))
            return PARTIAL;
        if ("final".equals(codeString))
            return FINAL;
        if ("corrected".equals(codeString))
            return CORRECTED;
        if ("appended".equals(codeString))
            return APPENDED;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown DiagnosticReportStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case REGISTERED:
                return "registered";
            case PARTIAL:
                return "partial";
            case FINAL:
                return "final";
            case CORRECTED:
                return "corrected";
            case APPENDED:
                return "appended";
            case CANCELLED:
                return "cancelled";
            case ENTEREDINERROR:
                return "entered-in-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case REGISTERED:
                return "http://hl7.org/fhir/diagnostic-report-status";
            case PARTIAL:
                return "http://hl7.org/fhir/diagnostic-report-status";
            case FINAL:
                return "http://hl7.org/fhir/diagnostic-report-status";
            case CORRECTED:
                return "http://hl7.org/fhir/diagnostic-report-status";
            case APPENDED:
                return "http://hl7.org/fhir/diagnostic-report-status";
            case CANCELLED:
                return "http://hl7.org/fhir/diagnostic-report-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/diagnostic-report-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case REGISTERED:
                return "The existence of the report is registered, but there is nothing yet available.";
            case PARTIAL:
                return "This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.";
            case FINAL:
                return "The report is complete and verified by an authorized person.";
            case CORRECTED:
                return "The report has been modified subsequent to being Final, and is complete and verified by an authorized person. New content has been added, but existing content hasn't changed";
            case APPENDED:
                return "The report has been modified subsequent to being Final, and is complete and verified by an authorized person. New content has been added, but existing content hasn't changed.";
            case CANCELLED:
                return "The report is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\").";
            case ENTEREDINERROR:
                return "The report has been withdrawn following a previous final release.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case REGISTERED:
                return "Registered";
            case PARTIAL:
                return "Partial";
            case FINAL:
                return "Final";
            case CORRECTED:
                return "Corrected";
            case APPENDED:
                return "Appended";
            case CANCELLED:
                return "Cancelled";
            case ENTEREDINERROR:
                return "Entered in Error";
            default:
                return "?";
        }
    }
}
