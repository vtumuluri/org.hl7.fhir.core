package org.hl7.fhir.android.generated.dstu2;

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
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.QuestionnaireStatus;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.QuestionnaireStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.AnswerFormat;
import org.hl7.fhir.android.generated.dstu2.QuestionnaireEnum.AnswerFormatEnumFactory;

/**
 * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 */
@ResourceDef(name = "Questionnaire", profile = "http://hl7.org/fhir/Profile/Questionnaire")
public class Questionnaire extends DomainResource {

    @Block()
    public static class GroupComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.
         */
        @Child(name = "linkId", type = { StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "To link questionnaire with questionnaire response", formalDefinition = "An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.")
        protected StringType linkId;

        /**
         * The human-readable name for this section of the questionnaire.
         */
        @Child(name = "title", type = { StringType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Name to be displayed for group", formalDefinition = "The human-readable name for this section of the questionnaire.")
        protected StringType title;

        /**
         * Identifies a how this group of questions is known in a particular terminology such as LOINC.
         */
        @Child(name = "concept", type = { Coding.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
        @Description(shortDefinition = "Concept that represents this section in a questionnaire", formalDefinition = "Identifies a how this group of questions is known in a particular terminology such as LOINC.")
        protected List<Coding> concept;

        /**
         * Additional text for the group, used for display purposes.
         */
        @Child(name = "text", type = { StringType.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Additional text for the group", formalDefinition = "Additional text for the group, used for display purposes.")
        protected StringType text;

        /**
         * If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.
         */
        @Child(name = "required", type = { BooleanType.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Whether the group must be included in data results", formalDefinition = "If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.")
        protected BooleanType required;

        /**
         * Whether the group may occur multiple times in the instance, containing multiple sets of answers.
         */
        @Child(name = "repeats", type = { BooleanType.class }, order = 6, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Whether the group may repeat", formalDefinition = "Whether the group may occur multiple times in the instance, containing multiple sets of answers.")
        protected BooleanType repeats;

        /**
         * A sub-group within a group. The ordering of groups within this group is relevant.
         */
        @Child(name = "group", type = { GroupComponent.class }, order = 7, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
        @Description(shortDefinition = "Nested questionnaire group", formalDefinition = "A sub-group within a group. The ordering of groups within this group is relevant.")
        protected List<GroupComponent> group;

        /**
         * Set of questions within this group. The order of questions within the group is relevant.
         */
        @Child(name = "question", type = {}, order = 8, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
        @Description(shortDefinition = "Questions in this group", formalDefinition = "Set of questions within this group. The order of questions within the group is relevant.")
        protected List<QuestionComponent> question;

        private static final long serialVersionUID = 494129548L;

        /*
     * Constructor
     */
        public GroupComponent() {
            super();
        }

        /**
         * @return {@link #linkId} (An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.). This is the underlying object with id, value and extensions. The accessor "getLinkId" gives direct access to the value
         */
        public StringType getLinkIdElement() {
            if (this.linkId == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create GroupComponent.linkId");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.linkId = new StringType();
            return this.linkId;
        }

        public boolean hasLinkIdElement() {
            return this.linkId != null && !this.linkId.isEmpty();
        }

        public boolean hasLinkId() {
            return this.linkId != null && !this.linkId.isEmpty();
        }

        /**
         * @param value {@link #linkId} (An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.). This is the underlying object with id, value and extensions. The accessor "getLinkId" gives direct access to the value
         */
        public GroupComponent setLinkIdElement(StringType value) {
            this.linkId = value;
            return this;
        }

        /**
         * @return An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.
         */
        public String getLinkId() {
            return this.linkId == null ? null : this.linkId.getValue();
        }

        /**
         * @param value An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.
         */
        public GroupComponent setLinkId(String value) {
            if (Utilities.noString(value))
                this.linkId = null;
            else {
                if (this.linkId == null)
                    this.linkId = new StringType();
                this.linkId.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #title} (The human-readable name for this section of the questionnaire.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
         */
        public StringType getTitleElement() {
            if (this.title == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create GroupComponent.title");
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
         * @param value {@link #title} (The human-readable name for this section of the questionnaire.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
         */
        public GroupComponent setTitleElement(StringType value) {
            this.title = value;
            return this;
        }

        /**
         * @return The human-readable name for this section of the questionnaire.
         */
        public String getTitle() {
            return this.title == null ? null : this.title.getValue();
        }

        /**
         * @param value The human-readable name for this section of the questionnaire.
         */
        public GroupComponent setTitle(String value) {
            if (Utilities.noString(value))
                this.title = null;
            else {
                if (this.title == null)
                    this.title = new StringType();
                this.title.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #concept} (Identifies a how this group of questions is known in a particular terminology such as LOINC.)
         */
        public List<Coding> getConcept() {
            if (this.concept == null)
                this.concept = new ArrayList<Coding>();
            return this.concept;
        }

        public boolean hasConcept() {
            if (this.concept == null)
                return false;
            for (Coding item : this.concept) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #concept} (Identifies a how this group of questions is known in a particular terminology such as LOINC.)
         */
        // syntactic sugar
        public Coding addConcept() {
            // 3
            Coding t = new Coding();
            if (this.concept == null)
                this.concept = new ArrayList<Coding>();
            this.concept.add(t);
            return t;
        }

        // syntactic sugar
        public GroupComponent addConcept(Coding t) {
            // 3
            if (t == null)
                return this;
            if (this.concept == null)
                this.concept = new ArrayList<Coding>();
            this.concept.add(t);
            return this;
        }

        /**
         * @return {@link #text} (Additional text for the group, used for display purposes.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
         */
        public StringType getTextElement() {
            if (this.text == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create GroupComponent.text");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.text = new StringType();
            return this.text;
        }

        public boolean hasTextElement() {
            return this.text != null && !this.text.isEmpty();
        }

        public boolean hasText() {
            return this.text != null && !this.text.isEmpty();
        }

        /**
         * @param value {@link #text} (Additional text for the group, used for display purposes.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
         */
        public GroupComponent setTextElement(StringType value) {
            this.text = value;
            return this;
        }

        /**
         * @return Additional text for the group, used for display purposes.
         */
        public String getText() {
            return this.text == null ? null : this.text.getValue();
        }

        /**
         * @param value Additional text for the group, used for display purposes.
         */
        public GroupComponent setText(String value) {
            if (Utilities.noString(value))
                this.text = null;
            else {
                if (this.text == null)
                    this.text = new StringType();
                this.text.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #required} (If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.). This is the underlying object with id, value and extensions. The accessor "getRequired" gives direct access to the value
         */
        public BooleanType getRequiredElement() {
            if (this.required == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create GroupComponent.required");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.required = new BooleanType();
            return this.required;
        }

        public boolean hasRequiredElement() {
            return this.required != null && !this.required.isEmpty();
        }

        public boolean hasRequired() {
            return this.required != null && !this.required.isEmpty();
        }

        /**
         * @param value {@link #required} (If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.). This is the underlying object with id, value and extensions. The accessor "getRequired" gives direct access to the value
         */
        public GroupComponent setRequiredElement(BooleanType value) {
            this.required = value;
            return this;
        }

        /**
         * @return If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.
         */
        public boolean getRequired() {
            return this.required == null || this.required.isEmpty() ? false : this.required.getValue();
        }

        /**
         * @param value If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.
         */
        public GroupComponent setRequired(boolean value) {
            if (this.required == null)
                this.required = new BooleanType();
            this.required.setValue(value);
            return this;
        }

        /**
         * @return {@link #repeats} (Whether the group may occur multiple times in the instance, containing multiple sets of answers.). This is the underlying object with id, value and extensions. The accessor "getRepeats" gives direct access to the value
         */
        public BooleanType getRepeatsElement() {
            if (this.repeats == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create GroupComponent.repeats");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.repeats = new BooleanType();
            return this.repeats;
        }

        public boolean hasRepeatsElement() {
            return this.repeats != null && !this.repeats.isEmpty();
        }

        public boolean hasRepeats() {
            return this.repeats != null && !this.repeats.isEmpty();
        }

        /**
         * @param value {@link #repeats} (Whether the group may occur multiple times in the instance, containing multiple sets of answers.). This is the underlying object with id, value and extensions. The accessor "getRepeats" gives direct access to the value
         */
        public GroupComponent setRepeatsElement(BooleanType value) {
            this.repeats = value;
            return this;
        }

        /**
         * @return Whether the group may occur multiple times in the instance, containing multiple sets of answers.
         */
        public boolean getRepeats() {
            return this.repeats == null || this.repeats.isEmpty() ? false : this.repeats.getValue();
        }

        /**
         * @param value Whether the group may occur multiple times in the instance, containing multiple sets of answers.
         */
        public GroupComponent setRepeats(boolean value) {
            if (this.repeats == null)
                this.repeats = new BooleanType();
            this.repeats.setValue(value);
            return this;
        }

        /**
         * @return {@link #group} (A sub-group within a group. The ordering of groups within this group is relevant.)
         */
        public List<GroupComponent> getGroup() {
            if (this.group == null)
                this.group = new ArrayList<GroupComponent>();
            return this.group;
        }

        public boolean hasGroup() {
            if (this.group == null)
                return false;
            for (GroupComponent item : this.group) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #group} (A sub-group within a group. The ordering of groups within this group is relevant.)
         */
        // syntactic sugar
        public GroupComponent addGroup() {
            // 3
            GroupComponent t = new GroupComponent();
            if (this.group == null)
                this.group = new ArrayList<GroupComponent>();
            this.group.add(t);
            return t;
        }

        // syntactic sugar
        public GroupComponent addGroup(GroupComponent t) {
            // 3
            if (t == null)
                return this;
            if (this.group == null)
                this.group = new ArrayList<GroupComponent>();
            this.group.add(t);
            return this;
        }

        /**
         * @return {@link #question} (Set of questions within this group. The order of questions within the group is relevant.)
         */
        public List<QuestionComponent> getQuestion() {
            if (this.question == null)
                this.question = new ArrayList<QuestionComponent>();
            return this.question;
        }

        public boolean hasQuestion() {
            if (this.question == null)
                return false;
            for (QuestionComponent item : this.question) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #question} (Set of questions within this group. The order of questions within the group is relevant.)
         */
        // syntactic sugar
        public QuestionComponent addQuestion() {
            // 3
            QuestionComponent t = new QuestionComponent();
            if (this.question == null)
                this.question = new ArrayList<QuestionComponent>();
            this.question.add(t);
            return t;
        }

        // syntactic sugar
        public GroupComponent addQuestion(QuestionComponent t) {
            // 3
            if (t == null)
                return this;
            if (this.question == null)
                this.question = new ArrayList<QuestionComponent>();
            this.question.add(t);
            return this;
        }

        protected void listChildren(List<Property> childrenList) {
            super.listChildren(childrenList);
            childrenList.add(new Property("linkId", "string", "An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.", 0, java.lang.Integer.MAX_VALUE, linkId));
            childrenList.add(new Property("title", "string", "The human-readable name for this section of the questionnaire.", 0, java.lang.Integer.MAX_VALUE, title));
            childrenList.add(new Property("concept", "Coding", "Identifies a how this group of questions is known in a particular terminology such as LOINC.", 0, java.lang.Integer.MAX_VALUE, concept));
            childrenList.add(new Property("text", "string", "Additional text for the group, used for display purposes.", 0, java.lang.Integer.MAX_VALUE, text));
            childrenList.add(new Property("required", "boolean", "If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.", 0, java.lang.Integer.MAX_VALUE, required));
            childrenList.add(new Property("repeats", "boolean", "Whether the group may occur multiple times in the instance, containing multiple sets of answers.", 0, java.lang.Integer.MAX_VALUE, repeats));
            childrenList.add(new Property("group", "@Questionnaire.group", "A sub-group within a group. The ordering of groups within this group is relevant.", 0, java.lang.Integer.MAX_VALUE, group));
            childrenList.add(new Property("question", "", "Set of questions within this group. The order of questions within the group is relevant.", 0, java.lang.Integer.MAX_VALUE, question));
        }

        @Override
        public void setProperty(String name, Base value) throws FHIRException {
            if (name.equals("linkId"))
                // StringType
                this.linkId = castToString(value);
            else if (name.equals("title"))
                // StringType
                this.title = castToString(value);
            else if (name.equals("concept"))
                this.getConcept().add(castToCoding(value));
            else if (name.equals("text"))
                // StringType
                this.text = castToString(value);
            else if (name.equals("required"))
                // BooleanType
                this.required = castToBoolean(value);
            else if (name.equals("repeats"))
                // BooleanType
                this.repeats = castToBoolean(value);
            else if (name.equals("group"))
                this.getGroup().add((GroupComponent) value);
            else if (name.equals("question"))
                this.getQuestion().add((QuestionComponent) value);
            else
                super.setProperty(name, value);
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("linkId")) {
                throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.linkId");
            } else if (name.equals("title")) {
                throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.title");
            } else if (name.equals("concept")) {
                return addConcept();
            } else if (name.equals("text")) {
                throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.text");
            } else if (name.equals("required")) {
                throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.required");
            } else if (name.equals("repeats")) {
                throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.repeats");
            } else if (name.equals("group")) {
                return addGroup();
            } else if (name.equals("question")) {
                return addQuestion();
            } else
                return super.addChild(name);
        }

        public GroupComponent copy() {
            GroupComponent dst = new GroupComponent();
            copyValues(dst);
            dst.linkId = linkId == null ? null : linkId.copy();
            dst.title = title == null ? null : title.copy();
            if (concept != null) {
                dst.concept = new ArrayList<Coding>();
                for (Coding i : concept) dst.concept.add(i.copy());
            }
            ;
            dst.text = text == null ? null : text.copy();
            dst.required = required == null ? null : required.copy();
            dst.repeats = repeats == null ? null : repeats.copy();
            if (group != null) {
                dst.group = new ArrayList<GroupComponent>();
                for (GroupComponent i : group) dst.group.add(i.copy());
            }
            ;
            if (question != null) {
                dst.question = new ArrayList<QuestionComponent>();
                for (QuestionComponent i : question) dst.question.add(i.copy());
            }
            ;
            return dst;
        }

        @Override
        public boolean equalsDeep(Base other) {
            if (!super.equalsDeep(other))
                return false;
            if (!(other instanceof GroupComponent))
                return false;
            GroupComponent o = (GroupComponent) other;
            return compareDeep(linkId, o.linkId, true) && compareDeep(title, o.title, true) && compareDeep(concept, o.concept, true) && compareDeep(text, o.text, true) && compareDeep(required, o.required, true) && compareDeep(repeats, o.repeats, true) && compareDeep(group, o.group, true) && compareDeep(question, o.question, true);
        }

        @Override
        public boolean equalsShallow(Base other) {
            if (!super.equalsShallow(other))
                return false;
            if (!(other instanceof GroupComponent))
                return false;
            GroupComponent o = (GroupComponent) other;
            return compareValues(linkId, o.linkId, true) && compareValues(title, o.title, true) && compareValues(text, o.text, true) && compareValues(required, o.required, true) && compareValues(repeats, o.repeats, true);
        }

        public boolean isEmpty() {
            return super.isEmpty() && (linkId == null || linkId.isEmpty()) && (title == null || title.isEmpty()) && (concept == null || concept.isEmpty()) && (text == null || text.isEmpty()) && (required == null || required.isEmpty()) && (repeats == null || repeats.isEmpty()) && (group == null || group.isEmpty()) && (question == null || question.isEmpty());
        }

        public String fhirType() {
            return "Questionnaire.group";
        }
    }

    @Block()
    public static class QuestionComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.
         */
        @Child(name = "linkId", type = { StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "To link questionnaire with questionnaire response", formalDefinition = "An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.")
        protected StringType linkId;

        /**
         * Identifies a how this question is known in a particular terminology such as LOINC.
         */
        @Child(name = "concept", type = { Coding.class }, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
        @Description(shortDefinition = "Concept that represents this question on a questionnaire", formalDefinition = "Identifies a how this question is known in a particular terminology such as LOINC.")
        protected List<Coding> concept;

        /**
         * The actual question as shown to the user to prompt them for an answer.
         */
        @Child(name = "text", type = { StringType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Text of the question as it is shown to the user", formalDefinition = "The actual question as shown to the user to prompt them for an answer.")
        protected StringType text;

        /**
         * The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected.
         */
        @Child(name = "type", type = { CodeType.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "boolean | decimal | integer | date | dateTime +", formalDefinition = "The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected.")
        protected Enumeration<AnswerFormat> type;

        /**
         * If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.
         */
        @Child(name = "required", type = { BooleanType.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Whether the question must be answered in data results", formalDefinition = "If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.")
        protected BooleanType required;

        /**
         * If true, the question may have more than one answer.
         */
        @Child(name = "repeats", type = { BooleanType.class }, order = 6, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Whether the question  can have multiple answers", formalDefinition = "If true, the question may have more than one answer.")
        protected BooleanType repeats;

        /**
         * Reference to a value set containing a list of codes representing permitted answers for the question.
         */
        @Child(name = "options", type = { ValueSet.class }, order = 7, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Valueset containing permitted answers", formalDefinition = "Reference to a value set containing a list of codes representing permitted answers for the question.")
        protected Reference options;

        /**
         * The actual object that is the target of the reference (Reference to a value set containing a list of codes representing permitted answers for the question.)
         */
        protected ValueSet optionsTarget;

        /**
         * For a "choice" question, identifies one of the permitted answers for the question.
         */
        @Child(name = "option", type = { Coding.class }, order = 8, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
        @Description(shortDefinition = "Permitted answer", formalDefinition = "For a \"choice\" question, identifies one of the permitted answers for the question.")
        protected List<Coding> option;

        /**
         * Nested group, containing nested question for this question. The order of groups within the question is relevant.
         */
        @Child(name = "group", type = { GroupComponent.class }, order = 9, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
        @Description(shortDefinition = "Nested questionnaire group", formalDefinition = "Nested group, containing nested question for this question. The order of groups within the question is relevant.")
        protected List<GroupComponent> group;

        private static final long serialVersionUID = -1078951042L;

        /*
     * Constructor
     */
        public QuestionComponent() {
            super();
        }

        /**
         * @return {@link #linkId} (An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.). This is the underlying object with id, value and extensions. The accessor "getLinkId" gives direct access to the value
         */
        public StringType getLinkIdElement() {
            if (this.linkId == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create QuestionComponent.linkId");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.linkId = new StringType();
            return this.linkId;
        }

        public boolean hasLinkIdElement() {
            return this.linkId != null && !this.linkId.isEmpty();
        }

        public boolean hasLinkId() {
            return this.linkId != null && !this.linkId.isEmpty();
        }

        /**
         * @param value {@link #linkId} (An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.). This is the underlying object with id, value and extensions. The accessor "getLinkId" gives direct access to the value
         */
        public QuestionComponent setLinkIdElement(StringType value) {
            this.linkId = value;
            return this;
        }

        /**
         * @return An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.
         */
        public String getLinkId() {
            return this.linkId == null ? null : this.linkId.getValue();
        }

        /**
         * @param value An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.
         */
        public QuestionComponent setLinkId(String value) {
            if (Utilities.noString(value))
                this.linkId = null;
            else {
                if (this.linkId == null)
                    this.linkId = new StringType();
                this.linkId.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #concept} (Identifies a how this question is known in a particular terminology such as LOINC.)
         */
        public List<Coding> getConcept() {
            if (this.concept == null)
                this.concept = new ArrayList<Coding>();
            return this.concept;
        }

        public boolean hasConcept() {
            if (this.concept == null)
                return false;
            for (Coding item : this.concept) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #concept} (Identifies a how this question is known in a particular terminology such as LOINC.)
         */
        // syntactic sugar
        public Coding addConcept() {
            // 3
            Coding t = new Coding();
            if (this.concept == null)
                this.concept = new ArrayList<Coding>();
            this.concept.add(t);
            return t;
        }

        // syntactic sugar
        public QuestionComponent addConcept(Coding t) {
            // 3
            if (t == null)
                return this;
            if (this.concept == null)
                this.concept = new ArrayList<Coding>();
            this.concept.add(t);
            return this;
        }

        /**
         * @return {@link #text} (The actual question as shown to the user to prompt them for an answer.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
         */
        public StringType getTextElement() {
            if (this.text == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create QuestionComponent.text");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.text = new StringType();
            return this.text;
        }

        public boolean hasTextElement() {
            return this.text != null && !this.text.isEmpty();
        }

        public boolean hasText() {
            return this.text != null && !this.text.isEmpty();
        }

        /**
         * @param value {@link #text} (The actual question as shown to the user to prompt them for an answer.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
         */
        public QuestionComponent setTextElement(StringType value) {
            this.text = value;
            return this;
        }

        /**
         * @return The actual question as shown to the user to prompt them for an answer.
         */
        public String getText() {
            return this.text == null ? null : this.text.getValue();
        }

        /**
         * @param value The actual question as shown to the user to prompt them for an answer.
         */
        public QuestionComponent setText(String value) {
            if (Utilities.noString(value))
                this.text = null;
            else {
                if (this.text == null)
                    this.text = new StringType();
                this.text.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #type} (The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public Enumeration<AnswerFormat> getTypeElement() {
            if (this.type == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create QuestionComponent.type");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.type = new Enumeration<AnswerFormat>(new AnswerFormatEnumFactory());
            return this.type;
        }

        public boolean hasTypeElement() {
            return this.type != null && !this.type.isEmpty();
        }

        public boolean hasType() {
            return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public QuestionComponent setTypeElement(Enumeration<AnswerFormat> value) {
            this.type = value;
            return this;
        }

        /**
         * @return The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected.
         */
        public AnswerFormat getType() {
            return this.type == null ? null : this.type.getValue();
        }

        /**
         * @param value The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected.
         */
        public QuestionComponent setType(AnswerFormat value) {
            if (value == null)
                this.type = null;
            else {
                if (this.type == null)
                    this.type = new Enumeration<AnswerFormat>(new AnswerFormatEnumFactory());
                this.type.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #required} (If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.). This is the underlying object with id, value and extensions. The accessor "getRequired" gives direct access to the value
         */
        public BooleanType getRequiredElement() {
            if (this.required == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create QuestionComponent.required");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.required = new BooleanType();
            return this.required;
        }

        public boolean hasRequiredElement() {
            return this.required != null && !this.required.isEmpty();
        }

        public boolean hasRequired() {
            return this.required != null && !this.required.isEmpty();
        }

        /**
         * @param value {@link #required} (If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.). This is the underlying object with id, value and extensions. The accessor "getRequired" gives direct access to the value
         */
        public QuestionComponent setRequiredElement(BooleanType value) {
            this.required = value;
            return this;
        }

        /**
         * @return If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.
         */
        public boolean getRequired() {
            return this.required == null || this.required.isEmpty() ? false : this.required.getValue();
        }

        /**
         * @param value If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.
         */
        public QuestionComponent setRequired(boolean value) {
            if (this.required == null)
                this.required = new BooleanType();
            this.required.setValue(value);
            return this;
        }

        /**
         * @return {@link #repeats} (If true, the question may have more than one answer.). This is the underlying object with id, value and extensions. The accessor "getRepeats" gives direct access to the value
         */
        public BooleanType getRepeatsElement() {
            if (this.repeats == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create QuestionComponent.repeats");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.repeats = new BooleanType();
            return this.repeats;
        }

        public boolean hasRepeatsElement() {
            return this.repeats != null && !this.repeats.isEmpty();
        }

        public boolean hasRepeats() {
            return this.repeats != null && !this.repeats.isEmpty();
        }

        /**
         * @param value {@link #repeats} (If true, the question may have more than one answer.). This is the underlying object with id, value and extensions. The accessor "getRepeats" gives direct access to the value
         */
        public QuestionComponent setRepeatsElement(BooleanType value) {
            this.repeats = value;
            return this;
        }

        /**
         * @return If true, the question may have more than one answer.
         */
        public boolean getRepeats() {
            return this.repeats == null || this.repeats.isEmpty() ? false : this.repeats.getValue();
        }

        /**
         * @param value If true, the question may have more than one answer.
         */
        public QuestionComponent setRepeats(boolean value) {
            if (this.repeats == null)
                this.repeats = new BooleanType();
            this.repeats.setValue(value);
            return this;
        }

        /**
         * @return {@link #options} (Reference to a value set containing a list of codes representing permitted answers for the question.)
         */
        public Reference getOptions() {
            if (this.options == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create QuestionComponent.options");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.options = new Reference();
            return this.options;
        }

        public boolean hasOptions() {
            return this.options != null && !this.options.isEmpty();
        }

        /**
         * @param value {@link #options} (Reference to a value set containing a list of codes representing permitted answers for the question.)
         */
        public QuestionComponent setOptions(Reference value) {
            this.options = value;
            return this;
        }

        /**
         * @return {@link #options} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Reference to a value set containing a list of codes representing permitted answers for the question.)
         */
        public ValueSet getOptionsTarget() {
            if (this.optionsTarget == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create QuestionComponent.options");
                else if (Configuration.doAutoCreate())
                    // aa
                    this.optionsTarget = new ValueSet();
            return this.optionsTarget;
        }

        /**
         * @param value {@link #options} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Reference to a value set containing a list of codes representing permitted answers for the question.)
         */
        public QuestionComponent setOptionsTarget(ValueSet value) {
            this.optionsTarget = value;
            return this;
        }

        /**
         * @return {@link #option} (For a "choice" question, identifies one of the permitted answers for the question.)
         */
        public List<Coding> getOption() {
            if (this.option == null)
                this.option = new ArrayList<Coding>();
            return this.option;
        }

        public boolean hasOption() {
            if (this.option == null)
                return false;
            for (Coding item : this.option) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #option} (For a "choice" question, identifies one of the permitted answers for the question.)
         */
        // syntactic sugar
        public Coding addOption() {
            // 3
            Coding t = new Coding();
            if (this.option == null)
                this.option = new ArrayList<Coding>();
            this.option.add(t);
            return t;
        }

        // syntactic sugar
        public QuestionComponent addOption(Coding t) {
            // 3
            if (t == null)
                return this;
            if (this.option == null)
                this.option = new ArrayList<Coding>();
            this.option.add(t);
            return this;
        }

        /**
         * @return {@link #group} (Nested group, containing nested question for this question. The order of groups within the question is relevant.)
         */
        public List<GroupComponent> getGroup() {
            if (this.group == null)
                this.group = new ArrayList<GroupComponent>();
            return this.group;
        }

        public boolean hasGroup() {
            if (this.group == null)
                return false;
            for (GroupComponent item : this.group) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #group} (Nested group, containing nested question for this question. The order of groups within the question is relevant.)
         */
        // syntactic sugar
        public GroupComponent addGroup() {
            // 3
            GroupComponent t = new GroupComponent();
            if (this.group == null)
                this.group = new ArrayList<GroupComponent>();
            this.group.add(t);
            return t;
        }

        // syntactic sugar
        public QuestionComponent addGroup(GroupComponent t) {
            // 3
            if (t == null)
                return this;
            if (this.group == null)
                this.group = new ArrayList<GroupComponent>();
            this.group.add(t);
            return this;
        }

        protected void listChildren(List<Property> childrenList) {
            super.listChildren(childrenList);
            childrenList.add(new Property("linkId", "string", "An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.", 0, java.lang.Integer.MAX_VALUE, linkId));
            childrenList.add(new Property("concept", "Coding", "Identifies a how this question is known in a particular terminology such as LOINC.", 0, java.lang.Integer.MAX_VALUE, concept));
            childrenList.add(new Property("text", "string", "The actual question as shown to the user to prompt them for an answer.", 0, java.lang.Integer.MAX_VALUE, text));
            childrenList.add(new Property("type", "code", "The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected.", 0, java.lang.Integer.MAX_VALUE, type));
            childrenList.add(new Property("required", "boolean", "If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.", 0, java.lang.Integer.MAX_VALUE, required));
            childrenList.add(new Property("repeats", "boolean", "If true, the question may have more than one answer.", 0, java.lang.Integer.MAX_VALUE, repeats));
            childrenList.add(new Property("options", "Reference(ValueSet)", "Reference to a value set containing a list of codes representing permitted answers for the question.", 0, java.lang.Integer.MAX_VALUE, options));
            childrenList.add(new Property("option", "Coding", "For a \"choice\" question, identifies one of the permitted answers for the question.", 0, java.lang.Integer.MAX_VALUE, option));
            childrenList.add(new Property("group", "@Questionnaire.group", "Nested group, containing nested question for this question. The order of groups within the question is relevant.", 0, java.lang.Integer.MAX_VALUE, group));
        }

        @Override
        public void setProperty(String name, Base value) throws FHIRException {
            if (name.equals("linkId"))
                // StringType
                this.linkId = castToString(value);
            else if (name.equals("concept"))
                this.getConcept().add(castToCoding(value));
            else if (name.equals("text"))
                // StringType
                this.text = castToString(value);
            else if (name.equals("type"))
                // Enumeration<AnswerFormat>
                this.type = new AnswerFormatEnumFactory().fromType(value);
            else if (name.equals("required"))
                // BooleanType
                this.required = castToBoolean(value);
            else if (name.equals("repeats"))
                // BooleanType
                this.repeats = castToBoolean(value);
            else if (name.equals("options"))
                // Reference
                this.options = castToReference(value);
            else if (name.equals("option"))
                this.getOption().add(castToCoding(value));
            else if (name.equals("group"))
                this.getGroup().add((GroupComponent) value);
            else
                super.setProperty(name, value);
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("linkId")) {
                throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.linkId");
            } else if (name.equals("concept")) {
                return addConcept();
            } else if (name.equals("text")) {
                throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.text");
            } else if (name.equals("type")) {
                throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.type");
            } else if (name.equals("required")) {
                throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.required");
            } else if (name.equals("repeats")) {
                throw new FHIRException("Cannot call addChild on a primitive type Questionnaire.repeats");
            } else if (name.equals("options")) {
                this.options = new Reference();
                return this.options;
            } else if (name.equals("option")) {
                return addOption();
            } else if (name.equals("group")) {
                return addGroup();
            } else
                return super.addChild(name);
        }

        public QuestionComponent copy() {
            QuestionComponent dst = new QuestionComponent();
            copyValues(dst);
            dst.linkId = linkId == null ? null : linkId.copy();
            if (concept != null) {
                dst.concept = new ArrayList<Coding>();
                for (Coding i : concept) dst.concept.add(i.copy());
            }
            ;
            dst.text = text == null ? null : text.copy();
            dst.type = type == null ? null : type.copy();
            dst.required = required == null ? null : required.copy();
            dst.repeats = repeats == null ? null : repeats.copy();
            dst.options = options == null ? null : options.copy();
            if (option != null) {
                dst.option = new ArrayList<Coding>();
                for (Coding i : option) dst.option.add(i.copy());
            }
            ;
            if (group != null) {
                dst.group = new ArrayList<GroupComponent>();
                for (GroupComponent i : group) dst.group.add(i.copy());
            }
            ;
            return dst;
        }

        @Override
        public boolean equalsDeep(Base other) {
            if (!super.equalsDeep(other))
                return false;
            if (!(other instanceof QuestionComponent))
                return false;
            QuestionComponent o = (QuestionComponent) other;
            return compareDeep(linkId, o.linkId, true) && compareDeep(concept, o.concept, true) && compareDeep(text, o.text, true) && compareDeep(type, o.type, true) && compareDeep(required, o.required, true) && compareDeep(repeats, o.repeats, true) && compareDeep(options, o.options, true) && compareDeep(option, o.option, true) && compareDeep(group, o.group, true);
        }

        @Override
        public boolean equalsShallow(Base other) {
            if (!super.equalsShallow(other))
                return false;
            if (!(other instanceof QuestionComponent))
                return false;
            QuestionComponent o = (QuestionComponent) other;
            return compareValues(linkId, o.linkId, true) && compareValues(text, o.text, true) && compareValues(type, o.type, true) && compareValues(required, o.required, true) && compareValues(repeats, o.repeats, true);
        }

        public boolean isEmpty() {
            return super.isEmpty() && (linkId == null || linkId.isEmpty()) && (concept == null || concept.isEmpty()) && (text == null || text.isEmpty()) && (type == null || type.isEmpty()) && (required == null || required.isEmpty()) && (repeats == null || repeats.isEmpty()) && (options == null || options.isEmpty()) && (option == null || option.isEmpty()) && (group == null || group.isEmpty());
        }

        public String fhirType() {
            return "Questionnaire.group.question";
        }
    }

    /**
     * This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    @Child(name = "identifier", type = { Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "External identifiers for this questionnaire", formalDefinition = "This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).")
    protected List<Identifier> identifier;

    /**
     * The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated.
     */
    @Child(name = "version", type = { StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Logical identifier for this version of Questionnaire", formalDefinition = "The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated.")
    protected StringType version;

    /**
     * The lifecycle status of the questionnaire as a whole.
     */
    @Child(name = "status", type = { CodeType.class }, order = 2, min = 1, max = 1, modifier = true, summary = true)
    @Description(shortDefinition = "draft | published | retired", formalDefinition = "The lifecycle status of the questionnaire as a whole.")
    protected Enumeration<QuestionnaireStatus> status;

    /**
     * The date that this questionnaire was last changed.
     */
    @Child(name = "date", type = { DateTimeType.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Date this version was authored", formalDefinition = "The date that this questionnaire was last changed.")
    protected DateTimeType date;

    /**
     * Organization or person responsible for developing and maintaining the questionnaire.
     */
    @Child(name = "publisher", type = { StringType.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Organization/individual who designed the questionnaire", formalDefinition = "Organization or person responsible for developing and maintaining the questionnaire.")
    protected StringType publisher;

    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     */
    @Child(name = "telecom", type = { ContactPoint.class }, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Contact information of the publisher", formalDefinition = "Contact details to assist a user in finding and communicating with the publisher.")
    protected List<ContactPoint> telecom;

    /**
     * Identifies the types of subjects that can be the subject of the questionnaire.
     */
    @Child(name = "subjectType", type = { CodeType.class }, order = 6, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Resource that can be subject of QuestionnaireResponse", formalDefinition = "Identifies the types of subjects that can be the subject of the questionnaire.")
    protected List<CodeType> subjectType;

    /**
     * A collection of related questions (or further groupings of questions).
     */
    @Child(name = "group", type = {}, order = 7, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Grouped questions", formalDefinition = "A collection of related questions (or further groupings of questions).")
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

    @Override
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

    @Override
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

    @Override
    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Questionnaire))
            return false;
        Questionnaire o = (Questionnaire) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(version, o.version, true) && compareDeep(status, o.status, true) && compareDeep(date, o.date, true) && compareDeep(publisher, o.publisher, true) && compareDeep(telecom, o.telecom, true) && compareDeep(subjectType, o.subjectType, true) && compareDeep(group, o.group, true);
    }

    @Override
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

    @Override
    public ResourceType getResourceType() {
        return ResourceType.Questionnaire;
    }

    @SearchParamDefinition(name = "date", path = "Questionnaire.date", description = "When the questionnaire was last changed", type = "date")
    public static final String SP_DATE = "date";

    @SearchParamDefinition(name = "identifier", path = "Questionnaire.identifier", description = "An identifier for the questionnaire", type = "token")
    public static final String SP_IDENTIFIER = "identifier";

    @SearchParamDefinition(name = "code", path = "Questionnaire.group.concept", description = "A code that corresponds to the questionnaire or one of its groups", type = "token")
    public static final String SP_CODE = "code";

    @SearchParamDefinition(name = "publisher", path = "Questionnaire.publisher", description = "The author of the questionnaire", type = "string")
    public static final String SP_PUBLISHER = "publisher";

    @SearchParamDefinition(name = "title", path = "Questionnaire.group.title", description = "All or part of the name of the questionnaire (title for the root group of the questionnaire)", type = "string")
    public static final String SP_TITLE = "title";

    @SearchParamDefinition(name = "version", path = "Questionnaire.version", description = "The business version of the questionnaire", type = "string")
    public static final String SP_VERSION = "version";

    @SearchParamDefinition(name = "status", path = "Questionnaire.status", description = "The status of the questionnaire", type = "token")
    public static final String SP_STATUS = "status";
}
