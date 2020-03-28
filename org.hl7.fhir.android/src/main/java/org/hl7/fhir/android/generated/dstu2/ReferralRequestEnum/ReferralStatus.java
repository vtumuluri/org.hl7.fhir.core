package org.hl7.fhir.android.generated.dstu2.ReferralRequestEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ReferralRequestEnum.ReferralStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ReferralRequestEnum.ReferralStatus;

public enum ReferralStatus {

    /**
     * A draft referral that has yet to be send.
     */
    DRAFT,
    /**
     * The referral has been transmitted, but not yet acknowledged by the recipient.
     */
    REQUESTED,
    /**
     * The referral has been acknowledged by the recipient, and is in the process of being actioned.
     */
    ACTIVE,
    /**
     * The referral has been cancelled without being completed. For example it is no longer needed.
     */
    CANCELLED,
    /**
     * The recipient has agreed to deliver the care requested by the referral.
     */
    ACCEPTED,
    /**
     * The recipient has declined to accept the referral.
     */
    REJECTED,
    /**
     * The referral has been completely actioned.
     */
    COMPLETED,
    /**
     * added to help the parsers
     */
    NULL;

    public static ReferralStatus fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("draft".equals(codeString))
            return DRAFT;
        if ("requested".equals(codeString))
            return REQUESTED;
        if ("active".equals(codeString))
            return ACTIVE;
        if ("cancelled".equals(codeString))
            return CANCELLED;
        if ("accepted".equals(codeString))
            return ACCEPTED;
        if ("rejected".equals(codeString))
            return REJECTED;
        if ("completed".equals(codeString))
            return COMPLETED;
        throw new FHIRException("Unknown ReferralStatus code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case DRAFT:
                return "draft";
            case REQUESTED:
                return "requested";
            case ACTIVE:
                return "active";
            case CANCELLED:
                return "cancelled";
            case ACCEPTED:
                return "accepted";
            case REJECTED:
                return "rejected";
            case COMPLETED:
                return "completed";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case DRAFT:
                return "http://hl7.org/fhir/referralstatus";
            case REQUESTED:
                return "http://hl7.org/fhir/referralstatus";
            case ACTIVE:
                return "http://hl7.org/fhir/referralstatus";
            case CANCELLED:
                return "http://hl7.org/fhir/referralstatus";
            case ACCEPTED:
                return "http://hl7.org/fhir/referralstatus";
            case REJECTED:
                return "http://hl7.org/fhir/referralstatus";
            case COMPLETED:
                return "http://hl7.org/fhir/referralstatus";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case DRAFT:
                return "A draft referral that has yet to be send.";
            case REQUESTED:
                return "The referral has been transmitted, but not yet acknowledged by the recipient.";
            case ACTIVE:
                return "The referral has been acknowledged by the recipient, and is in the process of being actioned.";
            case CANCELLED:
                return "The referral has been cancelled without being completed. For example it is no longer needed.";
            case ACCEPTED:
                return "The recipient has agreed to deliver the care requested by the referral.";
            case REJECTED:
                return "The recipient has declined to accept the referral.";
            case COMPLETED:
                return "The referral has been completely actioned.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case DRAFT:
                return "Draft";
            case REQUESTED:
                return "Requested";
            case ACTIVE:
                return "Active";
            case CANCELLED:
                return "Cancelled";
            case ACCEPTED:
                return "Accepted";
            case REJECTED:
                return "Rejected";
            case COMPLETED:
                return "Completed";
            default:
                return "?";
        }
    }
}
