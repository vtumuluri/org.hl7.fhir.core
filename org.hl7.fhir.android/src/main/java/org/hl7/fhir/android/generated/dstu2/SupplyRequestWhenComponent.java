package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.SupplyRequestEnum.SupplyRequestStatus;
import org.hl7.fhir.android.generated.dstu2.SupplyRequestEnum.SupplyRequestStatusEnumFactory;

public class SupplyRequestWhenComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Code indicating when the request should be fulfilled.
     */
    protected CodeableConcept code;

    /**
     * Formal fulfillment schedule.
     */
    protected Timing schedule;

    private static final long serialVersionUID = 307115287L;

    /*
     * Constructor
     */
    public SupplyRequestWhenComponent() {
        super();
    }

    /**
     * @return {@link #code} (Code indicating when the request should be fulfilled.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequestWhenComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Code indicating when the request should be fulfilled.)
     */
    public SupplyRequestWhenComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #schedule} (Formal fulfillment schedule.)
     */
    public Timing getSchedule() {
        if (this.schedule == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequestWhenComponent.schedule");
            else if (Configuration.doAutoCreate())
                // cc
                this.schedule = new Timing();
        return this.schedule;
    }

    public boolean hasSchedule() {
        return this.schedule != null && !this.schedule.isEmpty();
    }

    /**
     * @param value {@link #schedule} (Formal fulfillment schedule.)
     */
    public SupplyRequestWhenComponent setSchedule(Timing value) {
        this.schedule = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "Code indicating when the request should be fulfilled.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("schedule", "Timing", "Formal fulfillment schedule.", 0, java.lang.Integer.MAX_VALUE, schedule));
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

    public SupplyRequestWhenComponent copy() {
        SupplyRequestWhenComponent dst = new SupplyRequestWhenComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.schedule = schedule == null ? null : schedule.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SupplyRequestWhenComponent))
            return false;
        SupplyRequestWhenComponent o = (SupplyRequestWhenComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(schedule, o.schedule, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SupplyRequestWhenComponent))
            return false;
        SupplyRequestWhenComponent o = (SupplyRequestWhenComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (schedule == null || schedule.isEmpty());
    }

    public String fhirType() {
        return "SupplyRequest.when";
    }
}
