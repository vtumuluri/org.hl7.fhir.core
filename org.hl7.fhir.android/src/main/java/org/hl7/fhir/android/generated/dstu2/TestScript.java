package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypes;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypesEnumFactory;

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
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScript extends DomainResource {

    /**
     * An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published.
     */
    protected UriType url;

    /**
     * The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually.
     */
    protected StringType version;

    /**
     * A free text natural language name identifying the TestScript.
     */
    protected StringType name;

    /**
     * The status of the TestScript.
     */
    protected Enumeration<ConformanceResourceStatus> status;

    /**
     * Identifier for the TestScript assigned for external purposes outside the context of FHIR.
     */
    protected Identifier identifier;

    /**
     * This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    protected BooleanType experimental;

    /**
     * The name of the individual or organization that published the Test Script.
     */
    protected StringType publisher;

    /**
     * Contacts to assist a user in finding and communicating with the publisher.
     */
    protected List<TestScriptContactComponent> contact;

    /**
     * The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change.
     */
    protected DateTimeType date;

    /**
     * A free text natural language description of the TestScript and its use.
     */
    protected StringType description;

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts.
     */
    protected List<CodeableConcept> useContext;

    /**
     * Explains why this Test Script is needed and why it's been constrained as it has.
     */
    protected StringType requirements;

    /**
     * A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
     */
    protected StringType copyright;

    /**
     * The required capability must exist and are assumed to function correctly on the FHIR server being tested.
     */
    protected TestScriptMetadataComponent metadata;

    /**
     * If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.
     */
    protected BooleanType multiserver;

    /**
     * Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
     */
    protected List<TestScriptFixtureComponent> fixture;

    /**
     * Reference to the profile to be used for validation.
     */
    protected List<Reference> profile;

    /**
     * The actual objects that are the target of the reference (Reference to the profile to be used for validation.)
     */
    protected List<Resource> profileTarget;

    /**
     * Variable is set based either on element value in response body or on header field value in the response headers.
     */
    protected List<TestScriptVariableComponent> variable;

    /**
     * A series of required setup operations before tests are executed.
     */
    protected TestScriptSetupComponent setup;

    /**
     * A test in this script.
     */
    protected List<TestScriptTestComponent> test;

    /**
     * A series of operations required to clean up after the all the tests are executed (successfully or otherwise).
     */
    protected TestScriptTeardownComponent teardown;

    private static final long serialVersionUID = -2049162917L;

    /*
   * Constructor
   */
    public TestScript() {
        super();
    }

    /*
   * Constructor
   */
    public TestScript(UriType url, StringType name, Enumeration<ConformanceResourceStatus> status) {
        super();
        this.url = url;
        this.name = name;
        this.status = status;
    }

    /**
     * @return {@link #url} (An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.url");
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
     * @param value {@link #url} (An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public TestScript setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published.
     */
    public TestScript setUrl(String value) {
        if (this.url == null)
            this.url = new UriType();
        this.url.setValue(value);
        return this;
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.version");
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
     * @param value {@link #version} (The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public TestScript setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually.
     */
    public TestScript setVersion(String value) {
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
     * @return {@link #name} (A free text natural language name identifying the TestScript.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.name");
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
     * @param value {@link #name} (A free text natural language name identifying the TestScript.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public TestScript setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A free text natural language name identifying the TestScript.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A free text natural language name identifying the TestScript.
     */
    public TestScript setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #status} (The status of the TestScript.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ConformanceResourceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.status");
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
     * @param value {@link #status} (The status of the TestScript.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public TestScript setStatusElement(Enumeration<ConformanceResourceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the TestScript.
     */
    public ConformanceResourceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the TestScript.
     */
    public TestScript setStatus(ConformanceResourceStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #identifier} (Identifier for the TestScript assigned for external purposes outside the context of FHIR.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Identifier for the TestScript assigned for external purposes outside the context of FHIR.)
     */
    public TestScript setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #experimental} (This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() {
        if (this.experimental == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.experimental");
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
     * @param value {@link #experimental} (This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public TestScript setExperimentalElement(BooleanType value) {
        this.experimental = value;
        return this;
    }

    /**
     * @return This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public boolean getExperimental() {
        return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public TestScript setExperimental(boolean value) {
        if (this.experimental == null)
            this.experimental = new BooleanType();
        this.experimental.setValue(value);
        return this;
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the Test Script.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() {
        if (this.publisher == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.publisher");
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
     * @param value {@link #publisher} (The name of the individual or organization that published the Test Script.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public TestScript setPublisherElement(StringType value) {
        this.publisher = value;
        return this;
    }

    /**
     * @return The name of the individual or organization that published the Test Script.
     */
    public String getPublisher() {
        return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the Test Script.
     */
    public TestScript setPublisher(String value) {
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
    public List<TestScriptContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<TestScriptContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (TestScriptContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public TestScriptContactComponent addContact() {
        // 3
        TestScriptContactComponent t = new TestScriptContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<TestScriptContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public TestScript addContact(TestScriptContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<TestScriptContactComponent>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #date} (The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.date");
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
     * @param value {@link #date} (The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public TestScript setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change.
     */
    public TestScript setDate(Date value) {
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
     * @return {@link #description} (A free text natural language description of the TestScript and its use.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.description");
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
     * @param value {@link #description} (A free text natural language description of the TestScript and its use.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public TestScript setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A free text natural language description of the TestScript and its use.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the TestScript and its use.
     */
    public TestScript setDescription(String value) {
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts.)
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts.)
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
    public TestScript addUseContext(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.useContext == null)
            this.useContext = new ArrayList<CodeableConcept>();
        this.useContext.add(t);
        return this;
    }

    /**
     * @return {@link #requirements} (Explains why this Test Script is needed and why it's been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public StringType getRequirementsElement() {
        if (this.requirements == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.requirements");
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
     * @param value {@link #requirements} (Explains why this Test Script is needed and why it's been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public TestScript setRequirementsElement(StringType value) {
        this.requirements = value;
        return this;
    }

    /**
     * @return Explains why this Test Script is needed and why it's been constrained as it has.
     */
    public String getRequirements() {
        return this.requirements == null ? null : this.requirements.getValue();
    }

    /**
     * @param value Explains why this Test Script is needed and why it's been constrained as it has.
     */
    public TestScript setRequirements(String value) {
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
     * @return {@link #copyright} (A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public StringType getCopyrightElement() {
        if (this.copyright == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.copyright");
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
     * @param value {@link #copyright} (A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public TestScript setCopyrightElement(StringType value) {
        this.copyright = value;
        return this;
    }

    /**
     * @return A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
     */
    public String getCopyright() {
        return this.copyright == null ? null : this.copyright.getValue();
    }

    /**
     * @param value A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
     */
    public TestScript setCopyright(String value) {
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
     * @return {@link #metadata} (The required capability must exist and are assumed to function correctly on the FHIR server being tested.)
     */
    public TestScriptMetadataComponent getMetadata() {
        if (this.metadata == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.metadata");
            else if (Configuration.doAutoCreate())
                // cc
                this.metadata = new TestScriptMetadataComponent();
        return this.metadata;
    }

    public boolean hasMetadata() {
        return this.metadata != null && !this.metadata.isEmpty();
    }

    /**
     * @param value {@link #metadata} (The required capability must exist and are assumed to function correctly on the FHIR server being tested.)
     */
    public TestScript setMetadata(TestScriptMetadataComponent value) {
        this.metadata = value;
        return this;
    }

    /**
     * @return {@link #multiserver} (If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.). This is the underlying object with id, value and extensions. The accessor "getMultiserver" gives direct access to the value
     */
    public BooleanType getMultiserverElement() {
        if (this.multiserver == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.multiserver");
            else if (Configuration.doAutoCreate())
                // bb
                this.multiserver = new BooleanType();
        return this.multiserver;
    }

    public boolean hasMultiserverElement() {
        return this.multiserver != null && !this.multiserver.isEmpty();
    }

    public boolean hasMultiserver() {
        return this.multiserver != null && !this.multiserver.isEmpty();
    }

    /**
     * @param value {@link #multiserver} (If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.). This is the underlying object with id, value and extensions. The accessor "getMultiserver" gives direct access to the value
     */
    public TestScript setMultiserverElement(BooleanType value) {
        this.multiserver = value;
        return this;
    }

    /**
     * @return If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.
     */
    public boolean getMultiserver() {
        return this.multiserver == null || this.multiserver.isEmpty() ? false : this.multiserver.getValue();
    }

    /**
     * @param value If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.
     */
    public TestScript setMultiserver(boolean value) {
        if (this.multiserver == null)
            this.multiserver = new BooleanType();
        this.multiserver.setValue(value);
        return this;
    }

    /**
     * @return {@link #fixture} (Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.)
     */
    public List<TestScriptFixtureComponent> getFixture() {
        if (this.fixture == null)
            this.fixture = new ArrayList<TestScriptFixtureComponent>();
        return this.fixture;
    }

    public boolean hasFixture() {
        if (this.fixture == null)
            return false;
        for (TestScriptFixtureComponent item : this.fixture) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #fixture} (Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.)
     */
    // syntactic sugar
    public TestScriptFixtureComponent addFixture() {
        // 3
        TestScriptFixtureComponent t = new TestScriptFixtureComponent();
        if (this.fixture == null)
            this.fixture = new ArrayList<TestScriptFixtureComponent>();
        this.fixture.add(t);
        return t;
    }

    // syntactic sugar
    public TestScript addFixture(TestScriptFixtureComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.fixture == null)
            this.fixture = new ArrayList<TestScriptFixtureComponent>();
        this.fixture.add(t);
        return this;
    }

    /**
     * @return {@link #profile} (Reference to the profile to be used for validation.)
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
     * @return {@link #profile} (Reference to the profile to be used for validation.)
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
    public TestScript addProfile(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.profile == null)
            this.profile = new ArrayList<Reference>();
        this.profile.add(t);
        return this;
    }

    /**
     * @return {@link #profile} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Reference to the profile to be used for validation.)
     */
    public List<Resource> getProfileTarget() {
        if (this.profileTarget == null)
            this.profileTarget = new ArrayList<Resource>();
        return this.profileTarget;
    }

    /**
     * @return {@link #variable} (Variable is set based either on element value in response body or on header field value in the response headers.)
     */
    public List<TestScriptVariableComponent> getVariable() {
        if (this.variable == null)
            this.variable = new ArrayList<TestScriptVariableComponent>();
        return this.variable;
    }

    public boolean hasVariable() {
        if (this.variable == null)
            return false;
        for (TestScriptVariableComponent item : this.variable) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #variable} (Variable is set based either on element value in response body or on header field value in the response headers.)
     */
    // syntactic sugar
    public TestScriptVariableComponent addVariable() {
        // 3
        TestScriptVariableComponent t = new TestScriptVariableComponent();
        if (this.variable == null)
            this.variable = new ArrayList<TestScriptVariableComponent>();
        this.variable.add(t);
        return t;
    }

    // syntactic sugar
    public TestScript addVariable(TestScriptVariableComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.variable == null)
            this.variable = new ArrayList<TestScriptVariableComponent>();
        this.variable.add(t);
        return this;
    }

    /**
     * @return {@link #setup} (A series of required setup operations before tests are executed.)
     */
    public TestScriptSetupComponent getSetup() {
        if (this.setup == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.setup");
            else if (Configuration.doAutoCreate())
                // cc
                this.setup = new TestScriptSetupComponent();
        return this.setup;
    }

    public boolean hasSetup() {
        return this.setup != null && !this.setup.isEmpty();
    }

    /**
     * @param value {@link #setup} (A series of required setup operations before tests are executed.)
     */
    public TestScript setSetup(TestScriptSetupComponent value) {
        this.setup = value;
        return this;
    }

    /**
     * @return {@link #test} (A test in this script.)
     */
    public List<TestScriptTestComponent> getTest() {
        if (this.test == null)
            this.test = new ArrayList<TestScriptTestComponent>();
        return this.test;
    }

    public boolean hasTest() {
        if (this.test == null)
            return false;
        for (TestScriptTestComponent item : this.test) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #test} (A test in this script.)
     */
    // syntactic sugar
    public TestScriptTestComponent addTest() {
        // 3
        TestScriptTestComponent t = new TestScriptTestComponent();
        if (this.test == null)
            this.test = new ArrayList<TestScriptTestComponent>();
        this.test.add(t);
        return t;
    }

    // syntactic sugar
    public TestScript addTest(TestScriptTestComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.test == null)
            this.test = new ArrayList<TestScriptTestComponent>();
        this.test.add(t);
        return this;
    }

    /**
     * @return {@link #teardown} (A series of operations required to clean up after the all the tests are executed (successfully or otherwise).)
     */
    public TestScriptTeardownComponent getTeardown() {
        if (this.teardown == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TestScript.teardown");
            else if (Configuration.doAutoCreate())
                // cc
                this.teardown = new TestScriptTeardownComponent();
        return this.teardown;
    }

    public boolean hasTeardown() {
        return this.teardown != null && !this.teardown.isEmpty();
    }

    /**
     * @param value {@link #teardown} (A series of operations required to clean up after the all the tests are executed (successfully or otherwise).)
     */
    public TestScript setTeardown(TestScriptTeardownComponent value) {
        this.teardown = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("url", "uri", "An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("version", "string", "The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("name", "string", "A free text natural language name identifying the TestScript.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("status", "code", "The status of the TestScript.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("identifier", "Identifier", "Identifier for the TestScript assigned for external purposes outside the context of FHIR.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("experimental", "boolean", "This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.", 0, java.lang.Integer.MAX_VALUE, experimental));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the Test Script.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "", "Contacts to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("date", "dateTime", "The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("description", "string", "A free text natural language description of the TestScript and its use.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("useContext", "CodeableConcept", "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts.", 0, java.lang.Integer.MAX_VALUE, useContext));
        childrenList.add(new Property("requirements", "string", "Explains why this Test Script is needed and why it's been constrained as it has.", 0, java.lang.Integer.MAX_VALUE, requirements));
        childrenList.add(new Property("copyright", "string", "A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.", 0, java.lang.Integer.MAX_VALUE, copyright));
        childrenList.add(new Property("metadata", "", "The required capability must exist and are assumed to function correctly on the FHIR server being tested.", 0, java.lang.Integer.MAX_VALUE, metadata));
        childrenList.add(new Property("multiserver", "boolean", "If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.", 0, java.lang.Integer.MAX_VALUE, multiserver));
        childrenList.add(new Property("fixture", "", "Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.", 0, java.lang.Integer.MAX_VALUE, fixture));
        childrenList.add(new Property("profile", "Reference(Any)", "Reference to the profile to be used for validation.", 0, java.lang.Integer.MAX_VALUE, profile));
        childrenList.add(new Property("variable", "", "Variable is set based either on element value in response body or on header field value in the response headers.", 0, java.lang.Integer.MAX_VALUE, variable));
        childrenList.add(new Property("setup", "", "A series of required setup operations before tests are executed.", 0, java.lang.Integer.MAX_VALUE, setup));
        childrenList.add(new Property("test", "", "A test in this script.", 0, java.lang.Integer.MAX_VALUE, test));
        childrenList.add(new Property("teardown", "", "A series of operations required to clean up after the all the tests are executed (successfully or otherwise).", 0, java.lang.Integer.MAX_VALUE, teardown));
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
        else if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("experimental"))
            // BooleanType
            this.experimental = castToBoolean(value);
        else if (name.equals("publisher"))
            // StringType
            this.publisher = castToString(value);
        else if (name.equals("contact"))
            this.getContact().add((TestScriptContactComponent) value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("useContext"))
            this.getUseContext().add(castToCodeableConcept(value));
        else if (name.equals("requirements"))
            // StringType
            this.requirements = castToString(value);
        else if (name.equals("copyright"))
            // StringType
            this.copyright = castToString(value);
        else if (name.equals("metadata"))
            // TestScriptMetadataComponent
            this.metadata = (TestScriptMetadataComponent) value;
        else if (name.equals("multiserver"))
            // BooleanType
            this.multiserver = castToBoolean(value);
        else if (name.equals("fixture"))
            this.getFixture().add((TestScriptFixtureComponent) value);
        else if (name.equals("profile"))
            this.getProfile().add(castToReference(value));
        else if (name.equals("variable"))
            this.getVariable().add((TestScriptVariableComponent) value);
        else if (name.equals("setup"))
            // TestScriptSetupComponent
            this.setup = (TestScriptSetupComponent) value;
        else if (name.equals("test"))
            this.getTest().add((TestScriptTestComponent) value);
        else if (name.equals("teardown"))
            // TestScriptTeardownComponent
            this.teardown = (TestScriptTeardownComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.url");
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.version");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.name");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.status");
        } else if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("experimental")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.experimental");
        } else if (name.equals("publisher")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.publisher");
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.date");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.description");
        } else if (name.equals("useContext")) {
            return addUseContext();
        } else if (name.equals("requirements")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.requirements");
        } else if (name.equals("copyright")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.copyright");
        } else if (name.equals("metadata")) {
            this.metadata = new TestScriptMetadataComponent();
            return this.metadata;
        } else if (name.equals("multiserver")) {
            throw new FHIRException("Cannot call addChild on a primitive type TestScript.multiserver");
        } else if (name.equals("fixture")) {
            return addFixture();
        } else if (name.equals("profile")) {
            return addProfile();
        } else if (name.equals("variable")) {
            return addVariable();
        } else if (name.equals("setup")) {
            this.setup = new TestScriptSetupComponent();
            return this.setup;
        } else if (name.equals("test")) {
            return addTest();
        } else if (name.equals("teardown")) {
            this.teardown = new TestScriptTeardownComponent();
            return this.teardown;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "TestScript";
    }

    public TestScript copy() {
        TestScript dst = new TestScript();
        copyValues(dst);
        dst.url = url == null ? null : url.copy();
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.status = status == null ? null : status.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
            dst.contact = new ArrayList<TestScriptContactComponent>();
            for (TestScriptContactComponent i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.date = date == null ? null : date.copy();
        dst.description = description == null ? null : description.copy();
        if (useContext != null) {
            dst.useContext = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : useContext) dst.useContext.add(i.copy());
        }
        ;
        dst.requirements = requirements == null ? null : requirements.copy();
        dst.copyright = copyright == null ? null : copyright.copy();
        dst.metadata = metadata == null ? null : metadata.copy();
        dst.multiserver = multiserver == null ? null : multiserver.copy();
        if (fixture != null) {
            dst.fixture = new ArrayList<TestScriptFixtureComponent>();
            for (TestScriptFixtureComponent i : fixture) dst.fixture.add(i.copy());
        }
        ;
        if (profile != null) {
            dst.profile = new ArrayList<Reference>();
            for (Reference i : profile) dst.profile.add(i.copy());
        }
        ;
        if (variable != null) {
            dst.variable = new ArrayList<TestScriptVariableComponent>();
            for (TestScriptVariableComponent i : variable) dst.variable.add(i.copy());
        }
        ;
        dst.setup = setup == null ? null : setup.copy();
        if (test != null) {
            dst.test = new ArrayList<TestScriptTestComponent>();
            for (TestScriptTestComponent i : test) dst.test.add(i.copy());
        }
        ;
        dst.teardown = teardown == null ? null : teardown.copy();
        return dst;
    }

    protected TestScript typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScript))
            return false;
        TestScript o = (TestScript) other;
        return compareDeep(url, o.url, true) && compareDeep(version, o.version, true) && compareDeep(name, o.name, true) && compareDeep(status, o.status, true) && compareDeep(identifier, o.identifier, true) && compareDeep(experimental, o.experimental, true) && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(date, o.date, true) && compareDeep(description, o.description, true) && compareDeep(useContext, o.useContext, true) && compareDeep(requirements, o.requirements, true) && compareDeep(copyright, o.copyright, true) && compareDeep(metadata, o.metadata, true) && compareDeep(multiserver, o.multiserver, true) && compareDeep(fixture, o.fixture, true) && compareDeep(profile, o.profile, true) && compareDeep(variable, o.variable, true) && compareDeep(setup, o.setup, true) && compareDeep(test, o.test, true) && compareDeep(teardown, o.teardown, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScript))
            return false;
        TestScript o = (TestScript) other;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true) && compareValues(status, o.status, true) && compareValues(experimental, o.experimental, true) && compareValues(publisher, o.publisher, true) && compareValues(date, o.date, true) && compareValues(description, o.description, true) && compareValues(requirements, o.requirements, true) && compareValues(copyright, o.copyright, true) && compareValues(multiserver, o.multiserver, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (url == null || url.isEmpty()) && (version == null || version.isEmpty()) && (name == null || name.isEmpty()) && (status == null || status.isEmpty()) && (identifier == null || identifier.isEmpty()) && (experimental == null || experimental.isEmpty()) && (publisher == null || publisher.isEmpty()) && (contact == null || contact.isEmpty()) && (date == null || date.isEmpty()) && (description == null || description.isEmpty()) && (useContext == null || useContext.isEmpty()) && (requirements == null || requirements.isEmpty()) && (copyright == null || copyright.isEmpty()) && (metadata == null || metadata.isEmpty()) && (multiserver == null || multiserver.isEmpty()) && (fixture == null || fixture.isEmpty()) && (profile == null || profile.isEmpty()) && (variable == null || variable.isEmpty()) && (setup == null || setup.isEmpty()) && (test == null || test.isEmpty()) && (teardown == null || teardown.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.TestScript;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_TESTSCRIPTTESTCAPABILITY = "testscript-test-capability";

    public static final String SP_TESTSCRIPTSETUPCAPABILITY = "testscript-setup-capability";

    public static final String SP_NAME = "name";

    public static final String SP_DESCRIPTION = "description";

    public static final String SP_TESTSCRIPTCAPABILITY = "testscript-capability";

    public static final String SP_URL = "url";
}
