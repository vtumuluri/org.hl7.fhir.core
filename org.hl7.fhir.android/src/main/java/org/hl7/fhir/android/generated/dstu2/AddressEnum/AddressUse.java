package org.hl7.fhir.android.generated.dstu2.AddressEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AddressEnum.AddressTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AddressEnum.AddressType;
import org.hl7.fhir.android.generated.dstu2.AddressEnum.AddressUseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AddressEnum.AddressUse;

public enum AddressUse {

    /**
     * A communication address at a home.
     */
    HOME,
    /**
     * An office address. First choice for business related contacts during business hours.
     */
    WORK,
    /**
     * A temporary address. The period can provide more detailed information.
     */
    TEMP,
    /**
     * This address is no longer in use (or was never correct, but retained for records).
     */
    OLD,
    /**
     * added to help the parsers
     */
    NULL;

    public static AddressUse fromCode(String codeString) throws FHIRException {
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
        throw new FHIRException("Unknown AddressUse code '" + codeString + "'");
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
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case HOME:
                return "http://hl7.org/fhir/address-use";
            case WORK:
                return "http://hl7.org/fhir/address-use";
            case TEMP:
                return "http://hl7.org/fhir/address-use";
            case OLD:
                return "http://hl7.org/fhir/address-use";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case HOME:
                return "A communication address at a home.";
            case WORK:
                return "An office address. First choice for business related contacts during business hours.";
            case TEMP:
                return "A temporary address. The period can provide more detailed information.";
            case OLD:
                return "This address is no longer in use (or was never correct, but retained for records).";
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
                return "Temporary";
            case OLD:
                return "Old / Incorrect";
            default:
                return "?";
        }
    }
}
