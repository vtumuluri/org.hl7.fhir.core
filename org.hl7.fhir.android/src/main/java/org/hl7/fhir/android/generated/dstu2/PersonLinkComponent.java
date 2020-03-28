package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.AdministrativeGender;
import org.hl7.fhir.android.generated.dstu2.Enumerations.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.PersonEnum.IdentityAssuranceLevel;
import org.hl7.fhir.android.generated.dstu2.PersonEnum.IdentityAssuranceLevelEnumFactory;

public class PersonLinkComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The resource to which this actual person is associated.
     */
    protected Reference target;

    /**
     * The actual object that is the target of the reference (The resource to which this actual person is associated.)
     */
    protected Resource targetTarget;

    /**
     * Level of assurance that this link is actually associated with the target resource.
     */
    protected Enumeration<IdentityAssuranceLevel> assurance;

    private static final long serialVersionUID = 508763647L;

    /*
     * Constructor
     */
    public PersonLinkComponent() {
        super();
    }

    /*
     * Constructor
     */
    public PersonLinkComponent(Reference target) {
        super();
        this.target = target;
    }

    /**
     * @return {@link #target} (The resource to which this actual person is associated.)
     */
    public Reference getTarget() {
        if (this.target == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PersonLinkComponent.target");
            else if (Configuration.doAutoCreate())
                // cc
                this.target = new Reference();
        return this.target;
    }

    public boolean hasTarget() {
        return this.target != null && !this.target.isEmpty();
    }

    /**
     * @param value {@link #target} (The resource to which this actual person is associated.)
     */
    public PersonLinkComponent setTarget(Reference value) {
        this.target = value;
        return this;
    }

    /**
     * @return {@link #target} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The resource to which this actual person is associated.)
     */
    public Resource getTargetTarget() {
        return this.targetTarget;
    }

    /**
     * @param value {@link #target} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The resource to which this actual person is associated.)
     */
    public PersonLinkComponent setTargetTarget(Resource value) {
        this.targetTarget = value;
        return this;
    }

    /**
     * @return {@link #assurance} (Level of assurance that this link is actually associated with the target resource.). This is the underlying object with id, value and extensions. The accessor "getAssurance" gives direct access to the value
     */
    public Enumeration<IdentityAssuranceLevel> getAssuranceElement() {
        if (this.assurance == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PersonLinkComponent.assurance");
            else if (Configuration.doAutoCreate())
                // bb
                this.assurance = new Enumeration<IdentityAssuranceLevel>(new IdentityAssuranceLevelEnumFactory());
        return this.assurance;
    }

    public boolean hasAssuranceElement() {
        return this.assurance != null && !this.assurance.isEmpty();
    }

    public boolean hasAssurance() {
        return this.assurance != null && !this.assurance.isEmpty();
    }

    /**
     * @param value {@link #assurance} (Level of assurance that this link is actually associated with the target resource.). This is the underlying object with id, value and extensions. The accessor "getAssurance" gives direct access to the value
     */
    public PersonLinkComponent setAssuranceElement(Enumeration<IdentityAssuranceLevel> value) {
        this.assurance = value;
        return this;
    }

    /**
     * @return Level of assurance that this link is actually associated with the target resource.
     */
    public IdentityAssuranceLevel getAssurance() {
        return this.assurance == null ? null : this.assurance.getValue();
    }

    /**
     * @param value Level of assurance that this link is actually associated with the target resource.
     */
    public PersonLinkComponent setAssurance(IdentityAssuranceLevel value) {
        if (value == null)
            this.assurance = null;
        else {
            if (this.assurance == null)
                this.assurance = new Enumeration<IdentityAssuranceLevel>(new IdentityAssuranceLevelEnumFactory());
            this.assurance.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("target", "Reference(Patient|Practitioner|RelatedPerson|Person)", "The resource to which this actual person is associated.", 0, java.lang.Integer.MAX_VALUE, target));
        childrenList.add(new Property("assurance", "code", "Level of assurance that this link is actually associated with the target resource.", 0, java.lang.Integer.MAX_VALUE, assurance));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("target"))
            // Reference
            this.target = castToReference(value);
        else if (name.equals("assurance"))
            // Enumeration<IdentityAssuranceLevel>
            this.assurance = new IdentityAssuranceLevelEnumFactory().fromType(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("target")) {
            this.target = new Reference();
            return this.target;
        } else if (name.equals("assurance")) {
            throw new FHIRException("Cannot call addChild on a primitive type Person.assurance");
        } else
            return super.addChild(name);
    }

    public PersonLinkComponent copy() {
        PersonLinkComponent dst = new PersonLinkComponent();
        copyValues(dst);
        dst.target = target == null ? null : target.copy();
        dst.assurance = assurance == null ? null : assurance.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof PersonLinkComponent))
            return false;
        PersonLinkComponent o = (PersonLinkComponent) other;
        return compareDeep(target, o.target, true) && compareDeep(assurance, o.assurance, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof PersonLinkComponent))
            return false;
        PersonLinkComponent o = (PersonLinkComponent) other;
        return compareValues(assurance, o.assurance, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (target == null || target.isEmpty()) && (assurance == null || assurance.isEmpty());
    }

    public String fhirType() {
        return "Person.link";
    }
}
