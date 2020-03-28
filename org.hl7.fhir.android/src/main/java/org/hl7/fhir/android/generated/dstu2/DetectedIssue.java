package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DetectedIssueEnum.DetectedIssueSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DetectedIssueEnum.DetectedIssueSeverity;

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
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
 */
public class DetectedIssue extends DomainResource {

    /**
     * Indicates the patient whose record the detected issue is associated with.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (Indicates the patient whose record the detected issue is associated with.)
     */
    protected Patient patientTarget;

    /**
     * Identifies the general type of issue identified.
     */
    protected CodeableConcept category;

    /**
     * Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
     */
    protected Enumeration<DetectedIssueSeverity> severity;

    /**
     * Indicates the resource representing the current activity or proposed activity that is potentially problematic.
     */
    protected List<Reference> implicated;

    /**
     * The actual objects that are the target of the reference (Indicates the resource representing the current activity or proposed activity that is potentially problematic.)
     */
    protected List<Resource> implicatedTarget;

    /**
     * A textual explanation of the detected issue.
     */
    protected StringType detail;

    /**
     * The date or date-time when the detected issue was initially identified.
     */
    protected DateTimeType date;

    /**
     * Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.
     */
    protected Reference author;

    /**
     * The actual object that is the target of the reference (Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.)
     */
    protected Resource authorTarget;

    /**
     * Business identifier associated with the detected issue record.
     */
    protected Identifier identifier;

    /**
     * The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.
     */
    protected UriType reference;

    /**
     * Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
     */
    protected List<DetectedIssueMitigationComponent> mitigation;

    private static final long serialVersionUID = -403732234L;

    /*
   * Constructor
   */
    public DetectedIssue() {
        super();
    }

    /**
     * @return {@link #patient} (Indicates the patient whose record the detected issue is associated with.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssue.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (Indicates the patient whose record the detected issue is associated with.)
     */
    public DetectedIssue setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Indicates the patient whose record the detected issue is associated with.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssue.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Indicates the patient whose record the detected issue is associated with.)
     */
    public DetectedIssue setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #category} (Identifies the general type of issue identified.)
     */
    public CodeableConcept getCategory() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssue.category");
            else if (Configuration.doAutoCreate())
                // cc
                this.category = new CodeableConcept();
        return this.category;
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (Identifies the general type of issue identified.)
     */
    public DetectedIssue setCategory(CodeableConcept value) {
        this.category = value;
        return this;
    }

    /**
     * @return {@link #severity} (Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.). This is the underlying object with id, value and extensions. The accessor "getSeverity" gives direct access to the value
     */
    public Enumeration<DetectedIssueSeverity> getSeverityElement() {
        if (this.severity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssue.severity");
            else if (Configuration.doAutoCreate())
                // bb
                this.severity = new Enumeration<DetectedIssueSeverity>(new DetectedIssueSeverityEnumFactory());
        return this.severity;
    }

    public boolean hasSeverityElement() {
        return this.severity != null && !this.severity.isEmpty();
    }

    public boolean hasSeverity() {
        return this.severity != null && !this.severity.isEmpty();
    }

    /**
     * @param value {@link #severity} (Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.). This is the underlying object with id, value and extensions. The accessor "getSeverity" gives direct access to the value
     */
    public DetectedIssue setSeverityElement(Enumeration<DetectedIssueSeverity> value) {
        this.severity = value;
        return this;
    }

    /**
     * @return Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
     */
    public DetectedIssueSeverity getSeverity() {
        return this.severity == null ? null : this.severity.getValue();
    }

    /**
     * @param value Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
     */
    public DetectedIssue setSeverity(DetectedIssueSeverity value) {
        if (value == null)
            this.severity = null;
        else {
            if (this.severity == null)
                this.severity = new Enumeration<DetectedIssueSeverity>(new DetectedIssueSeverityEnumFactory());
            this.severity.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #implicated} (Indicates the resource representing the current activity or proposed activity that is potentially problematic.)
     */
    public List<Reference> getImplicated() {
        if (this.implicated == null)
            this.implicated = new ArrayList<Reference>();
        return this.implicated;
    }

    public boolean hasImplicated() {
        if (this.implicated == null)
            return false;
        for (Reference item : this.implicated) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #implicated} (Indicates the resource representing the current activity or proposed activity that is potentially problematic.)
     */
    // syntactic sugar
    public Reference addImplicated() {
        // 3
        Reference t = new Reference();
        if (this.implicated == null)
            this.implicated = new ArrayList<Reference>();
        this.implicated.add(t);
        return t;
    }

    // syntactic sugar
    public DetectedIssue addImplicated(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.implicated == null)
            this.implicated = new ArrayList<Reference>();
        this.implicated.add(t);
        return this;
    }

    /**
     * @return {@link #implicated} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Indicates the resource representing the current activity or proposed activity that is potentially problematic.)
     */
    public List<Resource> getImplicatedTarget() {
        if (this.implicatedTarget == null)
            this.implicatedTarget = new ArrayList<Resource>();
        return this.implicatedTarget;
    }

    /**
     * @return {@link #detail} (A textual explanation of the detected issue.). This is the underlying object with id, value and extensions. The accessor "getDetail" gives direct access to the value
     */
    public StringType getDetailElement() {
        if (this.detail == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssue.detail");
            else if (Configuration.doAutoCreate())
                // bb
                this.detail = new StringType();
        return this.detail;
    }

    public boolean hasDetailElement() {
        return this.detail != null && !this.detail.isEmpty();
    }

    public boolean hasDetail() {
        return this.detail != null && !this.detail.isEmpty();
    }

    /**
     * @param value {@link #detail} (A textual explanation of the detected issue.). This is the underlying object with id, value and extensions. The accessor "getDetail" gives direct access to the value
     */
    public DetectedIssue setDetailElement(StringType value) {
        this.detail = value;
        return this;
    }

    /**
     * @return A textual explanation of the detected issue.
     */
    public String getDetail() {
        return this.detail == null ? null : this.detail.getValue();
    }

    /**
     * @param value A textual explanation of the detected issue.
     */
    public DetectedIssue setDetail(String value) {
        if (Utilities.noString(value))
            this.detail = null;
        else {
            if (this.detail == null)
                this.detail = new StringType();
            this.detail.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #date} (The date or date-time when the detected issue was initially identified.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssue.date");
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
     * @param value {@link #date} (The date or date-time when the detected issue was initially identified.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DetectedIssue setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date or date-time when the detected issue was initially identified.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date or date-time when the detected issue was initially identified.
     */
    public DetectedIssue setDate(Date value) {
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
     * @return {@link #author} (Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.)
     */
    public Reference getAuthor() {
        if (this.author == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssue.author");
            else if (Configuration.doAutoCreate())
                // cc
                this.author = new Reference();
        return this.author;
    }

    public boolean hasAuthor() {
        return this.author != null && !this.author.isEmpty();
    }

    /**
     * @param value {@link #author} (Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.)
     */
    public DetectedIssue setAuthor(Reference value) {
        this.author = value;
        return this;
    }

    /**
     * @return {@link #author} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.)
     */
    public Resource getAuthorTarget() {
        return this.authorTarget;
    }

    /**
     * @param value {@link #author} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.)
     */
    public DetectedIssue setAuthorTarget(Resource value) {
        this.authorTarget = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Business identifier associated with the detected issue record.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssue.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Business identifier associated with the detected issue record.)
     */
    public DetectedIssue setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #reference} (The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.). This is the underlying object with id, value and extensions. The accessor "getReference" gives direct access to the value
     */
    public UriType getReferenceElement() {
        if (this.reference == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssue.reference");
            else if (Configuration.doAutoCreate())
                // bb
                this.reference = new UriType();
        return this.reference;
    }

    public boolean hasReferenceElement() {
        return this.reference != null && !this.reference.isEmpty();
    }

    public boolean hasReference() {
        return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.). This is the underlying object with id, value and extensions. The accessor "getReference" gives direct access to the value
     */
    public DetectedIssue setReferenceElement(UriType value) {
        this.reference = value;
        return this;
    }

    /**
     * @return The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.
     */
    public String getReference() {
        return this.reference == null ? null : this.reference.getValue();
    }

    /**
     * @param value The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.
     */
    public DetectedIssue setReference(String value) {
        if (Utilities.noString(value))
            this.reference = null;
        else {
            if (this.reference == null)
                this.reference = new UriType();
            this.reference.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #mitigation} (Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.)
     */
    public List<DetectedIssueMitigationComponent> getMitigation() {
        if (this.mitigation == null)
            this.mitigation = new ArrayList<DetectedIssueMitigationComponent>();
        return this.mitigation;
    }

    public boolean hasMitigation() {
        if (this.mitigation == null)
            return false;
        for (DetectedIssueMitigationComponent item : this.mitigation) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #mitigation} (Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.)
     */
    // syntactic sugar
    public DetectedIssueMitigationComponent addMitigation() {
        // 3
        DetectedIssueMitigationComponent t = new DetectedIssueMitigationComponent();
        if (this.mitigation == null)
            this.mitigation = new ArrayList<DetectedIssueMitigationComponent>();
        this.mitigation.add(t);
        return t;
    }

    // syntactic sugar
    public DetectedIssue addMitigation(DetectedIssueMitigationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.mitigation == null)
            this.mitigation = new ArrayList<DetectedIssueMitigationComponent>();
        this.mitigation.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("patient", "Reference(Patient)", "Indicates the patient whose record the detected issue is associated with.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("category", "CodeableConcept", "Identifies the general type of issue identified.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("severity", "code", "Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.", 0, java.lang.Integer.MAX_VALUE, severity));
        childrenList.add(new Property("implicated", "Reference(Any)", "Indicates the resource representing the current activity or proposed activity that is potentially problematic.", 0, java.lang.Integer.MAX_VALUE, implicated));
        childrenList.add(new Property("detail", "string", "A textual explanation of the detected issue.", 0, java.lang.Integer.MAX_VALUE, detail));
        childrenList.add(new Property("date", "dateTime", "The date or date-time when the detected issue was initially identified.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("author", "Reference(Practitioner|Device)", "Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("identifier", "Identifier", "Business identifier associated with the detected issue record.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("reference", "uri", "The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.", 0, java.lang.Integer.MAX_VALUE, reference));
        childrenList.add(new Property("mitigation", "", "Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.", 0, java.lang.Integer.MAX_VALUE, mitigation));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("category"))
            // CodeableConcept
            this.category = castToCodeableConcept(value);
        else if (name.equals("severity"))
            // Enumeration<DetectedIssueSeverity>
            this.severity = new DetectedIssueSeverityEnumFactory().fromType(value);
        else if (name.equals("implicated"))
            this.getImplicated().add(castToReference(value));
        else if (name.equals("detail"))
            // StringType
            this.detail = castToString(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("author"))
            // Reference
            this.author = castToReference(value);
        else if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("reference"))
            // UriType
            this.reference = castToUri(value);
        else if (name.equals("mitigation"))
            this.getMitigation().add((DetectedIssueMitigationComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("category")) {
            this.category = new CodeableConcept();
            return this.category;
        } else if (name.equals("severity")) {
            throw new FHIRException("Cannot call addChild on a primitive type DetectedIssue.severity");
        } else if (name.equals("implicated")) {
            return addImplicated();
        } else if (name.equals("detail")) {
            throw new FHIRException("Cannot call addChild on a primitive type DetectedIssue.detail");
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type DetectedIssue.date");
        } else if (name.equals("author")) {
            this.author = new Reference();
            return this.author;
        } else if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("reference")) {
            throw new FHIRException("Cannot call addChild on a primitive type DetectedIssue.reference");
        } else if (name.equals("mitigation")) {
            return addMitigation();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "DetectedIssue";
    }

    public DetectedIssue copy() {
        DetectedIssue dst = new DetectedIssue();
        copyValues(dst);
        dst.patient = patient == null ? null : patient.copy();
        dst.category = category == null ? null : category.copy();
        dst.severity = severity == null ? null : severity.copy();
        if (implicated != null) {
            dst.implicated = new ArrayList<Reference>();
            for (Reference i : implicated) dst.implicated.add(i.copy());
        }
        ;
        dst.detail = detail == null ? null : detail.copy();
        dst.date = date == null ? null : date.copy();
        dst.author = author == null ? null : author.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.reference = reference == null ? null : reference.copy();
        if (mitigation != null) {
            dst.mitigation = new ArrayList<DetectedIssueMitigationComponent>();
            for (DetectedIssueMitigationComponent i : mitigation) dst.mitigation.add(i.copy());
        }
        ;
        return dst;
    }

    protected DetectedIssue typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DetectedIssue))
            return false;
        DetectedIssue o = (DetectedIssue) other;
        return compareDeep(patient, o.patient, true) && compareDeep(category, o.category, true) && compareDeep(severity, o.severity, true) && compareDeep(implicated, o.implicated, true) && compareDeep(detail, o.detail, true) && compareDeep(date, o.date, true) && compareDeep(author, o.author, true) && compareDeep(identifier, o.identifier, true) && compareDeep(reference, o.reference, true) && compareDeep(mitigation, o.mitigation, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DetectedIssue))
            return false;
        DetectedIssue o = (DetectedIssue) other;
        return compareValues(severity, o.severity, true) && compareValues(detail, o.detail, true) && compareValues(date, o.date, true) && compareValues(reference, o.reference, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (patient == null || patient.isEmpty()) && (category == null || category.isEmpty()) && (severity == null || severity.isEmpty()) && (implicated == null || implicated.isEmpty()) && (detail == null || detail.isEmpty()) && (date == null || date.isEmpty()) && (author == null || author.isEmpty()) && (identifier == null || identifier.isEmpty()) && (reference == null || reference.isEmpty()) && (mitigation == null || mitigation.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.DetectedIssue;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PATIENT = "patient";

    public static final String SP_AUTHOR = "author";

    public static final String SP_IMPLICATED = "implicated";

    public static final String SP_CATEGORY = "category";
}
