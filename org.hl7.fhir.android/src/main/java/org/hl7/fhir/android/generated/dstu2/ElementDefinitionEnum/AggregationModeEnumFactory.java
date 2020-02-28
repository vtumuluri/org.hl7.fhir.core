package org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AggregationModeEnumFactory implements EnumFactory<AggregationMode> {

    public AggregationMode fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("contained".equals(codeString))
            return AggregationMode.CONTAINED;
        if ("referenced".equals(codeString))
            return AggregationMode.REFERENCED;
        if ("bundled".equals(codeString))
            return AggregationMode.BUNDLED;
        throw new IllegalArgumentException("Unknown AggregationMode code '" + codeString + "'");
    }

    public Enumeration<AggregationMode> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("contained".equals(codeString))
            return new Enumeration<AggregationMode>(this, AggregationMode.CONTAINED);
        if ("referenced".equals(codeString))
            return new Enumeration<AggregationMode>(this, AggregationMode.REFERENCED);
        if ("bundled".equals(codeString))
            return new Enumeration<AggregationMode>(this, AggregationMode.BUNDLED);
        throw new FHIRException("Unknown AggregationMode code '" + codeString + "'");
    }

    public String toCode(AggregationMode code) {
        if (code == AggregationMode.CONTAINED)
            return "contained";
        if (code == AggregationMode.REFERENCED)
            return "referenced";
        if (code == AggregationMode.BUNDLED)
            return "bundled";
        return "?";
    }
}
