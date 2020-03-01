package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideResourcePurpose;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideResourcePurposeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideDependencyType;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideDependencyTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuidePageKind;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuidePageKindEnumFactory;

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
 * A set of rules or how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole, and to publish a computable definition of all the parts.
 */
public class ImplementationGuide extends DomainResource {

    /**
     * An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published.
     */
    protected UriType url;

    /**
     * The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually.
     */
    protected StringType version;

    /**
     * A free text natural language name identifying the Implementation Guide.
     */
    protected StringType name;

    /**
     * The status of the Implementation Guide.
     */
    protected Enumeration<ConformanceResourceStatus> status;

    /**
     * This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    protected BooleanType experimental;

    /**
     * The name of the individual or organization that published the implementation guide.
     */
    protected StringType publisher;

    /**
     * Contacts to assist a user in finding and communicating with the publisher.
     */
    protected List<ImplementationGuideContactComponent> contact;

    /**
     * The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.
     */
    protected DateTimeType date;

    /**
     * A free text natural language description of the Implementation Guide and its use.
     */
    protected StringType description;

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of implementation guides. The most common use of this element is to represent the country / jurisdiction for which this implementation guide was defined.
     */
    protected List<CodeableConcept> useContext;

    /**
     * A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
     */
    protected StringType copyright;

    /**
     * The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 1.0.2 for this version.
     */
    protected IdType fhirVersion;

    /**
     * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.
     */
    protected List<ImplementationGuideDependencyComponent> dependency;

    /**
     * A logical group of resources. Logical groups can be used when building pages.
     */
    protected List<ImplementationGuidePackageComponent> package_;

    /**
     * A set of profiles that all resources covered by this implementation guide must conform to.
     */
    protected List<ImplementationGuideGlobalComponent> global;

    /**
     * A binary file that is included in the  implementation guide when it is published.
     */
    protected List<UriType> binary;

    /**
     * A page / section in the implementation guide. The root page is the implementation guide home page.
     */
    protected ImplementationGuidePageComponent page;

    private static final long serialVersionUID = 1150122415L;

    /*
   * Constructor
   */
    public ImplementationGuide() {
        super();
    }

    /*
   * Constructor
   */
    public ImplementationGuide(UriType url, StringType name, Enumeration<ConformanceResourceStatus> status, ImplementationGuidePageComponent page) {
        super();
        this.url = url;
        this.name = name;
        this.status = status;
        this.page = page;
    }

    /**
     * @return {@link #url} (An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.url");
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
     * @param value {@link #url} (An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public ImplementationGuide setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published.
     */
    public ImplementationGuide setUrl(String value) {
        if (this.url == null)
            this.url = new UriType();
        this.url.setValue(value);
        return this;
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.version");
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
     * @param value {@link #version} (The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public ImplementationGuide setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually.
     */
    public ImplementationGuide setVersion(String value) {
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
     * @return {@link #name} (A free text natural language name identifying the Implementation Guide.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.name");
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
     * @param value {@link #name} (A free text natural language name identifying the Implementation Guide.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ImplementationGuide setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A free text natural language name identifying the Implementation Guide.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A free text natural language name identifying the Implementation Guide.
     */
    public ImplementationGuide setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #status} (The status of the Implementation Guide.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ConformanceResourceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.status");
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
     * @param value {@link #status} (The status of the Implementation Guide.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ImplementationGuide setStatusElement(Enumeration<ConformanceResourceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the Implementation Guide.
     */
    public ConformanceResourceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the Implementation Guide.
     */
    public ImplementationGuide setStatus(ConformanceResourceStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #experimental} (This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() {
        if (this.experimental == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.experimental");
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
     * @param value {@link #experimental} (This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public ImplementationGuide setExperimentalElement(BooleanType value) {
        this.experimental = value;
        return this;
    }

    /**
     * @return This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public boolean getExperimental() {
        return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public ImplementationGuide setExperimental(boolean value) {
        if (this.experimental == null)
            this.experimental = new BooleanType();
        this.experimental.setValue(value);
        return this;
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the implementation guide.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() {
        if (this.publisher == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.publisher");
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
     * @param value {@link #publisher} (The name of the individual or organization that published the implementation guide.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public ImplementationGuide setPublisherElement(StringType value) {
        this.publisher = value;
        return this;
    }

    /**
     * @return The name of the individual or organization that published the implementation guide.
     */
    public String getPublisher() {
        return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the implementation guide.
     */
    public ImplementationGuide setPublisher(String value) {
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
    public List<ImplementationGuideContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<ImplementationGuideContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (ImplementationGuideContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public ImplementationGuideContactComponent addContact() {
        // 3
        ImplementationGuideContactComponent t = new ImplementationGuideContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<ImplementationGuideContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public ImplementationGuide addContact(ImplementationGuideContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<ImplementationGuideContactComponent>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #date} (The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.date");
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
     * @param value {@link #date} (The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ImplementationGuide setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.
     */
    public ImplementationGuide setDate(Date value) {
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
     * @return {@link #description} (A free text natural language description of the Implementation Guide and its use.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.description");
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
     * @param value {@link #description} (A free text natural language description of the Implementation Guide and its use.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ImplementationGuide setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A free text natural language description of the Implementation Guide and its use.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the Implementation Guide and its use.
     */
    public ImplementationGuide setDescription(String value) {
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of implementation guides. The most common use of this element is to represent the country / jurisdiction for which this implementation guide was defined.)
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of implementation guides. The most common use of this element is to represent the country / jurisdiction for which this implementation guide was defined.)
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
    public ImplementationGuide addUseContext(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.useContext == null)
            this.useContext = new ArrayList<CodeableConcept>();
        this.useContext.add(t);
        return this;
    }

    /**
     * @return {@link #copyright} (A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public StringType getCopyrightElement() {
        if (this.copyright == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.copyright");
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
     * @param value {@link #copyright} (A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public ImplementationGuide setCopyrightElement(StringType value) {
        this.copyright = value;
        return this;
    }

    /**
     * @return A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
     */
    public String getCopyright() {
        return this.copyright == null ? null : this.copyright.getValue();
    }

    /**
     * @param value A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
     */
    public ImplementationGuide setCopyright(String value) {
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
     * @return {@link #fhirVersion} (The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 1.0.2 for this version.). This is the underlying object with id, value and extensions. The accessor "getFhirVersion" gives direct access to the value
     */
    public IdType getFhirVersionElement() {
        if (this.fhirVersion == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.fhirVersion");
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
     * @param value {@link #fhirVersion} (The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 1.0.2 for this version.). This is the underlying object with id, value and extensions. The accessor "getFhirVersion" gives direct access to the value
     */
    public ImplementationGuide setFhirVersionElement(IdType value) {
        this.fhirVersion = value;
        return this;
    }

    /**
     * @return The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 1.0.2 for this version.
     */
    public String getFhirVersion() {
        return this.fhirVersion == null ? null : this.fhirVersion.getValue();
    }

    /**
     * @param value The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 1.0.2 for this version.
     */
    public ImplementationGuide setFhirVersion(String value) {
        if (Utilities.noString(value))
            this.fhirVersion = null;
        else {
            if (this.fhirVersion == null)
                this.fhirVersion = new IdType();
            this.fhirVersion.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #dependency} (Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.)
     */
    public List<ImplementationGuideDependencyComponent> getDependency() {
        if (this.dependency == null)
            this.dependency = new ArrayList<ImplementationGuideDependencyComponent>();
        return this.dependency;
    }

    public boolean hasDependency() {
        if (this.dependency == null)
            return false;
        for (ImplementationGuideDependencyComponent item : this.dependency) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #dependency} (Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.)
     */
    // syntactic sugar
    public ImplementationGuideDependencyComponent addDependency() {
        // 3
        ImplementationGuideDependencyComponent t = new ImplementationGuideDependencyComponent();
        if (this.dependency == null)
            this.dependency = new ArrayList<ImplementationGuideDependencyComponent>();
        this.dependency.add(t);
        return t;
    }

    // syntactic sugar
    public ImplementationGuide addDependency(ImplementationGuideDependencyComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.dependency == null)
            this.dependency = new ArrayList<ImplementationGuideDependencyComponent>();
        this.dependency.add(t);
        return this;
    }

    /**
     * @return {@link #package_} (A logical group of resources. Logical groups can be used when building pages.)
     */
    public List<ImplementationGuidePackageComponent> getPackage() {
        if (this.package_ == null)
            this.package_ = new ArrayList<ImplementationGuidePackageComponent>();
        return this.package_;
    }

    public boolean hasPackage() {
        if (this.package_ == null)
            return false;
        for (ImplementationGuidePackageComponent item : this.package_) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #package_} (A logical group of resources. Logical groups can be used when building pages.)
     */
    // syntactic sugar
    public ImplementationGuidePackageComponent addPackage() {
        // 3
        ImplementationGuidePackageComponent t = new ImplementationGuidePackageComponent();
        if (this.package_ == null)
            this.package_ = new ArrayList<ImplementationGuidePackageComponent>();
        this.package_.add(t);
        return t;
    }

    // syntactic sugar
    public ImplementationGuide addPackage(ImplementationGuidePackageComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.package_ == null)
            this.package_ = new ArrayList<ImplementationGuidePackageComponent>();
        this.package_.add(t);
        return this;
    }

    /**
     * @return {@link #global} (A set of profiles that all resources covered by this implementation guide must conform to.)
     */
    public List<ImplementationGuideGlobalComponent> getGlobal() {
        if (this.global == null)
            this.global = new ArrayList<ImplementationGuideGlobalComponent>();
        return this.global;
    }

    public boolean hasGlobal() {
        if (this.global == null)
            return false;
        for (ImplementationGuideGlobalComponent item : this.global) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #global} (A set of profiles that all resources covered by this implementation guide must conform to.)
     */
    // syntactic sugar
    public ImplementationGuideGlobalComponent addGlobal() {
        // 3
        ImplementationGuideGlobalComponent t = new ImplementationGuideGlobalComponent();
        if (this.global == null)
            this.global = new ArrayList<ImplementationGuideGlobalComponent>();
        this.global.add(t);
        return t;
    }

    // syntactic sugar
    public ImplementationGuide addGlobal(ImplementationGuideGlobalComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.global == null)
            this.global = new ArrayList<ImplementationGuideGlobalComponent>();
        this.global.add(t);
        return this;
    }

    /**
     * @return {@link #binary} (A binary file that is included in the  implementation guide when it is published.)
     */
    public List<UriType> getBinary() {
        if (this.binary == null)
            this.binary = new ArrayList<UriType>();
        return this.binary;
    }

    public boolean hasBinary() {
        if (this.binary == null)
            return false;
        for (UriType item : this.binary) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #binary} (A binary file that is included in the  implementation guide when it is published.)
     */
    // syntactic sugar
    public UriType addBinaryElement() {
        // 2
        UriType t = new UriType();
        if (this.binary == null)
            this.binary = new ArrayList<UriType>();
        this.binary.add(t);
        return t;
    }

    /**
     * @param value {@link #binary} (A binary file that is included in the  implementation guide when it is published.)
     */
    public ImplementationGuide addBinary(String value) {
        // 1
        UriType t = new UriType();
        t.setValue(value);
        if (this.binary == null)
            this.binary = new ArrayList<UriType>();
        this.binary.add(t);
        return this;
    }

    /**
     * @param value {@link #binary} (A binary file that is included in the  implementation guide when it is published.)
     */
    public boolean hasBinary(String value) {
        if (this.binary == null)
            return false;
        for (UriType v : this.binary) if (// uri
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #page} (A page / section in the implementation guide. The root page is the implementation guide home page.)
     */
    public ImplementationGuidePageComponent getPage() {
        if (this.page == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuide.page");
            else if (Configuration.doAutoCreate())
                // cc
                this.page = new ImplementationGuidePageComponent();
        return this.page;
    }

    public boolean hasPage() {
        return this.page != null && !this.page.isEmpty();
    }

    /**
     * @param value {@link #page} (A page / section in the implementation guide. The root page is the implementation guide home page.)
     */
    public ImplementationGuide setPage(ImplementationGuidePageComponent value) {
        this.page = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("url", "uri", "An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("version", "string", "The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("name", "string", "A free text natural language name identifying the Implementation Guide.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("status", "code", "The status of the Implementation Guide.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("experimental", "boolean", "This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.", 0, java.lang.Integer.MAX_VALUE, experimental));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the implementation guide.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "", "Contacts to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("date", "dateTime", "The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("description", "string", "A free text natural language description of the Implementation Guide and its use.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("useContext", "CodeableConcept", "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of implementation guides. The most common use of this element is to represent the country / jurisdiction for which this implementation guide was defined.", 0, java.lang.Integer.MAX_VALUE, useContext));
        childrenList.add(new Property("copyright", "string", "A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.", 0, java.lang.Integer.MAX_VALUE, copyright));
        childrenList.add(new Property("fhirVersion", "id", "The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 1.0.2 for this version.", 0, java.lang.Integer.MAX_VALUE, fhirVersion));
        childrenList.add(new Property("dependency", "", "Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.", 0, java.lang.Integer.MAX_VALUE, dependency));
        childrenList.add(new Property("package", "", "A logical group of resources. Logical groups can be used when building pages.", 0, java.lang.Integer.MAX_VALUE, package_));
        childrenList.add(new Property("global", "", "A set of profiles that all resources covered by this implementation guide must conform to.", 0, java.lang.Integer.MAX_VALUE, global));
        childrenList.add(new Property("binary", "uri", "A binary file that is included in the  implementation guide when it is published.", 0, java.lang.Integer.MAX_VALUE, binary));
        childrenList.add(new Property("page", "", "A page / section in the implementation guide. The root page is the implementation guide home page.", 0, java.lang.Integer.MAX_VALUE, page));
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
            this.getContact().add((ImplementationGuideContactComponent) value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("useContext"))
            this.getUseContext().add(castToCodeableConcept(value));
        else if (name.equals("copyright"))
            // StringType
            this.copyright = castToString(value);
        else if (name.equals("fhirVersion"))
            // IdType
            this.fhirVersion = castToId(value);
        else if (name.equals("dependency"))
            this.getDependency().add((ImplementationGuideDependencyComponent) value);
        else if (name.equals("package"))
            this.getPackage().add((ImplementationGuidePackageComponent) value);
        else if (name.equals("global"))
            this.getGlobal().add((ImplementationGuideGlobalComponent) value);
        else if (name.equals("binary"))
            this.getBinary().add(castToUri(value));
        else if (name.equals("page"))
            // ImplementationGuidePageComponent
            this.page = (ImplementationGuidePageComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.url");
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.version");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.name");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.status");
        } else if (name.equals("experimental")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.experimental");
        } else if (name.equals("publisher")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.publisher");
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.date");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.description");
        } else if (name.equals("useContext")) {
            return addUseContext();
        } else if (name.equals("copyright")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.copyright");
        } else if (name.equals("fhirVersion")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.fhirVersion");
        } else if (name.equals("dependency")) {
            return addDependency();
        } else if (name.equals("package")) {
            return addPackage();
        } else if (name.equals("global")) {
            return addGlobal();
        } else if (name.equals("binary")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.binary");
        } else if (name.equals("page")) {
            this.page = new ImplementationGuidePageComponent();
            return this.page;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ImplementationGuide";
    }

    public ImplementationGuide copy() {
        ImplementationGuide dst = new ImplementationGuide();
        copyValues(dst);
        dst.url = url == null ? null : url.copy();
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.status = status == null ? null : status.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
            dst.contact = new ArrayList<ImplementationGuideContactComponent>();
            for (ImplementationGuideContactComponent i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.date = date == null ? null : date.copy();
        dst.description = description == null ? null : description.copy();
        if (useContext != null) {
            dst.useContext = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : useContext) dst.useContext.add(i.copy());
        }
        ;
        dst.copyright = copyright == null ? null : copyright.copy();
        dst.fhirVersion = fhirVersion == null ? null : fhirVersion.copy();
        if (dependency != null) {
            dst.dependency = new ArrayList<ImplementationGuideDependencyComponent>();
            for (ImplementationGuideDependencyComponent i : dependency) dst.dependency.add(i.copy());
        }
        ;
        if (package_ != null) {
            dst.package_ = new ArrayList<ImplementationGuidePackageComponent>();
            for (ImplementationGuidePackageComponent i : package_) dst.package_.add(i.copy());
        }
        ;
        if (global != null) {
            dst.global = new ArrayList<ImplementationGuideGlobalComponent>();
            for (ImplementationGuideGlobalComponent i : global) dst.global.add(i.copy());
        }
        ;
        if (binary != null) {
            dst.binary = new ArrayList<UriType>();
            for (UriType i : binary) dst.binary.add(i.copy());
        }
        ;
        dst.page = page == null ? null : page.copy();
        return dst;
    }

    protected ImplementationGuide typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImplementationGuide))
            return false;
        ImplementationGuide o = (ImplementationGuide) other;
        return compareDeep(url, o.url, true) && compareDeep(version, o.version, true) && compareDeep(name, o.name, true) && compareDeep(status, o.status, true) && compareDeep(experimental, o.experimental, true) && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(date, o.date, true) && compareDeep(description, o.description, true) && compareDeep(useContext, o.useContext, true) && compareDeep(copyright, o.copyright, true) && compareDeep(fhirVersion, o.fhirVersion, true) && compareDeep(dependency, o.dependency, true) && compareDeep(package_, o.package_, true) && compareDeep(global, o.global, true) && compareDeep(binary, o.binary, true) && compareDeep(page, o.page, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImplementationGuide))
            return false;
        ImplementationGuide o = (ImplementationGuide) other;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true) && compareValues(status, o.status, true) && compareValues(experimental, o.experimental, true) && compareValues(publisher, o.publisher, true) && compareValues(date, o.date, true) && compareValues(description, o.description, true) && compareValues(copyright, o.copyright, true) && compareValues(fhirVersion, o.fhirVersion, true) && compareValues(binary, o.binary, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (url == null || url.isEmpty()) && (version == null || version.isEmpty()) && (name == null || name.isEmpty()) && (status == null || status.isEmpty()) && (experimental == null || experimental.isEmpty()) && (publisher == null || publisher.isEmpty()) && (contact == null || contact.isEmpty()) && (date == null || date.isEmpty()) && (description == null || description.isEmpty()) && (useContext == null || useContext.isEmpty()) && (copyright == null || copyright.isEmpty()) && (fhirVersion == null || fhirVersion.isEmpty()) && (dependency == null || dependency.isEmpty()) && (package_ == null || package_.isEmpty()) && (global == null || global.isEmpty()) && (binary == null || binary.isEmpty()) && (page == null || page.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ImplementationGuide;
    }

    public static final String SP_DATE = "date";

    public static final String SP_DEPENDENCY = "dependency";

    public static final String SP_NAME = "name";

    public static final String SP_CONTEXT = "context";

    public static final String SP_PUBLISHER = "publisher";

    public static final String SP_DESCRIPTION = "description";

    public static final String SP_EXPERIMENTAL = "experimental";

    public static final String SP_VERSION = "version";

    public static final String SP_URL = "url";

    public static final String SP_STATUS = "status";
}
