package org.hl7.fhir.android.generated.dstu2.StructureDefinitionEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ExtensionContext {

    /**
     * The context is all elements matching a particular resource element path.
     */
    RESOURCE,
    /**
     * The context is all nodes matching a particular data type element path (root or repeating element) or all elements referencing a particular primitive data type (expressed as the datatype name).
     */
    DATATYPE,
    /**
     * The context is all nodes whose mapping to a specified reference model corresponds to a particular mapping structure.  The context identifies the mapping target. The mapping should clearly identify where such an extension could be used.
     */
    MAPPING,
    /**
     * The context is a particular extension from a particular profile, a uri that identifies the extension definition.
     */
    EXTENSION,
    /**
     * added to help the parsers
     */
    NULL;

    public static ExtensionContext fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("resource".equals(codeString))
            return RESOURCE;
        if ("datatype".equals(codeString))
            return DATATYPE;
        if ("mapping".equals(codeString))
            return MAPPING;
        if ("extension".equals(codeString))
            return EXTENSION;
        throw new FHIRException("Unknown ExtensionContext code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case RESOURCE:
                return "resource";
            case DATATYPE:
                return "datatype";
            case MAPPING:
                return "mapping";
            case EXTENSION:
                return "extension";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case RESOURCE:
                return "http://hl7.org/fhir/extension-context";
            case DATATYPE:
                return "http://hl7.org/fhir/extension-context";
            case MAPPING:
                return "http://hl7.org/fhir/extension-context";
            case EXTENSION:
                return "http://hl7.org/fhir/extension-context";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case RESOURCE:
                return "The context is all elements matching a particular resource element path.";
            case DATATYPE:
                return "The context is all nodes matching a particular data type element path (root or repeating element) or all elements referencing a particular primitive data type (expressed as the datatype name).";
            case MAPPING:
                return "The context is all nodes whose mapping to a specified reference model corresponds to a particular mapping structure.  The context identifies the mapping target. The mapping should clearly identify where such an extension could be used.";
            case EXTENSION:
                return "The context is a particular extension from a particular profile, a uri that identifies the extension definition.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case RESOURCE:
                return "Resource";
            case DATATYPE:
                return "Datatype";
            case MAPPING:
                return "Mapping";
            case EXTENSION:
                return "Extension";
            default:
                return "?";
        }
    }
}
