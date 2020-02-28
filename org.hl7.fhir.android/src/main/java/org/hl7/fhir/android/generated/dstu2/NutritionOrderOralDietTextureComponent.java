package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum.NutritionOrderStatus;
import org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum.NutritionOrderStatusEnumFactory;

public class NutritionOrderOralDietTextureComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed.
     */
    protected CodeableConcept modifier;

    /**
     * The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types.
     */
    protected CodeableConcept foodType;

    private static final long serialVersionUID = -56402817L;

    /*
     * Constructor
     */
    public NutritionOrderOralDietTextureComponent() {
        super();
    }

    /**
     * @return {@link #modifier} (Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed.)
     */
    public CodeableConcept getModifier() {
        if (this.modifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderOralDietTextureComponent.modifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.modifier = new CodeableConcept();
        return this.modifier;
    }

    public boolean hasModifier() {
        return this.modifier != null && !this.modifier.isEmpty();
    }

    /**
     * @param value {@link #modifier} (Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed.)
     */
    public NutritionOrderOralDietTextureComponent setModifier(CodeableConcept value) {
        this.modifier = value;
        return this;
    }

    /**
     * @return {@link #foodType} (The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types.)
     */
    public CodeableConcept getFoodType() {
        if (this.foodType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderOralDietTextureComponent.foodType");
            else if (Configuration.doAutoCreate())
                // cc
                this.foodType = new CodeableConcept();
        return this.foodType;
    }

    public boolean hasFoodType() {
        return this.foodType != null && !this.foodType.isEmpty();
    }

    /**
     * @param value {@link #foodType} (The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types.)
     */
    public NutritionOrderOralDietTextureComponent setFoodType(CodeableConcept value) {
        this.foodType = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("modifier", "CodeableConcept", "Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed.", 0, java.lang.Integer.MAX_VALUE, modifier));
        childrenList.add(new Property("foodType", "CodeableConcept", "The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types.", 0, java.lang.Integer.MAX_VALUE, foodType));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("modifier"))
            // CodeableConcept
            this.modifier = castToCodeableConcept(value);
        else if (name.equals("foodType"))
            // CodeableConcept
            this.foodType = castToCodeableConcept(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("modifier")) {
            this.modifier = new CodeableConcept();
            return this.modifier;
        } else if (name.equals("foodType")) {
            this.foodType = new CodeableConcept();
            return this.foodType;
        } else
            return super.addChild(name);
    }

    public NutritionOrderOralDietTextureComponent copy() {
        NutritionOrderOralDietTextureComponent dst = new NutritionOrderOralDietTextureComponent();
        copyValues(dst);
        dst.modifier = modifier == null ? null : modifier.copy();
        dst.foodType = foodType == null ? null : foodType.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof NutritionOrderOralDietTextureComponent))
            return false;
        NutritionOrderOralDietTextureComponent o = (NutritionOrderOralDietTextureComponent) other;
        return compareDeep(modifier, o.modifier, true) && compareDeep(foodType, o.foodType, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof NutritionOrderOralDietTextureComponent))
            return false;
        NutritionOrderOralDietTextureComponent o = (NutritionOrderOralDietTextureComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (modifier == null || modifier.isEmpty()) && (foodType == null || foodType.isEmpty());
    }

    public String fhirType() {
        return "NutritionOrder.oralDiet.texture";
    }
}
