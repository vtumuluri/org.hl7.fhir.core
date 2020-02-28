package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.ProcedureEnum.ProcedureStatus;
import org.hl7.fhir.android.generated.dstu2.ProcedureEnum.ProcedureStatusEnumFactory;

public class ProcedurePerformerComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The practitioner who was involved in the procedure.
     */
    protected Reference actor;

    /**
     * The actual object that is the target of the reference (The practitioner who was involved in the procedure.)
     */
    protected Resource actorTarget;

    /**
     * For example: surgeon, anaethetist, endoscopist.
     */
    protected CodeableConcept role;

    private static final long serialVersionUID = -843698327L;

    /*
     * Constructor
     */
    public ProcedurePerformerComponent() {
        super();
    }

    /**
     * @return {@link #actor} (The practitioner who was involved in the procedure.)
     */
    public Reference getActor() {
        if (this.actor == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedurePerformerComponent.actor");
            else if (Configuration.doAutoCreate())
                // cc
                this.actor = new Reference();
        return this.actor;
    }

    public boolean hasActor() {
        return this.actor != null && !this.actor.isEmpty();
    }

    /**
     * @param value {@link #actor} (The practitioner who was involved in the procedure.)
     */
    public ProcedurePerformerComponent setActor(Reference value) {
        this.actor = value;
        return this;
    }

    /**
     * @return {@link #actor} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The practitioner who was involved in the procedure.)
     */
    public Resource getActorTarget() {
        return this.actorTarget;
    }

    /**
     * @param value {@link #actor} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The practitioner who was involved in the procedure.)
     */
    public ProcedurePerformerComponent setActorTarget(Resource value) {
        this.actorTarget = value;
        return this;
    }

    /**
     * @return {@link #role} (For example: surgeon, anaethetist, endoscopist.)
     */
    public CodeableConcept getRole() {
        if (this.role == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedurePerformerComponent.role");
            else if (Configuration.doAutoCreate())
                // cc
                this.role = new CodeableConcept();
        return this.role;
    }

    public boolean hasRole() {
        return this.role != null && !this.role.isEmpty();
    }

    /**
     * @param value {@link #role} (For example: surgeon, anaethetist, endoscopist.)
     */
    public ProcedurePerformerComponent setRole(CodeableConcept value) {
        this.role = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("actor", "Reference(Practitioner|Organization|Patient|RelatedPerson)", "The practitioner who was involved in the procedure.", 0, java.lang.Integer.MAX_VALUE, actor));
        childrenList.add(new Property("role", "CodeableConcept", "For example: surgeon, anaethetist, endoscopist.", 0, java.lang.Integer.MAX_VALUE, role));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("actor"))
            // Reference
            this.actor = castToReference(value);
        else if (name.equals("role"))
            // CodeableConcept
            this.role = castToCodeableConcept(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("actor")) {
            this.actor = new Reference();
            return this.actor;
        } else if (name.equals("role")) {
            this.role = new CodeableConcept();
            return this.role;
        } else
            return super.addChild(name);
    }

    public ProcedurePerformerComponent copy() {
        ProcedurePerformerComponent dst = new ProcedurePerformerComponent();
        copyValues(dst);
        dst.actor = actor == null ? null : actor.copy();
        dst.role = role == null ? null : role.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ProcedurePerformerComponent))
            return false;
        ProcedurePerformerComponent o = (ProcedurePerformerComponent) other;
        return compareDeep(actor, o.actor, true) && compareDeep(role, o.role, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ProcedurePerformerComponent))
            return false;
        ProcedurePerformerComponent o = (ProcedurePerformerComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (actor == null || actor.isEmpty()) && (role == null || role.isEmpty());
    }

    public String fhirType() {
        return "Procedure.performer";
    }
}
