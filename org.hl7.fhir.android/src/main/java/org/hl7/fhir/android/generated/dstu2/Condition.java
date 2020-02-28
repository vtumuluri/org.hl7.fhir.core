package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConditionEnum.ConditionVerificationStatus;
import org.hl7.fhir.android.generated.dstu2.ConditionEnum.ConditionVerificationStatusEnumFactory;

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
 * Use to record detailed information about conditions, problems or diagnoses recognized by a clinician. There are many uses including: recording a diagnosis during an encounter; populating a problem list or a summary statement, such as a discharge summary.
 */
public class Condition extends DomainResource {

    /**
     * This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    protected List<Identifier> identifier;

    /**
     * Indicates the patient who the condition record is associated with.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (Indicates the patient who the condition record is associated with.)
     */
    protected Patient patientTarget;

    /**
     * Encounter during which the condition was first asserted.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (Encounter during which the condition was first asserted.)
     */
    protected Encounter encounterTarget;

    /**
     * Individual who is making the condition statement.
     */
    protected Reference asserter;

    /**
     * The actual object that is the target of the reference (Individual who is making the condition statement.)
     */
    protected Resource asserterTarget;

    /**
     * A date, when  the Condition statement was documented.
     */
    protected DateType dateRecorded;

    /**
     * Identification of the condition, problem or diagnosis.
     */
    protected CodeableConcept code;

    /**
     * A category assigned to the condition.
     */
    protected CodeableConcept category;

    /**
     * The clinical status of the condition.
     */
    protected CodeType clinicalStatus;

    /**
     * The verification status to support the clinical status of the condition.
     */
    protected Enumeration<ConditionVerificationStatus> verificationStatus;

    /**
     * A subjective assessment of the severity of the condition as evaluated by the clinician.
     */
    protected CodeableConcept severity;

    /**
     * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
     */
    protected Type onset;

    /**
     * The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
     */
    protected Type abatement;

    /**
     * Clinical stage or grade of a condition. May include formal severity assessments.
     */
    protected ConditionStageComponent stage;

    /**
     * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.
     */
    protected List<ConditionEvidenceComponent> evidence;

    /**
     * The anatomical location where this condition manifests itself.
     */
    protected List<CodeableConcept> bodySite;

    /**
     * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
     */
    protected StringType notes;

    private static final long serialVersionUID = -341227215L;

    /*
   * Constructor
   */
    public Condition() {
        super();
    }

    /*
   * Constructor
   */
    public Condition(Reference patient, CodeableConcept code, Enumeration<ConditionVerificationStatus> verificationStatus) {
        super();
        this.patient = patient;
        this.code = code;
        this.verificationStatus = verificationStatus;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
     * @return {@link #identifier} (This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
    public Condition addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #patient} (Indicates the patient who the condition record is associated with.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (Indicates the patient who the condition record is associated with.)
     */
    public Condition setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Indicates the patient who the condition record is associated with.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Indicates the patient who the condition record is associated with.)
     */
    public Condition setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (Encounter during which the condition was first asserted.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (Encounter during which the condition was first asserted.)
     */
    public Condition setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Encounter during which the condition was first asserted.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Encounter during which the condition was first asserted.)
     */
    public Condition setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #asserter} (Individual who is making the condition statement.)
     */
    public Reference getAsserter() {
        if (this.asserter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.asserter");
            else if (Configuration.doAutoCreate())
                // cc
                this.asserter = new Reference();
        return this.asserter;
    }

    public boolean hasAsserter() {
        return this.asserter != null && !this.asserter.isEmpty();
    }

    /**
     * @param value {@link #asserter} (Individual who is making the condition statement.)
     */
    public Condition setAsserter(Reference value) {
        this.asserter = value;
        return this;
    }

    /**
     * @return {@link #asserter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Individual who is making the condition statement.)
     */
    public Resource getAsserterTarget() {
        return this.asserterTarget;
    }

    /**
     * @param value {@link #asserter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Individual who is making the condition statement.)
     */
    public Condition setAsserterTarget(Resource value) {
        this.asserterTarget = value;
        return this;
    }

    /**
     * @return {@link #dateRecorded} (A date, when  the Condition statement was documented.). This is the underlying object with id, value and extensions. The accessor "getDateRecorded" gives direct access to the value
     */
    public DateType getDateRecordedElement() {
        if (this.dateRecorded == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.dateRecorded");
            else if (Configuration.doAutoCreate())
                // bb
                this.dateRecorded = new DateType();
        return this.dateRecorded;
    }

    public boolean hasDateRecordedElement() {
        return this.dateRecorded != null && !this.dateRecorded.isEmpty();
    }

    public boolean hasDateRecorded() {
        return this.dateRecorded != null && !this.dateRecorded.isEmpty();
    }

    /**
     * @param value {@link #dateRecorded} (A date, when  the Condition statement was documented.). This is the underlying object with id, value and extensions. The accessor "getDateRecorded" gives direct access to the value
     */
    public Condition setDateRecordedElement(DateType value) {
        this.dateRecorded = value;
        return this;
    }

    /**
     * @return A date, when  the Condition statement was documented.
     */
    public Date getDateRecorded() {
        return this.dateRecorded == null ? null : this.dateRecorded.getValue();
    }

    /**
     * @param value A date, when  the Condition statement was documented.
     */
    public Condition setDateRecorded(Date value) {
        if (value == null)
            this.dateRecorded = null;
        else {
            if (this.dateRecorded == null)
                this.dateRecorded = new DateType();
            this.dateRecorded.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #code} (Identification of the condition, problem or diagnosis.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Identification of the condition, problem or diagnosis.)
     */
    public Condition setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #category} (A category assigned to the condition.)
     */
    public CodeableConcept getCategory() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.category");
            else if (Configuration.doAutoCreate())
                // cc
                this.category = new CodeableConcept();
        return this.category;
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (A category assigned to the condition.)
     */
    public Condition setCategory(CodeableConcept value) {
        this.category = value;
        return this;
    }

    /**
     * @return {@link #clinicalStatus} (The clinical status of the condition.). This is the underlying object with id, value and extensions. The accessor "getClinicalStatus" gives direct access to the value
     */
    public CodeType getClinicalStatusElement() {
        if (this.clinicalStatus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.clinicalStatus");
            else if (Configuration.doAutoCreate())
                // bb
                this.clinicalStatus = new CodeType();
        return this.clinicalStatus;
    }

    public boolean hasClinicalStatusElement() {
        return this.clinicalStatus != null && !this.clinicalStatus.isEmpty();
    }

    public boolean hasClinicalStatus() {
        return this.clinicalStatus != null && !this.clinicalStatus.isEmpty();
    }

    /**
     * @param value {@link #clinicalStatus} (The clinical status of the condition.). This is the underlying object with id, value and extensions. The accessor "getClinicalStatus" gives direct access to the value
     */
    public Condition setClinicalStatusElement(CodeType value) {
        this.clinicalStatus = value;
        return this;
    }

    /**
     * @return The clinical status of the condition.
     */
    public String getClinicalStatus() {
        return this.clinicalStatus == null ? null : this.clinicalStatus.getValue();
    }

    /**
     * @param value The clinical status of the condition.
     */
    public Condition setClinicalStatus(String value) {
        if (Utilities.noString(value))
            this.clinicalStatus = null;
        else {
            if (this.clinicalStatus == null)
                this.clinicalStatus = new CodeType();
            this.clinicalStatus.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #verificationStatus} (The verification status to support the clinical status of the condition.). This is the underlying object with id, value and extensions. The accessor "getVerificationStatus" gives direct access to the value
     */
    public Enumeration<ConditionVerificationStatus> getVerificationStatusElement() {
        if (this.verificationStatus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.verificationStatus");
            else if (Configuration.doAutoCreate())
                // bb
                this.verificationStatus = new Enumeration<ConditionVerificationStatus>(new ConditionVerificationStatusEnumFactory());
        return this.verificationStatus;
    }

    public boolean hasVerificationStatusElement() {
        return this.verificationStatus != null && !this.verificationStatus.isEmpty();
    }

    public boolean hasVerificationStatus() {
        return this.verificationStatus != null && !this.verificationStatus.isEmpty();
    }

    /**
     * @param value {@link #verificationStatus} (The verification status to support the clinical status of the condition.). This is the underlying object with id, value and extensions. The accessor "getVerificationStatus" gives direct access to the value
     */
    public Condition setVerificationStatusElement(Enumeration<ConditionVerificationStatus> value) {
        this.verificationStatus = value;
        return this;
    }

    /**
     * @return The verification status to support the clinical status of the condition.
     */
    public ConditionVerificationStatus getVerificationStatus() {
        return this.verificationStatus == null ? null : this.verificationStatus.getValue();
    }

    /**
     * @param value The verification status to support the clinical status of the condition.
     */
    public Condition setVerificationStatus(ConditionVerificationStatus value) {
        if (this.verificationStatus == null)
            this.verificationStatus = new Enumeration<ConditionVerificationStatus>(new ConditionVerificationStatusEnumFactory());
        this.verificationStatus.setValue(value);
        return this;
    }

    /**
     * @return {@link #severity} (A subjective assessment of the severity of the condition as evaluated by the clinician.)
     */
    public CodeableConcept getSeverity() {
        if (this.severity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.severity");
            else if (Configuration.doAutoCreate())
                // cc
                this.severity = new CodeableConcept();
        return this.severity;
    }

    public boolean hasSeverity() {
        return this.severity != null && !this.severity.isEmpty();
    }

    /**
     * @param value {@link #severity} (A subjective assessment of the severity of the condition as evaluated by the clinician.)
     */
    public Condition setSeverity(CodeableConcept value) {
        this.severity = value;
        return this;
    }

    /**
     * @return {@link #onset} (Estimated or actual date or date-time  the condition began, in the opinion of the clinician.)
     */
    public Type getOnset() {
        return this.onset;
    }

    /**
     * @return {@link #onset} (Estimated or actual date or date-time  the condition began, in the opinion of the clinician.)
     */
    public DateTimeType getOnsetDateTimeType() throws FHIRException {
        if (!(this.onset instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.onset.getClass().getName() + " was encountered");
        return (DateTimeType) this.onset;
    }

    public boolean hasOnsetDateTimeType() {
        return this.onset instanceof DateTimeType;
    }

    /**
     * @return {@link #onset} (Estimated or actual date or date-time  the condition began, in the opinion of the clinician.)
     */
    public Age getOnsetAge() throws FHIRException {
        if (!(this.onset instanceof Age))
            throw new FHIRException("Type mismatch: the type Age was expected, but " + this.onset.getClass().getName() + " was encountered");
        return (Age) this.onset;
    }

    public boolean hasOnsetAge() {
        return this.onset instanceof Age;
    }

    /**
     * @return {@link #onset} (Estimated or actual date or date-time  the condition began, in the opinion of the clinician.)
     */
    public Period getOnsetPeriod() throws FHIRException {
        if (!(this.onset instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.onset.getClass().getName() + " was encountered");
        return (Period) this.onset;
    }

    public boolean hasOnsetPeriod() {
        return this.onset instanceof Period;
    }

    /**
     * @return {@link #onset} (Estimated or actual date or date-time  the condition began, in the opinion of the clinician.)
     */
    public Range getOnsetRange() throws FHIRException {
        if (!(this.onset instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.onset.getClass().getName() + " was encountered");
        return (Range) this.onset;
    }

    public boolean hasOnsetRange() {
        return this.onset instanceof Range;
    }

    /**
     * @return {@link #onset} (Estimated or actual date or date-time  the condition began, in the opinion of the clinician.)
     */
    public StringType getOnsetStringType() throws FHIRException {
        if (!(this.onset instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.onset.getClass().getName() + " was encountered");
        return (StringType) this.onset;
    }

    public boolean hasOnsetStringType() {
        return this.onset instanceof StringType;
    }

    public boolean hasOnset() {
        return this.onset != null && !this.onset.isEmpty();
    }

    /**
     * @param value {@link #onset} (Estimated or actual date or date-time  the condition began, in the opinion of the clinician.)
     */
    public Condition setOnset(Type value) {
        this.onset = value;
        return this;
    }

    /**
     * @return {@link #abatement} (The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.)
     */
    public Type getAbatement() {
        return this.abatement;
    }

    /**
     * @return {@link #abatement} (The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.)
     */
    public DateTimeType getAbatementDateTimeType() throws FHIRException {
        if (!(this.abatement instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.abatement.getClass().getName() + " was encountered");
        return (DateTimeType) this.abatement;
    }

    public boolean hasAbatementDateTimeType() {
        return this.abatement instanceof DateTimeType;
    }

    /**
     * @return {@link #abatement} (The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.)
     */
    public Age getAbatementAge() throws FHIRException {
        if (!(this.abatement instanceof Age))
            throw new FHIRException("Type mismatch: the type Age was expected, but " + this.abatement.getClass().getName() + " was encountered");
        return (Age) this.abatement;
    }

    public boolean hasAbatementAge() {
        return this.abatement instanceof Age;
    }

    /**
     * @return {@link #abatement} (The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.)
     */
    public BooleanType getAbatementBooleanType() throws FHIRException {
        if (!(this.abatement instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but " + this.abatement.getClass().getName() + " was encountered");
        return (BooleanType) this.abatement;
    }

    public boolean hasAbatementBooleanType() {
        return this.abatement instanceof BooleanType;
    }

    /**
     * @return {@link #abatement} (The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.)
     */
    public Period getAbatementPeriod() throws FHIRException {
        if (!(this.abatement instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.abatement.getClass().getName() + " was encountered");
        return (Period) this.abatement;
    }

    public boolean hasAbatementPeriod() {
        return this.abatement instanceof Period;
    }

    /**
     * @return {@link #abatement} (The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.)
     */
    public Range getAbatementRange() throws FHIRException {
        if (!(this.abatement instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.abatement.getClass().getName() + " was encountered");
        return (Range) this.abatement;
    }

    public boolean hasAbatementRange() {
        return this.abatement instanceof Range;
    }

    /**
     * @return {@link #abatement} (The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.)
     */
    public StringType getAbatementStringType() throws FHIRException {
        if (!(this.abatement instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.abatement.getClass().getName() + " was encountered");
        return (StringType) this.abatement;
    }

    public boolean hasAbatementStringType() {
        return this.abatement instanceof StringType;
    }

    public boolean hasAbatement() {
        return this.abatement != null && !this.abatement.isEmpty();
    }

    /**
     * @param value {@link #abatement} (The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.)
     */
    public Condition setAbatement(Type value) {
        this.abatement = value;
        return this;
    }

    /**
     * @return {@link #stage} (Clinical stage or grade of a condition. May include formal severity assessments.)
     */
    public ConditionStageComponent getStage() {
        if (this.stage == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.stage");
            else if (Configuration.doAutoCreate())
                // cc
                this.stage = new ConditionStageComponent();
        return this.stage;
    }

    public boolean hasStage() {
        return this.stage != null && !this.stage.isEmpty();
    }

    /**
     * @param value {@link #stage} (Clinical stage or grade of a condition. May include formal severity assessments.)
     */
    public Condition setStage(ConditionStageComponent value) {
        this.stage = value;
        return this;
    }

    /**
     * @return {@link #evidence} (Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.)
     */
    public List<ConditionEvidenceComponent> getEvidence() {
        if (this.evidence == null)
            this.evidence = new ArrayList<ConditionEvidenceComponent>();
        return this.evidence;
    }

    public boolean hasEvidence() {
        if (this.evidence == null)
            return false;
        for (ConditionEvidenceComponent item : this.evidence) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #evidence} (Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.)
     */
    // syntactic sugar
    public ConditionEvidenceComponent addEvidence() {
        // 3
        ConditionEvidenceComponent t = new ConditionEvidenceComponent();
        if (this.evidence == null)
            this.evidence = new ArrayList<ConditionEvidenceComponent>();
        this.evidence.add(t);
        return t;
    }

    // syntactic sugar
    public Condition addEvidence(ConditionEvidenceComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.evidence == null)
            this.evidence = new ArrayList<ConditionEvidenceComponent>();
        this.evidence.add(t);
        return this;
    }

    /**
     * @return {@link #bodySite} (The anatomical location where this condition manifests itself.)
     */
    public List<CodeableConcept> getBodySite() {
        if (this.bodySite == null)
            this.bodySite = new ArrayList<CodeableConcept>();
        return this.bodySite;
    }

    public boolean hasBodySite() {
        if (this.bodySite == null)
            return false;
        for (CodeableConcept item : this.bodySite) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #bodySite} (The anatomical location where this condition manifests itself.)
     */
    // syntactic sugar
    public CodeableConcept addBodySite() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.bodySite == null)
            this.bodySite = new ArrayList<CodeableConcept>();
        this.bodySite.add(t);
        return t;
    }

    // syntactic sugar
    public Condition addBodySite(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.bodySite == null)
            this.bodySite = new ArrayList<CodeableConcept>();
        this.bodySite.add(t);
        return this;
    }

    /**
     * @return {@link #notes} (Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.). This is the underlying object with id, value and extensions. The accessor "getNotes" gives direct access to the value
     */
    public StringType getNotesElement() {
        if (this.notes == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Condition.notes");
            else if (Configuration.doAutoCreate())
                // bb
                this.notes = new StringType();
        return this.notes;
    }

    public boolean hasNotesElement() {
        return this.notes != null && !this.notes.isEmpty();
    }

    public boolean hasNotes() {
        return this.notes != null && !this.notes.isEmpty();
    }

    /**
     * @param value {@link #notes} (Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.). This is the underlying object with id, value and extensions. The accessor "getNotes" gives direct access to the value
     */
    public Condition setNotesElement(StringType value) {
        this.notes = value;
        return this;
    }

    /**
     * @return Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
     */
    public String getNotes() {
        return this.notes == null ? null : this.notes.getValue();
    }

    /**
     * @param value Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
     */
    public Condition setNotes(String value) {
        if (Utilities.noString(value))
            this.notes = null;
        else {
            if (this.notes == null)
                this.notes = new StringType();
            this.notes.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("patient", "Reference(Patient)", "Indicates the patient who the condition record is associated with.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "Encounter during which the condition was first asserted.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("asserter", "Reference(Practitioner|Patient)", "Individual who is making the condition statement.", 0, java.lang.Integer.MAX_VALUE, asserter));
        childrenList.add(new Property("dateRecorded", "date", "A date, when  the Condition statement was documented.", 0, java.lang.Integer.MAX_VALUE, dateRecorded));
        childrenList.add(new Property("code", "CodeableConcept", "Identification of the condition, problem or diagnosis.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("category", "CodeableConcept", "A category assigned to the condition.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("clinicalStatus", "code", "The clinical status of the condition.", 0, java.lang.Integer.MAX_VALUE, clinicalStatus));
        childrenList.add(new Property("verificationStatus", "code", "The verification status to support the clinical status of the condition.", 0, java.lang.Integer.MAX_VALUE, verificationStatus));
        childrenList.add(new Property("severity", "CodeableConcept", "A subjective assessment of the severity of the condition as evaluated by the clinician.", 0, java.lang.Integer.MAX_VALUE, severity));
        childrenList.add(new Property("onset[x]", "dateTime|Age|Period|Range|string", "Estimated or actual date or date-time  the condition began, in the opinion of the clinician.", 0, java.lang.Integer.MAX_VALUE, onset));
        childrenList.add(new Property("abatement[x]", "dateTime|Age|boolean|Period|Range|string", "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate.", 0, java.lang.Integer.MAX_VALUE, abatement));
        childrenList.add(new Property("stage", "", "Clinical stage or grade of a condition. May include formal severity assessments.", 0, java.lang.Integer.MAX_VALUE, stage));
        childrenList.add(new Property("evidence", "", "Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.", 0, java.lang.Integer.MAX_VALUE, evidence));
        childrenList.add(new Property("bodySite", "CodeableConcept", "The anatomical location where this condition manifests itself.", 0, java.lang.Integer.MAX_VALUE, bodySite));
        childrenList.add(new Property("notes", "string", "Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.", 0, java.lang.Integer.MAX_VALUE, notes));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("asserter"))
            // Reference
            this.asserter = castToReference(value);
        else if (name.equals("dateRecorded"))
            // DateType
            this.dateRecorded = castToDate(value);
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("category"))
            // CodeableConcept
            this.category = castToCodeableConcept(value);
        else if (name.equals("clinicalStatus"))
            // CodeType
            this.clinicalStatus = castToCode(value);
        else if (name.equals("verificationStatus"))
            // Enumeration<ConditionVerificationStatus>
            this.verificationStatus = new ConditionVerificationStatusEnumFactory().fromType(value);
        else if (name.equals("severity"))
            // CodeableConcept
            this.severity = castToCodeableConcept(value);
        else if (name.equals("onset[x]"))
            // Type
            this.onset = (Type) value;
        else if (name.equals("abatement[x]"))
            // Type
            this.abatement = (Type) value;
        else if (name.equals("stage"))
            // ConditionStageComponent
            this.stage = (ConditionStageComponent) value;
        else if (name.equals("evidence"))
            this.getEvidence().add((ConditionEvidenceComponent) value);
        else if (name.equals("bodySite"))
            this.getBodySite().add(castToCodeableConcept(value));
        else if (name.equals("notes"))
            // StringType
            this.notes = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("asserter")) {
            this.asserter = new Reference();
            return this.asserter;
        } else if (name.equals("dateRecorded")) {
            throw new FHIRException("Cannot call addChild on a primitive type Condition.dateRecorded");
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("category")) {
            this.category = new CodeableConcept();
            return this.category;
        } else if (name.equals("clinicalStatus")) {
            throw new FHIRException("Cannot call addChild on a primitive type Condition.clinicalStatus");
        } else if (name.equals("verificationStatus")) {
            throw new FHIRException("Cannot call addChild on a primitive type Condition.verificationStatus");
        } else if (name.equals("severity")) {
            this.severity = new CodeableConcept();
            return this.severity;
        } else if (name.equals("onsetDateTime")) {
            this.onset = new DateTimeType();
            return this.onset;
        } else if (name.equals("onsetAge")) {
            this.onset = new Age();
            return this.onset;
        } else if (name.equals("onsetPeriod")) {
            this.onset = new Period();
            return this.onset;
        } else if (name.equals("onsetRange")) {
            this.onset = new Range();
            return this.onset;
        } else if (name.equals("onsetString")) {
            this.onset = new StringType();
            return this.onset;
        } else if (name.equals("abatementDateTime")) {
            this.abatement = new DateTimeType();
            return this.abatement;
        } else if (name.equals("abatementAge")) {
            this.abatement = new Age();
            return this.abatement;
        } else if (name.equals("abatementBoolean")) {
            this.abatement = new BooleanType();
            return this.abatement;
        } else if (name.equals("abatementPeriod")) {
            this.abatement = new Period();
            return this.abatement;
        } else if (name.equals("abatementRange")) {
            this.abatement = new Range();
            return this.abatement;
        } else if (name.equals("abatementString")) {
            this.abatement = new StringType();
            return this.abatement;
        } else if (name.equals("stage")) {
            this.stage = new ConditionStageComponent();
            return this.stage;
        } else if (name.equals("evidence")) {
            return addEvidence();
        } else if (name.equals("bodySite")) {
            return addBodySite();
        } else if (name.equals("notes")) {
            throw new FHIRException("Cannot call addChild on a primitive type Condition.notes");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Condition";
    }

    public Condition copy() {
        Condition dst = new Condition();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.patient = patient == null ? null : patient.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.asserter = asserter == null ? null : asserter.copy();
        dst.dateRecorded = dateRecorded == null ? null : dateRecorded.copy();
        dst.code = code == null ? null : code.copy();
        dst.category = category == null ? null : category.copy();
        dst.clinicalStatus = clinicalStatus == null ? null : clinicalStatus.copy();
        dst.verificationStatus = verificationStatus == null ? null : verificationStatus.copy();
        dst.severity = severity == null ? null : severity.copy();
        dst.onset = onset == null ? null : onset.copy();
        dst.abatement = abatement == null ? null : abatement.copy();
        dst.stage = stage == null ? null : stage.copy();
        if (evidence != null) {
            dst.evidence = new ArrayList<ConditionEvidenceComponent>();
            for (ConditionEvidenceComponent i : evidence) dst.evidence.add(i.copy());
        }
        ;
        if (bodySite != null) {
            dst.bodySite = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : bodySite) dst.bodySite.add(i.copy());
        }
        ;
        dst.notes = notes == null ? null : notes.copy();
        return dst;
    }

    protected Condition typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Condition))
            return false;
        Condition o = (Condition) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(patient, o.patient, true) && compareDeep(encounter, o.encounter, true) && compareDeep(asserter, o.asserter, true) && compareDeep(dateRecorded, o.dateRecorded, true) && compareDeep(code, o.code, true) && compareDeep(category, o.category, true) && compareDeep(clinicalStatus, o.clinicalStatus, true) && compareDeep(verificationStatus, o.verificationStatus, true) && compareDeep(severity, o.severity, true) && compareDeep(onset, o.onset, true) && compareDeep(abatement, o.abatement, true) && compareDeep(stage, o.stage, true) && compareDeep(evidence, o.evidence, true) && compareDeep(bodySite, o.bodySite, true) && compareDeep(notes, o.notes, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Condition))
            return false;
        Condition o = (Condition) other;
        return compareValues(dateRecorded, o.dateRecorded, true) && compareValues(clinicalStatus, o.clinicalStatus, true) && compareValues(verificationStatus, o.verificationStatus, true) && compareValues(notes, o.notes, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (patient == null || patient.isEmpty()) && (encounter == null || encounter.isEmpty()) && (asserter == null || asserter.isEmpty()) && (dateRecorded == null || dateRecorded.isEmpty()) && (code == null || code.isEmpty()) && (category == null || category.isEmpty()) && (clinicalStatus == null || clinicalStatus.isEmpty()) && (verificationStatus == null || verificationStatus.isEmpty()) && (severity == null || severity.isEmpty()) && (onset == null || onset.isEmpty()) && (abatement == null || abatement.isEmpty()) && (stage == null || stage.isEmpty()) && (evidence == null || evidence.isEmpty()) && (bodySite == null || bodySite.isEmpty()) && (notes == null || notes.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Condition;
    }

    public static final String SP_SEVERITY = "severity";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CLINICALSTATUS = "clinicalstatus";

    public static final String SP_ONSETINFO = "onset-info";

    public static final String SP_CODE = "code";

    public static final String SP_EVIDENCE = "evidence";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_ONSET = "onset";

    public static final String SP_ASSERTER = "asserter";

    public static final String SP_DATERECORDED = "date-recorded";

    public static final String SP_STAGE = "stage";

    public static final String SP_PATIENT = "patient";

    public static final String SP_CATEGORY = "category";

    public static final String SP_BODYSITE = "body-site";
}
