package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCriticality;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCriticalityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCategory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceSeverity;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceStatus;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCertainty;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCertaintyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceType;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceTypeEnumFactory;

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
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 */
public class AllergyIntolerance extends DomainResource {

    /**
     * This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    protected List<Identifier> identifier;

    /**
     * Record of the date and/or time of the onset of the Allergy or Intolerance.
     */
    protected DateTimeType onset;

    /**
     * Date when the sensitivity was recorded.
     */
    protected DateTimeType recordedDate;

    /**
     * Individual who recorded the record and takes responsibility for its conten.
     */
    protected Reference recorder;

    /**
     * The actual object that is the target of the reference (Individual who recorded the record and takes responsibility for its conten.)
     */
    protected Resource recorderTarget;

    /**
     * The patient who has the allergy or intolerance.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient who has the allergy or intolerance.)
     */
    protected Patient patientTarget;

    /**
     * The source of the information about the allergy that is recorded.
     */
    protected Reference reporter;

    /**
     * The actual object that is the target of the reference (The source of the information about the allergy that is recorded.)
     */
    protected Resource reporterTarget;

    /**
     * Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk.
     */
    protected CodeableConcept substance;

    /**
     * Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.
     */
    protected Enumeration<AllergyIntoleranceStatus> status;

    /**
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.
     */
    protected Enumeration<AllergyIntoleranceCriticality> criticality;

    /**
     * Identification of the underlying physiological mechanism for the reaction risk.
     */
    protected Enumeration<AllergyIntoleranceType> type;

    /**
     * Category of the identified Substance.
     */
    protected Enumeration<AllergyIntoleranceCategory> category;

    /**
     * Represents the date and/or time of the last known occurrence of a reaction event.
     */
    protected DateTimeType lastOccurence;

    /**
     * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
     */
    protected Annotation note;

    /**
     * Details about each adverse reaction event linked to exposure to the identified Substance.
     */
    protected List<AllergyIntoleranceReactionComponent> reaction;

    private static final long serialVersionUID = -1657522921L;

    /*
   * Constructor
   */
    public AllergyIntolerance() {
        super();
    }

    /*
   * Constructor
   */
    public AllergyIntolerance(Reference patient, CodeableConcept substance) {
        super();
        this.patient = patient;
        this.substance = substance;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
     * @return {@link #identifier} (This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
    public AllergyIntolerance addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #onset} (Record of the date and/or time of the onset of the Allergy or Intolerance.). This is the underlying object with id, value and extensions. The accessor "getOnset" gives direct access to the value
     */
    public DateTimeType getOnsetElement() {
        if (this.onset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.onset");
            else if (Configuration.doAutoCreate())
                // bb
                this.onset = new DateTimeType();
        return this.onset;
    }

    public boolean hasOnsetElement() {
        return this.onset != null && !this.onset.isEmpty();
    }

    public boolean hasOnset() {
        return this.onset != null && !this.onset.isEmpty();
    }

    /**
     * @param value {@link #onset} (Record of the date and/or time of the onset of the Allergy or Intolerance.). This is the underlying object with id, value and extensions. The accessor "getOnset" gives direct access to the value
     */
    public AllergyIntolerance setOnsetElement(DateTimeType value) {
        this.onset = value;
        return this;
    }

    /**
     * @return Record of the date and/or time of the onset of the Allergy or Intolerance.
     */
    public Date getOnset() {
        return this.onset == null ? null : this.onset.getValue();
    }

    /**
     * @param value Record of the date and/or time of the onset of the Allergy or Intolerance.
     */
    public AllergyIntolerance setOnset(Date value) {
        if (value == null)
            this.onset = null;
        else {
            if (this.onset == null)
                this.onset = new DateTimeType();
            this.onset.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #recordedDate} (Date when the sensitivity was recorded.). This is the underlying object with id, value and extensions. The accessor "getRecordedDate" gives direct access to the value
     */
    public DateTimeType getRecordedDateElement() {
        if (this.recordedDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.recordedDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.recordedDate = new DateTimeType();
        return this.recordedDate;
    }

    public boolean hasRecordedDateElement() {
        return this.recordedDate != null && !this.recordedDate.isEmpty();
    }

    public boolean hasRecordedDate() {
        return this.recordedDate != null && !this.recordedDate.isEmpty();
    }

    /**
     * @param value {@link #recordedDate} (Date when the sensitivity was recorded.). This is the underlying object with id, value and extensions. The accessor "getRecordedDate" gives direct access to the value
     */
    public AllergyIntolerance setRecordedDateElement(DateTimeType value) {
        this.recordedDate = value;
        return this;
    }

    /**
     * @return Date when the sensitivity was recorded.
     */
    public Date getRecordedDate() {
        return this.recordedDate == null ? null : this.recordedDate.getValue();
    }

    /**
     * @param value Date when the sensitivity was recorded.
     */
    public AllergyIntolerance setRecordedDate(Date value) {
        if (value == null)
            this.recordedDate = null;
        else {
            if (this.recordedDate == null)
                this.recordedDate = new DateTimeType();
            this.recordedDate.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #recorder} (Individual who recorded the record and takes responsibility for its conten.)
     */
    public Reference getRecorder() {
        if (this.recorder == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.recorder");
            else if (Configuration.doAutoCreate())
                // cc
                this.recorder = new Reference();
        return this.recorder;
    }

    public boolean hasRecorder() {
        return this.recorder != null && !this.recorder.isEmpty();
    }

    /**
     * @param value {@link #recorder} (Individual who recorded the record and takes responsibility for its conten.)
     */
    public AllergyIntolerance setRecorder(Reference value) {
        this.recorder = value;
        return this;
    }

    /**
     * @return {@link #recorder} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Individual who recorded the record and takes responsibility for its conten.)
     */
    public Resource getRecorderTarget() {
        return this.recorderTarget;
    }

    /**
     * @param value {@link #recorder} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Individual who recorded the record and takes responsibility for its conten.)
     */
    public AllergyIntolerance setRecorderTarget(Resource value) {
        this.recorderTarget = value;
        return this;
    }

    /**
     * @return {@link #patient} (The patient who has the allergy or intolerance.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient who has the allergy or intolerance.)
     */
    public AllergyIntolerance setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient who has the allergy or intolerance.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient who has the allergy or intolerance.)
     */
    public AllergyIntolerance setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #reporter} (The source of the information about the allergy that is recorded.)
     */
    public Reference getReporter() {
        if (this.reporter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.reporter");
            else if (Configuration.doAutoCreate())
                // cc
                this.reporter = new Reference();
        return this.reporter;
    }

    public boolean hasReporter() {
        return this.reporter != null && !this.reporter.isEmpty();
    }

    /**
     * @param value {@link #reporter} (The source of the information about the allergy that is recorded.)
     */
    public AllergyIntolerance setReporter(Reference value) {
        this.reporter = value;
        return this;
    }

    /**
     * @return {@link #reporter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The source of the information about the allergy that is recorded.)
     */
    public Resource getReporterTarget() {
        return this.reporterTarget;
    }

    /**
     * @param value {@link #reporter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The source of the information about the allergy that is recorded.)
     */
    public AllergyIntolerance setReporterTarget(Resource value) {
        this.reporterTarget = value;
        return this;
    }

    /**
     * @return {@link #substance} (Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk.)
     */
    public CodeableConcept getSubstance() {
        if (this.substance == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.substance");
            else if (Configuration.doAutoCreate())
                // cc
                this.substance = new CodeableConcept();
        return this.substance;
    }

    public boolean hasSubstance() {
        return this.substance != null && !this.substance.isEmpty();
    }

    /**
     * @param value {@link #substance} (Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk.)
     */
    public AllergyIntolerance setSubstance(CodeableConcept value) {
        this.substance = value;
        return this;
    }

    /**
     * @return {@link #status} (Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<AllergyIntoleranceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<AllergyIntoleranceStatus>(new AllergyIntoleranceStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public AllergyIntolerance setStatusElement(Enumeration<AllergyIntoleranceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.
     */
    public AllergyIntoleranceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.
     */
    public AllergyIntolerance setStatus(AllergyIntoleranceStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<AllergyIntoleranceStatus>(new AllergyIntoleranceStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #criticality} (Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getCriticality" gives direct access to the value
     */
    public Enumeration<AllergyIntoleranceCriticality> getCriticalityElement() {
        if (this.criticality == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.criticality");
            else if (Configuration.doAutoCreate())
                // bb
                this.criticality = new Enumeration<AllergyIntoleranceCriticality>(new AllergyIntoleranceCriticalityEnumFactory());
        return this.criticality;
    }

    public boolean hasCriticalityElement() {
        return this.criticality != null && !this.criticality.isEmpty();
    }

    public boolean hasCriticality() {
        return this.criticality != null && !this.criticality.isEmpty();
    }

    /**
     * @param value {@link #criticality} (Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getCriticality" gives direct access to the value
     */
    public AllergyIntolerance setCriticalityElement(Enumeration<AllergyIntoleranceCriticality> value) {
        this.criticality = value;
        return this;
    }

    /**
     * @return Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.
     */
    public AllergyIntoleranceCriticality getCriticality() {
        return this.criticality == null ? null : this.criticality.getValue();
    }

    /**
     * @param value Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.
     */
    public AllergyIntolerance setCriticality(AllergyIntoleranceCriticality value) {
        if (value == null)
            this.criticality = null;
        else {
            if (this.criticality == null)
                this.criticality = new Enumeration<AllergyIntoleranceCriticality>(new AllergyIntoleranceCriticalityEnumFactory());
            this.criticality.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (Identification of the underlying physiological mechanism for the reaction risk.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<AllergyIntoleranceType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<AllergyIntoleranceType>(new AllergyIntoleranceTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Identification of the underlying physiological mechanism for the reaction risk.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public AllergyIntolerance setTypeElement(Enumeration<AllergyIntoleranceType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return Identification of the underlying physiological mechanism for the reaction risk.
     */
    public AllergyIntoleranceType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Identification of the underlying physiological mechanism for the reaction risk.
     */
    public AllergyIntolerance setType(AllergyIntoleranceType value) {
        if (value == null)
            this.type = null;
        else {
            if (this.type == null)
                this.type = new Enumeration<AllergyIntoleranceType>(new AllergyIntoleranceTypeEnumFactory());
            this.type.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #category} (Category of the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
     */
    public Enumeration<AllergyIntoleranceCategory> getCategoryElement() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.category");
            else if (Configuration.doAutoCreate())
                // bb
                this.category = new Enumeration<AllergyIntoleranceCategory>(new AllergyIntoleranceCategoryEnumFactory());
        return this.category;
    }

    public boolean hasCategoryElement() {
        return this.category != null && !this.category.isEmpty();
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (Category of the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
     */
    public AllergyIntolerance setCategoryElement(Enumeration<AllergyIntoleranceCategory> value) {
        this.category = value;
        return this;
    }

    /**
     * @return Category of the identified Substance.
     */
    public AllergyIntoleranceCategory getCategory() {
        return this.category == null ? null : this.category.getValue();
    }

    /**
     * @param value Category of the identified Substance.
     */
    public AllergyIntolerance setCategory(AllergyIntoleranceCategory value) {
        if (value == null)
            this.category = null;
        else {
            if (this.category == null)
                this.category = new Enumeration<AllergyIntoleranceCategory>(new AllergyIntoleranceCategoryEnumFactory());
            this.category.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #lastOccurence} (Represents the date and/or time of the last known occurrence of a reaction event.). This is the underlying object with id, value and extensions. The accessor "getLastOccurence" gives direct access to the value
     */
    public DateTimeType getLastOccurenceElement() {
        if (this.lastOccurence == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.lastOccurence");
            else if (Configuration.doAutoCreate())
                // bb
                this.lastOccurence = new DateTimeType();
        return this.lastOccurence;
    }

    public boolean hasLastOccurenceElement() {
        return this.lastOccurence != null && !this.lastOccurence.isEmpty();
    }

    public boolean hasLastOccurence() {
        return this.lastOccurence != null && !this.lastOccurence.isEmpty();
    }

    /**
     * @param value {@link #lastOccurence} (Represents the date and/or time of the last known occurrence of a reaction event.). This is the underlying object with id, value and extensions. The accessor "getLastOccurence" gives direct access to the value
     */
    public AllergyIntolerance setLastOccurenceElement(DateTimeType value) {
        this.lastOccurence = value;
        return this;
    }

    /**
     * @return Represents the date and/or time of the last known occurrence of a reaction event.
     */
    public Date getLastOccurence() {
        return this.lastOccurence == null ? null : this.lastOccurence.getValue();
    }

    /**
     * @param value Represents the date and/or time of the last known occurrence of a reaction event.
     */
    public AllergyIntolerance setLastOccurence(Date value) {
        if (value == null)
            this.lastOccurence = null;
        else {
            if (this.lastOccurence == null)
                this.lastOccurence = new DateTimeType();
            this.lastOccurence.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #note} (Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.)
     */
    public Annotation getNote() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.note");
            else if (Configuration.doAutoCreate())
                // cc
                this.note = new Annotation();
        return this.note;
    }

    public boolean hasNote() {
        return this.note != null && !this.note.isEmpty();
    }

    /**
     * @param value {@link #note} (Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.)
     */
    public AllergyIntolerance setNote(Annotation value) {
        this.note = value;
        return this;
    }

    /**
     * @return {@link #reaction} (Details about each adverse reaction event linked to exposure to the identified Substance.)
     */
    public List<AllergyIntoleranceReactionComponent> getReaction() {
        if (this.reaction == null)
            this.reaction = new ArrayList<AllergyIntoleranceReactionComponent>();
        return this.reaction;
    }

    public boolean hasReaction() {
        if (this.reaction == null)
            return false;
        for (AllergyIntoleranceReactionComponent item : this.reaction) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #reaction} (Details about each adverse reaction event linked to exposure to the identified Substance.)
     */
    // syntactic sugar
    public AllergyIntoleranceReactionComponent addReaction() {
        // 3
        AllergyIntoleranceReactionComponent t = new AllergyIntoleranceReactionComponent();
        if (this.reaction == null)
            this.reaction = new ArrayList<AllergyIntoleranceReactionComponent>();
        this.reaction.add(t);
        return t;
    }

    // syntactic sugar
    public AllergyIntolerance addReaction(AllergyIntoleranceReactionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.reaction == null)
            this.reaction = new ArrayList<AllergyIntoleranceReactionComponent>();
        this.reaction.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("onset", "dateTime", "Record of the date and/or time of the onset of the Allergy or Intolerance.", 0, java.lang.Integer.MAX_VALUE, onset));
        childrenList.add(new Property("recordedDate", "dateTime", "Date when the sensitivity was recorded.", 0, java.lang.Integer.MAX_VALUE, recordedDate));
        childrenList.add(new Property("recorder", "Reference(Practitioner|Patient)", "Individual who recorded the record and takes responsibility for its conten.", 0, java.lang.Integer.MAX_VALUE, recorder));
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient who has the allergy or intolerance.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("reporter", "Reference(Patient|RelatedPerson|Practitioner)", "The source of the information about the allergy that is recorded.", 0, java.lang.Integer.MAX_VALUE, reporter));
        childrenList.add(new Property("substance", "CodeableConcept", "Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk.", 0, java.lang.Integer.MAX_VALUE, substance));
        childrenList.add(new Property("status", "code", "Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("criticality", "code", "Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.", 0, java.lang.Integer.MAX_VALUE, criticality));
        childrenList.add(new Property("type", "code", "Identification of the underlying physiological mechanism for the reaction risk.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("category", "code", "Category of the identified Substance.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("lastOccurence", "dateTime", "Represents the date and/or time of the last known occurrence of a reaction event.", 0, java.lang.Integer.MAX_VALUE, lastOccurence));
        childrenList.add(new Property("note", "Annotation", "Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("reaction", "", "Details about each adverse reaction event linked to exposure to the identified Substance.", 0, java.lang.Integer.MAX_VALUE, reaction));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("onset"))
            // DateTimeType
            this.onset = castToDateTime(value);
        else if (name.equals("recordedDate"))
            // DateTimeType
            this.recordedDate = castToDateTime(value);
        else if (name.equals("recorder"))
            // Reference
            this.recorder = castToReference(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("reporter"))
            // Reference
            this.reporter = castToReference(value);
        else if (name.equals("substance"))
            // CodeableConcept
            this.substance = castToCodeableConcept(value);
        else if (name.equals("status"))
            // Enumeration<AllergyIntoleranceStatus>
            this.status = new AllergyIntoleranceStatusEnumFactory().fromType(value);
        else if (name.equals("criticality"))
            // Enumeration<AllergyIntoleranceCriticality>
            this.criticality = new AllergyIntoleranceCriticalityEnumFactory().fromType(value);
        else if (name.equals("type"))
            // Enumeration<AllergyIntoleranceType>
            this.type = new AllergyIntoleranceTypeEnumFactory().fromType(value);
        else if (name.equals("category"))
            // Enumeration<AllergyIntoleranceCategory>
            this.category = new AllergyIntoleranceCategoryEnumFactory().fromType(value);
        else if (name.equals("lastOccurence"))
            // DateTimeType
            this.lastOccurence = castToDateTime(value);
        else if (name.equals("note"))
            // Annotation
            this.note = castToAnnotation(value);
        else if (name.equals("reaction"))
            this.getReaction().add((AllergyIntoleranceReactionComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("onset")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.onset");
        } else if (name.equals("recordedDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.recordedDate");
        } else if (name.equals("recorder")) {
            this.recorder = new Reference();
            return this.recorder;
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("reporter")) {
            this.reporter = new Reference();
            return this.reporter;
        } else if (name.equals("substance")) {
            this.substance = new CodeableConcept();
            return this.substance;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.status");
        } else if (name.equals("criticality")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.criticality");
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.type");
        } else if (name.equals("category")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.category");
        } else if (name.equals("lastOccurence")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.lastOccurence");
        } else if (name.equals("note")) {
            this.note = new Annotation();
            return this.note;
        } else if (name.equals("reaction")) {
            return addReaction();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "AllergyIntolerance";
    }

    public AllergyIntolerance copy() {
        AllergyIntolerance dst = new AllergyIntolerance();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.onset = onset == null ? null : onset.copy();
        dst.recordedDate = recordedDate == null ? null : recordedDate.copy();
        dst.recorder = recorder == null ? null : recorder.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.reporter = reporter == null ? null : reporter.copy();
        dst.substance = substance == null ? null : substance.copy();
        dst.status = status == null ? null : status.copy();
        dst.criticality = criticality == null ? null : criticality.copy();
        dst.type = type == null ? null : type.copy();
        dst.category = category == null ? null : category.copy();
        dst.lastOccurence = lastOccurence == null ? null : lastOccurence.copy();
        dst.note = note == null ? null : note.copy();
        if (reaction != null) {
            dst.reaction = new ArrayList<AllergyIntoleranceReactionComponent>();
            for (AllergyIntoleranceReactionComponent i : reaction) dst.reaction.add(i.copy());
        }
        ;
        return dst;
    }

    protected AllergyIntolerance typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AllergyIntolerance))
            return false;
        AllergyIntolerance o = (AllergyIntolerance) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(onset, o.onset, true) && compareDeep(recordedDate, o.recordedDate, true) && compareDeep(recorder, o.recorder, true) && compareDeep(patient, o.patient, true) && compareDeep(reporter, o.reporter, true) && compareDeep(substance, o.substance, true) && compareDeep(status, o.status, true) && compareDeep(criticality, o.criticality, true) && compareDeep(type, o.type, true) && compareDeep(category, o.category, true) && compareDeep(lastOccurence, o.lastOccurence, true) && compareDeep(note, o.note, true) && compareDeep(reaction, o.reaction, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AllergyIntolerance))
            return false;
        AllergyIntolerance o = (AllergyIntolerance) other;
        return compareValues(onset, o.onset, true) && compareValues(recordedDate, o.recordedDate, true) && compareValues(status, o.status, true) && compareValues(criticality, o.criticality, true) && compareValues(type, o.type, true) && compareValues(category, o.category, true) && compareValues(lastOccurence, o.lastOccurence, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (onset == null || onset.isEmpty()) && (recordedDate == null || recordedDate.isEmpty()) && (recorder == null || recorder.isEmpty()) && (patient == null || patient.isEmpty()) && (reporter == null || reporter.isEmpty()) && (substance == null || substance.isEmpty()) && (status == null || status.isEmpty()) && (criticality == null || criticality.isEmpty()) && (type == null || type.isEmpty()) && (category == null || category.isEmpty()) && (lastOccurence == null || lastOccurence.isEmpty()) && (note == null || note.isEmpty()) && (reaction == null || reaction.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.AllergyIntolerance;
    }

    public static final String SP_SEVERITY = "severity";

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_MANIFESTATION = "manifestation";

    public static final String SP_RECORDER = "recorder";

    public static final String SP_SUBSTANCE = "substance";

    public static final String SP_CRITICALITY = "criticality";

    public static final String SP_REPORTER = "reporter";

    public static final String SP_TYPE = "type";

    public static final String SP_ONSET = "onset";

    public static final String SP_ROUTE = "route";

    public static final String SP_PATIENT = "patient";

    public static final String SP_CATEGORY = "category";

    public static final String SP_LASTDATE = "last-date";

    public static final String SP_STATUS = "status";
}
