package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ResourceVersionPolicyEnumFactory implements EnumFactory<ResourceVersionPolicy> {

    public ResourceVersionPolicy fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("no-version".equals(codeString))
            return ResourceVersionPolicy.NOVERSION;
        if ("versioned".equals(codeString))
            return ResourceVersionPolicy.VERSIONED;
        if ("versioned-update".equals(codeString))
            return ResourceVersionPolicy.VERSIONEDUPDATE;
        throw new IllegalArgumentException("Unknown ResourceVersionPolicy code '" + codeString + "'");
    }

    public Enumeration<ResourceVersionPolicy> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("no-version".equals(codeString))
            return new Enumeration<ResourceVersionPolicy>(this, ResourceVersionPolicy.NOVERSION);
        if ("versioned".equals(codeString))
            return new Enumeration<ResourceVersionPolicy>(this, ResourceVersionPolicy.VERSIONED);
        if ("versioned-update".equals(codeString))
            return new Enumeration<ResourceVersionPolicy>(this, ResourceVersionPolicy.VERSIONEDUPDATE);
        throw new FHIRException("Unknown ResourceVersionPolicy code '" + codeString + "'");
    }

    public String toCode(ResourceVersionPolicy code) {
        if (code == ResourceVersionPolicy.NOVERSION)
            return "no-version";
        if (code == ResourceVersionPolicy.VERSIONED)
            return "versioned";
        if (code == ResourceVersionPolicy.VERSIONEDUPDATE)
            return "versioned-update";
        return "?";
    }
}
