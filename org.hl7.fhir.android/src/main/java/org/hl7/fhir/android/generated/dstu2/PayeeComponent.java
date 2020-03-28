package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.Use;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.UseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimType;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimTypeEnumFactory;

public class PayeeComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Party to be reimbursed: Subscriber, provider, other.
     */
    protected Coding type;

    /**
     * The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned).
     */
    protected Reference provider;

    /**
     * The actual object that is the target of the reference (The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    protected Practitioner providerTarget;

    /**
     * The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned).
     */
    protected Reference organization;

    /**
     * The actual object that is the target of the reference (The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    protected Organization organizationTarget;

    /**
     * The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned).
     */
    protected Reference person;

    /**
     * The actual object that is the target of the reference (The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    protected Patient personTarget;

    private static final long serialVersionUID = -503108488L;

    /*
     * Constructor
     */
    public PayeeComponent() {
        super();
    }

    /**
     * @return {@link #type} (Party to be reimbursed: Subscriber, provider, other.)
     */
    public Coding getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PayeeComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new Coding();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Party to be reimbursed: Subscriber, provider, other.)
     */
    public PayeeComponent setType(Coding value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #provider} (The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public Reference getProvider() {
        if (this.provider == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PayeeComponent.provider");
            else if (Configuration.doAutoCreate())
                // cc
                this.provider = new Reference();
        return this.provider;
    }

    public boolean hasProvider() {
        return this.provider != null && !this.provider.isEmpty();
    }

    /**
     * @param value {@link #provider} (The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public PayeeComponent setProvider(Reference value) {
        this.provider = value;
        return this;
    }

    /**
     * @return {@link #provider} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public Practitioner getProviderTarget() {
        if (this.providerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PayeeComponent.provider");
            else if (Configuration.doAutoCreate())
                // aa
                this.providerTarget = new Practitioner();
        return this.providerTarget;
    }

    /**
     * @param value {@link #provider} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public PayeeComponent setProviderTarget(Practitioner value) {
        this.providerTarget = value;
        return this;
    }

    /**
     * @return {@link #organization} (The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public Reference getOrganization() {
        if (this.organization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PayeeComponent.organization");
            else if (Configuration.doAutoCreate())
                // cc
                this.organization = new Reference();
        return this.organization;
    }

    public boolean hasOrganization() {
        return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public PayeeComponent setOrganization(Reference value) {
        this.organization = value;
        return this;
    }

    /**
     * @return {@link #organization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public Organization getOrganizationTarget() {
        if (this.organizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PayeeComponent.organization");
            else if (Configuration.doAutoCreate())
                // aa
                this.organizationTarget = new Organization();
        return this.organizationTarget;
    }

    /**
     * @param value {@link #organization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public PayeeComponent setOrganizationTarget(Organization value) {
        this.organizationTarget = value;
        return this;
    }

    /**
     * @return {@link #person} (The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public Reference getPerson() {
        if (this.person == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PayeeComponent.person");
            else if (Configuration.doAutoCreate())
                // cc
                this.person = new Reference();
        return this.person;
    }

    public boolean hasPerson() {
        return this.person != null && !this.person.isEmpty();
    }

    /**
     * @param value {@link #person} (The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public PayeeComponent setPerson(Reference value) {
        this.person = value;
        return this;
    }

    /**
     * @return {@link #person} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public Patient getPersonTarget() {
        if (this.personTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create PayeeComponent.person");
            else if (Configuration.doAutoCreate())
                // aa
                this.personTarget = new Patient();
        return this.personTarget;
    }

    /**
     * @param value {@link #person} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned).)
     */
    public PayeeComponent setPersonTarget(Patient value) {
        this.personTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "Coding", "Party to be reimbursed: Subscriber, provider, other.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("provider", "Reference(Practitioner)", "The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned).", 0, java.lang.Integer.MAX_VALUE, provider));
        childrenList.add(new Property("organization", "Reference(Organization)", "The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned).", 0, java.lang.Integer.MAX_VALUE, organization));
        childrenList.add(new Property("person", "Reference(Patient)", "The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned).", 0, java.lang.Integer.MAX_VALUE, person));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Coding
            this.type = castToCoding(value);
        else if (name.equals("provider"))
            // Reference
            this.provider = castToReference(value);
        else if (name.equals("organization"))
            // Reference
            this.organization = castToReference(value);
        else if (name.equals("person"))
            // Reference
            this.person = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new Coding();
            return this.type;
        } else if (name.equals("provider")) {
            this.provider = new Reference();
            return this.provider;
        } else if (name.equals("organization")) {
            this.organization = new Reference();
            return this.organization;
        } else if (name.equals("person")) {
            this.person = new Reference();
            return this.person;
        } else
            return super.addChild(name);
    }

    public PayeeComponent copy() {
        PayeeComponent dst = new PayeeComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.provider = provider == null ? null : provider.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.person = person == null ? null : person.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof PayeeComponent))
            return false;
        PayeeComponent o = (PayeeComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(provider, o.provider, true) && compareDeep(organization, o.organization, true) && compareDeep(person, o.person, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof PayeeComponent))
            return false;
        PayeeComponent o = (PayeeComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (provider == null || provider.isEmpty()) && (organization == null || organization.isEmpty()) && (person == null || person.isEmpty());
    }

    public String fhirType() {
        return "Claim.payee";
    }
}
