package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DataAbsentReasonEnumFactory implements EnumFactory<DataAbsentReason> {

    public DataAbsentReason fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("unknown".equals(codeString))
            return DataAbsentReason.UNKNOWN;
        if ("asked".equals(codeString))
            return DataAbsentReason.ASKED;
        if ("temp".equals(codeString))
            return DataAbsentReason.TEMP;
        if ("not-asked".equals(codeString))
            return DataAbsentReason.NOTASKED;
        if ("masked".equals(codeString))
            return DataAbsentReason.MASKED;
        if ("unsupported".equals(codeString))
            return DataAbsentReason.UNSUPPORTED;
        if ("astext".equals(codeString))
            return DataAbsentReason.ASTEXT;
        if ("error".equals(codeString))
            return DataAbsentReason.ERROR;
        if ("NaN".equals(codeString))
            return DataAbsentReason.NAN;
        throw new IllegalArgumentException("Unknown DataAbsentReason code '" + codeString + "'");
    }

    public Enumeration<DataAbsentReason> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("unknown".equals(codeString))
            return new Enumeration<DataAbsentReason>(this, DataAbsentReason.UNKNOWN);
        if ("asked".equals(codeString))
            return new Enumeration<DataAbsentReason>(this, DataAbsentReason.ASKED);
        if ("temp".equals(codeString))
            return new Enumeration<DataAbsentReason>(this, DataAbsentReason.TEMP);
        if ("not-asked".equals(codeString))
            return new Enumeration<DataAbsentReason>(this, DataAbsentReason.NOTASKED);
        if ("masked".equals(codeString))
            return new Enumeration<DataAbsentReason>(this, DataAbsentReason.MASKED);
        if ("unsupported".equals(codeString))
            return new Enumeration<DataAbsentReason>(this, DataAbsentReason.UNSUPPORTED);
        if ("astext".equals(codeString))
            return new Enumeration<DataAbsentReason>(this, DataAbsentReason.ASTEXT);
        if ("error".equals(codeString))
            return new Enumeration<DataAbsentReason>(this, DataAbsentReason.ERROR);
        if ("NaN".equals(codeString))
            return new Enumeration<DataAbsentReason>(this, DataAbsentReason.NAN);
        throw new FHIRException("Unknown DataAbsentReason code '" + codeString + "'");
    }

    public String toCode(DataAbsentReason code) {
        if (code == DataAbsentReason.UNKNOWN)
            return "unknown";
        if (code == DataAbsentReason.ASKED)
            return "asked";
        if (code == DataAbsentReason.TEMP)
            return "temp";
        if (code == DataAbsentReason.NOTASKED)
            return "not-asked";
        if (code == DataAbsentReason.MASKED)
            return "masked";
        if (code == DataAbsentReason.UNSUPPORTED)
            return "unsupported";
        if (code == DataAbsentReason.ASTEXT)
            return "astext";
        if (code == DataAbsentReason.ERROR)
            return "error";
        if (code == DataAbsentReason.NAN)
            return "NaN";
        return "?";
    }
}
