package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EpisodeOfCareEnum.EpisodeOfCareStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EpisodeOfCareEnum.EpisodeOfCareStatus;

public class EpisodeOfCareCareTeamComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The role this team member is taking within this episode of care.
     */
    protected List<CodeableConcept> role;

    /**
     * The period of time this practitioner is performing some role within the episode of care.
     */
    protected Period period;

    /**
     * The practitioner (or Organization) within the team.
     */
    protected Reference member;

    /**
     * The actual object that is the target of the reference (The practitioner (or Organization) within the team.)
     */
    protected Resource memberTarget;

    private static final long serialVersionUID = -437303089L;

    /*
     * Constructor
     */
    public EpisodeOfCareCareTeamComponent() {
        super();
    }

    /**
     * @return {@link #role} (The role this team member is taking within this episode of care.)
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
    public EpisodeOfCareCareTeamComponent addRole(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.role == null)
            this.role = new ArrayList<CodeableConcept>();
        this.role.add(t);
        return this;
    }

    /**
     * @return {@link #period} (The period of time this practitioner is performing some role within the episode of care.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCareCareTeamComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period of time this practitioner is performing some role within the episode of care.)
     */
    public EpisodeOfCareCareTeamComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #member} (The practitioner (or Organization) within the team.)
     */
    public Reference getMember() {
        if (this.member == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCareCareTeamComponent.member");
            else if (Configuration.doAutoCreate())
                // cc
                this.member = new Reference();
        return this.member;
    }

    public boolean hasMember() {
        return this.member != null && !this.member.isEmpty();
    }

    /**
     * @param value {@link #member} (The practitioner (or Organization) within the team.)
     */
    public EpisodeOfCareCareTeamComponent setMember(Reference value) {
        this.member = value;
        return this;
    }

    /**
     * @return {@link #member} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The practitioner (or Organization) within the team.)
     */
    public Resource getMemberTarget() {
        return this.memberTarget;
    }

    /**
     * @param value {@link #member} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The practitioner (or Organization) within the team.)
     */
    public EpisodeOfCareCareTeamComponent setMemberTarget(Resource value) {
        this.memberTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("role", "CodeableConcept", "The role this team member is taking within this episode of care.", 0, java.lang.Integer.MAX_VALUE, role));
        childrenList.add(new Property("period", "Period", "The period of time this practitioner is performing some role within the episode of care.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("member", "Reference(Practitioner|Organization)", "The practitioner (or Organization) within the team.", 0, java.lang.Integer.MAX_VALUE, member));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("role"))
            this.getRole().add(castToCodeableConcept(value));
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("member"))
            // Reference
            this.member = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("role")) {
            return addRole();
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("member")) {
            this.member = new Reference();
            return this.member;
        } else
            return super.addChild(name);
    }

    public EpisodeOfCareCareTeamComponent copy() {
        EpisodeOfCareCareTeamComponent dst = new EpisodeOfCareCareTeamComponent();
        copyValues(dst);
        if (role != null) {
            dst.role = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : role) dst.role.add(i.copy());
        }
        ;
        dst.period = period == null ? null : period.copy();
        dst.member = member == null ? null : member.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof EpisodeOfCareCareTeamComponent))
            return false;
        EpisodeOfCareCareTeamComponent o = (EpisodeOfCareCareTeamComponent) other;
        return compareDeep(role, o.role, true) && compareDeep(period, o.period, true) && compareDeep(member, o.member, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof EpisodeOfCareCareTeamComponent))
            return false;
        EpisodeOfCareCareTeamComponent o = (EpisodeOfCareCareTeamComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (role == null || role.isEmpty()) && (period == null || period.isEmpty()) && (member == null || member.isEmpty());
    }

    public String fhirType() {
        return "EpisodeOfCare.careTeam";
    }
}
