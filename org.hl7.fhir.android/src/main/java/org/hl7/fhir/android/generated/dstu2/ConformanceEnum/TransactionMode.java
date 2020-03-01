package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

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
