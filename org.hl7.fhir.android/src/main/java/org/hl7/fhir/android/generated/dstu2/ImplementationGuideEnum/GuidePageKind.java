package org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum GuidePageKind {

    /**
     * This is a page of content that is included in the implementation guide. It has no particular function.
     */
    PAGE,
    /**
     * This is a page that represents a human readable rendering of an example.
     */
    EXAMPLE,
    /**
     * This is a page that represents a list of resources of one or more types.
     */
    LIST,
    /**
     * This is a page showing where an included guide is injected.
     */
    INCLUDE,
    /**
     * This is a page that lists the resources of a given type, and also creates pages for all the listed types as other pages in the section.
     */
    DIRECTORY,
    /**
     * This is a page that creates the listed resources as a dictionary.
     */
    DICTIONARY,
    /**
     * This is a generated page that contains the table of contents.
     */
    TOC,
    /**
     * This is a page that represents a presented resource. This is typically used for generated conformance resource presentations.
     */
    RESOURCE,
    /**
     * added to help the parsers
     */
    NULL;

    public static GuidePageKind fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("page".equals(codeString))
            return PAGE;
        if ("example".equals(codeString))
            return EXAMPLE;
        if ("list".equals(codeString))
            return LIST;
        if ("include".equals(codeString))
            return INCLUDE;
        if ("directory".equals(codeString))
            return DIRECTORY;
        if ("dictionary".equals(codeString))
            return DICTIONARY;
        if ("toc".equals(codeString))
            return TOC;
        if ("resource".equals(codeString))
            return RESOURCE;
        throw new FHIRException("Unknown GuidePageKind code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case PAGE:
                return "page";
            case EXAMPLE:
                return "example";
            case LIST:
                return "list";
            case INCLUDE:
                return "include";
            case DIRECTORY:
                return "directory";
            case DICTIONARY:
                return "dictionary";
            case TOC:
                return "toc";
            case RESOURCE:
                return "resource";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case PAGE:
                return "http://hl7.org/fhir/guide-page-kind";
            case EXAMPLE:
                return "http://hl7.org/fhir/guide-page-kind";
            case LIST:
                return "http://hl7.org/fhir/guide-page-kind";
            case INCLUDE:
                return "http://hl7.org/fhir/guide-page-kind";
            case DIRECTORY:
                return "http://hl7.org/fhir/guide-page-kind";
            case DICTIONARY:
                return "http://hl7.org/fhir/guide-page-kind";
            case TOC:
                return "http://hl7.org/fhir/guide-page-kind";
            case RESOURCE:
                return "http://hl7.org/fhir/guide-page-kind";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case PAGE:
                return "This is a page of content that is included in the implementation guide. It has no particular function.";
            case EXAMPLE:
                return "This is a page that represents a human readable rendering of an example.";
            case LIST:
                return "This is a page that represents a list of resources of one or more types.";
            case INCLUDE:
                return "This is a page showing where an included guide is injected.";
            case DIRECTORY:
                return "This is a page that lists the resources of a given type, and also creates pages for all the listed types as other pages in the section.";
            case DICTIONARY:
                return "This is a page that creates the listed resources as a dictionary.";
            case TOC:
                return "This is a generated page that contains the table of contents.";
            case RESOURCE:
                return "This is a page that represents a presented resource. This is typically used for generated conformance resource presentations.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case PAGE:
                return "Page";
            case EXAMPLE:
                return "Example";
            case LIST:
                return "List";
            case INCLUDE:
                return "Include";
            case DIRECTORY:
                return "Directory";
            case DICTIONARY:
                return "Dictionary";
            case TOC:
                return "Table Of Contents";
            case RESOURCE:
                return "Resource";
            default:
                return "?";
        }
    }
}
