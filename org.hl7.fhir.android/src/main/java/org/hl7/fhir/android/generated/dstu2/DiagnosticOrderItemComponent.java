package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderStatus;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderPriorityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderPriority;

public class DiagnosticOrderItemComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A code that identifies a particular diagnostic investigation, or panel of investigations, that have been requested.
     */
    protected CodeableConcept code;

    /**
     * If the item is related to a specific specimen.
     */
    protected List<Reference> specimen;

    /**
     * The actual objects that are the target of the reference (If the item is related to a specific specimen.)
     */
    protected List<Specimen> specimenTarget;

    /**
     * Anatomical location where the request test should be performed.  This is the target site.
     */
    protected CodeableConcept bodySite;

    /**
     * The status of this individual item within the order.
     */
    protected Enumeration<DiagnosticOrderStatus> status;

    /**
     * A summary of the events of interest that have occurred as this item of the request is processed.
     */
    protected List<DiagnosticOrderEventComponent> event;

    private static final long serialVersionUID = 381238192L;

    /*
     * Constructor
     */
    public DiagnosticOrderItemComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DiagnosticOrderItemComponent(CodeableConcept code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #code} (A code that identifies a particular diagnostic investigation, or panel of investigations, that have been requested.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrderItemComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A code that identifies a particular diagnostic investigation, or panel of investigations, that have been requested.)
     */
    public DiagnosticOrderItemComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #specimen} (If the item is related to a specific specimen.)
     */
    public List<Reference> getSpecimen() {
        if (this.specimen == null)
            this.specimen = new ArrayList<Reference>();
        return this.specimen;
    }

    public boolean hasSpecimen() {
        if (this.specimen == null)
            return false;
        for (Reference item : this.specimen) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addSpecimen() {
        // 3
        Reference t = new Reference();
        if (this.specimen == null)
            this.specimen = new ArrayList<Reference>();
        this.specimen.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticOrderItemComponent addSpecimen(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.specimen == null)
            this.specimen = new ArrayList<Reference>();
        this.specimen.add(t);
        return this;
    }

    /**
     * @return {@link #specimen} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. If the item is related to a specific specimen.)
     */
    public List<Specimen> getSpecimenTarget() {
        if (this.specimenTarget == null)
            this.specimenTarget = new ArrayList<Specimen>();
        return this.specimenTarget;
    }

    /**
     * @return {@link #specimen} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. If the item is related to a specific specimen.)
     */
    public Specimen addSpecimenTarget() {
        Specimen r = new Specimen();
        if (this.specimenTarget == null)
            this.specimenTarget = new ArrayList<Specimen>();
        this.specimenTarget.add(r);
        return r;
    }

    /**
     * @return {@link #bodySite} (Anatomical location where the request test should be performed.  This is the target site.)
     */
    public CodeableConcept getBodySite() {
        if (this.bodySite == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrderItemComponent.bodySite");
            else if (Configuration.doAutoCreate())
                // cc
                this.bodySite = new CodeableConcept();
        return this.bodySite;
    }

    public boolean hasBodySite() {
        return this.bodySite != null && !this.bodySite.isEmpty();
    }

    /**
     * @param value {@link #bodySite} (Anatomical location where the request test should be performed.  This is the target site.)
     */
    public DiagnosticOrderItemComponent setBodySite(CodeableConcept value) {
        this.bodySite = value;
        return this;
    }

    /**
     * @return {@link #status} (The status of this individual item within the order.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DiagnosticOrderStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrderItemComponent.status");
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
     * @param value {@link #status} (The status of this individual item within the order.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public DiagnosticOrderItemComponent setStatusElement(Enumeration<DiagnosticOrderStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of this individual item within the order.
     */
    public DiagnosticOrderStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this individual item within the order.
     */
    public DiagnosticOrderItemComponent setStatus(DiagnosticOrderStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<DiagnosticOrderStatus>(new DiagnosticOrderStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #event} (A summary of the events of interest that have occurred as this item of the request is processed.)
     */
    public List<DiagnosticOrderEventComponent> getEvent() {
        if (this.event == null)
            this.event = new ArrayList<DiagnosticOrderEventComponent>();
        return this.event;
    }

    public boolean hasEvent() {
        if (this.event == null)
            return false;
        for (DiagnosticOrderEventComponent item : this.event) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public DiagnosticOrderEventComponent addEvent() {
        // 3
        DiagnosticOrderEventComponent t = new DiagnosticOrderEventComponent();
        if (this.event == null)
            this.event = new ArrayList<DiagnosticOrderEventComponent>();
        this.event.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticOrderItemComponent addEvent(DiagnosticOrderEventComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.event == null)
            this.event = new ArrayList<DiagnosticOrderEventComponent>();
        this.event.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "A code that identifies a particular diagnostic investigation, or panel of investigations, that have been requested.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("specimen", "Reference(Specimen)", "If the item is related to a specific specimen.", 0, java.lang.Integer.MAX_VALUE, specimen));
        childrenList.add(new Property("bodySite", "CodeableConcept", "Anatomical location where the request test should be performed.  This is the target site.", 0, java.lang.Integer.MAX_VALUE, bodySite));
        childrenList.add(new Property("status", "code", "The status of this individual item within the order.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("event", "@DiagnosticOrder.event", "A summary of the events of interest that have occurred as this item of the request is processed.", 0, java.lang.Integer.MAX_VALUE, event));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("specimen"))
            this.getSpecimen().add(castToReference(value));
        else if (name.equals("bodySite"))
            // CodeableConcept
            this.bodySite = castToCodeableConcept(value);
        else if (name.equals("status"))
            // Enumeration<DiagnosticOrderStatus>
            this.status = new DiagnosticOrderStatusEnumFactory().fromType(value);
        else if (name.equals("event"))
            this.getEvent().add((DiagnosticOrderEventComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("specimen")) {
            return addSpecimen();
        } else if (name.equals("bodySite")) {
            this.bodySite = new CodeableConcept();
            return this.bodySite;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type DiagnosticOrder.status");
        } else if (name.equals("event")) {
            return addEvent();
        } else
            return super.addChild(name);
    }

    public DiagnosticOrderItemComponent copy() {
        DiagnosticOrderItemComponent dst = new DiagnosticOrderItemComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        if (specimen != null) {
            dst.specimen = new ArrayList<Reference>();
            for (Reference i : specimen) dst.specimen.add(i.copy());
        }
        ;
        dst.bodySite = bodySite == null ? null : bodySite.copy();
        dst.status = status == null ? null : status.copy();
        if (event != null) {
            dst.event = new ArrayList<DiagnosticOrderEventComponent>();
            for (DiagnosticOrderEventComponent i : event) dst.event.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DiagnosticOrderItemComponent))
            return false;
        DiagnosticOrderItemComponent o = (DiagnosticOrderItemComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(specimen, o.specimen, true) && compareDeep(bodySite, o.bodySite, true) && compareDeep(status, o.status, true) && compareDeep(event, o.event, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DiagnosticOrderItemComponent))
            return false;
        DiagnosticOrderItemComponent o = (DiagnosticOrderItemComponent) other;
        return compareValues(status, o.status, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (specimen == null || specimen.isEmpty()) && (bodySite == null || bodySite.isEmpty()) && (status == null || status.isEmpty()) && (event == null || event.isEmpty());
    }

    public String fhirType() {
        return "DiagnosticOrder.item";
    }
}
