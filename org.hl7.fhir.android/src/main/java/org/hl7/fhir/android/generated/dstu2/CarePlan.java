package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanActivityStatus;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanActivityStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanStatus;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanRelationship;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanRelationshipEnumFactory;

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
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 */
public class CarePlan extends DomainResource {

    /**
     * This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    protected List<Identifier> identifier;

    /**
     * Identifies the patient or group whose intended care is described by the plan.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Identifies the patient or group whose intended care is described by the plan.)
     */
    protected Resource subjectTarget;

    /**
     * Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
     */
    protected Enumeration<CarePlanStatus> status;

    /**
     * Identifies the context in which this particular CarePlan is defined.
     */
    protected Reference context;

    /**
     * The actual object that is the target of the reference (Identifies the context in which this particular CarePlan is defined.)
     */
    protected Resource contextTarget;

    /**
     * Indicates when the plan did (or is intended to) come into effect and end.
     */
    protected Period period;

    /**
     * Identifies the individual(s) or ogranization who is responsible for the content of the care plan.
     */
    protected List<Reference> author;

    /**
     * The actual objects that are the target of the reference (Identifies the individual(s) or ogranization who is responsible for the content of the care plan.)
     */
    protected List<Resource> authorTarget;

    /**
     * Identifies the most recent date on which the plan has been revised.
     */
    protected DateTimeType modified;

    /**
     * Identifies what "kind" of plan this is to support differentiation between multiple co-existing plans; e.g. "Home health", "psychiatric", "asthma", "disease management", "wellness plan", etc.
     */
    protected List<CodeableConcept> category;

    /**
     * A description of the scope and nature of the plan.
     */
    protected StringType description;

    /**
     * Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
     */
    protected List<Reference> addresses;

    /**
     * The actual objects that are the target of the reference (Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.)
     */
    protected List<Condition> addressesTarget;

    /**
     * Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.
     */
    protected List<Reference> support;

    /**
     * The actual objects that are the target of the reference (Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.)
     */
    protected List<Resource> supportTarget;

    /**
     * Identifies CarePlans with some sort of formal relationship to the current plan.
     */
    protected List<CarePlanRelatedPlanComponent> relatedPlan;

    /**
     * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
     */
    protected List<CarePlanParticipantComponent> participant;

    /**
     * Describes the intended objective(s) of carrying out the care plan.
     */
    protected List<Reference> goal;

    /**
     * The actual objects that are the target of the reference (Describes the intended objective(s) of carrying out the care plan.)
     */
    protected List<Goal> goalTarget;

    /**
     * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
     */
    protected List<CarePlanActivityComponent> activity;

    /**
     * General notes about the care plan not covered elsewhere.
     */
    protected Annotation note;

    private static final long serialVersionUID = -307500543L;

    /*
   * Constructor
   */
    public CarePlan() {
        super();
    }

    /*
   * Constructor
   */
    public CarePlan(Enumeration<CarePlanStatus> status) {
        super();
        this.status = status;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
     * @return {@link #identifier} (This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
    public CarePlan addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #subject} (Identifies the patient or group whose intended care is described by the plan.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlan.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Identifies the patient or group whose intended care is described by the plan.)
     */
    public CarePlan setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies the patient or group whose intended care is described by the plan.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies the patient or group whose intended care is described by the plan.)
     */
    public CarePlan setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #status} (Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<CarePlanStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlan.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<CarePlanStatus>(new CarePlanStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public CarePlan setStatusElement(Enumeration<CarePlanStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
     */
    public CarePlanStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
     */
    public CarePlan setStatus(CarePlanStatus value) {
        if (this.status == null)
            this.status = new Enumeration<CarePlanStatus>(new CarePlanStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #context} (Identifies the context in which this particular CarePlan is defined.)
     */
    public Reference getContext() {
        if (this.context == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlan.context");
            else if (Configuration.doAutoCreate())
                // cc
                this.context = new Reference();
        return this.context;
    }

    public boolean hasContext() {
        return this.context != null && !this.context.isEmpty();
    }

    /**
     * @param value {@link #context} (Identifies the context in which this particular CarePlan is defined.)
     */
    public CarePlan setContext(Reference value) {
        this.context = value;
        return this;
    }

    /**
     * @return {@link #context} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies the context in which this particular CarePlan is defined.)
     */
    public Resource getContextTarget() {
        return this.contextTarget;
    }

    /**
     * @param value {@link #context} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies the context in which this particular CarePlan is defined.)
     */
    public CarePlan setContextTarget(Resource value) {
        this.contextTarget = value;
        return this;
    }

    /**
     * @return {@link #period} (Indicates when the plan did (or is intended to) come into effect and end.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlan.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Indicates when the plan did (or is intended to) come into effect and end.)
     */
    public CarePlan setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #author} (Identifies the individual(s) or ogranization who is responsible for the content of the care plan.)
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
     * @return {@link #author} (Identifies the individual(s) or ogranization who is responsible for the content of the care plan.)
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
    public CarePlan addAuthor(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        this.author.add(t);
        return this;
    }

    /**
     * @return {@link #author} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies the individual(s) or ogranization who is responsible for the content of the care plan.)
     */
    public List<Resource> getAuthorTarget() {
        if (this.authorTarget == null)
            this.authorTarget = new ArrayList<Resource>();
        return this.authorTarget;
    }

    /**
     * @return {@link #modified} (Identifies the most recent date on which the plan has been revised.). This is the underlying object with id, value and extensions. The accessor "getModified" gives direct access to the value
     */
    public DateTimeType getModifiedElement() {
        if (this.modified == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlan.modified");
            else if (Configuration.doAutoCreate())
                // bb
                this.modified = new DateTimeType();
        return this.modified;
    }

    public boolean hasModifiedElement() {
        return this.modified != null && !this.modified.isEmpty();
    }

    public boolean hasModified() {
        return this.modified != null && !this.modified.isEmpty();
    }

    /**
     * @param value {@link #modified} (Identifies the most recent date on which the plan has been revised.). This is the underlying object with id, value and extensions. The accessor "getModified" gives direct access to the value
     */
    public CarePlan setModifiedElement(DateTimeType value) {
        this.modified = value;
        return this;
    }

    /**
     * @return Identifies the most recent date on which the plan has been revised.
     */
    public Date getModified() {
        return this.modified == null ? null : this.modified.getValue();
    }

    /**
     * @param value Identifies the most recent date on which the plan has been revised.
     */
    public CarePlan setModified(Date value) {
        if (value == null)
            this.modified = null;
        else {
            if (this.modified == null)
                this.modified = new DateTimeType();
            this.modified.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #category} (Identifies what "kind" of plan this is to support differentiation between multiple co-existing plans; e.g. "Home health", "psychiatric", "asthma", "disease management", "wellness plan", etc.)
     */
    public List<CodeableConcept> getCategory() {
        if (this.category == null)
            this.category = new ArrayList<CodeableConcept>();
        return this.category;
    }

    public boolean hasCategory() {
        if (this.category == null)
            return false;
        for (CodeableConcept item : this.category) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #category} (Identifies what "kind" of plan this is to support differentiation between multiple co-existing plans; e.g. "Home health", "psychiatric", "asthma", "disease management", "wellness plan", etc.)
     */
    // syntactic sugar
    public CodeableConcept addCategory() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.category == null)
            this.category = new ArrayList<CodeableConcept>();
        this.category.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlan addCategory(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.category == null)
            this.category = new ArrayList<CodeableConcept>();
        this.category.add(t);
        return this;
    }

    /**
     * @return {@link #description} (A description of the scope and nature of the plan.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlan.description");
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
     * @param value {@link #description} (A description of the scope and nature of the plan.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public CarePlan setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A description of the scope and nature of the plan.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A description of the scope and nature of the plan.
     */
    public CarePlan setDescription(String value) {
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
     * @return {@link #addresses} (Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.)
     */
    public List<Reference> getAddresses() {
        if (this.addresses == null)
            this.addresses = new ArrayList<Reference>();
        return this.addresses;
    }

    public boolean hasAddresses() {
        if (this.addresses == null)
            return false;
        for (Reference item : this.addresses) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #addresses} (Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.)
     */
    // syntactic sugar
    public Reference addAddresses() {
        // 3
        Reference t = new Reference();
        if (this.addresses == null)
            this.addresses = new ArrayList<Reference>();
        this.addresses.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlan addAddresses(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.addresses == null)
            this.addresses = new ArrayList<Reference>();
        this.addresses.add(t);
        return this;
    }

    /**
     * @return {@link #addresses} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.)
     */
    public List<Condition> getAddressesTarget() {
        if (this.addressesTarget == null)
            this.addressesTarget = new ArrayList<Condition>();
        return this.addressesTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #addresses} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.)
     */
    public Condition addAddressesTarget() {
        Condition r = new Condition();
        if (this.addressesTarget == null)
            this.addressesTarget = new ArrayList<Condition>();
        this.addressesTarget.add(r);
        return r;
    }

    /**
     * @return {@link #support} (Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.)
     */
    public List<Reference> getSupport() {
        if (this.support == null)
            this.support = new ArrayList<Reference>();
        return this.support;
    }

    public boolean hasSupport() {
        if (this.support == null)
            return false;
        for (Reference item : this.support) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #support} (Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.)
     */
    // syntactic sugar
    public Reference addSupport() {
        // 3
        Reference t = new Reference();
        if (this.support == null)
            this.support = new ArrayList<Reference>();
        this.support.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlan addSupport(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.support == null)
            this.support = new ArrayList<Reference>();
        this.support.add(t);
        return this;
    }

    /**
     * @return {@link #support} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.)
     */
    public List<Resource> getSupportTarget() {
        if (this.supportTarget == null)
            this.supportTarget = new ArrayList<Resource>();
        return this.supportTarget;
    }

    /**
     * @return {@link #relatedPlan} (Identifies CarePlans with some sort of formal relationship to the current plan.)
     */
    public List<CarePlanRelatedPlanComponent> getRelatedPlan() {
        if (this.relatedPlan == null)
            this.relatedPlan = new ArrayList<CarePlanRelatedPlanComponent>();
        return this.relatedPlan;
    }

    public boolean hasRelatedPlan() {
        if (this.relatedPlan == null)
            return false;
        for (CarePlanRelatedPlanComponent item : this.relatedPlan) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #relatedPlan} (Identifies CarePlans with some sort of formal relationship to the current plan.)
     */
    // syntactic sugar
    public CarePlanRelatedPlanComponent addRelatedPlan() {
        // 3
        CarePlanRelatedPlanComponent t = new CarePlanRelatedPlanComponent();
        if (this.relatedPlan == null)
            this.relatedPlan = new ArrayList<CarePlanRelatedPlanComponent>();
        this.relatedPlan.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlan addRelatedPlan(CarePlanRelatedPlanComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.relatedPlan == null)
            this.relatedPlan = new ArrayList<CarePlanRelatedPlanComponent>();
        this.relatedPlan.add(t);
        return this;
    }

    /**
     * @return {@link #participant} (Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.)
     */
    public List<CarePlanParticipantComponent> getParticipant() {
        if (this.participant == null)
            this.participant = new ArrayList<CarePlanParticipantComponent>();
        return this.participant;
    }

    public boolean hasParticipant() {
        if (this.participant == null)
            return false;
        for (CarePlanParticipantComponent item : this.participant) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #participant} (Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.)
     */
    // syntactic sugar
    public CarePlanParticipantComponent addParticipant() {
        // 3
        CarePlanParticipantComponent t = new CarePlanParticipantComponent();
        if (this.participant == null)
            this.participant = new ArrayList<CarePlanParticipantComponent>();
        this.participant.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlan addParticipant(CarePlanParticipantComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.participant == null)
            this.participant = new ArrayList<CarePlanParticipantComponent>();
        this.participant.add(t);
        return this;
    }

    /**
     * @return {@link #goal} (Describes the intended objective(s) of carrying out the care plan.)
     */
    public List<Reference> getGoal() {
        if (this.goal == null)
            this.goal = new ArrayList<Reference>();
        return this.goal;
    }

    public boolean hasGoal() {
        if (this.goal == null)
            return false;
        for (Reference item : this.goal) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #goal} (Describes the intended objective(s) of carrying out the care plan.)
     */
    // syntactic sugar
    public Reference addGoal() {
        // 3
        Reference t = new Reference();
        if (this.goal == null)
            this.goal = new ArrayList<Reference>();
        this.goal.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlan addGoal(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.goal == null)
            this.goal = new ArrayList<Reference>();
        this.goal.add(t);
        return this;
    }

    /**
     * @return {@link #goal} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Describes the intended objective(s) of carrying out the care plan.)
     */
    public List<Goal> getGoalTarget() {
        if (this.goalTarget == null)
            this.goalTarget = new ArrayList<Goal>();
        return this.goalTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #goal} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Describes the intended objective(s) of carrying out the care plan.)
     */
    public Goal addGoalTarget() {
        Goal r = new Goal();
        if (this.goalTarget == null)
            this.goalTarget = new ArrayList<Goal>();
        this.goalTarget.add(r);
        return r;
    }

    /**
     * @return {@link #activity} (Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.)
     */
    public List<CarePlanActivityComponent> getActivity() {
        if (this.activity == null)
            this.activity = new ArrayList<CarePlanActivityComponent>();
        return this.activity;
    }

    public boolean hasActivity() {
        if (this.activity == null)
            return false;
        for (CarePlanActivityComponent item : this.activity) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #activity} (Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.)
     */
    // syntactic sugar
    public CarePlanActivityComponent addActivity() {
        // 3
        CarePlanActivityComponent t = new CarePlanActivityComponent();
        if (this.activity == null)
            this.activity = new ArrayList<CarePlanActivityComponent>();
        this.activity.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlan addActivity(CarePlanActivityComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.activity == null)
            this.activity = new ArrayList<CarePlanActivityComponent>();
        this.activity.add(t);
        return this;
    }

    /**
     * @return {@link #note} (General notes about the care plan not covered elsewhere.)
     */
    public Annotation getNote() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlan.note");
            else if (Configuration.doAutoCreate())
                // cc
                this.note = new Annotation();
        return this.note;
    }

    public boolean hasNote() {
        return this.note != null && !this.note.isEmpty();
    }

    /**
     * @param value {@link #note} (General notes about the care plan not covered elsewhere.)
     */
    public CarePlan setNote(Annotation value) {
        this.note = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("subject", "Reference(Patient|Group)", "Identifies the patient or group whose intended care is described by the plan.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("status", "code", "Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("context", "Reference(Encounter|EpisodeOfCare)", "Identifies the context in which this particular CarePlan is defined.", 0, java.lang.Integer.MAX_VALUE, context));
        childrenList.add(new Property("period", "Period", "Indicates when the plan did (or is intended to) come into effect and end.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("author", "Reference(Patient|Practitioner|RelatedPerson|Organization)", "Identifies the individual(s) or ogranization who is responsible for the content of the care plan.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("modified", "dateTime", "Identifies the most recent date on which the plan has been revised.", 0, java.lang.Integer.MAX_VALUE, modified));
        childrenList.add(new Property("category", "CodeableConcept", "Identifies what \"kind\" of plan this is to support differentiation between multiple co-existing plans; e.g. \"Home health\", \"psychiatric\", \"asthma\", \"disease management\", \"wellness plan\", etc.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("description", "string", "A description of the scope and nature of the plan.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("addresses", "Reference(Condition)", "Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.", 0, java.lang.Integer.MAX_VALUE, addresses));
        childrenList.add(new Property("support", "Reference(Any)", "Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.", 0, java.lang.Integer.MAX_VALUE, support));
        childrenList.add(new Property("relatedPlan", "", "Identifies CarePlans with some sort of formal relationship to the current plan.", 0, java.lang.Integer.MAX_VALUE, relatedPlan));
        childrenList.add(new Property("participant", "", "Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.", 0, java.lang.Integer.MAX_VALUE, participant));
        childrenList.add(new Property("goal", "Reference(Goal)", "Describes the intended objective(s) of carrying out the care plan.", 0, java.lang.Integer.MAX_VALUE, goal));
        childrenList.add(new Property("activity", "", "Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.", 0, java.lang.Integer.MAX_VALUE, activity));
        childrenList.add(new Property("note", "Annotation", "General notes about the care plan not covered elsewhere.", 0, java.lang.Integer.MAX_VALUE, note));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("status"))
            // Enumeration<CarePlanStatus>
            this.status = new CarePlanStatusEnumFactory().fromType(value);
        else if (name.equals("context"))
            // Reference
            this.context = castToReference(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("author"))
            this.getAuthor().add(castToReference(value));
        else if (name.equals("modified"))
            // DateTimeType
            this.modified = castToDateTime(value);
        else if (name.equals("category"))
            this.getCategory().add(castToCodeableConcept(value));
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("addresses"))
            this.getAddresses().add(castToReference(value));
        else if (name.equals("support"))
            this.getSupport().add(castToReference(value));
        else if (name.equals("relatedPlan"))
            this.getRelatedPlan().add((CarePlanRelatedPlanComponent) value);
        else if (name.equals("participant"))
            this.getParticipant().add((CarePlanParticipantComponent) value);
        else if (name.equals("goal"))
            this.getGoal().add(castToReference(value));
        else if (name.equals("activity"))
            this.getActivity().add((CarePlanActivityComponent) value);
        else if (name.equals("note"))
            // Annotation
            this.note = castToAnnotation(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type CarePlan.status");
        } else if (name.equals("context")) {
            this.context = new Reference();
            return this.context;
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("author")) {
            return addAuthor();
        } else if (name.equals("modified")) {
            throw new FHIRException("Cannot call addChild on a primitive type CarePlan.modified");
        } else if (name.equals("category")) {
            return addCategory();
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type CarePlan.description");
        } else if (name.equals("addresses")) {
            return addAddresses();
        } else if (name.equals("support")) {
            return addSupport();
        } else if (name.equals("relatedPlan")) {
            return addRelatedPlan();
        } else if (name.equals("participant")) {
            return addParticipant();
        } else if (name.equals("goal")) {
            return addGoal();
        } else if (name.equals("activity")) {
            return addActivity();
        } else if (name.equals("note")) {
            this.note = new Annotation();
            return this.note;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "CarePlan";
    }

    public CarePlan copy() {
        CarePlan dst = new CarePlan();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.subject = subject == null ? null : subject.copy();
        dst.status = status == null ? null : status.copy();
        dst.context = context == null ? null : context.copy();
        dst.period = period == null ? null : period.copy();
        if (author != null) {
            dst.author = new ArrayList<Reference>();
            for (Reference i : author) dst.author.add(i.copy());
        }
        ;
        dst.modified = modified == null ? null : modified.copy();
        if (category != null) {
            dst.category = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : category) dst.category.add(i.copy());
        }
        ;
        dst.description = description == null ? null : description.copy();
        if (addresses != null) {
            dst.addresses = new ArrayList<Reference>();
            for (Reference i : addresses) dst.addresses.add(i.copy());
        }
        ;
        if (support != null) {
            dst.support = new ArrayList<Reference>();
            for (Reference i : support) dst.support.add(i.copy());
        }
        ;
        if (relatedPlan != null) {
            dst.relatedPlan = new ArrayList<CarePlanRelatedPlanComponent>();
            for (CarePlanRelatedPlanComponent i : relatedPlan) dst.relatedPlan.add(i.copy());
        }
        ;
        if (participant != null) {
            dst.participant = new ArrayList<CarePlanParticipantComponent>();
            for (CarePlanParticipantComponent i : participant) dst.participant.add(i.copy());
        }
        ;
        if (goal != null) {
            dst.goal = new ArrayList<Reference>();
            for (Reference i : goal) dst.goal.add(i.copy());
        }
        ;
        if (activity != null) {
            dst.activity = new ArrayList<CarePlanActivityComponent>();
            for (CarePlanActivityComponent i : activity) dst.activity.add(i.copy());
        }
        ;
        dst.note = note == null ? null : note.copy();
        return dst;
    }

    protected CarePlan typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof CarePlan))
            return false;
        CarePlan o = (CarePlan) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(subject, o.subject, true) && compareDeep(status, o.status, true) && compareDeep(context, o.context, true) && compareDeep(period, o.period, true) && compareDeep(author, o.author, true) && compareDeep(modified, o.modified, true) && compareDeep(category, o.category, true) && compareDeep(description, o.description, true) && compareDeep(addresses, o.addresses, true) && compareDeep(support, o.support, true) && compareDeep(relatedPlan, o.relatedPlan, true) && compareDeep(participant, o.participant, true) && compareDeep(goal, o.goal, true) && compareDeep(activity, o.activity, true) && compareDeep(note, o.note, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof CarePlan))
            return false;
        CarePlan o = (CarePlan) other;
        return compareValues(status, o.status, true) && compareValues(modified, o.modified, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (subject == null || subject.isEmpty()) && (status == null || status.isEmpty()) && (context == null || context.isEmpty()) && (period == null || period.isEmpty()) && (author == null || author.isEmpty()) && (modified == null || modified.isEmpty()) && (category == null || category.isEmpty()) && (description == null || description.isEmpty()) && (addresses == null || addresses.isEmpty()) && (support == null || support.isEmpty()) && (relatedPlan == null || relatedPlan.isEmpty()) && (participant == null || participant.isEmpty()) && (goal == null || goal.isEmpty()) && (activity == null || activity.isEmpty()) && (note == null || note.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.CarePlan;
    }

    public static final String SP_DATE = "date";

    public static final String SP_ACTIVITYCODE = "activitycode";

    public static final String SP_ACTIVITYDATE = "activitydate";

    public static final String SP_ACTIVITYREFERENCE = "activityreference";

    public static final String SP_PERFORMER = "performer";

    public static final String SP_GOAL = "goal";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_RELATEDCODE = "relatedcode";

    public static final String SP_PARTICIPANT = "participant";

    public static final String SP_RELATEDPLAN = "relatedplan";

    public static final String SP_CONDITION = "condition";

    public static final String SP_RELATED = "related";

    public static final String SP_PATIENT = "patient";
}
