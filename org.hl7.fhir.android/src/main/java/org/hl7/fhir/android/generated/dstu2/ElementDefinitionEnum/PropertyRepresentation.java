package org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum PropertyRepresentation {

    /**
     * In XML, this property is represented as an attribute not an element.
     */
    XMLATTR,
    /**
     * added to help the parsers
     */
    NULL;

    public static PropertyRepresentation fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("xmlAttr".equals(codeString))
            return XMLATTR;
        throw new FHIRException("Unknown PropertyRepresentation code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case XMLATTR:
                return "xmlAttr";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case XMLATTR:
                return "http://hl7.org/fhir/property-representation";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case XMLATTR:
                return "In XML, this property is represented as an attribute not an element.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case XMLATTR:
                return "XML Attribute";
            default:
                return "?";
        }
    }
}
