package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.DocumentReferenceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.DocumentReferenceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipType;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipTypeEnumFactory;

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
 * A reference to a document .
 */
public class DocumentReference extends DomainResource {

    /**
     * Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.
     */
    protected Identifier masterIdentifier;

    /**
     * Other identifiers associated with the document, including version independent identifiers.
     */
    protected List<Identifier> identifier;

    /**
     * Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    protected Resource subjectTarget;

    /**
     * Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.
     */
    protected CodeableConcept type;

    /**
     * A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.
     */
    protected CodeableConcept class_;

    /**
     * Identifies who is responsible for adding the information to the document.
     */
    protected List<Reference> author;

    /**
     * The actual objects that are the target of the reference (Identifies who is responsible for adding the information to the document.)
     */
    protected List<Resource> authorTarget;

    /**
     * Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
     */
    protected Reference custodian;

    /**
     * The actual object that is the target of the reference (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    protected Organization custodianTarget;

    /**
     * Which person or organization authenticates that this document is valid.
     */
    protected Reference authenticator;

    /**
     * The actual object that is the target of the reference (Which person or organization authenticates that this document is valid.)
     */
    protected Resource authenticatorTarget;

    /**
     * When the document was created.
     */
    protected DateTimeType created;

    /**
     * When the document reference was created.
     */
    protected InstantType indexed;

    /**
     * The status of this document reference.
     */
    protected Enumeration<DocumentReferenceStatus> status;

    /**
     * The status of the underlying document.
     */
    protected CodeableConcept docStatus;

    /**
     * Relationships that this document has with other document references that already exist.
     */
    protected List<DocumentReferenceRelatesToComponent> relatesTo;

    /**
     * Human-readable description of the source document. This is sometimes known as the "title".
     */
    protected StringType description;

    /**
     * A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the "reference" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.
     */
    protected List<CodeableConcept> securityLabel;

    /**
     * The document and format referenced. There may be multiple content element repetitions, each with a different format.
     */
    protected List<DocumentReferenceContentComponent> content;

    /**
     * The clinical context in which the document was prepared.
     */
    protected DocumentReferenceContextComponent context;

    private static final long serialVersionUID = -1009325322L;

    /*
   * Constructor
   */
    public DocumentReference() {
        super();
    }

    /*
   * Constructor
   */
    public DocumentReference(CodeableConcept type, InstantType indexed, Enumeration<DocumentReferenceStatus> status) {
        super();
        this.type = type;
        this.indexed = indexed;
        this.status = status;
    }

    /**
     * @return {@link #masterIdentifier} (Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.)
     */
    public Identifier getMasterIdentifier() {
        if (this.masterIdentifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.masterIdentifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.masterIdentifier = new Identifier();
        return this.masterIdentifier;
    }

    public boolean hasMasterIdentifier() {
        return this.masterIdentifier != null && !this.masterIdentifier.isEmpty();
    }

    /**
     * @param value {@link #masterIdentifier} (Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.)
     */
    public DocumentReference setMasterIdentifier(Identifier value) {
        this.masterIdentifier = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Other identifiers associated with the document, including version independent identifiers.)
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
     * @return {@link #identifier} (Other identifiers associated with the document, including version independent identifiers.)
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
    public DocumentReference addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #subject} (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    public DocumentReference setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    public DocumentReference setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #type} (Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.)
     */
    public DocumentReference setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #class_} (A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.)
     */
    public CodeableConcept getClass_() {
        if (this.class_ == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.class_");
            else if (Configuration.doAutoCreate())
                // cc
                this.class_ = new CodeableConcept();
        return this.class_;
    }

    public boolean hasClass_() {
        return this.class_ != null && !this.class_.isEmpty();
    }

    /**
     * @param value {@link #class_} (A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.)
     */
    public DocumentReference setClass_(CodeableConcept value) {
        this.class_ = value;
        return this;
    }

    /**
     * @return {@link #author} (Identifies who is responsible for adding the information to the document.)
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
     * @return {@link #author} (Identifies who is responsible for adding the information to the document.)
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
    public DocumentReference addAuthor(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        this.author.add(t);
        return this;
    }

    /**
     * @return {@link #author} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies who is responsible for adding the information to the document.)
     */
    public List<Resource> getAuthorTarget() {
        if (this.authorTarget == null)
            this.authorTarget = new ArrayList<Resource>();
        return this.authorTarget;
    }

    /**
     * @return {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    public Reference getCustodian() {
        if (this.custodian == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.custodian");
            else if (Configuration.doAutoCreate())
                // cc
                this.custodian = new Reference();
        return this.custodian;
    }

    public boolean hasCustodian() {
        return this.custodian != null && !this.custodian.isEmpty();
    }

    /**
     * @param value {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    public DocumentReference setCustodian(Reference value) {
        this.custodian = value;
        return this;
    }

    /**
     * @return {@link #custodian} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    public Organization getCustodianTarget() {
        if (this.custodianTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.custodian");
            else if (Configuration.doAutoCreate())
                // aa
                this.custodianTarget = new Organization();
        return this.custodianTarget;
    }

    /**
     * @param value {@link #custodian} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    public DocumentReference setCustodianTarget(Organization value) {
        this.custodianTarget = value;
        return this;
    }

    /**
     * @return {@link #authenticator} (Which person or organization authenticates that this document is valid.)
     */
    public Reference getAuthenticator() {
        if (this.authenticator == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.authenticator");
            else if (Configuration.doAutoCreate())
                // cc
                this.authenticator = new Reference();
        return this.authenticator;
    }

    public boolean hasAuthenticator() {
        return this.authenticator != null && !this.authenticator.isEmpty();
    }

    /**
     * @param value {@link #authenticator} (Which person or organization authenticates that this document is valid.)
     */
    public DocumentReference setAuthenticator(Reference value) {
        this.authenticator = value;
        return this;
    }

    /**
     * @return {@link #authenticator} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Which person or organization authenticates that this document is valid.)
     */
    public Resource getAuthenticatorTarget() {
        return this.authenticatorTarget;
    }

    /**
     * @param value {@link #authenticator} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Which person or organization authenticates that this document is valid.)
     */
    public DocumentReference setAuthenticatorTarget(Resource value) {
        this.authenticatorTarget = value;
        return this;
    }

    /**
     * @return {@link #created} (When the document was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() {
        if (this.created == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.created");
            else if (Configuration.doAutoCreate())
                // bb
                this.created = new DateTimeType();
        return this.created;
    }

    public boolean hasCreatedElement() {
        return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() {
        return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (When the document was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DocumentReference setCreatedElement(DateTimeType value) {
        this.created = value;
        return this;
    }

    /**
     * @return When the document was created.
     */
    public Date getCreated() {
        return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value When the document was created.
     */
    public DocumentReference setCreated(Date value) {
        if (value == null)
            this.created = null;
        else {
            if (this.created == null)
                this.created = new DateTimeType();
            this.created.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #indexed} (When the document reference was created.). This is the underlying object with id, value and extensions. The accessor "getIndexed" gives direct access to the value
     */
    public InstantType getIndexedElement() {
        if (this.indexed == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.indexed");
            else if (Configuration.doAutoCreate())
                // bb
                this.indexed = new InstantType();
        return this.indexed;
    }

    public boolean hasIndexedElement() {
        return this.indexed != null && !this.indexed.isEmpty();
    }

    public boolean hasIndexed() {
        return this.indexed != null && !this.indexed.isEmpty();
    }

    /**
     * @param value {@link #indexed} (When the document reference was created.). This is the underlying object with id, value and extensions. The accessor "getIndexed" gives direct access to the value
     */
    public DocumentReference setIndexedElement(InstantType value) {
        this.indexed = value;
        return this;
    }

    /**
     * @return When the document reference was created.
     */
    public Date getIndexed() {
        return this.indexed == null ? null : this.indexed.getValue();
    }

    /**
     * @param value When the document reference was created.
     */
    public DocumentReference setIndexed(Date value) {
        if (this.indexed == null)
            this.indexed = new InstantType();
        this.indexed.setValue(value);
        return this;
    }

    /**
     * @return {@link #status} (The status of this document reference.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DocumentReferenceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<DocumentReferenceStatus>(new DocumentReferenceStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this document reference.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public DocumentReference setStatusElement(Enumeration<DocumentReferenceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of this document reference.
     */
    public DocumentReferenceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this document reference.
     */
    public DocumentReference setStatus(DocumentReferenceStatus value) {
        if (this.status == null)
            this.status = new Enumeration<DocumentReferenceStatus>(new DocumentReferenceStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #docStatus} (The status of the underlying document.)
     */
    public CodeableConcept getDocStatus() {
        if (this.docStatus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.docStatus");
            else if (Configuration.doAutoCreate())
                // cc
                this.docStatus = new CodeableConcept();
        return this.docStatus;
    }

    public boolean hasDocStatus() {
        return this.docStatus != null && !this.docStatus.isEmpty();
    }

    /**
     * @param value {@link #docStatus} (The status of the underlying document.)
     */
    public DocumentReference setDocStatus(CodeableConcept value) {
        this.docStatus = value;
        return this;
    }

    /**
     * @return {@link #relatesTo} (Relationships that this document has with other document references that already exist.)
     */
    public List<DocumentReferenceRelatesToComponent> getRelatesTo() {
        if (this.relatesTo == null)
            this.relatesTo = new ArrayList<DocumentReferenceRelatesToComponent>();
        return this.relatesTo;
    }

    public boolean hasRelatesTo() {
        if (this.relatesTo == null)
            return false;
        for (DocumentReferenceRelatesToComponent item : this.relatesTo) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #relatesTo} (Relationships that this document has with other document references that already exist.)
     */
    // syntactic sugar
    public DocumentReferenceRelatesToComponent addRelatesTo() {
        // 3
        DocumentReferenceRelatesToComponent t = new DocumentReferenceRelatesToComponent();
        if (this.relatesTo == null)
            this.relatesTo = new ArrayList<DocumentReferenceRelatesToComponent>();
        this.relatesTo.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReference addRelatesTo(DocumentReferenceRelatesToComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.relatesTo == null)
            this.relatesTo = new ArrayList<DocumentReferenceRelatesToComponent>();
        this.relatesTo.add(t);
        return this;
    }

    /**
     * @return {@link #description} (Human-readable description of the source document. This is sometimes known as the "title".). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.description");
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
     * @param value {@link #description} (Human-readable description of the source document. This is sometimes known as the "title".). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public DocumentReference setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Human-readable description of the source document. This is sometimes known as the "title".
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Human-readable description of the source document. This is sometimes known as the "title".
     */
    public DocumentReference setDescription(String value) {
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
     * @return {@link #securityLabel} (A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the "reference" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.)
     */
    public List<CodeableConcept> getSecurityLabel() {
        if (this.securityLabel == null)
            this.securityLabel = new ArrayList<CodeableConcept>();
        return this.securityLabel;
    }

    public boolean hasSecurityLabel() {
        if (this.securityLabel == null)
            return false;
        for (CodeableConcept item : this.securityLabel) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #securityLabel} (A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the "reference" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.)
     */
    // syntactic sugar
    public CodeableConcept addSecurityLabel() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.securityLabel == null)
            this.securityLabel = new ArrayList<CodeableConcept>();
        this.securityLabel.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReference addSecurityLabel(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.securityLabel == null)
            this.securityLabel = new ArrayList<CodeableConcept>();
        this.securityLabel.add(t);
        return this;
    }

    /**
     * @return {@link #content} (The document and format referenced. There may be multiple content element repetitions, each with a different format.)
     */
    public List<DocumentReferenceContentComponent> getContent() {
        if (this.content == null)
            this.content = new ArrayList<DocumentReferenceContentComponent>();
        return this.content;
    }

    public boolean hasContent() {
        if (this.content == null)
            return false;
        for (DocumentReferenceContentComponent item : this.content) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #content} (The document and format referenced. There may be multiple content element repetitions, each with a different format.)
     */
    // syntactic sugar
    public DocumentReferenceContentComponent addContent() {
        // 3
        DocumentReferenceContentComponent t = new DocumentReferenceContentComponent();
        if (this.content == null)
            this.content = new ArrayList<DocumentReferenceContentComponent>();
        this.content.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReference addContent(DocumentReferenceContentComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.content == null)
            this.content = new ArrayList<DocumentReferenceContentComponent>();
        this.content.add(t);
        return this;
    }

    /**
     * @return {@link #context} (The clinical context in which the document was prepared.)
     */
    public DocumentReferenceContextComponent getContext() {
        if (this.context == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.context");
            else if (Configuration.doAutoCreate())
                // cc
                this.context = new DocumentReferenceContextComponent();
        return this.context;
    }

    public boolean hasContext() {
        return this.context != null && !this.context.isEmpty();
    }

    /**
     * @param value {@link #context} (The clinical context in which the document was prepared.)
     */
    public DocumentReference setContext(DocumentReferenceContextComponent value) {
        this.context = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("masterIdentifier", "Identifier", "Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.", 0, java.lang.Integer.MAX_VALUE, masterIdentifier));
        childrenList.add(new Property("identifier", "Identifier", "Other identifiers associated with the document, including version independent identifiers.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("subject", "Reference(Patient|Practitioner|Group|Device)", "Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("type", "CodeableConcept", "Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("class", "CodeableConcept", "A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.", 0, java.lang.Integer.MAX_VALUE, class_));
        childrenList.add(new Property("author", "Reference(Practitioner|Organization|Device|Patient|RelatedPerson)", "Identifies who is responsible for adding the information to the document.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("custodian", "Reference(Organization)", "Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.", 0, java.lang.Integer.MAX_VALUE, custodian));
        childrenList.add(new Property("authenticator", "Reference(Practitioner|Organization)", "Which person or organization authenticates that this document is valid.", 0, java.lang.Integer.MAX_VALUE, authenticator));
        childrenList.add(new Property("created", "dateTime", "When the document was created.", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("indexed", "instant", "When the document reference was created.", 0, java.lang.Integer.MAX_VALUE, indexed));
        childrenList.add(new Property("status", "code", "The status of this document reference.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("docStatus", "CodeableConcept", "The status of the underlying document.", 0, java.lang.Integer.MAX_VALUE, docStatus));
        childrenList.add(new Property("relatesTo", "", "Relationships that this document has with other document references that already exist.", 0, java.lang.Integer.MAX_VALUE, relatesTo));
        childrenList.add(new Property("description", "string", "Human-readable description of the source document. This is sometimes known as the \"title\".", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("securityLabel", "CodeableConcept", "A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \"reference\" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.", 0, java.lang.Integer.MAX_VALUE, securityLabel));
        childrenList.add(new Property("content", "", "The document and format referenced. There may be multiple content element repetitions, each with a different format.", 0, java.lang.Integer.MAX_VALUE, content));
        childrenList.add(new Property("context", "", "The clinical context in which the document was prepared.", 0, java.lang.Integer.MAX_VALUE, context));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("masterIdentifier"))
            // Identifier
            this.masterIdentifier = castToIdentifier(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("class"))
            // CodeableConcept
            this.class_ = castToCodeableConcept(value);
        else if (name.equals("author"))
            this.getAuthor().add(castToReference(value));
        else if (name.equals("custodian"))
            // Reference
            this.custodian = castToReference(value);
        else if (name.equals("authenticator"))
            // Reference
            this.authenticator = castToReference(value);
        else if (name.equals("created"))
            // DateTimeType
            this.created = castToDateTime(value);
        else if (name.equals("indexed"))
            // InstantType
            this.indexed = castToInstant(value);
        else if (name.equals("status"))
            // Enumeration<DocumentReferenceStatus>
            this.status = new DocumentReferenceStatusEnumFactory().fromType(value);
        else if (name.equals("docStatus"))
            // CodeableConcept
            this.docStatus = castToCodeableConcept(value);
        else if (name.equals("relatesTo"))
            this.getRelatesTo().add((DocumentReferenceRelatesToComponent) value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("securityLabel"))
            this.getSecurityLabel().add(castToCodeableConcept(value));
        else if (name.equals("content"))
            this.getContent().add((DocumentReferenceContentComponent) value);
        else if (name.equals("context"))
            // DocumentReferenceContextComponent
            this.context = (DocumentReferenceContextComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("masterIdentifier")) {
            this.masterIdentifier = new Identifier();
            return this.masterIdentifier;
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("class")) {
            this.class_ = new CodeableConcept();
            return this.class_;
        } else if (name.equals("author")) {
            return addAuthor();
        } else if (name.equals("custodian")) {
            this.custodian = new Reference();
            return this.custodian;
        } else if (name.equals("authenticator")) {
            this.authenticator = new Reference();
            return this.authenticator;
        } else if (name.equals("created")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentReference.created");
        } else if (name.equals("indexed")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentReference.indexed");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentReference.status");
        } else if (name.equals("docStatus")) {
            this.docStatus = new CodeableConcept();
            return this.docStatus;
        } else if (name.equals("relatesTo")) {
            return addRelatesTo();
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentReference.description");
        } else if (name.equals("securityLabel")) {
            return addSecurityLabel();
        } else if (name.equals("content")) {
            return addContent();
        } else if (name.equals("context")) {
            this.context = new DocumentReferenceContextComponent();
            return this.context;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "DocumentReference";
    }

    public DocumentReference copy() {
        DocumentReference dst = new DocumentReference();
        copyValues(dst);
        dst.masterIdentifier = masterIdentifier == null ? null : masterIdentifier.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.subject = subject == null ? null : subject.copy();
        dst.type = type == null ? null : type.copy();
        dst.class_ = class_ == null ? null : class_.copy();
        if (author != null) {
            dst.author = new ArrayList<Reference>();
            for (Reference i : author) dst.author.add(i.copy());
        }
        ;
        dst.custodian = custodian == null ? null : custodian.copy();
        dst.authenticator = authenticator == null ? null : authenticator.copy();
        dst.created = created == null ? null : created.copy();
        dst.indexed = indexed == null ? null : indexed.copy();
        dst.status = status == null ? null : status.copy();
        dst.docStatus = docStatus == null ? null : docStatus.copy();
        if (relatesTo != null) {
            dst.relatesTo = new ArrayList<DocumentReferenceRelatesToComponent>();
            for (DocumentReferenceRelatesToComponent i : relatesTo) dst.relatesTo.add(i.copy());
        }
        ;
        dst.description = description == null ? null : description.copy();
        if (securityLabel != null) {
            dst.securityLabel = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : securityLabel) dst.securityLabel.add(i.copy());
        }
        ;
        if (content != null) {
            dst.content = new ArrayList<DocumentReferenceContentComponent>();
            for (DocumentReferenceContentComponent i : content) dst.content.add(i.copy());
        }
        ;
        dst.context = context == null ? null : context.copy();
        return dst;
    }

    protected DocumentReference typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DocumentReference))
            return false;
        DocumentReference o = (DocumentReference) other;
        return compareDeep(masterIdentifier, o.masterIdentifier, true) && compareDeep(identifier, o.identifier, true) && compareDeep(subject, o.subject, true) && compareDeep(type, o.type, true) && compareDeep(class_, o.class_, true) && compareDeep(author, o.author, true) && compareDeep(custodian, o.custodian, true) && compareDeep(authenticator, o.authenticator, true) && compareDeep(created, o.created, true) && compareDeep(indexed, o.indexed, true) && compareDeep(status, o.status, true) && compareDeep(docStatus, o.docStatus, true) && compareDeep(relatesTo, o.relatesTo, true) && compareDeep(description, o.description, true) && compareDeep(securityLabel, o.securityLabel, true) && compareDeep(content, o.content, true) && compareDeep(context, o.context, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DocumentReference))
            return false;
        DocumentReference o = (DocumentReference) other;
        return compareValues(created, o.created, true) && compareValues(indexed, o.indexed, true) && compareValues(status, o.status, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (masterIdentifier == null || masterIdentifier.isEmpty()) && (identifier == null || identifier.isEmpty()) && (subject == null || subject.isEmpty()) && (type == null || type.isEmpty()) && (class_ == null || class_.isEmpty()) && (author == null || author.isEmpty()) && (custodian == null || custodian.isEmpty()) && (authenticator == null || authenticator.isEmpty()) && (created == null || created.isEmpty()) && (indexed == null || indexed.isEmpty()) && (status == null || status.isEmpty()) && (docStatus == null || docStatus.isEmpty()) && (relatesTo == null || relatesTo.isEmpty()) && (description == null || description.isEmpty()) && (securityLabel == null || securityLabel.isEmpty()) && (content == null || content.isEmpty()) && (context == null || context.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.DocumentReference;
    }

    public static final String SP_SECURITYLABEL = "securitylabel";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_DESCRIPTION = "description";

    public static final String SP_LANGUAGE = "language";

    public static final String SP_TYPE = "type";

    public static final String SP_RELATION = "relation";

    public static final String SP_SETTING = "setting";

    public static final String SP_PATIENT = "patient";

    public static final String SP_RELATIONSHIP = "relationship";

    public static final String SP_EVENT = "event";

    public static final String SP_CLASS = "class";

    public static final String SP_AUTHENTICATOR = "authenticator";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PERIOD = "period";

    public static final String SP_RELATEDID = "related-id";

    public static final String SP_CUSTODIAN = "custodian";

    public static final String SP_INDEXED = "indexed";

    public static final String SP_AUTHOR = "author";

    public static final String SP_CREATED = "created";

    public static final String SP_FORMAT = "format";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_RELATEDREF = "related-ref";

    public static final String SP_LOCATION = "location";

    public static final String SP_RELATESTO = "relatesto";

    public static final String SP_FACILITY = "facility";

    public static final String SP_STATUS = "status";
}
