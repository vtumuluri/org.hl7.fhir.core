package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionEyes;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionEyesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionBase;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionBaseEnumFactory;

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
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 */
public class VisionPrescription extends DomainResource {

    /**
     * Business identifier which may be used by other parties to reference or identify the prescription.
     */
    protected List<Identifier> identifier;

    /**
     * The date (and perhaps time) when the prescription was written.
     */
    protected DateTimeType dateWritten;

    /**
     * A link to a resource representing the person to whom the vision products will be supplied.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (A link to a resource representing the person to whom the vision products will be supplied.)
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
     * Deals with details of the dispense part of the supply specification.
     */
    protected List<VisionPrescriptionDispenseComponent> dispense;

    private static final long serialVersionUID = -1108276057L;

    /*
   * Constructor
   */
    public VisionPrescription() {
        super();
    }

    /**
     * @return {@link #identifier} (Business identifier which may be used by other parties to reference or identify the prescription.)
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
     * @return {@link #identifier} (Business identifier which may be used by other parties to reference or identify the prescription.)
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
    public VisionPrescription addIdentifier(Identifier t) {
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
                throw new Error("Attempt to auto-create VisionPrescription.dateWritten");
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
    public VisionPrescription setDateWrittenElement(DateTimeType value) {
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
    public VisionPrescription setDateWritten(Date value) {
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
     * @return {@link #patient} (A link to a resource representing the person to whom the vision products will be supplied.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescription.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (A link to a resource representing the person to whom the vision products will be supplied.)
     */
    public VisionPrescription setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A link to a resource representing the person to whom the vision products will be supplied.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescription.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A link to a resource representing the person to whom the vision products will be supplied.)
     */
    public VisionPrescription setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #prescriber} (The healthcare professional responsible for authorizing the prescription.)
     */
    public Reference getPrescriber() {
        if (this.prescriber == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescription.prescriber");
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
    public VisionPrescription setPrescriber(Reference value) {
        this.prescriber = value;
        return this;
    }

    /**
     * @return {@link #prescriber} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The healthcare professional responsible for authorizing the prescription.)
     */
    public Practitioner getPrescriberTarget() {
        if (this.prescriberTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescription.prescriber");
            else if (Configuration.doAutoCreate())
                // aa
                this.prescriberTarget = new Practitioner();
        return this.prescriberTarget;
    }

    /**
     * @param value {@link #prescriber} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The healthcare professional responsible for authorizing the prescription.)
     */
    public VisionPrescription setPrescriberTarget(Practitioner value) {
        this.prescriberTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (A link to a resource that identifies the particular occurrence of contact between patient and health care provider.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescription.encounter");
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
    public VisionPrescription setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A link to a resource that identifies the particular occurrence of contact between patient and health care provider.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescription.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A link to a resource that identifies the particular occurrence of contact between patient and health care provider.)
     */
    public VisionPrescription setEncounterTarget(Encounter value) {
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
    public VisionPrescription setReason(Type value) {
        this.reason = value;
        return this;
    }

    /**
     * @return {@link #dispense} (Deals with details of the dispense part of the supply specification.)
     */
    public List<VisionPrescriptionDispenseComponent> getDispense() {
        if (this.dispense == null)
            this.dispense = new ArrayList<VisionPrescriptionDispenseComponent>();
        return this.dispense;
    }

    public boolean hasDispense() {
        if (this.dispense == null)
            return false;
        for (VisionPrescriptionDispenseComponent item : this.dispense) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #dispense} (Deals with details of the dispense part of the supply specification.)
     */
    // syntactic sugar
    public VisionPrescriptionDispenseComponent addDispense() {
        // 3
        VisionPrescriptionDispenseComponent t = new VisionPrescriptionDispenseComponent();
        if (this.dispense == null)
            this.dispense = new ArrayList<VisionPrescriptionDispenseComponent>();
        this.dispense.add(t);
        return t;
    }

    // syntactic sugar
    public VisionPrescription addDispense(VisionPrescriptionDispenseComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.dispense == null)
            this.dispense = new ArrayList<VisionPrescriptionDispenseComponent>();
        this.dispense.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Business identifier which may be used by other parties to reference or identify the prescription.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("dateWritten", "dateTime", "The date (and perhaps time) when the prescription was written.", 0, java.lang.Integer.MAX_VALUE, dateWritten));
        childrenList.add(new Property("patient", "Reference(Patient)", "A link to a resource representing the person to whom the vision products will be supplied.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("prescriber", "Reference(Practitioner)", "The healthcare professional responsible for authorizing the prescription.", 0, java.lang.Integer.MAX_VALUE, prescriber));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "A link to a resource that identifies the particular occurrence of contact between patient and health care provider.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("reason[x]", "CodeableConcept|Reference(Condition)", "Can be the reason or the indication for writing the prescription.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("dispense", "", "Deals with details of the dispense part of the supply specification.", 0, java.lang.Integer.MAX_VALUE, dispense));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("dateWritten"))
            // DateTimeType
            this.dateWritten = castToDateTime(value);
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
        else if (name.equals("dispense"))
            this.getDispense().add((VisionPrescriptionDispenseComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("dateWritten")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.dateWritten");
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
        } else if (name.equals("dispense")) {
            return addDispense();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "VisionPrescription";
    }

    public VisionPrescription copy() {
        VisionPrescription dst = new VisionPrescription();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.dateWritten = dateWritten == null ? null : dateWritten.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.prescriber = prescriber == null ? null : prescriber.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.reason = reason == null ? null : reason.copy();
        if (dispense != null) {
            dst.dispense = new ArrayList<VisionPrescriptionDispenseComponent>();
            for (VisionPrescriptionDispenseComponent i : dispense) dst.dispense.add(i.copy());
        }
        ;
        return dst;
    }

    protected VisionPrescription typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof VisionPrescription))
            return false;
        VisionPrescription o = (VisionPrescription) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(dateWritten, o.dateWritten, true) && compareDeep(patient, o.patient, true) && compareDeep(prescriber, o.prescriber, true) && compareDeep(encounter, o.encounter, true) && compareDeep(reason, o.reason, true) && compareDeep(dispense, o.dispense, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof VisionPrescription))
            return false;
        VisionPrescription o = (VisionPrescription) other;
        return compareValues(dateWritten, o.dateWritten, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (dateWritten == null || dateWritten.isEmpty()) && (patient == null || patient.isEmpty()) && (prescriber == null || prescriber.isEmpty()) && (encounter == null || encounter.isEmpty()) && (reason == null || reason.isEmpty()) && (dispense == null || dispense.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.VisionPrescription;
    }

    public static final String SP_PRESCRIBER = "prescriber";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PATIENT = "patient";

    public static final String SP_DATEWRITTEN = "datewritten";

    public static final String SP_ENCOUNTER = "encounter";
}
