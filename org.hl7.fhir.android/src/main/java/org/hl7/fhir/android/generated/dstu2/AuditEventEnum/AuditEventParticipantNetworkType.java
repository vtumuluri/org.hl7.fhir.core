package org.hl7.fhir.android.generated.dstu2.AuditEventEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AuditEventParticipantNetworkType {

    /**
     * The machine name, including DNS name.
     */
    _1,
    /**
     * The assigned Internet Protocol (IP) address.
     */
    _2,
    /**
     * The assigned telephone number.
     */
    _3,
    /**
     * The assigned email address.
     */
    _4,
    /**
     * URI (User directory, HTTP-PUT, ftp, etc.).
     */
    _5,
    /**
     * added to help the parsers
     */
    NULL;

    public static AuditEventParticipantNetworkType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("1".equals(codeString))
            return _1;
        if ("2".equals(codeString))
            return _2;
        if ("3".equals(codeString))
            return _3;
        if ("4".equals(codeString))
            return _4;
        if ("5".equals(codeString))
            return _5;
        throw new FHIRException("Unknown AuditEventParticipantNetworkType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case _1:
                return "1";
            case _2:
                return "2";
            case _3:
                return "3";
            case _4:
                return "4";
            case _5:
                return "5";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case _1:
                return "http://hl7.org/fhir/network-type";
            case _2:
                return "http://hl7.org/fhir/network-type";
            case _3:
                return "http://hl7.org/fhir/network-type";
            case _4:
                return "http://hl7.org/fhir/network-type";
            case _5:
                return "http://hl7.org/fhir/network-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case _1:
                return "The machine name, including DNS name.";
            case _2:
                return "The assigned Internet Protocol (IP) address.";
            case _3:
                return "The assigned telephone number.";
            case _4:
                return "The assigned email address.";
            case _5:
                return "URI (User directory, HTTP-PUT, ftp, etc.).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case _1:
                return "Machine Name";
            case _2:
                return "IP Address";
            case _3:
                return "Telephone Number";
            case _4:
                return "Email address";
            case _5:
                return "URI";
            default:
                return "?";
        }
    }
}
