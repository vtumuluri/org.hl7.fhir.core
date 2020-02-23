package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ConceptMapEquivalence {

    /**
     * The definitions of the concepts mean the same thing (including when structural implications of meaning are considered) (i.e. extensionally identical).
     */
    EQUIVALENT,
    /**
     * The definitions of the concepts are exactly the same (i.e. only grammatical differences) and structural implications of meaning are identical or irrelevant (i.e. intentionally identical).
     */
    EQUAL,
    /**
     * The target mapping is wider in meaning than the source concept.
     */
    WIDER,
    /**
     * The target mapping subsumes the meaning of the source concept (e.g. the source is-a target).
     */
    SUBSUMES,
    /**
     * The target mapping is narrower in meaning that the source concept. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.
     */
    NARROWER,
    /**
     * The target mapping specializes the meaning of the source concept (e.g. the target is-a source).
     */
    SPECIALIZES,
    /**
     * The target mapping overlaps with the source concept, but both source and target cover additional meaning, or the definitions are imprecise and it is uncertain whether they have the same boundaries to their meaning. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.
     */
    INEXACT,
    /**
     * There is no match for this concept in the destination concept system.
     */
    UNMATCHED,
    /**
     * This is an explicit assertion that there is no mapping between the source and target concept.
     */
    DISJOINT,
    /**
     * added to help the parsers
     */
    NULL;

    public static ConceptMapEquivalence fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("equivalent".equals(codeString))
            return EQUIVALENT;
        if ("equal".equals(codeString))
            return EQUAL;
        if ("wider".equals(codeString))
            return WIDER;
        if ("subsumes".equals(codeString))
            return SUBSUMES;
        if ("narrower".equals(codeString))
            return NARROWER;
        if ("specializes".equals(codeString))
            return SPECIALIZES;
        if ("inexact".equals(codeString))
            return INEXACT;
        if ("unmatched".equals(codeString))
            return UNMATCHED;
        if ("disjoint".equals(codeString))
            return DISJOINT;
        throw new FHIRException("Unknown ConceptMapEquivalence code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case EQUIVALENT:
                return "equivalent";
            case EQUAL:
                return "equal";
            case WIDER:
                return "wider";
            case SUBSUMES:
                return "subsumes";
            case NARROWER:
                return "narrower";
            case SPECIALIZES:
                return "specializes";
            case INEXACT:
                return "inexact";
            case UNMATCHED:
                return "unmatched";
            case DISJOINT:
                return "disjoint";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case EQUIVALENT:
                return "http://hl7.org/fhir/concept-map-equivalence";
            case EQUAL:
                return "http://hl7.org/fhir/concept-map-equivalence";
            case WIDER:
                return "http://hl7.org/fhir/concept-map-equivalence";
            case SUBSUMES:
                return "http://hl7.org/fhir/concept-map-equivalence";
            case NARROWER:
                return "http://hl7.org/fhir/concept-map-equivalence";
            case SPECIALIZES:
                return "http://hl7.org/fhir/concept-map-equivalence";
            case INEXACT:
                return "http://hl7.org/fhir/concept-map-equivalence";
            case UNMATCHED:
                return "http://hl7.org/fhir/concept-map-equivalence";
            case DISJOINT:
                return "http://hl7.org/fhir/concept-map-equivalence";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case EQUIVALENT:
                return "The definitions of the concepts mean the same thing (including when structural implications of meaning are considered) (i.e. extensionally identical).";
            case EQUAL:
                return "The definitions of the concepts are exactly the same (i.e. only grammatical differences) and structural implications of meaning are identical or irrelevant (i.e. intentionally identical).";
            case WIDER:
                return "The target mapping is wider in meaning than the source concept.";
            case SUBSUMES:
                return "The target mapping subsumes the meaning of the source concept (e.g. the source is-a target).";
            case NARROWER:
                return "The target mapping is narrower in meaning that the source concept. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.";
            case SPECIALIZES:
                return "The target mapping specializes the meaning of the source concept (e.g. the target is-a source).";
            case INEXACT:
                return "The target mapping overlaps with the source concept, but both source and target cover additional meaning, or the definitions are imprecise and it is uncertain whether they have the same boundaries to their meaning. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.";
            case UNMATCHED:
                return "There is no match for this concept in the destination concept system.";
            case DISJOINT:
                return "This is an explicit assertion that there is no mapping between the source and target concept.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case EQUIVALENT:
                return "Equivalent";
            case EQUAL:
                return "Equal";
            case WIDER:
                return "Wider";
            case SUBSUMES:
                return "Subsumes";
            case NARROWER:
                return "Narrower";
            case SPECIALIZES:
                return "Specializes";
            case INEXACT:
                return "Inexact";
            case UNMATCHED:
                return "Unmatched";
            case DISJOINT:
                return "Disjoint";
            default:
                return "?";
        }
    }
}
