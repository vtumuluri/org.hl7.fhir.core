package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.AppointmentStatus;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.AppointmentStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipantRequired;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipantRequiredEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipationStatus;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipationStatusEnumFactory;

public class AppointmentParticipantComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Role of participant in the appointment.
     */
    protected List<CodeableConcept> type;

    /**
     * A Person, Location/HealthcareService or Device that is participating in the appointment.
     */
    protected Reference actor;

    /**
     * The actual object that is the target of the reference (A Person, Location/HealthcareService or Device that is participating in the appointment.)
     */
    protected Resource actorTarget;

    /**
     * Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
     */
    protected Enumeration<ParticipantRequired> required;

    /**
     * Participation status of the Patient.
     */
    protected Enumeration<ParticipationStatus> status;

    private static final long serialVersionUID = -1620552507L;

    /*
     * Constructor
     */
    public AppointmentParticipantComponent() {
        super();
    }

    /*
     * Constructor
     */
    public AppointmentParticipantComponent(Enumeration<ParticipationStatus> status) {
        super();
        this.status = status;
    }

    /**
     * @return {@link #type} (Role of participant in the appointment.)
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
    public AppointmentParticipantComponent addType(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        this.type.add(t);
        return this;
    }

    /**
     * @return {@link #actor} (A Person, Location/HealthcareService or Device that is participating in the appointment.)
     */
    public Reference getActor() {
        if (this.actor == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AppointmentParticipantComponent.actor");
            else if (Configuration.doAutoCreate())
                // cc
                this.actor = new Reference();
        return this.actor;
    }

    public boolean hasActor() {
        return this.actor != null && !this.actor.isEmpty();
    }

    /**
     * @param value {@link #actor} (A Person, Location/HealthcareService or Device that is participating in the appointment.)
     */
    public AppointmentParticipantComponent setActor(Reference value) {
        this.actor = value;
        return this;
    }

    /**
     * @return {@link #actor} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A Person, Location/HealthcareService or Device that is participating in the appointment.)
     */
    public Resource getActorTarget() {
        return this.actorTarget;
    }

    /**
     * @param value {@link #actor} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A Person, Location/HealthcareService or Device that is participating in the appointment.)
     */
    public AppointmentParticipantComponent setActorTarget(Resource value) {
        this.actorTarget = value;
        return this;
    }

    /**
     * @return {@link #required} (Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.). This is the underlying object with id, value and extensions. The accessor "getRequired" gives direct access to the value
     */
    public Enumeration<ParticipantRequired> getRequiredElement() {
        if (this.required == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AppointmentParticipantComponent.required");
            else if (Configuration.doAutoCreate())
                // bb
                this.required = new Enumeration<ParticipantRequired>(new ParticipantRequiredEnumFactory());
        return this.required;
    }

    public boolean hasRequiredElement() {
        return this.required != null && !this.required.isEmpty();
    }

    public boolean hasRequired() {
        return this.required != null && !this.required.isEmpty();
    }

    /**
     * @param value {@link #required} (Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.). This is the underlying object with id, value and extensions. The accessor "getRequired" gives direct access to the value
     */
    public AppointmentParticipantComponent setRequiredElement(Enumeration<ParticipantRequired> value) {
        this.required = value;
        return this;
    }

    /**
     * @return Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
     */
    public ParticipantRequired getRequired() {
        return this.required == null ? null : this.required.getValue();
    }

    /**
     * @param value Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
     */
    public AppointmentParticipantComponent setRequired(ParticipantRequired value) {
        if (value == null)
            this.required = null;
        else {
            if (this.required == null)
                this.required = new Enumeration<ParticipantRequired>(new ParticipantRequiredEnumFactory());
            this.required.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #status} (Participation status of the Patient.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ParticipationStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AppointmentParticipantComponent.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<ParticipationStatus>(new ParticipationStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Participation status of the Patient.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public AppointmentParticipantComponent setStatusElement(Enumeration<ParticipationStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Participation status of the Patient.
     */
    public ParticipationStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Participation status of the Patient.
     */
    public AppointmentParticipantComponent setStatus(ParticipationStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ParticipationStatus>(new ParticipationStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "Role of participant in the appointment.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("actor", "Reference(Patient|Practitioner|RelatedPerson|Device|HealthcareService|Location)", "A Person, Location/HealthcareService or Device that is participating in the appointment.", 0, java.lang.Integer.MAX_VALUE, actor));
        childrenList.add(new Property("required", "code", "Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.", 0, java.lang.Integer.MAX_VALUE, required));
        childrenList.add(new Property("status", "code", "Participation status of the Patient.", 0, java.lang.Integer.MAX_VALUE, status));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            this.getType().add(castToCodeableConcept(value));
        else if (name.equals("actor"))
            // Reference
            this.actor = castToReference(value);
        else if (name.equals("required"))
            // Enumeration<ParticipantRequired>
            this.required = new ParticipantRequiredEnumFactory().fromType(value);
        else if (name.equals("status"))
            // Enumeration<ParticipationStatus>
            this.status = new ParticipationStatusEnumFactory().fromType(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            return addType();
        } else if (name.equals("actor")) {
            this.actor = new Reference();
            return this.actor;
        } else if (name.equals("required")) {
            throw new FHIRException("Cannot call addChild on a primitive type Appointment.required");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Appointment.status");
        } else
            return super.addChild(name);
    }

    public AppointmentParticipantComponent copy() {
        AppointmentParticipantComponent dst = new AppointmentParticipantComponent();
        copyValues(dst);
        if (type != null) {
            dst.type = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : type) dst.type.add(i.copy());
        }
        ;
        dst.actor = actor == null ? null : actor.copy();
        dst.required = required == null ? null : required.copy();
        dst.status = status == null ? null : status.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AppointmentParticipantComponent))
            return false;
        AppointmentParticipantComponent o = (AppointmentParticipantComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(actor, o.actor, true) && compareDeep(required, o.required, true) && compareDeep(status, o.status, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AppointmentParticipantComponent))
            return false;
        AppointmentParticipantComponent o = (AppointmentParticipantComponent) other;
        return compareValues(required, o.required, true) && compareValues(status, o.status, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (actor == null || actor.isEmpty()) && (required == null || required.isEmpty()) && (status == null || status.isEmpty());
    }

    public String fhirType() {
        return "Appointment.participant";
    }
}
