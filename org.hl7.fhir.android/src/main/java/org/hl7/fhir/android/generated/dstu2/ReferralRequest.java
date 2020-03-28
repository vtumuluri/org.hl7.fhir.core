package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ReferralRequestEnum.ReferralStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ReferralRequestEnum.ReferralStatus;

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
 * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization.
 */
public class ReferralRequest extends DomainResource {

    /**
     * The workflow status of the referral or transfer of care request.
     */
    protected Enumeration<ReferralStatus> status;

    /**
     * Business identifier that uniquely identifies the referral/care transfer request instance.
     */
    protected List<Identifier> identifier;

    /**
     * Date/DateTime of creation for draft requests and date of activation for active requests.
     */
    protected DateTimeType date;

    /**
     * An indication of the type of referral (or where applicable the type of transfer of care) request.
     */
    protected CodeableConcept type;

    /**
     * Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology.
     */
    protected CodeableConcept specialty;

    /**
     * An indication of the urgency of referral (or where applicable the type of transfer of care) request.
     */
    protected CodeableConcept priority;

    /**
     * The patient who is the subject of a referral or transfer of care request.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient who is the subject of a referral or transfer of care request.)
     */
    protected Patient patientTarget;

    /**
     * The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral).
     */
    protected Reference requester;

    /**
     * The actual object that is the target of the reference (The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral).)
     */
    protected Resource requesterTarget;

    /**
     * The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request.
     */
    protected List<Reference> recipient;

    /**
     * The actual objects that are the target of the reference (The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request.)
     */
    protected List<Resource> recipientTarget;

    /**
     * The encounter at which the request for referral or transfer of care is initiated.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (The encounter at which the request for referral or transfer of care is initiated.)
     */
    protected Encounter encounterTarget;

    /**
     * Date/DateTime the request for referral or transfer of care is sent by the author.
     */
    protected DateTimeType dateSent;

    /**
     * Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management.
     */
    protected CodeableConcept reason;

    /**
     * The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary.
     */
    protected StringType description;

    /**
     * The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion.
     */
    protected List<CodeableConcept> serviceRequested;

    /**
     * Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan.
     */
    protected List<Reference> supportingInformation;

    /**
     * The actual objects that are the target of the reference (Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan.)
     */
    protected List<Resource> supportingInformationTarget;

    /**
     * The period of time within which the services identified in the referral/transfer of care is specified or required to occur.
     */
    protected Period fulfillmentTime;

    private static final long serialVersionUID = 1948652599L;

    /*
   * Constructor
   */
    public ReferralRequest() {
        super();
    }

    /*
   * Constructor
   */
    public ReferralRequest(Enumeration<ReferralStatus> status) {
        super();
        this.status = status;
    }

    /**
     * @return {@link #status} (The workflow status of the referral or transfer of care request.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ReferralStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<ReferralStatus>(new ReferralStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The workflow status of the referral or transfer of care request.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ReferralRequest setStatusElement(Enumeration<ReferralStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The workflow status of the referral or transfer of care request.
     */
    public ReferralStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The workflow status of the referral or transfer of care request.
     */
    public ReferralRequest setStatus(ReferralStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ReferralStatus>(new ReferralStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #identifier} (Business identifier that uniquely identifies the referral/care transfer request instance.)
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
     * @return {@link #identifier} (Business identifier that uniquely identifies the referral/care transfer request instance.)
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
    public ReferralRequest addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #date} (Date/DateTime of creation for draft requests and date of activation for active requests.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.date");
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
     * @param value {@link #date} (Date/DateTime of creation for draft requests and date of activation for active requests.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ReferralRequest setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return Date/DateTime of creation for draft requests and date of activation for active requests.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value Date/DateTime of creation for draft requests and date of activation for active requests.
     */
    public ReferralRequest setDate(Date value) {
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
     * @return {@link #type} (An indication of the type of referral (or where applicable the type of transfer of care) request.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (An indication of the type of referral (or where applicable the type of transfer of care) request.)
     */
    public ReferralRequest setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #specialty} (Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology.)
     */
    public CodeableConcept getSpecialty() {
        if (this.specialty == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.specialty");
            else if (Configuration.doAutoCreate())
                // cc
                this.specialty = new CodeableConcept();
        return this.specialty;
    }

    public boolean hasSpecialty() {
        return this.specialty != null && !this.specialty.isEmpty();
    }

    /**
     * @param value {@link #specialty} (Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology.)
     */
    public ReferralRequest setSpecialty(CodeableConcept value) {
        this.specialty = value;
        return this;
    }

    /**
     * @return {@link #priority} (An indication of the urgency of referral (or where applicable the type of transfer of care) request.)
     */
    public CodeableConcept getPriority() {
        if (this.priority == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.priority");
            else if (Configuration.doAutoCreate())
                // cc
                this.priority = new CodeableConcept();
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null && !this.priority.isEmpty();
    }

    /**
     * @param value {@link #priority} (An indication of the urgency of referral (or where applicable the type of transfer of care) request.)
     */
    public ReferralRequest setPriority(CodeableConcept value) {
        this.priority = value;
        return this;
    }

    /**
     * @return {@link #patient} (The patient who is the subject of a referral or transfer of care request.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient who is the subject of a referral or transfer of care request.)
     */
    public ReferralRequest setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient who is the subject of a referral or transfer of care request.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient who is the subject of a referral or transfer of care request.)
     */
    public ReferralRequest setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #requester} (The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral).)
     */
    public Reference getRequester() {
        if (this.requester == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.requester");
            else if (Configuration.doAutoCreate())
                // cc
                this.requester = new Reference();
        return this.requester;
    }

    public boolean hasRequester() {
        return this.requester != null && !this.requester.isEmpty();
    }

    /**
     * @param value {@link #requester} (The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral).)
     */
    public ReferralRequest setRequester(Reference value) {
        this.requester = value;
        return this;
    }

    /**
     * @return {@link #requester} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral).)
     */
    public Resource getRequesterTarget() {
        return this.requesterTarget;
    }

    /**
     * @param value {@link #requester} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral).)
     */
    public ReferralRequest setRequesterTarget(Resource value) {
        this.requesterTarget = value;
        return this;
    }

    /**
     * @return {@link #recipient} (The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request.)
     */
    public List<Reference> getRecipient() {
        if (this.recipient == null)
            this.recipient = new ArrayList<Reference>();
        return this.recipient;
    }

    public boolean hasRecipient() {
        if (this.recipient == null)
            return false;
        for (Reference item : this.recipient) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #recipient} (The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request.)
     */
    // syntactic sugar
    public Reference addRecipient() {
        // 3
        Reference t = new Reference();
        if (this.recipient == null)
            this.recipient = new ArrayList<Reference>();
        this.recipient.add(t);
        return t;
    }

    // syntactic sugar
    public ReferralRequest addRecipient(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.recipient == null)
            this.recipient = new ArrayList<Reference>();
        this.recipient.add(t);
        return this;
    }

    /**
     * @return {@link #recipient} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request.)
     */
    public List<Resource> getRecipientTarget() {
        if (this.recipientTarget == null)
            this.recipientTarget = new ArrayList<Resource>();
        return this.recipientTarget;
    }

    /**
     * @return {@link #encounter} (The encounter at which the request for referral or transfer of care is initiated.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The encounter at which the request for referral or transfer of care is initiated.)
     */
    public ReferralRequest setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The encounter at which the request for referral or transfer of care is initiated.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The encounter at which the request for referral or transfer of care is initiated.)
     */
    public ReferralRequest setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #dateSent} (Date/DateTime the request for referral or transfer of care is sent by the author.). This is the underlying object with id, value and extensions. The accessor "getDateSent" gives direct access to the value
     */
    public DateTimeType getDateSentElement() {
        if (this.dateSent == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.dateSent");
            else if (Configuration.doAutoCreate())
                // bb
                this.dateSent = new DateTimeType();
        return this.dateSent;
    }

    public boolean hasDateSentElement() {
        return this.dateSent != null && !this.dateSent.isEmpty();
    }

    public boolean hasDateSent() {
        return this.dateSent != null && !this.dateSent.isEmpty();
    }

    /**
     * @param value {@link #dateSent} (Date/DateTime the request for referral or transfer of care is sent by the author.). This is the underlying object with id, value and extensions. The accessor "getDateSent" gives direct access to the value
     */
    public ReferralRequest setDateSentElement(DateTimeType value) {
        this.dateSent = value;
        return this;
    }

    /**
     * @return Date/DateTime the request for referral or transfer of care is sent by the author.
     */
    public Date getDateSent() {
        return this.dateSent == null ? null : this.dateSent.getValue();
    }

    /**
     * @param value Date/DateTime the request for referral or transfer of care is sent by the author.
     */
    public ReferralRequest setDateSent(Date value) {
        if (value == null)
            this.dateSent = null;
        else {
            if (this.dateSent == null)
                this.dateSent = new DateTimeType();
            this.dateSent.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #reason} (Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management.)
     */
    public CodeableConcept getReason() {
        if (this.reason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.reason");
            else if (Configuration.doAutoCreate())
                // cc
                this.reason = new CodeableConcept();
        return this.reason;
    }

    public boolean hasReason() {
        return this.reason != null && !this.reason.isEmpty();
    }

    /**
     * @param value {@link #reason} (Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management.)
     */
    public ReferralRequest setReason(CodeableConcept value) {
        this.reason = value;
        return this;
    }

    /**
     * @return {@link #description} (The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.description");
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
     * @param value {@link #description} (The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ReferralRequest setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary.
     */
    public ReferralRequest setDescription(String value) {
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
     * @return {@link #serviceRequested} (The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion.)
     */
    public List<CodeableConcept> getServiceRequested() {
        if (this.serviceRequested == null)
            this.serviceRequested = new ArrayList<CodeableConcept>();
        return this.serviceRequested;
    }

    public boolean hasServiceRequested() {
        if (this.serviceRequested == null)
            return false;
        for (CodeableConcept item : this.serviceRequested) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #serviceRequested} (The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion.)
     */
    // syntactic sugar
    public CodeableConcept addServiceRequested() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.serviceRequested == null)
            this.serviceRequested = new ArrayList<CodeableConcept>();
        this.serviceRequested.add(t);
        return t;
    }

    // syntactic sugar
    public ReferralRequest addServiceRequested(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.serviceRequested == null)
            this.serviceRequested = new ArrayList<CodeableConcept>();
        this.serviceRequested.add(t);
        return this;
    }

    /**
     * @return {@link #supportingInformation} (Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan.)
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
     * @return {@link #supportingInformation} (Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan.)
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
    public ReferralRequest addSupportingInformation(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.supportingInformation == null)
            this.supportingInformation = new ArrayList<Reference>();
        this.supportingInformation.add(t);
        return this;
    }

    /**
     * @return {@link #supportingInformation} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan.)
     */
    public List<Resource> getSupportingInformationTarget() {
        if (this.supportingInformationTarget == null)
            this.supportingInformationTarget = new ArrayList<Resource>();
        return this.supportingInformationTarget;
    }

    /**
     * @return {@link #fulfillmentTime} (The period of time within which the services identified in the referral/transfer of care is specified or required to occur.)
     */
    public Period getFulfillmentTime() {
        if (this.fulfillmentTime == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ReferralRequest.fulfillmentTime");
            else if (Configuration.doAutoCreate())
                // cc
                this.fulfillmentTime = new Period();
        return this.fulfillmentTime;
    }

    public boolean hasFulfillmentTime() {
        return this.fulfillmentTime != null && !this.fulfillmentTime.isEmpty();
    }

    /**
     * @param value {@link #fulfillmentTime} (The period of time within which the services identified in the referral/transfer of care is specified or required to occur.)
     */
    public ReferralRequest setFulfillmentTime(Period value) {
        this.fulfillmentTime = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("status", "code", "The workflow status of the referral or transfer of care request.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("identifier", "Identifier", "Business identifier that uniquely identifies the referral/care transfer request instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("date", "dateTime", "Date/DateTime of creation for draft requests and date of activation for active requests.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("type", "CodeableConcept", "An indication of the type of referral (or where applicable the type of transfer of care) request.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("specialty", "CodeableConcept", "Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology.", 0, java.lang.Integer.MAX_VALUE, specialty));
        childrenList.add(new Property("priority", "CodeableConcept", "An indication of the urgency of referral (or where applicable the type of transfer of care) request.", 0, java.lang.Integer.MAX_VALUE, priority));
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient who is the subject of a referral or transfer of care request.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("requester", "Reference(Practitioner|Organization|Patient)", "The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral).", 0, java.lang.Integer.MAX_VALUE, requester));
        childrenList.add(new Property("recipient", "Reference(Practitioner|Organization)", "The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request.", 0, java.lang.Integer.MAX_VALUE, recipient));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "The encounter at which the request for referral or transfer of care is initiated.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("dateSent", "dateTime", "Date/DateTime the request for referral or transfer of care is sent by the author.", 0, java.lang.Integer.MAX_VALUE, dateSent));
        childrenList.add(new Property("reason", "CodeableConcept", "Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("description", "string", "The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("serviceRequested", "CodeableConcept", "The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion.", 0, java.lang.Integer.MAX_VALUE, serviceRequested));
        childrenList.add(new Property("supportingInformation", "Reference(Any)", "Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan.", 0, java.lang.Integer.MAX_VALUE, supportingInformation));
        childrenList.add(new Property("fulfillmentTime", "Period", "The period of time within which the services identified in the referral/transfer of care is specified or required to occur.", 0, java.lang.Integer.MAX_VALUE, fulfillmentTime));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("status"))
            // Enumeration<ReferralStatus>
            this.status = new ReferralStatusEnumFactory().fromType(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("specialty"))
            // CodeableConcept
            this.specialty = castToCodeableConcept(value);
        else if (name.equals("priority"))
            // CodeableConcept
            this.priority = castToCodeableConcept(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("requester"))
            // Reference
            this.requester = castToReference(value);
        else if (name.equals("recipient"))
            this.getRecipient().add(castToReference(value));
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("dateSent"))
            // DateTimeType
            this.dateSent = castToDateTime(value);
        else if (name.equals("reason"))
            // CodeableConcept
            this.reason = castToCodeableConcept(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("serviceRequested"))
            this.getServiceRequested().add(castToCodeableConcept(value));
        else if (name.equals("supportingInformation"))
            this.getSupportingInformation().add(castToReference(value));
        else if (name.equals("fulfillmentTime"))
            // Period
            this.fulfillmentTime = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type ReferralRequest.status");
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type ReferralRequest.date");
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("specialty")) {
            this.specialty = new CodeableConcept();
            return this.specialty;
        } else if (name.equals("priority")) {
            this.priority = new CodeableConcept();
            return this.priority;
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("requester")) {
            this.requester = new Reference();
            return this.requester;
        } else if (name.equals("recipient")) {
            return addRecipient();
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("dateSent")) {
            throw new FHIRException("Cannot call addChild on a primitive type ReferralRequest.dateSent");
        } else if (name.equals("reason")) {
            this.reason = new CodeableConcept();
            return this.reason;
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ReferralRequest.description");
        } else if (name.equals("serviceRequested")) {
            return addServiceRequested();
        } else if (name.equals("supportingInformation")) {
            return addSupportingInformation();
        } else if (name.equals("fulfillmentTime")) {
            this.fulfillmentTime = new Period();
            return this.fulfillmentTime;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ReferralRequest";
    }

    public ReferralRequest copy() {
        ReferralRequest dst = new ReferralRequest();
        copyValues(dst);
        dst.status = status == null ? null : status.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.date = date == null ? null : date.copy();
        dst.type = type == null ? null : type.copy();
        dst.specialty = specialty == null ? null : specialty.copy();
        dst.priority = priority == null ? null : priority.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.requester = requester == null ? null : requester.copy();
        if (recipient != null) {
            dst.recipient = new ArrayList<Reference>();
            for (Reference i : recipient) dst.recipient.add(i.copy());
        }
        ;
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.dateSent = dateSent == null ? null : dateSent.copy();
        dst.reason = reason == null ? null : reason.copy();
        dst.description = description == null ? null : description.copy();
        if (serviceRequested != null) {
            dst.serviceRequested = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : serviceRequested) dst.serviceRequested.add(i.copy());
        }
        ;
        if (supportingInformation != null) {
            dst.supportingInformation = new ArrayList<Reference>();
            for (Reference i : supportingInformation) dst.supportingInformation.add(i.copy());
        }
        ;
        dst.fulfillmentTime = fulfillmentTime == null ? null : fulfillmentTime.copy();
        return dst;
    }

    protected ReferralRequest typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ReferralRequest))
            return false;
        ReferralRequest o = (ReferralRequest) other;
        return compareDeep(status, o.status, true) && compareDeep(identifier, o.identifier, true) && compareDeep(date, o.date, true) && compareDeep(type, o.type, true) && compareDeep(specialty, o.specialty, true) && compareDeep(priority, o.priority, true) && compareDeep(patient, o.patient, true) && compareDeep(requester, o.requester, true) && compareDeep(recipient, o.recipient, true) && compareDeep(encounter, o.encounter, true) && compareDeep(dateSent, o.dateSent, true) && compareDeep(reason, o.reason, true) && compareDeep(description, o.description, true) && compareDeep(serviceRequested, o.serviceRequested, true) && compareDeep(supportingInformation, o.supportingInformation, true) && compareDeep(fulfillmentTime, o.fulfillmentTime, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ReferralRequest))
            return false;
        ReferralRequest o = (ReferralRequest) other;
        return compareValues(status, o.status, true) && compareValues(date, o.date, true) && compareValues(dateSent, o.dateSent, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (status == null || status.isEmpty()) && (identifier == null || identifier.isEmpty()) && (date == null || date.isEmpty()) && (type == null || type.isEmpty()) && (specialty == null || specialty.isEmpty()) && (priority == null || priority.isEmpty()) && (patient == null || patient.isEmpty()) && (requester == null || requester.isEmpty()) && (recipient == null || recipient.isEmpty()) && (encounter == null || encounter.isEmpty()) && (dateSent == null || dateSent.isEmpty()) && (reason == null || reason.isEmpty()) && (description == null || description.isEmpty()) && (serviceRequested == null || serviceRequested.isEmpty()) && (supportingInformation == null || supportingInformation.isEmpty()) && (fulfillmentTime == null || fulfillmentTime.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ReferralRequest;
    }

    public static final String SP_DATE = "date";

    public static final String SP_REQUESTER = "requester";

    public static final String SP_SPECIALTY = "specialty";

    public static final String SP_PATIENT = "patient";

    public static final String SP_RECIPIENT = "recipient";

    public static final String SP_TYPE = "type";

    public static final String SP_PRIORITY = "priority";

    public static final String SP_STATUS = "status";
}
