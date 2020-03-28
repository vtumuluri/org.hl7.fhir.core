package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DataElementEnum.DataElementStringency;
import org.hl7.fhir.android.generated.dstu2.DataElementEnum.DataElementStringencyEnumFactory;

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
 * The formal description of a single piece of information that can be gathered and reported.
 */
public class DataElement extends DomainResource {

    /**
     * An absolute URL that is used to identify this data element when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this data element is (or will be) published.
     */
    protected UriType url;

    /**
     * Formal identifier that is used to identify this data element when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    protected List<Identifier> identifier;

    /**
     * The identifier that is used to identify this version of the data element when it is referenced in a StructureDefinition, Questionnaire or instance. This is an arbitrary value managed by the definition author manually.
     */
    protected StringType version;

    /**
     * The term used by humans to refer to the data element.  Should ideally be unique within the context in which the data element is expected to be used.
     */
    protected StringType name;

    /**
     * The status of the data element.
     */
    protected Enumeration<ConformanceResourceStatus> status;

    /**
     * A flag to indicate that this search data element definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    protected BooleanType experimental;

    /**
     * The name of the individual or organization that published the data element.
     */
    protected StringType publisher;

    /**
     * Contacts to assist a user in finding and communicating with the publisher.
     */
    protected List<DataElementContactComponent> contact;

    /**
     * The date this version of the data element was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the data element  changes.
     */
    protected DateTimeType date;

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of data element definitions.
     */
    protected List<CodeableConcept> useContext;

    /**
     * A copyright statement relating to the definition of the data element. Copyright statements are generally legal restrictions on the use and publishing of the details of the definition of the data element.
     */
    protected StringType copyright;

    /**
     * Identifies how precise the data element is in its definition.
     */
    protected Enumeration<DataElementStringency> stringency;

    /**
     * Identifies a specification (other than a terminology) that the elements which make up the DataElement have some correspondence with.
     */
    protected List<DataElementMappingComponent> mapping;

    /**
     * Defines the structure, type, allowed values and other constraining characteristics of the data element.
     */
    protected List<ElementDefinition> element;

    private static final long serialVersionUID = 2017352331L;

    /*
   * Constructor
   */
    public DataElement() {
        super();
    }

    /*
   * Constructor
   */
    public DataElement(Enumeration<ConformanceResourceStatus> status) {
        super();
        this.status = status;
    }

    /**
     * @return {@link #url} (An absolute URL that is used to identify this data element when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this data element is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElement.url");
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
     * @param value {@link #url} (An absolute URL that is used to identify this data element when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this data element is (or will be) published.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public DataElement setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return An absolute URL that is used to identify this data element when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this data element is (or will be) published.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URL that is used to identify this data element when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this data element is (or will be) published.
     */
    public DataElement setUrl(String value) {
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
     * @return {@link #identifier} (Formal identifier that is used to identify this data element when it is represented in other formats, or referenced in a specification, model, design or an instance.)
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
     * @return {@link #identifier} (Formal identifier that is used to identify this data element when it is represented in other formats, or referenced in a specification, model, design or an instance.)
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
    public DataElement addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the data element when it is referenced in a StructureDefinition, Questionnaire or instance. This is an arbitrary value managed by the definition author manually.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElement.version");
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
     * @param value {@link #version} (The identifier that is used to identify this version of the data element when it is referenced in a StructureDefinition, Questionnaire or instance. This is an arbitrary value managed by the definition author manually.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public DataElement setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The identifier that is used to identify this version of the data element when it is referenced in a StructureDefinition, Questionnaire or instance. This is an arbitrary value managed by the definition author manually.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the data element when it is referenced in a StructureDefinition, Questionnaire or instance. This is an arbitrary value managed by the definition author manually.
     */
    public DataElement setVersion(String value) {
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
     * @return {@link #name} (The term used by humans to refer to the data element.  Should ideally be unique within the context in which the data element is expected to be used.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElement.name");
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
     * @param value {@link #name} (The term used by humans to refer to the data element.  Should ideally be unique within the context in which the data element is expected to be used.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public DataElement setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return The term used by humans to refer to the data element.  Should ideally be unique within the context in which the data element is expected to be used.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The term used by humans to refer to the data element.  Should ideally be unique within the context in which the data element is expected to be used.
     */
    public DataElement setName(String value) {
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
     * @return {@link #status} (The status of the data element.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ConformanceResourceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElement.status");
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
     * @param value {@link #status} (The status of the data element.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public DataElement setStatusElement(Enumeration<ConformanceResourceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the data element.
     */
    public ConformanceResourceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the data element.
     */
    public DataElement setStatus(ConformanceResourceStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ConformanceResourceStatus>(new ConformanceResourceStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #experimental} (A flag to indicate that this search data element definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public BooleanType getExperimentalElement() {
        if (this.experimental == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElement.experimental");
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
     * @param value {@link #experimental} (A flag to indicate that this search data element definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.). This is the underlying object with id, value and extensions. The accessor "getExperimental" gives direct access to the value
     */
    public DataElement setExperimentalElement(BooleanType value) {
        this.experimental = value;
        return this;
    }

    /**
     * @return A flag to indicate that this search data element definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public boolean getExperimental() {
        return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
    }

    /**
     * @param value A flag to indicate that this search data element definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     */
    public DataElement setExperimental(boolean value) {
        if (this.experimental == null)
            this.experimental = new BooleanType();
        this.experimental.setValue(value);
        return this;
    }

    /**
     * @return {@link #publisher} (The name of the individual or organization that published the data element.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() {
        if (this.publisher == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElement.publisher");
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
     * @param value {@link #publisher} (The name of the individual or organization that published the data element.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public DataElement setPublisherElement(StringType value) {
        this.publisher = value;
        return this;
    }

    /**
     * @return The name of the individual or organization that published the data element.
     */
    public String getPublisher() {
        return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the individual or organization that published the data element.
     */
    public DataElement setPublisher(String value) {
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
    public List<DataElementContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<DataElementContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (DataElementContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contacts to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public DataElementContactComponent addContact() {
        // 3
        DataElementContactComponent t = new DataElementContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<DataElementContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public DataElement addContact(DataElementContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<DataElementContactComponent>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #date} (The date this version of the data element was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the data element  changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElement.date");
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
     * @param value {@link #date} (The date this version of the data element was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the data element  changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DataElement setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date this version of the data element was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the data element  changes.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date this version of the data element was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the data element  changes.
     */
    public DataElement setDate(Date value) {
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of data element definitions.)
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
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of data element definitions.)
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
    public DataElement addUseContext(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.useContext == null)
            this.useContext = new ArrayList<CodeableConcept>();
        this.useContext.add(t);
        return this;
    }

    /**
     * @return {@link #copyright} (A copyright statement relating to the definition of the data element. Copyright statements are generally legal restrictions on the use and publishing of the details of the definition of the data element.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public StringType getCopyrightElement() {
        if (this.copyright == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElement.copyright");
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
     * @param value {@link #copyright} (A copyright statement relating to the definition of the data element. Copyright statements are generally legal restrictions on the use and publishing of the details of the definition of the data element.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public DataElement setCopyrightElement(StringType value) {
        this.copyright = value;
        return this;
    }

    /**
     * @return A copyright statement relating to the definition of the data element. Copyright statements are generally legal restrictions on the use and publishing of the details of the definition of the data element.
     */
    public String getCopyright() {
        return this.copyright == null ? null : this.copyright.getValue();
    }

    /**
     * @param value A copyright statement relating to the definition of the data element. Copyright statements are generally legal restrictions on the use and publishing of the details of the definition of the data element.
     */
    public DataElement setCopyright(String value) {
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
     * @return {@link #stringency} (Identifies how precise the data element is in its definition.). This is the underlying object with id, value and extensions. The accessor "getStringency" gives direct access to the value
     */
    public Enumeration<DataElementStringency> getStringencyElement() {
        if (this.stringency == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElement.stringency");
            else if (Configuration.doAutoCreate())
                // bb
                this.stringency = new Enumeration<DataElementStringency>(new DataElementStringencyEnumFactory());
        return this.stringency;
    }

    public boolean hasStringencyElement() {
        return this.stringency != null && !this.stringency.isEmpty();
    }

    public boolean hasStringency() {
        return this.stringency != null && !this.stringency.isEmpty();
    }

    /**
     * @param value {@link #stringency} (Identifies how precise the data element is in its definition.). This is the underlying object with id, value and extensions. The accessor "getStringency" gives direct access to the value
     */
    public DataElement setStringencyElement(Enumeration<DataElementStringency> value) {
        this.stringency = value;
        return this;
    }

    /**
     * @return Identifies how precise the data element is in its definition.
     */
    public DataElementStringency getStringency() {
        return this.stringency == null ? null : this.stringency.getValue();
    }

    /**
     * @param value Identifies how precise the data element is in its definition.
     */
    public DataElement setStringency(DataElementStringency value) {
        if (value == null)
            this.stringency = null;
        else {
            if (this.stringency == null)
                this.stringency = new Enumeration<DataElementStringency>(new DataElementStringencyEnumFactory());
            this.stringency.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #mapping} (Identifies a specification (other than a terminology) that the elements which make up the DataElement have some correspondence with.)
     */
    public List<DataElementMappingComponent> getMapping() {
        if (this.mapping == null)
            this.mapping = new ArrayList<DataElementMappingComponent>();
        return this.mapping;
    }

    public boolean hasMapping() {
        if (this.mapping == null)
            return false;
        for (DataElementMappingComponent item : this.mapping) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #mapping} (Identifies a specification (other than a terminology) that the elements which make up the DataElement have some correspondence with.)
     */
    // syntactic sugar
    public DataElementMappingComponent addMapping() {
        // 3
        DataElementMappingComponent t = new DataElementMappingComponent();
        if (this.mapping == null)
            this.mapping = new ArrayList<DataElementMappingComponent>();
        this.mapping.add(t);
        return t;
    }

    // syntactic sugar
    public DataElement addMapping(DataElementMappingComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.mapping == null)
            this.mapping = new ArrayList<DataElementMappingComponent>();
        this.mapping.add(t);
        return this;
    }

    /**
     * @return {@link #element} (Defines the structure, type, allowed values and other constraining characteristics of the data element.)
     */
    public List<ElementDefinition> getElement() {
        if (this.element == null)
            this.element = new ArrayList<ElementDefinition>();
        return this.element;
    }

    public boolean hasElement() {
        if (this.element == null)
            return false;
        for (ElementDefinition item : this.element) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #element} (Defines the structure, type, allowed values and other constraining characteristics of the data element.)
     */
    // syntactic sugar
    public ElementDefinition addElement() {
        // 3
        ElementDefinition t = new ElementDefinition();
        if (this.element == null)
            this.element = new ArrayList<ElementDefinition>();
        this.element.add(t);
        return t;
    }

    // syntactic sugar
    public DataElement addElement(ElementDefinition t) {
        // 3
        if (t == null)
            return this;
        if (this.element == null)
            this.element = new ArrayList<ElementDefinition>();
        this.element.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("url", "uri", "An absolute URL that is used to identify this data element when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this data element is (or will be) published.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("identifier", "Identifier", "Formal identifier that is used to identify this data element when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("version", "string", "The identifier that is used to identify this version of the data element when it is referenced in a StructureDefinition, Questionnaire or instance. This is an arbitrary value managed by the definition author manually.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("name", "string", "The term used by humans to refer to the data element.  Should ideally be unique within the context in which the data element is expected to be used.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("status", "code", "The status of the data element.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("experimental", "boolean", "A flag to indicate that this search data element definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.", 0, java.lang.Integer.MAX_VALUE, experimental));
        childrenList.add(new Property("publisher", "string", "The name of the individual or organization that published the data element.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("contact", "", "Contacts to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("date", "dateTime", "The date this version of the data element was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the data element  changes.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("useContext", "CodeableConcept", "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of data element definitions.", 0, java.lang.Integer.MAX_VALUE, useContext));
        childrenList.add(new Property("copyright", "string", "A copyright statement relating to the definition of the data element. Copyright statements are generally legal restrictions on the use and publishing of the details of the definition of the data element.", 0, java.lang.Integer.MAX_VALUE, copyright));
        childrenList.add(new Property("stringency", "code", "Identifies how precise the data element is in its definition.", 0, java.lang.Integer.MAX_VALUE, stringency));
        childrenList.add(new Property("mapping", "", "Identifies a specification (other than a terminology) that the elements which make up the DataElement have some correspondence with.", 0, java.lang.Integer.MAX_VALUE, mapping));
        childrenList.add(new Property("element", "ElementDefinition", "Defines the structure, type, allowed values and other constraining characteristics of the data element.", 0, java.lang.Integer.MAX_VALUE, element));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
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
            this.getContact().add((DataElementContactComponent) value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("useContext"))
            this.getUseContext().add(castToCodeableConcept(value));
        else if (name.equals("copyright"))
            // StringType
            this.copyright = castToString(value);
        else if (name.equals("stringency"))
            // Enumeration<DataElementStringency>
            this.stringency = new DataElementStringencyEnumFactory().fromType(value);
        else if (name.equals("mapping"))
            this.getMapping().add((DataElementMappingComponent) value);
        else if (name.equals("element"))
            this.getElement().add(castToElementDefinition(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.url");
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.version");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.name");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.status");
        } else if (name.equals("experimental")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.experimental");
        } else if (name.equals("publisher")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.publisher");
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.date");
        } else if (name.equals("useContext")) {
            return addUseContext();
        } else if (name.equals("copyright")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.copyright");
        } else if (name.equals("stringency")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.stringency");
        } else if (name.equals("mapping")) {
            return addMapping();
        } else if (name.equals("element")) {
            return addElement();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "DataElement";
    }

    public DataElement copy() {
        DataElement dst = new DataElement();
        copyValues(dst);
        dst.url = url == null ? null : url.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.status = status == null ? null : status.copy();
        dst.experimental = experimental == null ? null : experimental.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
            dst.contact = new ArrayList<DataElementContactComponent>();
            for (DataElementContactComponent i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.date = date == null ? null : date.copy();
        if (useContext != null) {
            dst.useContext = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : useContext) dst.useContext.add(i.copy());
        }
        ;
        dst.copyright = copyright == null ? null : copyright.copy();
        dst.stringency = stringency == null ? null : stringency.copy();
        if (mapping != null) {
            dst.mapping = new ArrayList<DataElementMappingComponent>();
            for (DataElementMappingComponent i : mapping) dst.mapping.add(i.copy());
        }
        ;
        if (element != null) {
            dst.element = new ArrayList<ElementDefinition>();
            for (ElementDefinition i : element) dst.element.add(i.copy());
        }
        ;
        return dst;
    }

    protected DataElement typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DataElement))
            return false;
        DataElement o = (DataElement) other;
        return compareDeep(url, o.url, true) && compareDeep(identifier, o.identifier, true) && compareDeep(version, o.version, true) && compareDeep(name, o.name, true) && compareDeep(status, o.status, true) && compareDeep(experimental, o.experimental, true) && compareDeep(publisher, o.publisher, true) && compareDeep(contact, o.contact, true) && compareDeep(date, o.date, true) && compareDeep(useContext, o.useContext, true) && compareDeep(copyright, o.copyright, true) && compareDeep(stringency, o.stringency, true) && compareDeep(mapping, o.mapping, true) && compareDeep(element, o.element, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DataElement))
            return false;
        DataElement o = (DataElement) other;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true) && compareValues(status, o.status, true) && compareValues(experimental, o.experimental, true) && compareValues(publisher, o.publisher, true) && compareValues(date, o.date, true) && compareValues(copyright, o.copyright, true) && compareValues(stringency, o.stringency, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (url == null || url.isEmpty()) && (identifier == null || identifier.isEmpty()) && (version == null || version.isEmpty()) && (name == null || name.isEmpty()) && (status == null || status.isEmpty()) && (experimental == null || experimental.isEmpty()) && (publisher == null || publisher.isEmpty()) && (contact == null || contact.isEmpty()) && (date == null || date.isEmpty()) && (useContext == null || useContext.isEmpty()) && (copyright == null || copyright.isEmpty()) && (stringency == null || stringency.isEmpty()) && (mapping == null || mapping.isEmpty()) && (element == null || element.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.DataElement;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CODE = "code";

    public static final String SP_STRINGENCY = "stringency";

    public static final String SP_NAME = "name";

    public static final String SP_CONTEXT = "context";

    public static final String SP_PUBLISHER = "publisher";

    public static final String SP_DESCRIPTION = "description";

    public static final String SP_VERSION = "version";

    public static final String SP_URL = "url";

    public static final String SP_STATUS = "status";
}
