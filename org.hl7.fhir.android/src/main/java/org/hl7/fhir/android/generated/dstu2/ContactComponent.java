package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.PatientEnum.LinkType;
import org.hl7.fhir.android.generated.dstu2.PatientEnum.LinkTypeEnumFactory;

public class ContactComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The nature of the relationship between the patient and the contact person.
     */
    protected List<CodeableConcept> relationship;

    /**
     * A name associated with the contact person.
     */
    protected HumanName name;

    /**
     * A contact detail for the person, e.g. a telephone number or an email address.
     */
    protected List<ContactPoint> telecom;

    /**
     * Address for the contact person.
     */
    protected Address address;

    /**
     * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
     */
    protected Enumeration<AdministrativeGender> gender;

    /**
     * Organization on behalf of which the contact is acting or for which the contact is working.
     */
    protected Reference organization;

    /**
     * The actual object that is the target of the reference (Organization on behalf of which the contact is acting or for which the contact is working.)
     */
    protected Organization organizationTarget;

    /**
     * The period during which this contact person or organization is valid to be contacted relating to this patient.
     */
    protected Period period;

    private static final long serialVersionUID = 364269017L;

    /*
     * Constructor
     */
    public ContactComponent() {
        super();
    }

    /**
     * @return {@link #relationship} (The nature of the relationship between the patient and the contact person.)
     */
    public List<CodeableConcept> getRelationship() {
        if (this.relationship == null)
            this.relationship = new ArrayList<CodeableConcept>();
        return this.relationship;
    }

    public boolean hasRelationship() {
        if (this.relationship == null)
            return false;
        for (CodeableConcept item : this.relationship) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addRelationship() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.relationship == null)
            this.relationship = new ArrayList<CodeableConcept>();
        this.relationship.add(t);
        return t;
    }

    // syntactic sugar
    public ContactComponent addRelationship(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.relationship == null)
            this.relationship = new ArrayList<CodeableConcept>();
        this.relationship.add(t);
        return this;
    }

    /**
     * @return {@link #name} (A name associated with the contact person.)
     */
    public HumanName getName() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactComponent.name");
            else if (Configuration.doAutoCreate())
                // cc
                this.name = new HumanName();
        return this.name;
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A name associated with the contact person.)
     */
    public ContactComponent setName(HumanName value) {
        this.name = value;
        return this;
    }

    /**
     * @return {@link #telecom} (A contact detail for the person, e.g. a telephone number or an email address.)
     */
    public List<ContactPoint> getTelecom() {
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        return this.telecom;
    }

    public boolean hasTelecom() {
        if (this.telecom == null)
            return false;
        for (ContactPoint item : this.telecom) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ContactPoint addTelecom() {
        // 3
        ContactPoint t = new ContactPoint();
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return t;
    }

    // syntactic sugar
    public ContactComponent addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    /**
     * @return {@link #address} (Address for the contact person.)
     */
    public Address getAddress() {
        if (this.address == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactComponent.address");
            else if (Configuration.doAutoCreate())
                // cc
                this.address = new Address();
        return this.address;
    }

    public boolean hasAddress() {
        return this.address != null && !this.address.isEmpty();
    }

    /**
     * @param value {@link #address} (Address for the contact person.)
     */
    public ContactComponent setAddress(Address value) {
        this.address = value;
        return this;
    }

    /**
     * @return {@link #gender} (Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Enumeration<AdministrativeGender> getGenderElement() {
        if (this.gender == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactComponent.gender");
            else if (Configuration.doAutoCreate())
                // bb
                this.gender = new Enumeration<AdministrativeGender>(new AdministrativeGenderEnumFactory());
        return this.gender;
    }

    public boolean hasGenderElement() {
        return this.gender != null && !this.gender.isEmpty();
    }

    public boolean hasGender() {
        return this.gender != null && !this.gender.isEmpty();
    }

    /**
     * @param value {@link #gender} (Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public ContactComponent setGenderElement(Enumeration<AdministrativeGender> value) {
        this.gender = value;
        return this;
    }

    /**
     * @return Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
     */
    public AdministrativeGender getGender() {
        return this.gender == null ? null : this.gender.getValue();
    }

    /**
     * @param value Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
     */
    public ContactComponent setGender(AdministrativeGender value) {
        if (value == null)
            this.gender = null;
        else {
            if (this.gender == null)
                this.gender = new Enumeration<AdministrativeGender>(new AdministrativeGenderEnumFactory());
            this.gender.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #organization} (Organization on behalf of which the contact is acting or for which the contact is working.)
     */
    public Reference getOrganization() {
        if (this.organization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactComponent.organization");
            else if (Configuration.doAutoCreate())
                // cc
                this.organization = new Reference();
        return this.organization;
    }

    public boolean hasOrganization() {
        return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (Organization on behalf of which the contact is acting or for which the contact is working.)
     */
    public ContactComponent setOrganization(Reference value) {
        this.organization = value;
        return this;
    }

    /**
     * @return {@link #organization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Organization on behalf of which the contact is acting or for which the contact is working.)
     */
    public Organization getOrganizationTarget() {
        if (this.organizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactComponent.organization");
            else if (Configuration.doAutoCreate())
                // aa
                this.organizationTarget = new Organization();
        return this.organizationTarget;
    }

    /**
     * @param value {@link #organization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Organization on behalf of which the contact is acting or for which the contact is working.)
     */
    public ContactComponent setOrganizationTarget(Organization value) {
        this.organizationTarget = value;
        return this;
    }

    /**
     * @return {@link #period} (The period during which this contact person or organization is valid to be contacted relating to this patient.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period during which this contact person or organization is valid to be contacted relating to this patient.)
     */
    public ContactComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("relationship", "CodeableConcept", "The nature of the relationship between the patient and the contact person.", 0, java.lang.Integer.MAX_VALUE, relationship));
        childrenList.add(new Property("name", "HumanName", "A name associated with the contact person.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("telecom", "ContactPoint", "A contact detail for the person, e.g. a telephone number or an email address.", 0, java.lang.Integer.MAX_VALUE, telecom));
        childrenList.add(new Property("address", "Address", "Address for the contact person.", 0, java.lang.Integer.MAX_VALUE, address));
        childrenList.add(new Property("gender", "code", "Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.", 0, java.lang.Integer.MAX_VALUE, gender));
        childrenList.add(new Property("organization", "Reference(Organization)", "Organization on behalf of which the contact is acting or for which the contact is working.", 0, java.lang.Integer.MAX_VALUE, organization));
        childrenList.add(new Property("period", "Period", "The period during which this contact person or organization is valid to be contacted relating to this patient.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("relationship"))
            this.getRelationship().add(castToCodeableConcept(value));
        else if (name.equals("name"))
            // HumanName
            this.name = castToHumanName(value);
        else if (name.equals("telecom"))
            this.getTelecom().add(castToContactPoint(value));
        else if (name.equals("address"))
            // Address
            this.address = castToAddress(value);
        else if (name.equals("gender"))
            // Enumeration<AdministrativeGender>
            this.gender = new AdministrativeGenderEnumFactory().fromType(value);
        else if (name.equals("organization"))
            // Reference
            this.organization = castToReference(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("relationship")) {
            return addRelationship();
        } else if (name.equals("name")) {
            this.name = new HumanName();
            return this.name;
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else if (name.equals("address")) {
            this.address = new Address();
            return this.address;
        } else if (name.equals("gender")) {
            throw new FHIRException("Cannot call addChild on a primitive type Patient.gender");
        } else if (name.equals("organization")) {
            this.organization = new Reference();
            return this.organization;
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public ContactComponent copy() {
        ContactComponent dst = new ContactComponent();
        copyValues(dst);
        if (relationship != null) {
            dst.relationship = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : relationship) dst.relationship.add(i.copy());
        }
        ;
        dst.name = name == null ? null : name.copy();
        if (telecom != null) {
            dst.telecom = new ArrayList<ContactPoint>();
            for (ContactPoint i : telecom) dst.telecom.add(i.copy());
        }
        ;
        dst.address = address == null ? null : address.copy();
        dst.gender = gender == null ? null : gender.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ContactComponent))
            return false;
        ContactComponent o = (ContactComponent) other;
        return compareDeep(relationship, o.relationship, true) && compareDeep(name, o.name, true) && compareDeep(telecom, o.telecom, true) && compareDeep(address, o.address, true) && compareDeep(gender, o.gender, true) && compareDeep(organization, o.organization, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ContactComponent))
            return false;
        ContactComponent o = (ContactComponent) other;
        return compareValues(gender, o.gender, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (relationship == null || relationship.isEmpty()) && (name == null || name.isEmpty()) && (telecom == null || telecom.isEmpty()) && (address == null || address.isEmpty()) && (gender == null || gender.isEmpty()) && (organization == null || organization.isEmpty()) && (period == null || period.isEmpty());
    }

    public String fhirType() {
        return "Patient.contact";
    }
}
