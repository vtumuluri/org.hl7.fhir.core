package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.SpecimenEnum.SpecimenStatus;
import org.hl7.fhir.android.generated.dstu2.SpecimenEnum.SpecimenStatusEnumFactory;

public class SpecimenContainerComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
     */
    protected List<Identifier> identifier;

    /**
     * Textual description of the container.
     */
    protected StringType description;

    /**
     * The type of container associated with the specimen (e.g. slide, aliquot, etc.).
     */
    protected CodeableConcept type;

    /**
     * The capacity (volume or other measure) the container may contain.
     */
    protected SimpleQuantity capacity;

    /**
     * The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.
     */
    protected SimpleQuantity specimenQuantity;

    /**
     * Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
     */
    protected Type additive;

    private static final long serialVersionUID = 187274879L;

    /*
     * Constructor
     */
    public SpecimenContainerComponent() {
        super();
    }

    /**
     * @return {@link #identifier} (Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.)
     */
    public List<Identifier> getIdentifier() {
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        if (this.identifier == null)
            return false;
        for (Identifier item : this.identifier) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Identifier addIdentifier() {
        // 3
        Identifier t = new Identifier();
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return t;
    }

    // syntactic sugar
    public SpecimenContainerComponent addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #description} (Textual description of the container.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenContainerComponent.description");
            else if (Configuration.doAutoCreate())
                // bb
                this.description = new StringType();
        return this.description;
    }

    public boolean hasDescriptionElement() {
        return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Textual description of the container.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public SpecimenContainerComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Textual description of the container.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Textual description of the container.
     */
    public SpecimenContainerComponent setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (The type of container associated with the specimen (e.g. slide, aliquot, etc.).)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenContainerComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of container associated with the specimen (e.g. slide, aliquot, etc.).)
     */
    public SpecimenContainerComponent setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #capacity} (The capacity (volume or other measure) the container may contain.)
     */
    public SimpleQuantity getCapacity() {
        if (this.capacity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenContainerComponent.capacity");
            else if (Configuration.doAutoCreate())
                // cc
                this.capacity = new SimpleQuantity();
        return this.capacity;
    }

    public boolean hasCapacity() {
        return this.capacity != null && !this.capacity.isEmpty();
    }

    /**
     * @param value {@link #capacity} (The capacity (volume or other measure) the container may contain.)
     */
    public SpecimenContainerComponent setCapacity(SimpleQuantity value) {
        this.capacity = value;
        return this;
    }

    /**
     * @return {@link #specimenQuantity} (The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.)
     */
    public SimpleQuantity getSpecimenQuantity() {
        if (this.specimenQuantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenContainerComponent.specimenQuantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.specimenQuantity = new SimpleQuantity();
        return this.specimenQuantity;
    }

    public boolean hasSpecimenQuantity() {
        return this.specimenQuantity != null && !this.specimenQuantity.isEmpty();
    }

    /**
     * @param value {@link #specimenQuantity} (The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.)
     */
    public SpecimenContainerComponent setSpecimenQuantity(SimpleQuantity value) {
        this.specimenQuantity = value;
        return this;
    }

    /**
     * @return {@link #additive} (Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.)
     */
    public Type getAdditive() {
        return this.additive;
    }

    /**
     * @return {@link #additive} (Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.)
     */
    public CodeableConcept getAdditiveCodeableConcept() throws FHIRException {
        if (!(this.additive instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.additive.getClass().getName() + " was encountered");
        return (CodeableConcept) this.additive;
    }

    public boolean hasAdditiveCodeableConcept() {
        return this.additive instanceof CodeableConcept;
    }

    /**
     * @return {@link #additive} (Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.)
     */
    public Reference getAdditiveReference() throws FHIRException {
        if (!(this.additive instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.additive.getClass().getName() + " was encountered");
        return (Reference) this.additive;
    }

    public boolean hasAdditiveReference() {
        return this.additive instanceof Reference;
    }

    public boolean hasAdditive() {
        return this.additive != null && !this.additive.isEmpty();
    }

    /**
     * @param value {@link #additive} (Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.)
     */
    public SpecimenContainerComponent setAdditive(Type value) {
        this.additive = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("description", "string", "Textual description of the container.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("type", "CodeableConcept", "The type of container associated with the specimen (e.g. slide, aliquot, etc.).", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("capacity", "SimpleQuantity", "The capacity (volume or other measure) the container may contain.", 0, java.lang.Integer.MAX_VALUE, capacity));
        childrenList.add(new Property("specimenQuantity", "SimpleQuantity", "The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.", 0, java.lang.Integer.MAX_VALUE, specimenQuantity));
        childrenList.add(new Property("additive[x]", "CodeableConcept|Reference(Substance)", "Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.", 0, java.lang.Integer.MAX_VALUE, additive));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("capacity"))
            // SimpleQuantity
            this.capacity = castToSimpleQuantity(value);
        else if (name.equals("specimenQuantity"))
            // SimpleQuantity
            this.specimenQuantity = castToSimpleQuantity(value);
        else if (name.equals("additive[x]"))
            // Type
            this.additive = (Type) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type Specimen.description");
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("capacity")) {
            this.capacity = new SimpleQuantity();
            return this.capacity;
        } else if (name.equals("specimenQuantity")) {
            this.specimenQuantity = new SimpleQuantity();
            return this.specimenQuantity;
        } else if (name.equals("additiveCodeableConcept")) {
            this.additive = new CodeableConcept();
            return this.additive;
        } else if (name.equals("additiveReference")) {
            this.additive = new Reference();
            return this.additive;
        } else
            return super.addChild(name);
    }

    public SpecimenContainerComponent copy() {
        SpecimenContainerComponent dst = new SpecimenContainerComponent();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.description = description == null ? null : description.copy();
        dst.type = type == null ? null : type.copy();
        dst.capacity = capacity == null ? null : capacity.copy();
        dst.specimenQuantity = specimenQuantity == null ? null : specimenQuantity.copy();
        dst.additive = additive == null ? null : additive.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SpecimenContainerComponent))
            return false;
        SpecimenContainerComponent o = (SpecimenContainerComponent) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(description, o.description, true) && compareDeep(type, o.type, true) && compareDeep(capacity, o.capacity, true) && compareDeep(specimenQuantity, o.specimenQuantity, true) && compareDeep(additive, o.additive, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SpecimenContainerComponent))
            return false;
        SpecimenContainerComponent o = (SpecimenContainerComponent) other;
        return compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (description == null || description.isEmpty()) && (type == null || type.isEmpty()) && (capacity == null || capacity.isEmpty()) && (specimenQuantity == null || specimenQuantity.isEmpty()) && (additive == null || additive.isEmpty());
    }

    public String fhirType() {
        return "Specimen.container";
    }
}
