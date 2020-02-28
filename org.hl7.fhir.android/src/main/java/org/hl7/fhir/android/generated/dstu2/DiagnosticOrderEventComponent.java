package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderPriority;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderPriorityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderStatus;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderStatusEnumFactory;

public class DiagnosticOrderEventComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The status for the event.
     */
    protected Enumeration<DiagnosticOrderStatus> status;

    /**
     * Additional information about the event that occurred - e.g. if the status remained unchanged.
     */
    protected CodeableConcept description;

    /**
     * The date/time at which the event occurred.
     */
    protected DateTimeType dateTime;

    /**
     * The person responsible for performing or recording the action.
     */
    protected Reference actor;

    /**
     * The actual object that is the target of the reference (The person responsible for performing or recording the action.)
     */
    protected Resource actorTarget;

    private static final long serialVersionUID = -370793723L;

    /*
     * Constructor
     */
    public DiagnosticOrderEventComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DiagnosticOrderEventComponent(Enumeration<DiagnosticOrderStatus> status, DateTimeType dateTime) {
        super();
        this.status = status;
        this.dateTime = dateTime;
    }

    /**
     * @return {@link #status} (The status for the event.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DiagnosticOrderStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrderEventComponent.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<DiagnosticOrderStatus>(new DiagnosticOrderStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status for the event.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public DiagnosticOrderEventComponent setStatusElement(Enumeration<DiagnosticOrderStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status for the event.
     */
    public DiagnosticOrderStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status for the event.
     */
    public DiagnosticOrderEventComponent setStatus(DiagnosticOrderStatus value) {
        if (this.status == null)
            this.status = new Enumeration<DiagnosticOrderStatus>(new DiagnosticOrderStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (Additional information about the event that occurred - e.g. if the status remained unchanged.)
     */
    public CodeableConcept getDescription() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrderEventComponent.description");
            else if (Configuration.doAutoCreate())
                // cc
                this.description = new CodeableConcept();
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Additional information about the event that occurred - e.g. if the status remained unchanged.)
     */
    public DiagnosticOrderEventComponent setDescription(CodeableConcept value) {
        this.description = value;
        return this;
    }

    /**
     * @return {@link #dateTime} (The date/time at which the event occurred.). This is the underlying object with id, value and extensions. The accessor "getDateTime" gives direct access to the value
     */
    public DateTimeType getDateTimeElement() {
        if (this.dateTime == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrderEventComponent.dateTime");
            else if (Configuration.doAutoCreate())
                // bb
                this.dateTime = new DateTimeType();
        return this.dateTime;
    }

    public boolean hasDateTimeElement() {
        return this.dateTime != null && !this.dateTime.isEmpty();
    }

    public boolean hasDateTime() {
        return this.dateTime != null && !this.dateTime.isEmpty();
    }

    /**
     * @param value {@link #dateTime} (The date/time at which the event occurred.). This is the underlying object with id, value and extensions. The accessor "getDateTime" gives direct access to the value
     */
    public DiagnosticOrderEventComponent setDateTimeElement(DateTimeType value) {
        this.dateTime = value;
        return this;
    }

    /**
     * @return The date/time at which the event occurred.
     */
    public Date getDateTime() {
        return this.dateTime == null ? null : this.dateTime.getValue();
    }

    /**
     * @param value The date/time at which the event occurred.
     */
    public DiagnosticOrderEventComponent setDateTime(Date value) {
        if (this.dateTime == null)
            this.dateTime = new DateTimeType();
        this.dateTime.setValue(value);
        return this;
    }

    /**
     * @return {@link #actor} (The person responsible for performing or recording the action.)
     */
    public Reference getActor() {
        if (this.actor == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrderEventComponent.actor");
            else if (Configuration.doAutoCreate())
                // cc
                this.actor = new Reference();
        return this.actor;
    }

    public boolean hasActor() {
        return this.actor != null && !this.actor.isEmpty();
    }

    /**
     * @param value {@link #actor} (The person responsible for performing or recording the action.)
     */
    public DiagnosticOrderEventComponent setActor(Reference value) {
        this.actor = value;
        return this;
    }

    /**
     * @return {@link #actor} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person responsible for performing or recording the action.)
     */
    public Resource getActorTarget() {
        return this.actorTarget;
    }

    /**
     * @param value {@link #actor} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person responsible for performing or recording the action.)
     */
    public DiagnosticOrderEventComponent setActorTarget(Resource value) {
        this.actorTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("status", "code", "The status for the event.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("description", "CodeableConcept", "Additional information about the event that occurred - e.g. if the status remained unchanged.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("dateTime", "dateTime", "The date/time at which the event occurred.", 0, java.lang.Integer.MAX_VALUE, dateTime));
        childrenList.add(new Property("actor", "Reference(Practitioner|Device)", "The person responsible for performing or recording the action.", 0, java.lang.Integer.MAX_VALUE, actor));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("status"))
            // Enumeration<DiagnosticOrderStatus>
            this.status = new DiagnosticOrderStatusEnumFactory().fromType(value);
        else if (name.equals("description"))
            // CodeableConcept
            this.description = castToCodeableConcept(value);
        else if (name.equals("dateTime"))
            // DateTimeType
            this.dateTime = castToDateTime(value);
        else if (name.equals("actor"))
            // Reference
            this.actor = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type DiagnosticOrder.status");
        } else if (name.equals("description")) {
            this.description = new CodeableConcept();
            return this.description;
        } else if (name.equals("dateTime")) {
            throw new FHIRException("Cannot call addChild on a primitive type DiagnosticOrder.dateTime");
        } else if (name.equals("actor")) {
            this.actor = new Reference();
            return this.actor;
        } else
            return super.addChild(name);
    }

    public DiagnosticOrderEventComponent copy() {
        DiagnosticOrderEventComponent dst = new DiagnosticOrderEventComponent();
        copyValues(dst);
        dst.status = status == null ? null : status.copy();
        dst.description = description == null ? null : description.copy();
        dst.dateTime = dateTime == null ? null : dateTime.copy();
        dst.actor = actor == null ? null : actor.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DiagnosticOrderEventComponent))
            return false;
        DiagnosticOrderEventComponent o = (DiagnosticOrderEventComponent) other;
        return compareDeep(status, o.status, true) && compareDeep(description, o.description, true) && compareDeep(dateTime, o.dateTime, true) && compareDeep(actor, o.actor, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DiagnosticOrderEventComponent))
            return false;
        DiagnosticOrderEventComponent o = (DiagnosticOrderEventComponent) other;
        return compareValues(status, o.status, true) && compareValues(dateTime, o.dateTime, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (status == null || status.isEmpty()) && (description == null || description.isEmpty()) && (dateTime == null || dateTime.isEmpty()) && (actor == null || actor.isEmpty());
    }

    public String fhirType() {
        return "DiagnosticOrder.event";
    }
}
