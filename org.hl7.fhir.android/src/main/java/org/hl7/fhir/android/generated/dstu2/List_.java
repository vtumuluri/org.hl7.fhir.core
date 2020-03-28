package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.List_Enum.ListMode;
import org.hl7.fhir.android.generated.dstu2.List_Enum.ListModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.List_Enum.ListStatus;
import org.hl7.fhir.android.generated.dstu2.List_Enum.ListStatusEnumFactory;

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
 * A set of information summarized from a list of other resources.
 */
public class List_ extends DomainResource {

    /**
     * Identifier for the List assigned for business purposes outside the context of FHIR.
     */
    protected List<Identifier> identifier;

    /**
     * A label for the list assigned by the author.
     */
    protected StringType title;

    /**
     * This code defines the purpose of the list - why it was created.
     */
    protected CodeableConcept code;

    /**
     * The common subject (or patient) of the resources that are in the list, if there is one.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (The common subject (or patient) of the resources that are in the list, if there is one.)
     */
    protected Resource subjectTarget;

    /**
     * The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.
     */
    protected Reference source;

    /**
     * The actual object that is the target of the reference (The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.)
     */
    protected Resource sourceTarget;

    /**
     * The encounter that is the context in which this list was created.
     */
    protected Reference encounter;

    /**
     * The actual object that is the target of the reference (The encounter that is the context in which this list was created.)
     */
    protected Encounter encounterTarget;

    /**
     * Indicates the current state of this list.
     */
    protected Enumeration<ListStatus> status;

    /**
     * The date that the list was prepared.
     */
    protected DateTimeType date;

    /**
     * What order applies to the items in the list.
     */
    protected CodeableConcept orderedBy;

    /**
     * How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
     */
    protected Enumeration<ListMode> mode;

    /**
     * Comments that apply to the overall list.
     */
    protected StringType note;

    /**
     * Entries in this list.
     */
    protected List<ListEntryComponent> entry;

    /**
     * If the list is empty, why the list is empty.
     */
    protected CodeableConcept emptyReason;

    private static final long serialVersionUID = 1819128642L;

    /*
   * Constructor
   */
    public List_() {
        super();
    }

    /*
   * Constructor
   */
    public List_(Enumeration<ListStatus> status, Enumeration<ListMode> mode) {
        super();
        this.status = status;
        this.mode = mode;
    }

    /**
     * @return {@link #identifier} (Identifier for the List assigned for business purposes outside the context of FHIR.)
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
     * @return {@link #identifier} (Identifier for the List assigned for business purposes outside the context of FHIR.)
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
    public List_ addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #title} (A label for the list assigned by the author.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() {
        if (this.title == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.title");
            else if (Configuration.doAutoCreate())
                // bb
                this.title = new StringType();
        return this.title;
    }

    public boolean hasTitleElement() {
        return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() {
        return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (A label for the list assigned by the author.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public List_ setTitleElement(StringType value) {
        this.title = value;
        return this;
    }

    /**
     * @return A label for the list assigned by the author.
     */
    public String getTitle() {
        return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value A label for the list assigned by the author.
     */
    public List_ setTitle(String value) {
        if (Utilities.noString(value))
            this.title = null;
        else {
            if (this.title == null)
                this.title = new StringType();
            this.title.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #code} (This code defines the purpose of the list - why it was created.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (This code defines the purpose of the list - why it was created.)
     */
    public List_ setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #subject} (The common subject (or patient) of the resources that are in the list, if there is one.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The common subject (or patient) of the resources that are in the list, if there is one.)
     */
    public List_ setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The common subject (or patient) of the resources that are in the list, if there is one.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The common subject (or patient) of the resources that are in the list, if there is one.)
     */
    public List_ setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #source} (The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.)
     */
    public Reference getSource() {
        if (this.source == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.source");
            else if (Configuration.doAutoCreate())
                // cc
                this.source = new Reference();
        return this.source;
    }

    public boolean hasSource() {
        return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.)
     */
    public List_ setSource(Reference value) {
        this.source = value;
        return this;
    }

    /**
     * @return {@link #source} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.)
     */
    public Resource getSourceTarget() {
        return this.sourceTarget;
    }

    /**
     * @param value {@link #source} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.)
     */
    public List_ setSourceTarget(Resource value) {
        this.sourceTarget = value;
        return this;
    }

    /**
     * @return {@link #encounter} (The encounter that is the context in which this list was created.)
     */
    public Reference getEncounter() {
        if (this.encounter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.encounter");
            else if (Configuration.doAutoCreate())
                // cc
                this.encounter = new Reference();
        return this.encounter;
    }

    public boolean hasEncounter() {
        return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The encounter that is the context in which this list was created.)
     */
    public List_ setEncounter(Reference value) {
        this.encounter = value;
        return this;
    }

    /**
     * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The encounter that is the context in which this list was created.)
     */
    public Encounter getEncounterTarget() {
        if (this.encounterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.encounter");
            else if (Configuration.doAutoCreate())
                // aa
                this.encounterTarget = new Encounter();
        return this.encounterTarget;
    }

    /**
     * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The encounter that is the context in which this list was created.)
     */
    public List_ setEncounterTarget(Encounter value) {
        this.encounterTarget = value;
        return this;
    }

    /**
     * @return {@link #status} (Indicates the current state of this list.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ListStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<ListStatus>(new ListStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Indicates the current state of this list.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public List_ setStatusElement(Enumeration<ListStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return Indicates the current state of this list.
     */
    public ListStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Indicates the current state of this list.
     */
    public List_ setStatus(ListStatus value) {
        if (this.status == null)
            this.status = new Enumeration<ListStatus>(new ListStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #date} (The date that the list was prepared.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.date");
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
     * @param value {@link #date} (The date that the list was prepared.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public List_ setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date that the list was prepared.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date that the list was prepared.
     */
    public List_ setDate(Date value) {
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
     * @return {@link #orderedBy} (What order applies to the items in the list.)
     */
    public CodeableConcept getOrderedBy() {
        if (this.orderedBy == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.orderedBy");
            else if (Configuration.doAutoCreate())
                // cc
                this.orderedBy = new CodeableConcept();
        return this.orderedBy;
    }

    public boolean hasOrderedBy() {
        return this.orderedBy != null && !this.orderedBy.isEmpty();
    }

    /**
     * @param value {@link #orderedBy} (What order applies to the items in the list.)
     */
    public List_ setOrderedBy(CodeableConcept value) {
        this.orderedBy = value;
        return this;
    }

    /**
     * @return {@link #mode} (How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public Enumeration<ListMode> getModeElement() {
        if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.mode");
            else if (Configuration.doAutoCreate())
                // bb
                this.mode = new Enumeration<ListMode>(new ListModeEnumFactory());
        return this.mode;
    }

    public boolean hasModeElement() {
        return this.mode != null && !this.mode.isEmpty();
    }

    public boolean hasMode() {
        return this.mode != null && !this.mode.isEmpty();
    }

    /**
     * @param value {@link #mode} (How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public List_ setModeElement(Enumeration<ListMode> value) {
        this.mode = value;
        return this;
    }

    /**
     * @return How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
     */
    public ListMode getMode() {
        return this.mode == null ? null : this.mode.getValue();
    }

    /**
     * @param value How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
     */
    public List_ setMode(ListMode value) {
        if (this.mode == null)
            this.mode = new Enumeration<ListMode>(new ListModeEnumFactory());
        this.mode.setValue(value);
        return this;
    }

    /**
     * @return {@link #note} (Comments that apply to the overall list.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public StringType getNoteElement() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.note");
            else if (Configuration.doAutoCreate())
                // bb
                this.note = new StringType();
        return this.note;
    }

    public boolean hasNoteElement() {
        return this.note != null && !this.note.isEmpty();
    }

    public boolean hasNote() {
        return this.note != null && !this.note.isEmpty();
    }

    /**
     * @param value {@link #note} (Comments that apply to the overall list.). This is the underlying object with id, value and extensions. The accessor "getNote" gives direct access to the value
     */
    public List_ setNoteElement(StringType value) {
        this.note = value;
        return this;
    }

    /**
     * @return Comments that apply to the overall list.
     */
    public String getNote() {
        return this.note == null ? null : this.note.getValue();
    }

    /**
     * @param value Comments that apply to the overall list.
     */
    public List_ setNote(String value) {
        if (Utilities.noString(value))
            this.note = null;
        else {
            if (this.note == null)
                this.note = new StringType();
            this.note.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #entry} (Entries in this list.)
     */
    public List<ListEntryComponent> getEntry() {
        if (this.entry == null)
            this.entry = new ArrayList<ListEntryComponent>();
        return this.entry;
    }

    public boolean hasEntry() {
        if (this.entry == null)
            return false;
        for (ListEntryComponent item : this.entry) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #entry} (Entries in this list.)
     */
    // syntactic sugar
    public ListEntryComponent addEntry() {
        // 3
        ListEntryComponent t = new ListEntryComponent();
        if (this.entry == null)
            this.entry = new ArrayList<ListEntryComponent>();
        this.entry.add(t);
        return t;
    }

    // syntactic sugar
    public List_ addEntry(ListEntryComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.entry == null)
            this.entry = new ArrayList<ListEntryComponent>();
        this.entry.add(t);
        return this;
    }

    /**
     * @return {@link #emptyReason} (If the list is empty, why the list is empty.)
     */
    public CodeableConcept getEmptyReason() {
        if (this.emptyReason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create List_.emptyReason");
            else if (Configuration.doAutoCreate())
                // cc
                this.emptyReason = new CodeableConcept();
        return this.emptyReason;
    }

    public boolean hasEmptyReason() {
        return this.emptyReason != null && !this.emptyReason.isEmpty();
    }

    /**
     * @param value {@link #emptyReason} (If the list is empty, why the list is empty.)
     */
    public List_ setEmptyReason(CodeableConcept value) {
        this.emptyReason = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifier for the List assigned for business purposes outside the context of FHIR.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("title", "string", "A label for the list assigned by the author.", 0, java.lang.Integer.MAX_VALUE, title));
        childrenList.add(new Property("code", "CodeableConcept", "This code defines the purpose of the list - why it was created.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("subject", "Reference(Patient|Group|Device|Location)", "The common subject (or patient) of the resources that are in the list, if there is one.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("source", "Reference(Practitioner|Patient|Device)", "The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("encounter", "Reference(Encounter)", "The encounter that is the context in which this list was created.", 0, java.lang.Integer.MAX_VALUE, encounter));
        childrenList.add(new Property("status", "code", "Indicates the current state of this list.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("date", "dateTime", "The date that the list was prepared.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("orderedBy", "CodeableConcept", "What order applies to the items in the list.", 0, java.lang.Integer.MAX_VALUE, orderedBy));
        childrenList.add(new Property("mode", "code", "How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.", 0, java.lang.Integer.MAX_VALUE, mode));
        childrenList.add(new Property("note", "string", "Comments that apply to the overall list.", 0, java.lang.Integer.MAX_VALUE, note));
        childrenList.add(new Property("entry", "", "Entries in this list.", 0, java.lang.Integer.MAX_VALUE, entry));
        childrenList.add(new Property("emptyReason", "CodeableConcept", "If the list is empty, why the list is empty.", 0, java.lang.Integer.MAX_VALUE, emptyReason));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("title"))
            // StringType
            this.title = castToString(value);
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("source"))
            // Reference
            this.source = castToReference(value);
        else if (name.equals("encounter"))
            // Reference
            this.encounter = castToReference(value);
        else if (name.equals("status"))
            // Enumeration<ListStatus>
            this.status = new ListStatusEnumFactory().fromType(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("orderedBy"))
            // CodeableConcept
            this.orderedBy = castToCodeableConcept(value);
        else if (name.equals("mode"))
            // Enumeration<ListMode>
            this.mode = new ListModeEnumFactory().fromType(value);
        else if (name.equals("note"))
            // StringType
            this.note = castToString(value);
        else if (name.equals("entry"))
            this.getEntry().add((ListEntryComponent) value);
        else if (name.equals("emptyReason"))
            // CodeableConcept
            this.emptyReason = castToCodeableConcept(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("title")) {
            throw new FHIRException("Cannot call addChild on a primitive type List_.title");
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("source")) {
            this.source = new Reference();
            return this.source;
        } else if (name.equals("encounter")) {
            this.encounter = new Reference();
            return this.encounter;
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type List_.status");
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type List_.date");
        } else if (name.equals("orderedBy")) {
            this.orderedBy = new CodeableConcept();
            return this.orderedBy;
        } else if (name.equals("mode")) {
            throw new FHIRException("Cannot call addChild on a primitive type List_.mode");
        } else if (name.equals("note")) {
            throw new FHIRException("Cannot call addChild on a primitive type List_.note");
        } else if (name.equals("entry")) {
            return addEntry();
        } else if (name.equals("emptyReason")) {
            this.emptyReason = new CodeableConcept();
            return this.emptyReason;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "List";
    }

    public List_ copy() {
        List_ dst = new List_();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.title = title == null ? null : title.copy();
        dst.code = code == null ? null : code.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.source = source == null ? null : source.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.status = status == null ? null : status.copy();
        dst.date = date == null ? null : date.copy();
        dst.orderedBy = orderedBy == null ? null : orderedBy.copy();
        dst.mode = mode == null ? null : mode.copy();
        dst.note = note == null ? null : note.copy();
        if (entry != null) {
            dst.entry = new ArrayList<ListEntryComponent>();
            for (ListEntryComponent i : entry) dst.entry.add(i.copy());
        }
        ;
        dst.emptyReason = emptyReason == null ? null : emptyReason.copy();
        return dst;
    }

    protected List_ typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof List_))
            return false;
        List_ o = (List_) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(title, o.title, true) && compareDeep(code, o.code, true) && compareDeep(subject, o.subject, true) && compareDeep(source, o.source, true) && compareDeep(encounter, o.encounter, true) && compareDeep(status, o.status, true) && compareDeep(date, o.date, true) && compareDeep(orderedBy, o.orderedBy, true) && compareDeep(mode, o.mode, true) && compareDeep(note, o.note, true) && compareDeep(entry, o.entry, true) && compareDeep(emptyReason, o.emptyReason, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof List_))
            return false;
        List_ o = (List_) other;
        return compareValues(title, o.title, true) && compareValues(status, o.status, true) && compareValues(date, o.date, true) && compareValues(mode, o.mode, true) && compareValues(note, o.note, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (title == null || title.isEmpty()) && (code == null || code.isEmpty()) && (subject == null || subject.isEmpty()) && (source == null || source.isEmpty()) && (encounter == null || encounter.isEmpty()) && (status == null || status.isEmpty()) && (date == null || date.isEmpty()) && (orderedBy == null || orderedBy.isEmpty()) && (mode == null || mode.isEmpty()) && (note == null || note.isEmpty()) && (entry == null || entry.isEmpty()) && (emptyReason == null || emptyReason.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.List;
    }

    public static final String SP_DATE = "date";

    public static final String SP_ITEM = "item";

    public static final String SP_EMPTYREASON = "empty-reason";

    public static final String SP_CODE = "code";

    public static final String SP_NOTES = "notes";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_PATIENT = "patient";

    public static final String SP_SOURCE = "source";

    public static final String SP_ENCOUNTER = "encounter";

    public static final String SP_TITLE = "title";

    public static final String SP_STATUS = "status";
}
