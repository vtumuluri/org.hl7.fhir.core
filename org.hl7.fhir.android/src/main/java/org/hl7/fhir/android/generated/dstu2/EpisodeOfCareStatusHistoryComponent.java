package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EpisodeOfCareEnum.EpisodeOfCareStatus;
import org.hl7.fhir.android.generated.dstu2.EpisodeOfCareEnum.EpisodeOfCareStatusEnumFactory;

public class EpisodeOfCareStatusHistoryComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     */
    protected Enumeration<EpisodeOfCareStatus> status;

    /**
     * The period during this EpisodeOfCare that the specific status applied.
     */
    protected Period period;

    private static final long serialVersionUID = -1192432864L;

    /*
     * Constructor
     */
    public EpisodeOfCareStatusHistoryComponent() {
        super();
    }

    /*
     * Constructor
     */
    public EpisodeOfCareStatusHistoryComponent(Enumeration<EpisodeOfCareStatus> status, Period period) {
        super();
        this.status = status;
        this.period = period;
    }

    /**
     * @return {@link #status} (planned | waitlist | active | onhold | finished | cancelled.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<EpisodeOfCareStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCareStatusHistoryComponent.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<EpisodeOfCareStatus>(new EpisodeOfCareStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (planned | waitlist | active | onhold | finished | cancelled.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public EpisodeOfCareStatusHistoryComponent setStatusElement(Enumeration<EpisodeOfCareStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return planned | waitlist | active | onhold | finished | cancelled.
     */
    public EpisodeOfCareStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value planned | waitlist | active | onhold | finished | cancelled.
     */
    public EpisodeOfCareStatusHistoryComponent setStatus(EpisodeOfCareStatus value) {
        if (this.status == null)
            this.status = new Enumeration<EpisodeOfCareStatus>(new EpisodeOfCareStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #period} (The period during this EpisodeOfCare that the specific status applied.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCareStatusHistoryComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period during this EpisodeOfCare that the specific status applied.)
     */
    public EpisodeOfCareStatusHistoryComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("status", "code", "planned | waitlist | active | onhold | finished | cancelled.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("period", "Period", "The period during this EpisodeOfCare that the specific status applied.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("status"))
            // Enumeration<EpisodeOfCareStatus>
            this.status = new EpisodeOfCareStatusEnumFactory().fromType(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type EpisodeOfCare.status");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public EpisodeOfCareStatusHistoryComponent copy() {
        EpisodeOfCareStatusHistoryComponent dst = new EpisodeOfCareStatusHistoryComponent();
        copyValues(dst);
        dst.status = status == null ? null : status.copy();
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof EpisodeOfCareStatusHistoryComponent))
            return false;
        EpisodeOfCareStatusHistoryComponent o = (EpisodeOfCareStatusHistoryComponent) other;
        return compareDeep(status, o.status, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof EpisodeOfCareStatusHistoryComponent))
            return false;
        EpisodeOfCareStatusHistoryComponent o = (EpisodeOfCareStatusHistoryComponent) other;
        return compareValues(status, o.status, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (status == null || status.isEmpty()) && (period == null || period.isEmpty());
    }

    public String fhirType() {
        return "EpisodeOfCare.statusHistory";
    }
}
