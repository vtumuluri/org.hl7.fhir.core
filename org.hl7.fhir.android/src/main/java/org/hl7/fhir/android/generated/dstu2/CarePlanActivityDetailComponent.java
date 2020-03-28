package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanActivityStatus;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanActivityStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanStatus;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanRelationship;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanRelationshipEnumFactory;

public class CarePlanActivityDetailComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * High-level categorization of the type of activity in a care plan.
     */
    protected CodeableConcept category;

    /**
     * Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter.
     */
    protected CodeableConcept code;

    /**
     * Provides the rationale that drove the inclusion of this particular activity as part of the plan.
     */
    protected List<CodeableConcept> reasonCode;

    /**
     * Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.
     */
    protected List<Reference> reasonReference;

    /**
     * The actual objects that are the target of the reference (Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.)
     */
    protected List<Condition> reasonReferenceTarget;

    /**
     * Internal reference that identifies the goals that this activity is intended to contribute towards meeting.
     */
    protected List<Reference> goal;

    /**
     * The actual objects that are the target of the reference (Internal reference that identifies the goals that this activity is intended to contribute towards meeting.)
     */
    protected List<Goal> goalTarget;

    /**
     * Identifies what progress is being made for the specific activity.
     */
    protected Enumeration<CarePlanActivityStatus> status;

    /**
     * Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.
     */
    protected CodeableConcept statusReason;

    /**
     * If true, indicates that the described activity is one that must NOT be engaged in when following the plan.
     */
    protected BooleanType prohibited;

    /**
     * The period, timing or frequency upon which the described activity is to occur.
     */
    protected Type scheduled;

    /**
     * Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
     */
    protected Reference location;

    /**
     * The actual object that is the target of the reference (Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.)
     */
    protected Location locationTarget;

    /**
     * Identifies who's expected to be involved in the activity.
     */
    protected List<Reference> performer;

    /**
     * The actual objects that are the target of the reference (Identifies who's expected to be involved in the activity.)
     */
    protected List<Resource> performerTarget;

    /**
     * Identifies the food, drug or other product to be consumed or supplied in the activity.
     */
    protected Type product;

    /**
     * Identifies the quantity expected to be consumed in a given day.
     */
    protected SimpleQuantity dailyAmount;

    /**
     * Identifies the quantity expected to be supplied, administered or consumed by the subject.
     */
    protected SimpleQuantity quantity;

    /**
     * This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
     */
    protected StringType description;

    private static final long serialVersionUID = -1763965702L;

    /*
     * Constructor
     */
    public CarePlanActivityDetailComponent() {
        super();
    }

    /*
     * Constructor
     */
    public CarePlanActivityDetailComponent(BooleanType prohibited) {
        super();
        this.prohibited = prohibited;
    }

    /**
     * @return {@link #category} (High-level categorization of the type of activity in a care plan.)
     */
    public CodeableConcept getCategory() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityDetailComponent.category");
            else if (Configuration.doAutoCreate())
                // cc
                this.category = new CodeableConcept();
        return this.category;
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (High-level categorization of the type of activity in a care plan.)
     */
    public CarePlanActivityDetailComponent setCategory(CodeableConcept value) {
        this.category = value;
        return this;
    }

    /**
     * @return {@link #code} (Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityDetailComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter.)
     */
    public CarePlanActivityDetailComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #reasonCode} (Provides the rationale that drove the inclusion of this particular activity as part of the plan.)
     */
    public List<CodeableConcept> getReasonCode() {
        if (this.reasonCode == null)
            this.reasonCode = new ArrayList<CodeableConcept>();
        return this.reasonCode;
    }

    public boolean hasReasonCode() {
        if (this.reasonCode == null)
            return false;
        for (CodeableConcept item : this.reasonCode) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addReasonCode() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.reasonCode == null)
            this.reasonCode = new ArrayList<CodeableConcept>();
        this.reasonCode.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlanActivityDetailComponent addReasonCode(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reasonCode == null)
            this.reasonCode = new ArrayList<CodeableConcept>();
        this.reasonCode.add(t);
        return this;
    }

    /**
     * @return {@link #reasonReference} (Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.)
     */
    public List<Reference> getReasonReference() {
        if (this.reasonReference == null)
            this.reasonReference = new ArrayList<Reference>();
        return this.reasonReference;
    }

    public boolean hasReasonReference() {
        if (this.reasonReference == null)
            return false;
        for (Reference item : this.reasonReference) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addReasonReference() {
        // 3
        Reference t = new Reference();
        if (this.reasonReference == null)
            this.reasonReference = new ArrayList<Reference>();
        this.reasonReference.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlanActivityDetailComponent addReasonReference(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.reasonReference == null)
            this.reasonReference = new ArrayList<Reference>();
        this.reasonReference.add(t);
        return this;
    }

    /**
     * @return {@link #reasonReference} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.)
     */
    public List<Condition> getReasonReferenceTarget() {
        if (this.reasonReferenceTarget == null)
            this.reasonReferenceTarget = new ArrayList<Condition>();
        return this.reasonReferenceTarget;
    }

    /**
     * @return {@link #reasonReference} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.)
     */
    public Condition addReasonReferenceTarget() {
        Condition r = new Condition();
        if (this.reasonReferenceTarget == null)
            this.reasonReferenceTarget = new ArrayList<Condition>();
        this.reasonReferenceTarget.add(r);
        return r;
    }

    /**
     * @return {@link #goal} (Internal reference that identifies the goals that this activity is intended to contribute towards meeting.)
     */
    public List<Reference> getGoal() {
        if (this.goal == null)
            this.goal = new ArrayList<Reference>();
        return this.goal;
    }

    public boolean hasGoal() {
        if (this.goal == null)
            return false;
        for (Reference item : this.goal) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addGoal() {
        // 3
        Reference t = new Reference();
        if (this.goal == null)
            this.goal = new ArrayList<Reference>();
        this.goal.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlanActivityDetailComponent addGoal(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.goal == null)
            this.goal = new ArrayList<Reference>();
        this.goal.add(t);
        return this;
    }

    /**
     * @return {@link #goal} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Internal reference that identifies the goals that this activity is intended to contribute towards meeting.)
     */
    public List<Goal> getGoalTarget() {
        if (this.goalTarget == null)
            this.goalTarget = new ArrayList<Goal>();
        return this.goalTarget;
    }

    /**
     * @return {@link #goal} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Internal reference that identifies the goals that this activity is intended to contribute towards meeting.)
     */
    public Goal addGoalTarget() {
        Goal r = new Goal();
        if (this.goalTarget == null)
            this.goalTarget = new ArrayList<Goal>();
        this.goalTarget.add(r);
        return r;
    }

    /**
     * @return {@link #status} (Identifies what progress is being made for the specific activity.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<CarePlanActivityStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityDetailComponent.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<CarePlanActivityStatus>(new CarePlanActivityStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Identifies what progress is being made for the specific activity.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public CarePlanActivityDetailComponent setStatusElement(Enumeration<CarePlanActivityStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Identifies what progress is being made for the specific activity.
     */
    public CarePlanActivityStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Identifies what progress is being made for the specific activity.
     */
    public CarePlanActivityDetailComponent setStatus(CarePlanActivityStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<CarePlanActivityStatus>(new CarePlanActivityStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #statusReason} (Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.)
     */
    public CodeableConcept getStatusReason() {
        if (this.statusReason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityDetailComponent.statusReason");
            else if (Configuration.doAutoCreate())
                // cc
                this.statusReason = new CodeableConcept();
        return this.statusReason;
    }

    public boolean hasStatusReason() {
        return this.statusReason != null && !this.statusReason.isEmpty();
    }

    /**
     * @param value {@link #statusReason} (Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.)
     */
    public CarePlanActivityDetailComponent setStatusReason(CodeableConcept value) {
        this.statusReason = value;
        return this;
    }

    /**
     * @return {@link #prohibited} (If true, indicates that the described activity is one that must NOT be engaged in when following the plan.). This is the underlying object with id, value and extensions. The accessor "getProhibited" gives direct access to the value
     */
    public BooleanType getProhibitedElement() {
        if (this.prohibited == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityDetailComponent.prohibited");
            else if (Configuration.doAutoCreate())
                // bb
                this.prohibited = new BooleanType();
        return this.prohibited;
    }

    public boolean hasProhibitedElement() {
        return this.prohibited != null && !this.prohibited.isEmpty();
    }

    public boolean hasProhibited() {
        return this.prohibited != null && !this.prohibited.isEmpty();
    }

    /**
     * @param value {@link #prohibited} (If true, indicates that the described activity is one that must NOT be engaged in when following the plan.). This is the underlying object with id, value and extensions. The accessor "getProhibited" gives direct access to the value
     */
    public CarePlanActivityDetailComponent setProhibitedElement(BooleanType value) {
        this.prohibited = value;
        return this;
    }

    /**
     * @return If true, indicates that the described activity is one that must NOT be engaged in when following the plan.
     */
    public boolean getProhibited() {
        return this.prohibited == null || this.prohibited.isEmpty() ? false : this.prohibited.getValue();
    }

    /**
     * @param value If true, indicates that the described activity is one that must NOT be engaged in when following the plan.
     */
    public CarePlanActivityDetailComponent setProhibited(boolean value) {
        if (this.prohibited == null)
            this.prohibited = new BooleanType();
        this.prohibited.setValue(value);
        return this;
    }

    /**
     * @return {@link #scheduled} (The period, timing or frequency upon which the described activity is to occur.)
     */
    public Type getScheduled() {
        return this.scheduled;
    }

    /**
     * @return {@link #scheduled} (The period, timing or frequency upon which the described activity is to occur.)
     */
    public Timing getScheduledTiming() throws FHIRException {
        if (!(this.scheduled instanceof Timing))
            throw new FHIRException("Type mismatch: the type Timing was expected, but " + this.scheduled.getClass().getName() + " was encountered");
        return (Timing) this.scheduled;
    }

    public boolean hasScheduledTiming() {
        return this.scheduled instanceof Timing;
    }

    /**
     * @return {@link #scheduled} (The period, timing or frequency upon which the described activity is to occur.)
     */
    public Period getScheduledPeriod() throws FHIRException {
        if (!(this.scheduled instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.scheduled.getClass().getName() + " was encountered");
        return (Period) this.scheduled;
    }

    public boolean hasScheduledPeriod() {
        return this.scheduled instanceof Period;
    }

    /**
     * @return {@link #scheduled} (The period, timing or frequency upon which the described activity is to occur.)
     */
    public StringType getScheduledStringType() throws FHIRException {
        if (!(this.scheduled instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.scheduled.getClass().getName() + " was encountered");
        return (StringType) this.scheduled;
    }

    public boolean hasScheduledStringType() {
        return this.scheduled instanceof StringType;
    }

    public boolean hasScheduled() {
        return this.scheduled != null && !this.scheduled.isEmpty();
    }

    /**
     * @param value {@link #scheduled} (The period, timing or frequency upon which the described activity is to occur.)
     */
    public CarePlanActivityDetailComponent setScheduled(Type value) {
        this.scheduled = value;
        return this;
    }

    /**
     * @return {@link #location} (Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.)
     */
    public Reference getLocation() {
        if (this.location == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityDetailComponent.location");
            else if (Configuration.doAutoCreate())
                // cc
                this.location = new Reference();
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.)
     */
    public CarePlanActivityDetailComponent setLocation(Reference value) {
        this.location = value;
        return this;
    }

    /**
     * @return {@link #location} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.)
     */
    public Location getLocationTarget() {
        if (this.locationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityDetailComponent.location");
            else if (Configuration.doAutoCreate())
                // aa
                this.locationTarget = new Location();
        return this.locationTarget;
    }

    /**
     * @param value {@link #location} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.)
     */
    public CarePlanActivityDetailComponent setLocationTarget(Location value) {
        this.locationTarget = value;
        return this;
    }

    /**
     * @return {@link #performer} (Identifies who's expected to be involved in the activity.)
     */
    public List<Reference> getPerformer() {
        if (this.performer == null)
            this.performer = new ArrayList<Reference>();
        return this.performer;
    }

    public boolean hasPerformer() {
        if (this.performer == null)
            return false;
        for (Reference item : this.performer) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addPerformer() {
        // 3
        Reference t = new Reference();
        if (this.performer == null)
            this.performer = new ArrayList<Reference>();
        this.performer.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlanActivityDetailComponent addPerformer(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.performer == null)
            this.performer = new ArrayList<Reference>();
        this.performer.add(t);
        return this;
    }

    /**
     * @return {@link #performer} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies who's expected to be involved in the activity.)
     */
    public List<Resource> getPerformerTarget() {
        if (this.performerTarget == null)
            this.performerTarget = new ArrayList<Resource>();
        return this.performerTarget;
    }

    /**
     * @return {@link #product} (Identifies the food, drug or other product to be consumed or supplied in the activity.)
     */
    public Type getProduct() {
        return this.product;
    }

    /**
     * @return {@link #product} (Identifies the food, drug or other product to be consumed or supplied in the activity.)
     */
    public CodeableConcept getProductCodeableConcept() throws FHIRException {
        if (!(this.product instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.product.getClass().getName() + " was encountered");
        return (CodeableConcept) this.product;
    }

    public boolean hasProductCodeableConcept() {
        return this.product instanceof CodeableConcept;
    }

    /**
     * @return {@link #product} (Identifies the food, drug or other product to be consumed or supplied in the activity.)
     */
    public Reference getProductReference() throws FHIRException {
        if (!(this.product instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.product.getClass().getName() + " was encountered");
        return (Reference) this.product;
    }

    public boolean hasProductReference() {
        return this.product instanceof Reference;
    }

    public boolean hasProduct() {
        return this.product != null && !this.product.isEmpty();
    }

    /**
     * @param value {@link #product} (Identifies the food, drug or other product to be consumed or supplied in the activity.)
     */
    public CarePlanActivityDetailComponent setProduct(Type value) {
        this.product = value;
        return this;
    }

    /**
     * @return {@link #dailyAmount} (Identifies the quantity expected to be consumed in a given day.)
     */
    public SimpleQuantity getDailyAmount() {
        if (this.dailyAmount == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityDetailComponent.dailyAmount");
            else if (Configuration.doAutoCreate())
                // cc
                this.dailyAmount = new SimpleQuantity();
        return this.dailyAmount;
    }

    public boolean hasDailyAmount() {
        return this.dailyAmount != null && !this.dailyAmount.isEmpty();
    }

    /**
     * @param value {@link #dailyAmount} (Identifies the quantity expected to be consumed in a given day.)
     */
    public CarePlanActivityDetailComponent setDailyAmount(SimpleQuantity value) {
        this.dailyAmount = value;
        return this;
    }

    /**
     * @return {@link #quantity} (Identifies the quantity expected to be supplied, administered or consumed by the subject.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityDetailComponent.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (Identifies the quantity expected to be supplied, administered or consumed by the subject.)
     */
    public CarePlanActivityDetailComponent setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #description} (This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityDetailComponent.description");
            else if (Configuration.doAutoCreate())
                // bb
                this.description = new StringType();
        return this.description;
    }

    public boolean hasDescriptionElement() {
        return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public CarePlanActivityDetailComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
     */
    public CarePlanActivityDetailComponent setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("category", "CodeableConcept", "High-level categorization of the type of activity in a care plan.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("code", "CodeableConcept", "Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("reasonCode", "CodeableConcept", "Provides the rationale that drove the inclusion of this particular activity as part of the plan.", 0, java.lang.Integer.MAX_VALUE, reasonCode));
        childrenList.add(new Property("reasonReference", "Reference(Condition)", "Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.", 0, java.lang.Integer.MAX_VALUE, reasonReference));
        childrenList.add(new Property("goal", "Reference(Goal)", "Internal reference that identifies the goals that this activity is intended to contribute towards meeting.", 0, java.lang.Integer.MAX_VALUE, goal));
        childrenList.add(new Property("status", "code", "Identifies what progress is being made for the specific activity.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("statusReason", "CodeableConcept", "Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.", 0, java.lang.Integer.MAX_VALUE, statusReason));
        childrenList.add(new Property("prohibited", "boolean", "If true, indicates that the described activity is one that must NOT be engaged in when following the plan.", 0, java.lang.Integer.MAX_VALUE, prohibited));
        childrenList.add(new Property("scheduled[x]", "Timing|Period|string", "The period, timing or frequency upon which the described activity is to occur.", 0, java.lang.Integer.MAX_VALUE, scheduled));
        childrenList.add(new Property("location", "Reference(Location)", "Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("performer", "Reference(Practitioner|Organization|RelatedPerson|Patient)", "Identifies who's expected to be involved in the activity.", 0, java.lang.Integer.MAX_VALUE, performer));
        childrenList.add(new Property("product[x]", "CodeableConcept|Reference(Medication|Substance)", "Identifies the food, drug or other product to be consumed or supplied in the activity.", 0, java.lang.Integer.MAX_VALUE, product));
        childrenList.add(new Property("dailyAmount", "SimpleQuantity", "Identifies the quantity expected to be consumed in a given day.", 0, java.lang.Integer.MAX_VALUE, dailyAmount));
        childrenList.add(new Property("quantity", "SimpleQuantity", "Identifies the quantity expected to be supplied, administered or consumed by the subject.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("description", "string", "This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.", 0, java.lang.Integer.MAX_VALUE, description));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("category"))
            // CodeableConcept
            this.category = castToCodeableConcept(value);
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("reasonCode"))
            this.getReasonCode().add(castToCodeableConcept(value));
        else if (name.equals("reasonReference"))
            this.getReasonReference().add(castToReference(value));
        else if (name.equals("goal"))
            this.getGoal().add(castToReference(value));
        else if (name.equals("status"))
            // Enumeration<CarePlanActivityStatus>
            this.status = new CarePlanActivityStatusEnumFactory().fromType(value);
        else if (name.equals("statusReason"))
            // CodeableConcept
            this.statusReason = castToCodeableConcept(value);
        else if (name.equals("prohibited"))
            // BooleanType
            this.prohibited = castToBoolean(value);
        else if (name.equals("scheduled[x]"))
            // Type
            this.scheduled = (Type) value;
        else if (name.equals("location"))
            // Reference
            this.location = castToReference(value);
        else if (name.equals("performer"))
            this.getPerformer().add(castToReference(value));
        else if (name.equals("product[x]"))
            // Type
            this.product = (Type) value;
        else if (name.equals("dailyAmount"))
            // SimpleQuantity
            this.dailyAmount = castToSimpleQuantity(value);
        else if (name.equals("quantity"))
            // SimpleQuantity
            this.quantity = castToSimpleQuantity(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("category")) {
            this.category = new CodeableConcept();
            return this.category;
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("reasonCode")) {
            return addReasonCode();
        } else if (name.equals("reasonReference")) {
            return addReasonReference();
        } else if (name.equals("goal")) {
            return addGoal();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type CarePlan.status");
        } else if (name.equals("statusReason")) {
            this.statusReason = new CodeableConcept();
            return this.statusReason;
        } else if (name.equals("prohibited")) {
            throw new FHIRException("Cannot call addChild on a primitive type CarePlan.prohibited");
        } else if (name.equals("scheduledTiming")) {
            this.scheduled = new Timing();
            return this.scheduled;
        } else if (name.equals("scheduledPeriod")) {
            this.scheduled = new Period();
            return this.scheduled;
        } else if (name.equals("scheduledString")) {
            this.scheduled = new StringType();
            return this.scheduled;
        } else if (name.equals("location")) {
            this.location = new Reference();
            return this.location;
        } else if (name.equals("performer")) {
            return addPerformer();
        } else if (name.equals("productCodeableConcept")) {
            this.product = new CodeableConcept();
            return this.product;
        } else if (name.equals("productReference")) {
            this.product = new Reference();
            return this.product;
        } else if (name.equals("dailyAmount")) {
            this.dailyAmount = new SimpleQuantity();
            return this.dailyAmount;
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type CarePlan.description");
        } else
            return super.addChild(name);
    }

    public CarePlanActivityDetailComponent copy() {
        CarePlanActivityDetailComponent dst = new CarePlanActivityDetailComponent();
        copyValues(dst);
        dst.category = category == null ? null : category.copy();
        dst.code = code == null ? null : code.copy();
        if (reasonCode != null) {
            dst.reasonCode = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reasonCode) dst.reasonCode.add(i.copy());
        }
        ;
        if (reasonReference != null) {
            dst.reasonReference = new ArrayList<Reference>();
            for (Reference i : reasonReference) dst.reasonReference.add(i.copy());
        }
        ;
        if (goal != null) {
            dst.goal = new ArrayList<Reference>();
            for (Reference i : goal) dst.goal.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        dst.statusReason = statusReason == null ? null : statusReason.copy();
        dst.prohibited = prohibited == null ? null : prohibited.copy();
        dst.scheduled = scheduled == null ? null : scheduled.copy();
        dst.location = location == null ? null : location.copy();
        if (performer != null) {
            dst.performer = new ArrayList<Reference>();
            for (Reference i : performer) dst.performer.add(i.copy());
        }
        ;
        dst.product = product == null ? null : product.copy();
        dst.dailyAmount = dailyAmount == null ? null : dailyAmount.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.description = description == null ? null : description.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof CarePlanActivityDetailComponent))
            return false;
        CarePlanActivityDetailComponent o = (CarePlanActivityDetailComponent) other;
        return compareDeep(category, o.category, true) && compareDeep(code, o.code, true) && compareDeep(reasonCode, o.reasonCode, true) && compareDeep(reasonReference, o.reasonReference, true) && compareDeep(goal, o.goal, true) && compareDeep(status, o.status, true) && compareDeep(statusReason, o.statusReason, true) && compareDeep(prohibited, o.prohibited, true) && compareDeep(scheduled, o.scheduled, true) && compareDeep(location, o.location, true) && compareDeep(performer, o.performer, true) && compareDeep(product, o.product, true) && compareDeep(dailyAmount, o.dailyAmount, true) && compareDeep(quantity, o.quantity, true) && compareDeep(description, o.description, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof CarePlanActivityDetailComponent))
            return false;
        CarePlanActivityDetailComponent o = (CarePlanActivityDetailComponent) other;
        return compareValues(status, o.status, true) && compareValues(prohibited, o.prohibited, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (category == null || category.isEmpty()) && (code == null || code.isEmpty()) && (reasonCode == null || reasonCode.isEmpty()) && (reasonReference == null || reasonReference.isEmpty()) && (goal == null || goal.isEmpty()) && (status == null || status.isEmpty()) && (statusReason == null || statusReason.isEmpty()) && (prohibited == null || prohibited.isEmpty()) && (scheduled == null || scheduled.isEmpty()) && (location == null || location.isEmpty()) && (performer == null || performer.isEmpty()) && (product == null || product.isEmpty()) && (dailyAmount == null || dailyAmount.isEmpty()) && (quantity == null || quantity.isEmpty()) && (description == null || description.isEmpty());
    }

    public String fhirType() {
        return "CarePlan.activity.detail";
    }
}
