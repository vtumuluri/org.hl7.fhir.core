package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.SubscriptionEnum.SubscriptionStatus;
import org.hl7.fhir.android.generated.dstu2.SubscriptionEnum.SubscriptionStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.SubscriptionEnum.SubscriptionChannelType;
import org.hl7.fhir.android.generated.dstu2.SubscriptionEnum.SubscriptionChannelTypeEnumFactory;

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
 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
 */
public class Subscription extends DomainResource {

    /**
     * The rules that the server should use to determine when to generate notifications for this subscription.
     */
    protected StringType criteria;

    /**
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
     */
    protected List<ContactPoint> contact;

    /**
     * A description of why this subscription is defined.
     */
    protected StringType reason;

    /**
     * The status of the subscription, which marks the server state for managing the subscription.
     */
    protected Enumeration<SubscriptionStatus> status;

    /**
     * A record of the last error that occurred when the server processed a notification.
     */
    protected StringType error;

    /**
     * Details where to send notifications when resources are received that meet the criteria.
     */
    protected SubscriptionChannelComponent channel;

    /**
     * The time for the server to turn the subscription off.
     */
    protected InstantType end;

    /**
     * A tag to add to any resource that matches the criteria, after the subscription is processed.
     */
    protected List<Coding> tag;

    private static final long serialVersionUID = -1390870804L;

    /*
   * Constructor
   */
    public Subscription() {
        super();
    }

    /*
   * Constructor
   */
    public Subscription(StringType criteria, StringType reason, Enumeration<SubscriptionStatus> status, SubscriptionChannelComponent channel) {
        super();
        this.criteria = criteria;
        this.reason = reason;
        this.status = status;
        this.channel = channel;
    }

    /**
     * @return {@link #criteria} (The rules that the server should use to determine when to generate notifications for this subscription.). This is the underlying object with id, value and extensions. The accessor "getCriteria" gives direct access to the value
     */
    public StringType getCriteriaElement() {
        if (this.criteria == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Subscription.criteria");
            else if (Configuration.doAutoCreate())
                // bb
                this.criteria = new StringType();
        return this.criteria;
    }

    public boolean hasCriteriaElement() {
        return this.criteria != null && !this.criteria.isEmpty();
    }

    public boolean hasCriteria() {
        return this.criteria != null && !this.criteria.isEmpty();
    }

    /**
     * @param value {@link #criteria} (The rules that the server should use to determine when to generate notifications for this subscription.). This is the underlying object with id, value and extensions. The accessor "getCriteria" gives direct access to the value
     */
    public Subscription setCriteriaElement(StringType value) {
        this.criteria = value;
        return this;
    }

    /**
     * @return The rules that the server should use to determine when to generate notifications for this subscription.
     */
    public String getCriteria() {
        return this.criteria == null ? null : this.criteria.getValue();
    }

    /**
     * @param value The rules that the server should use to determine when to generate notifications for this subscription.
     */
    public Subscription setCriteria(String value) {
        if (this.criteria == null)
            this.criteria = new StringType();
        this.criteria.setValue(value);
        return this;
    }

    /**
     * @return {@link #contact} (Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.)
     */
    public List<ContactPoint> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<ContactPoint>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (ContactPoint item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.)
     */
    // syntactic sugar
    public ContactPoint addContact() {
        // 3
        ContactPoint t = new ContactPoint();
        if (this.contact == null)
            this.contact = new ArrayList<ContactPoint>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public Subscription addContact(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<ContactPoint>();
        this.contact.add(t);
        return this;
    }

    /**
     * @return {@link #reason} (A description of why this subscription is defined.). This is the underlying object with id, value and extensions. The accessor "getReason" gives direct access to the value
     */
    public StringType getReasonElement() {
        if (this.reason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Subscription.reason");
            else if (Configuration.doAutoCreate())
                // bb
                this.reason = new StringType();
        return this.reason;
    }

    public boolean hasReasonElement() {
        return this.reason != null && !this.reason.isEmpty();
    }

    public boolean hasReason() {
        return this.reason != null && !this.reason.isEmpty();
    }

    /**
     * @param value {@link #reason} (A description of why this subscription is defined.). This is the underlying object with id, value and extensions. The accessor "getReason" gives direct access to the value
     */
    public Subscription setReasonElement(StringType value) {
        this.reason = value;
        return this;
    }

    /**
     * @return A description of why this subscription is defined.
     */
    public String getReason() {
        return this.reason == null ? null : this.reason.getValue();
    }

    /**
     * @param value A description of why this subscription is defined.
     */
    public Subscription setReason(String value) {
        if (this.reason == null)
            this.reason = new StringType();
        this.reason.setValue(value);
        return this;
    }

    /**
     * @return {@link #status} (The status of the subscription, which marks the server state for managing the subscription.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<SubscriptionStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Subscription.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<SubscriptionStatus>(new SubscriptionStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the subscription, which marks the server state for managing the subscription.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Subscription setStatusElement(Enumeration<SubscriptionStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the subscription, which marks the server state for managing the subscription.
     */
    public SubscriptionStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the subscription, which marks the server state for managing the subscription.
     */
    public Subscription setStatus(SubscriptionStatus value) {
        if (this.status == null)
            this.status = new Enumeration<SubscriptionStatus>(new SubscriptionStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #error} (A record of the last error that occurred when the server processed a notification.). This is the underlying object with id, value and extensions. The accessor "getError" gives direct access to the value
     */
    public StringType getErrorElement() {
        if (this.error == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Subscription.error");
            else if (Configuration.doAutoCreate())
                // bb
                this.error = new StringType();
        return this.error;
    }

    public boolean hasErrorElement() {
        return this.error != null && !this.error.isEmpty();
    }

    public boolean hasError() {
        return this.error != null && !this.error.isEmpty();
    }

    /**
     * @param value {@link #error} (A record of the last error that occurred when the server processed a notification.). This is the underlying object with id, value and extensions. The accessor "getError" gives direct access to the value
     */
    public Subscription setErrorElement(StringType value) {
        this.error = value;
        return this;
    }

    /**
     * @return A record of the last error that occurred when the server processed a notification.
     */
    public String getError() {
        return this.error == null ? null : this.error.getValue();
    }

    /**
     * @param value A record of the last error that occurred when the server processed a notification.
     */
    public Subscription setError(String value) {
        if (Utilities.noString(value))
            this.error = null;
        else {
            if (this.error == null)
                this.error = new StringType();
            this.error.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #channel} (Details where to send notifications when resources are received that meet the criteria.)
     */
    public SubscriptionChannelComponent getChannel() {
        if (this.channel == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Subscription.channel");
            else if (Configuration.doAutoCreate())
                // cc
                this.channel = new SubscriptionChannelComponent();
        return this.channel;
    }

    public boolean hasChannel() {
        return this.channel != null && !this.channel.isEmpty();
    }

    /**
     * @param value {@link #channel} (Details where to send notifications when resources are received that meet the criteria.)
     */
    public Subscription setChannel(SubscriptionChannelComponent value) {
        this.channel = value;
        return this;
    }

    /**
     * @return {@link #end} (The time for the server to turn the subscription off.). This is the underlying object with id, value and extensions. The accessor "getEnd" gives direct access to the value
     */
    public InstantType getEndElement() {
        if (this.end == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Subscription.end");
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
     * @param value {@link #end} (The time for the server to turn the subscription off.). This is the underlying object with id, value and extensions. The accessor "getEnd" gives direct access to the value
     */
    public Subscription setEndElement(InstantType value) {
        this.end = value;
        return this;
    }

    /**
     * @return The time for the server to turn the subscription off.
     */
    public Date getEnd() {
        return this.end == null ? null : this.end.getValue();
    }

    /**
     * @param value The time for the server to turn the subscription off.
     */
    public Subscription setEnd(Date value) {
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
     * @return {@link #tag} (A tag to add to any resource that matches the criteria, after the subscription is processed.)
     */
    public List<Coding> getTag() {
        if (this.tag == null)
            this.tag = new ArrayList<Coding>();
        return this.tag;
    }

    public boolean hasTag() {
        if (this.tag == null)
            return false;
        for (Coding item : this.tag) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #tag} (A tag to add to any resource that matches the criteria, after the subscription is processed.)
     */
    // syntactic sugar
    public Coding addTag() {
        // 3
        Coding t = new Coding();
        if (this.tag == null)
            this.tag = new ArrayList<Coding>();
        this.tag.add(t);
        return t;
    }

    // syntactic sugar
    public Subscription addTag(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.tag == null)
            this.tag = new ArrayList<Coding>();
        this.tag.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("criteria", "string", "The rules that the server should use to determine when to generate notifications for this subscription.", 0, java.lang.Integer.MAX_VALUE, criteria));
        childrenList.add(new Property("contact", "ContactPoint", "Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("reason", "string", "A description of why this subscription is defined.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("status", "code", "The status of the subscription, which marks the server state for managing the subscription.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("error", "string", "A record of the last error that occurred when the server processed a notification.", 0, java.lang.Integer.MAX_VALUE, error));
        childrenList.add(new Property("channel", "", "Details where to send notifications when resources are received that meet the criteria.", 0, java.lang.Integer.MAX_VALUE, channel));
        childrenList.add(new Property("end", "instant", "The time for the server to turn the subscription off.", 0, java.lang.Integer.MAX_VALUE, end));
        childrenList.add(new Property("tag", "Coding", "A tag to add to any resource that matches the criteria, after the subscription is processed.", 0, java.lang.Integer.MAX_VALUE, tag));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("criteria"))
            // StringType
            this.criteria = castToString(value);
        else if (name.equals("contact"))
            this.getContact().add(castToContactPoint(value));
        else if (name.equals("reason"))
            // StringType
            this.reason = castToString(value);
        else if (name.equals("status"))
            // Enumeration<SubscriptionStatus>
            this.status = new SubscriptionStatusEnumFactory().fromType(value);
        else if (name.equals("error"))
            // StringType
            this.error = castToString(value);
        else if (name.equals("channel"))
            // SubscriptionChannelComponent
            this.channel = (SubscriptionChannelComponent) value;
        else if (name.equals("end"))
            // InstantType
            this.end = castToInstant(value);
        else if (name.equals("tag"))
            this.getTag().add(castToCoding(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("criteria")) {
            throw new FHIRException("Cannot call addChild on a primitive type Subscription.criteria");
        } else if (name.equals("contact")) {
            return addContact();
        } else if (name.equals("reason")) {
            throw new FHIRException("Cannot call addChild on a primitive type Subscription.reason");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Subscription.status");
        } else if (name.equals("error")) {
            throw new FHIRException("Cannot call addChild on a primitive type Subscription.error");
        } else if (name.equals("channel")) {
            this.channel = new SubscriptionChannelComponent();
            return this.channel;
        } else if (name.equals("end")) {
            throw new FHIRException("Cannot call addChild on a primitive type Subscription.end");
        } else if (name.equals("tag")) {
            return addTag();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Subscription";
    }

    public Subscription copy() {
        Subscription dst = new Subscription();
        copyValues(dst);
        dst.criteria = criteria == null ? null : criteria.copy();
        if (contact != null) {
            dst.contact = new ArrayList<ContactPoint>();
            for (ContactPoint i : contact) dst.contact.add(i.copy());
        }
        ;
        dst.reason = reason == null ? null : reason.copy();
        dst.status = status == null ? null : status.copy();
        dst.error = error == null ? null : error.copy();
        dst.channel = channel == null ? null : channel.copy();
        dst.end = end == null ? null : end.copy();
        if (tag != null) {
            dst.tag = new ArrayList<Coding>();
            for (Coding i : tag) dst.tag.add(i.copy());
        }
        ;
        return dst;
    }

    protected Subscription typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Subscription))
            return false;
        Subscription o = (Subscription) other;
        return compareDeep(criteria, o.criteria, true) && compareDeep(contact, o.contact, true) && compareDeep(reason, o.reason, true) && compareDeep(status, o.status, true) && compareDeep(error, o.error, true) && compareDeep(channel, o.channel, true) && compareDeep(end, o.end, true) && compareDeep(tag, o.tag, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Subscription))
            return false;
        Subscription o = (Subscription) other;
        return compareValues(criteria, o.criteria, true) && compareValues(reason, o.reason, true) && compareValues(status, o.status, true) && compareValues(error, o.error, true) && compareValues(end, o.end, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (criteria == null || criteria.isEmpty()) && (contact == null || contact.isEmpty()) && (reason == null || reason.isEmpty()) && (status == null || status.isEmpty()) && (error == null || error.isEmpty()) && (channel == null || channel.isEmpty()) && (end == null || end.isEmpty()) && (tag == null || tag.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Subscription;
    }

    public static final String SP_PAYLOAD = "payload";

    public static final String SP_CRITERIA = "criteria";

    public static final String SP_CONTACT = "contact";

    public static final String SP_TAG = "tag";

    public static final String SP_TYPE = "type";

    public static final String SP_URL = "url";

    public static final String SP_STATUS = "status";
}
