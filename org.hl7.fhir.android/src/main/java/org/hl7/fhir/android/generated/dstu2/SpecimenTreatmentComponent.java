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

public class SpecimenTreatmentComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Textual description of procedure.
     */
    protected StringType description;

    /**
     * A coded value specifying the procedure used to process the specimen.
     */
    protected CodeableConcept procedure;

    /**
     * Material used in the processing step.
     */
    protected List<Reference> additive;

    /**
     * The actual objects that are the target of the reference (Material used in the processing step.)
     */
    protected List<Substance> additiveTarget;

    private static final long serialVersionUID = -373251521L;

    /*
     * Constructor
     */
    public SpecimenTreatmentComponent() {
        super();
    }

    /**
     * @return {@link #description} (Textual description of procedure.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenTreatmentComponent.description");
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
     * @param value {@link #description} (Textual description of procedure.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public SpecimenTreatmentComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Textual description of procedure.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Textual description of procedure.
     */
    public SpecimenTreatmentComponent setDescription(String value) {
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
     * @return {@link #procedure} (A coded value specifying the procedure used to process the specimen.)
     */
    public CodeableConcept getProcedure() {
        if (this.procedure == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenTreatmentComponent.procedure");
            else if (Configuration.doAutoCreate())
                // cc
                this.procedure = new CodeableConcept();
        return this.procedure;
    }

    public boolean hasProcedure() {
        return this.procedure != null && !this.procedure.isEmpty();
    }

    /**
     * @param value {@link #procedure} (A coded value specifying the procedure used to process the specimen.)
     */
    public SpecimenTreatmentComponent setProcedure(CodeableConcept value) {
        this.procedure = value;
        return this;
    }

    /**
     * @return {@link #additive} (Material used in the processing step.)
     */
    public List<Reference> getAdditive() {
        if (this.additive == null)
            this.additive = new ArrayList<Reference>();
        return this.additive;
    }

    public boolean hasAdditive() {
        if (this.additive == null)
            return false;
        for (Reference item : this.additive) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addAdditive() {
        // 3
        Reference t = new Reference();
        if (this.additive == null)
            this.additive = new ArrayList<Reference>();
        this.additive.add(t);
        return t;
    }

    // syntactic sugar
    public SpecimenTreatmentComponent addAdditive(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.additive == null)
            this.additive = new ArrayList<Reference>();
        this.additive.add(t);
        return this;
    }

    /**
     * @return {@link #additive} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Material used in the processing step.)
     */
    public List<Substance> getAdditiveTarget() {
        if (this.additiveTarget == null)
            this.additiveTarget = new ArrayList<Substance>();
        return this.additiveTarget;
    }

    /**
     * @return {@link #additive} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Material used in the processing step.)
     */
    public Substance addAdditiveTarget() {
        Substance r = new Substance();
        if (this.additiveTarget == null)
            this.additiveTarget = new ArrayList<Substance>();
        this.additiveTarget.add(r);
        return r;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("description", "string", "Textual description of procedure.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("procedure", "CodeableConcept", "A coded value specifying the procedure used to process the specimen.", 0, java.lang.Integer.MAX_VALUE, procedure));
        childrenList.add(new Property("additive", "Reference(Substance)", "Material used in the processing step.", 0, java.lang.Integer.MAX_VALUE, additive));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("procedure"))
            // CodeableConcept
            this.procedure = castToCodeableConcept(value);
        else if (name.equals("additive"))
            this.getAdditive().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type Specimen.description");
        } else if (name.equals("procedure")) {
            this.procedure = new CodeableConcept();
            return this.procedure;
        } else if (name.equals("additive")) {
            return addAdditive();
        } else
            return super.addChild(name);
    }

    public SpecimenTreatmentComponent copy() {
        SpecimenTreatmentComponent dst = new SpecimenTreatmentComponent();
        copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.procedure = procedure == null ? null : procedure.copy();
        if (additive != null) {
            dst.additive = new ArrayList<Reference>();
            for (Reference i : additive) dst.additive.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SpecimenTreatmentComponent))
            return false;
        SpecimenTreatmentComponent o = (SpecimenTreatmentComponent) other;
        return compareDeep(description, o.description, true) && compareDeep(procedure, o.procedure, true) && compareDeep(additive, o.additive, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SpecimenTreatmentComponent))
            return false;
        SpecimenTreatmentComponent o = (SpecimenTreatmentComponent) other;
        return compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (description == null || description.isEmpty()) && (procedure == null || procedure.isEmpty()) && (additive == null || additive.isEmpty());
    }

    public String fhirType() {
        return "Specimen.treatment";
    }
}
