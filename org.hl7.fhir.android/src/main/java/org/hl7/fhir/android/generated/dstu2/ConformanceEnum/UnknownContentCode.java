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

public enum UnknownContentCode {

    /**
     * The application does not accept either unknown elements or extensions.
     */
    NO,
    /**
     * The application accepts unknown extensions, but not unknown elements.
     */
    EXTENSIONS,
    /**
     * The application accepts unknown elements, but not unknown extensions.
     */
    ELEMENTS,
    /**
     * The application accepts unknown elements and extensions.
     */
    BOTH,
    /**
     * added to help the parsers
     */
    NULL;

    public static UnknownContentCode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("no".equals(codeString))
            return NO;
        if ("extensions".equals(codeString))
            return EXTENSIONS;
        if ("elements".equals(codeString))
            return ELEMENTS;
        if ("both".equals(codeString))
            return BOTH;
        throw new FHIRException("Unknown UnknownContentCode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case NO:
                return "no";
            case EXTENSIONS:
                return "extensions";
            case ELEMENTS:
                return "elements";
            case BOTH:
                return "both";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case NO:
                return "http://hl7.org/fhir/unknown-content-code";
            case EXTENSIONS:
                return "http://hl7.org/fhir/unknown-content-code";
            case ELEMENTS:
                return "http://hl7.org/fhir/unknown-content-code";
            case BOTH:
                return "http://hl7.org/fhir/unknown-content-code";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case NO:
                return "The application does not accept either unknown elements or extensions.";
            case EXTENSIONS:
                return "The application accepts unknown extensions, but not unknown elements.";
            case ELEMENTS:
                return "The application accepts unknown elements, but not unknown extensions.";
            case BOTH:
                return "The application accepts unknown elements and extensions.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case NO:
                return "Neither Elements or Extensions";
            case EXTENSIONS:
                return "Unknown Extensions";
            case ELEMENTS:
                return "Unknown Elements";
            case BOTH:
                return "Unknown Elements and Extensions";
            default:
                return "?";
        }
    }
}
