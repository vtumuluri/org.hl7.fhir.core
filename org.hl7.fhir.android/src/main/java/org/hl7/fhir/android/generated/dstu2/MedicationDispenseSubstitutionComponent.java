package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationDispenseEnum.MedicationDispenseStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.MedicationDispenseEnum.MedicationDispenseStatus;

public class MedicationDispenseSubstitutionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A code signifying whether a different drug was dispensed from what was prescribed.
     */
    protected CodeableConcept type;

    /**
     * Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.
     */
    protected List<CodeableConcept> reason;

    /**
     * The person or organization that has primary responsibility for the substitution.
     */
    protected List<Reference> responsibleParty;

    /**
     * The actual objects that are the target of the reference (The person or organization that has primary responsibility for the substitution.)
     */
    protected List<Practitioner> responsiblePartyTarget;

    private static final long serialVersionUID = 1218245830L;

    /*
     * Constructor
     */
    public MedicationDispenseSubstitutionComponent() {
        super();
    }

    /*
     * Constructor
     */
    public MedicationDispenseSubstitutionComponent(CodeableConcept type) {
        super();
        this.type = type;
    }

    /**
     * @return {@link #type} (A code signifying whether a different drug was dispensed from what was prescribed.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispenseSubstitutionComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (A code signifying whether a different drug was dispensed from what was prescribed.)
     */
    public MedicationDispenseSubstitutionComponent setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #reason} (Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.)
     */
    public List<CodeableConcept> getReason() {
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        return this.reason;
    }

    public boolean hasReason() {
        if (this.reason == null)
            return false;
        for (CodeableConcept item : this.reason) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addReason() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        this.reason.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationDispenseSubstitutionComponent addReason(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        this.reason.add(t);
        return this;
    }

    /**
     * @return {@link #responsibleParty} (The person or organization that has primary responsibility for the substitution.)
     */
    public List<Reference> getResponsibleParty() {
        if (this.responsibleParty == null)
            this.responsibleParty = new ArrayList<Reference>();
        return this.responsibleParty;
    }

    public boolean hasResponsibleParty() {
        if (this.responsibleParty == null)
            return false;
        for (Reference item : this.responsibleParty) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addResponsibleParty() {
        // 3
        Reference t = new Reference();
        if (this.responsibleParty == null)
            this.responsibleParty = new ArrayList<Reference>();
        this.responsibleParty.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationDispenseSubstitutionComponent addResponsibleParty(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.responsibleParty == null)
            this.responsibleParty = new ArrayList<Reference>();
        this.responsibleParty.add(t);
        return this;
    }

    /**
     * @return {@link #responsibleParty} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The person or organization that has primary responsibility for the substitution.)
     */
    public List<Practitioner> getResponsiblePartyTarget() {
        if (this.responsiblePartyTarget == null)
            this.responsiblePartyTarget = new ArrayList<Practitioner>();
        return this.responsiblePartyTarget;
    }

    /**
     * @return {@link #responsibleParty} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. The person or organization that has primary responsibility for the substitution.)
     */
    public Practitioner addResponsiblePartyTarget() {
        Practitioner r = new Practitioner();
        if (this.responsiblePartyTarget == null)
            this.responsiblePartyTarget = new ArrayList<Practitioner>();
        this.responsiblePartyTarget.add(r);
        return r;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "A code signifying whether a different drug was dispensed from what was prescribed.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("reason", "CodeableConcept", "Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("responsibleParty", "Reference(Practitioner)", "The person or organization that has primary responsibility for the substitution.", 0, java.lang.Integer.MAX_VALUE, responsibleParty));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("reason"))
            this.getReason().add(castToCodeableConcept(value));
        else if (name.equals("responsibleParty"))
            this.getResponsibleParty().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("reason")) {
            return addReason();
        } else if (name.equals("responsibleParty")) {
            return addResponsibleParty();
        } else
            return super.addChild(name);
    }

    public MedicationDispenseSubstitutionComponent copy() {
        MedicationDispenseSubstitutionComponent dst = new MedicationDispenseSubstitutionComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        if (reason != null) {
            dst.reason = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reason) dst.reason.add(i.copy());
        }
        ;
        if (responsibleParty != null) {
            dst.responsibleParty = new ArrayList<Reference>();
            for (Reference i : responsibleParty) dst.responsibleParty.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationDispenseSubstitutionComponent))
            return false;
        MedicationDispenseSubstitutionComponent o = (MedicationDispenseSubstitutionComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(reason, o.reason, true) && compareDeep(responsibleParty, o.responsibleParty, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationDispenseSubstitutionComponent))
            return false;
        MedicationDispenseSubstitutionComponent o = (MedicationDispenseSubstitutionComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (reason == null || reason.isEmpty()) && (responsibleParty == null || responsibleParty.isEmpty());
    }

    public String fhirType() {
        return "MedicationDispense.substitution";
    }
}
