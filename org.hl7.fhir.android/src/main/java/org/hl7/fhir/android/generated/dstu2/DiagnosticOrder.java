package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderStatus;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderPriorityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DiagnosticOrderEnum.DiagnosticOrderPriority;

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
 * A record of a request for a diagnostic investigation service to be performed.
 */
public class DiagnosticOrder extends DomainResource {

    /**
     * Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).)
     */
    protected Resource subjectTarget;

    /**
     * The practitioner that holds legal responsibility for ordering the investigation.
     */
    protected Reference orderer;

    /**
     * The actual object that is the target of the reference (The practitioner that holds legal responsibility for ordering the investigation.)
     */
    protected Practitioner ordererTarget;

    /**
     * Identifiers assigned to this order instance by the orderer and/or  the receiver and/or order fulfiller.
     */
    protected List<Identifier> identifier;

    /**
     * An encounter that provides additional information about the healthcare context in which this request is made.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (An encounter that provides additional information about the healthcare context in which this request is made.)
     */
    protected Encounter encounterTarget;

    /**
     * An explanation or justification for why this diagnostic investigation is being requested.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.
     */
    protected List<CodeableConcept> reason;

    /**
     * Additional clinical information about the patient or specimen that may influence test interpretations.  This includes observations explicitly requested by the producer(filler) to provide context or supporting information needed to complete the order.
     */
    protected List<Reference> supportingInformation;

    /**
     * The actual objects that are the target of the reference (Additional clinical information about the patient or specimen that may influence test interpretations.  This includes observations explicitly requested by the producer(filler) to provide context or supporting information needed to complete the order.)
     */
    protected List<Resource> supportingInformationTarget;

    /**
     * One or more specimens that the diagnostic investigation is about.
     */
    protected List<Reference> specimen;

    /**
     * The actual objects that are the target of the reference (One or more specimens that the diagnostic investigation is about.)
     */
    protected List<Specimen> specimenTarget;

    /**
     * The status of the order.
     */
    protected Enumeration<DiagnosticOrderStatus> status;

    /**
     * The clinical priority associated with this order.
     */
    protected Enumeration<DiagnosticOrderPriority> priority;

    /**
     * A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed.
     */
    protected List<DiagnosticOrderEventComponent> event;

    /**
     * The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested.
     */
    protected List<DiagnosticOrderItemComponent> item;

    /**
     * Any other notes associated with this patient, specimen or order (e.g. "patient hates needles").
     */
    protected List<Annotation> note;

    private static final long serialVersionUID = 700891227L;

    /*
   * Constructor
   */
    public DiagnosticOrder() {
        super();
    }

    /*
   * Constructor
   */
    public DiagnosticOrder(Reference subject) {
        super();
        this.subject = subject;
    }

    /**
     * @return {@link #subject} (Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrder.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).)
     */
    public DiagnosticOrder setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).)
     */
    public DiagnosticOrder setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #orderer} (The practitioner that holds legal responsibility for ordering the investigation.)
     */
    public Reference getOrderer() {
        if (this.orderer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrder.orderer");
            else if (Configuration.doAutoCreate())
                // cc
                this.orderer = new Reference();
        return this.orderer;
    }

    public boolean hasOrderer() {
        return this.orderer != null && !this.orderer.isEmpty();
    }

    /**
     * @param value {@link #orderer} (The practitioner that holds legal responsibility for ordering the investigation.)
     */
    public DiagnosticOrder setOrderer(Reference value) {
        this.orderer = value;
        return this;
    }

    /**
     * @return {@link #orderer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The practitioner that holds legal responsibility for ordering the investigation.)
     */
    public Practitioner getOrdererTarget() {
        if (this.ordererTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrder.orderer");
            else if (Configuration.doAutoCreate())
                // aa
                this.ordererTarget = new Practitioner();
        return this.ordererTarget;
    }

    /**
     * @param value {@link #orderer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The practitioner that holds legal responsibility for ordering the investigation.)
     */
    public DiagnosticOrder setOrdererTarget(Practitioner value) {
        this.ordererTarget = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Identifiers assigned to this order instance by the orderer and/or  the receiver and/or order fulfiller.)
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
     * @return {@link #identifier} (Identifiers assigned to this order instance by the orderer and/or  the receiver and/or order fulfiller.)
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
    public DiagnosticOrder addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #encounter} (An encounter that provides additional information about the healthcare context in which this request is made.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrder.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (An encounter that provides additional information about the healthcare context in which this request is made.)
     */
    public DiagnosticOrder setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (An encounter that provides additional information about the healthcare context in which this request is made.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrder.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (An encounter that provides additional information about the healthcare context in which this request is made.)
     */
    public DiagnosticOrder setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #reason} (An explanation or justification for why this diagnostic investigation is being requested.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.)
     */
    public List<CodeableConcept> getReason() {
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        return this.reason;
    }

    public boolean hasReason() {
        if (this.reason == null)
            return false;
        for (CodeableConcept item : this.reason) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #reason} (An explanation or justification for why this diagnostic investigation is being requested.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.)
     */
    // syntactic sugar
    public CodeableConcept addReason() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        this.reason.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticOrder addReason(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        this.reason.add(t);
        return this;
    }

    /**
     * @return {@link #supportingInformation} (Additional clinical information about the patient or specimen that may influence test interpretations.  This includes observations explicitly requested by the producer(filler) to provide context or supporting information needed to complete the order.)
     */
    public List<Reference> getSupportingInformation() {
        if (this.supportingInformation == null)
            this.supportingInformation = new ArrayList<Reference>();
        return this.supportingInformation;
    }

    public boolean hasSupportingInformation() {
        if (this.supportingInformation == null)
            return false;
        for (Reference item : this.supportingInformation) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #supportingInformation} (Additional clinical information about the patient or specimen that may influence test interpretations.  This includes observations explicitly requested by the producer(filler) to provide context or supporting information needed to complete the order.)
     */
    // syntactic sugar
    public Reference addSupportingInformation() {
        // 3
        Reference t = new Reference();
        if (this.supportingInformation == null)
            this.supportingInformation = new ArrayList<Reference>();
        this.supportingInformation.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticOrder addSupportingInformation(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.supportingInformation == null)
            this.supportingInformation = new ArrayList<Reference>();
        this.supportingInformation.add(t);
        return this;
    }

    /**
     * @return {@link #supportingInformation} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Additional clinical information about the patient or specimen that may influence test interpretations.  This includes observations explicitly requested by the producer(filler) to provide context or supporting information needed to complete the order.)
     */
    public List<Resource> getSupportingInformationTarget() {
        if (this.supportingInformationTarget == null)
            this.supportingInformationTarget = new ArrayList<Resource>();
        return this.supportingInformationTarget;
    }

    /**
     * @return {@link #specimen} (One or more specimens that the diagnostic investigation is about.)
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
     * @return {@link #specimen} (One or more specimens that the diagnostic investigation is about.)
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
    public DiagnosticOrder addSpecimen(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.specimen == null)
            this.specimen = new ArrayList<Reference>();
        this.specimen.add(t);
        return this;
    }

    /**
     * @return {@link #specimen} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. One or more specimens that the diagnostic investigation is about.)
     */
    public List<Specimen> getSpecimenTarget() {
        if (this.specimenTarget == null)
            this.specimenTarget = new ArrayList<Specimen>();
        return this.specimenTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #specimen} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. One or more specimens that the diagnostic investigation is about.)
     */
    public Specimen addSpecimenTarget() {
        Specimen r = new Specimen();
        if (this.specimenTarget == null)
            this.specimenTarget = new ArrayList<Specimen>();
        this.specimenTarget.add(r);
        return r;
    }

    /**
     * @return {@link #status} (The status of the order.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DiagnosticOrderStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrder.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<DiagnosticOrderStatus>(new DiagnosticOrderStatusEnumFactory());
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
    public DiagnosticOrder setStatusElement(Enumeration<DiagnosticOrderStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the order.
     */
    public DiagnosticOrderStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the order.
     */
    public DiagnosticOrder setStatus(DiagnosticOrderStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<DiagnosticOrderStatus>(new DiagnosticOrderStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #priority} (The clinical priority associated with this order.). This is the underlying object with id, value and extensions. The accessor "getPriority" gives direct access to the value
     */
    public Enumeration<DiagnosticOrderPriority> getPriorityElement() {
        if (this.priority == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticOrder.priority");
            else if (Configuration.doAutoCreate())
                // bb
                this.priority = new Enumeration<DiagnosticOrderPriority>(new DiagnosticOrderPriorityEnumFactory());
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
    public DiagnosticOrder setPriorityElement(Enumeration<DiagnosticOrderPriority> value) {
        this.priority = value;
        return this;
    }

    /**
     * @return The clinical priority associated with this order.
     */
    public DiagnosticOrderPriority getPriority() {
        return this.priority == null ? null : this.priority.getValue();
    }

    /**
     * @param value The clinical priority associated with this order.
     */
    public DiagnosticOrder setPriority(DiagnosticOrderPriority value) {
        if (value == null)
            this.priority = null;
        else {
            if (this.priority == null)
                this.priority = new Enumeration<DiagnosticOrderPriority>(new DiagnosticOrderPriorityEnumFactory());
            this.priority.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #event} (A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed.)
     */
    public List<DiagnosticOrderEventComponent> getEvent() {
        if (this.event == null)
            this.event = new ArrayList<DiagnosticOrderEventComponent>();
        return this.event;
    }

    public boolean hasEvent() {
        if (this.event == null)
            return false;
        for (DiagnosticOrderEventComponent item : this.event) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #event} (A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed.)
     */
    // syntactic sugar
    public DiagnosticOrderEventComponent addEvent() {
        // 3
        DiagnosticOrderEventComponent t = new DiagnosticOrderEventComponent();
        if (this.event == null)
            this.event = new ArrayList<DiagnosticOrderEventComponent>();
        this.event.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticOrder addEvent(DiagnosticOrderEventComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.event == null)
            this.event = new ArrayList<DiagnosticOrderEventComponent>();
        this.event.add(t);
        return this;
    }

    /**
     * @return {@link #item} (The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested.)
     */
    public List<DiagnosticOrderItemComponent> getItem() {
        if (this.item == null)
            this.item = new ArrayList<DiagnosticOrderItemComponent>();
        return this.item;
    }

    public boolean hasItem() {
        if (this.item == null)
            return false;
        for (DiagnosticOrderItemComponent item : this.item) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #item} (The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested.)
     */
    // syntactic sugar
    public DiagnosticOrderItemComponent addItem() {
        // 3
        DiagnosticOrderItemComponent t = new DiagnosticOrderItemComponent();
        if (this.item == null)
            this.item = new ArrayList<DiagnosticOrderItemComponent>();
        this.item.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticOrder addItem(DiagnosticOrderItemComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.item == null)
            this.item = new ArrayList<DiagnosticOrderItemComponent>();
        this.item.add(t);
        return this;
    }

    /**
     * @return {@link #note} (Any other notes associated with this patient, specimen or order (e.g. "patient hates needles").)
     */
    public List<Annotation> getNote() {
        if (this.note == null)
            this.note = new ArrayList<Annotation>();
        return this.note;
    }

    public boolean hasNote() {
        if (this.note == null)
            return false;
        for (Annotation item : this.note) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #note} (Any other notes associated with this patient, specimen or order (e.g. "patient hates needles").)
     */
    // syntactic sugar
    public Annotation addNote() {
        // 3
        Annotation t = new Annotation();
        if (this.note == null)
            this.note = new ArrayList<Annotation>();
        this.note.add(t);
        return t;
    }

    // syntactic sugar
    public DiagnosticOrder addNote(Annotation t) {
        // 3
        if (t == null)
            return this;
        if (this.note == null)
            this.note = new ArrayList<Annotation>();
        this.note.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("subject", "Reference(Patient|Group|Location|Device)", "Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("orderer", "Reference(Practitioner)", "The practitioner that holds legal responsibility for ordering the investigation.", 0, java.lang.Integer.MAX_VALUE, orderer));
        childrenList.add(new Property("identifier", "Identifier", "Identifiers assigned to this order instance by the orderer and/or  the receiver and/or order fulfiller.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "An encounter that provides additional information about the healthcare context in which this request is made.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("reason", "CodeableConcept", "An explanation or justification for why this diagnostic investigation is being requested.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("supportingInformation", "Reference(Observation|Condition|DocumentReference)", "Additional clinical information about the patient or specimen that may influence test interpretations.  This includes observations explicitly requested by the producer(filler) to provide context or supporting information needed to complete the order.", 0, java.lang.Integer.MAX_VALUE, supportingInformation));
        childrenList.add(new Property("specimen", "Reference(Specimen)", "One or more specimens that the diagnostic investigation is about.", 0, java.lang.Integer.MAX_VALUE, specimen));
        childrenList.add(new Property("status", "code", "The status of the order.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("priority", "code", "The clinical priority associated with this order.", 0, java.lang.Integer.MAX_VALUE, priority));
        childrenList.add(new Property("event", "", "A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed.", 0, java.lang.Integer.MAX_VALUE, event));
        childrenList.add(new Property("item", "", "The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested.", 0, java.lang.Integer.MAX_VALUE, item));
        childrenList.add(new Property("note", "Annotation", "Any other notes associated with this patient, specimen or order (e.g. \"patient hates needles\").", 0, java.lang.Integer.MAX_VALUE, note));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("orderer"))
            // Reference
            this.orderer = castToReference(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("reason"))
            this.getReason().add(castToCodeableConcept(value));
        else if (name.equals("supportingInformation"))
            this.getSupportingInformation().add(castToReference(value));
        else if (name.equals("specimen"))
            this.getSpecimen().add(castToReference(value));
        else if (name.equals("status"))
            // Enumeration<DiagnosticOrderStatus>
            this.status = new DiagnosticOrderStatusEnumFactory().fromType(value);
        else if (name.equals("priority"))
            // Enumeration<DiagnosticOrderPriority>
            this.priority = new DiagnosticOrderPriorityEnumFactory().fromType(value);
        else if (name.equals("event"))
            this.getEvent().add((DiagnosticOrderEventComponent) value);
        else if (name.equals("item"))
            this.getItem().add((DiagnosticOrderItemComponent) value);
        else if (name.equals("note"))
            this.getNote().add(castToAnnotation(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("orderer")) {
            this.orderer = new Reference();
            return this.orderer;
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("reason")) {
            return addReason();
        } else if (name.equals("supportingInformation")) {
            return addSupportingInformation();
        } else if (name.equals("specimen")) {
            return addSpecimen();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type DiagnosticOrder.status");
        } else if (name.equals("priority")) {
            throw new FHIRException("Cannot call addChild on a primitive type DiagnosticOrder.priority");
        } else if (name.equals("event")) {
            return addEvent();
        } else if (name.equals("item")) {
            return addItem();
        } else if (name.equals("note")) {
            return addNote();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "DiagnosticOrder";
    }

    public DiagnosticOrder copy() {
        DiagnosticOrder dst = new DiagnosticOrder();
        copyValues(dst);
        dst.subject = subject == null ? null : subject.copy();
        dst.orderer = orderer == null ? null : orderer.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.encounter = encounter == null ? null : encounter.copy();
        if (reason != null) {
            dst.reason = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reason) dst.reason.add(i.copy());
        }
        ;
        if (supportingInformation != null) {
            dst.supportingInformation = new ArrayList<Reference>();
            for (Reference i : supportingInformation) dst.supportingInformation.add(i.copy());
        }
        ;
        if (specimen != null) {
            dst.specimen = new ArrayList<Reference>();
            for (Reference i : specimen) dst.specimen.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        dst.priority = priority == null ? null : priority.copy();
        if (event != null) {
            dst.event = new ArrayList<DiagnosticOrderEventComponent>();
            for (DiagnosticOrderEventComponent i : event) dst.event.add(i.copy());
        }
        ;
        if (item != null) {
            dst.item = new ArrayList<DiagnosticOrderItemComponent>();
            for (DiagnosticOrderItemComponent i : item) dst.item.add(i.copy());
        }
        ;
        if (note != null) {
            dst.note = new ArrayList<Annotation>();
            for (Annotation i : note) dst.note.add(i.copy());
        }
        ;
        return dst;
    }

    protected DiagnosticOrder typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DiagnosticOrder))
            return false;
        DiagnosticOrder o = (DiagnosticOrder) other;
        return compareDeep(subject, o.subject, true) && compareDeep(orderer, o.orderer, true) && compareDeep(identifier, o.identifier, true) && compareDeep(encounter, o.encounter, true) && compareDeep(reason, o.reason, true) && compareDeep(supportingInformation, o.supportingInformation, true) && compareDeep(specimen, o.specimen, true) && compareDeep(status, o.status, true) && compareDeep(priority, o.priority, true) && compareDeep(event, o.event, true) && compareDeep(item, o.item, true) && compareDeep(note, o.note, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DiagnosticOrder))
            return false;
        DiagnosticOrder o = (DiagnosticOrder) other;
        return compareValues(status, o.status, true) && compareValues(priority, o.priority, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (subject == null || subject.isEmpty()) && (orderer == null || orderer.isEmpty()) && (identifier == null || identifier.isEmpty()) && (encounter == null || encounter.isEmpty()) && (reason == null || reason.isEmpty()) && (supportingInformation == null || supportingInformation.isEmpty()) && (specimen == null || specimen.isEmpty()) && (status == null || status.isEmpty()) && (priority == null || priority.isEmpty()) && (event == null || event.isEmpty()) && (item == null || item.isEmpty()) && (note == null || note.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.DiagnosticOrder;
    }

    public static final String SP_ITEMPASTSTATUS = "item-past-status";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_BODYSITE = "bodysite";

    public static final String SP_CODE = "code";

    public static final String SP_EVENTDATE = "event-date";

    public static final String SP_EVENTSTATUSDATE = "event-status-date";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_ACTOR = "actor";

    public static final String SP_ITEMDATE = "item-date";

    public static final String SP_ITEMSTATUSDATE = "item-status-date";

    public static final String SP_EVENTSTATUS = "event-status";

    public static final String SP_ITEMSTATUS = "item-status";

    public static final String SP_PATIENT = "patient";

    public static final String SP_ORDERER = "orderer";

    public static final String SP_SPECIMEN = "specimen";

    public static final String SP_STATUS = "status";
}
