package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class OrganizationContactComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Indicates a purpose for which the contact can be reached.
     */
    protected CodeableConcept purpose;

    /**
     * A name associated with the contact.
     */
    protected HumanName name;

    /**
     * A contact detail (e.g. a telephone number or an email address) by which the party may be contacted.
     */
    protected List<ContactPoint> telecom;

    /**
     * Visiting or postal addresses for the contact.
     */
    protected Address address;

    private static final long serialVersionUID = 1831121305L;

    /*
     * Constructor
     */
    public OrganizationContactComponent() {
        super();
    }

    /**
     * @return {@link #purpose} (Indicates a purpose for which the contact can be reached.)
     */
    public CodeableConcept getPurpose() {
        if (this.purpose == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OrganizationContactComponent.purpose");
            else if (Configuration.doAutoCreate())
                // cc
                this.purpose = new CodeableConcept();
        return this.purpose;
    }

    public boolean hasPurpose() {
        return this.purpose != null && !this.purpose.isEmpty();
    }

    /**
     * @param value {@link #purpose} (Indicates a purpose for which the contact can be reached.)
     */
    public OrganizationContactComponent setPurpose(CodeableConcept value) {
        this.purpose = value;
        return this;
    }

    /**
     * @return {@link #name} (A name associated with the contact.)
     */
    public HumanName getName() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OrganizationContactComponent.name");
            else if (Configuration.doAutoCreate())
                // cc
                this.name = new HumanName();
        return this.name;
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A name associated with the contact.)
     */
    public OrganizationContactComponent setName(HumanName value) {
        this.name = value;
        return this;
    }

    /**
     * @return {@link #telecom} (A contact detail (e.g. a telephone number or an email address) by which the party may be contacted.)
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
    public OrganizationContactComponent addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    /**
     * @return {@link #address} (Visiting or postal addresses for the contact.)
     */
    public Address getAddress() {
        if (this.address == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OrganizationContactComponent.address");
            else if (Configuration.doAutoCreate())
                // cc
                this.address = new Address();
        return this.address;
    }

    public boolean hasAddress() {
        return this.address != null && !this.address.isEmpty();
    }

    /**
     * @param value {@link #address} (Visiting or postal addresses for the contact.)
     */
    public OrganizationContactComponent setAddress(Address value) {
        this.address = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("purpose", "CodeableConcept", "Indicates a purpose for which the contact can be reached.", 0, java.lang.Integer.MAX_VALUE, purpose));
        childrenList.add(new Property("name", "HumanName", "A name associated with the contact.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("telecom", "ContactPoint", "A contact detail (e.g. a telephone number or an email address) by which the party may be contacted.", 0, java.lang.Integer.MAX_VALUE, telecom));
        childrenList.add(new Property("address", "Address", "Visiting or postal addresses for the contact.", 0, java.lang.Integer.MAX_VALUE, address));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("purpose"))
            // CodeableConcept
            this.purpose = castToCodeableConcept(value);
        else if (name.equals("name"))
            // HumanName
            this.name = castToHumanName(value);
        else if (name.equals("telecom"))
            this.getTelecom().add(castToContactPoint(value));
        else if (name.equals("address"))
            // Address
            this.address = castToAddress(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("purpose")) {
            this.purpose = new CodeableConcept();
            return this.purpose;
        } else if (name.equals("name")) {
            this.name = new HumanName();
            return this.name;
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else if (name.equals("address")) {
            this.address = new Address();
            return this.address;
        } else
            return super.addChild(name);
    }

    public OrganizationContactComponent copy() {
        OrganizationContactComponent dst = new OrganizationContactComponent();
        copyValues(dst);
        dst.purpose = purpose == null ? null : purpose.copy();
        dst.name = name == null ? null : name.copy();
        if (telecom != null) {
            dst.telecom = new ArrayList<ContactPoint>();
            for (ContactPoint i : telecom) dst.telecom.add(i.copy());
        }
        ;
        dst.address = address == null ? null : address.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof OrganizationContactComponent))
            return false;
        OrganizationContactComponent o = (OrganizationContactComponent) other;
        return compareDeep(purpose, o.purpose, true) && compareDeep(name, o.name, true) && compareDeep(telecom, o.telecom, true) && compareDeep(address, o.address, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof OrganizationContactComponent))
            return false;
        OrganizationContactComponent o = (OrganizationContactComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (purpose == null || purpose.isEmpty()) && (name == null || name.isEmpty()) && (telecom == null || telecom.isEmpty()) && (address == null || address.isEmpty());
    }

    public String fhirType() {
        return "Organization.contact";
    }
}
