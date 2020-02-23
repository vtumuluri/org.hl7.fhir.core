package org.hl7.fhir.android.generated.dstu2.AccountEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AccountStatusEnumFactory implements EnumFactory<AccountStatus> {

    public AccountStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
            return AccountStatus.ACTIVE;
        if ("inactive".equals(codeString))
            return AccountStatus.INACTIVE;
        throw new IllegalArgumentException("Unknown AccountStatus code '" + codeString + "'");
    }

    public Enumeration<AccountStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
            return new Enumeration<AccountStatus>(this, AccountStatus.ACTIVE);
        if ("inactive".equals(codeString))
            return new Enumeration<AccountStatus>(this, AccountStatus.INACTIVE);
        throw new FHIRException("Unknown AccountStatus code '" + codeString + "'");
    }

    public String toCode(AccountStatus code) {
        if (code == AccountStatus.ACTIVE)
            return "active";
        if (code == AccountStatus.INACTIVE)
            return "inactive";
        return "?";
    }
}
