package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.SupplyRequestEnum.SupplyRequestStatus;
import org.hl7.fhir.android.generated.dstu2.SupplyRequestEnum.SupplyRequestStatusEnumFactory;

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
 * A record of a request for a medication, substance or device used in the healthcare setting.
 */
public class SupplyRequest extends DomainResource {

    /**
     * A link to a resource representing the person whom the ordered item is for.
     */
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (A link to a resource representing the person whom the ordered item is for.)
     */
    protected Patient patientTarget;

    /**
     * The Practitioner , Organization or Patient who initiated this order for the supply.
     */
    protected Reference source;

    /**
     * The actual object that is the target of the reference (The Practitioner , Organization or Patient who initiated this order for the supply.)
     */
    protected Resource sourceTarget;

    /**
     * When the request was made.
     */
    protected DateTimeType date;

    /**
     * Unique identifier for this supply request.
     */
    protected Identifier identifier;

    /**
     * Status of the supply request.
     */
    protected Enumeration<SupplyRequestStatus> status;

    /**
     * Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.
     */
    protected CodeableConcept kind;

    /**
     * The item that is requested to be supplied.
     */
    protected Reference orderedItem;

    /**
     * The actual object that is the target of the reference (The item that is requested to be supplied.)
     */
    protected Resource orderedItemTarget;

    /**
     * Who is intended to fulfill the request.
     */
    protected List<Reference> supplier;

    /**
     * The actual objects that are the target of the reference (Who is intended to fulfill the request.)
     */
    protected List<Organization> supplierTarget;

    /**
     * Why the supply item was requested.
     */
    protected Type reason;

    /**
     * When the request should be fulfilled.
     */
    protected SupplyRequestWhenComponent when;

    private static final long serialVersionUID = 1649766198L;

    /*
   * Constructor
   */
    public SupplyRequest() {
        super();
    }

    /**
     * @return {@link #patient} (A link to a resource representing the person whom the ordered item is for.)
     */
    public Reference getPatient() {
        if (this.patient == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequest.patient");
            else if (Configuration.doAutoCreate())
                // cc
                this.patient = new Reference();
        return this.patient;
    }

    public boolean hasPatient() {
        return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (A link to a resource representing the person whom the ordered item is for.)
     */
    public SupplyRequest setPatient(Reference value) {
        this.patient = value;
        return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A link to a resource representing the person whom the ordered item is for.)
     */
    public Patient getPatientTarget() {
        if (this.patientTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequest.patient");
            else if (Configuration.doAutoCreate())
                // aa
                this.patientTarget = new Patient();
        return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A link to a resource representing the person whom the ordered item is for.)
     */
    public SupplyRequest setPatientTarget(Patient value) {
        this.patientTarget = value;
        return this;
    }

    /**
     * @return {@link #source} (The Practitioner , Organization or Patient who initiated this order for the supply.)
     */
    public Reference getSource() {
        if (this.source == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequest.source");
            else if (Configuration.doAutoCreate())
                // cc
                this.source = new Reference();
        return this.source;
    }

    public boolean hasSource() {
        return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (The Practitioner , Organization or Patient who initiated this order for the supply.)
     */
    public SupplyRequest setSource(Reference value) {
        this.source = value;
        return this;
    }

    /**
     * @return {@link #source} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The Practitioner , Organization or Patient who initiated this order for the supply.)
     */
    public Resource getSourceTarget() {
        return this.sourceTarget;
    }

    /**
     * @param value {@link #source} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The Practitioner , Organization or Patient who initiated this order for the supply.)
     */
    public SupplyRequest setSourceTarget(Resource value) {
        this.sourceTarget = value;
        return this;
    }

    /**
     * @return {@link #date} (When the request was made.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequest.date");
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
     * @param value {@link #date} (When the request was made.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public SupplyRequest setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return When the request was made.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value When the request was made.
     */
    public SupplyRequest setDate(Date value) {
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
     * @return {@link #identifier} (Unique identifier for this supply request.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequest.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Unique identifier for this supply request.)
     */
    public SupplyRequest setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #status} (Status of the supply request.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<SupplyRequestStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequest.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<SupplyRequestStatus>(new SupplyRequestStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Status of the supply request.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public SupplyRequest setStatusElement(Enumeration<SupplyRequestStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Status of the supply request.
     */
    public SupplyRequestStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Status of the supply request.
     */
    public SupplyRequest setStatus(SupplyRequestStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<SupplyRequestStatus>(new SupplyRequestStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #kind} (Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.)
     */
    public CodeableConcept getKind() {
        if (this.kind == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequest.kind");
            else if (Configuration.doAutoCreate())
                // cc
                this.kind = new CodeableConcept();
        return this.kind;
    }

    public boolean hasKind() {
        return this.kind != null && !this.kind.isEmpty();
    }

    /**
     * @param value {@link #kind} (Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.)
     */
    public SupplyRequest setKind(CodeableConcept value) {
        this.kind = value;
        return this;
    }

    /**
     * @return {@link #orderedItem} (The item that is requested to be supplied.)
     */
    public Reference getOrderedItem() {
        if (this.orderedItem == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequest.orderedItem");
            else if (Configuration.doAutoCreate())
                // cc
                this.orderedItem = new Reference();
        return this.orderedItem;
    }

    public boolean hasOrderedItem() {
        return this.orderedItem != null && !this.orderedItem.isEmpty();
    }

    /**
     * @param value {@link #orderedItem} (The item that is requested to be supplied.)
     */
    public SupplyRequest setOrderedItem(Reference value) {
        this.orderedItem = value;
        return this;
    }

    /**
     * @return {@link #orderedItem} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The item that is requested to be supplied.)
     */
    public Resource getOrderedItemTarget() {
        return this.orderedItemTarget;
    }

    /**
     * @param value {@link #orderedItem} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The item that is requested to be supplied.)
     */
    public SupplyRequest setOrderedItemTarget(Resource value) {
        this.orderedItemTarget = value;
        return this;
    }

    /**
     * @return {@link #supplier} (Who is intended to fulfill the request.)
     */
    public List<Reference> getSupplier() {
        if (this.supplier == null)
            this.supplier = new ArrayList<Reference>();
        return this.supplier;
    }

    public boolean hasSupplier() {
        if (this.supplier == null)
            return false;
        for (Reference item : this.supplier) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #supplier} (Who is intended to fulfill the request.)
     */
    // syntactic sugar
    public Reference addSupplier() {
        // 3
        Reference t = new Reference();
        if (this.supplier == null)
            this.supplier = new ArrayList<Reference>();
        this.supplier.add(t);
        return t;
    }

    // syntactic sugar
    public SupplyRequest addSupplier(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.supplier == null)
            this.supplier = new ArrayList<Reference>();
        this.supplier.add(t);
        return this;
    }

    /**
     * @return {@link #supplier} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Who is intended to fulfill the request.)
     */
    public List<Organization> getSupplierTarget() {
        if (this.supplierTarget == null)
            this.supplierTarget = new ArrayList<Organization>();
        return this.supplierTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #supplier} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Who is intended to fulfill the request.)
     */
    public Organization addSupplierTarget() {
        Organization r = new Organization();
        if (this.supplierTarget == null)
            this.supplierTarget = new ArrayList<Organization>();
        this.supplierTarget.add(r);
        return r;
    }

    /**
     * @return {@link #reason} (Why the supply item was requested.)
     */
    public Type getReason() {
        return this.reason;
    }

    /**
     * @return {@link #reason} (Why the supply item was requested.)
     */
    public CodeableConcept getReasonCodeableConcept() throws FHIRException {
        if (!(this.reason instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.reason.getClass().getName() + " was encountered");
        return (CodeableConcept) this.reason;
    }

    public boolean hasReasonCodeableConcept() {
        return this.reason instanceof CodeableConcept;
    }

    /**
     * @return {@link #reason} (Why the supply item was requested.)
     */
    public Reference getReasonReference() throws FHIRException {
        if (!(this.reason instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.reason.getClass().getName() + " was encountered");
        return (Reference) this.reason;
    }

    public boolean hasReasonReference() {
        return this.reason instanceof Reference;
    }

    public boolean hasReason() {
        return this.reason != null && !this.reason.isEmpty();
    }

    /**
     * @param value {@link #reason} (Why the supply item was requested.)
     */
    public SupplyRequest setReason(Type value) {
        this.reason = value;
        return this;
    }

    /**
     * @return {@link #when} (When the request should be fulfilled.)
     */
    public SupplyRequestWhenComponent getWhen() {
        if (this.when == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SupplyRequest.when");
            else if (Configuration.doAutoCreate())
                // cc
                this.when = new SupplyRequestWhenComponent();
        return this.when;
    }

    public boolean hasWhen() {
        return this.when != null && !this.when.isEmpty();
    }

    /**
     * @param value {@link #when} (When the request should be fulfilled.)
     */
    public SupplyRequest setWhen(SupplyRequestWhenComponent value) {
        this.when = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("patient", "Reference(Patient)", "A link to a resource representing the person whom the ordered item is for.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("source", "Reference(Practitioner|Organization|Patient)", "The Practitioner , Organization or Patient who initiated this order for the supply.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("date", "dateTime", "When the request was made.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("identifier", "Identifier", "Unique identifier for this supply request.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "Status of the supply request.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("kind", "CodeableConcept", "Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.", 0, java.lang.Integer.MAX_VALUE, kind));
        childrenList.add(new Property("orderedItem", "Reference(Medication|Substance|Device)", "The item that is requested to be supplied.", 0, java.lang.Integer.MAX_VALUE, orderedItem));
        childrenList.add(new Property("supplier", "Reference(Organization)", "Who is intended to fulfill the request.", 0, java.lang.Integer.MAX_VALUE, supplier));
        childrenList.add(new Property("reason[x]", "CodeableConcept|Reference(Any)", "Why the supply item was requested.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("when", "", "When the request should be fulfilled.", 0, java.lang.Integer.MAX_VALUE, when));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("patient"))
            // Reference
            this.patient = castToReference(value);
        else if (name.equals("source"))
            // Reference
            this.source = castToReference(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("status"))
            // Enumeration<SupplyRequestStatus>
            this.status = new SupplyRequestStatusEnumFactory().fromType(value);
        else if (name.equals("kind"))
            // CodeableConcept
            this.kind = castToCodeableConcept(value);
        else if (name.equals("orderedItem"))
            // Reference
            this.orderedItem = castToReference(value);
        else if (name.equals("supplier"))
            this.getSupplier().add(castToReference(value));
        else if (name.equals("reason[x]"))
            // Type
            this.reason = (Type) value;
        else if (name.equals("when"))
            // SupplyRequestWhenComponent
            this.when = (SupplyRequestWhenComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("patient")) {
            this.patient = new Reference();
            return this.patient;
        } else if (name.equals("source")) {
            this.source = new Reference();
            return this.source;
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type SupplyRequest.date");
        } else if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type SupplyRequest.status");
        } else if (name.equals("kind")) {
            this.kind = new CodeableConcept();
            return this.kind;
        } else if (name.equals("orderedItem")) {
            this.orderedItem = new Reference();
            return this.orderedItem;
        } else if (name.equals("supplier")) {
            return addSupplier();
        } else if (name.equals("reasonCodeableConcept")) {
            this.reason = new CodeableConcept();
            return this.reason;
        } else if (name.equals("reasonReference")) {
            this.reason = new Reference();
            return this.reason;
        } else if (name.equals("when")) {
            this.when = new SupplyRequestWhenComponent();
            return this.when;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "SupplyRequest";
    }

    public SupplyRequest copy() {
        SupplyRequest dst = new SupplyRequest();
        copyValues(dst);
        dst.patient = patient == null ? null : patient.copy();
        dst.source = source == null ? null : source.copy();
        dst.date = date == null ? null : date.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.status = status == null ? null : status.copy();
        dst.kind = kind == null ? null : kind.copy();
        dst.orderedItem = orderedItem == null ? null : orderedItem.copy();
        if (supplier != null) {
            dst.supplier = new ArrayList<Reference>();
            for (Reference i : supplier) dst.supplier.add(i.copy());
        }
        ;
        dst.reason = reason == null ? null : reason.copy();
        dst.when = when == null ? null : when.copy();
        return dst;
    }

    protected SupplyRequest typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SupplyRequest))
            return false;
        SupplyRequest o = (SupplyRequest) other;
        return compareDeep(patient, o.patient, true) && compareDeep(source, o.source, true) && compareDeep(date, o.date, true) && compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(kind, o.kind, true) && compareDeep(orderedItem, o.orderedItem, true) && compareDeep(supplier, o.supplier, true) && compareDeep(reason, o.reason, true) && compareDeep(when, o.when, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SupplyRequest))
            return false;
        SupplyRequest o = (SupplyRequest) other;
        return compareValues(date, o.date, true) && compareValues(status, o.status, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (patient == null || patient.isEmpty()) && (source == null || source.isEmpty()) && (date == null || date.isEmpty()) && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (kind == null || kind.isEmpty()) && (orderedItem == null || orderedItem.isEmpty()) && (supplier == null || supplier.isEmpty()) && (reason == null || reason.isEmpty()) && (when == null || when.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.SupplyRequest;
    }

    public static final String SP_DATE = "date";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_KIND = "kind";

    public static final String SP_PATIENT = "patient";

    public static final String SP_SUPPLIER = "supplier";

    public static final String SP_SOURCE = "source";

    public static final String SP_STATUS = "status";
}
