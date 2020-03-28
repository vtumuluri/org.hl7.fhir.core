package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperator;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperatorEnumFactory;

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
 * A value set specifies a set of codes drawn from one or more code systems.
 */
public class ValueSet extends DomainResource {

    /**
     * An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published.
     */
    protected UriType url;

    /**
     * Formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    protected Identifier identifier;

    /**
     * Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    protected StringType version;

    /**
     * A free text natural language name describing the value set.
     */
    protected StringType name;

    /**
     * The status of the value set.
     */
    protected Enumeration<ConformanceResourceStatus> status;

    /**
     * This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    protected BooleanType experimental;

    /**
     * The name of the individual or organization that published the value set.
     */
    protected StringType publisher;

    /**
     * Contacts to assist a user in finding and communicating with the publisher.
     */
    protected List<ValueSetContactComponent> contact;

    /**
     * The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition').
     */
    protected DateTimeType date;

    /**
     * If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date.
     */
    protected DateType lockedDate;

    /**
     * A free text natural language description of the use of the value set - reason for definition, "the semantic space" to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.
     */
    protected StringType description;

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions.
     */
    protected List<CodeableConcept> useContext;

    /**
     * If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change.
     */
    protected BooleanType immutable;

    /**
     * Explains why this value set is needed and why it has been constrained as it has.
     */
    protected StringType requirements;

    /**
     * A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set.
     */
    protected StringType copyright;

    /**
     * Whether this is intended to be used with an extensible binding or not.
     */
    protected BooleanType extensible;

    /**
     * A definition of a code system, inlined into the value set (as a packaging convenience). Note that the inline code system may be used from other value sets by referring to its (codeSystem.system) directly.
     */
    protected ValueSetCodeSystemComponent codeSystem;

    /**
     * A set of criteria that provide the content logical definition of the value set by including or excluding codes from outside this value set.
     */
    protected ValueSetComposeComponent compose;

    /**
     * A value set can also be "expanded", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed.
     */
    protected ValueSetExpansionComponent expansion;

    private static final long serialVersionUID = -467533312L;

    /*
   * Constructor
   */
    public ValueSet() {
        super();
    }

    /*
   * Constructor
   */
    public ValueSet(Enumeration<ConformanceResourceStatus> status) {
        super();
        this.status = status;
    }

    /**
     * @return {@link #url} (An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.url");
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
     * @param value {@link #url} (An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public ValueSet setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published.
     */
    public ValueSet setUrl(String value) {
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
     * @return {@link #identifier} (Formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance.)
     */
    public ValueSet setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #version} (Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.version");
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
     * @param value {@link #version} (Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public ValueSet setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    public ValueSet setVersion(String value) {
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
     * @return {@link #name} (A free text natural language name describing the value set.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.name");
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
     * @param value {@link #name} (A free text natural language name describing the value set.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ValueSet setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A free text natural language name describing the value set.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A free text natural language name describing the value set.
     */
    public ValueSet setName(String value) {
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
     * @return {@link #status} (The status of the value set.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ConformanceResourceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.status");
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
     * @param value {@link #status} (The status of the value set.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ValueSet setStatusElement(Enumeration<ConformanceResourceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the value set.
     */
    public ConformanceResourceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the value set.
     */
    public ValueSet setStatus(ConformanceResourceStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #experimental} (This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() {
        if (this.experimental == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.experimental");
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
     * @param value {@link #experimental} (This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public ValueSet setExperimentalElement(BooleanType value) {
        this.experimental = value;
        return this;
    }

    /**
     * @return This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public boolean getExperimental() {
        return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public ValueSet setExperimental(boolean value) {
        if (this.experimental == null)
            this.experimental = new BooleanType();
        this.experimental.setValue(value);
        return this;
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the value set.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() {
        if (this.publisher == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.publisher");
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
     * @param value {@link #publisher} (The name of the individual or organization that published the value set.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public ValueSet setPublisherElement(StringType value) {
        this.publisher = value;
        return this;
    }

    /**
     * @return The name of the individual or organization that published the value set.
     */
    public String getPublisher() {
        return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the value set.
     */
    public ValueSet setPublisher(String value) {
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
    public List<ValueSetContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<ValueSetContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (ValueSetContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public ValueSetContactComponent addContact() {
        // 3
        ValueSetContactComponent t = new ValueSetContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<ValueSetContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public ValueSet addContact(ValueSetContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<ValueSetContactComponent>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #date} (The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition').). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.date");
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
     * @param value {@link #date} (The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition').). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ValueSet setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition').
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition').
     */
    public ValueSet setDate(Date value) {
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
     * @return {@link #lockedDate} (If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date.). This is the underlying object with id, value and extensions. The accessor "getLockedDate" gives direct access to the value
     */
    public DateType getLockedDateElement() {
        if (this.lockedDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.lockedDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.lockedDate = new DateType();
        return this.lockedDate;
    }

    public boolean hasLockedDateElement() {
        return this.lockedDate != null && !this.lockedDate.isEmpty();
    }

    public boolean hasLockedDate() {
        return this.lockedDate != null && !this.lockedDate.isEmpty();
    }

    /**
     * @param value {@link #lockedDate} (If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date.). This is the underlying object with id, value and extensions. The accessor "getLockedDate" gives direct access to the value
     */
    public ValueSet setLockedDateElement(DateType value) {
        this.lockedDate = value;
        return this;
    }

    /**
     * @return If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date.
     */
    public Date getLockedDate() {
        return this.lockedDate == null ? null : this.lockedDate.getValue();
    }

    /**
     * @param value If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date.
     */
    public ValueSet setLockedDate(Date value) {
        if (value == null)
            this.lockedDate = null;
        else {
            if (this.lockedDate == null)
                this.lockedDate = new DateType();
            this.lockedDate.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #description} (A free text natural language description of the use of the value set - reason for definition, "the semantic space" to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.description");
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
     * @param value {@link #description} (A free text natural language description of the use of the value set - reason for definition, "the semantic space" to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ValueSet setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A free text natural language description of the use of the value set - reason for definition, "the semantic space" to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the use of the value set - reason for definition, "the semantic space" to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.
     */
    public ValueSet setDescription(String value) {
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions.)
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions.)
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
    public ValueSet addUseContext(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.useContext == null)
            this.useContext = new ArrayList<CodeableConcept>();
        this.useContext.add(t);
        return this;
    }

    /**
     * @return {@link #immutable} (If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change.). This is the underlying object with id, value and extensions. The accessor "getImmutable" gives direct access to the value
     */
    public BooleanType getImmutableElement() {
        if (this.immutable == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.immutable");
            else if (Configuration.doAutoCreate())
                // bb
                this.immutable = new BooleanType();
        return this.immutable;
    }

    public boolean hasImmutableElement() {
        return this.immutable != null && !this.immutable.isEmpty();
    }

    public boolean hasImmutable() {
        return this.immutable != null && !this.immutable.isEmpty();
    }

    /**
     * @param value {@link #immutable} (If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change.). This is the underlying object with id, value and extensions. The accessor "getImmutable" gives direct access to the value
     */
    public ValueSet setImmutableElement(BooleanType value) {
        this.immutable = value;
        return this;
    }

    /**
     * @return If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change.
     */
    public boolean getImmutable() {
        return this.immutable == null || this.immutable.isEmpty() ? false : this.immutable.getValue();
    }

    /**
     * @param value If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change.
     */
    public ValueSet setImmutable(boolean value) {
        if (this.immutable == null)
            this.immutable = new BooleanType();
        this.immutable.setValue(value);
        return this;
    }

    /**
     * @return {@link #requirements} (Explains why this value set is needed and why it has been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public StringType getRequirementsElement() {
        if (this.requirements == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.requirements");
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
     * @param value {@link #requirements} (Explains why this value set is needed and why it has been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public ValueSet setRequirementsElement(StringType value) {
        this.requirements = value;
        return this;
    }

    /**
     * @return Explains why this value set is needed and why it has been constrained as it has.
     */
    public String getRequirements() {
        return this.requirements == null ? null : this.requirements.getValue();
    }

    /**
     * @param value Explains why this value set is needed and why it has been constrained as it has.
     */
    public ValueSet setRequirements(String value) {
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
     * @return {@link #copyright} (A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public StringType getCopyrightElement() {
        if (this.copyright == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.copyright");
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
     * @param value {@link #copyright} (A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public ValueSet setCopyrightElement(StringType value) {
        this.copyright = value;
        return this;
    }

    /**
     * @return A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set.
     */
    public String getCopyright() {
        return this.copyright == null ? null : this.copyright.getValue();
    }

    /**
     * @param value A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set.
     */
    public ValueSet setCopyright(String value) {
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
     * @return {@link #extensible} (Whether this is intended to be used with an extensible binding or not.). This is the underlying object with id, value and extensions. The accessor "getExtensible" gives direct access to the value
     */
    public BooleanType getExtensibleElement() {
        if (this.extensible == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.extensible");
            else if (Configuration.doAutoCreate())
                // bb
                this.extensible = new BooleanType();
        return this.extensible;
    }

    public boolean hasExtensibleElement() {
        return this.extensible != null && !this.extensible.isEmpty();
    }

    public boolean hasExtensible() {
        return this.extensible != null && !this.extensible.isEmpty();
    }

    /**
     * @param value {@link #extensible} (Whether this is intended to be used with an extensible binding or not.). This is the underlying object with id, value and extensions. The accessor "getExtensible" gives direct access to the value
     */
    public ValueSet setExtensibleElement(BooleanType value) {
        this.extensible = value;
        return this;
    }

    /**
     * @return Whether this is intended to be used with an extensible binding or not.
     */
    public boolean getExtensible() {
        return this.extensible == null || this.extensible.isEmpty() ? false : this.extensible.getValue();
    }

    /**
     * @param value Whether this is intended to be used with an extensible binding or not.
     */
    public ValueSet setExtensible(boolean value) {
        if (this.extensible == null)
            this.extensible = new BooleanType();
        this.extensible.setValue(value);
        return this;
    }

    /**
     * @return {@link #codeSystem} (A definition of a code system, inlined into the value set (as a packaging convenience). Note that the inline code system may be used from other value sets by referring to its (codeSystem.system) directly.)
     */
    public ValueSetCodeSystemComponent getCodeSystem() {
        if (this.codeSystem == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.codeSystem");
            else if (Configuration.doAutoCreate())
                // cc
                this.codeSystem = new ValueSetCodeSystemComponent();
        return this.codeSystem;
    }

    public boolean hasCodeSystem() {
        return this.codeSystem != null && !this.codeSystem.isEmpty();
    }

    /**
     * @param value {@link #codeSystem} (A definition of a code system, inlined into the value set (as a packaging convenience). Note that the inline code system may be used from other value sets by referring to its (codeSystem.system) directly.)
     */
    public ValueSet setCodeSystem(ValueSetCodeSystemComponent value) {
        this.codeSystem = value;
        return this;
    }

    /**
     * @return {@link #compose} (A set of criteria that provide the content logical definition of the value set by including or excluding codes from outside this value set.)
     */
    public ValueSetComposeComponent getCompose() {
        if (this.compose == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.compose");
            else if (Configuration.doAutoCreate())
                // cc
                this.compose = new ValueSetComposeComponent();
        return this.compose;
    }

    public boolean hasCompose() {
        return this.compose != null && !this.compose.isEmpty();
    }

    /**
     * @param value {@link #compose} (A set of criteria that provide the content logical definition of the value set by including or excluding codes from outside this value set.)
     */
    public ValueSet setCompose(ValueSetComposeComponent value) {
        this.compose = value;
        return this;
    }

    /**
     * @return {@link #expansion} (A value set can also be "expanded", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed.)
     */
    public ValueSetExpansionComponent getExpansion() {
        if (this.expansion == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSet.expansion");
            else if (Configuration.doAutoCreate())
                // cc
                this.expansion = new ValueSetExpansionComponent();
        return this.expansion;
    }

    public boolean hasExpansion() {
        return this.expansion != null && !this.expansion.isEmpty();
    }

    /**
     * @param value {@link #expansion} (A value set can also be "expanded", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed.)
     */
    public ValueSet setExpansion(ValueSetExpansionComponent value) {
        this.expansion = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("url", "uri", "An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("identifier", "Identifier", "Formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("version", "string", "Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("name", "string", "A free text natural language name describing the value set.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("status", "code", "The status of the value set.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("experimental", "boolean", "This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.", 0, java.lang.Integer.MAX_VALUE, experimental));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the value set.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "", "Contacts to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("date", "dateTime", "The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition').", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("lockedDate", "date", "If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date.", 0, java.lang.Integer.MAX_VALUE, lockedDate));
        childrenList.add(new Property("description", "string", "A free text natural language description of the use of the value set - reason for definition, \"the semantic space\" to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("useContext", "CodeableConcept", "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions.", 0, java.lang.Integer.MAX_VALUE, useContext));
        childrenList.add(new Property("immutable", "boolean", "If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change.", 0, java.lang.Integer.MAX_VALUE, immutable));
        childrenList.add(new Property("requirements", "string", "Explains why this value set is needed and why it has been constrained as it has.", 0, java.lang.Integer.MAX_VALUE, requirements));
        childrenList.add(new Property("copyright", "string", "A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set.", 0, java.lang.Integer.MAX_VALUE, copyright));
        childrenList.add(new Property("extensible", "boolean", "Whether this is intended to be used with an extensible binding or not.", 0, java.lang.Integer.MAX_VALUE, extensible));
        childrenList.add(new Property("codeSystem", "", "A definition of a code system, inlined into the value set (as a packaging convenience). Note that the inline code system may be used from other value sets by referring to its (codeSystem.system) directly.", 0, java.lang.Integer.MAX_VALUE, codeSystem));
        childrenList.add(new Property("compose", "", "A set of criteria that provide the content logical definition of the value set by including or excluding codes from outside this value set.", 0, java.lang.Integer.MAX_VALUE, compose));
        childrenList.add(new Property("expansion", "", "A value set can also be \"expanded\", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed.", 0, java.lang.Integer.MAX_VALUE, expansion));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
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
            this.getContact().add((ValueSetContactComponent) value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("lockedDate"))
            // DateType
            this.lockedDate = castToDate(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("useContext"))
            this.getUseContext().add(castToCodeableConcept(value));
        else if (name.equals("immutable"))
            // BooleanType
            this.immutable = castToBoolean(value);
        else if (name.equals("requirements"))
            // StringType
            this.requirements = castToString(value);
        else if (name.equals("copyright"))
            // StringType
            this.copyright = castToString(value);
        else if (name.equals("extensible"))
            // BooleanType
            this.extensible = castToBoolean(value);
        else if (name.equals("codeSystem"))
            // ValueSetCodeSystemComponent
            this.codeSystem = (ValueSetCodeSystemComponent) value;
        else if (name.equals("compose"))
            // ValueSetComposeComponent
            this.compose = (ValueSetComposeComponent) value;
        else if (name.equals("expansion"))
            // ValueSetExpansionComponent
            this.expansion = (ValueSetExpansionComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.url");
        } else if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.version");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.name");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.status");
        } else if (name.equals("experimental")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.experimental");
        } else if (name.equals("publisher")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.publisher");
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.date");
        } else if (name.equals("lockedDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.lockedDate");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.description");
        } else if (name.equals("useContext")) {
            return addUseContext();
        } else if (name.equals("immutable")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.immutable");
        } else if (name.equals("requirements")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.requirements");
        } else if (name.equals("copyright")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.copyright");
        } else if (name.equals("extensible")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.extensible");
        } else if (name.equals("codeSystem")) {
            this.codeSystem = new ValueSetCodeSystemComponent();
            return this.codeSystem;
        } else if (name.equals("compose")) {
            this.compose = new ValueSetComposeComponent();
            return this.compose;
        } else if (name.equals("expansion")) {
            this.expansion = new ValueSetExpansionComponent();
            return this.expansion;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ValueSet";
    }

    public ValueSet copy() {
        ValueSet dst = new ValueSet();
        copyValues(dst);
        dst.url = url == null ? null : url.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.status = status == null ? null : status.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
            dst.contact = new ArrayList<ValueSetContactComponent>();
            for (ValueSetContactComponent i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.date = date == null ? null : date.copy();
        dst.lockedDate = lockedDate == null ? null : lockedDate.copy();
        dst.description = description == null ? null : description.copy();
        if (useContext != null) {
            dst.useContext = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : useContext) dst.useContext.add(i.copy());
        }
        ;
        dst.immutable = immutable == null ? null : immutable.copy();
        dst.requirements = requirements == null ? null : requirements.copy();
        dst.copyright = copyright == null ? null : copyright.copy();
        dst.extensible = extensible == null ? null : extensible.copy();
        dst.codeSystem = codeSystem == null ? null : codeSystem.copy();
        dst.compose = compose == null ? null : compose.copy();
        dst.expansion = expansion == null ? null : expansion.copy();
        return dst;
    }

    protected ValueSet typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ValueSet))
            return false;
        ValueSet o = (ValueSet) other;
        return compareDeep(url, o.url, true) && compareDeep(identifier, o.identifier, true) && compareDeep(version, o.version, true) && compareDeep(name, o.name, true) && compareDeep(status, o.status, true) && compareDeep(experimental, o.experimental, true) && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(date, o.date, true) && compareDeep(lockedDate, o.lockedDate, true) && compareDeep(description, o.description, true) && compareDeep(useContext, o.useContext, true) && compareDeep(immutable, o.immutable, true) && compareDeep(requirements, o.requirements, true) && compareDeep(copyright, o.copyright, true) && compareDeep(extensible, o.extensible, true) && compareDeep(codeSystem, o.codeSystem, true) && compareDeep(compose, o.compose, true) && compareDeep(expansion, o.expansion, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ValueSet))
            return false;
        ValueSet o = (ValueSet) other;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true) && compareValues(status, o.status, true) && compareValues(experimental, o.experimental, true) && compareValues(publisher, o.publisher, true) && compareValues(date, o.date, true) && compareValues(lockedDate, o.lockedDate, true) && compareValues(description, o.description, true) && compareValues(immutable, o.immutable, true) && compareValues(requirements, o.requirements, true) && compareValues(copyright, o.copyright, true) && compareValues(extensible, o.extensible, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (url == null || url.isEmpty()) && (identifier == null || identifier.isEmpty()) && (version == null || version.isEmpty()) && (name == null || name.isEmpty()) && (status == null || status.isEmpty()) && (experimental == null || experimental.isEmpty()) && (publisher == null || publisher.isEmpty()) && (contact == null || contact.isEmpty()) && (date == null || date.isEmpty()) && (lockedDate == null || lockedDate.isEmpty()) && (description == null || description.isEmpty()) && (useContext == null || useContext.isEmpty()) && (immutable == null || immutable.isEmpty()) && (requirements == null || requirements.isEmpty()) && (copyright == null || copyright.isEmpty()) && (extensible == null || extensible.isEmpty()) && (codeSystem == null || codeSystem.isEmpty()) && (compose == null || compose.isEmpty()) && (expansion == null || expansion.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ValueSet;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CODE = "code";

    public static final String SP_DESCRIPTION = "description";

    public static final String SP_VERSION = "version";

    public static final String SP_URL = "url";

    public static final String SP_EXPANSION = "expansion";

    public static final String SP_REFERENCE = "reference";

    public static final String SP_SYSTEM = "system";

    public static final String SP_NAME = "name";

    public static final String SP_CONTEXT = "context";

    public static final String SP_PUBLISHER = "publisher";

    public static final String SP_STATUS = "status";
}
