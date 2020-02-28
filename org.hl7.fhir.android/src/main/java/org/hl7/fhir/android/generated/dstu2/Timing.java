package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.UnitsOfTime;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.UnitsOfTimeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.EventTiming;
import org.hl7.fhir.android.generated.dstu2.TimingEnum.EventTimingEnumFactory;

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
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds.
 */
public class Timing extends Type implements ICompositeType {

    /**
     * Identifies specific times when the event occurs.
     */
    protected List<DateTimeType> event;

    /**
     * A set of rules that describe when the event should occur.
     */
    protected TimingRepeatComponent repeat;

    /**
     * A code for the timing pattern. Some codes such as BID are ubiquitous, but many institutions define their own additional codes.
     */
    protected CodeableConcept code;

    private static final long serialVersionUID = 791565112L;

    /*
   * Constructor
   */
    public Timing() {
        super();
    }

    /**
     * @return {@link #event} (Identifies specific times when the event occurs.)
     */
    public List<DateTimeType> getEvent() {
        if (this.event == null)
            this.event = new ArrayList<DateTimeType>();
        return this.event;
    }

    public boolean hasEvent() {
        if (this.event == null)
            return false;
        for (DateTimeType item : this.event) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #event} (Identifies specific times when the event occurs.)
     */
    // syntactic sugar
    public DateTimeType addEventElement() {
        // 2
        DateTimeType t = new DateTimeType();
        if (this.event == null)
            this.event = new ArrayList<DateTimeType>();
        this.event.add(t);
        return t;
    }

    /**
     * @param value {@link #event} (Identifies specific times when the event occurs.)
     */
    public Timing addEvent(Date value) {
        // 1
        DateTimeType t = new DateTimeType();
        t.setValue(value);
        if (this.event == null)
            this.event = new ArrayList<DateTimeType>();
        this.event.add(t);
        return this;
    }

    /**
     * @param value {@link #event} (Identifies specific times when the event occurs.)
     */
    public boolean hasEvent(Date value) {
        if (this.event == null)
            return false;
        for (DateTimeType v : this.event) if (// dateTime
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #repeat} (A set of rules that describe when the event should occur.)
     */
    public TimingRepeatComponent getRepeat() {
        if (this.repeat == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Timing.repeat");
            else if (Configuration.doAutoCreate())
                // cc
                this.repeat = new TimingRepeatComponent();
        return this.repeat;
    }

    public boolean hasRepeat() {
        return this.repeat != null && !this.repeat.isEmpty();
    }

    /**
     * @param value {@link #repeat} (A set of rules that describe when the event should occur.)
     */
    public Timing setRepeat(TimingRepeatComponent value) {
        this.repeat = value;
        return this;
    }

    /**
     * @return {@link #code} (A code for the timing pattern. Some codes such as BID are ubiquitous, but many institutions define their own additional codes.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Timing.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A code for the timing pattern. Some codes such as BID are ubiquitous, but many institutions define their own additional codes.)
     */
    public Timing setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("event", "dateTime", "Identifies specific times when the event occurs.", 0, java.lang.Integer.MAX_VALUE, event));
        childrenList.add(new Property("repeat", "", "A set of rules that describe when the event should occur.", 0, java.lang.Integer.MAX_VALUE, repeat));
        childrenList.add(new Property("code", "CodeableConcept", "A code for the timing pattern. Some codes such as BID are ubiquitous, but many institutions define their own additional codes.", 0, java.lang.Integer.MAX_VALUE, code));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("event"))
            this.getEvent().add(castToDateTime(value));
        else if (name.equals("repeat"))
            // TimingRepeatComponent
            this.repeat = (TimingRepeatComponent) value;
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("event")) {
            throw new FHIRException("Cannot call addChild on a primitive type Timing.event");
        } else if (name.equals("repeat")) {
            this.repeat = new TimingRepeatComponent();
            return this.repeat;
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Timing";
    }

    public Timing copy() {
        Timing dst = new Timing();
        copyValues(dst);
        if (event != null) {
            dst.event = new ArrayList<DateTimeType>();
            for (DateTimeType i : event) dst.event.add(i.copy());
        }
        ;
        dst.repeat = repeat == null ? null : repeat.copy();
        dst.code = code == null ? null : code.copy();
        return dst;
    }

    protected Timing typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Timing))
            return false;
        Timing o = (Timing) other;
        return compareDeep(event, o.event, true) && compareDeep(repeat, o.repeat, true) && compareDeep(code, o.code, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Timing))
            return false;
        Timing o = (Timing) other;
        return compareValues(event, o.event, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (event == null || event.isEmpty()) && (repeat == null || repeat.isEmpty()) && (code == null || code.isEmpty());
    }
}
