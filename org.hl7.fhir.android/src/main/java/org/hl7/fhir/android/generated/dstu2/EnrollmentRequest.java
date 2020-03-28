package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;

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
 * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
 */
public class EnrollmentRequest extends DomainResource {

    /**
     * The Response business identifier.
     */
    protected List<Identifier> identifier;

    /**
     * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
     */
    protected Coding ruleset;

    /**
     * The style (standard) and version of the original material which was converted into this resource.
     */
    protected Coding originalRuleset;

    /**
     * The date when this resource was created.
     */
    protected DateTimeType created;

    /**
     * The Insurer who is target  of the request.
     */
    protected Reference target;

    /**
     * The actual object that is the target of the reference (The Insurer who is target  of the request.)
     */
    protected Organization targetTarget;

    /**
     * The practitioner who is responsible for the services rendered to the patient.
     */
    protected Reference provider;

    /**
     * The actual object that is the target of the reference (The practitioner who is responsible for the services rendered to the patient.)
     */
    protected Practitioner providerTarget;

    /**
     * The organization which is responsible for the services rendered to the patient.
     */
    protected Reference organization;

    /**
     * The actual object that is the target of the reference (The organization which is responsible for the services rendered to the patient.)
     */
    protected Organization organizationTarget;

    /**
     * Patient Resource.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Patient Resource.)
     */
    protected Patient subjectTarget;

    /**
     * Reference to the program or plan identification, underwriter or payor.
     */
    protected Reference coverage;

    /**
     * The actual object that is the target of the reference (Reference to the program or plan identification, underwriter or payor.)
     */
    protected Coverage coverageTarget;

    /**
     * The relationship of the patient to the subscriber.
     */
    protected Coding relationship;

    private static final long serialVersionUID = -1656505325L;

    /*
   * Constructor
   */
    public EnrollmentRequest() {
        super();
    }

    /*
   * Constructor
   */
    public EnrollmentRequest(Reference subject, Reference coverage, Coding relationship) {
        super();
        this.subject = subject;
        this.coverage = coverage;
        this.relationship = relationship;
    }

    /**
     * @return {@link #identifier} (The Response business identifier.)
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
     * @return {@link #identifier} (The Response business identifier.)
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
    public EnrollmentRequest addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public Coding getRuleset() {
        if (this.ruleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.ruleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.ruleset = new Coding();
        return this.ruleset;
    }

    public boolean hasRuleset() {
        return this.ruleset != null && !this.ruleset.isEmpty();
    }

    /**
     * @param value {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public EnrollmentRequest setRuleset(Coding value) {
        this.ruleset = value;
        return this;
    }

    /**
     * @return {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public Coding getOriginalRuleset() {
        if (this.originalRuleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.originalRuleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.originalRuleset = new Coding();
        return this.originalRuleset;
    }

    public boolean hasOriginalRuleset() {
        return this.originalRuleset != null && !this.originalRuleset.isEmpty();
    }

    /**
     * @param value {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public EnrollmentRequest setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
        return this;
    }

    /**
     * @return {@link #created} (The date when this resource was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() {
        if (this.created == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.created");
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
     * @param value {@link #created} (The date when this resource was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public EnrollmentRequest setCreatedElement(DateTimeType value) {
        this.created = value;
        return this;
    }

    /**
     * @return The date when this resource was created.
     */
    public Date getCreated() {
        return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value The date when this resource was created.
     */
    public EnrollmentRequest setCreated(Date value) {
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
     * @return {@link #target} (The Insurer who is target  of the request.)
     */
    public Reference getTarget() {
        if (this.target == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.target");
            else if (Configuration.doAutoCreate())
                // cc
                this.target = new Reference();
        return this.target;
    }

    public boolean hasTarget() {
        return this.target != null && !this.target.isEmpty();
    }

    /**
     * @param value {@link #target} (The Insurer who is target  of the request.)
     */
    public EnrollmentRequest setTarget(Reference value) {
        this.target = value;
        return this;
    }

    /**
     * @return {@link #target} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The Insurer who is target  of the request.)
     */
    public Organization getTargetTarget() {
        if (this.targetTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.target");
            else if (Configuration.doAutoCreate())
                // aa
                this.targetTarget = new Organization();
        return this.targetTarget;
    }

    /**
     * @param value {@link #target} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The Insurer who is target  of the request.)
     */
    public EnrollmentRequest setTargetTarget(Organization value) {
        this.targetTarget = value;
        return this;
    }

    /**
     * @return {@link #provider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Reference getProvider() {
        if (this.provider == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.provider");
            else if (Configuration.doAutoCreate())
                // cc
                this.provider = new Reference();
        return this.provider;
    }

    public boolean hasProvider() {
        return this.provider != null && !this.provider.isEmpty();
    }

    /**
     * @param value {@link #provider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public EnrollmentRequest setProvider(Reference value) {
        this.provider = value;
        return this;
    }

    /**
     * @return {@link #provider} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Practitioner getProviderTarget() {
        if (this.providerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.provider");
            else if (Configuration.doAutoCreate())
                // aa
                this.providerTarget = new Practitioner();
        return this.providerTarget;
    }

    /**
     * @param value {@link #provider} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The practitioner who is responsible for the services rendered to the patient.)
     */
    public EnrollmentRequest setProviderTarget(Practitioner value) {
        this.providerTarget = value;
        return this;
    }

    /**
     * @return {@link #organization} (The organization which is responsible for the services rendered to the patient.)
     */
    public Reference getOrganization() {
        if (this.organization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.organization");
            else if (Configuration.doAutoCreate())
                // cc
                this.organization = new Reference();
        return this.organization;
    }

    public boolean hasOrganization() {
        return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (The organization which is responsible for the services rendered to the patient.)
     */
    public EnrollmentRequest setOrganization(Reference value) {
        this.organization = value;
        return this;
    }

    /**
     * @return {@link #organization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the services rendered to the patient.)
     */
    public Organization getOrganizationTarget() {
        if (this.organizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.organization");
            else if (Configuration.doAutoCreate())
                // aa
                this.organizationTarget = new Organization();
        return this.organizationTarget;
    }

    /**
     * @param value {@link #organization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the services rendered to the patient.)
     */
    public EnrollmentRequest setOrganizationTarget(Organization value) {
        this.organizationTarget = value;
        return this;
    }

    /**
     * @return {@link #subject} (Patient Resource.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Patient Resource.)
     */
    public EnrollmentRequest setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Patient Resource.)
     */
    public Patient getSubjectTarget() {
        if (this.subjectTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.subject");
            else if (Configuration.doAutoCreate())
                // aa
                this.subjectTarget = new Patient();
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Patient Resource.)
     */
    public EnrollmentRequest setSubjectTarget(Patient value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #coverage} (Reference to the program or plan identification, underwriter or payor.)
     */
    public Reference getCoverage() {
        if (this.coverage == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.coverage");
            else if (Configuration.doAutoCreate())
                // cc
                this.coverage = new Reference();
        return this.coverage;
    }

    public boolean hasCoverage() {
        return this.coverage != null && !this.coverage.isEmpty();
    }

    /**
     * @param value {@link #coverage} (Reference to the program or plan identification, underwriter or payor.)
     */
    public EnrollmentRequest setCoverage(Reference value) {
        this.coverage = value;
        return this;
    }

    /**
     * @return {@link #coverage} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Reference to the program or plan identification, underwriter or payor.)
     */
    public Coverage getCoverageTarget() {
        if (this.coverageTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.coverage");
            else if (Configuration.doAutoCreate())
                // aa
                this.coverageTarget = new Coverage();
        return this.coverageTarget;
    }

    /**
     * @param value {@link #coverage} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Reference to the program or plan identification, underwriter or payor.)
     */
    public EnrollmentRequest setCoverageTarget(Coverage value) {
        this.coverageTarget = value;
        return this;
    }

    /**
     * @return {@link #relationship} (The relationship of the patient to the subscriber.)
     */
    public Coding getRelationship() {
        if (this.relationship == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EnrollmentRequest.relationship");
            else if (Configuration.doAutoCreate())
                // cc
                this.relationship = new Coding();
        return this.relationship;
    }

    public boolean hasRelationship() {
        return this.relationship != null && !this.relationship.isEmpty();
    }

    /**
     * @param value {@link #relationship} (The relationship of the patient to the subscriber.)
     */
    public EnrollmentRequest setRelationship(Coding value) {
        this.relationship = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "The Response business identifier.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("ruleset", "Coding", "The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.", 0, java.lang.Integer.MAX_VALUE, ruleset));
        childrenList.add(new Property("originalRuleset", "Coding", "The style (standard) and version of the original material which was converted into this resource.", 0, java.lang.Integer.MAX_VALUE, originalRuleset));
        childrenList.add(new Property("created", "dateTime", "The date when this resource was created.", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("target", "Reference(Organization)", "The Insurer who is target  of the request.", 0, java.lang.Integer.MAX_VALUE, target));
        childrenList.add(new Property("provider", "Reference(Practitioner)", "The practitioner who is responsible for the services rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, provider));
        childrenList.add(new Property("organization", "Reference(Organization)", "The organization which is responsible for the services rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, organization));
        childrenList.add(new Property("subject", "Reference(Patient)", "Patient Resource.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("coverage", "Reference(Coverage)", "Reference to the program or plan identification, underwriter or payor.", 0, java.lang.Integer.MAX_VALUE, coverage));
        childrenList.add(new Property("relationship", "Coding", "The relationship of the patient to the subscriber.", 0, java.lang.Integer.MAX_VALUE, relationship));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("ruleset"))
            // Coding
            this.ruleset = castToCoding(value);
        else if (name.equals("originalRuleset"))
            // Coding
            this.originalRuleset = castToCoding(value);
        else if (name.equals("created"))
            // DateTimeType
            this.created = castToDateTime(value);
        else if (name.equals("target"))
            // Reference
            this.target = castToReference(value);
        else if (name.equals("provider"))
            // Reference
            this.provider = castToReference(value);
        else if (name.equals("organization"))
            // Reference
            this.organization = castToReference(value);
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("coverage"))
            // Reference
            this.coverage = castToReference(value);
        else if (name.equals("relationship"))
            // Coding
            this.relationship = castToCoding(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("ruleset")) {
            this.ruleset = new Coding();
            return this.ruleset;
        } else if (name.equals("originalRuleset")) {
            this.originalRuleset = new Coding();
            return this.originalRuleset;
        } else if (name.equals("created")) {
            throw new FHIRException("Cannot call addChild on a primitive type EnrollmentRequest.created");
        } else if (name.equals("target")) {
            this.target = new Reference();
            return this.target;
        } else if (name.equals("provider")) {
            this.provider = new Reference();
            return this.provider;
        } else if (name.equals("organization")) {
            this.organization = new Reference();
            return this.organization;
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("coverage")) {
            this.coverage = new Reference();
            return this.coverage;
        } else if (name.equals("relationship")) {
            this.relationship = new Coding();
            return this.relationship;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "EnrollmentRequest";
    }

    public EnrollmentRequest copy() {
        EnrollmentRequest dst = new EnrollmentRequest();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.ruleset = ruleset == null ? null : ruleset.copy();
        dst.originalRuleset = originalRuleset == null ? null : originalRuleset.copy();
        dst.created = created == null ? null : created.copy();
        dst.target = target == null ? null : target.copy();
        dst.provider = provider == null ? null : provider.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.coverage = coverage == null ? null : coverage.copy();
        dst.relationship = relationship == null ? null : relationship.copy();
        return dst;
    }

    protected EnrollmentRequest typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof EnrollmentRequest))
            return false;
        EnrollmentRequest o = (EnrollmentRequest) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(ruleset, o.ruleset, true) && compareDeep(originalRuleset, o.originalRuleset, true) && compareDeep(created, o.created, true) && compareDeep(target, o.target, true) && compareDeep(provider, o.provider, true) && compareDeep(organization, o.organization, true) && compareDeep(subject, o.subject, true) && compareDeep(coverage, o.coverage, true) && compareDeep(relationship, o.relationship, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof EnrollmentRequest))
            return false;
        EnrollmentRequest o = (EnrollmentRequest) other;
        return compareValues(created, o.created, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (ruleset == null || ruleset.isEmpty()) && (originalRuleset == null || originalRuleset.isEmpty()) && (created == null || created.isEmpty()) && (target == null || target.isEmpty()) && (provider == null || provider.isEmpty()) && (organization == null || organization.isEmpty()) && (subject == null || subject.isEmpty()) && (coverage == null || coverage.isEmpty()) && (relationship == null || relationship.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.EnrollmentRequest;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_PATIENT = "patient";
}
