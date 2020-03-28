package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireResponseEnum.QuestionnaireResponseStatus;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireResponseEnum.QuestionnaireResponseStatusEnumFactory;

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
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 */
public class QuestionnaireResponse extends DomainResource {

    /**
     * A business identifier assigned to a particular completed (or partially completed) questionnaire.
     */
    protected Identifier identifier;

    /**
     * Indicates the Questionnaire resource that defines the form for which answers are being provided.
     */
    protected Reference questionnaire;

    /**
     * The actual object that is the target of the reference (Indicates the Questionnaire resource that defines the form for which answers are being provided.)
     */
    protected Questionnaire questionnaireTarget;

    /**
     * The lifecycle status of the questionnaire response as a whole.
     */
    protected Enumeration<QuestionnaireResponseStatus> status;

    /**
     * The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.)
     */
    protected Resource subjectTarget;

    /**
     * Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.
     */
    protected Reference author;

    /**
     * The actual object that is the target of the reference (Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.)
     */
    protected Resource authorTarget;

    /**
     * The date and/or time that this version of the questionnaire response was authored.
     */
    protected DateTimeType authored;

    /**
     * The person who answered the questions about the subject.
     */
    protected Reference source;

    /**
     * The actual object that is the target of the reference (The person who answered the questions about the subject.)
     */
    protected Resource sourceTarget;

    /**
     * Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers.)
     */
    protected Encounter encounterTarget;

    /**
     * A group of questions to a possibly similarly grouped set of questions in the questionnaire response.
     */
    protected GroupComponent group;

    private static final long serialVersionUID = -1081988635L;

    /*
   * Constructor
   */
    public QuestionnaireResponse() {
        super();
    }

    /*
   * Constructor
   */
    public QuestionnaireResponse(Enumeration<QuestionnaireResponseStatus> status) {
        super();
        this.status = status;
    }

    /**
     * @return {@link #identifier} (A business identifier assigned to a particular completed (or partially completed) questionnaire.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (A business identifier assigned to a particular completed (or partially completed) questionnaire.)
     */
    public QuestionnaireResponse setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #questionnaire} (Indicates the Questionnaire resource that defines the form for which answers are being provided.)
     */
    public Reference getQuestionnaire() {
        if (this.questionnaire == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.questionnaire");
            else if (Configuration.doAutoCreate())
                // cc
                this.questionnaire = new Reference();
        return this.questionnaire;
    }

    public boolean hasQuestionnaire() {
        return this.questionnaire != null && !this.questionnaire.isEmpty();
    }

    /**
     * @param value {@link #questionnaire} (Indicates the Questionnaire resource that defines the form for which answers are being provided.)
     */
    public QuestionnaireResponse setQuestionnaire(Reference value) {
        this.questionnaire = value;
        return this;
    }

    /**
     * @return {@link #questionnaire} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Indicates the Questionnaire resource that defines the form for which answers are being provided.)
     */
    public Questionnaire getQuestionnaireTarget() {
        if (this.questionnaireTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.questionnaire");
            else if (Configuration.doAutoCreate())
                // aa
                this.questionnaireTarget = new Questionnaire();
        return this.questionnaireTarget;
    }

    /**
     * @param value {@link #questionnaire} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Indicates the Questionnaire resource that defines the form for which answers are being provided.)
     */
    public QuestionnaireResponse setQuestionnaireTarget(Questionnaire value) {
        this.questionnaireTarget = value;
        return this;
    }

    /**
     * @return {@link #status} (The lifecycle status of the questionnaire response as a whole.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<QuestionnaireResponseStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<QuestionnaireResponseStatus>(new QuestionnaireResponseStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The lifecycle status of the questionnaire response as a whole.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public QuestionnaireResponse setStatusElement(Enumeration<QuestionnaireResponseStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The lifecycle status of the questionnaire response as a whole.
     */
    public QuestionnaireResponseStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The lifecycle status of the questionnaire response as a whole.
     */
    public QuestionnaireResponse setStatus(QuestionnaireResponseStatus value) {
        if (this.status == null)
            this.status = new Enumeration<QuestionnaireResponseStatus>(new QuestionnaireResponseStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #subject} (The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.)
     */
    public QuestionnaireResponse setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.)
     */
    public QuestionnaireResponse setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #author} (Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.)
     */
    public Reference getAuthor() {
        if (this.author == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.author");
            else if (Configuration.doAutoCreate())
                // cc
                this.author = new Reference();
        return this.author;
    }

    public boolean hasAuthor() {
        return this.author != null && !this.author.isEmpty();
    }

    /**
     * @param value {@link #author} (Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.)
     */
    public QuestionnaireResponse setAuthor(Reference value) {
        this.author = value;
        return this;
    }

    /**
     * @return {@link #author} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.)
     */
    public Resource getAuthorTarget() {
        return this.authorTarget;
    }

    /**
     * @param value {@link #author} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.)
     */
    public QuestionnaireResponse setAuthorTarget(Resource value) {
        this.authorTarget = value;
        return this;
    }

    /**
     * @return {@link #authored} (The date and/or time that this version of the questionnaire response was authored.). This is the underlying object with id, value and extensions. The accessor "getAuthored" gives direct access to the value
     */
    public DateTimeType getAuthoredElement() {
        if (this.authored == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.authored");
            else if (Configuration.doAutoCreate())
                // bb
                this.authored = new DateTimeType();
        return this.authored;
    }

    public boolean hasAuthoredElement() {
        return this.authored != null && !this.authored.isEmpty();
    }

    public boolean hasAuthored() {
        return this.authored != null && !this.authored.isEmpty();
    }

    /**
     * @param value {@link #authored} (The date and/or time that this version of the questionnaire response was authored.). This is the underlying object with id, value and extensions. The accessor "getAuthored" gives direct access to the value
     */
    public QuestionnaireResponse setAuthoredElement(DateTimeType value) {
        this.authored = value;
        return this;
    }

    /**
     * @return The date and/or time that this version of the questionnaire response was authored.
     */
    public Date getAuthored() {
        return this.authored == null ? null : this.authored.getValue();
    }

    /**
     * @param value The date and/or time that this version of the questionnaire response was authored.
     */
    public QuestionnaireResponse setAuthored(Date value) {
        if (value == null)
            this.authored = null;
        else {
            if (this.authored == null)
                this.authored = new DateTimeType();
            this.authored.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #source} (The person who answered the questions about the subject.)
     */
    public Reference getSource() {
        if (this.source == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.source");
            else if (Configuration.doAutoCreate())
                // cc
                this.source = new Reference();
        return this.source;
    }

    public boolean hasSource() {
        return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (The person who answered the questions about the subject.)
     */
    public QuestionnaireResponse setSource(Reference value) {
        this.source = value;
        return this;
    }

    /**
     * @return {@link #source} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person who answered the questions about the subject.)
     */
    public Resource getSourceTarget() {
        return this.sourceTarget;
    }

    /**
     * @param value {@link #source} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person who answered the questions about the subject.)
     */
    public QuestionnaireResponse setSourceTarget(Resource value) {
        this.sourceTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers.)
     */
    public QuestionnaireResponse setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers.)
     */
    public QuestionnaireResponse setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #group} (A group of questions to a possibly similarly grouped set of questions in the questionnaire response.)
     */
    public GroupComponent getGroup() {
        if (this.group == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create QuestionnaireResponse.group");
            else if (Configuration.doAutoCreate())
                // cc
                this.group = new GroupComponent();
        return this.group;
    }

    public boolean hasGroup() {
        return this.group != null && !this.group.isEmpty();
    }

    /**
     * @param value {@link #group} (A group of questions to a possibly similarly grouped set of questions in the questionnaire response.)
     */
    public QuestionnaireResponse setGroup(GroupComponent value) {
        this.group = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "A business identifier assigned to a particular completed (or partially completed) questionnaire.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("questionnaire", "Reference(Questionnaire)", "Indicates the Questionnaire resource that defines the form for which answers are being provided.", 0, java.lang.Integer.MAX_VALUE, questionnaire));
        childrenList.add(new Property("status", "code", "The lifecycle status of the questionnaire response as a whole.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("subject", "Reference(Any)", "The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("author", "Reference(Device|Practitioner|Patient|RelatedPerson)", "Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("authored", "dateTime", "The date and/or time that this version of the questionnaire response was authored.", 0, java.lang.Integer.MAX_VALUE, authored));
        childrenList.add(new Property("source", "Reference(Patient|Practitioner|RelatedPerson)", "The person who answered the questions about the subject.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("group", "", "A group of questions to a possibly similarly grouped set of questions in the questionnaire response.", 0, java.lang.Integer.MAX_VALUE, group));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("questionnaire"))
            // Reference
            this.questionnaire = castToReference(value);
        else if (name.equals("status"))
            // Enumeration<QuestionnaireResponseStatus>
            this.status = new QuestionnaireResponseStatusEnumFactory().fromType(value);
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("author"))
            // Reference
            this.author = castToReference(value);
        else if (name.equals("authored"))
            // DateTimeType
            this.authored = castToDateTime(value);
        else if (name.equals("source"))
            // Reference
            this.source = castToReference(value);
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("group"))
            // GroupComponent
            this.group = (GroupComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("questionnaire")) {
            this.questionnaire = new Reference();
            return this.questionnaire;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.status");
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("author")) {
            this.author = new Reference();
            return this.author;
        } else if (name.equals("authored")) {
            throw new FHIRException("Cannot call addChild on a primitive type QuestionnaireResponse.authored");
        } else if (name.equals("source")) {
            this.source = new Reference();
            return this.source;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("group")) {
            this.group = new GroupComponent();
            return this.group;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "QuestionnaireResponse";
    }

    public QuestionnaireResponse copy() {
        QuestionnaireResponse dst = new QuestionnaireResponse();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.questionnaire = questionnaire == null ? null : questionnaire.copy();
        dst.status = status == null ? null : status.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.author = author == null ? null : author.copy();
        dst.authored = authored == null ? null : authored.copy();
        dst.source = source == null ? null : source.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.group = group == null ? null : group.copy();
        return dst;
    }

    protected QuestionnaireResponse typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof QuestionnaireResponse))
            return false;
        QuestionnaireResponse o = (QuestionnaireResponse) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(questionnaire, o.questionnaire, true) && compareDeep(status, o.status, true) && compareDeep(subject, o.subject, true) && compareDeep(author, o.author, true) && compareDeep(authored, o.authored, true) && compareDeep(source, o.source, true) && compareDeep(encounter, o.encounter, true) && compareDeep(group, o.group, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof QuestionnaireResponse))
            return false;
        QuestionnaireResponse o = (QuestionnaireResponse) other;
        return compareValues(status, o.status, true) && compareValues(authored, o.authored, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (questionnaire == null || questionnaire.isEmpty()) && (status == null || status.isEmpty()) && (subject == null || subject.isEmpty()) && (author == null || author.isEmpty()) && (authored == null || authored.isEmpty()) && (source == null || source.isEmpty()) && (encounter == null || encounter.isEmpty()) && (group == null || group.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.QuestionnaireResponse;
    }

    public static final String SP_AUTHORED = "authored";

    public static final String SP_QUESTIONNAIRE = "questionnaire";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_AUTHOR = "author";

    public static final String SP_PATIENT = "patient";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_SOURCE = "source";

    public static final String SP_STATUS = "status";
}
