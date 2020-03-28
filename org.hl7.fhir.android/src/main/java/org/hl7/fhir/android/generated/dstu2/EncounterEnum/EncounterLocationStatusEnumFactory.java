package org.hl7.fhir.android.generated.dstu2.EncounterEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class EncounterLocationStatusEnumFactory implements EnumFactory<EncounterLocationStatus> {

    public EncounterLocationStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("planned".equals(codeString))
            return EncounterLocationStatus.PLANNED;
        if ("active".equals(codeString))
            return EncounterLocationStatus.ACTIVE;
        if ("reserved".equals(codeString))
            return EncounterLocationStatus.RESERVED;
        if ("completed".equals(codeString))
            return EncounterLocationStatus.COMPLETED;
        throw new IllegalArgumentException("Unknown EncounterLocationStatus code '" + codeString + "'");
    }

    public Enumeration<EncounterLocationStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("planned".equals(codeString))
            return new Enumeration<EncounterLocationStatus>(this, EncounterLocationStatus.PLANNED);
        if ("active".equals(codeString))
            return new Enumeration<EncounterLocationStatus>(this, EncounterLocationStatus.ACTIVE);
        if ("reserved".equals(codeString))
            return new Enumeration<EncounterLocationStatus>(this, EncounterLocationStatus.RESERVED);
        if ("completed".equals(codeString))
            return new Enumeration<EncounterLocationStatus>(this, EncounterLocationStatus.COMPLETED);
        throw new FHIRException("Unknown EncounterLocationStatus code '" + codeString + "'");
    }

    public String toCode(EncounterLocationStatus code) {
        if (code == EncounterLocationStatus.PLANNED)
            return "planned";
        if (code == EncounterLocationStatus.ACTIVE)
            return "active";
        if (code == EncounterLocationStatus.RESERVED)
            return "reserved";
        if (code == EncounterLocationStatus.COMPLETED)
            return "completed";
        return "?";
    }
}
