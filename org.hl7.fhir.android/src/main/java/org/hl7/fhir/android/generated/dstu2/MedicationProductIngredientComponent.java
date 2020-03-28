package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class MedicationProductIngredientComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The actual ingredient - either a substance (simple ingredient) or another medication.
     */
    protected Reference item;

    /**
     * The actual object that is the target of the reference (The actual ingredient - either a substance (simple ingredient) or another medication.)
     */
    protected Resource itemTarget;

    /**
     * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.
     */
    protected Ratio amount;

    private static final long serialVersionUID = -1217232889L;

    /*
     * Constructor
     */
    public MedicationProductIngredientComponent() {
        super();
    }

    /*
     * Constructor
     */
    public MedicationProductIngredientComponent(Reference item) {
        super();
        this.item = item;
    }

    /**
     * @return {@link #item} (The actual ingredient - either a substance (simple ingredient) or another medication.)
     */
    public Reference getItem() {
        if (this.item == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationProductIngredientComponent.item");
            else if (Configuration.doAutoCreate())
                // cc
                this.item = new Reference();
        return this.item;
    }

    public boolean hasItem() {
        return this.item != null && !this.item.isEmpty();
    }

    /**
     * @param value {@link #item} (The actual ingredient - either a substance (simple ingredient) or another medication.)
     */
    public MedicationProductIngredientComponent setItem(Reference value) {
        this.item = value;
        return this;
    }

    /**
     * @return {@link #item} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The actual ingredient - either a substance (simple ingredient) or another medication.)
     */
    public Resource getItemTarget() {
        return this.itemTarget;
    }

    /**
     * @param value {@link #item} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The actual ingredient - either a substance (simple ingredient) or another medication.)
     */
    public MedicationProductIngredientComponent setItemTarget(Resource value) {
        this.itemTarget = value;
        return this;
    }

    /**
     * @return {@link #amount} (Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.)
     */
    public Ratio getAmount() {
        if (this.amount == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationProductIngredientComponent.amount");
            else if (Configuration.doAutoCreate())
                // cc
                this.amount = new Ratio();
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null && !this.amount.isEmpty();
    }

    /**
     * @param value {@link #amount} (Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.)
     */
    public MedicationProductIngredientComponent setAmount(Ratio value) {
        this.amount = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("item", "Reference(Substance|Medication)", "The actual ingredient - either a substance (simple ingredient) or another medication.", 0, java.lang.Integer.MAX_VALUE, item));
        childrenList.add(new Property("amount", "Ratio", "Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.", 0, java.lang.Integer.MAX_VALUE, amount));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("item"))
            // Reference
            this.item = castToReference(value);
        else if (name.equals("amount"))
            // Ratio
            this.amount = castToRatio(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("item")) {
            this.item = new Reference();
            return this.item;
        } else if (name.equals("amount")) {
            this.amount = new Ratio();
            return this.amount;
        } else
            return super.addChild(name);
    }

    public MedicationProductIngredientComponent copy() {
        MedicationProductIngredientComponent dst = new MedicationProductIngredientComponent();
        copyValues(dst);
        dst.item = item == null ? null : item.copy();
        dst.amount = amount == null ? null : amount.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationProductIngredientComponent))
            return false;
        MedicationProductIngredientComponent o = (MedicationProductIngredientComponent) other;
        return compareDeep(item, o.item, true) && compareDeep(amount, o.amount, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationProductIngredientComponent))
            return false;
        MedicationProductIngredientComponent o = (MedicationProductIngredientComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (item == null || item.isEmpty()) && (amount == null || amount.isEmpty());
    }

    public String fhirType() {
        return "Medication.product.ingredient";
    }
}
