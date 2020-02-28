package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DiagnosticReportEnum.DiagnosticReportStatus;
import org.hl7.fhir.android.generated.dstu2.DiagnosticReportEnum.DiagnosticReportStatusEnumFactory;

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
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 */
public class DiagnosticReport extends DomainResource {

    /**
     * The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider.
     */
    protected List<Identifier> identifier;

    /**
     * The status of the diagnostic report as a whole.
     */
    protected Enumeration<DiagnosticReportStatus> status;

    /**
     * A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
     */
    protected CodeableConcept category;

    /**
     * A code or name that describes this diagnostic report.
     */
    protected CodeableConcept code;

    /**
     * The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.)
     */
    protected Resource subjectTarget;

    /**
     * The link to the health care event (encounter) when the order was made.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (The link to the health care event (encounter) when the order was made.)
     */
    protected Encounter encounterTarget;

    /**
     * The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.
     */
    protected Type effective;

    /**
     * The date and time that this version of the report was released from the source diagnostic service.
     */
    protected InstantType issued;

    /**
     * The diagnostic service that is responsible for issuing the report.
     */
    protected Reference performer;

    /**
     * The actual object that is the target of the reference (The diagnostic service that is responsible for issuing the report.)
     */
    protected Resource performerTarget;

    /**
     * Details concerning a test or procedure requested.
     */
    protected List<Reference> request;

    /**
     * The actual objects that are the target of the reference (Details concerning a test or procedure requested.)
     */
    protected List<Resource> requestTarget;

    /**
     * Details about the specimens on which this diagnostic report is based.
     */
    protected List<Reference> specimen;

    /**
     * The actual objects that are the target of the reference (Details about the specimens on which this diagnostic report is based.)
     */
    protected List<Specimen> specimenTarget;

    /**
     * Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. "atomic" results), or they can be grouping observations that include references to other members of the group (e.g. "panels").
     */
    protected List<Reference> result;

    /**
     * The actual objects that are the target of the reference (Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. "atomic" results), or they can be grouping observations that include references to other members of the group (e.g. "panels").)
     */
    protected List<Observation> resultTarget;

    /**
     * One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
     */
    protected List<Reference> imagingStudy;

    /**
     * The actual objects that are the target of the reference (One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.)
     */
    protected List<Resource> imagingStudyTarget;

    /**
     * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
     */
    protected List<DiagnosticReportImageComponent> image;

    /**
     * Concise and clinically contextualized narrative interpretation of the diagnostic report.
     */
    protected StringType conclusion;

    /**
     * Codes for the conclusion.
     */
    protected List<CodeableConcept> codedDiagnosis;

    /**
     * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
     */
    protected List<Attachment> presentedForm;

    private static final long serialVersionUID = 920334551L;

    /*
   * Constructor
   */
    public DiagnosticReport() {
        super();
    }

    /*
   * Constructor
   */
    public DiagnosticReport(Enumeration<DiagnosticReportStatus> status, CodeableConcept code, Reference subject, Type effective, InstantType issued, Reference performer) {
        super();
        this.status = status;
        this.code = code;
        this.subject = subject;
        this.effective = effective;
        this.issued = issued;
        this.performer = performer;
    }

    /**
     * @return {@link #identifier} (The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider.)
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
     * @return {@link #identifier} (The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider.)
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
    public DiagnosticReport addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #status} (The status of the diagnostic report as a whole.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DiagnosticReportStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReport.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<DiagnosticReportStatus>(new DiagnosticReportStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the diagnostic report as a whole.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public DiagnosticReport setStatusElement(Enumeration<DiagnosticReportStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the diagnostic report as a whole.
     */
    public DiagnosticReportStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the diagnostic report as a whole.
     */
    public DiagnosticReport setStatus(DiagnosticReportStatus value) {
        if (this.status == null)
            this.status = new Enumeration<DiagnosticReportStatus>(new DiagnosticReportStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #category} (A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.)
     */
    public CodeableConcept getCategory() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReport.category");
            else if (Configuration.doAutoCreate())
                // cc
                this.category = new CodeableConcept();
        return this.category;
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.)
     */
    public DiagnosticReport setCategory(CodeableConcept value) {
        this.category = value;
        return this;
    }

    /**
     * @return {@link #code} (A code or name that describes this diagnostic report.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReport.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A code or name that describes this diagnostic report.)
     */
    public DiagnosticReport setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #subject} (The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReport.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.)
     */
    public DiagnosticReport setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.)
     */
    public DiagnosticReport setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (The link to the health care event (encounter) when the order was made.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReport.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The link to the health care event (encounter) when the order was made.)
     */
    public DiagnosticReport setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The link to the health care event (encounter) when the order was made.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReport.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The link to the health care event (encounter) when the order was made.)
     */
    public DiagnosticReport setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #effective} (The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.)
     */
    public Type getEffective() {
        return this.effective;
    }

    /**
     * @return {@link #effective} (The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.)
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
     * @return {@link #effective} (The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.)
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
     * @param value {@link #effective} (The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.)
     */
    public DiagnosticReport setEffective(Type value) {
        this.effective = value;
        return this;
    }

    /**
     * @return {@link #issued} (The date and time that this version of the report was released from the source diagnostic service.). This is the underlying object with id, value and extensions. The accessor "getIssued" gives direct access to the value
     */
    public InstantType getIssuedElement() {
        if (this.issued == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReport.issued");
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
     * @param value {@link #issued} (The date and time that this version of the report was released from the source diagnostic service.). This is the underlying object with id, value and extensions. The accessor "getIssued" gives direct access to the value
     */
    public DiagnosticReport setIssuedElement(InstantType value) {
        this.issued = value;
        return this;
    }

    /**
     * @return The date and time that this version of the report was released from the source diagnostic service.
     */
    public Date getIssued() {
        return this.issued == null ? null : this.issued.getValue();
    }

    /**
     * @param value The date and time that this version of the report was released from the source diagnostic service.
     */
    public DiagnosticReport setIssued(Date value) {
        if (this.issued == null)
            this.issued = new InstantType();
        this.issued.setValue(value);
        return this;
    }

    /**
     * @return {@link #performer} (The diagnostic service that is responsible for issuing the report.)
     */
    public Reference getPerformer() {
        if (this.performer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReport.performer");
            else if (Configuration.doAutoCreate())
                // cc
                this.performer = new Reference();
        return this.performer;
    }

    public boolean hasPerformer() {
        return this.performer != null && !this.performer.isEmpty();
    }

    /**
     * @param value {@link #performer} (The diagnostic service that is responsible for issuing the report.)
     */
    public DiagnosticReport setPerformer(Reference value) {
        this.performer = value;
        return this;
    }

    /**
     * @return {@link #performer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The diagnostic service that is responsible for issuing the report.)
     */
    public Resource getPerformerTarget() {
        return this.performerTarget;
    }

    /**
     * @param value {@link #performer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The diagnostic service that is responsible for issuing the report.)
     */
    public DiagnosticReport setPerformerTarget(Resource value) {
        this.performerTarget = value;
        return this;
    }

    /**
     * @return {@link #request} (Details concerning a test or procedure requested.)
     */
    public List<Reference> getRequest() {
        if (this.request == null)
            this.request = new ArrayList<Reference>();
        return this.request;
    }

    public boolean hasRequest() {
        if (this.request == null)
            return false;
        for (Reference item : this.request) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #request} (Details concerning a test or procedure requested.)
     */
    // syntactic sugar
    public Reference addRequest() {
        // 3
        Reference t = new Reference();
        if (this.request == null)
            this.request = new ArrayList<Reference>();
        this.request.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticReport addRequest(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.request == null)
            this.request = new ArrayList<Reference>();
        this.request.add(t);
        return this;
    }

    /**
     * @return {@link #request} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Details concerning a test or procedure requested.)
     */
    public List<Resource> getRequestTarget() {
        if (this.requestTarget == null)
            this.requestTarget = new ArrayList<Resource>();
        return this.requestTarget;
    }

    /**
     * @return {@link #specimen} (Details about the specimens on which this diagnostic report is based.)
     */
    public List<Reference> getSpecimen() {
        if (this.specimen == null)
            this.specimen = new ArrayList<Reference>();
        return this.specimen;
    }

    public boolean hasSpecimen() {
        if (this.specimen == null)
            return false;
        for (Reference item : this.specimen) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #specimen} (Details about the specimens on which this diagnostic report is based.)
     */
    // syntactic sugar
    public Reference addSpecimen() {
        // 3
        Reference t = new Reference();
        if (this.specimen == null)
            this.specimen = new ArrayList<Reference>();
        this.specimen.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticReport addSpecimen(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.specimen == null)
            this.specimen = new ArrayList<Reference>();
        this.specimen.add(t);
        return this;
    }

    /**
     * @return {@link #specimen} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Details about the specimens on which this diagnostic report is based.)
     */
    public List<Specimen> getSpecimenTarget() {
        if (this.specimenTarget == null)
            this.specimenTarget = new ArrayList<Specimen>();
        return this.specimenTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #specimen} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Details about the specimens on which this diagnostic report is based.)
     */
    public Specimen addSpecimenTarget() {
        Specimen r = new Specimen();
        if (this.specimenTarget == null)
            this.specimenTarget = new ArrayList<Specimen>();
        this.specimenTarget.add(r);
        return r;
    }

    /**
     * @return {@link #result} (Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. "atomic" results), or they can be grouping observations that include references to other members of the group (e.g. "panels").)
     */
    public List<Reference> getResult() {
        if (this.result == null)
            this.result = new ArrayList<Reference>();
        return this.result;
    }

    public boolean hasResult() {
        if (this.result == null)
            return false;
        for (Reference item : this.result) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #result} (Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. "atomic" results), or they can be grouping observations that include references to other members of the group (e.g. "panels").)
     */
    // syntactic sugar
    public Reference addResult() {
        // 3
        Reference t = new Reference();
        if (this.result == null)
            this.result = new ArrayList<Reference>();
        this.result.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticReport addResult(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.result == null)
            this.result = new ArrayList<Reference>();
        this.result.add(t);
        return this;
    }

    /**
     * @return {@link #result} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. "atomic" results), or they can be grouping observations that include references to other members of the group (e.g. "panels").)
     */
    public List<Observation> getResultTarget() {
        if (this.resultTarget == null)
            this.resultTarget = new ArrayList<Observation>();
        return this.resultTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #result} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. "atomic" results), or they can be grouping observations that include references to other members of the group (e.g. "panels").)
     */
    public Observation addResultTarget() {
        Observation r = new Observation();
        if (this.resultTarget == null)
            this.resultTarget = new ArrayList<Observation>();
        this.resultTarget.add(r);
        return r;
    }

    /**
     * @return {@link #imagingStudy} (One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.)
     */
    public List<Reference> getImagingStudy() {
        if (this.imagingStudy == null)
            this.imagingStudy = new ArrayList<Reference>();
        return this.imagingStudy;
    }

    public boolean hasImagingStudy() {
        if (this.imagingStudy == null)
            return false;
        for (Reference item : this.imagingStudy) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #imagingStudy} (One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.)
     */
    // syntactic sugar
    public Reference addImagingStudy() {
        // 3
        Reference t = new Reference();
        if (this.imagingStudy == null)
            this.imagingStudy = new ArrayList<Reference>();
        this.imagingStudy.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticReport addImagingStudy(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.imagingStudy == null)
            this.imagingStudy = new ArrayList<Reference>();
        this.imagingStudy.add(t);
        return this;
    }

    /**
     * @return {@link #imagingStudy} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.)
     */
    public List<Resource> getImagingStudyTarget() {
        if (this.imagingStudyTarget == null)
            this.imagingStudyTarget = new ArrayList<Resource>();
        return this.imagingStudyTarget;
    }

    /**
     * @return {@link #image} (A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).)
     */
    public List<DiagnosticReportImageComponent> getImage() {
        if (this.image == null)
            this.image = new ArrayList<DiagnosticReportImageComponent>();
        return this.image;
    }

    public boolean hasImage() {
        if (this.image == null)
            return false;
        for (DiagnosticReportImageComponent item : this.image) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #image} (A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).)
     */
    // syntactic sugar
    public DiagnosticReportImageComponent addImage() {
        // 3
        DiagnosticReportImageComponent t = new DiagnosticReportImageComponent();
        if (this.image == null)
            this.image = new ArrayList<DiagnosticReportImageComponent>();
        this.image.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticReport addImage(DiagnosticReportImageComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.image == null)
            this.image = new ArrayList<DiagnosticReportImageComponent>();
        this.image.add(t);
        return this;
    }

    /**
     * @return {@link #conclusion} (Concise and clinically contextualized narrative interpretation of the diagnostic report.). This is the underlying object with id, value and extensions. The accessor "getConclusion" gives direct access to the value
     */
    public StringType getConclusionElement() {
        if (this.conclusion == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReport.conclusion");
            else if (Configuration.doAutoCreate())
                // bb
                this.conclusion = new StringType();
        return this.conclusion;
    }

    public boolean hasConclusionElement() {
        return this.conclusion != null && !this.conclusion.isEmpty();
    }

    public boolean hasConclusion() {
        return this.conclusion != null && !this.conclusion.isEmpty();
    }

    /**
     * @param value {@link #conclusion} (Concise and clinically contextualized narrative interpretation of the diagnostic report.). This is the underlying object with id, value and extensions. The accessor "getConclusion" gives direct access to the value
     */
    public DiagnosticReport setConclusionElement(StringType value) {
        this.conclusion = value;
        return this;
    }

    /**
     * @return Concise and clinically contextualized narrative interpretation of the diagnostic report.
     */
    public String getConclusion() {
        return this.conclusion == null ? null : this.conclusion.getValue();
    }

    /**
     * @param value Concise and clinically contextualized narrative interpretation of the diagnostic report.
     */
    public DiagnosticReport setConclusion(String value) {
        if (Utilities.noString(value))
            this.conclusion = null;
        else {
            if (this.conclusion == null)
                this.conclusion = new StringType();
            this.conclusion.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #codedDiagnosis} (Codes for the conclusion.)
     */
    public List<CodeableConcept> getCodedDiagnosis() {
        if (this.codedDiagnosis == null)
            this.codedDiagnosis = new ArrayList<CodeableConcept>();
        return this.codedDiagnosis;
    }

    public boolean hasCodedDiagnosis() {
        if (this.codedDiagnosis == null)
            return false;
        for (CodeableConcept item : this.codedDiagnosis) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #codedDiagnosis} (Codes for the conclusion.)
     */
    // syntactic sugar
    public CodeableConcept addCodedDiagnosis() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.codedDiagnosis == null)
            this.codedDiagnosis = new ArrayList<CodeableConcept>();
        this.codedDiagnosis.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticReport addCodedDiagnosis(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.codedDiagnosis == null)
            this.codedDiagnosis = new ArrayList<CodeableConcept>();
        this.codedDiagnosis.add(t);
        return this;
    }

    /**
     * @return {@link #presentedForm} (Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.)
     */
    public List<Attachment> getPresentedForm() {
        if (this.presentedForm == null)
            this.presentedForm = new ArrayList<Attachment>();
        return this.presentedForm;
    }

    public boolean hasPresentedForm() {
        if (this.presentedForm == null)
            return false;
        for (Attachment item : this.presentedForm) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #presentedForm} (Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.)
     */
    // syntactic sugar
    public Attachment addPresentedForm() {
        // 3
        Attachment t = new Attachment();
        if (this.presentedForm == null)
            this.presentedForm = new ArrayList<Attachment>();
        this.presentedForm.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticReport addPresentedForm(Attachment t) {
        // 3
        if (t == null)
            return this;
        if (this.presentedForm == null)
            this.presentedForm = new ArrayList<Attachment>();
        this.presentedForm.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "The status of the diagnostic report as a whole.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("category", "CodeableConcept", "A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("code", "CodeableConcept", "A code or name that describes this diagnostic report.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("subject", "Reference(Patient|Group|Device|Location)", "The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "The link to the health care event (encounter) when the order was made.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("effective[x]", "dateTime|Period", "The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.", 0, java.lang.Integer.MAX_VALUE, effective));
        childrenList.add(new Property("issued", "instant", "The date and time that this version of the report was released from the source diagnostic service.", 0, java.lang.Integer.MAX_VALUE, issued));
        childrenList.add(new Property("performer", "Reference(Practitioner|Organization)", "The diagnostic service that is responsible for issuing the report.", 0, java.lang.Integer.MAX_VALUE, performer));
        childrenList.add(new Property("request", "Reference(DiagnosticOrder|ProcedureRequest|ReferralRequest)", "Details concerning a test or procedure requested.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("specimen", "Reference(Specimen)", "Details about the specimens on which this diagnostic report is based.", 0, java.lang.Integer.MAX_VALUE, specimen));
        childrenList.add(new Property("result", "Reference(Observation)", "Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. \"atomic\" results), or they can be grouping observations that include references to other members of the group (e.g. \"panels\").", 0, java.lang.Integer.MAX_VALUE, result));
        childrenList.add(new Property("imagingStudy", "Reference(ImagingStudy|ImagingObjectSelection)", "One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.", 0, java.lang.Integer.MAX_VALUE, imagingStudy));
        childrenList.add(new Property("image", "", "A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).", 0, java.lang.Integer.MAX_VALUE, image));
        childrenList.add(new Property("conclusion", "string", "Concise and clinically contextualized narrative interpretation of the diagnostic report.", 0, java.lang.Integer.MAX_VALUE, conclusion));
        childrenList.add(new Property("codedDiagnosis", "CodeableConcept", "Codes for the conclusion.", 0, java.lang.Integer.MAX_VALUE, codedDiagnosis));
        childrenList.add(new Property("presentedForm", "Attachment", "Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.", 0, java.lang.Integer.MAX_VALUE, presentedForm));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
            // Enumeration<DiagnosticReportStatus>
            this.status = new DiagnosticReportStatusEnumFactory().fromType(value);
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
            // Reference
            this.performer = castToReference(value);
        else if (name.equals("request"))
            this.getRequest().add(castToReference(value));
        else if (name.equals("specimen"))
            this.getSpecimen().add(castToReference(value));
        else if (name.equals("result"))
            this.getResult().add(castToReference(value));
        else if (name.equals("imagingStudy"))
            this.getImagingStudy().add(castToReference(value));
        else if (name.equals("image"))
            this.getImage().add((DiagnosticReportImageComponent) value);
        else if (name.equals("conclusion"))
            // StringType
            this.conclusion = castToString(value);
        else if (name.equals("codedDiagnosis"))
            this.getCodedDiagnosis().add(castToCodeableConcept(value));
        else if (name.equals("presentedForm"))
            this.getPresentedForm().add(castToAttachment(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type DiagnosticReport.status");
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
            throw new FHIRException("Cannot call addChild on a primitive type DiagnosticReport.issued");
        } else if (name.equals("performer")) {
            this.performer = new Reference();
            return this.performer;
        } else if (name.equals("request")) {
            return addRequest();
        } else if (name.equals("specimen")) {
            return addSpecimen();
        } else if (name.equals("result")) {
            return addResult();
        } else if (name.equals("imagingStudy")) {
            return addImagingStudy();
        } else if (name.equals("image")) {
            return addImage();
        } else if (name.equals("conclusion")) {
            throw new FHIRException("Cannot call addChild on a primitive type DiagnosticReport.conclusion");
        } else if (name.equals("codedDiagnosis")) {
            return addCodedDiagnosis();
        } else if (name.equals("presentedForm")) {
            return addPresentedForm();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "DiagnosticReport";
    }

    public DiagnosticReport copy() {
        DiagnosticReport dst = new DiagnosticReport();
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
        dst.performer = performer == null ? null : performer.copy();
        if (request != null) {
            dst.request = new ArrayList<Reference>();
            for (Reference i : request) dst.request.add(i.copy());
        }
        ;
        if (specimen != null) {
            dst.specimen = new ArrayList<Reference>();
            for (Reference i : specimen) dst.specimen.add(i.copy());
        }
        ;
        if (result != null) {
            dst.result = new ArrayList<Reference>();
            for (Reference i : result) dst.result.add(i.copy());
        }
        ;
        if (imagingStudy != null) {
            dst.imagingStudy = new ArrayList<Reference>();
            for (Reference i : imagingStudy) dst.imagingStudy.add(i.copy());
        }
        ;
        if (image != null) {
            dst.image = new ArrayList<DiagnosticReportImageComponent>();
            for (DiagnosticReportImageComponent i : image) dst.image.add(i.copy());
        }
        ;
        dst.conclusion = conclusion == null ? null : conclusion.copy();
        if (codedDiagnosis != null) {
            dst.codedDiagnosis = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : codedDiagnosis) dst.codedDiagnosis.add(i.copy());
        }
        ;
        if (presentedForm != null) {
            dst.presentedForm = new ArrayList<Attachment>();
            for (Attachment i : presentedForm) dst.presentedForm.add(i.copy());
        }
        ;
        return dst;
    }

    protected DiagnosticReport typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DiagnosticReport))
            return false;
        DiagnosticReport o = (DiagnosticReport) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(category, o.category, true) && compareDeep(code, o.code, true) && compareDeep(subject, o.subject, true) && compareDeep(encounter, o.encounter, true) && compareDeep(effective, o.effective, true) && compareDeep(issued, o.issued, true) && compareDeep(performer, o.performer, true) && compareDeep(request, o.request, true) && compareDeep(specimen, o.specimen, true) && compareDeep(result, o.result, true) && compareDeep(imagingStudy, o.imagingStudy, true) && compareDeep(image, o.image, true) && compareDeep(conclusion, o.conclusion, true) && compareDeep(codedDiagnosis, o.codedDiagnosis, true) && compareDeep(presentedForm, o.presentedForm, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DiagnosticReport))
            return false;
        DiagnosticReport o = (DiagnosticReport) other;
        return compareValues(status, o.status, true) && compareValues(issued, o.issued, true) && compareValues(conclusion, o.conclusion, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (category == null || category.isEmpty()) && (code == null || code.isEmpty()) && (subject == null || subject.isEmpty()) && (encounter == null || encounter.isEmpty()) && (effective == null || effective.isEmpty()) && (issued == null || issued.isEmpty()) && (performer == null || performer.isEmpty()) && (request == null || request.isEmpty()) && (specimen == null || specimen.isEmpty()) && (result == null || result.isEmpty()) && (imagingStudy == null || imagingStudy.isEmpty()) && (image == null || image.isEmpty()) && (conclusion == null || conclusion.isEmpty()) && (codedDiagnosis == null || codedDiagnosis.isEmpty()) && (presentedForm == null || presentedForm.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.DiagnosticReport;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_IMAGE = "image";

    public static final String SP_REQUEST = "request";

    public static final String SP_PERFORMER = "performer";

    public static final String SP_CODE = "code";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_DIAGNOSIS = "diagnosis";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_RESULT = "result";

    public static final String SP_PATIENT = "patient";

    public static final String SP_SPECIMEN = "specimen";

    public static final String SP_ISSUED = "issued";

    public static final String SP_CATEGORY = "category";

    public static final String SP_STATUS = "status";
}
