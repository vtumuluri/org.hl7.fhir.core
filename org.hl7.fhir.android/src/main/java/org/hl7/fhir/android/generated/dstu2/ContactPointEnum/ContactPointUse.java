package org.hl7.fhir.android.generated.dstu2.ContactPointEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.List;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ContactPointEnum.ContactPointUseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ContactPointEnum.ContactPointUse;
import org.hl7.fhir.android.generated.dstu2.ContactPointEnum.ContactPointSystemEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ContactPointEnum.ContactPointSystem;

public enum ContactPointUse {

    /**
     * A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.
     */
    HOME,
    /**
     * An office contact point. First choice for business related contacts during business hours.
     */
    WORK,
    /**
     * A temporary contact point. The period can provide more detailed information.
     */
    TEMP,
    /**
     * This contact point is no longer in use (or was never correct, but retained for records).
     */
    OLD,
    /**
     * A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.
     */
    MOBILE,
    /**
     * added to help the parsers
     */
    NULL;

    public static ContactPointUse fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("home".equals(codeString))
            return HOME;
        if ("work".equals(codeString))
            return WORK;
        if ("temp".equals(codeString))
            return TEMP;
        if ("old".equals(codeString))
            return OLD;
        if ("mobile".equals(codeString))
            return MOBILE;
        throw new FHIRException("Unknown ContactPointUse code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case HOME:
                return "home";
            case WORK:
                return "work";
            case TEMP:
                return "temp";
            case OLD:
                return "old";
            case MOBILE:
                return "mobile";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case HOME:
                return "http://hl7.org/fhir/contact-point-use";
            case WORK:
                return "http://hl7.org/fhir/contact-point-use";
            case TEMP:
                return "http://hl7.org/fhir/contact-point-use";
            case OLD:
                return "http://hl7.org/fhir/contact-point-use";
            case MOBILE:
                return "http://hl7.org/fhir/contact-point-use";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case HOME:
                return "A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.";
            case WORK:
                return "An office contact point. First choice for business related contacts during business hours.";
            case TEMP:
                return "A temporary contact point. The period can provide more detailed information.";
            case OLD:
                return "This contact point is no longer in use (or was never correct, but retained for records).";
            case MOBILE:
                return "A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case HOME:
                return "Home";
            case WORK:
                return "Work";
            case TEMP:
                return "Temp";
            case OLD:
                return "Old";
            case MOBILE:
                return "Mobile";
            default:
                return "?";
        }
    }
}
