package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.MessageEventEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.MessageEvent;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AdministrativeGenderEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AdministrativeGender;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ResourceTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ResourceType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DocumentReferenceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DocumentReferenceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DataTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DataType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SpecialValuesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SpecialValues;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.FHIRDefinedTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.FHIRDefinedType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DataAbsentReasonEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DataAbsentReason;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrengthEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrength;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AgeUnitsEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AgeUnits;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConceptMapEquivalenceEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConceptMapEquivalence;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.RemittanceOutcomeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.RemittanceOutcome;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.NoteTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.NoteType;

public enum DataAbsentReason {

    /**
     * The value is not known.
     */
    UNKNOWN,
    /**
     * The source human does not know the value.
     */
    ASKED,
    /**
     * There is reason to expect (from the workflow) that the value may become known.
     */
    TEMP,
    /**
     * The workflow didn't lead to this value being known.
     */
    NOTASKED,
    /**
     * The information is not available due to security, privacy or related reasons.
     */
    MASKED,
    /**
     * The source system wasn't capable of supporting this element.
     */
    UNSUPPORTED,
    /**
     * The content of the data is represented in the resource narrative.
     */
    ASTEXT,
    /**
     * Some system or workflow process error means that the information is not available.
     */
    ERROR,
    /**
     * NaN, standing for not a number, is a numeric data type value representing an undefined or unrepresentable value.
     */
    NAN,
    /**
     * added to help the parsers
     */
    NULL;

    public static DataAbsentReason fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("unknown".equals(codeString))
            return UNKNOWN;
        if ("asked".equals(codeString))
            return ASKED;
        if ("temp".equals(codeString))
            return TEMP;
        if ("not-asked".equals(codeString))
            return NOTASKED;
        if ("masked".equals(codeString))
            return MASKED;
        if ("unsupported".equals(codeString))
            return UNSUPPORTED;
        if ("astext".equals(codeString))
            return ASTEXT;
        if ("error".equals(codeString))
            return ERROR;
        if ("NaN".equals(codeString))
            return NAN;
        throw new FHIRException("Unknown DataAbsentReason code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case UNKNOWN:
                return "unknown";
            case ASKED:
                return "asked";
            case TEMP:
                return "temp";
            case NOTASKED:
                return "not-asked";
            case MASKED:
                return "masked";
            case UNSUPPORTED:
                return "unsupported";
            case ASTEXT:
                return "astext";
            case ERROR:
                return "error";
            case NAN:
                return "NaN";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case UNKNOWN:
                return "http://hl7.org/fhir/data-absent-reason";
            case ASKED:
                return "http://hl7.org/fhir/data-absent-reason";
            case TEMP:
                return "http://hl7.org/fhir/data-absent-reason";
            case NOTASKED:
                return "http://hl7.org/fhir/data-absent-reason";
            case MASKED:
                return "http://hl7.org/fhir/data-absent-reason";
            case UNSUPPORTED:
                return "http://hl7.org/fhir/data-absent-reason";
            case ASTEXT:
                return "http://hl7.org/fhir/data-absent-reason";
            case ERROR:
                return "http://hl7.org/fhir/data-absent-reason";
            case NAN:
                return "http://hl7.org/fhir/data-absent-reason";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case UNKNOWN:
                return "The value is not known.";
            case ASKED:
                return "The source human does not know the value.";
            case TEMP:
                return "There is reason to expect (from the workflow) that the value may become known.";
            case NOTASKED:
                return "The workflow didn't lead to this value being known.";
            case MASKED:
                return "The information is not available due to security, privacy or related reasons.";
            case UNSUPPORTED:
                return "The source system wasn't capable of supporting this element.";
            case ASTEXT:
                return "The content of the data is represented in the resource narrative.";
            case ERROR:
                return "Some system or workflow process error means that the information is not available.";
            case NAN:
                return "NaN, standing for not a number, is a numeric data type value representing an undefined or unrepresentable value.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case UNKNOWN:
                return "Unknown";
            case ASKED:
                return "Asked";
            case TEMP:
                return "Temp";
            case NOTASKED:
                return "Not Asked";
            case MASKED:
                return "Masked";
            case UNSUPPORTED:
                return "Unsupported";
            case ASTEXT:
                return "As Text";
            case ERROR:
                return "Error";
            case NAN:
                return "Not a Number";
            default:
                return "?";
        }
    }
}
