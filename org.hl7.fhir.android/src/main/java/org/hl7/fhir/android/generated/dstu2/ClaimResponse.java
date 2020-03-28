package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.RemittanceOutcome;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.RemittanceOutcomeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

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
 * This resource provides the adjudication details from the processing of a Claim resource.
 */
public class ClaimResponse extends DomainResource {

    /**
     * The Response business identifier.
     */
    protected List<Identifier> identifier;

    /**
     * Original request resource referrence.
     */
    protected Reference request;

    /**
     * The actual object that is the target of the reference (Original request resource referrence.)
     */
    protected Claim requestTarget;

    /**
     * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
     */
    protected Coding ruleset;

    /**
     * The style (standard) and version of the original material which was converted into this resource.
     */
    protected Coding originalRuleset;

    /**
     * The date when the enclosed suite of services were performed or completed.
     */
    protected DateTimeType created;

    /**
     * The Insurer who produced this adjudicated response.
     */
    protected Reference organization;

    /**
     * The actual object that is the target of the reference (The Insurer who produced this adjudicated response.)
     */
    protected Organization organizationTarget;

    /**
     * The practitioner who is responsible for the services rendered to the patient.
     */
    protected Reference requestProvider;

    /**
     * The actual object that is the target of the reference (The practitioner who is responsible for the services rendered to the patient.)
     */
    protected Practitioner requestProviderTarget;

    /**
     * The organization which is responsible for the services rendered to the patient.
     */
    protected Reference requestOrganization;

    /**
     * The actual object that is the target of the reference (The organization which is responsible for the services rendered to the patient.)
     */
    protected Organization requestOrganizationTarget;

    /**
     * Transaction status: error, complete.
     */
    protected Enumeration<RemittanceOutcome> outcome;

    /**
     * A description of the status of the adjudication.
     */
    protected StringType disposition;

    /**
     * Party to be reimbursed: Subscriber, provider, other.
     */
    protected Coding payeeType;

    /**
     * The first tier service adjudications for submitted services.
     */
    protected List<ItemsComponent> item;

    /**
     * The first tier service adjudications for payor added services.
     */
    protected List<AddedItemComponent> addItem;

    /**
     * Mutually exclusive with Services Provided (Item).
     */
    protected List<ErrorsComponent> error;

    /**
     * The total cost of the services reported.
     */
    protected Money totalCost;

    /**
     * The amount of deductible applied which was not allocated to any particular service line.
     */
    protected Money unallocDeductable;

    /**
     * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible).
     */
    protected Money totalBenefit;

    /**
     * Adjustment to the payment of this transaction which is not related to adjudication of this transaction.
     */
    protected Money paymentAdjustment;

    /**
     * Reason for the payment adjustment.
     */
    protected Coding paymentAdjustmentReason;

    /**
     * Estimated payment data.
     */
    protected DateType paymentDate;

    /**
     * Payable less any payment adjustment.
     */
    protected Money paymentAmount;

    /**
     * Payment identifier.
     */
    protected Identifier paymentRef;

    /**
     * Status of funds reservation (For provider, for Patient, None).
     */
    protected Coding reserved;

    /**
     * The form to be used for printing the content.
     */
    protected Coding form;

    /**
     * Note text.
     */
    protected List<NotesComponent> note;

    /**
     * Financial instrument by which payment information for health care.
     */
    protected List<CoverageComponent> coverage;

    private static final long serialVersionUID = 2021598689L;

    /*
   * Constructor
   */
    public ClaimResponse() {
        super();
    }

    /**
     * @return {@link #identifier} (The Response business identifier.)
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
     * @return {@link #identifier} (The Response business identifier.)
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
    public ClaimResponse addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #request} (Original request resource referrence.)
     */
    public Reference getRequest() {
        if (this.request == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.request");
            else if (Configuration.doAutoCreate())
                // cc
                this.request = new Reference();
        return this.request;
    }

    public boolean hasRequest() {
        return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (Original request resource referrence.)
     */
    public ClaimResponse setRequest(Reference value) {
        this.request = value;
        return this;
    }

    /**
     * @return {@link #request} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Original request resource referrence.)
     */
    public Claim getRequestTarget() {
        if (this.requestTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.request");
            else if (Configuration.doAutoCreate())
                // aa
                this.requestTarget = new Claim();
        return this.requestTarget;
    }

    /**
     * @param value {@link #request} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Original request resource referrence.)
     */
    public ClaimResponse setRequestTarget(Claim value) {
        this.requestTarget = value;
        return this;
    }

    /**
     * @return {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public Coding getRuleset() {
        if (this.ruleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.ruleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.ruleset = new Coding();
        return this.ruleset;
    }

    public boolean hasRuleset() {
        return this.ruleset != null && !this.ruleset.isEmpty();
    }

    /**
     * @param value {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public ClaimResponse setRuleset(Coding value) {
        this.ruleset = value;
        return this;
    }

    /**
     * @return {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public Coding getOriginalRuleset() {
        if (this.originalRuleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.originalRuleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.originalRuleset = new Coding();
        return this.originalRuleset;
    }

    public boolean hasOriginalRuleset() {
        return this.originalRuleset != null && !this.originalRuleset.isEmpty();
    }

    /**
     * @param value {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public ClaimResponse setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
        return this;
    }

    /**
     * @return {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() {
        if (this.created == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.created");
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
    public ClaimResponse setCreatedElement(DateTimeType value) {
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
    public ClaimResponse setCreated(Date value) {
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
     * @return {@link #organization} (The Insurer who produced this adjudicated response.)
     */
    public Reference getOrganization() {
        if (this.organization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.organization");
            else if (Configuration.doAutoCreate())
                // cc
                this.organization = new Reference();
        return this.organization;
    }

    public boolean hasOrganization() {
        return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (The Insurer who produced this adjudicated response.)
     */
    public ClaimResponse setOrganization(Reference value) {
        this.organization = value;
        return this;
    }

    /**
     * @return {@link #organization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The Insurer who produced this adjudicated response.)
     */
    public Organization getOrganizationTarget() {
        if (this.organizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.organization");
            else if (Configuration.doAutoCreate())
                // aa
                this.organizationTarget = new Organization();
        return this.organizationTarget;
    }

    /**
     * @param value {@link #organization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The Insurer who produced this adjudicated response.)
     */
    public ClaimResponse setOrganizationTarget(Organization value) {
        this.organizationTarget = value;
        return this;
    }

    /**
     * @return {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Reference getRequestProvider() {
        if (this.requestProvider == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.requestProvider");
            else if (Configuration.doAutoCreate())
                // cc
                this.requestProvider = new Reference();
        return this.requestProvider;
    }

    public boolean hasRequestProvider() {
        return this.requestProvider != null && !this.requestProvider.isEmpty();
    }

    /**
     * @param value {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public ClaimResponse setRequestProvider(Reference value) {
        this.requestProvider = value;
        return this;
    }

    /**
     * @return {@link #requestProvider} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Practitioner getRequestProviderTarget() {
        if (this.requestProviderTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.requestProvider");
            else if (Configuration.doAutoCreate())
                // aa
                this.requestProviderTarget = new Practitioner();
        return this.requestProviderTarget;
    }

    /**
     * @param value {@link #requestProvider} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The practitioner who is responsible for the services rendered to the patient.)
     */
    public ClaimResponse setRequestProviderTarget(Practitioner value) {
        this.requestProviderTarget = value;
        return this;
    }

    /**
     * @return {@link #requestOrganization} (The organization which is responsible for the services rendered to the patient.)
     */
    public Reference getRequestOrganization() {
        if (this.requestOrganization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.requestOrganization");
            else if (Configuration.doAutoCreate())
                // cc
                this.requestOrganization = new Reference();
        return this.requestOrganization;
    }

    public boolean hasRequestOrganization() {
        return this.requestOrganization != null && !this.requestOrganization.isEmpty();
    }

    /**
     * @param value {@link #requestOrganization} (The organization which is responsible for the services rendered to the patient.)
     */
    public ClaimResponse setRequestOrganization(Reference value) {
        this.requestOrganization = value;
        return this;
    }

    /**
     * @return {@link #requestOrganization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the services rendered to the patient.)
     */
    public Organization getRequestOrganizationTarget() {
        if (this.requestOrganizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.requestOrganization");
            else if (Configuration.doAutoCreate())
                // aa
                this.requestOrganizationTarget = new Organization();
        return this.requestOrganizationTarget;
    }

    /**
     * @param value {@link #requestOrganization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the services rendered to the patient.)
     */
    public ClaimResponse setRequestOrganizationTarget(Organization value) {
        this.requestOrganizationTarget = value;
        return this;
    }

    /**
     * @return {@link #outcome} (Transaction status: error, complete.). This is the underlying object with id, value and extensions. The accessor "getOutcome" gives direct access to the value
     */
    public Enumeration<RemittanceOutcome> getOutcomeElement() {
        if (this.outcome == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.outcome");
            else if (Configuration.doAutoCreate())
                // bb
                this.outcome = new Enumeration<RemittanceOutcome>(new RemittanceOutcomeEnumFactory());
        return this.outcome;
    }

    public boolean hasOutcomeElement() {
        return this.outcome != null && !this.outcome.isEmpty();
    }

    public boolean hasOutcome() {
        return this.outcome != null && !this.outcome.isEmpty();
    }

    /**
     * @param value {@link #outcome} (Transaction status: error, complete.). This is the underlying object with id, value and extensions. The accessor "getOutcome" gives direct access to the value
     */
    public ClaimResponse setOutcomeElement(Enumeration<RemittanceOutcome> value) {
        this.outcome = value;
        return this;
    }

    /**
     * @return Transaction status: error, complete.
     */
    public RemittanceOutcome getOutcome() {
        return this.outcome == null ? null : this.outcome.getValue();
    }

    /**
     * @param value Transaction status: error, complete.
     */
    public ClaimResponse setOutcome(RemittanceOutcome value) {
        if (value == null)
            this.outcome = null;
        else {
            if (this.outcome == null)
                this.outcome = new Enumeration<RemittanceOutcome>(new RemittanceOutcomeEnumFactory());
            this.outcome.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #disposition} (A description of the status of the adjudication.). This is the underlying object with id, value and extensions. The accessor "getDisposition" gives direct access to the value
     */
    public StringType getDispositionElement() {
        if (this.disposition == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.disposition");
            else if (Configuration.doAutoCreate())
                // bb
                this.disposition = new StringType();
        return this.disposition;
    }

    public boolean hasDispositionElement() {
        return this.disposition != null && !this.disposition.isEmpty();
    }

    public boolean hasDisposition() {
        return this.disposition != null && !this.disposition.isEmpty();
    }

    /**
     * @param value {@link #disposition} (A description of the status of the adjudication.). This is the underlying object with id, value and extensions. The accessor "getDisposition" gives direct access to the value
     */
    public ClaimResponse setDispositionElement(StringType value) {
        this.disposition = value;
        return this;
    }

    /**
     * @return A description of the status of the adjudication.
     */
    public String getDisposition() {
        return this.disposition == null ? null : this.disposition.getValue();
    }

    /**
     * @param value A description of the status of the adjudication.
     */
    public ClaimResponse setDisposition(String value) {
        if (Utilities.noString(value))
            this.disposition = null;
        else {
            if (this.disposition == null)
                this.disposition = new StringType();
            this.disposition.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #payeeType} (Party to be reimbursed: Subscriber, provider, other.)
     */
    public Coding getPayeeType() {
        if (this.payeeType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.payeeType");
            else if (Configuration.doAutoCreate())
                // cc
                this.payeeType = new Coding();
        return this.payeeType;
    }

    public boolean hasPayeeType() {
        return this.payeeType != null && !this.payeeType.isEmpty();
    }

    /**
     * @param value {@link #payeeType} (Party to be reimbursed: Subscriber, provider, other.)
     */
    public ClaimResponse setPayeeType(Coding value) {
        this.payeeType = value;
        return this;
    }

    /**
     * @return {@link #item} (The first tier service adjudications for submitted services.)
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
     * @return {@link #item} (The first tier service adjudications for submitted services.)
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
    public ClaimResponse addItem(ItemsComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.item == null)
            this.item = new ArrayList<ItemsComponent>();
        this.item.add(t);
        return this;
    }

    /**
     * @return {@link #addItem} (The first tier service adjudications for payor added services.)
     */
    public List<AddedItemComponent> getAddItem() {
        if (this.addItem == null)
            this.addItem = new ArrayList<AddedItemComponent>();
        return this.addItem;
    }

    public boolean hasAddItem() {
        if (this.addItem == null)
            return false;
        for (AddedItemComponent item : this.addItem) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #addItem} (The first tier service adjudications for payor added services.)
     */
    // syntactic sugar
    public AddedItemComponent addAddItem() {
        // 3
        AddedItemComponent t = new AddedItemComponent();
        if (this.addItem == null)
            this.addItem = new ArrayList<AddedItemComponent>();
        this.addItem.add(t);
        return t;
    }

    // syntactic sugar
    public ClaimResponse addAddItem(AddedItemComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.addItem == null)
            this.addItem = new ArrayList<AddedItemComponent>();
        this.addItem.add(t);
        return this;
    }

    /**
     * @return {@link #error} (Mutually exclusive with Services Provided (Item).)
     */
    public List<ErrorsComponent> getError() {
        if (this.error == null)
            this.error = new ArrayList<ErrorsComponent>();
        return this.error;
    }

    public boolean hasError() {
        if (this.error == null)
            return false;
        for (ErrorsComponent item : this.error) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #error} (Mutually exclusive with Services Provided (Item).)
     */
    // syntactic sugar
    public ErrorsComponent addError() {
        // 3
        ErrorsComponent t = new ErrorsComponent();
        if (this.error == null)
            this.error = new ArrayList<ErrorsComponent>();
        this.error.add(t);
        return t;
    }

    // syntactic sugar
    public ClaimResponse addError(ErrorsComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.error == null)
            this.error = new ArrayList<ErrorsComponent>();
        this.error.add(t);
        return this;
    }

    /**
     * @return {@link #totalCost} (The total cost of the services reported.)
     */
    public Money getTotalCost() {
        if (this.totalCost == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.totalCost");
            else if (Configuration.doAutoCreate())
                // cc
                this.totalCost = new Money();
        return this.totalCost;
    }

    public boolean hasTotalCost() {
        return this.totalCost != null && !this.totalCost.isEmpty();
    }

    /**
     * @param value {@link #totalCost} (The total cost of the services reported.)
     */
    public ClaimResponse setTotalCost(Money value) {
        this.totalCost = value;
        return this;
    }

    /**
     * @return {@link #unallocDeductable} (The amount of deductible applied which was not allocated to any particular service line.)
     */
    public Money getUnallocDeductable() {
        if (this.unallocDeductable == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.unallocDeductable");
            else if (Configuration.doAutoCreate())
                // cc
                this.unallocDeductable = new Money();
        return this.unallocDeductable;
    }

    public boolean hasUnallocDeductable() {
        return this.unallocDeductable != null && !this.unallocDeductable.isEmpty();
    }

    /**
     * @param value {@link #unallocDeductable} (The amount of deductible applied which was not allocated to any particular service line.)
     */
    public ClaimResponse setUnallocDeductable(Money value) {
        this.unallocDeductable = value;
        return this;
    }

    /**
     * @return {@link #totalBenefit} (Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible).)
     */
    public Money getTotalBenefit() {
        if (this.totalBenefit == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.totalBenefit");
            else if (Configuration.doAutoCreate())
                // cc
                this.totalBenefit = new Money();
        return this.totalBenefit;
    }

    public boolean hasTotalBenefit() {
        return this.totalBenefit != null && !this.totalBenefit.isEmpty();
    }

    /**
     * @param value {@link #totalBenefit} (Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible).)
     */
    public ClaimResponse setTotalBenefit(Money value) {
        this.totalBenefit = value;
        return this;
    }

    /**
     * @return {@link #paymentAdjustment} (Adjustment to the payment of this transaction which is not related to adjudication of this transaction.)
     */
    public Money getPaymentAdjustment() {
        if (this.paymentAdjustment == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.paymentAdjustment");
            else if (Configuration.doAutoCreate())
                // cc
                this.paymentAdjustment = new Money();
        return this.paymentAdjustment;
    }

    public boolean hasPaymentAdjustment() {
        return this.paymentAdjustment != null && !this.paymentAdjustment.isEmpty();
    }

    /**
     * @param value {@link #paymentAdjustment} (Adjustment to the payment of this transaction which is not related to adjudication of this transaction.)
     */
    public ClaimResponse setPaymentAdjustment(Money value) {
        this.paymentAdjustment = value;
        return this;
    }

    /**
     * @return {@link #paymentAdjustmentReason} (Reason for the payment adjustment.)
     */
    public Coding getPaymentAdjustmentReason() {
        if (this.paymentAdjustmentReason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.paymentAdjustmentReason");
            else if (Configuration.doAutoCreate())
                // cc
                this.paymentAdjustmentReason = new Coding();
        return this.paymentAdjustmentReason;
    }

    public boolean hasPaymentAdjustmentReason() {
        return this.paymentAdjustmentReason != null && !this.paymentAdjustmentReason.isEmpty();
    }

    /**
     * @param value {@link #paymentAdjustmentReason} (Reason for the payment adjustment.)
     */
    public ClaimResponse setPaymentAdjustmentReason(Coding value) {
        this.paymentAdjustmentReason = value;
        return this;
    }

    /**
     * @return {@link #paymentDate} (Estimated payment data.). This is the underlying object with id, value and extensions. The accessor "getPaymentDate" gives direct access to the value
     */
    public DateType getPaymentDateElement() {
        if (this.paymentDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.paymentDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.paymentDate = new DateType();
        return this.paymentDate;
    }

    public boolean hasPaymentDateElement() {
        return this.paymentDate != null && !this.paymentDate.isEmpty();
    }

    public boolean hasPaymentDate() {
        return this.paymentDate != null && !this.paymentDate.isEmpty();
    }

    /**
     * @param value {@link #paymentDate} (Estimated payment data.). This is the underlying object with id, value and extensions. The accessor "getPaymentDate" gives direct access to the value
     */
    public ClaimResponse setPaymentDateElement(DateType value) {
        this.paymentDate = value;
        return this;
    }

    /**
     * @return Estimated payment data.
     */
    public Date getPaymentDate() {
        return this.paymentDate == null ? null : this.paymentDate.getValue();
    }

    /**
     * @param value Estimated payment data.
     */
    public ClaimResponse setPaymentDate(Date value) {
        if (value == null)
            this.paymentDate = null;
        else {
            if (this.paymentDate == null)
                this.paymentDate = new DateType();
            this.paymentDate.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #paymentAmount} (Payable less any payment adjustment.)
     */
    public Money getPaymentAmount() {
        if (this.paymentAmount == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.paymentAmount");
            else if (Configuration.doAutoCreate())
                // cc
                this.paymentAmount = new Money();
        return this.paymentAmount;
    }

    public boolean hasPaymentAmount() {
        return this.paymentAmount != null && !this.paymentAmount.isEmpty();
    }

    /**
     * @param value {@link #paymentAmount} (Payable less any payment adjustment.)
     */
    public ClaimResponse setPaymentAmount(Money value) {
        this.paymentAmount = value;
        return this;
    }

    /**
     * @return {@link #paymentRef} (Payment identifier.)
     */
    public Identifier getPaymentRef() {
        if (this.paymentRef == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.paymentRef");
            else if (Configuration.doAutoCreate())
                // cc
                this.paymentRef = new Identifier();
        return this.paymentRef;
    }

    public boolean hasPaymentRef() {
        return this.paymentRef != null && !this.paymentRef.isEmpty();
    }

    /**
     * @param value {@link #paymentRef} (Payment identifier.)
     */
    public ClaimResponse setPaymentRef(Identifier value) {
        this.paymentRef = value;
        return this;
    }

    /**
     * @return {@link #reserved} (Status of funds reservation (For provider, for Patient, None).)
     */
    public Coding getReserved() {
        if (this.reserved == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.reserved");
            else if (Configuration.doAutoCreate())
                // cc
                this.reserved = new Coding();
        return this.reserved;
    }

    public boolean hasReserved() {
        return this.reserved != null && !this.reserved.isEmpty();
    }

    /**
     * @param value {@link #reserved} (Status of funds reservation (For provider, for Patient, None).)
     */
    public ClaimResponse setReserved(Coding value) {
        this.reserved = value;
        return this;
    }

    /**
     * @return {@link #form} (The form to be used for printing the content.)
     */
    public Coding getForm() {
        if (this.form == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClaimResponse.form");
            else if (Configuration.doAutoCreate())
                // cc
                this.form = new Coding();
        return this.form;
    }

    public boolean hasForm() {
        return this.form != null && !this.form.isEmpty();
    }

    /**
     * @param value {@link #form} (The form to be used for printing the content.)
     */
    public ClaimResponse setForm(Coding value) {
        this.form = value;
        return this;
    }

    /**
     * @return {@link #note} (Note text.)
     */
    public List<NotesComponent> getNote() {
        if (this.note == null)
            this.note = new ArrayList<NotesComponent>();
        return this.note;
    }

    public boolean hasNote() {
        if (this.note == null)
            return false;
        for (NotesComponent item : this.note) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #note} (Note text.)
     */
    // syntactic sugar
    public NotesComponent addNote() {
        // 3
        NotesComponent t = new NotesComponent();
        if (this.note == null)
            this.note = new ArrayList<NotesComponent>();
        this.note.add(t);
        return t;
    }

    // syntactic sugar
    public ClaimResponse addNote(NotesComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.note == null)
            this.note = new ArrayList<NotesComponent>();
        this.note.add(t);
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
    public ClaimResponse addCoverage(CoverageComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.coverage == null)
            this.coverage = new ArrayList<CoverageComponent>();
        this.coverage.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "The Response business identifier.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("request", "Reference(Claim)", "Original request resource referrence.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("ruleset", "Coding", "The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.", 0, java.lang.Integer.MAX_VALUE, ruleset));
        childrenList.add(new Property("originalRuleset", "Coding", "The style (standard) and version of the original material which was converted into this resource.", 0, java.lang.Integer.MAX_VALUE, originalRuleset));
        childrenList.add(new Property("created", "dateTime", "The date when the enclosed suite of services were performed or completed.", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("organization", "Reference(Organization)", "The Insurer who produced this adjudicated response.", 0, java.lang.Integer.MAX_VALUE, organization));
        childrenList.add(new Property("requestProvider", "Reference(Practitioner)", "The practitioner who is responsible for the services rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, requestProvider));
        childrenList.add(new Property("requestOrganization", "Reference(Organization)", "The organization which is responsible for the services rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, requestOrganization));
        childrenList.add(new Property("outcome", "code", "Transaction status: error, complete.", 0, java.lang.Integer.MAX_VALUE, outcome));
        childrenList.add(new Property("disposition", "string", "A description of the status of the adjudication.", 0, java.lang.Integer.MAX_VALUE, disposition));
        childrenList.add(new Property("payeeType", "Coding", "Party to be reimbursed: Subscriber, provider, other.", 0, java.lang.Integer.MAX_VALUE, payeeType));
        childrenList.add(new Property("item", "", "The first tier service adjudications for submitted services.", 0, java.lang.Integer.MAX_VALUE, item));
        childrenList.add(new Property("addItem", "", "The first tier service adjudications for payor added services.", 0, java.lang.Integer.MAX_VALUE, addItem));
        childrenList.add(new Property("error", "", "Mutually exclusive with Services Provided (Item).", 0, java.lang.Integer.MAX_VALUE, error));
        childrenList.add(new Property("totalCost", "Money", "The total cost of the services reported.", 0, java.lang.Integer.MAX_VALUE, totalCost));
        childrenList.add(new Property("unallocDeductable", "Money", "The amount of deductible applied which was not allocated to any particular service line.", 0, java.lang.Integer.MAX_VALUE, unallocDeductable));
        childrenList.add(new Property("totalBenefit", "Money", "Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible).", 0, java.lang.Integer.MAX_VALUE, totalBenefit));
        childrenList.add(new Property("paymentAdjustment", "Money", "Adjustment to the payment of this transaction which is not related to adjudication of this transaction.", 0, java.lang.Integer.MAX_VALUE, paymentAdjustment));
        childrenList.add(new Property("paymentAdjustmentReason", "Coding", "Reason for the payment adjustment.", 0, java.lang.Integer.MAX_VALUE, paymentAdjustmentReason));
        childrenList.add(new Property("paymentDate", "date", "Estimated payment data.", 0, java.lang.Integer.MAX_VALUE, paymentDate));
        childrenList.add(new Property("paymentAmount", "Money", "Payable less any payment adjustment.", 0, java.lang.Integer.MAX_VALUE, paymentAmount));
        childrenList.add(new Property("paymentRef", "Identifier", "Payment identifier.", 0, java.lang.Integer.MAX_VALUE, paymentRef));
        childrenList.add(new Property("reserved", "Coding", "Status of funds reservation (For provider, for Patient, None).", 0, java.lang.Integer.MAX_VALUE, reserved));
        childrenList.add(new Property("form", "Coding", "The form to be used for printing the content.", 0, java.lang.Integer.MAX_VALUE, form));
        childrenList.add(new Property("note", "", "Note text.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("coverage", "", "Financial instrument by which payment information for health care.", 0, java.lang.Integer.MAX_VALUE, coverage));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("request"))
            // Reference
            this.request = castToReference(value);
        else if (name.equals("ruleset"))
            // Coding
            this.ruleset = castToCoding(value);
        else if (name.equals("originalRuleset"))
            // Coding
            this.originalRuleset = castToCoding(value);
        else if (name.equals("created"))
            // DateTimeType
            this.created = castToDateTime(value);
        else if (name.equals("organization"))
            // Reference
            this.organization = castToReference(value);
        else if (name.equals("requestProvider"))
            // Reference
            this.requestProvider = castToReference(value);
        else if (name.equals("requestOrganization"))
            // Reference
            this.requestOrganization = castToReference(value);
        else if (name.equals("outcome"))
            // Enumeration<RemittanceOutcome>
            this.outcome = new RemittanceOutcomeEnumFactory().fromType(value);
        else if (name.equals("disposition"))
            // StringType
            this.disposition = castToString(value);
        else if (name.equals("payeeType"))
            // Coding
            this.payeeType = castToCoding(value);
        else if (name.equals("item"))
            this.getItem().add((ItemsComponent) value);
        else if (name.equals("addItem"))
            this.getAddItem().add((AddedItemComponent) value);
        else if (name.equals("error"))
            this.getError().add((ErrorsComponent) value);
        else if (name.equals("totalCost"))
            // Money
            this.totalCost = castToMoney(value);
        else if (name.equals("unallocDeductable"))
            // Money
            this.unallocDeductable = castToMoney(value);
        else if (name.equals("totalBenefit"))
            // Money
            this.totalBenefit = castToMoney(value);
        else if (name.equals("paymentAdjustment"))
            // Money
            this.paymentAdjustment = castToMoney(value);
        else if (name.equals("paymentAdjustmentReason"))
            // Coding
            this.paymentAdjustmentReason = castToCoding(value);
        else if (name.equals("paymentDate"))
            // DateType
            this.paymentDate = castToDate(value);
        else if (name.equals("paymentAmount"))
            // Money
            this.paymentAmount = castToMoney(value);
        else if (name.equals("paymentRef"))
            // Identifier
            this.paymentRef = castToIdentifier(value);
        else if (name.equals("reserved"))
            // Coding
            this.reserved = castToCoding(value);
        else if (name.equals("form"))
            // Coding
            this.form = castToCoding(value);
        else if (name.equals("note"))
            this.getNote().add((NotesComponent) value);
        else if (name.equals("coverage"))
            this.getCoverage().add((CoverageComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("request")) {
            this.request = new Reference();
            return this.request;
        } else if (name.equals("ruleset")) {
            this.ruleset = new Coding();
            return this.ruleset;
        } else if (name.equals("originalRuleset")) {
            this.originalRuleset = new Coding();
            return this.originalRuleset;
        } else if (name.equals("created")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.created");
        } else if (name.equals("organization")) {
            this.organization = new Reference();
            return this.organization;
        } else if (name.equals("requestProvider")) {
            this.requestProvider = new Reference();
            return this.requestProvider;
        } else if (name.equals("requestOrganization")) {
            this.requestOrganization = new Reference();
            return this.requestOrganization;
        } else if (name.equals("outcome")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.outcome");
        } else if (name.equals("disposition")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.disposition");
        } else if (name.equals("payeeType")) {
            this.payeeType = new Coding();
            return this.payeeType;
        } else if (name.equals("item")) {
            return addItem();
        } else if (name.equals("addItem")) {
            return addAddItem();
        } else if (name.equals("error")) {
            return addError();
        } else if (name.equals("totalCost")) {
            this.totalCost = new Money();
            return this.totalCost;
        } else if (name.equals("unallocDeductable")) {
            this.unallocDeductable = new Money();
            return this.unallocDeductable;
        } else if (name.equals("totalBenefit")) {
            this.totalBenefit = new Money();
            return this.totalBenefit;
        } else if (name.equals("paymentAdjustment")) {
            this.paymentAdjustment = new Money();
            return this.paymentAdjustment;
        } else if (name.equals("paymentAdjustmentReason")) {
            this.paymentAdjustmentReason = new Coding();
            return this.paymentAdjustmentReason;
        } else if (name.equals("paymentDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.paymentDate");
        } else if (name.equals("paymentAmount")) {
            this.paymentAmount = new Money();
            return this.paymentAmount;
        } else if (name.equals("paymentRef")) {
            this.paymentRef = new Identifier();
            return this.paymentRef;
        } else if (name.equals("reserved")) {
            this.reserved = new Coding();
            return this.reserved;
        } else if (name.equals("form")) {
            this.form = new Coding();
            return this.form;
        } else if (name.equals("note")) {
            return addNote();
        } else if (name.equals("coverage")) {
            return addCoverage();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ClaimResponse";
    }

    public ClaimResponse copy() {
        ClaimResponse dst = new ClaimResponse();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.request = request == null ? null : request.copy();
        dst.ruleset = ruleset == null ? null : ruleset.copy();
        dst.originalRuleset = originalRuleset == null ? null : originalRuleset.copy();
        dst.created = created == null ? null : created.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.requestProvider = requestProvider == null ? null : requestProvider.copy();
        dst.requestOrganization = requestOrganization == null ? null : requestOrganization.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.disposition = disposition == null ? null : disposition.copy();
        dst.payeeType = payeeType == null ? null : payeeType.copy();
        if (item != null) {
            dst.item = new ArrayList<ItemsComponent>();
            for (ItemsComponent i : item) dst.item.add(i.copy());
        }
        ;
        if (addItem != null) {
            dst.addItem = new ArrayList<AddedItemComponent>();
            for (AddedItemComponent i : addItem) dst.addItem.add(i.copy());
        }
        ;
        if (error != null) {
            dst.error = new ArrayList<ErrorsComponent>();
            for (ErrorsComponent i : error) dst.error.add(i.copy());
        }
        ;
        dst.totalCost = totalCost == null ? null : totalCost.copy();
        dst.unallocDeductable = unallocDeductable == null ? null : unallocDeductable.copy();
        dst.totalBenefit = totalBenefit == null ? null : totalBenefit.copy();
        dst.paymentAdjustment = paymentAdjustment == null ? null : paymentAdjustment.copy();
        dst.paymentAdjustmentReason = paymentAdjustmentReason == null ? null : paymentAdjustmentReason.copy();
        dst.paymentDate = paymentDate == null ? null : paymentDate.copy();
        dst.paymentAmount = paymentAmount == null ? null : paymentAmount.copy();
        dst.paymentRef = paymentRef == null ? null : paymentRef.copy();
        dst.reserved = reserved == null ? null : reserved.copy();
        dst.form = form == null ? null : form.copy();
        if (note != null) {
            dst.note = new ArrayList<NotesComponent>();
            for (NotesComponent i : note) dst.note.add(i.copy());
        }
        ;
        if (coverage != null) {
            dst.coverage = new ArrayList<CoverageComponent>();
            for (CoverageComponent i : coverage) dst.coverage.add(i.copy());
        }
        ;
        return dst;
    }

    protected ClaimResponse typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ClaimResponse))
            return false;
        ClaimResponse o = (ClaimResponse) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(request, o.request, true) && compareDeep(ruleset, o.ruleset, true) && compareDeep(originalRuleset, o.originalRuleset, true) && compareDeep(created, o.created, true) && compareDeep(organization, o.organization, true) && compareDeep(requestProvider, o.requestProvider, true) && compareDeep(requestOrganization, o.requestOrganization, true) && compareDeep(outcome, o.outcome, true) && compareDeep(disposition, o.disposition, true) && compareDeep(payeeType, o.payeeType, true) && compareDeep(item, o.item, true) && compareDeep(addItem, o.addItem, true) && compareDeep(error, o.error, true) && compareDeep(totalCost, o.totalCost, true) && compareDeep(unallocDeductable, o.unallocDeductable, true) && compareDeep(totalBenefit, o.totalBenefit, true) && compareDeep(paymentAdjustment, o.paymentAdjustment, true) && compareDeep(paymentAdjustmentReason, o.paymentAdjustmentReason, true) && compareDeep(paymentDate, o.paymentDate, true) && compareDeep(paymentAmount, o.paymentAmount, true) && compareDeep(paymentRef, o.paymentRef, true) && compareDeep(reserved, o.reserved, true) && compareDeep(form, o.form, true) && compareDeep(note, o.note, true) && compareDeep(coverage, o.coverage, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ClaimResponse))
            return false;
        ClaimResponse o = (ClaimResponse) other;
        return compareValues(created, o.created, true) && compareValues(outcome, o.outcome, true) && compareValues(disposition, o.disposition, true) && compareValues(paymentDate, o.paymentDate, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (request == null || request.isEmpty()) && (ruleset == null || ruleset.isEmpty()) && (originalRuleset == null || originalRuleset.isEmpty()) && (created == null || created.isEmpty()) && (organization == null || organization.isEmpty()) && (requestProvider == null || requestProvider.isEmpty()) && (requestOrganization == null || requestOrganization.isEmpty()) && (outcome == null || outcome.isEmpty()) && (disposition == null || disposition.isEmpty()) && (payeeType == null || payeeType.isEmpty()) && (item == null || item.isEmpty()) && (addItem == null || addItem.isEmpty()) && (error == null || error.isEmpty()) && (totalCost == null || totalCost.isEmpty()) && (unallocDeductable == null || unallocDeductable.isEmpty()) && (totalBenefit == null || totalBenefit.isEmpty()) && (paymentAdjustment == null || paymentAdjustment.isEmpty()) && (paymentAdjustmentReason == null || paymentAdjustmentReason.isEmpty()) && (paymentDate == null || paymentDate.isEmpty()) && (paymentAmount == null || paymentAmount.isEmpty()) && (paymentRef == null || paymentRef.isEmpty()) && (reserved == null || reserved.isEmpty()) && (form == null || form.isEmpty()) && (note == null || note.isEmpty()) && (coverage == null || coverage.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ClaimResponse;
    }

    public static final String SP_IDENTIFIER = "identifier";
}
