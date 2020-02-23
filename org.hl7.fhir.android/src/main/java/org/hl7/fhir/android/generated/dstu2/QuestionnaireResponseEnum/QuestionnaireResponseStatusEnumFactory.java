package org.hl7.fhir.android.generated.dstu2.QuestionnaireResponseEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class QuestionnaireResponseStatusEnumFactory implements EnumFactory<QuestionnaireResponseStatus> {

    public QuestionnaireResponseStatus fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
            return QuestionnaireResponseStatus.INPROGRESS;
        if ("completed".equals(codeString))
            return QuestionnaireResponseStatus.COMPLETED;
        if ("amended".equals(codeString))
            return QuestionnaireResponseStatus.AMENDED;
        throw new IllegalArgumentException("Unknown QuestionnaireResponseStatus code '" + codeString + "'");
    }

    public Enumeration<QuestionnaireResponseStatus> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("in-progress".equals(codeString))
            return new Enumeration<QuestionnaireResponseStatus>(this, QuestionnaireResponseStatus.INPROGRESS);
        if ("completed".equals(codeString))
            return new Enumeration<QuestionnaireResponseStatus>(this, QuestionnaireResponseStatus.COMPLETED);
        if ("amended".equals(codeString))
            return new Enumeration<QuestionnaireResponseStatus>(this, QuestionnaireResponseStatus.AMENDED);
        throw new FHIRException("Unknown QuestionnaireResponseStatus code '" + codeString + "'");
    }

    public String toCode(QuestionnaireResponseStatus code) {
        if (code == QuestionnaireResponseStatus.INPROGRESS)
            return "in-progress";
        if (code == QuestionnaireResponseStatus.COMPLETED)
            return "completed";
        if (code == QuestionnaireResponseStatus.AMENDED)
            return "amended";
        return "?";
    }
}
