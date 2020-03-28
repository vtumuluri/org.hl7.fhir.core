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

public class NutritionOrderEnteralFormulaComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.
     */
    protected CodeableConcept baseFormulaType;

    /**
     * The product or brand name of the enteral or infant formula product such as "ACME Adult Standard Formula".
     */
    protected StringType baseFormulaProductName;

    /**
     * Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.
     */
    protected CodeableConcept additiveType;

    /**
     * The product or brand name of the type of modular component to be added to the formula.
     */
    protected StringType additiveProductName;

    /**
     * The amount of energy (Calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 Calories per fluid ounce or an adult may require an enteral formula that provides 1.5 Calorie/mL.
     */
    protected SimpleQuantity caloricDensity;

    /**
     * The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.
     */
    protected CodeableConcept routeofAdministration;

    /**
     * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
     */
    protected List<NutritionOrderEnteralFormulaAdministrationComponent> administration;

    /**
     * The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.
     */
    protected SimpleQuantity maxVolumeToDeliver;

    /**
     * Free text formula administration, feeding instructions or additional instructions or information.
     */
    protected StringType administrationInstruction;

    private static final long serialVersionUID = 292116061L;

    /*
     * Constructor
     */
    public NutritionOrderEnteralFormulaComponent() {
        super();
    }

    /**
     * @return {@link #baseFormulaType} (The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.)
     */
    public CodeableConcept getBaseFormulaType() {
        if (this.baseFormulaType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderEnteralFormulaComponent.baseFormulaType");
            else if (Configuration.doAutoCreate())
                // cc
                this.baseFormulaType = new CodeableConcept();
        return this.baseFormulaType;
    }

    public boolean hasBaseFormulaType() {
        return this.baseFormulaType != null && !this.baseFormulaType.isEmpty();
    }

    /**
     * @param value {@link #baseFormulaType} (The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.)
     */
    public NutritionOrderEnteralFormulaComponent setBaseFormulaType(CodeableConcept value) {
        this.baseFormulaType = value;
        return this;
    }

    /**
     * @return {@link #baseFormulaProductName} (The product or brand name of the enteral or infant formula product such as "ACME Adult Standard Formula".). This is the underlying object with id, value and extensions. The accessor "getBaseFormulaProductName" gives direct access to the value
     */
    public StringType getBaseFormulaProductNameElement() {
        if (this.baseFormulaProductName == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderEnteralFormulaComponent.baseFormulaProductName");
            else if (Configuration.doAutoCreate())
                // bb
                this.baseFormulaProductName = new StringType();
        return this.baseFormulaProductName;
    }

    public boolean hasBaseFormulaProductNameElement() {
        return this.baseFormulaProductName != null && !this.baseFormulaProductName.isEmpty();
    }

    public boolean hasBaseFormulaProductName() {
        return this.baseFormulaProductName != null && !this.baseFormulaProductName.isEmpty();
    }

    /**
     * @param value {@link #baseFormulaProductName} (The product or brand name of the enteral or infant formula product such as "ACME Adult Standard Formula".). This is the underlying object with id, value and extensions. The accessor "getBaseFormulaProductName" gives direct access to the value
     */
    public NutritionOrderEnteralFormulaComponent setBaseFormulaProductNameElement(StringType value) {
        this.baseFormulaProductName = value;
        return this;
    }

    /**
     * @return The product or brand name of the enteral or infant formula product such as "ACME Adult Standard Formula".
     */
    public String getBaseFormulaProductName() {
        return this.baseFormulaProductName == null ? null : this.baseFormulaProductName.getValue();
    }

    /**
     * @param value The product or brand name of the enteral or infant formula product such as "ACME Adult Standard Formula".
     */
    public NutritionOrderEnteralFormulaComponent setBaseFormulaProductName(String value) {
        if (Utilities.noString(value))
            this.baseFormulaProductName = null;
        else {
            if (this.baseFormulaProductName == null)
                this.baseFormulaProductName = new StringType();
            this.baseFormulaProductName.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #additiveType} (Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.)
     */
    public CodeableConcept getAdditiveType() {
        if (this.additiveType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderEnteralFormulaComponent.additiveType");
            else if (Configuration.doAutoCreate())
                // cc
                this.additiveType = new CodeableConcept();
        return this.additiveType;
    }

    public boolean hasAdditiveType() {
        return this.additiveType != null && !this.additiveType.isEmpty();
    }

    /**
     * @param value {@link #additiveType} (Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.)
     */
    public NutritionOrderEnteralFormulaComponent setAdditiveType(CodeableConcept value) {
        this.additiveType = value;
        return this;
    }

    /**
     * @return {@link #additiveProductName} (The product or brand name of the type of modular component to be added to the formula.). This is the underlying object with id, value and extensions. The accessor "getAdditiveProductName" gives direct access to the value
     */
    public StringType getAdditiveProductNameElement() {
        if (this.additiveProductName == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderEnteralFormulaComponent.additiveProductName");
            else if (Configuration.doAutoCreate())
                // bb
                this.additiveProductName = new StringType();
        return this.additiveProductName;
    }

    public boolean hasAdditiveProductNameElement() {
        return this.additiveProductName != null && !this.additiveProductName.isEmpty();
    }

    public boolean hasAdditiveProductName() {
        return this.additiveProductName != null && !this.additiveProductName.isEmpty();
    }

    /**
     * @param value {@link #additiveProductName} (The product or brand name of the type of modular component to be added to the formula.). This is the underlying object with id, value and extensions. The accessor "getAdditiveProductName" gives direct access to the value
     */
    public NutritionOrderEnteralFormulaComponent setAdditiveProductNameElement(StringType value) {
        this.additiveProductName = value;
        return this;
    }

    /**
     * @return The product or brand name of the type of modular component to be added to the formula.
     */
    public String getAdditiveProductName() {
        return this.additiveProductName == null ? null : this.additiveProductName.getValue();
    }

    /**
     * @param value The product or brand name of the type of modular component to be added to the formula.
     */
    public NutritionOrderEnteralFormulaComponent setAdditiveProductName(String value) {
        if (Utilities.noString(value))
            this.additiveProductName = null;
        else {
            if (this.additiveProductName == null)
                this.additiveProductName = new StringType();
            this.additiveProductName.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #caloricDensity} (The amount of energy (Calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 Calories per fluid ounce or an adult may require an enteral formula that provides 1.5 Calorie/mL.)
     */
    public SimpleQuantity getCaloricDensity() {
        if (this.caloricDensity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderEnteralFormulaComponent.caloricDensity");
            else if (Configuration.doAutoCreate())
                // cc
                this.caloricDensity = new SimpleQuantity();
        return this.caloricDensity;
    }

    public boolean hasCaloricDensity() {
        return this.caloricDensity != null && !this.caloricDensity.isEmpty();
    }

    /**
     * @param value {@link #caloricDensity} (The amount of energy (Calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 Calories per fluid ounce or an adult may require an enteral formula that provides 1.5 Calorie/mL.)
     */
    public NutritionOrderEnteralFormulaComponent setCaloricDensity(SimpleQuantity value) {
        this.caloricDensity = value;
        return this;
    }

    /**
     * @return {@link #routeofAdministration} (The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.)
     */
    public CodeableConcept getRouteofAdministration() {
        if (this.routeofAdministration == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderEnteralFormulaComponent.routeofAdministration");
            else if (Configuration.doAutoCreate())
                // cc
                this.routeofAdministration = new CodeableConcept();
        return this.routeofAdministration;
    }

    public boolean hasRouteofAdministration() {
        return this.routeofAdministration != null && !this.routeofAdministration.isEmpty();
    }

    /**
     * @param value {@link #routeofAdministration} (The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.)
     */
    public NutritionOrderEnteralFormulaComponent setRouteofAdministration(CodeableConcept value) {
        this.routeofAdministration = value;
        return this;
    }

    /**
     * @return {@link #administration} (Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.)
     */
    public List<NutritionOrderEnteralFormulaAdministrationComponent> getAdministration() {
        if (this.administration == null)
            this.administration = new ArrayList<NutritionOrderEnteralFormulaAdministrationComponent>();
        return this.administration;
    }

    public boolean hasAdministration() {
        if (this.administration == null)
            return false;
        for (NutritionOrderEnteralFormulaAdministrationComponent item : this.administration) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public NutritionOrderEnteralFormulaAdministrationComponent addAdministration() {
        // 3
        NutritionOrderEnteralFormulaAdministrationComponent t = new NutritionOrderEnteralFormulaAdministrationComponent();
        if (this.administration == null)
            this.administration = new ArrayList<NutritionOrderEnteralFormulaAdministrationComponent>();
        this.administration.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrderEnteralFormulaComponent addAdministration(NutritionOrderEnteralFormulaAdministrationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.administration == null)
            this.administration = new ArrayList<NutritionOrderEnteralFormulaAdministrationComponent>();
        this.administration.add(t);
        return this;
    }

    /**
     * @return {@link #maxVolumeToDeliver} (The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.)
     */
    public SimpleQuantity getMaxVolumeToDeliver() {
        if (this.maxVolumeToDeliver == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderEnteralFormulaComponent.maxVolumeToDeliver");
            else if (Configuration.doAutoCreate())
                // cc
                this.maxVolumeToDeliver = new SimpleQuantity();
        return this.maxVolumeToDeliver;
    }

    public boolean hasMaxVolumeToDeliver() {
        return this.maxVolumeToDeliver != null && !this.maxVolumeToDeliver.isEmpty();
    }

    /**
     * @param value {@link #maxVolumeToDeliver} (The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.)
     */
    public NutritionOrderEnteralFormulaComponent setMaxVolumeToDeliver(SimpleQuantity value) {
        this.maxVolumeToDeliver = value;
        return this;
    }

    /**
     * @return {@link #administrationInstruction} (Free text formula administration, feeding instructions or additional instructions or information.). This is the underlying object with id, value and extensions. The accessor "getAdministrationInstruction" gives direct access to the value
     */
    public StringType getAdministrationInstructionElement() {
        if (this.administrationInstruction == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderEnteralFormulaComponent.administrationInstruction");
            else if (Configuration.doAutoCreate())
                // bb
                this.administrationInstruction = new StringType();
        return this.administrationInstruction;
    }

    public boolean hasAdministrationInstructionElement() {
        return this.administrationInstruction != null && !this.administrationInstruction.isEmpty();
    }

    public boolean hasAdministrationInstruction() {
        return this.administrationInstruction != null && !this.administrationInstruction.isEmpty();
    }

    /**
     * @param value {@link #administrationInstruction} (Free text formula administration, feeding instructions or additional instructions or information.). This is the underlying object with id, value and extensions. The accessor "getAdministrationInstruction" gives direct access to the value
     */
    public NutritionOrderEnteralFormulaComponent setAdministrationInstructionElement(StringType value) {
        this.administrationInstruction = value;
        return this;
    }

    /**
     * @return Free text formula administration, feeding instructions or additional instructions or information.
     */
    public String getAdministrationInstruction() {
        return this.administrationInstruction == null ? null : this.administrationInstruction.getValue();
    }

    /**
     * @param value Free text formula administration, feeding instructions or additional instructions or information.
     */
    public NutritionOrderEnteralFormulaComponent setAdministrationInstruction(String value) {
        if (Utilities.noString(value))
            this.administrationInstruction = null;
        else {
            if (this.administrationInstruction == null)
                this.administrationInstruction = new StringType();
            this.administrationInstruction.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("baseFormulaType", "CodeableConcept", "The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.", 0, java.lang.Integer.MAX_VALUE, baseFormulaType));
        childrenList.add(new Property("baseFormulaProductName", "string", "The product or brand name of the enteral or infant formula product such as \"ACME Adult Standard Formula\".", 0, java.lang.Integer.MAX_VALUE, baseFormulaProductName));
        childrenList.add(new Property("additiveType", "CodeableConcept", "Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.", 0, java.lang.Integer.MAX_VALUE, additiveType));
        childrenList.add(new Property("additiveProductName", "string", "The product or brand name of the type of modular component to be added to the formula.", 0, java.lang.Integer.MAX_VALUE, additiveProductName));
        childrenList.add(new Property("caloricDensity", "SimpleQuantity", "The amount of energy (Calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 Calories per fluid ounce or an adult may require an enteral formula that provides 1.5 Calorie/mL.", 0, java.lang.Integer.MAX_VALUE, caloricDensity));
        childrenList.add(new Property("routeofAdministration", "CodeableConcept", "The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.", 0, java.lang.Integer.MAX_VALUE, routeofAdministration));
        childrenList.add(new Property("administration", "", "Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.", 0, java.lang.Integer.MAX_VALUE, administration));
        childrenList.add(new Property("maxVolumeToDeliver", "SimpleQuantity", "The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.", 0, java.lang.Integer.MAX_VALUE, maxVolumeToDeliver));
        childrenList.add(new Property("administrationInstruction", "string", "Free text formula administration, feeding instructions or additional instructions or information.", 0, java.lang.Integer.MAX_VALUE, administrationInstruction));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("baseFormulaType"))
            // CodeableConcept
            this.baseFormulaType = castToCodeableConcept(value);
        else if (name.equals("baseFormulaProductName"))
            // StringType
            this.baseFormulaProductName = castToString(value);
        else if (name.equals("additiveType"))
            // CodeableConcept
            this.additiveType = castToCodeableConcept(value);
        else if (name.equals("additiveProductName"))
            // StringType
            this.additiveProductName = castToString(value);
        else if (name.equals("caloricDensity"))
            // SimpleQuantity
            this.caloricDensity = castToSimpleQuantity(value);
        else if (name.equals("routeofAdministration"))
            // CodeableConcept
            this.routeofAdministration = castToCodeableConcept(value);
        else if (name.equals("administration"))
            this.getAdministration().add((NutritionOrderEnteralFormulaAdministrationComponent) value);
        else if (name.equals("maxVolumeToDeliver"))
            // SimpleQuantity
            this.maxVolumeToDeliver = castToSimpleQuantity(value);
        else if (name.equals("administrationInstruction"))
            // StringType
            this.administrationInstruction = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("baseFormulaType")) {
            this.baseFormulaType = new CodeableConcept();
            return this.baseFormulaType;
        } else if (name.equals("baseFormulaProductName")) {
            throw new FHIRException("Cannot call addChild on a primitive type NutritionOrder.baseFormulaProductName");
        } else if (name.equals("additiveType")) {
            this.additiveType = new CodeableConcept();
            return this.additiveType;
        } else if (name.equals("additiveProductName")) {
            throw new FHIRException("Cannot call addChild on a primitive type NutritionOrder.additiveProductName");
        } else if (name.equals("caloricDensity")) {
            this.caloricDensity = new SimpleQuantity();
            return this.caloricDensity;
        } else if (name.equals("routeofAdministration")) {
            this.routeofAdministration = new CodeableConcept();
            return this.routeofAdministration;
        } else if (name.equals("administration")) {
            return addAdministration();
        } else if (name.equals("maxVolumeToDeliver")) {
            this.maxVolumeToDeliver = new SimpleQuantity();
            return this.maxVolumeToDeliver;
        } else if (name.equals("administrationInstruction")) {
            throw new FHIRException("Cannot call addChild on a primitive type NutritionOrder.administrationInstruction");
        } else
            return super.addChild(name);
    }

    public NutritionOrderEnteralFormulaComponent copy() {
        NutritionOrderEnteralFormulaComponent dst = new NutritionOrderEnteralFormulaComponent();
        copyValues(dst);
        dst.baseFormulaType = baseFormulaType == null ? null : baseFormulaType.copy();
        dst.baseFormulaProductName = baseFormulaProductName == null ? null : baseFormulaProductName.copy();
        dst.additiveType = additiveType == null ? null : additiveType.copy();
        dst.additiveProductName = additiveProductName == null ? null : additiveProductName.copy();
        dst.caloricDensity = caloricDensity == null ? null : caloricDensity.copy();
        dst.routeofAdministration = routeofAdministration == null ? null : routeofAdministration.copy();
        if (administration != null) {
            dst.administration = new ArrayList<NutritionOrderEnteralFormulaAdministrationComponent>();
            for (NutritionOrderEnteralFormulaAdministrationComponent i : administration) dst.administration.add(i.copy());
        }
        ;
        dst.maxVolumeToDeliver = maxVolumeToDeliver == null ? null : maxVolumeToDeliver.copy();
        dst.administrationInstruction = administrationInstruction == null ? null : administrationInstruction.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof NutritionOrderEnteralFormulaComponent))
            return false;
        NutritionOrderEnteralFormulaComponent o = (NutritionOrderEnteralFormulaComponent) other;
        return compareDeep(baseFormulaType, o.baseFormulaType, true) && compareDeep(baseFormulaProductName, o.baseFormulaProductName, true) && compareDeep(additiveType, o.additiveType, true) && compareDeep(additiveProductName, o.additiveProductName, true) && compareDeep(caloricDensity, o.caloricDensity, true) && compareDeep(routeofAdministration, o.routeofAdministration, true) && compareDeep(administration, o.administration, true) && compareDeep(maxVolumeToDeliver, o.maxVolumeToDeliver, true) && compareDeep(administrationInstruction, o.administrationInstruction, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof NutritionOrderEnteralFormulaComponent))
            return false;
        NutritionOrderEnteralFormulaComponent o = (NutritionOrderEnteralFormulaComponent) other;
        return compareValues(baseFormulaProductName, o.baseFormulaProductName, true) && compareValues(additiveProductName, o.additiveProductName, true) && compareValues(administrationInstruction, o.administrationInstruction, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (baseFormulaType == null || baseFormulaType.isEmpty()) && (baseFormulaProductName == null || baseFormulaProductName.isEmpty()) && (additiveType == null || additiveType.isEmpty()) && (additiveProductName == null || additiveProductName.isEmpty()) && (caloricDensity == null || caloricDensity.isEmpty()) && (routeofAdministration == null || routeofAdministration.isEmpty()) && (administration == null || administration.isEmpty()) && (maxVolumeToDeliver == null || maxVolumeToDeliver.isEmpty()) && (administrationInstruction == null || administrationInstruction.isEmpty());
    }

    public String fhirType() {
        return "NutritionOrder.enteralFormula";
    }
}
