package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.AdministrativeGender;
import org.hl7.fhir.android.generated.dstu2.Enumerations.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.PersonEnum.IdentityAssuranceLevel;
import org.hl7.fhir.android.generated.dstu2.PersonEnum.IdentityAssuranceLevelEnumFactory;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
/**
 * Demographics and administrative information about a person independent of a specific health-related context.
 */
public class Person extends DomainResource {

    /**
     * Identifier for a person within a particular scope.
     */
    protected List<Identifier> identifier;

    /**
     * A name associated with the person.
     */
    protected List<HumanName> name;

    /**
     * A contact detail for the person, e.g. a telephone number or an email address.
     */
    protected List<ContactPoint> telecom;

    /**
     * Administrative Gender.
     */
    protected Enumeration<AdministrativeGender> gender;

    /**
     * The birth date for the person.
     */
    protected DateType birthDate;

    /**
     * One or more addresses for the person.
     */
    protected List<Address> address;

    /**
     * An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.
     */
    protected Attachment photo;

    /**
     * The organization that is the custodian of the person record.
     */
    protected Reference managingOrganization;

    /**
     * The actual object that is the target of the reference (The organization that is the custodian of the person record.)
     */
    protected Organization managingOrganizationTarget;

    /**
     * Whether this person's record is in active use.
     */
    protected BooleanType active;

    /**
     * Link to a resource that concerns the same actual person.
     */
    protected List<PersonLinkComponent> link;

    private static final long serialVersionUID = -117464654L;

    /*
   * Constructor
   */
    public Person() {
        super();
    }

    /**
     * @return {@link #identifier} (Identifier for a person within a particular scope.)
     */
    public List<Identifier> getIdentifier() {
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        if (this.identifier == null)
            return false;
        for (Identifier item : this.identifier) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #identifier} (Identifier for a person within a particular scope.)
     */
    // syntactic sugar
    public Identifier addIdentifier() {
        // 3
        Identifier t = new Identifier();
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return t;
    }

    // syntactic sugar
    public Person addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #name} (A name associated with the person.)
     */
    public List<HumanName> getName() {
        if (this.name == null)
            this.name = new ArrayList<HumanName>();
        return this.name;
    }

    public boolean hasName() {
        if (this.name == null)
            return false;
        for (HumanName item : this.name) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #name} (A name associated with the person.)
     */
    // syntactic sugar
    public HumanName addName() {
        // 3
        HumanName t = new HumanName();
        if (this.name == null)
            this.name = new ArrayList<HumanName>();
        this.name.add(t);
        return t;
    }

    // syntactic sugar
    public Person addName(HumanName t) {
        // 3
        if (t == null)
            return this;
        if (this.name == null)
            this.name = new ArrayList<HumanName>();
        this.name.add(t);
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

    /**
     * @return {@link #telecom} (A contact detail for the person, e.g. a telephone number or an email address.)
     */
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
    public Person addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    /**
     * @return {@link #gender} (Administrative Gender.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Enumeration<AdministrativeGender> getGenderElement() {
        if (this.gender == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Person.gender");
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
     * @param value {@link #gender} (Administrative Gender.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Person setGenderElement(Enumeration<AdministrativeGender> value) {
        this.gender = value;
        return this;
    }

    /**
     * @return Administrative Gender.
     */
    public AdministrativeGender getGender() {
        return this.gender == null ? null : this.gender.getValue();
    }

    /**
     * @param value Administrative Gender.
     */
    public Person setGender(AdministrativeGender value) {
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
     * @return {@link #birthDate} (The birth date for the person.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public DateType getBirthDateElement() {
        if (this.birthDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Person.birthDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.birthDate = new DateType();
        return this.birthDate;
    }

    public boolean hasBirthDateElement() {
        return this.birthDate != null && !this.birthDate.isEmpty();
    }

    public boolean hasBirthDate() {
        return this.birthDate != null && !this.birthDate.isEmpty();
    }

    /**
     * @param value {@link #birthDate} (The birth date for the person.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public Person setBirthDateElement(DateType value) {
        this.birthDate = value;
        return this;
    }

    /**
     * @return The birth date for the person.
     */
    public Date getBirthDate() {
        return this.birthDate == null ? null : this.birthDate.getValue();
    }

    /**
     * @param value The birth date for the person.
     */
    public Person setBirthDate(Date value) {
        if (value == null)
            this.birthDate = null;
        else {
            if (this.birthDate == null)
                this.birthDate = new DateType();
            this.birthDate.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #address} (One or more addresses for the person.)
     */
    public List<Address> getAddress() {
        if (this.address == null)
            this.address = new ArrayList<Address>();
        return this.address;
    }

    public boolean hasAddress() {
        if (this.address == null)
            return false;
        for (Address item : this.address) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #address} (One or more addresses for the person.)
     */
    // syntactic sugar
    public Address addAddress() {
        // 3
        Address t = new Address();
        if (this.address == null)
            this.address = new ArrayList<Address>();
        this.address.add(t);
        return t;
    }

    // syntactic sugar
    public Person addAddress(Address t) {
        // 3
        if (t == null)
            return this;
        if (this.address == null)
            this.address = new ArrayList<Address>();
        this.address.add(t);
        return this;
    }

    /**
     * @return {@link #photo} (An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.)
     */
    public Attachment getPhoto() {
        if (this.photo == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Person.photo");
            else if (Configuration.doAutoCreate())
                // cc
                this.photo = new Attachment();
        return this.photo;
    }

    public boolean hasPhoto() {
        return this.photo != null && !this.photo.isEmpty();
    }

    /**
     * @param value {@link #photo} (An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.)
     */
    public Person setPhoto(Attachment value) {
        this.photo = value;
        return this;
    }

    /**
     * @return {@link #managingOrganization} (The organization that is the custodian of the person record.)
     */
    public Reference getManagingOrganization() {
        if (this.managingOrganization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Person.managingOrganization");
            else if (Configuration.doAutoCreate())
                // cc
                this.managingOrganization = new Reference();
        return this.managingOrganization;
    }

    public boolean hasManagingOrganization() {
        return this.managingOrganization != null && !this.managingOrganization.isEmpty();
    }

    /**
     * @param value {@link #managingOrganization} (The organization that is the custodian of the person record.)
     */
    public Person setManagingOrganization(Reference value) {
        this.managingOrganization = value;
        return this;
    }

    /**
     * @return {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization that is the custodian of the person record.)
     */
    public Organization getManagingOrganizationTarget() {
        if (this.managingOrganizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Person.managingOrganization");
            else if (Configuration.doAutoCreate())
                // aa
                this.managingOrganizationTarget = new Organization();
        return this.managingOrganizationTarget;
    }

    /**
     * @param value {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization that is the custodian of the person record.)
     */
    public Person setManagingOrganizationTarget(Organization value) {
        this.managingOrganizationTarget = value;
        return this;
    }

    /**
     * @return {@link #active} (Whether this person's record is in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public BooleanType getActiveElement() {
        if (this.active == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Person.active");
            else if (Configuration.doAutoCreate())
                // bb
                this.active = new BooleanType();
        return this.active;
    }

    public boolean hasActiveElement() {
        return this.active != null && !this.active.isEmpty();
    }

    public boolean hasActive() {
        return this.active != null && !this.active.isEmpty();
    }

    /**
     * @param value {@link #active} (Whether this person's record is in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public Person setActiveElement(BooleanType value) {
        this.active = value;
        return this;
    }

    /**
     * @return Whether this person's record is in active use.
     */
    public boolean getActive() {
        return this.active == null || this.active.isEmpty() ? false : this.active.getValue();
    }

    /**
     * @param value Whether this person's record is in active use.
     */
    public Person setActive(boolean value) {
        if (this.active == null)
            this.active = new BooleanType();
        this.active.setValue(value);
        return this;
    }

    /**
     * @return {@link #link} (Link to a resource that concerns the same actual person.)
     */
    public List<PersonLinkComponent> getLink() {
        if (this.link == null)
            this.link = new ArrayList<PersonLinkComponent>();
        return this.link;
    }

    public boolean hasLink() {
        if (this.link == null)
            return false;
        for (PersonLinkComponent item : this.link) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #link} (Link to a resource that concerns the same actual person.)
     */
    // syntactic sugar
    public PersonLinkComponent addLink() {
        // 3
        PersonLinkComponent t = new PersonLinkComponent();
        if (this.link == null)
            this.link = new ArrayList<PersonLinkComponent>();
        this.link.add(t);
        return t;
    }

    // syntactic sugar
    public Person addLink(PersonLinkComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.link == null)
            this.link = new ArrayList<PersonLinkComponent>();
        this.link.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifier for a person within a particular scope.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("name", "HumanName", "A name associated with the person.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("telecom", "ContactPoint", "A contact detail for the person, e.g. a telephone number or an email address.", 0, java.lang.Integer.MAX_VALUE, telecom));
        childrenList.add(new Property("gender", "code", "Administrative Gender.", 0, java.lang.Integer.MAX_VALUE, gender));
        childrenList.add(new Property("birthDate", "date", "The birth date for the person.", 0, java.lang.Integer.MAX_VALUE, birthDate));
        childrenList.add(new Property("address", "Address", "One or more addresses for the person.", 0, java.lang.Integer.MAX_VALUE, address));
        childrenList.add(new Property("photo", "Attachment", "An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.", 0, java.lang.Integer.MAX_VALUE, photo));
        childrenList.add(new Property("managingOrganization", "Reference(Organization)", "The organization that is the custodian of the person record.", 0, java.lang.Integer.MAX_VALUE, managingOrganization));
        childrenList.add(new Property("active", "boolean", "Whether this person's record is in active use.", 0, java.lang.Integer.MAX_VALUE, active));
        childrenList.add(new Property("link", "", "Link to a resource that concerns the same actual person.", 0, java.lang.Integer.MAX_VALUE, link));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("name"))
            this.getName().add(castToHumanName(value));
        else if (name.equals("telecom"))
            this.getTelecom().add(castToContactPoint(value));
        else if (name.equals("gender"))
            // Enumeration<AdministrativeGender>
            this.gender = new AdministrativeGenderEnumFactory().fromType(value);
        else if (name.equals("birthDate"))
            // DateType
            this.birthDate = castToDate(value);
        else if (name.equals("address"))
            this.getAddress().add(castToAddress(value));
        else if (name.equals("photo"))
            // Attachment
            this.photo = castToAttachment(value);
        else if (name.equals("managingOrganization"))
            // Reference
            this.managingOrganization = castToReference(value);
        else if (name.equals("active"))
            // BooleanType
            this.active = castToBoolean(value);
        else if (name.equals("link"))
            this.getLink().add((PersonLinkComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("name")) {
            return addName();
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else if (name.equals("gender")) {
            throw new FHIRException("Cannot call addChild on a primitive type Person.gender");
        } else if (name.equals("birthDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Person.birthDate");
        } else if (name.equals("address")) {
            return addAddress();
        } else if (name.equals("photo")) {
            this.photo = new Attachment();
            return this.photo;
        } else if (name.equals("managingOrganization")) {
            this.managingOrganization = new Reference();
            return this.managingOrganization;
        } else if (name.equals("active")) {
            throw new FHIRException("Cannot call addChild on a primitive type Person.active");
        } else if (name.equals("link")) {
            return addLink();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Person";
    }

    public Person copy() {
        Person dst = new Person();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        if (name != null) {
            dst.name = new ArrayList<HumanName>();
            for (HumanName i : name) dst.name.add(i.copy());
        }
        ;
        if (telecom != null) {
            dst.telecom = new ArrayList<ContactPoint>();
            for (ContactPoint i : telecom) dst.telecom.add(i.copy());
        }
        ;
        dst.gender = gender == null ? null : gender.copy();
        dst.birthDate = birthDate == null ? null : birthDate.copy();
        if (address != null) {
            dst.address = new ArrayList<Address>();
            for (Address i : address) dst.address.add(i.copy());
        }
        ;
        dst.photo = photo == null ? null : photo.copy();
        dst.managingOrganization = managingOrganization == null ? null : managingOrganization.copy();
        dst.active = active == null ? null : active.copy();
        if (link != null) {
            dst.link = new ArrayList<PersonLinkComponent>();
            for (PersonLinkComponent i : link) dst.link.add(i.copy());
        }
        ;
        return dst;
    }

    protected Person typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Person))
            return false;
        Person o = (Person) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(name, o.name, true) && compareDeep(telecom, o.telecom, true) && compareDeep(gender, o.gender, true) && compareDeep(birthDate, o.birthDate, true) && compareDeep(address, o.address, true) && compareDeep(photo, o.photo, true) && compareDeep(managingOrganization, o.managingOrganization, true) && compareDeep(active, o.active, true) && compareDeep(link, o.link, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Person))
            return false;
        Person o = (Person) other;
        return compareValues(gender, o.gender, true) && compareValues(birthDate, o.birthDate, true) && compareValues(active, o.active, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (name == null || name.isEmpty()) && (telecom == null || telecom.isEmpty()) && (gender == null || gender.isEmpty()) && (birthDate == null || birthDate.isEmpty()) && (address == null || address.isEmpty()) && (photo == null || photo.isEmpty()) && (managingOrganization == null || managingOrganization.isEmpty()) && (active == null || active.isEmpty()) && (link == null || link.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Person;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_ADDRESS = "address";

    public static final String SP_BIRTHDATE = "birthdate";

    public static final String SP_ADDRESSSTATE = "address-state";

    public static final String SP_GENDER = "gender";

    public static final String SP_PRACTITIONER = "practitioner";

    public static final String SP_LINK = "link";

    public static final String SP_RELATEDPERSON = "relatedperson";

    public static final String SP_ADDRESSPOSTALCODE = "address-postalcode";

    public static final String SP_ADDRESSCOUNTRY = "address-country";

    public static final String SP_PHONETIC = "phonetic";

    public static final String SP_PHONE = "phone";

    public static final String SP_PATIENT = "patient";

    public static final String SP_ORGANIZATION = "organization";

    public static final String SP_NAME = "name";

    public static final String SP_ADDRESSUSE = "address-use";

    public static final String SP_TELECOM = "telecom";

    public static final String SP_ADDRESSCITY = "address-city";

    public static final String SP_EMAIL = "email";
}
