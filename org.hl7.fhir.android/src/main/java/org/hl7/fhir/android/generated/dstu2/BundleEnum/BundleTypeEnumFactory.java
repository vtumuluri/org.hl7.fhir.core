package org.hl7.fhir.android.generated.dstu2.BundleEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class BundleTypeEnumFactory implements EnumFactory<BundleType> {

    public BundleType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("document".equals(codeString))
            return BundleType.DOCUMENT;
        if ("message".equals(codeString))
            return BundleType.MESSAGE;
        if ("transaction".equals(codeString))
            return BundleType.TRANSACTION;
        if ("transaction-response".equals(codeString))
            return BundleType.TRANSACTIONRESPONSE;
        if ("batch".equals(codeString))
            return BundleType.BATCH;
        if ("batch-response".equals(codeString))
            return BundleType.BATCHRESPONSE;
        if ("history".equals(codeString))
            return BundleType.HISTORY;
        if ("searchset".equals(codeString))
            return BundleType.SEARCHSET;
        if ("collection".equals(codeString))
            return BundleType.COLLECTION;
        throw new IllegalArgumentException("Unknown BundleType code '" + codeString + "'");
    }

    public Enumeration<BundleType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("document".equals(codeString))
            return new Enumeration<BundleType>(this, BundleType.DOCUMENT);
        if ("message".equals(codeString))
            return new Enumeration<BundleType>(this, BundleType.MESSAGE);
        if ("transaction".equals(codeString))
            return new Enumeration<BundleType>(this, BundleType.TRANSACTION);
        if ("transaction-response".equals(codeString))
            return new Enumeration<BundleType>(this, BundleType.TRANSACTIONRESPONSE);
        if ("batch".equals(codeString))
            return new Enumeration<BundleType>(this, BundleType.BATCH);
        if ("batch-response".equals(codeString))
            return new Enumeration<BundleType>(this, BundleType.BATCHRESPONSE);
        if ("history".equals(codeString))
            return new Enumeration<BundleType>(this, BundleType.HISTORY);
        if ("searchset".equals(codeString))
            return new Enumeration<BundleType>(this, BundleType.SEARCHSET);
        if ("collection".equals(codeString))
            return new Enumeration<BundleType>(this, BundleType.COLLECTION);
        throw new FHIRException("Unknown BundleType code '" + codeString + "'");
    }

    public String toCode(BundleType code) {
        if (code == BundleType.DOCUMENT)
            return "document";
        if (code == BundleType.MESSAGE)
            return "message";
        if (code == BundleType.TRANSACTION)
            return "transaction";
        if (code == BundleType.TRANSACTIONRESPONSE)
            return "transaction-response";
        if (code == BundleType.BATCH)
            return "batch";
        if (code == BundleType.BATCHRESPONSE)
            return "batch-response";
        if (code == BundleType.HISTORY)
            return "history";
        if (code == BundleType.SEARCHSET)
            return "searchset";
        if (code == BundleType.COLLECTION)
            return "collection";
        return "?";
    }
}
