package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterState;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterStateEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClass;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClassEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatus;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatusEnumFactory;

public class EncounterStatusHistoryComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * planned | arrived | in-progress | onleave | finished | cancelled.
     */
    protected Enumeration<EncounterState> status;

    /**
     * The time that the episode was in the specified status.
     */
    protected Period period;

    private static final long serialVersionUID = 919229161L;

    /*
     * Constructor
     */
    public EncounterStatusHistoryComponent() {
        super();
    }

    /*
     * Constructor
     */
    public EncounterStatusHistoryComponent(Enumeration<EncounterState> status, Period period) {
        super();
        this.status = status;
        this.period = period;
    }

    /**
     * @return {@link #status} (planned | arrived | in-progress | onleave | finished | cancelled.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<EncounterState> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterStatusHistoryComponent.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<EncounterState>(new EncounterStateEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (planned | arrived | in-progress | onleave | finished | cancelled.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public EncounterStatusHistoryComponent setStatusElement(Enumeration<EncounterState> value) {
        this.status = value;
        return this;
    }

    /**
     * @return planned | arrived | in-progress | onleave | finished | cancelled.
     */
    public EncounterState getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value planned | arrived | in-progress | onleave | finished | cancelled.
     */
    public EncounterStatusHistoryComponent setStatus(EncounterState value) {
        if (this.status == null)
            this.status = new Enumeration<EncounterState>(new EncounterStateEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #period} (The time that the episode was in the specified status.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterStatusHistoryComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The time that the episode was in the specified status.)
     */
    public EncounterStatusHistoryComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("status", "code", "planned | arrived | in-progress | onleave | finished | cancelled.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("period", "Period", "The time that the episode was in the specified status.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("status"))
            // Enumeration<EncounterState>
            this.status = new EncounterStateEnumFactory().fromType(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Encounter.status");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public EncounterStatusHistoryComponent copy() {
        EncounterStatusHistoryComponent dst = new EncounterStatusHistoryComponent();
        copyValues(dst);
        dst.status = status == null ? null : status.copy();
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof EncounterStatusHistoryComponent))
            return false;
        EncounterStatusHistoryComponent o = (EncounterStatusHistoryComponent) other;
        return compareDeep(status, o.status, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof EncounterStatusHistoryComponent))
            return false;
        EncounterStatusHistoryComponent o = (EncounterStatusHistoryComponent) other;
        return compareValues(status, o.status, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (status == null || status.isEmpty()) && (period == null || period.isEmpty());
    }

    public String fhirType() {
        return "Encounter.statusHistory";
    }
}
