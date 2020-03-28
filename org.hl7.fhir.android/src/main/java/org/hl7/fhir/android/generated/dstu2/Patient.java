package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AdministrativeGender;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.PatientEnum.LinkTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.PatientEnum.LinkType;

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
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 */
public class Patient extends DomainResource {

    /**
     * An identifier for this patient.
     */
    protected List<Identifier> identifier;

    /**
     * Whether this patient record is in active use.
     */
    protected BooleanType active;

    /**
     * A name associated with the individual.
     */
    protected List<HumanName> name;

    /**
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
     */
    protected List<ContactPoint> telecom;

    /**
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
     */
    protected Enumeration<AdministrativeGender> gender;

    /**
     * The date of birth for the individual.
     */
    protected DateType birthDate;

    /**
     * Indicates if the individual is deceased or not.
     */
    protected Type deceased;

    /**
     * Addresses for the individual.
     */
    protected List<Address> address;

    /**
     * This field contains a patient's most recent marital (civil) status.
     */
    protected CodeableConcept maritalStatus;

    /**
     * Indicates whether the patient is part of a multiple or indicates the actual birth order.
     */
    protected Type multipleBirth;

    /**
     * Image of the patient.
     */
    protected List<Attachment> photo;

    /**
     * A contact party (e.g. guardian, partner, friend) for the patient.
     */
    protected List<ContactComponent> contact;

    /**
     * This patient is known to be an animal.
     */
    protected AnimalComponent animal;

    /**
     * Languages which may be used to communicate with the patient about his or her health.
     */
    protected List<PatientCommunicationComponent> communication;

    /**
     * Patient's nominated care provider.
     */
    protected List<Reference> careProvider;

    /**
     * The actual objects that are the target of the reference (Patient's nominated care provider.)
     */
    protected List<Resource> careProviderTarget;

    /**
     * Organization that is the custodian of the patient record.
     */
    protected Reference managingOrganization;

    /**
     * The actual object that is the target of the reference (Organization that is the custodian of the patient record.)
     */
    protected Organization managingOrganizationTarget;

    /**
     * Link to another patient resource that concerns the same actual patient.
     */
    protected List<PatientLinkComponent> link;

    private static final long serialVersionUID = 2019992554L;

    /*
   * Constructor
   */
    public Patient() {
        super();
    }

    /**
     * @return {@link #identifier} (An identifier for this patient.)
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
     * @return {@link #identifier} (An identifier for this patient.)
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
    public Patient addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #active} (Whether this patient record is in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public BooleanType getActiveElement() {
        if (this.active == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Patient.active");
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
     * @param value {@link #active} (Whether this patient record is in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public Patient setActiveElement(BooleanType value) {
        this.active = value;
        return this;
    }

    /**
     * @return Whether this patient record is in active use.
     */
    public boolean getActive() {
        return this.active == null || this.active.isEmpty() ? false : this.active.getValue();
    }

    /**
     * @param value Whether this patient record is in active use.
     */
    public Patient setActive(boolean value) {
        if (this.active == null)
            this.active = new BooleanType();
        this.active.setValue(value);
        return this;
    }

    /**
     * @return {@link #name} (A name associated with the individual.)
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
     * @return {@link #name} (A name associated with the individual.)
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
    public Patient addName(HumanName t) {
        // 3
        if (t == null)
            return this;
        if (this.name == null)
            this.name = new ArrayList<HumanName>();
        this.name.add(t);
        return this;
    }

    /**
     * @return {@link #telecom} (A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.)
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
     * @return {@link #telecom} (A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.)
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
    public Patient addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    /**
     * @return {@link #gender} (Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Enumeration<AdministrativeGender> getGenderElement() {
        if (this.gender == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Patient.gender");
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
     * @param value {@link #gender} (Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Patient setGenderElement(Enumeration<AdministrativeGender> value) {
        this.gender = value;
        return this;
    }

    /**
     * @return Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
     */
    public AdministrativeGender getGender() {
        return this.gender == null ? null : this.gender.getValue();
    }

    /**
     * @param value Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
     */
    public Patient setGender(AdministrativeGender value) {
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
     * @return {@link #birthDate} (The date of birth for the individual.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public DateType getBirthDateElement() {
        if (this.birthDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Patient.birthDate");
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
     * @param value {@link #birthDate} (The date of birth for the individual.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public Patient setBirthDateElement(DateType value) {
        this.birthDate = value;
        return this;
    }

    /**
     * @return The date of birth for the individual.
     */
    public Date getBirthDate() {
        return this.birthDate == null ? null : this.birthDate.getValue();
    }

    /**
     * @param value The date of birth for the individual.
     */
    public Patient setBirthDate(Date value) {
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
     * @return {@link #deceased} (Indicates if the individual is deceased or not.)
     */
    public Type getDeceased() {
        return this.deceased;
    }

    /**
     * @return {@link #deceased} (Indicates if the individual is deceased or not.)
     */
    public BooleanType getDeceasedBooleanType() throws FHIRException {
        if (!(this.deceased instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but " + this.deceased.getClass().getName() + " was encountered");
        return (BooleanType) this.deceased;
    }

    public boolean hasDeceasedBooleanType() {
        return this.deceased instanceof BooleanType;
    }

    /**
     * @return {@link #deceased} (Indicates if the individual is deceased or not.)
     */
    public DateTimeType getDeceasedDateTimeType() throws FHIRException {
        if (!(this.deceased instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.deceased.getClass().getName() + " was encountered");
        return (DateTimeType) this.deceased;
    }

    public boolean hasDeceasedDateTimeType() {
        return this.deceased instanceof DateTimeType;
    }

    public boolean hasDeceased() {
        return this.deceased != null && !this.deceased.isEmpty();
    }

    /**
     * @param value {@link #deceased} (Indicates if the individual is deceased or not.)
     */
    public Patient setDeceased(Type value) {
        this.deceased = value;
        return this;
    }

    /**
     * @return {@link #address} (Addresses for the individual.)
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
     * @return {@link #address} (Addresses for the individual.)
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
    public Patient addAddress(Address t) {
        // 3
        if (t == null)
            return this;
        if (this.address == null)
            this.address = new ArrayList<Address>();
        this.address.add(t);
        return this;
    }

    /**
     * @return {@link #maritalStatus} (This field contains a patient's most recent marital (civil) status.)
     */
    public CodeableConcept getMaritalStatus() {
        if (this.maritalStatus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Patient.maritalStatus");
            else if (Configuration.doAutoCreate())
                // cc
                this.maritalStatus = new CodeableConcept();
        return this.maritalStatus;
    }

    public boolean hasMaritalStatus() {
        return this.maritalStatus != null && !this.maritalStatus.isEmpty();
    }

    /**
     * @param value {@link #maritalStatus} (This field contains a patient's most recent marital (civil) status.)
     */
    public Patient setMaritalStatus(CodeableConcept value) {
        this.maritalStatus = value;
        return this;
    }

    /**
     * @return {@link #multipleBirth} (Indicates whether the patient is part of a multiple or indicates the actual birth order.)
     */
    public Type getMultipleBirth() {
        return this.multipleBirth;
    }

    /**
     * @return {@link #multipleBirth} (Indicates whether the patient is part of a multiple or indicates the actual birth order.)
     */
    public BooleanType getMultipleBirthBooleanType() throws FHIRException {
        if (!(this.multipleBirth instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but " + this.multipleBirth.getClass().getName() + " was encountered");
        return (BooleanType) this.multipleBirth;
    }

    public boolean hasMultipleBirthBooleanType() {
        return this.multipleBirth instanceof BooleanType;
    }

    /**
     * @return {@link #multipleBirth} (Indicates whether the patient is part of a multiple or indicates the actual birth order.)
     */
    public IntegerType getMultipleBirthIntegerType() throws FHIRException {
        if (!(this.multipleBirth instanceof IntegerType))
            throw new FHIRException("Type mismatch: the type IntegerType was expected, but " + this.multipleBirth.getClass().getName() + " was encountered");
        return (IntegerType) this.multipleBirth;
    }

    public boolean hasMultipleBirthIntegerType() {
        return this.multipleBirth instanceof IntegerType;
    }

    public boolean hasMultipleBirth() {
        return this.multipleBirth != null && !this.multipleBirth.isEmpty();
    }

    /**
     * @param value {@link #multipleBirth} (Indicates whether the patient is part of a multiple or indicates the actual birth order.)
     */
    public Patient setMultipleBirth(Type value) {
        this.multipleBirth = value;
        return this;
    }

    /**
     * @return {@link #photo} (Image of the patient.)
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
     * @return {@link #photo} (Image of the patient.)
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
    public Patient addPhoto(Attachment t) {
        // 3
        if (t == null)
            return this;
        if (this.photo == null)
            this.photo = new ArrayList<Attachment>();
        this.photo.add(t);
        return this;
    }

    /**
     * @return {@link #contact} (A contact party (e.g. guardian, partner, friend) for the patient.)
     */
    public List<ContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<ContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (ContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (A contact party (e.g. guardian, partner, friend) for the patient.)
     */
    // syntactic sugar
    public ContactComponent addContact() {
        // 3
        ContactComponent t = new ContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<ContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public Patient addContact(ContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<ContactComponent>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #animal} (This patient is known to be an animal.)
     */
    public AnimalComponent getAnimal() {
        if (this.animal == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Patient.animal");
            else if (Configuration.doAutoCreate())
                // cc
                this.animal = new AnimalComponent();
        return this.animal;
    }

    public boolean hasAnimal() {
        return this.animal != null && !this.animal.isEmpty();
    }

    /**
     * @param value {@link #animal} (This patient is known to be an animal.)
     */
    public Patient setAnimal(AnimalComponent value) {
        this.animal = value;
        return this;
    }

    /**
     * @return {@link #communication} (Languages which may be used to communicate with the patient about his or her health.)
     */
    public List<PatientCommunicationComponent> getCommunication() {
        if (this.communication == null)
            this.communication = new ArrayList<PatientCommunicationComponent>();
        return this.communication;
    }

    public boolean hasCommunication() {
        if (this.communication == null)
            return false;
        for (PatientCommunicationComponent item : this.communication) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #communication} (Languages which may be used to communicate with the patient about his or her health.)
     */
    // syntactic sugar
    public PatientCommunicationComponent addCommunication() {
        // 3
        PatientCommunicationComponent t = new PatientCommunicationComponent();
        if (this.communication == null)
            this.communication = new ArrayList<PatientCommunicationComponent>();
        this.communication.add(t);
        return t;
    }

    // syntactic sugar
    public Patient addCommunication(PatientCommunicationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.communication == null)
            this.communication = new ArrayList<PatientCommunicationComponent>();
        this.communication.add(t);
        return this;
    }

    /**
     * @return {@link #careProvider} (Patient's nominated care provider.)
     */
    public List<Reference> getCareProvider() {
        if (this.careProvider == null)
            this.careProvider = new ArrayList<Reference>();
        return this.careProvider;
    }

    public boolean hasCareProvider() {
        if (this.careProvider == null)
            return false;
        for (Reference item : this.careProvider) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #careProvider} (Patient's nominated care provider.)
     */
    // syntactic sugar
    public Reference addCareProvider() {
        // 3
        Reference t = new Reference();
        if (this.careProvider == null)
            this.careProvider = new ArrayList<Reference>();
        this.careProvider.add(t);
        return t;
    }

    // syntactic sugar
    public Patient addCareProvider(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.careProvider == null)
            this.careProvider = new ArrayList<Reference>();
        this.careProvider.add(t);
        return this;
    }

    /**
     * @return {@link #careProvider} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Patient's nominated care provider.)
     */
    public List<Resource> getCareProviderTarget() {
        if (this.careProviderTarget == null)
            this.careProviderTarget = new ArrayList<Resource>();
        return this.careProviderTarget;
    }

    /**
     * @return {@link #managingOrganization} (Organization that is the custodian of the patient record.)
     */
    public Reference getManagingOrganization() {
        if (this.managingOrganization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Patient.managingOrganization");
            else if (Configuration.doAutoCreate())
                // cc
                this.managingOrganization = new Reference();
        return this.managingOrganization;
    }

    public boolean hasManagingOrganization() {
        return this.managingOrganization != null && !this.managingOrganization.isEmpty();
    }

    /**
     * @param value {@link #managingOrganization} (Organization that is the custodian of the patient record.)
     */
    public Patient setManagingOrganization(Reference value) {
        this.managingOrganization = value;
        return this;
    }

    /**
     * @return {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Organization that is the custodian of the patient record.)
     */
    public Organization getManagingOrganizationTarget() {
        if (this.managingOrganizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Patient.managingOrganization");
            else if (Configuration.doAutoCreate())
                // aa
                this.managingOrganizationTarget = new Organization();
        return this.managingOrganizationTarget;
    }

    /**
     * @param value {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Organization that is the custodian of the patient record.)
     */
    public Patient setManagingOrganizationTarget(Organization value) {
        this.managingOrganizationTarget = value;
        return this;
    }

    /**
     * @return {@link #link} (Link to another patient resource that concerns the same actual patient.)
     */
    public List<PatientLinkComponent> getLink() {
        if (this.link == null)
            this.link = new ArrayList<PatientLinkComponent>();
        return this.link;
    }

    public boolean hasLink() {
        if (this.link == null)
            return false;
        for (PatientLinkComponent item : this.link) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #link} (Link to another patient resource that concerns the same actual patient.)
     */
    // syntactic sugar
    public PatientLinkComponent addLink() {
        // 3
        PatientLinkComponent t = new PatientLinkComponent();
        if (this.link == null)
            this.link = new ArrayList<PatientLinkComponent>();
        this.link.add(t);
        return t;
    }

    // syntactic sugar
    public Patient addLink(PatientLinkComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.link == null)
            this.link = new ArrayList<PatientLinkComponent>();
        this.link.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "An identifier for this patient.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("active", "boolean", "Whether this patient record is in active use.", 0, java.lang.Integer.MAX_VALUE, active));
        childrenList.add(new Property("name", "HumanName", "A name associated with the individual.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("telecom", "ContactPoint", "A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.", 0, java.lang.Integer.MAX_VALUE, telecom));
        childrenList.add(new Property("gender", "code", "Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.", 0, java.lang.Integer.MAX_VALUE, gender));
        childrenList.add(new Property("birthDate", "date", "The date of birth for the individual.", 0, java.lang.Integer.MAX_VALUE, birthDate));
        childrenList.add(new Property("deceased[x]", "boolean|dateTime", "Indicates if the individual is deceased or not.", 0, java.lang.Integer.MAX_VALUE, deceased));
        childrenList.add(new Property("address", "Address", "Addresses for the individual.", 0, java.lang.Integer.MAX_VALUE, address));
        childrenList.add(new Property("maritalStatus", "CodeableConcept", "This field contains a patient's most recent marital (civil) status.", 0, java.lang.Integer.MAX_VALUE, maritalStatus));
        childrenList.add(new Property("multipleBirth[x]", "boolean|integer", "Indicates whether the patient is part of a multiple or indicates the actual birth order.", 0, java.lang.Integer.MAX_VALUE, multipleBirth));
        childrenList.add(new Property("photo", "Attachment", "Image of the patient.", 0, java.lang.Integer.MAX_VALUE, photo));
        childrenList.add(new Property("contact", "", "A contact party (e.g. guardian, partner, friend) for the patient.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("animal", "", "This patient is known to be an animal.", 0, java.lang.Integer.MAX_VALUE, animal));
        childrenList.add(new Property("communication", "", "Languages which may be used to communicate with the patient about his or her health.", 0, java.lang.Integer.MAX_VALUE, communication));
        childrenList.add(new Property("careProvider", "Reference(Organization|Practitioner)", "Patient's nominated care provider.", 0, java.lang.Integer.MAX_VALUE, careProvider));
        childrenList.add(new Property("managingOrganization", "Reference(Organization)", "Organization that is the custodian of the patient record.", 0, java.lang.Integer.MAX_VALUE, managingOrganization));
        childrenList.add(new Property("link", "", "Link to another patient resource that concerns the same actual patient.", 0, java.lang.Integer.MAX_VALUE, link));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("active"))
            // BooleanType
            this.active = castToBoolean(value);
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
        else if (name.equals("deceased[x]"))
            // Type
            this.deceased = (Type) value;
        else if (name.equals("address"))
            this.getAddress().add(castToAddress(value));
        else if (name.equals("maritalStatus"))
            // CodeableConcept
            this.maritalStatus = castToCodeableConcept(value);
        else if (name.equals("multipleBirth[x]"))
            // Type
            this.multipleBirth = (Type) value;
        else if (name.equals("photo"))
            this.getPhoto().add(castToAttachment(value));
        else if (name.equals("contact"))
            this.getContact().add((ContactComponent) value);
        else if (name.equals("animal"))
            // AnimalComponent
            this.animal = (AnimalComponent) value;
        else if (name.equals("communication"))
            this.getCommunication().add((PatientCommunicationComponent) value);
        else if (name.equals("careProvider"))
            this.getCareProvider().add(castToReference(value));
        else if (name.equals("managingOrganization"))
            // Reference
            this.managingOrganization = castToReference(value);
        else if (name.equals("link"))
            this.getLink().add((PatientLinkComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("active")) {
            throw new FHIRException("Cannot call addChild on a primitive type Patient.active");
        } else if (name.equals("name")) {
            return addName();
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else if (name.equals("gender")) {
            throw new FHIRException("Cannot call addChild on a primitive type Patient.gender");
        } else if (name.equals("birthDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Patient.birthDate");
        } else if (name.equals("deceasedBoolean")) {
            this.deceased = new BooleanType();
            return this.deceased;
        } else if (name.equals("deceasedDateTime")) {
            this.deceased = new DateTimeType();
            return this.deceased;
        } else if (name.equals("address")) {
            return addAddress();
        } else if (name.equals("maritalStatus")) {
            this.maritalStatus = new CodeableConcept();
            return this.maritalStatus;
        } else if (name.equals("multipleBirthBoolean")) {
            this.multipleBirth = new BooleanType();
            return this.multipleBirth;
        } else if (name.equals("multipleBirthInteger")) {
            this.multipleBirth = new IntegerType();
            return this.multipleBirth;
        } else if (name.equals("photo")) {
            return addPhoto();
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("animal")) {
            this.animal = new AnimalComponent();
            return this.animal;
        } else if (name.equals("communication")) {
            return addCommunication();
        } else if (name.equals("careProvider")) {
            return addCareProvider();
        } else if (name.equals("managingOrganization")) {
            this.managingOrganization = new Reference();
            return this.managingOrganization;
        } else if (name.equals("link")) {
            return addLink();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Patient";
    }

    public Patient copy() {
        Patient dst = new Patient();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.active = active == null ? null : active.copy();
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
        dst.deceased = deceased == null ? null : deceased.copy();
        if (address != null) {
            dst.address = new ArrayList<Address>();
            for (Address i : address) dst.address.add(i.copy());
        }
        ;
        dst.maritalStatus = maritalStatus == null ? null : maritalStatus.copy();
        dst.multipleBirth = multipleBirth == null ? null : multipleBirth.copy();
        if (photo != null) {
            dst.photo = new ArrayList<Attachment>();
            for (Attachment i : photo) dst.photo.add(i.copy());
        }
        ;
        if (contact != null) {
            dst.contact = new ArrayList<ContactComponent>();
            for (ContactComponent i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.animal = animal == null ? null : animal.copy();
        if (communication != null) {
            dst.communication = new ArrayList<PatientCommunicationComponent>();
            for (PatientCommunicationComponent i : communication) dst.communication.add(i.copy());
        }
        ;
        if (careProvider != null) {
            dst.careProvider = new ArrayList<Reference>();
            for (Reference i : careProvider) dst.careProvider.add(i.copy());
        }
        ;
        dst.managingOrganization = managingOrganization == null ? null : managingOrganization.copy();
        if (link != null) {
            dst.link = new ArrayList<PatientLinkComponent>();
            for (PatientLinkComponent i : link) dst.link.add(i.copy());
        }
        ;
        return dst;
    }

    protected Patient typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Patient))
            return false;
        Patient o = (Patient) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(active, o.active, true) && compareDeep(name, o.name, true) && compareDeep(telecom, o.telecom, true) && compareDeep(gender, o.gender, true) && compareDeep(birthDate, o.birthDate, true) && compareDeep(deceased, o.deceased, true) && compareDeep(address, o.address, true) && compareDeep(maritalStatus, o.maritalStatus, true) && compareDeep(multipleBirth, o.multipleBirth, true) && compareDeep(photo, o.photo, true) && compareDeep(contact, o.contact, true) && compareDeep(animal, o.animal, true) && compareDeep(communication, o.communication, true) && compareDeep(careProvider, o.careProvider, true) && compareDeep(managingOrganization, o.managingOrganization, true) && compareDeep(link, o.link, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Patient))
            return false;
        Patient o = (Patient) other;
        return compareValues(active, o.active, true) && compareValues(gender, o.gender, true) && compareValues(birthDate, o.birthDate, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (active == null || active.isEmpty()) && (name == null || name.isEmpty()) && (telecom == null || telecom.isEmpty()) && (gender == null || gender.isEmpty()) && (birthDate == null || birthDate.isEmpty()) && (deceased == null || deceased.isEmpty()) && (address == null || address.isEmpty()) && (maritalStatus == null || maritalStatus.isEmpty()) && (multipleBirth == null || multipleBirth.isEmpty()) && (photo == null || photo.isEmpty()) && (contact == null || contact.isEmpty()) && (animal == null || animal.isEmpty()) && (communication == null || communication.isEmpty()) && (careProvider == null || careProvider.isEmpty()) && (managingOrganization == null || managingOrganization.isEmpty()) && (link == null || link.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Patient;
    }

    public static final String SP_BIRTHDATE = "birthdate";

    public static final String SP_DECEASED = "deceased";

    public static final String SP_ADDRESSSTATE = "address-state";

    public static final String SP_GENDER = "gender";

    public static final String SP_ANIMALSPECIES = "animal-species";

    public static final String SP_LINK = "link";

    public static final String SP_LANGUAGE = "language";

    public static final String SP_DEATHDATE = "deathdate";

    public static final String SP_ANIMALBREED = "animal-breed";

    public static final String SP_ADDRESSCOUNTRY = "address-country";

    public static final String SP_PHONETIC = "phonetic";

    public static final String SP_TELECOM = "telecom";

    public static final String SP_ADDRESSCITY = "address-city";

    public static final String SP_EMAIL = "email";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_GIVEN = "given";

    public static final String SP_ADDRESS = "address";

    public static final String SP_ACTIVE = "active";

    public static final String SP_ADDRESSPOSTALCODE = "address-postalcode";

    public static final String SP_CAREPROVIDER = "careprovider";

    public static final String SP_PHONE = "phone";

    public static final String SP_ORGANIZATION = "organization";

    public static final String SP_NAME = "name";

    public static final String SP_ADDRESSUSE = "address-use";

    public static final String SP_FAMILY = "family";
}
