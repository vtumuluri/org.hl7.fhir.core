package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.GroupEnum.GroupType;
import org.hl7.fhir.android.generated.dstu2.GroupEnum.GroupTypeEnumFactory;

public class GroupCharacteristicComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A code that identifies the kind of trait being asserted.
     */
    protected CodeableConcept code;

    /**
     * The value of the trait that holds (or does not hold - see 'exclude') for members of the group.
     */
    protected Type value;

    /**
     * If true, indicates the characteristic is one that is NOT held by members of the group.
     */
    protected BooleanType exclude;

    /**
     * The period over which the characteristic is tested; e.g. the patient had an operation during the month of June.
     */
    protected Period period;

    private static final long serialVersionUID = -1000688967L;

    /*
     * Constructor
     */
    public GroupCharacteristicComponent() {
        super();
    }

    /*
     * Constructor
     */
    public GroupCharacteristicComponent(CodeableConcept code, Type value, BooleanType exclude) {
        super();
        this.code = code;
        this.value = value;
        this.exclude = exclude;
    }

    /**
     * @return {@link #code} (A code that identifies the kind of trait being asserted.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create GroupCharacteristicComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A code that identifies the kind of trait being asserted.)
     */
    public GroupCharacteristicComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #value} (The value of the trait that holds (or does not hold - see 'exclude') for members of the group.)
     */
    public Type getValue() {
        return this.value;
    }

    /**
     * @return {@link #value} (The value of the trait that holds (or does not hold - see 'exclude') for members of the group.)
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
     * @return {@link #value} (The value of the trait that holds (or does not hold - see 'exclude') for members of the group.)
     */
    public BooleanType getValueBooleanType() throws FHIRException {
        if (!(this.value instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (BooleanType) this.value;
    }

    public boolean hasValueBooleanType() {
        return this.value instanceof BooleanType;
    }

    /**
     * @return {@link #value} (The value of the trait that holds (or does not hold - see 'exclude') for members of the group.)
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
     * @return {@link #value} (The value of the trait that holds (or does not hold - see 'exclude') for members of the group.)
     */
    public Range getValueRange() throws FHIRException {
        if (!(this.value instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Range) this.value;
    }

    public boolean hasValueRange() {
        return this.value instanceof Range;
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The value of the trait that holds (or does not hold - see 'exclude') for members of the group.)
     */
    public GroupCharacteristicComponent setValue(Type value) {
        this.value = value;
        return this;
    }

    /**
     * @return {@link #exclude} (If true, indicates the characteristic is one that is NOT held by members of the group.). This is the underlying object with id, value and extensions. The accessor "getExclude" gives direct access to the value
     */
    public BooleanType getExcludeElement() {
        if (this.exclude == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create GroupCharacteristicComponent.exclude");
            else if (Configuration.doAutoCreate())
                // bb
                this.exclude = new BooleanType();
        return this.exclude;
    }

    public boolean hasExcludeElement() {
        return this.exclude != null && !this.exclude.isEmpty();
    }

    public boolean hasExclude() {
        return this.exclude != null && !this.exclude.isEmpty();
    }

    /**
     * @param value {@link #exclude} (If true, indicates the characteristic is one that is NOT held by members of the group.). This is the underlying object with id, value and extensions. The accessor "getExclude" gives direct access to the value
     */
    public GroupCharacteristicComponent setExcludeElement(BooleanType value) {
        this.exclude = value;
        return this;
    }

    /**
     * @return If true, indicates the characteristic is one that is NOT held by members of the group.
     */
    public boolean getExclude() {
        return this.exclude == null || this.exclude.isEmpty() ? false : this.exclude.getValue();
    }

    /**
     * @param value If true, indicates the characteristic is one that is NOT held by members of the group.
     */
    public GroupCharacteristicComponent setExclude(boolean value) {
        if (this.exclude == null)
            this.exclude = new BooleanType();
        this.exclude.setValue(value);
        return this;
    }

    /**
     * @return {@link #period} (The period over which the characteristic is tested; e.g. the patient had an operation during the month of June.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create GroupCharacteristicComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period over which the characteristic is tested; e.g. the patient had an operation during the month of June.)
     */
    public GroupCharacteristicComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "A code that identifies the kind of trait being asserted.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("value[x]", "CodeableConcept|boolean|Quantity|Range", "The value of the trait that holds (or does not hold - see 'exclude') for members of the group.", 0, java.lang.Integer.MAX_VALUE, value));
        childrenList.add(new Property("exclude", "boolean", "If true, indicates the characteristic is one that is NOT held by members of the group.", 0, java.lang.Integer.MAX_VALUE, exclude));
        childrenList.add(new Property("period", "Period", "The period over which the characteristic is tested; e.g. the patient had an operation during the month of June.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("value[x]"))
            // Type
            this.value = (Type) value;
        else if (name.equals("exclude"))
            // BooleanType
            this.exclude = castToBoolean(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("valueCodeableConcept")) {
            this.value = new CodeableConcept();
            return this.value;
        } else if (name.equals("valueBoolean")) {
            this.value = new BooleanType();
            return this.value;
        } else if (name.equals("valueQuantity")) {
            this.value = new Quantity();
            return this.value;
        } else if (name.equals("valueRange")) {
            this.value = new Range();
            return this.value;
        } else if (name.equals("exclude")) {
            throw new FHIRException("Cannot call addChild on a primitive type Group.exclude");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public GroupCharacteristicComponent copy() {
        GroupCharacteristicComponent dst = new GroupCharacteristicComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.value = value == null ? null : value.copy();
        dst.exclude = exclude == null ? null : exclude.copy();
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof GroupCharacteristicComponent))
            return false;
        GroupCharacteristicComponent o = (GroupCharacteristicComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(value, o.value, true) && compareDeep(exclude, o.exclude, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof GroupCharacteristicComponent))
            return false;
        GroupCharacteristicComponent o = (GroupCharacteristicComponent) other;
        return compareValues(exclude, o.exclude, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (value == null || value.isEmpty()) && (exclude == null || exclude.isEmpty()) && (period == null || period.isEmpty());
    }

    public String fhirType() {
        return "Group.characteristic";
    }
}
