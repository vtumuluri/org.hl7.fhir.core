package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.SpecimenEnum.SpecimenStatus;
import org.hl7.fhir.android.generated.dstu2.SpecimenEnum.SpecimenStatusEnumFactory;

public class SpecimenCollectionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Person who collected the specimen.
     */
    protected Reference collector;

    /**
     * The actual object that is the target of the reference (Person who collected the specimen.)
     */
    protected Practitioner collectorTarget;

    /**
     * To communicate any details or issues encountered during the specimen collection procedure.
     */
    protected List<StringType> comment;

    /**
     * Time when specimen was collected from subject - the physiologically relevant time.
     */
    protected Type collected;

    /**
     * The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.
     */
    protected SimpleQuantity quantity;

    /**
     * A coded value specifying the technique that is used to perform the procedure.
     */
    protected CodeableConcept method;

    /**
     * Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.
     */
    protected CodeableConcept bodySite;

    private static final long serialVersionUID = -1418734687L;

    /*
     * Constructor
     */
    public SpecimenCollectionComponent() {
        super();
    }

    /**
     * @return {@link #collector} (Person who collected the specimen.)
     */
    public Reference getCollector() {
        if (this.collector == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenCollectionComponent.collector");
            else if (Configuration.doAutoCreate())
                // cc
                this.collector = new Reference();
        return this.collector;
    }

    public boolean hasCollector() {
        return this.collector != null && !this.collector.isEmpty();
    }

    /**
     * @param value {@link #collector} (Person who collected the specimen.)
     */
    public SpecimenCollectionComponent setCollector(Reference value) {
        this.collector = value;
        return this;
    }

    /**
     * @return {@link #collector} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Person who collected the specimen.)
     */
    public Practitioner getCollectorTarget() {
        if (this.collectorTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenCollectionComponent.collector");
            else if (Configuration.doAutoCreate())
                // aa
                this.collectorTarget = new Practitioner();
        return this.collectorTarget;
    }

    /**
     * @param value {@link #collector} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Person who collected the specimen.)
     */
    public SpecimenCollectionComponent setCollectorTarget(Practitioner value) {
        this.collectorTarget = value;
        return this;
    }

    /**
     * @return {@link #comment} (To communicate any details or issues encountered during the specimen collection procedure.)
     */
    public List<StringType> getComment() {
        if (this.comment == null)
            this.comment = new ArrayList<StringType>();
        return this.comment;
    }

    public boolean hasComment() {
        if (this.comment == null)
            return false;
        for (StringType item : this.comment) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public StringType addCommentElement() {
        // 2
        StringType t = new StringType();
        if (this.comment == null)
            this.comment = new ArrayList<StringType>();
        this.comment.add(t);
        return t;
    }

    /**
     * @param value {@link #comment} (To communicate any details or issues encountered during the specimen collection procedure.)
     */
    public SpecimenCollectionComponent addComment(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.comment == null)
            this.comment = new ArrayList<StringType>();
        this.comment.add(t);
        return this;
    }

    /**
     * @param value {@link #comment} (To communicate any details or issues encountered during the specimen collection procedure.)
     */
    public boolean hasComment(String value) {
        if (this.comment == null)
            return false;
        for (StringType v : this.comment) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #collected} (Time when specimen was collected from subject - the physiologically relevant time.)
     */
    public Type getCollected() {
        return this.collected;
    }

    /**
     * @return {@link #collected} (Time when specimen was collected from subject - the physiologically relevant time.)
     */
    public DateTimeType getCollectedDateTimeType() throws FHIRException {
        if (!(this.collected instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.collected.getClass().getName() + " was encountered");
        return (DateTimeType) this.collected;
    }

    public boolean hasCollectedDateTimeType() {
        return this.collected instanceof DateTimeType;
    }

    /**
     * @return {@link #collected} (Time when specimen was collected from subject - the physiologically relevant time.)
     */
    public Period getCollectedPeriod() throws FHIRException {
        if (!(this.collected instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.collected.getClass().getName() + " was encountered");
        return (Period) this.collected;
    }

    public boolean hasCollectedPeriod() {
        return this.collected instanceof Period;
    }

    public boolean hasCollected() {
        return this.collected != null && !this.collected.isEmpty();
    }

    /**
     * @param value {@link #collected} (Time when specimen was collected from subject - the physiologically relevant time.)
     */
    public SpecimenCollectionComponent setCollected(Type value) {
        this.collected = value;
        return this;
    }

    /**
     * @return {@link #quantity} (The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenCollectionComponent.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.)
     */
    public SpecimenCollectionComponent setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #method} (A coded value specifying the technique that is used to perform the procedure.)
     */
    public CodeableConcept getMethod() {
        if (this.method == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenCollectionComponent.method");
            else if (Configuration.doAutoCreate())
                // cc
                this.method = new CodeableConcept();
        return this.method;
    }

    public boolean hasMethod() {
        return this.method != null && !this.method.isEmpty();
    }

    /**
     * @param value {@link #method} (A coded value specifying the technique that is used to perform the procedure.)
     */
    public SpecimenCollectionComponent setMethod(CodeableConcept value) {
        this.method = value;
        return this;
    }

    /**
     * @return {@link #bodySite} (Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.)
     */
    public CodeableConcept getBodySite() {
        if (this.bodySite == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SpecimenCollectionComponent.bodySite");
            else if (Configuration.doAutoCreate())
                // cc
                this.bodySite = new CodeableConcept();
        return this.bodySite;
    }

    public boolean hasBodySite() {
        return this.bodySite != null && !this.bodySite.isEmpty();
    }

    /**
     * @param value {@link #bodySite} (Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.)
     */
    public SpecimenCollectionComponent setBodySite(CodeableConcept value) {
        this.bodySite = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("collector", "Reference(Practitioner)", "Person who collected the specimen.", 0, java.lang.Integer.MAX_VALUE, collector));
        childrenList.add(new Property("comment", "string", "To communicate any details or issues encountered during the specimen collection procedure.", 0, java.lang.Integer.MAX_VALUE, comment));
        childrenList.add(new Property("collected[x]", "dateTime|Period", "Time when specimen was collected from subject - the physiologically relevant time.", 0, java.lang.Integer.MAX_VALUE, collected));
        childrenList.add(new Property("quantity", "SimpleQuantity", "The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("method", "CodeableConcept", "A coded value specifying the technique that is used to perform the procedure.", 0, java.lang.Integer.MAX_VALUE, method));
        childrenList.add(new Property("bodySite", "CodeableConcept", "Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.", 0, java.lang.Integer.MAX_VALUE, bodySite));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("collector"))
            // Reference
            this.collector = castToReference(value);
        else if (name.equals("comment"))
            this.getComment().add(castToString(value));
        else if (name.equals("collected[x]"))
            // Type
            this.collected = (Type) value;
        else if (name.equals("quantity"))
            // SimpleQuantity
            this.quantity = castToSimpleQuantity(value);
        else if (name.equals("method"))
            // CodeableConcept
            this.method = castToCodeableConcept(value);
        else if (name.equals("bodySite"))
            // CodeableConcept
            this.bodySite = castToCodeableConcept(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("collector")) {
            this.collector = new Reference();
            return this.collector;
        } else if (name.equals("comment")) {
            throw new FHIRException("Cannot call addChild on a primitive type Specimen.comment");
        } else if (name.equals("collectedDateTime")) {
            this.collected = new DateTimeType();
            return this.collected;
        } else if (name.equals("collectedPeriod")) {
            this.collected = new Period();
            return this.collected;
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else if (name.equals("method")) {
            this.method = new CodeableConcept();
            return this.method;
        } else if (name.equals("bodySite")) {
            this.bodySite = new CodeableConcept();
            return this.bodySite;
        } else
            return super.addChild(name);
    }

    public SpecimenCollectionComponent copy() {
        SpecimenCollectionComponent dst = new SpecimenCollectionComponent();
        copyValues(dst);
        dst.collector = collector == null ? null : collector.copy();
        if (comment != null) {
            dst.comment = new ArrayList<StringType>();
            for (StringType i : comment) dst.comment.add(i.copy());
        }
        ;
        dst.collected = collected == null ? null : collected.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.method = method == null ? null : method.copy();
        dst.bodySite = bodySite == null ? null : bodySite.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SpecimenCollectionComponent))
            return false;
        SpecimenCollectionComponent o = (SpecimenCollectionComponent) other;
        return compareDeep(collector, o.collector, true) && compareDeep(comment, o.comment, true) && compareDeep(collected, o.collected, true) && compareDeep(quantity, o.quantity, true) && compareDeep(method, o.method, true) && compareDeep(bodySite, o.bodySite, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SpecimenCollectionComponent))
            return false;
        SpecimenCollectionComponent o = (SpecimenCollectionComponent) other;
        return compareValues(comment, o.comment, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (collector == null || collector.isEmpty()) && (comment == null || comment.isEmpty()) && (collected == null || collected.isEmpty()) && (quantity == null || quantity.isEmpty()) && (method == null || method.isEmpty()) && (bodySite == null || bodySite.isEmpty());
    }

    public String fhirType() {
        return "Specimen.collection";
    }
}
