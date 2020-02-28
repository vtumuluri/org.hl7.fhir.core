package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationStatus;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationRelationshipType;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationRelationshipTypeEnumFactory;

public class ObservationComponentComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Describes what was observed. Sometimes this is called the observation "code".
     */
    protected CodeableConcept code;

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     */
    protected Type value;

    /**
     * Provides a reason why the expected value in the element Observation.value[x] is missing.
     */
    protected CodeableConcept dataAbsentReason;

    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.
     */
    protected List<ObservationReferenceRangeComponent> referenceRange;

    private static final long serialVersionUID = 946602904L;

    /*
     * Constructor
     */
    public ObservationComponentComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ObservationComponentComponent(CodeableConcept code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #code} (Describes what was observed. Sometimes this is called the observation "code".)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ObservationComponentComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Describes what was observed. Sometimes this is called the observation "code".)
     */
    public ObservationComponentComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Type getValue() {
        return this.value;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Quantity getValueQuantity() throws FHIRException {
        if (!(this.value instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Quantity) this.value;
    }

    public boolean hasValueQuantity() {
        return this.value instanceof Quantity;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public CodeableConcept getValueCodeableConcept() throws FHIRException {
        if (!(this.value instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.value.getClass().getName() + " was encountered");
        return (CodeableConcept) this.value;
    }

    public boolean hasValueCodeableConcept() {
        return this.value instanceof CodeableConcept;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public StringType getValueStringType() throws FHIRException {
        if (!(this.value instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (StringType) this.value;
    }

    public boolean hasValueStringType() {
        return this.value instanceof StringType;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Range getValueRange() throws FHIRException {
        if (!(this.value instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Range) this.value;
    }

    public boolean hasValueRange() {
        return this.value instanceof Range;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Ratio getValueRatio() throws FHIRException {
        if (!(this.value instanceof Ratio))
            throw new FHIRException("Type mismatch: the type Ratio was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Ratio) this.value;
    }

    public boolean hasValueRatio() {
        return this.value instanceof Ratio;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public SampledData getValueSampledData() throws FHIRException {
        if (!(this.value instanceof SampledData))
            throw new FHIRException("Type mismatch: the type SampledData was expected, but " + this.value.getClass().getName() + " was encountered");
        return (SampledData) this.value;
    }

    public boolean hasValueSampledData() {
        return this.value instanceof SampledData;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Attachment getValueAttachment() throws FHIRException {
        if (!(this.value instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Attachment) this.value;
    }

    public boolean hasValueAttachment() {
        return this.value instanceof Attachment;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public TimeType getValueTimeType() throws FHIRException {
        if (!(this.value instanceof TimeType))
            throw new FHIRException("Type mismatch: the type TimeType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (TimeType) this.value;
    }

    public boolean hasValueTimeType() {
        return this.value instanceof TimeType;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public DateTimeType getValueDateTimeType() throws FHIRException {
        if (!(this.value instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (DateTimeType) this.value;
    }

    public boolean hasValueDateTimeType() {
        return this.value instanceof DateTimeType;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Period getValuePeriod() throws FHIRException {
        if (!(this.value instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Period) this.value;
    }

    public boolean hasValuePeriod() {
        return this.value instanceof Period;
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public ObservationComponentComponent setValue(Type value) {
        this.value = value;
        return this;
    }

    /**
     * @return {@link #dataAbsentReason} (Provides a reason why the expected value in the element Observation.value[x] is missing.)
     */
    public CodeableConcept getDataAbsentReason() {
        if (this.dataAbsentReason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ObservationComponentComponent.dataAbsentReason");
            else if (Configuration.doAutoCreate())
                // cc
                this.dataAbsentReason = new CodeableConcept();
        return this.dataAbsentReason;
    }

    public boolean hasDataAbsentReason() {
        return this.dataAbsentReason != null && !this.dataAbsentReason.isEmpty();
    }

    /**
     * @param value {@link #dataAbsentReason} (Provides a reason why the expected value in the element Observation.value[x] is missing.)
     */
    public ObservationComponentComponent setDataAbsentReason(CodeableConcept value) {
        this.dataAbsentReason = value;
        return this;
    }

    /**
     * @return {@link #referenceRange} (Guidance on how to interpret the value by comparison to a normal or recommended range.)
     */
    public List<ObservationReferenceRangeComponent> getReferenceRange() {
        if (this.referenceRange == null)
            this.referenceRange = new ArrayList<ObservationReferenceRangeComponent>();
        return this.referenceRange;
    }

    public boolean hasReferenceRange() {
        if (this.referenceRange == null)
            return false;
        for (ObservationReferenceRangeComponent item : this.referenceRange) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ObservationReferenceRangeComponent addReferenceRange() {
        // 3
        ObservationReferenceRangeComponent t = new ObservationReferenceRangeComponent();
        if (this.referenceRange == null)
            this.referenceRange = new ArrayList<ObservationReferenceRangeComponent>();
        this.referenceRange.add(t);
        return t;
    }

    // syntactic sugar
    public ObservationComponentComponent addReferenceRange(ObservationReferenceRangeComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.referenceRange == null)
            this.referenceRange = new ArrayList<ObservationReferenceRangeComponent>();
        this.referenceRange.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "Describes what was observed. Sometimes this is called the observation \"code\".", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("value[x]", "Quantity|CodeableConcept|string|Range|Ratio|SampledData|Attachment|time|dateTime|Period", "The information determined as a result of making the observation, if the information has a simple value.", 0, java.lang.Integer.MAX_VALUE, value));
        childrenList.add(new Property("dataAbsentReason", "CodeableConcept", "Provides a reason why the expected value in the element Observation.value[x] is missing.", 0, java.lang.Integer.MAX_VALUE, dataAbsentReason));
        childrenList.add(new Property("referenceRange", "@Observation.referenceRange", "Guidance on how to interpret the value by comparison to a normal or recommended range.", 0, java.lang.Integer.MAX_VALUE, referenceRange));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("value[x]"))
            // Type
            this.value = (Type) value;
        else if (name.equals("dataAbsentReason"))
            // CodeableConcept
            this.dataAbsentReason = castToCodeableConcept(value);
        else if (name.equals("referenceRange"))
            this.getReferenceRange().add((ObservationReferenceRangeComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("valueQuantity")) {
            this.value = new Quantity();
            return this.value;
        } else if (name.equals("valueCodeableConcept")) {
            this.value = new CodeableConcept();
            return this.value;
        } else if (name.equals("valueString")) {
            this.value = new StringType();
            return this.value;
        } else if (name.equals("valueRange")) {
            this.value = new Range();
            return this.value;
        } else if (name.equals("valueRatio")) {
            this.value = new Ratio();
            return this.value;
        } else if (name.equals("valueSampledData")) {
            this.value = new SampledData();
            return this.value;
        } else if (name.equals("valueAttachment")) {
            this.value = new Attachment();
            return this.value;
        } else if (name.equals("valueTime")) {
            this.value = new TimeType();
            return this.value;
        } else if (name.equals("valueDateTime")) {
            this.value = new DateTimeType();
            return this.value;
        } else if (name.equals("valuePeriod")) {
            this.value = new Period();
            return this.value;
        } else if (name.equals("dataAbsentReason")) {
            this.dataAbsentReason = new CodeableConcept();
            return this.dataAbsentReason;
        } else if (name.equals("referenceRange")) {
            return addReferenceRange();
        } else
            return super.addChild(name);
    }

    public ObservationComponentComponent copy() {
        ObservationComponentComponent dst = new ObservationComponentComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.value = value == null ? null : value.copy();
        dst.dataAbsentReason = dataAbsentReason == null ? null : dataAbsentReason.copy();
        if (referenceRange != null) {
            dst.referenceRange = new ArrayList<ObservationReferenceRangeComponent>();
            for (ObservationReferenceRangeComponent i : referenceRange) dst.referenceRange.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ObservationComponentComponent))
            return false;
        ObservationComponentComponent o = (ObservationComponentComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(value, o.value, true) && compareDeep(dataAbsentReason, o.dataAbsentReason, true) && compareDeep(referenceRange, o.referenceRange, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ObservationComponentComponent))
            return false;
        ObservationComponentComponent o = (ObservationComponentComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (value == null || value.isEmpty()) && (dataAbsentReason == null || dataAbsentReason.isEmpty()) && (referenceRange == null || referenceRange.isEmpty());
    }

    public String fhirType() {
        return "Observation.component";
    }
}
