package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class MedicationProductComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Describes the form of the item.  Powder; tablets; carton.
     */
    protected CodeableConcept form;

    /**
     * Identifies a particular constituent of interest in the product.
     */
    protected List<MedicationProductIngredientComponent> ingredient;

    /**
     * Information about a group of medication produced or packaged from one production run.
     */
    protected List<MedicationProductBatchComponent> batch;

    private static final long serialVersionUID = 1132853671L;

    /*
     * Constructor
     */
    public MedicationProductComponent() {
        super();
    }

    /**
     * @return {@link #form} (Describes the form of the item.  Powder; tablets; carton.)
     */
    public CodeableConcept getForm() {
        if (this.form == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationProductComponent.form");
            else if (Configuration.doAutoCreate())
                // cc
                this.form = new CodeableConcept();
        return this.form;
    }

    public boolean hasForm() {
        return this.form != null && !this.form.isEmpty();
    }

    /**
     * @param value {@link #form} (Describes the form of the item.  Powder; tablets; carton.)
     */
    public MedicationProductComponent setForm(CodeableConcept value) {
        this.form = value;
        return this;
    }

    /**
     * @return {@link #ingredient} (Identifies a particular constituent of interest in the product.)
     */
    public List<MedicationProductIngredientComponent> getIngredient() {
        if (this.ingredient == null)
            this.ingredient = new ArrayList<MedicationProductIngredientComponent>();
        return this.ingredient;
    }

    public boolean hasIngredient() {
        if (this.ingredient == null)
            return false;
        for (MedicationProductIngredientComponent item : this.ingredient) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public MedicationProductIngredientComponent addIngredient() {
        // 3
        MedicationProductIngredientComponent t = new MedicationProductIngredientComponent();
        if (this.ingredient == null)
            this.ingredient = new ArrayList<MedicationProductIngredientComponent>();
        this.ingredient.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationProductComponent addIngredient(MedicationProductIngredientComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.ingredient == null)
            this.ingredient = new ArrayList<MedicationProductIngredientComponent>();
        this.ingredient.add(t);
        return this;
    }

    /**
     * @return {@link #batch} (Information about a group of medication produced or packaged from one production run.)
     */
    public List<MedicationProductBatchComponent> getBatch() {
        if (this.batch == null)
            this.batch = new ArrayList<MedicationProductBatchComponent>();
        return this.batch;
    }

    public boolean hasBatch() {
        if (this.batch == null)
            return false;
        for (MedicationProductBatchComponent item : this.batch) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public MedicationProductBatchComponent addBatch() {
        // 3
        MedicationProductBatchComponent t = new MedicationProductBatchComponent();
        if (this.batch == null)
            this.batch = new ArrayList<MedicationProductBatchComponent>();
        this.batch.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationProductComponent addBatch(MedicationProductBatchComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.batch == null)
            this.batch = new ArrayList<MedicationProductBatchComponent>();
        this.batch.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("form", "CodeableConcept", "Describes the form of the item.  Powder; tablets; carton.", 0, java.lang.Integer.MAX_VALUE, form));
        childrenList.add(new Property("ingredient", "", "Identifies a particular constituent of interest in the product.", 0, java.lang.Integer.MAX_VALUE, ingredient));
        childrenList.add(new Property("batch", "", "Information about a group of medication produced or packaged from one production run.", 0, java.lang.Integer.MAX_VALUE, batch));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("form"))
            // CodeableConcept
            this.form = castToCodeableConcept(value);
        else if (name.equals("ingredient"))
            this.getIngredient().add((MedicationProductIngredientComponent) value);
        else if (name.equals("batch"))
            this.getBatch().add((MedicationProductBatchComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("form")) {
            this.form = new CodeableConcept();
            return this.form;
        } else if (name.equals("ingredient")) {
            return addIngredient();
        } else if (name.equals("batch")) {
            return addBatch();
        } else
            return super.addChild(name);
    }

    public MedicationProductComponent copy() {
        MedicationProductComponent dst = new MedicationProductComponent();
        copyValues(dst);
        dst.form = form == null ? null : form.copy();
        if (ingredient != null) {
            dst.ingredient = new ArrayList<MedicationProductIngredientComponent>();
            for (MedicationProductIngredientComponent i : ingredient) dst.ingredient.add(i.copy());
        }
        ;
        if (batch != null) {
            dst.batch = new ArrayList<MedicationProductBatchComponent>();
            for (MedicationProductBatchComponent i : batch) dst.batch.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationProductComponent))
            return false;
        MedicationProductComponent o = (MedicationProductComponent) other;
        return compareDeep(form, o.form, true) && compareDeep(ingredient, o.ingredient, true) && compareDeep(batch, o.batch, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationProductComponent))
            return false;
        MedicationProductComponent o = (MedicationProductComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (form == null || form.isEmpty()) && (ingredient == null || ingredient.isEmpty()) && (batch == null || batch.isEmpty());
    }

    public String fhirType() {
        return "Medication.product";
    }
}
