package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AdministrativeGender;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.PatientEnum.LinkTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.PatientEnum.LinkType;

public class AnimalComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifies the high level taxonomic categorization of the kind of animal.
     */
    protected CodeableConcept species;

    /**
     * Identifies the detailed categorization of the kind of animal.
     */
    protected CodeableConcept breed;

    /**
     * Indicates the current state of the animal's reproductive organs.
     */
    protected CodeableConcept genderStatus;

    private static final long serialVersionUID = -549738382L;

    /*
     * Constructor
     */
    public AnimalComponent() {
        super();
    }

    /*
     * Constructor
     */
    public AnimalComponent(CodeableConcept species) {
        super();
        this.species = species;
    }

    /**
     * @return {@link #species} (Identifies the high level taxonomic categorization of the kind of animal.)
     */
    public CodeableConcept getSpecies() {
        if (this.species == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AnimalComponent.species");
            else if (Configuration.doAutoCreate())
                // cc
                this.species = new CodeableConcept();
        return this.species;
    }

    public boolean hasSpecies() {
        return this.species != null && !this.species.isEmpty();
    }

    /**
     * @param value {@link #species} (Identifies the high level taxonomic categorization of the kind of animal.)
     */
    public AnimalComponent setSpecies(CodeableConcept value) {
        this.species = value;
        return this;
    }

    /**
     * @return {@link #breed} (Identifies the detailed categorization of the kind of animal.)
     */
    public CodeableConcept getBreed() {
        if (this.breed == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AnimalComponent.breed");
            else if (Configuration.doAutoCreate())
                // cc
                this.breed = new CodeableConcept();
        return this.breed;
    }

    public boolean hasBreed() {
        return this.breed != null && !this.breed.isEmpty();
    }

    /**
     * @param value {@link #breed} (Identifies the detailed categorization of the kind of animal.)
     */
    public AnimalComponent setBreed(CodeableConcept value) {
        this.breed = value;
        return this;
    }

    /**
     * @return {@link #genderStatus} (Indicates the current state of the animal's reproductive organs.)
     */
    public CodeableConcept getGenderStatus() {
        if (this.genderStatus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AnimalComponent.genderStatus");
            else if (Configuration.doAutoCreate())
                // cc
                this.genderStatus = new CodeableConcept();
        return this.genderStatus;
    }

    public boolean hasGenderStatus() {
        return this.genderStatus != null && !this.genderStatus.isEmpty();
    }

    /**
     * @param value {@link #genderStatus} (Indicates the current state of the animal's reproductive organs.)
     */
    public AnimalComponent setGenderStatus(CodeableConcept value) {
        this.genderStatus = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("species", "CodeableConcept", "Identifies the high level taxonomic categorization of the kind of animal.", 0, java.lang.Integer.MAX_VALUE, species));
        childrenList.add(new Property("breed", "CodeableConcept", "Identifies the detailed categorization of the kind of animal.", 0, java.lang.Integer.MAX_VALUE, breed));
        childrenList.add(new Property("genderStatus", "CodeableConcept", "Indicates the current state of the animal's reproductive organs.", 0, java.lang.Integer.MAX_VALUE, genderStatus));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("species"))
            // CodeableConcept
            this.species = castToCodeableConcept(value);
        else if (name.equals("breed"))
            // CodeableConcept
            this.breed = castToCodeableConcept(value);
        else if (name.equals("genderStatus"))
            // CodeableConcept
            this.genderStatus = castToCodeableConcept(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("species")) {
            this.species = new CodeableConcept();
            return this.species;
        } else if (name.equals("breed")) {
            this.breed = new CodeableConcept();
            return this.breed;
        } else if (name.equals("genderStatus")) {
            this.genderStatus = new CodeableConcept();
            return this.genderStatus;
        } else
            return super.addChild(name);
    }

    public AnimalComponent copy() {
        AnimalComponent dst = new AnimalComponent();
        copyValues(dst);
        dst.species = species == null ? null : species.copy();
        dst.breed = breed == null ? null : breed.copy();
        dst.genderStatus = genderStatus == null ? null : genderStatus.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AnimalComponent))
            return false;
        AnimalComponent o = (AnimalComponent) other;
        return compareDeep(species, o.species, true) && compareDeep(breed, o.breed, true) && compareDeep(genderStatus, o.genderStatus, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AnimalComponent))
            return false;
        AnimalComponent o = (AnimalComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (species == null || species.isEmpty()) && (breed == null || breed.isEmpty()) && (genderStatus == null || genderStatus.isEmpty());
    }

    public String fhirType() {
        return "Patient.animal";
    }
}
