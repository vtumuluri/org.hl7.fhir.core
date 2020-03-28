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

public class NutritionOrderEnteralFormulaAdministrationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The time period and frequency at which the enteral formula should be delivered to the patient.
     */
    protected Timing schedule;

    /**
     * The volume of formula to provide to the patient per the specified administration schedule.
     */
    protected SimpleQuantity quantity;

    /**
     * The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.
     */
    protected Type rate;

    private static final long serialVersionUID = 1895031997L;

    /*
     * Constructor
     */
    public NutritionOrderEnteralFormulaAdministrationComponent() {
        super();
    }

    /**
     * @return {@link #schedule} (The time period and frequency at which the enteral formula should be delivered to the patient.)
     */
    public Timing getSchedule() {
        if (this.schedule == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderEnteralFormulaAdministrationComponent.schedule");
            else if (Configuration.doAutoCreate())
                // cc
                this.schedule = new Timing();
        return this.schedule;
    }

    public boolean hasSchedule() {
        return this.schedule != null && !this.schedule.isEmpty();
    }

    /**
     * @param value {@link #schedule} (The time period and frequency at which the enteral formula should be delivered to the patient.)
     */
    public NutritionOrderEnteralFormulaAdministrationComponent setSchedule(Timing value) {
        this.schedule = value;
        return this;
    }

    /**
     * @return {@link #quantity} (The volume of formula to provide to the patient per the specified administration schedule.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NutritionOrderEnteralFormulaAdministrationComponent.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The volume of formula to provide to the patient per the specified administration schedule.)
     */
    public NutritionOrderEnteralFormulaAdministrationComponent setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #rate} (The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.)
     */
    public Type getRate() {
        return this.rate;
    }

    /**
     * @return {@link #rate} (The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.)
     */
    public SimpleQuantity getRateSimpleQuantity() throws FHIRException {
        if (!(this.rate instanceof SimpleQuantity))
            throw new FHIRException("Type mismatch: the type SimpleQuantity was expected, but " + this.rate.getClass().getName() + " was encountered");
        return (SimpleQuantity) this.rate;
    }

    public boolean hasRateSimpleQuantity() {
        return this.rate instanceof SimpleQuantity;
    }

    /**
     * @return {@link #rate} (The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.)
     */
    public Ratio getRateRatio() throws FHIRException {
        if (!(this.rate instanceof Ratio))
            throw new FHIRException("Type mismatch: the type Ratio was expected, but " + this.rate.getClass().getName() + " was encountered");
        return (Ratio) this.rate;
    }

    public boolean hasRateRatio() {
        return this.rate instanceof Ratio;
    }

    public boolean hasRate() {
        return this.rate != null && !this.rate.isEmpty();
    }

    /**
     * @param value {@link #rate} (The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.)
     */
    public NutritionOrderEnteralFormulaAdministrationComponent setRate(Type value) {
        this.rate = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("schedule", "Timing", "The time period and frequency at which the enteral formula should be delivered to the patient.", 0, java.lang.Integer.MAX_VALUE, schedule));
        childrenList.add(new Property("quantity", "SimpleQuantity", "The volume of formula to provide to the patient per the specified administration schedule.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("rate[x]", "SimpleQuantity|Ratio", "The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.", 0, java.lang.Integer.MAX_VALUE, rate));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("schedule"))
            // Timing
            this.schedule = castToTiming(value);
        else if (name.equals("quantity"))
            // SimpleQuantity
            this.quantity = castToSimpleQuantity(value);
        else if (name.equals("rate[x]"))
            // Type
            this.rate = (Type) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("schedule")) {
            this.schedule = new Timing();
            return this.schedule;
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else if (name.equals("rateSimpleQuantity")) {
            this.rate = new SimpleQuantity();
            return this.rate;
        } else if (name.equals("rateRatio")) {
            this.rate = new Ratio();
            return this.rate;
        } else
            return super.addChild(name);
    }

    public NutritionOrderEnteralFormulaAdministrationComponent copy() {
        NutritionOrderEnteralFormulaAdministrationComponent dst = new NutritionOrderEnteralFormulaAdministrationComponent();
        copyValues(dst);
        dst.schedule = schedule == null ? null : schedule.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.rate = rate == null ? null : rate.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof NutritionOrderEnteralFormulaAdministrationComponent))
            return false;
        NutritionOrderEnteralFormulaAdministrationComponent o = (NutritionOrderEnteralFormulaAdministrationComponent) other;
        return compareDeep(schedule, o.schedule, true) && compareDeep(quantity, o.quantity, true) && compareDeep(rate, o.rate, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof NutritionOrderEnteralFormulaAdministrationComponent))
            return false;
        NutritionOrderEnteralFormulaAdministrationComponent o = (NutritionOrderEnteralFormulaAdministrationComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (schedule == null || schedule.isEmpty()) && (quantity == null || quantity.isEmpty()) && (rate == null || rate.isEmpty());
    }

    public String fhirType() {
        return "NutritionOrder.enteralFormula.administration";
    }
}
