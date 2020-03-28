package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConceptMapEquivalence;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConceptMapEquivalenceEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
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
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 */
public class ConceptMap extends DomainResource {

    /**
     * An absolute URL that is used to identify this concept map when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this concept map is (or will be) published.
     */
    protected UriType url;

    /**
     * Formal identifier that is used to identify this concept map when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    protected Identifier identifier;

    /**
     * The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    protected StringType version;

    /**
     * A free text natural language name describing the concept map.
     */
    protected StringType name;

    /**
     * The status of the concept map.
     */
    protected Enumeration<ConformanceResourceStatus> status;

    /**
     * This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    protected BooleanType experimental;

    /**
     * The name of the individual or organization that published the concept map.
     */
    protected StringType publisher;

    /**
     * Contacts to assist a user in finding and communicating with the publisher.
     */
    protected List<ConceptMapContactComponent> contact;

    /**
     * The date this version of the concept map was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the concept map changes.
     */
    protected DateTimeType date;

    /**
     * A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc.
     */
    protected StringType description;

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of concept map instances.
     */
    protected List<CodeableConcept> useContext;

    /**
     * Explains why this concept map is needed and why it has been constrained as it has.
     */
    protected StringType requirements;

    /**
     * A copyright statement relating to the concept map and/or its contents.
     */
    protected StringType copyright;

    /**
     * The source value set that specifies the concepts that are being mapped.
     */
    protected Type source;

    /**
     * The target value set provides context to the mappings. Note that the mapping is made between concepts, not between value sets, but the value set provides important context about how the concept mapping choices are made.
     */
    protected Type target;

    /**
     * Mappings for an individual concept in the source to one or more concepts in the target.
     */
    protected List<SourceElementComponent> element;

    private static final long serialVersionUID = 1687563642L;

    /*
   * Constructor
   */
    public ConceptMap() {
        super();
    }

    /*
   * Constructor
   */
    public ConceptMap(Enumeration<ConformanceResourceStatus> status, Type source, Type target) {
        super();
        this.status = status;
        this.source = source;
        this.target = target;
    }

    /**
     * @return {@link #url} (An absolute URL that is used to identify this concept map when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this concept map is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.url");
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
     * @param value {@link #url} (An absolute URL that is used to identify this concept map when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this concept map is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public ConceptMap setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return An absolute URL that is used to identify this concept map when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this concept map is (or will be) published.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URL that is used to identify this concept map when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this concept map is (or will be) published.
     */
    public ConceptMap setUrl(String value) {
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
     * @return {@link #identifier} (Formal identifier that is used to identify this concept map when it is represented in other formats, or referenced in a specification, model, design or an instance.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Formal identifier that is used to identify this concept map when it is represented in other formats, or referenced in a specification, model, design or an instance.)
     */
    public ConceptMap setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.version");
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
     * @param value {@link #version} (The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public ConceptMap setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
     */
    public ConceptMap setVersion(String value) {
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
     * @return {@link #name} (A free text natural language name describing the concept map.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.name");
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
     * @param value {@link #name} (A free text natural language name describing the concept map.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ConceptMap setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A free text natural language name describing the concept map.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A free text natural language name describing the concept map.
     */
    public ConceptMap setName(String value) {
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
     * @return {@link #status} (The status of the concept map.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ConformanceResourceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.status");
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
     * @param value {@link #status} (The status of the concept map.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ConceptMap setStatusElement(Enumeration<ConformanceResourceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the concept map.
     */
    public ConformanceResourceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the concept map.
     */
    public ConceptMap setStatus(ConformanceResourceStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #experimental} (This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() {
        if (this.experimental == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.experimental");
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
     * @param value {@link #experimental} (This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public ConceptMap setExperimentalElement(BooleanType value) {
        this.experimental = value;
        return this;
    }

    /**
     * @return This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public boolean getExperimental() {
        return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public ConceptMap setExperimental(boolean value) {
        if (this.experimental == null)
            this.experimental = new BooleanType();
        this.experimental.setValue(value);
        return this;
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the concept map.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() {
        if (this.publisher == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.publisher");
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
     * @param value {@link #publisher} (The name of the individual or organization that published the concept map.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public ConceptMap setPublisherElement(StringType value) {
        this.publisher = value;
        return this;
    }

    /**
     * @return The name of the individual or organization that published the concept map.
     */
    public String getPublisher() {
        return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the concept map.
     */
    public ConceptMap setPublisher(String value) {
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
    public List<ConceptMapContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<ConceptMapContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (ConceptMapContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public ConceptMapContactComponent addContact() {
        // 3
        ConceptMapContactComponent t = new ConceptMapContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<ConceptMapContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public ConceptMap addContact(ConceptMapContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<ConceptMapContactComponent>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #date} (The date this version of the concept map was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the concept map changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.date");
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
     * @param value {@link #date} (The date this version of the concept map was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the concept map changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ConceptMap setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date this version of the concept map was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the concept map changes.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date this version of the concept map was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the concept map changes.
     */
    public ConceptMap setDate(Date value) {
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
     * @return {@link #description} (A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.description");
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
     * @param value {@link #description} (A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ConceptMap setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc.
     */
    public ConceptMap setDescription(String value) {
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of concept map instances.)
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of concept map instances.)
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
    public ConceptMap addUseContext(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.useContext == null)
            this.useContext = new ArrayList<CodeableConcept>();
        this.useContext.add(t);
        return this;
    }

    /**
     * @return {@link #requirements} (Explains why this concept map is needed and why it has been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public StringType getRequirementsElement() {
        if (this.requirements == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.requirements");
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
     * @param value {@link #requirements} (Explains why this concept map is needed and why it has been constrained as it has.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public ConceptMap setRequirementsElement(StringType value) {
        this.requirements = value;
        return this;
    }

    /**
     * @return Explains why this concept map is needed and why it has been constrained as it has.
     */
    public String getRequirements() {
        return this.requirements == null ? null : this.requirements.getValue();
    }

    /**
     * @param value Explains why this concept map is needed and why it has been constrained as it has.
     */
    public ConceptMap setRequirements(String value) {
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
     * @return {@link #copyright} (A copyright statement relating to the concept map and/or its contents.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public StringType getCopyrightElement() {
        if (this.copyright == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptMap.copyright");
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
     * @param value {@link #copyright} (A copyright statement relating to the concept map and/or its contents.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public ConceptMap setCopyrightElement(StringType value) {
        this.copyright = value;
        return this;
    }

    /**
     * @return A copyright statement relating to the concept map and/or its contents.
     */
    public String getCopyright() {
        return this.copyright == null ? null : this.copyright.getValue();
    }

    /**
     * @param value A copyright statement relating to the concept map and/or its contents.
     */
    public ConceptMap setCopyright(String value) {
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
     * @return {@link #source} (The source value set that specifies the concepts that are being mapped.)
     */
    public Type getSource() {
        return this.source;
    }

    /**
     * @return {@link #source} (The source value set that specifies the concepts that are being mapped.)
     */
    public UriType getSourceUriType() throws FHIRException {
        if (!(this.source instanceof UriType))
            throw new FHIRException("Type mismatch: the type UriType was expected, but " + this.source.getClass().getName() + " was encountered");
        return (UriType) this.source;
    }

    public boolean hasSourceUriType() {
        return this.source instanceof UriType;
    }

    /**
     * @return {@link #source} (The source value set that specifies the concepts that are being mapped.)
     */
    public Reference getSourceReference() throws FHIRException {
        if (!(this.source instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.source.getClass().getName() + " was encountered");
        return (Reference) this.source;
    }

    public boolean hasSourceReference() {
        return this.source instanceof Reference;
    }

    public boolean hasSource() {
        return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (The source value set that specifies the concepts that are being mapped.)
     */
    public ConceptMap setSource(Type value) {
        this.source = value;
        return this;
    }

    /**
     * @return {@link #target} (The target value set provides context to the mappings. Note that the mapping is made between concepts, not between value sets, but the value set provides important context about how the concept mapping choices are made.)
     */
    public Type getTarget() {
        return this.target;
    }

    /**
     * @return {@link #target} (The target value set provides context to the mappings. Note that the mapping is made between concepts, not between value sets, but the value set provides important context about how the concept mapping choices are made.)
     */
    public UriType getTargetUriType() throws FHIRException {
        if (!(this.target instanceof UriType))
            throw new FHIRException("Type mismatch: the type UriType was expected, but " + this.target.getClass().getName() + " was encountered");
        return (UriType) this.target;
    }

    public boolean hasTargetUriType() {
        return this.target instanceof UriType;
    }

    /**
     * @return {@link #target} (The target value set provides context to the mappings. Note that the mapping is made between concepts, not between value sets, but the value set provides important context about how the concept mapping choices are made.)
     */
    public Reference getTargetReference() throws FHIRException {
        if (!(this.target instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.target.getClass().getName() + " was encountered");
        return (Reference) this.target;
    }

    public boolean hasTargetReference() {
        return this.target instanceof Reference;
    }

    public boolean hasTarget() {
        return this.target != null && !this.target.isEmpty();
    }

    /**
     * @param value {@link #target} (The target value set provides context to the mappings. Note that the mapping is made between concepts, not between value sets, but the value set provides important context about how the concept mapping choices are made.)
     */
    public ConceptMap setTarget(Type value) {
        this.target = value;
        return this;
    }

    /**
     * @return {@link #element} (Mappings for an individual concept in the source to one or more concepts in the target.)
     */
    public List<SourceElementComponent> getElement() {
        if (this.element == null)
            this.element = new ArrayList<SourceElementComponent>();
        return this.element;
    }

    public boolean hasElement() {
        if (this.element == null)
            return false;
        for (SourceElementComponent item : this.element) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #element} (Mappings for an individual concept in the source to one or more concepts in the target.)
     */
    // syntactic sugar
    public SourceElementComponent addElement() {
        // 3
        SourceElementComponent t = new SourceElementComponent();
        if (this.element == null)
            this.element = new ArrayList<SourceElementComponent>();
        this.element.add(t);
        return t;
    }

    // syntactic sugar
    public ConceptMap addElement(SourceElementComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.element == null)
            this.element = new ArrayList<SourceElementComponent>();
        this.element.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("url", "uri", "An absolute URL that is used to identify this concept map when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this concept map is (or will be) published.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("identifier", "Identifier", "Formal identifier that is used to identify this concept map when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("version", "string", "The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("name", "string", "A free text natural language name describing the concept map.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("status", "code", "The status of the concept map.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("experimental", "boolean", "This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.", 0, java.lang.Integer.MAX_VALUE, experimental));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the concept map.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "", "Contacts to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("date", "dateTime", "The date this version of the concept map was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the concept map changes.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("description", "string", "A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("useContext", "CodeableConcept", "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of concept map instances.", 0, java.lang.Integer.MAX_VALUE, useContext));
        childrenList.add(new Property("requirements", "string", "Explains why this concept map is needed and why it has been constrained as it has.", 0, java.lang.Integer.MAX_VALUE, requirements));
        childrenList.add(new Property("copyright", "string", "A copyright statement relating to the concept map and/or its contents.", 0, java.lang.Integer.MAX_VALUE, copyright));
        childrenList.add(new Property("source[x]", "uri|Reference(ValueSet|StructureDefinition)", "The source value set that specifies the concepts that are being mapped.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("target[x]", "uri|Reference(ValueSet|StructureDefinition)", "The target value set provides context to the mappings. Note that the mapping is made between concepts, not between value sets, but the value set provides important context about how the concept mapping choices are made.", 0, java.lang.Integer.MAX_VALUE, target));
        childrenList.add(new Property("element", "", "Mappings for an individual concept in the source to one or more concepts in the target.", 0, java.lang.Integer.MAX_VALUE, element));
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
            this.getContact().add((ConceptMapContactComponent) value);
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
        else if (name.equals("source[x]"))
            // Type
            this.source = (Type) value;
        else if (name.equals("target[x]"))
            // Type
            this.target = (Type) value;
        else if (name.equals("element"))
            this.getElement().add((SourceElementComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.url");
        } else if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.version");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.name");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.status");
        } else if (name.equals("experimental")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.experimental");
        } else if (name.equals("publisher")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.publisher");
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.date");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.description");
        } else if (name.equals("useContext")) {
            return addUseContext();
        } else if (name.equals("requirements")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.requirements");
        } else if (name.equals("copyright")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.copyright");
        } else if (name.equals("sourceUri")) {
            this.source = new UriType();
            return this.source;
        } else if (name.equals("sourceReference")) {
            this.source = new Reference();
            return this.source;
        } else if (name.equals("targetUri")) {
            this.target = new UriType();
            return this.target;
        } else if (name.equals("targetReference")) {
            this.target = new Reference();
            return this.target;
        } else if (name.equals("element")) {
            return addElement();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ConceptMap";
    }

    public ConceptMap copy() {
        ConceptMap dst = new ConceptMap();
        copyValues(dst);
        dst.url = url == null ? null : url.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.status = status == null ? null : status.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
            dst.contact = new ArrayList<ConceptMapContactComponent>();
            for (ConceptMapContactComponent i : contact) dst.contact.add(i.copy());
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
        dst.source = source == null ? null : source.copy();
        dst.target = target == null ? null : target.copy();
        if (element != null) {
            dst.element = new ArrayList<SourceElementComponent>();
            for (SourceElementComponent i : element) dst.element.add(i.copy());
        }
        ;
        return dst;
    }

    protected ConceptMap typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConceptMap))
            return false;
        ConceptMap o = (ConceptMap) other;
        return compareDeep(url, o.url, true) && compareDeep(identifier, o.identifier, true) && compareDeep(version, o.version, true) && compareDeep(name, o.name, true) && compareDeep(status, o.status, true) && compareDeep(experimental, o.experimental, true) && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(date, o.date, true) && compareDeep(description, o.description, true) && compareDeep(useContext, o.useContext, true) && compareDeep(requirements, o.requirements, true) && compareDeep(copyright, o.copyright, true) && compareDeep(source, o.source, true) && compareDeep(target, o.target, true) && compareDeep(element, o.element, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConceptMap))
            return false;
        ConceptMap o = (ConceptMap) other;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true) && compareValues(status, o.status, true) && compareValues(experimental, o.experimental, true) && compareValues(publisher, o.publisher, true) && compareValues(date, o.date, true) && compareValues(description, o.description, true) && compareValues(requirements, o.requirements, true) && compareValues(copyright, o.copyright, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (url == null || url.isEmpty()) && (identifier == null || identifier.isEmpty()) && (version == null || version.isEmpty()) && (name == null || name.isEmpty()) && (status == null || status.isEmpty()) && (experimental == null || experimental.isEmpty()) && (publisher == null || publisher.isEmpty()) && (contact == null || contact.isEmpty()) && (date == null || date.isEmpty()) && (description == null || description.isEmpty()) && (useContext == null || useContext.isEmpty()) && (requirements == null || requirements.isEmpty()) && (copyright == null || copyright.isEmpty()) && (source == null || source.isEmpty()) && (target == null || target.isEmpty()) && (element == null || element.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ConceptMap;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PRODUCT = "product";

    public static final String SP_DEPENDSON = "dependson";

    public static final String SP_DESCRIPTION = "description";

    public static final String SP_TARGETSYSTEM = "targetsystem";

    public static final String SP_SOURCE = "source";

    public static final String SP_VERSION = "version";

    public static final String SP_SOURCESYSTEM = "sourcesystem";

    public static final String SP_URL = "url";

    public static final String SP_TARGET = "target";

    public static final String SP_SOURCECODE = "sourcecode";

    public static final String SP_SOURCEURI = "sourceuri";

    public static final String SP_NAME = "name";

    public static final String SP_CONTEXT = "context";

    public static final String SP_PUBLISHER = "publisher";

    public static final String SP_TARGETCODE = "targetcode";

    public static final String SP_STATUS = "status";
}
