package org.hl7.fhir.android.generated.dstu2.TimingEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum EventTiming {

    /**
     * null
     */
    HS,
    /**
     * null
     */
    WAKE,
    /**
     * null
     */
    C,
    /**
     * null
     */
    CM,
    /**
     * null
     */
    CD,
    /**
     * null
     */
    CV,
    /**
     * null
     */
    AC,
    /**
     * null
     */
    ACM,
    /**
     * null
     */
    ACD,
    /**
     * null
     */
    ACV,
    /**
     * null
     */
    PC,
    /**
     * null
     */
    PCM,
    /**
     * null
     */
    PCD,
    /**
     * null
     */
    PCV,
    /**
     * added to help the parsers
     */
    NULL;

    public static EventTiming fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("HS".equals(codeString))
            return HS;
        if ("WAKE".equals(codeString))
            return WAKE;
        if ("C".equals(codeString))
            return C;
        if ("CM".equals(codeString))
            return CM;
        if ("CD".equals(codeString))
            return CD;
        if ("CV".equals(codeString))
            return CV;
        if ("AC".equals(codeString))
            return AC;
        if ("ACM".equals(codeString))
            return ACM;
        if ("ACD".equals(codeString))
            return ACD;
        if ("ACV".equals(codeString))
            return ACV;
        if ("PC".equals(codeString))
            return PC;
        if ("PCM".equals(codeString))
            return PCM;
        if ("PCD".equals(codeString))
            return PCD;
        if ("PCV".equals(codeString))
            return PCV;
        throw new FHIRException("Unknown EventTiming code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case HS:
                return "HS";
            case WAKE:
                return "WAKE";
            case C:
                return "C";
            case CM:
                return "CM";
            case CD:
                return "CD";
            case CV:
                return "CV";
            case AC:
                return "AC";
            case ACM:
                return "ACM";
            case ACD:
                return "ACD";
            case ACV:
                return "ACV";
            case PC:
                return "PC";
            case PCM:
                return "PCM";
            case PCD:
                return "PCD";
            case PCV:
                return "PCV";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case HS:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case WAKE:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case C:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case CM:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case CD:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case CV:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case AC:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case ACM:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case ACD:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case ACV:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case PC:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case PCM:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case PCD:
                return "http://hl7.org/fhir/v3/TimingEvent";
            case PCV:
                return "http://hl7.org/fhir/v3/TimingEvent";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case HS:
                return "";
            case WAKE:
                return "";
            case C:
                return "";
            case CM:
                return "";
            case CD:
                return "";
            case CV:
                return "";
            case AC:
                return "";
            case ACM:
                return "";
            case ACD:
                return "";
            case ACV:
                return "";
            case PC:
                return "";
            case PCM:
                return "";
            case PCD:
                return "";
            case PCV:
                return "";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case HS:
                return "HS";
            case WAKE:
                return "WAKE";
            case C:
                return "C";
            case CM:
                return "CM";
            case CD:
                return "CD";
            case CV:
                return "CV";
            case AC:
                return "AC";
            case ACM:
                return "ACM";
            case ACD:
                return "ACD";
            case ACV:
                return "ACV";
            case PC:
                return "PC";
            case PCM:
                return "PCM";
            case PCD:
                return "PCD";
            case PCV:
                return "PCV";
            default:
                return "?";
        }
    }
}
