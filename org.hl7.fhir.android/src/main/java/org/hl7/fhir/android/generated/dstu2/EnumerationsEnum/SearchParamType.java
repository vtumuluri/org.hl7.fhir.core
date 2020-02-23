package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum SearchParamType {

    /**
     * Search parameter SHALL be a number (a whole number, or a decimal).
     */
    NUMBER,
    /**
     * Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.
     */
    DATE,
    /**
     * Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.
     */
    STRING,
    /**
     * Search parameter on a coded element or identifier. May be used to search through the text, displayname, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a "|", depending on the modifier used.
     */
    TOKEN,
    /**
     * A reference to another resource.
     */
    REFERENCE,
    /**
     * A composite search parameter that combines a search on two values together.
     */
    COMPOSITE,
    /**
     * A search parameter that searches on a quantity.
     */
    QUANTITY,
    /**
     * A search parameter that searches on a URI (RFC 3986).
     */
    URI,
    /**
     * added to help the parsers
     */
    NULL;

    public static SearchParamType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("number".equals(codeString))
            return NUMBER;
        if ("date".equals(codeString))
            return DATE;
        if ("string".equals(codeString))
            return STRING;
        if ("token".equals(codeString))
            return TOKEN;
        if ("reference".equals(codeString))
            return REFERENCE;
        if ("composite".equals(codeString))
            return COMPOSITE;
        if ("quantity".equals(codeString))
            return QUANTITY;
        if ("uri".equals(codeString))
            return URI;
        throw new FHIRException("Unknown SearchParamType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case NUMBER:
                return "number";
            case DATE:
                return "date";
            case STRING:
                return "string";
            case TOKEN:
                return "token";
            case REFERENCE:
                return "reference";
            case COMPOSITE:
                return "composite";
            case QUANTITY:
                return "quantity";
            case URI:
                return "uri";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case NUMBER:
                return "http://hl7.org/fhir/search-param-type";
            case DATE:
                return "http://hl7.org/fhir/search-param-type";
            case STRING:
                return "http://hl7.org/fhir/search-param-type";
            case TOKEN:
                return "http://hl7.org/fhir/search-param-type";
            case REFERENCE:
                return "http://hl7.org/fhir/search-param-type";
            case COMPOSITE:
                return "http://hl7.org/fhir/search-param-type";
            case QUANTITY:
                return "http://hl7.org/fhir/search-param-type";
            case URI:
                return "http://hl7.org/fhir/search-param-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case NUMBER:
                return "Search parameter SHALL be a number (a whole number, or a decimal).";
            case DATE:
                return "Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.";
            case STRING:
                return "Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.";
            case TOKEN:
                return "Search parameter on a coded element or identifier. May be used to search through the text, displayname, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a \"|\", depending on the modifier used.";
            case REFERENCE:
                return "A reference to another resource.";
            case COMPOSITE:
                return "A composite search parameter that combines a search on two values together.";
            case QUANTITY:
                return "A search parameter that searches on a quantity.";
            case URI:
                return "A search parameter that searches on a URI (RFC 3986).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case NUMBER:
                return "Number";
            case DATE:
                return "Date/DateTime";
            case STRING:
                return "String";
            case TOKEN:
                return "Token";
            case REFERENCE:
                return "Reference";
            case COMPOSITE:
                return "Composite";
            case QUANTITY:
                return "Quantity";
            case URI:
                return "URI";
            default:
                return "?";
        }
    }
}
