package org.hl7.fhir.android.generated.dstu2.MediaEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum DigitalMediaType {

    /**
     * The media consists of one or more unmoving images, including photographs, computer-generated graphs and charts, and scanned documents
     */
    PHOTO,
    /**
     * The media consists of a series of frames that capture a moving image
     */
    VIDEO,
    /**
     * The media consists of a sound recording
     */
    AUDIO,
    /**
     * added to help the parsers
     */
    NULL;

    public static DigitalMediaType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("photo".equals(codeString))
            return PHOTO;
        if ("video".equals(codeString))
            return VIDEO;
        if ("audio".equals(codeString))
            return AUDIO;
        throw new FHIRException("Unknown DigitalMediaType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PHOTO:
                return "photo";
            case VIDEO:
                return "video";
            case AUDIO:
                return "audio";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PHOTO:
                return "http://hl7.org/fhir/digital-media-type";
            case VIDEO:
                return "http://hl7.org/fhir/digital-media-type";
            case AUDIO:
                return "http://hl7.org/fhir/digital-media-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PHOTO:
                return "The media consists of one or more unmoving images, including photographs, computer-generated graphs and charts, and scanned documents";
            case VIDEO:
                return "The media consists of a series of frames that capture a moving image";
            case AUDIO:
                return "The media consists of a sound recording";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PHOTO:
                return "Photo";
            case VIDEO:
                return "Video";
            case AUDIO:
                return "Audio";
            default:
                return "?";
        }
    }
}
