package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterStateEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterState;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatus;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClassEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClass;

public class EncounterLocationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The location where the encounter takes place.
     */
    protected Reference location;

    /**
     * The actual object that is the target of the reference (The location where the encounter takes place.)
     */
    protected Location locationTarget;

    /**
     * The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time.
     */
    protected Enumeration<EncounterLocationStatus> status;

    /**
     * Time period during which the patient was present at the location.
     */
    protected Period period;

    private static final long serialVersionUID = -322984880L;

    /*
     * Constructor
     */
    public EncounterLocationComponent() {
        super();
    }

    /*
     * Constructor
     */
    public EncounterLocationComponent(Reference location) {
        super();
        this.location = location;
    }

    /**
     * @return {@link #location} (The location where the encounter takes place.)
     */
    public Reference getLocation() {
        if (this.location == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterLocationComponent.location");
            else if (Configuration.doAutoCreate())
                // cc
                this.location = new Reference();
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (The location where the encounter takes place.)
     */
    public EncounterLocationComponent setLocation(Reference value) {
        this.location = value;
        return this;
    }

    /**
     * @return {@link #location} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The location where the encounter takes place.)
     */
    public Location getLocationTarget() {
        if (this.locationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterLocationComponent.location");
            else if (Configuration.doAutoCreate())
                // aa
                this.locationTarget = new Location();
        return this.locationTarget;
    }

    /**
     * @param value {@link #location} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The location where the encounter takes place.)
     */
    public EncounterLocationComponent setLocationTarget(Location value) {
        this.locationTarget = value;
        return this;
    }

    /**
     * @return {@link #status} (The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<EncounterLocationStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterLocationComponent.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<EncounterLocationStatus>(new EncounterLocationStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public EncounterLocationComponent setStatusElement(Enumeration<EncounterLocationStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time.
     */
    public EncounterLocationStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time.
     */
    public EncounterLocationComponent setStatus(EncounterLocationStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<EncounterLocationStatus>(new EncounterLocationStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #period} (Time period during which the patient was present at the location.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterLocationComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Time period during which the patient was present at the location.)
     */
    public EncounterLocationComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("location", "Reference(Location)", "The location where the encounter takes place.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("status", "code", "The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("period", "Period", "Time period during which the patient was present at the location.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("location"))
            // Reference
            this.location = castToReference(value);
        else if (name.equals("status"))
            // Enumeration<EncounterLocationStatus>
            this.status = new EncounterLocationStatusEnumFactory().fromType(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("location")) {
            this.location = new Reference();
            return this.location;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Encounter.status");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public EncounterLocationComponent copy() {
        EncounterLocationComponent dst = new EncounterLocationComponent();
        copyValues(dst);
        dst.location = location == null ? null : location.copy();
        dst.status = status == null ? null : status.copy();
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof EncounterLocationComponent))
            return false;
        EncounterLocationComponent o = (EncounterLocationComponent) other;
        return compareDeep(location, o.location, true) && compareDeep(status, o.status, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof EncounterLocationComponent))
            return false;
        EncounterLocationComponent o = (EncounterLocationComponent) other;
        return compareValues(status, o.status, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (location == null || location.isEmpty()) && (status == null || status.isEmpty()) && (period == null || period.isEmpty());
    }

    public String fhirType() {
        return "Encounter.location";
    }
}
