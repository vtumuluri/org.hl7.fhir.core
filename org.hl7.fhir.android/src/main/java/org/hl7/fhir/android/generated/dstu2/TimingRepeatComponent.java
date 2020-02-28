package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.UnitsOfTime;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.UnitsOfTimeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.EventTiming;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.EventTimingEnumFactory;

public class TimingRepeatComponent extends Element implements IBaseDatatypeElement {

    /**
     * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
     */
    protected Type bounds;

    /**
     * A total count of the desired number of repetitions.
     */
    protected IntegerType count;

    /**
     * How long this thing happens for when it happens.
     */
    protected DecimalType duration;

    /**
     * The upper limit of how long this thing happens for when it happens.
     */
    protected DecimalType durationMax;

    /**
     * The units of time for the duration, in UCUM units.
     */
    protected Enumeration<UnitsOfTime> durationUnits;

    /**
     * The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided).
     */
    protected IntegerType frequency;

    /**
     * If present, indicates that the frequency is a range - so repeat between [frequency] and [frequencyMax] times within the period or period range.
     */
    protected IntegerType frequencyMax;

    /**
     * Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period.
     */
    protected DecimalType period;

    /**
     * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.
     */
    protected DecimalType periodMax;

    /**
     * The units of time for the period in UCUM units.
     */
    protected Enumeration<UnitsOfTime> periodUnits;

    /**
     * A real world event that the occurrence of the event should be tied to.
     */
    protected Enumeration<EventTiming> when;

    private static final long serialVersionUID = -585686982L;

    /*
     * Constructor
     */
    public TimingRepeatComponent() {
        super();
    }

    /**
     * @return {@link #bounds} (Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.)
     */
    public Type getBounds() {
        return this.bounds;
    }

    /**
     * @return {@link #bounds} (Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.)
     */
    public Duration getBoundsDuration() throws FHIRException {
        if (!(this.bounds instanceof Duration))
            throw new FHIRException("Type mismatch: the type Duration was expected, but " + this.bounds.getClass().getName() + " was encountered");
        return (Duration) this.bounds;
    }

    public boolean hasBoundsDuration() {
        return this.bounds instanceof Duration;
    }

    /**
     * @return {@link #bounds} (Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.)
     */
    public Range getBoundsRange() throws FHIRException {
        if (!(this.bounds instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.bounds.getClass().getName() + " was encountered");
        return (Range) this.bounds;
    }

    public boolean hasBoundsRange() {
        return this.bounds instanceof Range;
    }

    /**
     * @return {@link #bounds} (Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.)
     */
    public Period getBoundsPeriod() throws FHIRException {
        if (!(this.bounds instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.bounds.getClass().getName() + " was encountered");
        return (Period) this.bounds;
    }

    public boolean hasBoundsPeriod() {
        return this.bounds instanceof Period;
    }

    public boolean hasBounds() {
        return this.bounds != null && !this.bounds.isEmpty();
    }

    /**
     * @param value {@link #bounds} (Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.)
     */
    public TimingRepeatComponent setBounds(Type value) {
        this.bounds = value;
        return this;
    }

    /**
     * @return {@link #count} (A total count of the desired number of repetitions.). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
     */
    public IntegerType getCountElement() {
        if (this.count == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TimingRepeatComponent.count");
            else if (Configuration.doAutoCreate())
                // bb
                this.count = new IntegerType();
        return this.count;
    }

    public boolean hasCountElement() {
        return this.count != null && !this.count.isEmpty();
    }

    public boolean hasCount() {
        return this.count != null && !this.count.isEmpty();
    }

    /**
     * @param value {@link #count} (A total count of the desired number of repetitions.). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
     */
    public TimingRepeatComponent setCountElement(IntegerType value) {
        this.count = value;
        return this;
    }

    /**
     * @return A total count of the desired number of repetitions.
     */
    public int getCount() {
        return this.count == null || this.count.isEmpty() ? 0 : this.count.getValue();
    }

    /**
     * @param value A total count of the desired number of repetitions.
     */
    public TimingRepeatComponent setCount(int value) {
        if (this.count == null)
            this.count = new IntegerType();
        this.count.setValue(value);
        return this;
    }

    /**
     * @return {@link #duration} (How long this thing happens for when it happens.). This is the underlying object with id, value and extensions. The accessor "getDuration" gives direct access to the value
     */
    public DecimalType getDurationElement() {
        if (this.duration == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TimingRepeatComponent.duration");
            else if (Configuration.doAutoCreate())
                // bb
                this.duration = new DecimalType();
        return this.duration;
    }

    public boolean hasDurationElement() {
        return this.duration != null && !this.duration.isEmpty();
    }

    public boolean hasDuration() {
        return this.duration != null && !this.duration.isEmpty();
    }

    /**
     * @param value {@link #duration} (How long this thing happens for when it happens.). This is the underlying object with id, value and extensions. The accessor "getDuration" gives direct access to the value
     */
    public TimingRepeatComponent setDurationElement(DecimalType value) {
        this.duration = value;
        return this;
    }

    /**
     * @return How long this thing happens for when it happens.
     */
    public BigDecimal getDuration() {
        return this.duration == null ? null : this.duration.getValue();
    }

    /**
     * @param value How long this thing happens for when it happens.
     */
    public TimingRepeatComponent setDuration(BigDecimal value) {
        if (value == null)
            this.duration = null;
        else {
            if (this.duration == null)
                this.duration = new DecimalType();
            this.duration.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #durationMax} (The upper limit of how long this thing happens for when it happens.). This is the underlying object with id, value and extensions. The accessor "getDurationMax" gives direct access to the value
     */
    public DecimalType getDurationMaxElement() {
        if (this.durationMax == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TimingRepeatComponent.durationMax");
            else if (Configuration.doAutoCreate())
                // bb
                this.durationMax = new DecimalType();
        return this.durationMax;
    }

    public boolean hasDurationMaxElement() {
        return this.durationMax != null && !this.durationMax.isEmpty();
    }

    public boolean hasDurationMax() {
        return this.durationMax != null && !this.durationMax.isEmpty();
    }

    /**
     * @param value {@link #durationMax} (The upper limit of how long this thing happens for when it happens.). This is the underlying object with id, value and extensions. The accessor "getDurationMax" gives direct access to the value
     */
    public TimingRepeatComponent setDurationMaxElement(DecimalType value) {
        this.durationMax = value;
        return this;
    }

    /**
     * @return The upper limit of how long this thing happens for when it happens.
     */
    public BigDecimal getDurationMax() {
        return this.durationMax == null ? null : this.durationMax.getValue();
    }

    /**
     * @param value The upper limit of how long this thing happens for when it happens.
     */
    public TimingRepeatComponent setDurationMax(BigDecimal value) {
        if (value == null)
            this.durationMax = null;
        else {
            if (this.durationMax == null)
                this.durationMax = new DecimalType();
            this.durationMax.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #durationUnits} (The units of time for the duration, in UCUM units.). This is the underlying object with id, value and extensions. The accessor "getDurationUnits" gives direct access to the value
     */
    public Enumeration<UnitsOfTime> getDurationUnitsElement() {
        if (this.durationUnits == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TimingRepeatComponent.durationUnits");
            else if (Configuration.doAutoCreate())
                // bb
                this.durationUnits = new Enumeration<UnitsOfTime>(new UnitsOfTimeEnumFactory());
        return this.durationUnits;
    }

    public boolean hasDurationUnitsElement() {
        return this.durationUnits != null && !this.durationUnits.isEmpty();
    }

    public boolean hasDurationUnits() {
        return this.durationUnits != null && !this.durationUnits.isEmpty();
    }

    /**
     * @param value {@link #durationUnits} (The units of time for the duration, in UCUM units.). This is the underlying object with id, value and extensions. The accessor "getDurationUnits" gives direct access to the value
     */
    public TimingRepeatComponent setDurationUnitsElement(Enumeration<UnitsOfTime> value) {
        this.durationUnits = value;
        return this;
    }

    /**
     * @return The units of time for the duration, in UCUM units.
     */
    public UnitsOfTime getDurationUnits() {
        return this.durationUnits == null ? null : this.durationUnits.getValue();
    }

    /**
     * @param value The units of time for the duration, in UCUM units.
     */
    public TimingRepeatComponent setDurationUnits(UnitsOfTime value) {
        if (value == null)
            this.durationUnits = null;
        else {
            if (this.durationUnits == null)
                this.durationUnits = new Enumeration<UnitsOfTime>(new UnitsOfTimeEnumFactory());
            this.durationUnits.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #frequency} (The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided).). This is the underlying object with id, value and extensions. The accessor "getFrequency" gives direct access to the value
     */
    public IntegerType getFrequencyElement() {
        if (this.frequency == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TimingRepeatComponent.frequency");
            else if (Configuration.doAutoCreate())
                // bb
                this.frequency = new IntegerType();
        return this.frequency;
    }

    public boolean hasFrequencyElement() {
        return this.frequency != null && !this.frequency.isEmpty();
    }

    public boolean hasFrequency() {
        return this.frequency != null && !this.frequency.isEmpty();
    }

    /**
     * @param value {@link #frequency} (The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided).). This is the underlying object with id, value and extensions. The accessor "getFrequency" gives direct access to the value
     */
    public TimingRepeatComponent setFrequencyElement(IntegerType value) {
        this.frequency = value;
        return this;
    }

    /**
     * @return The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided).
     */
    public int getFrequency() {
        return this.frequency == null || this.frequency.isEmpty() ? 0 : this.frequency.getValue();
    }

    /**
     * @param value The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided).
     */
    public TimingRepeatComponent setFrequency(int value) {
        if (this.frequency == null)
            this.frequency = new IntegerType();
        this.frequency.setValue(value);
        return this;
    }

    /**
     * @return {@link #frequencyMax} (If present, indicates that the frequency is a range - so repeat between [frequency] and [frequencyMax] times within the period or period range.). This is the underlying object with id, value and extensions. The accessor "getFrequencyMax" gives direct access to the value
     */
    public IntegerType getFrequencyMaxElement() {
        if (this.frequencyMax == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TimingRepeatComponent.frequencyMax");
            else if (Configuration.doAutoCreate())
                // bb
                this.frequencyMax = new IntegerType();
        return this.frequencyMax;
    }

    public boolean hasFrequencyMaxElement() {
        return this.frequencyMax != null && !this.frequencyMax.isEmpty();
    }

    public boolean hasFrequencyMax() {
        return this.frequencyMax != null && !this.frequencyMax.isEmpty();
    }

    /**
     * @param value {@link #frequencyMax} (If present, indicates that the frequency is a range - so repeat between [frequency] and [frequencyMax] times within the period or period range.). This is the underlying object with id, value and extensions. The accessor "getFrequencyMax" gives direct access to the value
     */
    public TimingRepeatComponent setFrequencyMaxElement(IntegerType value) {
        this.frequencyMax = value;
        return this;
    }

    /**
     * @return If present, indicates that the frequency is a range - so repeat between [frequency] and [frequencyMax] times within the period or period range.
     */
    public int getFrequencyMax() {
        return this.frequencyMax == null || this.frequencyMax.isEmpty() ? 0 : this.frequencyMax.getValue();
    }

    /**
     * @param value If present, indicates that the frequency is a range - so repeat between [frequency] and [frequencyMax] times within the period or period range.
     */
    public TimingRepeatComponent setFrequencyMax(int value) {
        if (this.frequencyMax == null)
            this.frequencyMax = new IntegerType();
        this.frequencyMax.setValue(value);
        return this;
    }

    /**
     * @return {@link #period} (Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period.). This is the underlying object with id, value and extensions. The accessor "getPeriod" gives direct access to the value
     */
    public DecimalType getPeriodElement() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TimingRepeatComponent.period");
            else if (Configuration.doAutoCreate())
                // bb
                this.period = new DecimalType();
        return this.period;
    }

    public boolean hasPeriodElement() {
        return this.period != null && !this.period.isEmpty();
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period.). This is the underlying object with id, value and extensions. The accessor "getPeriod" gives direct access to the value
     */
    public TimingRepeatComponent setPeriodElement(DecimalType value) {
        this.period = value;
        return this;
    }

    /**
     * @return Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period.
     */
    public BigDecimal getPeriod() {
        return this.period == null ? null : this.period.getValue();
    }

    /**
     * @param value Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period.
     */
    public TimingRepeatComponent setPeriod(BigDecimal value) {
        if (value == null)
            this.period = null;
        else {
            if (this.period == null)
                this.period = new DecimalType();
            this.period.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #periodMax} (If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.). This is the underlying object with id, value and extensions. The accessor "getPeriodMax" gives direct access to the value
     */
    public DecimalType getPeriodMaxElement() {
        if (this.periodMax == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TimingRepeatComponent.periodMax");
            else if (Configuration.doAutoCreate())
                // bb
                this.periodMax = new DecimalType();
        return this.periodMax;
    }

    public boolean hasPeriodMaxElement() {
        return this.periodMax != null && !this.periodMax.isEmpty();
    }

    public boolean hasPeriodMax() {
        return this.periodMax != null && !this.periodMax.isEmpty();
    }

    /**
     * @param value {@link #periodMax} (If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.). This is the underlying object with id, value and extensions. The accessor "getPeriodMax" gives direct access to the value
     */
    public TimingRepeatComponent setPeriodMaxElement(DecimalType value) {
        this.periodMax = value;
        return this;
    }

    /**
     * @return If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.
     */
    public BigDecimal getPeriodMax() {
        return this.periodMax == null ? null : this.periodMax.getValue();
    }

    /**
     * @param value If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.
     */
    public TimingRepeatComponent setPeriodMax(BigDecimal value) {
        if (value == null)
            this.periodMax = null;
        else {
            if (this.periodMax == null)
                this.periodMax = new DecimalType();
            this.periodMax.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #periodUnits} (The units of time for the period in UCUM units.). This is the underlying object with id, value and extensions. The accessor "getPeriodUnits" gives direct access to the value
     */
    public Enumeration<UnitsOfTime> getPeriodUnitsElement() {
        if (this.periodUnits == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TimingRepeatComponent.periodUnits");
            else if (Configuration.doAutoCreate())
                // bb
                this.periodUnits = new Enumeration<UnitsOfTime>(new UnitsOfTimeEnumFactory());
        return this.periodUnits;
    }

    public boolean hasPeriodUnitsElement() {
        return this.periodUnits != null && !this.periodUnits.isEmpty();
    }

    public boolean hasPeriodUnits() {
        return this.periodUnits != null && !this.periodUnits.isEmpty();
    }

    /**
     * @param value {@link #periodUnits} (The units of time for the period in UCUM units.). This is the underlying object with id, value and extensions. The accessor "getPeriodUnits" gives direct access to the value
     */
    public TimingRepeatComponent setPeriodUnitsElement(Enumeration<UnitsOfTime> value) {
        this.periodUnits = value;
        return this;
    }

    /**
     * @return The units of time for the period in UCUM units.
     */
    public UnitsOfTime getPeriodUnits() {
        return this.periodUnits == null ? null : this.periodUnits.getValue();
    }

    /**
     * @param value The units of time for the period in UCUM units.
     */
    public TimingRepeatComponent setPeriodUnits(UnitsOfTime value) {
        if (value == null)
            this.periodUnits = null;
        else {
            if (this.periodUnits == null)
                this.periodUnits = new Enumeration<UnitsOfTime>(new UnitsOfTimeEnumFactory());
            this.periodUnits.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #when} (A real world event that the occurrence of the event should be tied to.). This is the underlying object with id, value and extensions. The accessor "getWhen" gives direct access to the value
     */
    public Enumeration<EventTiming> getWhenElement() {
        if (this.when == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TimingRepeatComponent.when");
            else if (Configuration.doAutoCreate())
                // bb
                this.when = new Enumeration<EventTiming>(new EventTimingEnumFactory());
        return this.when;
    }

    public boolean hasWhenElement() {
        return this.when != null && !this.when.isEmpty();
    }

    public boolean hasWhen() {
        return this.when != null && !this.when.isEmpty();
    }

    /**
     * @param value {@link #when} (A real world event that the occurrence of the event should be tied to.). This is the underlying object with id, value and extensions. The accessor "getWhen" gives direct access to the value
     */
    public TimingRepeatComponent setWhenElement(Enumeration<EventTiming> value) {
        this.when = value;
        return this;
    }

    /**
     * @return A real world event that the occurrence of the event should be tied to.
     */
    public EventTiming getWhen() {
        return this.when == null ? null : this.when.getValue();
    }

    /**
     * @param value A real world event that the occurrence of the event should be tied to.
     */
    public TimingRepeatComponent setWhen(EventTiming value) {
        if (value == null)
            this.when = null;
        else {
            if (this.when == null)
                this.when = new Enumeration<EventTiming>(new EventTimingEnumFactory());
            this.when.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("bounds[x]", "Duration|Range|Period", "Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.", 0, java.lang.Integer.MAX_VALUE, bounds));
        childrenList.add(new Property("count", "integer", "A total count of the desired number of repetitions.", 0, java.lang.Integer.MAX_VALUE, count));
        childrenList.add(new Property("duration", "decimal", "How long this thing happens for when it happens.", 0, java.lang.Integer.MAX_VALUE, duration));
        childrenList.add(new Property("durationMax", "decimal", "The upper limit of how long this thing happens for when it happens.", 0, java.lang.Integer.MAX_VALUE, durationMax));
        childrenList.add(new Property("durationUnits", "code", "The units of time for the duration, in UCUM units.", 0, java.lang.Integer.MAX_VALUE, durationUnits));
        childrenList.add(new Property("frequency", "integer", "The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided).", 0, java.lang.Integer.MAX_VALUE, frequency));
        childrenList.add(new Property("frequencyMax", "integer", "If present, indicates that the frequency is a range - so repeat between [frequency] and [frequencyMax] times within the period or period range.", 0, java.lang.Integer.MAX_VALUE, frequencyMax));
        childrenList.add(new Property("period", "decimal", "Indicates the duration of time over which repetitions are to occur; e.g. to express \"3 times per day\", 3 would be the frequency and \"1 day\" would be the period.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("periodMax", "decimal", "If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \"do this once every 3-5 days.", 0, java.lang.Integer.MAX_VALUE, periodMax));
        childrenList.add(new Property("periodUnits", "code", "The units of time for the period in UCUM units.", 0, java.lang.Integer.MAX_VALUE, periodUnits));
        childrenList.add(new Property("when", "code", "A real world event that the occurrence of the event should be tied to.", 0, java.lang.Integer.MAX_VALUE, when));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("bounds[x]"))
            // Type
            this.bounds = (Type) value;
        else if (name.equals("count"))
            // IntegerType
            this.count = castToInteger(value);
        else if (name.equals("duration"))
            // DecimalType
            this.duration = castToDecimal(value);
        else if (name.equals("durationMax"))
            // DecimalType
            this.durationMax = castToDecimal(value);
        else if (name.equals("durationUnits"))
            // Enumeration<UnitsOfTime>
            this.durationUnits = new UnitsOfTimeEnumFactory().fromType(value);
        else if (name.equals("frequency"))
            // IntegerType
            this.frequency = castToInteger(value);
        else if (name.equals("frequencyMax"))
            // IntegerType
            this.frequencyMax = castToInteger(value);
        else if (name.equals("period"))
            // DecimalType
            this.period = castToDecimal(value);
        else if (name.equals("periodMax"))
            // DecimalType
            this.periodMax = castToDecimal(value);
        else if (name.equals("periodUnits"))
            // Enumeration<UnitsOfTime>
            this.periodUnits = new UnitsOfTimeEnumFactory().fromType(value);
        else if (name.equals("when"))
            // Enumeration<EventTiming>
            this.when = new EventTimingEnumFactory().fromType(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("boundsDuration")) {
            this.bounds = new Duration();
            return this.bounds;
        } else if (name.equals("boundsRange")) {
            this.bounds = new Range();
            return this.bounds;
        } else if (name.equals("boundsPeriod")) {
            this.bounds = new Period();
            return this.bounds;
        } else if (name.equals("count")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.count");
        } else if (name.equals("duration")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.duration");
        } else if (name.equals("durationMax")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.durationMax");
        } else if (name.equals("durationUnits")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.durationUnits");
        } else if (name.equals("frequency")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.frequency");
        } else if (name.equals("frequencyMax")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.frequencyMax");
        } else if (name.equals("period")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.period");
        } else if (name.equals("periodMax")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.periodMax");
        } else if (name.equals("periodUnits")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.periodUnits");
        } else if (name.equals("when")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.when");
        } else
            return super.addChild(name);
    }

    public TimingRepeatComponent copy() {
        TimingRepeatComponent dst = new TimingRepeatComponent();
        copyValues(dst);
        dst.bounds = bounds == null ? null : bounds.copy();
        dst.count = count == null ? null : count.copy();
        dst.duration = duration == null ? null : duration.copy();
        dst.durationMax = durationMax == null ? null : durationMax.copy();
        dst.durationUnits = durationUnits == null ? null : durationUnits.copy();
        dst.frequency = frequency == null ? null : frequency.copy();
        dst.frequencyMax = frequencyMax == null ? null : frequencyMax.copy();
        dst.period = period == null ? null : period.copy();
        dst.periodMax = periodMax == null ? null : periodMax.copy();
        dst.periodUnits = periodUnits == null ? null : periodUnits.copy();
        dst.when = when == null ? null : when.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TimingRepeatComponent))
            return false;
        TimingRepeatComponent o = (TimingRepeatComponent) other;
        return compareDeep(bounds, o.bounds, true) && compareDeep(count, o.count, true) && compareDeep(duration, o.duration, true) && compareDeep(durationMax, o.durationMax, true) && compareDeep(durationUnits, o.durationUnits, true) && compareDeep(frequency, o.frequency, true) && compareDeep(frequencyMax, o.frequencyMax, true) && compareDeep(period, o.period, true) && compareDeep(periodMax, o.periodMax, true) && compareDeep(periodUnits, o.periodUnits, true) && compareDeep(when, o.when, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TimingRepeatComponent))
            return false;
        TimingRepeatComponent o = (TimingRepeatComponent) other;
        return compareValues(count, o.count, true) && compareValues(duration, o.duration, true) && compareValues(durationMax, o.durationMax, true) && compareValues(durationUnits, o.durationUnits, true) && compareValues(frequency, o.frequency, true) && compareValues(frequencyMax, o.frequencyMax, true) && compareValues(period, o.period, true) && compareValues(periodMax, o.periodMax, true) && compareValues(periodUnits, o.periodUnits, true) && compareValues(when, o.when, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (bounds == null || bounds.isEmpty()) && (count == null || count.isEmpty()) && (duration == null || duration.isEmpty()) && (durationMax == null || durationMax.isEmpty()) && (durationUnits == null || durationUnits.isEmpty()) && (frequency == null || frequency.isEmpty()) && (frequencyMax == null || frequencyMax.isEmpty()) && (period == null || period.isEmpty()) && (periodMax == null || periodMax.isEmpty()) && (periodUnits == null || periodUnits.isEmpty()) && (when == null || when.isEmpty());
    }

    public String fhirType() {
        return "Timing.repeat";
    }
}
