package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.ProcedureEnum.ProcedureStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ProcedureEnum.ProcedureStatus;

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
 * An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.
 */
public class Procedure extends DomainResource {

    /**
     * This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    protected List<Identifier> identifier;

    /**
     * The person, animal or group on which the procedure was performed.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (The person, animal or group on which the procedure was performed.)
     */
    protected Resource subjectTarget;

    /**
     * A code specifying the state of the procedure. Generally this will be in-progress or completed state.
     */
    protected Enumeration<ProcedureStatus> status;

    /**
     * A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
     */
    protected CodeableConcept category;

    /**
     * The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. "Laparoscopic Appendectomy").
     */
    protected CodeableConcept code;

    /**
     * Set this to true if the record is saying that the procedure was NOT performed.
     */
    protected BooleanType notPerformed;

    /**
     * A code indicating why the procedure was not performed.
     */
    protected List<CodeableConcept> reasonNotPerformed;

    /**
     * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
     */
    protected List<CodeableConcept> bodySite;

    /**
     * The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text.
     */
    protected Type reason;

    /**
     * Limited to 'real' people rather than equipment.
     */
    protected List<ProcedurePerformerComponent> performer;

    /**
     * The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
     */
    protected Type performed;

    /**
     * The encounter during which the procedure was performed.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (The encounter during which the procedure was performed.)
     */
    protected Encounter encounterTarget;

    /**
     * The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.
     */
    protected Reference location;

    /**
     * The actual object that is the target of the reference (The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.)
     */
    protected Location locationTarget;

    /**
     * The outcome of the procedure - did it resolve reasons for the procedure being performed?
     */
    protected CodeableConcept outcome;

    /**
     * This could be a histology result, pathology report, surgical report, etc..
     */
    protected List<Reference> report;

    /**
     * The actual objects that are the target of the reference (This could be a histology result, pathology report, surgical report, etc..)
     */
    protected List<DiagnosticReport> reportTarget;

    /**
     * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.
     */
    protected List<CodeableConcept> complication;

    /**
     * If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used.
     */
    protected List<CodeableConcept> followUp;

    /**
     * A reference to a resource that contains details of the request for this procedure.
     */
    protected Reference request;

    /**
     * The actual object that is the target of the reference (A reference to a resource that contains details of the request for this procedure.)
     */
    protected Resource requestTarget;

    /**
     * Any other notes about the procedure.  E.g. the operative notes.
     */
    protected List<Annotation> notes;

    /**
     * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
     */
    protected List<ProcedureFocalDeviceComponent> focalDevice;

    /**
     * Identifies medications, devices and any other substance used as part of the procedure.
     */
    protected List<Reference> used;

    /**
     * The actual objects that are the target of the reference (Identifies medications, devices and any other substance used as part of the procedure.)
     */
    protected List<Resource> usedTarget;

    private static final long serialVersionUID = -489125036L;

    /*
   * Constructor
   */
    public Procedure() {
        super();
    }

    /*
   * Constructor
   */
    public Procedure(Reference subject, Enumeration<ProcedureStatus> status, CodeableConcept code) {
        super();
        this.subject = subject;
        this.status = status;
        this.code = code;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
     * @return {@link #identifier} (This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
    public Procedure addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #subject} (The person, animal or group on which the procedure was performed.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The person, animal or group on which the procedure was performed.)
     */
    public Procedure setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person, animal or group on which the procedure was performed.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person, animal or group on which the procedure was performed.)
     */
    public Procedure setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #status} (A code specifying the state of the procedure. Generally this will be in-progress or completed state.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ProcedureStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<ProcedureStatus>(new ProcedureStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (A code specifying the state of the procedure. Generally this will be in-progress or completed state.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Procedure setStatusElement(Enumeration<ProcedureStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return A code specifying the state of the procedure. Generally this will be in-progress or completed state.
     */
    public ProcedureStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value A code specifying the state of the procedure. Generally this will be in-progress or completed state.
     */
    public Procedure setStatus(ProcedureStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ProcedureStatus>(new ProcedureStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #category} (A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").)
     */
    public CodeableConcept getCategory() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.category");
            else if (Configuration.doAutoCreate())
                // cc
                this.category = new CodeableConcept();
        return this.category;
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").)
     */
    public Procedure setCategory(CodeableConcept value) {
        this.category = value;
        return this;
    }

    /**
     * @return {@link #code} (The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. "Laparoscopic Appendectomy").)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. "Laparoscopic Appendectomy").)
     */
    public Procedure setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #notPerformed} (Set this to true if the record is saying that the procedure was NOT performed.). This is the underlying object with id, value and extensions. The accessor "getNotPerformed" gives direct access to the value
     */
    public BooleanType getNotPerformedElement() {
        if (this.notPerformed == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.notPerformed");
            else if (Configuration.doAutoCreate())
                // bb
                this.notPerformed = new BooleanType();
        return this.notPerformed;
    }

    public boolean hasNotPerformedElement() {
        return this.notPerformed != null && !this.notPerformed.isEmpty();
    }

    public boolean hasNotPerformed() {
        return this.notPerformed != null && !this.notPerformed.isEmpty();
    }

    /**
     * @param value {@link #notPerformed} (Set this to true if the record is saying that the procedure was NOT performed.). This is the underlying object with id, value and extensions. The accessor "getNotPerformed" gives direct access to the value
     */
    public Procedure setNotPerformedElement(BooleanType value) {
        this.notPerformed = value;
        return this;
    }

    /**
     * @return Set this to true if the record is saying that the procedure was NOT performed.
     */
    public boolean getNotPerformed() {
        return this.notPerformed == null || this.notPerformed.isEmpty() ? false : this.notPerformed.getValue();
    }

    /**
     * @param value Set this to true if the record is saying that the procedure was NOT performed.
     */
    public Procedure setNotPerformed(boolean value) {
        if (this.notPerformed == null)
            this.notPerformed = new BooleanType();
        this.notPerformed.setValue(value);
        return this;
    }

    /**
     * @return {@link #reasonNotPerformed} (A code indicating why the procedure was not performed.)
     */
    public List<CodeableConcept> getReasonNotPerformed() {
        if (this.reasonNotPerformed == null)
            this.reasonNotPerformed = new ArrayList<CodeableConcept>();
        return this.reasonNotPerformed;
    }

    public boolean hasReasonNotPerformed() {
        if (this.reasonNotPerformed == null)
            return false;
        for (CodeableConcept item : this.reasonNotPerformed) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #reasonNotPerformed} (A code indicating why the procedure was not performed.)
     */
    // syntactic sugar
    public CodeableConcept addReasonNotPerformed() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.reasonNotPerformed == null)
            this.reasonNotPerformed = new ArrayList<CodeableConcept>();
        this.reasonNotPerformed.add(t);
        return t;
    }

    // syntactic sugar
    public Procedure addReasonNotPerformed(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reasonNotPerformed == null)
            this.reasonNotPerformed = new ArrayList<CodeableConcept>();
        this.reasonNotPerformed.add(t);
        return this;
    }

    /**
     * @return {@link #bodySite} (Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.)
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
     * @return {@link #bodySite} (Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.)
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
    public Procedure addBodySite(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.bodySite == null)
            this.bodySite = new ArrayList<CodeableConcept>();
        this.bodySite.add(t);
        return this;
    }

    /**
     * @return {@link #reason} (The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text.)
     */
    public Type getReason() {
        return this.reason;
    }

    /**
     * @return {@link #reason} (The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text.)
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
     * @return {@link #reason} (The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text.)
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
     * @param value {@link #reason} (The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text.)
     */
    public Procedure setReason(Type value) {
        this.reason = value;
        return this;
    }

    /**
     * @return {@link #performer} (Limited to 'real' people rather than equipment.)
     */
    public List<ProcedurePerformerComponent> getPerformer() {
        if (this.performer == null)
            this.performer = new ArrayList<ProcedurePerformerComponent>();
        return this.performer;
    }

    public boolean hasPerformer() {
        if (this.performer == null)
            return false;
        for (ProcedurePerformerComponent item : this.performer) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #performer} (Limited to 'real' people rather than equipment.)
     */
    // syntactic sugar
    public ProcedurePerformerComponent addPerformer() {
        // 3
        ProcedurePerformerComponent t = new ProcedurePerformerComponent();
        if (this.performer == null)
            this.performer = new ArrayList<ProcedurePerformerComponent>();
        this.performer.add(t);
        return t;
    }

    // syntactic sugar
    public Procedure addPerformer(ProcedurePerformerComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.performer == null)
            this.performer = new ArrayList<ProcedurePerformerComponent>();
        this.performer.add(t);
        return this;
    }

    /**
     * @return {@link #performed} (The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.)
     */
    public Type getPerformed() {
        return this.performed;
    }

    /**
     * @return {@link #performed} (The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.)
     */
    public DateTimeType getPerformedDateTimeType() throws FHIRException {
        if (!(this.performed instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.performed.getClass().getName() + " was encountered");
        return (DateTimeType) this.performed;
    }

    public boolean hasPerformedDateTimeType() {
        return this.performed instanceof DateTimeType;
    }

    /**
     * @return {@link #performed} (The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.)
     */
    public Period getPerformedPeriod() throws FHIRException {
        if (!(this.performed instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.performed.getClass().getName() + " was encountered");
        return (Period) this.performed;
    }

    public boolean hasPerformedPeriod() {
        return this.performed instanceof Period;
    }

    public boolean hasPerformed() {
        return this.performed != null && !this.performed.isEmpty();
    }

    /**
     * @param value {@link #performed} (The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.)
     */
    public Procedure setPerformed(Type value) {
        this.performed = value;
        return this;
    }

    /**
     * @return {@link #encounter} (The encounter during which the procedure was performed.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The encounter during which the procedure was performed.)
     */
    public Procedure setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The encounter during which the procedure was performed.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The encounter during which the procedure was performed.)
     */
    public Procedure setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #location} (The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.)
     */
    public Reference getLocation() {
        if (this.location == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.location");
            else if (Configuration.doAutoCreate())
                // cc
                this.location = new Reference();
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.)
     */
    public Procedure setLocation(Reference value) {
        this.location = value;
        return this;
    }

    /**
     * @return {@link #location} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.)
     */
    public Location getLocationTarget() {
        if (this.locationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.location");
            else if (Configuration.doAutoCreate())
                // aa
                this.locationTarget = new Location();
        return this.locationTarget;
    }

    /**
     * @param value {@link #location} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.)
     */
    public Procedure setLocationTarget(Location value) {
        this.locationTarget = value;
        return this;
    }

    /**
     * @return {@link #outcome} (The outcome of the procedure - did it resolve reasons for the procedure being performed?)
     */
    public CodeableConcept getOutcome() {
        if (this.outcome == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.outcome");
            else if (Configuration.doAutoCreate())
                // cc
                this.outcome = new CodeableConcept();
        return this.outcome;
    }

    public boolean hasOutcome() {
        return this.outcome != null && !this.outcome.isEmpty();
    }

    /**
     * @param value {@link #outcome} (The outcome of the procedure - did it resolve reasons for the procedure being performed?)
     */
    public Procedure setOutcome(CodeableConcept value) {
        this.outcome = value;
        return this;
    }

    /**
     * @return {@link #report} (This could be a histology result, pathology report, surgical report, etc..)
     */
    public List<Reference> getReport() {
        if (this.report == null)
            this.report = new ArrayList<Reference>();
        return this.report;
    }

    public boolean hasReport() {
        if (this.report == null)
            return false;
        for (Reference item : this.report) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #report} (This could be a histology result, pathology report, surgical report, etc..)
     */
    // syntactic sugar
    public Reference addReport() {
        // 3
        Reference t = new Reference();
        if (this.report == null)
            this.report = new ArrayList<Reference>();
        this.report.add(t);
        return t;
    }

    // syntactic sugar
    public Procedure addReport(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.report == null)
            this.report = new ArrayList<Reference>();
        this.report.add(t);
        return this;
    }

    /**
     * @return {@link #report} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. This could be a histology result, pathology report, surgical report, etc..)
     */
    public List<DiagnosticReport> getReportTarget() {
        if (this.reportTarget == null)
            this.reportTarget = new ArrayList<DiagnosticReport>();
        return this.reportTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #report} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. This could be a histology result, pathology report, surgical report, etc..)
     */
    public DiagnosticReport addReportTarget() {
        DiagnosticReport r = new DiagnosticReport();
        if (this.reportTarget == null)
            this.reportTarget = new ArrayList<DiagnosticReport>();
        this.reportTarget.add(r);
        return r;
    }

    /**
     * @return {@link #complication} (Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.)
     */
    public List<CodeableConcept> getComplication() {
        if (this.complication == null)
            this.complication = new ArrayList<CodeableConcept>();
        return this.complication;
    }

    public boolean hasComplication() {
        if (this.complication == null)
            return false;
        for (CodeableConcept item : this.complication) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #complication} (Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.)
     */
    // syntactic sugar
    public CodeableConcept addComplication() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.complication == null)
            this.complication = new ArrayList<CodeableConcept>();
        this.complication.add(t);
        return t;
    }

    // syntactic sugar
    public Procedure addComplication(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.complication == null)
            this.complication = new ArrayList<CodeableConcept>();
        this.complication.add(t);
        return this;
    }

    /**
     * @return {@link #followUp} (If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used.)
     */
    public List<CodeableConcept> getFollowUp() {
        if (this.followUp == null)
            this.followUp = new ArrayList<CodeableConcept>();
        return this.followUp;
    }

    public boolean hasFollowUp() {
        if (this.followUp == null)
            return false;
        for (CodeableConcept item : this.followUp) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #followUp} (If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used.)
     */
    // syntactic sugar
    public CodeableConcept addFollowUp() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.followUp == null)
            this.followUp = new ArrayList<CodeableConcept>();
        this.followUp.add(t);
        return t;
    }

    // syntactic sugar
    public Procedure addFollowUp(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.followUp == null)
            this.followUp = new ArrayList<CodeableConcept>();
        this.followUp.add(t);
        return this;
    }

    /**
     * @return {@link #request} (A reference to a resource that contains details of the request for this procedure.)
     */
    public Reference getRequest() {
        if (this.request == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Procedure.request");
            else if (Configuration.doAutoCreate())
                // cc
                this.request = new Reference();
        return this.request;
    }

    public boolean hasRequest() {
        return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (A reference to a resource that contains details of the request for this procedure.)
     */
    public Procedure setRequest(Reference value) {
        this.request = value;
        return this;
    }

    /**
     * @return {@link #request} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to a resource that contains details of the request for this procedure.)
     */
    public Resource getRequestTarget() {
        return this.requestTarget;
    }

    /**
     * @param value {@link #request} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to a resource that contains details of the request for this procedure.)
     */
    public Procedure setRequestTarget(Resource value) {
        this.requestTarget = value;
        return this;
    }

    /**
     * @return {@link #notes} (Any other notes about the procedure.  E.g. the operative notes.)
     */
    public List<Annotation> getNotes() {
        if (this.notes == null)
            this.notes = new ArrayList<Annotation>();
        return this.notes;
    }

    public boolean hasNotes() {
        if (this.notes == null)
            return false;
        for (Annotation item : this.notes) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #notes} (Any other notes about the procedure.  E.g. the operative notes.)
     */
    // syntactic sugar
    public Annotation addNotes() {
        // 3
        Annotation t = new Annotation();
        if (this.notes == null)
            this.notes = new ArrayList<Annotation>();
        this.notes.add(t);
        return t;
    }

    // syntactic sugar
    public Procedure addNotes(Annotation t) {
        // 3
        if (t == null)
            return this;
        if (this.notes == null)
            this.notes = new ArrayList<Annotation>();
        this.notes.add(t);
        return this;
    }

    /**
     * @return {@link #focalDevice} (A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.)
     */
    public List<ProcedureFocalDeviceComponent> getFocalDevice() {
        if (this.focalDevice == null)
            this.focalDevice = new ArrayList<ProcedureFocalDeviceComponent>();
        return this.focalDevice;
    }

    public boolean hasFocalDevice() {
        if (this.focalDevice == null)
            return false;
        for (ProcedureFocalDeviceComponent item : this.focalDevice) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #focalDevice} (A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.)
     */
    // syntactic sugar
    public ProcedureFocalDeviceComponent addFocalDevice() {
        // 3
        ProcedureFocalDeviceComponent t = new ProcedureFocalDeviceComponent();
        if (this.focalDevice == null)
            this.focalDevice = new ArrayList<ProcedureFocalDeviceComponent>();
        this.focalDevice.add(t);
        return t;
    }

    // syntactic sugar
    public Procedure addFocalDevice(ProcedureFocalDeviceComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.focalDevice == null)
            this.focalDevice = new ArrayList<ProcedureFocalDeviceComponent>();
        this.focalDevice.add(t);
        return this;
    }

    /**
     * @return {@link #used} (Identifies medications, devices and any other substance used as part of the procedure.)
     */
    public List<Reference> getUsed() {
        if (this.used == null)
            this.used = new ArrayList<Reference>();
        return this.used;
    }

    public boolean hasUsed() {
        if (this.used == null)
            return false;
        for (Reference item : this.used) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #used} (Identifies medications, devices and any other substance used as part of the procedure.)
     */
    // syntactic sugar
    public Reference addUsed() {
        // 3
        Reference t = new Reference();
        if (this.used == null)
            this.used = new ArrayList<Reference>();
        this.used.add(t);
        return t;
    }

    // syntactic sugar
    public Procedure addUsed(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.used == null)
            this.used = new ArrayList<Reference>();
        this.used.add(t);
        return this;
    }

    /**
     * @return {@link #used} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies medications, devices and any other substance used as part of the procedure.)
     */
    public List<Resource> getUsedTarget() {
        if (this.usedTarget == null)
            this.usedTarget = new ArrayList<Resource>();
        return this.usedTarget;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("subject", "Reference(Patient|Group)", "The person, animal or group on which the procedure was performed.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("status", "code", "A code specifying the state of the procedure. Generally this will be in-progress or completed state.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("category", "CodeableConcept", "A code that classifies the procedure for searching, sorting and display purposes (e.g. \"Surgical Procedure\").", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("code", "CodeableConcept", "The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. \"Laparoscopic Appendectomy\").", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("notPerformed", "boolean", "Set this to true if the record is saying that the procedure was NOT performed.", 0, java.lang.Integer.MAX_VALUE, notPerformed));
        childrenList.add(new Property("reasonNotPerformed", "CodeableConcept", "A code indicating why the procedure was not performed.", 0, java.lang.Integer.MAX_VALUE, reasonNotPerformed));
        childrenList.add(new Property("bodySite", "CodeableConcept", "Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.", 0, java.lang.Integer.MAX_VALUE, bodySite));
        childrenList.add(new Property("reason[x]", "CodeableConcept|Reference(Condition)", "The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("performer", "", "Limited to 'real' people rather than equipment.", 0, java.lang.Integer.MAX_VALUE, performer));
        childrenList.add(new Property("performed[x]", "dateTime|Period", "The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.", 0, java.lang.Integer.MAX_VALUE, performed));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "The encounter during which the procedure was performed.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("location", "Reference(Location)", "The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("outcome", "CodeableConcept", "The outcome of the procedure - did it resolve reasons for the procedure being performed?", 0, java.lang.Integer.MAX_VALUE, outcome));
        childrenList.add(new Property("report", "Reference(DiagnosticReport)", "This could be a histology result, pathology report, surgical report, etc..", 0, java.lang.Integer.MAX_VALUE, report));
        childrenList.add(new Property("complication", "CodeableConcept", "Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.", 0, java.lang.Integer.MAX_VALUE, complication));
        childrenList.add(new Property("followUp", "CodeableConcept", "If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used.", 0, java.lang.Integer.MAX_VALUE, followUp));
        childrenList.add(new Property("request", "Reference(CarePlan|DiagnosticOrder|ProcedureRequest|ReferralRequest)", "A reference to a resource that contains details of the request for this procedure.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("notes", "Annotation", "Any other notes about the procedure.  E.g. the operative notes.", 0, java.lang.Integer.MAX_VALUE, notes));
        childrenList.add(new Property("focalDevice", "", "A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.", 0, java.lang.Integer.MAX_VALUE, focalDevice));
        childrenList.add(new Property("used", "Reference(Device|Medication|Substance)", "Identifies medications, devices and any other substance used as part of the procedure.", 0, java.lang.Integer.MAX_VALUE, used));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("status"))
            // Enumeration<ProcedureStatus>
            this.status = new ProcedureStatusEnumFactory().fromType(value);
        else if (name.equals("category"))
            // CodeableConcept
            this.category = castToCodeableConcept(value);
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("notPerformed"))
            // BooleanType
            this.notPerformed = castToBoolean(value);
        else if (name.equals("reasonNotPerformed"))
            this.getReasonNotPerformed().add(castToCodeableConcept(value));
        else if (name.equals("bodySite"))
            this.getBodySite().add(castToCodeableConcept(value));
        else if (name.equals("reason[x]"))
            // Type
            this.reason = (Type) value;
        else if (name.equals("performer"))
            this.getPerformer().add((ProcedurePerformerComponent) value);
        else if (name.equals("performed[x]"))
            // Type
            this.performed = (Type) value;
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("location"))
            // Reference
            this.location = castToReference(value);
        else if (name.equals("outcome"))
            // CodeableConcept
            this.outcome = castToCodeableConcept(value);
        else if (name.equals("report"))
            this.getReport().add(castToReference(value));
        else if (name.equals("complication"))
            this.getComplication().add(castToCodeableConcept(value));
        else if (name.equals("followUp"))
            this.getFollowUp().add(castToCodeableConcept(value));
        else if (name.equals("request"))
            // Reference
            this.request = castToReference(value);
        else if (name.equals("notes"))
            this.getNotes().add(castToAnnotation(value));
        else if (name.equals("focalDevice"))
            this.getFocalDevice().add((ProcedureFocalDeviceComponent) value);
        else if (name.equals("used"))
            this.getUsed().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Procedure.status");
        } else if (name.equals("category")) {
            this.category = new CodeableConcept();
            return this.category;
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("notPerformed")) {
            throw new FHIRException("Cannot call addChild on a primitive type Procedure.notPerformed");
        } else if (name.equals("reasonNotPerformed")) {
            return addReasonNotPerformed();
        } else if (name.equals("bodySite")) {
            return addBodySite();
        } else if (name.equals("reasonCodeableConcept")) {
            this.reason = new CodeableConcept();
            return this.reason;
        } else if (name.equals("reasonReference")) {
            this.reason = new Reference();
            return this.reason;
        } else if (name.equals("performer")) {
            return addPerformer();
        } else if (name.equals("performedDateTime")) {
            this.performed = new DateTimeType();
            return this.performed;
        } else if (name.equals("performedPeriod")) {
            this.performed = new Period();
            return this.performed;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("location")) {
            this.location = new Reference();
            return this.location;
        } else if (name.equals("outcome")) {
            this.outcome = new CodeableConcept();
            return this.outcome;
        } else if (name.equals("report")) {
            return addReport();
        } else if (name.equals("complication")) {
            return addComplication();
        } else if (name.equals("followUp")) {
            return addFollowUp();
        } else if (name.equals("request")) {
            this.request = new Reference();
            return this.request;
        } else if (name.equals("notes")) {
            return addNotes();
        } else if (name.equals("focalDevice")) {
            return addFocalDevice();
        } else if (name.equals("used")) {
            return addUsed();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Procedure";
    }

    public Procedure copy() {
        Procedure dst = new Procedure();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.subject = subject == null ? null : subject.copy();
        dst.status = status == null ? null : status.copy();
        dst.category = category == null ? null : category.copy();
        dst.code = code == null ? null : code.copy();
        dst.notPerformed = notPerformed == null ? null : notPerformed.copy();
        if (reasonNotPerformed != null) {
            dst.reasonNotPerformed = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reasonNotPerformed) dst.reasonNotPerformed.add(i.copy());
        }
        ;
        if (bodySite != null) {
            dst.bodySite = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : bodySite) dst.bodySite.add(i.copy());
        }
        ;
        dst.reason = reason == null ? null : reason.copy();
        if (performer != null) {
            dst.performer = new ArrayList<ProcedurePerformerComponent>();
            for (ProcedurePerformerComponent i : performer) dst.performer.add(i.copy());
        }
        ;
        dst.performed = performed == null ? null : performed.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.location = location == null ? null : location.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
        if (report != null) {
            dst.report = new ArrayList<Reference>();
            for (Reference i : report) dst.report.add(i.copy());
        }
        ;
        if (complication != null) {
            dst.complication = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : complication) dst.complication.add(i.copy());
        }
        ;
        if (followUp != null) {
            dst.followUp = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : followUp) dst.followUp.add(i.copy());
        }
        ;
        dst.request = request == null ? null : request.copy();
        if (notes != null) {
            dst.notes = new ArrayList<Annotation>();
            for (Annotation i : notes) dst.notes.add(i.copy());
        }
        ;
        if (focalDevice != null) {
            dst.focalDevice = new ArrayList<ProcedureFocalDeviceComponent>();
            for (ProcedureFocalDeviceComponent i : focalDevice) dst.focalDevice.add(i.copy());
        }
        ;
        if (used != null) {
            dst.used = new ArrayList<Reference>();
            for (Reference i : used) dst.used.add(i.copy());
        }
        ;
        return dst;
    }

    protected Procedure typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Procedure))
            return false;
        Procedure o = (Procedure) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(subject, o.subject, true) && compareDeep(status, o.status, true) && compareDeep(category, o.category, true) && compareDeep(code, o.code, true) && compareDeep(notPerformed, o.notPerformed, true) && compareDeep(reasonNotPerformed, o.reasonNotPerformed, true) && compareDeep(bodySite, o.bodySite, true) && compareDeep(reason, o.reason, true) && compareDeep(performer, o.performer, true) && compareDeep(performed, o.performed, true) && compareDeep(encounter, o.encounter, true) && compareDeep(location, o.location, true) && compareDeep(outcome, o.outcome, true) && compareDeep(report, o.report, true) && compareDeep(complication, o.complication, true) && compareDeep(followUp, o.followUp, true) && compareDeep(request, o.request, true) && compareDeep(notes, o.notes, true) && compareDeep(focalDevice, o.focalDevice, true) && compareDeep(used, o.used, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Procedure))
            return false;
        Procedure o = (Procedure) other;
        return compareValues(status, o.status, true) && compareValues(notPerformed, o.notPerformed, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (subject == null || subject.isEmpty()) && (status == null || status.isEmpty()) && (category == null || category.isEmpty()) && (code == null || code.isEmpty()) && (notPerformed == null || notPerformed.isEmpty()) && (reasonNotPerformed == null || reasonNotPerformed.isEmpty()) && (bodySite == null || bodySite.isEmpty()) && (reason == null || reason.isEmpty()) && (performer == null || performer.isEmpty()) && (performed == null || performed.isEmpty()) && (encounter == null || encounter.isEmpty()) && (location == null || location.isEmpty()) && (outcome == null || outcome.isEmpty()) && (report == null || report.isEmpty()) && (complication == null || complication.isEmpty()) && (followUp == null || followUp.isEmpty()) && (request == null || request.isEmpty()) && (notes == null || notes.isEmpty()) && (focalDevice == null || focalDevice.isEmpty()) && (used == null || used.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Procedure;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CODE = "code";

    public static final String SP_PERFORMER = "performer";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_PATIENT = "patient";

    public static final String SP_LOCATION = "location";

    public static final String SP_ENCOUNTER = "encounter";
}
