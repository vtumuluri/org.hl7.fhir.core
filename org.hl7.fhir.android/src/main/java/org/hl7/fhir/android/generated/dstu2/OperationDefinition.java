package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.BindingStrength;
import org.hl7.fhir.android.generated.dstu2.Enumerations.BindingStrengthEnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationKind;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationParameterUse;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationParameterUseEnumFactory;

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
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 */
public class OperationDefinition extends DomainResource {

    /**
     * An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published.
     */
    protected UriType url;

    /**
     * The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    protected StringType version;

    /**
     * A free text natural language name identifying the operation.
     */
    protected StringType name;

    /**
     * The status of the profile.
     */
    protected Enumeration<ConformanceResourceStatus> status;

    /**
     * Whether this is an operation or a named query.
     */
    protected Enumeration<OperationKind> kind;

    /**
     * This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    protected BooleanType experimental;

    /**
     * The name of the individual or organization that published the operation definition.
     */
    protected StringType publisher;

    /**
     * Contacts to assist a user in finding and communicating with the publisher.
     */
    protected List<OperationDefinitionContactComponent> contact;

    /**
     * The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes.
     */
    protected DateTimeType date;

    /**
     * A free text natural language description of the profile and its use.
     */
    protected StringType description;

    /**
     * Explains why this operation definition is needed and why it's been constrained as it has.
     */
    protected StringType requirements;

    /**
     * Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST.
     */
    protected BooleanType idempotent;

    /**
     * The name used to invoke the operation.
     */
    protected CodeType code;

    /**
     * Additional information about how to use this operation or named query.
     */
    protected StringType notes;

    /**
     * Indicates that this operation definition is a constraining profile on the base.
     */
    protected Reference base;

    /**
     * The actual object that is the target of the reference (Indicates that this operation definition is a constraining profile on the base.)
     */
    protected OperationDefinition baseTarget;

    /**
     * Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context).
     */
    protected BooleanType system;

    /**
     * Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context).
     */
    protected List<CodeType> type;

    /**
     * Indicates whether this operation can be invoked on a particular instance of one of the given types.
     */
    protected BooleanType instance;

    /**
     * The parameters for the operation/query.
     */
    protected List<OperationDefinitionParameterComponent> parameter;

    private static final long serialVersionUID = 148203484L;

    /*
   * Constructor
   */
    public OperationDefinition() {
        super();
    }

    /*
   * Constructor
   */
    public OperationDefinition(StringType name, Enumeration<ConformanceResourceStatus> status, Enumeration<OperationKind> kind, CodeType code, BooleanType system, BooleanType instance) {
        super();
        this.name = name;
        this.status = status;
        this.kind = kind;
        this.code = code;
        this.system = system;
        this.instance = instance;
    }

    /**
     * @return {@link #url} (An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.url");
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
     * @param value {@link #url} (An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public OperationDefinition setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published.
     */
    public OperationDefinition setUrl(String value) {
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
     * @return {@link #version} (The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.version");
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
     * @param value {@link #version} (The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public OperationDefinition setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    public OperationDefinition setVersion(String value) {
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
     * @return {@link #name} (A free text natural language name identifying the operation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.name");
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
     * @param value {@link #name} (A free text natural language name identifying the operation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public OperationDefinition setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A free text natural language name identifying the operation.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A free text natural language name identifying the operation.
     */
    public OperationDefinition setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #status} (The status of the profile.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ConformanceResourceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.status");
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
     * @param value {@link #status} (The status of the profile.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public OperationDefinition setStatusElement(Enumeration<ConformanceResourceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the profile.
     */
    public ConformanceResourceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the profile.
     */
    public OperationDefinition setStatus(ConformanceResourceStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #kind} (Whether this is an operation or a named query.). This is the underlying object with id, value and extensions. The accessor "getKind" gives direct access to the value
     */
    public Enumeration<OperationKind> getKindElement() {
        if (this.kind == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.kind");
            else if (Configuration.doAutoCreate())
                // bb
                this.kind = new Enumeration<OperationKind>(new OperationKindEnumFactory());
        return this.kind;
    }

    public boolean hasKindElement() {
        return this.kind != null && !this.kind.isEmpty();
    }

    public boolean hasKind() {
        return this.kind != null && !this.kind.isEmpty();
    }

    /**
     * @param value {@link #kind} (Whether this is an operation or a named query.). This is the underlying object with id, value and extensions. The accessor "getKind" gives direct access to the value
     */
    public OperationDefinition setKindElement(Enumeration<OperationKind> value) {
        this.kind = value;
        return this;
    }

    /**
     * @return Whether this is an operation or a named query.
     */
    public OperationKind getKind() {
        return this.kind == null ? null : this.kind.getValue();
    }

    /**
     * @param value Whether this is an operation or a named query.
     */
    public OperationDefinition setKind(OperationKind value) {
        if (this.kind == null)
            this.kind = new Enumeration<OperationKind>(new OperationKindEnumFactory());
        this.kind.setValue(value);
        return this;
    }

    /**
     * @return {@link #experimental} (This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() {
        if (this.experimental == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.experimental");
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
     * @param value {@link #experimental} (This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public OperationDefinition setExperimentalElement(BooleanType value) {
        this.experimental = value;
        return this;
    }

    /**
     * @return This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public boolean getExperimental() {
        return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public OperationDefinition setExperimental(boolean value) {
        if (this.experimental == null)
            this.experimental = new BooleanType();
        this.experimental.setValue(value);
        return this;
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the operation definition.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() {
        if (this.publisher == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.publisher");
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
     * @param value {@link #publisher} (The name of the individual or organization that published the operation definition.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public OperationDefinition setPublisherElement(StringType value) {
        this.publisher = value;
        return this;
    }

    /**
     * @return The name of the individual or organization that published the operation definition.
     */
    public String getPublisher() {
        return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the operation definition.
     */
    public OperationDefinition setPublisher(String value) {
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
    public List<OperationDefinitionContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<OperationDefinitionContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (OperationDefinitionContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public OperationDefinitionContactComponent addContact() {
        // 3
        OperationDefinitionContactComponent t = new OperationDefinitionContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<OperationDefinitionContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public OperationDefinition addContact(OperationDefinitionContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<OperationDefinitionContactComponent>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #date} (The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.date");
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
     * @param value {@link #date} (The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public OperationDefinition setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes.
     */
    public OperationDefinition setDate(Date value) {
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
     * @return {@link #description} (A free text natural language description of the profile and its use.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.description");
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
     * @param value {@link #description} (A free text natural language description of the profile and its use.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public OperationDefinition setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A free text natural language description of the profile and its use.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the profile and its use.
     */
    public OperationDefinition setDescription(String value) {
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
     * @return {@link #requirements} (Explains why this operation definition is needed and why it's been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public StringType getRequirementsElement() {
        if (this.requirements == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.requirements");
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
     * @param value {@link #requirements} (Explains why this operation definition is needed and why it's been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public OperationDefinition setRequirementsElement(StringType value) {
        this.requirements = value;
        return this;
    }

    /**
     * @return Explains why this operation definition is needed and why it's been constrained as it has.
     */
    public String getRequirements() {
        return this.requirements == null ? null : this.requirements.getValue();
    }

    /**
     * @param value Explains why this operation definition is needed and why it's been constrained as it has.
     */
    public OperationDefinition setRequirements(String value) {
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
     * @return {@link #idempotent} (Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST.). This is the underlying object with id, value and extensions. The accessor "getIdempotent" gives direct access to the value
     */
    public BooleanType getIdempotentElement() {
        if (this.idempotent == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.idempotent");
            else if (Configuration.doAutoCreate())
                // bb
                this.idempotent = new BooleanType();
        return this.idempotent;
    }

    public boolean hasIdempotentElement() {
        return this.idempotent != null && !this.idempotent.isEmpty();
    }

    public boolean hasIdempotent() {
        return this.idempotent != null && !this.idempotent.isEmpty();
    }

    /**
     * @param value {@link #idempotent} (Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST.). This is the underlying object with id, value and extensions. The accessor "getIdempotent" gives direct access to the value
     */
    public OperationDefinition setIdempotentElement(BooleanType value) {
        this.idempotent = value;
        return this;
    }

    /**
     * @return Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST.
     */
    public boolean getIdempotent() {
        return this.idempotent == null || this.idempotent.isEmpty() ? false : this.idempotent.getValue();
    }

    /**
     * @param value Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST.
     */
    public OperationDefinition setIdempotent(boolean value) {
        if (this.idempotent == null)
            this.idempotent = new BooleanType();
        this.idempotent.setValue(value);
        return this;
    }

    /**
     * @return {@link #code} (The name used to invoke the operation.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public CodeType getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.code");
            else if (Configuration.doAutoCreate())
                // bb
                this.code = new CodeType();
        return this.code;
    }

    public boolean hasCodeElement() {
        return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (The name used to invoke the operation.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public OperationDefinition setCodeElement(CodeType value) {
        this.code = value;
        return this;
    }

    /**
     * @return The name used to invoke the operation.
     */
    public String getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value The name used to invoke the operation.
     */
    public OperationDefinition setCode(String value) {
        if (this.code == null)
            this.code = new CodeType();
        this.code.setValue(value);
        return this;
    }

    /**
     * @return {@link #notes} (Additional information about how to use this operation or named query.). This is the underlying object with id, value and extensions. The accessor "getNotes" gives direct access to the value
     */
    public StringType getNotesElement() {
        if (this.notes == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.notes");
            else if (Configuration.doAutoCreate())
                // bb
                this.notes = new StringType();
        return this.notes;
    }

    public boolean hasNotesElement() {
        return this.notes != null && !this.notes.isEmpty();
    }

    public boolean hasNotes() {
        return this.notes != null && !this.notes.isEmpty();
    }

    /**
     * @param value {@link #notes} (Additional information about how to use this operation or named query.). This is the underlying object with id, value and extensions. The accessor "getNotes" gives direct access to the value
     */
    public OperationDefinition setNotesElement(StringType value) {
        this.notes = value;
        return this;
    }

    /**
     * @return Additional information about how to use this operation or named query.
     */
    public String getNotes() {
        return this.notes == null ? null : this.notes.getValue();
    }

    /**
     * @param value Additional information about how to use this operation or named query.
     */
    public OperationDefinition setNotes(String value) {
        if (Utilities.noString(value))
            this.notes = null;
        else {
            if (this.notes == null)
                this.notes = new StringType();
            this.notes.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #base} (Indicates that this operation definition is a constraining profile on the base.)
     */
    public Reference getBase() {
        if (this.base == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.base");
            else if (Configuration.doAutoCreate())
                // cc
                this.base = new Reference();
        return this.base;
    }

    public boolean hasBase() {
        return this.base != null && !this.base.isEmpty();
    }

    /**
     * @param value {@link #base} (Indicates that this operation definition is a constraining profile on the base.)
     */
    public OperationDefinition setBase(Reference value) {
        this.base = value;
        return this;
    }

    /**
     * @return {@link #base} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Indicates that this operation definition is a constraining profile on the base.)
     */
    public OperationDefinition getBaseTarget() {
        if (this.baseTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.base");
            else if (Configuration.doAutoCreate())
                // aa
                this.baseTarget = new OperationDefinition();
        return this.baseTarget;
    }

    /**
     * @param value {@link #base} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Indicates that this operation definition is a constraining profile on the base.)
     */
    public OperationDefinition setBaseTarget(OperationDefinition value) {
        this.baseTarget = value;
        return this;
    }

    /**
     * @return {@link #system} (Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context).). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public BooleanType getSystemElement() {
        if (this.system == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.system");
            else if (Configuration.doAutoCreate())
                // bb
                this.system = new BooleanType();
        return this.system;
    }

    public boolean hasSystemElement() {
        return this.system != null && !this.system.isEmpty();
    }

    public boolean hasSystem() {
        return this.system != null && !this.system.isEmpty();
    }

    /**
     * @param value {@link #system} (Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context).). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public OperationDefinition setSystemElement(BooleanType value) {
        this.system = value;
        return this;
    }

    /**
     * @return Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context).
     */
    public boolean getSystem() {
        return this.system == null || this.system.isEmpty() ? false : this.system.getValue();
    }

    /**
     * @param value Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context).
     */
    public OperationDefinition setSystem(boolean value) {
        if (this.system == null)
            this.system = new BooleanType();
        this.system.setValue(value);
        return this;
    }

    /**
     * @return {@link #type} (Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context).)
     */
    public List<CodeType> getType() {
        if (this.type == null)
            this.type = new ArrayList<CodeType>();
        return this.type;
    }

    public boolean hasType() {
        if (this.type == null)
            return false;
        for (CodeType item : this.type) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #type} (Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context).)
     */
    // syntactic sugar
    public CodeType addTypeElement() {
        // 2
        CodeType t = new CodeType();
        if (this.type == null)
            this.type = new ArrayList<CodeType>();
        this.type.add(t);
        return t;
    }

    /**
     * @param value {@link #type} (Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context).)
     */
    public OperationDefinition addType(String value) {
        // 1
        CodeType t = new CodeType();
        t.setValue(value);
        if (this.type == null)
            this.type = new ArrayList<CodeType>();
        this.type.add(t);
        return this;
    }

    /**
     * @param value {@link #type} (Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context).)
     */
    public boolean hasType(String value) {
        if (this.type == null)
            return false;
        for (CodeType v : this.type) if (// code
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #instance} (Indicates whether this operation can be invoked on a particular instance of one of the given types.). This is the underlying object with id, value and extensions. The accessor "getInstance" gives direct access to the value
     */
    public BooleanType getInstanceElement() {
        if (this.instance == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinition.instance");
            else if (Configuration.doAutoCreate())
                // bb
                this.instance = new BooleanType();
        return this.instance;
    }

    public boolean hasInstanceElement() {
        return this.instance != null && !this.instance.isEmpty();
    }

    public boolean hasInstance() {
        return this.instance != null && !this.instance.isEmpty();
    }

    /**
     * @param value {@link #instance} (Indicates whether this operation can be invoked on a particular instance of one of the given types.). This is the underlying object with id, value and extensions. The accessor "getInstance" gives direct access to the value
     */
    public OperationDefinition setInstanceElement(BooleanType value) {
        this.instance = value;
        return this;
    }

    /**
     * @return Indicates whether this operation can be invoked on a particular instance of one of the given types.
     */
    public boolean getInstance() {
        return this.instance == null || this.instance.isEmpty() ? false : this.instance.getValue();
    }

    /**
     * @param value Indicates whether this operation can be invoked on a particular instance of one of the given types.
     */
    public OperationDefinition setInstance(boolean value) {
        if (this.instance == null)
            this.instance = new BooleanType();
        this.instance.setValue(value);
        return this;
    }

    /**
     * @return {@link #parameter} (The parameters for the operation/query.)
     */
    public List<OperationDefinitionParameterComponent> getParameter() {
        if (this.parameter == null)
            this.parameter = new ArrayList<OperationDefinitionParameterComponent>();
        return this.parameter;
    }

    public boolean hasParameter() {
        if (this.parameter == null)
            return false;
        for (OperationDefinitionParameterComponent item : this.parameter) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #parameter} (The parameters for the operation/query.)
     */
    // syntactic sugar
    public OperationDefinitionParameterComponent addParameter() {
        // 3
        OperationDefinitionParameterComponent t = new OperationDefinitionParameterComponent();
        if (this.parameter == null)
            this.parameter = new ArrayList<OperationDefinitionParameterComponent>();
        this.parameter.add(t);
        return t;
    }

    // syntactic sugar
    public OperationDefinition addParameter(OperationDefinitionParameterComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.parameter == null)
            this.parameter = new ArrayList<OperationDefinitionParameterComponent>();
        this.parameter.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("url", "uri", "An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("version", "string", "The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("name", "string", "A free text natural language name identifying the operation.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("status", "code", "The status of the profile.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("kind", "code", "Whether this is an operation or a named query.", 0, java.lang.Integer.MAX_VALUE, kind));
        childrenList.add(new Property("experimental", "boolean", "This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.", 0, java.lang.Integer.MAX_VALUE, experimental));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the operation definition.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "", "Contacts to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("date", "dateTime", "The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("description", "string", "A free text natural language description of the profile and its use.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("requirements", "string", "Explains why this operation definition is needed and why it's been constrained as it has.", 0, java.lang.Integer.MAX_VALUE, requirements));
        childrenList.add(new Property("idempotent", "boolean", "Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST.", 0, java.lang.Integer.MAX_VALUE, idempotent));
        childrenList.add(new Property("code", "code", "The name used to invoke the operation.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("notes", "string", "Additional information about how to use this operation or named query.", 0, java.lang.Integer.MAX_VALUE, notes));
        childrenList.add(new Property("base", "Reference(OperationDefinition)", "Indicates that this operation definition is a constraining profile on the base.", 0, java.lang.Integer.MAX_VALUE, base));
        childrenList.add(new Property("system", "boolean", "Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context).", 0, java.lang.Integer.MAX_VALUE, system));
        childrenList.add(new Property("type", "code", "Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context).", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("instance", "boolean", "Indicates whether this operation can be invoked on a particular instance of one of the given types.", 0, java.lang.Integer.MAX_VALUE, instance));
        childrenList.add(new Property("parameter", "", "The parameters for the operation/query.", 0, java.lang.Integer.MAX_VALUE, parameter));
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
        else if (name.equals("kind"))
            // Enumeration<OperationKind>
            this.kind = new OperationKindEnumFactory().fromType(value);
        else if (name.equals("experimental"))
            // BooleanType
            this.experimental = castToBoolean(value);
        else if (name.equals("publisher"))
            // StringType
            this.publisher = castToString(value);
        else if (name.equals("contact"))
            this.getContact().add((OperationDefinitionContactComponent) value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("requirements"))
            // StringType
            this.requirements = castToString(value);
        else if (name.equals("idempotent"))
            // BooleanType
            this.idempotent = castToBoolean(value);
        else if (name.equals("code"))
            // CodeType
            this.code = castToCode(value);
        else if (name.equals("notes"))
            // StringType
            this.notes = castToString(value);
        else if (name.equals("base"))
            // Reference
            this.base = castToReference(value);
        else if (name.equals("system"))
            // BooleanType
            this.system = castToBoolean(value);
        else if (name.equals("type"))
            this.getType().add(castToCode(value));
        else if (name.equals("instance"))
            // BooleanType
            this.instance = castToBoolean(value);
        else if (name.equals("parameter"))
            this.getParameter().add((OperationDefinitionParameterComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.url");
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.version");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.name");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.status");
        } else if (name.equals("kind")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.kind");
        } else if (name.equals("experimental")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.experimental");
        } else if (name.equals("publisher")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.publisher");
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.date");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.description");
        } else if (name.equals("requirements")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.requirements");
        } else if (name.equals("idempotent")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.idempotent");
        } else if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.code");
        } else if (name.equals("notes")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.notes");
        } else if (name.equals("base")) {
            this.base = new Reference();
            return this.base;
        } else if (name.equals("system")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.system");
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.type");
        } else if (name.equals("instance")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.instance");
        } else if (name.equals("parameter")) {
            return addParameter();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "OperationDefinition";
    }

    public OperationDefinition copy() {
        OperationDefinition dst = new OperationDefinition();
        copyValues(dst);
        dst.url = url == null ? null : url.copy();
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.status = status == null ? null : status.copy();
        dst.kind = kind == null ? null : kind.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
            dst.contact = new ArrayList<OperationDefinitionContactComponent>();
            for (OperationDefinitionContactComponent i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.date = date == null ? null : date.copy();
        dst.description = description == null ? null : description.copy();
        dst.requirements = requirements == null ? null : requirements.copy();
        dst.idempotent = idempotent == null ? null : idempotent.copy();
        dst.code = code == null ? null : code.copy();
        dst.notes = notes == null ? null : notes.copy();
        dst.base = base == null ? null : base.copy();
        dst.system = system == null ? null : system.copy();
        if (type != null) {
            dst.type = new ArrayList<CodeType>();
            for (CodeType i : type) dst.type.add(i.copy());
        }
        ;
        dst.instance = instance == null ? null : instance.copy();
        if (parameter != null) {
            dst.parameter = new ArrayList<OperationDefinitionParameterComponent>();
            for (OperationDefinitionParameterComponent i : parameter) dst.parameter.add(i.copy());
        }
        ;
        return dst;
    }

    protected OperationDefinition typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof OperationDefinition))
            return false;
        OperationDefinition o = (OperationDefinition) other;
        return compareDeep(url, o.url, true) && compareDeep(version, o.version, true) && compareDeep(name, o.name, true) && compareDeep(status, o.status, true) && compareDeep(kind, o.kind, true) && compareDeep(experimental, o.experimental, true) && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(date, o.date, true) && compareDeep(description, o.description, true) && compareDeep(requirements, o.requirements, true) && compareDeep(idempotent, o.idempotent, true) && compareDeep(code, o.code, true) && compareDeep(notes, o.notes, true) && compareDeep(base, o.base, true) && compareDeep(system, o.system, true) && compareDeep(type, o.type, true) && compareDeep(instance, o.instance, true) && compareDeep(parameter, o.parameter, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof OperationDefinition))
            return false;
        OperationDefinition o = (OperationDefinition) other;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true) && compareValues(status, o.status, true) && compareValues(kind, o.kind, true) && compareValues(experimental, o.experimental, true) && compareValues(publisher, o.publisher, true) && compareValues(date, o.date, true) && compareValues(description, o.description, true) && compareValues(requirements, o.requirements, true) && compareValues(idempotent, o.idempotent, true) && compareValues(code, o.code, true) && compareValues(notes, o.notes, true) && compareValues(system, o.system, true) && compareValues(type, o.type, true) && compareValues(instance, o.instance, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (url == null || url.isEmpty()) && (version == null || version.isEmpty()) && (name == null || name.isEmpty()) && (status == null || status.isEmpty()) && (kind == null || kind.isEmpty()) && (experimental == null || experimental.isEmpty()) && (publisher == null || publisher.isEmpty()) && (contact == null || contact.isEmpty()) && (date == null || date.isEmpty()) && (description == null || description.isEmpty()) && (requirements == null || requirements.isEmpty()) && (idempotent == null || idempotent.isEmpty()) && (code == null || code.isEmpty()) && (notes == null || notes.isEmpty()) && (base == null || base.isEmpty()) && (system == null || system.isEmpty()) && (type == null || type.isEmpty()) && (instance == null || instance.isEmpty()) && (parameter == null || parameter.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.OperationDefinition;
    }

    public static final String SP_DATE = "date";

    public static final String SP_CODE = "code";

    public static final String SP_INSTANCE = "instance";

    public static final String SP_KIND = "kind";

    public static final String SP_PROFILE = "profile";

    public static final String SP_TYPE = "type";

    public static final String SP_VERSION = "version";

    public static final String SP_URL = "url";

    public static final String SP_SYSTEM = "system";

    public static final String SP_NAME = "name";

    public static final String SP_PUBLISHER = "publisher";

    public static final String SP_STATUS = "status";

    public static final String SP_BASE = "base";
}
