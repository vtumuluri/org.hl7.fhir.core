package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.HealthcareServiceEnum.DaysOfWeekEnumFactory;
import org.hl7.fhir.android.generated.dstu2.HealthcareServiceEnum.DaysOfWeek;

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
 * The details of a healthcare service available at a location.
 */
public class HealthcareService extends DomainResource {

    /**
     * External identifiers for this item.
     */
    protected List<Identifier> identifier;

    /**
     * The organization that provides this healthcare service.
     */
    protected Reference providedBy;

    /**
     * The actual object that is the target of the reference (The organization that provides this healthcare service.)
     */
    protected Organization providedByTarget;

    /**
     * Identifies the broad category of service being performed or delivered.
     */
    protected CodeableConcept serviceCategory;

    /**
     * A specific type of service that may be delivered or performed.
     */
    protected List<ServiceTypeComponent> serviceType;

    /**
     * The location where this healthcare service may be provided.
     */
    protected Reference location;

    /**
     * The actual object that is the target of the reference (The location where this healthcare service may be provided.)
     */
    protected Location locationTarget;

    /**
     * Further description of the service as it would be presented to a consumer while searching.
     */
    protected StringType serviceName;

    /**
     * Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.
     */
    protected StringType comment;

    /**
     * Extra details about the service that can't be placed in the other fields.
     */
    protected StringType extraDetails;

    /**
     * If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.
     */
    protected Attachment photo;

    /**
     * List of contacts related to this specific healthcare service.
     */
    protected List<ContactPoint> telecom;

    /**
     * The location(s) that this service is available to (not where the service is provided).
     */
    protected List<Reference> coverageArea;

    /**
     * The actual objects that are the target of the reference (The location(s) that this service is available to (not where the service is provided).)
     */
    protected List<Location> coverageAreaTarget;

    /**
     * The code(s) that detail the conditions under which the healthcare service is available/offered.
     */
    protected List<CodeableConcept> serviceProvisionCode;

    /**
     * Does this service have specific eligibility requirements that need to be met in order to use the service?
     */
    protected CodeableConcept eligibility;

    /**
     * Describes the eligibility conditions for the service.
     */
    protected StringType eligibilityNote;

    /**
     * Program Names that can be used to categorize the service.
     */
    protected List<StringType> programName;

    /**
     * Collection of characteristics (attributes).
     */
    protected List<CodeableConcept> characteristic;

    /**
     * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
     */
    protected List<CodeableConcept> referralMethod;

    /**
     * The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.
     */
    protected StringType publicKey;

    /**
     * Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
     */
    protected BooleanType appointmentRequired;

    /**
     * A collection of times that the Service Site is available.
     */
    protected List<HealthcareServiceAvailableTimeComponent> availableTime;

    /**
     * The HealthcareService is not available during this period of time due to the provided reason.
     */
    protected List<HealthcareServiceNotAvailableComponent> notAvailable;

    /**
     * A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.
     */
    protected StringType availabilityExceptions;

    private static final long serialVersionUID = 683771126L;

    /*
   * Constructor
   */
    public HealthcareService() {
        super();
    }

    /*
   * Constructor
   */
    public HealthcareService(Reference location) {
        super();
        this.location = location;
    }

    /**
     * @return {@link #identifier} (External identifiers for this item.)
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
     * @return {@link #identifier} (External identifiers for this item.)
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
    public HealthcareService addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #providedBy} (The organization that provides this healthcare service.)
     */
    public Reference getProvidedBy() {
        if (this.providedBy == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.providedBy");
            else if (Configuration.doAutoCreate())
                // cc
                this.providedBy = new Reference();
        return this.providedBy;
    }

    public boolean hasProvidedBy() {
        return this.providedBy != null && !this.providedBy.isEmpty();
    }

    /**
     * @param value {@link #providedBy} (The organization that provides this healthcare service.)
     */
    public HealthcareService setProvidedBy(Reference value) {
        this.providedBy = value;
        return this;
    }

    /**
     * @return {@link #providedBy} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization that provides this healthcare service.)
     */
    public Organization getProvidedByTarget() {
        if (this.providedByTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.providedBy");
            else if (Configuration.doAutoCreate())
                // aa
                this.providedByTarget = new Organization();
        return this.providedByTarget;
    }

    /**
     * @param value {@link #providedBy} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization that provides this healthcare service.)
     */
    public HealthcareService setProvidedByTarget(Organization value) {
        this.providedByTarget = value;
        return this;
    }

    /**
     * @return {@link #serviceCategory} (Identifies the broad category of service being performed or delivered.)
     */
    public CodeableConcept getServiceCategory() {
        if (this.serviceCategory == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.serviceCategory");
            else if (Configuration.doAutoCreate())
                // cc
                this.serviceCategory = new CodeableConcept();
        return this.serviceCategory;
    }

    public boolean hasServiceCategory() {
        return this.serviceCategory != null && !this.serviceCategory.isEmpty();
    }

    /**
     * @param value {@link #serviceCategory} (Identifies the broad category of service being performed or delivered.)
     */
    public HealthcareService setServiceCategory(CodeableConcept value) {
        this.serviceCategory = value;
        return this;
    }

    /**
     * @return {@link #serviceType} (A specific type of service that may be delivered or performed.)
     */
    public List<ServiceTypeComponent> getServiceType() {
        if (this.serviceType == null)
            this.serviceType = new ArrayList<ServiceTypeComponent>();
        return this.serviceType;
    }

    public boolean hasServiceType() {
        if (this.serviceType == null)
            return false;
        for (ServiceTypeComponent item : this.serviceType) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #serviceType} (A specific type of service that may be delivered or performed.)
     */
    // syntactic sugar
    public ServiceTypeComponent addServiceType() {
        // 3
        ServiceTypeComponent t = new ServiceTypeComponent();
        if (this.serviceType == null)
            this.serviceType = new ArrayList<ServiceTypeComponent>();
        this.serviceType.add(t);
        return t;
    }

    // syntactic sugar
    public HealthcareService addServiceType(ServiceTypeComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.serviceType == null)
            this.serviceType = new ArrayList<ServiceTypeComponent>();
        this.serviceType.add(t);
        return this;
    }

    /**
     * @return {@link #location} (The location where this healthcare service may be provided.)
     */
    public Reference getLocation() {
        if (this.location == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.location");
            else if (Configuration.doAutoCreate())
                // cc
                this.location = new Reference();
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (The location where this healthcare service may be provided.)
     */
    public HealthcareService setLocation(Reference value) {
        this.location = value;
        return this;
    }

    /**
     * @return {@link #location} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The location where this healthcare service may be provided.)
     */
    public Location getLocationTarget() {
        if (this.locationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.location");
            else if (Configuration.doAutoCreate())
                // aa
                this.locationTarget = new Location();
        return this.locationTarget;
    }

    /**
     * @param value {@link #location} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The location where this healthcare service may be provided.)
     */
    public HealthcareService setLocationTarget(Location value) {
        this.locationTarget = value;
        return this;
    }

    /**
     * @return {@link #serviceName} (Further description of the service as it would be presented to a consumer while searching.). This is the underlying object with id, value and extensions. The accessor "getServiceName" gives direct access to the value
     */
    public StringType getServiceNameElement() {
        if (this.serviceName == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.serviceName");
            else if (Configuration.doAutoCreate())
                // bb
                this.serviceName = new StringType();
        return this.serviceName;
    }

    public boolean hasServiceNameElement() {
        return this.serviceName != null && !this.serviceName.isEmpty();
    }

    public boolean hasServiceName() {
        return this.serviceName != null && !this.serviceName.isEmpty();
    }

    /**
     * @param value {@link #serviceName} (Further description of the service as it would be presented to a consumer while searching.). This is the underlying object with id, value and extensions. The accessor "getServiceName" gives direct access to the value
     */
    public HealthcareService setServiceNameElement(StringType value) {
        this.serviceName = value;
        return this;
    }

    /**
     * @return Further description of the service as it would be presented to a consumer while searching.
     */
    public String getServiceName() {
        return this.serviceName == null ? null : this.serviceName.getValue();
    }

    /**
     * @param value Further description of the service as it would be presented to a consumer while searching.
     */
    public HealthcareService setServiceName(String value) {
        if (Utilities.noString(value))
            this.serviceName = null;
        else {
            if (this.serviceName == null)
                this.serviceName = new StringType();
            this.serviceName.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #comment} (Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
     */
    public StringType getCommentElement() {
        if (this.comment == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.comment");
            else if (Configuration.doAutoCreate())
                // bb
                this.comment = new StringType();
        return this.comment;
    }

    public boolean hasCommentElement() {
        return this.comment != null && !this.comment.isEmpty();
    }

    public boolean hasComment() {
        return this.comment != null && !this.comment.isEmpty();
    }

    /**
     * @param value {@link #comment} (Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
     */
    public HealthcareService setCommentElement(StringType value) {
        this.comment = value;
        return this;
    }

    /**
     * @return Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.
     */
    public String getComment() {
        return this.comment == null ? null : this.comment.getValue();
    }

    /**
     * @param value Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.
     */
    public HealthcareService setComment(String value) {
        if (Utilities.noString(value))
            this.comment = null;
        else {
            if (this.comment == null)
                this.comment = new StringType();
            this.comment.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #extraDetails} (Extra details about the service that can't be placed in the other fields.). This is the underlying object with id, value and extensions. The accessor "getExtraDetails" gives direct access to the value
     */
    public StringType getExtraDetailsElement() {
        if (this.extraDetails == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.extraDetails");
            else if (Configuration.doAutoCreate())
                // bb
                this.extraDetails = new StringType();
        return this.extraDetails;
    }

    public boolean hasExtraDetailsElement() {
        return this.extraDetails != null && !this.extraDetails.isEmpty();
    }

    public boolean hasExtraDetails() {
        return this.extraDetails != null && !this.extraDetails.isEmpty();
    }

    /**
     * @param value {@link #extraDetails} (Extra details about the service that can't be placed in the other fields.). This is the underlying object with id, value and extensions. The accessor "getExtraDetails" gives direct access to the value
     */
    public HealthcareService setExtraDetailsElement(StringType value) {
        this.extraDetails = value;
        return this;
    }

    /**
     * @return Extra details about the service that can't be placed in the other fields.
     */
    public String getExtraDetails() {
        return this.extraDetails == null ? null : this.extraDetails.getValue();
    }

    /**
     * @param value Extra details about the service that can't be placed in the other fields.
     */
    public HealthcareService setExtraDetails(String value) {
        if (Utilities.noString(value))
            this.extraDetails = null;
        else {
            if (this.extraDetails == null)
                this.extraDetails = new StringType();
            this.extraDetails.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #photo} (If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.)
     */
    public Attachment getPhoto() {
        if (this.photo == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.photo");
            else if (Configuration.doAutoCreate())
                // cc
                this.photo = new Attachment();
        return this.photo;
    }

    public boolean hasPhoto() {
        return this.photo != null && !this.photo.isEmpty();
    }

    /**
     * @param value {@link #photo} (If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.)
     */
    public HealthcareService setPhoto(Attachment value) {
        this.photo = value;
        return this;
    }

    /**
     * @return {@link #telecom} (List of contacts related to this specific healthcare service.)
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
     * @return {@link #telecom} (List of contacts related to this specific healthcare service.)
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
    public HealthcareService addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    /**
     * @return {@link #coverageArea} (The location(s) that this service is available to (not where the service is provided).)
     */
    public List<Reference> getCoverageArea() {
        if (this.coverageArea == null)
            this.coverageArea = new ArrayList<Reference>();
        return this.coverageArea;
    }

    public boolean hasCoverageArea() {
        if (this.coverageArea == null)
            return false;
        for (Reference item : this.coverageArea) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #coverageArea} (The location(s) that this service is available to (not where the service is provided).)
     */
    // syntactic sugar
    public Reference addCoverageArea() {
        // 3
        Reference t = new Reference();
        if (this.coverageArea == null)
            this.coverageArea = new ArrayList<Reference>();
        this.coverageArea.add(t);
        return t;
    }

    // syntactic sugar
    public HealthcareService addCoverageArea(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.coverageArea == null)
            this.coverageArea = new ArrayList<Reference>();
        this.coverageArea.add(t);
        return this;
    }

    /**
     * @return {@link #coverageArea} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The location(s) that this service is available to (not where the service is provided).)
     */
    public List<Location> getCoverageAreaTarget() {
        if (this.coverageAreaTarget == null)
            this.coverageAreaTarget = new ArrayList<Location>();
        return this.coverageAreaTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #coverageArea} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. The location(s) that this service is available to (not where the service is provided).)
     */
    public Location addCoverageAreaTarget() {
        Location r = new Location();
        if (this.coverageAreaTarget == null)
            this.coverageAreaTarget = new ArrayList<Location>();
        this.coverageAreaTarget.add(r);
        return r;
    }

    /**
     * @return {@link #serviceProvisionCode} (The code(s) that detail the conditions under which the healthcare service is available/offered.)
     */
    public List<CodeableConcept> getServiceProvisionCode() {
        if (this.serviceProvisionCode == null)
            this.serviceProvisionCode = new ArrayList<CodeableConcept>();
        return this.serviceProvisionCode;
    }

    public boolean hasServiceProvisionCode() {
        if (this.serviceProvisionCode == null)
            return false;
        for (CodeableConcept item : this.serviceProvisionCode) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #serviceProvisionCode} (The code(s) that detail the conditions under which the healthcare service is available/offered.)
     */
    // syntactic sugar
    public CodeableConcept addServiceProvisionCode() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.serviceProvisionCode == null)
            this.serviceProvisionCode = new ArrayList<CodeableConcept>();
        this.serviceProvisionCode.add(t);
        return t;
    }

    // syntactic sugar
    public HealthcareService addServiceProvisionCode(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.serviceProvisionCode == null)
            this.serviceProvisionCode = new ArrayList<CodeableConcept>();
        this.serviceProvisionCode.add(t);
        return this;
    }

    /**
     * @return {@link #eligibility} (Does this service have specific eligibility requirements that need to be met in order to use the service?)
     */
    public CodeableConcept getEligibility() {
        if (this.eligibility == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.eligibility");
            else if (Configuration.doAutoCreate())
                // cc
                this.eligibility = new CodeableConcept();
        return this.eligibility;
    }

    public boolean hasEligibility() {
        return this.eligibility != null && !this.eligibility.isEmpty();
    }

    /**
     * @param value {@link #eligibility} (Does this service have specific eligibility requirements that need to be met in order to use the service?)
     */
    public HealthcareService setEligibility(CodeableConcept value) {
        this.eligibility = value;
        return this;
    }

    /**
     * @return {@link #eligibilityNote} (Describes the eligibility conditions for the service.). This is the underlying object with id, value and extensions. The accessor "getEligibilityNote" gives direct access to the value
     */
    public StringType getEligibilityNoteElement() {
        if (this.eligibilityNote == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.eligibilityNote");
            else if (Configuration.doAutoCreate())
                // bb
                this.eligibilityNote = new StringType();
        return this.eligibilityNote;
    }

    public boolean hasEligibilityNoteElement() {
        return this.eligibilityNote != null && !this.eligibilityNote.isEmpty();
    }

    public boolean hasEligibilityNote() {
        return this.eligibilityNote != null && !this.eligibilityNote.isEmpty();
    }

    /**
     * @param value {@link #eligibilityNote} (Describes the eligibility conditions for the service.). This is the underlying object with id, value and extensions. The accessor "getEligibilityNote" gives direct access to the value
     */
    public HealthcareService setEligibilityNoteElement(StringType value) {
        this.eligibilityNote = value;
        return this;
    }

    /**
     * @return Describes the eligibility conditions for the service.
     */
    public String getEligibilityNote() {
        return this.eligibilityNote == null ? null : this.eligibilityNote.getValue();
    }

    /**
     * @param value Describes the eligibility conditions for the service.
     */
    public HealthcareService setEligibilityNote(String value) {
        if (Utilities.noString(value))
            this.eligibilityNote = null;
        else {
            if (this.eligibilityNote == null)
                this.eligibilityNote = new StringType();
            this.eligibilityNote.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #programName} (Program Names that can be used to categorize the service.)
     */
    public List<StringType> getProgramName() {
        if (this.programName == null)
            this.programName = new ArrayList<StringType>();
        return this.programName;
    }

    public boolean hasProgramName() {
        if (this.programName == null)
            return false;
        for (StringType item : this.programName) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #programName} (Program Names that can be used to categorize the service.)
     */
    // syntactic sugar
    public StringType addProgramNameElement() {
        // 2
        StringType t = new StringType();
        if (this.programName == null)
            this.programName = new ArrayList<StringType>();
        this.programName.add(t);
        return t;
    }

    /**
     * @param value {@link #programName} (Program Names that can be used to categorize the service.)
     */
    public HealthcareService addProgramName(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.programName == null)
            this.programName = new ArrayList<StringType>();
        this.programName.add(t);
        return this;
    }

    /**
     * @param value {@link #programName} (Program Names that can be used to categorize the service.)
     */
    public boolean hasProgramName(String value) {
        if (this.programName == null)
            return false;
        for (StringType v : this.programName) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #characteristic} (Collection of characteristics (attributes).)
     */
    public List<CodeableConcept> getCharacteristic() {
        if (this.characteristic == null)
            this.characteristic = new ArrayList<CodeableConcept>();
        return this.characteristic;
    }

    public boolean hasCharacteristic() {
        if (this.characteristic == null)
            return false;
        for (CodeableConcept item : this.characteristic) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #characteristic} (Collection of characteristics (attributes).)
     */
    // syntactic sugar
    public CodeableConcept addCharacteristic() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.characteristic == null)
            this.characteristic = new ArrayList<CodeableConcept>();
        this.characteristic.add(t);
        return t;
    }

    // syntactic sugar
    public HealthcareService addCharacteristic(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.characteristic == null)
            this.characteristic = new ArrayList<CodeableConcept>();
        this.characteristic.add(t);
        return this;
    }

    /**
     * @return {@link #referralMethod} (Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.)
     */
    public List<CodeableConcept> getReferralMethod() {
        if (this.referralMethod == null)
            this.referralMethod = new ArrayList<CodeableConcept>();
        return this.referralMethod;
    }

    public boolean hasReferralMethod() {
        if (this.referralMethod == null)
            return false;
        for (CodeableConcept item : this.referralMethod) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #referralMethod} (Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.)
     */
    // syntactic sugar
    public CodeableConcept addReferralMethod() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.referralMethod == null)
            this.referralMethod = new ArrayList<CodeableConcept>();
        this.referralMethod.add(t);
        return t;
    }

    // syntactic sugar
    public HealthcareService addReferralMethod(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.referralMethod == null)
            this.referralMethod = new ArrayList<CodeableConcept>();
        this.referralMethod.add(t);
        return this;
    }

    /**
     * @return {@link #publicKey} (The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.). This is the underlying object with id, value and extensions. The accessor "getPublicKey" gives direct access to the value
     */
    public StringType getPublicKeyElement() {
        if (this.publicKey == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.publicKey");
            else if (Configuration.doAutoCreate())
                // bb
                this.publicKey = new StringType();
        return this.publicKey;
    }

    public boolean hasPublicKeyElement() {
        return this.publicKey != null && !this.publicKey.isEmpty();
    }

    public boolean hasPublicKey() {
        return this.publicKey != null && !this.publicKey.isEmpty();
    }

    /**
     * @param value {@link #publicKey} (The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.). This is the underlying object with id, value and extensions. The accessor "getPublicKey" gives direct access to the value
     */
    public HealthcareService setPublicKeyElement(StringType value) {
        this.publicKey = value;
        return this;
    }

    /**
     * @return The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.
     */
    public String getPublicKey() {
        return this.publicKey == null ? null : this.publicKey.getValue();
    }

    /**
     * @param value The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.
     */
    public HealthcareService setPublicKey(String value) {
        if (Utilities.noString(value))
            this.publicKey = null;
        else {
            if (this.publicKey == null)
                this.publicKey = new StringType();
            this.publicKey.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #appointmentRequired} (Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.). This is the underlying object with id, value and extensions. The accessor "getAppointmentRequired" gives direct access to the value
     */
    public BooleanType getAppointmentRequiredElement() {
        if (this.appointmentRequired == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.appointmentRequired");
            else if (Configuration.doAutoCreate())
                // bb
                this.appointmentRequired = new BooleanType();
        return this.appointmentRequired;
    }

    public boolean hasAppointmentRequiredElement() {
        return this.appointmentRequired != null && !this.appointmentRequired.isEmpty();
    }

    public boolean hasAppointmentRequired() {
        return this.appointmentRequired != null && !this.appointmentRequired.isEmpty();
    }

    /**
     * @param value {@link #appointmentRequired} (Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.). This is the underlying object with id, value and extensions. The accessor "getAppointmentRequired" gives direct access to the value
     */
    public HealthcareService setAppointmentRequiredElement(BooleanType value) {
        this.appointmentRequired = value;
        return this;
    }

    /**
     * @return Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
     */
    public boolean getAppointmentRequired() {
        return this.appointmentRequired == null || this.appointmentRequired.isEmpty() ? false : this.appointmentRequired.getValue();
    }

    /**
     * @param value Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
     */
    public HealthcareService setAppointmentRequired(boolean value) {
        if (this.appointmentRequired == null)
            this.appointmentRequired = new BooleanType();
        this.appointmentRequired.setValue(value);
        return this;
    }

    /**
     * @return {@link #availableTime} (A collection of times that the Service Site is available.)
     */
    public List<HealthcareServiceAvailableTimeComponent> getAvailableTime() {
        if (this.availableTime == null)
            this.availableTime = new ArrayList<HealthcareServiceAvailableTimeComponent>();
        return this.availableTime;
    }

    public boolean hasAvailableTime() {
        if (this.availableTime == null)
            return false;
        for (HealthcareServiceAvailableTimeComponent item : this.availableTime) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #availableTime} (A collection of times that the Service Site is available.)
     */
    // syntactic sugar
    public HealthcareServiceAvailableTimeComponent addAvailableTime() {
        // 3
        HealthcareServiceAvailableTimeComponent t = new HealthcareServiceAvailableTimeComponent();
        if (this.availableTime == null)
            this.availableTime = new ArrayList<HealthcareServiceAvailableTimeComponent>();
        this.availableTime.add(t);
        return t;
    }

    // syntactic sugar
    public HealthcareService addAvailableTime(HealthcareServiceAvailableTimeComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.availableTime == null)
            this.availableTime = new ArrayList<HealthcareServiceAvailableTimeComponent>();
        this.availableTime.add(t);
        return this;
    }

    /**
     * @return {@link #notAvailable} (The HealthcareService is not available during this period of time due to the provided reason.)
     */
    public List<HealthcareServiceNotAvailableComponent> getNotAvailable() {
        if (this.notAvailable == null)
            this.notAvailable = new ArrayList<HealthcareServiceNotAvailableComponent>();
        return this.notAvailable;
    }

    public boolean hasNotAvailable() {
        if (this.notAvailable == null)
            return false;
        for (HealthcareServiceNotAvailableComponent item : this.notAvailable) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #notAvailable} (The HealthcareService is not available during this period of time due to the provided reason.)
     */
    // syntactic sugar
    public HealthcareServiceNotAvailableComponent addNotAvailable() {
        // 3
        HealthcareServiceNotAvailableComponent t = new HealthcareServiceNotAvailableComponent();
        if (this.notAvailable == null)
            this.notAvailable = new ArrayList<HealthcareServiceNotAvailableComponent>();
        this.notAvailable.add(t);
        return t;
    }

    // syntactic sugar
    public HealthcareService addNotAvailable(HealthcareServiceNotAvailableComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.notAvailable == null)
            this.notAvailable = new ArrayList<HealthcareServiceNotAvailableComponent>();
        this.notAvailable.add(t);
        return this;
    }

    /**
     * @return {@link #availabilityExceptions} (A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.). This is the underlying object with id, value and extensions. The accessor "getAvailabilityExceptions" gives direct access to the value
     */
    public StringType getAvailabilityExceptionsElement() {
        if (this.availabilityExceptions == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HealthcareService.availabilityExceptions");
            else if (Configuration.doAutoCreate())
                // bb
                this.availabilityExceptions = new StringType();
        return this.availabilityExceptions;
    }

    public boolean hasAvailabilityExceptionsElement() {
        return this.availabilityExceptions != null && !this.availabilityExceptions.isEmpty();
    }

    public boolean hasAvailabilityExceptions() {
        return this.availabilityExceptions != null && !this.availabilityExceptions.isEmpty();
    }

    /**
     * @param value {@link #availabilityExceptions} (A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.). This is the underlying object with id, value and extensions. The accessor "getAvailabilityExceptions" gives direct access to the value
     */
    public HealthcareService setAvailabilityExceptionsElement(StringType value) {
        this.availabilityExceptions = value;
        return this;
    }

    /**
     * @return A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.
     */
    public String getAvailabilityExceptions() {
        return this.availabilityExceptions == null ? null : this.availabilityExceptions.getValue();
    }

    /**
     * @param value A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.
     */
    public HealthcareService setAvailabilityExceptions(String value) {
        if (Utilities.noString(value))
            this.availabilityExceptions = null;
        else {
            if (this.availabilityExceptions == null)
                this.availabilityExceptions = new StringType();
            this.availabilityExceptions.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "External identifiers for this item.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("providedBy", "Reference(Organization)", "The organization that provides this healthcare service.", 0, java.lang.Integer.MAX_VALUE, providedBy));
        childrenList.add(new Property("serviceCategory", "CodeableConcept", "Identifies the broad category of service being performed or delivered.", 0, java.lang.Integer.MAX_VALUE, serviceCategory));
        childrenList.add(new Property("serviceType", "", "A specific type of service that may be delivered or performed.", 0, java.lang.Integer.MAX_VALUE, serviceType));
        childrenList.add(new Property("location", "Reference(Location)", "The location where this healthcare service may be provided.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("serviceName", "string", "Further description of the service as it would be presented to a consumer while searching.", 0, java.lang.Integer.MAX_VALUE, serviceName));
        childrenList.add(new Property("comment", "string", "Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.", 0, java.lang.Integer.MAX_VALUE, comment));
        childrenList.add(new Property("extraDetails", "string", "Extra details about the service that can't be placed in the other fields.", 0, java.lang.Integer.MAX_VALUE, extraDetails));
        childrenList.add(new Property("photo", "Attachment", "If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.", 0, java.lang.Integer.MAX_VALUE, photo));
        childrenList.add(new Property("telecom", "ContactPoint", "List of contacts related to this specific healthcare service.", 0, java.lang.Integer.MAX_VALUE, telecom));
        childrenList.add(new Property("coverageArea", "Reference(Location)", "The location(s) that this service is available to (not where the service is provided).", 0, java.lang.Integer.MAX_VALUE, coverageArea));
        childrenList.add(new Property("serviceProvisionCode", "CodeableConcept", "The code(s) that detail the conditions under which the healthcare service is available/offered.", 0, java.lang.Integer.MAX_VALUE, serviceProvisionCode));
        childrenList.add(new Property("eligibility", "CodeableConcept", "Does this service have specific eligibility requirements that need to be met in order to use the service?", 0, java.lang.Integer.MAX_VALUE, eligibility));
        childrenList.add(new Property("eligibilityNote", "string", "Describes the eligibility conditions for the service.", 0, java.lang.Integer.MAX_VALUE, eligibilityNote));
        childrenList.add(new Property("programName", "string", "Program Names that can be used to categorize the service.", 0, java.lang.Integer.MAX_VALUE, programName));
        childrenList.add(new Property("characteristic", "CodeableConcept", "Collection of characteristics (attributes).", 0, java.lang.Integer.MAX_VALUE, characteristic));
        childrenList.add(new Property("referralMethod", "CodeableConcept", "Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.", 0, java.lang.Integer.MAX_VALUE, referralMethod));
        childrenList.add(new Property("publicKey", "string", "The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.", 0, java.lang.Integer.MAX_VALUE, publicKey));
        childrenList.add(new Property("appointmentRequired", "boolean", "Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.", 0, java.lang.Integer.MAX_VALUE, appointmentRequired));
        childrenList.add(new Property("availableTime", "", "A collection of times that the Service Site is available.", 0, java.lang.Integer.MAX_VALUE, availableTime));
        childrenList.add(new Property("notAvailable", "", "The HealthcareService is not available during this period of time due to the provided reason.", 0, java.lang.Integer.MAX_VALUE, notAvailable));
        childrenList.add(new Property("availabilityExceptions", "string", "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.", 0, java.lang.Integer.MAX_VALUE, availabilityExceptions));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("providedBy"))
            // Reference
            this.providedBy = castToReference(value);
        else if (name.equals("serviceCategory"))
            // CodeableConcept
            this.serviceCategory = castToCodeableConcept(value);
        else if (name.equals("serviceType"))
            this.getServiceType().add((ServiceTypeComponent) value);
        else if (name.equals("location"))
            // Reference
            this.location = castToReference(value);
        else if (name.equals("serviceName"))
            // StringType
            this.serviceName = castToString(value);
        else if (name.equals("comment"))
            // StringType
            this.comment = castToString(value);
        else if (name.equals("extraDetails"))
            // StringType
            this.extraDetails = castToString(value);
        else if (name.equals("photo"))
            // Attachment
            this.photo = castToAttachment(value);
        else if (name.equals("telecom"))
            this.getTelecom().add(castToContactPoint(value));
        else if (name.equals("coverageArea"))
            this.getCoverageArea().add(castToReference(value));
        else if (name.equals("serviceProvisionCode"))
            this.getServiceProvisionCode().add(castToCodeableConcept(value));
        else if (name.equals("eligibility"))
            // CodeableConcept
            this.eligibility = castToCodeableConcept(value);
        else if (name.equals("eligibilityNote"))
            // StringType
            this.eligibilityNote = castToString(value);
        else if (name.equals("programName"))
            this.getProgramName().add(castToString(value));
        else if (name.equals("characteristic"))
            this.getCharacteristic().add(castToCodeableConcept(value));
        else if (name.equals("referralMethod"))
            this.getReferralMethod().add(castToCodeableConcept(value));
        else if (name.equals("publicKey"))
            // StringType
            this.publicKey = castToString(value);
        else if (name.equals("appointmentRequired"))
            // BooleanType
            this.appointmentRequired = castToBoolean(value);
        else if (name.equals("availableTime"))
            this.getAvailableTime().add((HealthcareServiceAvailableTimeComponent) value);
        else if (name.equals("notAvailable"))
            this.getNotAvailable().add((HealthcareServiceNotAvailableComponent) value);
        else if (name.equals("availabilityExceptions"))
            // StringType
            this.availabilityExceptions = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("providedBy")) {
            this.providedBy = new Reference();
            return this.providedBy;
        } else if (name.equals("serviceCategory")) {
            this.serviceCategory = new CodeableConcept();
            return this.serviceCategory;
        } else if (name.equals("serviceType")) {
            return addServiceType();
        } else if (name.equals("location")) {
            this.location = new Reference();
            return this.location;
        } else if (name.equals("serviceName")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.serviceName");
        } else if (name.equals("comment")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.comment");
        } else if (name.equals("extraDetails")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.extraDetails");
        } else if (name.equals("photo")) {
            this.photo = new Attachment();
            return this.photo;
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else if (name.equals("coverageArea")) {
            return addCoverageArea();
        } else if (name.equals("serviceProvisionCode")) {
            return addServiceProvisionCode();
        } else if (name.equals("eligibility")) {
            this.eligibility = new CodeableConcept();
            return this.eligibility;
        } else if (name.equals("eligibilityNote")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.eligibilityNote");
        } else if (name.equals("programName")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.programName");
        } else if (name.equals("characteristic")) {
            return addCharacteristic();
        } else if (name.equals("referralMethod")) {
            return addReferralMethod();
        } else if (name.equals("publicKey")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.publicKey");
        } else if (name.equals("appointmentRequired")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.appointmentRequired");
        } else if (name.equals("availableTime")) {
            return addAvailableTime();
        } else if (name.equals("notAvailable")) {
            return addNotAvailable();
        } else if (name.equals("availabilityExceptions")) {
            throw new FHIRException("Cannot call addChild on a primitive type HealthcareService.availabilityExceptions");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "HealthcareService";
    }

    public HealthcareService copy() {
        HealthcareService dst = new HealthcareService();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.providedBy = providedBy == null ? null : providedBy.copy();
        dst.serviceCategory = serviceCategory == null ? null : serviceCategory.copy();
        if (serviceType != null) {
            dst.serviceType = new ArrayList<ServiceTypeComponent>();
            for (ServiceTypeComponent i : serviceType) dst.serviceType.add(i.copy());
        }
        ;
        dst.location = location == null ? null : location.copy();
        dst.serviceName = serviceName == null ? null : serviceName.copy();
        dst.comment = comment == null ? null : comment.copy();
        dst.extraDetails = extraDetails == null ? null : extraDetails.copy();
        dst.photo = photo == null ? null : photo.copy();
        if (telecom != null) {
            dst.telecom = new ArrayList<ContactPoint>();
            for (ContactPoint i : telecom) dst.telecom.add(i.copy());
        }
        ;
        if (coverageArea != null) {
            dst.coverageArea = new ArrayList<Reference>();
            for (Reference i : coverageArea) dst.coverageArea.add(i.copy());
        }
        ;
        if (serviceProvisionCode != null) {
            dst.serviceProvisionCode = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : serviceProvisionCode) dst.serviceProvisionCode.add(i.copy());
        }
        ;
        dst.eligibility = eligibility == null ? null : eligibility.copy();
        dst.eligibilityNote = eligibilityNote == null ? null : eligibilityNote.copy();
        if (programName != null) {
            dst.programName = new ArrayList<StringType>();
            for (StringType i : programName) dst.programName.add(i.copy());
        }
        ;
        if (characteristic != null) {
            dst.characteristic = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : characteristic) dst.characteristic.add(i.copy());
        }
        ;
        if (referralMethod != null) {
            dst.referralMethod = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : referralMethod) dst.referralMethod.add(i.copy());
        }
        ;
        dst.publicKey = publicKey == null ? null : publicKey.copy();
        dst.appointmentRequired = appointmentRequired == null ? null : appointmentRequired.copy();
        if (availableTime != null) {
            dst.availableTime = new ArrayList<HealthcareServiceAvailableTimeComponent>();
            for (HealthcareServiceAvailableTimeComponent i : availableTime) dst.availableTime.add(i.copy());
        }
        ;
        if (notAvailable != null) {
            dst.notAvailable = new ArrayList<HealthcareServiceNotAvailableComponent>();
            for (HealthcareServiceNotAvailableComponent i : notAvailable) dst.notAvailable.add(i.copy());
        }
        ;
        dst.availabilityExceptions = availabilityExceptions == null ? null : availabilityExceptions.copy();
        return dst;
    }

    protected HealthcareService typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof HealthcareService))
            return false;
        HealthcareService o = (HealthcareService) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(providedBy, o.providedBy, true) && compareDeep(serviceCategory, o.serviceCategory, true) && compareDeep(serviceType, o.serviceType, true) && compareDeep(location, o.location, true) && compareDeep(serviceName, o.serviceName, true) && compareDeep(comment, o.comment, true) && compareDeep(extraDetails, o.extraDetails, true) && compareDeep(photo, o.photo, true) && compareDeep(telecom, o.telecom, true) && compareDeep(coverageArea, o.coverageArea, true) && compareDeep(serviceProvisionCode, o.serviceProvisionCode, true) && compareDeep(eligibility, o.eligibility, true) && compareDeep(eligibilityNote, o.eligibilityNote, true) && compareDeep(programName, o.programName, true) && compareDeep(characteristic, o.characteristic, true) && compareDeep(referralMethod, o.referralMethod, true) && compareDeep(publicKey, o.publicKey, true) && compareDeep(appointmentRequired, o.appointmentRequired, true) && compareDeep(availableTime, o.availableTime, true) && compareDeep(notAvailable, o.notAvailable, true) && compareDeep(availabilityExceptions, o.availabilityExceptions, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof HealthcareService))
            return false;
        HealthcareService o = (HealthcareService) other;
        return compareValues(serviceName, o.serviceName, true) && compareValues(comment, o.comment, true) && compareValues(extraDetails, o.extraDetails, true) && compareValues(eligibilityNote, o.eligibilityNote, true) && compareValues(programName, o.programName, true) && compareValues(publicKey, o.publicKey, true) && compareValues(appointmentRequired, o.appointmentRequired, true) && compareValues(availabilityExceptions, o.availabilityExceptions, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (providedBy == null || providedBy.isEmpty()) && (serviceCategory == null || serviceCategory.isEmpty()) && (serviceType == null || serviceType.isEmpty()) && (location == null || location.isEmpty()) && (serviceName == null || serviceName.isEmpty()) && (comment == null || comment.isEmpty()) && (extraDetails == null || extraDetails.isEmpty()) && (photo == null || photo.isEmpty()) && (telecom == null || telecom.isEmpty()) && (coverageArea == null || coverageArea.isEmpty()) && (serviceProvisionCode == null || serviceProvisionCode.isEmpty()) && (eligibility == null || eligibility.isEmpty()) && (eligibilityNote == null || eligibilityNote.isEmpty()) && (programName == null || programName.isEmpty()) && (characteristic == null || characteristic.isEmpty()) && (referralMethod == null || referralMethod.isEmpty()) && (publicKey == null || publicKey.isEmpty()) && (appointmentRequired == null || appointmentRequired.isEmpty()) && (availableTime == null || availableTime.isEmpty()) && (notAvailable == null || notAvailable.isEmpty()) && (availabilityExceptions == null || availabilityExceptions.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.HealthcareService;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_SERVICECATEGORY = "servicecategory";

    public static final String SP_SERVICETYPE = "servicetype";

    public static final String SP_ORGANIZATION = "organization";

    public static final String SP_NAME = "name";

    public static final String SP_PROGRAMNAME = "programname";

    public static final String SP_LOCATION = "location";

    public static final String SP_CHARACTERISTIC = "characteristic";
}
