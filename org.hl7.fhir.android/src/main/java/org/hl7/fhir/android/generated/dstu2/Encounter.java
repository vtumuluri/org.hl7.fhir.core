package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterState;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterStateEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClass;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClassEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatus;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatusEnumFactory;

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
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
public class Encounter extends DomainResource {

    /**
     * Identifier(s) by which this encounter is known.
     */
    protected List<Identifier> identifier;

    /**
     * planned | arrived | in-progress | onleave | finished | cancelled.
     */
    protected Enumeration<EncounterState> status;

    /**
     * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.
     */
    protected List<EncounterStatusHistoryComponent> statusHistory;

    /**
     * inpatient | outpatient | ambulatory | emergency +.
     */
    protected Enumeration<EncounterClass> class_;

    /**
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
     */
    protected List<CodeableConcept> type;

    /**
     * Indicates the urgency of the encounter.
     */
    protected CodeableConcept priority;

    /**
     * The patient present at the encounter.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient present at the encounter.)
     */
    protected Patient patientTarget;

    /**
     * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
     */
    protected List<Reference> episodeOfCare;

    /**
     * The actual objects that are the target of the reference (Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).)
     */
    protected List<EpisodeOfCare> episodeOfCareTarget;

    /**
     * The referral request this encounter satisfies (incoming referral).
     */
    protected List<Reference> incomingReferral;

    /**
     * The actual objects that are the target of the reference (The referral request this encounter satisfies (incoming referral).)
     */
    protected List<ReferralRequest> incomingReferralTarget;

    /**
     * The list of people responsible for providing the service.
     */
    protected List<EncounterParticipantComponent> participant;

    /**
     * The appointment that scheduled this encounter.
     */
    protected Reference appointment;

    /**
     * The actual object that is the target of the reference (The appointment that scheduled this encounter.)
     */
    protected Appointment appointmentTarget;

    /**
     * The start and end time of the encounter.
     */
    protected Period period;

    /**
     * Quantity of time the encounter lasted. This excludes the time during leaves of absence.
     */
    protected Duration length;

    /**
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
     */
    protected List<CodeableConcept> reason;

    /**
     * Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
     */
    protected List<Reference> indication;

    /**
     * The actual objects that are the target of the reference (Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.)
     */
    protected List<Resource> indicationTarget;

    /**
     * Details about the admission to a healthcare service.
     */
    protected EncounterHospitalizationComponent hospitalization;

    /**
     * List of locations where  the patient has been during this encounter.
     */
    protected List<EncounterLocationComponent> location;

    /**
     * An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.
     */
    protected Reference serviceProvider;

    /**
     * The actual object that is the target of the reference (An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.)
     */
    protected Organization serviceProviderTarget;

    /**
     * Another Encounter of which this encounter is a part of (administratively or in time).
     */
    protected Reference partOf;

    /**
     * The actual object that is the target of the reference (Another Encounter of which this encounter is a part of (administratively or in time).)
     */
    protected Encounter partOfTarget;

    private static final long serialVersionUID = 929562300L;

    /*
   * Constructor
   */
    public Encounter() {
        super();
    }

    /*
   * Constructor
   */
    public Encounter(Enumeration<EncounterState> status) {
        super();
        this.status = status;
    }

    /**
     * @return {@link #identifier} (Identifier(s) by which this encounter is known.)
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
     * @return {@link #identifier} (Identifier(s) by which this encounter is known.)
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
    public Encounter addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #status} (planned | arrived | in-progress | onleave | finished | cancelled.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<EncounterState> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<EncounterState>(new EncounterStateEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (planned | arrived | in-progress | onleave | finished | cancelled.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Encounter setStatusElement(Enumeration<EncounterState> value) {
        this.status = value;
        return this;
    }

    /**
     * @return planned | arrived | in-progress | onleave | finished | cancelled.
     */
    public EncounterState getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value planned | arrived | in-progress | onleave | finished | cancelled.
     */
    public Encounter setStatus(EncounterState value) {
        if (this.status == null)
            this.status = new Enumeration<EncounterState>(new EncounterStateEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #statusHistory} (The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.)
     */
    public List<EncounterStatusHistoryComponent> getStatusHistory() {
        if (this.statusHistory == null)
            this.statusHistory = new ArrayList<EncounterStatusHistoryComponent>();
        return this.statusHistory;
    }

    public boolean hasStatusHistory() {
        if (this.statusHistory == null)
            return false;
        for (EncounterStatusHistoryComponent item : this.statusHistory) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #statusHistory} (The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.)
     */
    // syntactic sugar
    public EncounterStatusHistoryComponent addStatusHistory() {
        // 3
        EncounterStatusHistoryComponent t = new EncounterStatusHistoryComponent();
        if (this.statusHistory == null)
            this.statusHistory = new ArrayList<EncounterStatusHistoryComponent>();
        this.statusHistory.add(t);
        return t;
    }

    // syntactic sugar
    public Encounter addStatusHistory(EncounterStatusHistoryComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.statusHistory == null)
            this.statusHistory = new ArrayList<EncounterStatusHistoryComponent>();
        this.statusHistory.add(t);
        return this;
    }

    /**
     * @return {@link #class_} (inpatient | outpatient | ambulatory | emergency +.). This is the underlying object with id, value and extensions. The accessor "getClass_" gives direct access to the value
     */
    public Enumeration<EncounterClass> getClass_Element() {
        if (this.class_ == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.class_");
            else if (Configuration.doAutoCreate())
                // bb
                this.class_ = new Enumeration<EncounterClass>(new EncounterClassEnumFactory());
        return this.class_;
    }

    public boolean hasClass_Element() {
        return this.class_ != null && !this.class_.isEmpty();
    }

    public boolean hasClass_() {
        return this.class_ != null && !this.class_.isEmpty();
    }

    /**
     * @param value {@link #class_} (inpatient | outpatient | ambulatory | emergency +.). This is the underlying object with id, value and extensions. The accessor "getClass_" gives direct access to the value
     */
    public Encounter setClass_Element(Enumeration<EncounterClass> value) {
        this.class_ = value;
        return this;
    }

    /**
     * @return inpatient | outpatient | ambulatory | emergency +.
     */
    public EncounterClass getClass_() {
        return this.class_ == null ? null : this.class_.getValue();
    }

    /**
     * @param value inpatient | outpatient | ambulatory | emergency +.
     */
    public Encounter setClass_(EncounterClass value) {
        if (value == null)
            this.class_ = null;
        else {
            if (this.class_ == null)
                this.class_ = new Enumeration<EncounterClass>(new EncounterClassEnumFactory());
            this.class_.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).)
     */
    public List<CodeableConcept> getType() {
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        return this.type;
    }

    public boolean hasType() {
        if (this.type == null)
            return false;
        for (CodeableConcept item : this.type) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #type} (Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).)
     */
    // syntactic sugar
    public CodeableConcept addType() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        this.type.add(t);
        return t;
    }

    // syntactic sugar
    public Encounter addType(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        this.type.add(t);
        return this;
    }

    /**
     * @return {@link #priority} (Indicates the urgency of the encounter.)
     */
    public CodeableConcept getPriority() {
        if (this.priority == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.priority");
            else if (Configuration.doAutoCreate())
                // cc
                this.priority = new CodeableConcept();
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null && !this.priority.isEmpty();
    }

    /**
     * @param value {@link #priority} (Indicates the urgency of the encounter.)
     */
    public Encounter setPriority(CodeableConcept value) {
        this.priority = value;
        return this;
    }

    /**
     * @return {@link #patient} (The patient present at the encounter.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient present at the encounter.)
     */
    public Encounter setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient present at the encounter.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient present at the encounter.)
     */
    public Encounter setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #episodeOfCare} (Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).)
     */
    public List<Reference> getEpisodeOfCare() {
        if (this.episodeOfCare == null)
            this.episodeOfCare = new ArrayList<Reference>();
        return this.episodeOfCare;
    }

    public boolean hasEpisodeOfCare() {
        if (this.episodeOfCare == null)
            return false;
        for (Reference item : this.episodeOfCare) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #episodeOfCare} (Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).)
     */
    // syntactic sugar
    public Reference addEpisodeOfCare() {
        // 3
        Reference t = new Reference();
        if (this.episodeOfCare == null)
            this.episodeOfCare = new ArrayList<Reference>();
        this.episodeOfCare.add(t);
        return t;
    }

    // syntactic sugar
    public Encounter addEpisodeOfCare(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.episodeOfCare == null)
            this.episodeOfCare = new ArrayList<Reference>();
        this.episodeOfCare.add(t);
        return this;
    }

    /**
     * @return {@link #episodeOfCare} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).)
     */
    public List<EpisodeOfCare> getEpisodeOfCareTarget() {
        if (this.episodeOfCareTarget == null)
            this.episodeOfCareTarget = new ArrayList<EpisodeOfCare>();
        return this.episodeOfCareTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #episodeOfCare} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).)
     */
    public EpisodeOfCare addEpisodeOfCareTarget() {
        EpisodeOfCare r = new EpisodeOfCare();
        if (this.episodeOfCareTarget == null)
            this.episodeOfCareTarget = new ArrayList<EpisodeOfCare>();
        this.episodeOfCareTarget.add(r);
        return r;
    }

    /**
     * @return {@link #incomingReferral} (The referral request this encounter satisfies (incoming referral).)
     */
    public List<Reference> getIncomingReferral() {
        if (this.incomingReferral == null)
            this.incomingReferral = new ArrayList<Reference>();
        return this.incomingReferral;
    }

    public boolean hasIncomingReferral() {
        if (this.incomingReferral == null)
            return false;
        for (Reference item : this.incomingReferral) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #incomingReferral} (The referral request this encounter satisfies (incoming referral).)
     */
    // syntactic sugar
    public Reference addIncomingReferral() {
        // 3
        Reference t = new Reference();
        if (this.incomingReferral == null)
            this.incomingReferral = new ArrayList<Reference>();
        this.incomingReferral.add(t);
        return t;
    }

    // syntactic sugar
    public Encounter addIncomingReferral(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.incomingReferral == null)
            this.incomingReferral = new ArrayList<Reference>();
        this.incomingReferral.add(t);
        return this;
    }

    /**
     * @return {@link #incomingReferral} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The referral request this encounter satisfies (incoming referral).)
     */
    public List<ReferralRequest> getIncomingReferralTarget() {
        if (this.incomingReferralTarget == null)
            this.incomingReferralTarget = new ArrayList<ReferralRequest>();
        return this.incomingReferralTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #incomingReferral} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. The referral request this encounter satisfies (incoming referral).)
     */
    public ReferralRequest addIncomingReferralTarget() {
        ReferralRequest r = new ReferralRequest();
        if (this.incomingReferralTarget == null)
            this.incomingReferralTarget = new ArrayList<ReferralRequest>();
        this.incomingReferralTarget.add(r);
        return r;
    }

    /**
     * @return {@link #participant} (The list of people responsible for providing the service.)
     */
    public List<EncounterParticipantComponent> getParticipant() {
        if (this.participant == null)
            this.participant = new ArrayList<EncounterParticipantComponent>();
        return this.participant;
    }

    public boolean hasParticipant() {
        if (this.participant == null)
            return false;
        for (EncounterParticipantComponent item : this.participant) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #participant} (The list of people responsible for providing the service.)
     */
    // syntactic sugar
    public EncounterParticipantComponent addParticipant() {
        // 3
        EncounterParticipantComponent t = new EncounterParticipantComponent();
        if (this.participant == null)
            this.participant = new ArrayList<EncounterParticipantComponent>();
        this.participant.add(t);
        return t;
    }

    // syntactic sugar
    public Encounter addParticipant(EncounterParticipantComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.participant == null)
            this.participant = new ArrayList<EncounterParticipantComponent>();
        this.participant.add(t);
        return this;
    }

    /**
     * @return {@link #appointment} (The appointment that scheduled this encounter.)
     */
    public Reference getAppointment() {
        if (this.appointment == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.appointment");
            else if (Configuration.doAutoCreate())
                // cc
                this.appointment = new Reference();
        return this.appointment;
    }

    public boolean hasAppointment() {
        return this.appointment != null && !this.appointment.isEmpty();
    }

    /**
     * @param value {@link #appointment} (The appointment that scheduled this encounter.)
     */
    public Encounter setAppointment(Reference value) {
        this.appointment = value;
        return this;
    }

    /**
     * @return {@link #appointment} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The appointment that scheduled this encounter.)
     */
    public Appointment getAppointmentTarget() {
        if (this.appointmentTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.appointment");
            else if (Configuration.doAutoCreate())
                // aa
                this.appointmentTarget = new Appointment();
        return this.appointmentTarget;
    }

    /**
     * @param value {@link #appointment} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The appointment that scheduled this encounter.)
     */
    public Encounter setAppointmentTarget(Appointment value) {
        this.appointmentTarget = value;
        return this;
    }

    /**
     * @return {@link #period} (The start and end time of the encounter.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The start and end time of the encounter.)
     */
    public Encounter setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #length} (Quantity of time the encounter lasted. This excludes the time during leaves of absence.)
     */
    public Duration getLength() {
        if (this.length == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.length");
            else if (Configuration.doAutoCreate())
                // cc
                this.length = new Duration();
        return this.length;
    }

    public boolean hasLength() {
        return this.length != null && !this.length.isEmpty();
    }

    /**
     * @param value {@link #length} (Quantity of time the encounter lasted. This excludes the time during leaves of absence.)
     */
    public Encounter setLength(Duration value) {
        this.length = value;
        return this;
    }

    /**
     * @return {@link #reason} (Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.)
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
     * @return {@link #reason} (Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.)
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
    public Encounter addReason(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        this.reason.add(t);
        return this;
    }

    /**
     * @return {@link #indication} (Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.)
     */
    public List<Reference> getIndication() {
        if (this.indication == null)
            this.indication = new ArrayList<Reference>();
        return this.indication;
    }

    public boolean hasIndication() {
        if (this.indication == null)
            return false;
        for (Reference item : this.indication) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #indication} (Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.)
     */
    // syntactic sugar
    public Reference addIndication() {
        // 3
        Reference t = new Reference();
        if (this.indication == null)
            this.indication = new ArrayList<Reference>();
        this.indication.add(t);
        return t;
    }

    // syntactic sugar
    public Encounter addIndication(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.indication == null)
            this.indication = new ArrayList<Reference>();
        this.indication.add(t);
        return this;
    }

    /**
     * @return {@link #indication} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.)
     */
    public List<Resource> getIndicationTarget() {
        if (this.indicationTarget == null)
            this.indicationTarget = new ArrayList<Resource>();
        return this.indicationTarget;
    }

    /**
     * @return {@link #hospitalization} (Details about the admission to a healthcare service.)
     */
    public EncounterHospitalizationComponent getHospitalization() {
        if (this.hospitalization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.hospitalization");
            else if (Configuration.doAutoCreate())
                // cc
                this.hospitalization = new EncounterHospitalizationComponent();
        return this.hospitalization;
    }

    public boolean hasHospitalization() {
        return this.hospitalization != null && !this.hospitalization.isEmpty();
    }

    /**
     * @param value {@link #hospitalization} (Details about the admission to a healthcare service.)
     */
    public Encounter setHospitalization(EncounterHospitalizationComponent value) {
        this.hospitalization = value;
        return this;
    }

    /**
     * @return {@link #location} (List of locations where  the patient has been during this encounter.)
     */
    public List<EncounterLocationComponent> getLocation() {
        if (this.location == null)
            this.location = new ArrayList<EncounterLocationComponent>();
        return this.location;
    }

    public boolean hasLocation() {
        if (this.location == null)
            return false;
        for (EncounterLocationComponent item : this.location) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #location} (List of locations where  the patient has been during this encounter.)
     */
    // syntactic sugar
    public EncounterLocationComponent addLocation() {
        // 3
        EncounterLocationComponent t = new EncounterLocationComponent();
        if (this.location == null)
            this.location = new ArrayList<EncounterLocationComponent>();
        this.location.add(t);
        return t;
    }

    // syntactic sugar
    public Encounter addLocation(EncounterLocationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.location == null)
            this.location = new ArrayList<EncounterLocationComponent>();
        this.location.add(t);
        return this;
    }

    /**
     * @return {@link #serviceProvider} (An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.)
     */
    public Reference getServiceProvider() {
        if (this.serviceProvider == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.serviceProvider");
            else if (Configuration.doAutoCreate())
                // cc
                this.serviceProvider = new Reference();
        return this.serviceProvider;
    }

    public boolean hasServiceProvider() {
        return this.serviceProvider != null && !this.serviceProvider.isEmpty();
    }

    /**
     * @param value {@link #serviceProvider} (An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.)
     */
    public Encounter setServiceProvider(Reference value) {
        this.serviceProvider = value;
        return this;
    }

    /**
     * @return {@link #serviceProvider} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.)
     */
    public Organization getServiceProviderTarget() {
        if (this.serviceProviderTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.serviceProvider");
            else if (Configuration.doAutoCreate())
                // aa
                this.serviceProviderTarget = new Organization();
        return this.serviceProviderTarget;
    }

    /**
     * @param value {@link #serviceProvider} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.)
     */
    public Encounter setServiceProviderTarget(Organization value) {
        this.serviceProviderTarget = value;
        return this;
    }

    /**
     * @return {@link #partOf} (Another Encounter of which this encounter is a part of (administratively or in time).)
     */
    public Reference getPartOf() {
        if (this.partOf == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.partOf");
            else if (Configuration.doAutoCreate())
                // cc
                this.partOf = new Reference();
        return this.partOf;
    }

    public boolean hasPartOf() {
        return this.partOf != null && !this.partOf.isEmpty();
    }

    /**
     * @param value {@link #partOf} (Another Encounter of which this encounter is a part of (administratively or in time).)
     */
    public Encounter setPartOf(Reference value) {
        this.partOf = value;
        return this;
    }

    /**
     * @return {@link #partOf} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Another Encounter of which this encounter is a part of (administratively or in time).)
     */
    public Encounter getPartOfTarget() {
        if (this.partOfTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Encounter.partOf");
            else if (Configuration.doAutoCreate())
                // aa
                this.partOfTarget = new Encounter();
        return this.partOfTarget;
    }

    /**
     * @param value {@link #partOf} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Another Encounter of which this encounter is a part of (administratively or in time).)
     */
    public Encounter setPartOfTarget(Encounter value) {
        this.partOfTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifier(s) by which this encounter is known.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "planned | arrived | in-progress | onleave | finished | cancelled.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("statusHistory", "", "The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.", 0, java.lang.Integer.MAX_VALUE, statusHistory));
        childrenList.add(new Property("class", "code", "inpatient | outpatient | ambulatory | emergency +.", 0, java.lang.Integer.MAX_VALUE, class_));
        childrenList.add(new Property("type", "CodeableConcept", "Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("priority", "CodeableConcept", "Indicates the urgency of the encounter.", 0, java.lang.Integer.MAX_VALUE, priority));
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient present at the encounter.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("episodeOfCare", "Reference(EpisodeOfCare)", "Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).", 0, java.lang.Integer.MAX_VALUE, episodeOfCare));
        childrenList.add(new Property("incomingReferral", "Reference(ReferralRequest)", "The referral request this encounter satisfies (incoming referral).", 0, java.lang.Integer.MAX_VALUE, incomingReferral));
        childrenList.add(new Property("participant", "", "The list of people responsible for providing the service.", 0, java.lang.Integer.MAX_VALUE, participant));
        childrenList.add(new Property("appointment", "Reference(Appointment)", "The appointment that scheduled this encounter.", 0, java.lang.Integer.MAX_VALUE, appointment));
        childrenList.add(new Property("period", "Period", "The start and end time of the encounter.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("length", "Duration", "Quantity of time the encounter lasted. This excludes the time during leaves of absence.", 0, java.lang.Integer.MAX_VALUE, length));
        childrenList.add(new Property("reason", "CodeableConcept", "Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("indication", "Reference(Condition|Procedure)", "Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.", 0, java.lang.Integer.MAX_VALUE, indication));
        childrenList.add(new Property("hospitalization", "", "Details about the admission to a healthcare service.", 0, java.lang.Integer.MAX_VALUE, hospitalization));
        childrenList.add(new Property("location", "", "List of locations where  the patient has been during this encounter.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("serviceProvider", "Reference(Organization)", "An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.", 0, java.lang.Integer.MAX_VALUE, serviceProvider));
        childrenList.add(new Property("partOf", "Reference(Encounter)", "Another Encounter of which this encounter is a part of (administratively or in time).", 0, java.lang.Integer.MAX_VALUE, partOf));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
            // Enumeration<EncounterState>
            this.status = new EncounterStateEnumFactory().fromType(value);
        else if (name.equals("statusHistory"))
            this.getStatusHistory().add((EncounterStatusHistoryComponent) value);
        else if (name.equals("class"))
            // Enumeration<EncounterClass>
            this.class_ = new EncounterClassEnumFactory().fromType(value);
        else if (name.equals("type"))
            this.getType().add(castToCodeableConcept(value));
        else if (name.equals("priority"))
            // CodeableConcept
            this.priority = castToCodeableConcept(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("episodeOfCare"))
            this.getEpisodeOfCare().add(castToReference(value));
        else if (name.equals("incomingReferral"))
            this.getIncomingReferral().add(castToReference(value));
        else if (name.equals("participant"))
            this.getParticipant().add((EncounterParticipantComponent) value);
        else if (name.equals("appointment"))
            // Reference
            this.appointment = castToReference(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("length"))
            // Duration
            this.length = castToDuration(value);
        else if (name.equals("reason"))
            this.getReason().add(castToCodeableConcept(value));
        else if (name.equals("indication"))
            this.getIndication().add(castToReference(value));
        else if (name.equals("hospitalization"))
            // EncounterHospitalizationComponent
            this.hospitalization = (EncounterHospitalizationComponent) value;
        else if (name.equals("location"))
            this.getLocation().add((EncounterLocationComponent) value);
        else if (name.equals("serviceProvider"))
            // Reference
            this.serviceProvider = castToReference(value);
        else if (name.equals("partOf"))
            // Reference
            this.partOf = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Encounter.status");
        } else if (name.equals("statusHistory")) {
            return addStatusHistory();
        } else if (name.equals("class")) {
            throw new FHIRException("Cannot call addChild on a primitive type Encounter.class");
        } else if (name.equals("type")) {
            return addType();
        } else if (name.equals("priority")) {
            this.priority = new CodeableConcept();
            return this.priority;
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("episodeOfCare")) {
            return addEpisodeOfCare();
        } else if (name.equals("incomingReferral")) {
            return addIncomingReferral();
        } else if (name.equals("participant")) {
            return addParticipant();
        } else if (name.equals("appointment")) {
            this.appointment = new Reference();
            return this.appointment;
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("length")) {
            this.length = new Duration();
            return this.length;
        } else if (name.equals("reason")) {
            return addReason();
        } else if (name.equals("indication")) {
            return addIndication();
        } else if (name.equals("hospitalization")) {
            this.hospitalization = new EncounterHospitalizationComponent();
            return this.hospitalization;
        } else if (name.equals("location")) {
            return addLocation();
        } else if (name.equals("serviceProvider")) {
            this.serviceProvider = new Reference();
            return this.serviceProvider;
        } else if (name.equals("partOf")) {
            this.partOf = new Reference();
            return this.partOf;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Encounter";
    }

    public Encounter copy() {
        Encounter dst = new Encounter();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        if (statusHistory != null) {
            dst.statusHistory = new ArrayList<EncounterStatusHistoryComponent>();
            for (EncounterStatusHistoryComponent i : statusHistory) dst.statusHistory.add(i.copy());
        }
        ;
        dst.class_ = class_ == null ? null : class_.copy();
        if (type != null) {
            dst.type = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : type) dst.type.add(i.copy());
        }
        ;
        dst.priority = priority == null ? null : priority.copy();
        dst.patient = patient == null ? null : patient.copy();
        if (episodeOfCare != null) {
            dst.episodeOfCare = new ArrayList<Reference>();
            for (Reference i : episodeOfCare) dst.episodeOfCare.add(i.copy());
        }
        ;
        if (incomingReferral != null) {
            dst.incomingReferral = new ArrayList<Reference>();
            for (Reference i : incomingReferral) dst.incomingReferral.add(i.copy());
        }
        ;
        if (participant != null) {
            dst.participant = new ArrayList<EncounterParticipantComponent>();
            for (EncounterParticipantComponent i : participant) dst.participant.add(i.copy());
        }
        ;
        dst.appointment = appointment == null ? null : appointment.copy();
        dst.period = period == null ? null : period.copy();
        dst.length = length == null ? null : length.copy();
        if (reason != null) {
            dst.reason = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reason) dst.reason.add(i.copy());
        }
        ;
        if (indication != null) {
            dst.indication = new ArrayList<Reference>();
            for (Reference i : indication) dst.indication.add(i.copy());
        }
        ;
        dst.hospitalization = hospitalization == null ? null : hospitalization.copy();
        if (location != null) {
            dst.location = new ArrayList<EncounterLocationComponent>();
            for (EncounterLocationComponent i : location) dst.location.add(i.copy());
        }
        ;
        dst.serviceProvider = serviceProvider == null ? null : serviceProvider.copy();
        dst.partOf = partOf == null ? null : partOf.copy();
        return dst;
    }

    protected Encounter typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Encounter))
            return false;
        Encounter o = (Encounter) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(statusHistory, o.statusHistory, true) && compareDeep(class_, o.class_, true) && compareDeep(type, o.type, true) && compareDeep(priority, o.priority, true) && compareDeep(patient, o.patient, true) && compareDeep(episodeOfCare, o.episodeOfCare, true) && compareDeep(incomingReferral, o.incomingReferral, true) && compareDeep(participant, o.participant, true) && compareDeep(appointment, o.appointment, true) && compareDeep(period, o.period, true) && compareDeep(length, o.length, true) && compareDeep(reason, o.reason, true) && compareDeep(indication, o.indication, true) && compareDeep(hospitalization, o.hospitalization, true) && compareDeep(location, o.location, true) && compareDeep(serviceProvider, o.serviceProvider, true) && compareDeep(partOf, o.partOf, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Encounter))
            return false;
        Encounter o = (Encounter) other;
        return compareValues(status, o.status, true) && compareValues(class_, o.class_, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (statusHistory == null || statusHistory.isEmpty()) && (class_ == null || class_.isEmpty()) && (type == null || type.isEmpty()) && (priority == null || priority.isEmpty()) && (patient == null || patient.isEmpty()) && (episodeOfCare == null || episodeOfCare.isEmpty()) && (incomingReferral == null || incomingReferral.isEmpty()) && (participant == null || participant.isEmpty()) && (appointment == null || appointment.isEmpty()) && (period == null || period.isEmpty()) && (length == null || length.isEmpty()) && (reason == null || reason.isEmpty()) && (indication == null || indication.isEmpty()) && (hospitalization == null || hospitalization.isEmpty()) && (location == null || location.isEmpty()) && (serviceProvider == null || serviceProvider.isEmpty()) && (partOf == null || partOf.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Encounter;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_REASON = "reason";

    public static final String SP_EPISODEOFCARE = "episodeofcare";

    public static final String SP_PARTICIPANTTYPE = "participant-type";

    public static final String SP_INCOMINGREFERRAL = "incomingreferral";

    public static final String SP_PRACTITIONER = "practitioner";

    public static final String SP_LENGTH = "length";

    public static final String SP_APPOINTMENT = "appointment";

    public static final String SP_PARTOF = "part-of";

    public static final String SP_PROCEDURE = "procedure";

    public static final String SP_TYPE = "type";

    public static final String SP_PARTICIPANT = "participant";

    public static final String SP_CONDITION = "condition";

    public static final String SP_PATIENT = "patient";

    public static final String SP_LOCATIONPERIOD = "location-period";

    public static final String SP_LOCATION = "location";

    public static final String SP_INDICATION = "indication";

    public static final String SP_SPECIALARRANGEMENT = "special-arrangement";

    public static final String SP_STATUS = "status";
}
