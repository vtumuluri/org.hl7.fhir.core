package org.hl7.fhir.android.generated.dstu2.EncounterEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class EncounterStateEnumFactory implements EnumFactory<EncounterState> {

    public EncounterState fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("planned".equals(codeString))
            return EncounterState.PLANNED;
        if ("arrived".equals(codeString))
            return EncounterState.ARRIVED;
        if ("in-progress".equals(codeString))
            return EncounterState.INPROGRESS;
        if ("onleave".equals(codeString))
            return EncounterState.ONLEAVE;
        if ("finished".equals(codeString))
            return EncounterState.FINISHED;
        if ("cancelled".equals(codeString))
            return EncounterState.CANCELLED;
        throw new IllegalArgumentException("Unknown EncounterState code '" + codeString + "'");
    }

    public Enumeration<EncounterState> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("planned".equals(codeString))
            return new Enumeration<EncounterState>(this, EncounterState.PLANNED);
        if ("arrived".equals(codeString))
            return new Enumeration<EncounterState>(this, EncounterState.ARRIVED);
        if ("in-progress".equals(codeString))
            return new Enumeration<EncounterState>(this, EncounterState.INPROGRESS);
        if ("onleave".equals(codeString))
            return new Enumeration<EncounterState>(this, EncounterState.ONLEAVE);
        if ("finished".equals(codeString))
            return new Enumeration<EncounterState>(this, EncounterState.FINISHED);
        if ("cancelled".equals(codeString))
            return new Enumeration<EncounterState>(this, EncounterState.CANCELLED);
        throw new FHIRException("Unknown EncounterState code '" + codeString + "'");
    }

    public String toCode(EncounterState code) {
        if (code == EncounterState.PLANNED)
            return "planned";
        if (code == EncounterState.ARRIVED)
            return "arrived";
        if (code == EncounterState.INPROGRESS)
            return "in-progress";
        if (code == EncounterState.ONLEAVE)
            return "onleave";
        if (code == EncounterState.FINISHED)
            return "finished";
        if (code == EncounterState.CANCELLED)
            return "cancelled";
        return "?";
    }
}
