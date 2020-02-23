package org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class IssueTypeEnumFactory implements EnumFactory<IssueType> {

    public IssueType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("invalid".equals(codeString))
            return IssueType.INVALID;
        if ("structure".equals(codeString))
            return IssueType.STRUCTURE;
        if ("required".equals(codeString))
            return IssueType.REQUIRED;
        if ("value".equals(codeString))
            return IssueType.VALUE;
        if ("invariant".equals(codeString))
            return IssueType.INVARIANT;
        if ("security".equals(codeString))
            return IssueType.SECURITY;
        if ("login".equals(codeString))
            return IssueType.LOGIN;
        if ("unknown".equals(codeString))
            return IssueType.UNKNOWN;
        if ("expired".equals(codeString))
            return IssueType.EXPIRED;
        if ("forbidden".equals(codeString))
            return IssueType.FORBIDDEN;
        if ("suppressed".equals(codeString))
            return IssueType.SUPPRESSED;
        if ("processing".equals(codeString))
            return IssueType.PROCESSING;
        if ("not-supported".equals(codeString))
            return IssueType.NOTSUPPORTED;
        if ("duplicate".equals(codeString))
            return IssueType.DUPLICATE;
        if ("not-found".equals(codeString))
            return IssueType.NOTFOUND;
        if ("too-long".equals(codeString))
            return IssueType.TOOLONG;
        if ("code-invalid".equals(codeString))
            return IssueType.CODEINVALID;
        if ("extension".equals(codeString))
            return IssueType.EXTENSION;
        if ("too-costly".equals(codeString))
            return IssueType.TOOCOSTLY;
        if ("business-rule".equals(codeString))
            return IssueType.BUSINESSRULE;
        if ("conflict".equals(codeString))
            return IssueType.CONFLICT;
        if ("incomplete".equals(codeString))
            return IssueType.INCOMPLETE;
        if ("transient".equals(codeString))
            return IssueType.TRANSIENT;
        if ("lock-error".equals(codeString))
            return IssueType.LOCKERROR;
        if ("no-store".equals(codeString))
            return IssueType.NOSTORE;
        if ("exception".equals(codeString))
            return IssueType.EXCEPTION;
        if ("timeout".equals(codeString))
            return IssueType.TIMEOUT;
        if ("throttled".equals(codeString))
            return IssueType.THROTTLED;
        if ("informational".equals(codeString))
            return IssueType.INFORMATIONAL;
        throw new IllegalArgumentException("Unknown IssueType code '" + codeString + "'");
    }

    public Enumeration<IssueType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("invalid".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.INVALID);
        if ("structure".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.STRUCTURE);
        if ("required".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.REQUIRED);
        if ("value".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.VALUE);
        if ("invariant".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.INVARIANT);
        if ("security".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.SECURITY);
        if ("login".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.LOGIN);
        if ("unknown".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.UNKNOWN);
        if ("expired".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.EXPIRED);
        if ("forbidden".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.FORBIDDEN);
        if ("suppressed".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.SUPPRESSED);
        if ("processing".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.PROCESSING);
        if ("not-supported".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.NOTSUPPORTED);
        if ("duplicate".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.DUPLICATE);
        if ("not-found".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.NOTFOUND);
        if ("too-long".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.TOOLONG);
        if ("code-invalid".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.CODEINVALID);
        if ("extension".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.EXTENSION);
        if ("too-costly".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.TOOCOSTLY);
        if ("business-rule".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.BUSINESSRULE);
        if ("conflict".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.CONFLICT);
        if ("incomplete".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.INCOMPLETE);
        if ("transient".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.TRANSIENT);
        if ("lock-error".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.LOCKERROR);
        if ("no-store".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.NOSTORE);
        if ("exception".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.EXCEPTION);
        if ("timeout".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.TIMEOUT);
        if ("throttled".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.THROTTLED);
        if ("informational".equals(codeString))
            return new Enumeration<IssueType>(this, IssueType.INFORMATIONAL);
        throw new FHIRException("Unknown IssueType code '" + codeString + "'");
    }

    public String toCode(IssueType code) {
        if (code == IssueType.INVALID)
            return "invalid";
        if (code == IssueType.STRUCTURE)
            return "structure";
        if (code == IssueType.REQUIRED)
            return "required";
        if (code == IssueType.VALUE)
            return "value";
        if (code == IssueType.INVARIANT)
            return "invariant";
        if (code == IssueType.SECURITY)
            return "security";
        if (code == IssueType.LOGIN)
            return "login";
        if (code == IssueType.UNKNOWN)
            return "unknown";
        if (code == IssueType.EXPIRED)
            return "expired";
        if (code == IssueType.FORBIDDEN)
            return "forbidden";
        if (code == IssueType.SUPPRESSED)
            return "suppressed";
        if (code == IssueType.PROCESSING)
            return "processing";
        if (code == IssueType.NOTSUPPORTED)
            return "not-supported";
        if (code == IssueType.DUPLICATE)
            return "duplicate";
        if (code == IssueType.NOTFOUND)
            return "not-found";
        if (code == IssueType.TOOLONG)
            return "too-long";
        if (code == IssueType.CODEINVALID)
            return "code-invalid";
        if (code == IssueType.EXTENSION)
            return "extension";
        if (code == IssueType.TOOCOSTLY)
            return "too-costly";
        if (code == IssueType.BUSINESSRULE)
            return "business-rule";
        if (code == IssueType.CONFLICT)
            return "conflict";
        if (code == IssueType.INCOMPLETE)
            return "incomplete";
        if (code == IssueType.TRANSIENT)
            return "transient";
        if (code == IssueType.LOCKERROR)
            return "lock-error";
        if (code == IssueType.NOSTORE)
            return "no-store";
        if (code == IssueType.EXCEPTION)
            return "exception";
        if (code == IssueType.TIMEOUT)
            return "timeout";
        if (code == IssueType.THROTTLED)
            return "throttled";
        if (code == IssueType.INFORMATIONAL)
            return "informational";
        return "?";
    }
}
