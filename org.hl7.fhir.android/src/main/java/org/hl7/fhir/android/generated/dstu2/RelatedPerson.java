package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.AdministrativeGender;
import org.hl7.fhir.android.generated.dstu2.Enumerations.AdministrativeGenderEnumFactory;
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
 * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
 */
public class RelatedPerson extends DomainResource {

    /**
     * Identifier for a person within a particular scope.
     */
    protected List<Identifier> identifier;

    /**
     * The patient this person is related to.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient this person is related to.)
     */
    protected Patient patientTarget;

    /**
     * The nature of the relationship between a patient and the related person.
     */
    protected CodeableConcept relationship;

    /**
     * A name associated with the person.
     */
    protected HumanName name;

    /**
     * A contact detail for the person, e.g. a telephone number or an email address.
     */
    protected List<ContactPoint> telecom;

    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     */
    protected Enumeration<AdministrativeGender> gender;

    /**
     * The date on which the related person was born.
     */
    protected DateType birthDate;

    /**
     * Address where the related person can be contacted or visited.
     */
    protected List<Address> address;

    /**
     * Image of the person.
     */
    protected List<Attachment> photo;

    /**
     * The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown.
     */
    protected Period period;

    private static final long serialVersionUID = 7777543L;

    /*
   * Constructor
   */
    public RelatedPerson() {
        super();
    }

    /*
   * Constructor
   */
    public RelatedPerson(Reference patient) {
        super();
        this.patient = patient;
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
    public RelatedPerson addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #patient} (The patient this person is related to.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RelatedPerson.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient this person is related to.)
     */
    public RelatedPerson setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient this person is related to.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RelatedPerson.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient this person is related to.)
     */
    public RelatedPerson setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #relationship} (The nature of the relationship between a patient and the related person.)
     */
    public CodeableConcept getRelationship() {
        if (this.relationship == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RelatedPerson.relationship");
            else if (Configuration.doAutoCreate())
                // cc
                this.relationship = new CodeableConcept();
        return this.relationship;
    }

    public boolean hasRelationship() {
        return this.relationship != null && !this.relationship.isEmpty();
    }

    /**
     * @param value {@link #relationship} (The nature of the relationship between a patient and the related person.)
     */
    public RelatedPerson setRelationship(CodeableConcept value) {
        this.relationship = value;
        return this;
    }

    /**
     * @return {@link #name} (A name associated with the person.)
     */
    public HumanName getName() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RelatedPerson.name");
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
    public RelatedPerson setName(HumanName value) {
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
    public RelatedPerson addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    /**
     * @return {@link #gender} (Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Enumeration<AdministrativeGender> getGenderElement() {
        if (this.gender == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RelatedPerson.gender");
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
    public RelatedPerson setGenderElement(Enumeration<AdministrativeGender> value) {
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
    public RelatedPerson setGender(AdministrativeGender value) {
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
     * @return {@link #birthDate} (The date on which the related person was born.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public DateType getBirthDateElement() {
        if (this.birthDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RelatedPerson.birthDate");
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
     * @param value {@link #birthDate} (The date on which the related person was born.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public RelatedPerson setBirthDateElement(DateType value) {
        this.birthDate = value;
        return this;
    }

    /**
     * @return The date on which the related person was born.
     */
    public Date getBirthDate() {
        return this.birthDate == null ? null : this.birthDate.getValue();
    }

    /**
     * @param value The date on which the related person was born.
     */
    public RelatedPerson setBirthDate(Date value) {
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
     * @return {@link #address} (Address where the related person can be contacted or visited.)
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
     * @return {@link #address} (Address where the related person can be contacted or visited.)
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
    public RelatedPerson addAddress(Address t) {
        // 3
        if (t == null)
            return this;
        if (this.address == null)
            this.address = new ArrayList<Address>();
        this.address.add(t);
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
    public RelatedPerson addPhoto(Attachment t) {
        // 3
        if (t == null)
            return this;
        if (this.photo == null)
            this.photo = new ArrayList<Attachment>();
        this.photo.add(t);
        return this;
    }

    /**
     * @return {@link #period} (The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RelatedPerson.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown.)
     */
    public RelatedPerson setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifier for a person within a particular scope.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient this person is related to.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("relationship", "CodeableConcept", "The nature of the relationship between a patient and the related person.", 0, java.lang.Integer.MAX_VALUE, relationship));
        childrenList.add(new Property("name", "HumanName", "A name associated with the person.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("telecom", "ContactPoint", "A contact detail for the person, e.g. a telephone number or an email address.", 0, java.lang.Integer.MAX_VALUE, telecom));
        childrenList.add(new Property("gender", "code", "Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.", 0, java.lang.Integer.MAX_VALUE, gender));
        childrenList.add(new Property("birthDate", "date", "The date on which the related person was born.", 0, java.lang.Integer.MAX_VALUE, birthDate));
        childrenList.add(new Property("address", "Address", "Address where the related person can be contacted or visited.", 0, java.lang.Integer.MAX_VALUE, address));
        childrenList.add(new Property("photo", "Attachment", "Image of the person.", 0, java.lang.Integer.MAX_VALUE, photo));
        childrenList.add(new Property("period", "Period", "The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("relationship"))
            // CodeableConcept
            this.relationship = castToCodeableConcept(value);
        else if (name.equals("name"))
            // HumanName
            this.name = castToHumanName(value);
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
            this.getPhoto().add(castToAttachment(value));
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("relationship")) {
            this.relationship = new CodeableConcept();
            return this.relationship;
        } else if (name.equals("name")) {
            this.name = new HumanName();
            return this.name;
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else if (name.equals("gender")) {
            throw new FHIRException("Cannot call addChild on a primitive type RelatedPerson.gender");
        } else if (name.equals("birthDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type RelatedPerson.birthDate");
        } else if (name.equals("address")) {
            return addAddress();
        } else if (name.equals("photo")) {
            return addPhoto();
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "RelatedPerson";
    }

    public RelatedPerson copy() {
        RelatedPerson dst = new RelatedPerson();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.patient = patient == null ? null : patient.copy();
        dst.relationship = relationship == null ? null : relationship.copy();
        dst.name = name == null ? null : name.copy();
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
        if (photo != null) {
            dst.photo = new ArrayList<Attachment>();
            for (Attachment i : photo) dst.photo.add(i.copy());
        }
        ;
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    protected RelatedPerson typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof RelatedPerson))
            return false;
        RelatedPerson o = (RelatedPerson) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(patient, o.patient, true) && compareDeep(relationship, o.relationship, true) && compareDeep(name, o.name, true) && compareDeep(telecom, o.telecom, true) && compareDeep(gender, o.gender, true) && compareDeep(birthDate, o.birthDate, true) && compareDeep(address, o.address, true) && compareDeep(photo, o.photo, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof RelatedPerson))
            return false;
        RelatedPerson o = (RelatedPerson) other;
        return compareValues(gender, o.gender, true) && compareValues(birthDate, o.birthDate, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (patient == null || patient.isEmpty()) && (relationship == null || relationship.isEmpty()) && (name == null || name.isEmpty()) && (telecom == null || telecom.isEmpty()) && (gender == null || gender.isEmpty()) && (birthDate == null || birthDate.isEmpty()) && (address == null || address.isEmpty()) && (photo == null || photo.isEmpty()) && (period == null || period.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.RelatedPerson;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_ADDRESS = "address";

    public static final String SP_BIRTHDATE = "birthdate";

    public static final String SP_ADDRESSSTATE = "address-state";

    public static final String SP_GENDER = "gender";

    public static final String SP_ADDRESSPOSTALCODE = "address-postalcode";

    public static final String SP_ADDRESSCOUNTRY = "address-country";

    public static final String SP_PHONETIC = "phonetic";

    public static final String SP_PHONE = "phone";

    public static final String SP_PATIENT = "patient";

    public static final String SP_NAME = "name";

    public static final String SP_ADDRESSUSE = "address-use";

    public static final String SP_TELECOM = "telecom";

    public static final String SP_ADDRESSCITY = "address-city";

    public static final String SP_EMAIL = "email";
}
