package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AdministrativeGender;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;

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
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 */
public class Practitioner extends DomainResource {

    /**
     * An identifier that applies to this person in this role.
     */
    protected List<Identifier> identifier;

    /**
     * Whether this practitioner's record is in active use.
     */
    protected BooleanType active;

    /**
     * A name associated with the person.
     */
    protected HumanName name;

    /**
     * A contact detail for the practitioner, e.g. a telephone number or an email address.
     */
    protected List<ContactPoint> telecom;

    /**
     * The postal address where the practitioner can be found or visited or to which mail can be delivered.
     */
    protected List<Address> address;

    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     */
    protected Enumeration<AdministrativeGender> gender;

    /**
     * The date of birth for the practitioner.
     */
    protected DateType birthDate;

    /**
     * Image of the person.
     */
    protected List<Attachment> photo;

    /**
     * The list of roles/organizations that the practitioner is associated with.
     */
    protected List<PractitionerPractitionerRoleComponent> practitionerRole;

    /**
     * Qualifications obtained by training and certification.
     */
    protected List<PractitionerQualificationComponent> qualification;

    /**
     * A language the practitioner is able to use in patient communication.
     */
    protected List<CodeableConcept> communication;

    private static final long serialVersionUID = 1066276346L;

    /*
   * Constructor
   */
    public Practitioner() {
        super();
    }

    /**
     * @return {@link #identifier} (An identifier that applies to this person in this role.)
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
     * @return {@link #identifier} (An identifier that applies to this person in this role.)
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
    public Practitioner addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #active} (Whether this practitioner's record is in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public BooleanType getActiveElement() {
        if (this.active == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Practitioner.active");
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
     * @param value {@link #active} (Whether this practitioner's record is in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public Practitioner setActiveElement(BooleanType value) {
        this.active = value;
        return this;
    }

    /**
     * @return Whether this practitioner's record is in active use.
     */
    public boolean getActive() {
        return this.active == null || this.active.isEmpty() ? false : this.active.getValue();
    }

    /**
     * @param value Whether this practitioner's record is in active use.
     */
    public Practitioner setActive(boolean value) {
        if (this.active == null)
            this.active = new BooleanType();
        this.active.setValue(value);
        return this;
    }

    /**
     * @return {@link #name} (A name associated with the person.)
     */
    public HumanName getName() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Practitioner.name");
            else if (Configuration.doAutoCreate())
                // cc
                this.name = new HumanName();
        return this.name;
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A name associated with the person.)
     */
    public Practitioner setName(HumanName value) {
        this.name = value;
        return this;
    }

    /**
     * @return {@link #telecom} (A contact detail for the practitioner, e.g. a telephone number or an email address.)
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
     * @return {@link #telecom} (A contact detail for the practitioner, e.g. a telephone number or an email address.)
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
    public Practitioner addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    /**
     * @return {@link #address} (The postal address where the practitioner can be found or visited or to which mail can be delivered.)
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
     * @return {@link #address} (The postal address where the practitioner can be found or visited or to which mail can be delivered.)
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
    public Practitioner addAddress(Address t) {
        // 3
        if (t == null)
            return this;
        if (this.address == null)
            this.address = new ArrayList<Address>();
        this.address.add(t);
        return this;
    }

    /**
     * @return {@link #gender} (Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Enumeration<AdministrativeGender> getGenderElement() {
        if (this.gender == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Practitioner.gender");
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
     * @param value {@link #gender} (Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Practitioner setGenderElement(Enumeration<AdministrativeGender> value) {
        this.gender = value;
        return this;
    }

    /**
     * @return Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     */
    public AdministrativeGender getGender() {
        return this.gender == null ? null : this.gender.getValue();
    }

    /**
     * @param value Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     */
    public Practitioner setGender(AdministrativeGender value) {
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
     * @return {@link #birthDate} (The date of birth for the practitioner.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public DateType getBirthDateElement() {
        if (this.birthDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Practitioner.birthDate");
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
     * @param value {@link #birthDate} (The date of birth for the practitioner.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public Practitioner setBirthDateElement(DateType value) {
        this.birthDate = value;
        return this;
    }

    /**
     * @return The date of birth for the practitioner.
     */
    public Date getBirthDate() {
        return this.birthDate == null ? null : this.birthDate.getValue();
    }

    /**
     * @param value The date of birth for the practitioner.
     */
    public Practitioner setBirthDate(Date value) {
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
     * @return {@link #photo} (Image of the person.)
     */
    public List<Attachment> getPhoto() {
        if (this.photo == null)
            this.photo = new ArrayList<Attachment>();
        return this.photo;
    }

    public boolean hasPhoto() {
        if (this.photo == null)
            return false;
        for (Attachment item : this.photo) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #photo} (Image of the person.)
     */
    // syntactic sugar
    public Attachment addPhoto() {
        // 3
        Attachment t = new Attachment();
        if (this.photo == null)
            this.photo = new ArrayList<Attachment>();
        this.photo.add(t);
        return t;
    }

    // syntactic sugar
    public Practitioner addPhoto(Attachment t) {
        // 3
        if (t == null)
            return this;
        if (this.photo == null)
            this.photo = new ArrayList<Attachment>();
        this.photo.add(t);
        return this;
    }

    /**
     * @return {@link #practitionerRole} (The list of roles/organizations that the practitioner is associated with.)
     */
    public List<PractitionerPractitionerRoleComponent> getPractitionerRole() {
        if (this.practitionerRole == null)
            this.practitionerRole = new ArrayList<PractitionerPractitionerRoleComponent>();
        return this.practitionerRole;
    }

    public boolean hasPractitionerRole() {
        if (this.practitionerRole == null)
            return false;
        for (PractitionerPractitionerRoleComponent item : this.practitionerRole) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #practitionerRole} (The list of roles/organizations that the practitioner is associated with.)
     */
    // syntactic sugar
    public PractitionerPractitionerRoleComponent addPractitionerRole() {
        // 3
        PractitionerPractitionerRoleComponent t = new PractitionerPractitionerRoleComponent();
        if (this.practitionerRole == null)
            this.practitionerRole = new ArrayList<PractitionerPractitionerRoleComponent>();
        this.practitionerRole.add(t);
        return t;
    }

    // syntactic sugar
    public Practitioner addPractitionerRole(PractitionerPractitionerRoleComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.practitionerRole == null)
            this.practitionerRole = new ArrayList<PractitionerPractitionerRoleComponent>();
        this.practitionerRole.add(t);
        return this;
    }

    /**
     * @return {@link #qualification} (Qualifications obtained by training and certification.)
     */
    public List<PractitionerQualificationComponent> getQualification() {
        if (this.qualification == null)
            this.qualification = new ArrayList<PractitionerQualificationComponent>();
        return this.qualification;
    }

    public boolean hasQualification() {
        if (this.qualification == null)
            return false;
        for (PractitionerQualificationComponent item : this.qualification) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #qualification} (Qualifications obtained by training and certification.)
     */
    // syntactic sugar
    public PractitionerQualificationComponent addQualification() {
        // 3
        PractitionerQualificationComponent t = new PractitionerQualificationComponent();
        if (this.qualification == null)
            this.qualification = new ArrayList<PractitionerQualificationComponent>();
        this.qualification.add(t);
        return t;
    }

    // syntactic sugar
    public Practitioner addQualification(PractitionerQualificationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.qualification == null)
            this.qualification = new ArrayList<PractitionerQualificationComponent>();
        this.qualification.add(t);
        return this;
    }

    /**
     * @return {@link #communication} (A language the practitioner is able to use in patient communication.)
     */
    public List<CodeableConcept> getCommunication() {
        if (this.communication == null)
            this.communication = new ArrayList<CodeableConcept>();
        return this.communication;
    }

    public boolean hasCommunication() {
        if (this.communication == null)
            return false;
        for (CodeableConcept item : this.communication) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #communication} (A language the practitioner is able to use in patient communication.)
     */
    // syntactic sugar
    public CodeableConcept addCommunication() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.communication == null)
            this.communication = new ArrayList<CodeableConcept>();
        this.communication.add(t);
        return t;
    }

    // syntactic sugar
    public Practitioner addCommunication(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.communication == null)
            this.communication = new ArrayList<CodeableConcept>();
        this.communication.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "An identifier that applies to this person in this role.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("active", "boolean", "Whether this practitioner's record is in active use.", 0, java.lang.Integer.MAX_VALUE, active));
        childrenList.add(new Property("name", "HumanName", "A name associated with the person.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("telecom", "ContactPoint", "A contact detail for the practitioner, e.g. a telephone number or an email address.", 0, java.lang.Integer.MAX_VALUE, telecom));
        childrenList.add(new Property("address", "Address", "The postal address where the practitioner can be found or visited or to which mail can be delivered.", 0, java.lang.Integer.MAX_VALUE, address));
        childrenList.add(new Property("gender", "code", "Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.", 0, java.lang.Integer.MAX_VALUE, gender));
        childrenList.add(new Property("birthDate", "date", "The date of birth for the practitioner.", 0, java.lang.Integer.MAX_VALUE, birthDate));
        childrenList.add(new Property("photo", "Attachment", "Image of the person.", 0, java.lang.Integer.MAX_VALUE, photo));
        childrenList.add(new Property("practitionerRole", "", "The list of roles/organizations that the practitioner is associated with.", 0, java.lang.Integer.MAX_VALUE, practitionerRole));
        childrenList.add(new Property("qualification", "", "Qualifications obtained by training and certification.", 0, java.lang.Integer.MAX_VALUE, qualification));
        childrenList.add(new Property("communication", "CodeableConcept", "A language the practitioner is able to use in patient communication.", 0, java.lang.Integer.MAX_VALUE, communication));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("active"))
            // BooleanType
            this.active = castToBoolean(value);
        else if (name.equals("name"))
            // HumanName
            this.name = castToHumanName(value);
        else if (name.equals("telecom"))
            this.getTelecom().add(castToContactPoint(value));
        else if (name.equals("address"))
            this.getAddress().add(castToAddress(value));
        else if (name.equals("gender"))
            // Enumeration<AdministrativeGender>
            this.gender = new AdministrativeGenderEnumFactory().fromType(value);
        else if (name.equals("birthDate"))
            // DateType
            this.birthDate = castToDate(value);
        else if (name.equals("photo"))
            this.getPhoto().add(castToAttachment(value));
        else if (name.equals("practitionerRole"))
            this.getPractitionerRole().add((PractitionerPractitionerRoleComponent) value);
        else if (name.equals("qualification"))
            this.getQualification().add((PractitionerQualificationComponent) value);
        else if (name.equals("communication"))
            this.getCommunication().add(castToCodeableConcept(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("active")) {
            throw new FHIRException("Cannot call addChild on a primitive type Practitioner.active");
        } else if (name.equals("name")) {
            this.name = new HumanName();
            return this.name;
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else if (name.equals("address")) {
            return addAddress();
        } else if (name.equals("gender")) {
            throw new FHIRException("Cannot call addChild on a primitive type Practitioner.gender");
        } else if (name.equals("birthDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Practitioner.birthDate");
        } else if (name.equals("photo")) {
            return addPhoto();
        } else if (name.equals("practitionerRole")) {
            return addPractitionerRole();
        } else if (name.equals("qualification")) {
            return addQualification();
        } else if (name.equals("communication")) {
            return addCommunication();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Practitioner";
    }

    public Practitioner copy() {
        Practitioner dst = new Practitioner();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.active = active == null ? null : active.copy();
        dst.name = name == null ? null : name.copy();
        if (telecom != null) {
            dst.telecom = new ArrayList<ContactPoint>();
            for (ContactPoint i : telecom) dst.telecom.add(i.copy());
        }
        ;
        if (address != null) {
            dst.address = new ArrayList<Address>();
            for (Address i : address) dst.address.add(i.copy());
        }
        ;
        dst.gender = gender == null ? null : gender.copy();
        dst.birthDate = birthDate == null ? null : birthDate.copy();
        if (photo != null) {
            dst.photo = new ArrayList<Attachment>();
            for (Attachment i : photo) dst.photo.add(i.copy());
        }
        ;
        if (practitionerRole != null) {
            dst.practitionerRole = new ArrayList<PractitionerPractitionerRoleComponent>();
            for (PractitionerPractitionerRoleComponent i : practitionerRole) dst.practitionerRole.add(i.copy());
        }
        ;
        if (qualification != null) {
            dst.qualification = new ArrayList<PractitionerQualificationComponent>();
            for (PractitionerQualificationComponent i : qualification) dst.qualification.add(i.copy());
        }
        ;
        if (communication != null) {
            dst.communication = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : communication) dst.communication.add(i.copy());
        }
        ;
        return dst;
    }

    protected Practitioner typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Practitioner))
            return false;
        Practitioner o = (Practitioner) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(active, o.active, true) && compareDeep(name, o.name, true) && compareDeep(telecom, o.telecom, true) && compareDeep(address, o.address, true) && compareDeep(gender, o.gender, true) && compareDeep(birthDate, o.birthDate, true) && compareDeep(photo, o.photo, true) && compareDeep(practitionerRole, o.practitionerRole, true) && compareDeep(qualification, o.qualification, true) && compareDeep(communication, o.communication, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Practitioner))
            return false;
        Practitioner o = (Practitioner) other;
        return compareValues(active, o.active, true) && compareValues(gender, o.gender, true) && compareValues(birthDate, o.birthDate, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (active == null || active.isEmpty()) && (name == null || name.isEmpty()) && (telecom == null || telecom.isEmpty()) && (address == null || address.isEmpty()) && (gender == null || gender.isEmpty()) && (birthDate == null || birthDate.isEmpty()) && (photo == null || photo.isEmpty()) && (practitionerRole == null || practitionerRole.isEmpty()) && (qualification == null || qualification.isEmpty()) && (communication == null || communication.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Practitioner;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_GIVEN = "given";

    public static final String SP_SPECIALTY = "specialty";

    public static final String SP_ADDRESS = "address";

    public static final String SP_ROLE = "role";

    public static final String SP_ADDRESSSTATE = "address-state";

    public static final String SP_GENDER = "gender";

    public static final String SP_ADDRESSPOSTALCODE = "address-postalcode";

    public static final String SP_ADDRESSCOUNTRY = "address-country";

    public static final String SP_PHONETIC = "phonetic";

    public static final String SP_PHONE = "phone";

    public static final String SP_ORGANIZATION = "organization";

    public static final String SP_NAME = "name";

    public static final String SP_ADDRESSUSE = "address-use";

    public static final String SP_TELECOM = "telecom";

    public static final String SP_LOCATION = "location";

    public static final String SP_FAMILY = "family";

    public static final String SP_ADDRESSCITY = "address-city";

    public static final String SP_COMMUNICATION = "communication";

    public static final String SP_EMAIL = "email";
}
