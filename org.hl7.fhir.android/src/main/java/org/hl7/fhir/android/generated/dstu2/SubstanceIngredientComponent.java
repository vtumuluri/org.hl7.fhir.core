package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class SubstanceIngredientComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The amount of the ingredient in the substance - a concentration ratio.
     */
    protected Ratio quantity;

    /**
     * Another substance that is a component of this substance.
     */
    protected Reference substance;

    /**
     * The actual object that is the target of the reference (Another substance that is a component of this substance.)
     */
    protected Substance substanceTarget;

    private static final long serialVersionUID = -1783242034L;

    /*
     * Constructor
     */
    public SubstanceIngredientComponent() {
        super();
    }

    /*
     * Constructor
     */
    public SubstanceIngredientComponent(Reference substance) {
        super();
        this.substance = substance;
    }

    /**
     * @return {@link #quantity} (The amount of the ingredient in the substance - a concentration ratio.)
     */
    public Ratio getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubstanceIngredientComponent.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new Ratio();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The amount of the ingredient in the substance - a concentration ratio.)
     */
    public SubstanceIngredientComponent setQuantity(Ratio value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #substance} (Another substance that is a component of this substance.)
     */
    public Reference getSubstance() {
        if (this.substance == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubstanceIngredientComponent.substance");
            else if (Configuration.doAutoCreate())
                // cc
                this.substance = new Reference();
        return this.substance;
    }

    public boolean hasSubstance() {
        return this.substance != null && !this.substance.isEmpty();
    }

    /**
     * @param value {@link #substance} (Another substance that is a component of this substance.)
     */
    public SubstanceIngredientComponent setSubstance(Reference value) {
        this.substance = value;
        return this;
    }

    /**
     * @return {@link #substance} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Another substance that is a component of this substance.)
     */
    public Substance getSubstanceTarget() {
        if (this.substanceTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubstanceIngredientComponent.substance");
            else if (Configuration.doAutoCreate())
                // aa
                this.substanceTarget = new Substance();
        return this.substanceTarget;
    }

    /**
     * @param value {@link #substance} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Another substance that is a component of this substance.)
     */
    public SubstanceIngredientComponent setSubstanceTarget(Substance value) {
        this.substanceTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("quantity", "Ratio", "The amount of the ingredient in the substance - a concentration ratio.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("substance", "Reference(Substance)", "Another substance that is a component of this substance.", 0, java.lang.Integer.MAX_VALUE, substance));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("quantity"))
            // Ratio
            this.quantity = castToRatio(value);
        else if (name.equals("substance"))
            // Reference
            this.substance = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("quantity")) {
            this.quantity = new Ratio();
            return this.quantity;
        } else if (name.equals("substance")) {
            this.substance = new Reference();
            return this.substance;
        } else
            return super.addChild(name);
    }

    public SubstanceIngredientComponent copy() {
        SubstanceIngredientComponent dst = new SubstanceIngredientComponent();
        copyValues(dst);
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.substance = substance == null ? null : substance.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SubstanceIngredientComponent))
            return false;
        SubstanceIngredientComponent o = (SubstanceIngredientComponent) other;
        return compareDeep(quantity, o.quantity, true) && compareDeep(substance, o.substance, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SubstanceIngredientComponent))
            return false;
        SubstanceIngredientComponent o = (SubstanceIngredientComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (quantity == null || quantity.isEmpty()) && (substance == null || substance.isEmpty());
    }

    public String fhirType() {
        return "Substance.ingredient";
    }
}
