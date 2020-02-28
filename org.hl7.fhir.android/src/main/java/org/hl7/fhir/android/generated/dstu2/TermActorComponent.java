package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class TermActorComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The actor assigned a role in this Contract Provision.
     */
    protected Reference entity;

    /**
     * The actual object that is the target of the reference (The actor assigned a role in this Contract Provision.)
     */
    protected Resource entityTarget;

    /**
     * Role played by the actor assigned this role in this Contract Provision.
     */
    protected List<CodeableConcept> role;

    private static final long serialVersionUID = 1371245689L;

    /*
     * Constructor
     */
    public TermActorComponent() {
        super();
    }

    /*
     * Constructor
     */
    public TermActorComponent(Reference entity) {
        super();
        this.entity = entity;
    }

    /**
     * @return {@link #entity} (The actor assigned a role in this Contract Provision.)
     */
    public Reference getEntity() {
        if (this.entity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TermActorComponent.entity");
            else if (Configuration.doAutoCreate())
                // cc
                this.entity = new Reference();
        return this.entity;
    }

    public boolean hasEntity() {
        return this.entity != null && !this.entity.isEmpty();
    }

    /**
     * @param value {@link #entity} (The actor assigned a role in this Contract Provision.)
     */
    public TermActorComponent setEntity(Reference value) {
        this.entity = value;
        return this;
    }

    /**
     * @return {@link #entity} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The actor assigned a role in this Contract Provision.)
     */
    public Resource getEntityTarget() {
        return this.entityTarget;
    }

    /**
     * @param value {@link #entity} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The actor assigned a role in this Contract Provision.)
     */
    public TermActorComponent setEntityTarget(Resource value) {
        this.entityTarget = value;
        return this;
    }

    /**
     * @return {@link #role} (Role played by the actor assigned this role in this Contract Provision.)
     */
    public List<CodeableConcept> getRole() {
        if (this.role == null)
            this.role = new ArrayList<CodeableConcept>();
        return this.role;
    }

    public boolean hasRole() {
        if (this.role == null)
            return false;
        for (CodeableConcept item : this.role) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addRole() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.role == null)
            this.role = new ArrayList<CodeableConcept>();
        this.role.add(t);
        return t;
    }

    // syntactic sugar
    public TermActorComponent addRole(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.role == null)
            this.role = new ArrayList<CodeableConcept>();
        this.role.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("entity", "Reference(Contract|Device|Group|Location|Organization|Patient|Practitioner|RelatedPerson|Substance)", "The actor assigned a role in this Contract Provision.", 0, java.lang.Integer.MAX_VALUE, entity));
        childrenList.add(new Property("role", "CodeableConcept", "Role played by the actor assigned this role in this Contract Provision.", 0, java.lang.Integer.MAX_VALUE, role));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("entity"))
            // Reference
            this.entity = castToReference(value);
        else if (name.equals("role"))
            this.getRole().add(castToCodeableConcept(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("entity")) {
            this.entity = new Reference();
            return this.entity;
        } else if (name.equals("role")) {
            return addRole();
        } else
            return super.addChild(name);
    }

    public TermActorComponent copy() {
        TermActorComponent dst = new TermActorComponent();
        copyValues(dst);
        dst.entity = entity == null ? null : entity.copy();
        if (role != null) {
            dst.role = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : role) dst.role.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TermActorComponent))
            return false;
        TermActorComponent o = (TermActorComponent) other;
        return compareDeep(entity, o.entity, true) && compareDeep(role, o.role, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TermActorComponent))
            return false;
        TermActorComponent o = (TermActorComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (entity == null || entity.isEmpty()) && (role == null || role.isEmpty());
    }

    public String fhirType() {
        return "Contract.term.actor";
    }
}
