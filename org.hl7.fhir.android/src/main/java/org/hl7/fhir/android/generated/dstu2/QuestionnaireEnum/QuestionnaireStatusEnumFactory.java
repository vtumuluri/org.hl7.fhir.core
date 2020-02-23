package org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class QuestionnaireStatusEnumFactory implements EnumFactory<QuestionnaireStatus> {

    public QuestionnaireStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
            return QuestionnaireStatus.DRAFT;
        if ("published".equals(codeString))
            return QuestionnaireStatus.PUBLISHED;
        if ("retired".equals(codeString))
            return QuestionnaireStatus.RETIRED;
        throw new IllegalArgumentException("Unknown QuestionnaireStatus code '" + codeString + "'");
    }

    public Enumeration<QuestionnaireStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("draft".equals(codeString))
            return new Enumeration<QuestionnaireStatus>(this, QuestionnaireStatus.DRAFT);
        if ("published".equals(codeString))
            return new Enumeration<QuestionnaireStatus>(this, QuestionnaireStatus.PUBLISHED);
        if ("retired".equals(codeString))
            return new Enumeration<QuestionnaireStatus>(this, QuestionnaireStatus.RETIRED);
        throw new FHIRException("Unknown QuestionnaireStatus code '" + codeString + "'");
    }

    public String toCode(QuestionnaireStatus code) {
        if (code == QuestionnaireStatus.DRAFT)
            return "draft";
        if (code == QuestionnaireStatus.PUBLISHED)
            return "published";
        if (code == QuestionnaireStatus.RETIRED)
            return "retired";
        return "?";
    }
}
