package org.hl7.fhir.android.generated.dstu2.DeviceComponentEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DeviceComponentEnum.MeasmntPrincipleEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceComponentEnum.MeasmntPrinciple;

public enum MeasmntPrinciple {

    /**
     * Measurement principle isn't in the list.
     */
    OTHER,
    /**
     * Measurement is done using the chemical principle.
     */
    CHEMICAL,
    /**
     * Measurement is done using the electrical principle.
     */
    ELECTRICAL,
    /**
     * Measurement is done using the impedance principle.
     */
    IMPEDANCE,
    /**
     * Measurement is done using the nuclear principle.
     */
    NUCLEAR,
    /**
     * Measurement is done using the optical principle.
     */
    OPTICAL,
    /**
     * Measurement is done using the thermal principle.
     */
    THERMAL,
    /**
     * Measurement is done using the biological principle.
     */
    BIOLOGICAL,
    /**
     * Measurement is done using the mechanical principle.
     */
    MECHANICAL,
    /**
     * Measurement is done using the acoustical principle.
     */
    ACOUSTICAL,
    /**
     * Measurement is done using the manual principle.
     */
    MANUAL,
    /**
     * added to help the parsers
     */
    NULL;

    public static MeasmntPrinciple fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("other".equals(codeString))
            return OTHER;
        if ("chemical".equals(codeString))
            return CHEMICAL;
        if ("electrical".equals(codeString))
            return ELECTRICAL;
        if ("impedance".equals(codeString))
            return IMPEDANCE;
        if ("nuclear".equals(codeString))
            return NUCLEAR;
        if ("optical".equals(codeString))
            return OPTICAL;
        if ("thermal".equals(codeString))
            return THERMAL;
        if ("biological".equals(codeString))
            return BIOLOGICAL;
        if ("mechanical".equals(codeString))
            return MECHANICAL;
        if ("acoustical".equals(codeString))
            return ACOUSTICAL;
        if ("manual".equals(codeString))
            return MANUAL;
        throw new FHIRException("Unknown MeasmntPrinciple code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case OTHER:
                return "other";
            case CHEMICAL:
                return "chemical";
            case ELECTRICAL:
                return "electrical";
            case IMPEDANCE:
                return "impedance";
            case NUCLEAR:
                return "nuclear";
            case OPTICAL:
                return "optical";
            case THERMAL:
                return "thermal";
            case BIOLOGICAL:
                return "biological";
            case MECHANICAL:
                return "mechanical";
            case ACOUSTICAL:
                return "acoustical";
            case MANUAL:
                return "manual";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case OTHER:
                return "http://hl7.org/fhir/measurement-principle";
            case CHEMICAL:
                return "http://hl7.org/fhir/measurement-principle";
            case ELECTRICAL:
                return "http://hl7.org/fhir/measurement-principle";
            case IMPEDANCE:
                return "http://hl7.org/fhir/measurement-principle";
            case NUCLEAR:
                return "http://hl7.org/fhir/measurement-principle";
            case OPTICAL:
                return "http://hl7.org/fhir/measurement-principle";
            case THERMAL:
                return "http://hl7.org/fhir/measurement-principle";
            case BIOLOGICAL:
                return "http://hl7.org/fhir/measurement-principle";
            case MECHANICAL:
                return "http://hl7.org/fhir/measurement-principle";
            case ACOUSTICAL:
                return "http://hl7.org/fhir/measurement-principle";
            case MANUAL:
                return "http://hl7.org/fhir/measurement-principle";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case OTHER:
                return "Measurement principle isn't in the list.";
            case CHEMICAL:
                return "Measurement is done using the chemical principle.";
            case ELECTRICAL:
                return "Measurement is done using the electrical principle.";
            case IMPEDANCE:
                return "Measurement is done using the impedance principle.";
            case NUCLEAR:
                return "Measurement is done using the nuclear principle.";
            case OPTICAL:
                return "Measurement is done using the optical principle.";
            case THERMAL:
                return "Measurement is done using the thermal principle.";
            case BIOLOGICAL:
                return "Measurement is done using the biological principle.";
            case MECHANICAL:
                return "Measurement is done using the mechanical principle.";
            case ACOUSTICAL:
                return "Measurement is done using the acoustical principle.";
            case MANUAL:
                return "Measurement is done using the manual principle.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case OTHER:
                return "MSP Other";
            case CHEMICAL:
                return "MSP Chemical";
            case ELECTRICAL:
                return "MSP Electrical";
            case IMPEDANCE:
                return "MSP Impedance";
            case NUCLEAR:
                return "MSP Nuclear";
            case OPTICAL:
                return "MSP Optical";
            case THERMAL:
                return "MSP Thermal";
            case BIOLOGICAL:
                return "MSP Biological";
            case MECHANICAL:
                return "MSP Mechanical";
            case ACOUSTICAL:
                return "MSP Acoustical";
            case MANUAL:
                return "MSP Manual";
            default:
                return "?";
        }
    }
}
