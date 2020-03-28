package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionStatus;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionAttestationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionAttestationMode;

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
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.
 */
public class Composition extends DomainResource {

    /**
     * Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time.
     */
    protected Identifier identifier;

    /**
     * The composition editing time, when the composition was last logically changed by the author.
     */
    protected DateTimeType date;

    /**
     * Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.
     */
    protected CodeableConcept type;

    /**
     * A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.
     */
    protected CodeableConcept class_;

    /**
     * Official human-readable label for the composition.
     */
    protected StringType title;

    /**
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     */
    protected Enumeration<CompositionStatus> status;

    /**
     * The code specifying the level of confidentiality of the Composition.
     */
    protected CodeType confidentiality;

    /**
     * Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).)
     */
    protected Resource subjectTarget;

    /**
     * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
     */
    protected List<Reference> author;

    /**
     * The actual objects that are the target of the reference (Identifies who is responsible for the information in the composition, not necessarily who typed it in.)
     */
    protected List<Resource> authorTarget;

    /**
     * A participant who has attested to the accuracy of the composition/document.
     */
    protected List<CompositionAttesterComponent> attester;

    /**
     * Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.
     */
    protected Reference custodian;

    /**
     * The actual object that is the target of the reference (Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.)
     */
    protected Organization custodianTarget;

    /**
     * The clinical service, such as a colonoscopy or an appendectomy, being documented.
     */
    protected List<CompositionEventComponent> event;

    /**
     * Describes the clinical encounter or type of care this documentation is associated with.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (Describes the clinical encounter or type of care this documentation is associated with.)
     */
    protected Encounter encounterTarget;

    /**
     * The root of the sections that make up the composition.
     */
    protected List<SectionComponent> section;

    private static final long serialVersionUID = 2127852326L;

    /*
   * Constructor
   */
    public Composition() {
        super();
    }

    /*
   * Constructor
   */
    public Composition(DateTimeType date, CodeableConcept type, StringType title, Enumeration<CompositionStatus> status, Reference subject) {
        super();
        this.date = date;
        this.type = type;
        this.title = title;
        this.status = status;
        this.subject = subject;
    }

    /**
     * @return {@link #identifier} (Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time.)
     */
    public Composition setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #date} (The composition editing time, when the composition was last logically changed by the author.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.date");
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
     * @param value {@link #date} (The composition editing time, when the composition was last logically changed by the author.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Composition setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The composition editing time, when the composition was last logically changed by the author.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The composition editing time, when the composition was last logically changed by the author.
     */
    public Composition setDate(Date value) {
        if (this.date == null)
            this.date = new DateTimeType();
        this.date.setValue(value);
        return this;
    }

    /**
     * @return {@link #type} (Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.)
     */
    public Composition setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #class_} (A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.)
     */
    public CodeableConcept getClass_() {
        if (this.class_ == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.class_");
            else if (Configuration.doAutoCreate())
                // cc
                this.class_ = new CodeableConcept();
        return this.class_;
    }

    public boolean hasClass_() {
        return this.class_ != null && !this.class_.isEmpty();
    }

    /**
     * @param value {@link #class_} (A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.)
     */
    public Composition setClass_(CodeableConcept value) {
        this.class_ = value;
        return this;
    }

    /**
     * @return {@link #title} (Official human-readable label for the composition.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() {
        if (this.title == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.title");
            else if (Configuration.doAutoCreate())
                // bb
                this.title = new StringType();
        return this.title;
    }

    public boolean hasTitleElement() {
        return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() {
        return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (Official human-readable label for the composition.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public Composition setTitleElement(StringType value) {
        this.title = value;
        return this;
    }

    /**
     * @return Official human-readable label for the composition.
     */
    public String getTitle() {
        return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value Official human-readable label for the composition.
     */
    public Composition setTitle(String value) {
        if (this.title == null)
            this.title = new StringType();
        this.title.setValue(value);
        return this;
    }

    /**
     * @return {@link #status} (The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<CompositionStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<CompositionStatus>(new CompositionStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Composition setStatusElement(Enumeration<CompositionStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     */
    public CompositionStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     */
    public Composition setStatus(CompositionStatus value) {
        if (this.status == null)
            this.status = new Enumeration<CompositionStatus>(new CompositionStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #confidentiality} (The code specifying the level of confidentiality of the Composition.). This is the underlying object with id, value and extensions. The accessor "getConfidentiality" gives direct access to the value
     */
    public CodeType getConfidentialityElement() {
        if (this.confidentiality == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.confidentiality");
            else if (Configuration.doAutoCreate())
                // bb
                this.confidentiality = new CodeType();
        return this.confidentiality;
    }

    public boolean hasConfidentialityElement() {
        return this.confidentiality != null && !this.confidentiality.isEmpty();
    }

    public boolean hasConfidentiality() {
        return this.confidentiality != null && !this.confidentiality.isEmpty();
    }

    /**
     * @param value {@link #confidentiality} (The code specifying the level of confidentiality of the Composition.). This is the underlying object with id, value and extensions. The accessor "getConfidentiality" gives direct access to the value
     */
    public Composition setConfidentialityElement(CodeType value) {
        this.confidentiality = value;
        return this;
    }

    /**
     * @return The code specifying the level of confidentiality of the Composition.
     */
    public String getConfidentiality() {
        return this.confidentiality == null ? null : this.confidentiality.getValue();
    }

    /**
     * @param value The code specifying the level of confidentiality of the Composition.
     */
    public Composition setConfidentiality(String value) {
        if (Utilities.noString(value))
            this.confidentiality = null;
        else {
            if (this.confidentiality == null)
                this.confidentiality = new CodeType();
            this.confidentiality.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #subject} (Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).)
     */
    public Composition setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).)
     */
    public Composition setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #author} (Identifies who is responsible for the information in the composition, not necessarily who typed it in.)
     */
    public List<Reference> getAuthor() {
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        return this.author;
    }

    public boolean hasAuthor() {
        if (this.author == null)
            return false;
        for (Reference item : this.author) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #author} (Identifies who is responsible for the information in the composition, not necessarily who typed it in.)
     */
    // syntactic sugar
    public Reference addAuthor() {
        // 3
        Reference t = new Reference();
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        this.author.add(t);
        return t;
    }

    // syntactic sugar
    public Composition addAuthor(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        this.author.add(t);
        return this;
    }

    /**
     * @return {@link #author} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies who is responsible for the information in the composition, not necessarily who typed it in.)
     */
    public List<Resource> getAuthorTarget() {
        if (this.authorTarget == null)
            this.authorTarget = new ArrayList<Resource>();
        return this.authorTarget;
    }

    /**
     * @return {@link #attester} (A participant who has attested to the accuracy of the composition/document.)
     */
    public List<CompositionAttesterComponent> getAttester() {
        if (this.attester == null)
            this.attester = new ArrayList<CompositionAttesterComponent>();
        return this.attester;
    }

    public boolean hasAttester() {
        if (this.attester == null)
            return false;
        for (CompositionAttesterComponent item : this.attester) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #attester} (A participant who has attested to the accuracy of the composition/document.)
     */
    // syntactic sugar
    public CompositionAttesterComponent addAttester() {
        // 3
        CompositionAttesterComponent t = new CompositionAttesterComponent();
        if (this.attester == null)
            this.attester = new ArrayList<CompositionAttesterComponent>();
        this.attester.add(t);
        return t;
    }

    // syntactic sugar
    public Composition addAttester(CompositionAttesterComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.attester == null)
            this.attester = new ArrayList<CompositionAttesterComponent>();
        this.attester.add(t);
        return this;
    }

    /**
     * @return {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.)
     */
    public Reference getCustodian() {
        if (this.custodian == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.custodian");
            else if (Configuration.doAutoCreate())
                // cc
                this.custodian = new Reference();
        return this.custodian;
    }

    public boolean hasCustodian() {
        return this.custodian != null && !this.custodian.isEmpty();
    }

    /**
     * @param value {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.)
     */
    public Composition setCustodian(Reference value) {
        this.custodian = value;
        return this;
    }

    /**
     * @return {@link #custodian} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.)
     */
    public Organization getCustodianTarget() {
        if (this.custodianTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.custodian");
            else if (Configuration.doAutoCreate())
                // aa
                this.custodianTarget = new Organization();
        return this.custodianTarget;
    }

    /**
     * @param value {@link #custodian} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.)
     */
    public Composition setCustodianTarget(Organization value) {
        this.custodianTarget = value;
        return this;
    }

    /**
     * @return {@link #event} (The clinical service, such as a colonoscopy or an appendectomy, being documented.)
     */
    public List<CompositionEventComponent> getEvent() {
        if (this.event == null)
            this.event = new ArrayList<CompositionEventComponent>();
        return this.event;
    }

    public boolean hasEvent() {
        if (this.event == null)
            return false;
        for (CompositionEventComponent item : this.event) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #event} (The clinical service, such as a colonoscopy or an appendectomy, being documented.)
     */
    // syntactic sugar
    public CompositionEventComponent addEvent() {
        // 3
        CompositionEventComponent t = new CompositionEventComponent();
        if (this.event == null)
            this.event = new ArrayList<CompositionEventComponent>();
        this.event.add(t);
        return t;
    }

    // syntactic sugar
    public Composition addEvent(CompositionEventComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.event == null)
            this.event = new ArrayList<CompositionEventComponent>();
        this.event.add(t);
        return this;
    }

    /**
     * @return {@link #encounter} (Describes the clinical encounter or type of care this documentation is associated with.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (Describes the clinical encounter or type of care this documentation is associated with.)
     */
    public Composition setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Describes the clinical encounter or type of care this documentation is associated with.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Composition.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Describes the clinical encounter or type of care this documentation is associated with.)
     */
    public Composition setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #section} (The root of the sections that make up the composition.)
     */
    public List<SectionComponent> getSection() {
        if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
        return this.section;
    }

    public boolean hasSection() {
        if (this.section == null)
            return false;
        for (SectionComponent item : this.section) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #section} (The root of the sections that make up the composition.)
     */
    // syntactic sugar
    public SectionComponent addSection() {
        // 3
        SectionComponent t = new SectionComponent();
        if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
        this.section.add(t);
        return t;
    }

    // syntactic sugar
    public Composition addSection(SectionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
        this.section.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("date", "dateTime", "The composition editing time, when the composition was last logically changed by the author.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("type", "CodeableConcept", "Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("class", "CodeableConcept", "A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.", 0, java.lang.Integer.MAX_VALUE, class_));
        childrenList.add(new Property("title", "string", "Official human-readable label for the composition.", 0, java.lang.Integer.MAX_VALUE, title));
        childrenList.add(new Property("status", "code", "The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("confidentiality", "code", "The code specifying the level of confidentiality of the Composition.", 0, java.lang.Integer.MAX_VALUE, confidentiality));
        childrenList.add(new Property("subject", "Reference(Any)", "Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("author", "Reference(Practitioner|Device|Patient|RelatedPerson)", "Identifies who is responsible for the information in the composition, not necessarily who typed it in.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("attester", "", "A participant who has attested to the accuracy of the composition/document.", 0, java.lang.Integer.MAX_VALUE, attester));
        childrenList.add(new Property("custodian", "Reference(Organization)", "Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.", 0, java.lang.Integer.MAX_VALUE, custodian));
        childrenList.add(new Property("event", "", "The clinical service, such as a colonoscopy or an appendectomy, being documented.", 0, java.lang.Integer.MAX_VALUE, event));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "Describes the clinical encounter or type of care this documentation is associated with.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("section", "", "The root of the sections that make up the composition.", 0, java.lang.Integer.MAX_VALUE, section));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("class"))
            // CodeableConcept
            this.class_ = castToCodeableConcept(value);
        else if (name.equals("title"))
            // StringType
            this.title = castToString(value);
        else if (name.equals("status"))
            // Enumeration<CompositionStatus>
            this.status = new CompositionStatusEnumFactory().fromType(value);
        else if (name.equals("confidentiality"))
            // CodeType
            this.confidentiality = castToCode(value);
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("author"))
            this.getAuthor().add(castToReference(value));
        else if (name.equals("attester"))
            this.getAttester().add((CompositionAttesterComponent) value);
        else if (name.equals("custodian"))
            // Reference
            this.custodian = castToReference(value);
        else if (name.equals("event"))
            this.getEvent().add((CompositionEventComponent) value);
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("section"))
            this.getSection().add((SectionComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type Composition.date");
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("class")) {
            this.class_ = new CodeableConcept();
            return this.class_;
        } else if (name.equals("title")) {
            throw new FHIRException("Cannot call addChild on a primitive type Composition.title");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Composition.status");
        } else if (name.equals("confidentiality")) {
            throw new FHIRException("Cannot call addChild on a primitive type Composition.confidentiality");
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("author")) {
            return addAuthor();
        } else if (name.equals("attester")) {
            return addAttester();
        } else if (name.equals("custodian")) {
            this.custodian = new Reference();
            return this.custodian;
        } else if (name.equals("event")) {
            return addEvent();
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("section")) {
            return addSection();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Composition";
    }

    public Composition copy() {
        Composition dst = new Composition();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.date = date == null ? null : date.copy();
        dst.type = type == null ? null : type.copy();
        dst.class_ = class_ == null ? null : class_.copy();
        dst.title = title == null ? null : title.copy();
        dst.status = status == null ? null : status.copy();
        dst.confidentiality = confidentiality == null ? null : confidentiality.copy();
        dst.subject = subject == null ? null : subject.copy();
        if (author != null) {
            dst.author = new ArrayList<Reference>();
            for (Reference i : author) dst.author.add(i.copy());
        }
        ;
        if (attester != null) {
            dst.attester = new ArrayList<CompositionAttesterComponent>();
            for (CompositionAttesterComponent i : attester) dst.attester.add(i.copy());
        }
        ;
        dst.custodian = custodian == null ? null : custodian.copy();
        if (event != null) {
            dst.event = new ArrayList<CompositionEventComponent>();
            for (CompositionEventComponent i : event) dst.event.add(i.copy());
        }
        ;
        dst.encounter = encounter == null ? null : encounter.copy();
        if (section != null) {
            dst.section = new ArrayList<SectionComponent>();
            for (SectionComponent i : section) dst.section.add(i.copy());
        }
        ;
        return dst;
    }

    protected Composition typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Composition))
            return false;
        Composition o = (Composition) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(date, o.date, true) && compareDeep(type, o.type, true) && compareDeep(class_, o.class_, true) && compareDeep(title, o.title, true) && compareDeep(status, o.status, true) && compareDeep(confidentiality, o.confidentiality, true) && compareDeep(subject, o.subject, true) && compareDeep(author, o.author, true) && compareDeep(attester, o.attester, true) && compareDeep(custodian, o.custodian, true) && compareDeep(event, o.event, true) && compareDeep(encounter, o.encounter, true) && compareDeep(section, o.section, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Composition))
            return false;
        Composition o = (Composition) other;
        return compareValues(date, o.date, true) && compareValues(title, o.title, true) && compareValues(status, o.status, true) && compareValues(confidentiality, o.confidentiality, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (date == null || date.isEmpty()) && (type == null || type.isEmpty()) && (class_ == null || class_.isEmpty()) && (title == null || title.isEmpty()) && (status == null || status.isEmpty()) && (confidentiality == null || confidentiality.isEmpty()) && (subject == null || subject.isEmpty()) && (author == null || author.isEmpty()) && (attester == null || attester.isEmpty()) && (custodian == null || custodian.isEmpty()) && (event == null || event.isEmpty()) && (encounter == null || encounter.isEmpty()) && (section == null || section.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Composition;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PERIOD = "period";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_AUTHOR = "author";

    public static final String SP_CONFIDENTIALITY = "confidentiality";

    public static final String SP_SECTION = "section";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_TYPE = "type";

    public static final String SP_TITLE = "title";

    public static final String SP_ATTESTER = "attester";

    public static final String SP_ENTRY = "entry";

    public static final String SP_PATIENT = "patient";

    public static final String SP_CONTEXT = "context";

    public static final String SP_CLASS = "class";

    public static final String SP_STATUS = "status";
}
