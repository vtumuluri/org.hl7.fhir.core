package org.hl7.fhir.android.generated.dstu2.EncounterEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum EncounterClass {

    /**
     * An encounter during which the patient is hospitalized and stays overnight.
     */
    INPATIENT,
    /**
     * An encounter during which the patient is not hospitalized overnight.
     */
    OUTPATIENT,
    /**
     * An encounter where the patient visits the practitioner in his/her office, e.g. a G.P. visit.
     */
    AMBULATORY,
    /**
     * An encounter in the Emergency Care Department.
     */
    EMERGENCY,
    /**
     * An encounter where the practitioner visits the patient at his/her home.
     */
    HOME,
    /**
     * An encounter taking place outside the regular environment for giving care.
     */
    FIELD,
    /**
     * An encounter where the patient needs more prolonged treatment or investigations than outpatients, but who do not need to stay in the hospital overnight.
     */
    DAYTIME,
    /**
     * An encounter that takes place where the patient and practitioner do not physically meet but use electronic means for contact.
     */
    VIRTUAL,
    /**
     * Any other encounter type that is not described by one of the other values. Where this is used it is expected that an implementer will include an extension value to define what the actual other type is.
     */
    OTHER,
    /**
     * added to help the parsers
     */
    NULL;

    public static EncounterClass fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("inpatient".equals(codeString))
            return INPATIENT;
        if ("outpatient".equals(codeString))
            return OUTPATIENT;
        if ("ambulatory".equals(codeString))
            return AMBULATORY;
        if ("emergency".equals(codeString))
            return EMERGENCY;
        if ("home".equals(codeString))
            return HOME;
        if ("field".equals(codeString))
            return FIELD;
        if ("daytime".equals(codeString))
            return DAYTIME;
        if ("virtual".equals(codeString))
            return VIRTUAL;
        if ("other".equals(codeString))
            return OTHER;
        throw new FHIRException("Unknown EncounterClass code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case INPATIENT:
                return "inpatient";
            case OUTPATIENT:
                return "outpatient";
            case AMBULATORY:
                return "ambulatory";
            case EMERGENCY:
                return "emergency";
            case HOME:
                return "home";
            case FIELD:
                return "field";
            case DAYTIME:
                return "daytime";
            case VIRTUAL:
                return "virtual";
            case OTHER:
                return "other";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case INPATIENT:
                return "http://hl7.org/fhir/encounter-class";
            case OUTPATIENT:
                return "http://hl7.org/fhir/encounter-class";
            case AMBULATORY:
                return "http://hl7.org/fhir/encounter-class";
            case EMERGENCY:
                return "http://hl7.org/fhir/encounter-class";
            case HOME:
                return "http://hl7.org/fhir/encounter-class";
            case FIELD:
                return "http://hl7.org/fhir/encounter-class";
            case DAYTIME:
                return "http://hl7.org/fhir/encounter-class";
            case VIRTUAL:
                return "http://hl7.org/fhir/encounter-class";
            case OTHER:
                return "http://hl7.org/fhir/encounter-class";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case INPATIENT:
                return "An encounter during which the patient is hospitalized and stays overnight.";
            case OUTPATIENT:
                return "An encounter during which the patient is not hospitalized overnight.";
            case AMBULATORY:
                return "An encounter where the patient visits the practitioner in his/her office, e.g. a G.P. visit.";
            case EMERGENCY:
                return "An encounter in the Emergency Care Department.";
            case HOME:
                return "An encounter where the practitioner visits the patient at his/her home.";
            case FIELD:
                return "An encounter taking place outside the regular environment for giving care.";
            case DAYTIME:
                return "An encounter where the patient needs more prolonged treatment or investigations than outpatients, but who do not need to stay in the hospital overnight.";
            case VIRTUAL:
                return "An encounter that takes place where the patient and practitioner do not physically meet but use electronic means for contact.";
            case OTHER:
                return "Any other encounter type that is not described by one of the other values. Where this is used it is expected that an implementer will include an extension value to define what the actual other type is.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case INPATIENT:
                return "Inpatient";
            case OUTPATIENT:
                return "Outpatient";
            case AMBULATORY:
                return "Ambulatory";
            case EMERGENCY:
                return "Emergency";
            case HOME:
                return "Home";
            case FIELD:
                return "Field";
            case DAYTIME:
                return "Daytime";
            case VIRTUAL:
                return "Virtual";
            case OTHER:
                return "Other";
            default:
                return "?";
        }
    }
}
