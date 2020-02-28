package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationStatementEnum.MedicationStatementStatus;
import org.hl7.fhir.android.generated.dstu2.MedicationStatementEnum.MedicationStatementStatusEnumFactory;

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
 *  A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now, or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from e.g. the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains
 *
 * The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
 */
public class MedicationStatement extends DomainResource {

    /**
     * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
     */
    protected List<Identifier> identifier;

    /**
     * The person or animal who is/was taking the medication.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The person or animal who is/was taking the medication.)
     */
    protected Patient patientTarget;

    /**
     * The person who provided the information about the taking of this medication.
     */
    protected Reference informationSource;

    /**
     * The actual object that is the target of the reference (The person who provided the information about the taking of this medication.)
     */
    protected Resource informationSourceTarget;

    /**
     * The date when the medication statement was asserted by the information source.
     */
    protected DateTimeType dateAsserted;

    /**
     * A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.
     */
    protected Enumeration<MedicationStatementStatus> status;

    /**
     * Set this to true if the record is saying that the medication was NOT taken.
     */
    protected BooleanType wasNotTaken;

    /**
     * A code indicating why the medication was not taken.
     */
    protected List<CodeableConcept> reasonNotTaken;

    /**
     * A reason for why the medication is being/was taken.
     */
    protected Type reasonForUse;

    /**
     * The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).
     */
    protected Type effective;

    /**
     * Provides extra information about the medication statement that is not conveyed by the other attributes.
     */
    protected StringType note;

    /**
     * Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement.
     */
    protected List<Reference> supportingInformation;

    /**
     * The actual objects that are the target of the reference (Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement.)
     */
    protected List<Resource> supportingInformationTarget;

    /**
     * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
     */
    protected Type medication;

    /**
     * Indicates how the medication is/was used by the patient.
     */
    protected List<MedicationStatementDosageComponent> dosage;

    private static final long serialVersionUID = 55795672L;

    /*
   * Constructor
   */
    public MedicationStatement() {
        super();
    }

    /*
   * Constructor
   */
    public MedicationStatement(Reference patient, Enumeration<MedicationStatementStatus> status, Type medication) {
        super();
        this.patient = patient;
        this.status = status;
        this.medication = medication;
    }

    /**
     * @return {@link #identifier} (External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.)
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
     * @return {@link #identifier} (External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.)
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
    public MedicationStatement addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #patient} (The person or animal who is/was taking the medication.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationStatement.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The person or animal who is/was taking the medication.)
     */
    public MedicationStatement setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person or animal who is/was taking the medication.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationStatement.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person or animal who is/was taking the medication.)
     */
    public MedicationStatement setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #informationSource} (The person who provided the information about the taking of this medication.)
     */
    public Reference getInformationSource() {
        if (this.informationSource == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationStatement.informationSource");
            else if (Configuration.doAutoCreate())
                // cc
                this.informationSource = new Reference();
        return this.informationSource;
    }

    public boolean hasInformationSource() {
        return this.informationSource != null && !this.informationSource.isEmpty();
    }

    /**
     * @param value {@link #informationSource} (The person who provided the information about the taking of this medication.)
     */
    public MedicationStatement setInformationSource(Reference value) {
        this.informationSource = value;
        return this;
    }

    /**
     * @return {@link #informationSource} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person who provided the information about the taking of this medication.)
     */
    public Resource getInformationSourceTarget() {
        return this.informationSourceTarget;
    }

    /**
     * @param value {@link #informationSource} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person who provided the information about the taking of this medication.)
     */
    public MedicationStatement setInformationSourceTarget(Resource value) {
        this.informationSourceTarget = value;
        return this;
    }

    /**
     * @return {@link #dateAsserted} (The date when the medication statement was asserted by the information source.). This is the underlying object with id, value and extensions. The accessor "getDateAsserted" gives direct access to the value
     */
    public DateTimeType getDateAssertedElement() {
        if (this.dateAsserted == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationStatement.dateAsserted");
            else if (Configuration.doAutoCreate())
                // bb
                this.dateAsserted = new DateTimeType();
        return this.dateAsserted;
    }

    public boolean hasDateAssertedElement() {
        return this.dateAsserted != null && !this.dateAsserted.isEmpty();
    }

    public boolean hasDateAsserted() {
        return this.dateAsserted != null && !this.dateAsserted.isEmpty();
    }

    /**
     * @param value {@link #dateAsserted} (The date when the medication statement was asserted by the information source.). This is the underlying object with id, value and extensions. The accessor "getDateAsserted" gives direct access to the value
     */
    public MedicationStatement setDateAssertedElement(DateTimeType value) {
        this.dateAsserted = value;
        return this;
    }

    /**
     * @return The date when the medication statement was asserted by the information source.
     */
    public Date getDateAsserted() {
        return this.dateAsserted == null ? null : this.dateAsserted.getValue();
    }

    /**
     * @param value The date when the medication statement was asserted by the information source.
     */
    public MedicationStatement setDateAsserted(Date value) {
        if (value == null)
            this.dateAsserted = null;
        else {
            if (this.dateAsserted == null)
                this.dateAsserted = new DateTimeType();
            this.dateAsserted.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #status} (A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<MedicationStatementStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationStatement.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<MedicationStatementStatus>(new MedicationStatementStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public MedicationStatement setStatusElement(Enumeration<MedicationStatementStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.
     */
    public MedicationStatementStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.
     */
    public MedicationStatement setStatus(MedicationStatementStatus value) {
        if (this.status == null)
            this.status = new Enumeration<MedicationStatementStatus>(new MedicationStatementStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #wasNotTaken} (Set this to true if the record is saying that the medication was NOT taken.). This is the underlying object with id, value and extensions. The accessor "getWasNotTaken" gives direct access to the value
     */
    public BooleanType getWasNotTakenElement() {
        if (this.wasNotTaken == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationStatement.wasNotTaken");
            else if (Configuration.doAutoCreate())
                // bb
                this.wasNotTaken = new BooleanType();
        return this.wasNotTaken;
    }

    public boolean hasWasNotTakenElement() {
        return this.wasNotTaken != null && !this.wasNotTaken.isEmpty();
    }

    public boolean hasWasNotTaken() {
        return this.wasNotTaken != null && !this.wasNotTaken.isEmpty();
    }

    /**
     * @param value {@link #wasNotTaken} (Set this to true if the record is saying that the medication was NOT taken.). This is the underlying object with id, value and extensions. The accessor "getWasNotTaken" gives direct access to the value
     */
    public MedicationStatement setWasNotTakenElement(BooleanType value) {
        this.wasNotTaken = value;
        return this;
    }

    /**
     * @return Set this to true if the record is saying that the medication was NOT taken.
     */
    public boolean getWasNotTaken() {
        return this.wasNotTaken == null || this.wasNotTaken.isEmpty() ? false : this.wasNotTaken.getValue();
    }

    /**
     * @param value Set this to true if the record is saying that the medication was NOT taken.
     */
    public MedicationStatement setWasNotTaken(boolean value) {
        if (this.wasNotTaken == null)
            this.wasNotTaken = new BooleanType();
        this.wasNotTaken.setValue(value);
        return this;
    }

    /**
     * @return {@link #reasonNotTaken} (A code indicating why the medication was not taken.)
     */
    public List<CodeableConcept> getReasonNotTaken() {
        if (this.reasonNotTaken == null)
            this.reasonNotTaken = new ArrayList<CodeableConcept>();
        return this.reasonNotTaken;
    }

    public boolean hasReasonNotTaken() {
        if (this.reasonNotTaken == null)
            return false;
        for (CodeableConcept item : this.reasonNotTaken) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #reasonNotTaken} (A code indicating why the medication was not taken.)
     */
    // syntactic sugar
    public CodeableConcept addReasonNotTaken() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.reasonNotTaken == null)
            this.reasonNotTaken = new ArrayList<CodeableConcept>();
        this.reasonNotTaken.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationStatement addReasonNotTaken(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reasonNotTaken == null)
            this.reasonNotTaken = new ArrayList<CodeableConcept>();
        this.reasonNotTaken.add(t);
        return this;
    }

    /**
     * @return {@link #reasonForUse} (A reason for why the medication is being/was taken.)
     */
    public Type getReasonForUse() {
        return this.reasonForUse;
    }

    /**
     * @return {@link #reasonForUse} (A reason for why the medication is being/was taken.)
     */
    public CodeableConcept getReasonForUseCodeableConcept() throws FHIRException {
        if (!(this.reasonForUse instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.reasonForUse.getClass().getName() + " was encountered");
        return (CodeableConcept) this.reasonForUse;
    }

    public boolean hasReasonForUseCodeableConcept() {
        return this.reasonForUse instanceof CodeableConcept;
    }

    /**
     * @return {@link #reasonForUse} (A reason for why the medication is being/was taken.)
     */
    public Reference getReasonForUseReference() throws FHIRException {
        if (!(this.reasonForUse instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.reasonForUse.getClass().getName() + " was encountered");
        return (Reference) this.reasonForUse;
    }

    public boolean hasReasonForUseReference() {
        return this.reasonForUse instanceof Reference;
    }

    public boolean hasReasonForUse() {
        return this.reasonForUse != null && !this.reasonForUse.isEmpty();
    }

    /**
     * @param value {@link #reasonForUse} (A reason for why the medication is being/was taken.)
     */
    public MedicationStatement setReasonForUse(Type value) {
        this.reasonForUse = value;
        return this;
    }

    /**
     * @return {@link #effective} (The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).)
     */
    public Type getEffective() {
        return this.effective;
    }

    /**
     * @return {@link #effective} (The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).)
     */
    public DateTimeType getEffectiveDateTimeType() throws FHIRException {
        if (!(this.effective instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.effective.getClass().getName() + " was encountered");
        return (DateTimeType) this.effective;
    }

    public boolean hasEffectiveDateTimeType() {
        return this.effective instanceof DateTimeType;
    }

    /**
     * @return {@link #effective} (The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).)
     */
    public Period getEffectivePeriod() throws FHIRException {
        if (!(this.effective instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.effective.getClass().getName() + " was encountered");
        return (Period) this.effective;
    }

    public boolean hasEffectivePeriod() {
        return this.effective instanceof Period;
    }

    public boolean hasEffective() {
        return this.effective != null && !this.effective.isEmpty();
    }

    /**
     * @param value {@link #effective} (The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).)
     */
    public MedicationStatement setEffective(Type value) {
        this.effective = value;
        return this;
    }

    /**
     * @return {@link #note} (Provides extra information about the medication statement that is not conveyed by the other attributes.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public StringType getNoteElement() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationStatement.note");
            else if (Configuration.doAutoCreate())
                // bb
                this.note = new StringType();
        return this.note;
    }

    public boolean hasNoteElement() {
        return this.note != null && !this.note.isEmpty();
    }

    public boolean hasNote() {
        return this.note != null && !this.note.isEmpty();
    }

    /**
     * @param value {@link #note} (Provides extra information about the medication statement that is not conveyed by the other attributes.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public MedicationStatement setNoteElement(StringType value) {
        this.note = value;
        return this;
    }

    /**
     * @return Provides extra information about the medication statement that is not conveyed by the other attributes.
     */
    public String getNote() {
        return this.note == null ? null : this.note.getValue();
    }

    /**
     * @param value Provides extra information about the medication statement that is not conveyed by the other attributes.
     */
    public MedicationStatement setNote(String value) {
        if (Utilities.noString(value))
            this.note = null;
        else {
            if (this.note == null)
                this.note = new StringType();
            this.note.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #supportingInformation} (Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement.)
     */
    public List<Reference> getSupportingInformation() {
        if (this.supportingInformation == null)
            this.supportingInformation = new ArrayList<Reference>();
        return this.supportingInformation;
    }

    public boolean hasSupportingInformation() {
        if (this.supportingInformation == null)
            return false;
        for (Reference item : this.supportingInformation) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #supportingInformation} (Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement.)
     */
    // syntactic sugar
    public Reference addSupportingInformation() {
        // 3
        Reference t = new Reference();
        if (this.supportingInformation == null)
            this.supportingInformation = new ArrayList<Reference>();
        this.supportingInformation.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationStatement addSupportingInformation(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.supportingInformation == null)
            this.supportingInformation = new ArrayList<Reference>();
        this.supportingInformation.add(t);
        return this;
    }

    /**
     * @return {@link #supportingInformation} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement.)
     */
    public List<Resource> getSupportingInformationTarget() {
        if (this.supportingInformationTarget == null)
            this.supportingInformationTarget = new ArrayList<Resource>();
        return this.supportingInformationTarget;
    }

    /**
     * @return {@link #medication} (Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public Type getMedication() {
        return this.medication;
    }

    /**
     * @return {@link #medication} (Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public CodeableConcept getMedicationCodeableConcept() throws FHIRException {
        if (!(this.medication instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.medication.getClass().getName() + " was encountered");
        return (CodeableConcept) this.medication;
    }

    public boolean hasMedicationCodeableConcept() {
        return this.medication instanceof CodeableConcept;
    }

    /**
     * @return {@link #medication} (Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public Reference getMedicationReference() throws FHIRException {
        if (!(this.medication instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.medication.getClass().getName() + " was encountered");
        return (Reference) this.medication;
    }

    public boolean hasMedicationReference() {
        return this.medication instanceof Reference;
    }

    public boolean hasMedication() {
        return this.medication != null && !this.medication.isEmpty();
    }

    /**
     * @param value {@link #medication} (Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public MedicationStatement setMedication(Type value) {
        this.medication = value;
        return this;
    }

    /**
     * @return {@link #dosage} (Indicates how the medication is/was used by the patient.)
     */
    public List<MedicationStatementDosageComponent> getDosage() {
        if (this.dosage == null)
            this.dosage = new ArrayList<MedicationStatementDosageComponent>();
        return this.dosage;
    }

    public boolean hasDosage() {
        if (this.dosage == null)
            return false;
        for (MedicationStatementDosageComponent item : this.dosage) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #dosage} (Indicates how the medication is/was used by the patient.)
     */
    // syntactic sugar
    public MedicationStatementDosageComponent addDosage() {
        // 3
        MedicationStatementDosageComponent t = new MedicationStatementDosageComponent();
        if (this.dosage == null)
            this.dosage = new ArrayList<MedicationStatementDosageComponent>();
        this.dosage.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationStatement addDosage(MedicationStatementDosageComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.dosage == null)
            this.dosage = new ArrayList<MedicationStatementDosageComponent>();
        this.dosage.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("patient", "Reference(Patient)", "The person or animal who is/was taking the medication.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("informationSource", "Reference(Patient|Practitioner|RelatedPerson)", "The person who provided the information about the taking of this medication.", 0, java.lang.Integer.MAX_VALUE, informationSource));
        childrenList.add(new Property("dateAsserted", "dateTime", "The date when the medication statement was asserted by the information source.", 0, java.lang.Integer.MAX_VALUE, dateAsserted));
        childrenList.add(new Property("status", "code", "A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("wasNotTaken", "boolean", "Set this to true if the record is saying that the medication was NOT taken.", 0, java.lang.Integer.MAX_VALUE, wasNotTaken));
        childrenList.add(new Property("reasonNotTaken", "CodeableConcept", "A code indicating why the medication was not taken.", 0, java.lang.Integer.MAX_VALUE, reasonNotTaken));
        childrenList.add(new Property("reasonForUse[x]", "CodeableConcept|Reference(Condition)", "A reason for why the medication is being/was taken.", 0, java.lang.Integer.MAX_VALUE, reasonForUse));
        childrenList.add(new Property("effective[x]", "dateTime|Period", "The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).", 0, java.lang.Integer.MAX_VALUE, effective));
        childrenList.add(new Property("note", "string", "Provides extra information about the medication statement that is not conveyed by the other attributes.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("supportingInformation", "Reference(Any)", "Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement.", 0, java.lang.Integer.MAX_VALUE, supportingInformation));
        childrenList.add(new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.", 0, java.lang.Integer.MAX_VALUE, medication));
        childrenList.add(new Property("dosage", "", "Indicates how the medication is/was used by the patient.", 0, java.lang.Integer.MAX_VALUE, dosage));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("informationSource"))
            // Reference
            this.informationSource = castToReference(value);
        else if (name.equals("dateAsserted"))
            // DateTimeType
            this.dateAsserted = castToDateTime(value);
        else if (name.equals("status"))
            // Enumeration<MedicationStatementStatus>
            this.status = new MedicationStatementStatusEnumFactory().fromType(value);
        else if (name.equals("wasNotTaken"))
            // BooleanType
            this.wasNotTaken = castToBoolean(value);
        else if (name.equals("reasonNotTaken"))
            this.getReasonNotTaken().add(castToCodeableConcept(value));
        else if (name.equals("reasonForUse[x]"))
            // Type
            this.reasonForUse = (Type) value;
        else if (name.equals("effective[x]"))
            // Type
            this.effective = (Type) value;
        else if (name.equals("note"))
            // StringType
            this.note = castToString(value);
        else if (name.equals("supportingInformation"))
            this.getSupportingInformation().add(castToReference(value));
        else if (name.equals("medication[x]"))
            // Type
            this.medication = (Type) value;
        else if (name.equals("dosage"))
            this.getDosage().add((MedicationStatementDosageComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("informationSource")) {
            this.informationSource = new Reference();
            return this.informationSource;
        } else if (name.equals("dateAsserted")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationStatement.dateAsserted");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationStatement.status");
        } else if (name.equals("wasNotTaken")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationStatement.wasNotTaken");
        } else if (name.equals("reasonNotTaken")) {
            return addReasonNotTaken();
        } else if (name.equals("reasonForUseCodeableConcept")) {
            this.reasonForUse = new CodeableConcept();
            return this.reasonForUse;
        } else if (name.equals("reasonForUseReference")) {
            this.reasonForUse = new Reference();
            return this.reasonForUse;
        } else if (name.equals("effectiveDateTime")) {
            this.effective = new DateTimeType();
            return this.effective;
        } else if (name.equals("effectivePeriod")) {
            this.effective = new Period();
            return this.effective;
        } else if (name.equals("note")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationStatement.note");
        } else if (name.equals("supportingInformation")) {
            return addSupportingInformation();
        } else if (name.equals("medicationCodeableConcept")) {
            this.medication = new CodeableConcept();
            return this.medication;
        } else if (name.equals("medicationReference")) {
            this.medication = new Reference();
            return this.medication;
        } else if (name.equals("dosage")) {
            return addDosage();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "MedicationStatement";
    }

    public MedicationStatement copy() {
        MedicationStatement dst = new MedicationStatement();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.patient = patient == null ? null : patient.copy();
        dst.informationSource = informationSource == null ? null : informationSource.copy();
        dst.dateAsserted = dateAsserted == null ? null : dateAsserted.copy();
        dst.status = status == null ? null : status.copy();
        dst.wasNotTaken = wasNotTaken == null ? null : wasNotTaken.copy();
        if (reasonNotTaken != null) {
            dst.reasonNotTaken = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reasonNotTaken) dst.reasonNotTaken.add(i.copy());
        }
        ;
        dst.reasonForUse = reasonForUse == null ? null : reasonForUse.copy();
        dst.effective = effective == null ? null : effective.copy();
        dst.note = note == null ? null : note.copy();
        if (supportingInformation != null) {
            dst.supportingInformation = new ArrayList<Reference>();
            for (Reference i : supportingInformation) dst.supportingInformation.add(i.copy());
        }
        ;
        dst.medication = medication == null ? null : medication.copy();
        if (dosage != null) {
            dst.dosage = new ArrayList<MedicationStatementDosageComponent>();
            for (MedicationStatementDosageComponent i : dosage) dst.dosage.add(i.copy());
        }
        ;
        return dst;
    }

    protected MedicationStatement typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationStatement))
            return false;
        MedicationStatement o = (MedicationStatement) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(patient, o.patient, true) && compareDeep(informationSource, o.informationSource, true) && compareDeep(dateAsserted, o.dateAsserted, true) && compareDeep(status, o.status, true) && compareDeep(wasNotTaken, o.wasNotTaken, true) && compareDeep(reasonNotTaken, o.reasonNotTaken, true) && compareDeep(reasonForUse, o.reasonForUse, true) && compareDeep(effective, o.effective, true) && compareDeep(note, o.note, true) && compareDeep(supportingInformation, o.supportingInformation, true) && compareDeep(medication, o.medication, true) && compareDeep(dosage, o.dosage, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationStatement))
            return false;
        MedicationStatement o = (MedicationStatement) other;
        return compareValues(dateAsserted, o.dateAsserted, true) && compareValues(status, o.status, true) && compareValues(wasNotTaken, o.wasNotTaken, true) && compareValues(note, o.note, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (patient == null || patient.isEmpty()) && (informationSource == null || informationSource.isEmpty()) && (dateAsserted == null || dateAsserted.isEmpty()) && (status == null || status.isEmpty()) && (wasNotTaken == null || wasNotTaken.isEmpty()) && (reasonNotTaken == null || reasonNotTaken.isEmpty()) && (reasonForUse == null || reasonForUse.isEmpty()) && (effective == null || effective.isEmpty()) && (note == null || note.isEmpty()) && (supportingInformation == null || supportingInformation.isEmpty()) && (medication == null || medication.isEmpty()) && (dosage == null || dosage.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.MedicationStatement;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CODE = "code";

    public static final String SP_PATIENT = "patient";

    public static final String SP_MEDICATION = "medication";

    public static final String SP_SOURCE = "source";

    public static final String SP_EFFECTIVEDATE = "effectivedate";

    public static final String SP_STATUS = "status";
}
