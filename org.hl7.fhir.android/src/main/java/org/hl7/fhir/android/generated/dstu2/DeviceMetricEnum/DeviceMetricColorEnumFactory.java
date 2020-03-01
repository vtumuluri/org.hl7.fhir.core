package org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class DeviceMetricColorEnumFactory implements EnumFactory<DeviceMetricColor> {

    public DeviceMetricColor fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("black".equals(codeString))
            return DeviceMetricColor.BLACK;
        if ("red".equals(codeString))
            return DeviceMetricColor.RED;
        if ("green".equals(codeString))
            return DeviceMetricColor.GREEN;
        if ("yellow".equals(codeString))
            return DeviceMetricColor.YELLOW;
        if ("blue".equals(codeString))
            return DeviceMetricColor.BLUE;
        if ("magenta".equals(codeString))
            return DeviceMetricColor.MAGENTA;
        if ("cyan".equals(codeString))
            return DeviceMetricColor.CYAN;
        if ("white".equals(codeString))
            return DeviceMetricColor.WHITE;
        throw new IllegalArgumentException("Unknown DeviceMetricColor code '" + codeString + "'");
    }

    public Enumeration<DeviceMetricColor> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("black".equals(codeString))
            return new Enumeration<DeviceMetricColor>(this, DeviceMetricColor.BLACK);
        if ("red".equals(codeString))
            return new Enumeration<DeviceMetricColor>(this, DeviceMetricColor.RED);
        if ("green".equals(codeString))
            return new Enumeration<DeviceMetricColor>(this, DeviceMetricColor.GREEN);
        if ("yellow".equals(codeString))
            return new Enumeration<DeviceMetricColor>(this, DeviceMetricColor.YELLOW);
        if ("blue".equals(codeString))
            return new Enumeration<DeviceMetricColor>(this, DeviceMetricColor.BLUE);
        if ("magenta".equals(codeString))
            return new Enumeration<DeviceMetricColor>(this, DeviceMetricColor.MAGENTA);
        if ("cyan".equals(codeString))
            return new Enumeration<DeviceMetricColor>(this, DeviceMetricColor.CYAN);
        if ("white".equals(codeString))
            return new Enumeration<DeviceMetricColor>(this, DeviceMetricColor.WHITE);
        throw new FHIRException("Unknown DeviceMetricColor code '" + codeString + "'");
    }

    public String toCode(DeviceMetricColor code) {
        if (code == DeviceMetricColor.BLACK)
            return "black";
        if (code == DeviceMetricColor.RED)
            return "red";
        if (code == DeviceMetricColor.GREEN)
            return "green";
        if (code == DeviceMetricColor.YELLOW)
            return "yellow";
        if (code == DeviceMetricColor.BLUE)
            return "blue";
        if (code == DeviceMetricColor.MAGENTA)
            return "magenta";
        if (code == DeviceMetricColor.CYAN)
            return "cyan";
        if (code == DeviceMetricColor.WHITE)
            return "white";
        return "?";
    }
}
