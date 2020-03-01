package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumerations.SearchParamType;
import org.hl7.fhir.android.generated.dstu2.Enumerations.SearchParamTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseConformance;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatus;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKind;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicy;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteractionEnumFactory;

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
 * A conformance statement is a set of capabilities of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class Conformance extends DomainResource implements IBaseConformance {

    /**
     * An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.
     */
    protected UriType url;

    /**
     * The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    protected StringType version;

    /**
     * A free text natural language name identifying the conformance statement.
     */
    protected StringType name;

    /**
     * The status of this conformance statement.
     */
    protected Enumeration<ConformanceResourceStatus> status;

    /**
     * A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    protected BooleanType experimental;

    /**
     * The name of the individual or organization that published the conformance.
     */
    protected StringType publisher;

    /**
     * Contacts to assist a user in finding and communicating with the publisher.
     */
    protected List<ConformanceContactComponent> contact;

    /**
     * The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes.
     */
    protected DateTimeType date;

    /**
     * A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
     */
    protected StringType description;

    /**
     * Explains why this conformance statement is needed and why it's been constrained as it has.
     */
    protected StringType requirements;

    /**
     * A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.
     */
    protected StringType copyright;

    /**
     * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase).
     */
    protected Enumeration<ConformanceStatementKind> kind;

    /**
     * Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.
     */
    protected ConformanceSoftwareComponent software;

    /**
     * Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program.
     */
    protected ConformanceImplementationComponent implementation;

    /**
     * The version of the FHIR specification on which this conformance statement is based.
     */
    protected IdType fhirVersion;

    /**
     * A code that indicates whether the application accepts unknown elements or extensions when reading resources.
     */
    protected Enumeration<UnknownContentCode> acceptUnknown;

    /**
     * A list of the formats supported by this implementation using their content types.
     */
    protected List<CodeType> format;

    /**
     * A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.
     */
    protected List<Reference> profile;

    /**
     * The actual objects that are the target of the reference (A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    protected List<StructureDefinition> profileTarget;

    /**
     * A definition of the restful capabilities of the solution, if any.
     */
    protected List<ConformanceRestComponent> rest;

    /**
     * A description of the messaging capabilities of the solution.
     */
    protected List<ConformanceMessagingComponent> messaging;

    /**
     * A document definition.
     */
    protected List<ConformanceDocumentComponent> document;

    private static final long serialVersionUID = 1863739648L;

    /*
   * Constructor
   */
    public Conformance() {
        super();
    }

    /*
   * Constructor
   */
    public Conformance(DateTimeType date, Enumeration<ConformanceStatementKind> kind, IdType fhirVersion, Enumeration<UnknownContentCode> acceptUnknown) {
        super();
        this.date = date;
        this.kind = kind;
        this.fhirVersion = fhirVersion;
        this.acceptUnknown = acceptUnknown;
    }

    /**
     * @return {@link #url} (An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.url");
            else if (Configuration.doAutoCreate())
                // bb
                this.url = new UriType();
        return this.url;
    }

    public boolean hasUrlElement() {
        return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() {
        return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public Conformance setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.
     */
    public Conformance setUrl(String value) {
        if (Utilities.noString(value))
            this.url = null;
        else {
            if (this.url == null)
                this.url = new UriType();
            this.url.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.version");
            else if (Configuration.doAutoCreate())
                // bb
                this.version = new StringType();
        return this.version;
    }

    public boolean hasVersionElement() {
        return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() {
        return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public Conformance setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    public Conformance setVersion(String value) {
        if (Utilities.noString(value))
            this.version = null;
        else {
            if (this.version == null)
                this.version = new StringType();
            this.version.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #name} (A free text natural language name identifying the conformance statement.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.name");
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
     * @param value {@link #name} (A free text natural language name identifying the conformance statement.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public Conformance setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A free text natural language name identifying the conformance statement.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A free text natural language name identifying the conformance statement.
     */
    public Conformance setName(String value) {
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
     * @return {@link #status} (The status of this conformance statement.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ConformanceResourceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.status");
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
     * @param value {@link #status} (The status of this conformance statement.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Conformance setStatusElement(Enumeration<ConformanceResourceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of this conformance statement.
     */
    public ConformanceResourceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this conformance statement.
     */
    public Conformance setStatus(ConformanceResourceStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #experimental} (A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() {
        if (this.experimental == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.experimental");
            else if (Configuration.doAutoCreate())
                // bb
                this.experimental = new BooleanType();
        return this.experimental;
    }

    public boolean hasExperimentalElement() {
        return this.experimental != null && !this.experimental.isEmpty();
    }

    public boolean hasExperimental() {
        return this.experimental != null && !this.experimental.isEmpty();
    }

    /**
     * @param value {@link #experimental} (A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public Conformance setExperimentalElement(BooleanType value) {
        this.experimental = value;
        return this;
    }

    /**
     * @return A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public boolean getExperimental() {
        return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public Conformance setExperimental(boolean value) {
        if (this.experimental == null)
            this.experimental = new BooleanType();
        this.experimental.setValue(value);
        return this;
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the conformance.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() {
        if (this.publisher == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.publisher");
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
     * @param value {@link #publisher} (The name of the individual or organization that published the conformance.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public Conformance setPublisherElement(StringType value) {
        this.publisher = value;
        return this;
    }

    /**
     * @return The name of the individual or organization that published the conformance.
     */
    public String getPublisher() {
        return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the conformance.
     */
    public Conformance setPublisher(String value) {
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
    public List<ConformanceContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<ConformanceContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (ConformanceContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public ConformanceContactComponent addContact() {
        // 3
        ConformanceContactComponent t = new ConformanceContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<ConformanceContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public Conformance addContact(ConformanceContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<ConformanceContactComponent>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #date} (The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.date");
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
     * @param value {@link #date} (The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Conformance setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes.
     */
    public Conformance setDate(Date value) {
        if (this.date == null)
            this.date = new DateTimeType();
        this.date.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.description");
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
     * @param value {@link #description} (A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Conformance setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
     */
    public Conformance setDescription(String value) {
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
     * @return {@link #requirements} (Explains why this conformance statement is needed and why it's been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public StringType getRequirementsElement() {
        if (this.requirements == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.requirements");
            else if (Configuration.doAutoCreate())
                // bb
                this.requirements = new StringType();
        return this.requirements;
    }

    public boolean hasRequirementsElement() {
        return this.requirements != null && !this.requirements.isEmpty();
    }

    public boolean hasRequirements() {
        return this.requirements != null && !this.requirements.isEmpty();
    }

    /**
     * @param value {@link #requirements} (Explains why this conformance statement is needed and why it's been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public Conformance setRequirementsElement(StringType value) {
        this.requirements = value;
        return this;
    }

    /**
     * @return Explains why this conformance statement is needed and why it's been constrained as it has.
     */
    public String getRequirements() {
        return this.requirements == null ? null : this.requirements.getValue();
    }

    /**
     * @param value Explains why this conformance statement is needed and why it's been constrained as it has.
     */
    public Conformance setRequirements(String value) {
        if (Utilities.noString(value))
            this.requirements = null;
        else {
            if (this.requirements == null)
                this.requirements = new StringType();
            this.requirements.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #copyright} (A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public StringType getCopyrightElement() {
        if (this.copyright == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.copyright");
            else if (Configuration.doAutoCreate())
                // bb
                this.copyright = new StringType();
        return this.copyright;
    }

    public boolean hasCopyrightElement() {
        return this.copyright != null && !this.copyright.isEmpty();
    }

    public boolean hasCopyright() {
        return this.copyright != null && !this.copyright.isEmpty();
    }

    /**
     * @param value {@link #copyright} (A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public Conformance setCopyrightElement(StringType value) {
        this.copyright = value;
        return this;
    }

    /**
     * @return A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.
     */
    public String getCopyright() {
        return this.copyright == null ? null : this.copyright.getValue();
    }

    /**
     * @param value A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.
     */
    public Conformance setCopyright(String value) {
        if (Utilities.noString(value))
            this.copyright = null;
        else {
            if (this.copyright == null)
                this.copyright = new StringType();
            this.copyright.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #kind} (The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase).). This is the underlying object with id, value and extensions. The accessor "getKind" gives direct access to the value
     */
    public Enumeration<ConformanceStatementKind> getKindElement() {
        if (this.kind == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.kind");
            else if (Configuration.doAutoCreate())
                // bb
                this.kind = new Enumeration<ConformanceStatementKind>(new ConformanceStatementKindEnumFactory());
        return this.kind;
    }

    public boolean hasKindElement() {
        return this.kind != null && !this.kind.isEmpty();
    }

    public boolean hasKind() {
        return this.kind != null && !this.kind.isEmpty();
    }

    /**
     * @param value {@link #kind} (The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase).). This is the underlying object with id, value and extensions. The accessor "getKind" gives direct access to the value
     */
    public Conformance setKindElement(Enumeration<ConformanceStatementKind> value) {
        this.kind = value;
        return this;
    }

    /**
     * @return The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase).
     */
    public ConformanceStatementKind getKind() {
        return this.kind == null ? null : this.kind.getValue();
    }

    /**
     * @param value The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase).
     */
    public Conformance setKind(ConformanceStatementKind value) {
        if (this.kind == null)
            this.kind = new Enumeration<ConformanceStatementKind>(new ConformanceStatementKindEnumFactory());
        this.kind.setValue(value);
        return this;
    }

    /**
     * @return {@link #software} (Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.)
     */
    public ConformanceSoftwareComponent getSoftware() {
        if (this.software == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.software");
            else if (Configuration.doAutoCreate())
                // cc
                this.software = new ConformanceSoftwareComponent();
        return this.software;
    }

    public boolean hasSoftware() {
        return this.software != null && !this.software.isEmpty();
    }

    /**
     * @param value {@link #software} (Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.)
     */
    public Conformance setSoftware(ConformanceSoftwareComponent value) {
        this.software = value;
        return this;
    }

    /**
     * @return {@link #implementation} (Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program.)
     */
    public ConformanceImplementationComponent getImplementation() {
        if (this.implementation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.implementation");
            else if (Configuration.doAutoCreate())
                // cc
                this.implementation = new ConformanceImplementationComponent();
        return this.implementation;
    }

    public boolean hasImplementation() {
        return this.implementation != null && !this.implementation.isEmpty();
    }

    /**
     * @param value {@link #implementation} (Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program.)
     */
    public Conformance setImplementation(ConformanceImplementationComponent value) {
        this.implementation = value;
        return this;
    }

    /**
     * @return {@link #fhirVersion} (The version of the FHIR specification on which this conformance statement is based.). This is the underlying object with id, value and extensions. The accessor "getFhirVersion" gives direct access to the value
     */
    public IdType getFhirVersionElement() {
        if (this.fhirVersion == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.fhirVersion");
            else if (Configuration.doAutoCreate())
                // bb
                this.fhirVersion = new IdType();
        return this.fhirVersion;
    }

    public boolean hasFhirVersionElement() {
        return this.fhirVersion != null && !this.fhirVersion.isEmpty();
    }

    public boolean hasFhirVersion() {
        return this.fhirVersion != null && !this.fhirVersion.isEmpty();
    }

    /**
     * @param value {@link #fhirVersion} (The version of the FHIR specification on which this conformance statement is based.). This is the underlying object with id, value and extensions. The accessor "getFhirVersion" gives direct access to the value
     */
    public Conformance setFhirVersionElement(IdType value) {
        this.fhirVersion = value;
        return this;
    }

    /**
     * @return The version of the FHIR specification on which this conformance statement is based.
     */
    public String getFhirVersion() {
        return this.fhirVersion == null ? null : this.fhirVersion.getValue();
    }

    /**
     * @param value The version of the FHIR specification on which this conformance statement is based.
     */
    public Conformance setFhirVersion(String value) {
        if (this.fhirVersion == null)
            this.fhirVersion = new IdType();
        this.fhirVersion.setValue(value);
        return this;
    }

    /**
     * @return {@link #acceptUnknown} (A code that indicates whether the application accepts unknown elements or extensions when reading resources.). This is the underlying object with id, value and extensions. The accessor "getAcceptUnknown" gives direct access to the value
     */
    public Enumeration<UnknownContentCode> getAcceptUnknownElement() {
        if (this.acceptUnknown == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Conformance.acceptUnknown");
            else if (Configuration.doAutoCreate())
                // bb
                this.acceptUnknown = new Enumeration<UnknownContentCode>(new UnknownContentCodeEnumFactory());
        return this.acceptUnknown;
    }

    public boolean hasAcceptUnknownElement() {
        return this.acceptUnknown != null && !this.acceptUnknown.isEmpty();
    }

    public boolean hasAcceptUnknown() {
        return this.acceptUnknown != null && !this.acceptUnknown.isEmpty();
    }

    /**
     * @param value {@link #acceptUnknown} (A code that indicates whether the application accepts unknown elements or extensions when reading resources.). This is the underlying object with id, value and extensions. The accessor "getAcceptUnknown" gives direct access to the value
     */
    public Conformance setAcceptUnknownElement(Enumeration<UnknownContentCode> value) {
        this.acceptUnknown = value;
        return this;
    }

    /**
     * @return A code that indicates whether the application accepts unknown elements or extensions when reading resources.
     */
    public UnknownContentCode getAcceptUnknown() {
        return this.acceptUnknown == null ? null : this.acceptUnknown.getValue();
    }

    /**
     * @param value A code that indicates whether the application accepts unknown elements or extensions when reading resources.
     */
    public Conformance setAcceptUnknown(UnknownContentCode value) {
        if (this.acceptUnknown == null)
            this.acceptUnknown = new Enumeration<UnknownContentCode>(new UnknownContentCodeEnumFactory());
        this.acceptUnknown.setValue(value);
        return this;
    }

    /**
     * @return {@link #format} (A list of the formats supported by this implementation using their content types.)
     */
    public List<CodeType> getFormat() {
        if (this.format == null)
            this.format = new ArrayList<CodeType>();
        return this.format;
    }

    public boolean hasFormat() {
        if (this.format == null)
            return false;
        for (CodeType item : this.format) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #format} (A list of the formats supported by this implementation using their content types.)
     */
    // syntactic sugar
    public CodeType addFormatElement() {
        // 2
        CodeType t = new CodeType();
        if (this.format == null)
            this.format = new ArrayList<CodeType>();
        this.format.add(t);
        return t;
    }

    /**
     * @param value {@link #format} (A list of the formats supported by this implementation using their content types.)
     */
    public Conformance addFormat(String value) {
        // 1
        CodeType t = new CodeType();
        t.setValue(value);
        if (this.format == null)
            this.format = new ArrayList<CodeType>();
        this.format.add(t);
        return this;
    }

    /**
     * @param value {@link #format} (A list of the formats supported by this implementation using their content types.)
     */
    public boolean hasFormat(String value) {
        if (this.format == null)
            return false;
        for (CodeType v : this.format) if (// code
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #profile} (A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    public List<Reference> getProfile() {
        if (this.profile == null)
            this.profile = new ArrayList<Reference>();
        return this.profile;
    }

    public boolean hasProfile() {
        if (this.profile == null)
            return false;
        for (Reference item : this.profile) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #profile} (A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    // syntactic sugar
    public Reference addProfile() {
        // 3
        Reference t = new Reference();
        if (this.profile == null)
            this.profile = new ArrayList<Reference>();
        this.profile.add(t);
        return t;
    }

    // syntactic sugar
    public Conformance addProfile(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.profile == null)
            this.profile = new ArrayList<Reference>();
        this.profile.add(t);
        return this;
    }

    /**
     * @return {@link #profile} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    public List<StructureDefinition> getProfileTarget() {
        if (this.profileTarget == null)
            this.profileTarget = new ArrayList<StructureDefinition>();
        return this.profileTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #profile} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    public StructureDefinition addProfileTarget() {
        StructureDefinition r = new StructureDefinition();
        if (this.profileTarget == null)
            this.profileTarget = new ArrayList<StructureDefinition>();
        this.profileTarget.add(r);
        return r;
    }

    /**
     * @return {@link #rest} (A definition of the restful capabilities of the solution, if any.)
     */
    public List<ConformanceRestComponent> getRest() {
        if (this.rest == null)
            this.rest = new ArrayList<ConformanceRestComponent>();
        return this.rest;
    }

    public boolean hasRest() {
        if (this.rest == null)
            return false;
        for (ConformanceRestComponent item : this.rest) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #rest} (A definition of the restful capabilities of the solution, if any.)
     */
    // syntactic sugar
    public ConformanceRestComponent addRest() {
        // 3
        ConformanceRestComponent t = new ConformanceRestComponent();
        if (this.rest == null)
            this.rest = new ArrayList<ConformanceRestComponent>();
        this.rest.add(t);
        return t;
    }

    // syntactic sugar
    public Conformance addRest(ConformanceRestComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.rest == null)
            this.rest = new ArrayList<ConformanceRestComponent>();
        this.rest.add(t);
        return this;
    }

    /**
     * @return {@link #messaging} (A description of the messaging capabilities of the solution.)
     */
    public List<ConformanceMessagingComponent> getMessaging() {
        if (this.messaging == null)
            this.messaging = new ArrayList<ConformanceMessagingComponent>();
        return this.messaging;
    }

    public boolean hasMessaging() {
        if (this.messaging == null)
            return false;
        for (ConformanceMessagingComponent item : this.messaging) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #messaging} (A description of the messaging capabilities of the solution.)
     */
    // syntactic sugar
    public ConformanceMessagingComponent addMessaging() {
        // 3
        ConformanceMessagingComponent t = new ConformanceMessagingComponent();
        if (this.messaging == null)
            this.messaging = new ArrayList<ConformanceMessagingComponent>();
        this.messaging.add(t);
        return t;
    }

    // syntactic sugar
    public Conformance addMessaging(ConformanceMessagingComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.messaging == null)
            this.messaging = new ArrayList<ConformanceMessagingComponent>();
        this.messaging.add(t);
        return this;
    }

    /**
     * @return {@link #document} (A document definition.)
     */
    public List<ConformanceDocumentComponent> getDocument() {
        if (this.document == null)
            this.document = new ArrayList<ConformanceDocumentComponent>();
        return this.document;
    }

    public boolean hasDocument() {
        if (this.document == null)
            return false;
        for (ConformanceDocumentComponent item : this.document) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #document} (A document definition.)
     */
    // syntactic sugar
    public ConformanceDocumentComponent addDocument() {
        // 3
        ConformanceDocumentComponent t = new ConformanceDocumentComponent();
        if (this.document == null)
            this.document = new ArrayList<ConformanceDocumentComponent>();
        this.document.add(t);
        return t;
    }

    // syntactic sugar
    public Conformance addDocument(ConformanceDocumentComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.document == null)
            this.document = new ArrayList<ConformanceDocumentComponent>();
        this.document.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("url", "uri", "An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("version", "string", "The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("name", "string", "A free text natural language name identifying the conformance statement.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("status", "code", "The status of this conformance statement.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("experimental", "boolean", "A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.", 0, java.lang.Integer.MAX_VALUE, experimental));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the conformance.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "", "Contacts to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("date", "dateTime", "The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("description", "string", "A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("requirements", "string", "Explains why this conformance statement is needed and why it's been constrained as it has.", 0, java.lang.Integer.MAX_VALUE, requirements));
        childrenList.add(new Property("copyright", "string", "A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.", 0, java.lang.Integer.MAX_VALUE, copyright));
        childrenList.add(new Property("kind", "code", "The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase).", 0, java.lang.Integer.MAX_VALUE, kind));
        childrenList.add(new Property("software", "", "Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.", 0, java.lang.Integer.MAX_VALUE, software));
        childrenList.add(new Property("implementation", "", "Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program.", 0, java.lang.Integer.MAX_VALUE, implementation));
        childrenList.add(new Property("fhirVersion", "id", "The version of the FHIR specification on which this conformance statement is based.", 0, java.lang.Integer.MAX_VALUE, fhirVersion));
        childrenList.add(new Property("acceptUnknown", "code", "A code that indicates whether the application accepts unknown elements or extensions when reading resources.", 0, java.lang.Integer.MAX_VALUE, acceptUnknown));
        childrenList.add(new Property("format", "code", "A list of the formats supported by this implementation using their content types.", 0, java.lang.Integer.MAX_VALUE, format));
        childrenList.add(new Property("profile", "Reference(StructureDefinition)", "A list of profiles that represent different use cases supported by the system. For a server, \"supported by the system\" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.", 0, java.lang.Integer.MAX_VALUE, profile));
        childrenList.add(new Property("rest", "", "A definition of the restful capabilities of the solution, if any.", 0, java.lang.Integer.MAX_VALUE, rest));
        childrenList.add(new Property("messaging", "", "A description of the messaging capabilities of the solution.", 0, java.lang.Integer.MAX_VALUE, messaging));
        childrenList.add(new Property("document", "", "A document definition.", 0, java.lang.Integer.MAX_VALUE, document));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else if (name.equals("version"))
            // StringType
            this.version = castToString(value);
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("status"))
            // Enumeration<ConformanceResourceStatus>
            this.status = new ConformanceResourceStatusEnumFactory().fromType(value);
        else if (name.equals("experimental"))
            // BooleanType
            this.experimental = castToBoolean(value);
        else if (name.equals("publisher"))
            // StringType
            this.publisher = castToString(value);
        else if (name.equals("contact"))
            this.getContact().add((ConformanceContactComponent) value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("requirements"))
            // StringType
            this.requirements = castToString(value);
        else if (name.equals("copyright"))
            // StringType
            this.copyright = castToString(value);
        else if (name.equals("kind"))
            // Enumeration<ConformanceStatementKind>
            this.kind = new ConformanceStatementKindEnumFactory().fromType(value);
        else if (name.equals("software"))
            // ConformanceSoftwareComponent
            this.software = (ConformanceSoftwareComponent) value;
        else if (name.equals("implementation"))
            // ConformanceImplementationComponent
            this.implementation = (ConformanceImplementationComponent) value;
        else if (name.equals("fhirVersion"))
            // IdType
            this.fhirVersion = castToId(value);
        else if (name.equals("acceptUnknown"))
            // Enumeration<UnknownContentCode>
            this.acceptUnknown = new UnknownContentCodeEnumFactory().fromType(value);
        else if (name.equals("format"))
            this.getFormat().add(castToCode(value));
        else if (name.equals("profile"))
            this.getProfile().add(castToReference(value));
        else if (name.equals("rest"))
            this.getRest().add((ConformanceRestComponent) value);
        else if (name.equals("messaging"))
            this.getMessaging().add((ConformanceMessagingComponent) value);
        else if (name.equals("document"))
            this.getDocument().add((ConformanceDocumentComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.url");
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.version");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.name");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.status");
        } else if (name.equals("experimental")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.experimental");
        } else if (name.equals("publisher")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.publisher");
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.date");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.description");
        } else if (name.equals("requirements")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.requirements");
        } else if (name.equals("copyright")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.copyright");
        } else if (name.equals("kind")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.kind");
        } else if (name.equals("software")) {
            this.software = new ConformanceSoftwareComponent();
            return this.software;
        } else if (name.equals("implementation")) {
            this.implementation = new ConformanceImplementationComponent();
            return this.implementation;
        } else if (name.equals("fhirVersion")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.fhirVersion");
        } else if (name.equals("acceptUnknown")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.acceptUnknown");
        } else if (name.equals("format")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.format");
        } else if (name.equals("profile")) {
            return addProfile();
        } else if (name.equals("rest")) {
            return addRest();
        } else if (name.equals("messaging")) {
            return addMessaging();
        } else if (name.equals("document")) {
            return addDocument();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Conformance";
    }

    public Conformance copy() {
        Conformance dst = new Conformance();
        copyValues(dst);
        dst.url = url == null ? null : url.copy();
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.status = status == null ? null : status.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
            dst.contact = new ArrayList<ConformanceContactComponent>();
            for (ConformanceContactComponent i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.date = date == null ? null : date.copy();
        dst.description = description == null ? null : description.copy();
        dst.requirements = requirements == null ? null : requirements.copy();
        dst.copyright = copyright == null ? null : copyright.copy();
        dst.kind = kind == null ? null : kind.copy();
        dst.software = software == null ? null : software.copy();
        dst.implementation = implementation == null ? null : implementation.copy();
        dst.fhirVersion = fhirVersion == null ? null : fhirVersion.copy();
        dst.acceptUnknown = acceptUnknown == null ? null : acceptUnknown.copy();
        if (format != null) {
            dst.format = new ArrayList<CodeType>();
            for (CodeType i : format) dst.format.add(i.copy());
        }
        ;
        if (profile != null) {
            dst.profile = new ArrayList<Reference>();
            for (Reference i : profile) dst.profile.add(i.copy());
        }
        ;
        if (rest != null) {
            dst.rest = new ArrayList<ConformanceRestComponent>();
            for (ConformanceRestComponent i : rest) dst.rest.add(i.copy());
        }
        ;
        if (messaging != null) {
            dst.messaging = new ArrayList<ConformanceMessagingComponent>();
            for (ConformanceMessagingComponent i : messaging) dst.messaging.add(i.copy());
        }
        ;
        if (document != null) {
            dst.document = new ArrayList<ConformanceDocumentComponent>();
            for (ConformanceDocumentComponent i : document) dst.document.add(i.copy());
        }
        ;
        return dst;
    }

    protected Conformance typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Conformance))
            return false;
        Conformance o = (Conformance) other;
        return compareDeep(url, o.url, true) && compareDeep(version, o.version, true) && compareDeep(name, o.name, true) && compareDeep(status, o.status, true) && compareDeep(experimental, o.experimental, true) && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(date, o.date, true) && compareDeep(description, o.description, true) && compareDeep(requirements, o.requirements, true) && compareDeep(copyright, o.copyright, true) && compareDeep(kind, o.kind, true) && compareDeep(software, o.software, true) && compareDeep(implementation, o.implementation, true) && compareDeep(fhirVersion, o.fhirVersion, true) && compareDeep(acceptUnknown, o.acceptUnknown, true) && compareDeep(format, o.format, true) && compareDeep(profile, o.profile, true) && compareDeep(rest, o.rest, true) && compareDeep(messaging, o.messaging, true) && compareDeep(document, o.document, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Conformance))
            return false;
        Conformance o = (Conformance) other;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true) && compareValues(status, o.status, true) && compareValues(experimental, o.experimental, true) && compareValues(publisher, o.publisher, true) && compareValues(date, o.date, true) && compareValues(description, o.description, true) && compareValues(requirements, o.requirements, true) && compareValues(copyright, o.copyright, true) && compareValues(kind, o.kind, true) && compareValues(fhirVersion, o.fhirVersion, true) && compareValues(acceptUnknown, o.acceptUnknown, true) && compareValues(format, o.format, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (url == null || url.isEmpty()) && (version == null || version.isEmpty()) && (name == null || name.isEmpty()) && (status == null || status.isEmpty()) && (experimental == null || experimental.isEmpty()) && (publisher == null || publisher.isEmpty()) && (contact == null || contact.isEmpty()) && (date == null || date.isEmpty()) && (description == null || description.isEmpty()) && (requirements == null || requirements.isEmpty()) && (copyright == null || copyright.isEmpty()) && (kind == null || kind.isEmpty()) && (software == null || software.isEmpty()) && (implementation == null || implementation.isEmpty()) && (fhirVersion == null || fhirVersion.isEmpty()) && (acceptUnknown == null || acceptUnknown.isEmpty()) && (format == null || format.isEmpty()) && (profile == null || profile.isEmpty()) && (rest == null || rest.isEmpty()) && (messaging == null || messaging.isEmpty()) && (document == null || document.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Conformance;
    }

    public static final String SP_DATE = "date";

    public static final String SP_SOFTWARE = "software";

    public static final String SP_RESOURCE = "resource";

    public static final String SP_PROFILE = "profile";

    public static final String SP_FORMAT = "format";

    public static final String SP_DESCRIPTION = "description";

    public static final String SP_FHIRVERSION = "fhirversion";

    public static final String SP_VERSION = "version";

    public static final String SP_URL = "url";

    public static final String SP_SUPPORTEDPROFILE = "supported-profile";

    public static final String SP_MODE = "mode";

    public static final String SP_SECURITY = "security";

    public static final String SP_NAME = "name";

    public static final String SP_PUBLISHER = "publisher";

    public static final String SP_EVENT = "event";

    public static final String SP_STATUS = "status";
}
