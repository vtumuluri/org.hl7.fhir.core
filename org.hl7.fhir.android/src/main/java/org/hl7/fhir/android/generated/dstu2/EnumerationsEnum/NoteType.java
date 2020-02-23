package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;

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
