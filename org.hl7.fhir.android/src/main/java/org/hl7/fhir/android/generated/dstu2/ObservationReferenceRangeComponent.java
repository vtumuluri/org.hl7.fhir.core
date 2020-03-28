package org.hl7.fhir.android.generated.dstu2;

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

public class ObservationReferenceRangeComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3).
     */
    protected SimpleQuantity low;

    /**
     * The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3).
     */
    protected SimpleQuantity high;

    /**
     * Code for the meaning of the reference range.
     */
    protected CodeableConcept meaning;

    /**
     * The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.
     */
    protected Range age;

    /**
     * Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of 'normals'.
     */
    protected StringType text;

    private static final long serialVersionUID = -238694788L;

    /*
     * Constructor
     */
    public ObservationReferenceRangeComponent() {
        super();
    }

    /**
     * @return {@link #low} (The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3).)
     */
    public SimpleQuantity getLow() {
        if (this.low == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ObservationReferenceRangeComponent.low");
            else if (Configuration.doAutoCreate())
                // cc
                this.low = new SimpleQuantity();
        return this.low;
    }

    public boolean hasLow() {
        return this.low != null && !this.low.isEmpty();
    }

    /**
     * @param value {@link #low} (The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3).)
     */
    public ObservationReferenceRangeComponent setLow(SimpleQuantity value) {
        this.low = value;
        return this;
    }

    /**
     * @return {@link #high} (The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3).)
     */
    public SimpleQuantity getHigh() {
        if (this.high == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ObservationReferenceRangeComponent.high");
            else if (Configuration.doAutoCreate())
                // cc
                this.high = new SimpleQuantity();
        return this.high;
    }

    public boolean hasHigh() {
        return this.high != null && !this.high.isEmpty();
    }

    /**
     * @param value {@link #high} (The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3).)
     */
    public ObservationReferenceRangeComponent setHigh(SimpleQuantity value) {
        this.high = value;
        return this;
    }

    /**
     * @return {@link #meaning} (Code for the meaning of the reference range.)
     */
    public CodeableConcept getMeaning() {
        if (this.meaning == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ObservationReferenceRangeComponent.meaning");
            else if (Configuration.doAutoCreate())
                // cc
                this.meaning = new CodeableConcept();
        return this.meaning;
    }

    public boolean hasMeaning() {
        return this.meaning != null && !this.meaning.isEmpty();
    }

    /**
     * @param value {@link #meaning} (Code for the meaning of the reference range.)
     */
    public ObservationReferenceRangeComponent setMeaning(CodeableConcept value) {
        this.meaning = value;
        return this;
    }

    /**
     * @return {@link #age} (The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.)
     */
    public Range getAge() {
        if (this.age == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ObservationReferenceRangeComponent.age");
            else if (Configuration.doAutoCreate())
                // cc
                this.age = new Range();
        return this.age;
    }

    public boolean hasAge() {
        return this.age != null && !this.age.isEmpty();
    }

    /**
     * @param value {@link #age} (The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.)
     */
    public ObservationReferenceRangeComponent setAge(Range value) {
        this.age = value;
        return this;
    }

    /**
     * @return {@link #text} (Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of 'normals'.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public StringType getTextElement() {
        if (this.text == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ObservationReferenceRangeComponent.text");
            else if (Configuration.doAutoCreate())
                // bb
                this.text = new StringType();
        return this.text;
    }

    public boolean hasTextElement() {
        return this.text != null && !this.text.isEmpty();
    }

    public boolean hasText() {
        return this.text != null && !this.text.isEmpty();
    }

    /**
     * @param value {@link #text} (Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of 'normals'.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public ObservationReferenceRangeComponent setTextElement(StringType value) {
        this.text = value;
        return this;
    }

    /**
     * @return Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of 'normals'.
     */
    public String getText() {
        return this.text == null ? null : this.text.getValue();
    }

    /**
     * @param value Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of 'normals'.
     */
    public ObservationReferenceRangeComponent setText(String value) {
        if (Utilities.noString(value))
            this.text = null;
        else {
            if (this.text == null)
                this.text = new StringType();
            this.text.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("low", "SimpleQuantity", "The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3).", 0, java.lang.Integer.MAX_VALUE, low));
        childrenList.add(new Property("high", "SimpleQuantity", "The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3).", 0, java.lang.Integer.MAX_VALUE, high));
        childrenList.add(new Property("meaning", "CodeableConcept", "Code for the meaning of the reference range.", 0, java.lang.Integer.MAX_VALUE, meaning));
        childrenList.add(new Property("age", "Range", "The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.", 0, java.lang.Integer.MAX_VALUE, age));
        childrenList.add(new Property("text", "string", "Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of \"Negative\" or a list or table of 'normals'.", 0, java.lang.Integer.MAX_VALUE, text));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("low"))
            // SimpleQuantity
            this.low = castToSimpleQuantity(value);
        else if (name.equals("high"))
            // SimpleQuantity
            this.high = castToSimpleQuantity(value);
        else if (name.equals("meaning"))
            // CodeableConcept
            this.meaning = castToCodeableConcept(value);
        else if (name.equals("age"))
            // Range
            this.age = castToRange(value);
        else if (name.equals("text"))
            // StringType
            this.text = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("low")) {
            this.low = new SimpleQuantity();
            return this.low;
        } else if (name.equals("high")) {
            this.high = new SimpleQuantity();
            return this.high;
        } else if (name.equals("meaning")) {
            this.meaning = new CodeableConcept();
            return this.meaning;
        } else if (name.equals("age")) {
            this.age = new Range();
            return this.age;
        } else if (name.equals("text")) {
            throw new FHIRException("Cannot call addChild on a primitive type Observation.text");
        } else
            return super.addChild(name);
    }

    public ObservationReferenceRangeComponent copy() {
        ObservationReferenceRangeComponent dst = new ObservationReferenceRangeComponent();
        copyValues(dst);
        dst.low = low == null ? null : low.copy();
        dst.high = high == null ? null : high.copy();
        dst.meaning = meaning == null ? null : meaning.copy();
        dst.age = age == null ? null : age.copy();
        dst.text = text == null ? null : text.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ObservationReferenceRangeComponent))
            return false;
        ObservationReferenceRangeComponent o = (ObservationReferenceRangeComponent) other;
        return compareDeep(low, o.low, true) && compareDeep(high, o.high, true) && compareDeep(meaning, o.meaning, true) && compareDeep(age, o.age, true) && compareDeep(text, o.text, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ObservationReferenceRangeComponent))
            return false;
        ObservationReferenceRangeComponent o = (ObservationReferenceRangeComponent) other;
        return compareValues(text, o.text, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (low == null || low.isEmpty()) && (high == null || high.isEmpty()) && (meaning == null || meaning.isEmpty()) && (age == null || age.isEmpty()) && (text == null || text.isEmpty());
    }

    public String fhirType() {
        return "Observation.referenceRange";
    }
}
