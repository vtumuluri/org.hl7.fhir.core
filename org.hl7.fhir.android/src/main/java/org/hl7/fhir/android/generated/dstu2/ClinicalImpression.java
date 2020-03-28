package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum.ClinicalImpressionStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum.ClinicalImpressionStatus;

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
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 */
public class ClinicalImpression extends DomainResource {

    /**
     * The patient being assessed.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient being assessed.)
     */
    protected Patient patientTarget;

    /**
     * The clinician performing the assessment.
     */
    protected Reference assessor;

    /**
     * The actual object that is the target of the reference (The clinician performing the assessment.)
     */
    protected Practitioner assessorTarget;

    /**
     * Identifies the workflow status of the assessment.
     */
    protected Enumeration<ClinicalImpressionStatus> status;

    /**
     * The point in time at which the assessment was concluded (not when it was recorded).
     */
    protected DateTimeType date;

    /**
     * A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.
     */
    protected StringType description;

    /**
     * A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.
     */
    protected Reference previous;

    /**
     * The actual object that is the target of the reference (A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.)
     */
    protected ClinicalImpression previousTarget;

    /**
     * This a list of the general problems/conditions for a patient.
     */
    protected List<Reference> problem;

    /**
     * The actual objects that are the target of the reference (This a list of the general problems/conditions for a patient.)
     */
    protected List<Resource> problemTarget;

    /**
     * The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.
     */
    protected Type trigger;

    /**
     * One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
     */
    protected List<ClinicalImpressionInvestigationsComponent> investigations;

    /**
     * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
     */
    protected UriType protocol;

    /**
     * A text summary of the investigations and the diagnosis.
     */
    protected StringType summary;

    /**
     * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.
     */
    protected List<ClinicalImpressionFindingComponent> finding;

    /**
     * Diagnoses/conditions resolved since the last assessment.
     */
    protected List<CodeableConcept> resolved;

    /**
     * Diagnosis considered not possible.
     */
    protected List<ClinicalImpressionRuledOutComponent> ruledOut;

    /**
     * Estimate of likely outcome.
     */
    protected StringType prognosis;

    /**
     * Plan of action after assessment.
     */
    protected List<Reference> plan;

    /**
     * The actual objects that are the target of the reference (Plan of action after assessment.)
     */
    protected List<Resource> planTarget;

    /**
     * Actions taken during assessment.
     */
    protected List<Reference> action;

    /**
     * The actual objects that are the target of the reference (Actions taken during assessment.)
     */
    protected List<Resource> actionTarget;

    private static final long serialVersionUID = 1650458630L;

    /*
   * Constructor
   */
    public ClinicalImpression() {
        super();
    }

    /*
   * Constructor
   */
    public ClinicalImpression(Reference patient, Enumeration<ClinicalImpressionStatus> status) {
        super();
        this.patient = patient;
        this.status = status;
    }

    /**
     * @return {@link #patient} (The patient being assessed.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient being assessed.)
     */
    public ClinicalImpression setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient being assessed.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient being assessed.)
     */
    public ClinicalImpression setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #assessor} (The clinician performing the assessment.)
     */
    public Reference getAssessor() {
        if (this.assessor == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.assessor");
            else if (Configuration.doAutoCreate())
                // cc
                this.assessor = new Reference();
        return this.assessor;
    }

    public boolean hasAssessor() {
        return this.assessor != null && !this.assessor.isEmpty();
    }

    /**
     * @param value {@link #assessor} (The clinician performing the assessment.)
     */
    public ClinicalImpression setAssessor(Reference value) {
        this.assessor = value;
        return this;
    }

    /**
     * @return {@link #assessor} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The clinician performing the assessment.)
     */
    public Practitioner getAssessorTarget() {
        if (this.assessorTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.assessor");
            else if (Configuration.doAutoCreate())
                // aa
                this.assessorTarget = new Practitioner();
        return this.assessorTarget;
    }

    /**
     * @param value {@link #assessor} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The clinician performing the assessment.)
     */
    public ClinicalImpression setAssessorTarget(Practitioner value) {
        this.assessorTarget = value;
        return this;
    }

    /**
     * @return {@link #status} (Identifies the workflow status of the assessment.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ClinicalImpressionStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<ClinicalImpressionStatus>(new ClinicalImpressionStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Identifies the workflow status of the assessment.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ClinicalImpression setStatusElement(Enumeration<ClinicalImpressionStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Identifies the workflow status of the assessment.
     */
    public ClinicalImpressionStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Identifies the workflow status of the assessment.
     */
    public ClinicalImpression setStatus(ClinicalImpressionStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ClinicalImpressionStatus>(new ClinicalImpressionStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #date} (The point in time at which the assessment was concluded (not when it was recorded).). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.date");
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
     * @param value {@link #date} (The point in time at which the assessment was concluded (not when it was recorded).). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ClinicalImpression setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The point in time at which the assessment was concluded (not when it was recorded).
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The point in time at which the assessment was concluded (not when it was recorded).
     */
    public ClinicalImpression setDate(Date value) {
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
     * @return {@link #description} (A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.description");
            else if (Configuration.doAutoCreate())
                // bb
                this.description = new StringType();
        return this.description;
    }

    public boolean hasDescriptionElement() {
        return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ClinicalImpression setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.
     */
    public ClinicalImpression setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #previous} (A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.)
     */
    public Reference getPrevious() {
        if (this.previous == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.previous");
            else if (Configuration.doAutoCreate())
                // cc
                this.previous = new Reference();
        return this.previous;
    }

    public boolean hasPrevious() {
        return this.previous != null && !this.previous.isEmpty();
    }

    /**
     * @param value {@link #previous} (A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.)
     */
    public ClinicalImpression setPrevious(Reference value) {
        this.previous = value;
        return this;
    }

    /**
     * @return {@link #previous} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.)
     */
    public ClinicalImpression getPreviousTarget() {
        if (this.previousTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.previous");
            else if (Configuration.doAutoCreate())
                // aa
                this.previousTarget = new ClinicalImpression();
        return this.previousTarget;
    }

    /**
     * @param value {@link #previous} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.)
     */
    public ClinicalImpression setPreviousTarget(ClinicalImpression value) {
        this.previousTarget = value;
        return this;
    }

    /**
     * @return {@link #problem} (This a list of the general problems/conditions for a patient.)
     */
    public List<Reference> getProblem() {
        if (this.problem == null)
            this.problem = new ArrayList<Reference>();
        return this.problem;
    }

    public boolean hasProblem() {
        if (this.problem == null)
            return false;
        for (Reference item : this.problem) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #problem} (This a list of the general problems/conditions for a patient.)
     */
    // syntactic sugar
    public Reference addProblem() {
        // 3
        Reference t = new Reference();
        if (this.problem == null)
            this.problem = new ArrayList<Reference>();
        this.problem.add(t);
        return t;
    }

    // syntactic sugar
    public ClinicalImpression addProblem(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.problem == null)
            this.problem = new ArrayList<Reference>();
        this.problem.add(t);
        return this;
    }

    /**
     * @return {@link #problem} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. This a list of the general problems/conditions for a patient.)
     */
    public List<Resource> getProblemTarget() {
        if (this.problemTarget == null)
            this.problemTarget = new ArrayList<Resource>();
        return this.problemTarget;
    }

    /**
     * @return {@link #trigger} (The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.)
     */
    public Type getTrigger() {
        return this.trigger;
    }

    /**
     * @return {@link #trigger} (The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.)
     */
    public CodeableConcept getTriggerCodeableConcept() throws FHIRException {
        if (!(this.trigger instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.trigger.getClass().getName() + " was encountered");
        return (CodeableConcept) this.trigger;
    }

    public boolean hasTriggerCodeableConcept() {
        return this.trigger instanceof CodeableConcept;
    }

    /**
     * @return {@link #trigger} (The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.)
     */
    public Reference getTriggerReference() throws FHIRException {
        if (!(this.trigger instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.trigger.getClass().getName() + " was encountered");
        return (Reference) this.trigger;
    }

    public boolean hasTriggerReference() {
        return this.trigger instanceof Reference;
    }

    public boolean hasTrigger() {
        return this.trigger != null && !this.trigger.isEmpty();
    }

    /**
     * @param value {@link #trigger} (The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.)
     */
    public ClinicalImpression setTrigger(Type value) {
        this.trigger = value;
        return this;
    }

    /**
     * @return {@link #investigations} (One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.)
     */
    public List<ClinicalImpressionInvestigationsComponent> getInvestigations() {
        if (this.investigations == null)
            this.investigations = new ArrayList<ClinicalImpressionInvestigationsComponent>();
        return this.investigations;
    }

    public boolean hasInvestigations() {
        if (this.investigations == null)
            return false;
        for (ClinicalImpressionInvestigationsComponent item : this.investigations) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #investigations} (One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.)
     */
    // syntactic sugar
    public ClinicalImpressionInvestigationsComponent addInvestigations() {
        // 3
        ClinicalImpressionInvestigationsComponent t = new ClinicalImpressionInvestigationsComponent();
        if (this.investigations == null)
            this.investigations = new ArrayList<ClinicalImpressionInvestigationsComponent>();
        this.investigations.add(t);
        return t;
    }

    // syntactic sugar
    public ClinicalImpression addInvestigations(ClinicalImpressionInvestigationsComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.investigations == null)
            this.investigations = new ArrayList<ClinicalImpressionInvestigationsComponent>();
        this.investigations.add(t);
        return this;
    }

    /**
     * @return {@link #protocol} (Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.). This is the underlying object with id, value and extensions. The accessor "getProtocol" gives direct access to the value
     */
    public UriType getProtocolElement() {
        if (this.protocol == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.protocol");
            else if (Configuration.doAutoCreate())
                // bb
                this.protocol = new UriType();
        return this.protocol;
    }

    public boolean hasProtocolElement() {
        return this.protocol != null && !this.protocol.isEmpty();
    }

    public boolean hasProtocol() {
        return this.protocol != null && !this.protocol.isEmpty();
    }

    /**
     * @param value {@link #protocol} (Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.). This is the underlying object with id, value and extensions. The accessor "getProtocol" gives direct access to the value
     */
    public ClinicalImpression setProtocolElement(UriType value) {
        this.protocol = value;
        return this;
    }

    /**
     * @return Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
     */
    public String getProtocol() {
        return this.protocol == null ? null : this.protocol.getValue();
    }

    /**
     * @param value Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
     */
    public ClinicalImpression setProtocol(String value) {
        if (Utilities.noString(value))
            this.protocol = null;
        else {
            if (this.protocol == null)
                this.protocol = new UriType();
            this.protocol.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #summary} (A text summary of the investigations and the diagnosis.). This is the underlying object with id, value and extensions. The accessor "getSummary" gives direct access to the value
     */
    public StringType getSummaryElement() {
        if (this.summary == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.summary");
            else if (Configuration.doAutoCreate())
                // bb
                this.summary = new StringType();
        return this.summary;
    }

    public boolean hasSummaryElement() {
        return this.summary != null && !this.summary.isEmpty();
    }

    public boolean hasSummary() {
        return this.summary != null && !this.summary.isEmpty();
    }

    /**
     * @param value {@link #summary} (A text summary of the investigations and the diagnosis.). This is the underlying object with id, value and extensions. The accessor "getSummary" gives direct access to the value
     */
    public ClinicalImpression setSummaryElement(StringType value) {
        this.summary = value;
        return this;
    }

    /**
     * @return A text summary of the investigations and the diagnosis.
     */
    public String getSummary() {
        return this.summary == null ? null : this.summary.getValue();
    }

    /**
     * @param value A text summary of the investigations and the diagnosis.
     */
    public ClinicalImpression setSummary(String value) {
        if (Utilities.noString(value))
            this.summary = null;
        else {
            if (this.summary == null)
                this.summary = new StringType();
            this.summary.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #finding} (Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.)
     */
    public List<ClinicalImpressionFindingComponent> getFinding() {
        if (this.finding == null)
            this.finding = new ArrayList<ClinicalImpressionFindingComponent>();
        return this.finding;
    }

    public boolean hasFinding() {
        if (this.finding == null)
            return false;
        for (ClinicalImpressionFindingComponent item : this.finding) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #finding} (Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.)
     */
    // syntactic sugar
    public ClinicalImpressionFindingComponent addFinding() {
        // 3
        ClinicalImpressionFindingComponent t = new ClinicalImpressionFindingComponent();
        if (this.finding == null)
            this.finding = new ArrayList<ClinicalImpressionFindingComponent>();
        this.finding.add(t);
        return t;
    }

    // syntactic sugar
    public ClinicalImpression addFinding(ClinicalImpressionFindingComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.finding == null)
            this.finding = new ArrayList<ClinicalImpressionFindingComponent>();
        this.finding.add(t);
        return this;
    }

    /**
     * @return {@link #resolved} (Diagnoses/conditions resolved since the last assessment.)
     */
    public List<CodeableConcept> getResolved() {
        if (this.resolved == null)
            this.resolved = new ArrayList<CodeableConcept>();
        return this.resolved;
    }

    public boolean hasResolved() {
        if (this.resolved == null)
            return false;
        for (CodeableConcept item : this.resolved) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #resolved} (Diagnoses/conditions resolved since the last assessment.)
     */
    // syntactic sugar
    public CodeableConcept addResolved() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.resolved == null)
            this.resolved = new ArrayList<CodeableConcept>();
        this.resolved.add(t);
        return t;
    }

    // syntactic sugar
    public ClinicalImpression addResolved(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.resolved == null)
            this.resolved = new ArrayList<CodeableConcept>();
        this.resolved.add(t);
        return this;
    }

    /**
     * @return {@link #ruledOut} (Diagnosis considered not possible.)
     */
    public List<ClinicalImpressionRuledOutComponent> getRuledOut() {
        if (this.ruledOut == null)
            this.ruledOut = new ArrayList<ClinicalImpressionRuledOutComponent>();
        return this.ruledOut;
    }

    public boolean hasRuledOut() {
        if (this.ruledOut == null)
            return false;
        for (ClinicalImpressionRuledOutComponent item : this.ruledOut) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #ruledOut} (Diagnosis considered not possible.)
     */
    // syntactic sugar
    public ClinicalImpressionRuledOutComponent addRuledOut() {
        // 3
        ClinicalImpressionRuledOutComponent t = new ClinicalImpressionRuledOutComponent();
        if (this.ruledOut == null)
            this.ruledOut = new ArrayList<ClinicalImpressionRuledOutComponent>();
        this.ruledOut.add(t);
        return t;
    }

    // syntactic sugar
    public ClinicalImpression addRuledOut(ClinicalImpressionRuledOutComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.ruledOut == null)
            this.ruledOut = new ArrayList<ClinicalImpressionRuledOutComponent>();
        this.ruledOut.add(t);
        return this;
    }

    /**
     * @return {@link #prognosis} (Estimate of likely outcome.). This is the underlying object with id, value and extensions. The accessor "getPrognosis" gives direct access to the value
     */
    public StringType getPrognosisElement() {
        if (this.prognosis == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpression.prognosis");
            else if (Configuration.doAutoCreate())
                // bb
                this.prognosis = new StringType();
        return this.prognosis;
    }

    public boolean hasPrognosisElement() {
        return this.prognosis != null && !this.prognosis.isEmpty();
    }

    public boolean hasPrognosis() {
        return this.prognosis != null && !this.prognosis.isEmpty();
    }

    /**
     * @param value {@link #prognosis} (Estimate of likely outcome.). This is the underlying object with id, value and extensions. The accessor "getPrognosis" gives direct access to the value
     */
    public ClinicalImpression setPrognosisElement(StringType value) {
        this.prognosis = value;
        return this;
    }

    /**
     * @return Estimate of likely outcome.
     */
    public String getPrognosis() {
        return this.prognosis == null ? null : this.prognosis.getValue();
    }

    /**
     * @param value Estimate of likely outcome.
     */
    public ClinicalImpression setPrognosis(String value) {
        if (Utilities.noString(value))
            this.prognosis = null;
        else {
            if (this.prognosis == null)
                this.prognosis = new StringType();
            this.prognosis.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #plan} (Plan of action after assessment.)
     */
    public List<Reference> getPlan() {
        if (this.plan == null)
            this.plan = new ArrayList<Reference>();
        return this.plan;
    }

    public boolean hasPlan() {
        if (this.plan == null)
            return false;
        for (Reference item : this.plan) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #plan} (Plan of action after assessment.)
     */
    // syntactic sugar
    public Reference addPlan() {
        // 3
        Reference t = new Reference();
        if (this.plan == null)
            this.plan = new ArrayList<Reference>();
        this.plan.add(t);
        return t;
    }

    // syntactic sugar
    public ClinicalImpression addPlan(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.plan == null)
            this.plan = new ArrayList<Reference>();
        this.plan.add(t);
        return this;
    }

    /**
     * @return {@link #plan} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Plan of action after assessment.)
     */
    public List<Resource> getPlanTarget() {
        if (this.planTarget == null)
            this.planTarget = new ArrayList<Resource>();
        return this.planTarget;
    }

    /**
     * @return {@link #action} (Actions taken during assessment.)
     */
    public List<Reference> getAction() {
        if (this.action == null)
            this.action = new ArrayList<Reference>();
        return this.action;
    }

    public boolean hasAction() {
        if (this.action == null)
            return false;
        for (Reference item : this.action) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #action} (Actions taken during assessment.)
     */
    // syntactic sugar
    public Reference addAction() {
        // 3
        Reference t = new Reference();
        if (this.action == null)
            this.action = new ArrayList<Reference>();
        this.action.add(t);
        return t;
    }

    // syntactic sugar
    public ClinicalImpression addAction(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.action == null)
            this.action = new ArrayList<Reference>();
        this.action.add(t);
        return this;
    }

    /**
     * @return {@link #action} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Actions taken during assessment.)
     */
    public List<Resource> getActionTarget() {
        if (this.actionTarget == null)
            this.actionTarget = new ArrayList<Resource>();
        return this.actionTarget;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient being assessed.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("assessor", "Reference(Practitioner)", "The clinician performing the assessment.", 0, java.lang.Integer.MAX_VALUE, assessor));
        childrenList.add(new Property("status", "code", "Identifies the workflow status of the assessment.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("date", "dateTime", "The point in time at which the assessment was concluded (not when it was recorded).", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("description", "string", "A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("previous", "Reference(ClinicalImpression)", "A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.", 0, java.lang.Integer.MAX_VALUE, previous));
        childrenList.add(new Property("problem", "Reference(Condition|AllergyIntolerance)", "This a list of the general problems/conditions for a patient.", 0, java.lang.Integer.MAX_VALUE, problem));
        childrenList.add(new Property("trigger[x]", "CodeableConcept|Reference(Any)", "The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.", 0, java.lang.Integer.MAX_VALUE, trigger));
        childrenList.add(new Property("investigations", "", "One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.", 0, java.lang.Integer.MAX_VALUE, investigations));
        childrenList.add(new Property("protocol", "uri", "Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.", 0, java.lang.Integer.MAX_VALUE, protocol));
        childrenList.add(new Property("summary", "string", "A text summary of the investigations and the diagnosis.", 0, java.lang.Integer.MAX_VALUE, summary));
        childrenList.add(new Property("finding", "", "Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.", 0, java.lang.Integer.MAX_VALUE, finding));
        childrenList.add(new Property("resolved", "CodeableConcept", "Diagnoses/conditions resolved since the last assessment.", 0, java.lang.Integer.MAX_VALUE, resolved));
        childrenList.add(new Property("ruledOut", "", "Diagnosis considered not possible.", 0, java.lang.Integer.MAX_VALUE, ruledOut));
        childrenList.add(new Property("prognosis", "string", "Estimate of likely outcome.", 0, java.lang.Integer.MAX_VALUE, prognosis));
        childrenList.add(new Property("plan", "Reference(CarePlan|Appointment|CommunicationRequest|DeviceUseRequest|DiagnosticOrder|MedicationOrder|NutritionOrder|Order|ProcedureRequest|ProcessRequest|ReferralRequest|SupplyRequest|VisionPrescription)", "Plan of action after assessment.", 0, java.lang.Integer.MAX_VALUE, plan));
        childrenList.add(new Property("action", "Reference(ReferralRequest|ProcedureRequest|Procedure|MedicationOrder|DiagnosticOrder|NutritionOrder|SupplyRequest|Appointment)", "Actions taken during assessment.", 0, java.lang.Integer.MAX_VALUE, action));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("assessor"))
            // Reference
            this.assessor = castToReference(value);
        else if (name.equals("status"))
            // Enumeration<ClinicalImpressionStatus>
            this.status = new ClinicalImpressionStatusEnumFactory().fromType(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("previous"))
            // Reference
            this.previous = castToReference(value);
        else if (name.equals("problem"))
            this.getProblem().add(castToReference(value));
        else if (name.equals("trigger[x]"))
            // Type
            this.trigger = (Type) value;
        else if (name.equals("investigations"))
            this.getInvestigations().add((ClinicalImpressionInvestigationsComponent) value);
        else if (name.equals("protocol"))
            // UriType
            this.protocol = castToUri(value);
        else if (name.equals("summary"))
            // StringType
            this.summary = castToString(value);
        else if (name.equals("finding"))
            this.getFinding().add((ClinicalImpressionFindingComponent) value);
        else if (name.equals("resolved"))
            this.getResolved().add(castToCodeableConcept(value));
        else if (name.equals("ruledOut"))
            this.getRuledOut().add((ClinicalImpressionRuledOutComponent) value);
        else if (name.equals("prognosis"))
            // StringType
            this.prognosis = castToString(value);
        else if (name.equals("plan"))
            this.getPlan().add(castToReference(value));
        else if (name.equals("action"))
            this.getAction().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("assessor")) {
            this.assessor = new Reference();
            return this.assessor;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClinicalImpression.status");
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClinicalImpression.date");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClinicalImpression.description");
        } else if (name.equals("previous")) {
            this.previous = new Reference();
            return this.previous;
        } else if (name.equals("problem")) {
            return addProblem();
        } else if (name.equals("triggerCodeableConcept")) {
            this.trigger = new CodeableConcept();
            return this.trigger;
        } else if (name.equals("triggerReference")) {
            this.trigger = new Reference();
            return this.trigger;
        } else if (name.equals("investigations")) {
            return addInvestigations();
        } else if (name.equals("protocol")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClinicalImpression.protocol");
        } else if (name.equals("summary")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClinicalImpression.summary");
        } else if (name.equals("finding")) {
            return addFinding();
        } else if (name.equals("resolved")) {
            return addResolved();
        } else if (name.equals("ruledOut")) {
            return addRuledOut();
        } else if (name.equals("prognosis")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClinicalImpression.prognosis");
        } else if (name.equals("plan")) {
            return addPlan();
        } else if (name.equals("action")) {
            return addAction();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ClinicalImpression";
    }

    public ClinicalImpression copy() {
        ClinicalImpression dst = new ClinicalImpression();
        copyValues(dst);
        dst.patient = patient == null ? null : patient.copy();
        dst.assessor = assessor == null ? null : assessor.copy();
        dst.status = status == null ? null : status.copy();
        dst.date = date == null ? null : date.copy();
        dst.description = description == null ? null : description.copy();
        dst.previous = previous == null ? null : previous.copy();
        if (problem != null) {
            dst.problem = new ArrayList<Reference>();
            for (Reference i : problem) dst.problem.add(i.copy());
        }
        ;
        dst.trigger = trigger == null ? null : trigger.copy();
        if (investigations != null) {
            dst.investigations = new ArrayList<ClinicalImpressionInvestigationsComponent>();
            for (ClinicalImpressionInvestigationsComponent i : investigations) dst.investigations.add(i.copy());
        }
        ;
        dst.protocol = protocol == null ? null : protocol.copy();
        dst.summary = summary == null ? null : summary.copy();
        if (finding != null) {
            dst.finding = new ArrayList<ClinicalImpressionFindingComponent>();
            for (ClinicalImpressionFindingComponent i : finding) dst.finding.add(i.copy());
        }
        ;
        if (resolved != null) {
            dst.resolved = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : resolved) dst.resolved.add(i.copy());
        }
        ;
        if (ruledOut != null) {
            dst.ruledOut = new ArrayList<ClinicalImpressionRuledOutComponent>();
            for (ClinicalImpressionRuledOutComponent i : ruledOut) dst.ruledOut.add(i.copy());
        }
        ;
        dst.prognosis = prognosis == null ? null : prognosis.copy();
        if (plan != null) {
            dst.plan = new ArrayList<Reference>();
            for (Reference i : plan) dst.plan.add(i.copy());
        }
        ;
        if (action != null) {
            dst.action = new ArrayList<Reference>();
            for (Reference i : action) dst.action.add(i.copy());
        }
        ;
        return dst;
    }

    protected ClinicalImpression typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ClinicalImpression))
            return false;
        ClinicalImpression o = (ClinicalImpression) other;
        return compareDeep(patient, o.patient, true) && compareDeep(assessor, o.assessor, true) && compareDeep(status, o.status, true) && compareDeep(date, o.date, true) && compareDeep(description, o.description, true) && compareDeep(previous, o.previous, true) && compareDeep(problem, o.problem, true) && compareDeep(trigger, o.trigger, true) && compareDeep(investigations, o.investigations, true) && compareDeep(protocol, o.protocol, true) && compareDeep(summary, o.summary, true) && compareDeep(finding, o.finding, true) && compareDeep(resolved, o.resolved, true) && compareDeep(ruledOut, o.ruledOut, true) && compareDeep(prognosis, o.prognosis, true) && compareDeep(plan, o.plan, true) && compareDeep(action, o.action, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ClinicalImpression))
            return false;
        ClinicalImpression o = (ClinicalImpression) other;
        return compareValues(status, o.status, true) && compareValues(date, o.date, true) && compareValues(description, o.description, true) && compareValues(protocol, o.protocol, true) && compareValues(summary, o.summary, true) && compareValues(prognosis, o.prognosis, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (patient == null || patient.isEmpty()) && (assessor == null || assessor.isEmpty()) && (status == null || status.isEmpty()) && (date == null || date.isEmpty()) && (description == null || description.isEmpty()) && (previous == null || previous.isEmpty()) && (problem == null || problem.isEmpty()) && (trigger == null || trigger.isEmpty()) && (investigations == null || investigations.isEmpty()) && (protocol == null || protocol.isEmpty()) && (summary == null || summary.isEmpty()) && (finding == null || finding.isEmpty()) && (resolved == null || resolved.isEmpty()) && (ruledOut == null || ruledOut.isEmpty()) && (prognosis == null || prognosis.isEmpty()) && (plan == null || plan.isEmpty()) && (action == null || action.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ClinicalImpression;
    }

    public static final String SP_DATE = "date";

    public static final String SP_PREVIOUS = "previous";

    public static final String SP_ASSESSOR = "assessor";

    public static final String SP_TRIGGER = "trigger";

    public static final String SP_FINDING = "finding";

    public static final String SP_RULEDOUT = "ruledout";

    public static final String SP_PROBLEM = "problem";

    public static final String SP_PATIENT = "patient";

    public static final String SP_INVESTIGATION = "investigation";

    public static final String SP_ACTION = "action";

    public static final String SP_TRIGGERCODE = "trigger-code";

    public static final String SP_PLAN = "plan";

    public static final String SP_RESOLVED = "resolved";

    public static final String SP_STATUS = "status";
}
