package org.hl7.fhir.android.generated.dstu2.DetectedIssueEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DetectedIssueSeverityEnumFactory implements EnumFactory<DetectedIssueSeverity> {

    public DetectedIssueSeverity fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("high".equals(codeString))
            return DetectedIssueSeverity.HIGH;
        if ("moderate".equals(codeString))
            return DetectedIssueSeverity.MODERATE;
        if ("low".equals(codeString))
            return DetectedIssueSeverity.LOW;
        throw new IllegalArgumentException("Unknown DetectedIssueSeverity code '" + codeString + "'");
    }

    public Enumeration<DetectedIssueSeverity> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("high".equals(codeString))
            return new Enumeration<DetectedIssueSeverity>(this, DetectedIssueSeverity.HIGH);
        if ("moderate".equals(codeString))
            return new Enumeration<DetectedIssueSeverity>(this, DetectedIssueSeverity.MODERATE);
        if ("low".equals(codeString))
            return new Enumeration<DetectedIssueSeverity>(this, DetectedIssueSeverity.LOW);
        throw new FHIRException("Unknown DetectedIssueSeverity code '" + codeString + "'");
    }

    public String toCode(DetectedIssueSeverity code) {
        if (code == DetectedIssueSeverity.HIGH)
            return "high";
        if (code == DetectedIssueSeverity.MODERATE)
            return "moderate";
        if (code == DetectedIssueSeverity.LOW)
            return "low";
        return "?";
    }
}
