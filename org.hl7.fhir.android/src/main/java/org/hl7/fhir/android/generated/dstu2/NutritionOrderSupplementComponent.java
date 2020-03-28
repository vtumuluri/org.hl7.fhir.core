package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum.NutritionOrderStatus;
import org.hl7.fhir.android.generated.dstu2.NutritionOrderEnum.NutritionOrderStatusEnumFactory;

public class NutritionOrderSupplementComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement.
     */
    protected CodeableConcept type;

    /**
     * The product or brand name of the nutritional supplement such as "Acme Protein Shake".
     */
    protected StringType productName;

    /**
     * The time period and frequency at which the supplement(s) should be given.
     */
    protected List<Timing> schedule;

    /**
     * The amount of the nutritional supplement to be given.
     */
    protected SimpleQuantity quantity;

    /**
     * Free text or additional instructions or information pertaining to the oral supplement.
     */
    protected StringType instruction;

    private static final long serialVersionUID = 297545236L;

    /*
     * Constructor
     */
    public NutritionOrderSupplementComponent() {
        super();
    }

    /**
     * @return {@link #type} (The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderSupplementComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement.)
     */
    public NutritionOrderSupplementComponent setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #productName} (The product or brand name of the nutritional supplement such as "Acme Protein Shake".). This is the underlying object with id, value and extensions. The accessor "getProductName" gives direct access to the value
     */
    public StringType getProductNameElement() {
        if (this.productName == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderSupplementComponent.productName");
            else if (Configuration.doAutoCreate())
                // bb
                this.productName = new StringType();
        return this.productName;
    }

    public boolean hasProductNameElement() {
        return this.productName != null && !this.productName.isEmpty();
    }

    public boolean hasProductName() {
        return this.productName != null && !this.productName.isEmpty();
    }

    /**
     * @param value {@link #productName} (The product or brand name of the nutritional supplement such as "Acme Protein Shake".). This is the underlying object with id, value and extensions. The accessor "getProductName" gives direct access to the value
     */
    public NutritionOrderSupplementComponent setProductNameElement(StringType value) {
        this.productName = value;
        return this;
    }

    /**
     * @return The product or brand name of the nutritional supplement such as "Acme Protein Shake".
     */
    public String getProductName() {
        return this.productName == null ? null : this.productName.getValue();
    }

    /**
     * @param value The product or brand name of the nutritional supplement such as "Acme Protein Shake".
     */
    public NutritionOrderSupplementComponent setProductName(String value) {
        if (Utilities.noString(value))
            this.productName = null;
        else {
            if (this.productName == null)
                this.productName = new StringType();
            this.productName.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #schedule} (The time period and frequency at which the supplement(s) should be given.)
     */
    public List<Timing> getSchedule() {
        if (this.schedule == null)
            this.schedule = new ArrayList<Timing>();
        return this.schedule;
    }

    public boolean hasSchedule() {
        if (this.schedule == null)
            return false;
        for (Timing item : this.schedule) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Timing addSchedule() {
        // 3
        Timing t = new Timing();
        if (this.schedule == null)
            this.schedule = new ArrayList<Timing>();
        this.schedule.add(t);
        return t;
    }

    // syntactic sugar
    public NutritionOrderSupplementComponent addSchedule(Timing t) {
        // 3
        if (t == null)
            return this;
        if (this.schedule == null)
            this.schedule = new ArrayList<Timing>();
        this.schedule.add(t);
        return this;
    }

    /**
     * @return {@link #quantity} (The amount of the nutritional supplement to be given.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderSupplementComponent.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The amount of the nutritional supplement to be given.)
     */
    public NutritionOrderSupplementComponent setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #instruction} (Free text or additional instructions or information pertaining to the oral supplement.). This is the underlying object with id, value and extensions. The accessor "getInstruction" gives direct access to the value
     */
    public StringType getInstructionElement() {
        if (this.instruction == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderSupplementComponent.instruction");
            else if (Configuration.doAutoCreate())
                // bb
                this.instruction = new StringType();
        return this.instruction;
    }

    public boolean hasInstructionElement() {
        return this.instruction != null && !this.instruction.isEmpty();
    }

    public boolean hasInstruction() {
        return this.instruction != null && !this.instruction.isEmpty();
    }

    /**
     * @param value {@link #instruction} (Free text or additional instructions or information pertaining to the oral supplement.). This is the underlying object with id, value and extensions. The accessor "getInstruction" gives direct access to the value
     */
    public NutritionOrderSupplementComponent setInstructionElement(StringType value) {
        this.instruction = value;
        return this;
    }

    /**
     * @return Free text or additional instructions or information pertaining to the oral supplement.
     */
    public String getInstruction() {
        return this.instruction == null ? null : this.instruction.getValue();
    }

    /**
     * @param value Free text or additional instructions or information pertaining to the oral supplement.
     */
    public NutritionOrderSupplementComponent setInstruction(String value) {
        if (Utilities.noString(value))
            this.instruction = null;
        else {
            if (this.instruction == null)
                this.instruction = new StringType();
            this.instruction.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("productName", "string", "The product or brand name of the nutritional supplement such as \"Acme Protein Shake\".", 0, java.lang.Integer.MAX_VALUE, productName));
        childrenList.add(new Property("schedule", "Timing", "The time period and frequency at which the supplement(s) should be given.", 0, java.lang.Integer.MAX_VALUE, schedule));
        childrenList.add(new Property("quantity", "SimpleQuantity", "The amount of the nutritional supplement to be given.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("instruction", "string", "Free text or additional instructions or information pertaining to the oral supplement.", 0, java.lang.Integer.MAX_VALUE, instruction));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("productName"))
            // StringType
            this.productName = castToString(value);
        else if (name.equals("schedule"))
            this.getSchedule().add(castToTiming(value));
        else if (name.equals("quantity"))
            // SimpleQuantity
            this.quantity = castToSimpleQuantity(value);
        else if (name.equals("instruction"))
            // StringType
            this.instruction = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("productName")) {
            throw new FHIRException("Cannot call addChild on a primitive type NutritionOrder.productName");
        } else if (name.equals("schedule")) {
            return addSchedule();
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else if (name.equals("instruction")) {
            throw new FHIRException("Cannot call addChild on a primitive type NutritionOrder.instruction");
        } else
            return super.addChild(name);
    }

    public NutritionOrderSupplementComponent copy() {
        NutritionOrderSupplementComponent dst = new NutritionOrderSupplementComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.productName = productName == null ? null : productName.copy();
        if (schedule != null) {
            dst.schedule = new ArrayList<Timing>();
            for (Timing i : schedule) dst.schedule.add(i.copy());
        }
        ;
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.instruction = instruction == null ? null : instruction.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof NutritionOrderSupplementComponent))
            return false;
        NutritionOrderSupplementComponent o = (NutritionOrderSupplementComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(productName, o.productName, true) && compareDeep(schedule, o.schedule, true) && compareDeep(quantity, o.quantity, true) && compareDeep(instruction, o.instruction, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof NutritionOrderSupplementComponent))
            return false;
        NutritionOrderSupplementComponent o = (NutritionOrderSupplementComponent) other;
        return compareValues(productName, o.productName, true) && compareValues(instruction, o.instruction, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (productName == null || productName.isEmpty()) && (schedule == null || schedule.isEmpty()) && (quantity == null || quantity.isEmpty()) && (instruction == null || instruction.isEmpty());
    }

    public String fhirType() {
        return "NutritionOrder.supplement";
    }
}
