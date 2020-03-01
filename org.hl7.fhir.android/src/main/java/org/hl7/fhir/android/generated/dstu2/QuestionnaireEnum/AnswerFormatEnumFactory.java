package org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AnswerFormatEnumFactory implements EnumFactory<AnswerFormat> {

    public AnswerFormat fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("boolean".equals(codeString))
            return AnswerFormat.BOOLEAN;
        if ("decimal".equals(codeString))
            return AnswerFormat.DECIMAL;
        if ("integer".equals(codeString))
            return AnswerFormat.INTEGER;
        if ("date".equals(codeString))
            return AnswerFormat.DATE;
        if ("dateTime".equals(codeString))
            return AnswerFormat.DATETIME;
        if ("instant".equals(codeString))
            return AnswerFormat.INSTANT;
        if ("time".equals(codeString))
            return AnswerFormat.TIME;
        if ("string".equals(codeString))
            return AnswerFormat.STRING;
        if ("text".equals(codeString))
            return AnswerFormat.TEXT;
        if ("url".equals(codeString))
            return AnswerFormat.URL;
        if ("choice".equals(codeString))
            return AnswerFormat.CHOICE;
        if ("open-choice".equals(codeString))
            return AnswerFormat.OPENCHOICE;
        if ("attachment".equals(codeString))
            return AnswerFormat.ATTACHMENT;
        if ("reference".equals(codeString))
            return AnswerFormat.REFERENCE;
        if ("quantity".equals(codeString))
            return AnswerFormat.QUANTITY;
        throw new IllegalArgumentException("Unknown AnswerFormat code '" + codeString + "'");
    }

    public Enumeration<AnswerFormat> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("boolean".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.BOOLEAN);
        if ("decimal".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.DECIMAL);
        if ("integer".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.INTEGER);
        if ("date".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.DATE);
        if ("dateTime".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.DATETIME);
        if ("instant".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.INSTANT);
        if ("time".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.TIME);
        if ("string".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.STRING);
        if ("text".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.TEXT);
        if ("url".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.URL);
        if ("choice".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.CHOICE);
        if ("open-choice".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.OPENCHOICE);
        if ("attachment".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.ATTACHMENT);
        if ("reference".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.REFERENCE);
        if ("quantity".equals(codeString))
            return new Enumeration<AnswerFormat>(this, AnswerFormat.QUANTITY);
        throw new FHIRException("Unknown AnswerFormat code '" + codeString + "'");
    }

    public String toCode(AnswerFormat code) {
        if (code == AnswerFormat.BOOLEAN)
            return "boolean";
        if (code == AnswerFormat.DECIMAL)
            return "decimal";
        if (code == AnswerFormat.INTEGER)
            return "integer";
        if (code == AnswerFormat.DATE)
            return "date";
        if (code == AnswerFormat.DATETIME)
            return "dateTime";
        if (code == AnswerFormat.INSTANT)
            return "instant";
        if (code == AnswerFormat.TIME)
            return "time";
        if (code == AnswerFormat.STRING)
            return "string";
        if (code == AnswerFormat.TEXT)
            return "text";
        if (code == AnswerFormat.URL)
            return "url";
        if (code == AnswerFormat.CHOICE)
            return "choice";
        if (code == AnswerFormat.OPENCHOICE)
            return "open-choice";
        if (code == AnswerFormat.ATTACHMENT)
            return "attachment";
        if (code == AnswerFormat.REFERENCE)
            return "reference";
        if (code == AnswerFormat.QUANTITY)
            return "quantity";
        return "?";
    }
}
