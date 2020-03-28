package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EpisodeOfCareEnum.EpisodeOfCareStatus;
import org.hl7.fhir.android.generated.dstu2.EpisodeOfCareEnum.EpisodeOfCareStatusEnumFactory;

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
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 */
public class EpisodeOfCare extends DomainResource {

    /**
     * Identifier(s) by which this EpisodeOfCare is known.
     */
    protected List<Identifier> identifier;

    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     */
    protected Enumeration<EpisodeOfCareStatus> status;

    /**
     * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
     */
    protected List<EpisodeOfCareStatusHistoryComponent> statusHistory;

    /**
     * A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care.
     */
    protected List<CodeableConcept> type;

    /**
     * A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.
     */
    protected List<Reference> condition;

    /**
     * The actual objects that are the target of the reference (A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.)
     */
    protected List<Condition> conditionTarget;

    /**
     * The patient that this EpisodeOfCare applies to.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient that this EpisodeOfCare applies to.)
     */
    protected Patient patientTarget;

    /**
     * The organization that has assumed the specific responsibilities for the specified duration.
     */
    protected Reference managingOrganization;

    /**
     * The actual object that is the target of the reference (The organization that has assumed the specific responsibilities for the specified duration.)
     */
    protected Organization managingOrganizationTarget;

    /**
     * The interval during which the managing organization assumes the defined responsibility.
     */
    protected Period period;

    /**
     * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
     */
    protected List<Reference> referralRequest;

    /**
     * The actual objects that are the target of the reference (Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.)
     */
    protected List<ReferralRequest> referralRequestTarget;

    /**
     * The practitioner that is the care manager/care co-ordinator for this patient.
     */
    protected Reference careManager;

    /**
     * The actual object that is the target of the reference (The practitioner that is the care manager/care co-ordinator for this patient.)
     */
    protected Practitioner careManagerTarget;

    /**
     * The list of practitioners that may be facilitating this episode of care for specific purposes.
     */
    protected List<EpisodeOfCareCareTeamComponent> careTeam;

    private static final long serialVersionUID = 1652653406L;

    /*
   * Constructor
   */
    public EpisodeOfCare() {
        super();
    }

    /*
   * Constructor
   */
    public EpisodeOfCare(Enumeration<EpisodeOfCareStatus> status, Reference patient) {
        super();
        this.status = status;
        this.patient = patient;
    }

    /**
     * @return {@link #identifier} (Identifier(s) by which this EpisodeOfCare is known.)
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
     * @return {@link #identifier} (Identifier(s) by which this EpisodeOfCare is known.)
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
    public EpisodeOfCare addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #status} (planned | waitlist | active | onhold | finished | cancelled.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<EpisodeOfCareStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCare.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<EpisodeOfCareStatus>(new EpisodeOfCareStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (planned | waitlist | active | onhold | finished | cancelled.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public EpisodeOfCare setStatusElement(Enumeration<EpisodeOfCareStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return planned | waitlist | active | onhold | finished | cancelled.
     */
    public EpisodeOfCareStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value planned | waitlist | active | onhold | finished | cancelled.
     */
    public EpisodeOfCare setStatus(EpisodeOfCareStatus value) {
        if (this.status == null)
            this.status = new Enumeration<EpisodeOfCareStatus>(new EpisodeOfCareStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #statusHistory} (The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).)
     */
    public List<EpisodeOfCareStatusHistoryComponent> getStatusHistory() {
        if (this.statusHistory == null)
            this.statusHistory = new ArrayList<EpisodeOfCareStatusHistoryComponent>();
        return this.statusHistory;
    }

    public boolean hasStatusHistory() {
        if (this.statusHistory == null)
            return false;
        for (EpisodeOfCareStatusHistoryComponent item : this.statusHistory) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #statusHistory} (The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).)
     */
    // syntactic sugar
    public EpisodeOfCareStatusHistoryComponent addStatusHistory() {
        // 3
        EpisodeOfCareStatusHistoryComponent t = new EpisodeOfCareStatusHistoryComponent();
        if (this.statusHistory == null)
            this.statusHistory = new ArrayList<EpisodeOfCareStatusHistoryComponent>();
        this.statusHistory.add(t);
        return t;
    }

    // syntactic sugar
    public EpisodeOfCare addStatusHistory(EpisodeOfCareStatusHistoryComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.statusHistory == null)
            this.statusHistory = new ArrayList<EpisodeOfCareStatusHistoryComponent>();
        this.statusHistory.add(t);
        return this;
    }

    /**
     * @return {@link #type} (A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care.)
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
     * @return {@link #type} (A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care.)
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
    public EpisodeOfCare addType(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        this.type.add(t);
        return this;
    }

    /**
     * @return {@link #condition} (A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.)
     */
    public List<Reference> getCondition() {
        if (this.condition == null)
            this.condition = new ArrayList<Reference>();
        return this.condition;
    }

    public boolean hasCondition() {
        if (this.condition == null)
            return false;
        for (Reference item : this.condition) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #condition} (A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.)
     */
    // syntactic sugar
    public Reference addCondition() {
        // 3
        Reference t = new Reference();
        if (this.condition == null)
            this.condition = new ArrayList<Reference>();
        this.condition.add(t);
        return t;
    }

    // syntactic sugar
    public EpisodeOfCare addCondition(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.condition == null)
            this.condition = new ArrayList<Reference>();
        this.condition.add(t);
        return this;
    }

    /**
     * @return {@link #condition} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.)
     */
    public List<Condition> getConditionTarget() {
        if (this.conditionTarget == null)
            this.conditionTarget = new ArrayList<Condition>();
        return this.conditionTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #condition} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.)
     */
    public Condition addConditionTarget() {
        Condition r = new Condition();
        if (this.conditionTarget == null)
            this.conditionTarget = new ArrayList<Condition>();
        this.conditionTarget.add(r);
        return r;
    }

    /**
     * @return {@link #patient} (The patient that this EpisodeOfCare applies to.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCare.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient that this EpisodeOfCare applies to.)
     */
    public EpisodeOfCare setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient that this EpisodeOfCare applies to.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCare.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient that this EpisodeOfCare applies to.)
     */
    public EpisodeOfCare setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #managingOrganization} (The organization that has assumed the specific responsibilities for the specified duration.)
     */
    public Reference getManagingOrganization() {
        if (this.managingOrganization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCare.managingOrganization");
            else if (Configuration.doAutoCreate())
                // cc
                this.managingOrganization = new Reference();
        return this.managingOrganization;
    }

    public boolean hasManagingOrganization() {
        return this.managingOrganization != null && !this.managingOrganization.isEmpty();
    }

    /**
     * @param value {@link #managingOrganization} (The organization that has assumed the specific responsibilities for the specified duration.)
     */
    public EpisodeOfCare setManagingOrganization(Reference value) {
        this.managingOrganization = value;
        return this;
    }

    /**
     * @return {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization that has assumed the specific responsibilities for the specified duration.)
     */
    public Organization getManagingOrganizationTarget() {
        if (this.managingOrganizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCare.managingOrganization");
            else if (Configuration.doAutoCreate())
                // aa
                this.managingOrganizationTarget = new Organization();
        return this.managingOrganizationTarget;
    }

    /**
     * @param value {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization that has assumed the specific responsibilities for the specified duration.)
     */
    public EpisodeOfCare setManagingOrganizationTarget(Organization value) {
        this.managingOrganizationTarget = value;
        return this;
    }

    /**
     * @return {@link #period} (The interval during which the managing organization assumes the defined responsibility.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCare.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The interval during which the managing organization assumes the defined responsibility.)
     */
    public EpisodeOfCare setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #referralRequest} (Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.)
     */
    public List<Reference> getReferralRequest() {
        if (this.referralRequest == null)
            this.referralRequest = new ArrayList<Reference>();
        return this.referralRequest;
    }

    public boolean hasReferralRequest() {
        if (this.referralRequest == null)
            return false;
        for (Reference item : this.referralRequest) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #referralRequest} (Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.)
     */
    // syntactic sugar
    public Reference addReferralRequest() {
        // 3
        Reference t = new Reference();
        if (this.referralRequest == null)
            this.referralRequest = new ArrayList<Reference>();
        this.referralRequest.add(t);
        return t;
    }

    // syntactic sugar
    public EpisodeOfCare addReferralRequest(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.referralRequest == null)
            this.referralRequest = new ArrayList<Reference>();
        this.referralRequest.add(t);
        return this;
    }

    /**
     * @return {@link #referralRequest} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.)
     */
    public List<ReferralRequest> getReferralRequestTarget() {
        if (this.referralRequestTarget == null)
            this.referralRequestTarget = new ArrayList<ReferralRequest>();
        return this.referralRequestTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #referralRequest} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.)
     */
    public ReferralRequest addReferralRequestTarget() {
        ReferralRequest r = new ReferralRequest();
        if (this.referralRequestTarget == null)
            this.referralRequestTarget = new ArrayList<ReferralRequest>();
        this.referralRequestTarget.add(r);
        return r;
    }

    /**
     * @return {@link #careManager} (The practitioner that is the care manager/care co-ordinator for this patient.)
     */
    public Reference getCareManager() {
        if (this.careManager == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCare.careManager");
            else if (Configuration.doAutoCreate())
                // cc
                this.careManager = new Reference();
        return this.careManager;
    }

    public boolean hasCareManager() {
        return this.careManager != null && !this.careManager.isEmpty();
    }

    /**
     * @param value {@link #careManager} (The practitioner that is the care manager/care co-ordinator for this patient.)
     */
    public EpisodeOfCare setCareManager(Reference value) {
        this.careManager = value;
        return this;
    }

    /**
     * @return {@link #careManager} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The practitioner that is the care manager/care co-ordinator for this patient.)
     */
    public Practitioner getCareManagerTarget() {
        if (this.careManagerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EpisodeOfCare.careManager");
            else if (Configuration.doAutoCreate())
                // aa
                this.careManagerTarget = new Practitioner();
        return this.careManagerTarget;
    }

    /**
     * @param value {@link #careManager} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The practitioner that is the care manager/care co-ordinator for this patient.)
     */
    public EpisodeOfCare setCareManagerTarget(Practitioner value) {
        this.careManagerTarget = value;
        return this;
    }

    /**
     * @return {@link #careTeam} (The list of practitioners that may be facilitating this episode of care for specific purposes.)
     */
    public List<EpisodeOfCareCareTeamComponent> getCareTeam() {
        if (this.careTeam == null)
            this.careTeam = new ArrayList<EpisodeOfCareCareTeamComponent>();
        return this.careTeam;
    }

    public boolean hasCareTeam() {
        if (this.careTeam == null)
            return false;
        for (EpisodeOfCareCareTeamComponent item : this.careTeam) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #careTeam} (The list of practitioners that may be facilitating this episode of care for specific purposes.)
     */
    // syntactic sugar
    public EpisodeOfCareCareTeamComponent addCareTeam() {
        // 3
        EpisodeOfCareCareTeamComponent t = new EpisodeOfCareCareTeamComponent();
        if (this.careTeam == null)
            this.careTeam = new ArrayList<EpisodeOfCareCareTeamComponent>();
        this.careTeam.add(t);
        return t;
    }

    // syntactic sugar
    public EpisodeOfCare addCareTeam(EpisodeOfCareCareTeamComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.careTeam == null)
            this.careTeam = new ArrayList<EpisodeOfCareCareTeamComponent>();
        this.careTeam.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifier(s) by which this EpisodeOfCare is known.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "planned | waitlist | active | onhold | finished | cancelled.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("statusHistory", "", "The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).", 0, java.lang.Integer.MAX_VALUE, statusHistory));
        childrenList.add(new Property("type", "CodeableConcept", "A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("condition", "Reference(Condition)", "A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.", 0, java.lang.Integer.MAX_VALUE, condition));
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient that this EpisodeOfCare applies to.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("managingOrganization", "Reference(Organization)", "The organization that has assumed the specific responsibilities for the specified duration.", 0, java.lang.Integer.MAX_VALUE, managingOrganization));
        childrenList.add(new Property("period", "Period", "The interval during which the managing organization assumes the defined responsibility.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("referralRequest", "Reference(ReferralRequest)", "Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.", 0, java.lang.Integer.MAX_VALUE, referralRequest));
        childrenList.add(new Property("careManager", "Reference(Practitioner)", "The practitioner that is the care manager/care co-ordinator for this patient.", 0, java.lang.Integer.MAX_VALUE, careManager));
        childrenList.add(new Property("careTeam", "", "The list of practitioners that may be facilitating this episode of care for specific purposes.", 0, java.lang.Integer.MAX_VALUE, careTeam));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
            // Enumeration<EpisodeOfCareStatus>
            this.status = new EpisodeOfCareStatusEnumFactory().fromType(value);
        else if (name.equals("statusHistory"))
            this.getStatusHistory().add((EpisodeOfCareStatusHistoryComponent) value);
        else if (name.equals("type"))
            this.getType().add(castToCodeableConcept(value));
        else if (name.equals("condition"))
            this.getCondition().add(castToReference(value));
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("managingOrganization"))
            // Reference
            this.managingOrganization = castToReference(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("referralRequest"))
            this.getReferralRequest().add(castToReference(value));
        else if (name.equals("careManager"))
            // Reference
            this.careManager = castToReference(value);
        else if (name.equals("careTeam"))
            this.getCareTeam().add((EpisodeOfCareCareTeamComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type EpisodeOfCare.status");
        } else if (name.equals("statusHistory")) {
            return addStatusHistory();
        } else if (name.equals("type")) {
            return addType();
        } else if (name.equals("condition")) {
            return addCondition();
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("managingOrganization")) {
            this.managingOrganization = new Reference();
            return this.managingOrganization;
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("referralRequest")) {
            return addReferralRequest();
        } else if (name.equals("careManager")) {
            this.careManager = new Reference();
            return this.careManager;
        } else if (name.equals("careTeam")) {
            return addCareTeam();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "EpisodeOfCare";
    }

    public EpisodeOfCare copy() {
        EpisodeOfCare dst = new EpisodeOfCare();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        if (statusHistory != null) {
            dst.statusHistory = new ArrayList<EpisodeOfCareStatusHistoryComponent>();
            for (EpisodeOfCareStatusHistoryComponent i : statusHistory) dst.statusHistory.add(i.copy());
        }
        ;
        if (type != null) {
            dst.type = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : type) dst.type.add(i.copy());
        }
        ;
        if (condition != null) {
            dst.condition = new ArrayList<Reference>();
            for (Reference i : condition) dst.condition.add(i.copy());
        }
        ;
        dst.patient = patient == null ? null : patient.copy();
        dst.managingOrganization = managingOrganization == null ? null : managingOrganization.copy();
        dst.period = period == null ? null : period.copy();
        if (referralRequest != null) {
            dst.referralRequest = new ArrayList<Reference>();
            for (Reference i : referralRequest) dst.referralRequest.add(i.copy());
        }
        ;
        dst.careManager = careManager == null ? null : careManager.copy();
        if (careTeam != null) {
            dst.careTeam = new ArrayList<EpisodeOfCareCareTeamComponent>();
            for (EpisodeOfCareCareTeamComponent i : careTeam) dst.careTeam.add(i.copy());
        }
        ;
        return dst;
    }

    protected EpisodeOfCare typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof EpisodeOfCare))
            return false;
        EpisodeOfCare o = (EpisodeOfCare) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(statusHistory, o.statusHistory, true) && compareDeep(type, o.type, true) && compareDeep(condition, o.condition, true) && compareDeep(patient, o.patient, true) && compareDeep(managingOrganization, o.managingOrganization, true) && compareDeep(period, o.period, true) && compareDeep(referralRequest, o.referralRequest, true) && compareDeep(careManager, o.careManager, true) && compareDeep(careTeam, o.careTeam, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof EpisodeOfCare))
            return false;
        EpisodeOfCare o = (EpisodeOfCare) other;
        return compareValues(status, o.status, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (statusHistory == null || statusHistory.isEmpty()) && (type == null || type.isEmpty()) && (condition == null || condition.isEmpty()) && (patient == null || patient.isEmpty()) && (managingOrganization == null || managingOrganization.isEmpty()) && (period == null || period.isEmpty()) && (referralRequest == null || referralRequest.isEmpty()) && (careManager == null || careManager.isEmpty()) && (careTeam == null || careTeam.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.EpisodeOfCare;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CONDITION = "condition";

    public static final String SP_INCOMINGREFERRAL = "incomingreferral";

    public static final String SP_PATIENT = "patient";

    public static final String SP_ORGANIZATION = "organization";

    public static final String SP_TEAMMEMBER = "team-member";

    public static final String SP_TYPE = "type";

    public static final String SP_CAREMANAGER = "care-manager";

    public static final String SP_STATUS = "status";
}
