package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 */
public class RiskAssessment extends DomainResource {

    /**
     * The patient or group the risk assessment applies to.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (The patient or group the risk assessment applies to.)
     */
    protected Resource subjectTarget;

    /**
     * The date (and possibly time) the risk assessment was performed.
     */
    protected DateTimeType date;

    /**
     * For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
     */
    protected Reference condition;

    /**
     * The actual object that is the target of the reference (For assessments or prognosis specific to a particular condition, indicates the condition being assessed.)
     */
    protected Condition conditionTarget;

    /**
     * The encounter where the assessment was performed.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (The encounter where the assessment was performed.)
     */
    protected Encounter encounterTarget;

    /**
     * The provider or software application that performed the assessment.
     */
    protected Reference performer;

    /**
     * The actual object that is the target of the reference (The provider or software application that performed the assessment.)
     */
    protected Resource performerTarget;

    /**
     * Business identifier assigned to the risk assessment.
     */
    protected Identifier identifier;

    /**
     * The algorithm, process or mechanism used to evaluate the risk.
     */
    protected CodeableConcept method;

    /**
     * Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.).
     */
    protected List<Reference> basis;

    /**
     * The actual objects that are the target of the reference (Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.).)
     */
    protected List<Resource> basisTarget;

    /**
     * Describes the expected outcome for the subject.
     */
    protected List<RiskAssessmentPredictionComponent> prediction;

    /**
     * A description of the steps that might be taken to reduce the identified risk(s).
     */
    protected StringType mitigation;

    private static final long serialVersionUID = 724306293L;

    /*
   * Constructor
   */
    public RiskAssessment() {
        super();
    }

    /**
     * @return {@link #subject} (The patient or group the risk assessment applies to.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessment.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The patient or group the risk assessment applies to.)
     */
    public RiskAssessment setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient or group the risk assessment applies to.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient or group the risk assessment applies to.)
     */
    public RiskAssessment setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #date} (The date (and possibly time) the risk assessment was performed.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessment.date");
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
     * @param value {@link #date} (The date (and possibly time) the risk assessment was performed.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public RiskAssessment setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date (and possibly time) the risk assessment was performed.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date (and possibly time) the risk assessment was performed.
     */
    public RiskAssessment setDate(Date value) {
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
     * @return {@link #condition} (For assessments or prognosis specific to a particular condition, indicates the condition being assessed.)
     */
    public Reference getCondition() {
        if (this.condition == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessment.condition");
            else if (Configuration.doAutoCreate())
                // cc
                this.condition = new Reference();
        return this.condition;
    }

    public boolean hasCondition() {
        return this.condition != null && !this.condition.isEmpty();
    }

    /**
     * @param value {@link #condition} (For assessments or prognosis specific to a particular condition, indicates the condition being assessed.)
     */
    public RiskAssessment setCondition(Reference value) {
        this.condition = value;
        return this;
    }

    /**
     * @return {@link #condition} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (For assessments or prognosis specific to a particular condition, indicates the condition being assessed.)
     */
    public Condition getConditionTarget() {
        if (this.conditionTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessment.condition");
            else if (Configuration.doAutoCreate())
                // aa
                this.conditionTarget = new Condition();
        return this.conditionTarget;
    }

    /**
     * @param value {@link #condition} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (For assessments or prognosis specific to a particular condition, indicates the condition being assessed.)
     */
    public RiskAssessment setConditionTarget(Condition value) {
        this.conditionTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (The encounter where the assessment was performed.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessment.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The encounter where the assessment was performed.)
     */
    public RiskAssessment setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The encounter where the assessment was performed.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessment.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The encounter where the assessment was performed.)
     */
    public RiskAssessment setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #performer} (The provider or software application that performed the assessment.)
     */
    public Reference getPerformer() {
        if (this.performer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessment.performer");
            else if (Configuration.doAutoCreate())
                // cc
                this.performer = new Reference();
        return this.performer;
    }

    public boolean hasPerformer() {
        return this.performer != null && !this.performer.isEmpty();
    }

    /**
     * @param value {@link #performer} (The provider or software application that performed the assessment.)
     */
    public RiskAssessment setPerformer(Reference value) {
        this.performer = value;
        return this;
    }

    /**
     * @return {@link #performer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The provider or software application that performed the assessment.)
     */
    public Resource getPerformerTarget() {
        return this.performerTarget;
    }

    /**
     * @param value {@link #performer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The provider or software application that performed the assessment.)
     */
    public RiskAssessment setPerformerTarget(Resource value) {
        this.performerTarget = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Business identifier assigned to the risk assessment.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessment.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Business identifier assigned to the risk assessment.)
     */
    public RiskAssessment setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #method} (The algorithm, process or mechanism used to evaluate the risk.)
     */
    public CodeableConcept getMethod() {
        if (this.method == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessment.method");
            else if (Configuration.doAutoCreate())
                // cc
                this.method = new CodeableConcept();
        return this.method;
    }

    public boolean hasMethod() {
        return this.method != null && !this.method.isEmpty();
    }

    /**
     * @param value {@link #method} (The algorithm, process or mechanism used to evaluate the risk.)
     */
    public RiskAssessment setMethod(CodeableConcept value) {
        this.method = value;
        return this;
    }

    /**
     * @return {@link #basis} (Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.).)
     */
    public List<Reference> getBasis() {
        if (this.basis == null)
            this.basis = new ArrayList<Reference>();
        return this.basis;
    }

    public boolean hasBasis() {
        if (this.basis == null)
            return false;
        for (Reference item : this.basis) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #basis} (Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.).)
     */
    // syntactic sugar
    public Reference addBasis() {
        // 3
        Reference t = new Reference();
        if (this.basis == null)
            this.basis = new ArrayList<Reference>();
        this.basis.add(t);
        return t;
    }

    // syntactic sugar
    public RiskAssessment addBasis(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.basis == null)
            this.basis = new ArrayList<Reference>();
        this.basis.add(t);
        return this;
    }

    /**
     * @return {@link #basis} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.).)
     */
    public List<Resource> getBasisTarget() {
        if (this.basisTarget == null)
            this.basisTarget = new ArrayList<Resource>();
        return this.basisTarget;
    }

    /**
     * @return {@link #prediction} (Describes the expected outcome for the subject.)
     */
    public List<RiskAssessmentPredictionComponent> getPrediction() {
        if (this.prediction == null)
            this.prediction = new ArrayList<RiskAssessmentPredictionComponent>();
        return this.prediction;
    }

    public boolean hasPrediction() {
        if (this.prediction == null)
            return false;
        for (RiskAssessmentPredictionComponent item : this.prediction) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #prediction} (Describes the expected outcome for the subject.)
     */
    // syntactic sugar
    public RiskAssessmentPredictionComponent addPrediction() {
        // 3
        RiskAssessmentPredictionComponent t = new RiskAssessmentPredictionComponent();
        if (this.prediction == null)
            this.prediction = new ArrayList<RiskAssessmentPredictionComponent>();
        this.prediction.add(t);
        return t;
    }

    // syntactic sugar
    public RiskAssessment addPrediction(RiskAssessmentPredictionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.prediction == null)
            this.prediction = new ArrayList<RiskAssessmentPredictionComponent>();
        this.prediction.add(t);
        return this;
    }

    /**
     * @return {@link #mitigation} (A description of the steps that might be taken to reduce the identified risk(s).). This is the underlying object with id, value and extensions. The accessor "getMitigation" gives direct access to the value
     */
    public StringType getMitigationElement() {
        if (this.mitigation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessment.mitigation");
            else if (Configuration.doAutoCreate())
                // bb
                this.mitigation = new StringType();
        return this.mitigation;
    }

    public boolean hasMitigationElement() {
        return this.mitigation != null && !this.mitigation.isEmpty();
    }

    public boolean hasMitigation() {
        return this.mitigation != null && !this.mitigation.isEmpty();
    }

    /**
     * @param value {@link #mitigation} (A description of the steps that might be taken to reduce the identified risk(s).). This is the underlying object with id, value and extensions. The accessor "getMitigation" gives direct access to the value
     */
    public RiskAssessment setMitigationElement(StringType value) {
        this.mitigation = value;
        return this;
    }

    /**
     * @return A description of the steps that might be taken to reduce the identified risk(s).
     */
    public String getMitigation() {
        return this.mitigation == null ? null : this.mitigation.getValue();
    }

    /**
     * @param value A description of the steps that might be taken to reduce the identified risk(s).
     */
    public RiskAssessment setMitigation(String value) {
        if (Utilities.noString(value))
            this.mitigation = null;
        else {
            if (this.mitigation == null)
                this.mitigation = new StringType();
            this.mitigation.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("subject", "Reference(Patient|Group)", "The patient or group the risk assessment applies to.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("date", "dateTime", "The date (and possibly time) the risk assessment was performed.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("condition", "Reference(Condition)", "For assessments or prognosis specific to a particular condition, indicates the condition being assessed.", 0, java.lang.Integer.MAX_VALUE, condition));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "The encounter where the assessment was performed.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("performer", "Reference(Practitioner|Device)", "The provider or software application that performed the assessment.", 0, java.lang.Integer.MAX_VALUE, performer));
        childrenList.add(new Property("identifier", "Identifier", "Business identifier assigned to the risk assessment.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("method", "CodeableConcept", "The algorithm, process or mechanism used to evaluate the risk.", 0, java.lang.Integer.MAX_VALUE, method));
        childrenList.add(new Property("basis", "Reference(Any)", "Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.).", 0, java.lang.Integer.MAX_VALUE, basis));
        childrenList.add(new Property("prediction", "", "Describes the expected outcome for the subject.", 0, java.lang.Integer.MAX_VALUE, prediction));
        childrenList.add(new Property("mitigation", "string", "A description of the steps that might be taken to reduce the identified risk(s).", 0, java.lang.Integer.MAX_VALUE, mitigation));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("condition"))
            // Reference
            this.condition = castToReference(value);
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("performer"))
            // Reference
            this.performer = castToReference(value);
        else if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("method"))
            // CodeableConcept
            this.method = castToCodeableConcept(value);
        else if (name.equals("basis"))
            this.getBasis().add(castToReference(value));
        else if (name.equals("prediction"))
            this.getPrediction().add((RiskAssessmentPredictionComponent) value);
        else if (name.equals("mitigation"))
            // StringType
            this.mitigation = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type RiskAssessment.date");
        } else if (name.equals("condition")) {
            this.condition = new Reference();
            return this.condition;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("performer")) {
            this.performer = new Reference();
            return this.performer;
        } else if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("method")) {
            this.method = new CodeableConcept();
            return this.method;
        } else if (name.equals("basis")) {
            return addBasis();
        } else if (name.equals("prediction")) {
            return addPrediction();
        } else if (name.equals("mitigation")) {
            throw new FHIRException("Cannot call addChild on a primitive type RiskAssessment.mitigation");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "RiskAssessment";
    }

    public RiskAssessment copy() {
        RiskAssessment dst = new RiskAssessment();
        copyValues(dst);
        dst.subject = subject == null ? null : subject.copy();
        dst.date = date == null ? null : date.copy();
        dst.condition = condition == null ? null : condition.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.performer = performer == null ? null : performer.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.method = method == null ? null : method.copy();
        if (basis != null) {
            dst.basis = new ArrayList<Reference>();
            for (Reference i : basis) dst.basis.add(i.copy());
        }
        ;
        if (prediction != null) {
            dst.prediction = new ArrayList<RiskAssessmentPredictionComponent>();
            for (RiskAssessmentPredictionComponent i : prediction) dst.prediction.add(i.copy());
        }
        ;
        dst.mitigation = mitigation == null ? null : mitigation.copy();
        return dst;
    }

    protected RiskAssessment typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof RiskAssessment))
            return false;
        RiskAssessment o = (RiskAssessment) other;
        return compareDeep(subject, o.subject, true) && compareDeep(date, o.date, true) && compareDeep(condition, o.condition, true) && compareDeep(encounter, o.encounter, true) && compareDeep(performer, o.performer, true) && compareDeep(identifier, o.identifier, true) && compareDeep(method, o.method, true) && compareDeep(basis, o.basis, true) && compareDeep(prediction, o.prediction, true) && compareDeep(mitigation, o.mitigation, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof RiskAssessment))
            return false;
        RiskAssessment o = (RiskAssessment) other;
        return compareValues(date, o.date, true) && compareValues(mitigation, o.mitigation, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (subject == null || subject.isEmpty()) && (date == null || date.isEmpty()) && (condition == null || condition.isEmpty()) && (encounter == null || encounter.isEmpty()) && (performer == null || performer.isEmpty()) && (identifier == null || identifier.isEmpty()) && (method == null || method.isEmpty()) && (basis == null || basis.isEmpty()) && (prediction == null || prediction.isEmpty()) && (mitigation == null || mitigation.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.RiskAssessment;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CONDITION = "condition";

    public static final String SP_PERFORMER = "performer";

    public static final String SP_METHOD = "method";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_PATIENT = "patient";

    public static final String SP_ENCOUNTER = "encounter";
}
