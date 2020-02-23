package org.hl7.fhir.android.generated.dstu2.TestScriptEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AssertionOperatorTypeEnumFactory implements EnumFactory<AssertionOperatorType> {

    public AssertionOperatorType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("equals".equals(codeString))
            return AssertionOperatorType.EQUALS;
        if ("notEquals".equals(codeString))
            return AssertionOperatorType.NOTEQUALS;
        if ("in".equals(codeString))
            return AssertionOperatorType.IN;
        if ("notIn".equals(codeString))
            return AssertionOperatorType.NOTIN;
        if ("greaterThan".equals(codeString))
            return AssertionOperatorType.GREATERTHAN;
        if ("lessThan".equals(codeString))
            return AssertionOperatorType.LESSTHAN;
        if ("empty".equals(codeString))
            return AssertionOperatorType.EMPTY;
        if ("notEmpty".equals(codeString))
            return AssertionOperatorType.NOTEMPTY;
        if ("contains".equals(codeString))
            return AssertionOperatorType.CONTAINS;
        if ("notContains".equals(codeString))
            return AssertionOperatorType.NOTCONTAINS;
        throw new IllegalArgumentException("Unknown AssertionOperatorType code '" + codeString + "'");
    }

    public Enumeration<AssertionOperatorType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("equals".equals(codeString))
            return new Enumeration<AssertionOperatorType>(this, AssertionOperatorType.EQUALS);
        if ("notEquals".equals(codeString))
            return new Enumeration<AssertionOperatorType>(this, AssertionOperatorType.NOTEQUALS);
        if ("in".equals(codeString))
            return new Enumeration<AssertionOperatorType>(this, AssertionOperatorType.IN);
        if ("notIn".equals(codeString))
            return new Enumeration<AssertionOperatorType>(this, AssertionOperatorType.NOTIN);
        if ("greaterThan".equals(codeString))
            return new Enumeration<AssertionOperatorType>(this, AssertionOperatorType.GREATERTHAN);
        if ("lessThan".equals(codeString))
            return new Enumeration<AssertionOperatorType>(this, AssertionOperatorType.LESSTHAN);
        if ("empty".equals(codeString))
            return new Enumeration<AssertionOperatorType>(this, AssertionOperatorType.EMPTY);
        if ("notEmpty".equals(codeString))
            return new Enumeration<AssertionOperatorType>(this, AssertionOperatorType.NOTEMPTY);
        if ("contains".equals(codeString))
            return new Enumeration<AssertionOperatorType>(this, AssertionOperatorType.CONTAINS);
        if ("notContains".equals(codeString))
            return new Enumeration<AssertionOperatorType>(this, AssertionOperatorType.NOTCONTAINS);
        throw new FHIRException("Unknown AssertionOperatorType code '" + codeString + "'");
    }

    public String toCode(AssertionOperatorType code) {
        if (code == AssertionOperatorType.EQUALS)
            return "equals";
        if (code == AssertionOperatorType.NOTEQUALS)
            return "notEquals";
        if (code == AssertionOperatorType.IN)
            return "in";
        if (code == AssertionOperatorType.NOTIN)
            return "notIn";
        if (code == AssertionOperatorType.GREATERTHAN)
            return "greaterThan";
        if (code == AssertionOperatorType.LESSTHAN)
            return "lessThan";
        if (code == AssertionOperatorType.EMPTY)
            return "empty";
        if (code == AssertionOperatorType.NOTEMPTY)
            return "notEmpty";
        if (code == AssertionOperatorType.CONTAINS)
            return "contains";
        if (code == AssertionOperatorType.NOTCONTAINS)
            return "notContains";
        return "?";
    }
}
