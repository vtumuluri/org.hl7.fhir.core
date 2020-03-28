package org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuidePageKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuidePageKind;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideDependencyTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideDependencyType;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideResourcePurposeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideResourcePurpose;

public enum GuideResourcePurpose {

    /**
     * The resource is intended as an example.
     */
    EXAMPLE,
    /**
     * The resource defines a value set or concept map used in the implementation guide.
     */
    TERMINOLOGY,
    /**
     * The resource defines a profile (StructureDefinition) that is used in the implementation guide.
     */
    PROFILE,
    /**
     * The resource defines an extension (StructureDefinition) that is used in the implementation guide.
     */
    EXTENSION,
    /**
     * The resource contains a dictionary that is part of the implementation guide.
     */
    DICTIONARY,
    /**
     * The resource defines a logical model (in a StructureDefinition) that is used in the implementation guide.
     */
    LOGICAL,
    /**
     * added to help the parsers
     */
    NULL;

    public static GuideResourcePurpose fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("example".equals(codeString))
            return EXAMPLE;
        if ("terminology".equals(codeString))
            return TERMINOLOGY;
        if ("profile".equals(codeString))
            return PROFILE;
        if ("extension".equals(codeString))
            return EXTENSION;
        if ("dictionary".equals(codeString))
            return DICTIONARY;
        if ("logical".equals(codeString))
            return LOGICAL;
        throw new FHIRException("Unknown GuideResourcePurpose code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case EXAMPLE:
                return "example";
            case TERMINOLOGY:
                return "terminology";
            case PROFILE:
                return "profile";
            case EXTENSION:
                return "extension";
            case DICTIONARY:
                return "dictionary";
            case LOGICAL:
                return "logical";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case EXAMPLE:
                return "http://hl7.org/fhir/guide-resource-purpose";
            case TERMINOLOGY:
                return "http://hl7.org/fhir/guide-resource-purpose";
            case PROFILE:
                return "http://hl7.org/fhir/guide-resource-purpose";
            case EXTENSION:
                return "http://hl7.org/fhir/guide-resource-purpose";
            case DICTIONARY:
                return "http://hl7.org/fhir/guide-resource-purpose";
            case LOGICAL:
                return "http://hl7.org/fhir/guide-resource-purpose";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case EXAMPLE:
                return "The resource is intended as an example.";
            case TERMINOLOGY:
                return "The resource defines a value set or concept map used in the implementation guide.";
            case PROFILE:
                return "The resource defines a profile (StructureDefinition) that is used in the implementation guide.";
            case EXTENSION:
                return "The resource defines an extension (StructureDefinition) that is used in the implementation guide.";
            case DICTIONARY:
                return "The resource contains a dictionary that is part of the implementation guide.";
            case LOGICAL:
                return "The resource defines a logical model (in a StructureDefinition) that is used in the implementation guide.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case EXAMPLE:
                return "Example";
            case TERMINOLOGY:
                return "Terminology";
            case PROFILE:
                return "Profile";
            case EXTENSION:
                return "Extension";
            case DICTIONARY:
                return "Dictionary";
            case LOGICAL:
                return "Logical Model";
            default:
                return "?";
        }
    }
}
