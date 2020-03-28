package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum.NutritionOrderStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum.NutritionOrderStatus;

public class NutritionOrderOralDietNutrientComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The nutrient that is being modified such as carbohydrate or sodium.
     */
    protected CodeableConcept modifier;

    /**
     * The quantity of the specified nutrient to include in diet.
     */
    protected SimpleQuantity amount;

    private static final long serialVersionUID = 465107295L;

    /*
     * Constructor
     */
    public NutritionOrderOralDietNutrientComponent() {
        super();
    }

    /**
     * @return {@link #modifier} (The nutrient that is being modified such as carbohydrate or sodium.)
     */
    public CodeableConcept getModifier() {
        if (this.modifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderOralDietNutrientComponent.modifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.modifier = new CodeableConcept();
        return this.modifier;
    }

    public boolean hasModifier() {
        return this.modifier != null && !this.modifier.isEmpty();
    }

    /**
     * @param value {@link #modifier} (The nutrient that is being modified such as carbohydrate or sodium.)
     */
    public NutritionOrderOralDietNutrientComponent setModifier(CodeableConcept value) {
        this.modifier = value;
        return this;
    }

    /**
     * @return {@link #amount} (The quantity of the specified nutrient to include in diet.)
     */
    public SimpleQuantity getAmount() {
        if (this.amount == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderOralDietNutrientComponent.amount");
            else if (Configuration.doAutoCreate())
                // cc
                this.amount = new SimpleQuantity();
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null && !this.amount.isEmpty();
    }

    /**
     * @param value {@link #amount} (The quantity of the specified nutrient to include in diet.)
     */
    public NutritionOrderOralDietNutrientComponent setAmount(SimpleQuantity value) {
        this.amount = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("modifier", "CodeableConcept", "The nutrient that is being modified such as carbohydrate or sodium.", 0, java.lang.Integer.MAX_VALUE, modifier));
        childrenList.add(new Property("amount", "SimpleQuantity", "The quantity of the specified nutrient to include in diet.", 0, java.lang.Integer.MAX_VALUE, amount));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("modifier"))
            // CodeableConcept
            this.modifier = castToCodeableConcept(value);
        else if (name.equals("amount"))
            // SimpleQuantity
            this.amount = castToSimpleQuantity(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("modifier")) {
            this.modifier = new CodeableConcept();
            return this.modifier;
        } else if (name.equals("amount")) {
            this.amount = new SimpleQuantity();
            return this.amount;
        } else
            return super.addChild(name);
    }

    public NutritionOrderOralDietNutrientComponent copy() {
        NutritionOrderOralDietNutrientComponent dst = new NutritionOrderOralDietNutrientComponent();
        copyValues(dst);
        dst.modifier = modifier == null ? null : modifier.copy();
        dst.amount = amount == null ? null : amount.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof NutritionOrderOralDietNutrientComponent))
            return false;
        NutritionOrderOralDietNutrientComponent o = (NutritionOrderOralDietNutrientComponent) other;
        return compareDeep(modifier, o.modifier, true) && compareDeep(amount, o.amount, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof NutritionOrderOralDietNutrientComponent))
            return false;
        NutritionOrderOralDietNutrientComponent o = (NutritionOrderOralDietNutrientComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (modifier == null || modifier.isEmpty()) && (amount == null || amount.isEmpty());
    }

    public String fhirType() {
        return "NutritionOrder.oralDiet.nutrient";
    }
}
