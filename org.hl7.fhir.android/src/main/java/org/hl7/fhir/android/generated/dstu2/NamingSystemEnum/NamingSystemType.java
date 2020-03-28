package org.hl7.fhir.android.generated.dstu2.NamingSystemEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemIdentifierTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemIdentifierType;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemType;

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
