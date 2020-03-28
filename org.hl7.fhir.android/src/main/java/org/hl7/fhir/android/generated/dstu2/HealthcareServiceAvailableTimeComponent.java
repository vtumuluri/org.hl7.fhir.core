package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.HealthcareServiceEnum.DaysOfWeekEnumFactory;
import org.hl7.fhir.android.generated.dstu2.HealthcareServiceEnum.DaysOfWeek;

public class HealthcareServiceAvailableTimeComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Indicates which days of the week are available between the start and end Times.
     */
    protected List<Enumeration<DaysOfWeek>> daysOfWeek;

    /**
     * Is this always available? (hence times are irrelevant) e.g. 24 hour service.
     */
    protected BooleanType allDay;

    /**
     * The opening time of day. Note: If the AllDay flag is set, then this time is ignored.
     */
    protected TimeType availableStartTime;

    /**
     * The closing time of day. Note: If the AllDay flag is set, then this time is ignored.
     */
    protected TimeType availableEndTime;

    private static final long serialVersionUID = -2139510127L;

    /*
     * Constructor
     */
    public HealthcareServiceAvailableTimeComponent() {
        super();
    }

    /**
     * @return {@link #daysOfWeek} (Indicates which days of the week are available between the start and end Times.)
     */
    public List<Enumeration<DaysOfWeek>> getDaysOfWeek() {
        if (this.daysOfWeek == null)
            this.daysOfWeek = new ArrayList<Enumeration<DaysOfWeek>>();
        return this.daysOfWeek;
    }

    public boolean hasDaysOfWeek() {
        if (this.daysOfWeek == null)
            return false;
        for (Enumeration<DaysOfWeek> item : this.daysOfWeek) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public HealthcareServiceAvailableTimeComponent setDaysOfWeek(List<Enumeration<DaysOfWeek>> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    // syntactic sugar
    public Enumeration<DaysOfWeek> addDaysOfWeekElement() {
        // 2
        Enumeration<DaysOfWeek> t = new Enumeration<DaysOfWeek>(new DaysOfWeekEnumFactory());
        if (this.daysOfWeek == null)
            this.daysOfWeek = new ArrayList<Enumeration<DaysOfWeek>>();
        this.daysOfWeek.add(t);
        return t;
    }

    /**
     * @param value {@link #daysOfWeek} (Indicates which days of the week are available between the start and end Times.)
     */
    public HealthcareServiceAvailableTimeComponent addDaysOfWeek(DaysOfWeek value) {
        // 1
        Enumeration<DaysOfWeek> t = new Enumeration<DaysOfWeek>(new DaysOfWeekEnumFactory());
        t.setValue(value);
        if (this.daysOfWeek == null)
            this.daysOfWeek = new ArrayList<Enumeration<DaysOfWeek>>();
        this.daysOfWeek.add(t);
        return this;
    }

    /**
     * @param value {@link #daysOfWeek} (Indicates which days of the week are available between the start and end Times.)
     */
    public boolean hasDaysOfWeek(DaysOfWeek value) {
        if (this.daysOfWeek == null)
            return false;
        for (Enumeration<DaysOfWeek> v : this.daysOfWeek) if (// code
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #allDay} (Is this always available? (hence times are irrelevant) e.g. 24 hour service.). This is the underlying object with id, value and extensions. The accessor "getAllDay" gives direct access to the value
     */
    public BooleanType getAllDayElement() {
        if (this.allDay == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareServiceAvailableTimeComponent.allDay");
            else if (Configuration.doAutoCreate())
                // bb
                this.allDay = new BooleanType();
        return this.allDay;
    }

    public boolean hasAllDayElement() {
        return this.allDay != null && !this.allDay.isEmpty();
    }

    public boolean hasAllDay() {
        return this.allDay != null && !this.allDay.isEmpty();
    }

    /**
     * @param value {@link #allDay} (Is this always available? (hence times are irrelevant) e.g. 24 hour service.). This is the underlying object with id, value and extensions. The accessor "getAllDay" gives direct access to the value
     */
    public HealthcareServiceAvailableTimeComponent setAllDayElement(BooleanType value) {
        this.allDay = value;
        return this;
    }

    /**
     * @return Is this always available? (hence times are irrelevant) e.g. 24 hour service.
     */
    public boolean getAllDay() {
        return this.allDay == null || this.allDay.isEmpty() ? false : this.allDay.getValue();
    }

    /**
     * @param value Is this always available? (hence times are irrelevant) e.g. 24 hour service.
     */
    public HealthcareServiceAvailableTimeComponent setAllDay(boolean value) {
        if (this.allDay == null)
            this.allDay = new BooleanType();
        this.allDay.setValue(value);
        return this;
    }

    /**
     * @return {@link #availableStartTime} (The opening time of day. Note: If the AllDay flag is set, then this time is ignored.). This is the underlying object with id, value and extensions. The accessor "getAvailableStartTime" gives direct access to the value
     */
    public TimeType getAvailableStartTimeElement() {
        if (this.availableStartTime == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareServiceAvailableTimeComponent.availableStartTime");
            else if (Configuration.doAutoCreate())
                // bb
                this.availableStartTime = new TimeType();
        return this.availableStartTime;
    }

    public boolean hasAvailableStartTimeElement() {
        return this.availableStartTime != null && !this.availableStartTime.isEmpty();
    }

    public boolean hasAvailableStartTime() {
        return this.availableStartTime != null && !this.availableStartTime.isEmpty();
    }

    /**
     * @param value {@link #availableStartTime} (The opening time of day. Note: If the AllDay flag is set, then this time is ignored.). This is the underlying object with id, value and extensions. The accessor "getAvailableStartTime" gives direct access to the value
     */
    public HealthcareServiceAvailableTimeComponent setAvailableStartTimeElement(TimeType value) {
        this.availableStartTime = value;
        return this;
    }

    /**
     * @return The opening time of day. Note: If the AllDay flag is set, then this time is ignored.
     */
    public String getAvailableStartTime() {
        return this.availableStartTime == null ? null : this.availableStartTime.getValue();
    }

    /**
     * @param value The opening time of day. Note: If the AllDay flag is set, then this time is ignored.
     */
    public HealthcareServiceAvailableTimeComponent setAvailableStartTime(String value) {
        if (value == null)
            this.availableStartTime = null;
        else {
            if (this.availableStartTime == null)
                this.availableStartTime = new TimeType();
            this.availableStartTime.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #availableEndTime} (The closing time of day. Note: If the AllDay flag is set, then this time is ignored.). This is the underlying object with id, value and extensions. The accessor "getAvailableEndTime" gives direct access to the value
     */
    public TimeType getAvailableEndTimeElement() {
        if (this.availableEndTime == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareServiceAvailableTimeComponent.availableEndTime");
            else if (Configuration.doAutoCreate())
                // bb
                this.availableEndTime = new TimeType();
        return this.availableEndTime;
    }

    public boolean hasAvailableEndTimeElement() {
        return this.availableEndTime != null && !this.availableEndTime.isEmpty();
    }

    public boolean hasAvailableEndTime() {
        return this.availableEndTime != null && !this.availableEndTime.isEmpty();
    }

    /**
     * @param value {@link #availableEndTime} (The closing time of day. Note: If the AllDay flag is set, then this time is ignored.). This is the underlying object with id, value and extensions. The accessor "getAvailableEndTime" gives direct access to the value
     */
    public HealthcareServiceAvailableTimeComponent setAvailableEndTimeElement(TimeType value) {
        this.availableEndTime = value;
        return this;
    }

    /**
     * @return The closing time of day. Note: If the AllDay flag is set, then this time is ignored.
     */
    public String getAvailableEndTime() {
        return this.availableEndTime == null ? null : this.availableEndTime.getValue();
    }

    /**
     * @param value The closing time of day. Note: If the AllDay flag is set, then this time is ignored.
     */
    public HealthcareServiceAvailableTimeComponent setAvailableEndTime(String value) {
        if (value == null)
            this.availableEndTime = null;
        else {
            if (this.availableEndTime == null)
                this.availableEndTime = new TimeType();
            this.availableEndTime.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("daysOfWeek", "code", "Indicates which days of the week are available between the start and end Times.", 0, java.lang.Integer.MAX_VALUE, daysOfWeek));
        childrenList.add(new Property("allDay", "boolean", "Is this always available? (hence times are irrelevant) e.g. 24 hour service.", 0, java.lang.Integer.MAX_VALUE, allDay));
        childrenList.add(new Property("availableStartTime", "time", "The opening time of day. Note: If the AllDay flag is set, then this time is ignored.", 0, java.lang.Integer.MAX_VALUE, availableStartTime));
        childrenList.add(new Property("availableEndTime", "time", "The closing time of day. Note: If the AllDay flag is set, then this time is ignored.", 0, java.lang.Integer.MAX_VALUE, availableEndTime));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("daysOfWeek"))
            this.getDaysOfWeek().add(new DaysOfWeekEnumFactory().fromType(value));
        else if (name.equals("allDay"))
            // BooleanType
            this.allDay = castToBoolean(value);
        else if (name.equals("availableStartTime"))
            // TimeType
            this.availableStartTime = castToTime(value);
        else if (name.equals("availableEndTime"))
            // TimeType
            this.availableEndTime = castToTime(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("daysOfWeek")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.daysOfWeek");
        } else if (name.equals("allDay")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.allDay");
        } else if (name.equals("availableStartTime")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.availableStartTime");
        } else if (name.equals("availableEndTime")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.availableEndTime");
        } else
            return super.addChild(name);
    }

    public HealthcareServiceAvailableTimeComponent copy() {
        HealthcareServiceAvailableTimeComponent dst = new HealthcareServiceAvailableTimeComponent();
        copyValues(dst);
        if (daysOfWeek != null) {
            dst.daysOfWeek = new ArrayList<Enumeration<DaysOfWeek>>();
            for (Enumeration<DaysOfWeek> i : daysOfWeek) dst.daysOfWeek.add(i.copy());
        }
        ;
        dst.allDay = allDay == null ? null : allDay.copy();
        dst.availableStartTime = availableStartTime == null ? null : availableStartTime.copy();
        dst.availableEndTime = availableEndTime == null ? null : availableEndTime.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof HealthcareServiceAvailableTimeComponent))
            return false;
        HealthcareServiceAvailableTimeComponent o = (HealthcareServiceAvailableTimeComponent) other;
        return compareDeep(daysOfWeek, o.daysOfWeek, true) && compareDeep(allDay, o.allDay, true) && compareDeep(availableStartTime, o.availableStartTime, true) && compareDeep(availableEndTime, o.availableEndTime, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof HealthcareServiceAvailableTimeComponent))
            return false;
        HealthcareServiceAvailableTimeComponent o = (HealthcareServiceAvailableTimeComponent) other;
        return compareValues(daysOfWeek, o.daysOfWeek, true) && compareValues(allDay, o.allDay, true) && compareValues(availableStartTime, o.availableStartTime, true) && compareValues(availableEndTime, o.availableEndTime, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (daysOfWeek == null || daysOfWeek.isEmpty()) && (allDay == null || allDay.isEmpty()) && (availableStartTime == null || availableStartTime.isEmpty()) && (availableEndTime == null || availableEndTime.isEmpty());
    }

    public String fhirType() {
        return "HealthcareService.availableTime";
    }
}
