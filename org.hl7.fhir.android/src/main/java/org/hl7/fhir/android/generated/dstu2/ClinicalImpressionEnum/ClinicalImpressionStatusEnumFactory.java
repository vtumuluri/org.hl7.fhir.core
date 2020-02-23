package org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ClinicalImpressionStatusEnumFactory implements EnumFactory<ClinicalImpressionStatus> {

    public ClinicalImpressionStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
            return ClinicalImpressionStatus.INPROGRESS;
        if ("completed".equals(codeString))
            return ClinicalImpressionStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
            return ClinicalImpressionStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown ClinicalImpressionStatus code '" + codeString + "'");
    }

    public Enumeration<ClinicalImpressionStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return new Enumeration<ClinicalImpressionStatus>(this, ClinicalImpressionStatus.INPROGRESS);
        if ("completed".equals(codeString))
            return new Enumeration<ClinicalImpressionStatus>(this, ClinicalImpressionStatus.COMPLETED);
        if ("entered-in-error".equals(codeString))
            return new Enumeration<ClinicalImpressionStatus>(this, ClinicalImpressionStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown ClinicalImpressionStatus code '" + codeString + "'");
    }

    public String toCode(ClinicalImpressionStatus code) {
        if (code == ClinicalImpressionStatus.INPROGRESS)
            return "in-progress";
        if (code == ClinicalImpressionStatus.COMPLETED)
            return "completed";
        if (code == ClinicalImpressionStatus.ENTEREDINERROR)
            return "entered-in-error";
        return "?";
    }
}
