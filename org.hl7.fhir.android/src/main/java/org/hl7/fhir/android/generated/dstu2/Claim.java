package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.Use;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.UseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimType;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimTypeEnumFactory;

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
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
public class Claim extends DomainResource {

    /**
     * The category of claim this is.
     */
    protected Enumeration<ClaimType> type;

    /**
     * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
     */
    protected List<Identifier> identifier;

    /**
     * The version of the specification on which this instance relies.
     */
    protected Coding ruleset;

    /**
     * The version of the specification from which the original instance was created.
     */
    protected Coding originalRuleset;

    /**
     * The date when the enclosed suite of services were performed or completed.
     */
    protected DateTimeType created;

    /**
     * Insurer Identifier, typical BIN number (6 digit).
     */
    protected Reference target;

    /**
     * The actual object that is the target of the reference (Insurer Identifier, typical BIN number (6 digit).)
     */
    protected Organization targetTarget;

    /**
     * The provider which is responsible for the bill, claim pre-determination, pre-authorization.
     */
    protected Reference provider;

    /**
     * The actual object that is the target of the reference (The provider which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    protected Practitioner providerTarget;

    /**
     * The organization which is responsible for the bill, claim pre-determination, pre-authorization.
     */
    protected Reference organization;

    /**
     * The actual object that is the target of the reference (The organization which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    protected Organization organizationTarget;

    /**
     * Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
     */
    protected Enumeration<Use> use;

    /**
     * Immediate (stat), best effort (normal), deferred (deferred).
     */
    protected Coding priority;

    /**
     * In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.
     */
    protected Coding fundsReserve;

    /**
     * Person who created the invoice/claim/pre-determination or pre-authorization.
     */
    protected Reference enterer;

    /**
     * The actual object that is the target of the reference (Person who created the invoice/claim/pre-determination or pre-authorization.)
     */
    protected Practitioner entererTarget;

    /**
     * Facility where the services were provided.
     */
    protected Reference facility;

    /**
     * The actual object that is the target of the reference (Facility where the services were provided.)
     */
    protected Location facilityTarget;

    /**
     * Prescription to support the dispensing of Pharmacy or Vision products.
     */
    protected Reference prescription;

    /**
     * The actual object that is the target of the reference (Prescription to support the dispensing of Pharmacy or Vision products.)
     */
    protected Resource prescriptionTarget;

    /**
     * Original prescription to support the dispensing of pharmacy services, medications or products.
     */
    protected Reference originalPrescription;

    /**
     * The actual object that is the target of the reference (Original prescription to support the dispensing of pharmacy services, medications or products.)
     */
    protected MedicationOrder originalPrescriptionTarget;

    /**
     * The party to be reimbursed for the services.
     */
    protected PayeeComponent payee;

    /**
     * The referral resource which lists the date, practitioner, reason and other supporting information.
     */
    protected Reference referral;

    /**
     * The actual object that is the target of the reference (The referral resource which lists the date, practitioner, reason and other supporting information.)
     */
    protected ReferralRequest referralTarget;

    /**
     * Ordered list of patient diagnosis for which care is sought.
     */
    protected List<DiagnosisComponent> diagnosis;

    /**
     * List of patient conditions for which care is sought.
     */
    protected List<Coding> condition;

    /**
     * Patient Resource.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (Patient Resource.)
     */
    protected Patient patientTarget;

    /**
     * Financial instrument by which payment information for health care.
     */
    protected List<CoverageComponent> coverage;

    /**
     * Factors which may influence the applicability of coverage.
     */
    protected List<Coding> exception;

    /**
     * Name of school for over-aged dependents.
     */
    protected StringType school;

    /**
     * Date of an accident which these services are addressing.
     */
    protected DateType accident;

    /**
     * Type of accident: work, auto, etc.
     */
    protected Coding accidentType;

    /**
     * A list of intervention and exception codes which may influence the adjudication of the claim.
     */
    protected List<Coding> interventionException;

    /**
     * First tier of goods and services.
     */
    protected List<ItemsComponent> item;

    /**
     * Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission.
     */
    protected List<Coding> additionalMaterials;

    /**
     * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
     */
    protected List<MissingTeethComponent> missingTeeth;

    private static final long serialVersionUID = 4272227L;

    /*
   * Constructor
   */
    public Claim() {
        super();
    }

    /*
   * Constructor
   */
    public Claim(Enumeration<ClaimType> type, Reference patient) {
        super();
        this.type = type;
        this.patient = patient;
    }

    /**
     * @return {@link #type} (The category of claim this is.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<ClaimType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<ClaimType>(new ClaimTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The category of claim this is.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Claim setTypeElement(Enumeration<ClaimType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return The category of claim this is.
     */
    public ClaimType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The category of claim this is.
     */
    public Claim setType(ClaimType value) {
        if (this.type == null)
            this.type = new Enumeration<ClaimType>(new ClaimTypeEnumFactory());
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #identifier} (The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.)
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
     * @return {@link #identifier} (The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.)
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
    public Claim addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #ruleset} (The version of the specification on which this instance relies.)
     */
    public Coding getRuleset() {
        if (this.ruleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.ruleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.ruleset = new Coding();
        return this.ruleset;
    }

    public boolean hasRuleset() {
        return this.ruleset != null && !this.ruleset.isEmpty();
    }

    /**
     * @param value {@link #ruleset} (The version of the specification on which this instance relies.)
     */
    public Claim setRuleset(Coding value) {
        this.ruleset = value;
        return this;
    }

    /**
     * @return {@link #originalRuleset} (The version of the specification from which the original instance was created.)
     */
    public Coding getOriginalRuleset() {
        if (this.originalRuleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.originalRuleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.originalRuleset = new Coding();
        return this.originalRuleset;
    }

    public boolean hasOriginalRuleset() {
        return this.originalRuleset != null && !this.originalRuleset.isEmpty();
    }

    /**
     * @param value {@link #originalRuleset} (The version of the specification from which the original instance was created.)
     */
    public Claim setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
        return this;
    }

    /**
     * @return {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() {
        if (this.created == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.created");
            else if (Configuration.doAutoCreate())
                // bb
                this.created = new DateTimeType();
        return this.created;
    }

    public boolean hasCreatedElement() {
        return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() {
        return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public Claim setCreatedElement(DateTimeType value) {
        this.created = value;
        return this;
    }

    /**
     * @return The date when the enclosed suite of services were performed or completed.
     */
    public Date getCreated() {
        return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value The date when the enclosed suite of services were performed or completed.
     */
    public Claim setCreated(Date value) {
        if (value == null)
            this.created = null;
        else {
            if (this.created == null)
                this.created = new DateTimeType();
            this.created.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #target} (Insurer Identifier, typical BIN number (6 digit).)
     */
    public Reference getTarget() {
        if (this.target == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.target");
            else if (Configuration.doAutoCreate())
                // cc
                this.target = new Reference();
        return this.target;
    }

    public boolean hasTarget() {
        return this.target != null && !this.target.isEmpty();
    }

    /**
     * @param value {@link #target} (Insurer Identifier, typical BIN number (6 digit).)
     */
    public Claim setTarget(Reference value) {
        this.target = value;
        return this;
    }

    /**
     * @return {@link #target} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Insurer Identifier, typical BIN number (6 digit).)
     */
    public Organization getTargetTarget() {
        if (this.targetTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.target");
            else if (Configuration.doAutoCreate())
                // aa
                this.targetTarget = new Organization();
        return this.targetTarget;
    }

    /**
     * @param value {@link #target} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Insurer Identifier, typical BIN number (6 digit).)
     */
    public Claim setTargetTarget(Organization value) {
        this.targetTarget = value;
        return this;
    }

    /**
     * @return {@link #provider} (The provider which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Reference getProvider() {
        if (this.provider == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.provider");
            else if (Configuration.doAutoCreate())
                // cc
                this.provider = new Reference();
        return this.provider;
    }

    public boolean hasProvider() {
        return this.provider != null && !this.provider.isEmpty();
    }

    /**
     * @param value {@link #provider} (The provider which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Claim setProvider(Reference value) {
        this.provider = value;
        return this;
    }

    /**
     * @return {@link #provider} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The provider which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Practitioner getProviderTarget() {
        if (this.providerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.provider");
            else if (Configuration.doAutoCreate())
                // aa
                this.providerTarget = new Practitioner();
        return this.providerTarget;
    }

    /**
     * @param value {@link #provider} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The provider which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Claim setProviderTarget(Practitioner value) {
        this.providerTarget = value;
        return this;
    }

    /**
     * @return {@link #organization} (The organization which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Reference getOrganization() {
        if (this.organization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.organization");
            else if (Configuration.doAutoCreate())
                // cc
                this.organization = new Reference();
        return this.organization;
    }

    public boolean hasOrganization() {
        return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (The organization which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Claim setOrganization(Reference value) {
        this.organization = value;
        return this;
    }

    /**
     * @return {@link #organization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Organization getOrganizationTarget() {
        if (this.organizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.organization");
            else if (Configuration.doAutoCreate())
                // aa
                this.organizationTarget = new Organization();
        return this.organizationTarget;
    }

    /**
     * @param value {@link #organization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Claim setOrganizationTarget(Organization value) {
        this.organizationTarget = value;
        return this;
    }

    /**
     * @return {@link #use} (Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Enumeration<Use> getUseElement() {
        if (this.use == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.use");
            else if (Configuration.doAutoCreate())
                // bb
                this.use = new Enumeration<Use>(new UseEnumFactory());
        return this.use;
    }

    public boolean hasUseElement() {
        return this.use != null && !this.use.isEmpty();
    }

    public boolean hasUse() {
        return this.use != null && !this.use.isEmpty();
    }

    /**
     * @param value {@link #use} (Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Claim setUseElement(Enumeration<Use> value) {
        this.use = value;
        return this;
    }

    /**
     * @return Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
     */
    public Use getUse() {
        return this.use == null ? null : this.use.getValue();
    }

    /**
     * @param value Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
     */
    public Claim setUse(Use value) {
        if (value == null)
            this.use = null;
        else {
            if (this.use == null)
                this.use = new Enumeration<Use>(new UseEnumFactory());
            this.use.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #priority} (Immediate (stat), best effort (normal), deferred (deferred).)
     */
    public Coding getPriority() {
        if (this.priority == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.priority");
            else if (Configuration.doAutoCreate())
                // cc
                this.priority = new Coding();
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null && !this.priority.isEmpty();
    }

    /**
     * @param value {@link #priority} (Immediate (stat), best effort (normal), deferred (deferred).)
     */
    public Claim setPriority(Coding value) {
        this.priority = value;
        return this;
    }

    /**
     * @return {@link #fundsReserve} (In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.)
     */
    public Coding getFundsReserve() {
        if (this.fundsReserve == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.fundsReserve");
            else if (Configuration.doAutoCreate())
                // cc
                this.fundsReserve = new Coding();
        return this.fundsReserve;
    }

    public boolean hasFundsReserve() {
        return this.fundsReserve != null && !this.fundsReserve.isEmpty();
    }

    /**
     * @param value {@link #fundsReserve} (In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.)
     */
    public Claim setFundsReserve(Coding value) {
        this.fundsReserve = value;
        return this;
    }

    /**
     * @return {@link #enterer} (Person who created the invoice/claim/pre-determination or pre-authorization.)
     */
    public Reference getEnterer() {
        if (this.enterer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.enterer");
            else if (Configuration.doAutoCreate())
                // cc
                this.enterer = new Reference();
        return this.enterer;
    }

    public boolean hasEnterer() {
        return this.enterer != null && !this.enterer.isEmpty();
    }

    /**
     * @param value {@link #enterer} (Person who created the invoice/claim/pre-determination or pre-authorization.)
     */
    public Claim setEnterer(Reference value) {
        this.enterer = value;
        return this;
    }

    /**
     * @return {@link #enterer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Person who created the invoice/claim/pre-determination or pre-authorization.)
     */
    public Practitioner getEntererTarget() {
        if (this.entererTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.enterer");
            else if (Configuration.doAutoCreate())
                // aa
                this.entererTarget = new Practitioner();
        return this.entererTarget;
    }

    /**
     * @param value {@link #enterer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Person who created the invoice/claim/pre-determination or pre-authorization.)
     */
    public Claim setEntererTarget(Practitioner value) {
        this.entererTarget = value;
        return this;
    }

    /**
     * @return {@link #facility} (Facility where the services were provided.)
     */
    public Reference getFacility() {
        if (this.facility == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.facility");
            else if (Configuration.doAutoCreate())
                // cc
                this.facility = new Reference();
        return this.facility;
    }

    public boolean hasFacility() {
        return this.facility != null && !this.facility.isEmpty();
    }

    /**
     * @param value {@link #facility} (Facility where the services were provided.)
     */
    public Claim setFacility(Reference value) {
        this.facility = value;
        return this;
    }

    /**
     * @return {@link #facility} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Facility where the services were provided.)
     */
    public Location getFacilityTarget() {
        if (this.facilityTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.facility");
            else if (Configuration.doAutoCreate())
                // aa
                this.facilityTarget = new Location();
        return this.facilityTarget;
    }

    /**
     * @param value {@link #facility} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Facility where the services were provided.)
     */
    public Claim setFacilityTarget(Location value) {
        this.facilityTarget = value;
        return this;
    }

    /**
     * @return {@link #prescription} (Prescription to support the dispensing of Pharmacy or Vision products.)
     */
    public Reference getPrescription() {
        if (this.prescription == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.prescription");
            else if (Configuration.doAutoCreate())
                // cc
                this.prescription = new Reference();
        return this.prescription;
    }

    public boolean hasPrescription() {
        return this.prescription != null && !this.prescription.isEmpty();
    }

    /**
     * @param value {@link #prescription} (Prescription to support the dispensing of Pharmacy or Vision products.)
     */
    public Claim setPrescription(Reference value) {
        this.prescription = value;
        return this;
    }

    /**
     * @return {@link #prescription} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Prescription to support the dispensing of Pharmacy or Vision products.)
     */
    public Resource getPrescriptionTarget() {
        return this.prescriptionTarget;
    }

    /**
     * @param value {@link #prescription} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Prescription to support the dispensing of Pharmacy or Vision products.)
     */
    public Claim setPrescriptionTarget(Resource value) {
        this.prescriptionTarget = value;
        return this;
    }

    /**
     * @return {@link #originalPrescription} (Original prescription to support the dispensing of pharmacy services, medications or products.)
     */
    public Reference getOriginalPrescription() {
        if (this.originalPrescription == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.originalPrescription");
            else if (Configuration.doAutoCreate())
                // cc
                this.originalPrescription = new Reference();
        return this.originalPrescription;
    }

    public boolean hasOriginalPrescription() {
        return this.originalPrescription != null && !this.originalPrescription.isEmpty();
    }

    /**
     * @param value {@link #originalPrescription} (Original prescription to support the dispensing of pharmacy services, medications or products.)
     */
    public Claim setOriginalPrescription(Reference value) {
        this.originalPrescription = value;
        return this;
    }

    /**
     * @return {@link #originalPrescription} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Original prescription to support the dispensing of pharmacy services, medications or products.)
     */
    public MedicationOrder getOriginalPrescriptionTarget() {
        if (this.originalPrescriptionTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.originalPrescription");
            else if (Configuration.doAutoCreate())
                // aa
                this.originalPrescriptionTarget = new MedicationOrder();
        return this.originalPrescriptionTarget;
    }

    /**
     * @param value {@link #originalPrescription} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Original prescription to support the dispensing of pharmacy services, medications or products.)
     */
    public Claim setOriginalPrescriptionTarget(MedicationOrder value) {
        this.originalPrescriptionTarget = value;
        return this;
    }

    /**
     * @return {@link #payee} (The party to be reimbursed for the services.)
     */
    public PayeeComponent getPayee() {
        if (this.payee == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.payee");
            else if (Configuration.doAutoCreate())
                // cc
                this.payee = new PayeeComponent();
        return this.payee;
    }

    public boolean hasPayee() {
        return this.payee != null && !this.payee.isEmpty();
    }

    /**
     * @param value {@link #payee} (The party to be reimbursed for the services.)
     */
    public Claim setPayee(PayeeComponent value) {
        this.payee = value;
        return this;
    }

    /**
     * @return {@link #referral} (The referral resource which lists the date, practitioner, reason and other supporting information.)
     */
    public Reference getReferral() {
        if (this.referral == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.referral");
            else if (Configuration.doAutoCreate())
                // cc
                this.referral = new Reference();
        return this.referral;
    }

    public boolean hasReferral() {
        return this.referral != null && !this.referral.isEmpty();
    }

    /**
     * @param value {@link #referral} (The referral resource which lists the date, practitioner, reason and other supporting information.)
     */
    public Claim setReferral(Reference value) {
        this.referral = value;
        return this;
    }

    /**
     * @return {@link #referral} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The referral resource which lists the date, practitioner, reason and other supporting information.)
     */
    public ReferralRequest getReferralTarget() {
        if (this.referralTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.referral");
            else if (Configuration.doAutoCreate())
                // aa
                this.referralTarget = new ReferralRequest();
        return this.referralTarget;
    }

    /**
     * @param value {@link #referral} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The referral resource which lists the date, practitioner, reason and other supporting information.)
     */
    public Claim setReferralTarget(ReferralRequest value) {
        this.referralTarget = value;
        return this;
    }

    /**
     * @return {@link #diagnosis} (Ordered list of patient diagnosis for which care is sought.)
     */
    public List<DiagnosisComponent> getDiagnosis() {
        if (this.diagnosis == null)
            this.diagnosis = new ArrayList<DiagnosisComponent>();
        return this.diagnosis;
    }

    public boolean hasDiagnosis() {
        if (this.diagnosis == null)
            return false;
        for (DiagnosisComponent item : this.diagnosis) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #diagnosis} (Ordered list of patient diagnosis for which care is sought.)
     */
    // syntactic sugar
    public DiagnosisComponent addDiagnosis() {
        // 3
        DiagnosisComponent t = new DiagnosisComponent();
        if (this.diagnosis == null)
            this.diagnosis = new ArrayList<DiagnosisComponent>();
        this.diagnosis.add(t);
        return t;
    }

    // syntactic sugar
    public Claim addDiagnosis(DiagnosisComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.diagnosis == null)
            this.diagnosis = new ArrayList<DiagnosisComponent>();
        this.diagnosis.add(t);
        return this;
    }

    /**
     * @return {@link #condition} (List of patient conditions for which care is sought.)
     */
    public List<Coding> getCondition() {
        if (this.condition == null)
            this.condition = new ArrayList<Coding>();
        return this.condition;
    }

    public boolean hasCondition() {
        if (this.condition == null)
            return false;
        for (Coding item : this.condition) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #condition} (List of patient conditions for which care is sought.)
     */
    // syntactic sugar
    public Coding addCondition() {
        // 3
        Coding t = new Coding();
        if (this.condition == null)
            this.condition = new ArrayList<Coding>();
        this.condition.add(t);
        return t;
    }

    // syntactic sugar
    public Claim addCondition(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.condition == null)
            this.condition = new ArrayList<Coding>();
        this.condition.add(t);
        return this;
    }

    /**
     * @return {@link #patient} (Patient Resource.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (Patient Resource.)
     */
    public Claim setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Patient Resource.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Patient Resource.)
     */
    public Claim setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #coverage} (Financial instrument by which payment information for health care.)
     */
    public List<CoverageComponent> getCoverage() {
        if (this.coverage == null)
            this.coverage = new ArrayList<CoverageComponent>();
        return this.coverage;
    }

    public boolean hasCoverage() {
        if (this.coverage == null)
            return false;
        for (CoverageComponent item : this.coverage) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #coverage} (Financial instrument by which payment information for health care.)
     */
    // syntactic sugar
    public CoverageComponent addCoverage() {
        // 3
        CoverageComponent t = new CoverageComponent();
        if (this.coverage == null)
            this.coverage = new ArrayList<CoverageComponent>();
        this.coverage.add(t);
        return t;
    }

    // syntactic sugar
    public Claim addCoverage(CoverageComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.coverage == null)
            this.coverage = new ArrayList<CoverageComponent>();
        this.coverage.add(t);
        return this;
    }

    /**
     * @return {@link #exception} (Factors which may influence the applicability of coverage.)
     */
    public List<Coding> getException() {
        if (this.exception == null)
            this.exception = new ArrayList<Coding>();
        return this.exception;
    }

    public boolean hasException() {
        if (this.exception == null)
            return false;
        for (Coding item : this.exception) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #exception} (Factors which may influence the applicability of coverage.)
     */
    // syntactic sugar
    public Coding addException() {
        // 3
        Coding t = new Coding();
        if (this.exception == null)
            this.exception = new ArrayList<Coding>();
        this.exception.add(t);
        return t;
    }

    // syntactic sugar
    public Claim addException(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.exception == null)
            this.exception = new ArrayList<Coding>();
        this.exception.add(t);
        return this;
    }

    /**
     * @return {@link #school} (Name of school for over-aged dependents.). This is the underlying object with id, value and extensions. The accessor "getSchool" gives direct access to the value
     */
    public StringType getSchoolElement() {
        if (this.school == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.school");
            else if (Configuration.doAutoCreate())
                // bb
                this.school = new StringType();
        return this.school;
    }

    public boolean hasSchoolElement() {
        return this.school != null && !this.school.isEmpty();
    }

    public boolean hasSchool() {
        return this.school != null && !this.school.isEmpty();
    }

    /**
     * @param value {@link #school} (Name of school for over-aged dependents.). This is the underlying object with id, value and extensions. The accessor "getSchool" gives direct access to the value
     */
    public Claim setSchoolElement(StringType value) {
        this.school = value;
        return this;
    }

    /**
     * @return Name of school for over-aged dependents.
     */
    public String getSchool() {
        return this.school == null ? null : this.school.getValue();
    }

    /**
     * @param value Name of school for over-aged dependents.
     */
    public Claim setSchool(String value) {
        if (Utilities.noString(value))
            this.school = null;
        else {
            if (this.school == null)
                this.school = new StringType();
            this.school.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #accident} (Date of an accident which these services are addressing.). This is the underlying object with id, value and extensions. The accessor "getAccident" gives direct access to the value
     */
    public DateType getAccidentElement() {
        if (this.accident == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.accident");
            else if (Configuration.doAutoCreate())
                // bb
                this.accident = new DateType();
        return this.accident;
    }

    public boolean hasAccidentElement() {
        return this.accident != null && !this.accident.isEmpty();
    }

    public boolean hasAccident() {
        return this.accident != null && !this.accident.isEmpty();
    }

    /**
     * @param value {@link #accident} (Date of an accident which these services are addressing.). This is the underlying object with id, value and extensions. The accessor "getAccident" gives direct access to the value
     */
    public Claim setAccidentElement(DateType value) {
        this.accident = value;
        return this;
    }

    /**
     * @return Date of an accident which these services are addressing.
     */
    public Date getAccident() {
        return this.accident == null ? null : this.accident.getValue();
    }

    /**
     * @param value Date of an accident which these services are addressing.
     */
    public Claim setAccident(Date value) {
        if (value == null)
            this.accident = null;
        else {
            if (this.accident == null)
                this.accident = new DateType();
            this.accident.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #accidentType} (Type of accident: work, auto, etc.)
     */
    public Coding getAccidentType() {
        if (this.accidentType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Claim.accidentType");
            else if (Configuration.doAutoCreate())
                // cc
                this.accidentType = new Coding();
        return this.accidentType;
    }

    public boolean hasAccidentType() {
        return this.accidentType != null && !this.accidentType.isEmpty();
    }

    /**
     * @param value {@link #accidentType} (Type of accident: work, auto, etc.)
     */
    public Claim setAccidentType(Coding value) {
        this.accidentType = value;
        return this;
    }

    /**
     * @return {@link #interventionException} (A list of intervention and exception codes which may influence the adjudication of the claim.)
     */
    public List<Coding> getInterventionException() {
        if (this.interventionException == null)
            this.interventionException = new ArrayList<Coding>();
        return this.interventionException;
    }

    public boolean hasInterventionException() {
        if (this.interventionException == null)
            return false;
        for (Coding item : this.interventionException) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #interventionException} (A list of intervention and exception codes which may influence the adjudication of the claim.)
     */
    // syntactic sugar
    public Coding addInterventionException() {
        // 3
        Coding t = new Coding();
        if (this.interventionException == null)
            this.interventionException = new ArrayList<Coding>();
        this.interventionException.add(t);
        return t;
    }

    // syntactic sugar
    public Claim addInterventionException(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.interventionException == null)
            this.interventionException = new ArrayList<Coding>();
        this.interventionException.add(t);
        return this;
    }

    /**
     * @return {@link #item} (First tier of goods and services.)
     */
    public List<ItemsComponent> getItem() {
        if (this.item == null)
            this.item = new ArrayList<ItemsComponent>();
        return this.item;
    }

    public boolean hasItem() {
        if (this.item == null)
            return false;
        for (ItemsComponent item : this.item) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #item} (First tier of goods and services.)
     */
    // syntactic sugar
    public ItemsComponent addItem() {
        // 3
        ItemsComponent t = new ItemsComponent();
        if (this.item == null)
            this.item = new ArrayList<ItemsComponent>();
        this.item.add(t);
        return t;
    }

    // syntactic sugar
    public Claim addItem(ItemsComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.item == null)
            this.item = new ArrayList<ItemsComponent>();
        this.item.add(t);
        return this;
    }

    /**
     * @return {@link #additionalMaterials} (Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission.)
     */
    public List<Coding> getAdditionalMaterials() {
        if (this.additionalMaterials == null)
            this.additionalMaterials = new ArrayList<Coding>();
        return this.additionalMaterials;
    }

    public boolean hasAdditionalMaterials() {
        if (this.additionalMaterials == null)
            return false;
        for (Coding item : this.additionalMaterials) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #additionalMaterials} (Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission.)
     */
    // syntactic sugar
    public Coding addAdditionalMaterials() {
        // 3
        Coding t = new Coding();
        if (this.additionalMaterials == null)
            this.additionalMaterials = new ArrayList<Coding>();
        this.additionalMaterials.add(t);
        return t;
    }

    // syntactic sugar
    public Claim addAdditionalMaterials(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.additionalMaterials == null)
            this.additionalMaterials = new ArrayList<Coding>();
        this.additionalMaterials.add(t);
        return this;
    }

    /**
     * @return {@link #missingTeeth} (A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.)
     */
    public List<MissingTeethComponent> getMissingTeeth() {
        if (this.missingTeeth == null)
            this.missingTeeth = new ArrayList<MissingTeethComponent>();
        return this.missingTeeth;
    }

    public boolean hasMissingTeeth() {
        if (this.missingTeeth == null)
            return false;
        for (MissingTeethComponent item : this.missingTeeth) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #missingTeeth} (A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.)
     */
    // syntactic sugar
    public MissingTeethComponent addMissingTeeth() {
        // 3
        MissingTeethComponent t = new MissingTeethComponent();
        if (this.missingTeeth == null)
            this.missingTeeth = new ArrayList<MissingTeethComponent>();
        this.missingTeeth.add(t);
        return t;
    }

    // syntactic sugar
    public Claim addMissingTeeth(MissingTeethComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.missingTeeth == null)
            this.missingTeeth = new ArrayList<MissingTeethComponent>();
        this.missingTeeth.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "The category of claim this is.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("identifier", "Identifier", "The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("ruleset", "Coding", "The version of the specification on which this instance relies.", 0, java.lang.Integer.MAX_VALUE, ruleset));
        childrenList.add(new Property("originalRuleset", "Coding", "The version of the specification from which the original instance was created.", 0, java.lang.Integer.MAX_VALUE, originalRuleset));
        childrenList.add(new Property("created", "dateTime", "The date when the enclosed suite of services were performed or completed.", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("target", "Reference(Organization)", "Insurer Identifier, typical BIN number (6 digit).", 0, java.lang.Integer.MAX_VALUE, target));
        childrenList.add(new Property("provider", "Reference(Practitioner)", "The provider which is responsible for the bill, claim pre-determination, pre-authorization.", 0, java.lang.Integer.MAX_VALUE, provider));
        childrenList.add(new Property("organization", "Reference(Organization)", "The organization which is responsible for the bill, claim pre-determination, pre-authorization.", 0, java.lang.Integer.MAX_VALUE, organization));
        childrenList.add(new Property("use", "code", "Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).", 0, java.lang.Integer.MAX_VALUE, use));
        childrenList.add(new Property("priority", "Coding", "Immediate (stat), best effort (normal), deferred (deferred).", 0, java.lang.Integer.MAX_VALUE, priority));
        childrenList.add(new Property("fundsReserve", "Coding", "In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.", 0, java.lang.Integer.MAX_VALUE, fundsReserve));
        childrenList.add(new Property("enterer", "Reference(Practitioner)", "Person who created the invoice/claim/pre-determination or pre-authorization.", 0, java.lang.Integer.MAX_VALUE, enterer));
        childrenList.add(new Property("facility", "Reference(Location)", "Facility where the services were provided.", 0, java.lang.Integer.MAX_VALUE, facility));
        childrenList.add(new Property("prescription", "Reference(MedicationOrder|VisionPrescription)", "Prescription to support the dispensing of Pharmacy or Vision products.", 0, java.lang.Integer.MAX_VALUE, prescription));
        childrenList.add(new Property("originalPrescription", "Reference(MedicationOrder)", "Original prescription to support the dispensing of pharmacy services, medications or products.", 0, java.lang.Integer.MAX_VALUE, originalPrescription));
        childrenList.add(new Property("payee", "", "The party to be reimbursed for the services.", 0, java.lang.Integer.MAX_VALUE, payee));
        childrenList.add(new Property("referral", "Reference(ReferralRequest)", "The referral resource which lists the date, practitioner, reason and other supporting information.", 0, java.lang.Integer.MAX_VALUE, referral));
        childrenList.add(new Property("diagnosis", "", "Ordered list of patient diagnosis for which care is sought.", 0, java.lang.Integer.MAX_VALUE, diagnosis));
        childrenList.add(new Property("condition", "Coding", "List of patient conditions for which care is sought.", 0, java.lang.Integer.MAX_VALUE, condition));
        childrenList.add(new Property("patient", "Reference(Patient)", "Patient Resource.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("coverage", "", "Financial instrument by which payment information for health care.", 0, java.lang.Integer.MAX_VALUE, coverage));
        childrenList.add(new Property("exception", "Coding", "Factors which may influence the applicability of coverage.", 0, java.lang.Integer.MAX_VALUE, exception));
        childrenList.add(new Property("school", "string", "Name of school for over-aged dependents.", 0, java.lang.Integer.MAX_VALUE, school));
        childrenList.add(new Property("accident", "date", "Date of an accident which these services are addressing.", 0, java.lang.Integer.MAX_VALUE, accident));
        childrenList.add(new Property("accidentType", "Coding", "Type of accident: work, auto, etc.", 0, java.lang.Integer.MAX_VALUE, accidentType));
        childrenList.add(new Property("interventionException", "Coding", "A list of intervention and exception codes which may influence the adjudication of the claim.", 0, java.lang.Integer.MAX_VALUE, interventionException));
        childrenList.add(new Property("item", "", "First tier of goods and services.", 0, java.lang.Integer.MAX_VALUE, item));
        childrenList.add(new Property("additionalMaterials", "Coding", "Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission.", 0, java.lang.Integer.MAX_VALUE, additionalMaterials));
        childrenList.add(new Property("missingTeeth", "", "A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.", 0, java.lang.Integer.MAX_VALUE, missingTeeth));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Enumeration<ClaimType>
            this.type = new ClaimTypeEnumFactory().fromType(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("ruleset"))
            // Coding
            this.ruleset = castToCoding(value);
        else if (name.equals("originalRuleset"))
            // Coding
            this.originalRuleset = castToCoding(value);
        else if (name.equals("created"))
            // DateTimeType
            this.created = castToDateTime(value);
        else if (name.equals("target"))
            // Reference
            this.target = castToReference(value);
        else if (name.equals("provider"))
            // Reference
            this.provider = castToReference(value);
        else if (name.equals("organization"))
            // Reference
            this.organization = castToReference(value);
        else if (name.equals("use"))
            // Enumeration<Use>
            this.use = new UseEnumFactory().fromType(value);
        else if (name.equals("priority"))
            // Coding
            this.priority = castToCoding(value);
        else if (name.equals("fundsReserve"))
            // Coding
            this.fundsReserve = castToCoding(value);
        else if (name.equals("enterer"))
            // Reference
            this.enterer = castToReference(value);
        else if (name.equals("facility"))
            // Reference
            this.facility = castToReference(value);
        else if (name.equals("prescription"))
            // Reference
            this.prescription = castToReference(value);
        else if (name.equals("originalPrescription"))
            // Reference
            this.originalPrescription = castToReference(value);
        else if (name.equals("payee"))
            // PayeeComponent
            this.payee = (PayeeComponent) value;
        else if (name.equals("referral"))
            // Reference
            this.referral = castToReference(value);
        else if (name.equals("diagnosis"))
            this.getDiagnosis().add((DiagnosisComponent) value);
        else if (name.equals("condition"))
            this.getCondition().add(castToCoding(value));
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("coverage"))
            this.getCoverage().add((CoverageComponent) value);
        else if (name.equals("exception"))
            this.getException().add(castToCoding(value));
        else if (name.equals("school"))
            // StringType
            this.school = castToString(value);
        else if (name.equals("accident"))
            // DateType
            this.accident = castToDate(value);
        else if (name.equals("accidentType"))
            // Coding
            this.accidentType = castToCoding(value);
        else if (name.equals("interventionException"))
            this.getInterventionException().add(castToCoding(value));
        else if (name.equals("item"))
            this.getItem().add((ItemsComponent) value);
        else if (name.equals("additionalMaterials"))
            this.getAdditionalMaterials().add(castToCoding(value));
        else if (name.equals("missingTeeth"))
            this.getMissingTeeth().add((MissingTeethComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.type");
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("ruleset")) {
            this.ruleset = new Coding();
            return this.ruleset;
        } else if (name.equals("originalRuleset")) {
            this.originalRuleset = new Coding();
            return this.originalRuleset;
        } else if (name.equals("created")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.created");
        } else if (name.equals("target")) {
            this.target = new Reference();
            return this.target;
        } else if (name.equals("provider")) {
            this.provider = new Reference();
            return this.provider;
        } else if (name.equals("organization")) {
            this.organization = new Reference();
            return this.organization;
        } else if (name.equals("use")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.use");
        } else if (name.equals("priority")) {
            this.priority = new Coding();
            return this.priority;
        } else if (name.equals("fundsReserve")) {
            this.fundsReserve = new Coding();
            return this.fundsReserve;
        } else if (name.equals("enterer")) {
            this.enterer = new Reference();
            return this.enterer;
        } else if (name.equals("facility")) {
            this.facility = new Reference();
            return this.facility;
        } else if (name.equals("prescription")) {
            this.prescription = new Reference();
            return this.prescription;
        } else if (name.equals("originalPrescription")) {
            this.originalPrescription = new Reference();
            return this.originalPrescription;
        } else if (name.equals("payee")) {
            this.payee = new PayeeComponent();
            return this.payee;
        } else if (name.equals("referral")) {
            this.referral = new Reference();
            return this.referral;
        } else if (name.equals("diagnosis")) {
            return addDiagnosis();
        } else if (name.equals("condition")) {
            return addCondition();
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("coverage")) {
            return addCoverage();
        } else if (name.equals("exception")) {
            return addException();
        } else if (name.equals("school")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.school");
        } else if (name.equals("accident")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.accident");
        } else if (name.equals("accidentType")) {
            this.accidentType = new Coding();
            return this.accidentType;
        } else if (name.equals("interventionException")) {
            return addInterventionException();
        } else if (name.equals("item")) {
            return addItem();
        } else if (name.equals("additionalMaterials")) {
            return addAdditionalMaterials();
        } else if (name.equals("missingTeeth")) {
            return addMissingTeeth();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Claim";
    }

    public Claim copy() {
        Claim dst = new Claim();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.ruleset = ruleset == null ? null : ruleset.copy();
        dst.originalRuleset = originalRuleset == null ? null : originalRuleset.copy();
        dst.created = created == null ? null : created.copy();
        dst.target = target == null ? null : target.copy();
        dst.provider = provider == null ? null : provider.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.use = use == null ? null : use.copy();
        dst.priority = priority == null ? null : priority.copy();
        dst.fundsReserve = fundsReserve == null ? null : fundsReserve.copy();
        dst.enterer = enterer == null ? null : enterer.copy();
        dst.facility = facility == null ? null : facility.copy();
        dst.prescription = prescription == null ? null : prescription.copy();
        dst.originalPrescription = originalPrescription == null ? null : originalPrescription.copy();
        dst.payee = payee == null ? null : payee.copy();
        dst.referral = referral == null ? null : referral.copy();
        if (diagnosis != null) {
            dst.diagnosis = new ArrayList<DiagnosisComponent>();
            for (DiagnosisComponent i : diagnosis) dst.diagnosis.add(i.copy());
        }
        ;
        if (condition != null) {
            dst.condition = new ArrayList<Coding>();
            for (Coding i : condition) dst.condition.add(i.copy());
        }
        ;
        dst.patient = patient == null ? null : patient.copy();
        if (coverage != null) {
            dst.coverage = new ArrayList<CoverageComponent>();
            for (CoverageComponent i : coverage) dst.coverage.add(i.copy());
        }
        ;
        if (exception != null) {
            dst.exception = new ArrayList<Coding>();
            for (Coding i : exception) dst.exception.add(i.copy());
        }
        ;
        dst.school = school == null ? null : school.copy();
        dst.accident = accident == null ? null : accident.copy();
        dst.accidentType = accidentType == null ? null : accidentType.copy();
        if (interventionException != null) {
            dst.interventionException = new ArrayList<Coding>();
            for (Coding i : interventionException) dst.interventionException.add(i.copy());
        }
        ;
        if (item != null) {
            dst.item = new ArrayList<ItemsComponent>();
            for (ItemsComponent i : item) dst.item.add(i.copy());
        }
        ;
        if (additionalMaterials != null) {
            dst.additionalMaterials = new ArrayList<Coding>();
            for (Coding i : additionalMaterials) dst.additionalMaterials.add(i.copy());
        }
        ;
        if (missingTeeth != null) {
            dst.missingTeeth = new ArrayList<MissingTeethComponent>();
            for (MissingTeethComponent i : missingTeeth) dst.missingTeeth.add(i.copy());
        }
        ;
        return dst;
    }

    protected Claim typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Claim))
            return false;
        Claim o = (Claim) other;
        return compareDeep(type, o.type, true) && compareDeep(identifier, o.identifier, true) && compareDeep(ruleset, o.ruleset, true) && compareDeep(originalRuleset, o.originalRuleset, true) && compareDeep(created, o.created, true) && compareDeep(target, o.target, true) && compareDeep(provider, o.provider, true) && compareDeep(organization, o.organization, true) && compareDeep(use, o.use, true) && compareDeep(priority, o.priority, true) && compareDeep(fundsReserve, o.fundsReserve, true) && compareDeep(enterer, o.enterer, true) && compareDeep(facility, o.facility, true) && compareDeep(prescription, o.prescription, true) && compareDeep(originalPrescription, o.originalPrescription, true) && compareDeep(payee, o.payee, true) && compareDeep(referral, o.referral, true) && compareDeep(diagnosis, o.diagnosis, true) && compareDeep(condition, o.condition, true) && compareDeep(patient, o.patient, true) && compareDeep(coverage, o.coverage, true) && compareDeep(exception, o.exception, true) && compareDeep(school, o.school, true) && compareDeep(accident, o.accident, true) && compareDeep(accidentType, o.accidentType, true) && compareDeep(interventionException, o.interventionException, true) && compareDeep(item, o.item, true) && compareDeep(additionalMaterials, o.additionalMaterials, true) && compareDeep(missingTeeth, o.missingTeeth, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Claim))
            return false;
        Claim o = (Claim) other;
        return compareValues(type, o.type, true) && compareValues(created, o.created, true) && compareValues(use, o.use, true) && compareValues(school, o.school, true) && compareValues(accident, o.accident, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (identifier == null || identifier.isEmpty()) && (ruleset == null || ruleset.isEmpty()) && (originalRuleset == null || originalRuleset.isEmpty()) && (created == null || created.isEmpty()) && (target == null || target.isEmpty()) && (provider == null || provider.isEmpty()) && (organization == null || organization.isEmpty()) && (use == null || use.isEmpty()) && (priority == null || priority.isEmpty()) && (fundsReserve == null || fundsReserve.isEmpty()) && (enterer == null || enterer.isEmpty()) && (facility == null || facility.isEmpty()) && (prescription == null || prescription.isEmpty()) && (originalPrescription == null || originalPrescription.isEmpty()) && (payee == null || payee.isEmpty()) && (referral == null || referral.isEmpty()) && (diagnosis == null || diagnosis.isEmpty()) && (condition == null || condition.isEmpty()) && (patient == null || patient.isEmpty()) && (coverage == null || coverage.isEmpty()) && (exception == null || exception.isEmpty()) && (school == null || school.isEmpty()) && (accident == null || accident.isEmpty()) && (accidentType == null || accidentType.isEmpty()) && (interventionException == null || interventionException.isEmpty()) && (item == null || item.isEmpty()) && (additionalMaterials == null || additionalMaterials.isEmpty()) && (missingTeeth == null || missingTeeth.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Claim;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PROVIDER = "provider";

    public static final String SP_USE = "use";

    public static final String SP_PATIENT = "patient";

    public static final String SP_PRIORITY = "priority";
}
