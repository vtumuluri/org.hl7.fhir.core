package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ImagingStudyEnum.InstanceAvailabilityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImagingStudyEnum.InstanceAvailability;

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
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 */
public class ImagingStudy extends DomainResource {

    /**
     * Date and Time the study started.
     */
    protected DateTimeType started;

    /**
     * The patient imaged in the study.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (The patient imaged in the study.)
     */
    protected Patient patientTarget;

    /**
     * Formal identifier for the study.
     */
    protected OidType uid;

    /**
     * Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf).
     */
    protected Identifier accession;

    /**
     * Other identifiers for the study.
     */
    protected List<Identifier> identifier;

    /**
     * A list of the diagnostic orders that resulted in this imaging study being performed.
     */
    protected List<Reference> order;

    /**
     * The actual objects that are the target of the reference (A list of the diagnostic orders that resulted in this imaging study being performed.)
     */
    protected List<DiagnosticOrder> orderTarget;

    /**
     * A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
     */
    protected List<Coding> modalityList;

    /**
     * The requesting/referring physician.
     */
    protected Reference referrer;

    /**
     * The actual object that is the target of the reference (The requesting/referring physician.)
     */
    protected Practitioner referrerTarget;

    /**
     * Availability of study (online, offline or nearline).
     */
    protected Enumeration<InstanceAvailability> availability;

    /**
     * WADO-RS resource where Study is available.
     */
    protected UriType url;

    /**
     * Number of Series in Study.
     */
    protected UnsignedIntType numberOfSeries;

    /**
     * Number of SOP Instances in Study.
     */
    protected UnsignedIntType numberOfInstances;

    /**
     * Type of procedure performed.
     */
    protected List<Reference> procedure;

    /**
     * The actual objects that are the target of the reference (Type of procedure performed.)
     */
    protected List<Procedure> procedureTarget;

    /**
     * Who read the study and interpreted the images or other content.
     */
    protected Reference interpreter;

    /**
     * The actual object that is the target of the reference (Who read the study and interpreted the images or other content.)
     */
    protected Practitioner interpreterTarget;

    /**
     * Institution-generated description or classification of the Study performed.
     */
    protected StringType description;

    /**
     * Each study has one or more series of images or other content.
     */
    protected List<ImagingStudySeriesComponent> series;

    private static final long serialVersionUID = 1895046380L;

    /*
   * Constructor
   */
    public ImagingStudy() {
        super();
    }

    /*
   * Constructor
   */
    public ImagingStudy(Reference patient, OidType uid, UnsignedIntType numberOfSeries, UnsignedIntType numberOfInstances) {
        super();
        this.patient = patient;
        this.uid = uid;
        this.numberOfSeries = numberOfSeries;
        this.numberOfInstances = numberOfInstances;
    }

    /**
     * @return {@link #started} (Date and Time the study started.). This is the underlying object with id, value and extensions. The accessor "getStarted" gives direct access to the value
     */
    public DateTimeType getStartedElement() {
        if (this.started == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.started");
            else if (Configuration.doAutoCreate())
                // bb
                this.started = new DateTimeType();
        return this.started;
    }

    public boolean hasStartedElement() {
        return this.started != null && !this.started.isEmpty();
    }

    public boolean hasStarted() {
        return this.started != null && !this.started.isEmpty();
    }

    /**
     * @param value {@link #started} (Date and Time the study started.). This is the underlying object with id, value and extensions. The accessor "getStarted" gives direct access to the value
     */
    public ImagingStudy setStartedElement(DateTimeType value) {
        this.started = value;
        return this;
    }

    /**
     * @return Date and Time the study started.
     */
    public Date getStarted() {
        return this.started == null ? null : this.started.getValue();
    }

    /**
     * @param value Date and Time the study started.
     */
    public ImagingStudy setStarted(Date value) {
        if (value == null)
            this.started = null;
        else {
            if (this.started == null)
                this.started = new DateTimeType();
            this.started.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #patient} (The patient imaged in the study.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient imaged in the study.)
     */
    public ImagingStudy setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient imaged in the study.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient imaged in the study.)
     */
    public ImagingStudy setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #uid} (Formal identifier for the study.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public OidType getUidElement() {
        if (this.uid == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.uid");
            else if (Configuration.doAutoCreate())
                // bb
                this.uid = new OidType();
        return this.uid;
    }

    public boolean hasUidElement() {
        return this.uid != null && !this.uid.isEmpty();
    }

    public boolean hasUid() {
        return this.uid != null && !this.uid.isEmpty();
    }

    /**
     * @param value {@link #uid} (Formal identifier for the study.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public ImagingStudy setUidElement(OidType value) {
        this.uid = value;
        return this;
    }

    /**
     * @return Formal identifier for the study.
     */
    public String getUid() {
        return this.uid == null ? null : this.uid.getValue();
    }

    /**
     * @param value Formal identifier for the study.
     */
    public ImagingStudy setUid(String value) {
        if (this.uid == null)
            this.uid = new OidType();
        this.uid.setValue(value);
        return this;
    }

    /**
     * @return {@link #accession} (Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf).)
     */
    public Identifier getAccession() {
        if (this.accession == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.accession");
            else if (Configuration.doAutoCreate())
                // cc
                this.accession = new Identifier();
        return this.accession;
    }

    public boolean hasAccession() {
        return this.accession != null && !this.accession.isEmpty();
    }

    /**
     * @param value {@link #accession} (Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf).)
     */
    public ImagingStudy setAccession(Identifier value) {
        this.accession = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Other identifiers for the study.)
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
     * @return {@link #identifier} (Other identifiers for the study.)
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
    public ImagingStudy addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #order} (A list of the diagnostic orders that resulted in this imaging study being performed.)
     */
    public List<Reference> getOrder() {
        if (this.order == null)
            this.order = new ArrayList<Reference>();
        return this.order;
    }

    public boolean hasOrder() {
        if (this.order == null)
            return false;
        for (Reference item : this.order) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #order} (A list of the diagnostic orders that resulted in this imaging study being performed.)
     */
    // syntactic sugar
    public Reference addOrder() {
        // 3
        Reference t = new Reference();
        if (this.order == null)
            this.order = new ArrayList<Reference>();
        this.order.add(t);
        return t;
    }

    // syntactic sugar
    public ImagingStudy addOrder(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.order == null)
            this.order = new ArrayList<Reference>();
        this.order.add(t);
        return this;
    }

    /**
     * @return {@link #order} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. A list of the diagnostic orders that resulted in this imaging study being performed.)
     */
    public List<DiagnosticOrder> getOrderTarget() {
        if (this.orderTarget == null)
            this.orderTarget = new ArrayList<DiagnosticOrder>();
        return this.orderTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #order} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. A list of the diagnostic orders that resulted in this imaging study being performed.)
     */
    public DiagnosticOrder addOrderTarget() {
        DiagnosticOrder r = new DiagnosticOrder();
        if (this.orderTarget == null)
            this.orderTarget = new ArrayList<DiagnosticOrder>();
        this.orderTarget.add(r);
        return r;
    }

    /**
     * @return {@link #modalityList} (A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).)
     */
    public List<Coding> getModalityList() {
        if (this.modalityList == null)
            this.modalityList = new ArrayList<Coding>();
        return this.modalityList;
    }

    public boolean hasModalityList() {
        if (this.modalityList == null)
            return false;
        for (Coding item : this.modalityList) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #modalityList} (A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).)
     */
    // syntactic sugar
    public Coding addModalityList() {
        // 3
        Coding t = new Coding();
        if (this.modalityList == null)
            this.modalityList = new ArrayList<Coding>();
        this.modalityList.add(t);
        return t;
    }

    // syntactic sugar
    public ImagingStudy addModalityList(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.modalityList == null)
            this.modalityList = new ArrayList<Coding>();
        this.modalityList.add(t);
        return this;
    }

    /**
     * @return {@link #referrer} (The requesting/referring physician.)
     */
    public Reference getReferrer() {
        if (this.referrer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.referrer");
            else if (Configuration.doAutoCreate())
                // cc
                this.referrer = new Reference();
        return this.referrer;
    }

    public boolean hasReferrer() {
        return this.referrer != null && !this.referrer.isEmpty();
    }

    /**
     * @param value {@link #referrer} (The requesting/referring physician.)
     */
    public ImagingStudy setReferrer(Reference value) {
        this.referrer = value;
        return this;
    }

    /**
     * @return {@link #referrer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The requesting/referring physician.)
     */
    public Practitioner getReferrerTarget() {
        if (this.referrerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.referrer");
            else if (Configuration.doAutoCreate())
                // aa
                this.referrerTarget = new Practitioner();
        return this.referrerTarget;
    }

    /**
     * @param value {@link #referrer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The requesting/referring physician.)
     */
    public ImagingStudy setReferrerTarget(Practitioner value) {
        this.referrerTarget = value;
        return this;
    }

    /**
     * @return {@link #availability} (Availability of study (online, offline or nearline).). This is the underlying object with id, value and extensions. The accessor "getAvailability" gives direct access to the value
     */
    public Enumeration<InstanceAvailability> getAvailabilityElement() {
        if (this.availability == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.availability");
            else if (Configuration.doAutoCreate())
                // bb
                this.availability = new Enumeration<InstanceAvailability>(new InstanceAvailabilityEnumFactory());
        return this.availability;
    }

    public boolean hasAvailabilityElement() {
        return this.availability != null && !this.availability.isEmpty();
    }

    public boolean hasAvailability() {
        return this.availability != null && !this.availability.isEmpty();
    }

    /**
     * @param value {@link #availability} (Availability of study (online, offline or nearline).). This is the underlying object with id, value and extensions. The accessor "getAvailability" gives direct access to the value
     */
    public ImagingStudy setAvailabilityElement(Enumeration<InstanceAvailability> value) {
        this.availability = value;
        return this;
    }

    /**
     * @return Availability of study (online, offline or nearline).
     */
    public InstanceAvailability getAvailability() {
        return this.availability == null ? null : this.availability.getValue();
    }

    /**
     * @param value Availability of study (online, offline or nearline).
     */
    public ImagingStudy setAvailability(InstanceAvailability value) {
        if (value == null)
            this.availability = null;
        else {
            if (this.availability == null)
                this.availability = new Enumeration<InstanceAvailability>(new InstanceAvailabilityEnumFactory());
            this.availability.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #url} (WADO-RS resource where Study is available.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.url");
            else if (Configuration.doAutoCreate())
                // bb
                this.url = new UriType();
        return this.url;
    }

    public boolean hasUrlElement() {
        return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() {
        return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (WADO-RS resource where Study is available.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public ImagingStudy setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return WADO-RS resource where Study is available.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value WADO-RS resource where Study is available.
     */
    public ImagingStudy setUrl(String value) {
        if (Utilities.noString(value))
            this.url = null;
        else {
            if (this.url == null)
                this.url = new UriType();
            this.url.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #numberOfSeries} (Number of Series in Study.). This is the underlying object with id, value and extensions. The accessor "getNumberOfSeries" gives direct access to the value
     */
    public UnsignedIntType getNumberOfSeriesElement() {
        if (this.numberOfSeries == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.numberOfSeries");
            else if (Configuration.doAutoCreate())
                // bb
                this.numberOfSeries = new UnsignedIntType();
        return this.numberOfSeries;
    }

    public boolean hasNumberOfSeriesElement() {
        return this.numberOfSeries != null && !this.numberOfSeries.isEmpty();
    }

    public boolean hasNumberOfSeries() {
        return this.numberOfSeries != null && !this.numberOfSeries.isEmpty();
    }

    /**
     * @param value {@link #numberOfSeries} (Number of Series in Study.). This is the underlying object with id, value and extensions. The accessor "getNumberOfSeries" gives direct access to the value
     */
    public ImagingStudy setNumberOfSeriesElement(UnsignedIntType value) {
        this.numberOfSeries = value;
        return this;
    }

    /**
     * @return Number of Series in Study.
     */
    public int getNumberOfSeries() {
        return this.numberOfSeries == null || this.numberOfSeries.isEmpty() ? 0 : this.numberOfSeries.getValue();
    }

    /**
     * @param value Number of Series in Study.
     */
    public ImagingStudy setNumberOfSeries(int value) {
        if (this.numberOfSeries == null)
            this.numberOfSeries = new UnsignedIntType();
        this.numberOfSeries.setValue(value);
        return this;
    }

    /**
     * @return {@link #numberOfInstances} (Number of SOP Instances in Study.). This is the underlying object with id, value and extensions. The accessor "getNumberOfInstances" gives direct access to the value
     */
    public UnsignedIntType getNumberOfInstancesElement() {
        if (this.numberOfInstances == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.numberOfInstances");
            else if (Configuration.doAutoCreate())
                // bb
                this.numberOfInstances = new UnsignedIntType();
        return this.numberOfInstances;
    }

    public boolean hasNumberOfInstancesElement() {
        return this.numberOfInstances != null && !this.numberOfInstances.isEmpty();
    }

    public boolean hasNumberOfInstances() {
        return this.numberOfInstances != null && !this.numberOfInstances.isEmpty();
    }

    /**
     * @param value {@link #numberOfInstances} (Number of SOP Instances in Study.). This is the underlying object with id, value and extensions. The accessor "getNumberOfInstances" gives direct access to the value
     */
    public ImagingStudy setNumberOfInstancesElement(UnsignedIntType value) {
        this.numberOfInstances = value;
        return this;
    }

    /**
     * @return Number of SOP Instances in Study.
     */
    public int getNumberOfInstances() {
        return this.numberOfInstances == null || this.numberOfInstances.isEmpty() ? 0 : this.numberOfInstances.getValue();
    }

    /**
     * @param value Number of SOP Instances in Study.
     */
    public ImagingStudy setNumberOfInstances(int value) {
        if (this.numberOfInstances == null)
            this.numberOfInstances = new UnsignedIntType();
        this.numberOfInstances.setValue(value);
        return this;
    }

    /**
     * @return {@link #procedure} (Type of procedure performed.)
     */
    public List<Reference> getProcedure() {
        if (this.procedure == null)
            this.procedure = new ArrayList<Reference>();
        return this.procedure;
    }

    public boolean hasProcedure() {
        if (this.procedure == null)
            return false;
        for (Reference item : this.procedure) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #procedure} (Type of procedure performed.)
     */
    // syntactic sugar
    public Reference addProcedure() {
        // 3
        Reference t = new Reference();
        if (this.procedure == null)
            this.procedure = new ArrayList<Reference>();
        this.procedure.add(t);
        return t;
    }

    // syntactic sugar
    public ImagingStudy addProcedure(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.procedure == null)
            this.procedure = new ArrayList<Reference>();
        this.procedure.add(t);
        return this;
    }

    /**
     * @return {@link #procedure} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Type of procedure performed.)
     */
    public List<Procedure> getProcedureTarget() {
        if (this.procedureTarget == null)
            this.procedureTarget = new ArrayList<Procedure>();
        return this.procedureTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #procedure} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Type of procedure performed.)
     */
    public Procedure addProcedureTarget() {
        Procedure r = new Procedure();
        if (this.procedureTarget == null)
            this.procedureTarget = new ArrayList<Procedure>();
        this.procedureTarget.add(r);
        return r;
    }

    /**
     * @return {@link #interpreter} (Who read the study and interpreted the images or other content.)
     */
    public Reference getInterpreter() {
        if (this.interpreter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.interpreter");
            else if (Configuration.doAutoCreate())
                // cc
                this.interpreter = new Reference();
        return this.interpreter;
    }

    public boolean hasInterpreter() {
        return this.interpreter != null && !this.interpreter.isEmpty();
    }

    /**
     * @param value {@link #interpreter} (Who read the study and interpreted the images or other content.)
     */
    public ImagingStudy setInterpreter(Reference value) {
        this.interpreter = value;
        return this;
    }

    /**
     * @return {@link #interpreter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who read the study and interpreted the images or other content.)
     */
    public Practitioner getInterpreterTarget() {
        if (this.interpreterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.interpreter");
            else if (Configuration.doAutoCreate())
                // aa
                this.interpreterTarget = new Practitioner();
        return this.interpreterTarget;
    }

    /**
     * @param value {@link #interpreter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who read the study and interpreted the images or other content.)
     */
    public ImagingStudy setInterpreterTarget(Practitioner value) {
        this.interpreterTarget = value;
        return this;
    }

    /**
     * @return {@link #description} (Institution-generated description or classification of the Study performed.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudy.description");
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
     * @param value {@link #description} (Institution-generated description or classification of the Study performed.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ImagingStudy setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Institution-generated description or classification of the Study performed.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Institution-generated description or classification of the Study performed.
     */
    public ImagingStudy setDescription(String value) {
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
     * @return {@link #series} (Each study has one or more series of images or other content.)
     */
    public List<ImagingStudySeriesComponent> getSeries() {
        if (this.series == null)
            this.series = new ArrayList<ImagingStudySeriesComponent>();
        return this.series;
    }

    public boolean hasSeries() {
        if (this.series == null)
            return false;
        for (ImagingStudySeriesComponent item : this.series) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #series} (Each study has one or more series of images or other content.)
     */
    // syntactic sugar
    public ImagingStudySeriesComponent addSeries() {
        // 3
        ImagingStudySeriesComponent t = new ImagingStudySeriesComponent();
        if (this.series == null)
            this.series = new ArrayList<ImagingStudySeriesComponent>();
        this.series.add(t);
        return t;
    }

    // syntactic sugar
    public ImagingStudy addSeries(ImagingStudySeriesComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.series == null)
            this.series = new ArrayList<ImagingStudySeriesComponent>();
        this.series.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("started", "dateTime", "Date and Time the study started.", 0, java.lang.Integer.MAX_VALUE, started));
        childrenList.add(new Property("patient", "Reference(Patient)", "The patient imaged in the study.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("uid", "oid", "Formal identifier for the study.", 0, java.lang.Integer.MAX_VALUE, uid));
        childrenList.add(new Property("accession", "Identifier", "Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf).", 0, java.lang.Integer.MAX_VALUE, accession));
        childrenList.add(new Property("identifier", "Identifier", "Other identifiers for the study.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("order", "Reference(DiagnosticOrder)", "A list of the diagnostic orders that resulted in this imaging study being performed.", 0, java.lang.Integer.MAX_VALUE, order));
        childrenList.add(new Property("modalityList", "Coding", "A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).", 0, java.lang.Integer.MAX_VALUE, modalityList));
        childrenList.add(new Property("referrer", "Reference(Practitioner)", "The requesting/referring physician.", 0, java.lang.Integer.MAX_VALUE, referrer));
        childrenList.add(new Property("availability", "code", "Availability of study (online, offline or nearline).", 0, java.lang.Integer.MAX_VALUE, availability));
        childrenList.add(new Property("url", "uri", "WADO-RS resource where Study is available.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("numberOfSeries", "unsignedInt", "Number of Series in Study.", 0, java.lang.Integer.MAX_VALUE, numberOfSeries));
        childrenList.add(new Property("numberOfInstances", "unsignedInt", "Number of SOP Instances in Study.", 0, java.lang.Integer.MAX_VALUE, numberOfInstances));
        childrenList.add(new Property("procedure", "Reference(Procedure)", "Type of procedure performed.", 0, java.lang.Integer.MAX_VALUE, procedure));
        childrenList.add(new Property("interpreter", "Reference(Practitioner)", "Who read the study and interpreted the images or other content.", 0, java.lang.Integer.MAX_VALUE, interpreter));
        childrenList.add(new Property("description", "string", "Institution-generated description or classification of the Study performed.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("series", "", "Each study has one or more series of images or other content.", 0, java.lang.Integer.MAX_VALUE, series));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("started"))
            // DateTimeType
            this.started = castToDateTime(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("uid"))
            // OidType
            this.uid = castToOid(value);
        else if (name.equals("accession"))
            // Identifier
            this.accession = castToIdentifier(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("order"))
            this.getOrder().add(castToReference(value));
        else if (name.equals("modalityList"))
            this.getModalityList().add(castToCoding(value));
        else if (name.equals("referrer"))
            // Reference
            this.referrer = castToReference(value);
        else if (name.equals("availability"))
            // Enumeration<InstanceAvailability>
            this.availability = new InstanceAvailabilityEnumFactory().fromType(value);
        else if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else if (name.equals("numberOfSeries"))
            // UnsignedIntType
            this.numberOfSeries = castToUnsignedInt(value);
        else if (name.equals("numberOfInstances"))
            // UnsignedIntType
            this.numberOfInstances = castToUnsignedInt(value);
        else if (name.equals("procedure"))
            this.getProcedure().add(castToReference(value));
        else if (name.equals("interpreter"))
            // Reference
            this.interpreter = castToReference(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("series"))
            this.getSeries().add((ImagingStudySeriesComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("started")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.started");
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("uid")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.uid");
        } else if (name.equals("accession")) {
            this.accession = new Identifier();
            return this.accession;
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("order")) {
            return addOrder();
        } else if (name.equals("modalityList")) {
            return addModalityList();
        } else if (name.equals("referrer")) {
            this.referrer = new Reference();
            return this.referrer;
        } else if (name.equals("availability")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.availability");
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.url");
        } else if (name.equals("numberOfSeries")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.numberOfSeries");
        } else if (name.equals("numberOfInstances")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.numberOfInstances");
        } else if (name.equals("procedure")) {
            return addProcedure();
        } else if (name.equals("interpreter")) {
            this.interpreter = new Reference();
            return this.interpreter;
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.description");
        } else if (name.equals("series")) {
            return addSeries();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ImagingStudy";
    }

    public ImagingStudy copy() {
        ImagingStudy dst = new ImagingStudy();
        copyValues(dst);
        dst.started = started == null ? null : started.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.uid = uid == null ? null : uid.copy();
        dst.accession = accession == null ? null : accession.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        if (order != null) {
            dst.order = new ArrayList<Reference>();
            for (Reference i : order) dst.order.add(i.copy());
        }
        ;
        if (modalityList != null) {
            dst.modalityList = new ArrayList<Coding>();
            for (Coding i : modalityList) dst.modalityList.add(i.copy());
        }
        ;
        dst.referrer = referrer == null ? null : referrer.copy();
        dst.availability = availability == null ? null : availability.copy();
        dst.url = url == null ? null : url.copy();
        dst.numberOfSeries = numberOfSeries == null ? null : numberOfSeries.copy();
        dst.numberOfInstances = numberOfInstances == null ? null : numberOfInstances.copy();
        if (procedure != null) {
            dst.procedure = new ArrayList<Reference>();
            for (Reference i : procedure) dst.procedure.add(i.copy());
        }
        ;
        dst.interpreter = interpreter == null ? null : interpreter.copy();
        dst.description = description == null ? null : description.copy();
        if (series != null) {
            dst.series = new ArrayList<ImagingStudySeriesComponent>();
            for (ImagingStudySeriesComponent i : series) dst.series.add(i.copy());
        }
        ;
        return dst;
    }

    protected ImagingStudy typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImagingStudy))
            return false;
        ImagingStudy o = (ImagingStudy) other;
        return compareDeep(started, o.started, true) && compareDeep(patient, o.patient, true) && compareDeep(uid, o.uid, true) && compareDeep(accession, o.accession, true) && compareDeep(identifier, o.identifier, true) && compareDeep(order, o.order, true) && compareDeep(modalityList, o.modalityList, true) && compareDeep(referrer, o.referrer, true) && compareDeep(availability, o.availability, true) && compareDeep(url, o.url, true) && compareDeep(numberOfSeries, o.numberOfSeries, true) && compareDeep(numberOfInstances, o.numberOfInstances, true) && compareDeep(procedure, o.procedure, true) && compareDeep(interpreter, o.interpreter, true) && compareDeep(description, o.description, true) && compareDeep(series, o.series, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImagingStudy))
            return false;
        ImagingStudy o = (ImagingStudy) other;
        return compareValues(started, o.started, true) && compareValues(uid, o.uid, true) && compareValues(availability, o.availability, true) && compareValues(url, o.url, true) && compareValues(numberOfSeries, o.numberOfSeries, true) && compareValues(numberOfInstances, o.numberOfInstances, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (started == null || started.isEmpty()) && (patient == null || patient.isEmpty()) && (uid == null || uid.isEmpty()) && (accession == null || accession.isEmpty()) && (identifier == null || identifier.isEmpty()) && (order == null || order.isEmpty()) && (modalityList == null || modalityList.isEmpty()) && (referrer == null || referrer.isEmpty()) && (availability == null || availability.isEmpty()) && (url == null || url.isEmpty()) && (numberOfSeries == null || numberOfSeries.isEmpty()) && (numberOfInstances == null || numberOfInstances.isEmpty()) && (procedure == null || procedure.isEmpty()) && (interpreter == null || interpreter.isEmpty()) && (description == null || description.isEmpty()) && (series == null || series.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ImagingStudy;
    }

    public static final String SP_UID = "uid";

    public static final String SP_STUDY = "study";

    public static final String SP_DICOMCLASS = "dicom-class";

    public static final String SP_MODALITY = "modality";

    public static final String SP_BODYSITE = "bodysite";

    public static final String SP_PATIENT = "patient";

    public static final String SP_SERIES = "series";

    public static final String SP_STARTED = "started";

    public static final String SP_ACCESSION = "accession";

    public static final String SP_ORDER = "order";
}
