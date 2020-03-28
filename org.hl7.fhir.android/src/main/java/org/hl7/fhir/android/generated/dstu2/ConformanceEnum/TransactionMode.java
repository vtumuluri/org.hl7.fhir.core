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

public enum TransactionMode {

    /**
     * Neither batch or transaction is supported.
     */
    NOTSUPPORTED,
    /**
     * Batches are  supported.
     */
    BATCH,
    /**
     * Transactions are supported.
     */
    TRANSACTION,
    /**
     * Both batches and transactions are supported.
     */
    BOTH,
    /**
     * added to help the parsers
     */
    NULL;

    public static TransactionMode fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("not-supported".equals(codeString))
            return NOTSUPPORTED;
        if ("batch".equals(codeString))
            return BATCH;
        if ("transaction".equals(codeString))
            return TRANSACTION;
        if ("both".equals(codeString))
            return BOTH;
        throw new FHIRException("Unknown TransactionMode code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case NOTSUPPORTED:
                return "not-supported";
            case BATCH:
                return "batch";
            case TRANSACTION:
                return "transaction";
            case BOTH:
                return "both";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case NOTSUPPORTED:
                return "http://hl7.org/fhir/transaction-mode";
            case BATCH:
                return "http://hl7.org/fhir/transaction-mode";
            case TRANSACTION:
                return "http://hl7.org/fhir/transaction-mode";
            case BOTH:
                return "http://hl7.org/fhir/transaction-mode";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case NOTSUPPORTED:
                return "Neither batch or transaction is supported.";
            case BATCH:
                return "Batches are  supported.";
            case TRANSACTION:
                return "Transactions are supported.";
            case BOTH:
                return "Both batches and transactions are supported.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case NOTSUPPORTED:
                return "None";
            case BATCH:
                return "Batches supported";
            case TRANSACTION:
                return "Transactions Supported";
            case BOTH:
                return "Batches & Transactions";
            default:
                return "?";
        }
    }
}
