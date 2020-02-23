package org.hl7.fhir.android.generated.dstu2.GoalEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class GoalStatusEnumFactory implements EnumFactory<GoalStatus> {

    public GoalStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("proposed".equals(codeString))
            return GoalStatus.PROPOSED;
        if ("planned".equals(codeString))
            return GoalStatus.PLANNED;
        if ("accepted".equals(codeString))
            return GoalStatus.ACCEPTED;
        if ("rejected".equals(codeString))
            return GoalStatus.REJECTED;
        if ("in-progress".equals(codeString))
            return GoalStatus.INPROGRESS;
        if ("achieved".equals(codeString))
            return GoalStatus.ACHIEVED;
        if ("sustaining".equals(codeString))
            return GoalStatus.SUSTAINING;
        if ("on-hold".equals(codeString))
            return GoalStatus.ONHOLD;
        if ("cancelled".equals(codeString))
            return GoalStatus.CANCELLED;
        throw new IllegalArgumentException("Unknown GoalStatus code '" + codeString + "'");
    }

    public Enumeration<GoalStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("proposed".equals(codeString))
            return new Enumeration<GoalStatus>(this, GoalStatus.PROPOSED);
        if ("planned".equals(codeString))
            return new Enumeration<GoalStatus>(this, GoalStatus.PLANNED);
        if ("accepted".equals(codeString))
            return new Enumeration<GoalStatus>(this, GoalStatus.ACCEPTED);
        if ("rejected".equals(codeString))
            return new Enumeration<GoalStatus>(this, GoalStatus.REJECTED);
        if ("in-progress".equals(codeString))
            return new Enumeration<GoalStatus>(this, GoalStatus.INPROGRESS);
        if ("achieved".equals(codeString))
            return new Enumeration<GoalStatus>(this, GoalStatus.ACHIEVED);
        if ("sustaining".equals(codeString))
            return new Enumeration<GoalStatus>(this, GoalStatus.SUSTAINING);
        if ("on-hold".equals(codeString))
            return new Enumeration<GoalStatus>(this, GoalStatus.ONHOLD);
        if ("cancelled".equals(codeString))
            return new Enumeration<GoalStatus>(this, GoalStatus.CANCELLED);
        throw new FHIRException("Unknown GoalStatus code '" + codeString + "'");
    }

    public String toCode(GoalStatus code) {
        if (code == GoalStatus.PROPOSED)
            return "proposed";
        if (code == GoalStatus.PLANNED)
            return "planned";
        if (code == GoalStatus.ACCEPTED)
            return "accepted";
        if (code == GoalStatus.REJECTED)
            return "rejected";
        if (code == GoalStatus.INPROGRESS)
            return "in-progress";
        if (code == GoalStatus.ACHIEVED)
            return "achieved";
        if (code == GoalStatus.SUSTAINING)
            return "sustaining";
        if (code == GoalStatus.ONHOLD)
            return "on-hold";
        if (code == GoalStatus.CANCELLED)
            return "cancelled";
        return "?";
    }
}
