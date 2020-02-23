package org.hl7.fhir.android.generated.dstu2.EncounterEnum;

import org.hl7.fhir.dstu2.model.Base;
import org.hl7.fhir.dstu2.model.EnumFactory;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class EncounterClassEnumFactory implements EnumFactory<EncounterClass> {

    public EncounterClass fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("inpatient".equals(codeString))
            return EncounterClass.INPATIENT;
        if ("outpatient".equals(codeString))
            return EncounterClass.OUTPATIENT;
        if ("ambulatory".equals(codeString))
            return EncounterClass.AMBULATORY;
        if ("emergency".equals(codeString))
            return EncounterClass.EMERGENCY;
        if ("home".equals(codeString))
            return EncounterClass.HOME;
        if ("field".equals(codeString))
            return EncounterClass.FIELD;
        if ("daytime".equals(codeString))
            return EncounterClass.DAYTIME;
        if ("virtual".equals(codeString))
            return EncounterClass.VIRTUAL;
        if ("other".equals(codeString))
            return EncounterClass.OTHER;
        throw new IllegalArgumentException("Unknown EncounterClass code '" + codeString + "'");
    }

    public Enumeration<EncounterClass> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("inpatient".equals(codeString))
            return new Enumeration<EncounterClass>(this, EncounterClass.INPATIENT);
        if ("outpatient".equals(codeString))
            return new Enumeration<EncounterClass>(this, EncounterClass.OUTPATIENT);
        if ("ambulatory".equals(codeString))
            return new Enumeration<EncounterClass>(this, EncounterClass.AMBULATORY);
        if ("emergency".equals(codeString))
            return new Enumeration<EncounterClass>(this, EncounterClass.EMERGENCY);
        if ("home".equals(codeString))
            return new Enumeration<EncounterClass>(this, EncounterClass.HOME);
        if ("field".equals(codeString))
            return new Enumeration<EncounterClass>(this, EncounterClass.FIELD);
        if ("daytime".equals(codeString))
            return new Enumeration<EncounterClass>(this, EncounterClass.DAYTIME);
        if ("virtual".equals(codeString))
            return new Enumeration<EncounterClass>(this, EncounterClass.VIRTUAL);
        if ("other".equals(codeString))
            return new Enumeration<EncounterClass>(this, EncounterClass.OTHER);
        throw new FHIRException("Unknown EncounterClass code '" + codeString + "'");
    }

    public String toCode(EncounterClass code) {
        if (code == EncounterClass.INPATIENT)
            return "inpatient";
        if (code == EncounterClass.OUTPATIENT)
            return "outpatient";
        if (code == EncounterClass.AMBULATORY)
            return "ambulatory";
        if (code == EncounterClass.EMERGENCY)
            return "emergency";
        if (code == EncounterClass.HOME)
            return "home";
        if (code == EncounterClass.FIELD)
            return "field";
        if (code == EncounterClass.DAYTIME)
            return "daytime";
        if (code == EncounterClass.VIRTUAL)
            return "virtual";
        if (code == EncounterClass.OTHER)
            return "other";
        return "?";
    }
}
