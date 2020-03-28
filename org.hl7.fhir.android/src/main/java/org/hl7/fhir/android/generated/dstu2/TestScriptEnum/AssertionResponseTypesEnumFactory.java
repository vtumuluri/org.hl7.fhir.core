package org.hl7.fhir.android.generated.dstu2.TestScriptEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AssertionResponseTypesEnumFactory implements EnumFactory<AssertionResponseTypes> {

    public AssertionResponseTypes fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("okay".equals(codeString))
            return AssertionResponseTypes.OKAY;
        if ("created".equals(codeString))
            return AssertionResponseTypes.CREATED;
        if ("noContent".equals(codeString))
            return AssertionResponseTypes.NOCONTENT;
        if ("notModified".equals(codeString))
            return AssertionResponseTypes.NOTMODIFIED;
        if ("bad".equals(codeString))
            return AssertionResponseTypes.BAD;
        if ("forbidden".equals(codeString))
            return AssertionResponseTypes.FORBIDDEN;
        if ("notFound".equals(codeString))
            return AssertionResponseTypes.NOTFOUND;
        if ("methodNotAllowed".equals(codeString))
            return AssertionResponseTypes.METHODNOTALLOWED;
        if ("conflict".equals(codeString))
            return AssertionResponseTypes.CONFLICT;
        if ("gone".equals(codeString))
            return AssertionResponseTypes.GONE;
        if ("preconditionFailed".equals(codeString))
            return AssertionResponseTypes.PRECONDITIONFAILED;
        if ("unprocessable".equals(codeString))
            return AssertionResponseTypes.UNPROCESSABLE;
        throw new IllegalArgumentException("Unknown AssertionResponseTypes code '" + codeString + "'");
    }

    public Enumeration<AssertionResponseTypes> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("okay".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.OKAY);
        if ("created".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.CREATED);
        if ("noContent".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.NOCONTENT);
        if ("notModified".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.NOTMODIFIED);
        if ("bad".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.BAD);
        if ("forbidden".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.FORBIDDEN);
        if ("notFound".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.NOTFOUND);
        if ("methodNotAllowed".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.METHODNOTALLOWED);
        if ("conflict".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.CONFLICT);
        if ("gone".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.GONE);
        if ("preconditionFailed".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.PRECONDITIONFAILED);
        if ("unprocessable".equals(codeString))
            return new Enumeration<AssertionResponseTypes>(this, AssertionResponseTypes.UNPROCESSABLE);
        throw new FHIRException("Unknown AssertionResponseTypes code '" + codeString + "'");
    }

    public String toCode(AssertionResponseTypes code) {
        if (code == AssertionResponseTypes.OKAY)
            return "okay";
        if (code == AssertionResponseTypes.CREATED)
            return "created";
        if (code == AssertionResponseTypes.NOCONTENT)
            return "noContent";
        if (code == AssertionResponseTypes.NOTMODIFIED)
            return "notModified";
        if (code == AssertionResponseTypes.BAD)
            return "bad";
        if (code == AssertionResponseTypes.FORBIDDEN)
            return "forbidden";
        if (code == AssertionResponseTypes.NOTFOUND)
            return "notFound";
        if (code == AssertionResponseTypes.METHODNOTALLOWED)
            return "methodNotAllowed";
        if (code == AssertionResponseTypes.CONFLICT)
            return "conflict";
        if (code == AssertionResponseTypes.GONE)
            return "gone";
        if (code == AssertionResponseTypes.PRECONDITIONFAILED)
            return "preconditionFailed";
        if (code == AssertionResponseTypes.UNPROCESSABLE)
            return "unprocessable";
        return "?";
    }
}
