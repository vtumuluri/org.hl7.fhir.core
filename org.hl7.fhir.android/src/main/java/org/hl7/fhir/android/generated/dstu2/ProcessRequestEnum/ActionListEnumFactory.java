package org.hl7.fhir.android.generated.dstu2.ProcessRequestEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ActionListEnumFactory implements EnumFactory<ActionList> {

    public ActionList fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("cancel".equals(codeString))
            return ActionList.CANCEL;
        if ("poll".equals(codeString))
            return ActionList.POLL;
        if ("reprocess".equals(codeString))
            return ActionList.REPROCESS;
        if ("status".equals(codeString))
            return ActionList.STATUS;
        throw new IllegalArgumentException("Unknown ActionList code '" + codeString + "'");
    }

    public Enumeration<ActionList> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("cancel".equals(codeString))
            return new Enumeration<ActionList>(this, ActionList.CANCEL);
        if ("poll".equals(codeString))
            return new Enumeration<ActionList>(this, ActionList.POLL);
        if ("reprocess".equals(codeString))
            return new Enumeration<ActionList>(this, ActionList.REPROCESS);
        if ("status".equals(codeString))
            return new Enumeration<ActionList>(this, ActionList.STATUS);
        throw new FHIRException("Unknown ActionList code '" + codeString + "'");
    }

    public String toCode(ActionList code) {
        if (code == ActionList.CANCEL)
            return "cancel";
        if (code == ActionList.POLL)
            return "poll";
        if (code == ActionList.REPROCESS)
            return "reprocess";
        if (code == ActionList.STATUS)
            return "status";
        return "?";
    }
}
