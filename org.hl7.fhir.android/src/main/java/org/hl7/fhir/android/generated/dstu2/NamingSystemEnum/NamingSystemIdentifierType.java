package org.hl7.fhir.android.generated.dstu2.NamingSystemEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum NamingSystemIdentifierType {

    /**
     * An ISO object identifier; e.g. 1.2.3.4.5.
     */
    OID,
    /**
     * A universally unique identifier of the form a5afddf4-e880-459b-876e-e4591b0acc11.
     */
    UUID,
    /**
     * A uniform resource identifier (ideally a URL - uniform resource locator); e.g. http://unitsofmeasure.org.
     */
    URI,
    /**
     * Some other type of unique identifier; e.g. HL7-assigned reserved string such as LN for LOINC.
     */
    OTHER,
    /**
     * added to help the parsers
     */
    NULL;

    public static NamingSystemIdentifierType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("oid".equals(codeString))
            return OID;
        if ("uuid".equals(codeString))
            return UUID;
        if ("uri".equals(codeString))
            return URI;
        if ("other".equals(codeString))
            return OTHER;
        throw new FHIRException("Unknown NamingSystemIdentifierType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case OID:
                return "oid";
            case UUID:
                return "uuid";
            case URI:
                return "uri";
            case OTHER:
                return "other";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case OID:
                return "http://hl7.org/fhir/namingsystem-identifier-type";
            case UUID:
                return "http://hl7.org/fhir/namingsystem-identifier-type";
            case URI:
                return "http://hl7.org/fhir/namingsystem-identifier-type";
            case OTHER:
                return "http://hl7.org/fhir/namingsystem-identifier-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case OID:
                return "An ISO object identifier; e.g. 1.2.3.4.5.";
            case UUID:
                return "A universally unique identifier of the form a5afddf4-e880-459b-876e-e4591b0acc11.";
            case URI:
                return "A uniform resource identifier (ideally a URL - uniform resource locator); e.g. http://unitsofmeasure.org.";
            case OTHER:
                return "Some other type of unique identifier; e.g. HL7-assigned reserved string such as LN for LOINC.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case OID:
                return "OID";
            case UUID:
                return "UUID";
            case URI:
                return "URI";
            case OTHER:
                return "Other";
            default:
                return "?";
        }
    }
}
