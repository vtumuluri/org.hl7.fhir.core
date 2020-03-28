package org.hl7.fhir.android.generated.dstu2.TimingEnum;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.UnitsOfTimeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.UnitsOfTime;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.EventTimingEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.EventTiming;

public enum UnitsOfTime {

    /**
     * null
     */
    S,
    /**
     * null
     */
    MIN,
    /**
     * null
     */
    H,
    /**
     * null
     */
    D,
    /**
     * null
     */
    WK,
    /**
     * null
     */
    MO,
    /**
     * null
     */
    A,
    /**
     * added to help the parsers
     */
    NULL;

    public static UnitsOfTime fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("s".equals(codeString))
            return S;
        if ("min".equals(codeString))
            return MIN;
        if ("h".equals(codeString))
            return H;
        if ("d".equals(codeString))
            return D;
        if ("wk".equals(codeString))
            return WK;
        if ("mo".equals(codeString))
            return MO;
        if ("a".equals(codeString))
            return A;
        throw new FHIRException("Unknown UnitsOfTime code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case S:
                return "s";
            case MIN:
                return "min";
            case H:
                return "h";
            case D:
                return "d";
            case WK:
                return "wk";
            case MO:
                return "mo";
            case A:
                return "a";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case S:
                return "http://unitsofmeasure.org";
            case MIN:
                return "http://unitsofmeasure.org";
            case H:
                return "http://unitsofmeasure.org";
            case D:
                return "http://unitsofmeasure.org";
            case WK:
                return "http://unitsofmeasure.org";
            case MO:
                return "http://unitsofmeasure.org";
            case A:
                return "http://unitsofmeasure.org";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case S:
                return "";
            case MIN:
                return "";
            case H:
                return "";
            case D:
                return "";
            case WK:
                return "";
            case MO:
                return "";
            case A:
                return "";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case S:
                return "s";
            case MIN:
                return "min";
            case H:
                return "h";
            case D:
                return "d";
            case WK:
                return "wk";
            case MO:
                return "mo";
            case A:
                return "a";
            default:
                return "?";
        }
    }
}
