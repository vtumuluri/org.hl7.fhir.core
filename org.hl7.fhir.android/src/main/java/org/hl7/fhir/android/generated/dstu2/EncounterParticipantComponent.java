package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterState;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterStateEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClass;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClassEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatus;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatusEnumFactory;

public class EncounterParticipantComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Role of participant in encounter.
     */
    protected List<CodeableConcept> type;

    /**
     * The period of time that the specified participant was present during the encounter. These can overlap or be sub-sets of the overall encounters period.
     */
    protected Period period;

    /**
     * Persons involved in the encounter other than the patient.
     */
    protected Reference individual;

    /**
     * The actual object that is the target of the reference (Persons involved in the encounter other than the patient.)
     */
    protected Resource individualTarget;

    private static final long serialVersionUID = 317095765L;

    /*
     * Constructor
     */
    public EncounterParticipantComponent() {
        super();
    }

    /**
     * @return {@link #type} (Role of participant in encounter.)
     */
    public List<CodeableConcept> getType() {
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        return this.type;
    }

    public boolean hasType() {
        if (this.type == null)
            return false;
        for (CodeableConcept item : this.type) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addType() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        this.type.add(t);
        return t;
    }

    // syntactic sugar
    public EncounterParticipantComponent addType(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        this.type.add(t);
        return this;
    }

    /**
     * @return {@link #period} (The period of time that the specified participant was present during the encounter. These can overlap or be sub-sets of the overall encounters period.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterParticipantComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period of time that the specified participant was present during the encounter. These can overlap or be sub-sets of the overall encounters period.)
     */
    public EncounterParticipantComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #individual} (Persons involved in the encounter other than the patient.)
     */
    public Reference getIndividual() {
        if (this.individual == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterParticipantComponent.individual");
            else if (Configuration.doAutoCreate())
                // cc
                this.individual = new Reference();
        return this.individual;
    }

    public boolean hasIndividual() {
        return this.individual != null && !this.individual.isEmpty();
    }

    /**
     * @param value {@link #individual} (Persons involved in the encounter other than the patient.)
     */
    public EncounterParticipantComponent setIndividual(Reference value) {
        this.individual = value;
        return this;
    }

    /**
     * @return {@link #individual} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Persons involved in the encounter other than the patient.)
     */
    public Resource getIndividualTarget() {
        return this.individualTarget;
    }

    /**
     * @param value {@link #individual} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Persons involved in the encounter other than the patient.)
     */
    public EncounterParticipantComponent setIndividualTarget(Resource value) {
        this.individualTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "Role of participant in encounter.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("period", "Period", "The period of time that the specified participant was present during the encounter. These can overlap or be sub-sets of the overall encounters period.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("individual", "Reference(Practitioner|RelatedPerson)", "Persons involved in the encounter other than the patient.", 0, java.lang.Integer.MAX_VALUE, individual));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            this.getType().add(castToCodeableConcept(value));
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("individual"))
            // Reference
            this.individual = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            return addType();
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("individual")) {
            this.individual = new Reference();
            return this.individual;
        } else
            return super.addChild(name);
    }

    public EncounterParticipantComponent copy() {
        EncounterParticipantComponent dst = new EncounterParticipantComponent();
        copyValues(dst);
        if (type != null) {
            dst.type = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : type) dst.type.add(i.copy());
        }
        ;
        dst.period = period == null ? null : period.copy();
        dst.individual = individual == null ? null : individual.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof EncounterParticipantComponent))
            return false;
        EncounterParticipantComponent o = (EncounterParticipantComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(period, o.period, true) && compareDeep(individual, o.individual, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof EncounterParticipantComponent))
            return false;
        EncounterParticipantComponent o = (EncounterParticipantComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (period == null || period.isEmpty()) && (individual == null || individual.isEmpty());
    }

    public String fhirType() {
        return "Encounter.participant";
    }
}
