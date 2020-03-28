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

public class PatientLinkComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The other patient resource that the link refers to.
     */
    protected Reference other;

    /**
     * The actual object that is the target of the reference (The other patient resource that the link refers to.)
     */
    protected Patient otherTarget;

    /**
     * The type of link between this patient resource and another patient resource.
     */
    protected Enumeration<LinkType> type;

    private static final long serialVersionUID = -1942104050L;

    /*
     * Constructor
     */
    public PatientLinkComponent() {
        super();
    }

    /*
     * Constructor
     */
    public PatientLinkComponent(Reference other, Enumeration<LinkType> type) {
        super();
        this.other = other;
        this.type = type;
    }

    /**
     * @return {@link #other} (The other patient resource that the link refers to.)
     */
    public Reference getOther() {
        if (this.other == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PatientLinkComponent.other");
            else if (Configuration.doAutoCreate())
                // cc
                this.other = new Reference();
        return this.other;
    }

    public boolean hasOther() {
        return this.other != null && !this.other.isEmpty();
    }

    /**
     * @param value {@link #other} (The other patient resource that the link refers to.)
     */
    public PatientLinkComponent setOther(Reference value) {
        this.other = value;
        return this;
    }

    /**
     * @return {@link #other} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The other patient resource that the link refers to.)
     */
    public Patient getOtherTarget() {
        if (this.otherTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PatientLinkComponent.other");
            else if (Configuration.doAutoCreate())
                // aa
                this.otherTarget = new Patient();
        return this.otherTarget;
    }

    /**
     * @param value {@link #other} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The other patient resource that the link refers to.)
     */
    public PatientLinkComponent setOtherTarget(Patient value) {
        this.otherTarget = value;
        return this;
    }

    /**
     * @return {@link #type} (The type of link between this patient resource and another patient resource.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<LinkType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PatientLinkComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<LinkType>(new LinkTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of link between this patient resource and another patient resource.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public PatientLinkComponent setTypeElement(Enumeration<LinkType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return The type of link between this patient resource and another patient resource.
     */
    public LinkType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The type of link between this patient resource and another patient resource.
     */
    public PatientLinkComponent setType(LinkType value) {
        if (this.type == null)
            this.type = new Enumeration<LinkType>(new LinkTypeEnumFactory());
        this.type.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("other", "Reference(Patient)", "The other patient resource that the link refers to.", 0, java.lang.Integer.MAX_VALUE, other));
        childrenList.add(new Property("type", "code", "The type of link between this patient resource and another patient resource.", 0, java.lang.Integer.MAX_VALUE, type));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("other"))
            // Reference
            this.other = castToReference(value);
        else if (name.equals("type"))
            // Enumeration<LinkType>
            this.type = new LinkTypeEnumFactory().fromType(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("other")) {
            this.other = new Reference();
            return this.other;
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Patient.type");
        } else
            return super.addChild(name);
    }

    public PatientLinkComponent copy() {
        PatientLinkComponent dst = new PatientLinkComponent();
        copyValues(dst);
        dst.other = other == null ? null : other.copy();
        dst.type = type == null ? null : type.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof PatientLinkComponent))
            return false;
        PatientLinkComponent o = (PatientLinkComponent) other;
        return compareDeep(other, o.other, true) && compareDeep(type, o.type, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof PatientLinkComponent))
            return false;
        PatientLinkComponent o = (PatientLinkComponent) other;
        return compareValues(type, o.type, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (other == null || other.isEmpty()) && (type == null || type.isEmpty());
    }

    public String fhirType() {
        return "Patient.link";
    }
}
