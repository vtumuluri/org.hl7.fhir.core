package org.hl7.fhir.android.generated.dstu2.AuditEventEnum;

import org.hl7.fhir.android.generated.dstu2.Base;
import org.hl7.fhir.android.generated.dstu2.EnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumeration;
import org.hl7.fhir.android.generated.dstu2.PrimitiveType;
import org.hl7.fhir.exceptions.FHIRException;

public class AuditEventParticipantNetworkTypeEnumFactory implements EnumFactory<AuditEventParticipantNetworkType> {

    public AuditEventParticipantNetworkType fromCode(String codeString) throws IllegalArgumentException {
        if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("1".equals(codeString))
            return AuditEventParticipantNetworkType._1;
        if ("2".equals(codeString))
            return AuditEventParticipantNetworkType._2;
        if ("3".equals(codeString))
            return AuditEventParticipantNetworkType._3;
        if ("4".equals(codeString))
            return AuditEventParticipantNetworkType._4;
        if ("5".equals(codeString))
            return AuditEventParticipantNetworkType._5;
        throw new IllegalArgumentException("Unknown AuditEventParticipantNetworkType code '" + codeString + "'");
    }

    public Enumeration<AuditEventParticipantNetworkType> fromType(Base code) throws FHIRException {
        if (code == null || code.isEmpty())
            return null;
        String codeString = ((PrimitiveType) code).asStringValue();
        if (codeString == null || "".equals(codeString))
            return null;
        if ("1".equals(codeString))
            return new Enumeration<AuditEventParticipantNetworkType>(this, AuditEventParticipantNetworkType._1);
        if ("2".equals(codeString))
            return new Enumeration<AuditEventParticipantNetworkType>(this, AuditEventParticipantNetworkType._2);
        if ("3".equals(codeString))
            return new Enumeration<AuditEventParticipantNetworkType>(this, AuditEventParticipantNetworkType._3);
        if ("4".equals(codeString))
            return new Enumeration<AuditEventParticipantNetworkType>(this, AuditEventParticipantNetworkType._4);
        if ("5".equals(codeString))
            return new Enumeration<AuditEventParticipantNetworkType>(this, AuditEventParticipantNetworkType._5);
        throw new FHIRException("Unknown AuditEventParticipantNetworkType code '" + codeString + "'");
    }

    public String toCode(AuditEventParticipantNetworkType code) {
        if (code == AuditEventParticipantNetworkType._1)
            return "1";
        if (code == AuditEventParticipantNetworkType._2)
            return "2";
        if (code == AuditEventParticipantNetworkType._3)
            return "3";
        if (code == AuditEventParticipantNetworkType._4)
            return "4";
        if (code == AuditEventParticipantNetworkType._5)
            return "5";
        return "?";
    }
}
