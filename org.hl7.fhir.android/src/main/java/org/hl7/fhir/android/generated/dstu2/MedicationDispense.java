package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationDispenseEnum.MedicationDispenseStatus;
import org.hl7.fhir.android.generated.dstu2.MedicationDispenseEnum.MedicationDispenseStatusEnumFactory;

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
 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
 */
public class MedicationDispense extends DomainResource {

    /**
     * Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR.
     */
    protected Identifier identifier;

    /**
     * A code specifying the state of the set of dispense events.
     */
    protected Enumeration<MedicationDispenseStatus> status;

    /**
     * A link to a resource representing the person to whom the medication will be given.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (A link to a resource representing the person to whom the medication will be given.)
     */
    protected Patient patientTarget;

    /**
     * The individual responsible for dispensing the medication.
     */
    protected Reference dispenser;

    /**
     * The actual object that is the target of the reference (The individual responsible for dispensing the medication.)
     */
    protected Practitioner dispenserTarget;

    /**
     * Indicates the medication order that is being dispensed against.
     */
    protected List<Reference> authorizingPrescription;

    /**
     * The actual objects that are the target of the reference (Indicates the medication order that is being dispensed against.)
     */
    protected List<MedicationOrder> authorizingPrescriptionTarget;

    /**
     * Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
     */
    protected CodeableConcept type;

    /**
     * The amount of medication that has been dispensed. Includes unit of measure.
     */
    protected SimpleQuantity quantity;

    /**
     * The amount of medication expressed as a timing amount.
     */
    protected SimpleQuantity daysSupply;

    /**
     * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
     */
    protected Type medication;

    /**
     * The time when the dispensed product was packaged and reviewed.
     */
    protected DateTimeType whenPrepared;

    /**
     * The time the dispensed product was provided to the patient or their representative.
     */
    protected DateTimeType whenHandedOver;

    /**
     * Identification of the facility/location where the medication was shipped to, as part of the dispense event.
     */
    protected Reference destination;

    /**
     * The actual object that is the target of the reference (Identification of the facility/location where the medication was shipped to, as part of the dispense event.)
     */
    protected Location destinationTarget;

    /**
     * Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.
     */
    protected List<Reference> receiver;

    /**
     * The actual objects that are the target of the reference (Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.)
     */
    protected List<Resource> receiverTarget;

    /**
     * Extra information about the dispense that could not be conveyed in the other attributes.
     */
    protected StringType note;

    /**
     * Indicates how the medication is to be used by the patient.
     */
    protected List<MedicationDispenseDosageInstructionComponent> dosageInstruction;

    /**
     * Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.
     */
    protected MedicationDispenseSubstitutionComponent substitution;

    private static final long serialVersionUID = -2071218407L;

    /*
   * Constructor
   */
    public MedicationDispense() {
        super();
    }

    /*
   * Constructor
   */
    public MedicationDispense(Type medication) {
        super();
        this.medication = medication;
    }

    /**
     * @return {@link #identifier} (Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR.)
     */
    public MedicationDispense setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #status} (A code specifying the state of the set of dispense events.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<MedicationDispenseStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<MedicationDispenseStatus>(new MedicationDispenseStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (A code specifying the state of the set of dispense events.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public MedicationDispense setStatusElement(Enumeration<MedicationDispenseStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return A code specifying the state of the set of dispense events.
     */
    public MedicationDispenseStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value A code specifying the state of the set of dispense events.
     */
    public MedicationDispense setStatus(MedicationDispenseStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<MedicationDispenseStatus>(new MedicationDispenseStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #patient} (A link to a resource representing the person to whom the medication will be given.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.patient");
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
    public MedicationDispense setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A link to a resource representing the person to whom the medication will be given.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A link to a resource representing the person to whom the medication will be given.)
     */
    public MedicationDispense setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #dispenser} (The individual responsible for dispensing the medication.)
     */
    public Reference getDispenser() {
        if (this.dispenser == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.dispenser");
            else if (Configuration.doAutoCreate())
                // cc
                this.dispenser = new Reference();
        return this.dispenser;
    }

    public boolean hasDispenser() {
        return this.dispenser != null && !this.dispenser.isEmpty();
    }

    /**
     * @param value {@link #dispenser} (The individual responsible for dispensing the medication.)
     */
    public MedicationDispense setDispenser(Reference value) {
        this.dispenser = value;
        return this;
    }

    /**
     * @return {@link #dispenser} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The individual responsible for dispensing the medication.)
     */
    public Practitioner getDispenserTarget() {
        if (this.dispenserTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.dispenser");
            else if (Configuration.doAutoCreate())
                // aa
                this.dispenserTarget = new Practitioner();
        return this.dispenserTarget;
    }

    /**
     * @param value {@link #dispenser} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The individual responsible for dispensing the medication.)
     */
    public MedicationDispense setDispenserTarget(Practitioner value) {
        this.dispenserTarget = value;
        return this;
    }

    /**
     * @return {@link #authorizingPrescription} (Indicates the medication order that is being dispensed against.)
     */
    public List<Reference> getAuthorizingPrescription() {
        if (this.authorizingPrescription == null)
            this.authorizingPrescription = new ArrayList<Reference>();
        return this.authorizingPrescription;
    }

    public boolean hasAuthorizingPrescription() {
        if (this.authorizingPrescription == null)
            return false;
        for (Reference item : this.authorizingPrescription) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #authorizingPrescription} (Indicates the medication order that is being dispensed against.)
     */
    // syntactic sugar
    public Reference addAuthorizingPrescription() {
        // 3
        Reference t = new Reference();
        if (this.authorizingPrescription == null)
            this.authorizingPrescription = new ArrayList<Reference>();
        this.authorizingPrescription.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationDispense addAuthorizingPrescription(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.authorizingPrescription == null)
            this.authorizingPrescription = new ArrayList<Reference>();
        this.authorizingPrescription.add(t);
        return this;
    }

    /**
     * @return {@link #authorizingPrescription} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Indicates the medication order that is being dispensed against.)
     */
    public List<MedicationOrder> getAuthorizingPrescriptionTarget() {
        if (this.authorizingPrescriptionTarget == null)
            this.authorizingPrescriptionTarget = new ArrayList<MedicationOrder>();
        return this.authorizingPrescriptionTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #authorizingPrescription} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Indicates the medication order that is being dispensed against.)
     */
    public MedicationOrder addAuthorizingPrescriptionTarget() {
        MedicationOrder r = new MedicationOrder();
        if (this.authorizingPrescriptionTarget == null)
            this.authorizingPrescriptionTarget = new ArrayList<MedicationOrder>();
        this.authorizingPrescriptionTarget.add(r);
        return r;
    }

    /**
     * @return {@link #type} (Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.)
     */
    public MedicationDispense setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #quantity} (The amount of medication that has been dispensed. Includes unit of measure.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The amount of medication that has been dispensed. Includes unit of measure.)
     */
    public MedicationDispense setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #daysSupply} (The amount of medication expressed as a timing amount.)
     */
    public SimpleQuantity getDaysSupply() {
        if (this.daysSupply == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.daysSupply");
            else if (Configuration.doAutoCreate())
                // cc
                this.daysSupply = new SimpleQuantity();
        return this.daysSupply;
    }

    public boolean hasDaysSupply() {
        return this.daysSupply != null && !this.daysSupply.isEmpty();
    }

    /**
     * @param value {@link #daysSupply} (The amount of medication expressed as a timing amount.)
     */
    public MedicationDispense setDaysSupply(SimpleQuantity value) {
        this.daysSupply = value;
        return this;
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
    public MedicationDispense setMedication(Type value) {
        this.medication = value;
        return this;
    }

    /**
     * @return {@link #whenPrepared} (The time when the dispensed product was packaged and reviewed.). This is the underlying object with id, value and extensions. The accessor "getWhenPrepared" gives direct access to the value
     */
    public DateTimeType getWhenPreparedElement() {
        if (this.whenPrepared == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.whenPrepared");
            else if (Configuration.doAutoCreate())
                // bb
                this.whenPrepared = new DateTimeType();
        return this.whenPrepared;
    }

    public boolean hasWhenPreparedElement() {
        return this.whenPrepared != null && !this.whenPrepared.isEmpty();
    }

    public boolean hasWhenPrepared() {
        return this.whenPrepared != null && !this.whenPrepared.isEmpty();
    }

    /**
     * @param value {@link #whenPrepared} (The time when the dispensed product was packaged and reviewed.). This is the underlying object with id, value and extensions. The accessor "getWhenPrepared" gives direct access to the value
     */
    public MedicationDispense setWhenPreparedElement(DateTimeType value) {
        this.whenPrepared = value;
        return this;
    }

    /**
     * @return The time when the dispensed product was packaged and reviewed.
     */
    public Date getWhenPrepared() {
        return this.whenPrepared == null ? null : this.whenPrepared.getValue();
    }

    /**
     * @param value The time when the dispensed product was packaged and reviewed.
     */
    public MedicationDispense setWhenPrepared(Date value) {
        if (value == null)
            this.whenPrepared = null;
        else {
            if (this.whenPrepared == null)
                this.whenPrepared = new DateTimeType();
            this.whenPrepared.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #whenHandedOver} (The time the dispensed product was provided to the patient or their representative.). This is the underlying object with id, value and extensions. The accessor "getWhenHandedOver" gives direct access to the value
     */
    public DateTimeType getWhenHandedOverElement() {
        if (this.whenHandedOver == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.whenHandedOver");
            else if (Configuration.doAutoCreate())
                // bb
                this.whenHandedOver = new DateTimeType();
        return this.whenHandedOver;
    }

    public boolean hasWhenHandedOverElement() {
        return this.whenHandedOver != null && !this.whenHandedOver.isEmpty();
    }

    public boolean hasWhenHandedOver() {
        return this.whenHandedOver != null && !this.whenHandedOver.isEmpty();
    }

    /**
     * @param value {@link #whenHandedOver} (The time the dispensed product was provided to the patient or their representative.). This is the underlying object with id, value and extensions. The accessor "getWhenHandedOver" gives direct access to the value
     */
    public MedicationDispense setWhenHandedOverElement(DateTimeType value) {
        this.whenHandedOver = value;
        return this;
    }

    /**
     * @return The time the dispensed product was provided to the patient or their representative.
     */
    public Date getWhenHandedOver() {
        return this.whenHandedOver == null ? null : this.whenHandedOver.getValue();
    }

    /**
     * @param value The time the dispensed product was provided to the patient or their representative.
     */
    public MedicationDispense setWhenHandedOver(Date value) {
        if (value == null)
            this.whenHandedOver = null;
        else {
            if (this.whenHandedOver == null)
                this.whenHandedOver = new DateTimeType();
            this.whenHandedOver.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #destination} (Identification of the facility/location where the medication was shipped to, as part of the dispense event.)
     */
    public Reference getDestination() {
        if (this.destination == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.destination");
            else if (Configuration.doAutoCreate())
                // cc
                this.destination = new Reference();
        return this.destination;
    }

    public boolean hasDestination() {
        return this.destination != null && !this.destination.isEmpty();
    }

    /**
     * @param value {@link #destination} (Identification of the facility/location where the medication was shipped to, as part of the dispense event.)
     */
    public MedicationDispense setDestination(Reference value) {
        this.destination = value;
        return this;
    }

    /**
     * @return {@link #destination} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identification of the facility/location where the medication was shipped to, as part of the dispense event.)
     */
    public Location getDestinationTarget() {
        if (this.destinationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.destination");
            else if (Configuration.doAutoCreate())
                // aa
                this.destinationTarget = new Location();
        return this.destinationTarget;
    }

    /**
     * @param value {@link #destination} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identification of the facility/location where the medication was shipped to, as part of the dispense event.)
     */
    public MedicationDispense setDestinationTarget(Location value) {
        this.destinationTarget = value;
        return this;
    }

    /**
     * @return {@link #receiver} (Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.)
     */
    public List<Reference> getReceiver() {
        if (this.receiver == null)
            this.receiver = new ArrayList<Reference>();
        return this.receiver;
    }

    public boolean hasReceiver() {
        if (this.receiver == null)
            return false;
        for (Reference item : this.receiver) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #receiver} (Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.)
     */
    // syntactic sugar
    public Reference addReceiver() {
        // 3
        Reference t = new Reference();
        if (this.receiver == null)
            this.receiver = new ArrayList<Reference>();
        this.receiver.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationDispense addReceiver(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.receiver == null)
            this.receiver = new ArrayList<Reference>();
        this.receiver.add(t);
        return this;
    }

    /**
     * @return {@link #receiver} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.)
     */
    public List<Resource> getReceiverTarget() {
        if (this.receiverTarget == null)
            this.receiverTarget = new ArrayList<Resource>();
        return this.receiverTarget;
    }

    /**
     * @return {@link #note} (Extra information about the dispense that could not be conveyed in the other attributes.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public StringType getNoteElement() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.note");
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
     * @param value {@link #note} (Extra information about the dispense that could not be conveyed in the other attributes.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public MedicationDispense setNoteElement(StringType value) {
        this.note = value;
        return this;
    }

    /**
     * @return Extra information about the dispense that could not be conveyed in the other attributes.
     */
    public String getNote() {
        return this.note == null ? null : this.note.getValue();
    }

    /**
     * @param value Extra information about the dispense that could not be conveyed in the other attributes.
     */
    public MedicationDispense setNote(String value) {
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
     * @return {@link #dosageInstruction} (Indicates how the medication is to be used by the patient.)
     */
    public List<MedicationDispenseDosageInstructionComponent> getDosageInstruction() {
        if (this.dosageInstruction == null)
            this.dosageInstruction = new ArrayList<MedicationDispenseDosageInstructionComponent>();
        return this.dosageInstruction;
    }

    public boolean hasDosageInstruction() {
        if (this.dosageInstruction == null)
            return false;
        for (MedicationDispenseDosageInstructionComponent item : this.dosageInstruction) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #dosageInstruction} (Indicates how the medication is to be used by the patient.)
     */
    // syntactic sugar
    public MedicationDispenseDosageInstructionComponent addDosageInstruction() {
        // 3
        MedicationDispenseDosageInstructionComponent t = new MedicationDispenseDosageInstructionComponent();
        if (this.dosageInstruction == null)
            this.dosageInstruction = new ArrayList<MedicationDispenseDosageInstructionComponent>();
        this.dosageInstruction.add(t);
        return t;
    }

    // syntactic sugar
    public MedicationDispense addDosageInstruction(MedicationDispenseDosageInstructionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.dosageInstruction == null)
            this.dosageInstruction = new ArrayList<MedicationDispenseDosageInstructionComponent>();
        this.dosageInstruction.add(t);
        return this;
    }

    /**
     * @return {@link #substitution} (Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.)
     */
    public MedicationDispenseSubstitutionComponent getSubstitution() {
        if (this.substitution == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispense.substitution");
            else if (Configuration.doAutoCreate())
                // cc
                this.substitution = new MedicationDispenseSubstitutionComponent();
        return this.substitution;
    }

    public boolean hasSubstitution() {
        return this.substitution != null && !this.substitution.isEmpty();
    }

    /**
     * @param value {@link #substitution} (Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.)
     */
    public MedicationDispense setSubstitution(MedicationDispenseSubstitutionComponent value) {
        this.substitution = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "A code specifying the state of the set of dispense events.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("patient", "Reference(Patient)", "A link to a resource representing the person to whom the medication will be given.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("dispenser", "Reference(Practitioner)", "The individual responsible for dispensing the medication.", 0, java.lang.Integer.MAX_VALUE, dispenser));
        childrenList.add(new Property("authorizingPrescription", "Reference(MedicationOrder)", "Indicates the medication order that is being dispensed against.", 0, java.lang.Integer.MAX_VALUE, authorizingPrescription));
        childrenList.add(new Property("type", "CodeableConcept", "Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("quantity", "SimpleQuantity", "The amount of medication that has been dispensed. Includes unit of measure.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("daysSupply", "SimpleQuantity", "The amount of medication expressed as a timing amount.", 0, java.lang.Integer.MAX_VALUE, daysSupply));
        childrenList.add(new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.", 0, java.lang.Integer.MAX_VALUE, medication));
        childrenList.add(new Property("whenPrepared", "dateTime", "The time when the dispensed product was packaged and reviewed.", 0, java.lang.Integer.MAX_VALUE, whenPrepared));
        childrenList.add(new Property("whenHandedOver", "dateTime", "The time the dispensed product was provided to the patient or their representative.", 0, java.lang.Integer.MAX_VALUE, whenHandedOver));
        childrenList.add(new Property("destination", "Reference(Location)", "Identification of the facility/location where the medication was shipped to, as part of the dispense event.", 0, java.lang.Integer.MAX_VALUE, destination));
        childrenList.add(new Property("receiver", "Reference(Patient|Practitioner)", "Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.", 0, java.lang.Integer.MAX_VALUE, receiver));
        childrenList.add(new Property("note", "string", "Extra information about the dispense that could not be conveyed in the other attributes.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("dosageInstruction", "", "Indicates how the medication is to be used by the patient.", 0, java.lang.Integer.MAX_VALUE, dosageInstruction));
        childrenList.add(new Property("substitution", "", "Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.", 0, java.lang.Integer.MAX_VALUE, substitution));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("status"))
            // Enumeration<MedicationDispenseStatus>
            this.status = new MedicationDispenseStatusEnumFactory().fromType(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("dispenser"))
            // Reference
            this.dispenser = castToReference(value);
        else if (name.equals("authorizingPrescription"))
            this.getAuthorizingPrescription().add(castToReference(value));
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("quantity"))
            // SimpleQuantity
            this.quantity = castToSimpleQuantity(value);
        else if (name.equals("daysSupply"))
            // SimpleQuantity
            this.daysSupply = castToSimpleQuantity(value);
        else if (name.equals("medication[x]"))
            // Type
            this.medication = (Type) value;
        else if (name.equals("whenPrepared"))
            // DateTimeType
            this.whenPrepared = castToDateTime(value);
        else if (name.equals("whenHandedOver"))
            // DateTimeType
            this.whenHandedOver = castToDateTime(value);
        else if (name.equals("destination"))
            // Reference
            this.destination = castToReference(value);
        else if (name.equals("receiver"))
            this.getReceiver().add(castToReference(value));
        else if (name.equals("note"))
            // StringType
            this.note = castToString(value);
        else if (name.equals("dosageInstruction"))
            this.getDosageInstruction().add((MedicationDispenseDosageInstructionComponent) value);
        else if (name.equals("substitution"))
            // MedicationDispenseSubstitutionComponent
            this.substitution = (MedicationDispenseSubstitutionComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationDispense.status");
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("dispenser")) {
            this.dispenser = new Reference();
            return this.dispenser;
        } else if (name.equals("authorizingPrescription")) {
            return addAuthorizingPrescription();
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else if (name.equals("daysSupply")) {
            this.daysSupply = new SimpleQuantity();
            return this.daysSupply;
        } else if (name.equals("medicationCodeableConcept")) {
            this.medication = new CodeableConcept();
            return this.medication;
        } else if (name.equals("medicationReference")) {
            this.medication = new Reference();
            return this.medication;
        } else if (name.equals("whenPrepared")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationDispense.whenPrepared");
        } else if (name.equals("whenHandedOver")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationDispense.whenHandedOver");
        } else if (name.equals("destination")) {
            this.destination = new Reference();
            return this.destination;
        } else if (name.equals("receiver")) {
            return addReceiver();
        } else if (name.equals("note")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationDispense.note");
        } else if (name.equals("dosageInstruction")) {
            return addDosageInstruction();
        } else if (name.equals("substitution")) {
            this.substitution = new MedicationDispenseSubstitutionComponent();
            return this.substitution;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "MedicationDispense";
    }

    public MedicationDispense copy() {
        MedicationDispense dst = new MedicationDispense();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.status = status == null ? null : status.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.dispenser = dispenser == null ? null : dispenser.copy();
        if (authorizingPrescription != null) {
            dst.authorizingPrescription = new ArrayList<Reference>();
            for (Reference i : authorizingPrescription) dst.authorizingPrescription.add(i.copy());
        }
        ;
        dst.type = type == null ? null : type.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.daysSupply = daysSupply == null ? null : daysSupply.copy();
        dst.medication = medication == null ? null : medication.copy();
        dst.whenPrepared = whenPrepared == null ? null : whenPrepared.copy();
        dst.whenHandedOver = whenHandedOver == null ? null : whenHandedOver.copy();
        dst.destination = destination == null ? null : destination.copy();
        if (receiver != null) {
            dst.receiver = new ArrayList<Reference>();
            for (Reference i : receiver) dst.receiver.add(i.copy());
        }
        ;
        dst.note = note == null ? null : note.copy();
        if (dosageInstruction != null) {
            dst.dosageInstruction = new ArrayList<MedicationDispenseDosageInstructionComponent>();
            for (MedicationDispenseDosageInstructionComponent i : dosageInstruction) dst.dosageInstruction.add(i.copy());
        }
        ;
        dst.substitution = substitution == null ? null : substitution.copy();
        return dst;
    }

    protected MedicationDispense typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationDispense))
            return false;
        MedicationDispense o = (MedicationDispense) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(patient, o.patient, true) && compareDeep(dispenser, o.dispenser, true) && compareDeep(authorizingPrescription, o.authorizingPrescription, true) && compareDeep(type, o.type, true) && compareDeep(quantity, o.quantity, true) && compareDeep(daysSupply, o.daysSupply, true) && compareDeep(medication, o.medication, true) && compareDeep(whenPrepared, o.whenPrepared, true) && compareDeep(whenHandedOver, o.whenHandedOver, true) && compareDeep(destination, o.destination, true) && compareDeep(receiver, o.receiver, true) && compareDeep(note, o.note, true) && compareDeep(dosageInstruction, o.dosageInstruction, true) && compareDeep(substitution, o.substitution, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationDispense))
            return false;
        MedicationDispense o = (MedicationDispense) other;
        return compareValues(status, o.status, true) && compareValues(whenPrepared, o.whenPrepared, true) && compareValues(whenHandedOver, o.whenHandedOver, true) && compareValues(note, o.note, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (patient == null || patient.isEmpty()) && (dispenser == null || dispenser.isEmpty()) && (authorizingPrescription == null || authorizingPrescription.isEmpty()) && (type == null || type.isEmpty()) && (quantity == null || quantity.isEmpty()) && (daysSupply == null || daysSupply.isEmpty()) && (medication == null || medication.isEmpty()) && (whenPrepared == null || whenPrepared.isEmpty()) && (whenHandedOver == null || whenHandedOver.isEmpty()) && (destination == null || destination.isEmpty()) && (receiver == null || receiver.isEmpty()) && (note == null || note.isEmpty()) && (dosageInstruction == null || dosageInstruction.isEmpty()) && (substitution == null || substitution.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.MedicationDispense;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CODE = "code";

    public static final String SP_RECEIVER = "receiver";

    public static final String SP_DESTINATION = "destination";

    public static final String SP_MEDICATION = "medication";

    public static final String SP_RESPONSIBLEPARTY = "responsibleparty";

    public static final String SP_TYPE = "type";

    public static final String SP_WHENHANDEDOVER = "whenhandedover";

    public static final String SP_WHENPREPARED = "whenprepared";

    public static final String SP_DISPENSER = "dispenser";

    public static final String SP_PRESCRIPTION = "prescription";

    public static final String SP_PATIENT = "patient";

    public static final String SP_STATUS = "status";
}
