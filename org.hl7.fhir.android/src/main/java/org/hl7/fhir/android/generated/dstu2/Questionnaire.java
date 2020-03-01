package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.QuestionnaireStatus;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.QuestionnaireStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.AnswerFormat;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.AnswerFormatEnumFactory;

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
 * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 */
public class Questionnaire extends DomainResource {

    /**
     * This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    protected List<Identifier> identifier;

    /**
     * The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated.
     */
    protected StringType version;

    /**
     * The lifecycle status of the questionnaire as a whole.
     */
    protected Enumeration<QuestionnaireStatus> status;

    /**
     * The date that this questionnaire was last changed.
     */
    protected DateTimeType date;

    /**
     * Organization or person responsible for developing and maintaining the questionnaire.
     */
    protected StringType publisher;

    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     */
    protected List<ContactPoint> telecom;

    /**
     * Identifies the types of subjects that can be the subject of the questionnaire.
     */
    protected List<CodeType> subjectType;

    /**
     * A collection of related questions (or further groupings of questions).
     */
    protected GroupComponent group;

    private static final long serialVersionUID = -1348292652L;

    /*
   * Constructor
   */
    public Questionnaire() {
        super();
    }

    /*
   * Constructor
   */
    public Questionnaire(Enumeration<QuestionnaireStatus> status, GroupComponent group) {
        super();
        this.status = status;
        this.group = group;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
     * @return {@link #identifier} (This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
    public Questionnaire addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #version} (The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Questionnaire.version");
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
     * @param value {@link #version} (The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public Questionnaire setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated.
     */
    public Questionnaire setVersion(String value) {
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
     * @return {@link #status} (The lifecycle status of the questionnaire as a whole.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<QuestionnaireStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Questionnaire.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<QuestionnaireStatus>(new QuestionnaireStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The lifecycle status of the questionnaire as a whole.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Questionnaire setStatusElement(Enumeration<QuestionnaireStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The lifecycle status of the questionnaire as a whole.
     */
    public QuestionnaireStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The lifecycle status of the questionnaire as a whole.
     */
    public Questionnaire setStatus(QuestionnaireStatus value) {
        if (this.status == null)
            this.status = new Enumeration<QuestionnaireStatus>(new QuestionnaireStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #date} (The date that this questionnaire was last changed.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Questionnaire.date");
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
     * @param value {@link #date} (The date that this questionnaire was last changed.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Questionnaire setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date that this questionnaire was last changed.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date that this questionnaire was last changed.
     */
    public Questionnaire setDate(Date value) {
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
     * @return {@link #publisher} (Organization or person responsible for developing and maintaining the questionnaire.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() {
        if (this.publisher == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Questionnaire.publisher");
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
     * @param value {@link #publisher} (Organization or person responsible for developing and maintaining the questionnaire.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public Questionnaire setPublisherElement(StringType value) {
        this.publisher = value;
        return this;
    }

    /**
     * @return Organization or person responsible for developing and maintaining the questionnaire.
     */
    public String getPublisher() {
        return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value Organization or person responsible for developing and maintaining the questionnaire.
     */
    public Questionnaire setPublisher(String value) {
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
     * @return {@link #telecom} (Contact details to assist a user in finding and communicating with the publisher.)
     */
    public List<ContactPoint> getTelecom() {
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        return this.telecom;
    }

    public boolean hasTelecom() {
        if (this.telecom == null)
            return false;
        for (ContactPoint item : this.telecom) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #telecom} (Contact details to assist a user in finding and communicating with the publisher.)
     */
    // syntactic sugar
    public ContactPoint addTelecom() {
        // 3
        ContactPoint t = new ContactPoint();
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return t;
    }

    // syntactic sugar
    public Questionnaire addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    /**
     * @return {@link #subjectType} (Identifies the types of subjects that can be the subject of the questionnaire.)
     */
    public List<CodeType> getSubjectType() {
        if (this.subjectType == null)
            this.subjectType = new ArrayList<CodeType>();
        return this.subjectType;
    }

    public boolean hasSubjectType() {
        if (this.subjectType == null)
            return false;
        for (CodeType item : this.subjectType) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #subjectType} (Identifies the types of subjects that can be the subject of the questionnaire.)
     */
    // syntactic sugar
    public CodeType addSubjectTypeElement() {
        // 2
        CodeType t = new CodeType();
        if (this.subjectType == null)
            this.subjectType = new ArrayList<CodeType>();
        this.subjectType.add(t);
        return t;
    }

    /**
     * @param value {@link #subjectType} (Identifies the types of subjects that can be the subject of the questionnaire.)
     */
    public Questionnaire addSubjectType(String value) {
        // 1
        CodeType t = new CodeType();
        t.setValue(value);
        if (this.subjectType == null)
            this.subjectType = new ArrayList<CodeType>();
        this.subjectType.add(t);
        return this;
    }

    /**
     * @param value {@link #subjectType} (Identifies the types of subjects that can be the subject of the questionnaire.)
     */
    public boolean hasSubjectType(String value) {
        if (this.subjectType == null)
            return false;
        for (CodeType v : this.subjectType) if (// code
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #group} (A collection of related questions (or further groupings of questions).)
     */
    public GroupComponent getGroup() {
        if (this.group == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Questionnaire.group");
            else if (Configuration.doAutoCreate())
                // cc
                this.group = new GroupComponent();
        return this.group;
    }

    public boolean hasGroup() {
        return this.group != null && !this.group.isEmpty();
    }

    /**
     * @param value {@link #group} (A collection of related questions (or further groupings of questions).)
     */
    public Questionnaire setGroup(GroupComponent value) {
        this.group = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("version", "string", "The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("status", "code", "The lifecycle status of the questionnaire as a whole.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("date", "dateTime", "The date that this questionnaire was last changed.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("publisher", "string", "Organization or person responsible for developing and maintaining the questionnaire.", 0, java.lang.Integer.MAX_VALUE, publisher));
        childrenList.add(new Property("telecom", "ContactPoint", "Contact details to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, telecom));
        childrenList.add(new Property("subjectType", "code", "Identifies the types of subjects that can be the subject of the questionnaire.", 0, java.lang.Integer.MAX_VALUE, subjectType));
        childrenList.add(new Property("group", "", "A collection of related questions (or further groupings of questions).", 0, java.lang.Integer.MAX_VALUE, group));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("version"))
            // StringType
            this.version = castToString(value);
        else if (name.equals("status"))
            // Enumeration<QuestionnaireStatus>
            this.status = new QuestionnaireStatusEnumFactory().fromType(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("publisher"))
            // StringType
            this.publisher = castToString(value);
        else if (name.equals("telecom"))
            this.getTelecom().add(castToContactPoint(value));
        else if (name.equals("subjectType"))
            this.getSubjectType().add(castToCode(value));
        else if (name.equals("group"))
            // GroupComponent
            this.group = (GroupComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.version");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.status");
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.date");
        } else if (name.equals("publisher")) {
            throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.publisher");
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else if (name.equals("subjectType")) {
            throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.subjectType");
        } else if (name.equals("group")) {
            this.group = new GroupComponent();
            return this.group;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Questionnaire";
    }

    public Questionnaire copy() {
        Questionnaire dst = new Questionnaire();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.version = version == null ? null : version.copy();
        dst.status = status == null ? null : status.copy();
        dst.date = date == null ? null : date.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (telecom != null) {
            dst.telecom = new ArrayList<ContactPoint>();
            for (ContactPoint i : telecom) dst.telecom.add(i.copy());
        }
        ;
        if (subjectType != null) {
            dst.subjectType = new ArrayList<CodeType>();
            for (CodeType i : subjectType) dst.subjectType.add(i.copy());
        }
        ;
        dst.group = group == null ? null : group.copy();
        return dst;
    }

    protected Questionnaire typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Questionnaire))
            return false;
        Questionnaire o = (Questionnaire) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(version, o.version, true) && compareDeep(status, o.status, true) && compareDeep(date, o.date, true) && compareDeep(publisher, o.publisher, true) && compareDeep(telecom, o.telecom, true) && compareDeep(subjectType, o.subjectType, true) && compareDeep(group, o.group, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Questionnaire))
            return false;
        Questionnaire o = (Questionnaire) other;
        return compareValues(version, o.version, true) && compareValues(status, o.status, true) && compareValues(date, o.date, true) && compareValues(publisher, o.publisher, true) && compareValues(subjectType, o.subjectType, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (version == null || version.isEmpty()) && (status == null || status.isEmpty()) && (date == null || date.isEmpty()) && (publisher == null || publisher.isEmpty()) && (telecom == null || telecom.isEmpty()) && (subjectType == null || subjectType.isEmpty()) && (group == null || group.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Questionnaire;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CODE = "code";

    public static final String SP_PUBLISHER = "publisher";

    public static final String SP_TITLE = "title";

    public static final String SP_VERSION = "version";

    public static final String SP_STATUS = "status";
}
