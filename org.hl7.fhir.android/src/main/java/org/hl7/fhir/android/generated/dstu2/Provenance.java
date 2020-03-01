package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ProvenanceEnum.ProvenanceEntityRole;
import org.hl7.fhir.android.generated.dstu2.ProvenanceEnum.ProvenanceEntityRoleEnumFactory;

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
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 */
public class Provenance extends DomainResource {

    /**
     * The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.
     */
    protected List<Reference> target;

    /**
     * The actual objects that are the target of the reference (The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.)
     */
    protected List<Resource> targetTarget;

    /**
     * The period during which the activity occurred.
     */
    protected Period period;

    /**
     * The instant of time at which the activity was recorded.
     */
    protected InstantType recorded;

    /**
     * The reason that the activity was taking place.
     */
    protected List<CodeableConcept> reason;

    /**
     * An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.
     */
    protected CodeableConcept activity;

    /**
     * Where the activity occurred, if relevant.
     */
    protected Reference location;

    /**
     * The actual object that is the target of the reference (Where the activity occurred, if relevant.)
     */
    protected Location locationTarget;

    /**
     * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
     */
    protected List<UriType> policy;

    /**
     * An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility.
     */
    protected List<ProvenanceAgentComponent> agent;

    /**
     * An entity used in this activity.
     */
    protected List<ProvenanceEntityComponent> entity;

    /**
     * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
     */
    protected List<Signature> signature;

    private static final long serialVersionUID = -1053458671L;

    /*
   * Constructor
   */
    public Provenance() {
        super();
    }

    /*
   * Constructor
   */
    public Provenance(InstantType recorded) {
        super();
        this.recorded = recorded;
    }

    /**
     * @return {@link #target} (The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.)
     */
    public List<Reference> getTarget() {
        if (this.target == null)
            this.target = new ArrayList<Reference>();
        return this.target;
    }

    public boolean hasTarget() {
        if (this.target == null)
            return false;
        for (Reference item : this.target) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #target} (The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.)
     */
    // syntactic sugar
    public Reference addTarget() {
        // 3
        Reference t = new Reference();
        if (this.target == null)
            this.target = new ArrayList<Reference>();
        this.target.add(t);
        return t;
    }

    // syntactic sugar
    public Provenance addTarget(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.target == null)
            this.target = new ArrayList<Reference>();
        this.target.add(t);
        return this;
    }

    /**
     * @return {@link #target} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.)
     */
    public List<Resource> getTargetTarget() {
        if (this.targetTarget == null)
            this.targetTarget = new ArrayList<Resource>();
        return this.targetTarget;
    }

    /**
     * @return {@link #period} (The period during which the activity occurred.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Provenance.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period during which the activity occurred.)
     */
    public Provenance setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #recorded} (The instant of time at which the activity was recorded.). This is the underlying object with id, value and extensions. The accessor "getRecorded" gives direct access to the value
     */
    public InstantType getRecordedElement() {
        if (this.recorded == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Provenance.recorded");
            else if (Configuration.doAutoCreate())
                // bb
                this.recorded = new InstantType();
        return this.recorded;
    }

    public boolean hasRecordedElement() {
        return this.recorded != null && !this.recorded.isEmpty();
    }

    public boolean hasRecorded() {
        return this.recorded != null && !this.recorded.isEmpty();
    }

    /**
     * @param value {@link #recorded} (The instant of time at which the activity was recorded.). This is the underlying object with id, value and extensions. The accessor "getRecorded" gives direct access to the value
     */
    public Provenance setRecordedElement(InstantType value) {
        this.recorded = value;
        return this;
    }

    /**
     * @return The instant of time at which the activity was recorded.
     */
    public Date getRecorded() {
        return this.recorded == null ? null : this.recorded.getValue();
    }

    /**
     * @param value The instant of time at which the activity was recorded.
     */
    public Provenance setRecorded(Date value) {
        if (this.recorded == null)
            this.recorded = new InstantType();
        this.recorded.setValue(value);
        return this;
    }

    /**
     * @return {@link #reason} (The reason that the activity was taking place.)
     */
    public List<CodeableConcept> getReason() {
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        return this.reason;
    }

    public boolean hasReason() {
        if (this.reason == null)
            return false;
        for (CodeableConcept item : this.reason) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #reason} (The reason that the activity was taking place.)
     */
    // syntactic sugar
    public CodeableConcept addReason() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        this.reason.add(t);
        return t;
    }

    // syntactic sugar
    public Provenance addReason(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        this.reason.add(t);
        return this;
    }

    /**
     * @return {@link #activity} (An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.)
     */
    public CodeableConcept getActivity() {
        if (this.activity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Provenance.activity");
            else if (Configuration.doAutoCreate())
                // cc
                this.activity = new CodeableConcept();
        return this.activity;
    }

    public boolean hasActivity() {
        return this.activity != null && !this.activity.isEmpty();
    }

    /**
     * @param value {@link #activity} (An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.)
     */
    public Provenance setActivity(CodeableConcept value) {
        this.activity = value;
        return this;
    }

    /**
     * @return {@link #location} (Where the activity occurred, if relevant.)
     */
    public Reference getLocation() {
        if (this.location == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Provenance.location");
            else if (Configuration.doAutoCreate())
                // cc
                this.location = new Reference();
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (Where the activity occurred, if relevant.)
     */
    public Provenance setLocation(Reference value) {
        this.location = value;
        return this;
    }

    /**
     * @return {@link #location} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Where the activity occurred, if relevant.)
     */
    public Location getLocationTarget() {
        if (this.locationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Provenance.location");
            else if (Configuration.doAutoCreate())
                // aa
                this.locationTarget = new Location();
        return this.locationTarget;
    }

    /**
     * @param value {@link #location} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Where the activity occurred, if relevant.)
     */
    public Provenance setLocationTarget(Location value) {
        this.locationTarget = value;
        return this;
    }

    /**
     * @return {@link #policy} (Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.)
     */
    public List<UriType> getPolicy() {
        if (this.policy == null)
            this.policy = new ArrayList<UriType>();
        return this.policy;
    }

    public boolean hasPolicy() {
        if (this.policy == null)
            return false;
        for (UriType item : this.policy) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #policy} (Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.)
     */
    // syntactic sugar
    public UriType addPolicyElement() {
        // 2
        UriType t = new UriType();
        if (this.policy == null)
            this.policy = new ArrayList<UriType>();
        this.policy.add(t);
        return t;
    }

    /**
     * @param value {@link #policy} (Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.)
     */
    public Provenance addPolicy(String value) {
        // 1
        UriType t = new UriType();
        t.setValue(value);
        if (this.policy == null)
            this.policy = new ArrayList<UriType>();
        this.policy.add(t);
        return this;
    }

    /**
     * @param value {@link #policy} (Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.)
     */
    public boolean hasPolicy(String value) {
        if (this.policy == null)
            return false;
        for (UriType v : this.policy) if (// uri
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #agent} (An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility.)
     */
    public List<ProvenanceAgentComponent> getAgent() {
        if (this.agent == null)
            this.agent = new ArrayList<ProvenanceAgentComponent>();
        return this.agent;
    }

    public boolean hasAgent() {
        if (this.agent == null)
            return false;
        for (ProvenanceAgentComponent item : this.agent) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #agent} (An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility.)
     */
    // syntactic sugar
    public ProvenanceAgentComponent addAgent() {
        // 3
        ProvenanceAgentComponent t = new ProvenanceAgentComponent();
        if (this.agent == null)
            this.agent = new ArrayList<ProvenanceAgentComponent>();
        this.agent.add(t);
        return t;
    }

    // syntactic sugar
    public Provenance addAgent(ProvenanceAgentComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.agent == null)
            this.agent = new ArrayList<ProvenanceAgentComponent>();
        this.agent.add(t);
        return this;
    }

    /**
     * @return {@link #entity} (An entity used in this activity.)
     */
    public List<ProvenanceEntityComponent> getEntity() {
        if (this.entity == null)
            this.entity = new ArrayList<ProvenanceEntityComponent>();
        return this.entity;
    }

    public boolean hasEntity() {
        if (this.entity == null)
            return false;
        for (ProvenanceEntityComponent item : this.entity) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #entity} (An entity used in this activity.)
     */
    // syntactic sugar
    public ProvenanceEntityComponent addEntity() {
        // 3
        ProvenanceEntityComponent t = new ProvenanceEntityComponent();
        if (this.entity == null)
            this.entity = new ArrayList<ProvenanceEntityComponent>();
        this.entity.add(t);
        return t;
    }

    // syntactic sugar
    public Provenance addEntity(ProvenanceEntityComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.entity == null)
            this.entity = new ArrayList<ProvenanceEntityComponent>();
        this.entity.add(t);
        return this;
    }

    /**
     * @return {@link #signature} (A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.)
     */
    public List<Signature> getSignature() {
        if (this.signature == null)
            this.signature = new ArrayList<Signature>();
        return this.signature;
    }

    public boolean hasSignature() {
        if (this.signature == null)
            return false;
        for (Signature item : this.signature) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #signature} (A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.)
     */
    // syntactic sugar
    public Signature addSignature() {
        // 3
        Signature t = new Signature();
        if (this.signature == null)
            this.signature = new ArrayList<Signature>();
        this.signature.add(t);
        return t;
    }

    // syntactic sugar
    public Provenance addSignature(Signature t) {
        // 3
        if (t == null)
            return this;
        if (this.signature == null)
            this.signature = new ArrayList<Signature>();
        this.signature.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("target", "Reference(Any)", "The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.", 0, java.lang.Integer.MAX_VALUE, target));
        childrenList.add(new Property("period", "Period", "The period during which the activity occurred.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("recorded", "instant", "The instant of time at which the activity was recorded.", 0, java.lang.Integer.MAX_VALUE, recorded));
        childrenList.add(new Property("reason", "CodeableConcept", "The reason that the activity was taking place.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("activity", "CodeableConcept", "An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.", 0, java.lang.Integer.MAX_VALUE, activity));
        childrenList.add(new Property("location", "Reference(Location)", "Where the activity occurred, if relevant.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("policy", "uri", "Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.", 0, java.lang.Integer.MAX_VALUE, policy));
        childrenList.add(new Property("agent", "", "An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility.", 0, java.lang.Integer.MAX_VALUE, agent));
        childrenList.add(new Property("entity", "", "An entity used in this activity.", 0, java.lang.Integer.MAX_VALUE, entity));
        childrenList.add(new Property("signature", "Signature", "A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.", 0, java.lang.Integer.MAX_VALUE, signature));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("target"))
            this.getTarget().add(castToReference(value));
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("recorded"))
            // InstantType
            this.recorded = castToInstant(value);
        else if (name.equals("reason"))
            this.getReason().add(castToCodeableConcept(value));
        else if (name.equals("activity"))
            // CodeableConcept
            this.activity = castToCodeableConcept(value);
        else if (name.equals("location"))
            // Reference
            this.location = castToReference(value);
        else if (name.equals("policy"))
            this.getPolicy().add(castToUri(value));
        else if (name.equals("agent"))
            this.getAgent().add((ProvenanceAgentComponent) value);
        else if (name.equals("entity"))
            this.getEntity().add((ProvenanceEntityComponent) value);
        else if (name.equals("signature"))
            this.getSignature().add(castToSignature(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("target")) {
            return addTarget();
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("recorded")) {
            throw new FHIRException("Cannot call addChild on a primitive type Provenance.recorded");
        } else if (name.equals("reason")) {
            return addReason();
        } else if (name.equals("activity")) {
            this.activity = new CodeableConcept();
            return this.activity;
        } else if (name.equals("location")) {
            this.location = new Reference();
            return this.location;
        } else if (name.equals("policy")) {
            throw new FHIRException("Cannot call addChild on a primitive type Provenance.policy");
        } else if (name.equals("agent")) {
            return addAgent();
        } else if (name.equals("entity")) {
            return addEntity();
        } else if (name.equals("signature")) {
            return addSignature();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Provenance";
    }

    public Provenance copy() {
        Provenance dst = new Provenance();
        copyValues(dst);
        if (target != null) {
            dst.target = new ArrayList<Reference>();
            for (Reference i : target) dst.target.add(i.copy());
        }
        ;
        dst.period = period == null ? null : period.copy();
        dst.recorded = recorded == null ? null : recorded.copy();
        if (reason != null) {
            dst.reason = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reason) dst.reason.add(i.copy());
        }
        ;
        dst.activity = activity == null ? null : activity.copy();
        dst.location = location == null ? null : location.copy();
        if (policy != null) {
            dst.policy = new ArrayList<UriType>();
            for (UriType i : policy) dst.policy.add(i.copy());
        }
        ;
        if (agent != null) {
            dst.agent = new ArrayList<ProvenanceAgentComponent>();
            for (ProvenanceAgentComponent i : agent) dst.agent.add(i.copy());
        }
        ;
        if (entity != null) {
            dst.entity = new ArrayList<ProvenanceEntityComponent>();
            for (ProvenanceEntityComponent i : entity) dst.entity.add(i.copy());
        }
        ;
        if (signature != null) {
            dst.signature = new ArrayList<Signature>();
            for (Signature i : signature) dst.signature.add(i.copy());
        }
        ;
        return dst;
    }

    protected Provenance typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Provenance))
            return false;
        Provenance o = (Provenance) other;
        return compareDeep(target, o.target, true) && compareDeep(period, o.period, true) && compareDeep(recorded, o.recorded, true) && compareDeep(reason, o.reason, true) && compareDeep(activity, o.activity, true) && compareDeep(location, o.location, true) && compareDeep(policy, o.policy, true) && compareDeep(agent, o.agent, true) && compareDeep(entity, o.entity, true) && compareDeep(signature, o.signature, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Provenance))
            return false;
        Provenance o = (Provenance) other;
        return compareValues(recorded, o.recorded, true) && compareValues(policy, o.policy, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (target == null || target.isEmpty()) && (period == null || period.isEmpty()) && (recorded == null || recorded.isEmpty()) && (reason == null || reason.isEmpty()) && (activity == null || activity.isEmpty()) && (location == null || location.isEmpty()) && (policy == null || policy.isEmpty()) && (agent == null || agent.isEmpty()) && (entity == null || entity.isEmpty()) && (signature == null || signature.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Provenance;
    }

    public static final String SP_SIGTYPE = "sigtype";

    public static final String SP_AGENT = "agent";

    public static final String SP_ENTITYTYPE = "entitytype";

    public static final String SP_PATIENT = "patient";

    public static final String SP_START = "start";

    public static final String SP_END = "end";

    public static final String SP_LOCATION = "location";

    public static final String SP_USERID = "userid";

    public static final String SP_ENTITY = "entity";

    public static final String SP_TARGET = "target";
}
