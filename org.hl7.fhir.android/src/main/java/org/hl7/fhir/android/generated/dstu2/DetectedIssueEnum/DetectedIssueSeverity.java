package org.hl7.fhir.android.generated.dstu2.DetectedIssueEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DetectedIssueEnum.DetectedIssueSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DetectedIssueEnum.DetectedIssueSeverity;

public enum DetectedIssueSeverity {

    /**
     * Indicates the issue may be life-threatening or has the potential to cause permanent injury.
     */
    HIGH,
    /**
     * Indicates the issue may result in noticeable adverse consequences but is unlikely to be life-threatening or cause permanent injury.
     */
    MODERATE,
    /**
     * Indicates the issue may result in some adverse consequences but is unlikely to substantially affect the situation of the subject.
     */
    LOW,
    /**
     * added to help the parsers
     */
    NULL;

    public static DetectedIssueSeverity fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("high".equals(codeString))
            return HIGH;
        if ("moderate".equals(codeString))
            return MODERATE;
        if ("low".equals(codeString))
            return LOW;
        throw new FHIRException("Unknown DetectedIssueSeverity code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case HIGH:
                return "high";
            case MODERATE:
                return "moderate";
            case LOW:
                return "low";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case HIGH:
                return "http://hl7.org/fhir/detectedissue-severity";
            case MODERATE:
                return "http://hl7.org/fhir/detectedissue-severity";
            case LOW:
                return "http://hl7.org/fhir/detectedissue-severity";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case HIGH:
                return "Indicates the issue may be life-threatening or has the potential to cause permanent injury.";
            case MODERATE:
                return "Indicates the issue may result in noticeable adverse consequences but is unlikely to be life-threatening or cause permanent injury.";
            case LOW:
                return "Indicates the issue may result in some adverse consequences but is unlikely to substantially affect the situation of the subject.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case HIGH:
                return "High";
            case MODERATE:
                return "Moderate";
            case LOW:
                return "Low";
            default:
                return "?";
        }
    }
}
