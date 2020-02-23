package org.hl7.fhir.android.generated.dstu2.HealthcareServiceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum DaysOfWeek {

    /**
     * Monday
     */
    MON,
    /**
     * Tuesday
     */
    TUE,
    /**
     * Wednesday
     */
    WED,
    /**
     * Thursday
     */
    THU,
    /**
     * Friday
     */
    FRI,
    /**
     * Saturday
     */
    SAT,
    /**
     * Sunday
     */
    SUN,
    /**
     * added to help the parsers
     */
    NULL;

    public static DaysOfWeek fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("mon".equals(codeString))
            return MON;
        if ("tue".equals(codeString))
            return TUE;
        if ("wed".equals(codeString))
            return WED;
        if ("thu".equals(codeString))
            return THU;
        if ("fri".equals(codeString))
            return FRI;
        if ("sat".equals(codeString))
            return SAT;
        if ("sun".equals(codeString))
            return SUN;
        throw new FHIRException("Unknown DaysOfWeek code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case MON:
                return "mon";
            case TUE:
                return "tue";
            case WED:
                return "wed";
            case THU:
                return "thu";
            case FRI:
                return "fri";
            case SAT:
                return "sat";
            case SUN:
                return "sun";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case MON:
                return "http://hl7.org/fhir/days-of-week";
            case TUE:
                return "http://hl7.org/fhir/days-of-week";
            case WED:
                return "http://hl7.org/fhir/days-of-week";
            case THU:
                return "http://hl7.org/fhir/days-of-week";
            case FRI:
                return "http://hl7.org/fhir/days-of-week";
            case SAT:
                return "http://hl7.org/fhir/days-of-week";
            case SUN:
                return "http://hl7.org/fhir/days-of-week";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case MON:
                return "Monday";
            case TUE:
                return "Tuesday";
            case WED:
                return "Wednesday";
            case THU:
                return "Thursday";
            case FRI:
                return "Friday";
            case SAT:
                return "Saturday";
            case SUN:
                return "Sunday";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case MON:
                return "Monday";
            case TUE:
                return "Tuesday";
            case WED:
                return "Wednesday";
            case THU:
                return "Thursday";
            case FRI:
                return "Friday";
            case SAT:
                return "Saturday";
            case SUN:
                return "Sunday";
            default:
                return "?";
        }
    }
}
