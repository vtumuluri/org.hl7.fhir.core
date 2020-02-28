package org.hl7.fhir.android.generated.dstu2.TestScriptEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AssertionOperatorType {

    /**
     * Default value. Equals comparison.
     */
    EQUALS,
    /**
     * Not equals comparison.
     */
    NOTEQUALS,
    /**
     * Compare value within a known set of values.
     */
    IN,
    /**
     * Compare value not within a known set of values.
     */
    NOTIN,
    /**
     * Compare value to be greater than a known value.
     */
    GREATERTHAN,
    /**
     * Compare value to be less than a known value.
     */
    LESSTHAN,
    /**
     * Compare value is empty.
     */
    EMPTY,
    /**
     * Compare value is not empty.
     */
    NOTEMPTY,
    /**
     * Compare value string contains a known value.
     */
    CONTAINS,
    /**
     * Compare value string does not contain a known value.
     */
    NOTCONTAINS,
    /**
     * added to help the parsers
     */
    NULL;

    public static AssertionOperatorType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("equals".equals(codeString))
            return EQUALS;
        if ("notEquals".equals(codeString))
            return NOTEQUALS;
        if ("in".equals(codeString))
            return IN;
        if ("notIn".equals(codeString))
            return NOTIN;
        if ("greaterThan".equals(codeString))
            return GREATERTHAN;
        if ("lessThan".equals(codeString))
            return LESSTHAN;
        if ("empty".equals(codeString))
            return EMPTY;
        if ("notEmpty".equals(codeString))
            return NOTEMPTY;
        if ("contains".equals(codeString))
            return CONTAINS;
        if ("notContains".equals(codeString))
            return NOTCONTAINS;
        throw new FHIRException("Unknown AssertionOperatorType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case EQUALS:
                return "equals";
            case NOTEQUALS:
                return "notEquals";
            case IN:
                return "in";
            case NOTIN:
                return "notIn";
            case GREATERTHAN:
                return "greaterThan";
            case LESSTHAN:
                return "lessThan";
            case EMPTY:
                return "empty";
            case NOTEMPTY:
                return "notEmpty";
            case CONTAINS:
                return "contains";
            case NOTCONTAINS:
                return "notContains";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case EQUALS:
                return "http://hl7.org/fhir/assert-operator-codes";
            case NOTEQUALS:
                return "http://hl7.org/fhir/assert-operator-codes";
            case IN:
                return "http://hl7.org/fhir/assert-operator-codes";
            case NOTIN:
                return "http://hl7.org/fhir/assert-operator-codes";
            case GREATERTHAN:
                return "http://hl7.org/fhir/assert-operator-codes";
            case LESSTHAN:
                return "http://hl7.org/fhir/assert-operator-codes";
            case EMPTY:
                return "http://hl7.org/fhir/assert-operator-codes";
            case NOTEMPTY:
                return "http://hl7.org/fhir/assert-operator-codes";
            case CONTAINS:
                return "http://hl7.org/fhir/assert-operator-codes";
            case NOTCONTAINS:
                return "http://hl7.org/fhir/assert-operator-codes";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case EQUALS:
                return "Default value. Equals comparison.";
            case NOTEQUALS:
                return "Not equals comparison.";
            case IN:
                return "Compare value within a known set of values.";
            case NOTIN:
                return "Compare value not within a known set of values.";
            case GREATERTHAN:
                return "Compare value to be greater than a known value.";
            case LESSTHAN:
                return "Compare value to be less than a known value.";
            case EMPTY:
                return "Compare value is empty.";
            case NOTEMPTY:
                return "Compare value is not empty.";
            case CONTAINS:
                return "Compare value string contains a known value.";
            case NOTCONTAINS:
                return "Compare value string does not contain a known value.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case EQUALS:
                return "equals";
            case NOTEQUALS:
                return "notEquals";
            case IN:
                return "in";
            case NOTIN:
                return "notIn";
            case GREATERTHAN:
                return "greaterThan";
            case LESSTHAN:
                return "lessThan";
            case EMPTY:
                return "empty";
            case NOTEMPTY:
                return "notEmpty";
            case CONTAINS:
                return "contains";
            case NOTCONTAINS:
                return "notContains";
            default:
                return "?";
        }
    }
}
