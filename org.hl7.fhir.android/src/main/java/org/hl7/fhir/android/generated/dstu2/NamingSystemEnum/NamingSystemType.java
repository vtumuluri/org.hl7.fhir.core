package org.hl7.fhir.android.generated.dstu2.NamingSystemEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum NamingSystemType {

    /**
     * The naming system is used to define concepts and symbols to represent those concepts; e.g. UCUM, LOINC, NDC code, local lab codes, etc.
     */
    CODESYSTEM,
    /**
     * The naming system is used to manage identifiers (e.g. license numbers, order numbers, etc.).
     */
    IDENTIFIER,
    /**
     * The naming system is used as the root for other identifiers and naming systems.
     */
    ROOT,
    /**
     * added to help the parsers
     */
    NULL;

    public static NamingSystemType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("codesystem".equals(codeString))
            return CODESYSTEM;
        if ("identifier".equals(codeString))
            return IDENTIFIER;
        if ("root".equals(codeString))
            return ROOT;
        throw new FHIRException("Unknown NamingSystemType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CODESYSTEM:
                return "codesystem";
            case IDENTIFIER:
                return "identifier";
            case ROOT:
                return "root";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CODESYSTEM:
                return "http://hl7.org/fhir/namingsystem-type";
            case IDENTIFIER:
                return "http://hl7.org/fhir/namingsystem-type";
            case ROOT:
                return "http://hl7.org/fhir/namingsystem-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CODESYSTEM:
                return "The naming system is used to define concepts and symbols to represent those concepts; e.g. UCUM, LOINC, NDC code, local lab codes, etc.";
            case IDENTIFIER:
                return "The naming system is used to manage identifiers (e.g. license numbers, order numbers, etc.).";
            case ROOT:
                return "The naming system is used as the root for other identifiers and naming systems.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CODESYSTEM:
                return "Code System";
            case IDENTIFIER:
                return "Identifier";
            case ROOT:
                return "Root";
            default:
                return "?";
        }
    }
}
