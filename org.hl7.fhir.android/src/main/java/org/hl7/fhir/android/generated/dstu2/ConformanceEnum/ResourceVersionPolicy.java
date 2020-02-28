package org.hl7.fhir.android.generated.dstu2.ConformanceEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum ResourceVersionPolicy {

    /**
     * VersionId meta-property is not supported (server) or used (client).
     */
    NOVERSION,
    /**
     * VersionId meta-property is supported (server) or used (client).
     */
    VERSIONED,
    /**
     * VersionId is must be correct for updates (server) or will be specified (If-match header) for updates (client).
     */
    VERSIONEDUPDATE,
    /**
     * added to help the parsers
     */
    NULL;

    public static ResourceVersionPolicy fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("no-version".equals(codeString))
            return NOVERSION;
        if ("versioned".equals(codeString))
            return VERSIONED;
        if ("versioned-update".equals(codeString))
            return VERSIONEDUPDATE;
        throw new FHIRException("Unknown ResourceVersionPolicy code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case NOVERSION:
                return "no-version";
            case VERSIONED:
                return "versioned";
            case VERSIONEDUPDATE:
                return "versioned-update";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case NOVERSION:
                return "http://hl7.org/fhir/versioning-policy";
            case VERSIONED:
                return "http://hl7.org/fhir/versioning-policy";
            case VERSIONEDUPDATE:
                return "http://hl7.org/fhir/versioning-policy";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case NOVERSION:
                return "VersionId meta-property is not supported (server) or used (client).";
            case VERSIONED:
                return "VersionId meta-property is supported (server) or used (client).";
            case VERSIONEDUPDATE:
                return "VersionId is must be correct for updates (server) or will be specified (If-match header) for updates (client).";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case NOVERSION:
                return "No VersionId Support";
            case VERSIONED:
                return "Versioned";
            case VERSIONEDUPDATE:
                return "VersionId tracked fully";
            default:
                return "?";
        }
    }
}
