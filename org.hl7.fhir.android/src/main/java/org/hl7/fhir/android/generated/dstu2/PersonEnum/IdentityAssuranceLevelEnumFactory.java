package org.hl7.fhir.android.generated.dstu2.PersonEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class IdentityAssuranceLevelEnumFactory implements EnumFactory<IdentityAssuranceLevel> {

    public IdentityAssuranceLevel fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("level1".equals(codeString))
            return IdentityAssuranceLevel.LEVEL1;
        if ("level2".equals(codeString))
            return IdentityAssuranceLevel.LEVEL2;
        if ("level3".equals(codeString))
            return IdentityAssuranceLevel.LEVEL3;
        if ("level4".equals(codeString))
            return IdentityAssuranceLevel.LEVEL4;
        throw new IllegalArgumentException("Unknown IdentityAssuranceLevel code '" + codeString + "'");
    }

    public Enumeration<IdentityAssuranceLevel> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("level1".equals(codeString))
            return new Enumeration<IdentityAssuranceLevel>(this, IdentityAssuranceLevel.LEVEL1);
        if ("level2".equals(codeString))
            return new Enumeration<IdentityAssuranceLevel>(this, IdentityAssuranceLevel.LEVEL2);
        if ("level3".equals(codeString))
            return new Enumeration<IdentityAssuranceLevel>(this, IdentityAssuranceLevel.LEVEL3);
        if ("level4".equals(codeString))
            return new Enumeration<IdentityAssuranceLevel>(this, IdentityAssuranceLevel.LEVEL4);
        throw new FHIRException("Unknown IdentityAssuranceLevel code '" + codeString + "'");
    }

    public String toCode(IdentityAssuranceLevel code) {
        if (code == IdentityAssuranceLevel.LEVEL1)
            return "level1";
        if (code == IdentityAssuranceLevel.LEVEL2)
            return "level2";
        if (code == IdentityAssuranceLevel.LEVEL3)
            return "level3";
        if (code == IdentityAssuranceLevel.LEVEL4)
            return "level4";
        return "?";
    }
}
