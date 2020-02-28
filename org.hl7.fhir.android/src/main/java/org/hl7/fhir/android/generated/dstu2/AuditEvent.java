package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcome;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcomeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventAction;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventActionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkType;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkTypeEnumFactory;

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
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 */
public class AuditEvent extends DomainResource {

    /**
     * Identifies the name, action type, time, and disposition of the audited event.
     */
    protected AuditEventEventComponent event;

    /**
     * A person, a hardware device or software process.
     */
    protected List<AuditEventParticipantComponent> participant;

    /**
     * Application systems and processes.
     */
    protected AuditEventSourceComponent source;

    /**
     * Specific instances of data or objects that have been accessed.
     */
    protected List<AuditEventObjectComponent> object;

    private static final long serialVersionUID = -1495151000L;

    /*
   * Constructor
   */
    public AuditEvent() {
        super();
    }

    /*
   * Constructor
   */
    public AuditEvent(AuditEventEventComponent event, AuditEventSourceComponent source) {
        super();
        this.event = event;
        this.source = source;
    }

    /**
     * @return {@link #event} (Identifies the name, action type, time, and disposition of the audited event.)
     */
    public AuditEventEventComponent getEvent() {
        if (this.event == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEvent.event");
            else if (Configuration.doAutoCreate())
                // cc
                this.event = new AuditEventEventComponent();
        return this.event;
    }

    public boolean hasEvent() {
        return this.event != null && !this.event.isEmpty();
    }

    /**
     * @param value {@link #event} (Identifies the name, action type, time, and disposition of the audited event.)
     */
    public AuditEvent setEvent(AuditEventEventComponent value) {
        this.event = value;
        return this;
    }

    /**
     * @return {@link #participant} (A person, a hardware device or software process.)
     */
    public List<AuditEventParticipantComponent> getParticipant() {
        if (this.participant == null)
            this.participant = new ArrayList<AuditEventParticipantComponent>();
        return this.participant;
    }

    public boolean hasParticipant() {
        if (this.participant == null)
            return false;
        for (AuditEventParticipantComponent item : this.participant) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #participant} (A person, a hardware device or software process.)
     */
    // syntactic sugar
    public AuditEventParticipantComponent addParticipant() {
        // 3
        AuditEventParticipantComponent t = new AuditEventParticipantComponent();
        if (this.participant == null)
            this.participant = new ArrayList<AuditEventParticipantComponent>();
        this.participant.add(t);
        return t;
    }

    // syntactic sugar
    public AuditEvent addParticipant(AuditEventParticipantComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.participant == null)
            this.participant = new ArrayList<AuditEventParticipantComponent>();
        this.participant.add(t);
        return this;
    }

    /**
     * @return {@link #source} (Application systems and processes.)
     */
    public AuditEventSourceComponent getSource() {
        if (this.source == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEvent.source");
            else if (Configuration.doAutoCreate())
                // cc
                this.source = new AuditEventSourceComponent();
        return this.source;
    }

    public boolean hasSource() {
        return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (Application systems and processes.)
     */
    public AuditEvent setSource(AuditEventSourceComponent value) {
        this.source = value;
        return this;
    }

    /**
     * @return {@link #object} (Specific instances of data or objects that have been accessed.)
     */
    public List<AuditEventObjectComponent> getObject() {
        if (this.object == null)
            this.object = new ArrayList<AuditEventObjectComponent>();
        return this.object;
    }

    public boolean hasObject() {
        if (this.object == null)
            return false;
        for (AuditEventObjectComponent item : this.object) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #object} (Specific instances of data or objects that have been accessed.)
     */
    // syntactic sugar
    public AuditEventObjectComponent addObject() {
        // 3
        AuditEventObjectComponent t = new AuditEventObjectComponent();
        if (this.object == null)
            this.object = new ArrayList<AuditEventObjectComponent>();
        this.object.add(t);
        return t;
    }

    // syntactic sugar
    public AuditEvent addObject(AuditEventObjectComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.object == null)
            this.object = new ArrayList<AuditEventObjectComponent>();
        this.object.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("event", "", "Identifies the name, action type, time, and disposition of the audited event.", 0, java.lang.Integer.MAX_VALUE, event));
        childrenList.add(new Property("participant", "", "A person, a hardware device or software process.", 0, java.lang.Integer.MAX_VALUE, participant));
        childrenList.add(new Property("source", "", "Application systems and processes.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("object", "", "Specific instances of data or objects that have been accessed.", 0, java.lang.Integer.MAX_VALUE, object));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("event"))
            // AuditEventEventComponent
            this.event = (AuditEventEventComponent) value;
        else if (name.equals("participant"))
            this.getParticipant().add((AuditEventParticipantComponent) value);
        else if (name.equals("source"))
            // AuditEventSourceComponent
            this.source = (AuditEventSourceComponent) value;
        else if (name.equals("object"))
            this.getObject().add((AuditEventObjectComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("event")) {
            this.event = new AuditEventEventComponent();
            return this.event;
        } else if (name.equals("participant")) {
            return addParticipant();
        } else if (name.equals("source")) {
            this.source = new AuditEventSourceComponent();
            return this.source;
        } else if (name.equals("object")) {
            return addObject();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "AuditEvent";
    }

    public AuditEvent copy() {
        AuditEvent dst = new AuditEvent();
        copyValues(dst);
        dst.event = event == null ? null : event.copy();
        if (participant != null) {
            dst.participant = new ArrayList<AuditEventParticipantComponent>();
            for (AuditEventParticipantComponent i : participant) dst.participant.add(i.copy());
        }
        ;
        dst.source = source == null ? null : source.copy();
        if (object != null) {
            dst.object = new ArrayList<AuditEventObjectComponent>();
            for (AuditEventObjectComponent i : object) dst.object.add(i.copy());
        }
        ;
        return dst;
    }

    protected AuditEvent typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AuditEvent))
            return false;
        AuditEvent o = (AuditEvent) other;
        return compareDeep(event, o.event, true) && compareDeep(participant, o.participant, true) && compareDeep(source, o.source, true) && compareDeep(object, o.object, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AuditEvent))
            return false;
        AuditEvent o = (AuditEvent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (event == null || event.isEmpty()) && (participant == null || participant.isEmpty()) && (source == null || source.isEmpty()) && (object == null || object.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.AuditEvent;
    }

    public static final String SP_DATE = "date";

    public static final String SP_ADDRESS = "address";

    public static final String SP_SOURCE = "source";

    public static final String SP_TYPE = "type";

    public static final String SP_ALTID = "altid";

    public static final String SP_PARTICIPANT = "participant";

    public static final String SP_REFERENCE = "reference";

    public static final String SP_SITE = "site";

    public static final String SP_SUBTYPE = "subtype";

    public static final String SP_IDENTITY = "identity";

    public static final String SP_PATIENT = "patient";

    public static final String SP_OBJECTTYPE = "object-type";

    public static final String SP_NAME = "name";

    public static final String SP_ACTION = "action";

    public static final String SP_USER = "user";

    public static final String SP_DESC = "desc";

    public static final String SP_POLICY = "policy";
}
