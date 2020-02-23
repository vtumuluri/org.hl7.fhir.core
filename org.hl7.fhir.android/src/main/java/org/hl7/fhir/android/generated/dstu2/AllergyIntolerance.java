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
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCategory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCertainty;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCertaintyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCriticality;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCriticalityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceType;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceSeverity;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceStatus;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceStatusEnumFactory;

/**
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 */
@ResourceDef(name = "AllergyIntolerance", profile = "http://hl7.org/fhir/Profile/AllergyIntolerance")
public class AllergyIntolerance extends DomainResource {

    @Block()
    public static class AllergyIntoleranceReactionComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.
         */
        @Child(name = "substance", type = { CodeableConcept.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Specific substance considered to be responsible for event", formalDefinition = "Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.")
        protected CodeableConcept substance;

        /**
         * Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.
         */
        @Child(name = "certainty", type = { CodeType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "unlikely | likely | confirmed - clinical certainty about the specific substance", formalDefinition = "Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.")
        protected Enumeration<AllergyIntoleranceCertainty> certainty;

        /**
         * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.
         */
        @Child(name = "manifestation", type = { CodeableConcept.class }, order = 3, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
        @Description(shortDefinition = "Clinical symptoms/signs associated with the Event", formalDefinition = "Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.")
        protected List<CodeableConcept> manifestation;

        /**
         * Text description about the reaction as a whole, including details of the manifestation if required.
         */
        @Child(name = "description", type = { StringType.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Description of the event as a whole", formalDefinition = "Text description about the reaction as a whole, including details of the manifestation if required.")
        protected StringType description;

        /**
         * Record of the date and/or time of the onset of the Reaction.
         */
        @Child(name = "onset", type = { DateTimeType.class }, order = 5, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Date(/time) when manifestations showed", formalDefinition = "Record of the date and/or time of the onset of the Reaction.")
        protected DateTimeType onset;

        /**
         * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
         */
        @Child(name = "severity", type = { CodeType.class }, order = 6, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "mild | moderate | severe (of event as a whole)", formalDefinition = "Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.")
        protected Enumeration<AllergyIntoleranceSeverity> severity;

        /**
         * Identification of the route by which the subject was exposed to the substance.
         */
        @Child(name = "exposureRoute", type = { CodeableConcept.class }, order = 7, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "How the subject was exposed to the substance", formalDefinition = "Identification of the route by which the subject was exposed to the substance.")
        protected CodeableConcept exposureRoute;

        /**
         * Additional text about the adverse reaction event not captured in other fields.
         */
        @Child(name = "note", type = { Annotation.class }, order = 8, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Text about event not captured in other fields", formalDefinition = "Additional text about the adverse reaction event not captured in other fields.")
        protected Annotation note;

        private static final long serialVersionUID = -765664367L;

        /*
     * Constructor
     */
        public AllergyIntoleranceReactionComponent() {
            super();
        }

        /**
         * @return {@link #substance} (Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.)
         */
        public CodeableConcept getSubstance() {
            if (this.substance == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.substance");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.substance = new CodeableConcept();
            return this.substance;
        }

        public boolean hasSubstance() {
            return this.substance != null && !this.substance.isEmpty();
        }

        /**
         * @param value {@link #substance} (Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.)
         */
        public AllergyIntoleranceReactionComponent setSubstance(CodeableConcept value) {
            this.substance = value;
            return this;
        }

        /**
         * @return {@link #certainty} (Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.). This is the underlying object with id, value and extensions. The accessor "getCertainty" gives direct access to the value
         */
        public Enumeration<AllergyIntoleranceCertainty> getCertaintyElement() {
            if (this.certainty == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.certainty");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.certainty = new Enumeration<AllergyIntoleranceCertainty>(new AllergyIntoleranceCertaintyEnumFactory());
            return this.certainty;
        }

        public boolean hasCertaintyElement() {
            return this.certainty != null && !this.certainty.isEmpty();
        }

        public boolean hasCertainty() {
            return this.certainty != null && !this.certainty.isEmpty();
        }

        /**
         * @param value {@link #certainty} (Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.). This is the underlying object with id, value and extensions. The accessor "getCertainty" gives direct access to the value
         */
        public AllergyIntoleranceReactionComponent setCertaintyElement(Enumeration<AllergyIntoleranceCertainty> value) {
            this.certainty = value;
            return this;
        }

        /**
         * @return Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.
         */
        public AllergyIntoleranceCertainty getCertainty() {
            return this.certainty == null ? null : this.certainty.getValue();
        }

        /**
         * @param value Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.
         */
        public AllergyIntoleranceReactionComponent setCertainty(AllergyIntoleranceCertainty value) {
            if (value == null)
                this.certainty = null;
            else {
                if (this.certainty == null)
                    this.certainty = new Enumeration<AllergyIntoleranceCertainty>(new AllergyIntoleranceCertaintyEnumFactory());
                this.certainty.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #manifestation} (Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.)
         */
        public List<CodeableConcept> getManifestation() {
            if (this.manifestation == null)
                this.manifestation = new ArrayList<CodeableConcept>();
            return this.manifestation;
        }

        public boolean hasManifestation() {
            if (this.manifestation == null)
                return false;
            for (CodeableConcept item : this.manifestation) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #manifestation} (Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.)
         */
        // syntactic sugar
        public CodeableConcept addManifestation() {
            // 3
            CodeableConcept t = new CodeableConcept();
            if (this.manifestation == null)
                this.manifestation = new ArrayList<CodeableConcept>();
            this.manifestation.add(t);
            return t;
        }

        // syntactic sugar
        public AllergyIntoleranceReactionComponent addManifestation(CodeableConcept t) {
            // 3
            if (t == null)
                return this;
            if (this.manifestation == null)
                this.manifestation = new ArrayList<CodeableConcept>();
            this.manifestation.add(t);
            return this;
        }

        /**
         * @return {@link #description} (Text description about the reaction as a whole, including details of the manifestation if required.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() {
            if (this.description == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.description");
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
         * @param value {@link #description} (Text description about the reaction as a whole, including details of the manifestation if required.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public AllergyIntoleranceReactionComponent setDescriptionElement(StringType value) {
            this.description = value;
            return this;
        }

        /**
         * @return Text description about the reaction as a whole, including details of the manifestation if required.
         */
        public String getDescription() {
            return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Text description about the reaction as a whole, including details of the manifestation if required.
         */
        public AllergyIntoleranceReactionComponent setDescription(String value) {
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
         * @return {@link #onset} (Record of the date and/or time of the onset of the Reaction.). This is the underlying object with id, value and extensions. The accessor "getOnset" gives direct access to the value
         */
        public DateTimeType getOnsetElement() {
            if (this.onset == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.onset");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.onset = new DateTimeType();
            return this.onset;
        }

        public boolean hasOnsetElement() {
            return this.onset != null && !this.onset.isEmpty();
        }

        public boolean hasOnset() {
            return this.onset != null && !this.onset.isEmpty();
        }

        /**
         * @param value {@link #onset} (Record of the date and/or time of the onset of the Reaction.). This is the underlying object with id, value and extensions. The accessor "getOnset" gives direct access to the value
         */
        public AllergyIntoleranceReactionComponent setOnsetElement(DateTimeType value) {
            this.onset = value;
            return this;
        }

        /**
         * @return Record of the date and/or time of the onset of the Reaction.
         */
        public Date getOnset() {
            return this.onset == null ? null : this.onset.getValue();
        }

        /**
         * @param value Record of the date and/or time of the onset of the Reaction.
         */
        public AllergyIntoleranceReactionComponent setOnset(Date value) {
            if (value == null)
                this.onset = null;
            else {
                if (this.onset == null)
                    this.onset = new DateTimeType();
                this.onset.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #severity} (Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.). This is the underlying object with id, value and extensions. The accessor "getSeverity" gives direct access to the value
         */
        public Enumeration<AllergyIntoleranceSeverity> getSeverityElement() {
            if (this.severity == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.severity");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.severity = new Enumeration<AllergyIntoleranceSeverity>(new AllergyIntoleranceSeverityEnumFactory());
            return this.severity;
        }

        public boolean hasSeverityElement() {
            return this.severity != null && !this.severity.isEmpty();
        }

        public boolean hasSeverity() {
            return this.severity != null && !this.severity.isEmpty();
        }

        /**
         * @param value {@link #severity} (Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.). This is the underlying object with id, value and extensions. The accessor "getSeverity" gives direct access to the value
         */
        public AllergyIntoleranceReactionComponent setSeverityElement(Enumeration<AllergyIntoleranceSeverity> value) {
            this.severity = value;
            return this;
        }

        /**
         * @return Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
         */
        public AllergyIntoleranceSeverity getSeverity() {
            return this.severity == null ? null : this.severity.getValue();
        }

        /**
         * @param value Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
         */
        public AllergyIntoleranceReactionComponent setSeverity(AllergyIntoleranceSeverity value) {
            if (value == null)
                this.severity = null;
            else {
                if (this.severity == null)
                    this.severity = new Enumeration<AllergyIntoleranceSeverity>(new AllergyIntoleranceSeverityEnumFactory());
                this.severity.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #exposureRoute} (Identification of the route by which the subject was exposed to the substance.)
         */
        public CodeableConcept getExposureRoute() {
            if (this.exposureRoute == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.exposureRoute");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.exposureRoute = new CodeableConcept();
            return this.exposureRoute;
        }

        public boolean hasExposureRoute() {
            return this.exposureRoute != null && !this.exposureRoute.isEmpty();
        }

        /**
         * @param value {@link #exposureRoute} (Identification of the route by which the subject was exposed to the substance.)
         */
        public AllergyIntoleranceReactionComponent setExposureRoute(CodeableConcept value) {
            this.exposureRoute = value;
            return this;
        }

        /**
         * @return {@link #note} (Additional text about the adverse reaction event not captured in other fields.)
         */
        public Annotation getNote() {
            if (this.note == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.note");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.note = new Annotation();
            return this.note;
        }

        public boolean hasNote() {
            return this.note != null && !this.note.isEmpty();
        }

        /**
         * @param value {@link #note} (Additional text about the adverse reaction event not captured in other fields.)
         */
        public AllergyIntoleranceReactionComponent setNote(Annotation value) {
            this.note = value;
            return this;
        }

        protected void listChildren(List<Property> childrenList) {
            super.listChildren(childrenList);
            childrenList.add(new Property("substance", "CodeableConcept", "Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.", 0, java.lang.Integer.MAX_VALUE, substance));
            childrenList.add(new Property("certainty", "code", "Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.", 0, java.lang.Integer.MAX_VALUE, certainty));
            childrenList.add(new Property("manifestation", "CodeableConcept", "Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.", 0, java.lang.Integer.MAX_VALUE, manifestation));
            childrenList.add(new Property("description", "string", "Text description about the reaction as a whole, including details of the manifestation if required.", 0, java.lang.Integer.MAX_VALUE, description));
            childrenList.add(new Property("onset", "dateTime", "Record of the date and/or time of the onset of the Reaction.", 0, java.lang.Integer.MAX_VALUE, onset));
            childrenList.add(new Property("severity", "code", "Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.", 0, java.lang.Integer.MAX_VALUE, severity));
            childrenList.add(new Property("exposureRoute", "CodeableConcept", "Identification of the route by which the subject was exposed to the substance.", 0, java.lang.Integer.MAX_VALUE, exposureRoute));
            childrenList.add(new Property("note", "Annotation", "Additional text about the adverse reaction event not captured in other fields.", 0, java.lang.Integer.MAX_VALUE, note));
        }

        @Override
        public void setProperty(String name, Base value) throws FHIRException {
            if (name.equals("substance"))
                // CodeableConcept
                this.substance = castToCodeableConcept(value);
            else if (name.equals("certainty"))
                // Enumeration<AllergyIntoleranceCertainty>
                this.certainty = new AllergyIntoleranceCertaintyEnumFactory().fromType(value);
            else if (name.equals("manifestation"))
                this.getManifestation().add(castToCodeableConcept(value));
            else if (name.equals("description"))
                // StringType
                this.description = castToString(value);
            else if (name.equals("onset"))
                // DateTimeType
                this.onset = castToDateTime(value);
            else if (name.equals("severity"))
                // Enumeration<AllergyIntoleranceSeverity>
                this.severity = new AllergyIntoleranceSeverityEnumFactory().fromType(value);
            else if (name.equals("exposureRoute"))
                // CodeableConcept
                this.exposureRoute = castToCodeableConcept(value);
            else if (name.equals("note"))
                // Annotation
                this.note = castToAnnotation(value);
            else
                super.setProperty(name, value);
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("substance")) {
                this.substance = new CodeableConcept();
                return this.substance;
            } else if (name.equals("certainty")) {
                throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.certainty");
            } else if (name.equals("manifestation")) {
                return addManifestation();
            } else if (name.equals("description")) {
                throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.description");
            } else if (name.equals("onset")) {
                throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.onset");
            } else if (name.equals("severity")) {
                throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.severity");
            } else if (name.equals("exposureRoute")) {
                this.exposureRoute = new CodeableConcept();
                return this.exposureRoute;
            } else if (name.equals("note")) {
                this.note = new Annotation();
                return this.note;
            } else
                return super.addChild(name);
        }

        public AllergyIntoleranceReactionComponent copy() {
            AllergyIntoleranceReactionComponent dst = new AllergyIntoleranceReactionComponent();
            copyValues(dst);
            dst.substance = substance == null ? null : substance.copy();
            dst.certainty = certainty == null ? null : certainty.copy();
            if (manifestation != null) {
                dst.manifestation = new ArrayList<CodeableConcept>();
                for (CodeableConcept i : manifestation) dst.manifestation.add(i.copy());
            }
            ;
            dst.description = description == null ? null : description.copy();
            dst.onset = onset == null ? null : onset.copy();
            dst.severity = severity == null ? null : severity.copy();
            dst.exposureRoute = exposureRoute == null ? null : exposureRoute.copy();
            dst.note = note == null ? null : note.copy();
            return dst;
        }

        @Override
        public boolean equalsDeep(Base other) {
            if (!super.equalsDeep(other))
                return false;
            if (!(other instanceof AllergyIntoleranceReactionComponent))
                return false;
            AllergyIntoleranceReactionComponent o = (AllergyIntoleranceReactionComponent) other;
            return compareDeep(substance, o.substance, true) && compareDeep(certainty, o.certainty, true) && compareDeep(manifestation, o.manifestation, true) && compareDeep(description, o.description, true) && compareDeep(onset, o.onset, true) && compareDeep(severity, o.severity, true) && compareDeep(exposureRoute, o.exposureRoute, true) && compareDeep(note, o.note, true);
        }

        @Override
        public boolean equalsShallow(Base other) {
            if (!super.equalsShallow(other))
                return false;
            if (!(other instanceof AllergyIntoleranceReactionComponent))
                return false;
            AllergyIntoleranceReactionComponent o = (AllergyIntoleranceReactionComponent) other;
            return compareValues(certainty, o.certainty, true) && compareValues(description, o.description, true) && compareValues(onset, o.onset, true) && compareValues(severity, o.severity, true);
        }

        public boolean isEmpty() {
            return super.isEmpty() && (substance == null || substance.isEmpty()) && (certainty == null || certainty.isEmpty()) && (manifestation == null || manifestation.isEmpty()) && (description == null || description.isEmpty()) && (onset == null || onset.isEmpty()) && (severity == null || severity.isEmpty()) && (exposureRoute == null || exposureRoute.isEmpty()) && (note == null || note.isEmpty());
        }

        public String fhirType() {
            return "AllergyIntolerance.reaction";
        }
    }

    /**
     * This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    @Child(name = "identifier", type = { Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "External ids for this item", formalDefinition = "This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).")
    protected List<Identifier> identifier;

    /**
     * Record of the date and/or time of the onset of the Allergy or Intolerance.
     */
    @Child(name = "onset", type = { DateTimeType.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Date(/time) when manifestations showed", formalDefinition = "Record of the date and/or time of the onset of the Allergy or Intolerance.")
    protected DateTimeType onset;

    /**
     * Date when the sensitivity was recorded.
     */
    @Child(name = "recordedDate", type = { DateTimeType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "When recorded", formalDefinition = "Date when the sensitivity was recorded.")
    protected DateTimeType recordedDate;

    /**
     * Individual who recorded the record and takes responsibility for its conten.
     */
    @Child(name = "recorder", type = { Practitioner.class, Patient.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Who recorded the sensitivity", formalDefinition = "Individual who recorded the record and takes responsibility for its conten.")
    protected Reference recorder;

    /**
     * The actual object that is the target of the reference (Individual who recorded the record and takes responsibility for its conten.)
     */
    protected Resource recorderTarget;

    /**
     * The patient who has the allergy or intolerance.
     */
    @Child(name = "patient", type = { Patient.class }, order = 4, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Who the sensitivity is for", formalDefinition = "The patient who has the allergy or intolerance.")
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient who has the allergy or intolerance.)
     */
    protected Patient patientTarget;

    /**
     * The source of the information about the allergy that is recorded.
     */
    @Child(name = "reporter", type = { Patient.class, RelatedPerson.class, Practitioner.class }, order = 5, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Source of the information about the allergy", formalDefinition = "The source of the information about the allergy that is recorded.")
    protected Reference reporter;

    /**
     * The actual object that is the target of the reference (The source of the information about the allergy that is recorded.)
     */
    protected Resource reporterTarget;

    /**
     * Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk.
     */
    @Child(name = "substance", type = { CodeableConcept.class }, order = 6, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Substance, (or class) considered to be responsible for risk", formalDefinition = "Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk.")
    protected CodeableConcept substance;

    /**
     * Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.
     */
    @Child(name = "status", type = { CodeType.class }, order = 7, min = 0, max = 1, modifier = true, summary = true)
    @Description(shortDefinition = "active | unconfirmed | confirmed | inactive | resolved | refuted | entered-in-error", formalDefinition = "Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.")
    protected Enumeration<AllergyIntoleranceStatus> status;

    /**
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.
     */
    @Child(name = "criticality", type = { CodeType.class }, order = 8, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "CRITL | CRITH | CRITU", formalDefinition = "Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.")
    protected Enumeration<AllergyIntoleranceCriticality> criticality;

    /**
     * Identification of the underlying physiological mechanism for the reaction risk.
     */
    @Child(name = "type", type = { CodeType.class }, order = 9, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "allergy | intolerance - Underlying mechanism (if known)", formalDefinition = "Identification of the underlying physiological mechanism for the reaction risk.")
    protected Enumeration<AllergyIntoleranceType> type;

    /**
     * Category of the identified Substance.
     */
    @Child(name = "category", type = { CodeType.class }, order = 10, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "food | medication | environment | other - Category of Substance", formalDefinition = "Category of the identified Substance.")
    protected Enumeration<AllergyIntoleranceCategory> category;

    /**
     * Represents the date and/or time of the last known occurrence of a reaction event.
     */
    @Child(name = "lastOccurence", type = { DateTimeType.class }, order = 11, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Date(/time) of last known occurrence of a reaction", formalDefinition = "Represents the date and/or time of the last known occurrence of a reaction event.")
    protected DateTimeType lastOccurence;

    /**
     * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
     */
    @Child(name = "note", type = { Annotation.class }, order = 12, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Additional text not captured in other fields", formalDefinition = "Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.")
    protected Annotation note;

    /**
     * Details about each adverse reaction event linked to exposure to the identified Substance.
     */
    @Child(name = "reaction", type = {}, order = 13, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Adverse Reaction Events linked to exposure to substance", formalDefinition = "Details about each adverse reaction event linked to exposure to the identified Substance.")
    protected List<AllergyIntoleranceReactionComponent> reaction;

    private static final long serialVersionUID = -1657522921L;

    /*
   * Constructor
   */
    public AllergyIntolerance() {
        super();
    }

    /*
   * Constructor
   */
    public AllergyIntolerance(Reference patient, CodeableConcept substance) {
        super();
        this.patient = patient;
        this.substance = substance;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
     * @return {@link #identifier} (This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
    public AllergyIntolerance addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #onset} (Record of the date and/or time of the onset of the Allergy or Intolerance.). This is the underlying object with id, value and extensions. The accessor "getOnset" gives direct access to the value
     */
    public DateTimeType getOnsetElement() {
        if (this.onset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.onset");
            else if (Configuration.doAutoCreate())
                // bb
                this.onset = new DateTimeType();
        return this.onset;
    }

    public boolean hasOnsetElement() {
        return this.onset != null && !this.onset.isEmpty();
    }

    public boolean hasOnset() {
        return this.onset != null && !this.onset.isEmpty();
    }

    /**
     * @param value {@link #onset} (Record of the date and/or time of the onset of the Allergy or Intolerance.). This is the underlying object with id, value and extensions. The accessor "getOnset" gives direct access to the value
     */
    public AllergyIntolerance setOnsetElement(DateTimeType value) {
        this.onset = value;
        return this;
    }

    /**
     * @return Record of the date and/or time of the onset of the Allergy or Intolerance.
     */
    public Date getOnset() {
        return this.onset == null ? null : this.onset.getValue();
    }

    /**
     * @param value Record of the date and/or time of the onset of the Allergy or Intolerance.
     */
    public AllergyIntolerance setOnset(Date value) {
        if (value == null)
            this.onset = null;
        else {
            if (this.onset == null)
                this.onset = new DateTimeType();
            this.onset.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #recordedDate} (Date when the sensitivity was recorded.). This is the underlying object with id, value and extensions. The accessor "getRecordedDate" gives direct access to the value
     */
    public DateTimeType getRecordedDateElement() {
        if (this.recordedDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.recordedDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.recordedDate = new DateTimeType();
        return this.recordedDate;
    }

    public boolean hasRecordedDateElement() {
        return this.recordedDate != null && !this.recordedDate.isEmpty();
    }

    public boolean hasRecordedDate() {
        return this.recordedDate != null && !this.recordedDate.isEmpty();
    }

    /**
     * @param value {@link #recordedDate} (Date when the sensitivity was recorded.). This is the underlying object with id, value and extensions. The accessor "getRecordedDate" gives direct access to the value
     */
    public AllergyIntolerance setRecordedDateElement(DateTimeType value) {
        this.recordedDate = value;
        return this;
    }

    /**
     * @return Date when the sensitivity was recorded.
     */
    public Date getRecordedDate() {
        return this.recordedDate == null ? null : this.recordedDate.getValue();
    }

    /**
     * @param value Date when the sensitivity was recorded.
     */
    public AllergyIntolerance setRecordedDate(Date value) {
        if (value == null)
            this.recordedDate = null;
        else {
            if (this.recordedDate == null)
                this.recordedDate = new DateTimeType();
            this.recordedDate.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #recorder} (Individual who recorded the record and takes responsibility for its conten.)
     */
    public Reference getRecorder() {
        if (this.recorder == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.recorder");
            else if (Configuration.doAutoCreate())
                // cc
                this.recorder = new Reference();
        return this.recorder;
    }

    public boolean hasRecorder() {
        return this.recorder != null && !this.recorder.isEmpty();
    }

    /**
     * @param value {@link #recorder} (Individual who recorded the record and takes responsibility for its conten.)
     */
    public AllergyIntolerance setRecorder(Reference value) {
        this.recorder = value;
        return this;
    }

    /**
     * @return {@link #recorder} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Individual who recorded the record and takes responsibility for its conten.)
     */
    public Resource getRecorderTarget() {
        return this.recorderTarget;
    }

    /**
     * @param value {@link #recorder} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Individual who recorded the record and takes responsibility for its conten.)
     */
    public AllergyIntolerance setRecorderTarget(Resource value) {
        this.recorderTarget = value;
        return this;
    }

    /**
     * @return {@link #patient} (The patient who has the allergy or intolerance.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient who has the allergy or intolerance.)
     */
    public AllergyIntolerance setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient who has the allergy or intolerance.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient who has the allergy or intolerance.)
     */
    public AllergyIntolerance setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #reporter} (The source of the information about the allergy that is recorded.)
     */
    public Reference getReporter() {
        if (this.reporter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.reporter");
            else if (Configuration.doAutoCreate())
                // cc
                this.reporter = new Reference();
        return this.reporter;
    }

    public boolean hasReporter() {
        return this.reporter != null && !this.reporter.isEmpty();
    }

    /**
     * @param value {@link #reporter} (The source of the information about the allergy that is recorded.)
     */
    public AllergyIntolerance setReporter(Reference value) {
        this.reporter = value;
        return this;
    }

    /**
     * @return {@link #reporter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The source of the information about the allergy that is recorded.)
     */
    public Resource getReporterTarget() {
        return this.reporterTarget;
    }

    /**
     * @param value {@link #reporter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The source of the information about the allergy that is recorded.)
     */
    public AllergyIntolerance setReporterTarget(Resource value) {
        this.reporterTarget = value;
        return this;
    }

    /**
     * @return {@link #substance} (Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk.)
     */
    public CodeableConcept getSubstance() {
        if (this.substance == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.substance");
            else if (Configuration.doAutoCreate())
                // cc
                this.substance = new CodeableConcept();
        return this.substance;
    }

    public boolean hasSubstance() {
        return this.substance != null && !this.substance.isEmpty();
    }

    /**
     * @param value {@link #substance} (Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk.)
     */
    public AllergyIntolerance setSubstance(CodeableConcept value) {
        this.substance = value;
        return this;
    }

    /**
     * @return {@link #status} (Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<AllergyIntoleranceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<AllergyIntoleranceStatus>(new AllergyIntoleranceStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public AllergyIntolerance setStatusElement(Enumeration<AllergyIntoleranceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.
     */
    public AllergyIntoleranceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.
     */
    public AllergyIntolerance setStatus(AllergyIntoleranceStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<AllergyIntoleranceStatus>(new AllergyIntoleranceStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #criticality} (Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getCriticality" gives direct access to the value
     */
    public Enumeration<AllergyIntoleranceCriticality> getCriticalityElement() {
        if (this.criticality == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.criticality");
            else if (Configuration.doAutoCreate())
                // bb
                this.criticality = new Enumeration<AllergyIntoleranceCriticality>(new AllergyIntoleranceCriticalityEnumFactory());
        return this.criticality;
    }

    public boolean hasCriticalityElement() {
        return this.criticality != null && !this.criticality.isEmpty();
    }

    public boolean hasCriticality() {
        return this.criticality != null && !this.criticality.isEmpty();
    }

    /**
     * @param value {@link #criticality} (Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getCriticality" gives direct access to the value
     */
    public AllergyIntolerance setCriticalityElement(Enumeration<AllergyIntoleranceCriticality> value) {
        this.criticality = value;
        return this;
    }

    /**
     * @return Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.
     */
    public AllergyIntoleranceCriticality getCriticality() {
        return this.criticality == null ? null : this.criticality.getValue();
    }

    /**
     * @param value Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.
     */
    public AllergyIntolerance setCriticality(AllergyIntoleranceCriticality value) {
        if (value == null)
            this.criticality = null;
        else {
            if (this.criticality == null)
                this.criticality = new Enumeration<AllergyIntoleranceCriticality>(new AllergyIntoleranceCriticalityEnumFactory());
            this.criticality.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (Identification of the underlying physiological mechanism for the reaction risk.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<AllergyIntoleranceType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<AllergyIntoleranceType>(new AllergyIntoleranceTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Identification of the underlying physiological mechanism for the reaction risk.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public AllergyIntolerance setTypeElement(Enumeration<AllergyIntoleranceType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return Identification of the underlying physiological mechanism for the reaction risk.
     */
    public AllergyIntoleranceType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Identification of the underlying physiological mechanism for the reaction risk.
     */
    public AllergyIntolerance setType(AllergyIntoleranceType value) {
        if (value == null)
            this.type = null;
        else {
            if (this.type == null)
                this.type = new Enumeration<AllergyIntoleranceType>(new AllergyIntoleranceTypeEnumFactory());
            this.type.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #category} (Category of the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
     */
    public Enumeration<AllergyIntoleranceCategory> getCategoryElement() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.category");
            else if (Configuration.doAutoCreate())
                // bb
                this.category = new Enumeration<AllergyIntoleranceCategory>(new AllergyIntoleranceCategoryEnumFactory());
        return this.category;
    }

    public boolean hasCategoryElement() {
        return this.category != null && !this.category.isEmpty();
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (Category of the identified Substance.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
     */
    public AllergyIntolerance setCategoryElement(Enumeration<AllergyIntoleranceCategory> value) {
        this.category = value;
        return this;
    }

    /**
     * @return Category of the identified Substance.
     */
    public AllergyIntoleranceCategory getCategory() {
        return this.category == null ? null : this.category.getValue();
    }

    /**
     * @param value Category of the identified Substance.
     */
    public AllergyIntolerance setCategory(AllergyIntoleranceCategory value) {
        if (value == null)
            this.category = null;
        else {
            if (this.category == null)
                this.category = new Enumeration<AllergyIntoleranceCategory>(new AllergyIntoleranceCategoryEnumFactory());
            this.category.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #lastOccurence} (Represents the date and/or time of the last known occurrence of a reaction event.). This is the underlying object with id, value and extensions. The accessor "getLastOccurence" gives direct access to the value
     */
    public DateTimeType getLastOccurenceElement() {
        if (this.lastOccurence == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.lastOccurence");
            else if (Configuration.doAutoCreate())
                // bb
                this.lastOccurence = new DateTimeType();
        return this.lastOccurence;
    }

    public boolean hasLastOccurenceElement() {
        return this.lastOccurence != null && !this.lastOccurence.isEmpty();
    }

    public boolean hasLastOccurence() {
        return this.lastOccurence != null && !this.lastOccurence.isEmpty();
    }

    /**
     * @param value {@link #lastOccurence} (Represents the date and/or time of the last known occurrence of a reaction event.). This is the underlying object with id, value and extensions. The accessor "getLastOccurence" gives direct access to the value
     */
    public AllergyIntolerance setLastOccurenceElement(DateTimeType value) {
        this.lastOccurence = value;
        return this;
    }

    /**
     * @return Represents the date and/or time of the last known occurrence of a reaction event.
     */
    public Date getLastOccurence() {
        return this.lastOccurence == null ? null : this.lastOccurence.getValue();
    }

    /**
     * @param value Represents the date and/or time of the last known occurrence of a reaction event.
     */
    public AllergyIntolerance setLastOccurence(Date value) {
        if (value == null)
            this.lastOccurence = null;
        else {
            if (this.lastOccurence == null)
                this.lastOccurence = new DateTimeType();
            this.lastOccurence.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #note} (Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.)
     */
    public Annotation getNote() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntolerance.note");
            else if (Configuration.doAutoCreate())
                // cc
                this.note = new Annotation();
        return this.note;
    }

    public boolean hasNote() {
        return this.note != null && !this.note.isEmpty();
    }

    /**
     * @param value {@link #note} (Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.)
     */
    public AllergyIntolerance setNote(Annotation value) {
        this.note = value;
        return this;
    }

    /**
     * @return {@link #reaction} (Details about each adverse reaction event linked to exposure to the identified Substance.)
     */
    public List<AllergyIntoleranceReactionComponent> getReaction() {
        if (this.reaction == null)
            this.reaction = new ArrayList<AllergyIntoleranceReactionComponent>();
        return this.reaction;
    }

    public boolean hasReaction() {
        if (this.reaction == null)
            return false;
        for (AllergyIntoleranceReactionComponent item : this.reaction) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #reaction} (Details about each adverse reaction event linked to exposure to the identified Substance.)
     */
    // syntactic sugar
    public AllergyIntoleranceReactionComponent addReaction() {
        // 3
        AllergyIntoleranceReactionComponent t = new AllergyIntoleranceReactionComponent();
        if (this.reaction == null)
            this.reaction = new ArrayList<AllergyIntoleranceReactionComponent>();
        this.reaction.add(t);
        return t;
    }

    // syntactic sugar
    public AllergyIntolerance addReaction(AllergyIntoleranceReactionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.reaction == null)
            this.reaction = new ArrayList<AllergyIntoleranceReactionComponent>();
        this.reaction.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("onset", "dateTime", "Record of the date and/or time of the onset of the Allergy or Intolerance.", 0, java.lang.Integer.MAX_VALUE, onset));
        childrenList.add(new Property("recordedDate", "dateTime", "Date when the sensitivity was recorded.", 0, java.lang.Integer.MAX_VALUE, recordedDate));
        childrenList.add(new Property("recorder", "Reference(Practitioner|Patient)", "Individual who recorded the record and takes responsibility for its conten.", 0, java.lang.Integer.MAX_VALUE, recorder));
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient who has the allergy or intolerance.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("reporter", "Reference(Patient|RelatedPerson|Practitioner)", "The source of the information about the allergy that is recorded.", 0, java.lang.Integer.MAX_VALUE, reporter));
        childrenList.add(new Property("substance", "CodeableConcept", "Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk.", 0, java.lang.Integer.MAX_VALUE, substance));
        childrenList.add(new Property("status", "code", "Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("criticality", "code", "Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance.", 0, java.lang.Integer.MAX_VALUE, criticality));
        childrenList.add(new Property("type", "code", "Identification of the underlying physiological mechanism for the reaction risk.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("category", "code", "Category of the identified Substance.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("lastOccurence", "dateTime", "Represents the date and/or time of the last known occurrence of a reaction event.", 0, java.lang.Integer.MAX_VALUE, lastOccurence));
        childrenList.add(new Property("note", "Annotation", "Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("reaction", "", "Details about each adverse reaction event linked to exposure to the identified Substance.", 0, java.lang.Integer.MAX_VALUE, reaction));
    }

    @Override
    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("onset"))
            // DateTimeType
            this.onset = castToDateTime(value);
        else if (name.equals("recordedDate"))
            // DateTimeType
            this.recordedDate = castToDateTime(value);
        else if (name.equals("recorder"))
            // Reference
            this.recorder = castToReference(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("reporter"))
            // Reference
            this.reporter = castToReference(value);
        else if (name.equals("substance"))
            // CodeableConcept
            this.substance = castToCodeableConcept(value);
        else if (name.equals("status"))
            // Enumeration<AllergyIntoleranceStatus>
            this.status = new AllergyIntoleranceStatusEnumFactory().fromType(value);
        else if (name.equals("criticality"))
            // Enumeration<AllergyIntoleranceCriticality>
            this.criticality = new AllergyIntoleranceCriticalityEnumFactory().fromType(value);
        else if (name.equals("type"))
            // Enumeration<AllergyIntoleranceType>
            this.type = new AllergyIntoleranceTypeEnumFactory().fromType(value);
        else if (name.equals("category"))
            // Enumeration<AllergyIntoleranceCategory>
            this.category = new AllergyIntoleranceCategoryEnumFactory().fromType(value);
        else if (name.equals("lastOccurence"))
            // DateTimeType
            this.lastOccurence = castToDateTime(value);
        else if (name.equals("note"))
            // Annotation
            this.note = castToAnnotation(value);
        else if (name.equals("reaction"))
            this.getReaction().add((AllergyIntoleranceReactionComponent) value);
        else
            super.setProperty(name, value);
    }

    @Override
    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("onset")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.onset");
        } else if (name.equals("recordedDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.recordedDate");
        } else if (name.equals("recorder")) {
            this.recorder = new Reference();
            return this.recorder;
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("reporter")) {
            this.reporter = new Reference();
            return this.reporter;
        } else if (name.equals("substance")) {
            this.substance = new CodeableConcept();
            return this.substance;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.status");
        } else if (name.equals("criticality")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.criticality");
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.type");
        } else if (name.equals("category")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.category");
        } else if (name.equals("lastOccurence")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.lastOccurence");
        } else if (name.equals("note")) {
            this.note = new Annotation();
            return this.note;
        } else if (name.equals("reaction")) {
            return addReaction();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "AllergyIntolerance";
    }

    public AllergyIntolerance copy() {
        AllergyIntolerance dst = new AllergyIntolerance();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.onset = onset == null ? null : onset.copy();
        dst.recordedDate = recordedDate == null ? null : recordedDate.copy();
        dst.recorder = recorder == null ? null : recorder.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.reporter = reporter == null ? null : reporter.copy();
        dst.substance = substance == null ? null : substance.copy();
        dst.status = status == null ? null : status.copy();
        dst.criticality = criticality == null ? null : criticality.copy();
        dst.type = type == null ? null : type.copy();
        dst.category = category == null ? null : category.copy();
        dst.lastOccurence = lastOccurence == null ? null : lastOccurence.copy();
        dst.note = note == null ? null : note.copy();
        if (reaction != null) {
            dst.reaction = new ArrayList<AllergyIntoleranceReactionComponent>();
            for (AllergyIntoleranceReactionComponent i : reaction) dst.reaction.add(i.copy());
        }
        ;
        return dst;
    }

    protected AllergyIntolerance typedCopy() {
        return copy();
    }

    @Override
    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AllergyIntolerance))
            return false;
        AllergyIntolerance o = (AllergyIntolerance) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(onset, o.onset, true) && compareDeep(recordedDate, o.recordedDate, true) && compareDeep(recorder, o.recorder, true) && compareDeep(patient, o.patient, true) && compareDeep(reporter, o.reporter, true) && compareDeep(substance, o.substance, true) && compareDeep(status, o.status, true) && compareDeep(criticality, o.criticality, true) && compareDeep(type, o.type, true) && compareDeep(category, o.category, true) && compareDeep(lastOccurence, o.lastOccurence, true) && compareDeep(note, o.note, true) && compareDeep(reaction, o.reaction, true);
    }

    @Override
    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AllergyIntolerance))
            return false;
        AllergyIntolerance o = (AllergyIntolerance) other;
        return compareValues(onset, o.onset, true) && compareValues(recordedDate, o.recordedDate, true) && compareValues(status, o.status, true) && compareValues(criticality, o.criticality, true) && compareValues(type, o.type, true) && compareValues(category, o.category, true) && compareValues(lastOccurence, o.lastOccurence, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (onset == null || onset.isEmpty()) && (recordedDate == null || recordedDate.isEmpty()) && (recorder == null || recorder.isEmpty()) && (patient == null || patient.isEmpty()) && (reporter == null || reporter.isEmpty()) && (substance == null || substance.isEmpty()) && (status == null || status.isEmpty()) && (criticality == null || criticality.isEmpty()) && (type == null || type.isEmpty()) && (category == null || category.isEmpty()) && (lastOccurence == null || lastOccurence.isEmpty()) && (note == null || note.isEmpty()) && (reaction == null || reaction.isEmpty());
    }

    @Override
    public ResourceType getResourceType() {
        return ResourceType.AllergyIntolerance;
    }

    @SearchParamDefinition(name = "severity", path = "AllergyIntolerance.reaction.severity", description = "mild | moderate | severe (of event as a whole)", type = "token")
    public static final String SP_SEVERITY = "severity";

    @SearchParamDefinition(name = "date", path = "AllergyIntolerance.recordedDate", description = "When recorded", type = "date")
    public static final String SP_DATE = "date";

    @SearchParamDefinition(name = "identifier", path = "AllergyIntolerance.identifier", description = "External ids for this item", type = "token")
    public static final String SP_IDENTIFIER = "identifier";

    @SearchParamDefinition(name = "manifestation", path = "AllergyIntolerance.reaction.manifestation", description = "Clinical symptoms/signs associated with the Event", type = "token")
    public static final String SP_MANIFESTATION = "manifestation";

    @SearchParamDefinition(name = "recorder", path = "AllergyIntolerance.recorder", description = "Who recorded the sensitivity", type = "reference")
    public static final String SP_RECORDER = "recorder";

    @SearchParamDefinition(name = "substance", path = "AllergyIntolerance.substance | AllergyIntolerance.reaction.substance", description = "Substance, (or class) considered to be responsible for risk", type = "token")
    public static final String SP_SUBSTANCE = "substance";

    @SearchParamDefinition(name = "criticality", path = "AllergyIntolerance.criticality", description = "CRITL | CRITH | CRITU", type = "token")
    public static final String SP_CRITICALITY = "criticality";

    @SearchParamDefinition(name = "reporter", path = "AllergyIntolerance.reporter", description = "Source of the information about the allergy", type = "reference")
    public static final String SP_REPORTER = "reporter";

    @SearchParamDefinition(name = "type", path = "AllergyIntolerance.type", description = "allergy | intolerance - Underlying mechanism (if known)", type = "token")
    public static final String SP_TYPE = "type";

    @SearchParamDefinition(name = "onset", path = "AllergyIntolerance.reaction.onset", description = "Date(/time) when manifestations showed", type = "date")
    public static final String SP_ONSET = "onset";

    @SearchParamDefinition(name = "route", path = "AllergyIntolerance.reaction.exposureRoute", description = "How the subject was exposed to the substance", type = "token")
    public static final String SP_ROUTE = "route";

    @SearchParamDefinition(name = "patient", path = "AllergyIntolerance.patient", description = "Who the sensitivity is for", type = "reference")
    public static final String SP_PATIENT = "patient";

    @SearchParamDefinition(name = "category", path = "AllergyIntolerance.category", description = "food | medication | environment | other - Category of Substance", type = "token")
    public static final String SP_CATEGORY = "category";

    @SearchParamDefinition(name = "last-date", path = "AllergyIntolerance.lastOccurence", description = "Date(/time) of last known occurrence of a reaction", type = "date")
    public static final String SP_LASTDATE = "last-date";

    @SearchParamDefinition(name = "status", path = "AllergyIntolerance.status", description = "active | unconfirmed | confirmed | inactive | resolved | refuted | entered-in-error", type = "token")
    public static final String SP_STATUS = "status";
}
