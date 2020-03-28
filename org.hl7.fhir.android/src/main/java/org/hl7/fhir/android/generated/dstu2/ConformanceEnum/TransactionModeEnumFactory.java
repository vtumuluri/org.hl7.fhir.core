package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class TransactionModeEnumFactory implements EnumFactory<TransactionMode> {

    public TransactionMode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-supported".equals(codeString))
            return TransactionMode.NOTSUPPORTED;
        if ("batch".equals(codeString))
            return TransactionMode.BATCH;
        if ("transaction".equals(codeString))
            return TransactionMode.TRANSACTION;
        if ("both".equals(codeString))
            return TransactionMode.BOTH;
        throw new IllegalArgumentException("Unknown TransactionMode code '" + codeString + "'");
    }

    public Enumeration<TransactionMode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("not-supported".equals(codeString))
            return new Enumeration<TransactionMode>(this, TransactionMode.NOTSUPPORTED);
        if ("batch".equals(codeString))
            return new Enumeration<TransactionMode>(this, TransactionMode.BATCH);
        if ("transaction".equals(codeString))
            return new Enumeration<TransactionMode>(this, TransactionMode.TRANSACTION);
        if ("both".equals(codeString))
            return new Enumeration<TransactionMode>(this, TransactionMode.BOTH);
        throw new FHIRException("Unknown TransactionMode code '" + codeString + "'");
    }

    public String toCode(TransactionMode code) {
        if (code == TransactionMode.NOTSUPPORTED)
            return "not-supported";
        if (code == TransactionMode.BATCH)
            return "batch";
        if (code == TransactionMode.TRANSACTION)
            return "transaction";
        if (code == TransactionMode.BOTH)
            return "both";
        return "?";
    }
}
