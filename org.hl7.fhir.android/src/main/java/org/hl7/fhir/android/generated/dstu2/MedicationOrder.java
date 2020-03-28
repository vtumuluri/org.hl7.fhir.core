package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationOrderEnum.MedicationOrderStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.MedicationOrderEnum.MedicationOrderStatus;

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
 * An order for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationOrder" rather than "MedicationPrescription" to generalize the use across inpatient and outpatient settings as well as for care plans, etc.
 */
public class MedicationOrder extends DomainResource {

    /**
     * External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system.
     */
    protected List<Identifier> identifier;

    /**
     * The date (and perhaps time) when the prescription was written.
     */
    protected DateTimeType dateWritten;

    /**
     * A code specifying the state of the order.  Generally this will be active or completed state.
     */
    protected Enumeration<MedicationOrderStatus> status;

    /**
     * The date (and perhaps time) when the prescription was stopped.
     */
    protected DateTimeType dateEnded;

    /**
     * The reason why the prescription was stopped, if it was.
     */
    protected CodeableConcept reasonEnded;

    /**
     * A link to a resource representing the person to whom the medication will be given.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (A link to a resource representing the person to whom the medication will be given.)
     */
    protected Patient patientTarget;

    /**
     * The healthcare professional responsible for authorizing the prescription.
     */
    protected Reference prescriber;

    /**
     * The actual object that is the target of the reference (The healthcare professional responsible for authorizing the prescription.)
     */
    protected Practitioner prescriberTarget;

    /**
     * A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (A link to a resource that identifies the particular occurrence of contact between patient and health care provider.)
     */
    protected Encounter encounterTarget;

    /**
     * Can be the reason or the indication for writing the prescription.
     */
    protected Type reason;

    /**
     * Extra information about the prescription that could not be conveyed by the other attributes.
     */
    protected StringType note;

    /**
     * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
     */
    protected Type medication;

    /**
     * Indicates how the medication is to be used by the patient.
     */
    protected List<MedicationOrderDosageInstructionComponent> dosageInstruction;

    /**
     * Indicates the specific details for the dispense or medication supply part of a medication order (also known as a Medication Prescription).  Note that this information is NOT always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
     */
    protected MedicationOrderDispenseRequestComponent dispenseRequest;

    /**
     * Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done.
     */
    protected MedicationOrderSubstitutionComponent substitution;

    /**
     * A link to a resource representing an earlier order or prescription that this order supersedes.
     */
    protected Reference priorPrescription;

    /**
     * The actual object that is the target of the reference (A link to a resource representing an earlier order or prescription that this order supersedes.)
     */
    protected MedicationOrder priorPrescriptionTarget;

    private static final long serialVersionUID = 619326051L;

    /*
   * Constructor
   */
    public MedicationOrder() {
        super();
    }

    /*
   * Constructor
   */
    public MedicationOrder(Type medication) {
        super();
        this.medication = medication;
    }

    /**
     * @return {@link #identifier} (External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system.)
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
     * @return {@link #identifier} (External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system.)
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
    public MedicationOrder addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #dateWritten} (The date (and perhaps time) when the prescription was written.). This is the underlying object with id, value and extensions. The accessor "getDateWritten" gives direct access to the value
     */
    public DateTimeType getDateWrittenElement() {
        if (this.dateWritten == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.dateWritten");
            else if (Configuration.doAutoCreate())
                // bb
                this.dateWritten = new DateTimeType();
        return this.dateWritten;
    }

    public boolean hasDateWrittenElement() {
        return this.dateWritten != null && !this.dateWritten.isEmpty();
    }

    public boolean hasDateWritten() {
        return this.dateWritten != null && !this.dateWritten.isEmpty();
    }

    /**
     * @param value {@link #dateWritten} (The date (and perhaps time) when the prescription was written.). This is the underlying object with id, value and extensions. The accessor "getDateWritten" gives direct access to the value
     */
    public MedicationOrder setDateWrittenElement(DateTimeType value) {
        this.dateWritten = value;
        return this;
    }

    /**
     * @return The date (and perhaps time) when the prescription was written.
     */
    public Date getDateWritten() {
        return this.dateWritten == null ? null : this.dateWritten.getValue();
    }

    /**
     * @param value The date (and perhaps time) when the prescription was written.
     */
    public MedicationOrder setDateWritten(Date value) {
        if (value == null)
            this.dateWritten = null;
        else {
            if (this.dateWritten == null)
                this.dateWritten = new DateTimeType();
            this.dateWritten.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #status} (A code specifying the state of the order.  Generally this will be active or completed state.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<MedicationOrderStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<MedicationOrderStatus>(new MedicationOrderStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (A code specifying the state of the order.  Generally this will be active or completed state.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public MedicationOrder setStatusElement(Enumeration<MedicationOrderStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return A code specifying the state of the order.  Generally this will be active or completed state.
     */
    public MedicationOrderStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value A code specifying the state of the order.  Generally this will be active or completed state.
     */
    public MedicationOrder setStatus(MedicationOrderStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<MedicationOrderStatus>(new MedicationOrderStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #dateEnded} (The date (and perhaps time) when the prescription was stopped.). This is the underlying object with id, value and extensions. The accessor "getDateEnded" gives direct access to the value
     */
    public DateTimeType getDateEndedElement() {
        if (this.dateEnded == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.dateEnded");
            else if (Configuration.doAutoCreate())
                // bb
                this.dateEnded = new DateTimeType();
        return this.dateEnded;
    }

    public boolean hasDateEndedElement() {
        return this.dateEnded != null && !this.dateEnded.isEmpty();
    }

    public boolean hasDateEnded() {
        return this.dateEnded != null && !this.dateEnded.isEmpty();
    }

    /**
     * @param value {@link #dateEnded} (The date (and perhaps time) when the prescription was stopped.). This is the underlying object with id, value and extensions. The accessor "getDateEnded" gives direct access to the value
     */
    public MedicationOrder setDateEndedElement(DateTimeType value) {
        this.dateEnded = value;
        return this;
    }

    /**
     * @return The date (and perhaps time) when the prescription was stopped.
     */
    public Date getDateEnded() {
        return this.dateEnded == null ? null : this.dateEnded.getValue();
    }

    /**
     * @param value The date (and perhaps time) when the prescription was stopped.
     */
    public MedicationOrder setDateEnded(Date value) {
        if (value == null)
            this.dateEnded = null;
        else {
            if (this.dateEnded == null)
                this.dateEnded = new DateTimeType();
            this.dateEnded.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #reasonEnded} (The reason why the prescription was stopped, if it was.)
     */
    public CodeableConcept getReasonEnded() {
        if (this.reasonEnded == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.reasonEnded");
            else if (Configuration.doAutoCreate())
                // cc
                this.reasonEnded = new CodeableConcept();
        return this.reasonEnded;
    }

    public boolean hasReasonEnded() {
        return this.reasonEnded != null && !this.reasonEnded.isEmpty();
    }

    /**
     * @param value {@link #reasonEnded} (The reason why the prescription was stopped, if it was.)
     */
    public MedicationOrder setReasonEnded(CodeableConcept value) {
        this.reasonEnded = value;
        return this;
    }

    /**
     * @return {@link #patient} (A link to a resource representing the person to whom the medication will be given.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (A link to a resource representing the person to whom the medication will be given.)
     */
    public MedicationOrder setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A link to a resource representing the person to whom the medication will be given.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A link to a resource representing the person to whom the medication will be given.)
     */
    public MedicationOrder setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #prescriber} (The healthcare professional responsible for authorizing the prescription.)
     */
    public Reference getPrescriber() {
        if (this.prescriber == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.prescriber");
            else if (Configuration.doAutoCreate())
                // cc
                this.prescriber = new Reference();
        return this.prescriber;
    }

    public boolean hasPrescriber() {
        return this.prescriber != null && !this.prescriber.isEmpty();
    }

    /**
     * @param value {@link #prescriber} (The healthcare professional responsible for authorizing the prescription.)
     */
    public MedicationOrder setPrescriber(Reference value) {
        this.prescriber = value;
        return this;
    }

    /**
     * @return {@link #prescriber} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The healthcare professional responsible for authorizing the prescription.)
     */
    public Practitioner getPrescriberTarget() {
        if (this.prescriberTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.prescriber");
            else if (Configuration.doAutoCreate())
                // aa
                this.prescriberTarget = new Practitioner();
        return this.prescriberTarget;
    }

    /**
     * @param value {@link #prescriber} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The healthcare professional responsible for authorizing the prescription.)
     */
    public MedicationOrder setPrescriberTarget(Practitioner value) {
        this.prescriberTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (A link to a resource that identifies the particular occurrence of contact between patient and health care provider.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (A link to a resource that identifies the particular occurrence of contact between patient and health care provider.)
     */
    public MedicationOrder setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A link to a resource that identifies the particular occurrence of contact between patient and health care provider.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A link to a resource that identifies the particular occurrence of contact between patient and health care provider.)
     */
    public MedicationOrder setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #reason} (Can be the reason or the indication for writing the prescription.)
     */
    public Type getReason() {
        return this.reason;
    }

    /**
     * @return {@link #reason} (Can be the reason or the indication for writing the prescription.)
     */
    public CodeableConcept getReasonCodeableConcept() throws FHIRException {
        if (!(this.reason instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.reason.getClass().getName() + " was encountered");
        return (CodeableConcept) this.reason;
    }

    public boolean hasReasonCodeableConcept() {
        return this.reason instanceof CodeableConcept;
    }

    /**
     * @return {@link #reason} (Can be the reason or the indication for writing the prescription.)
     */
    public Reference getReasonReference() throws FHIRException {
        if (!(this.reason instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.reason.getClass().getName() + " was encountered");
        return (Reference) this.reason;
    }

    public boolean hasReasonReference() {
        return this.reason instanceof Reference;
    }

    public boolean hasReason() {
        return this.reason != null && !this.reason.isEmpty();
    }

    /**
     * @param value {@link #reason} (Can be the reason or the indication for writing the prescription.)
     */
    public MedicationOrder setReason(Type value) {
        this.reason = value;
        return this;
    }

    /**
     * @return {@link #note} (Extra information about the prescription that could not be conveyed by the other attributes.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public StringType getNoteElement() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.note");
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
     * @param value {@link #note} (Extra information about the prescription that could not be conveyed by the other attributes.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public MedicationOrder setNoteElement(StringType value) {
        this.note = value;
        return this;
    }

    /**
     * @return Extra information about the prescription that could not be conveyed by the other attributes.
     */
    public String getNote() {
        return this.note == null ? null : this.note.getValue();
    }

    /**
     * @param value Extra information about the prescription that could not be conveyed by the other attributes.
     */
    public MedicationOrder setNote(String value) {
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
     * @return {@link #medication} (Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public Type getMedication() {
        return this.medication;
    }

    /**
     * @return {@link #medication} (Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.)
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
     * @return {@link #medication} (Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.)
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
     * @param value {@link #medication} (Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public MedicationOrder setMedication(Type value) {
        this.medication = value;
        return this;
    }

    /**
     * @return {@link #dosageInstruction} (Indicates how the medication is to be used by the patient.)
     */
    public List<MedicationOrderDosageInstructionComponent> getDosageInstruction() {
        if (this.dosageInstruction == null)
            this.dosageInstruction = new ArrayList<MedicationOrderDosageInstructionComponent>();
        return this.dosageInstruction;
    }

    public boolean hasDosageInstruction() {
        if (this.dosageInstruction == null)
            return false;
        for (MedicationOrderDosageInstructionComponent item : this.dosageInstruction) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #dosageInstruction} (Indicates how the medication is to be used by the patient.)
     */
    // syntactic sugar
    public MedicationOrderDosageInstructionComponent addDosageInstruction() {
        // 3
        MedicationOrderDosageInstructionComponent t = new MedicationOrderDosageInstructionComponent();
        if (this.dosageInstruction == null)
            this.dosageInstruction = new ArrayList<MedicationOrderDosageInstructionComponent>();
        this.dosageInstruction.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationOrder addDosageInstruction(MedicationOrderDosageInstructionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.dosageInstruction == null)
            this.dosageInstruction = new ArrayList<MedicationOrderDosageInstructionComponent>();
        this.dosageInstruction.add(t);
        return this;
    }

    /**
     * @return {@link #dispenseRequest} (Indicates the specific details for the dispense or medication supply part of a medication order (also known as a Medication Prescription).  Note that this information is NOT always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.)
     */
    public MedicationOrderDispenseRequestComponent getDispenseRequest() {
        if (this.dispenseRequest == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.dispenseRequest");
            else if (Configuration.doAutoCreate())
                // cc
                this.dispenseRequest = new MedicationOrderDispenseRequestComponent();
        return this.dispenseRequest;
    }

    public boolean hasDispenseRequest() {
        return this.dispenseRequest != null && !this.dispenseRequest.isEmpty();
    }

    /**
     * @param value {@link #dispenseRequest} (Indicates the specific details for the dispense or medication supply part of a medication order (also known as a Medication Prescription).  Note that this information is NOT always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.)
     */
    public MedicationOrder setDispenseRequest(MedicationOrderDispenseRequestComponent value) {
        this.dispenseRequest = value;
        return this;
    }

    /**
     * @return {@link #substitution} (Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done.)
     */
    public MedicationOrderSubstitutionComponent getSubstitution() {
        if (this.substitution == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.substitution");
            else if (Configuration.doAutoCreate())
                // cc
                this.substitution = new MedicationOrderSubstitutionComponent();
        return this.substitution;
    }

    public boolean hasSubstitution() {
        return this.substitution != null && !this.substitution.isEmpty();
    }

    /**
     * @param value {@link #substitution} (Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done.)
     */
    public MedicationOrder setSubstitution(MedicationOrderSubstitutionComponent value) {
        this.substitution = value;
        return this;
    }

    /**
     * @return {@link #priorPrescription} (A link to a resource representing an earlier order or prescription that this order supersedes.)
     */
    public Reference getPriorPrescription() {
        if (this.priorPrescription == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.priorPrescription");
            else if (Configuration.doAutoCreate())
                // cc
                this.priorPrescription = new Reference();
        return this.priorPrescription;
    }

    public boolean hasPriorPrescription() {
        return this.priorPrescription != null && !this.priorPrescription.isEmpty();
    }

    /**
     * @param value {@link #priorPrescription} (A link to a resource representing an earlier order or prescription that this order supersedes.)
     */
    public MedicationOrder setPriorPrescription(Reference value) {
        this.priorPrescription = value;
        return this;
    }

    /**
     * @return {@link #priorPrescription} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A link to a resource representing an earlier order or prescription that this order supersedes.)
     */
    public MedicationOrder getPriorPrescriptionTarget() {
        if (this.priorPrescriptionTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrder.priorPrescription");
            else if (Configuration.doAutoCreate())
                // aa
                this.priorPrescriptionTarget = new MedicationOrder();
        return this.priorPrescriptionTarget;
    }

    /**
     * @param value {@link #priorPrescription} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A link to a resource representing an earlier order or prescription that this order supersedes.)
     */
    public MedicationOrder setPriorPrescriptionTarget(MedicationOrder value) {
        this.priorPrescriptionTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("dateWritten", "dateTime", "The date (and perhaps time) when the prescription was written.", 0, java.lang.Integer.MAX_VALUE, dateWritten));
        childrenList.add(new Property("status", "code", "A code specifying the state of the order.  Generally this will be active or completed state.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("dateEnded", "dateTime", "The date (and perhaps time) when the prescription was stopped.", 0, java.lang.Integer.MAX_VALUE, dateEnded));
        childrenList.add(new Property("reasonEnded", "CodeableConcept", "The reason why the prescription was stopped, if it was.", 0, java.lang.Integer.MAX_VALUE, reasonEnded));
        childrenList.add(new Property("patient", "Reference(Patient)", "A link to a resource representing the person to whom the medication will be given.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("prescriber", "Reference(Practitioner)", "The healthcare professional responsible for authorizing the prescription.", 0, java.lang.Integer.MAX_VALUE, prescriber));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "A link to a resource that identifies the particular occurrence of contact between patient and health care provider.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("reason[x]", "CodeableConcept|Reference(Condition)", "Can be the reason or the indication for writing the prescription.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("note", "string", "Extra information about the prescription that could not be conveyed by the other attributes.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.", 0, java.lang.Integer.MAX_VALUE, medication));
        childrenList.add(new Property("dosageInstruction", "", "Indicates how the medication is to be used by the patient.", 0, java.lang.Integer.MAX_VALUE, dosageInstruction));
        childrenList.add(new Property("dispenseRequest", "", "Indicates the specific details for the dispense or medication supply part of a medication order (also known as a Medication Prescription).  Note that this information is NOT always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.", 0, java.lang.Integer.MAX_VALUE, dispenseRequest));
        childrenList.add(new Property("substitution", "", "Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done.", 0, java.lang.Integer.MAX_VALUE, substitution));
        childrenList.add(new Property("priorPrescription", "Reference(MedicationOrder)", "A link to a resource representing an earlier order or prescription that this order supersedes.", 0, java.lang.Integer.MAX_VALUE, priorPrescription));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("dateWritten"))
            // DateTimeType
            this.dateWritten = castToDateTime(value);
        else if (name.equals("status"))
            // Enumeration<MedicationOrderStatus>
            this.status = new MedicationOrderStatusEnumFactory().fromType(value);
        else if (name.equals("dateEnded"))
            // DateTimeType
            this.dateEnded = castToDateTime(value);
        else if (name.equals("reasonEnded"))
            // CodeableConcept
            this.reasonEnded = castToCodeableConcept(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("prescriber"))
            // Reference
            this.prescriber = castToReference(value);
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("reason[x]"))
            // Type
            this.reason = (Type) value;
        else if (name.equals("note"))
            // StringType
            this.note = castToString(value);
        else if (name.equals("medication[x]"))
            // Type
            this.medication = (Type) value;
        else if (name.equals("dosageInstruction"))
            this.getDosageInstruction().add((MedicationOrderDosageInstructionComponent) value);
        else if (name.equals("dispenseRequest"))
            // MedicationOrderDispenseRequestComponent
            this.dispenseRequest = (MedicationOrderDispenseRequestComponent) value;
        else if (name.equals("substitution"))
            // MedicationOrderSubstitutionComponent
            this.substitution = (MedicationOrderSubstitutionComponent) value;
        else if (name.equals("priorPrescription"))
            // Reference
            this.priorPrescription = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("dateWritten")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationOrder.dateWritten");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationOrder.status");
        } else if (name.equals("dateEnded")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationOrder.dateEnded");
        } else if (name.equals("reasonEnded")) {
            this.reasonEnded = new CodeableConcept();
            return this.reasonEnded;
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("prescriber")) {
            this.prescriber = new Reference();
            return this.prescriber;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("reasonCodeableConcept")) {
            this.reason = new CodeableConcept();
            return this.reason;
        } else if (name.equals("reasonReference")) {
            this.reason = new Reference();
            return this.reason;
        } else if (name.equals("note")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationOrder.note");
        } else if (name.equals("medicationCodeableConcept")) {
            this.medication = new CodeableConcept();
            return this.medication;
        } else if (name.equals("medicationReference")) {
            this.medication = new Reference();
            return this.medication;
        } else if (name.equals("dosageInstruction")) {
            return addDosageInstruction();
        } else if (name.equals("dispenseRequest")) {
            this.dispenseRequest = new MedicationOrderDispenseRequestComponent();
            return this.dispenseRequest;
        } else if (name.equals("substitution")) {
            this.substitution = new MedicationOrderSubstitutionComponent();
            return this.substitution;
        } else if (name.equals("priorPrescription")) {
            this.priorPrescription = new Reference();
            return this.priorPrescription;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "MedicationOrder";
    }

    public MedicationOrder copy() {
        MedicationOrder dst = new MedicationOrder();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.dateWritten = dateWritten == null ? null : dateWritten.copy();
        dst.status = status == null ? null : status.copy();
        dst.dateEnded = dateEnded == null ? null : dateEnded.copy();
        dst.reasonEnded = reasonEnded == null ? null : reasonEnded.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.prescriber = prescriber == null ? null : prescriber.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.reason = reason == null ? null : reason.copy();
        dst.note = note == null ? null : note.copy();
        dst.medication = medication == null ? null : medication.copy();
        if (dosageInstruction != null) {
            dst.dosageInstruction = new ArrayList<MedicationOrderDosageInstructionComponent>();
            for (MedicationOrderDosageInstructionComponent i : dosageInstruction) dst.dosageInstruction.add(i.copy());
        }
        ;
        dst.dispenseRequest = dispenseRequest == null ? null : dispenseRequest.copy();
        dst.substitution = substitution == null ? null : substitution.copy();
        dst.priorPrescription = priorPrescription == null ? null : priorPrescription.copy();
        return dst;
    }

    protected MedicationOrder typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationOrder))
            return false;
        MedicationOrder o = (MedicationOrder) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(dateWritten, o.dateWritten, true) && compareDeep(status, o.status, true) && compareDeep(dateEnded, o.dateEnded, true) && compareDeep(reasonEnded, o.reasonEnded, true) && compareDeep(patient, o.patient, true) && compareDeep(prescriber, o.prescriber, true) && compareDeep(encounter, o.encounter, true) && compareDeep(reason, o.reason, true) && compareDeep(note, o.note, true) && compareDeep(medication, o.medication, true) && compareDeep(dosageInstruction, o.dosageInstruction, true) && compareDeep(dispenseRequest, o.dispenseRequest, true) && compareDeep(substitution, o.substitution, true) && compareDeep(priorPrescription, o.priorPrescription, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationOrder))
            return false;
        MedicationOrder o = (MedicationOrder) other;
        return compareValues(dateWritten, o.dateWritten, true) && compareValues(status, o.status, true) && compareValues(dateEnded, o.dateEnded, true) && compareValues(note, o.note, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (dateWritten == null || dateWritten.isEmpty()) && (status == null || status.isEmpty()) && (dateEnded == null || dateEnded.isEmpty()) && (reasonEnded == null || reasonEnded.isEmpty()) && (patient == null || patient.isEmpty()) && (prescriber == null || prescriber.isEmpty()) && (encounter == null || encounter.isEmpty()) && (reason == null || reason.isEmpty()) && (note == null || note.isEmpty()) && (medication == null || medication.isEmpty()) && (dosageInstruction == null || dosageInstruction.isEmpty()) && (dispenseRequest == null || dispenseRequest.isEmpty()) && (substitution == null || substitution.isEmpty()) && (priorPrescription == null || priorPrescription.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.MedicationOrder;
    }

    public static final String SP_PRESCRIBER = "prescriber";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CODE = "code";

    public static final String SP_PATIENT = "patient";

    public static final String SP_DATEWRITTEN = "datewritten";

    public static final String SP_MEDICATION = "medication";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_STATUS = "status";
}
