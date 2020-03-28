package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AccountEnum.AccountStatus;
import org.hl7.fhir.android.generated.dstu2.AccountEnum.AccountStatusEnumFactory;

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
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centres, etc.
 */
public class Account extends DomainResource {

    /**
     * Unique identifier used to reference the account.  May or may not be intended for human use (e.g. credit card number).
     */
    protected List<Identifier> identifier;

    /**
     * Name used for the account when displaying it to humans in reports, etc.
     */
    protected StringType name;

    /**
     * Categorizes the account for reporting and searching purposes.
     */
    protected CodeableConcept type;

    /**
     * Indicates whether the account is presently used/useable or not.
     */
    protected Enumeration<AccountStatus> status;

    /**
     * Indicates the period of time over which the account is allowed.
     */
    protected Period activePeriod;

    /**
     * Identifies the currency to which transactions must be converted when crediting or debiting the account.
     */
    protected Coding currency;

    /**
     * Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative.
     */
    protected Money balance;

    /**
     * Identifies the period of time the account applies to; e.g. accounts created per fiscal year, quarter, etc.
     */
    protected Period coveragePeriod;

    /**
     * Identifies the patient, device, practitioner, location or other object the account is associated with.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Identifies the patient, device, practitioner, location or other object the account is associated with.)
     */
    protected Resource subjectTarget;

    /**
     * Indicates the organization, department, etc. with responsibility for the account.
     */
    protected Reference owner;

    /**
     * The actual object that is the target of the reference (Indicates the organization, department, etc. with responsibility for the account.)
     */
    protected Organization ownerTarget;

    /**
     * Provides additional information about what the account tracks and how it is used.
     */
    protected StringType description;

    private static final long serialVersionUID = -1926153194L;

    /*
   * Constructor
   */
    public Account() {
        super();
    }

    /**
     * @return {@link #identifier} (Unique identifier used to reference the account.  May or may not be intended for human use (e.g. credit card number).)
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
     * @return {@link #identifier} (Unique identifier used to reference the account.  May or may not be intended for human use (e.g. credit card number).)
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
    public Account addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #name} (Name used for the account when displaying it to humans in reports, etc.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.name");
            else if (Configuration.doAutoCreate())
                // bb
                this.name = new StringType();
        return this.name;
    }

    public boolean hasNameElement() {
        return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (Name used for the account when displaying it to humans in reports, etc.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public Account setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return Name used for the account when displaying it to humans in reports, etc.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Name used for the account when displaying it to humans in reports, etc.
     */
    public Account setName(String value) {
        if (Utilities.noString(value))
            this.name = null;
        else {
            if (this.name == null)
                this.name = new StringType();
            this.name.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (Categorizes the account for reporting and searching purposes.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Categorizes the account for reporting and searching purposes.)
     */
    public Account setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #status} (Indicates whether the account is presently used/useable or not.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<AccountStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<AccountStatus>(new AccountStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Indicates whether the account is presently used/useable or not.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Account setStatusElement(Enumeration<AccountStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Indicates whether the account is presently used/useable or not.
     */
    public AccountStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Indicates whether the account is presently used/useable or not.
     */
    public Account setStatus(AccountStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<AccountStatus>(new AccountStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #activePeriod} (Indicates the period of time over which the account is allowed.)
     */
    public Period getActivePeriod() {
        if (this.activePeriod == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.activePeriod");
            else if (Configuration.doAutoCreate())
                // cc
                this.activePeriod = new Period();
        return this.activePeriod;
    }

    public boolean hasActivePeriod() {
        return this.activePeriod != null && !this.activePeriod.isEmpty();
    }

    /**
     * @param value {@link #activePeriod} (Indicates the period of time over which the account is allowed.)
     */
    public Account setActivePeriod(Period value) {
        this.activePeriod = value;
        return this;
    }

    /**
     * @return {@link #currency} (Identifies the currency to which transactions must be converted when crediting or debiting the account.)
     */
    public Coding getCurrency() {
        if (this.currency == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.currency");
            else if (Configuration.doAutoCreate())
                // cc
                this.currency = new Coding();
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null && !this.currency.isEmpty();
    }

    /**
     * @param value {@link #currency} (Identifies the currency to which transactions must be converted when crediting or debiting the account.)
     */
    public Account setCurrency(Coding value) {
        this.currency = value;
        return this;
    }

    /**
     * @return {@link #balance} (Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative.)
     */
    public Money getBalance() {
        if (this.balance == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.balance");
            else if (Configuration.doAutoCreate())
                // cc
                this.balance = new Money();
        return this.balance;
    }

    public boolean hasBalance() {
        return this.balance != null && !this.balance.isEmpty();
    }

    /**
     * @param value {@link #balance} (Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative.)
     */
    public Account setBalance(Money value) {
        this.balance = value;
        return this;
    }

    /**
     * @return {@link #coveragePeriod} (Identifies the period of time the account applies to; e.g. accounts created per fiscal year, quarter, etc.)
     */
    public Period getCoveragePeriod() {
        if (this.coveragePeriod == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.coveragePeriod");
            else if (Configuration.doAutoCreate())
                // cc
                this.coveragePeriod = new Period();
        return this.coveragePeriod;
    }

    public boolean hasCoveragePeriod() {
        return this.coveragePeriod != null && !this.coveragePeriod.isEmpty();
    }

    /**
     * @param value {@link #coveragePeriod} (Identifies the period of time the account applies to; e.g. accounts created per fiscal year, quarter, etc.)
     */
    public Account setCoveragePeriod(Period value) {
        this.coveragePeriod = value;
        return this;
    }

    /**
     * @return {@link #subject} (Identifies the patient, device, practitioner, location or other object the account is associated with.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Identifies the patient, device, practitioner, location or other object the account is associated with.)
     */
    public Account setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies the patient, device, practitioner, location or other object the account is associated with.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies the patient, device, practitioner, location or other object the account is associated with.)
     */
    public Account setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #owner} (Indicates the organization, department, etc. with responsibility for the account.)
     */
    public Reference getOwner() {
        if (this.owner == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.owner");
            else if (Configuration.doAutoCreate())
                // cc
                this.owner = new Reference();
        return this.owner;
    }

    public boolean hasOwner() {
        return this.owner != null && !this.owner.isEmpty();
    }

    /**
     * @param value {@link #owner} (Indicates the organization, department, etc. with responsibility for the account.)
     */
    public Account setOwner(Reference value) {
        this.owner = value;
        return this;
    }

    /**
     * @return {@link #owner} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Indicates the organization, department, etc. with responsibility for the account.)
     */
    public Organization getOwnerTarget() {
        if (this.ownerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.owner");
            else if (Configuration.doAutoCreate())
                // aa
                this.ownerTarget = new Organization();
        return this.ownerTarget;
    }

    /**
     * @param value {@link #owner} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Indicates the organization, department, etc. with responsibility for the account.)
     */
    public Account setOwnerTarget(Organization value) {
        this.ownerTarget = value;
        return this;
    }

    /**
     * @return {@link #description} (Provides additional information about what the account tracks and how it is used.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Account.description");
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
     * @param value {@link #description} (Provides additional information about what the account tracks and how it is used.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Account setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Provides additional information about what the account tracks and how it is used.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Provides additional information about what the account tracks and how it is used.
     */
    public Account setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Unique identifier used to reference the account.  May or may not be intended for human use (e.g. credit card number).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("name", "string", "Name used for the account when displaying it to humans in reports, etc.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("type", "CodeableConcept", "Categorizes the account for reporting and searching purposes.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("status", "code", "Indicates whether the account is presently used/useable or not.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("activePeriod", "Period", "Indicates the period of time over which the account is allowed.", 0, java.lang.Integer.MAX_VALUE, activePeriod));
        childrenList.add(new Property("currency", "Coding", "Identifies the currency to which transactions must be converted when crediting or debiting the account.", 0, java.lang.Integer.MAX_VALUE, currency));
        childrenList.add(new Property("balance", "Money", "Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative.", 0, java.lang.Integer.MAX_VALUE, balance));
        childrenList.add(new Property("coveragePeriod", "Period", "Identifies the period of time the account applies to; e.g. accounts created per fiscal year, quarter, etc.", 0, java.lang.Integer.MAX_VALUE, coveragePeriod));
        childrenList.add(new Property("subject", "Reference(Patient|Device|Practitioner|Location|HealthcareService|Organization)", "Identifies the patient, device, practitioner, location or other object the account is associated with.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("owner", "Reference(Organization)", "Indicates the organization, department, etc. with responsibility for the account.", 0, java.lang.Integer.MAX_VALUE, owner));
        childrenList.add(new Property("description", "string", "Provides additional information about what the account tracks and how it is used.", 0, java.lang.Integer.MAX_VALUE, description));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("status"))
            // Enumeration<AccountStatus>
            this.status = new AccountStatusEnumFactory().fromType(value);
        else if (name.equals("activePeriod"))
            // Period
            this.activePeriod = castToPeriod(value);
        else if (name.equals("currency"))
            // Coding
            this.currency = castToCoding(value);
        else if (name.equals("balance"))
            // Money
            this.balance = castToMoney(value);
        else if (name.equals("coveragePeriod"))
            // Period
            this.coveragePeriod = castToPeriod(value);
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("owner"))
            // Reference
            this.owner = castToReference(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type Account.name");
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Account.status");
        } else if (name.equals("activePeriod")) {
            this.activePeriod = new Period();
            return this.activePeriod;
        } else if (name.equals("currency")) {
            this.currency = new Coding();
            return this.currency;
        } else if (name.equals("balance")) {
            this.balance = new Money();
            return this.balance;
        } else if (name.equals("coveragePeriod")) {
            this.coveragePeriod = new Period();
            return this.coveragePeriod;
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("owner")) {
            this.owner = new Reference();
            return this.owner;
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type Account.description");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Account";
    }

    public Account copy() {
        Account dst = new Account();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.name = name == null ? null : name.copy();
        dst.type = type == null ? null : type.copy();
        dst.status = status == null ? null : status.copy();
        dst.activePeriod = activePeriod == null ? null : activePeriod.copy();
        dst.currency = currency == null ? null : currency.copy();
        dst.balance = balance == null ? null : balance.copy();
        dst.coveragePeriod = coveragePeriod == null ? null : coveragePeriod.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.owner = owner == null ? null : owner.copy();
        dst.description = description == null ? null : description.copy();
        return dst;
    }

    protected Account typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Account))
            return false;
        Account o = (Account) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(name, o.name, true) && compareDeep(type, o.type, true) && compareDeep(status, o.status, true) && compareDeep(activePeriod, o.activePeriod, true) && compareDeep(currency, o.currency, true) && compareDeep(balance, o.balance, true) && compareDeep(coveragePeriod, o.coveragePeriod, true) && compareDeep(subject, o.subject, true) && compareDeep(owner, o.owner, true) && compareDeep(description, o.description, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Account))
            return false;
        Account o = (Account) other;
        return compareValues(name, o.name, true) && compareValues(status, o.status, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (name == null || name.isEmpty()) && (type == null || type.isEmpty()) && (status == null || status.isEmpty()) && (activePeriod == null || activePeriod.isEmpty()) && (currency == null || currency.isEmpty()) && (balance == null || balance.isEmpty()) && (coveragePeriod == null || coveragePeriod.isEmpty()) && (subject == null || subject.isEmpty()) && (owner == null || owner.isEmpty()) && (description == null || description.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Account;
    }

    public static final String SP_OWNER = "owner";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PERIOD = "period";

    public static final String SP_BALANCE = "balance";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_PATIENT = "patient";

    public static final String SP_NAME = "name";

    public static final String SP_TYPE = "type";

    public static final String SP_STATUS = "status";
}
