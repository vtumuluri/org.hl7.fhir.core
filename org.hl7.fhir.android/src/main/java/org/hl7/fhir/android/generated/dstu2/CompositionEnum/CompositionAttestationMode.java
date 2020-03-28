package org.hl7.fhir.android.generated.dstu2.CompositionEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionStatus;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionAttestationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionAttestationMode;

public enum CompositionAttestationMode {

    /**
     * The person authenticated the content in their personal capacity.
     */
    PERSONAL,
    /**
     * The person authenticated the content in their professional capacity.
     */
    PROFESSIONAL,
    /**
     * The person authenticated the content and accepted legal responsibility for its content.
     */
    LEGAL,
    /**
     * The organization authenticated the content as consistent with their policies and procedures.
     */
    OFFICIAL,
    /**
     * added to help the parsers
     */
    NULL;

    public static CompositionAttestationMode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("personal".equals(codeString))
            return PERSONAL;
        if ("professional".equals(codeString))
            return PROFESSIONAL;
        if ("legal".equals(codeString))
            return LEGAL;
        if ("official".equals(codeString))
            return OFFICIAL;
        throw new FHIRException("Unknown CompositionAttestationMode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PERSONAL:
                return "personal";
            case PROFESSIONAL:
                return "professional";
            case LEGAL:
                return "legal";
            case OFFICIAL:
                return "official";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PERSONAL:
                return "http://hl7.org/fhir/composition-attestation-mode";
            case PROFESSIONAL:
                return "http://hl7.org/fhir/composition-attestation-mode";
            case LEGAL:
                return "http://hl7.org/fhir/composition-attestation-mode";
            case OFFICIAL:
                return "http://hl7.org/fhir/composition-attestation-mode";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PERSONAL:
                return "The person authenticated the content in their personal capacity.";
            case PROFESSIONAL:
                return "The person authenticated the content in their professional capacity.";
            case LEGAL:
                return "The person authenticated the content and accepted legal responsibility for its content.";
            case OFFICIAL:
                return "The organization authenticated the content as consistent with their policies and procedures.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PERSONAL:
                return "Personal";
            case PROFESSIONAL:
                return "Professional";
            case LEGAL:
                return "Legal";
            case OFFICIAL:
                return "Official";
            default:
                return "?";
        }
    }
}
