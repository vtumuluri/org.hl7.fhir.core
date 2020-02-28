package org.hl7.fhir.android.generated.dstu2.ProvenanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ProvenanceEntityRole {

    /**
     * A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a preexisting entity.
     */
    DERIVATION,
    /**
     * A derivation for which the resulting entity is a revised version of some original.
     */
    REVISION,
    /**
     * The repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author.
     */
    QUOTATION,
    /**
     * A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.
     */
    SOURCE,
    /**
     * added to help the parsers
     */
    NULL;

    public static ProvenanceEntityRole fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("derivation".equals(codeString))
            return DERIVATION;
        if ("revision".equals(codeString))
            return REVISION;
        if ("quotation".equals(codeString))
            return QUOTATION;
        if ("source".equals(codeString))
            return SOURCE;
        throw new FHIRException("Unknown ProvenanceEntityRole code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case DERIVATION:
                return "derivation";
            case REVISION:
                return "revision";
            case QUOTATION:
                return "quotation";
            case SOURCE:
                return "source";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case DERIVATION:
                return "http://hl7.org/fhir/provenance-entity-role";
            case REVISION:
                return "http://hl7.org/fhir/provenance-entity-role";
            case QUOTATION:
                return "http://hl7.org/fhir/provenance-entity-role";
            case SOURCE:
                return "http://hl7.org/fhir/provenance-entity-role";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case DERIVATION:
                return "A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a preexisting entity.";
            case REVISION:
                return "A derivation for which the resulting entity is a revised version of some original.";
            case QUOTATION:
                return "The repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author.";
            case SOURCE:
                return "A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case DERIVATION:
                return "Derivation";
            case REVISION:
                return "Revision";
            case QUOTATION:
                return "Quotation";
            case SOURCE:
                return "Source";
            default:
                return "?";
        }
    }
}
