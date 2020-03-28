package org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.QuestionnaireStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.QuestionnaireStatus;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.AnswerFormatEnumFactory;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.AnswerFormat;

public enum AnswerFormat {

    /**
     * Answer is a yes/no answer.
     */
    BOOLEAN,
    /**
     * Answer is a floating point number.
     */
    DECIMAL,
    /**
     * Answer is an integer.
     */
    INTEGER,
    /**
     * Answer is a date.
     */
    DATE,
    /**
     * Answer is a date and time.
     */
    DATETIME,
    /**
     * Answer is a system timestamp.
     */
    INSTANT,
    /**
     * Answer is a time (hour/minute/second) independent of date.
     */
    TIME,
    /**
     * Answer is a short (few words to short sentence) free-text entry.
     */
    STRING,
    /**
     * Answer is a long (potentially multi-paragraph) free-text entry (still captured as a string).
     */
    TEXT,
    /**
     * Answer is a url (website, FTP site, etc.).
     */
    URL,
    /**
     * Answer is a Coding drawn from a list of options.
     */
    CHOICE,
    /**
     * Answer is a Coding drawn from a list of options or a free-text entry.
     */
    OPENCHOICE,
    /**
     * Answer is binary content such as a image, PDF, etc.
     */
    ATTACHMENT,
    /**
     * Answer is a reference to another resource (practitioner, organization, etc.).
     */
    REFERENCE,
    /**
     * Answer is a combination of a numeric value and unit, potentially with a comparator (<, >, etc.).
     */
    QUANTITY,
    /**
     * added to help the parsers
     */
    NULL;

    public static AnswerFormat fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("boolean".equals(codeString))
            return BOOLEAN;
        if ("decimal".equals(codeString))
            return DECIMAL;
        if ("integer".equals(codeString))
            return INTEGER;
        if ("date".equals(codeString))
            return DATE;
        if ("dateTime".equals(codeString))
            return DATETIME;
        if ("instant".equals(codeString))
            return INSTANT;
        if ("time".equals(codeString))
            return TIME;
        if ("string".equals(codeString))
            return STRING;
        if ("text".equals(codeString))
            return TEXT;
        if ("url".equals(codeString))
            return URL;
        if ("choice".equals(codeString))
            return CHOICE;
        if ("open-choice".equals(codeString))
            return OPENCHOICE;
        if ("attachment".equals(codeString))
            return ATTACHMENT;
        if ("reference".equals(codeString))
            return REFERENCE;
        if ("quantity".equals(codeString))
            return QUANTITY;
        throw new FHIRException("Unknown AnswerFormat code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case BOOLEAN:
                return "boolean";
            case DECIMAL:
                return "decimal";
            case INTEGER:
                return "integer";
            case DATE:
                return "date";
            case DATETIME:
                return "dateTime";
            case INSTANT:
                return "instant";
            case TIME:
                return "time";
            case STRING:
                return "string";
            case TEXT:
                return "text";
            case URL:
                return "url";
            case CHOICE:
                return "choice";
            case OPENCHOICE:
                return "open-choice";
            case ATTACHMENT:
                return "attachment";
            case REFERENCE:
                return "reference";
            case QUANTITY:
                return "quantity";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case BOOLEAN:
                return "http://hl7.org/fhir/answer-format";
            case DECIMAL:
                return "http://hl7.org/fhir/answer-format";
            case INTEGER:
                return "http://hl7.org/fhir/answer-format";
            case DATE:
                return "http://hl7.org/fhir/answer-format";
            case DATETIME:
                return "http://hl7.org/fhir/answer-format";
            case INSTANT:
                return "http://hl7.org/fhir/answer-format";
            case TIME:
                return "http://hl7.org/fhir/answer-format";
            case STRING:
                return "http://hl7.org/fhir/answer-format";
            case TEXT:
                return "http://hl7.org/fhir/answer-format";
            case URL:
                return "http://hl7.org/fhir/answer-format";
            case CHOICE:
                return "http://hl7.org/fhir/answer-format";
            case OPENCHOICE:
                return "http://hl7.org/fhir/answer-format";
            case ATTACHMENT:
                return "http://hl7.org/fhir/answer-format";
            case REFERENCE:
                return "http://hl7.org/fhir/answer-format";
            case QUANTITY:
                return "http://hl7.org/fhir/answer-format";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case BOOLEAN:
                return "Answer is a yes/no answer.";
            case DECIMAL:
                return "Answer is a floating point number.";
            case INTEGER:
                return "Answer is an integer.";
            case DATE:
                return "Answer is a date.";
            case DATETIME:
                return "Answer is a date and time.";
            case INSTANT:
                return "Answer is a system timestamp.";
            case TIME:
                return "Answer is a time (hour/minute/second) independent of date.";
            case STRING:
                return "Answer is a short (few words to short sentence) free-text entry.";
            case TEXT:
                return "Answer is a long (potentially multi-paragraph) free-text entry (still captured as a string).";
            case URL:
                return "Answer is a url (website, FTP site, etc.).";
            case CHOICE:
                return "Answer is a Coding drawn from a list of options.";
            case OPENCHOICE:
                return "Answer is a Coding drawn from a list of options or a free-text entry.";
            case ATTACHMENT:
                return "Answer is binary content such as a image, PDF, etc.";
            case REFERENCE:
                return "Answer is a reference to another resource (practitioner, organization, etc.).";
            case QUANTITY:
                return "Answer is a combination of a numeric value and unit, potentially with a comparator (<, >, etc.).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case BOOLEAN:
                return "Boolean";
            case DECIMAL:
                return "Decimal";
            case INTEGER:
                return "Integer";
            case DATE:
                return "Date";
            case DATETIME:
                return "Date Time";
            case INSTANT:
                return "Instant";
            case TIME:
                return "Time";
            case STRING:
                return "String";
            case TEXT:
                return "Text";
            case URL:
                return "Url";
            case CHOICE:
                return "Choice";
            case OPENCHOICE:
                return "Open Choice";
            case ATTACHMENT:
                return "Attachment";
            case REFERENCE:
                return "Reference";
            case QUANTITY:
                return "Quantity";
            default:
                return "?";
        }
    }
}
