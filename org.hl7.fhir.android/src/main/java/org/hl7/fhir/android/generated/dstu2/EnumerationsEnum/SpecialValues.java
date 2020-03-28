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

public enum SpecialValues {

    /**
     * Boolean true.
     */
    TRUE,
    /**
     * Boolean false.
     */
    FALSE,
    /**
     * The content is greater than zero, but too small to be quantified.
     */
    TRACE,
    /**
     * The specific quantity is not known, but is known to be non-zero and is not specified because it makes up the bulk of the material.
     */
    SUFFICIENT,
    /**
     * The value is no longer available.
     */
    WITHDRAWN,
    /**
     * The are no known applicable values in this context.
     */
    NILKNOWN,
    /**
     * added to help the parsers
     */
    NULL;

    public static SpecialValues fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("true".equals(codeString))
            return TRUE;
        if ("false".equals(codeString))
            return FALSE;
        if ("trace".equals(codeString))
            return TRACE;
        if ("sufficient".equals(codeString))
            return SUFFICIENT;
        if ("withdrawn".equals(codeString))
            return WITHDRAWN;
        if ("nil-known".equals(codeString))
            return NILKNOWN;
        throw new FHIRException("Unknown SpecialValues code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case TRUE:
                return "true";
            case FALSE:
                return "false";
            case TRACE:
                return "trace";
            case SUFFICIENT:
                return "sufficient";
            case WITHDRAWN:
                return "withdrawn";
            case NILKNOWN:
                return "nil-known";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case TRUE:
                return "http://hl7.org/fhir/special-values";
            case FALSE:
                return "http://hl7.org/fhir/special-values";
            case TRACE:
                return "http://hl7.org/fhir/special-values";
            case SUFFICIENT:
                return "http://hl7.org/fhir/special-values";
            case WITHDRAWN:
                return "http://hl7.org/fhir/special-values";
            case NILKNOWN:
                return "http://hl7.org/fhir/special-values";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case TRUE:
                return "Boolean true.";
            case FALSE:
                return "Boolean false.";
            case TRACE:
                return "The content is greater than zero, but too small to be quantified.";
            case SUFFICIENT:
                return "The specific quantity is not known, but is known to be non-zero and is not specified because it makes up the bulk of the material.";
            case WITHDRAWN:
                return "The value is no longer available.";
            case NILKNOWN:
                return "The are no known applicable values in this context.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case TRUE:
                return "true";
            case FALSE:
                return "false";
            case TRACE:
                return "Trace Amount Detected";
            case SUFFICIENT:
                return "Sufficient Quantity";
            case WITHDRAWN:
                return "Value Withdrawn";
            case NILKNOWN:
                return "Nil Known";
            default:
                return "?";
        }
    }
}
