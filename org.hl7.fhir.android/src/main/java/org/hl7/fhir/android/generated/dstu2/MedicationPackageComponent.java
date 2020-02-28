package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class MedicationPackageComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The kind of container that this package comes as.
     */
    protected CodeableConcept container;

    /**
     * A set of components that go to make up the described item.
     */
    protected List<MedicationPackageContentComponent> content;

    private static final long serialVersionUID = 503772472L;

    /*
     * Constructor
     */
    public MedicationPackageComponent() {
        super();
    }

    /**
     * @return {@link #container} (The kind of container that this package comes as.)
     */
    public CodeableConcept getContainer() {
        if (this.container == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationPackageComponent.container");
            else if (Configuration.doAutoCreate())
                // cc
                this.container = new CodeableConcept();
        return this.container;
    }

    public boolean hasContainer() {
        return this.container != null && !this.container.isEmpty();
    }

    /**
     * @param value {@link #container} (The kind of container that this package comes as.)
     */
    public MedicationPackageComponent setContainer(CodeableConcept value) {
        this.container = value;
        return this;
    }

    /**
     * @return {@link #content} (A set of components that go to make up the described item.)
     */
    public List<MedicationPackageContentComponent> getContent() {
        if (this.content == null)
            this.content = new ArrayList<MedicationPackageContentComponent>();
        return this.content;
    }

    public boolean hasContent() {
        if (this.content == null)
            return false;
        for (MedicationPackageContentComponent item : this.content) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public MedicationPackageContentComponent addContent() {
        // 3
        MedicationPackageContentComponent t = new MedicationPackageContentComponent();
        if (this.content == null)
            this.content = new ArrayList<MedicationPackageContentComponent>();
        this.content.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationPackageComponent addContent(MedicationPackageContentComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.content == null)
            this.content = new ArrayList<MedicationPackageContentComponent>();
        this.content.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("container", "CodeableConcept", "The kind of container that this package comes as.", 0, java.lang.Integer.MAX_VALUE, container));
        childrenList.add(new Property("content", "", "A set of components that go to make up the described item.", 0, java.lang.Integer.MAX_VALUE, content));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("container"))
            // CodeableConcept
            this.container = castToCodeableConcept(value);
        else if (name.equals("content"))
            this.getContent().add((MedicationPackageContentComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("container")) {
            this.container = new CodeableConcept();
            return this.container;
        } else if (name.equals("content")) {
            return addContent();
        } else
            return super.addChild(name);
    }

    public MedicationPackageComponent copy() {
        MedicationPackageComponent dst = new MedicationPackageComponent();
        copyValues(dst);
        dst.container = container == null ? null : container.copy();
        if (content != null) {
            dst.content = new ArrayList<MedicationPackageContentComponent>();
            for (MedicationPackageContentComponent i : content) dst.content.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationPackageComponent))
            return false;
        MedicationPackageComponent o = (MedicationPackageComponent) other;
        return compareDeep(container, o.container, true) && compareDeep(content, o.content, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationPackageComponent))
            return false;
        MedicationPackageComponent o = (MedicationPackageComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (container == null || container.isEmpty()) && (content == null || content.isEmpty());
    }

    public String fhirType() {
        return "Medication.package";
    }
}
