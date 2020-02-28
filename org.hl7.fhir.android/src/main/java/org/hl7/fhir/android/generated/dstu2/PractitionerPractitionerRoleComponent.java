package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;

public class PractitionerPractitionerRoleComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The organization where the Practitioner performs the roles associated.
     */
    protected Reference managingOrganization;

    /**
     * The actual object that is the target of the reference (The organization where the Practitioner performs the roles associated.)
     */
    protected Organization managingOrganizationTarget;

    /**
     * Roles which this practitioner is authorized to perform for the organization.
     */
    protected CodeableConcept role;

    /**
     * Specific specialty of the practitioner.
     */
    protected List<CodeableConcept> specialty;

    /**
     * The period during which the person is authorized to act as a practitioner in these role(s) for the organization.
     */
    protected Period period;

    /**
     * The location(s) at which this practitioner provides care.
     */
    protected List<Reference> location;

    /**
     * The actual objects that are the target of the reference (The location(s) at which this practitioner provides care.)
     */
    protected List<Location> locationTarget;

    /**
     * The list of healthcare services that this worker provides for this role's Organization/Location(s).
     */
    protected List<Reference> healthcareService;

    /**
     * The actual objects that are the target of the reference (The list of healthcare services that this worker provides for this role's Organization/Location(s).)
     */
    protected List<HealthcareService> healthcareServiceTarget;

    private static final long serialVersionUID = -2146177018L;

    /*
     * Constructor
     */
    public PractitionerPractitionerRoleComponent() {
        super();
    }

    /**
     * @return {@link #managingOrganization} (The organization where the Practitioner performs the roles associated.)
     */
    public Reference getManagingOrganization() {
        if (this.managingOrganization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PractitionerPractitionerRoleComponent.managingOrganization");
            else if (Configuration.doAutoCreate())
                // cc
                this.managingOrganization = new Reference();
        return this.managingOrganization;
    }

    public boolean hasManagingOrganization() {
        return this.managingOrganization != null && !this.managingOrganization.isEmpty();
    }

    /**
     * @param value {@link #managingOrganization} (The organization where the Practitioner performs the roles associated.)
     */
    public PractitionerPractitionerRoleComponent setManagingOrganization(Reference value) {
        this.managingOrganization = value;
        return this;
    }

    /**
     * @return {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization where the Practitioner performs the roles associated.)
     */
    public Organization getManagingOrganizationTarget() {
        if (this.managingOrganizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PractitionerPractitionerRoleComponent.managingOrganization");
            else if (Configuration.doAutoCreate())
                // aa
                this.managingOrganizationTarget = new Organization();
        return this.managingOrganizationTarget;
    }

    /**
     * @param value {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization where the Practitioner performs the roles associated.)
     */
    public PractitionerPractitionerRoleComponent setManagingOrganizationTarget(Organization value) {
        this.managingOrganizationTarget = value;
        return this;
    }

    /**
     * @return {@link #role} (Roles which this practitioner is authorized to perform for the organization.)
     */
    public CodeableConcept getRole() {
        if (this.role == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PractitionerPractitionerRoleComponent.role");
            else if (Configuration.doAutoCreate())
                // cc
                this.role = new CodeableConcept();
        return this.role;
    }

    public boolean hasRole() {
        return this.role != null && !this.role.isEmpty();
    }

    /**
     * @param value {@link #role} (Roles which this practitioner is authorized to perform for the organization.)
     */
    public PractitionerPractitionerRoleComponent setRole(CodeableConcept value) {
        this.role = value;
        return this;
    }

    /**
     * @return {@link #specialty} (Specific specialty of the practitioner.)
     */
    public List<CodeableConcept> getSpecialty() {
        if (this.specialty == null)
            this.specialty = new ArrayList<CodeableConcept>();
        return this.specialty;
    }

    public boolean hasSpecialty() {
        if (this.specialty == null)
            return false;
        for (CodeableConcept item : this.specialty) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addSpecialty() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.specialty == null)
            this.specialty = new ArrayList<CodeableConcept>();
        this.specialty.add(t);
        return t;
    }

    // syntactic sugar
    public PractitionerPractitionerRoleComponent addSpecialty(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.specialty == null)
            this.specialty = new ArrayList<CodeableConcept>();
        this.specialty.add(t);
        return this;
    }

    /**
     * @return {@link #period} (The period during which the person is authorized to act as a practitioner in these role(s) for the organization.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PractitionerPractitionerRoleComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period during which the person is authorized to act as a practitioner in these role(s) for the organization.)
     */
    public PractitionerPractitionerRoleComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #location} (The location(s) at which this practitioner provides care.)
     */
    public List<Reference> getLocation() {
        if (this.location == null)
            this.location = new ArrayList<Reference>();
        return this.location;
    }

    public boolean hasLocation() {
        if (this.location == null)
            return false;
        for (Reference item : this.location) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addLocation() {
        // 3
        Reference t = new Reference();
        if (this.location == null)
            this.location = new ArrayList<Reference>();
        this.location.add(t);
        return t;
    }

    // syntactic sugar
    public PractitionerPractitionerRoleComponent addLocation(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.location == null)
            this.location = new ArrayList<Reference>();
        this.location.add(t);
        return this;
    }

    /**
     * @return {@link #location} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The location(s) at which this practitioner provides care.)
     */
    public List<Location> getLocationTarget() {
        if (this.locationTarget == null)
            this.locationTarget = new ArrayList<Location>();
        return this.locationTarget;
    }

    /**
     * @return {@link #location} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. The location(s) at which this practitioner provides care.)
     */
    public Location addLocationTarget() {
        Location r = new Location();
        if (this.locationTarget == null)
            this.locationTarget = new ArrayList<Location>();
        this.locationTarget.add(r);
        return r;
    }

    /**
     * @return {@link #healthcareService} (The list of healthcare services that this worker provides for this role's Organization/Location(s).)
     */
    public List<Reference> getHealthcareService() {
        if (this.healthcareService == null)
            this.healthcareService = new ArrayList<Reference>();
        return this.healthcareService;
    }

    public boolean hasHealthcareService() {
        if (this.healthcareService == null)
            return false;
        for (Reference item : this.healthcareService) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addHealthcareService() {
        // 3
        Reference t = new Reference();
        if (this.healthcareService == null)
            this.healthcareService = new ArrayList<Reference>();
        this.healthcareService.add(t);
        return t;
    }

    // syntactic sugar
    public PractitionerPractitionerRoleComponent addHealthcareService(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.healthcareService == null)
            this.healthcareService = new ArrayList<Reference>();
        this.healthcareService.add(t);
        return this;
    }

    /**
     * @return {@link #healthcareService} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The list of healthcare services that this worker provides for this role's Organization/Location(s).)
     */
    public List<HealthcareService> getHealthcareServiceTarget() {
        if (this.healthcareServiceTarget == null)
            this.healthcareServiceTarget = new ArrayList<HealthcareService>();
        return this.healthcareServiceTarget;
    }

    /**
     * @return {@link #healthcareService} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. The list of healthcare services that this worker provides for this role's Organization/Location(s).)
     */
    public HealthcareService addHealthcareServiceTarget() {
        HealthcareService r = new HealthcareService();
        if (this.healthcareServiceTarget == null)
            this.healthcareServiceTarget = new ArrayList<HealthcareService>();
        this.healthcareServiceTarget.add(r);
        return r;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("managingOrganization", "Reference(Organization)", "The organization where the Practitioner performs the roles associated.", 0, java.lang.Integer.MAX_VALUE, managingOrganization));
        childrenList.add(new Property("role", "CodeableConcept", "Roles which this practitioner is authorized to perform for the organization.", 0, java.lang.Integer.MAX_VALUE, role));
        childrenList.add(new Property("specialty", "CodeableConcept", "Specific specialty of the practitioner.", 0, java.lang.Integer.MAX_VALUE, specialty));
        childrenList.add(new Property("period", "Period", "The period during which the person is authorized to act as a practitioner in these role(s) for the organization.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("location", "Reference(Location)", "The location(s) at which this practitioner provides care.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("healthcareService", "Reference(HealthcareService)", "The list of healthcare services that this worker provides for this role's Organization/Location(s).", 0, java.lang.Integer.MAX_VALUE, healthcareService));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("managingOrganization"))
            // Reference
            this.managingOrganization = castToReference(value);
        else if (name.equals("role"))
            // CodeableConcept
            this.role = castToCodeableConcept(value);
        else if (name.equals("specialty"))
            this.getSpecialty().add(castToCodeableConcept(value));
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("location"))
            this.getLocation().add(castToReference(value));
        else if (name.equals("healthcareService"))
            this.getHealthcareService().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("managingOrganization")) {
            this.managingOrganization = new Reference();
            return this.managingOrganization;
        } else if (name.equals("role")) {
            this.role = new CodeableConcept();
            return this.role;
        } else if (name.equals("specialty")) {
            return addSpecialty();
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("location")) {
            return addLocation();
        } else if (name.equals("healthcareService")) {
            return addHealthcareService();
        } else
            return super.addChild(name);
    }

    public PractitionerPractitionerRoleComponent copy() {
        PractitionerPractitionerRoleComponent dst = new PractitionerPractitionerRoleComponent();
        copyValues(dst);
        dst.managingOrganization = managingOrganization == null ? null : managingOrganization.copy();
        dst.role = role == null ? null : role.copy();
        if (specialty != null) {
            dst.specialty = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : specialty) dst.specialty.add(i.copy());
        }
        ;
        dst.period = period == null ? null : period.copy();
        if (location != null) {
            dst.location = new ArrayList<Reference>();
            for (Reference i : location) dst.location.add(i.copy());
        }
        ;
        if (healthcareService != null) {
            dst.healthcareService = new ArrayList<Reference>();
            for (Reference i : healthcareService) dst.healthcareService.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof PractitionerPractitionerRoleComponent))
            return false;
        PractitionerPractitionerRoleComponent o = (PractitionerPractitionerRoleComponent) other;
        return compareDeep(managingOrganization, o.managingOrganization, true) && compareDeep(role, o.role, true) && compareDeep(specialty, o.specialty, true) && compareDeep(period, o.period, true) && compareDeep(location, o.location, true) && compareDeep(healthcareService, o.healthcareService, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof PractitionerPractitionerRoleComponent))
            return false;
        PractitionerPractitionerRoleComponent o = (PractitionerPractitionerRoleComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (managingOrganization == null || managingOrganization.isEmpty()) && (role == null || role.isEmpty()) && (specialty == null || specialty.isEmpty()) && (period == null || period.isEmpty()) && (location == null || location.isEmpty()) && (healthcareService == null || healthcareService.isEmpty());
    }

    public String fhirType() {
        return "Practitioner.practitionerRole";
    }
}
