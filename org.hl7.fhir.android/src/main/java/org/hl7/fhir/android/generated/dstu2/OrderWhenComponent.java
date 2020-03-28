package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;

public class OrderWhenComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Code specifies when request should be done. The code may simply be a priority code.
     */
    protected CodeableConcept code;

    /**
     * A formal schedule.
     */
    protected Timing schedule;

    private static final long serialVersionUID = 307115287L;

    /*
     * Constructor
     */
    public OrderWhenComponent() {
        super();
    }

    /**
     * @return {@link #code} (Code specifies when request should be done. The code may simply be a priority code.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OrderWhenComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Code specifies when request should be done. The code may simply be a priority code.)
     */
    public OrderWhenComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #schedule} (A formal schedule.)
     */
    public Timing getSchedule() {
        if (this.schedule == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OrderWhenComponent.schedule");
            else if (Configuration.doAutoCreate())
                // cc
                this.schedule = new Timing();
        return this.schedule;
    }

    public boolean hasSchedule() {
        return this.schedule != null && !this.schedule.isEmpty();
    }

    /**
     * @param value {@link #schedule} (A formal schedule.)
     */
    public OrderWhenComponent setSchedule(Timing value) {
        this.schedule = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "Code specifies when request should be done. The code may simply be a priority code.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("schedule", "Timing", "A formal schedule.", 0, java.lang.Integer.MAX_VALUE, schedule));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("schedule"))
            // Timing
            this.schedule = castToTiming(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("schedule")) {
            this.schedule = new Timing();
            return this.schedule;
        } else
            return super.addChild(name);
    }

    public OrderWhenComponent copy() {
        OrderWhenComponent dst = new OrderWhenComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.schedule = schedule == null ? null : schedule.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof OrderWhenComponent))
            return false;
        OrderWhenComponent o = (OrderWhenComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(schedule, o.schedule, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof OrderWhenComponent))
            return false;
        OrderWhenComponent o = (OrderWhenComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (schedule == null || schedule.isEmpty());
    }

    public String fhirType() {
        return "Order.when";
    }
}
