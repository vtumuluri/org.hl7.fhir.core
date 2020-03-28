package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationStatus;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationRelationshipType;
import org.hl7.fhir.android.generated.dstu2.ObservationEnum.ObservationRelationshipTypeEnumFactory;

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
 * Measurements and simple assertions made about a patient, device or other subject.
 */
public class Observation extends DomainResource {

    /**
     * A unique identifier for the simple observation instance.
     */
    protected List<Identifier> identifier;

    /**
     * The status of the result value.
     */
    protected Enumeration<ObservationStatus> status;

    /**
     * A code that classifies the general type of observation being made.  This is used  for searching, sorting and display purposes.
     */
    protected CodeableConcept category;

    /**
     * Describes what was observed. Sometimes this is called the observation "name".
     */
    protected CodeableConcept code;

    /**
     * The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.)
     */
    protected Resource subjectTarget;

    /**
     * The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.)
     */
    protected Encounter encounterTarget;

    /**
     * The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
     */
    protected Type effective;

    /**
     * The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
     */
    protected InstantType issued;

    /**
     * Who was responsible for asserting the observed value as "true".
     */
    protected List<Reference> performer;

    /**
     * The actual objects that are the target of the reference (Who was responsible for asserting the observed value as "true".)
     */
    protected List<Resource> performerTarget;

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     */
    protected Type value;

    /**
     * Provides a reason why the expected value in the element Observation.value[x] is missing.
     */
    protected CodeableConcept dataAbsentReason;

    /**
     * The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag.
     */
    protected CodeableConcept interpretation;

    /**
     * May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
     */
    protected StringType comments;

    /**
     * Indicates the site on the subject's body where the observation was made (i.e. the target site).
     */
    protected CodeableConcept bodySite;

    /**
     * Indicates the mechanism used to perform the observation.
     */
    protected CodeableConcept method;

    /**
     * The specimen that was used when this observation was made.
     */
    protected Reference specimen;

    /**
     * The actual object that is the target of the reference (The specimen that was used when this observation was made.)
     */
    protected Specimen specimenTarget;

    /**
     * The device used to generate the observation data.
     */
    protected Reference device;

    /**
     * The actual object that is the target of the reference (The device used to generate the observation data.)
     */
    protected Resource deviceTarget;

    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.
     */
    protected List<ObservationReferenceRangeComponent> referenceRange;

    /**
     * A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code.
     */
    protected List<ObservationRelatedComponent> related;

    /**
     * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
     */
    protected List<ObservationComponentComponent> component;

    private static final long serialVersionUID = -931593572L;

    /*
   * Constructor
   */
    public Observation() {
        super();
    }

    /*
   * Constructor
   */
    public Observation(Enumeration<ObservationStatus> status, CodeableConcept code) {
        super();
        this.status = status;
        this.code = code;
    }

    /**
     * @return {@link #identifier} (A unique identifier for the simple observation instance.)
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
     * @return {@link #identifier} (A unique identifier for the simple observation instance.)
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
    public Observation addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #status} (The status of the result value.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ObservationStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<ObservationStatus>(new ObservationStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the result value.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Observation setStatusElement(Enumeration<ObservationStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the result value.
     */
    public ObservationStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the result value.
     */
    public Observation setStatus(ObservationStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ObservationStatus>(new ObservationStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #category} (A code that classifies the general type of observation being made.  This is used  for searching, sorting and display purposes.)
     */
    public CodeableConcept getCategory() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.category");
            else if (Configuration.doAutoCreate())
                // cc
                this.category = new CodeableConcept();
        return this.category;
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (A code that classifies the general type of observation being made.  This is used  for searching, sorting and display purposes.)
     */
    public Observation setCategory(CodeableConcept value) {
        this.category = value;
        return this;
    }

    /**
     * @return {@link #code} (Describes what was observed. Sometimes this is called the observation "name".)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Describes what was observed. Sometimes this is called the observation "name".)
     */
    public Observation setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #subject} (The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.)
     */
    public Observation setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.)
     */
    public Observation setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.)
     */
    public Observation setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.)
     */
    public Observation setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #effective} (The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.)
     */
    public Type getEffective() {
        return this.effective;
    }

    /**
     * @return {@link #effective} (The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.)
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
     * @return {@link #effective} (The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.)
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
     * @param value {@link #effective} (The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.)
     */
    public Observation setEffective(Type value) {
        this.effective = value;
        return this;
    }

    /**
     * @return {@link #issued} (The date and time this observation was made available to providers, typically after the results have been reviewed and verified.). This is the underlying object with id, value and extensions. The accessor "getIssued" gives direct access to the value
     */
    public InstantType getIssuedElement() {
        if (this.issued == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.issued");
            else if (Configuration.doAutoCreate())
                // bb
                this.issued = new InstantType();
        return this.issued;
    }

    public boolean hasIssuedElement() {
        return this.issued != null && !this.issued.isEmpty();
    }

    public boolean hasIssued() {
        return this.issued != null && !this.issued.isEmpty();
    }

    /**
     * @param value {@link #issued} (The date and time this observation was made available to providers, typically after the results have been reviewed and verified.). This is the underlying object with id, value and extensions. The accessor "getIssued" gives direct access to the value
     */
    public Observation setIssuedElement(InstantType value) {
        this.issued = value;
        return this;
    }

    /**
     * @return The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
     */
    public Date getIssued() {
        return this.issued == null ? null : this.issued.getValue();
    }

    /**
     * @param value The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
     */
    public Observation setIssued(Date value) {
        if (value == null)
            this.issued = null;
        else {
            if (this.issued == null)
                this.issued = new InstantType();
            this.issued.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #performer} (Who was responsible for asserting the observed value as "true".)
     */
    public List<Reference> getPerformer() {
        if (this.performer == null)
            this.performer = new ArrayList<Reference>();
        return this.performer;
    }

    public boolean hasPerformer() {
        if (this.performer == null)
            return false;
        for (Reference item : this.performer) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #performer} (Who was responsible for asserting the observed value as "true".)
     */
    // syntactic sugar
    public Reference addPerformer() {
        // 3
        Reference t = new Reference();
        if (this.performer == null)
            this.performer = new ArrayList<Reference>();
        this.performer.add(t);
        return t;
    }

    // syntactic sugar
    public Observation addPerformer(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.performer == null)
            this.performer = new ArrayList<Reference>();
        this.performer.add(t);
        return this;
    }

    /**
     * @return {@link #performer} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Who was responsible for asserting the observed value as "true".)
     */
    public List<Resource> getPerformerTarget() {
        if (this.performerTarget == null)
            this.performerTarget = new ArrayList<Resource>();
        return this.performerTarget;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Type getValue() {
        return this.value;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Quantity getValueQuantity() throws FHIRException {
        if (!(this.value instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Quantity) this.value;
    }

    public boolean hasValueQuantity() {
        return this.value instanceof Quantity;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public CodeableConcept getValueCodeableConcept() throws FHIRException {
        if (!(this.value instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.value.getClass().getName() + " was encountered");
        return (CodeableConcept) this.value;
    }

    public boolean hasValueCodeableConcept() {
        return this.value instanceof CodeableConcept;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public StringType getValueStringType() throws FHIRException {
        if (!(this.value instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (StringType) this.value;
    }

    public boolean hasValueStringType() {
        return this.value instanceof StringType;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Range getValueRange() throws FHIRException {
        if (!(this.value instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Range) this.value;
    }

    public boolean hasValueRange() {
        return this.value instanceof Range;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Ratio getValueRatio() throws FHIRException {
        if (!(this.value instanceof Ratio))
            throw new FHIRException("Type mismatch: the type Ratio was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Ratio) this.value;
    }

    public boolean hasValueRatio() {
        return this.value instanceof Ratio;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public SampledData getValueSampledData() throws FHIRException {
        if (!(this.value instanceof SampledData))
            throw new FHIRException("Type mismatch: the type SampledData was expected, but " + this.value.getClass().getName() + " was encountered");
        return (SampledData) this.value;
    }

    public boolean hasValueSampledData() {
        return this.value instanceof SampledData;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Attachment getValueAttachment() throws FHIRException {
        if (!(this.value instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Attachment) this.value;
    }

    public boolean hasValueAttachment() {
        return this.value instanceof Attachment;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public TimeType getValueTimeType() throws FHIRException {
        if (!(this.value instanceof TimeType))
            throw new FHIRException("Type mismatch: the type TimeType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (TimeType) this.value;
    }

    public boolean hasValueTimeType() {
        return this.value instanceof TimeType;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public DateTimeType getValueDateTimeType() throws FHIRException {
        if (!(this.value instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (DateTimeType) this.value;
    }

    public boolean hasValueDateTimeType() {
        return this.value instanceof DateTimeType;
    }

    /**
     * @return {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Period getValuePeriod() throws FHIRException {
        if (!(this.value instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.value.getClass().getName() + " was encountered");
        return (Period) this.value;
    }

    public boolean hasValuePeriod() {
        return this.value instanceof Period;
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The information determined as a result of making the observation, if the information has a simple value.)
     */
    public Observation setValue(Type value) {
        this.value = value;
        return this;
    }

    /**
     * @return {@link #dataAbsentReason} (Provides a reason why the expected value in the element Observation.value[x] is missing.)
     */
    public CodeableConcept getDataAbsentReason() {
        if (this.dataAbsentReason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.dataAbsentReason");
            else if (Configuration.doAutoCreate())
                // cc
                this.dataAbsentReason = new CodeableConcept();
        return this.dataAbsentReason;
    }

    public boolean hasDataAbsentReason() {
        return this.dataAbsentReason != null && !this.dataAbsentReason.isEmpty();
    }

    /**
     * @param value {@link #dataAbsentReason} (Provides a reason why the expected value in the element Observation.value[x] is missing.)
     */
    public Observation setDataAbsentReason(CodeableConcept value) {
        this.dataAbsentReason = value;
        return this;
    }

    /**
     * @return {@link #interpretation} (The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag.)
     */
    public CodeableConcept getInterpretation() {
        if (this.interpretation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.interpretation");
            else if (Configuration.doAutoCreate())
                // cc
                this.interpretation = new CodeableConcept();
        return this.interpretation;
    }

    public boolean hasInterpretation() {
        return this.interpretation != null && !this.interpretation.isEmpty();
    }

    /**
     * @param value {@link #interpretation} (The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag.)
     */
    public Observation setInterpretation(CodeableConcept value) {
        this.interpretation = value;
        return this;
    }

    /**
     * @return {@link #comments} (May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.). This is the underlying object with id, value and extensions. The accessor "getComments" gives direct access to the value
     */
    public StringType getCommentsElement() {
        if (this.comments == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.comments");
            else if (Configuration.doAutoCreate())
                // bb
                this.comments = new StringType();
        return this.comments;
    }

    public boolean hasCommentsElement() {
        return this.comments != null && !this.comments.isEmpty();
    }

    public boolean hasComments() {
        return this.comments != null && !this.comments.isEmpty();
    }

    /**
     * @param value {@link #comments} (May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.). This is the underlying object with id, value and extensions. The accessor "getComments" gives direct access to the value
     */
    public Observation setCommentsElement(StringType value) {
        this.comments = value;
        return this;
    }

    /**
     * @return May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
     */
    public String getComments() {
        return this.comments == null ? null : this.comments.getValue();
    }

    /**
     * @param value May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
     */
    public Observation setComments(String value) {
        if (Utilities.noString(value))
            this.comments = null;
        else {
            if (this.comments == null)
                this.comments = new StringType();
            this.comments.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #bodySite} (Indicates the site on the subject's body where the observation was made (i.e. the target site).)
     */
    public CodeableConcept getBodySite() {
        if (this.bodySite == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.bodySite");
            else if (Configuration.doAutoCreate())
                // cc
                this.bodySite = new CodeableConcept();
        return this.bodySite;
    }

    public boolean hasBodySite() {
        return this.bodySite != null && !this.bodySite.isEmpty();
    }

    /**
     * @param value {@link #bodySite} (Indicates the site on the subject's body where the observation was made (i.e. the target site).)
     */
    public Observation setBodySite(CodeableConcept value) {
        this.bodySite = value;
        return this;
    }

    /**
     * @return {@link #method} (Indicates the mechanism used to perform the observation.)
     */
    public CodeableConcept getMethod() {
        if (this.method == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.method");
            else if (Configuration.doAutoCreate())
                // cc
                this.method = new CodeableConcept();
        return this.method;
    }

    public boolean hasMethod() {
        return this.method != null && !this.method.isEmpty();
    }

    /**
     * @param value {@link #method} (Indicates the mechanism used to perform the observation.)
     */
    public Observation setMethod(CodeableConcept value) {
        this.method = value;
        return this;
    }

    /**
     * @return {@link #specimen} (The specimen that was used when this observation was made.)
     */
    public Reference getSpecimen() {
        if (this.specimen == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.specimen");
            else if (Configuration.doAutoCreate())
                // cc
                this.specimen = new Reference();
        return this.specimen;
    }

    public boolean hasSpecimen() {
        return this.specimen != null && !this.specimen.isEmpty();
    }

    /**
     * @param value {@link #specimen} (The specimen that was used when this observation was made.)
     */
    public Observation setSpecimen(Reference value) {
        this.specimen = value;
        return this;
    }

    /**
     * @return {@link #specimen} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The specimen that was used when this observation was made.)
     */
    public Specimen getSpecimenTarget() {
        if (this.specimenTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.specimen");
            else if (Configuration.doAutoCreate())
                // aa
                this.specimenTarget = new Specimen();
        return this.specimenTarget;
    }

    /**
     * @param value {@link #specimen} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The specimen that was used when this observation was made.)
     */
    public Observation setSpecimenTarget(Specimen value) {
        this.specimenTarget = value;
        return this;
    }

    /**
     * @return {@link #device} (The device used to generate the observation data.)
     */
    public Reference getDevice() {
        if (this.device == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Observation.device");
            else if (Configuration.doAutoCreate())
                // cc
                this.device = new Reference();
        return this.device;
    }

    public boolean hasDevice() {
        return this.device != null && !this.device.isEmpty();
    }

    /**
     * @param value {@link #device} (The device used to generate the observation data.)
     */
    public Observation setDevice(Reference value) {
        this.device = value;
        return this;
    }

    /**
     * @return {@link #device} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The device used to generate the observation data.)
     */
    public Resource getDeviceTarget() {
        return this.deviceTarget;
    }

    /**
     * @param value {@link #device} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The device used to generate the observation data.)
     */
    public Observation setDeviceTarget(Resource value) {
        this.deviceTarget = value;
        return this;
    }

    /**
     * @return {@link #referenceRange} (Guidance on how to interpret the value by comparison to a normal or recommended range.)
     */
    public List<ObservationReferenceRangeComponent> getReferenceRange() {
        if (this.referenceRange == null)
            this.referenceRange = new ArrayList<ObservationReferenceRangeComponent>();
        return this.referenceRange;
    }

    public boolean hasReferenceRange() {
        if (this.referenceRange == null)
            return false;
        for (ObservationReferenceRangeComponent item : this.referenceRange) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #referenceRange} (Guidance on how to interpret the value by comparison to a normal or recommended range.)
     */
    // syntactic sugar
    public ObservationReferenceRangeComponent addReferenceRange() {
        // 3
        ObservationReferenceRangeComponent t = new ObservationReferenceRangeComponent();
        if (this.referenceRange == null)
            this.referenceRange = new ArrayList<ObservationReferenceRangeComponent>();
        this.referenceRange.add(t);
        return t;
    }

    // syntactic sugar
    public Observation addReferenceRange(ObservationReferenceRangeComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.referenceRange == null)
            this.referenceRange = new ArrayList<ObservationReferenceRangeComponent>();
        this.referenceRange.add(t);
        return this;
    }

    /**
     * @return {@link #related} (A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code.)
     */
    public List<ObservationRelatedComponent> getRelated() {
        if (this.related == null)
            this.related = new ArrayList<ObservationRelatedComponent>();
        return this.related;
    }

    public boolean hasRelated() {
        if (this.related == null)
            return false;
        for (ObservationRelatedComponent item : this.related) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #related} (A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code.)
     */
    // syntactic sugar
    public ObservationRelatedComponent addRelated() {
        // 3
        ObservationRelatedComponent t = new ObservationRelatedComponent();
        if (this.related == null)
            this.related = new ArrayList<ObservationRelatedComponent>();
        this.related.add(t);
        return t;
    }

    // syntactic sugar
    public Observation addRelated(ObservationRelatedComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.related == null)
            this.related = new ArrayList<ObservationRelatedComponent>();
        this.related.add(t);
        return this;
    }

    /**
     * @return {@link #component} (Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.)
     */
    public List<ObservationComponentComponent> getComponent() {
        if (this.component == null)
            this.component = new ArrayList<ObservationComponentComponent>();
        return this.component;
    }

    public boolean hasComponent() {
        if (this.component == null)
            return false;
        for (ObservationComponentComponent item : this.component) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #component} (Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.)
     */
    // syntactic sugar
    public ObservationComponentComponent addComponent() {
        // 3
        ObservationComponentComponent t = new ObservationComponentComponent();
        if (this.component == null)
            this.component = new ArrayList<ObservationComponentComponent>();
        this.component.add(t);
        return t;
    }

    // syntactic sugar
    public Observation addComponent(ObservationComponentComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.component == null)
            this.component = new ArrayList<ObservationComponentComponent>();
        this.component.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "A unique identifier for the simple observation instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "The status of the result value.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("category", "CodeableConcept", "A code that classifies the general type of observation being made.  This is used  for searching, sorting and display purposes.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("code", "CodeableConcept", "Describes what was observed. Sometimes this is called the observation \"name\".", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("subject", "Reference(Patient|Group|Device|Location)", "The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("effective[x]", "dateTime|Period", "The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.", 0, java.lang.Integer.MAX_VALUE, effective));
        childrenList.add(new Property("issued", "instant", "The date and time this observation was made available to providers, typically after the results have been reviewed and verified.", 0, java.lang.Integer.MAX_VALUE, issued));
        childrenList.add(new Property("performer", "Reference(Practitioner|Organization|Patient|RelatedPerson)", "Who was responsible for asserting the observed value as \"true\".", 0, java.lang.Integer.MAX_VALUE, performer));
        childrenList.add(new Property("value[x]", "Quantity|CodeableConcept|string|Range|Ratio|SampledData|Attachment|time|dateTime|Period", "The information determined as a result of making the observation, if the information has a simple value.", 0, java.lang.Integer.MAX_VALUE, value));
        childrenList.add(new Property("dataAbsentReason", "CodeableConcept", "Provides a reason why the expected value in the element Observation.value[x] is missing.", 0, java.lang.Integer.MAX_VALUE, dataAbsentReason));
        childrenList.add(new Property("interpretation", "CodeableConcept", "The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag.", 0, java.lang.Integer.MAX_VALUE, interpretation));
        childrenList.add(new Property("comments", "string", "May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.", 0, java.lang.Integer.MAX_VALUE, comments));
        childrenList.add(new Property("bodySite", "CodeableConcept", "Indicates the site on the subject's body where the observation was made (i.e. the target site).", 0, java.lang.Integer.MAX_VALUE, bodySite));
        childrenList.add(new Property("method", "CodeableConcept", "Indicates the mechanism used to perform the observation.", 0, java.lang.Integer.MAX_VALUE, method));
        childrenList.add(new Property("specimen", "Reference(Specimen)", "The specimen that was used when this observation was made.", 0, java.lang.Integer.MAX_VALUE, specimen));
        childrenList.add(new Property("device", "Reference(Device|DeviceMetric)", "The device used to generate the observation data.", 0, java.lang.Integer.MAX_VALUE, device));
        childrenList.add(new Property("referenceRange", "", "Guidance on how to interpret the value by comparison to a normal or recommended range.", 0, java.lang.Integer.MAX_VALUE, referenceRange));
        childrenList.add(new Property("related", "", "A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code.", 0, java.lang.Integer.MAX_VALUE, related));
        childrenList.add(new Property("component", "", "Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.", 0, java.lang.Integer.MAX_VALUE, component));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
            // Enumeration<ObservationStatus>
            this.status = new ObservationStatusEnumFactory().fromType(value);
        else if (name.equals("category"))
            // CodeableConcept
            this.category = castToCodeableConcept(value);
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("effective[x]"))
            // Type
            this.effective = (Type) value;
        else if (name.equals("issued"))
            // InstantType
            this.issued = castToInstant(value);
        else if (name.equals("performer"))
            this.getPerformer().add(castToReference(value));
        else if (name.equals("value[x]"))
            // Type
            this.value = (Type) value;
        else if (name.equals("dataAbsentReason"))
            // CodeableConcept
            this.dataAbsentReason = castToCodeableConcept(value);
        else if (name.equals("interpretation"))
            // CodeableConcept
            this.interpretation = castToCodeableConcept(value);
        else if (name.equals("comments"))
            // StringType
            this.comments = castToString(value);
        else if (name.equals("bodySite"))
            // CodeableConcept
            this.bodySite = castToCodeableConcept(value);
        else if (name.equals("method"))
            // CodeableConcept
            this.method = castToCodeableConcept(value);
        else if (name.equals("specimen"))
            // Reference
            this.specimen = castToReference(value);
        else if (name.equals("device"))
            // Reference
            this.device = castToReference(value);
        else if (name.equals("referenceRange"))
            this.getReferenceRange().add((ObservationReferenceRangeComponent) value);
        else if (name.equals("related"))
            this.getRelated().add((ObservationRelatedComponent) value);
        else if (name.equals("component"))
            this.getComponent().add((ObservationComponentComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Observation.status");
        } else if (name.equals("category")) {
            this.category = new CodeableConcept();
            return this.category;
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("effectiveDateTime")) {
            this.effective = new DateTimeType();
            return this.effective;
        } else if (name.equals("effectivePeriod")) {
            this.effective = new Period();
            return this.effective;
        } else if (name.equals("issued")) {
            throw new FHIRException("Cannot call addChild on a primitive type Observation.issued");
        } else if (name.equals("performer")) {
            return addPerformer();
        } else if (name.equals("valueQuantity")) {
            this.value = new Quantity();
            return this.value;
        } else if (name.equals("valueCodeableConcept")) {
            this.value = new CodeableConcept();
            return this.value;
        } else if (name.equals("valueString")) {
            this.value = new StringType();
            return this.value;
        } else if (name.equals("valueRange")) {
            this.value = new Range();
            return this.value;
        } else if (name.equals("valueRatio")) {
            this.value = new Ratio();
            return this.value;
        } else if (name.equals("valueSampledData")) {
            this.value = new SampledData();
            return this.value;
        } else if (name.equals("valueAttachment")) {
            this.value = new Attachment();
            return this.value;
        } else if (name.equals("valueTime")) {
            this.value = new TimeType();
            return this.value;
        } else if (name.equals("valueDateTime")) {
            this.value = new DateTimeType();
            return this.value;
        } else if (name.equals("valuePeriod")) {
            this.value = new Period();
            return this.value;
        } else if (name.equals("dataAbsentReason")) {
            this.dataAbsentReason = new CodeableConcept();
            return this.dataAbsentReason;
        } else if (name.equals("interpretation")) {
            this.interpretation = new CodeableConcept();
            return this.interpretation;
        } else if (name.equals("comments")) {
            throw new FHIRException("Cannot call addChild on a primitive type Observation.comments");
        } else if (name.equals("bodySite")) {
            this.bodySite = new CodeableConcept();
            return this.bodySite;
        } else if (name.equals("method")) {
            this.method = new CodeableConcept();
            return this.method;
        } else if (name.equals("specimen")) {
            this.specimen = new Reference();
            return this.specimen;
        } else if (name.equals("device")) {
            this.device = new Reference();
            return this.device;
        } else if (name.equals("referenceRange")) {
            return addReferenceRange();
        } else if (name.equals("related")) {
            return addRelated();
        } else if (name.equals("component")) {
            return addComponent();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Observation";
    }

    public Observation copy() {
        Observation dst = new Observation();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        dst.category = category == null ? null : category.copy();
        dst.code = code == null ? null : code.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.effective = effective == null ? null : effective.copy();
        dst.issued = issued == null ? null : issued.copy();
        if (performer != null) {
            dst.performer = new ArrayList<Reference>();
            for (Reference i : performer) dst.performer.add(i.copy());
        }
        ;
        dst.value = value == null ? null : value.copy();
        dst.dataAbsentReason = dataAbsentReason == null ? null : dataAbsentReason.copy();
        dst.interpretation = interpretation == null ? null : interpretation.copy();
        dst.comments = comments == null ? null : comments.copy();
        dst.bodySite = bodySite == null ? null : bodySite.copy();
        dst.method = method == null ? null : method.copy();
        dst.specimen = specimen == null ? null : specimen.copy();
        dst.device = device == null ? null : device.copy();
        if (referenceRange != null) {
            dst.referenceRange = new ArrayList<ObservationReferenceRangeComponent>();
            for (ObservationReferenceRangeComponent i : referenceRange) dst.referenceRange.add(i.copy());
        }
        ;
        if (related != null) {
            dst.related = new ArrayList<ObservationRelatedComponent>();
            for (ObservationRelatedComponent i : related) dst.related.add(i.copy());
        }
        ;
        if (component != null) {
            dst.component = new ArrayList<ObservationComponentComponent>();
            for (ObservationComponentComponent i : component) dst.component.add(i.copy());
        }
        ;
        return dst;
    }

    protected Observation typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Observation))
            return false;
        Observation o = (Observation) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(category, o.category, true) && compareDeep(code, o.code, true) && compareDeep(subject, o.subject, true) && compareDeep(encounter, o.encounter, true) && compareDeep(effective, o.effective, true) && compareDeep(issued, o.issued, true) && compareDeep(performer, o.performer, true) && compareDeep(value, o.value, true) && compareDeep(dataAbsentReason, o.dataAbsentReason, true) && compareDeep(interpretation, o.interpretation, true) && compareDeep(comments, o.comments, true) && compareDeep(bodySite, o.bodySite, true) && compareDeep(method, o.method, true) && compareDeep(specimen, o.specimen, true) && compareDeep(device, o.device, true) && compareDeep(referenceRange, o.referenceRange, true) && compareDeep(related, o.related, true) && compareDeep(component, o.component, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Observation))
            return false;
        Observation o = (Observation) other;
        return compareValues(status, o.status, true) && compareValues(issued, o.issued, true) && compareValues(comments, o.comments, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (category == null || category.isEmpty()) && (code == null || code.isEmpty()) && (subject == null || subject.isEmpty()) && (encounter == null || encounter.isEmpty()) && (effective == null || effective.isEmpty()) && (issued == null || issued.isEmpty()) && (performer == null || performer.isEmpty()) && (value == null || value.isEmpty()) && (dataAbsentReason == null || dataAbsentReason.isEmpty()) && (interpretation == null || interpretation.isEmpty()) && (comments == null || comments.isEmpty()) && (bodySite == null || bodySite.isEmpty()) && (method == null || method.isEmpty()) && (specimen == null || specimen.isEmpty()) && (device == null || device.isEmpty()) && (referenceRange == null || referenceRange.isEmpty()) && (related == null || related.isEmpty()) && (component == null || component.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Observation;
    }

    public static final String SP_DATE = "date";

    public static final String SP_CODE = "code";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_COMPONENTDATAABSENTREASON = "component-data-absent-reason";

    public static final String SP_VALUECONCEPT = "value-concept";

    public static final String SP_VALUEDATE = "value-date";

    public static final String SP_RELATED = "related";

    public static final String SP_PATIENT = "patient";

    public static final String SP_SPECIMEN = "specimen";

    public static final String SP_COMPONENTCODE = "component-code";

    public static final String SP_VALUESTRING = "value-string";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_COMPONENTCODEVALUEX = "component-code-value-[x]";

    public static final String SP_CODEVALUEX = "code-value-[x]";

    public static final String SP_PERFORMER = "performer";

    public static final String SP_VALUEQUANTITY = "value-quantity";

    public static final String SP_COMPONENTVALUEQUANTITY = "component-value-quantity";

    public static final String SP_DATAABSENTREASON = "data-absent-reason";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_RELATEDTYPE = "related-type";

    public static final String SP_RELATEDTARGET = "related-target";

    public static final String SP_COMPONENTVALUESTRING = "component-value-string";

    public static final String SP_COMPONENTVALUECONCEPT = "component-value-concept";

    public static final String SP_CATEGORY = "category";

    public static final String SP_DEVICE = "device";

    public static final String SP_STATUS = "status";
}
