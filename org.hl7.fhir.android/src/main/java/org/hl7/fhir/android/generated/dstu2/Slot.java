package org.hl7.fhir.android.generated.dstu2;

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
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.SlotEnum.SlotStatus;
import org.hl7.fhir.android.generated.dstu2.SlotEnum.SlotStatusEnumFactory;

/**
 * A slot of time on a schedule that may be available for booking appointments.
 */
public class Slot extends DomainResource {

    /**
     * External Ids for this item.
     */
    protected List<Identifier> identifier;

    /**
     * The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.
     */
    protected CodeableConcept type;

    /**
     * The schedule resource that this slot defines an interval of status information.
     */
    protected Reference schedule;

    /**
     * The actual object that is the target of the reference (The schedule resource that this slot defines an interval of status information.)
     */
    protected Schedule scheduleTarget;

    /**
     * busy | free | busy-unavailable | busy-tentative.
     */
    protected Enumeration<SlotStatus> freeBusyType;

    /**
     * Date/Time that the slot is to begin.
     */
    protected InstantType start;

    /**
     * Date/Time that the slot is to conclude.
     */
    protected InstantType end;

    /**
     * This slot has already been overbooked, appointments are unlikely to be accepted for this time.
     */
    protected BooleanType overbooked;

    /**
     * Comments on the slot to describe any extended information. Such as custom constraints on the slot.
     */
    protected StringType comment;

    private static final long serialVersionUID = 1984269299L;

    /*
   * Constructor
   */
    public Slot() {
        super();
    }

    /*
   * Constructor
   */
    public Slot(Reference schedule, Enumeration<SlotStatus> freeBusyType, InstantType start, InstantType end) {
        super();
        this.schedule = schedule;
        this.freeBusyType = freeBusyType;
        this.start = start;
        this.end = end;
    }

    /**
     * @return {@link #identifier} (External Ids for this item.)
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
     * @return {@link #identifier} (External Ids for this item.)
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
    public Slot addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #type} (The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Slot.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.)
     */
    public Slot setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #schedule} (The schedule resource that this slot defines an interval of status information.)
     */
    public Reference getSchedule() {
        if (this.schedule == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Slot.schedule");
            else if (Configuration.doAutoCreate())
                // cc
                this.schedule = new Reference();
        return this.schedule;
    }

    public boolean hasSchedule() {
        return this.schedule != null && !this.schedule.isEmpty();
    }

    /**
     * @param value {@link #schedule} (The schedule resource that this slot defines an interval of status information.)
     */
    public Slot setSchedule(Reference value) {
        this.schedule = value;
        return this;
    }

    /**
     * @return {@link #schedule} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The schedule resource that this slot defines an interval of status information.)
     */
    public Schedule getScheduleTarget() {
        if (this.scheduleTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Slot.schedule");
            else if (Configuration.doAutoCreate())
                // aa
                this.scheduleTarget = new Schedule();
        return this.scheduleTarget;
    }

    /**
     * @param value {@link #schedule} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The schedule resource that this slot defines an interval of status information.)
     */
    public Slot setScheduleTarget(Schedule value) {
        this.scheduleTarget = value;
        return this;
    }

    /**
     * @return {@link #freeBusyType} (busy | free | busy-unavailable | busy-tentative.). This is the underlying object with id, value and extensions. The accessor "getFreeBusyType" gives direct access to the value
     */
    public Enumeration<SlotStatus> getFreeBusyTypeElement() {
        if (this.freeBusyType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Slot.freeBusyType");
            else if (Configuration.doAutoCreate())
                // bb
                this.freeBusyType = new Enumeration<SlotStatus>(new SlotStatusEnumFactory());
        return this.freeBusyType;
    }

    public boolean hasFreeBusyTypeElement() {
        return this.freeBusyType != null && !this.freeBusyType.isEmpty();
    }

    public boolean hasFreeBusyType() {
        return this.freeBusyType != null && !this.freeBusyType.isEmpty();
    }

    /**
     * @param value {@link #freeBusyType} (busy | free | busy-unavailable | busy-tentative.). This is the underlying object with id, value and extensions. The accessor "getFreeBusyType" gives direct access to the value
     */
    public Slot setFreeBusyTypeElement(Enumeration<SlotStatus> value) {
        this.freeBusyType = value;
        return this;
    }

    /**
     * @return busy | free | busy-unavailable | busy-tentative.
     */
    public SlotStatus getFreeBusyType() {
        return this.freeBusyType == null ? null : this.freeBusyType.getValue();
    }

    /**
     * @param value busy | free | busy-unavailable | busy-tentative.
     */
    public Slot setFreeBusyType(SlotStatus value) {
        if (this.freeBusyType == null)
            this.freeBusyType = new Enumeration<SlotStatus>(new SlotStatusEnumFactory());
        this.freeBusyType.setValue(value);
        return this;
    }

    /**
     * @return {@link #start} (Date/Time that the slot is to begin.). This is the underlying object with id, value and extensions. The accessor "getStart" gives direct access to the value
     */
    public InstantType getStartElement() {
        if (this.start == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Slot.start");
            else if (Configuration.doAutoCreate())
                // bb
                this.start = new InstantType();
        return this.start;
    }

    public boolean hasStartElement() {
        return this.start != null && !this.start.isEmpty();
    }

    public boolean hasStart() {
        return this.start != null && !this.start.isEmpty();
    }

    /**
     * @param value {@link #start} (Date/Time that the slot is to begin.). This is the underlying object with id, value and extensions. The accessor "getStart" gives direct access to the value
     */
    public Slot setStartElement(InstantType value) {
        this.start = value;
        return this;
    }

    /**
     * @return Date/Time that the slot is to begin.
     */
    public Date getStart() {
        return this.start == null ? null : this.start.getValue();
    }

    /**
     * @param value Date/Time that the slot is to begin.
     */
    public Slot setStart(Date value) {
        if (this.start == null)
            this.start = new InstantType();
        this.start.setValue(value);
        return this;
    }

    /**
     * @return {@link #end} (Date/Time that the slot is to conclude.). This is the underlying object with id, value and extensions. The accessor "getEnd" gives direct access to the value
     */
    public InstantType getEndElement() {
        if (this.end == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Slot.end");
            else if (Configuration.doAutoCreate())
                // bb
                this.end = new InstantType();
        return this.end;
    }

    public boolean hasEndElement() {
        return this.end != null && !this.end.isEmpty();
    }

    public boolean hasEnd() {
        return this.end != null && !this.end.isEmpty();
    }

    /**
     * @param value {@link #end} (Date/Time that the slot is to conclude.). This is the underlying object with id, value and extensions. The accessor "getEnd" gives direct access to the value
     */
    public Slot setEndElement(InstantType value) {
        this.end = value;
        return this;
    }

    /**
     * @return Date/Time that the slot is to conclude.
     */
    public Date getEnd() {
        return this.end == null ? null : this.end.getValue();
    }

    /**
     * @param value Date/Time that the slot is to conclude.
     */
    public Slot setEnd(Date value) {
        if (this.end == null)
            this.end = new InstantType();
        this.end.setValue(value);
        return this;
    }

    /**
     * @return {@link #overbooked} (This slot has already been overbooked, appointments are unlikely to be accepted for this time.). This is the underlying object with id, value and extensions. The accessor "getOverbooked" gives direct access to the value
     */
    public BooleanType getOverbookedElement() {
        if (this.overbooked == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Slot.overbooked");
            else if (Configuration.doAutoCreate())
                // bb
                this.overbooked = new BooleanType();
        return this.overbooked;
    }

    public boolean hasOverbookedElement() {
        return this.overbooked != null && !this.overbooked.isEmpty();
    }

    public boolean hasOverbooked() {
        return this.overbooked != null && !this.overbooked.isEmpty();
    }

    /**
     * @param value {@link #overbooked} (This slot has already been overbooked, appointments are unlikely to be accepted for this time.). This is the underlying object with id, value and extensions. The accessor "getOverbooked" gives direct access to the value
     */
    public Slot setOverbookedElement(BooleanType value) {
        this.overbooked = value;
        return this;
    }

    /**
     * @return This slot has already been overbooked, appointments are unlikely to be accepted for this time.
     */
    public boolean getOverbooked() {
        return this.overbooked == null || this.overbooked.isEmpty() ? false : this.overbooked.getValue();
    }

    /**
     * @param value This slot has already been overbooked, appointments are unlikely to be accepted for this time.
     */
    public Slot setOverbooked(boolean value) {
        if (this.overbooked == null)
            this.overbooked = new BooleanType();
        this.overbooked.setValue(value);
        return this;
    }

    /**
     * @return {@link #comment} (Comments on the slot to describe any extended information. Such as custom constraints on the slot.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
     */
    public StringType getCommentElement() {
        if (this.comment == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Slot.comment");
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
     * @param value {@link #comment} (Comments on the slot to describe any extended information. Such as custom constraints on the slot.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
     */
    public Slot setCommentElement(StringType value) {
        this.comment = value;
        return this;
    }

    /**
     * @return Comments on the slot to describe any extended information. Such as custom constraints on the slot.
     */
    public String getComment() {
        return this.comment == null ? null : this.comment.getValue();
    }

    /**
     * @param value Comments on the slot to describe any extended information. Such as custom constraints on the slot.
     */
    public Slot setComment(String value) {
        if (Utilities.noString(value))
            this.comment = null;
        else {
            if (this.comment == null)
                this.comment = new StringType();
            this.comment.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "External Ids for this item.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("type", "CodeableConcept", "The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("schedule", "Reference(Schedule)", "The schedule resource that this slot defines an interval of status information.", 0, java.lang.Integer.MAX_VALUE, schedule));
        childrenList.add(new Property("freeBusyType", "code", "busy | free | busy-unavailable | busy-tentative.", 0, java.lang.Integer.MAX_VALUE, freeBusyType));
        childrenList.add(new Property("start", "instant", "Date/Time that the slot is to begin.", 0, java.lang.Integer.MAX_VALUE, start));
        childrenList.add(new Property("end", "instant", "Date/Time that the slot is to conclude.", 0, java.lang.Integer.MAX_VALUE, end));
        childrenList.add(new Property("overbooked", "boolean", "This slot has already been overbooked, appointments are unlikely to be accepted for this time.", 0, java.lang.Integer.MAX_VALUE, overbooked));
        childrenList.add(new Property("comment", "string", "Comments on the slot to describe any extended information. Such as custom constraints on the slot.", 0, java.lang.Integer.MAX_VALUE, comment));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("schedule"))
            // Reference
            this.schedule = castToReference(value);
        else if (name.equals("freeBusyType"))
            // Enumeration<SlotStatus>
            this.freeBusyType = new SlotStatusEnumFactory().fromType(value);
        else if (name.equals("start"))
            // InstantType
            this.start = castToInstant(value);
        else if (name.equals("end"))
            // InstantType
            this.end = castToInstant(value);
        else if (name.equals("overbooked"))
            // BooleanType
            this.overbooked = castToBoolean(value);
        else if (name.equals("comment"))
            // StringType
            this.comment = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("schedule")) {
            this.schedule = new Reference();
            return this.schedule;
        } else if (name.equals("freeBusyType")) {
            throw new FHIRException("Cannot call addChild on a primitive type Slot.freeBusyType");
        } else if (name.equals("start")) {
            throw new FHIRException("Cannot call addChild on a primitive type Slot.start");
        } else if (name.equals("end")) {
            throw new FHIRException("Cannot call addChild on a primitive type Slot.end");
        } else if (name.equals("overbooked")) {
            throw new FHIRException("Cannot call addChild on a primitive type Slot.overbooked");
        } else if (name.equals("comment")) {
            throw new FHIRException("Cannot call addChild on a primitive type Slot.comment");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Slot";
    }

    public Slot copy() {
        Slot dst = new Slot();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.type = type == null ? null : type.copy();
        dst.schedule = schedule == null ? null : schedule.copy();
        dst.freeBusyType = freeBusyType == null ? null : freeBusyType.copy();
        dst.start = start == null ? null : start.copy();
        dst.end = end == null ? null : end.copy();
        dst.overbooked = overbooked == null ? null : overbooked.copy();
        dst.comment = comment == null ? null : comment.copy();
        return dst;
    }

    protected Slot typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Slot))
            return false;
        Slot o = (Slot) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true) && compareDeep(schedule, o.schedule, true) && compareDeep(freeBusyType, o.freeBusyType, true) && compareDeep(start, o.start, true) && compareDeep(end, o.end, true) && compareDeep(overbooked, o.overbooked, true) && compareDeep(comment, o.comment, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Slot))
            return false;
        Slot o = (Slot) other;
        return compareValues(freeBusyType, o.freeBusyType, true) && compareValues(start, o.start, true) && compareValues(end, o.end, true) && compareValues(overbooked, o.overbooked, true) && compareValues(comment, o.comment, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (type == null || type.isEmpty()) && (schedule == null || schedule.isEmpty()) && (freeBusyType == null || freeBusyType.isEmpty()) && (start == null || start.isEmpty()) && (end == null || end.isEmpty()) && (overbooked == null || overbooked.isEmpty()) && (comment == null || comment.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Slot;
    }

    public static final String SP_SCHEDULE = "schedule";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_START = "start";

    public static final String SP_SLOTTYPE = "slot-type";

    public static final String SP_FBTYPE = "fb-type";
}
