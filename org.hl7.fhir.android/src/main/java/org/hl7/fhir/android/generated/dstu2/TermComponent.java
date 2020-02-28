package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class TermComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Unique identifier for this particular Contract Provision.
     */
    protected Identifier identifier;

    /**
     * When this Contract Provision was issued.
     */
    protected DateTimeType issued;

    /**
     * Relevant time or time-period when this Contract Provision is applicable.
     */
    protected Period applies;

    /**
     * Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.
     */
    protected CodeableConcept type;

    /**
     * Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment.
     */
    protected CodeableConcept subType;

    /**
     * Who or what this Contract Provision is about.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Who or what this Contract Provision is about.)
     */
    protected Resource subjectTarget;

    /**
     * Action stipulated by this Contract Provision.
     */
    protected List<CodeableConcept> action;

    /**
     * Reason or purpose for the action stipulated by this Contract Provision.
     */
    protected List<CodeableConcept> actionReason;

    /**
     * List of actors participating in this Contract Provision.
     */
    protected List<TermActorComponent> actor;

    /**
     * Human readable form of this Contract Provision.
     */
    protected StringType text;

    /**
     * Contract Provision Valued Item List.
     */
    protected List<TermValuedItemComponent> valuedItem;

    /**
     * Nested group of Contract Provisions.
     */
    protected List<TermComponent> group;

    private static final long serialVersionUID = -1137577465L;

    /*
     * Constructor
     */
    public TermComponent() {
        super();
    }

    /**
     * @return {@link #identifier} (Unique identifier for this particular Contract Provision.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TermComponent.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Unique identifier for this particular Contract Provision.)
     */
    public TermComponent setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #issued} (When this Contract Provision was issued.). This is the underlying object with id, value and extensions. The accessor "getIssued" gives direct access to the value
     */
    public DateTimeType getIssuedElement() {
        if (this.issued == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TermComponent.issued");
            else if (Configuration.doAutoCreate())
                // bb
                this.issued = new DateTimeType();
        return this.issued;
    }

    public boolean hasIssuedElement() {
        return this.issued != null && !this.issued.isEmpty();
    }

    public boolean hasIssued() {
        return this.issued != null && !this.issued.isEmpty();
    }

    /**
     * @param value {@link #issued} (When this Contract Provision was issued.). This is the underlying object with id, value and extensions. The accessor "getIssued" gives direct access to the value
     */
    public TermComponent setIssuedElement(DateTimeType value) {
        this.issued = value;
        return this;
    }

    /**
     * @return When this Contract Provision was issued.
     */
    public Date getIssued() {
        return this.issued == null ? null : this.issued.getValue();
    }

    /**
     * @param value When this Contract Provision was issued.
     */
    public TermComponent setIssued(Date value) {
        if (value == null)
            this.issued = null;
        else {
            if (this.issued == null)
                this.issued = new DateTimeType();
            this.issued.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #applies} (Relevant time or time-period when this Contract Provision is applicable.)
     */
    public Period getApplies() {
        if (this.applies == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TermComponent.applies");
            else if (Configuration.doAutoCreate())
                // cc
                this.applies = new Period();
        return this.applies;
    }

    public boolean hasApplies() {
        return this.applies != null && !this.applies.isEmpty();
    }

    /**
     * @param value {@link #applies} (Relevant time or time-period when this Contract Provision is applicable.)
     */
    public TermComponent setApplies(Period value) {
        this.applies = value;
        return this;
    }

    /**
     * @return {@link #type} (Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TermComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.)
     */
    public TermComponent setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #subType} (Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment.)
     */
    public CodeableConcept getSubType() {
        if (this.subType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TermComponent.subType");
            else if (Configuration.doAutoCreate())
                // cc
                this.subType = new CodeableConcept();
        return this.subType;
    }

    public boolean hasSubType() {
        return this.subType != null && !this.subType.isEmpty();
    }

    /**
     * @param value {@link #subType} (Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment.)
     */
    public TermComponent setSubType(CodeableConcept value) {
        this.subType = value;
        return this;
    }

    /**
     * @return {@link #subject} (Who or what this Contract Provision is about.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TermComponent.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Who or what this Contract Provision is about.)
     */
    public TermComponent setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who or what this Contract Provision is about.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who or what this Contract Provision is about.)
     */
    public TermComponent setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #action} (Action stipulated by this Contract Provision.)
     */
    public List<CodeableConcept> getAction() {
        if (this.action == null)
            this.action = new ArrayList<CodeableConcept>();
        return this.action;
    }

    public boolean hasAction() {
        if (this.action == null)
            return false;
        for (CodeableConcept item : this.action) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addAction() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.action == null)
            this.action = new ArrayList<CodeableConcept>();
        this.action.add(t);
        return t;
    }

    // syntactic sugar
    public TermComponent addAction(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.action == null)
            this.action = new ArrayList<CodeableConcept>();
        this.action.add(t);
        return this;
    }

    /**
     * @return {@link #actionReason} (Reason or purpose for the action stipulated by this Contract Provision.)
     */
    public List<CodeableConcept> getActionReason() {
        if (this.actionReason == null)
            this.actionReason = new ArrayList<CodeableConcept>();
        return this.actionReason;
    }

    public boolean hasActionReason() {
        if (this.actionReason == null)
            return false;
        for (CodeableConcept item : this.actionReason) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addActionReason() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.actionReason == null)
            this.actionReason = new ArrayList<CodeableConcept>();
        this.actionReason.add(t);
        return t;
    }

    // syntactic sugar
    public TermComponent addActionReason(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.actionReason == null)
            this.actionReason = new ArrayList<CodeableConcept>();
        this.actionReason.add(t);
        return this;
    }

    /**
     * @return {@link #actor} (List of actors participating in this Contract Provision.)
     */
    public List<TermActorComponent> getActor() {
        if (this.actor == null)
            this.actor = new ArrayList<TermActorComponent>();
        return this.actor;
    }

    public boolean hasActor() {
        if (this.actor == null)
            return false;
        for (TermActorComponent item : this.actor) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public TermActorComponent addActor() {
        // 3
        TermActorComponent t = new TermActorComponent();
        if (this.actor == null)
            this.actor = new ArrayList<TermActorComponent>();
        this.actor.add(t);
        return t;
    }

    // syntactic sugar
    public TermComponent addActor(TermActorComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.actor == null)
            this.actor = new ArrayList<TermActorComponent>();
        this.actor.add(t);
        return this;
    }

    /**
     * @return {@link #text} (Human readable form of this Contract Provision.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public StringType getTextElement() {
        if (this.text == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TermComponent.text");
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
     * @param value {@link #text} (Human readable form of this Contract Provision.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public TermComponent setTextElement(StringType value) {
        this.text = value;
        return this;
    }

    /**
     * @return Human readable form of this Contract Provision.
     */
    public String getText() {
        return this.text == null ? null : this.text.getValue();
    }

    /**
     * @param value Human readable form of this Contract Provision.
     */
    public TermComponent setText(String value) {
        if (Utilities.noString(value))
            this.text = null;
        else {
            if (this.text == null)
                this.text = new StringType();
            this.text.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #valuedItem} (Contract Provision Valued Item List.)
     */
    public List<TermValuedItemComponent> getValuedItem() {
        if (this.valuedItem == null)
            this.valuedItem = new ArrayList<TermValuedItemComponent>();
        return this.valuedItem;
    }

    public boolean hasValuedItem() {
        if (this.valuedItem == null)
            return false;
        for (TermValuedItemComponent item : this.valuedItem) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public TermValuedItemComponent addValuedItem() {
        // 3
        TermValuedItemComponent t = new TermValuedItemComponent();
        if (this.valuedItem == null)
            this.valuedItem = new ArrayList<TermValuedItemComponent>();
        this.valuedItem.add(t);
        return t;
    }

    // syntactic sugar
    public TermComponent addValuedItem(TermValuedItemComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.valuedItem == null)
            this.valuedItem = new ArrayList<TermValuedItemComponent>();
        this.valuedItem.add(t);
        return this;
    }

    /**
     * @return {@link #group} (Nested group of Contract Provisions.)
     */
    public List<TermComponent> getGroup() {
        if (this.group == null)
            this.group = new ArrayList<TermComponent>();
        return this.group;
    }

    public boolean hasGroup() {
        if (this.group == null)
            return false;
        for (TermComponent item : this.group) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public TermComponent addGroup() {
        // 3
        TermComponent t = new TermComponent();
        if (this.group == null)
            this.group = new ArrayList<TermComponent>();
        this.group.add(t);
        return t;
    }

    // syntactic sugar
    public TermComponent addGroup(TermComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.group == null)
            this.group = new ArrayList<TermComponent>();
        this.group.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Unique identifier for this particular Contract Provision.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("issued", "dateTime", "When this Contract Provision was issued.", 0, java.lang.Integer.MAX_VALUE, issued));
        childrenList.add(new Property("applies", "Period", "Relevant time or time-period when this Contract Provision is applicable.", 0, java.lang.Integer.MAX_VALUE, applies));
        childrenList.add(new Property("type", "CodeableConcept", "Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("subType", "CodeableConcept", "Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment.", 0, java.lang.Integer.MAX_VALUE, subType));
        childrenList.add(new Property("subject", "Reference(Any)", "Who or what this Contract Provision is about.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("action", "CodeableConcept", "Action stipulated by this Contract Provision.", 0, java.lang.Integer.MAX_VALUE, action));
        childrenList.add(new Property("actionReason", "CodeableConcept", "Reason or purpose for the action stipulated by this Contract Provision.", 0, java.lang.Integer.MAX_VALUE, actionReason));
        childrenList.add(new Property("actor", "", "List of actors participating in this Contract Provision.", 0, java.lang.Integer.MAX_VALUE, actor));
        childrenList.add(new Property("text", "string", "Human readable form of this Contract Provision.", 0, java.lang.Integer.MAX_VALUE, text));
        childrenList.add(new Property("valuedItem", "", "Contract Provision Valued Item List.", 0, java.lang.Integer.MAX_VALUE, valuedItem));
        childrenList.add(new Property("group", "@Contract.term", "Nested group of Contract Provisions.", 0, java.lang.Integer.MAX_VALUE, group));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("issued"))
            // DateTimeType
            this.issued = castToDateTime(value);
        else if (name.equals("applies"))
            // Period
            this.applies = castToPeriod(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("subType"))
            // CodeableConcept
            this.subType = castToCodeableConcept(value);
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("action"))
            this.getAction().add(castToCodeableConcept(value));
        else if (name.equals("actionReason"))
            this.getActionReason().add(castToCodeableConcept(value));
        else if (name.equals("actor"))
            this.getActor().add((TermActorComponent) value);
        else if (name.equals("text"))
            // StringType
            this.text = castToString(value);
        else if (name.equals("valuedItem"))
            this.getValuedItem().add((TermValuedItemComponent) value);
        else if (name.equals("group"))
            this.getGroup().add((TermComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("issued")) {
            throw new FHIRException("Cannot call addChild on a primitive type Contract.issued");
        } else if (name.equals("applies")) {
            this.applies = new Period();
            return this.applies;
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("subType")) {
            this.subType = new CodeableConcept();
            return this.subType;
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("action")) {
            return addAction();
        } else if (name.equals("actionReason")) {
            return addActionReason();
        } else if (name.equals("actor")) {
            return addActor();
        } else if (name.equals("text")) {
            throw new FHIRException("Cannot call addChild on a primitive type Contract.text");
        } else if (name.equals("valuedItem")) {
            return addValuedItem();
        } else if (name.equals("group")) {
            return addGroup();
        } else
            return super.addChild(name);
    }

    public TermComponent copy() {
        TermComponent dst = new TermComponent();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.issued = issued == null ? null : issued.copy();
        dst.applies = applies == null ? null : applies.copy();
        dst.type = type == null ? null : type.copy();
        dst.subType = subType == null ? null : subType.copy();
        dst.subject = subject == null ? null : subject.copy();
        if (action != null) {
            dst.action = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : action) dst.action.add(i.copy());
        }
        ;
        if (actionReason != null) {
            dst.actionReason = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : actionReason) dst.actionReason.add(i.copy());
        }
        ;
        if (actor != null) {
            dst.actor = new ArrayList<TermActorComponent>();
            for (TermActorComponent i : actor) dst.actor.add(i.copy());
        }
        ;
        dst.text = text == null ? null : text.copy();
        if (valuedItem != null) {
            dst.valuedItem = new ArrayList<TermValuedItemComponent>();
            for (TermValuedItemComponent i : valuedItem) dst.valuedItem.add(i.copy());
        }
        ;
        if (group != null) {
            dst.group = new ArrayList<TermComponent>();
            for (TermComponent i : group) dst.group.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TermComponent))
            return false;
        TermComponent o = (TermComponent) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(issued, o.issued, true) && compareDeep(applies, o.applies, true) && compareDeep(type, o.type, true) && compareDeep(subType, o.subType, true) && compareDeep(subject, o.subject, true) && compareDeep(action, o.action, true) && compareDeep(actionReason, o.actionReason, true) && compareDeep(actor, o.actor, true) && compareDeep(text, o.text, true) && compareDeep(valuedItem, o.valuedItem, true) && compareDeep(group, o.group, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TermComponent))
            return false;
        TermComponent o = (TermComponent) other;
        return compareValues(issued, o.issued, true) && compareValues(text, o.text, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (issued == null || issued.isEmpty()) && (applies == null || applies.isEmpty()) && (type == null || type.isEmpty()) && (subType == null || subType.isEmpty()) && (subject == null || subject.isEmpty()) && (action == null || action.isEmpty()) && (actionReason == null || actionReason.isEmpty()) && (actor == null || actor.isEmpty()) && (text == null || text.isEmpty()) && (valuedItem == null || valuedItem.isEmpty()) && (group == null || group.isEmpty());
    }

    public String fhirType() {
        return "Contract.term";
    }
}
