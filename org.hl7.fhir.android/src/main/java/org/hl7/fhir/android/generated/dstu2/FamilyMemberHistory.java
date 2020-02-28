package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.FamilyMemberHistoryEnum.FamilyHistoryStatus;
import org.hl7.fhir.android.generated.dstu2.FamilyMemberHistoryEnum.FamilyHistoryStatusEnumFactory;

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
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 */
public class FamilyMemberHistory extends DomainResource {

    /**
     * This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    protected List<Identifier> identifier;

    /**
     * The person who this history concerns.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The person who this history concerns.)
     */
    protected Patient patientTarget;

    /**
     * The date (and possibly time) when the family member history was taken.
     */
    protected DateTimeType date;

    /**
     * A code specifying a state of a Family Member History record.
     */
    protected Enumeration<FamilyHistoryStatus> status;

    /**
     * This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".
     */
    protected StringType name;

    /**
     * The type of relationship this person has to the patient (father, mother, brother etc.).
     */
    protected CodeableConcept relationship;

    /**
     * Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
     */
    protected Enumeration<AdministrativeGender> gender;

    /**
     * The actual or approximate date of birth of the relative.
     */
    protected Type born;

    /**
     * The actual or approximate age of the relative at the time the family member history is recorded.
     */
    protected Type age;

    /**
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
     */
    protected Type deceased;

    /**
     * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
     */
    protected Annotation note;

    /**
     * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
     */
    protected List<FamilyMemberHistoryConditionComponent> condition;

    private static final long serialVersionUID = -1799103041L;

    /*
   * Constructor
   */
    public FamilyMemberHistory() {
        super();
    }

    /*
   * Constructor
   */
    public FamilyMemberHistory(Reference patient, Enumeration<FamilyHistoryStatus> status, CodeableConcept relationship) {
        super();
        this.patient = patient;
        this.status = status;
        this.relationship = relationship;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
     * @return {@link #identifier} (This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
    public FamilyMemberHistory addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #patient} (The person who this history concerns.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistory.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The person who this history concerns.)
     */
    public FamilyMemberHistory setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person who this history concerns.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistory.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person who this history concerns.)
     */
    public FamilyMemberHistory setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #date} (The date (and possibly time) when the family member history was taken.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistory.date");
            else if (Configuration.doAutoCreate())
                // bb
                this.date = new DateTimeType();
        return this.date;
    }

    public boolean hasDateElement() {
        return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() {
        return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The date (and possibly time) when the family member history was taken.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public FamilyMemberHistory setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date (and possibly time) when the family member history was taken.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date (and possibly time) when the family member history was taken.
     */
    public FamilyMemberHistory setDate(Date value) {
        if (value == null)
            this.date = null;
        else {
            if (this.date == null)
                this.date = new DateTimeType();
            this.date.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #status} (A code specifying a state of a Family Member History record.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<FamilyHistoryStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistory.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<FamilyHistoryStatus>(new FamilyHistoryStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (A code specifying a state of a Family Member History record.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public FamilyMemberHistory setStatusElement(Enumeration<FamilyHistoryStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return A code specifying a state of a Family Member History record.
     */
    public FamilyHistoryStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value A code specifying a state of a Family Member History record.
     */
    public FamilyMemberHistory setStatus(FamilyHistoryStatus value) {
        if (this.status == null)
            this.status = new Enumeration<FamilyHistoryStatus>(new FamilyHistoryStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #name} (This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistory.name");
            else if (Configuration.doAutoCreate())
                // bb
                this.name = new StringType();
        return this.name;
    }

    public boolean hasNameElement() {
        return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public FamilyMemberHistory setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".
     */
    public FamilyMemberHistory setName(String value) {
        if (Utilities.noString(value))
            this.name = null;
        else {
            if (this.name == null)
                this.name = new StringType();
            this.name.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #relationship} (The type of relationship this person has to the patient (father, mother, brother etc.).)
     */
    public CodeableConcept getRelationship() {
        if (this.relationship == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistory.relationship");
            else if (Configuration.doAutoCreate())
                // cc
                this.relationship = new CodeableConcept();
        return this.relationship;
    }

    public boolean hasRelationship() {
        return this.relationship != null && !this.relationship.isEmpty();
    }

    /**
     * @param value {@link #relationship} (The type of relationship this person has to the patient (father, mother, brother etc.).)
     */
    public FamilyMemberHistory setRelationship(CodeableConcept value) {
        this.relationship = value;
        return this;
    }

    /**
     * @return {@link #gender} (Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Enumeration<AdministrativeGender> getGenderElement() {
        if (this.gender == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistory.gender");
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
     * @param value {@link #gender} (Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public FamilyMemberHistory setGenderElement(Enumeration<AdministrativeGender> value) {
        this.gender = value;
        return this;
    }

    /**
     * @return Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
     */
    public AdministrativeGender getGender() {
        return this.gender == null ? null : this.gender.getValue();
    }

    /**
     * @param value Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
     */
    public FamilyMemberHistory setGender(AdministrativeGender value) {
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
     * @return {@link #born} (The actual or approximate date of birth of the relative.)
     */
    public Type getBorn() {
        return this.born;
    }

    /**
     * @return {@link #born} (The actual or approximate date of birth of the relative.)
     */
    public Period getBornPeriod() throws FHIRException {
        if (!(this.born instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.born.getClass().getName() + " was encountered");
        return (Period) this.born;
    }

    public boolean hasBornPeriod() {
        return this.born instanceof Period;
    }

    /**
     * @return {@link #born} (The actual or approximate date of birth of the relative.)
     */
    public DateType getBornDateType() throws FHIRException {
        if (!(this.born instanceof DateType))
            throw new FHIRException("Type mismatch: the type DateType was expected, but " + this.born.getClass().getName() + " was encountered");
        return (DateType) this.born;
    }

    public boolean hasBornDateType() {
        return this.born instanceof DateType;
    }

    /**
     * @return {@link #born} (The actual or approximate date of birth of the relative.)
     */
    public StringType getBornStringType() throws FHIRException {
        if (!(this.born instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.born.getClass().getName() + " was encountered");
        return (StringType) this.born;
    }

    public boolean hasBornStringType() {
        return this.born instanceof StringType;
    }

    public boolean hasBorn() {
        return this.born != null && !this.born.isEmpty();
    }

    /**
     * @param value {@link #born} (The actual or approximate date of birth of the relative.)
     */
    public FamilyMemberHistory setBorn(Type value) {
        this.born = value;
        return this;
    }

    /**
     * @return {@link #age} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public Type getAge() {
        return this.age;
    }

    /**
     * @return {@link #age} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public Age getAgeAge() throws FHIRException {
        if (!(this.age instanceof Age))
            throw new FHIRException("Type mismatch: the type Age was expected, but " + this.age.getClass().getName() + " was encountered");
        return (Age) this.age;
    }

    public boolean hasAgeAge() {
        return this.age instanceof Age;
    }

    /**
     * @return {@link #age} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public Range getAgeRange() throws FHIRException {
        if (!(this.age instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.age.getClass().getName() + " was encountered");
        return (Range) this.age;
    }

    public boolean hasAgeRange() {
        return this.age instanceof Range;
    }

    /**
     * @return {@link #age} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public StringType getAgeStringType() throws FHIRException {
        if (!(this.age instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.age.getClass().getName() + " was encountered");
        return (StringType) this.age;
    }

    public boolean hasAgeStringType() {
        return this.age instanceof StringType;
    }

    public boolean hasAge() {
        return this.age != null && !this.age.isEmpty();
    }

    /**
     * @param value {@link #age} (The actual or approximate age of the relative at the time the family member history is recorded.)
     */
    public FamilyMemberHistory setAge(Type value) {
        this.age = value;
        return this;
    }

    /**
     * @return {@link #deceased} (Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.)
     */
    public Type getDeceased() {
        return this.deceased;
    }

    /**
     * @return {@link #deceased} (Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.)
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
     * @return {@link #deceased} (Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.)
     */
    public Age getDeceasedAge() throws FHIRException {
        if (!(this.deceased instanceof Age))
            throw new FHIRException("Type mismatch: the type Age was expected, but " + this.deceased.getClass().getName() + " was encountered");
        return (Age) this.deceased;
    }

    public boolean hasDeceasedAge() {
        return this.deceased instanceof Age;
    }

    /**
     * @return {@link #deceased} (Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.)
     */
    public Range getDeceasedRange() throws FHIRException {
        if (!(this.deceased instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.deceased.getClass().getName() + " was encountered");
        return (Range) this.deceased;
    }

    public boolean hasDeceasedRange() {
        return this.deceased instanceof Range;
    }

    /**
     * @return {@link #deceased} (Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.)
     */
    public DateType getDeceasedDateType() throws FHIRException {
        if (!(this.deceased instanceof DateType))
            throw new FHIRException("Type mismatch: the type DateType was expected, but " + this.deceased.getClass().getName() + " was encountered");
        return (DateType) this.deceased;
    }

    public boolean hasDeceasedDateType() {
        return this.deceased instanceof DateType;
    }

    /**
     * @return {@link #deceased} (Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.)
     */
    public StringType getDeceasedStringType() throws FHIRException {
        if (!(this.deceased instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.deceased.getClass().getName() + " was encountered");
        return (StringType) this.deceased;
    }

    public boolean hasDeceasedStringType() {
        return this.deceased instanceof StringType;
    }

    public boolean hasDeceased() {
        return this.deceased != null && !this.deceased.isEmpty();
    }

    /**
     * @param value {@link #deceased} (Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.)
     */
    public FamilyMemberHistory setDeceased(Type value) {
        this.deceased = value;
        return this;
    }

    /**
     * @return {@link #note} (This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.)
     */
    public Annotation getNote() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistory.note");
            else if (Configuration.doAutoCreate())
                // cc
                this.note = new Annotation();
        return this.note;
    }

    public boolean hasNote() {
        return this.note != null && !this.note.isEmpty();
    }

    /**
     * @param value {@link #note} (This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.)
     */
    public FamilyMemberHistory setNote(Annotation value) {
        this.note = value;
        return this;
    }

    /**
     * @return {@link #condition} (The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.)
     */
    public List<FamilyMemberHistoryConditionComponent> getCondition() {
        if (this.condition == null)
            this.condition = new ArrayList<FamilyMemberHistoryConditionComponent>();
        return this.condition;
    }

    public boolean hasCondition() {
        if (this.condition == null)
            return false;
        for (FamilyMemberHistoryConditionComponent item : this.condition) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #condition} (The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.)
     */
    // syntactic sugar
    public FamilyMemberHistoryConditionComponent addCondition() {
        // 3
        FamilyMemberHistoryConditionComponent t = new FamilyMemberHistoryConditionComponent();
        if (this.condition == null)
            this.condition = new ArrayList<FamilyMemberHistoryConditionComponent>();
        this.condition.add(t);
        return t;
    }

    // syntactic sugar
    public FamilyMemberHistory addCondition(FamilyMemberHistoryConditionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.condition == null)
            this.condition = new ArrayList<FamilyMemberHistoryConditionComponent>();
        this.condition.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("patient", "Reference(Patient)", "The person who this history concerns.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("date", "dateTime", "The date (and possibly time) when the family member history was taken.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("status", "code", "A code specifying a state of a Family Member History record.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("name", "string", "This will either be a name or a description; e.g. \"Aunt Susan\", \"my cousin with the red hair\".", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("relationship", "CodeableConcept", "The type of relationship this person has to the patient (father, mother, brother etc.).", 0, java.lang.Integer.MAX_VALUE, relationship));
        childrenList.add(new Property("gender", "code", "Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.", 0, java.lang.Integer.MAX_VALUE, gender));
        childrenList.add(new Property("born[x]", "Period|date|string", "The actual or approximate date of birth of the relative.", 0, java.lang.Integer.MAX_VALUE, born));
        childrenList.add(new Property("age[x]", "Age|Range|string", "The actual or approximate age of the relative at the time the family member history is recorded.", 0, java.lang.Integer.MAX_VALUE, age));
        childrenList.add(new Property("deceased[x]", "boolean|Age|Range|date|string", "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.", 0, java.lang.Integer.MAX_VALUE, deceased));
        childrenList.add(new Property("note", "Annotation", "This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("condition", "", "The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.", 0, java.lang.Integer.MAX_VALUE, condition));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("status"))
            // Enumeration<FamilyHistoryStatus>
            this.status = new FamilyHistoryStatusEnumFactory().fromType(value);
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("relationship"))
            // CodeableConcept
            this.relationship = castToCodeableConcept(value);
        else if (name.equals("gender"))
            // Enumeration<AdministrativeGender>
            this.gender = new AdministrativeGenderEnumFactory().fromType(value);
        else if (name.equals("born[x]"))
            // Type
            this.born = (Type) value;
        else if (name.equals("age[x]"))
            // Type
            this.age = (Type) value;
        else if (name.equals("deceased[x]"))
            // Type
            this.deceased = (Type) value;
        else if (name.equals("note"))
            // Annotation
            this.note = castToAnnotation(value);
        else if (name.equals("condition"))
            this.getCondition().add((FamilyMemberHistoryConditionComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type FamilyMemberHistory.date");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type FamilyMemberHistory.status");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type FamilyMemberHistory.name");
        } else if (name.equals("relationship")) {
            this.relationship = new CodeableConcept();
            return this.relationship;
        } else if (name.equals("gender")) {
            throw new FHIRException("Cannot call addChild on a primitive type FamilyMemberHistory.gender");
        } else if (name.equals("bornPeriod")) {
            this.born = new Period();
            return this.born;
        } else if (name.equals("bornDate")) {
            this.born = new DateType();
            return this.born;
        } else if (name.equals("bornString")) {
            this.born = new StringType();
            return this.born;
        } else if (name.equals("ageAge")) {
            this.age = new Age();
            return this.age;
        } else if (name.equals("ageRange")) {
            this.age = new Range();
            return this.age;
        } else if (name.equals("ageString")) {
            this.age = new StringType();
            return this.age;
        } else if (name.equals("deceasedBoolean")) {
            this.deceased = new BooleanType();
            return this.deceased;
        } else if (name.equals("deceasedAge")) {
            this.deceased = new Age();
            return this.deceased;
        } else if (name.equals("deceasedRange")) {
            this.deceased = new Range();
            return this.deceased;
        } else if (name.equals("deceasedDate")) {
            this.deceased = new DateType();
            return this.deceased;
        } else if (name.equals("deceasedString")) {
            this.deceased = new StringType();
            return this.deceased;
        } else if (name.equals("note")) {
            this.note = new Annotation();
            return this.note;
        } else if (name.equals("condition")) {
            return addCondition();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "FamilyMemberHistory";
    }

    public FamilyMemberHistory copy() {
        FamilyMemberHistory dst = new FamilyMemberHistory();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.patient = patient == null ? null : patient.copy();
        dst.date = date == null ? null : date.copy();
        dst.status = status == null ? null : status.copy();
        dst.name = name == null ? null : name.copy();
        dst.relationship = relationship == null ? null : relationship.copy();
        dst.gender = gender == null ? null : gender.copy();
        dst.born = born == null ? null : born.copy();
        dst.age = age == null ? null : age.copy();
        dst.deceased = deceased == null ? null : deceased.copy();
        dst.note = note == null ? null : note.copy();
        if (condition != null) {
            dst.condition = new ArrayList<FamilyMemberHistoryConditionComponent>();
            for (FamilyMemberHistoryConditionComponent i : condition) dst.condition.add(i.copy());
        }
        ;
        return dst;
    }

    protected FamilyMemberHistory typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof FamilyMemberHistory))
            return false;
        FamilyMemberHistory o = (FamilyMemberHistory) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(patient, o.patient, true) && compareDeep(date, o.date, true) && compareDeep(status, o.status, true) && compareDeep(name, o.name, true) && compareDeep(relationship, o.relationship, true) && compareDeep(gender, o.gender, true) && compareDeep(born, o.born, true) && compareDeep(age, o.age, true) && compareDeep(deceased, o.deceased, true) && compareDeep(note, o.note, true) && compareDeep(condition, o.condition, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof FamilyMemberHistory))
            return false;
        FamilyMemberHistory o = (FamilyMemberHistory) other;
        return compareValues(date, o.date, true) && compareValues(status, o.status, true) && compareValues(name, o.name, true) && compareValues(gender, o.gender, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (patient == null || patient.isEmpty()) && (date == null || date.isEmpty()) && (status == null || status.isEmpty()) && (name == null || name.isEmpty()) && (relationship == null || relationship.isEmpty()) && (gender == null || gender.isEmpty()) && (born == null || born.isEmpty()) && (age == null || age.isEmpty()) && (deceased == null || deceased.isEmpty()) && (note == null || note.isEmpty()) && (condition == null || condition.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.FamilyMemberHistory;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CODE = "code";

    public static final String SP_GENDER = "gender";

    public static final String SP_PATIENT = "patient";

    public static final String SP_RELATIONSHIP = "relationship";
}
