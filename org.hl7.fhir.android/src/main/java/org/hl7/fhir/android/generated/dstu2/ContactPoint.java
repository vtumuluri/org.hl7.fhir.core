package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.List;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ContactPointEnum.ContactPointUseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ContactPointEnum.ContactPointUse;
import org.hl7.fhir.android.generated.dstu2.ContactPointEnum.ContactPointSystemEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ContactPointEnum.ContactPointSystem;

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
 * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
 */
public class ContactPoint extends Type implements ICompositeType {

    /**
     * Telecommunications form for contact point - what communications system is required to make use of the contact.
     */
    protected Enumeration<ContactPointSystem> system;

    /**
     * The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     */
    protected StringType value;

    /**
     * Identifies the purpose for the contact point.
     */
    protected Enumeration<ContactPointUse> use;

    /**
     * Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values.
     */
    protected PositiveIntType rank;

    /**
     * Time period when the contact point was/is in use.
     */
    protected Period period;

    private static final long serialVersionUID = 1509610874L;

    /*
   * Constructor
   */
    public ContactPoint() {
        super();
    }

    /**
     * @return {@link #system} (Telecommunications form for contact point - what communications system is required to make use of the contact.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public Enumeration<ContactPointSystem> getSystemElement() {
        if (this.system == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactPoint.system");
            else if (Configuration.doAutoCreate())
                // bb
                this.system = new Enumeration<ContactPointSystem>(new ContactPointSystemEnumFactory());
        return this.system;
    }

    public boolean hasSystemElement() {
        return this.system != null && !this.system.isEmpty();
    }

    public boolean hasSystem() {
        return this.system != null && !this.system.isEmpty();
    }

    /**
     * @param value {@link #system} (Telecommunications form for contact point - what communications system is required to make use of the contact.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public ContactPoint setSystemElement(Enumeration<ContactPointSystem> value) {
        this.system = value;
        return this;
    }

    /**
     * @return Telecommunications form for contact point - what communications system is required to make use of the contact.
     */
    public ContactPointSystem getSystem() {
        return this.system == null ? null : this.system.getValue();
    }

    /**
     * @param value Telecommunications form for contact point - what communications system is required to make use of the contact.
     */
    public ContactPoint setSystem(ContactPointSystem value) {
        if (value == null)
            this.system = null;
        else {
            if (this.system == null)
                this.system = new Enumeration<ContactPointSystem>(new ContactPointSystemEnumFactory());
            this.system.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #value} (The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public StringType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactPoint.value");
            else if (Configuration.doAutoCreate())
                // bb
                this.value = new StringType();
        return this.value;
    }

    public boolean hasValueElement() {
        return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public ContactPoint setValueElement(StringType value) {
        this.value = value;
        return this;
    }

    /**
     * @return The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     */
    public String getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     */
    public ContactPoint setValue(String value) {
        if (Utilities.noString(value))
            this.value = null;
        else {
            if (this.value == null)
                this.value = new StringType();
            this.value.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #use} (Identifies the purpose for the contact point.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Enumeration<ContactPointUse> getUseElement() {
        if (this.use == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactPoint.use");
            else if (Configuration.doAutoCreate())
                // bb
                this.use = new Enumeration<ContactPointUse>(new ContactPointUseEnumFactory());
        return this.use;
    }

    public boolean hasUseElement() {
        return this.use != null && !this.use.isEmpty();
    }

    public boolean hasUse() {
        return this.use != null && !this.use.isEmpty();
    }

    /**
     * @param value {@link #use} (Identifies the purpose for the contact point.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public ContactPoint setUseElement(Enumeration<ContactPointUse> value) {
        this.use = value;
        return this;
    }

    /**
     * @return Identifies the purpose for the contact point.
     */
    public ContactPointUse getUse() {
        return this.use == null ? null : this.use.getValue();
    }

    /**
     * @param value Identifies the purpose for the contact point.
     */
    public ContactPoint setUse(ContactPointUse value) {
        if (value == null)
            this.use = null;
        else {
            if (this.use == null)
                this.use = new Enumeration<ContactPointUse>(new ContactPointUseEnumFactory());
            this.use.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #rank} (Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values.). This is the underlying object with id, value and extensions. The accessor "getRank" gives direct access to the value
     */
    public PositiveIntType getRankElement() {
        if (this.rank == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactPoint.rank");
            else if (Configuration.doAutoCreate())
                // bb
                this.rank = new PositiveIntType();
        return this.rank;
    }

    public boolean hasRankElement() {
        return this.rank != null && !this.rank.isEmpty();
    }

    public boolean hasRank() {
        return this.rank != null && !this.rank.isEmpty();
    }

    /**
     * @param value {@link #rank} (Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values.). This is the underlying object with id, value and extensions. The accessor "getRank" gives direct access to the value
     */
    public ContactPoint setRankElement(PositiveIntType value) {
        this.rank = value;
        return this;
    }

    /**
     * @return Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values.
     */
    public int getRank() {
        return this.rank == null || this.rank.isEmpty() ? 0 : this.rank.getValue();
    }

    /**
     * @param value Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values.
     */
    public ContactPoint setRank(int value) {
        if (this.rank == null)
            this.rank = new PositiveIntType();
        this.rank.setValue(value);
        return this;
    }

    /**
     * @return {@link #period} (Time period when the contact point was/is in use.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ContactPoint.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Time period when the contact point was/is in use.)
     */
    public ContactPoint setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("system", "code", "Telecommunications form for contact point - what communications system is required to make use of the contact.", 0, java.lang.Integer.MAX_VALUE, system));
        childrenList.add(new Property("value", "string", "The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).", 0, java.lang.Integer.MAX_VALUE, value));
        childrenList.add(new Property("use", "code", "Identifies the purpose for the contact point.", 0, java.lang.Integer.MAX_VALUE, use));
        childrenList.add(new Property("rank", "positiveInt", "Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values.", 0, java.lang.Integer.MAX_VALUE, rank));
        childrenList.add(new Property("period", "Period", "Time period when the contact point was/is in use.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("system"))
            // Enumeration<ContactPointSystem>
            this.system = new ContactPointSystemEnumFactory().fromType(value);
        else if (name.equals("value"))
            // StringType
            this.value = castToString(value);
        else if (name.equals("use"))
            // Enumeration<ContactPointUse>
            this.use = new ContactPointUseEnumFactory().fromType(value);
        else if (name.equals("rank"))
            // PositiveIntType
            this.rank = castToPositiveInt(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("system")) {
            throw new FHIRException("Cannot call addChild on a primitive type ContactPoint.system");
        } else if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type ContactPoint.value");
        } else if (name.equals("use")) {
            throw new FHIRException("Cannot call addChild on a primitive type ContactPoint.use");
        } else if (name.equals("rank")) {
            throw new FHIRException("Cannot call addChild on a primitive type ContactPoint.rank");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ContactPoint";
    }

    public ContactPoint copy() {
        ContactPoint dst = new ContactPoint();
        copyValues(dst);
        dst.system = system == null ? null : system.copy();
        dst.value = value == null ? null : value.copy();
        dst.use = use == null ? null : use.copy();
        dst.rank = rank == null ? null : rank.copy();
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    protected ContactPoint typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ContactPoint))
            return false;
        ContactPoint o = (ContactPoint) other;
        return compareDeep(system, o.system, true) && compareDeep(value, o.value, true) && compareDeep(use, o.use, true) && compareDeep(rank, o.rank, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ContactPoint))
            return false;
        ContactPoint o = (ContactPoint) other;
        return compareValues(system, o.system, true) && compareValues(value, o.value, true) && compareValues(use, o.use, true) && compareValues(rank, o.rank, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (system == null || system.isEmpty()) && (value == null || value.isEmpty()) && (use == null || use.isEmpty()) && (rank == null || rank.isEmpty()) && (period == null || period.isEmpty());
    }
}
