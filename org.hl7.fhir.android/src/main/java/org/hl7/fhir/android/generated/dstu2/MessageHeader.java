package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MessageHeaderEnum.ResponseTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.MessageHeaderEnum.ResponseType;

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
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 */
public class MessageHeader extends DomainResource {

    /**
     * The time that the message was sent.
     */
    protected InstantType timestamp;

    /**
     * Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value "http://hl7.org/fhir/message-events".
     */
    protected Coding event;

    /**
     * Information about the message that this message is a response to.  Only present if this message is a response.
     */
    protected MessageHeaderResponseComponent response;

    /**
     * The source application from which this message originated.
     */
    protected MessageSourceComponent source;

    /**
     * The destination application which the message is intended for.
     */
    protected List<MessageDestinationComponent> destination;

    /**
     * The person or device that performed the data entry leading to this message. Where there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.
     */
    protected Reference enterer;

    /**
     * The actual object that is the target of the reference (The person or device that performed the data entry leading to this message. Where there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.)
     */
    protected Practitioner entererTarget;

    /**
     * The logical author of the message - the person or device that decided the described event should happen. Where there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.
     */
    protected Reference author;

    /**
     * The actual object that is the target of the reference (The logical author of the message - the person or device that decided the described event should happen. Where there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.)
     */
    protected Practitioner authorTarget;

    /**
     * Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.
     */
    protected Reference receiver;

    /**
     * The actual object that is the target of the reference (Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.)
     */
    protected Resource receiverTarget;

    /**
     * The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.
     */
    protected Reference responsible;

    /**
     * The actual object that is the target of the reference (The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.)
     */
    protected Resource responsibleTarget;

    /**
     * Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message.
     */
    protected CodeableConcept reason;

    /**
     * The actual data of the message - a reference to the root/focus class of the event.
     */
    protected List<Reference> data;

    /**
     * The actual objects that are the target of the reference (The actual data of the message - a reference to the root/focus class of the event.)
     */
    protected List<Resource> dataTarget;

    private static final long serialVersionUID = 1429728517L;

    /*
   * Constructor
   */
    public MessageHeader() {
        super();
    }

    /*
   * Constructor
   */
    public MessageHeader(InstantType timestamp, Coding event, MessageSourceComponent source) {
        super();
        this.timestamp = timestamp;
        this.event = event;
        this.source = source;
    }

    /**
     * @return {@link #timestamp} (The time that the message was sent.). This is the underlying object with id, value and extensions. The accessor "getTimestamp" gives direct access to the value
     */
    public InstantType getTimestampElement() {
        if (this.timestamp == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.timestamp");
            else if (Configuration.doAutoCreate())
                // bb
                this.timestamp = new InstantType();
        return this.timestamp;
    }

    public boolean hasTimestampElement() {
        return this.timestamp != null && !this.timestamp.isEmpty();
    }

    public boolean hasTimestamp() {
        return this.timestamp != null && !this.timestamp.isEmpty();
    }

    /**
     * @param value {@link #timestamp} (The time that the message was sent.). This is the underlying object with id, value and extensions. The accessor "getTimestamp" gives direct access to the value
     */
    public MessageHeader setTimestampElement(InstantType value) {
        this.timestamp = value;
        return this;
    }

    /**
     * @return The time that the message was sent.
     */
    public Date getTimestamp() {
        return this.timestamp == null ? null : this.timestamp.getValue();
    }

    /**
     * @param value The time that the message was sent.
     */
    public MessageHeader setTimestamp(Date value) {
        if (this.timestamp == null)
            this.timestamp = new InstantType();
        this.timestamp.setValue(value);
        return this;
    }

    /**
     * @return {@link #event} (Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value "http://hl7.org/fhir/message-events".)
     */
    public Coding getEvent() {
        if (this.event == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.event");
            else if (Configuration.doAutoCreate())
                // cc
                this.event = new Coding();
        return this.event;
    }

    public boolean hasEvent() {
        return this.event != null && !this.event.isEmpty();
    }

    /**
     * @param value {@link #event} (Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value "http://hl7.org/fhir/message-events".)
     */
    public MessageHeader setEvent(Coding value) {
        this.event = value;
        return this;
    }

    /**
     * @return {@link #response} (Information about the message that this message is a response to.  Only present if this message is a response.)
     */
    public MessageHeaderResponseComponent getResponse() {
        if (this.response == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.response");
            else if (Configuration.doAutoCreate())
                // cc
                this.response = new MessageHeaderResponseComponent();
        return this.response;
    }

    public boolean hasResponse() {
        return this.response != null && !this.response.isEmpty();
    }

    /**
     * @param value {@link #response} (Information about the message that this message is a response to.  Only present if this message is a response.)
     */
    public MessageHeader setResponse(MessageHeaderResponseComponent value) {
        this.response = value;
        return this;
    }

    /**
     * @return {@link #source} (The source application from which this message originated.)
     */
    public MessageSourceComponent getSource() {
        if (this.source == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.source");
            else if (Configuration.doAutoCreate())
                // cc
                this.source = new MessageSourceComponent();
        return this.source;
    }

    public boolean hasSource() {
        return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (The source application from which this message originated.)
     */
    public MessageHeader setSource(MessageSourceComponent value) {
        this.source = value;
        return this;
    }

    /**
     * @return {@link #destination} (The destination application which the message is intended for.)
     */
    public List<MessageDestinationComponent> getDestination() {
        if (this.destination == null)
            this.destination = new ArrayList<MessageDestinationComponent>();
        return this.destination;
    }

    public boolean hasDestination() {
        if (this.destination == null)
            return false;
        for (MessageDestinationComponent item : this.destination) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #destination} (The destination application which the message is intended for.)
     */
    // syntactic sugar
    public MessageDestinationComponent addDestination() {
        // 3
        MessageDestinationComponent t = new MessageDestinationComponent();
        if (this.destination == null)
            this.destination = new ArrayList<MessageDestinationComponent>();
        this.destination.add(t);
        return t;
    }

    // syntactic sugar
    public MessageHeader addDestination(MessageDestinationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.destination == null)
            this.destination = new ArrayList<MessageDestinationComponent>();
        this.destination.add(t);
        return this;
    }

    /**
     * @return {@link #enterer} (The person or device that performed the data entry leading to this message. Where there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.)
     */
    public Reference getEnterer() {
        if (this.enterer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.enterer");
            else if (Configuration.doAutoCreate())
                // cc
                this.enterer = new Reference();
        return this.enterer;
    }

    public boolean hasEnterer() {
        return this.enterer != null && !this.enterer.isEmpty();
    }

    /**
     * @param value {@link #enterer} (The person or device that performed the data entry leading to this message. Where there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.)
     */
    public MessageHeader setEnterer(Reference value) {
        this.enterer = value;
        return this;
    }

    /**
     * @return {@link #enterer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person or device that performed the data entry leading to this message. Where there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.)
     */
    public Practitioner getEntererTarget() {
        if (this.entererTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.enterer");
            else if (Configuration.doAutoCreate())
                // aa
                this.entererTarget = new Practitioner();
        return this.entererTarget;
    }

    /**
     * @param value {@link #enterer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person or device that performed the data entry leading to this message. Where there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.)
     */
    public MessageHeader setEntererTarget(Practitioner value) {
        this.entererTarget = value;
        return this;
    }

    /**
     * @return {@link #author} (The logical author of the message - the person or device that decided the described event should happen. Where there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.)
     */
    public Reference getAuthor() {
        if (this.author == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.author");
            else if (Configuration.doAutoCreate())
                // cc
                this.author = new Reference();
        return this.author;
    }

    public boolean hasAuthor() {
        return this.author != null && !this.author.isEmpty();
    }

    /**
     * @param value {@link #author} (The logical author of the message - the person or device that decided the described event should happen. Where there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.)
     */
    public MessageHeader setAuthor(Reference value) {
        this.author = value;
        return this;
    }

    /**
     * @return {@link #author} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The logical author of the message - the person or device that decided the described event should happen. Where there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.)
     */
    public Practitioner getAuthorTarget() {
        if (this.authorTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.author");
            else if (Configuration.doAutoCreate())
                // aa
                this.authorTarget = new Practitioner();
        return this.authorTarget;
    }

    /**
     * @param value {@link #author} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The logical author of the message - the person or device that decided the described event should happen. Where there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.)
     */
    public MessageHeader setAuthorTarget(Practitioner value) {
        this.authorTarget = value;
        return this;
    }

    /**
     * @return {@link #receiver} (Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.)
     */
    public Reference getReceiver() {
        if (this.receiver == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.receiver");
            else if (Configuration.doAutoCreate())
                // cc
                this.receiver = new Reference();
        return this.receiver;
    }

    public boolean hasReceiver() {
        return this.receiver != null && !this.receiver.isEmpty();
    }

    /**
     * @param value {@link #receiver} (Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.)
     */
    public MessageHeader setReceiver(Reference value) {
        this.receiver = value;
        return this;
    }

    /**
     * @return {@link #receiver} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.)
     */
    public Resource getReceiverTarget() {
        return this.receiverTarget;
    }

    /**
     * @param value {@link #receiver} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.)
     */
    public MessageHeader setReceiverTarget(Resource value) {
        this.receiverTarget = value;
        return this;
    }

    /**
     * @return {@link #responsible} (The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.)
     */
    public Reference getResponsible() {
        if (this.responsible == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.responsible");
            else if (Configuration.doAutoCreate())
                // cc
                this.responsible = new Reference();
        return this.responsible;
    }

    public boolean hasResponsible() {
        return this.responsible != null && !this.responsible.isEmpty();
    }

    /**
     * @param value {@link #responsible} (The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.)
     */
    public MessageHeader setResponsible(Reference value) {
        this.responsible = value;
        return this;
    }

    /**
     * @return {@link #responsible} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.)
     */
    public Resource getResponsibleTarget() {
        return this.responsibleTarget;
    }

    /**
     * @param value {@link #responsible} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.)
     */
    public MessageHeader setResponsibleTarget(Resource value) {
        this.responsibleTarget = value;
        return this;
    }

    /**
     * @return {@link #reason} (Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message.)
     */
    public CodeableConcept getReason() {
        if (this.reason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageHeader.reason");
            else if (Configuration.doAutoCreate())
                // cc
                this.reason = new CodeableConcept();
        return this.reason;
    }

    public boolean hasReason() {
        return this.reason != null && !this.reason.isEmpty();
    }

    /**
     * @param value {@link #reason} (Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message.)
     */
    public MessageHeader setReason(CodeableConcept value) {
        this.reason = value;
        return this;
    }

    /**
     * @return {@link #data} (The actual data of the message - a reference to the root/focus class of the event.)
     */
    public List<Reference> getData() {
        if (this.data == null)
            this.data = new ArrayList<Reference>();
        return this.data;
    }

    public boolean hasData() {
        if (this.data == null)
            return false;
        for (Reference item : this.data) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #data} (The actual data of the message - a reference to the root/focus class of the event.)
     */
    // syntactic sugar
    public Reference addData() {
        // 3
        Reference t = new Reference();
        if (this.data == null)
            this.data = new ArrayList<Reference>();
        this.data.add(t);
        return t;
    }

    // syntactic sugar
    public MessageHeader addData(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.data == null)
            this.data = new ArrayList<Reference>();
        this.data.add(t);
        return this;
    }

    /**
     * @return {@link #data} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The actual data of the message - a reference to the root/focus class of the event.)
     */
    public List<Resource> getDataTarget() {
        if (this.dataTarget == null)
            this.dataTarget = new ArrayList<Resource>();
        return this.dataTarget;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("timestamp", "instant", "The time that the message was sent.", 0, java.lang.Integer.MAX_VALUE, timestamp));
        childrenList.add(new Property("event", "Coding", "Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value \"http://hl7.org/fhir/message-events\".", 0, java.lang.Integer.MAX_VALUE, event));
        childrenList.add(new Property("response", "", "Information about the message that this message is a response to.  Only present if this message is a response.", 0, java.lang.Integer.MAX_VALUE, response));
        childrenList.add(new Property("source", "", "The source application from which this message originated.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("destination", "", "The destination application which the message is intended for.", 0, java.lang.Integer.MAX_VALUE, destination));
        childrenList.add(new Property("enterer", "Reference(Practitioner)", "The person or device that performed the data entry leading to this message. Where there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.", 0, java.lang.Integer.MAX_VALUE, enterer));
        childrenList.add(new Property("author", "Reference(Practitioner)", "The logical author of the message - the person or device that decided the described event should happen. Where there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("receiver", "Reference(Practitioner|Organization)", "Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.", 0, java.lang.Integer.MAX_VALUE, receiver));
        childrenList.add(new Property("responsible", "Reference(Practitioner|Organization)", "The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.", 0, java.lang.Integer.MAX_VALUE, responsible));
        childrenList.add(new Property("reason", "CodeableConcept", "Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("data", "Reference(Any)", "The actual data of the message - a reference to the root/focus class of the event.", 0, java.lang.Integer.MAX_VALUE, data));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("timestamp"))
            // InstantType
            this.timestamp = castToInstant(value);
        else if (name.equals("event"))
            // Coding
            this.event = castToCoding(value);
        else if (name.equals("response"))
            // MessageHeaderResponseComponent
            this.response = (MessageHeaderResponseComponent) value;
        else if (name.equals("source"))
            // MessageSourceComponent
            this.source = (MessageSourceComponent) value;
        else if (name.equals("destination"))
            this.getDestination().add((MessageDestinationComponent) value);
        else if (name.equals("enterer"))
            // Reference
            this.enterer = castToReference(value);
        else if (name.equals("author"))
            // Reference
            this.author = castToReference(value);
        else if (name.equals("receiver"))
            // Reference
            this.receiver = castToReference(value);
        else if (name.equals("responsible"))
            // Reference
            this.responsible = castToReference(value);
        else if (name.equals("reason"))
            // CodeableConcept
            this.reason = castToCodeableConcept(value);
        else if (name.equals("data"))
            this.getData().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("timestamp")) {
            throw new FHIRException("Cannot call addChild on a primitive type MessageHeader.timestamp");
        } else if (name.equals("event")) {
            this.event = new Coding();
            return this.event;
        } else if (name.equals("response")) {
            this.response = new MessageHeaderResponseComponent();
            return this.response;
        } else if (name.equals("source")) {
            this.source = new MessageSourceComponent();
            return this.source;
        } else if (name.equals("destination")) {
            return addDestination();
        } else if (name.equals("enterer")) {
            this.enterer = new Reference();
            return this.enterer;
        } else if (name.equals("author")) {
            this.author = new Reference();
            return this.author;
        } else if (name.equals("receiver")) {
            this.receiver = new Reference();
            return this.receiver;
        } else if (name.equals("responsible")) {
            this.responsible = new Reference();
            return this.responsible;
        } else if (name.equals("reason")) {
            this.reason = new CodeableConcept();
            return this.reason;
        } else if (name.equals("data")) {
            return addData();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "MessageHeader";
    }

    public MessageHeader copy() {
        MessageHeader dst = new MessageHeader();
        copyValues(dst);
        dst.timestamp = timestamp == null ? null : timestamp.copy();
        dst.event = event == null ? null : event.copy();
        dst.response = response == null ? null : response.copy();
        dst.source = source == null ? null : source.copy();
        if (destination != null) {
            dst.destination = new ArrayList<MessageDestinationComponent>();
            for (MessageDestinationComponent i : destination) dst.destination.add(i.copy());
        }
        ;
        dst.enterer = enterer == null ? null : enterer.copy();
        dst.author = author == null ? null : author.copy();
        dst.receiver = receiver == null ? null : receiver.copy();
        dst.responsible = responsible == null ? null : responsible.copy();
        dst.reason = reason == null ? null : reason.copy();
        if (data != null) {
            dst.data = new ArrayList<Reference>();
            for (Reference i : data) dst.data.add(i.copy());
        }
        ;
        return dst;
    }

    protected MessageHeader typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MessageHeader))
            return false;
        MessageHeader o = (MessageHeader) other;
        return compareDeep(timestamp, o.timestamp, true) && compareDeep(event, o.event, true) && compareDeep(response, o.response, true) && compareDeep(source, o.source, true) && compareDeep(destination, o.destination, true) && compareDeep(enterer, o.enterer, true) && compareDeep(author, o.author, true) && compareDeep(receiver, o.receiver, true) && compareDeep(responsible, o.responsible, true) && compareDeep(reason, o.reason, true) && compareDeep(data, o.data, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MessageHeader))
            return false;
        MessageHeader o = (MessageHeader) other;
        return compareValues(timestamp, o.timestamp, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (timestamp == null || timestamp.isEmpty()) && (event == null || event.isEmpty()) && (response == null || response.isEmpty()) && (source == null || source.isEmpty()) && (destination == null || destination.isEmpty()) && (enterer == null || enterer.isEmpty()) && (author == null || author.isEmpty()) && (receiver == null || receiver.isEmpty()) && (responsible == null || responsible.isEmpty()) && (reason == null || reason.isEmpty()) && (data == null || data.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.MessageHeader;
    }

    public static final String SP_CODE = "code";

    public static final String SP_DATA = "data";

    public static final String SP_RECEIVER = "receiver";

    public static final String SP_AUTHOR = "author";

    public static final String SP_DESTINATION = "destination";

    public static final String SP_SOURCE = "source";

    public static final String SP_TARGET = "target";

    public static final String SP_DESTINATIONURI = "destination-uri";

    public static final String SP_SOURCEURI = "source-uri";

    public static final String SP_RESPONSIBLE = "responsible";

    public static final String SP_RESPONSEID = "response-id";

    public static final String SP_ENTERER = "enterer";

    public static final String SP_EVENT = "event";

    public static final String SP_TIMESTAMP = "timestamp";
}
