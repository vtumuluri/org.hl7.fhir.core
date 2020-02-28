package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.PatientEnum.LinkType;
import org.hl7.fhir.android.generated.dstu2.PatientEnum.LinkTypeEnumFactory;

public class PatientCommunicationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-EN" for England English.
     */
    protected CodeableConcept language;

    /**
     * Indicates whether or not the patient prefers this language (over other languages he masters up a certain level).
     */
    protected BooleanType preferred;

    private static final long serialVersionUID = 633792918L;

    /*
     * Constructor
     */
    public PatientCommunicationComponent() {
        super();
    }

    /*
     * Constructor
     */
    public PatientCommunicationComponent(CodeableConcept language) {
        super();
        this.language = language;
    }

    /**
     * @return {@link #language} (The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-EN" for England English.)
     */
    public CodeableConcept getLanguage() {
        if (this.language == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PatientCommunicationComponent.language");
            else if (Configuration.doAutoCreate())
                // cc
                this.language = new CodeableConcept();
        return this.language;
    }

    public boolean hasLanguage() {
        return this.language != null && !this.language.isEmpty();
    }

    /**
     * @param value {@link #language} (The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-EN" for England English.)
     */
    public PatientCommunicationComponent setLanguage(CodeableConcept value) {
        this.language = value;
        return this;
    }

    /**
     * @return {@link #preferred} (Indicates whether or not the patient prefers this language (over other languages he masters up a certain level).). This is the underlying object with id, value and extensions. The accessor "getPreferred" gives direct access to the value
     */
    public BooleanType getPreferredElement() {
        if (this.preferred == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PatientCommunicationComponent.preferred");
            else if (Configuration.doAutoCreate())
                // bb
                this.preferred = new BooleanType();
        return this.preferred;
    }

    public boolean hasPreferredElement() {
        return this.preferred != null && !this.preferred.isEmpty();
    }

    public boolean hasPreferred() {
        return this.preferred != null && !this.preferred.isEmpty();
    }

    /**
     * @param value {@link #preferred} (Indicates whether or not the patient prefers this language (over other languages he masters up a certain level).). This is the underlying object with id, value and extensions. The accessor "getPreferred" gives direct access to the value
     */
    public PatientCommunicationComponent setPreferredElement(BooleanType value) {
        this.preferred = value;
        return this;
    }

    /**
     * @return Indicates whether or not the patient prefers this language (over other languages he masters up a certain level).
     */
    public boolean getPreferred() {
        return this.preferred == null || this.preferred.isEmpty() ? false : this.preferred.getValue();
    }

    /**
     * @param value Indicates whether or not the patient prefers this language (over other languages he masters up a certain level).
     */
    public PatientCommunicationComponent setPreferred(boolean value) {
        if (this.preferred == null)
            this.preferred = new BooleanType();
        this.preferred.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("language", "CodeableConcept", "The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. \"en\" for English, or \"en-US\" for American English versus \"en-EN\" for England English.", 0, java.lang.Integer.MAX_VALUE, language));
        childrenList.add(new Property("preferred", "boolean", "Indicates whether or not the patient prefers this language (over other languages he masters up a certain level).", 0, java.lang.Integer.MAX_VALUE, preferred));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("language"))
            // CodeableConcept
            this.language = castToCodeableConcept(value);
        else if (name.equals("preferred"))
            // BooleanType
            this.preferred = castToBoolean(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("language")) {
            this.language = new CodeableConcept();
            return this.language;
        } else if (name.equals("preferred")) {
            throw new FHIRException("Cannot call addChild on a primitive type Patient.preferred");
        } else
            return super.addChild(name);
    }

    public PatientCommunicationComponent copy() {
        PatientCommunicationComponent dst = new PatientCommunicationComponent();
        copyValues(dst);
        dst.language = language == null ? null : language.copy();
        dst.preferred = preferred == null ? null : preferred.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof PatientCommunicationComponent))
            return false;
        PatientCommunicationComponent o = (PatientCommunicationComponent) other;
        return compareDeep(language, o.language, true) && compareDeep(preferred, o.preferred, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof PatientCommunicationComponent))
            return false;
        PatientCommunicationComponent o = (PatientCommunicationComponent) other;
        return compareValues(preferred, o.preferred, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (language == null || language.isEmpty()) && (preferred == null || preferred.isEmpty());
    }

    public String fhirType() {
        return "Patient.communication";
    }
}
