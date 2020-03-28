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

public enum DocumentReferenceStatus {

    /**
     * This is the current reference for this document.
     */
    CURRENT,
    /**
     * This reference has been superseded by another reference.
     */
    SUPERSEDED,
    /**
     * This reference was created in error.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static DocumentReferenceStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("current".equals(codeString))
            return CURRENT;
        if ("superseded".equals(codeString))
            return SUPERSEDED;
        if ("entered-in-error".equals(codeString))
            return ENTEREDINERROR;
        throw new FHIRException("Unknown DocumentReferenceStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case CURRENT:
                return "current";
            case SUPERSEDED:
                return "superseded";
            case ENTEREDINERROR:
                return "entered-in-error";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case CURRENT:
                return "http://hl7.org/fhir/document-reference-status";
            case SUPERSEDED:
                return "http://hl7.org/fhir/document-reference-status";
            case ENTEREDINERROR:
                return "http://hl7.org/fhir/document-reference-status";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case CURRENT:
                return "This is the current reference for this document.";
            case SUPERSEDED:
                return "This reference has been superseded by another reference.";
            case ENTEREDINERROR:
                return "This reference was created in error.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case CURRENT:
                return "Current";
            case SUPERSEDED:
                return "Superseded";
            case ENTEREDINERROR:
                return "Entered in Error";
            default:
                return "?";
        }
    }
}
