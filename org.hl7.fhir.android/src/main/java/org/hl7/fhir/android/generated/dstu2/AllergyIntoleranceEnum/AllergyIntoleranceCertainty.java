package org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AllergyIntoleranceCertainty {

    /**
     * There is a low level of clinical certainty that the reaction was caused by the identified Substance.
     */
    UNLIKELY,
    /**
     * There is a high level of clinical certainty that the reaction was caused by the identified Substance.
     */
    LIKELY,
    /**
     * There is a very high level of clinical certainty that the reaction was due to the identified Substance, which may include clinical evidence by testing or rechallenge.
     */
    CONFIRMED,
    /**
     * added to help the parsers
     */
    NULL;

    public static AllergyIntoleranceCertainty fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("unlikely".equals(codeString))
            return UNLIKELY;
        if ("likely".equals(codeString))
            return LIKELY;
        if ("confirmed".equals(codeString))
            return CONFIRMED;
        throw new FHIRException("Unknown AllergyIntoleranceCertainty code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case UNLIKELY:
                return "unlikely";
            case LIKELY:
                return "likely";
            case CONFIRMED:
                return "confirmed";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case UNLIKELY:
                return "http://hl7.org/fhir/reaction-event-certainty";
            case LIKELY:
                return "http://hl7.org/fhir/reaction-event-certainty";
            case CONFIRMED:
                return "http://hl7.org/fhir/reaction-event-certainty";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case UNLIKELY:
                return "There is a low level of clinical certainty that the reaction was caused by the identified Substance.";
            case LIKELY:
                return "There is a high level of clinical certainty that the reaction was caused by the identified Substance.";
            case CONFIRMED:
                return "There is a very high level of clinical certainty that the reaction was due to the identified Substance, which may include clinical evidence by testing or rechallenge.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case UNLIKELY:
                return "Unlikely";
            case LIKELY:
                return "Likely";
            case CONFIRMED:
                return "Confirmed";
            default:
                return "?";
        }
    }
}
