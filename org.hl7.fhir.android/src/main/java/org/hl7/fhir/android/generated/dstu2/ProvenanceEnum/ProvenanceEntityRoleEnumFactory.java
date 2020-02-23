package org.hl7.fhir.android.generated.dstu2.ProvenanceEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ProvenanceEntityRoleEnumFactory implements EnumFactory<ProvenanceEntityRole> {

    public ProvenanceEntityRole fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("derivation".equals(codeString))
            return ProvenanceEntityRole.DERIVATION;
        if ("revision".equals(codeString))
            return ProvenanceEntityRole.REVISION;
        if ("quotation".equals(codeString))
            return ProvenanceEntityRole.QUOTATION;
        if ("source".equals(codeString))
            return ProvenanceEntityRole.SOURCE;
        throw new IllegalArgumentException("Unknown ProvenanceEntityRole code '" + codeString + "'");
    }

    public Enumeration<ProvenanceEntityRole> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("derivation".equals(codeString))
            return new Enumeration<ProvenanceEntityRole>(this, ProvenanceEntityRole.DERIVATION);
        if ("revision".equals(codeString))
            return new Enumeration<ProvenanceEntityRole>(this, ProvenanceEntityRole.REVISION);
        if ("quotation".equals(codeString))
            return new Enumeration<ProvenanceEntityRole>(this, ProvenanceEntityRole.QUOTATION);
        if ("source".equals(codeString))
            return new Enumeration<ProvenanceEntityRole>(this, ProvenanceEntityRole.SOURCE);
        throw new FHIRException("Unknown ProvenanceEntityRole code '" + codeString + "'");
    }

    public String toCode(ProvenanceEntityRole code) {
        if (code == ProvenanceEntityRole.DERIVATION)
            return "derivation";
        if (code == ProvenanceEntityRole.REVISION)
            return "revision";
        if (code == ProvenanceEntityRole.QUOTATION)
            return "quotation";
        if (code == ProvenanceEntityRole.SOURCE)
            return "source";
        return "?";
    }
}
