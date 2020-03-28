package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.AppointmentStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.AppointmentStatus;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipationStatus;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipantRequiredEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AppointmentEnum.ParticipantRequired;

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
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 */
public class Appointment extends DomainResource {

    /**
     * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    protected List<Identifier> identifier;

    /**
     * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
     */
    protected Enumeration<AppointmentStatus> status;

    /**
     * The type of appointment that is being booked (This may also be associated with participants for location, and/or a HealthcareService).
     */
    protected CodeableConcept type;

    /**
     * The reason that this appointment is being scheduled. This is more clinical than administrative.
     */
    protected CodeableConcept reason;

    /**
     * The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).
     */
    protected UnsignedIntType priority;

    /**
     * The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.
     */
    protected StringType description;

    /**
     * Date/Time that the appointment is to take place.
     */
    protected InstantType start;

    /**
     * Date/Time that the appointment is to conclude.
     */
    protected InstantType end;

    /**
     * Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request).
     */
    protected PositiveIntType minutesDuration;

    /**
     * The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot.
     */
    protected List<Reference> slot;

    /**
     * The actual objects that are the target of the reference (The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot.)
     */
    protected List<Slot> slotTarget;

    /**
     * Additional comments about the appointment.
     */
    protected StringType comment;

    /**
     * List of participants involved in the appointment.
     */
    protected List<AppointmentParticipantComponent> participant;

    private static final long serialVersionUID = -1403944125L;

    /*
   * Constructor
   */
    public Appointment() {
        super();
    }

    /*
   * Constructor
   */
    public Appointment(Enumeration<AppointmentStatus> status) {
        super();
        this.status = status;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
     * @return {@link #identifier} (This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
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
    public Appointment addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #status} (The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<AppointmentStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Appointment.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<AppointmentStatus>(new AppointmentStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Appointment setStatusElement(Enumeration<AppointmentStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
     */
    public AppointmentStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
     */
    public Appointment setStatus(AppointmentStatus value) {
        if (this.status == null)
            this.status = new Enumeration<AppointmentStatus>(new AppointmentStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #type} (The type of appointment that is being booked (This may also be associated with participants for location, and/or a HealthcareService).)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Appointment.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of appointment that is being booked (This may also be associated with participants for location, and/or a HealthcareService).)
     */
    public Appointment setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #reason} (The reason that this appointment is being scheduled. This is more clinical than administrative.)
     */
    public CodeableConcept getReason() {
        if (this.reason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Appointment.reason");
            else if (Configuration.doAutoCreate())
                // cc
                this.reason = new CodeableConcept();
        return this.reason;
    }

    public boolean hasReason() {
        return this.reason != null && !this.reason.isEmpty();
    }

    /**
     * @param value {@link #reason} (The reason that this appointment is being scheduled. This is more clinical than administrative.)
     */
    public Appointment setReason(CodeableConcept value) {
        this.reason = value;
        return this;
    }

    /**
     * @return {@link #priority} (The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).). This is the underlying object with id, value and extensions. The accessor "getPriority" gives direct access to the value
     */
    public UnsignedIntType getPriorityElement() {
        if (this.priority == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Appointment.priority");
            else if (Configuration.doAutoCreate())
                // bb
                this.priority = new UnsignedIntType();
        return this.priority;
    }

    public boolean hasPriorityElement() {
        return this.priority != null && !this.priority.isEmpty();
    }

    public boolean hasPriority() {
        return this.priority != null && !this.priority.isEmpty();
    }

    /**
     * @param value {@link #priority} (The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).). This is the underlying object with id, value and extensions. The accessor "getPriority" gives direct access to the value
     */
    public Appointment setPriorityElement(UnsignedIntType value) {
        this.priority = value;
        return this;
    }

    /**
     * @return The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).
     */
    public int getPriority() {
        return this.priority == null || this.priority.isEmpty() ? 0 : this.priority.getValue();
    }

    /**
     * @param value The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).
     */
    public Appointment setPriority(int value) {
        if (this.priority == null)
            this.priority = new UnsignedIntType();
        this.priority.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Appointment.description");
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
     * @param value {@link #description} (The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Appointment setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.
     */
    public Appointment setDescription(String value) {
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
     * @return {@link #start} (Date/Time that the appointment is to take place.). This is the underlying object with id, value and extensions. The accessor "getStart" gives direct access to the value
     */
    public InstantType getStartElement() {
        if (this.start == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Appointment.start");
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
     * @param value {@link #start} (Date/Time that the appointment is to take place.). This is the underlying object with id, value and extensions. The accessor "getStart" gives direct access to the value
     */
    public Appointment setStartElement(InstantType value) {
        this.start = value;
        return this;
    }

    /**
     * @return Date/Time that the appointment is to take place.
     */
    public Date getStart() {
        return this.start == null ? null : this.start.getValue();
    }

    /**
     * @param value Date/Time that the appointment is to take place.
     */
    public Appointment setStart(Date value) {
        if (value == null)
            this.start = null;
        else {
            if (this.start == null)
                this.start = new InstantType();
            this.start.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #end} (Date/Time that the appointment is to conclude.). This is the underlying object with id, value and extensions. The accessor "getEnd" gives direct access to the value
     */
    public InstantType getEndElement() {
        if (this.end == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Appointment.end");
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
     * @param value {@link #end} (Date/Time that the appointment is to conclude.). This is the underlying object with id, value and extensions. The accessor "getEnd" gives direct access to the value
     */
    public Appointment setEndElement(InstantType value) {
        this.end = value;
        return this;
    }

    /**
     * @return Date/Time that the appointment is to conclude.
     */
    public Date getEnd() {
        return this.end == null ? null : this.end.getValue();
    }

    /**
     * @param value Date/Time that the appointment is to conclude.
     */
    public Appointment setEnd(Date value) {
        if (value == null)
            this.end = null;
        else {
            if (this.end == null)
                this.end = new InstantType();
            this.end.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #minutesDuration} (Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request).). This is the underlying object with id, value and extensions. The accessor "getMinutesDuration" gives direct access to the value
     */
    public PositiveIntType getMinutesDurationElement() {
        if (this.minutesDuration == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Appointment.minutesDuration");
            else if (Configuration.doAutoCreate())
                // bb
                this.minutesDuration = new PositiveIntType();
        return this.minutesDuration;
    }

    public boolean hasMinutesDurationElement() {
        return this.minutesDuration != null && !this.minutesDuration.isEmpty();
    }

    public boolean hasMinutesDuration() {
        return this.minutesDuration != null && !this.minutesDuration.isEmpty();
    }

    /**
     * @param value {@link #minutesDuration} (Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request).). This is the underlying object with id, value and extensions. The accessor "getMinutesDuration" gives direct access to the value
     */
    public Appointment setMinutesDurationElement(PositiveIntType value) {
        this.minutesDuration = value;
        return this;
    }

    /**
     * @return Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request).
     */
    public int getMinutesDuration() {
        return this.minutesDuration == null || this.minutesDuration.isEmpty() ? 0 : this.minutesDuration.getValue();
    }

    /**
     * @param value Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request).
     */
    public Appointment setMinutesDuration(int value) {
        if (this.minutesDuration == null)
            this.minutesDuration = new PositiveIntType();
        this.minutesDuration.setValue(value);
        return this;
    }

    /**
     * @return {@link #slot} (The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot.)
     */
    public List<Reference> getSlot() {
        if (this.slot == null)
            this.slot = new ArrayList<Reference>();
        return this.slot;
    }

    public boolean hasSlot() {
        if (this.slot == null)
            return false;
        for (Reference item : this.slot) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #slot} (The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot.)
     */
    // syntactic sugar
    public Reference addSlot() {
        // 3
        Reference t = new Reference();
        if (this.slot == null)
            this.slot = new ArrayList<Reference>();
        this.slot.add(t);
        return t;
    }

    // syntactic sugar
    public Appointment addSlot(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.slot == null)
            this.slot = new ArrayList<Reference>();
        this.slot.add(t);
        return this;
    }

    /**
     * @return {@link #slot} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot.)
     */
    public List<Slot> getSlotTarget() {
        if (this.slotTarget == null)
            this.slotTarget = new ArrayList<Slot>();
        return this.slotTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #slot} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot.)
     */
    public Slot addSlotTarget() {
        Slot r = new Slot();
        if (this.slotTarget == null)
            this.slotTarget = new ArrayList<Slot>();
        this.slotTarget.add(r);
        return r;
    }

    /**
     * @return {@link #comment} (Additional comments about the appointment.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
     */
    public StringType getCommentElement() {
        if (this.comment == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Appointment.comment");
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
     * @param value {@link #comment} (Additional comments about the appointment.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
     */
    public Appointment setCommentElement(StringType value) {
        this.comment = value;
        return this;
    }

    /**
     * @return Additional comments about the appointment.
     */
    public String getComment() {
        return this.comment == null ? null : this.comment.getValue();
    }

    /**
     * @param value Additional comments about the appointment.
     */
    public Appointment setComment(String value) {
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
     * @return {@link #participant} (List of participants involved in the appointment.)
     */
    public List<AppointmentParticipantComponent> getParticipant() {
        if (this.participant == null)
            this.participant = new ArrayList<AppointmentParticipantComponent>();
        return this.participant;
    }

    public boolean hasParticipant() {
        if (this.participant == null)
            return false;
        for (AppointmentParticipantComponent item : this.participant) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #participant} (List of participants involved in the appointment.)
     */
    // syntactic sugar
    public AppointmentParticipantComponent addParticipant() {
        // 3
        AppointmentParticipantComponent t = new AppointmentParticipantComponent();
        if (this.participant == null)
            this.participant = new ArrayList<AppointmentParticipantComponent>();
        this.participant.add(t);
        return t;
    }

    // syntactic sugar
    public Appointment addParticipant(AppointmentParticipantComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.participant == null)
            this.participant = new ArrayList<AppointmentParticipantComponent>();
        this.participant.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("type", "CodeableConcept", "The type of appointment that is being booked (This may also be associated with participants for location, and/or a HealthcareService).", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("reason", "CodeableConcept", "The reason that this appointment is being scheduled. This is more clinical than administrative.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("priority", "unsignedInt", "The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).", 0, java.lang.Integer.MAX_VALUE, priority));
        childrenList.add(new Property("description", "string", "The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("start", "instant", "Date/Time that the appointment is to take place.", 0, java.lang.Integer.MAX_VALUE, start));
        childrenList.add(new Property("end", "instant", "Date/Time that the appointment is to conclude.", 0, java.lang.Integer.MAX_VALUE, end));
        childrenList.add(new Property("minutesDuration", "positiveInt", "Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request).", 0, java.lang.Integer.MAX_VALUE, minutesDuration));
        childrenList.add(new Property("slot", "Reference(Slot)", "The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot.", 0, java.lang.Integer.MAX_VALUE, slot));
        childrenList.add(new Property("comment", "string", "Additional comments about the appointment.", 0, java.lang.Integer.MAX_VALUE, comment));
        childrenList.add(new Property("participant", "", "List of participants involved in the appointment.", 0, java.lang.Integer.MAX_VALUE, participant));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
            // Enumeration<AppointmentStatus>
            this.status = new AppointmentStatusEnumFactory().fromType(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("reason"))
            // CodeableConcept
            this.reason = castToCodeableConcept(value);
        else if (name.equals("priority"))
            // UnsignedIntType
            this.priority = castToUnsignedInt(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("start"))
            // InstantType
            this.start = castToInstant(value);
        else if (name.equals("end"))
            // InstantType
            this.end = castToInstant(value);
        else if (name.equals("minutesDuration"))
            // PositiveIntType
            this.minutesDuration = castToPositiveInt(value);
        else if (name.equals("slot"))
            this.getSlot().add(castToReference(value));
        else if (name.equals("comment"))
            // StringType
            this.comment = castToString(value);
        else if (name.equals("participant"))
            this.getParticipant().add((AppointmentParticipantComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Appointment.status");
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("reason")) {
            this.reason = new CodeableConcept();
            return this.reason;
        } else if (name.equals("priority")) {
            throw new FHIRException("Cannot call addChild on a primitive type Appointment.priority");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type Appointment.description");
        } else if (name.equals("start")) {
            throw new FHIRException("Cannot call addChild on a primitive type Appointment.start");
        } else if (name.equals("end")) {
            throw new FHIRException("Cannot call addChild on a primitive type Appointment.end");
        } else if (name.equals("minutesDuration")) {
            throw new FHIRException("Cannot call addChild on a primitive type Appointment.minutesDuration");
        } else if (name.equals("slot")) {
            return addSlot();
        } else if (name.equals("comment")) {
            throw new FHIRException("Cannot call addChild on a primitive type Appointment.comment");
        } else if (name.equals("participant")) {
            return addParticipant();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Appointment";
    }

    public Appointment copy() {
        Appointment dst = new Appointment();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        dst.type = type == null ? null : type.copy();
        dst.reason = reason == null ? null : reason.copy();
        dst.priority = priority == null ? null : priority.copy();
        dst.description = description == null ? null : description.copy();
        dst.start = start == null ? null : start.copy();
        dst.end = end == null ? null : end.copy();
        dst.minutesDuration = minutesDuration == null ? null : minutesDuration.copy();
        if (slot != null) {
            dst.slot = new ArrayList<Reference>();
            for (Reference i : slot) dst.slot.add(i.copy());
        }
        ;
        dst.comment = comment == null ? null : comment.copy();
        if (participant != null) {
            dst.participant = new ArrayList<AppointmentParticipantComponent>();
            for (AppointmentParticipantComponent i : participant) dst.participant.add(i.copy());
        }
        ;
        return dst;
    }

    protected Appointment typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Appointment))
            return false;
        Appointment o = (Appointment) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(type, o.type, true) && compareDeep(reason, o.reason, true) && compareDeep(priority, o.priority, true) && compareDeep(description, o.description, true) && compareDeep(start, o.start, true) && compareDeep(end, o.end, true) && compareDeep(minutesDuration, o.minutesDuration, true) && compareDeep(slot, o.slot, true) && compareDeep(comment, o.comment, true) && compareDeep(participant, o.participant, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Appointment))
            return false;
        Appointment o = (Appointment) other;
        return compareValues(status, o.status, true) && compareValues(priority, o.priority, true) && compareValues(description, o.description, true) && compareValues(start, o.start, true) && compareValues(end, o.end, true) && compareValues(minutesDuration, o.minutesDuration, true) && compareValues(comment, o.comment, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (type == null || type.isEmpty()) && (reason == null || reason.isEmpty()) && (priority == null || priority.isEmpty()) && (description == null || description.isEmpty()) && (start == null || start.isEmpty()) && (end == null || end.isEmpty()) && (minutesDuration == null || minutesDuration.isEmpty()) && (slot == null || slot.isEmpty()) && (comment == null || comment.isEmpty()) && (participant == null || participant.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Appointment;
    }

    public static final String SP_DATE = "date";

    public static final String SP_ACTOR = "actor";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PRACTITIONER = "practitioner";

    public static final String SP_PARTSTATUS = "part-status";

    public static final String SP_PATIENT = "patient";

    public static final String SP_LOCATION = "location";

    public static final String SP_STATUS = "status";
}
