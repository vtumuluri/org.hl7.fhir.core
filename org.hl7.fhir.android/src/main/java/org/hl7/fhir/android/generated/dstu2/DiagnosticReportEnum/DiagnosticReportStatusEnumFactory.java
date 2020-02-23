package org.hl7.fhir.android.generated.dstu2.DiagnosticReportEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DiagnosticReportStatusEnumFactory implements EnumFactory<DiagnosticReportStatus> {

    public DiagnosticReportStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("registered".equals(codeString))
            return DiagnosticReportStatus.REGISTERED;
        if ("partial".equals(codeString))
            return DiagnosticReportStatus.PARTIAL;
        if ("final".equals(codeString))
            return DiagnosticReportStatus.FINAL;
        if ("corrected".equals(codeString))
            return DiagnosticReportStatus.CORRECTED;
        if ("appended".equals(codeString))
            return DiagnosticReportStatus.APPENDED;
        if ("cancelled".equals(codeString))
            return DiagnosticReportStatus.CANCELLED;
        if ("entered-in-error".equals(codeString))
            return DiagnosticReportStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown DiagnosticReportStatus code '" + codeString + "'");
    }

    public Enumeration<DiagnosticReportStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("registered".equals(codeString))
            return new Enumeration<DiagnosticReportStatus>(this, DiagnosticReportStatus.REGISTERED);
        if ("partial".equals(codeString))
            return new Enumeration<DiagnosticReportStatus>(this, DiagnosticReportStatus.PARTIAL);
        if ("final".equals(codeString))
            return new Enumeration<DiagnosticReportStatus>(this, DiagnosticReportStatus.FINAL);
        if ("corrected".equals(codeString))
            return new Enumeration<DiagnosticReportStatus>(this, DiagnosticReportStatus.CORRECTED);
        if ("appended".equals(codeString))
            return new Enumeration<DiagnosticReportStatus>(this, DiagnosticReportStatus.APPENDED);
        if ("cancelled".equals(codeString))
            return new Enumeration<DiagnosticReportStatus>(this, DiagnosticReportStatus.CANCELLED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<DiagnosticReportStatus>(this, DiagnosticReportStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown DiagnosticReportStatus code '" + codeString + "'");
    }

    public String toCode(DiagnosticReportStatus code) {
        if (code == DiagnosticReportStatus.REGISTERED)
            return "registered";
        if (code == DiagnosticReportStatus.PARTIAL)
            return "partial";
        if (code == DiagnosticReportStatus.FINAL)
            return "final";
        if (code == DiagnosticReportStatus.CORRECTED)
            return "corrected";
        if (code == DiagnosticReportStatus.APPENDED)
            return "appended";
        if (code == DiagnosticReportStatus.CANCELLED)
            return "cancelled";
        if (code == DiagnosticReportStatus.ENTEREDINERROR)
            return "entered-in-error";
        return "?";
    }
}
