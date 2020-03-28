package org.hl7.fhir.android.generated.dstu2;

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
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 */
public class Immunization extends DomainResource {

    /**
     * A unique identifier assigned to this immunization record.
     */
    protected List<Identifier> identifier;

    /**
     * Indicates the current status of the vaccination event.
     */
    protected CodeType status;

    /**
     * Date vaccine administered or was to be administered.
     */
    protected DateTimeType date;

    /**
     * Vaccine that was administered or was to be administered.
     */
    protected CodeableConcept vaccineCode;

    /**
     * The patient who either received or did not receive the immunization.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient who either received or did not receive the immunization.)
     */
    protected Patient patientTarget;

    /**
     * Indicates if the vaccination was or was not given.
     */
    protected BooleanType wasNotGiven;

    /**
     * True if this administration was reported rather than directly administered.
     */
    protected BooleanType reported;

    /**
     * Clinician who administered the vaccine.
     */
    protected Reference performer;

    /**
     * The actual object that is the target of the reference (Clinician who administered the vaccine.)
     */
    protected Practitioner performerTarget;

    /**
     * Clinician who ordered the vaccination.
     */
    protected Reference requester;

    /**
     * The actual object that is the target of the reference (Clinician who ordered the vaccination.)
     */
    protected Practitioner requesterTarget;

    /**
     * The visit or admission or other contact between patient and health care provider the immunization was performed as part of.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (The visit or admission or other contact between patient and health care provider the immunization was performed as part of.)
     */
    protected Encounter encounterTarget;

    /**
     * Name of vaccine manufacturer.
     */
    protected Reference manufacturer;

    /**
     * The actual object that is the target of the reference (Name of vaccine manufacturer.)
     */
    protected Organization manufacturerTarget;

    /**
     * The service delivery location where the vaccine administration occurred.
     */
    protected Reference location;

    /**
     * The actual object that is the target of the reference (The service delivery location where the vaccine administration occurred.)
     */
    protected Location locationTarget;

    /**
     * Lot number of the  vaccine product.
     */
    protected StringType lotNumber;

    /**
     * Date vaccine batch expires.
     */
    protected DateType expirationDate;

    /**
     * Body site where vaccine was administered.
     */
    protected CodeableConcept site;

    /**
     * The path by which the vaccine product is taken into the body.
     */
    protected CodeableConcept route;

    /**
     * The quantity of vaccine product that was administered.
     */
    protected SimpleQuantity doseQuantity;

    /**
     * Extra information about the immunization that is not conveyed by the other attributes.
     */
    protected List<Annotation> note;

    /**
     * Reasons why a vaccine was or was not administered.
     */
    protected ImmunizationExplanationComponent explanation;

    /**
     * Categorical data indicating that an adverse event is associated in time to an immunization.
     */
    protected List<ImmunizationReactionComponent> reaction;

    /**
     * Contains information about the protocol(s) under which the vaccine was administered.
     */
    protected List<ImmunizationVaccinationProtocolComponent> vaccinationProtocol;

    private static final long serialVersionUID = 898786200L;

    /*
   * Constructor
   */
    public Immunization() {
        super();
    }

    /*
   * Constructor
   */
    public Immunization(CodeType status, CodeableConcept vaccineCode, Reference patient, BooleanType wasNotGiven, BooleanType reported) {
        super();
        this.status = status;
        this.vaccineCode = vaccineCode;
        this.patient = patient;
        this.wasNotGiven = wasNotGiven;
        this.reported = reported;
    }

    /**
     * @return {@link #identifier} (A unique identifier assigned to this immunization record.)
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
     * @return {@link #identifier} (A unique identifier assigned to this immunization record.)
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
    public Immunization addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #status} (Indicates the current status of the vaccination event.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public CodeType getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new CodeType();
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Indicates the current status of the vaccination event.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Immunization setStatusElement(CodeType value) {
        this.status = value;
        return this;
    }

    /**
     * @return Indicates the current status of the vaccination event.
     */
    public String getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Indicates the current status of the vaccination event.
     */
    public Immunization setStatus(String value) {
        if (this.status == null)
            this.status = new CodeType();
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #date} (Date vaccine administered or was to be administered.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.date");
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
     * @param value {@link #date} (Date vaccine administered or was to be administered.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Immunization setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return Date vaccine administered or was to be administered.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value Date vaccine administered or was to be administered.
     */
    public Immunization setDate(Date value) {
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
     * @return {@link #vaccineCode} (Vaccine that was administered or was to be administered.)
     */
    public CodeableConcept getVaccineCode() {
        if (this.vaccineCode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.vaccineCode");
            else if (Configuration.doAutoCreate())
                // cc
                this.vaccineCode = new CodeableConcept();
        return this.vaccineCode;
    }

    public boolean hasVaccineCode() {
        return this.vaccineCode != null && !this.vaccineCode.isEmpty();
    }

    /**
     * @param value {@link #vaccineCode} (Vaccine that was administered or was to be administered.)
     */
    public Immunization setVaccineCode(CodeableConcept value) {
        this.vaccineCode = value;
        return this;
    }

    /**
     * @return {@link #patient} (The patient who either received or did not receive the immunization.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient who either received or did not receive the immunization.)
     */
    public Immunization setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient who either received or did not receive the immunization.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient who either received or did not receive the immunization.)
     */
    public Immunization setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #wasNotGiven} (Indicates if the vaccination was or was not given.). This is the underlying object with id, value and extensions. The accessor "getWasNotGiven" gives direct access to the value
     */
    public BooleanType getWasNotGivenElement() {
        if (this.wasNotGiven == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.wasNotGiven");
            else if (Configuration.doAutoCreate())
                // bb
                this.wasNotGiven = new BooleanType();
        return this.wasNotGiven;
    }

    public boolean hasWasNotGivenElement() {
        return this.wasNotGiven != null && !this.wasNotGiven.isEmpty();
    }

    public boolean hasWasNotGiven() {
        return this.wasNotGiven != null && !this.wasNotGiven.isEmpty();
    }

    /**
     * @param value {@link #wasNotGiven} (Indicates if the vaccination was or was not given.). This is the underlying object with id, value and extensions. The accessor "getWasNotGiven" gives direct access to the value
     */
    public Immunization setWasNotGivenElement(BooleanType value) {
        this.wasNotGiven = value;
        return this;
    }

    /**
     * @return Indicates if the vaccination was or was not given.
     */
    public boolean getWasNotGiven() {
        return this.wasNotGiven == null || this.wasNotGiven.isEmpty() ? false : this.wasNotGiven.getValue();
    }

    /**
     * @param value Indicates if the vaccination was or was not given.
     */
    public Immunization setWasNotGiven(boolean value) {
        if (this.wasNotGiven == null)
            this.wasNotGiven = new BooleanType();
        this.wasNotGiven.setValue(value);
        return this;
    }

    /**
     * @return {@link #reported} (True if this administration was reported rather than directly administered.). This is the underlying object with id, value and extensions. The accessor "getReported" gives direct access to the value
     */
    public BooleanType getReportedElement() {
        if (this.reported == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.reported");
            else if (Configuration.doAutoCreate())
                // bb
                this.reported = new BooleanType();
        return this.reported;
    }

    public boolean hasReportedElement() {
        return this.reported != null && !this.reported.isEmpty();
    }

    public boolean hasReported() {
        return this.reported != null && !this.reported.isEmpty();
    }

    /**
     * @param value {@link #reported} (True if this administration was reported rather than directly administered.). This is the underlying object with id, value and extensions. The accessor "getReported" gives direct access to the value
     */
    public Immunization setReportedElement(BooleanType value) {
        this.reported = value;
        return this;
    }

    /**
     * @return True if this administration was reported rather than directly administered.
     */
    public boolean getReported() {
        return this.reported == null || this.reported.isEmpty() ? false : this.reported.getValue();
    }

    /**
     * @param value True if this administration was reported rather than directly administered.
     */
    public Immunization setReported(boolean value) {
        if (this.reported == null)
            this.reported = new BooleanType();
        this.reported.setValue(value);
        return this;
    }

    /**
     * @return {@link #performer} (Clinician who administered the vaccine.)
     */
    public Reference getPerformer() {
        if (this.performer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.performer");
            else if (Configuration.doAutoCreate())
                // cc
                this.performer = new Reference();
        return this.performer;
    }

    public boolean hasPerformer() {
        return this.performer != null && !this.performer.isEmpty();
    }

    /**
     * @param value {@link #performer} (Clinician who administered the vaccine.)
     */
    public Immunization setPerformer(Reference value) {
        this.performer = value;
        return this;
    }

    /**
     * @return {@link #performer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Clinician who administered the vaccine.)
     */
    public Practitioner getPerformerTarget() {
        if (this.performerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.performer");
            else if (Configuration.doAutoCreate())
                // aa
                this.performerTarget = new Practitioner();
        return this.performerTarget;
    }

    /**
     * @param value {@link #performer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Clinician who administered the vaccine.)
     */
    public Immunization setPerformerTarget(Practitioner value) {
        this.performerTarget = value;
        return this;
    }

    /**
     * @return {@link #requester} (Clinician who ordered the vaccination.)
     */
    public Reference getRequester() {
        if (this.requester == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.requester");
            else if (Configuration.doAutoCreate())
                // cc
                this.requester = new Reference();
        return this.requester;
    }

    public boolean hasRequester() {
        return this.requester != null && !this.requester.isEmpty();
    }

    /**
     * @param value {@link #requester} (Clinician who ordered the vaccination.)
     */
    public Immunization setRequester(Reference value) {
        this.requester = value;
        return this;
    }

    /**
     * @return {@link #requester} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Clinician who ordered the vaccination.)
     */
    public Practitioner getRequesterTarget() {
        if (this.requesterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.requester");
            else if (Configuration.doAutoCreate())
                // aa
                this.requesterTarget = new Practitioner();
        return this.requesterTarget;
    }

    /**
     * @param value {@link #requester} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Clinician who ordered the vaccination.)
     */
    public Immunization setRequesterTarget(Practitioner value) {
        this.requesterTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (The visit or admission or other contact between patient and health care provider the immunization was performed as part of.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The visit or admission or other contact between patient and health care provider the immunization was performed as part of.)
     */
    public Immunization setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The visit or admission or other contact between patient and health care provider the immunization was performed as part of.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The visit or admission or other contact between patient and health care provider the immunization was performed as part of.)
     */
    public Immunization setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #manufacturer} (Name of vaccine manufacturer.)
     */
    public Reference getManufacturer() {
        if (this.manufacturer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.manufacturer");
            else if (Configuration.doAutoCreate())
                // cc
                this.manufacturer = new Reference();
        return this.manufacturer;
    }

    public boolean hasManufacturer() {
        return this.manufacturer != null && !this.manufacturer.isEmpty();
    }

    /**
     * @param value {@link #manufacturer} (Name of vaccine manufacturer.)
     */
    public Immunization setManufacturer(Reference value) {
        this.manufacturer = value;
        return this;
    }

    /**
     * @return {@link #manufacturer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Name of vaccine manufacturer.)
     */
    public Organization getManufacturerTarget() {
        if (this.manufacturerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.manufacturer");
            else if (Configuration.doAutoCreate())
                // aa
                this.manufacturerTarget = new Organization();
        return this.manufacturerTarget;
    }

    /**
     * @param value {@link #manufacturer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Name of vaccine manufacturer.)
     */
    public Immunization setManufacturerTarget(Organization value) {
        this.manufacturerTarget = value;
        return this;
    }

    /**
     * @return {@link #location} (The service delivery location where the vaccine administration occurred.)
     */
    public Reference getLocation() {
        if (this.location == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.location");
            else if (Configuration.doAutoCreate())
                // cc
                this.location = new Reference();
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (The service delivery location where the vaccine administration occurred.)
     */
    public Immunization setLocation(Reference value) {
        this.location = value;
        return this;
    }

    /**
     * @return {@link #location} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The service delivery location where the vaccine administration occurred.)
     */
    public Location getLocationTarget() {
        if (this.locationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.location");
            else if (Configuration.doAutoCreate())
                // aa
                this.locationTarget = new Location();
        return this.locationTarget;
    }

    /**
     * @param value {@link #location} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The service delivery location where the vaccine administration occurred.)
     */
    public Immunization setLocationTarget(Location value) {
        this.locationTarget = value;
        return this;
    }

    /**
     * @return {@link #lotNumber} (Lot number of the  vaccine product.). This is the underlying object with id, value and extensions. The accessor "getLotNumber" gives direct access to the value
     */
    public StringType getLotNumberElement() {
        if (this.lotNumber == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.lotNumber");
            else if (Configuration.doAutoCreate())
                // bb
                this.lotNumber = new StringType();
        return this.lotNumber;
    }

    public boolean hasLotNumberElement() {
        return this.lotNumber != null && !this.lotNumber.isEmpty();
    }

    public boolean hasLotNumber() {
        return this.lotNumber != null && !this.lotNumber.isEmpty();
    }

    /**
     * @param value {@link #lotNumber} (Lot number of the  vaccine product.). This is the underlying object with id, value and extensions. The accessor "getLotNumber" gives direct access to the value
     */
    public Immunization setLotNumberElement(StringType value) {
        this.lotNumber = value;
        return this;
    }

    /**
     * @return Lot number of the  vaccine product.
     */
    public String getLotNumber() {
        return this.lotNumber == null ? null : this.lotNumber.getValue();
    }

    /**
     * @param value Lot number of the  vaccine product.
     */
    public Immunization setLotNumber(String value) {
        if (Utilities.noString(value))
            this.lotNumber = null;
        else {
            if (this.lotNumber == null)
                this.lotNumber = new StringType();
            this.lotNumber.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #expirationDate} (Date vaccine batch expires.). This is the underlying object with id, value and extensions. The accessor "getExpirationDate" gives direct access to the value
     */
    public DateType getExpirationDateElement() {
        if (this.expirationDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.expirationDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.expirationDate = new DateType();
        return this.expirationDate;
    }

    public boolean hasExpirationDateElement() {
        return this.expirationDate != null && !this.expirationDate.isEmpty();
    }

    public boolean hasExpirationDate() {
        return this.expirationDate != null && !this.expirationDate.isEmpty();
    }

    /**
     * @param value {@link #expirationDate} (Date vaccine batch expires.). This is the underlying object with id, value and extensions. The accessor "getExpirationDate" gives direct access to the value
     */
    public Immunization setExpirationDateElement(DateType value) {
        this.expirationDate = value;
        return this;
    }

    /**
     * @return Date vaccine batch expires.
     */
    public Date getExpirationDate() {
        return this.expirationDate == null ? null : this.expirationDate.getValue();
    }

    /**
     * @param value Date vaccine batch expires.
     */
    public Immunization setExpirationDate(Date value) {
        if (value == null)
            this.expirationDate = null;
        else {
            if (this.expirationDate == null)
                this.expirationDate = new DateType();
            this.expirationDate.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #site} (Body site where vaccine was administered.)
     */
    public CodeableConcept getSite() {
        if (this.site == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.site");
            else if (Configuration.doAutoCreate())
                // cc
                this.site = new CodeableConcept();
        return this.site;
    }

    public boolean hasSite() {
        return this.site != null && !this.site.isEmpty();
    }

    /**
     * @param value {@link #site} (Body site where vaccine was administered.)
     */
    public Immunization setSite(CodeableConcept value) {
        this.site = value;
        return this;
    }

    /**
     * @return {@link #route} (The path by which the vaccine product is taken into the body.)
     */
    public CodeableConcept getRoute() {
        if (this.route == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.route");
            else if (Configuration.doAutoCreate())
                // cc
                this.route = new CodeableConcept();
        return this.route;
    }

    public boolean hasRoute() {
        return this.route != null && !this.route.isEmpty();
    }

    /**
     * @param value {@link #route} (The path by which the vaccine product is taken into the body.)
     */
    public Immunization setRoute(CodeableConcept value) {
        this.route = value;
        return this;
    }

    /**
     * @return {@link #doseQuantity} (The quantity of vaccine product that was administered.)
     */
    public SimpleQuantity getDoseQuantity() {
        if (this.doseQuantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.doseQuantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.doseQuantity = new SimpleQuantity();
        return this.doseQuantity;
    }

    public boolean hasDoseQuantity() {
        return this.doseQuantity != null && !this.doseQuantity.isEmpty();
    }

    /**
     * @param value {@link #doseQuantity} (The quantity of vaccine product that was administered.)
     */
    public Immunization setDoseQuantity(SimpleQuantity value) {
        this.doseQuantity = value;
        return this;
    }

    /**
     * @return {@link #note} (Extra information about the immunization that is not conveyed by the other attributes.)
     */
    public List<Annotation> getNote() {
        if (this.note == null)
            this.note = new ArrayList<Annotation>();
        return this.note;
    }

    public boolean hasNote() {
        if (this.note == null)
            return false;
        for (Annotation item : this.note) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #note} (Extra information about the immunization that is not conveyed by the other attributes.)
     */
    // syntactic sugar
    public Annotation addNote() {
        // 3
        Annotation t = new Annotation();
        if (this.note == null)
            this.note = new ArrayList<Annotation>();
        this.note.add(t);
        return t;
    }

    // syntactic sugar
    public Immunization addNote(Annotation t) {
        // 3
        if (t == null)
            return this;
        if (this.note == null)
            this.note = new ArrayList<Annotation>();
        this.note.add(t);
        return this;
    }

    /**
     * @return {@link #explanation} (Reasons why a vaccine was or was not administered.)
     */
    public ImmunizationExplanationComponent getExplanation() {
        if (this.explanation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Immunization.explanation");
            else if (Configuration.doAutoCreate())
                // cc
                this.explanation = new ImmunizationExplanationComponent();
        return this.explanation;
    }

    public boolean hasExplanation() {
        return this.explanation != null && !this.explanation.isEmpty();
    }

    /**
     * @param value {@link #explanation} (Reasons why a vaccine was or was not administered.)
     */
    public Immunization setExplanation(ImmunizationExplanationComponent value) {
        this.explanation = value;
        return this;
    }

    /**
     * @return {@link #reaction} (Categorical data indicating that an adverse event is associated in time to an immunization.)
     */
    public List<ImmunizationReactionComponent> getReaction() {
        if (this.reaction == null)
            this.reaction = new ArrayList<ImmunizationReactionComponent>();
        return this.reaction;
    }

    public boolean hasReaction() {
        if (this.reaction == null)
            return false;
        for (ImmunizationReactionComponent item : this.reaction) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #reaction} (Categorical data indicating that an adverse event is associated in time to an immunization.)
     */
    // syntactic sugar
    public ImmunizationReactionComponent addReaction() {
        // 3
        ImmunizationReactionComponent t = new ImmunizationReactionComponent();
        if (this.reaction == null)
            this.reaction = new ArrayList<ImmunizationReactionComponent>();
        this.reaction.add(t);
        return t;
    }

    // syntactic sugar
    public Immunization addReaction(ImmunizationReactionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.reaction == null)
            this.reaction = new ArrayList<ImmunizationReactionComponent>();
        this.reaction.add(t);
        return this;
    }

    /**
     * @return {@link #vaccinationProtocol} (Contains information about the protocol(s) under which the vaccine was administered.)
     */
    public List<ImmunizationVaccinationProtocolComponent> getVaccinationProtocol() {
        if (this.vaccinationProtocol == null)
            this.vaccinationProtocol = new ArrayList<ImmunizationVaccinationProtocolComponent>();
        return this.vaccinationProtocol;
    }

    public boolean hasVaccinationProtocol() {
        if (this.vaccinationProtocol == null)
            return false;
        for (ImmunizationVaccinationProtocolComponent item : this.vaccinationProtocol) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #vaccinationProtocol} (Contains information about the protocol(s) under which the vaccine was administered.)
     */
    // syntactic sugar
    public ImmunizationVaccinationProtocolComponent addVaccinationProtocol() {
        // 3
        ImmunizationVaccinationProtocolComponent t = new ImmunizationVaccinationProtocolComponent();
        if (this.vaccinationProtocol == null)
            this.vaccinationProtocol = new ArrayList<ImmunizationVaccinationProtocolComponent>();
        this.vaccinationProtocol.add(t);
        return t;
    }

    // syntactic sugar
    public Immunization addVaccinationProtocol(ImmunizationVaccinationProtocolComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.vaccinationProtocol == null)
            this.vaccinationProtocol = new ArrayList<ImmunizationVaccinationProtocolComponent>();
        this.vaccinationProtocol.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "A unique identifier assigned to this immunization record.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "Indicates the current status of the vaccination event.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("date", "dateTime", "Date vaccine administered or was to be administered.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("vaccineCode", "CodeableConcept", "Vaccine that was administered or was to be administered.", 0, java.lang.Integer.MAX_VALUE, vaccineCode));
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient who either received or did not receive the immunization.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("wasNotGiven", "boolean", "Indicates if the vaccination was or was not given.", 0, java.lang.Integer.MAX_VALUE, wasNotGiven));
        childrenList.add(new Property("reported", "boolean", "True if this administration was reported rather than directly administered.", 0, java.lang.Integer.MAX_VALUE, reported));
        childrenList.add(new Property("performer", "Reference(Practitioner)", "Clinician who administered the vaccine.", 0, java.lang.Integer.MAX_VALUE, performer));
        childrenList.add(new Property("requester", "Reference(Practitioner)", "Clinician who ordered the vaccination.", 0, java.lang.Integer.MAX_VALUE, requester));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "The visit or admission or other contact between patient and health care provider the immunization was performed as part of.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("manufacturer", "Reference(Organization)", "Name of vaccine manufacturer.", 0, java.lang.Integer.MAX_VALUE, manufacturer));
        childrenList.add(new Property("location", "Reference(Location)", "The service delivery location where the vaccine administration occurred.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("lotNumber", "string", "Lot number of the  vaccine product.", 0, java.lang.Integer.MAX_VALUE, lotNumber));
        childrenList.add(new Property("expirationDate", "date", "Date vaccine batch expires.", 0, java.lang.Integer.MAX_VALUE, expirationDate));
        childrenList.add(new Property("site", "CodeableConcept", "Body site where vaccine was administered.", 0, java.lang.Integer.MAX_VALUE, site));
        childrenList.add(new Property("route", "CodeableConcept", "The path by which the vaccine product is taken into the body.", 0, java.lang.Integer.MAX_VALUE, route));
        childrenList.add(new Property("doseQuantity", "SimpleQuantity", "The quantity of vaccine product that was administered.", 0, java.lang.Integer.MAX_VALUE, doseQuantity));
        childrenList.add(new Property("note", "Annotation", "Extra information about the immunization that is not conveyed by the other attributes.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("explanation", "", "Reasons why a vaccine was or was not administered.", 0, java.lang.Integer.MAX_VALUE, explanation));
        childrenList.add(new Property("reaction", "", "Categorical data indicating that an adverse event is associated in time to an immunization.", 0, java.lang.Integer.MAX_VALUE, reaction));
        childrenList.add(new Property("vaccinationProtocol", "", "Contains information about the protocol(s) under which the vaccine was administered.", 0, java.lang.Integer.MAX_VALUE, vaccinationProtocol));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
            // CodeType
            this.status = castToCode(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("vaccineCode"))
            // CodeableConcept
            this.vaccineCode = castToCodeableConcept(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("wasNotGiven"))
            // BooleanType
            this.wasNotGiven = castToBoolean(value);
        else if (name.equals("reported"))
            // BooleanType
            this.reported = castToBoolean(value);
        else if (name.equals("performer"))
            // Reference
            this.performer = castToReference(value);
        else if (name.equals("requester"))
            // Reference
            this.requester = castToReference(value);
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("manufacturer"))
            // Reference
            this.manufacturer = castToReference(value);
        else if (name.equals("location"))
            // Reference
            this.location = castToReference(value);
        else if (name.equals("lotNumber"))
            // StringType
            this.lotNumber = castToString(value);
        else if (name.equals("expirationDate"))
            // DateType
            this.expirationDate = castToDate(value);
        else if (name.equals("site"))
            // CodeableConcept
            this.site = castToCodeableConcept(value);
        else if (name.equals("route"))
            // CodeableConcept
            this.route = castToCodeableConcept(value);
        else if (name.equals("doseQuantity"))
            // SimpleQuantity
            this.doseQuantity = castToSimpleQuantity(value);
        else if (name.equals("note"))
            this.getNote().add(castToAnnotation(value));
        else if (name.equals("explanation"))
            // ImmunizationExplanationComponent
            this.explanation = (ImmunizationExplanationComponent) value;
        else if (name.equals("reaction"))
            this.getReaction().add((ImmunizationReactionComponent) value);
        else if (name.equals("vaccinationProtocol"))
            this.getVaccinationProtocol().add((ImmunizationVaccinationProtocolComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.status");
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.date");
        } else if (name.equals("vaccineCode")) {
            this.vaccineCode = new CodeableConcept();
            return this.vaccineCode;
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("wasNotGiven")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.wasNotGiven");
        } else if (name.equals("reported")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.reported");
        } else if (name.equals("performer")) {
            this.performer = new Reference();
            return this.performer;
        } else if (name.equals("requester")) {
            this.requester = new Reference();
            return this.requester;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("manufacturer")) {
            this.manufacturer = new Reference();
            return this.manufacturer;
        } else if (name.equals("location")) {
            this.location = new Reference();
            return this.location;
        } else if (name.equals("lotNumber")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.lotNumber");
        } else if (name.equals("expirationDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.expirationDate");
        } else if (name.equals("site")) {
            this.site = new CodeableConcept();
            return this.site;
        } else if (name.equals("route")) {
            this.route = new CodeableConcept();
            return this.route;
        } else if (name.equals("doseQuantity")) {
            this.doseQuantity = new SimpleQuantity();
            return this.doseQuantity;
        } else if (name.equals("note")) {
            return addNote();
        } else if (name.equals("explanation")) {
            this.explanation = new ImmunizationExplanationComponent();
            return this.explanation;
        } else if (name.equals("reaction")) {
            return addReaction();
        } else if (name.equals("vaccinationProtocol")) {
            return addVaccinationProtocol();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Immunization";
    }

    public Immunization copy() {
        Immunization dst = new Immunization();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        dst.date = date == null ? null : date.copy();
        dst.vaccineCode = vaccineCode == null ? null : vaccineCode.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.wasNotGiven = wasNotGiven == null ? null : wasNotGiven.copy();
        dst.reported = reported == null ? null : reported.copy();
        dst.performer = performer == null ? null : performer.copy();
        dst.requester = requester == null ? null : requester.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.manufacturer = manufacturer == null ? null : manufacturer.copy();
        dst.location = location == null ? null : location.copy();
        dst.lotNumber = lotNumber == null ? null : lotNumber.copy();
        dst.expirationDate = expirationDate == null ? null : expirationDate.copy();
        dst.site = site == null ? null : site.copy();
        dst.route = route == null ? null : route.copy();
        dst.doseQuantity = doseQuantity == null ? null : doseQuantity.copy();
        if (note != null) {
            dst.note = new ArrayList<Annotation>();
            for (Annotation i : note) dst.note.add(i.copy());
        }
        ;
        dst.explanation = explanation == null ? null : explanation.copy();
        if (reaction != null) {
            dst.reaction = new ArrayList<ImmunizationReactionComponent>();
            for (ImmunizationReactionComponent i : reaction) dst.reaction.add(i.copy());
        }
        ;
        if (vaccinationProtocol != null) {
            dst.vaccinationProtocol = new ArrayList<ImmunizationVaccinationProtocolComponent>();
            for (ImmunizationVaccinationProtocolComponent i : vaccinationProtocol) dst.vaccinationProtocol.add(i.copy());
        }
        ;
        return dst;
    }

    protected Immunization typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Immunization))
            return false;
        Immunization o = (Immunization) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(date, o.date, true) && compareDeep(vaccineCode, o.vaccineCode, true) && compareDeep(patient, o.patient, true) && compareDeep(wasNotGiven, o.wasNotGiven, true) && compareDeep(reported, o.reported, true) && compareDeep(performer, o.performer, true) && compareDeep(requester, o.requester, true) && compareDeep(encounter, o.encounter, true) && compareDeep(manufacturer, o.manufacturer, true) && compareDeep(location, o.location, true) && compareDeep(lotNumber, o.lotNumber, true) && compareDeep(expirationDate, o.expirationDate, true) && compareDeep(site, o.site, true) && compareDeep(route, o.route, true) && compareDeep(doseQuantity, o.doseQuantity, true) && compareDeep(note, o.note, true) && compareDeep(explanation, o.explanation, true) && compareDeep(reaction, o.reaction, true) && compareDeep(vaccinationProtocol, o.vaccinationProtocol, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Immunization))
            return false;
        Immunization o = (Immunization) other;
        return compareValues(status, o.status, true) && compareValues(date, o.date, true) && compareValues(wasNotGiven, o.wasNotGiven, true) && compareValues(reported, o.reported, true) && compareValues(lotNumber, o.lotNumber, true) && compareValues(expirationDate, o.expirationDate, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (date == null || date.isEmpty()) && (vaccineCode == null || vaccineCode.isEmpty()) && (patient == null || patient.isEmpty()) && (wasNotGiven == null || wasNotGiven.isEmpty()) && (reported == null || reported.isEmpty()) && (performer == null || performer.isEmpty()) && (requester == null || requester.isEmpty()) && (encounter == null || encounter.isEmpty()) && (manufacturer == null || manufacturer.isEmpty()) && (location == null || location.isEmpty()) && (lotNumber == null || lotNumber.isEmpty()) && (expirationDate == null || expirationDate.isEmpty()) && (site == null || site.isEmpty()) && (route == null || route.isEmpty()) && (doseQuantity == null || doseQuantity.isEmpty()) && (note == null || note.isEmpty()) && (explanation == null || explanation.isEmpty()) && (reaction == null || reaction.isEmpty()) && (vaccinationProtocol == null || vaccinationProtocol.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Immunization;
    }

    public static final String SP_DATE = "date";

    public static final String SP_REQUESTER = "requester";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_REASON = "reason";

    public static final String SP_PERFORMER = "performer";

    public static final String SP_REACTION = "reaction";

    public static final String SP_LOTNUMBER = "lot-number";

    public static final String SP_NOTGIVEN = "notgiven";

    public static final String SP_MANUFACTURER = "manufacturer";

    public static final String SP_DOSESEQUENCE = "dose-sequence";

    public static final String SP_PATIENT = "patient";

    public static final String SP_VACCINECODE = "vaccine-code";

    public static final String SP_REASONNOTGIVEN = "reason-not-given";

    public static final String SP_LOCATION = "location";

    public static final String SP_REACTIONDATE = "reaction-date";

    public static final String SP_STATUS = "status";
}
