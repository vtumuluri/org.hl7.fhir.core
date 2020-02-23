package org.hl7.fhir.android.generated.dstu2.DataElementEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DataElementStringencyEnumFactory implements EnumFactory<DataElementStringency> {

    public DataElementStringency fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("comparable".equals(codeString))
            return DataElementStringency.COMPARABLE;
        if ("fully-specified".equals(codeString))
            return DataElementStringency.FULLYSPECIFIED;
        if ("equivalent".equals(codeString))
            return DataElementStringency.EQUIVALENT;
        if ("convertable".equals(codeString))
            return DataElementStringency.CONVERTABLE;
        if ("scaleable".equals(codeString))
            return DataElementStringency.SCALEABLE;
        if ("flexible".equals(codeString))
            return DataElementStringency.FLEXIBLE;
        throw new IllegalArgumentException("Unknown DataElementStringency code '" + codeString + "'");
    }

    public Enumeration<DataElementStringency> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("comparable".equals(codeString))
            return new Enumeration<DataElementStringency>(this, DataElementStringency.COMPARABLE);
        if ("fully-specified".equals(codeString))
            return new Enumeration<DataElementStringency>(this, DataElementStringency.FULLYSPECIFIED);
        if ("equivalent".equals(codeString))
            return new Enumeration<DataElementStringency>(this, DataElementStringency.EQUIVALENT);
        if ("convertable".equals(codeString))
            return new Enumeration<DataElementStringency>(this, DataElementStringency.CONVERTABLE);
        if ("scaleable".equals(codeString))
            return new Enumeration<DataElementStringency>(this, DataElementStringency.SCALEABLE);
        if ("flexible".equals(codeString))
            return new Enumeration<DataElementStringency>(this, DataElementStringency.FLEXIBLE);
        throw new FHIRException("Unknown DataElementStringency code '" + codeString + "'");
    }

    public String toCode(DataElementStringency code) {
        if (code == DataElementStringency.COMPARABLE)
            return "comparable";
        if (code == DataElementStringency.FULLYSPECIFIED)
            return "fully-specified";
        if (code == DataElementStringency.EQUIVALENT)
            return "equivalent";
        if (code == DataElementStringency.CONVERTABLE)
            return "convertable";
        if (code == DataElementStringency.SCALEABLE)
            return "scaleable";
        if (code == DataElementStringency.FLEXIBLE)
            return "flexible";
        return "?";
    }
}
