package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
public class Contract extends DomainResource {

    /**
     * Unique identifier for this Contract.
     */
    protected Identifier identifier;

    /**
     * When this  Contract was issued.
     */
    protected DateTimeType issued;

    /**
     * Relevant time or time-period when this Contract is applicable.
     */
    protected Period applies;

    /**
     * Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services.
     */
    protected List<Reference> subject;

    /**
     * The actual objects that are the target of the reference (Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services.)
     */
    protected List<Resource> subjectTarget;

    /**
     * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
     */
    protected List<Reference> authority;

    /**
     * The actual objects that are the target of the reference (A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.)
     */
    protected List<Organization> authorityTarget;

    /**
     * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
     */
    protected List<Reference> domain;

    /**
     * The actual objects that are the target of the reference (Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.)
     */
    protected List<Location> domainTarget;

    /**
     * Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc.
     */
    protected CodeableConcept type;

    /**
     * More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
     */
    protected List<CodeableConcept> subType;

    /**
     * Action stipulated by this Contract.
     */
    protected List<CodeableConcept> action;

    /**
     * Reason for action stipulated by this Contract.
     */
    protected List<CodeableConcept> actionReason;

    /**
     * List of Contract actors.
     */
    protected List<ActorComponent> actor;

    /**
     * Contract Valued Item List.
     */
    protected List<ValuedItemComponent> valuedItem;

    /**
     * Party signing this Contract.
     */
    protected List<SignatoryComponent> signer;

    /**
     * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
     */
    protected List<TermComponent> term;

    /**
     * Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.
     */
    protected Type binding;

    /**
     * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
     */
    protected List<FriendlyLanguageComponent> friendly;

    /**
     * List of Legal expressions or representations of this Contract.
     */
    protected List<LegalLanguageComponent> legal;

    /**
     * List of Computable Policy Rule Language Representations of this Contract.
     */
    protected List<ComputableLanguageComponent> rule;

    private static final long serialVersionUID = -1785608373L;

    /*
   * Constructor
   */
    public Contract() {
        super();
    }

    /**
     * @return {@link #identifier} (Unique identifier for this Contract.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Contract.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Unique identifier for this Contract.)
     */
    public Contract setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #issued} (When this  Contract was issued.). This is the underlying object with id, value and extensions. The accessor "getIssued" gives direct access to the value
     */
    public DateTimeType getIssuedElement() {
        if (this.issued == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Contract.issued");
            else if (Configuration.doAutoCreate())
                // bb
                this.issued = new DateTimeType();
        return this.issued;
    }

    public boolean hasIssuedElement() {
        return this.issued != null && !this.issued.isEmpty();
    }

    public boolean hasIssued() {
        return this.issued != null && !this.issued.isEmpty();
    }

    /**
     * @param value {@link #issued} (When this  Contract was issued.). This is the underlying object with id, value and extensions. The accessor "getIssued" gives direct access to the value
     */
    public Contract setIssuedElement(DateTimeType value) {
        this.issued = value;
        return this;
    }

    /**
     * @return When this  Contract was issued.
     */
    public Date getIssued() {
        return this.issued == null ? null : this.issued.getValue();
    }

    /**
     * @param value When this  Contract was issued.
     */
    public Contract setIssued(Date value) {
        if (value == null)
            this.issued = null;
        else {
            if (this.issued == null)
                this.issued = new DateTimeType();
            this.issued.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #applies} (Relevant time or time-period when this Contract is applicable.)
     */
    public Period getApplies() {
        if (this.applies == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Contract.applies");
            else if (Configuration.doAutoCreate())
                // cc
                this.applies = new Period();
        return this.applies;
    }

    public boolean hasApplies() {
        return this.applies != null && !this.applies.isEmpty();
    }

    /**
     * @param value {@link #applies} (Relevant time or time-period when this Contract is applicable.)
     */
    public Contract setApplies(Period value) {
        this.applies = value;
        return this;
    }

    /**
     * @return {@link #subject} (Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services.)
     */
    public List<Reference> getSubject() {
        if (this.subject == null)
            this.subject = new ArrayList<Reference>();
        return this.subject;
    }

    public boolean hasSubject() {
        if (this.subject == null)
            return false;
        for (Reference item : this.subject) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #subject} (Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services.)
     */
    // syntactic sugar
    public Reference addSubject() {
        // 3
        Reference t = new Reference();
        if (this.subject == null)
            this.subject = new ArrayList<Reference>();
        this.subject.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addSubject(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.subject == null)
            this.subject = new ArrayList<Reference>();
        this.subject.add(t);
        return this;
    }

    /**
     * @return {@link #subject} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services.)
     */
    public List<Resource> getSubjectTarget() {
        if (this.subjectTarget == null)
            this.subjectTarget = new ArrayList<Resource>();
        return this.subjectTarget;
    }

    /**
     * @return {@link #authority} (A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.)
     */
    public List<Reference> getAuthority() {
        if (this.authority == null)
            this.authority = new ArrayList<Reference>();
        return this.authority;
    }

    public boolean hasAuthority() {
        if (this.authority == null)
            return false;
        for (Reference item : this.authority) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #authority} (A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.)
     */
    // syntactic sugar
    public Reference addAuthority() {
        // 3
        Reference t = new Reference();
        if (this.authority == null)
            this.authority = new ArrayList<Reference>();
        this.authority.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addAuthority(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.authority == null)
            this.authority = new ArrayList<Reference>();
        this.authority.add(t);
        return this;
    }

    /**
     * @return {@link #authority} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.)
     */
    public List<Organization> getAuthorityTarget() {
        if (this.authorityTarget == null)
            this.authorityTarget = new ArrayList<Organization>();
        return this.authorityTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #authority} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.)
     */
    public Organization addAuthorityTarget() {
        Organization r = new Organization();
        if (this.authorityTarget == null)
            this.authorityTarget = new ArrayList<Organization>();
        this.authorityTarget.add(r);
        return r;
    }

    /**
     * @return {@link #domain} (Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.)
     */
    public List<Reference> getDomain() {
        if (this.domain == null)
            this.domain = new ArrayList<Reference>();
        return this.domain;
    }

    public boolean hasDomain() {
        if (this.domain == null)
            return false;
        for (Reference item : this.domain) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #domain} (Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.)
     */
    // syntactic sugar
    public Reference addDomain() {
        // 3
        Reference t = new Reference();
        if (this.domain == null)
            this.domain = new ArrayList<Reference>();
        this.domain.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addDomain(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.domain == null)
            this.domain = new ArrayList<Reference>();
        this.domain.add(t);
        return this;
    }

    /**
     * @return {@link #domain} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.)
     */
    public List<Location> getDomainTarget() {
        if (this.domainTarget == null)
            this.domainTarget = new ArrayList<Location>();
        return this.domainTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #domain} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.)
     */
    public Location addDomainTarget() {
        Location r = new Location();
        if (this.domainTarget == null)
            this.domainTarget = new ArrayList<Location>();
        this.domainTarget.add(r);
        return r;
    }

    /**
     * @return {@link #type} (Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Contract.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc.)
     */
    public Contract setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #subType} (More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.)
     */
    public List<CodeableConcept> getSubType() {
        if (this.subType == null)
            this.subType = new ArrayList<CodeableConcept>();
        return this.subType;
    }

    public boolean hasSubType() {
        if (this.subType == null)
            return false;
        for (CodeableConcept item : this.subType) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #subType} (More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.)
     */
    // syntactic sugar
    public CodeableConcept addSubType() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.subType == null)
            this.subType = new ArrayList<CodeableConcept>();
        this.subType.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addSubType(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.subType == null)
            this.subType = new ArrayList<CodeableConcept>();
        this.subType.add(t);
        return this;
    }

    /**
     * @return {@link #action} (Action stipulated by this Contract.)
     */
    public List<CodeableConcept> getAction() {
        if (this.action == null)
            this.action = new ArrayList<CodeableConcept>();
        return this.action;
    }

    public boolean hasAction() {
        if (this.action == null)
            return false;
        for (CodeableConcept item : this.action) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #action} (Action stipulated by this Contract.)
     */
    // syntactic sugar
    public CodeableConcept addAction() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.action == null)
            this.action = new ArrayList<CodeableConcept>();
        this.action.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addAction(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.action == null)
            this.action = new ArrayList<CodeableConcept>();
        this.action.add(t);
        return this;
    }

    /**
     * @return {@link #actionReason} (Reason for action stipulated by this Contract.)
     */
    public List<CodeableConcept> getActionReason() {
        if (this.actionReason == null)
            this.actionReason = new ArrayList<CodeableConcept>();
        return this.actionReason;
    }

    public boolean hasActionReason() {
        if (this.actionReason == null)
            return false;
        for (CodeableConcept item : this.actionReason) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #actionReason} (Reason for action stipulated by this Contract.)
     */
    // syntactic sugar
    public CodeableConcept addActionReason() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.actionReason == null)
            this.actionReason = new ArrayList<CodeableConcept>();
        this.actionReason.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addActionReason(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.actionReason == null)
            this.actionReason = new ArrayList<CodeableConcept>();
        this.actionReason.add(t);
        return this;
    }

    /**
     * @return {@link #actor} (List of Contract actors.)
     */
    public List<ActorComponent> getActor() {
        if (this.actor == null)
            this.actor = new ArrayList<ActorComponent>();
        return this.actor;
    }

    public boolean hasActor() {
        if (this.actor == null)
            return false;
        for (ActorComponent item : this.actor) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #actor} (List of Contract actors.)
     */
    // syntactic sugar
    public ActorComponent addActor() {
        // 3
        ActorComponent t = new ActorComponent();
        if (this.actor == null)
            this.actor = new ArrayList<ActorComponent>();
        this.actor.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addActor(ActorComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.actor == null)
            this.actor = new ArrayList<ActorComponent>();
        this.actor.add(t);
        return this;
    }

    /**
     * @return {@link #valuedItem} (Contract Valued Item List.)
     */
    public List<ValuedItemComponent> getValuedItem() {
        if (this.valuedItem == null)
            this.valuedItem = new ArrayList<ValuedItemComponent>();
        return this.valuedItem;
    }

    public boolean hasValuedItem() {
        if (this.valuedItem == null)
            return false;
        for (ValuedItemComponent item : this.valuedItem) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #valuedItem} (Contract Valued Item List.)
     */
    // syntactic sugar
    public ValuedItemComponent addValuedItem() {
        // 3
        ValuedItemComponent t = new ValuedItemComponent();
        if (this.valuedItem == null)
            this.valuedItem = new ArrayList<ValuedItemComponent>();
        this.valuedItem.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addValuedItem(ValuedItemComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.valuedItem == null)
            this.valuedItem = new ArrayList<ValuedItemComponent>();
        this.valuedItem.add(t);
        return this;
    }

    /**
     * @return {@link #signer} (Party signing this Contract.)
     */
    public List<SignatoryComponent> getSigner() {
        if (this.signer == null)
            this.signer = new ArrayList<SignatoryComponent>();
        return this.signer;
    }

    public boolean hasSigner() {
        if (this.signer == null)
            return false;
        for (SignatoryComponent item : this.signer) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #signer} (Party signing this Contract.)
     */
    // syntactic sugar
    public SignatoryComponent addSigner() {
        // 3
        SignatoryComponent t = new SignatoryComponent();
        if (this.signer == null)
            this.signer = new ArrayList<SignatoryComponent>();
        this.signer.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addSigner(SignatoryComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.signer == null)
            this.signer = new ArrayList<SignatoryComponent>();
        this.signer.add(t);
        return this;
    }

    /**
     * @return {@link #term} (One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.)
     */
    public List<TermComponent> getTerm() {
        if (this.term == null)
            this.term = new ArrayList<TermComponent>();
        return this.term;
    }

    public boolean hasTerm() {
        if (this.term == null)
            return false;
        for (TermComponent item : this.term) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #term} (One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.)
     */
    // syntactic sugar
    public TermComponent addTerm() {
        // 3
        TermComponent t = new TermComponent();
        if (this.term == null)
            this.term = new ArrayList<TermComponent>();
        this.term.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addTerm(TermComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.term == null)
            this.term = new ArrayList<TermComponent>();
        this.term.add(t);
        return this;
    }

    /**
     * @return {@link #binding} (Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.)
     */
    public Type getBinding() {
        return this.binding;
    }

    /**
     * @return {@link #binding} (Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.)
     */
    public Attachment getBindingAttachment() throws FHIRException {
        if (!(this.binding instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but " + this.binding.getClass().getName() + " was encountered");
        return (Attachment) this.binding;
    }

    public boolean hasBindingAttachment() {
        return this.binding instanceof Attachment;
    }

    /**
     * @return {@link #binding} (Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.)
     */
    public Reference getBindingReference() throws FHIRException {
        if (!(this.binding instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.binding.getClass().getName() + " was encountered");
        return (Reference) this.binding;
    }

    public boolean hasBindingReference() {
        return this.binding instanceof Reference;
    }

    public boolean hasBinding() {
        return this.binding != null && !this.binding.isEmpty();
    }

    /**
     * @param value {@link #binding} (Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.)
     */
    public Contract setBinding(Type value) {
        this.binding = value;
        return this;
    }

    /**
     * @return {@link #friendly} (The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.)
     */
    public List<FriendlyLanguageComponent> getFriendly() {
        if (this.friendly == null)
            this.friendly = new ArrayList<FriendlyLanguageComponent>();
        return this.friendly;
    }

    public boolean hasFriendly() {
        if (this.friendly == null)
            return false;
        for (FriendlyLanguageComponent item : this.friendly) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #friendly} (The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.)
     */
    // syntactic sugar
    public FriendlyLanguageComponent addFriendly() {
        // 3
        FriendlyLanguageComponent t = new FriendlyLanguageComponent();
        if (this.friendly == null)
            this.friendly = new ArrayList<FriendlyLanguageComponent>();
        this.friendly.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addFriendly(FriendlyLanguageComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.friendly == null)
            this.friendly = new ArrayList<FriendlyLanguageComponent>();
        this.friendly.add(t);
        return this;
    }

    /**
     * @return {@link #legal} (List of Legal expressions or representations of this Contract.)
     */
    public List<LegalLanguageComponent> getLegal() {
        if (this.legal == null)
            this.legal = new ArrayList<LegalLanguageComponent>();
        return this.legal;
    }

    public boolean hasLegal() {
        if (this.legal == null)
            return false;
        for (LegalLanguageComponent item : this.legal) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #legal} (List of Legal expressions or representations of this Contract.)
     */
    // syntactic sugar
    public LegalLanguageComponent addLegal() {
        // 3
        LegalLanguageComponent t = new LegalLanguageComponent();
        if (this.legal == null)
            this.legal = new ArrayList<LegalLanguageComponent>();
        this.legal.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addLegal(LegalLanguageComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.legal == null)
            this.legal = new ArrayList<LegalLanguageComponent>();
        this.legal.add(t);
        return this;
    }

    /**
     * @return {@link #rule} (List of Computable Policy Rule Language Representations of this Contract.)
     */
    public List<ComputableLanguageComponent> getRule() {
        if (this.rule == null)
            this.rule = new ArrayList<ComputableLanguageComponent>();
        return this.rule;
    }

    public boolean hasRule() {
        if (this.rule == null)
            return false;
        for (ComputableLanguageComponent item : this.rule) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #rule} (List of Computable Policy Rule Language Representations of this Contract.)
     */
    // syntactic sugar
    public ComputableLanguageComponent addRule() {
        // 3
        ComputableLanguageComponent t = new ComputableLanguageComponent();
        if (this.rule == null)
            this.rule = new ArrayList<ComputableLanguageComponent>();
        this.rule.add(t);
        return t;
    }

    // syntactic sugar
    public Contract addRule(ComputableLanguageComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.rule == null)
            this.rule = new ArrayList<ComputableLanguageComponent>();
        this.rule.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Unique identifier for this Contract.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("issued", "dateTime", "When this  Contract was issued.", 0, java.lang.Integer.MAX_VALUE, issued));
        childrenList.add(new Property("applies", "Period", "Relevant time or time-period when this Contract is applicable.", 0, java.lang.Integer.MAX_VALUE, applies));
        childrenList.add(new Property("subject", "Reference(Any)", "Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("authority", "Reference(Organization)", "A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.", 0, java.lang.Integer.MAX_VALUE, authority));
        childrenList.add(new Property("domain", "Reference(Location)", "Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.", 0, java.lang.Integer.MAX_VALUE, domain));
        childrenList.add(new Property("type", "CodeableConcept", "Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("subType", "CodeableConcept", "More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.", 0, java.lang.Integer.MAX_VALUE, subType));
        childrenList.add(new Property("action", "CodeableConcept", "Action stipulated by this Contract.", 0, java.lang.Integer.MAX_VALUE, action));
        childrenList.add(new Property("actionReason", "CodeableConcept", "Reason for action stipulated by this Contract.", 0, java.lang.Integer.MAX_VALUE, actionReason));
        childrenList.add(new Property("actor", "", "List of Contract actors.", 0, java.lang.Integer.MAX_VALUE, actor));
        childrenList.add(new Property("valuedItem", "", "Contract Valued Item List.", 0, java.lang.Integer.MAX_VALUE, valuedItem));
        childrenList.add(new Property("signer", "", "Party signing this Contract.", 0, java.lang.Integer.MAX_VALUE, signer));
        childrenList.add(new Property("term", "", "One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.", 0, java.lang.Integer.MAX_VALUE, term));
        childrenList.add(new Property("binding[x]", "Attachment|Reference(Composition|DocumentReference|QuestionnaireResponse)", "Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the \"source of truth\" and which would be the basis for legal action related to enforcement of this Contract.", 0, java.lang.Integer.MAX_VALUE, binding));
        childrenList.add(new Property("friendly", "", "The \"patient friendly language\" versionof the Contract in whole or in parts. \"Patient friendly language\" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.", 0, java.lang.Integer.MAX_VALUE, friendly));
        childrenList.add(new Property("legal", "", "List of Legal expressions or representations of this Contract.", 0, java.lang.Integer.MAX_VALUE, legal));
        childrenList.add(new Property("rule", "", "List of Computable Policy Rule Language Representations of this Contract.", 0, java.lang.Integer.MAX_VALUE, rule));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("issued"))
            // DateTimeType
            this.issued = castToDateTime(value);
        else if (name.equals("applies"))
            // Period
            this.applies = castToPeriod(value);
        else if (name.equals("subject"))
            this.getSubject().add(castToReference(value));
        else if (name.equals("authority"))
            this.getAuthority().add(castToReference(value));
        else if (name.equals("domain"))
            this.getDomain().add(castToReference(value));
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("subType"))
            this.getSubType().add(castToCodeableConcept(value));
        else if (name.equals("action"))
            this.getAction().add(castToCodeableConcept(value));
        else if (name.equals("actionReason"))
            this.getActionReason().add(castToCodeableConcept(value));
        else if (name.equals("actor"))
            this.getActor().add((ActorComponent) value);
        else if (name.equals("valuedItem"))
            this.getValuedItem().add((ValuedItemComponent) value);
        else if (name.equals("signer"))
            this.getSigner().add((SignatoryComponent) value);
        else if (name.equals("term"))
            this.getTerm().add((TermComponent) value);
        else if (name.equals("binding[x]"))
            // Type
            this.binding = (Type) value;
        else if (name.equals("friendly"))
            this.getFriendly().add((FriendlyLanguageComponent) value);
        else if (name.equals("legal"))
            this.getLegal().add((LegalLanguageComponent) value);
        else if (name.equals("rule"))
            this.getRule().add((ComputableLanguageComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("issued")) {
            throw new FHIRException("Cannot call addChild on a primitive type Contract.issued");
        } else if (name.equals("applies")) {
            this.applies = new Period();
            return this.applies;
        } else if (name.equals("subject")) {
            return addSubject();
        } else if (name.equals("authority")) {
            return addAuthority();
        } else if (name.equals("domain")) {
            return addDomain();
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("subType")) {
            return addSubType();
        } else if (name.equals("action")) {
            return addAction();
        } else if (name.equals("actionReason")) {
            return addActionReason();
        } else if (name.equals("actor")) {
            return addActor();
        } else if (name.equals("valuedItem")) {
            return addValuedItem();
        } else if (name.equals("signer")) {
            return addSigner();
        } else if (name.equals("term")) {
            return addTerm();
        } else if (name.equals("bindingAttachment")) {
            this.binding = new Attachment();
            return this.binding;
        } else if (name.equals("bindingReference")) {
            this.binding = new Reference();
            return this.binding;
        } else if (name.equals("friendly")) {
            return addFriendly();
        } else if (name.equals("legal")) {
            return addLegal();
        } else if (name.equals("rule")) {
            return addRule();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Contract";
    }

    public Contract copy() {
        Contract dst = new Contract();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.issued = issued == null ? null : issued.copy();
        dst.applies = applies == null ? null : applies.copy();
        if (subject != null) {
            dst.subject = new ArrayList<Reference>();
            for (Reference i : subject) dst.subject.add(i.copy());
        }
        ;
        if (authority != null) {
            dst.authority = new ArrayList<Reference>();
            for (Reference i : authority) dst.authority.add(i.copy());
        }
        ;
        if (domain != null) {
            dst.domain = new ArrayList<Reference>();
            for (Reference i : domain) dst.domain.add(i.copy());
        }
        ;
        dst.type = type == null ? null : type.copy();
        if (subType != null) {
            dst.subType = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : subType) dst.subType.add(i.copy());
        }
        ;
        if (action != null) {
            dst.action = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : action) dst.action.add(i.copy());
        }
        ;
        if (actionReason != null) {
            dst.actionReason = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : actionReason) dst.actionReason.add(i.copy());
        }
        ;
        if (actor != null) {
            dst.actor = new ArrayList<ActorComponent>();
            for (ActorComponent i : actor) dst.actor.add(i.copy());
        }
        ;
        if (valuedItem != null) {
            dst.valuedItem = new ArrayList<ValuedItemComponent>();
            for (ValuedItemComponent i : valuedItem) dst.valuedItem.add(i.copy());
        }
        ;
        if (signer != null) {
            dst.signer = new ArrayList<SignatoryComponent>();
            for (SignatoryComponent i : signer) dst.signer.add(i.copy());
        }
        ;
        if (term != null) {
            dst.term = new ArrayList<TermComponent>();
            for (TermComponent i : term) dst.term.add(i.copy());
        }
        ;
        dst.binding = binding == null ? null : binding.copy();
        if (friendly != null) {
            dst.friendly = new ArrayList<FriendlyLanguageComponent>();
            for (FriendlyLanguageComponent i : friendly) dst.friendly.add(i.copy());
        }
        ;
        if (legal != null) {
            dst.legal = new ArrayList<LegalLanguageComponent>();
            for (LegalLanguageComponent i : legal) dst.legal.add(i.copy());
        }
        ;
        if (rule != null) {
            dst.rule = new ArrayList<ComputableLanguageComponent>();
            for (ComputableLanguageComponent i : rule) dst.rule.add(i.copy());
        }
        ;
        return dst;
    }

    protected Contract typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Contract))
            return false;
        Contract o = (Contract) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(issued, o.issued, true) && compareDeep(applies, o.applies, true) && compareDeep(subject, o.subject, true) && compareDeep(authority, o.authority, true) && compareDeep(domain, o.domain, true) && compareDeep(type, o.type, true) && compareDeep(subType, o.subType, true) && compareDeep(action, o.action, true) && compareDeep(actionReason, o.actionReason, true) && compareDeep(actor, o.actor, true) && compareDeep(valuedItem, o.valuedItem, true) && compareDeep(signer, o.signer, true) && compareDeep(term, o.term, true) && compareDeep(binding, o.binding, true) && compareDeep(friendly, o.friendly, true) && compareDeep(legal, o.legal, true) && compareDeep(rule, o.rule, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Contract))
            return false;
        Contract o = (Contract) other;
        return compareValues(issued, o.issued, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (issued == null || issued.isEmpty()) && (applies == null || applies.isEmpty()) && (subject == null || subject.isEmpty()) && (authority == null || authority.isEmpty()) && (domain == null || domain.isEmpty()) && (type == null || type.isEmpty()) && (subType == null || subType.isEmpty()) && (action == null || action.isEmpty()) && (actionReason == null || actionReason.isEmpty()) && (actor == null || actor.isEmpty()) && (valuedItem == null || valuedItem.isEmpty()) && (signer == null || signer.isEmpty()) && (term == null || term.isEmpty()) && (binding == null || binding.isEmpty()) && (friendly == null || friendly.isEmpty()) && (legal == null || legal.isEmpty()) && (rule == null || rule.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Contract;
    }

    public static final String SP_ACTOR = "actor";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_PATIENT = "patient";

    public static final String SP_SIGNER = "signer";
}
