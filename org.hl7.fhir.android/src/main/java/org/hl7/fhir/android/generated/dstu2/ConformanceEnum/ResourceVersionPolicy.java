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

public enum ResourceVersionPolicy {

    /**
     * VersionId meta-property is not supported (server) or used (client).
     */
    NOVERSION,
    /**
     * VersionId meta-property is supported (server) or used (client).
     */
    VERSIONED,
    /**
     * VersionId is must be correct for updates (server) or will be specified (If-match header) for updates (client).
     */
    VERSIONEDUPDATE,
    /**
     * added to help the parsers
     */
    NULL;

    public static ResourceVersionPolicy fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("no-version".equals(codeString))
            return NOVERSION;
        if ("versioned".equals(codeString))
            return VERSIONED;
        if ("versioned-update".equals(codeString))
            return VERSIONEDUPDATE;
        throw new FHIRException("Unknown ResourceVersionPolicy code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case NOVERSION:
                return "no-version";
            case VERSIONED:
                return "versioned";
            case VERSIONEDUPDATE:
                return "versioned-update";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case NOVERSION:
                return "http://hl7.org/fhir/versioning-policy";
            case VERSIONED:
                return "http://hl7.org/fhir/versioning-policy";
            case VERSIONEDUPDATE:
                return "http://hl7.org/fhir/versioning-policy";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case NOVERSION:
                return "VersionId meta-property is not supported (server) or used (client).";
            case VERSIONED:
                return "VersionId meta-property is supported (server) or used (client).";
            case VERSIONEDUPDATE:
                return "VersionId is must be correct for updates (server) or will be specified (If-match header) for updates (client).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case NOVERSION:
                return "No VersionId Support";
            case VERSIONED:
                return "Versioned";
            case VERSIONEDUPDATE:
                return "VersionId tracked fully";
            default:
                return "?";
        }
    }
}
