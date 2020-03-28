package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.SpecimenEnum.SpecimenStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.SpecimenEnum.SpecimenStatus;

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
 * A sample to be used for analysis.
 */
public class Specimen extends DomainResource {

    /**
     * Id for specimen.
     */
    protected List<Identifier> identifier;

    /**
     * The availability of the specimen.
     */
    protected Enumeration<SpecimenStatus> status;

    /**
     * The kind of material that forms the specimen.
     */
    protected CodeableConcept type;

    /**
     * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
     */
    protected List<Reference> parent;

    /**
     * The actual objects that are the target of the reference (Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.)
     */
    protected List<Specimen> parentTarget;

    /**
     * Where the specimen came from. This may be from the patient(s) or from the environment or a device.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Where the specimen came from. This may be from the patient(s) or from the environment or a device.)
     */
    protected Resource subjectTarget;

    /**
     * The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
     */
    protected Identifier accessionIdentifier;

    /**
     * Time when specimen was received for processing or testing.
     */
    protected DateTimeType receivedTime;

    /**
     * Details concerning the specimen collection.
     */
    protected SpecimenCollectionComponent collection;

    /**
     * Details concerning treatment and processing steps for the specimen.
     */
    protected List<SpecimenTreatmentComponent> treatment;

    /**
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     */
    protected List<SpecimenContainerComponent> container;

    private static final long serialVersionUID = 1025605602L;

    /*
   * Constructor
   */
    public Specimen() {
        super();
    }

    /*
   * Constructor
   */
    public Specimen(Reference subject) {
        super();
        this.subject = subject;
    }

    /**
     * @return {@link #identifier} (Id for specimen.)
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
     * @return {@link #identifier} (Id for specimen.)
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
    public Specimen addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #status} (The availability of the specimen.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<SpecimenStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Specimen.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<SpecimenStatus>(new SpecimenStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The availability of the specimen.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Specimen setStatusElement(Enumeration<SpecimenStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The availability of the specimen.
     */
    public SpecimenStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The availability of the specimen.
     */
    public Specimen setStatus(SpecimenStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<SpecimenStatus>(new SpecimenStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (The kind of material that forms the specimen.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Specimen.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The kind of material that forms the specimen.)
     */
    public Specimen setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #parent} (Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.)
     */
    public List<Reference> getParent() {
        if (this.parent == null)
            this.parent = new ArrayList<Reference>();
        return this.parent;
    }

    public boolean hasParent() {
        if (this.parent == null)
            return false;
        for (Reference item : this.parent) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #parent} (Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.)
     */
    // syntactic sugar
    public Reference addParent() {
        // 3
        Reference t = new Reference();
        if (this.parent == null)
            this.parent = new ArrayList<Reference>();
        this.parent.add(t);
        return t;
    }

    // syntactic sugar
    public Specimen addParent(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.parent == null)
            this.parent = new ArrayList<Reference>();
        this.parent.add(t);
        return this;
    }

    /**
     * @return {@link #parent} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.)
     */
    public List<Specimen> getParentTarget() {
        if (this.parentTarget == null)
            this.parentTarget = new ArrayList<Specimen>();
        return this.parentTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #parent} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.)
     */
    public Specimen addParentTarget() {
        Specimen r = new Specimen();
        if (this.parentTarget == null)
            this.parentTarget = new ArrayList<Specimen>();
        this.parentTarget.add(r);
        return r;
    }

    /**
     * @return {@link #subject} (Where the specimen came from. This may be from the patient(s) or from the environment or a device.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Specimen.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Where the specimen came from. This may be from the patient(s) or from the environment or a device.)
     */
    public Specimen setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Where the specimen came from. This may be from the patient(s) or from the environment or a device.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Where the specimen came from. This may be from the patient(s) or from the environment or a device.)
     */
    public Specimen setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #accessionIdentifier} (The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.)
     */
    public Identifier getAccessionIdentifier() {
        if (this.accessionIdentifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Specimen.accessionIdentifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.accessionIdentifier = new Identifier();
        return this.accessionIdentifier;
    }

    public boolean hasAccessionIdentifier() {
        return this.accessionIdentifier != null && !this.accessionIdentifier.isEmpty();
    }

    /**
     * @param value {@link #accessionIdentifier} (The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.)
     */
    public Specimen setAccessionIdentifier(Identifier value) {
        this.accessionIdentifier = value;
        return this;
    }

    /**
     * @return {@link #receivedTime} (Time when specimen was received for processing or testing.). This is the underlying object with id, value and extensions. The accessor "getReceivedTime" gives direct access to the value
     */
    public DateTimeType getReceivedTimeElement() {
        if (this.receivedTime == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Specimen.receivedTime");
            else if (Configuration.doAutoCreate())
                // bb
                this.receivedTime = new DateTimeType();
        return this.receivedTime;
    }

    public boolean hasReceivedTimeElement() {
        return this.receivedTime != null && !this.receivedTime.isEmpty();
    }

    public boolean hasReceivedTime() {
        return this.receivedTime != null && !this.receivedTime.isEmpty();
    }

    /**
     * @param value {@link #receivedTime} (Time when specimen was received for processing or testing.). This is the underlying object with id, value and extensions. The accessor "getReceivedTime" gives direct access to the value
     */
    public Specimen setReceivedTimeElement(DateTimeType value) {
        this.receivedTime = value;
        return this;
    }

    /**
     * @return Time when specimen was received for processing or testing.
     */
    public Date getReceivedTime() {
        return this.receivedTime == null ? null : this.receivedTime.getValue();
    }

    /**
     * @param value Time when specimen was received for processing or testing.
     */
    public Specimen setReceivedTime(Date value) {
        if (value == null)
            this.receivedTime = null;
        else {
            if (this.receivedTime == null)
                this.receivedTime = new DateTimeType();
            this.receivedTime.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #collection} (Details concerning the specimen collection.)
     */
    public SpecimenCollectionComponent getCollection() {
        if (this.collection == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Specimen.collection");
            else if (Configuration.doAutoCreate())
                // cc
                this.collection = new SpecimenCollectionComponent();
        return this.collection;
    }

    public boolean hasCollection() {
        return this.collection != null && !this.collection.isEmpty();
    }

    /**
     * @param value {@link #collection} (Details concerning the specimen collection.)
     */
    public Specimen setCollection(SpecimenCollectionComponent value) {
        this.collection = value;
        return this;
    }

    /**
     * @return {@link #treatment} (Details concerning treatment and processing steps for the specimen.)
     */
    public List<SpecimenTreatmentComponent> getTreatment() {
        if (this.treatment == null)
            this.treatment = new ArrayList<SpecimenTreatmentComponent>();
        return this.treatment;
    }

    public boolean hasTreatment() {
        if (this.treatment == null)
            return false;
        for (SpecimenTreatmentComponent item : this.treatment) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #treatment} (Details concerning treatment and processing steps for the specimen.)
     */
    // syntactic sugar
    public SpecimenTreatmentComponent addTreatment() {
        // 3
        SpecimenTreatmentComponent t = new SpecimenTreatmentComponent();
        if (this.treatment == null)
            this.treatment = new ArrayList<SpecimenTreatmentComponent>();
        this.treatment.add(t);
        return t;
    }

    // syntactic sugar
    public Specimen addTreatment(SpecimenTreatmentComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.treatment == null)
            this.treatment = new ArrayList<SpecimenTreatmentComponent>();
        this.treatment.add(t);
        return this;
    }

    /**
     * @return {@link #container} (The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.)
     */
    public List<SpecimenContainerComponent> getContainer() {
        if (this.container == null)
            this.container = new ArrayList<SpecimenContainerComponent>();
        return this.container;
    }

    public boolean hasContainer() {
        if (this.container == null)
            return false;
        for (SpecimenContainerComponent item : this.container) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #container} (The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.)
     */
    // syntactic sugar
    public SpecimenContainerComponent addContainer() {
        // 3
        SpecimenContainerComponent t = new SpecimenContainerComponent();
        if (this.container == null)
            this.container = new ArrayList<SpecimenContainerComponent>();
        this.container.add(t);
        return t;
    }

    // syntactic sugar
    public Specimen addContainer(SpecimenContainerComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.container == null)
            this.container = new ArrayList<SpecimenContainerComponent>();
        this.container.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Id for specimen.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "The availability of the specimen.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("type", "CodeableConcept", "The kind of material that forms the specimen.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("parent", "Reference(Specimen)", "Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.", 0, java.lang.Integer.MAX_VALUE, parent));
        childrenList.add(new Property("subject", "Reference(Patient|Group|Device|Substance)", "Where the specimen came from. This may be from the patient(s) or from the environment or a device.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("accessionIdentifier", "Identifier", "The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.", 0, java.lang.Integer.MAX_VALUE, accessionIdentifier));
        childrenList.add(new Property("receivedTime", "dateTime", "Time when specimen was received for processing or testing.", 0, java.lang.Integer.MAX_VALUE, receivedTime));
        childrenList.add(new Property("collection", "", "Details concerning the specimen collection.", 0, java.lang.Integer.MAX_VALUE, collection));
        childrenList.add(new Property("treatment", "", "Details concerning treatment and processing steps for the specimen.", 0, java.lang.Integer.MAX_VALUE, treatment));
        childrenList.add(new Property("container", "", "The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.", 0, java.lang.Integer.MAX_VALUE, container));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
            // Enumeration<SpecimenStatus>
            this.status = new SpecimenStatusEnumFactory().fromType(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("parent"))
            this.getParent().add(castToReference(value));
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("accessionIdentifier"))
            // Identifier
            this.accessionIdentifier = castToIdentifier(value);
        else if (name.equals("receivedTime"))
            // DateTimeType
            this.receivedTime = castToDateTime(value);
        else if (name.equals("collection"))
            // SpecimenCollectionComponent
            this.collection = (SpecimenCollectionComponent) value;
        else if (name.equals("treatment"))
            this.getTreatment().add((SpecimenTreatmentComponent) value);
        else if (name.equals("container"))
            this.getContainer().add((SpecimenContainerComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Specimen.status");
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("parent")) {
            return addParent();
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("accessionIdentifier")) {
            this.accessionIdentifier = new Identifier();
            return this.accessionIdentifier;
        } else if (name.equals("receivedTime")) {
            throw new FHIRException("Cannot call addChild on a primitive type Specimen.receivedTime");
        } else if (name.equals("collection")) {
            this.collection = new SpecimenCollectionComponent();
            return this.collection;
        } else if (name.equals("treatment")) {
            return addTreatment();
        } else if (name.equals("container")) {
            return addContainer();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Specimen";
    }

    public Specimen copy() {
        Specimen dst = new Specimen();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        dst.type = type == null ? null : type.copy();
        if (parent != null) {
            dst.parent = new ArrayList<Reference>();
            for (Reference i : parent) dst.parent.add(i.copy());
        }
        ;
        dst.subject = subject == null ? null : subject.copy();
        dst.accessionIdentifier = accessionIdentifier == null ? null : accessionIdentifier.copy();
        dst.receivedTime = receivedTime == null ? null : receivedTime.copy();
        dst.collection = collection == null ? null : collection.copy();
        if (treatment != null) {
            dst.treatment = new ArrayList<SpecimenTreatmentComponent>();
            for (SpecimenTreatmentComponent i : treatment) dst.treatment.add(i.copy());
        }
        ;
        if (container != null) {
            dst.container = new ArrayList<SpecimenContainerComponent>();
            for (SpecimenContainerComponent i : container) dst.container.add(i.copy());
        }
        ;
        return dst;
    }

    protected Specimen typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Specimen))
            return false;
        Specimen o = (Specimen) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(type, o.type, true) && compareDeep(parent, o.parent, true) && compareDeep(subject, o.subject, true) && compareDeep(accessionIdentifier, o.accessionIdentifier, true) && compareDeep(receivedTime, o.receivedTime, true) && compareDeep(collection, o.collection, true) && compareDeep(treatment, o.treatment, true) && compareDeep(container, o.container, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Specimen))
            return false;
        Specimen o = (Specimen) other;
        return compareValues(status, o.status, true) && compareValues(receivedTime, o.receivedTime, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (type == null || type.isEmpty()) && (parent == null || parent.isEmpty()) && (subject == null || subject.isEmpty()) && (accessionIdentifier == null || accessionIdentifier.isEmpty()) && (receivedTime == null || receivedTime.isEmpty()) && (collection == null || collection.isEmpty()) && (treatment == null || treatment.isEmpty()) && (container == null || container.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Specimen;
    }

    public static final String SP_CONTAINER = "container";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PARENT = "parent";

    public static final String SP_CONTAINERID = "container-id";

    public static final String SP_BODYSITE = "bodysite";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_PATIENT = "patient";

    public static final String SP_COLLECTED = "collected";

    public static final String SP_ACCESSION = "accession";

    public static final String SP_TYPE = "type";

    public static final String SP_COLLECTOR = "collector";
}
