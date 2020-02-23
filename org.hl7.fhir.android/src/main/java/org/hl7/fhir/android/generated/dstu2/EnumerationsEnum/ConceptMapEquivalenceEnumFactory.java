package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class ConceptMapEquivalenceEnumFactory implements EnumFactory<ConceptMapEquivalence> {

    public ConceptMapEquivalence fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("equivalent".equals(codeString))
            return ConceptMapEquivalence.EQUIVALENT;
        if ("equal".equals(codeString))
            return ConceptMapEquivalence.EQUAL;
        if ("wider".equals(codeString))
            return ConceptMapEquivalence.WIDER;
        if ("subsumes".equals(codeString))
            return ConceptMapEquivalence.SUBSUMES;
        if ("narrower".equals(codeString))
            return ConceptMapEquivalence.NARROWER;
        if ("specializes".equals(codeString))
            return ConceptMapEquivalence.SPECIALIZES;
        if ("inexact".equals(codeString))
            return ConceptMapEquivalence.INEXACT;
        if ("unmatched".equals(codeString))
            return ConceptMapEquivalence.UNMATCHED;
        if ("disjoint".equals(codeString))
            return ConceptMapEquivalence.DISJOINT;
        throw new IllegalArgumentException("Unknown ConceptMapEquivalence code '" + codeString + "'");
    }

    public Enumeration<ConceptMapEquivalence> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("equivalent".equals(codeString))
            return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.EQUIVALENT);
        if ("equal".equals(codeString))
            return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.EQUAL);
        if ("wider".equals(codeString))
            return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.WIDER);
        if ("subsumes".equals(codeString))
            return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.SUBSUMES);
        if ("narrower".equals(codeString))
            return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.NARROWER);
        if ("specializes".equals(codeString))
            return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.SPECIALIZES);
        if ("inexact".equals(codeString))
            return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.INEXACT);
        if ("unmatched".equals(codeString))
            return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.UNMATCHED);
        if ("disjoint".equals(codeString))
            return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.DISJOINT);
        throw new FHIRException("Unknown ConceptMapEquivalence code '" + codeString + "'");
    }

    public String toCode(ConceptMapEquivalence code) {
        if (code == ConceptMapEquivalence.EQUIVALENT)
            return "equivalent";
        if (code == ConceptMapEquivalence.EQUAL)
            return "equal";
        if (code == ConceptMapEquivalence.WIDER)
            return "wider";
        if (code == ConceptMapEquivalence.SUBSUMES)
            return "subsumes";
        if (code == ConceptMapEquivalence.NARROWER)
            return "narrower";
        if (code == ConceptMapEquivalence.SPECIALIZES)
            return "specializes";
        if (code == ConceptMapEquivalence.INEXACT)
            return "inexact";
        if (code == ConceptMapEquivalence.UNMATCHED)
            return "unmatched";
        if (code == ConceptMapEquivalence.DISJOINT)
            return "disjoint";
        return "?";
    }
}
