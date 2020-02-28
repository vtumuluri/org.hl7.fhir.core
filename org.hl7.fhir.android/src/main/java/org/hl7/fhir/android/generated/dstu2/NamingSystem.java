package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemIdentifierType;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemIdentifierTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemType;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemTypeEnumFactory;

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
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 */
public class NamingSystem extends DomainResource {

    /**
     * The descriptive name of this particular identifier type or code system.
     */
    protected StringType name;

    /**
     * Indicates whether the naming system is "ready for use" or not.
     */
    protected Enumeration<ConformanceResourceStatus> status;

    /**
     * Indicates the purpose for the naming system - what kinds of things does it make unique?
     */
    protected Enumeration<NamingSystemType> kind;

    /**
     * The name of the individual or organization that published the naming system.
     */
    protected StringType publisher;

    /**
     * Contacts to assist a user in finding and communicating with the publisher.
     */
    protected List<NamingSystemContactComponent> contact;

    /**
     * The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their non-collision.
     */
    protected StringType responsible;

    /**
     * The date  (and optionally time) when the system was registered or published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the registration changes.
     */
    protected DateTimeType date;

    /**
     * Categorizes a naming system for easier search by grouping related naming systems.
     */
    protected CodeableConcept type;

    /**
     * Details about what the namespace identifies including scope, granularity, version labeling, etc.
     */
    protected StringType description;

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of naming systems.
     */
    protected List<CodeableConcept> useContext;

    /**
     * Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower case, etc.
     */
    protected StringType usage;

    /**
     * Indicates how the system may be identified when referenced in electronic exchange.
     */
    protected List<NamingSystemUniqueIdComponent> uniqueId;

    /**
     * For naming systems that are retired, indicates the naming system that should be used in their place (if any).
     */
    protected Reference replacedBy;

    /**
     * The actual object that is the target of the reference (For naming systems that are retired, indicates the naming system that should be used in their place (if any).)
     */
    protected NamingSystem replacedByTarget;

    private static final long serialVersionUID = -1337110053L;

    /*
   * Constructor
   */
    public NamingSystem() {
        super();
    }

    /*
   * Constructor
   */
    public NamingSystem(StringType name, Enumeration<ConformanceResourceStatus> status, Enumeration<NamingSystemType> kind, DateTimeType date) {
        super();
        this.name = name;
        this.status = status;
        this.kind = kind;
        this.date = date;
    }

    /**
     * @return {@link #name} (The descriptive name of this particular identifier type or code system.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.name");
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
     * @param value {@link #name} (The descriptive name of this particular identifier type or code system.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public NamingSystem setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return The descriptive name of this particular identifier type or code system.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The descriptive name of this particular identifier type or code system.
     */
    public NamingSystem setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #status} (Indicates whether the naming system is "ready for use" or not.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ConformanceResourceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Indicates whether the naming system is "ready for use" or not.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public NamingSystem setStatusElement(Enumeration<ConformanceResourceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Indicates whether the naming system is "ready for use" or not.
     */
    public ConformanceResourceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Indicates whether the naming system is "ready for use" or not.
     */
    public NamingSystem setStatus(ConformanceResourceStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #kind} (Indicates the purpose for the naming system - what kinds of things does it make unique?). This is the underlying object with id, value and extensions. The accessor "getKind" gives direct access to the value
     */
    public Enumeration<NamingSystemType> getKindElement() {
        if (this.kind == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.kind");
            else if (Configuration.doAutoCreate())
                // bb
                this.kind = new Enumeration<NamingSystemType>(new NamingSystemTypeEnumFactory());
        return this.kind;
    }

    public boolean hasKindElement() {
        return this.kind != null && !this.kind.isEmpty();
    }

    public boolean hasKind() {
        return this.kind != null && !this.kind.isEmpty();
    }

    /**
     * @param value {@link #kind} (Indicates the purpose for the naming system - what kinds of things does it make unique?). This is the underlying object with id, value and extensions. The accessor "getKind" gives direct access to the value
     */
    public NamingSystem setKindElement(Enumeration<NamingSystemType> value) {
        this.kind = value;
        return this;
    }

    /**
     * @return Indicates the purpose for the naming system - what kinds of things does it make unique?
     */
    public NamingSystemType getKind() {
        return this.kind == null ? null : this.kind.getValue();
    }

    /**
     * @param value Indicates the purpose for the naming system - what kinds of things does it make unique?
     */
    public NamingSystem setKind(NamingSystemType value) {
        if (this.kind == null)
            this.kind = new Enumeration<NamingSystemType>(new NamingSystemTypeEnumFactory());
        this.kind.setValue(value);
        return this;
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the naming system.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() {
        if (this.publisher == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.publisher");
            else if (Configuration.doAutoCreate())
                // bb
                this.publisher = new StringType();
        return this.publisher;
    }

    public boolean hasPublisherElement() {
        return this.publisher != null && !this.publisher.isEmpty();
    }

    public boolean hasPublisher() {
        return this.publisher != null && !this.publisher.isEmpty();
    }

    /**
     * @param value {@link #publisher} (The name of the individual or organization that published the naming system.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public NamingSystem setPublisherElement(StringType value) {
        this.publisher = value;
        return this;
    }

    /**
     * @return The name of the individual or organization that published the naming system.
     */
    public String getPublisher() {
        return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the naming system.
     */
    public NamingSystem setPublisher(String value) {
        if (Utilities.noString(value))
            this.publisher = null;
        else {
            if (this.publisher == null)
                this.publisher = new StringType();
            this.publisher.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    public List<NamingSystemContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<NamingSystemContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (NamingSystemContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public NamingSystemContactComponent addContact() {
        // 3
        NamingSystemContactComponent t = new NamingSystemContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<NamingSystemContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public NamingSystem addContact(NamingSystemContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<NamingSystemContactComponent>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #responsible} (The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their non-collision.). This is the underlying object with id, value and extensions. The accessor "getResponsible" gives direct access to the value
     */
    public StringType getResponsibleElement() {
        if (this.responsible == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.responsible");
            else if (Configuration.doAutoCreate())
                // bb
                this.responsible = new StringType();
        return this.responsible;
    }

    public boolean hasResponsibleElement() {
        return this.responsible != null && !this.responsible.isEmpty();
    }

    public boolean hasResponsible() {
        return this.responsible != null && !this.responsible.isEmpty();
    }

    /**
     * @param value {@link #responsible} (The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their non-collision.). This is the underlying object with id, value and extensions. The accessor "getResponsible" gives direct access to the value
     */
    public NamingSystem setResponsibleElement(StringType value) {
        this.responsible = value;
        return this;
    }

    /**
     * @return The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their non-collision.
     */
    public String getResponsible() {
        return this.responsible == null ? null : this.responsible.getValue();
    }

    /**
     * @param value The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their non-collision.
     */
    public NamingSystem setResponsible(String value) {
        if (Utilities.noString(value))
            this.responsible = null;
        else {
            if (this.responsible == null)
                this.responsible = new StringType();
            this.responsible.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #date} (The date  (and optionally time) when the system was registered or published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the registration changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.date");
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
     * @param value {@link #date} (The date  (and optionally time) when the system was registered or published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the registration changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public NamingSystem setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date  (and optionally time) when the system was registered or published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the registration changes.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date  (and optionally time) when the system was registered or published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the registration changes.
     */
    public NamingSystem setDate(Date value) {
        if (this.date == null)
            this.date = new DateTimeType();
        this.date.setValue(value);
        return this;
    }

    /**
     * @return {@link #type} (Categorizes a naming system for easier search by grouping related naming systems.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Categorizes a naming system for easier search by grouping related naming systems.)
     */
    public NamingSystem setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #description} (Details about what the namespace identifies including scope, granularity, version labeling, etc.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.description");
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
     * @param value {@link #description} (Details about what the namespace identifies including scope, granularity, version labeling, etc.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public NamingSystem setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Details about what the namespace identifies including scope, granularity, version labeling, etc.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Details about what the namespace identifies including scope, granularity, version labeling, etc.
     */
    public NamingSystem setDescription(String value) {
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of naming systems.)
     */
    public List<CodeableConcept> getUseContext() {
        if (this.useContext == null)
            this.useContext = new ArrayList<CodeableConcept>();
        return this.useContext;
    }

    public boolean hasUseContext() {
        if (this.useContext == null)
            return false;
        for (CodeableConcept item : this.useContext) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of naming systems.)
     */
    // syntactic sugar
    public CodeableConcept addUseContext() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.useContext == null)
            this.useContext = new ArrayList<CodeableConcept>();
        this.useContext.add(t);
        return t;
    }

    // syntactic sugar
    public NamingSystem addUseContext(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.useContext == null)
            this.useContext = new ArrayList<CodeableConcept>();
        this.useContext.add(t);
        return this;
    }

    /**
     * @return {@link #usage} (Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower case, etc.). This is the underlying object with id, value and extensions. The accessor "getUsage" gives direct access to the value
     */
    public StringType getUsageElement() {
        if (this.usage == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.usage");
            else if (Configuration.doAutoCreate())
                // bb
                this.usage = new StringType();
        return this.usage;
    }

    public boolean hasUsageElement() {
        return this.usage != null && !this.usage.isEmpty();
    }

    public boolean hasUsage() {
        return this.usage != null && !this.usage.isEmpty();
    }

    /**
     * @param value {@link #usage} (Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower case, etc.). This is the underlying object with id, value and extensions. The accessor "getUsage" gives direct access to the value
     */
    public NamingSystem setUsageElement(StringType value) {
        this.usage = value;
        return this;
    }

    /**
     * @return Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower case, etc.
     */
    public String getUsage() {
        return this.usage == null ? null : this.usage.getValue();
    }

    /**
     * @param value Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower case, etc.
     */
    public NamingSystem setUsage(String value) {
        if (Utilities.noString(value))
            this.usage = null;
        else {
            if (this.usage == null)
                this.usage = new StringType();
            this.usage.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #uniqueId} (Indicates how the system may be identified when referenced in electronic exchange.)
     */
    public List<NamingSystemUniqueIdComponent> getUniqueId() {
        if (this.uniqueId == null)
            this.uniqueId = new ArrayList<NamingSystemUniqueIdComponent>();
        return this.uniqueId;
    }

    public boolean hasUniqueId() {
        if (this.uniqueId == null)
            return false;
        for (NamingSystemUniqueIdComponent item : this.uniqueId) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #uniqueId} (Indicates how the system may be identified when referenced in electronic exchange.)
     */
    // syntactic sugar
    public NamingSystemUniqueIdComponent addUniqueId() {
        // 3
        NamingSystemUniqueIdComponent t = new NamingSystemUniqueIdComponent();
        if (this.uniqueId == null)
            this.uniqueId = new ArrayList<NamingSystemUniqueIdComponent>();
        this.uniqueId.add(t);
        return t;
    }

    // syntactic sugar
    public NamingSystem addUniqueId(NamingSystemUniqueIdComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.uniqueId == null)
            this.uniqueId = new ArrayList<NamingSystemUniqueIdComponent>();
        this.uniqueId.add(t);
        return this;
    }

    /**
     * @return {@link #replacedBy} (For naming systems that are retired, indicates the naming system that should be used in their place (if any).)
     */
    public Reference getReplacedBy() {
        if (this.replacedBy == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.replacedBy");
            else if (Configuration.doAutoCreate())
                // cc
                this.replacedBy = new Reference();
        return this.replacedBy;
    }

    public boolean hasReplacedBy() {
        return this.replacedBy != null && !this.replacedBy.isEmpty();
    }

    /**
     * @param value {@link #replacedBy} (For naming systems that are retired, indicates the naming system that should be used in their place (if any).)
     */
    public NamingSystem setReplacedBy(Reference value) {
        this.replacedBy = value;
        return this;
    }

    /**
     * @return {@link #replacedBy} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (For naming systems that are retired, indicates the naming system that should be used in their place (if any).)
     */
    public NamingSystem getReplacedByTarget() {
        if (this.replacedByTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystem.replacedBy");
            else if (Configuration.doAutoCreate())
                // aa
                this.replacedByTarget = new NamingSystem();
        return this.replacedByTarget;
    }

    /**
     * @param value {@link #replacedBy} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (For naming systems that are retired, indicates the naming system that should be used in their place (if any).)
     */
    public NamingSystem setReplacedByTarget(NamingSystem value) {
        this.replacedByTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "The descriptive name of this particular identifier type or code system.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("status", "code", "Indicates whether the naming system is \"ready for use\" or not.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("kind", "code", "Indicates the purpose for the naming system - what kinds of things does it make unique?", 0, java.lang.Integer.MAX_VALUE, kind));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the naming system.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "", "Contacts to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("responsible", "string", "The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their non-collision.", 0, java.lang.Integer.MAX_VALUE, responsible));
        childrenList.add(new Property("date", "dateTime", "The date  (and optionally time) when the system was registered or published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the registration changes.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("type", "CodeableConcept", "Categorizes a naming system for easier search by grouping related naming systems.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("description", "string", "Details about what the namespace identifies including scope, granularity, version labeling, etc.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("useContext", "CodeableConcept", "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of naming systems.", 0, java.lang.Integer.MAX_VALUE, useContext));
        childrenList.add(new Property("usage", "string", "Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower case, etc.", 0, java.lang.Integer.MAX_VALUE, usage));
        childrenList.add(new Property("uniqueId", "", "Indicates how the system may be identified when referenced in electronic exchange.", 0, java.lang.Integer.MAX_VALUE, uniqueId));
        childrenList.add(new Property("replacedBy", "Reference(NamingSystem)", "For naming systems that are retired, indicates the naming system that should be used in their place (if any).", 0, java.lang.Integer.MAX_VALUE, replacedBy));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("status"))
            // Enumeration<ConformanceResourceStatus>
            this.status = new ConformanceResourceStatusEnumFactory().fromType(value);
        else if (name.equals("kind"))
            // Enumeration<NamingSystemType>
            this.kind = new NamingSystemTypeEnumFactory().fromType(value);
        else if (name.equals("publisher"))
            // StringType
            this.publisher = castToString(value);
        else if (name.equals("contact"))
            this.getContact().add((NamingSystemContactComponent) value);
        else if (name.equals("responsible"))
            // StringType
            this.responsible = castToString(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("useContext"))
            this.getUseContext().add(castToCodeableConcept(value));
        else if (name.equals("usage"))
            // StringType
            this.usage = castToString(value);
        else if (name.equals("uniqueId"))
            this.getUniqueId().add((NamingSystemUniqueIdComponent) value);
        else if (name.equals("replacedBy"))
            // Reference
            this.replacedBy = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.name");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.status");
        } else if (name.equals("kind")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.kind");
        } else if (name.equals("publisher")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.publisher");
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("responsible")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.responsible");
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.date");
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.description");
        } else if (name.equals("useContext")) {
            return addUseContext();
        } else if (name.equals("usage")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.usage");
        } else if (name.equals("uniqueId")) {
            return addUniqueId();
        } else if (name.equals("replacedBy")) {
            this.replacedBy = new Reference();
            return this.replacedBy;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "NamingSystem";
    }

    public NamingSystem copy() {
        NamingSystem dst = new NamingSystem();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.status = status == null ? null : status.copy();
        dst.kind = kind == null ? null : kind.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
            dst.contact = new ArrayList<NamingSystemContactComponent>();
            for (NamingSystemContactComponent i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.responsible = responsible == null ? null : responsible.copy();
        dst.date = date == null ? null : date.copy();
        dst.type = type == null ? null : type.copy();
        dst.description = description == null ? null : description.copy();
        if (useContext != null) {
            dst.useContext = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : useContext) dst.useContext.add(i.copy());
        }
        ;
        dst.usage = usage == null ? null : usage.copy();
        if (uniqueId != null) {
            dst.uniqueId = new ArrayList<NamingSystemUniqueIdComponent>();
            for (NamingSystemUniqueIdComponent i : uniqueId) dst.uniqueId.add(i.copy());
        }
        ;
        dst.replacedBy = replacedBy == null ? null : replacedBy.copy();
        return dst;
    }

    protected NamingSystem typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof NamingSystem))
            return false;
        NamingSystem o = (NamingSystem) other;
        return compareDeep(name, o.name, true) && compareDeep(status, o.status, true) && compareDeep(kind, o.kind, true) && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(responsible, o.responsible, true) && compareDeep(date, o.date, true) && compareDeep(type, o.type, true) && compareDeep(description, o.description, true) && compareDeep(useContext, o.useContext, true) && compareDeep(usage, o.usage, true) && compareDeep(uniqueId, o.uniqueId, true) && compareDeep(replacedBy, o.replacedBy, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof NamingSystem))
            return false;
        NamingSystem o = (NamingSystem) other;
        return compareValues(name, o.name, true) && compareValues(status, o.status, true) && compareValues(kind, o.kind, true) && compareValues(publisher, o.publisher, true) && compareValues(responsible, o.responsible, true) && compareValues(date, o.date, true) && compareValues(description, o.description, true) && compareValues(usage, o.usage, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (status == null || status.isEmpty()) && (kind == null || kind.isEmpty()) && (publisher == null || publisher.isEmpty()) && (contact == null || contact.isEmpty()) && (responsible == null || responsible.isEmpty()) && (date == null || date.isEmpty()) && (type == null || type.isEmpty()) && (description == null || description.isEmpty()) && (useContext == null || useContext.isEmpty()) && (usage == null || usage.isEmpty()) && (uniqueId == null || uniqueId.isEmpty()) && (replacedBy == null || replacedBy.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.NamingSystem;
    }

    public static final String SP_DATE = "date";

    public static final String SP_PERIOD = "period";

    public static final String SP_KIND = "kind";

    public static final String SP_TYPE = "type";

    public static final String SP_IDTYPE = "id-type";

    public static final String SP_RESPONSIBLE = "responsible";

    public static final String SP_CONTACT = "contact";

    public static final String SP_NAME = "name";

    public static final String SP_CONTEXT = "context";

    public static final String SP_PUBLISHER = "publisher";

    public static final String SP_TELECOM = "telecom";

    public static final String SP_VALUE = "value";

    public static final String SP_REPLACEDBY = "replaced-by";

    public static final String SP_STATUS = "status";
}
