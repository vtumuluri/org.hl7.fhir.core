package org.hl7.fhir.android.generated.dstu2.StructureDefinitionEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum StructureDefinitionKind {

    /**
     * A data type - either a primitive or complex structure that defines a set of data elements. These can be used throughout Resource and extension definitions.
     */
    DATATYPE,
    /**
     * A resource defined by the FHIR specification.
     */
    RESOURCE,
    /**
     * A logical model - a conceptual package of data that will be mapped to resources for implementation.
     */
    LOGICAL,
    /**
     * added to help the parsers
     */
    NULL;

    public static StructureDefinitionKind fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("datatype".equals(codeString))
            return DATATYPE;
        if ("resource".equals(codeString))
            return RESOURCE;
        if ("logical".equals(codeString))
            return LOGICAL;
        throw new FHIRException("Unknown StructureDefinitionKind code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case DATATYPE:
                return "datatype";
            case RESOURCE:
                return "resource";
            case LOGICAL:
                return "logical";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case DATATYPE:
                return "http://hl7.org/fhir/structure-definition-kind";
            case RESOURCE:
                return "http://hl7.org/fhir/structure-definition-kind";
            case LOGICAL:
                return "http://hl7.org/fhir/structure-definition-kind";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case DATATYPE:
                return "A data type - either a primitive or complex structure that defines a set of data elements. These can be used throughout Resource and extension definitions.";
            case RESOURCE:
                return "A resource defined by the FHIR specification.";
            case LOGICAL:
                return "A logical model - a conceptual package of data that will be mapped to resources for implementation.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case DATATYPE:
                return "Data Type";
            case RESOURCE:
                return "Resource";
            case LOGICAL:
                return "Logical Model";
            default:
                return "?";
        }
    }
}
