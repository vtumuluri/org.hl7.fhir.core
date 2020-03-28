package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseConformance;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKind;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicy;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatus;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionMode;

public enum ConformanceStatementKind {

    /**
     * The Conformance instance represents the present capabilities of a specific system instance.  This is the kind returned by OPTIONS for a FHIR server end-point.
     */
    INSTANCE,
    /**
     * The Conformance instance represents the capabilities of a system or piece of software, independent of a particular installation.
     */
    CAPABILITY,
    /**
     * The Conformance instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.
     */
    REQUIREMENTS,
    /**
     * added to help the parsers
     */
    NULL;

    public static ConformanceStatementKind fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("instance".equals(codeString))
            return INSTANCE;
        if ("capability".equals(codeString))
            return CAPABILITY;
        if ("requirements".equals(codeString))
            return REQUIREMENTS;
        throw new FHIRException("Unknown ConformanceStatementKind code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INSTANCE:
                return "instance";
            case CAPABILITY:
                return "capability";
            case REQUIREMENTS:
                return "requirements";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INSTANCE:
                return "http://hl7.org/fhir/conformance-statement-kind";
            case CAPABILITY:
                return "http://hl7.org/fhir/conformance-statement-kind";
            case REQUIREMENTS:
                return "http://hl7.org/fhir/conformance-statement-kind";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INSTANCE:
                return "The Conformance instance represents the present capabilities of a specific system instance.  This is the kind returned by OPTIONS for a FHIR server end-point.";
            case CAPABILITY:
                return "The Conformance instance represents the capabilities of a system or piece of software, independent of a particular installation.";
            case REQUIREMENTS:
                return "The Conformance instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INSTANCE:
                return "Instance";
            case CAPABILITY:
                return "Capability";
            case REQUIREMENTS:
                return "Requirements";
            default:
                return "?";
        }
    }
}
