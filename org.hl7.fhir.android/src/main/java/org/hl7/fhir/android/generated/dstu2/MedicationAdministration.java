package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationAdministrationEnum.MedicationAdministrationStatus;
import org.hl7.fhir.android.generated.dstu2.MedicationAdministrationEnum.MedicationAdministrationStatusEnumFactory;

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
 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 */
public class MedicationAdministration extends DomainResource {

    /**
     * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
     */
    protected List<Identifier> identifier;

    /**
     * Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way.
     */
    protected Enumeration<MedicationAdministrationStatus> status;

    /**
     * The person or animal receiving the medication.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The person or animal receiving the medication.)
     */
    protected Patient patientTarget;

    /**
     * The individual who was responsible for giving the medication to the patient.
     */
    protected Reference practitioner;

    /**
     * The actual object that is the target of the reference (The individual who was responsible for giving the medication to the patient.)
     */
    protected Resource practitionerTarget;

    /**
     * The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.)
     */
    protected Encounter encounterTarget;

    /**
     * The original request, instruction or authority to perform the administration.
     */
    protected Reference prescription;

    /**
     * The actual object that is the target of the reference (The original request, instruction or authority to perform the administration.)
     */
    protected MedicationOrder prescriptionTarget;

    /**
     * Set this to true if the record is saying that the medication was NOT administered.
     */
    protected BooleanType wasNotGiven;

    /**
     * A code indicating why the administration was not performed.
     */
    protected List<CodeableConcept> reasonNotGiven;

    /**
     * A code indicating why the medication was given.
     */
    protected List<CodeableConcept> reasonGiven;

    /**
     * A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
     */
    protected Type effectiveTime;

    /**
     * Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
     */
    protected Type medication;

    /**
     * The device used in administering the medication to the patient.  For example, a particular infusion pump.
     */
    protected List<Reference> device;

    /**
     * The actual objects that are the target of the reference (The device used in administering the medication to the patient.  For example, a particular infusion pump.)
     */
    protected List<Device> deviceTarget;

    /**
     * Extra information about the medication administration that is not conveyed by the other attributes.
     */
    protected StringType note;

    /**
     * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
     */
    protected MedicationAdministrationDosageComponent dosage;

    private static final long serialVersionUID = -669616345L;

    /*
   * Constructor
   */
    public MedicationAdministration() {
        super();
    }

    /*
   * Constructor
   */
    public MedicationAdministration(Enumeration<MedicationAdministrationStatus> status, Reference patient, Type effectiveTime, Type medication) {
        super();
        this.status = status;
        this.patient = patient;
        this.effectiveTime = effectiveTime;
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
    public MedicationAdministration addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #status} (Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<MedicationAdministrationStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<MedicationAdministrationStatus>(new MedicationAdministrationStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public MedicationAdministration setStatusElement(Enumeration<MedicationAdministrationStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way.
     */
    public MedicationAdministrationStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way.
     */
    public MedicationAdministration setStatus(MedicationAdministrationStatus value) {
        if (this.status == null)
            this.status = new Enumeration<MedicationAdministrationStatus>(new MedicationAdministrationStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #patient} (The person or animal receiving the medication.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The person or animal receiving the medication.)
     */
    public MedicationAdministration setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person or animal receiving the medication.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person or animal receiving the medication.)
     */
    public MedicationAdministration setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #practitioner} (The individual who was responsible for giving the medication to the patient.)
     */
    public Reference getPractitioner() {
        if (this.practitioner == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.practitioner");
            else if (Configuration.doAutoCreate())
                // cc
                this.practitioner = new Reference();
        return this.practitioner;
    }

    public boolean hasPractitioner() {
        return this.practitioner != null && !this.practitioner.isEmpty();
    }

    /**
     * @param value {@link #practitioner} (The individual who was responsible for giving the medication to the patient.)
     */
    public MedicationAdministration setPractitioner(Reference value) {
        this.practitioner = value;
        return this;
    }

    /**
     * @return {@link #practitioner} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The individual who was responsible for giving the medication to the patient.)
     */
    public Resource getPractitionerTarget() {
        return this.practitionerTarget;
    }

    /**
     * @param value {@link #practitioner} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The individual who was responsible for giving the medication to the patient.)
     */
    public MedicationAdministration setPractitionerTarget(Resource value) {
        this.practitionerTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.)
     */
    public MedicationAdministration setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.)
     */
    public MedicationAdministration setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #prescription} (The original request, instruction or authority to perform the administration.)
     */
    public Reference getPrescription() {
        if (this.prescription == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.prescription");
            else if (Configuration.doAutoCreate())
                // cc
                this.prescription = new Reference();
        return this.prescription;
    }

    public boolean hasPrescription() {
        return this.prescription != null && !this.prescription.isEmpty();
    }

    /**
     * @param value {@link #prescription} (The original request, instruction or authority to perform the administration.)
     */
    public MedicationAdministration setPrescription(Reference value) {
        this.prescription = value;
        return this;
    }

    /**
     * @return {@link #prescription} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The original request, instruction or authority to perform the administration.)
     */
    public MedicationOrder getPrescriptionTarget() {
        if (this.prescriptionTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.prescription");
            else if (Configuration.doAutoCreate())
                // aa
                this.prescriptionTarget = new MedicationOrder();
        return this.prescriptionTarget;
    }

    /**
     * @param value {@link #prescription} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The original request, instruction or authority to perform the administration.)
     */
    public MedicationAdministration setPrescriptionTarget(MedicationOrder value) {
        this.prescriptionTarget = value;
        return this;
    }

    /**
     * @return {@link #wasNotGiven} (Set this to true if the record is saying that the medication was NOT administered.). This is the underlying object with id, value and extensions. The accessor "getWasNotGiven" gives direct access to the value
     */
    public BooleanType getWasNotGivenElement() {
        if (this.wasNotGiven == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.wasNotGiven");
            else if (Configuration.doAutoCreate())
                // bb
                this.wasNotGiven = new BooleanType();
        return this.wasNotGiven;
    }

    public boolean hasWasNotGivenElement() {
        return this.wasNotGiven != null && !this.wasNotGiven.isEmpty();
    }

    public boolean hasWasNotGiven() {
        return this.wasNotGiven != null && !this.wasNotGiven.isEmpty();
    }

    /**
     * @param value {@link #wasNotGiven} (Set this to true if the record is saying that the medication was NOT administered.). This is the underlying object with id, value and extensions. The accessor "getWasNotGiven" gives direct access to the value
     */
    public MedicationAdministration setWasNotGivenElement(BooleanType value) {
        this.wasNotGiven = value;
        return this;
    }

    /**
     * @return Set this to true if the record is saying that the medication was NOT administered.
     */
    public boolean getWasNotGiven() {
        return this.wasNotGiven == null || this.wasNotGiven.isEmpty() ? false : this.wasNotGiven.getValue();
    }

    /**
     * @param value Set this to true if the record is saying that the medication was NOT administered.
     */
    public MedicationAdministration setWasNotGiven(boolean value) {
        if (this.wasNotGiven == null)
            this.wasNotGiven = new BooleanType();
        this.wasNotGiven.setValue(value);
        return this;
    }

    /**
     * @return {@link #reasonNotGiven} (A code indicating why the administration was not performed.)
     */
    public List<CodeableConcept> getReasonNotGiven() {
        if (this.reasonNotGiven == null)
            this.reasonNotGiven = new ArrayList<CodeableConcept>();
        return this.reasonNotGiven;
    }

    public boolean hasReasonNotGiven() {
        if (this.reasonNotGiven == null)
            return false;
        for (CodeableConcept item : this.reasonNotGiven) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #reasonNotGiven} (A code indicating why the administration was not performed.)
     */
    // syntactic sugar
    public CodeableConcept addReasonNotGiven() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.reasonNotGiven == null)
            this.reasonNotGiven = new ArrayList<CodeableConcept>();
        this.reasonNotGiven.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationAdministration addReasonNotGiven(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reasonNotGiven == null)
            this.reasonNotGiven = new ArrayList<CodeableConcept>();
        this.reasonNotGiven.add(t);
        return this;
    }

    /**
     * @return {@link #reasonGiven} (A code indicating why the medication was given.)
     */
    public List<CodeableConcept> getReasonGiven() {
        if (this.reasonGiven == null)
            this.reasonGiven = new ArrayList<CodeableConcept>();
        return this.reasonGiven;
    }

    public boolean hasReasonGiven() {
        if (this.reasonGiven == null)
            return false;
        for (CodeableConcept item : this.reasonGiven) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #reasonGiven} (A code indicating why the medication was given.)
     */
    // syntactic sugar
    public CodeableConcept addReasonGiven() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.reasonGiven == null)
            this.reasonGiven = new ArrayList<CodeableConcept>();
        this.reasonGiven.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationAdministration addReasonGiven(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reasonGiven == null)
            this.reasonGiven = new ArrayList<CodeableConcept>();
        this.reasonGiven.add(t);
        return this;
    }

    /**
     * @return {@link #effectiveTime} (A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.)
     */
    public Type getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return {@link #effectiveTime} (A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.)
     */
    public DateTimeType getEffectiveTimeDateTimeType() throws FHIRException {
        if (!(this.effectiveTime instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.effectiveTime.getClass().getName() + " was encountered");
        return (DateTimeType) this.effectiveTime;
    }

    public boolean hasEffectiveTimeDateTimeType() {
        return this.effectiveTime instanceof DateTimeType;
    }

    /**
     * @return {@link #effectiveTime} (A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.)
     */
    public Period getEffectiveTimePeriod() throws FHIRException {
        if (!(this.effectiveTime instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.effectiveTime.getClass().getName() + " was encountered");
        return (Period) this.effectiveTime;
    }

    public boolean hasEffectiveTimePeriod() {
        return this.effectiveTime instanceof Period;
    }

    public boolean hasEffectiveTime() {
        return this.effectiveTime != null && !this.effectiveTime.isEmpty();
    }

    /**
     * @param value {@link #effectiveTime} (A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.)
     */
    public MedicationAdministration setEffectiveTime(Type value) {
        this.effectiveTime = value;
        return this;
    }

    /**
     * @return {@link #medication} (Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public Type getMedication() {
        return this.medication;
    }

    /**
     * @return {@link #medication} (Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.)
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
     * @return {@link #medication} (Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.)
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
     * @param value {@link #medication} (Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public MedicationAdministration setMedication(Type value) {
        this.medication = value;
        return this;
    }

    /**
     * @return {@link #device} (The device used in administering the medication to the patient.  For example, a particular infusion pump.)
     */
    public List<Reference> getDevice() {
        if (this.device == null)
            this.device = new ArrayList<Reference>();
        return this.device;
    }

    public boolean hasDevice() {
        if (this.device == null)
            return false;
        for (Reference item : this.device) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #device} (The device used in administering the medication to the patient.  For example, a particular infusion pump.)
     */
    // syntactic sugar
    public Reference addDevice() {
        // 3
        Reference t = new Reference();
        if (this.device == null)
            this.device = new ArrayList<Reference>();
        this.device.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationAdministration addDevice(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.device == null)
            this.device = new ArrayList<Reference>();
        this.device.add(t);
        return this;
    }

    /**
     * @return {@link #device} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The device used in administering the medication to the patient.  For example, a particular infusion pump.)
     */
    public List<Device> getDeviceTarget() {
        if (this.deviceTarget == null)
            this.deviceTarget = new ArrayList<Device>();
        return this.deviceTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #device} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. The device used in administering the medication to the patient.  For example, a particular infusion pump.)
     */
    public Device addDeviceTarget() {
        Device r = new Device();
        if (this.deviceTarget == null)
            this.deviceTarget = new ArrayList<Device>();
        this.deviceTarget.add(r);
        return r;
    }

    /**
     * @return {@link #note} (Extra information about the medication administration that is not conveyed by the other attributes.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public StringType getNoteElement() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.note");
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
     * @param value {@link #note} (Extra information about the medication administration that is not conveyed by the other attributes.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public MedicationAdministration setNoteElement(StringType value) {
        this.note = value;
        return this;
    }

    /**
     * @return Extra information about the medication administration that is not conveyed by the other attributes.
     */
    public String getNote() {
        return this.note == null ? null : this.note.getValue();
    }

    /**
     * @param value Extra information about the medication administration that is not conveyed by the other attributes.
     */
    public MedicationAdministration setNote(String value) {
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
     * @return {@link #dosage} (Describes the medication dosage information details e.g. dose, rate, site, route, etc.)
     */
    public MedicationAdministrationDosageComponent getDosage() {
        if (this.dosage == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministration.dosage");
            else if (Configuration.doAutoCreate())
                // cc
                this.dosage = new MedicationAdministrationDosageComponent();
        return this.dosage;
    }

    public boolean hasDosage() {
        return this.dosage != null && !this.dosage.isEmpty();
    }

    /**
     * @param value {@link #dosage} (Describes the medication dosage information details e.g. dose, rate, site, route, etc.)
     */
    public MedicationAdministration setDosage(MedicationAdministrationDosageComponent value) {
        this.dosage = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("patient", "Reference(Patient)", "The person or animal receiving the medication.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("practitioner", "Reference(Practitioner|Patient|RelatedPerson)", "The individual who was responsible for giving the medication to the patient.", 0, java.lang.Integer.MAX_VALUE, practitioner));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("prescription", "Reference(MedicationOrder)", "The original request, instruction or authority to perform the administration.", 0, java.lang.Integer.MAX_VALUE, prescription));
        childrenList.add(new Property("wasNotGiven", "boolean", "Set this to true if the record is saying that the medication was NOT administered.", 0, java.lang.Integer.MAX_VALUE, wasNotGiven));
        childrenList.add(new Property("reasonNotGiven", "CodeableConcept", "A code indicating why the administration was not performed.", 0, java.lang.Integer.MAX_VALUE, reasonNotGiven));
        childrenList.add(new Property("reasonGiven", "CodeableConcept", "A code indicating why the medication was given.", 0, java.lang.Integer.MAX_VALUE, reasonGiven));
        childrenList.add(new Property("effectiveTime[x]", "dateTime|Period", "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.", 0, java.lang.Integer.MAX_VALUE, effectiveTime));
        childrenList.add(new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.", 0, java.lang.Integer.MAX_VALUE, medication));
        childrenList.add(new Property("device", "Reference(Device)", "The device used in administering the medication to the patient.  For example, a particular infusion pump.", 0, java.lang.Integer.MAX_VALUE, device));
        childrenList.add(new Property("note", "string", "Extra information about the medication administration that is not conveyed by the other attributes.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("dosage", "", "Describes the medication dosage information details e.g. dose, rate, site, route, etc.", 0, java.lang.Integer.MAX_VALUE, dosage));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
            // Enumeration<MedicationAdministrationStatus>
            this.status = new MedicationAdministrationStatusEnumFactory().fromType(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("practitioner"))
            // Reference
            this.practitioner = castToReference(value);
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("prescription"))
            // Reference
            this.prescription = castToReference(value);
        else if (name.equals("wasNotGiven"))
            // BooleanType
            this.wasNotGiven = castToBoolean(value);
        else if (name.equals("reasonNotGiven"))
            this.getReasonNotGiven().add(castToCodeableConcept(value));
        else if (name.equals("reasonGiven"))
            this.getReasonGiven().add(castToCodeableConcept(value));
        else if (name.equals("effectiveTime[x]"))
            // Type
            this.effectiveTime = (Type) value;
        else if (name.equals("medication[x]"))
            // Type
            this.medication = (Type) value;
        else if (name.equals("device"))
            this.getDevice().add(castToReference(value));
        else if (name.equals("note"))
            // StringType
            this.note = castToString(value);
        else if (name.equals("dosage"))
            // MedicationAdministrationDosageComponent
            this.dosage = (MedicationAdministrationDosageComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationAdministration.status");
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("practitioner")) {
            this.practitioner = new Reference();
            return this.practitioner;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("prescription")) {
            this.prescription = new Reference();
            return this.prescription;
        } else if (name.equals("wasNotGiven")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationAdministration.wasNotGiven");
        } else if (name.equals("reasonNotGiven")) {
            return addReasonNotGiven();
        } else if (name.equals("reasonGiven")) {
            return addReasonGiven();
        } else if (name.equals("effectiveTimeDateTime")) {
            this.effectiveTime = new DateTimeType();
            return this.effectiveTime;
        } else if (name.equals("effectiveTimePeriod")) {
            this.effectiveTime = new Period();
            return this.effectiveTime;
        } else if (name.equals("medicationCodeableConcept")) {
            this.medication = new CodeableConcept();
            return this.medication;
        } else if (name.equals("medicationReference")) {
            this.medication = new Reference();
            return this.medication;
        } else if (name.equals("device")) {
            return addDevice();
        } else if (name.equals("note")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationAdministration.note");
        } else if (name.equals("dosage")) {
            this.dosage = new MedicationAdministrationDosageComponent();
            return this.dosage;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "MedicationAdministration";
    }

    public MedicationAdministration copy() {
        MedicationAdministration dst = new MedicationAdministration();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.practitioner = practitioner == null ? null : practitioner.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.prescription = prescription == null ? null : prescription.copy();
        dst.wasNotGiven = wasNotGiven == null ? null : wasNotGiven.copy();
        if (reasonNotGiven != null) {
            dst.reasonNotGiven = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reasonNotGiven) dst.reasonNotGiven.add(i.copy());
        }
        ;
        if (reasonGiven != null) {
            dst.reasonGiven = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reasonGiven) dst.reasonGiven.add(i.copy());
        }
        ;
        dst.effectiveTime = effectiveTime == null ? null : effectiveTime.copy();
        dst.medication = medication == null ? null : medication.copy();
        if (device != null) {
            dst.device = new ArrayList<Reference>();
            for (Reference i : device) dst.device.add(i.copy());
        }
        ;
        dst.note = note == null ? null : note.copy();
        dst.dosage = dosage == null ? null : dosage.copy();
        return dst;
    }

    protected MedicationAdministration typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationAdministration))
            return false;
        MedicationAdministration o = (MedicationAdministration) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(patient, o.patient, true) && compareDeep(practitioner, o.practitioner, true) && compareDeep(encounter, o.encounter, true) && compareDeep(prescription, o.prescription, true) && compareDeep(wasNotGiven, o.wasNotGiven, true) && compareDeep(reasonNotGiven, o.reasonNotGiven, true) && compareDeep(reasonGiven, o.reasonGiven, true) && compareDeep(effectiveTime, o.effectiveTime, true) && compareDeep(medication, o.medication, true) && compareDeep(device, o.device, true) && compareDeep(note, o.note, true) && compareDeep(dosage, o.dosage, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationAdministration))
            return false;
        MedicationAdministration o = (MedicationAdministration) other;
        return compareValues(status, o.status, true) && compareValues(wasNotGiven, o.wasNotGiven, true) && compareValues(note, o.note, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (patient == null || patient.isEmpty()) && (practitioner == null || practitioner.isEmpty()) && (encounter == null || encounter.isEmpty()) && (prescription == null || prescription.isEmpty()) && (wasNotGiven == null || wasNotGiven.isEmpty()) && (reasonNotGiven == null || reasonNotGiven.isEmpty()) && (reasonGiven == null || reasonGiven.isEmpty()) && (effectiveTime == null || effectiveTime.isEmpty()) && (medication == null || medication.isEmpty()) && (device == null || device.isEmpty()) && (note == null || note.isEmpty()) && (dosage == null || dosage.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.MedicationAdministration;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CODE = "code";

    public static final String SP_PRESCRIPTION = "prescription";

    public static final String SP_EFFECTIVETIME = "effectivetime";

    public static final String SP_PRACTITIONER = "practitioner";

    public static final String SP_PATIENT = "patient";

    public static final String SP_MEDICATION = "medication";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_DEVICE = "device";

    public static final String SP_NOTGIVEN = "notgiven";

    public static final String SP_STATUS = "status";
}
