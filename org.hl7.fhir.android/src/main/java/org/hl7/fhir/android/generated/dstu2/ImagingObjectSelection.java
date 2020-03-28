package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
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
 * A manifest of a set of DICOM Service-Object Pair Instances (SOP Instances).  The referenced SOP Instances (images or other content) are for a single patient, and may be from one or more studies. The referenced SOP Instances have been selected for a purpose, such as quality assurance, conference, or consult. Reflecting that range of purposes, typical ImagingObjectSelection resources may include all SOP Instances in a study (perhaps for sharing through a Health Information Exchange); key images from multiple studies (for reference by a referring or treating physician); a multi-frame ultrasound instance ("cine" video clip) and a set of measurements taken from that instance (for inclusion in a teaching file); and so on.
 */
public class ImagingObjectSelection extends DomainResource {

    /**
     * Instance UID of the DICOM KOS SOP Instances represented in this resource.
     */
    protected OidType uid;

    /**
     * A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingObjectSelection.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingObjectSelection.)
     */
    protected Patient patientTarget;

    /**
     * The reason for, or significance of, the selection of objects referenced in the resource.
     */
    protected CodeableConcept title;

    /**
     * Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.
     */
    protected StringType description;

    /**
     * Author of ImagingObjectSelection. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.
     */
    protected Reference author;

    /**
     * The actual object that is the target of the reference (Author of ImagingObjectSelection. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.)
     */
    protected Resource authorTarget;

    /**
     * Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
     */
    protected DateTimeType authoringTime;

    /**
     * Study identity and locating information of the DICOM SOP instances in the selection.
     */
    protected List<StudyComponent> study;

    private static final long serialVersionUID = -1961832713L;

    /*
   * Constructor
   */
    public ImagingObjectSelection() {
        super();
    }

    /*
   * Constructor
   */
    public ImagingObjectSelection(OidType uid, Reference patient, CodeableConcept title) {
        super();
        this.uid = uid;
        this.patient = patient;
        this.title = title;
    }

    /**
     * @return {@link #uid} (Instance UID of the DICOM KOS SOP Instances represented in this resource.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public OidType getUidElement() {
        if (this.uid == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingObjectSelection.uid");
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
     * @param value {@link #uid} (Instance UID of the DICOM KOS SOP Instances represented in this resource.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public ImagingObjectSelection setUidElement(OidType value) {
        this.uid = value;
        return this;
    }

    /**
     * @return Instance UID of the DICOM KOS SOP Instances represented in this resource.
     */
    public String getUid() {
        return this.uid == null ? null : this.uid.getValue();
    }

    /**
     * @param value Instance UID of the DICOM KOS SOP Instances represented in this resource.
     */
    public ImagingObjectSelection setUid(String value) {
        if (this.uid == null)
            this.uid = new OidType();
        this.uid.setValue(value);
        return this;
    }

    /**
     * @return {@link #patient} (A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingObjectSelection.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingObjectSelection.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingObjectSelection.)
     */
    public ImagingObjectSelection setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingObjectSelection.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingObjectSelection.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingObjectSelection.)
     */
    public ImagingObjectSelection setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #title} (The reason for, or significance of, the selection of objects referenced in the resource.)
     */
    public CodeableConcept getTitle() {
        if (this.title == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingObjectSelection.title");
            else if (Configuration.doAutoCreate())
                // cc
                this.title = new CodeableConcept();
        return this.title;
    }

    public boolean hasTitle() {
        return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (The reason for, or significance of, the selection of objects referenced in the resource.)
     */
    public ImagingObjectSelection setTitle(CodeableConcept value) {
        this.title = value;
        return this;
    }

    /**
     * @return {@link #description} (Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingObjectSelection.description");
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
     * @param value {@link #description} (Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ImagingObjectSelection setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.
     */
    public ImagingObjectSelection setDescription(String value) {
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
     * @return {@link #author} (Author of ImagingObjectSelection. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.)
     */
    public Reference getAuthor() {
        if (this.author == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingObjectSelection.author");
            else if (Configuration.doAutoCreate())
                // cc
                this.author = new Reference();
        return this.author;
    }

    public boolean hasAuthor() {
        return this.author != null && !this.author.isEmpty();
    }

    /**
     * @param value {@link #author} (Author of ImagingObjectSelection. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.)
     */
    public ImagingObjectSelection setAuthor(Reference value) {
        this.author = value;
        return this;
    }

    /**
     * @return {@link #author} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Author of ImagingObjectSelection. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.)
     */
    public Resource getAuthorTarget() {
        return this.authorTarget;
    }

    /**
     * @param value {@link #author} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Author of ImagingObjectSelection. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.)
     */
    public ImagingObjectSelection setAuthorTarget(Resource value) {
        this.authorTarget = value;
        return this;
    }

    /**
     * @return {@link #authoringTime} (Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).). This is the underlying object with id, value and extensions. The accessor "getAuthoringTime" gives direct access to the value
     */
    public DateTimeType getAuthoringTimeElement() {
        if (this.authoringTime == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingObjectSelection.authoringTime");
            else if (Configuration.doAutoCreate())
                // bb
                this.authoringTime = new DateTimeType();
        return this.authoringTime;
    }

    public boolean hasAuthoringTimeElement() {
        return this.authoringTime != null && !this.authoringTime.isEmpty();
    }

    public boolean hasAuthoringTime() {
        return this.authoringTime != null && !this.authoringTime.isEmpty();
    }

    /**
     * @param value {@link #authoringTime} (Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).). This is the underlying object with id, value and extensions. The accessor "getAuthoringTime" gives direct access to the value
     */
    public ImagingObjectSelection setAuthoringTimeElement(DateTimeType value) {
        this.authoringTime = value;
        return this;
    }

    /**
     * @return Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
     */
    public Date getAuthoringTime() {
        return this.authoringTime == null ? null : this.authoringTime.getValue();
    }

    /**
     * @param value Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
     */
    public ImagingObjectSelection setAuthoringTime(Date value) {
        if (value == null)
            this.authoringTime = null;
        else {
            if (this.authoringTime == null)
                this.authoringTime = new DateTimeType();
            this.authoringTime.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #study} (Study identity and locating information of the DICOM SOP instances in the selection.)
     */
    public List<StudyComponent> getStudy() {
        if (this.study == null)
            this.study = new ArrayList<StudyComponent>();
        return this.study;
    }

    public boolean hasStudy() {
        if (this.study == null)
            return false;
        for (StudyComponent item : this.study) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #study} (Study identity and locating information of the DICOM SOP instances in the selection.)
     */
    // syntactic sugar
    public StudyComponent addStudy() {
        // 3
        StudyComponent t = new StudyComponent();
        if (this.study == null)
            this.study = new ArrayList<StudyComponent>();
        this.study.add(t);
        return t;
    }

    // syntactic sugar
    public ImagingObjectSelection addStudy(StudyComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.study == null)
            this.study = new ArrayList<StudyComponent>();
        this.study.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("uid", "oid", "Instance UID of the DICOM KOS SOP Instances represented in this resource.", 0, java.lang.Integer.MAX_VALUE, uid));
        childrenList.add(new Property("patient", "Reference(Patient)", "A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingObjectSelection.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("title", "CodeableConcept", "The reason for, or significance of, the selection of objects referenced in the resource.", 0, java.lang.Integer.MAX_VALUE, title));
        childrenList.add(new Property("description", "string", "Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("author", "Reference(Practitioner|Device|Organization|Patient|RelatedPerson)", "Author of ImagingObjectSelection. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("authoringTime", "dateTime", "Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).", 0, java.lang.Integer.MAX_VALUE, authoringTime));
        childrenList.add(new Property("study", "", "Study identity and locating information of the DICOM SOP instances in the selection.", 0, java.lang.Integer.MAX_VALUE, study));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("uid"))
            // OidType
            this.uid = castToOid(value);
        else if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("title"))
            // CodeableConcept
            this.title = castToCodeableConcept(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("author"))
            // Reference
            this.author = castToReference(value);
        else if (name.equals("authoringTime"))
            // DateTimeType
            this.authoringTime = castToDateTime(value);
        else if (name.equals("study"))
            this.getStudy().add((StudyComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("uid")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.uid");
        } else if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("title")) {
            this.title = new CodeableConcept();
            return this.title;
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.description");
        } else if (name.equals("author")) {
            this.author = new Reference();
            return this.author;
        } else if (name.equals("authoringTime")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.authoringTime");
        } else if (name.equals("study")) {
            return addStudy();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ImagingObjectSelection";
    }

    public ImagingObjectSelection copy() {
        ImagingObjectSelection dst = new ImagingObjectSelection();
        copyValues(dst);
        dst.uid = uid == null ? null : uid.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.title = title == null ? null : title.copy();
        dst.description = description == null ? null : description.copy();
        dst.author = author == null ? null : author.copy();
        dst.authoringTime = authoringTime == null ? null : authoringTime.copy();
        if (study != null) {
            dst.study = new ArrayList<StudyComponent>();
            for (StudyComponent i : study) dst.study.add(i.copy());
        }
        ;
        return dst;
    }

    protected ImagingObjectSelection typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImagingObjectSelection))
            return false;
        ImagingObjectSelection o = (ImagingObjectSelection) other;
        return compareDeep(uid, o.uid, true) && compareDeep(patient, o.patient, true) && compareDeep(title, o.title, true) && compareDeep(description, o.description, true) && compareDeep(author, o.author, true) && compareDeep(authoringTime, o.authoringTime, true) && compareDeep(study, o.study, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImagingObjectSelection))
            return false;
        ImagingObjectSelection o = (ImagingObjectSelection) other;
        return compareValues(uid, o.uid, true) && compareValues(description, o.description, true) && compareValues(authoringTime, o.authoringTime, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (uid == null || uid.isEmpty()) && (patient == null || patient.isEmpty()) && (title == null || title.isEmpty()) && (description == null || description.isEmpty()) && (author == null || author.isEmpty()) && (authoringTime == null || authoringTime.isEmpty()) && (study == null || study.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ImagingObjectSelection;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_AUTHORINGTIME = "authoring-time";

    public static final String SP_SELECTEDSTUDY = "selected-study";

    public static final String SP_AUTHOR = "author";

    public static final String SP_PATIENT = "patient";

    public static final String SP_TITLE = "title";
}
