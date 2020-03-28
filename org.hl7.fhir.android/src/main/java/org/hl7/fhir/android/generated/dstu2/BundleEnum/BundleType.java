package org.hl7.fhir.android.generated.dstu2.BundleEnum;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerbEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerb;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryMode;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleType;

public enum BundleType {

    /**
     * The bundle is a document. The first resource is a Composition.
     */
    DOCUMENT,
    /**
     * The bundle is a message. The first resource is a MessageHeader.
     */
    MESSAGE,
    /**
     * The bundle is a transaction - intended to be processed by a server as an atomic commit.
     */
    TRANSACTION,
    /**
     * The bundle is a transaction response. Because the response is a transaction response, the transactionhas succeeded, and all responses are error free.
     */
    TRANSACTIONRESPONSE,
    /**
     * The bundle is a transaction - intended to be processed by a server as a group of actions.
     */
    BATCH,
    /**
     * The bundle is a batch response. Note that as a batch, some responses may indicate failure and others success.
     */
    BATCHRESPONSE,
    /**
     * The bundle is a list of resources from a history interaction on a server.
     */
    HISTORY,
    /**
     * The bundle is a list of resources returned as a result of a search/query interaction, operation, or message.
     */
    SEARCHSET,
    /**
     * The bundle is a set of resources collected into a single document for ease of distribution.
     */
    COLLECTION,
    /**
     * added to help the parsers
     */
    NULL;

    public static BundleType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("document".equals(codeString))
            return DOCUMENT;
        if ("message".equals(codeString))
            return MESSAGE;
        if ("transaction".equals(codeString))
            return TRANSACTION;
        if ("transaction-response".equals(codeString))
            return TRANSACTIONRESPONSE;
        if ("batch".equals(codeString))
            return BATCH;
        if ("batch-response".equals(codeString))
            return BATCHRESPONSE;
        if ("history".equals(codeString))
            return HISTORY;
        if ("searchset".equals(codeString))
            return SEARCHSET;
        if ("collection".equals(codeString))
            return COLLECTION;
        throw new FHIRException("Unknown BundleType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case DOCUMENT:
                return "document";
            case MESSAGE:
                return "message";
            case TRANSACTION:
                return "transaction";
            case TRANSACTIONRESPONSE:
                return "transaction-response";
            case BATCH:
                return "batch";
            case BATCHRESPONSE:
                return "batch-response";
            case HISTORY:
                return "history";
            case SEARCHSET:
                return "searchset";
            case COLLECTION:
                return "collection";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case DOCUMENT:
                return "http://hl7.org/fhir/bundle-type";
            case MESSAGE:
                return "http://hl7.org/fhir/bundle-type";
            case TRANSACTION:
                return "http://hl7.org/fhir/bundle-type";
            case TRANSACTIONRESPONSE:
                return "http://hl7.org/fhir/bundle-type";
            case BATCH:
                return "http://hl7.org/fhir/bundle-type";
            case BATCHRESPONSE:
                return "http://hl7.org/fhir/bundle-type";
            case HISTORY:
                return "http://hl7.org/fhir/bundle-type";
            case SEARCHSET:
                return "http://hl7.org/fhir/bundle-type";
            case COLLECTION:
                return "http://hl7.org/fhir/bundle-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case DOCUMENT:
                return "The bundle is a document. The first resource is a Composition.";
            case MESSAGE:
                return "The bundle is a message. The first resource is a MessageHeader.";
            case TRANSACTION:
                return "The bundle is a transaction - intended to be processed by a server as an atomic commit.";
            case TRANSACTIONRESPONSE:
                return "The bundle is a transaction response. Because the response is a transaction response, the transactionhas succeeded, and all responses are error free.";
            case BATCH:
                return "The bundle is a transaction - intended to be processed by a server as a group of actions.";
            case BATCHRESPONSE:
                return "The bundle is a batch response. Note that as a batch, some responses may indicate failure and others success.";
            case HISTORY:
                return "The bundle is a list of resources from a history interaction on a server.";
            case SEARCHSET:
                return "The bundle is a list of resources returned as a result of a search/query interaction, operation, or message.";
            case COLLECTION:
                return "The bundle is a set of resources collected into a single document for ease of distribution.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case DOCUMENT:
                return "Document";
            case MESSAGE:
                return "Message";
            case TRANSACTION:
                return "Transaction";
            case TRANSACTIONRESPONSE:
                return "Transaction Response";
            case BATCH:
                return "Batch";
            case BATCHRESPONSE:
                return "Batch Response";
            case HISTORY:
                return "History List";
            case SEARCHSET:
                return "Search Results";
            case COLLECTION:
                return "Collection";
            default:
                return "?";
        }
    }
}
