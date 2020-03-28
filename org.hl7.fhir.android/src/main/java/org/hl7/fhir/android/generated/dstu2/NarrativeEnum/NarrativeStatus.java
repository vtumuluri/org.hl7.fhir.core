package org.hl7.fhir.android.generated.dstu2.NarrativeEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.List;
import org.hl7.fhir.instance.model.api.INarrative;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.xhtml.XhtmlNode;
import org.hl7.fhir.android.generated.dstu2.NarrativeEnum.NarrativeStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.NarrativeEnum.NarrativeStatus;

public enum NarrativeStatus {

    /**
     * The contents of the narrative are entirely generated from the structured data in the content.
     */
    GENERATED,
    /**
     * The contents of the narrative are entirely generated from the structured data in the content and some of the content is generated from extensions
     */
    EXTENSIONS,
    /**
     * The contents of the narrative contain additional information not found in the structured data
     */
    ADDITIONAL,
    /**
     * The contents of the narrative are some equivalent of "No human-readable text provided in this case"
     */
    EMPTY,
    /**
     * added to help the parsers
     */
    NULL;

    public static NarrativeStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("generated".equals(codeString))
            return GENERATED;
        if ("extensions".equals(codeString))
            return EXTENSIONS;
        if ("additional".equals(codeString))
            return ADDITIONAL;
        if ("empty".equals(codeString))
            return EMPTY;
        throw new FHIRException("Unknown NarrativeStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case GENERATED:
                return "generated";
            case EXTENSIONS:
                return "extensions";
            case ADDITIONAL:
                return "additional";
            case EMPTY:
                return "empty";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case GENERATED:
                return "http://hl7.org/fhir/narrative-status";
            case EXTENSIONS:
                return "http://hl7.org/fhir/narrative-status";
            case ADDITIONAL:
                return "http://hl7.org/fhir/narrative-status";
            case EMPTY:
                return "http://hl7.org/fhir/narrative-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case GENERATED:
                return "The contents of the narrative are entirely generated from the structured data in the content.";
            case EXTENSIONS:
                return "The contents of the narrative are entirely generated from the structured data in the content and some of the content is generated from extensions";
            case ADDITIONAL:
                return "The contents of the narrative contain additional information not found in the structured data";
            case EMPTY:
                return "The contents of the narrative are some equivalent of \"No human-readable text provided in this case\"";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case GENERATED:
                return "Generated";
            case EXTENSIONS:
                return "Extensions";
            case ADDITIONAL:
                return "Additional";
            case EMPTY:
                return "Empty";
            default:
                return "?";
        }
    }
}
