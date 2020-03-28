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

public class CarePlanParticipantComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Indicates specific responsibility of an individual within the care plan; e.g. "Primary physician", "Team coordinator", "Caregiver", etc.
     */
    protected CodeableConcept role;

    /**
     * The specific person or organization who is participating/expected to participate in the care plan.
     */
    protected Reference member;

    /**
     * The actual object that is the target of the reference (The specific person or organization who is participating/expected to participate in the care plan.)
     */
    protected Resource memberTarget;

    private static final long serialVersionUID = -466811117L;

    /*
     * Constructor
     */
    public CarePlanParticipantComponent() {
        super();
    }

    /**
     * @return {@link #role} (Indicates specific responsibility of an individual within the care plan; e.g. "Primary physician", "Team coordinator", "Caregiver", etc.)
     */
    public CodeableConcept getRole() {
        if (this.role == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanParticipantComponent.role");
            else if (Configuration.doAutoCreate())
                // cc
                this.role = new CodeableConcept();
        return this.role;
    }

    public boolean hasRole() {
        return this.role != null && !this.role.isEmpty();
    }

    /**
     * @param value {@link #role} (Indicates specific responsibility of an individual within the care plan; e.g. "Primary physician", "Team coordinator", "Caregiver", etc.)
     */
    public CarePlanParticipantComponent setRole(CodeableConcept value) {
        this.role = value;
        return this;
    }

    /**
     * @return {@link #member} (The specific person or organization who is participating/expected to participate in the care plan.)
     */
    public Reference getMember() {
        if (this.member == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanParticipantComponent.member");
            else if (Configuration.doAutoCreate())
                // cc
                this.member = new Reference();
        return this.member;
    }

    public boolean hasMember() {
        return this.member != null && !this.member.isEmpty();
    }

    /**
     * @param value {@link #member} (The specific person or organization who is participating/expected to participate in the care plan.)
     */
    public CarePlanParticipantComponent setMember(Reference value) {
        this.member = value;
        return this;
    }

    /**
     * @return {@link #member} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The specific person or organization who is participating/expected to participate in the care plan.)
     */
    public Resource getMemberTarget() {
        return this.memberTarget;
    }

    /**
     * @param value {@link #member} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The specific person or organization who is participating/expected to participate in the care plan.)
     */
    public CarePlanParticipantComponent setMemberTarget(Resource value) {
        this.memberTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("role", "CodeableConcept", "Indicates specific responsibility of an individual within the care plan; e.g. \"Primary physician\", \"Team coordinator\", \"Caregiver\", etc.", 0, java.lang.Integer.MAX_VALUE, role));
        childrenList.add(new Property("member", "Reference(Practitioner|RelatedPerson|Patient|Organization)", "The specific person or organization who is participating/expected to participate in the care plan.", 0, java.lang.Integer.MAX_VALUE, member));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("role"))
            // CodeableConcept
            this.role = castToCodeableConcept(value);
        else if (name.equals("member"))
            // Reference
            this.member = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("role")) {
            this.role = new CodeableConcept();
            return this.role;
        } else if (name.equals("member")) {
            this.member = new Reference();
            return this.member;
        } else
            return super.addChild(name);
    }

    public CarePlanParticipantComponent copy() {
        CarePlanParticipantComponent dst = new CarePlanParticipantComponent();
        copyValues(dst);
        dst.role = role == null ? null : role.copy();
        dst.member = member == null ? null : member.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof CarePlanParticipantComponent))
            return false;
        CarePlanParticipantComponent o = (CarePlanParticipantComponent) other;
        return compareDeep(role, o.role, true) && compareDeep(member, o.member, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof CarePlanParticipantComponent))
            return false;
        CarePlanParticipantComponent o = (CarePlanParticipantComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (role == null || role.isEmpty()) && (member == null || member.isEmpty());
    }

    public String fhirType() {
        return "CarePlan.participant";
    }
}
