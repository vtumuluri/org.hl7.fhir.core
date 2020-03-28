package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcome;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcomeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventAction;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventActionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkType;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkTypeEnumFactory;

public class AuditEventEventComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.
     */
    protected Coding type;

    /**
     * Identifier for the category of event.
     */
    protected List<Coding> subtype;

    /**
     * Indicator for type of action performed during the event that generated the audit.
     */
    protected Enumeration<AuditEventAction> action;

    /**
     * The time when the event occurred on the source.
     */
    protected InstantType dateTime;

    /**
     * Indicates whether the event succeeded or failed.
     */
    protected Enumeration<AuditEventOutcome> outcome;

    /**
     * A free text description of the outcome of the event.
     */
    protected StringType outcomeDesc;

    /**
     * The purposeOfUse (reason) that was used during the event being recorded.
     */
    protected List<Coding> purposeOfEvent;

    private static final long serialVersionUID = 1916806397L;

    /*
     * Constructor
     */
    public AuditEventEventComponent() {
        super();
    }

    /*
     * Constructor
     */
    public AuditEventEventComponent(Coding type, InstantType dateTime) {
        super();
        this.type = type;
        this.dateTime = dateTime;
    }

    /**
     * @return {@link #type} (Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.)
     */
    public Coding getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventEventComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new Coding();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.)
     */
    public AuditEventEventComponent setType(Coding value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #subtype} (Identifier for the category of event.)
     */
    public List<Coding> getSubtype() {
        if (this.subtype == null)
            this.subtype = new ArrayList<Coding>();
        return this.subtype;
    }

    public boolean hasSubtype() {
        if (this.subtype == null)
            return false;
        for (Coding item : this.subtype) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Coding addSubtype() {
        // 3
        Coding t = new Coding();
        if (this.subtype == null)
            this.subtype = new ArrayList<Coding>();
        this.subtype.add(t);
        return t;
    }

    // syntactic sugar
    public AuditEventEventComponent addSubtype(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.subtype == null)
            this.subtype = new ArrayList<Coding>();
        this.subtype.add(t);
        return this;
    }

    /**
     * @return {@link #action} (Indicator for type of action performed during the event that generated the audit.). This is the underlying object with id, value and extensions. The accessor "getAction" gives direct access to the value
     */
    public Enumeration<AuditEventAction> getActionElement() {
        if (this.action == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventEventComponent.action");
            else if (Configuration.doAutoCreate())
                // bb
                this.action = new Enumeration<AuditEventAction>(new AuditEventActionEnumFactory());
        return this.action;
    }

    public boolean hasActionElement() {
        return this.action != null && !this.action.isEmpty();
    }

    public boolean hasAction() {
        return this.action != null && !this.action.isEmpty();
    }

    /**
     * @param value {@link #action} (Indicator for type of action performed during the event that generated the audit.). This is the underlying object with id, value and extensions. The accessor "getAction" gives direct access to the value
     */
    public AuditEventEventComponent setActionElement(Enumeration<AuditEventAction> value) {
        this.action = value;
        return this;
    }

    /**
     * @return Indicator for type of action performed during the event that generated the audit.
     */
    public AuditEventAction getAction() {
        return this.action == null ? null : this.action.getValue();
    }

    /**
     * @param value Indicator for type of action performed during the event that generated the audit.
     */
    public AuditEventEventComponent setAction(AuditEventAction value) {
        if (value == null)
            this.action = null;
        else {
            if (this.action == null)
                this.action = new Enumeration<AuditEventAction>(new AuditEventActionEnumFactory());
            this.action.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #dateTime} (The time when the event occurred on the source.). This is the underlying object with id, value and extensions. The accessor "getDateTime" gives direct access to the value
     */
    public InstantType getDateTimeElement() {
        if (this.dateTime == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventEventComponent.dateTime");
            else if (Configuration.doAutoCreate())
                // bb
                this.dateTime = new InstantType();
        return this.dateTime;
    }

    public boolean hasDateTimeElement() {
        return this.dateTime != null && !this.dateTime.isEmpty();
    }

    public boolean hasDateTime() {
        return this.dateTime != null && !this.dateTime.isEmpty();
    }

    /**
     * @param value {@link #dateTime} (The time when the event occurred on the source.). This is the underlying object with id, value and extensions. The accessor "getDateTime" gives direct access to the value
     */
    public AuditEventEventComponent setDateTimeElement(InstantType value) {
        this.dateTime = value;
        return this;
    }

    /**
     * @return The time when the event occurred on the source.
     */
    public Date getDateTime() {
        return this.dateTime == null ? null : this.dateTime.getValue();
    }

    /**
     * @param value The time when the event occurred on the source.
     */
    public AuditEventEventComponent setDateTime(Date value) {
        if (this.dateTime == null)
            this.dateTime = new InstantType();
        this.dateTime.setValue(value);
        return this;
    }

    /**
     * @return {@link #outcome} (Indicates whether the event succeeded or failed.). This is the underlying object with id, value and extensions. The accessor "getOutcome" gives direct access to the value
     */
    public Enumeration<AuditEventOutcome> getOutcomeElement() {
        if (this.outcome == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventEventComponent.outcome");
            else if (Configuration.doAutoCreate())
                // bb
                this.outcome = new Enumeration<AuditEventOutcome>(new AuditEventOutcomeEnumFactory());
        return this.outcome;
    }

    public boolean hasOutcomeElement() {
        return this.outcome != null && !this.outcome.isEmpty();
    }

    public boolean hasOutcome() {
        return this.outcome != null && !this.outcome.isEmpty();
    }

    /**
     * @param value {@link #outcome} (Indicates whether the event succeeded or failed.). This is the underlying object with id, value and extensions. The accessor "getOutcome" gives direct access to the value
     */
    public AuditEventEventComponent setOutcomeElement(Enumeration<AuditEventOutcome> value) {
        this.outcome = value;
        return this;
    }

    /**
     * @return Indicates whether the event succeeded or failed.
     */
    public AuditEventOutcome getOutcome() {
        return this.outcome == null ? null : this.outcome.getValue();
    }

    /**
     * @param value Indicates whether the event succeeded or failed.
     */
    public AuditEventEventComponent setOutcome(AuditEventOutcome value) {
        if (value == null)
            this.outcome = null;
        else {
            if (this.outcome == null)
                this.outcome = new Enumeration<AuditEventOutcome>(new AuditEventOutcomeEnumFactory());
            this.outcome.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #outcomeDesc} (A free text description of the outcome of the event.). This is the underlying object with id, value and extensions. The accessor "getOutcomeDesc" gives direct access to the value
     */
    public StringType getOutcomeDescElement() {
        if (this.outcomeDesc == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventEventComponent.outcomeDesc");
            else if (Configuration.doAutoCreate())
                // bb
                this.outcomeDesc = new StringType();
        return this.outcomeDesc;
    }

    public boolean hasOutcomeDescElement() {
        return this.outcomeDesc != null && !this.outcomeDesc.isEmpty();
    }

    public boolean hasOutcomeDesc() {
        return this.outcomeDesc != null && !this.outcomeDesc.isEmpty();
    }

    /**
     * @param value {@link #outcomeDesc} (A free text description of the outcome of the event.). This is the underlying object with id, value and extensions. The accessor "getOutcomeDesc" gives direct access to the value
     */
    public AuditEventEventComponent setOutcomeDescElement(StringType value) {
        this.outcomeDesc = value;
        return this;
    }

    /**
     * @return A free text description of the outcome of the event.
     */
    public String getOutcomeDesc() {
        return this.outcomeDesc == null ? null : this.outcomeDesc.getValue();
    }

    /**
     * @param value A free text description of the outcome of the event.
     */
    public AuditEventEventComponent setOutcomeDesc(String value) {
        if (Utilities.noString(value))
            this.outcomeDesc = null;
        else {
            if (this.outcomeDesc == null)
                this.outcomeDesc = new StringType();
            this.outcomeDesc.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #purposeOfEvent} (The purposeOfUse (reason) that was used during the event being recorded.)
     */
    public List<Coding> getPurposeOfEvent() {
        if (this.purposeOfEvent == null)
            this.purposeOfEvent = new ArrayList<Coding>();
        return this.purposeOfEvent;
    }

    public boolean hasPurposeOfEvent() {
        if (this.purposeOfEvent == null)
            return false;
        for (Coding item : this.purposeOfEvent) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Coding addPurposeOfEvent() {
        // 3
        Coding t = new Coding();
        if (this.purposeOfEvent == null)
            this.purposeOfEvent = new ArrayList<Coding>();
        this.purposeOfEvent.add(t);
        return t;
    }

    // syntactic sugar
    public AuditEventEventComponent addPurposeOfEvent(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.purposeOfEvent == null)
            this.purposeOfEvent = new ArrayList<Coding>();
        this.purposeOfEvent.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "Coding", "Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("subtype", "Coding", "Identifier for the category of event.", 0, java.lang.Integer.MAX_VALUE, subtype));
        childrenList.add(new Property("action", "code", "Indicator for type of action performed during the event that generated the audit.", 0, java.lang.Integer.MAX_VALUE, action));
        childrenList.add(new Property("dateTime", "instant", "The time when the event occurred on the source.", 0, java.lang.Integer.MAX_VALUE, dateTime));
        childrenList.add(new Property("outcome", "code", "Indicates whether the event succeeded or failed.", 0, java.lang.Integer.MAX_VALUE, outcome));
        childrenList.add(new Property("outcomeDesc", "string", "A free text description of the outcome of the event.", 0, java.lang.Integer.MAX_VALUE, outcomeDesc));
        childrenList.add(new Property("purposeOfEvent", "Coding", "The purposeOfUse (reason) that was used during the event being recorded.", 0, java.lang.Integer.MAX_VALUE, purposeOfEvent));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Coding
            this.type = castToCoding(value);
        else if (name.equals("subtype"))
            this.getSubtype().add(castToCoding(value));
        else if (name.equals("action"))
            // Enumeration<AuditEventAction>
            this.action = new AuditEventActionEnumFactory().fromType(value);
        else if (name.equals("dateTime"))
            // InstantType
            this.dateTime = castToInstant(value);
        else if (name.equals("outcome"))
            // Enumeration<AuditEventOutcome>
            this.outcome = new AuditEventOutcomeEnumFactory().fromType(value);
        else if (name.equals("outcomeDesc"))
            // StringType
            this.outcomeDesc = castToString(value);
        else if (name.equals("purposeOfEvent"))
            this.getPurposeOfEvent().add(castToCoding(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new Coding();
            return this.type;
        } else if (name.equals("subtype")) {
            return addSubtype();
        } else if (name.equals("action")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.action");
        } else if (name.equals("dateTime")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.dateTime");
        } else if (name.equals("outcome")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.outcome");
        } else if (name.equals("outcomeDesc")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.outcomeDesc");
        } else if (name.equals("purposeOfEvent")) {
            return addPurposeOfEvent();
        } else
            return super.addChild(name);
    }

    public AuditEventEventComponent copy() {
        AuditEventEventComponent dst = new AuditEventEventComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        if (subtype != null) {
            dst.subtype = new ArrayList<Coding>();
            for (Coding i : subtype) dst.subtype.add(i.copy());
        }
        ;
        dst.action = action == null ? null : action.copy();
        dst.dateTime = dateTime == null ? null : dateTime.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.outcomeDesc = outcomeDesc == null ? null : outcomeDesc.copy();
        if (purposeOfEvent != null) {
            dst.purposeOfEvent = new ArrayList<Coding>();
            for (Coding i : purposeOfEvent) dst.purposeOfEvent.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AuditEventEventComponent))
            return false;
        AuditEventEventComponent o = (AuditEventEventComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(subtype, o.subtype, true) && compareDeep(action, o.action, true) && compareDeep(dateTime, o.dateTime, true) && compareDeep(outcome, o.outcome, true) && compareDeep(outcomeDesc, o.outcomeDesc, true) && compareDeep(purposeOfEvent, o.purposeOfEvent, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AuditEventEventComponent))
            return false;
        AuditEventEventComponent o = (AuditEventEventComponent) other;
        return compareValues(action, o.action, true) && compareValues(dateTime, o.dateTime, true) && compareValues(outcome, o.outcome, true) && compareValues(outcomeDesc, o.outcomeDesc, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (subtype == null || subtype.isEmpty()) && (action == null || action.isEmpty()) && (dateTime == null || dateTime.isEmpty()) && (outcome == null || outcome.isEmpty()) && (outcomeDesc == null || outcomeDesc.isEmpty()) && (purposeOfEvent == null || purposeOfEvent.isEmpty());
    }

    public String fhirType() {
        return "AuditEvent.event";
    }
}
