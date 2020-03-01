package org.hl7.fhir.android.generated.dstu2;

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
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.ProcedureRequestEnum.ProcedureRequestPriority;
import org.hl7.fhir.android.generated.dstu2.ProcedureRequestEnum.ProcedureRequestPriorityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ProcedureRequestEnum.ProcedureRequestStatus;
import org.hl7.fhir.android.generated.dstu2.ProcedureRequestEnum.ProcedureRequestStatusEnumFactory;

/**
 * A request for a procedure to be performed. May be a proposal or an order.
 */
public class ProcedureRequest extends DomainResource {

    /**
     * Identifiers assigned to this order by the order or by the receiver.
     */
    protected List<Identifier> identifier;

    /**
     * The person, animal or group that should receive the procedure.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (The person, animal or group that should receive the procedure.)
     */
    protected Resource subjectTarget;

    /**
     * The specific procedure that is ordered. Use text if the exact nature of the procedure cannot be coded.
     */
    protected CodeableConcept code;

    /**
     * Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).
     */
    protected List<CodeableConcept> bodySite;

    /**
     * The reason why the procedure is being proposed or ordered. This procedure request may be motivated by a Condition for instance.
     */
    protected Type reason;

    /**
     * The timing schedule for the proposed or ordered procedure. The Schedule data type allows many different expressions.  E.g. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
     */
    protected Type scheduled;

    /**
     * The encounter within which the procedure proposal or request was created.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (The encounter within which the procedure proposal or request was created.)
     */
    protected Encounter encounterTarget;

    /**
     * For example, the surgeon, anaethetist, endoscopist, etc.
     */
    protected Reference performer;

    /**
     * The actual object that is the target of the reference (For example, the surgeon, anaethetist, endoscopist, etc.)
     */
    protected Resource performerTarget;

    /**
     * The status of the order.
     */
    protected Enumeration<ProcedureRequestStatus> status;

    /**
     * Any other notes associated with this proposal or order - e.g. provider instructions.
     */
    protected List<Annotation> notes;

    /**
     * If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.
     */
    protected Type asNeeded;

    /**
     * The time when the request was made.
     */
    protected DateTimeType orderedOn;

    /**
     * The healthcare professional responsible for proposing or ordering the procedure.
     */
    protected Reference orderer;

    /**
     * The actual object that is the target of the reference (The healthcare professional responsible for proposing or ordering the procedure.)
     */
    protected Resource ordererTarget;

    /**
     * The clinical priority associated with this order.
     */
    protected Enumeration<ProcedureRequestPriority> priority;

    private static final long serialVersionUID = -916650578L;

    /*
   * Constructor
   */
    public ProcedureRequest() {
        super();
    }

    /*
   * Constructor
   */
    public ProcedureRequest(Reference subject, CodeableConcept code) {
        super();
        this.subject = subject;
        this.code = code;
    }

    /**
     * @return {@link #identifier} (Identifiers assigned to this order by the order or by the receiver.)
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
     * @return {@link #identifier} (Identifiers assigned to this order by the order or by the receiver.)
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
    public ProcedureRequest addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #subject} (The person, animal or group that should receive the procedure.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureRequest.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The person, animal or group that should receive the procedure.)
     */
    public ProcedureRequest setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person, animal or group that should receive the procedure.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person, animal or group that should receive the procedure.)
     */
    public ProcedureRequest setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #code} (The specific procedure that is ordered. Use text if the exact nature of the procedure cannot be coded.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureRequest.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (The specific procedure that is ordered. Use text if the exact nature of the procedure cannot be coded.)
     */
    public ProcedureRequest setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #bodySite} (Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).)
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
     * @return {@link #bodySite} (Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).)
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
    public ProcedureRequest addBodySite(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.bodySite == null)
            this.bodySite = new ArrayList<CodeableConcept>();
        this.bodySite.add(t);
        return this;
    }

    /**
     * @return {@link #reason} (The reason why the procedure is being proposed or ordered. This procedure request may be motivated by a Condition for instance.)
     */
    public Type getReason() {
        return this.reason;
    }

    /**
     * @return {@link #reason} (The reason why the procedure is being proposed or ordered. This procedure request may be motivated by a Condition for instance.)
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
     * @return {@link #reason} (The reason why the procedure is being proposed or ordered. This procedure request may be motivated by a Condition for instance.)
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
     * @param value {@link #reason} (The reason why the procedure is being proposed or ordered. This procedure request may be motivated by a Condition for instance.)
     */
    public ProcedureRequest setReason(Type value) {
        this.reason = value;
        return this;
    }

    /**
     * @return {@link #scheduled} (The timing schedule for the proposed or ordered procedure. The Schedule data type allows many different expressions.  E.g. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".)
     */
    public Type getScheduled() {
        return this.scheduled;
    }

    /**
     * @return {@link #scheduled} (The timing schedule for the proposed or ordered procedure. The Schedule data type allows many different expressions.  E.g. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".)
     */
    public DateTimeType getScheduledDateTimeType() throws FHIRException {
        if (!(this.scheduled instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but " + this.scheduled.getClass().getName() + " was encountered");
        return (DateTimeType) this.scheduled;
    }

    public boolean hasScheduledDateTimeType() {
        return this.scheduled instanceof DateTimeType;
    }

    /**
     * @return {@link #scheduled} (The timing schedule for the proposed or ordered procedure. The Schedule data type allows many different expressions.  E.g. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".)
     */
    public Period getScheduledPeriod() throws FHIRException {
        if (!(this.scheduled instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.scheduled.getClass().getName() + " was encountered");
        return (Period) this.scheduled;
    }

    public boolean hasScheduledPeriod() {
        return this.scheduled instanceof Period;
    }

    /**
     * @return {@link #scheduled} (The timing schedule for the proposed or ordered procedure. The Schedule data type allows many different expressions.  E.g. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".)
     */
    public Timing getScheduledTiming() throws FHIRException {
        if (!(this.scheduled instanceof Timing))
            throw new FHIRException("Type mismatch: the type Timing was expected, but " + this.scheduled.getClass().getName() + " was encountered");
        return (Timing) this.scheduled;
    }

    public boolean hasScheduledTiming() {
        return this.scheduled instanceof Timing;
    }

    public boolean hasScheduled() {
        return this.scheduled != null && !this.scheduled.isEmpty();
    }

    /**
     * @param value {@link #scheduled} (The timing schedule for the proposed or ordered procedure. The Schedule data type allows many different expressions.  E.g. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".)
     */
    public ProcedureRequest setScheduled(Type value) {
        this.scheduled = value;
        return this;
    }

    /**
     * @return {@link #encounter} (The encounter within which the procedure proposal or request was created.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureRequest.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The encounter within which the procedure proposal or request was created.)
     */
    public ProcedureRequest setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The encounter within which the procedure proposal or request was created.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureRequest.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The encounter within which the procedure proposal or request was created.)
     */
    public ProcedureRequest setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #performer} (For example, the surgeon, anaethetist, endoscopist, etc.)
     */
    public Reference getPerformer() {
        if (this.performer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureRequest.performer");
            else if (Configuration.doAutoCreate())
                // cc
                this.performer = new Reference();
        return this.performer;
    }

    public boolean hasPerformer() {
        return this.performer != null && !this.performer.isEmpty();
    }

    /**
     * @param value {@link #performer} (For example, the surgeon, anaethetist, endoscopist, etc.)
     */
    public ProcedureRequest setPerformer(Reference value) {
        this.performer = value;
        return this;
    }

    /**
     * @return {@link #performer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (For example, the surgeon, anaethetist, endoscopist, etc.)
     */
    public Resource getPerformerTarget() {
        return this.performerTarget;
    }

    /**
     * @param value {@link #performer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (For example, the surgeon, anaethetist, endoscopist, etc.)
     */
    public ProcedureRequest setPerformerTarget(Resource value) {
        this.performerTarget = value;
        return this;
    }

    /**
     * @return {@link #status} (The status of the order.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ProcedureRequestStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureRequest.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<ProcedureRequestStatus>(new ProcedureRequestStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the order.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ProcedureRequest setStatusElement(Enumeration<ProcedureRequestStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the order.
     */
    public ProcedureRequestStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the order.
     */
    public ProcedureRequest setStatus(ProcedureRequestStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<ProcedureRequestStatus>(new ProcedureRequestStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #notes} (Any other notes associated with this proposal or order - e.g. provider instructions.)
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
     * @return {@link #notes} (Any other notes associated with this proposal or order - e.g. provider instructions.)
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
    public ProcedureRequest addNotes(Annotation t) {
        // 3
        if (t == null)
            return this;
        if (this.notes == null)
            this.notes = new ArrayList<Annotation>();
        this.notes.add(t);
        return this;
    }

    /**
     * @return {@link #asNeeded} (If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.)
     */
    public Type getAsNeeded() {
        return this.asNeeded;
    }

    /**
     * @return {@link #asNeeded} (If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.)
     */
    public BooleanType getAsNeededBooleanType() throws FHIRException {
        if (!(this.asNeeded instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but " + this.asNeeded.getClass().getName() + " was encountered");
        return (BooleanType) this.asNeeded;
    }

    public boolean hasAsNeededBooleanType() {
        return this.asNeeded instanceof BooleanType;
    }

    /**
     * @return {@link #asNeeded} (If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.)
     */
    public CodeableConcept getAsNeededCodeableConcept() throws FHIRException {
        if (!(this.asNeeded instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.asNeeded.getClass().getName() + " was encountered");
        return (CodeableConcept) this.asNeeded;
    }

    public boolean hasAsNeededCodeableConcept() {
        return this.asNeeded instanceof CodeableConcept;
    }

    public boolean hasAsNeeded() {
        return this.asNeeded != null && !this.asNeeded.isEmpty();
    }

    /**
     * @param value {@link #asNeeded} (If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.)
     */
    public ProcedureRequest setAsNeeded(Type value) {
        this.asNeeded = value;
        return this;
    }

    /**
     * @return {@link #orderedOn} (The time when the request was made.). This is the underlying object with id, value and extensions. The accessor "getOrderedOn" gives direct access to the value
     */
    public DateTimeType getOrderedOnElement() {
        if (this.orderedOn == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureRequest.orderedOn");
            else if (Configuration.doAutoCreate())
                // bb
                this.orderedOn = new DateTimeType();
        return this.orderedOn;
    }

    public boolean hasOrderedOnElement() {
        return this.orderedOn != null && !this.orderedOn.isEmpty();
    }

    public boolean hasOrderedOn() {
        return this.orderedOn != null && !this.orderedOn.isEmpty();
    }

    /**
     * @param value {@link #orderedOn} (The time when the request was made.). This is the underlying object with id, value and extensions. The accessor "getOrderedOn" gives direct access to the value
     */
    public ProcedureRequest setOrderedOnElement(DateTimeType value) {
        this.orderedOn = value;
        return this;
    }

    /**
     * @return The time when the request was made.
     */
    public Date getOrderedOn() {
        return this.orderedOn == null ? null : this.orderedOn.getValue();
    }

    /**
     * @param value The time when the request was made.
     */
    public ProcedureRequest setOrderedOn(Date value) {
        if (value == null)
            this.orderedOn = null;
        else {
            if (this.orderedOn == null)
                this.orderedOn = new DateTimeType();
            this.orderedOn.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #orderer} (The healthcare professional responsible for proposing or ordering the procedure.)
     */
    public Reference getOrderer() {
        if (this.orderer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureRequest.orderer");
            else if (Configuration.doAutoCreate())
                // cc
                this.orderer = new Reference();
        return this.orderer;
    }

    public boolean hasOrderer() {
        return this.orderer != null && !this.orderer.isEmpty();
    }

    /**
     * @param value {@link #orderer} (The healthcare professional responsible for proposing or ordering the procedure.)
     */
    public ProcedureRequest setOrderer(Reference value) {
        this.orderer = value;
        return this;
    }

    /**
     * @return {@link #orderer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The healthcare professional responsible for proposing or ordering the procedure.)
     */
    public Resource getOrdererTarget() {
        return this.ordererTarget;
    }

    /**
     * @param value {@link #orderer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The healthcare professional responsible for proposing or ordering the procedure.)
     */
    public ProcedureRequest setOrdererTarget(Resource value) {
        this.ordererTarget = value;
        return this;
    }

    /**
     * @return {@link #priority} (The clinical priority associated with this order.). This is the underlying object with id, value and extensions. The accessor "getPriority" gives direct access to the value
     */
    public Enumeration<ProcedureRequestPriority> getPriorityElement() {
        if (this.priority == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureRequest.priority");
            else if (Configuration.doAutoCreate())
                // bb
                this.priority = new Enumeration<ProcedureRequestPriority>(new ProcedureRequestPriorityEnumFactory());
        return this.priority;
    }

    public boolean hasPriorityElement() {
        return this.priority != null && !this.priority.isEmpty();
    }

    public boolean hasPriority() {
        return this.priority != null && !this.priority.isEmpty();
    }

    /**
     * @param value {@link #priority} (The clinical priority associated with this order.). This is the underlying object with id, value and extensions. The accessor "getPriority" gives direct access to the value
     */
    public ProcedureRequest setPriorityElement(Enumeration<ProcedureRequestPriority> value) {
        this.priority = value;
        return this;
    }

    /**
     * @return The clinical priority associated with this order.
     */
    public ProcedureRequestPriority getPriority() {
        return this.priority == null ? null : this.priority.getValue();
    }

    /**
     * @param value The clinical priority associated with this order.
     */
    public ProcedureRequest setPriority(ProcedureRequestPriority value) {
        if (value == null)
            this.priority = null;
        else {
            if (this.priority == null)
                this.priority = new Enumeration<ProcedureRequestPriority>(new ProcedureRequestPriorityEnumFactory());
            this.priority.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifiers assigned to this order by the order or by the receiver.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("subject", "Reference(Patient|Group)", "The person, animal or group that should receive the procedure.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("code", "CodeableConcept", "The specific procedure that is ordered. Use text if the exact nature of the procedure cannot be coded.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("bodySite", "CodeableConcept", "Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).", 0, java.lang.Integer.MAX_VALUE, bodySite));
        childrenList.add(new Property("reason[x]", "CodeableConcept|Reference(Condition)", "The reason why the procedure is being proposed or ordered. This procedure request may be motivated by a Condition for instance.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("scheduled[x]", "dateTime|Period|Timing", "The timing schedule for the proposed or ordered procedure. The Schedule data type allows many different expressions.  E.g. \"Every 8 hours\"; \"Three times a day\"; \"1/2 an hour before breakfast for 10 days from 23-Dec 2011:\"; \"15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\".", 0, java.lang.Integer.MAX_VALUE, scheduled));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "The encounter within which the procedure proposal or request was created.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("performer", "Reference(Practitioner|Organization|Patient|RelatedPerson)", "For example, the surgeon, anaethetist, endoscopist, etc.", 0, java.lang.Integer.MAX_VALUE, performer));
        childrenList.add(new Property("status", "code", "The status of the order.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("notes", "Annotation", "Any other notes associated with this proposal or order - e.g. provider instructions.", 0, java.lang.Integer.MAX_VALUE, notes));
        childrenList.add(new Property("asNeeded[x]", "boolean|CodeableConcept", "If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.", 0, java.lang.Integer.MAX_VALUE, asNeeded));
        childrenList.add(new Property("orderedOn", "dateTime", "The time when the request was made.", 0, java.lang.Integer.MAX_VALUE, orderedOn));
        childrenList.add(new Property("orderer", "Reference(Practitioner|Patient|RelatedPerson|Device)", "The healthcare professional responsible for proposing or ordering the procedure.", 0, java.lang.Integer.MAX_VALUE, orderer));
        childrenList.add(new Property("priority", "code", "The clinical priority associated with this order.", 0, java.lang.Integer.MAX_VALUE, priority));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("bodySite"))
            this.getBodySite().add(castToCodeableConcept(value));
        else if (name.equals("reason[x]"))
            // Type
            this.reason = (Type) value;
        else if (name.equals("scheduled[x]"))
            // Type
            this.scheduled = (Type) value;
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("performer"))
            // Reference
            this.performer = castToReference(value);
        else if (name.equals("status"))
            // Enumeration<ProcedureRequestStatus>
            this.status = new ProcedureRequestStatusEnumFactory().fromType(value);
        else if (name.equals("notes"))
            this.getNotes().add(castToAnnotation(value));
        else if (name.equals("asNeeded[x]"))
            // Type
            this.asNeeded = (Type) value;
        else if (name.equals("orderedOn"))
            // DateTimeType
            this.orderedOn = castToDateTime(value);
        else if (name.equals("orderer"))
            // Reference
            this.orderer = castToReference(value);
        else if (name.equals("priority"))
            // Enumeration<ProcedureRequestPriority>
            this.priority = new ProcedureRequestPriorityEnumFactory().fromType(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("bodySite")) {
            return addBodySite();
        } else if (name.equals("reasonCodeableConcept")) {
            this.reason = new CodeableConcept();
            return this.reason;
        } else if (name.equals("reasonReference")) {
            this.reason = new Reference();
            return this.reason;
        } else if (name.equals("scheduledDateTime")) {
            this.scheduled = new DateTimeType();
            return this.scheduled;
        } else if (name.equals("scheduledPeriod")) {
            this.scheduled = new Period();
            return this.scheduled;
        } else if (name.equals("scheduledTiming")) {
            this.scheduled = new Timing();
            return this.scheduled;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("performer")) {
            this.performer = new Reference();
            return this.performer;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcedureRequest.status");
        } else if (name.equals("notes")) {
            return addNotes();
        } else if (name.equals("asNeededBoolean")) {
            this.asNeeded = new BooleanType();
            return this.asNeeded;
        } else if (name.equals("asNeededCodeableConcept")) {
            this.asNeeded = new CodeableConcept();
            return this.asNeeded;
        } else if (name.equals("orderedOn")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcedureRequest.orderedOn");
        } else if (name.equals("orderer")) {
            this.orderer = new Reference();
            return this.orderer;
        } else if (name.equals("priority")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcedureRequest.priority");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ProcedureRequest";
    }

    public ProcedureRequest copy() {
        ProcedureRequest dst = new ProcedureRequest();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.subject = subject == null ? null : subject.copy();
        dst.code = code == null ? null : code.copy();
        if (bodySite != null) {
            dst.bodySite = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : bodySite) dst.bodySite.add(i.copy());
        }
        ;
        dst.reason = reason == null ? null : reason.copy();
        dst.scheduled = scheduled == null ? null : scheduled.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.performer = performer == null ? null : performer.copy();
        dst.status = status == null ? null : status.copy();
        if (notes != null) {
            dst.notes = new ArrayList<Annotation>();
            for (Annotation i : notes) dst.notes.add(i.copy());
        }
        ;
        dst.asNeeded = asNeeded == null ? null : asNeeded.copy();
        dst.orderedOn = orderedOn == null ? null : orderedOn.copy();
        dst.orderer = orderer == null ? null : orderer.copy();
        dst.priority = priority == null ? null : priority.copy();
        return dst;
    }

    protected ProcedureRequest typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ProcedureRequest))
            return false;
        ProcedureRequest o = (ProcedureRequest) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(subject, o.subject, true) && compareDeep(code, o.code, true) && compareDeep(bodySite, o.bodySite, true) && compareDeep(reason, o.reason, true) && compareDeep(scheduled, o.scheduled, true) && compareDeep(encounter, o.encounter, true) && compareDeep(performer, o.performer, true) && compareDeep(status, o.status, true) && compareDeep(notes, o.notes, true) && compareDeep(asNeeded, o.asNeeded, true) && compareDeep(orderedOn, o.orderedOn, true) && compareDeep(orderer, o.orderer, true) && compareDeep(priority, o.priority, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ProcedureRequest))
            return false;
        ProcedureRequest o = (ProcedureRequest) other;
        return compareValues(status, o.status, true) && compareValues(orderedOn, o.orderedOn, true) && compareValues(priority, o.priority, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (subject == null || subject.isEmpty()) && (code == null || code.isEmpty()) && (bodySite == null || bodySite.isEmpty()) && (reason == null || reason.isEmpty()) && (scheduled == null || scheduled.isEmpty()) && (encounter == null || encounter.isEmpty()) && (performer == null || performer.isEmpty()) && (status == null || status.isEmpty()) && (notes == null || notes.isEmpty()) && (asNeeded == null || asNeeded.isEmpty()) && (orderedOn == null || orderedOn.isEmpty()) && (orderer == null || orderer.isEmpty()) && (priority == null || priority.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ProcedureRequest;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PERFORMER = "performer";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_PATIENT = "patient";

    public static final String SP_ORDERER = "orderer";

    public static final String SP_ENCOUNTER = "encounter";
}
