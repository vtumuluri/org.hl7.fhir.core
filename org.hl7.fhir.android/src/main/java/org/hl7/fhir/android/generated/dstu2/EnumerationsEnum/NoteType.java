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

public enum NoteType {

    /**
     * Display the note.
     */
    DISPLAY,
    /**
     * Print the note on the form.
     */
    PRINT,
    /**
     * Print the note for the operator.
     */
    PRINTOPER,
    /**
     * added to help the parsers
     */
    NULL;

    public static NoteType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("display".equals(codeString))
            return DISPLAY;
        if ("print".equals(codeString))
            return PRINT;
        if ("printoper".equals(codeString))
            return PRINTOPER;
        throw new FHIRException("Unknown NoteType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case DISPLAY:
                return "display";
            case PRINT:
                return "print";
            case PRINTOPER:
                return "printoper";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case DISPLAY:
                return "http://hl7.org/fhir/note-type";
            case PRINT:
                return "http://hl7.org/fhir/note-type";
            case PRINTOPER:
                return "http://hl7.org/fhir/note-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case DISPLAY:
                return "Display the note.";
            case PRINT:
                return "Print the note on the form.";
            case PRINTOPER:
                return "Print the note for the operator.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case DISPLAY:
                return "Display";
            case PRINT:
                return "Print (Form)";
            case PRINTOPER:
                return "Print (Operator)";
            default:
                return "?";
        }
    }
}
