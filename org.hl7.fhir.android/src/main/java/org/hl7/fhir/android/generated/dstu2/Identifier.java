package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.List;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.IdentifierEnum.IdentifierUseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.IdentifierEnum.IdentifierUse;

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
 * A technical identifier - identifies some entity uniquely and unambiguously.
 */
public class Identifier extends Type implements ICompositeType {

    /**
     * The purpose of this identifier.
     */
    protected Enumeration<IdentifierUse> use;

    /**
     * A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.
     */
    protected CodeableConcept type;

    /**
     * Establishes the namespace in which set of possible id values is unique.
     */
    protected UriType system;

    /**
     * The portion of the identifier typically displayed to the user and which is unique within the context of the system.
     */
    protected StringType value;

    /**
     * Time period during which identifier is/was valid for use.
     */
    protected Period period;

    /**
     * Organization that issued/manages the identifier.
     */
    protected Reference assigner;

    /**
     * The actual object that is the target of the reference (Organization that issued/manages the identifier.)
     */
    protected Organization assignerTarget;

    private static final long serialVersionUID = -478840981L;

    /*
   * Constructor
   */
    public Identifier() {
        super();
    }

    /**
     * @return {@link #use} (The purpose of this identifier.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Enumeration<IdentifierUse> getUseElement() {
        if (this.use == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Identifier.use");
            else if (Configuration.doAutoCreate())
                // bb
                this.use = new Enumeration<IdentifierUse>(new IdentifierUseEnumFactory());
        return this.use;
    }

    public boolean hasUseElement() {
        return this.use != null && !this.use.isEmpty();
    }

    public boolean hasUse() {
        return this.use != null && !this.use.isEmpty();
    }

    /**
     * @param value {@link #use} (The purpose of this identifier.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Identifier setUseElement(Enumeration<IdentifierUse> value) {
        this.use = value;
        return this;
    }

    /**
     * @return The purpose of this identifier.
     */
    public IdentifierUse getUse() {
        return this.use == null ? null : this.use.getValue();
    }

    /**
     * @param value The purpose of this identifier.
     */
    public Identifier setUse(IdentifierUse value) {
        if (value == null)
            this.use = null;
        else {
            if (this.use == null)
                this.use = new Enumeration<IdentifierUse>(new IdentifierUseEnumFactory());
            this.use.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Identifier.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.)
     */
    public Identifier setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #system} (Establishes the namespace in which set of possible id values is unique.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public UriType getSystemElement() {
        if (this.system == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Identifier.system");
            else if (Configuration.doAutoCreate())
                // bb
                this.system = new UriType();
        return this.system;
    }

    public boolean hasSystemElement() {
        return this.system != null && !this.system.isEmpty();
    }

    public boolean hasSystem() {
        return this.system != null && !this.system.isEmpty();
    }

    /**
     * @param value {@link #system} (Establishes the namespace in which set of possible id values is unique.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public Identifier setSystemElement(UriType value) {
        this.system = value;
        return this;
    }

    /**
     * @return Establishes the namespace in which set of possible id values is unique.
     */
    public String getSystem() {
        return this.system == null ? null : this.system.getValue();
    }

    /**
     * @param value Establishes the namespace in which set of possible id values is unique.
     */
    public Identifier setSystem(String value) {
        if (Utilities.noString(value))
            this.system = null;
        else {
            if (this.system == null)
                this.system = new UriType();
            this.system.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #value} (The portion of the identifier typically displayed to the user and which is unique within the context of the system.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public StringType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Identifier.value");
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
     * @param value {@link #value} (The portion of the identifier typically displayed to the user and which is unique within the context of the system.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public Identifier setValueElement(StringType value) {
        this.value = value;
        return this;
    }

    /**
     * @return The portion of the identifier typically displayed to the user and which is unique within the context of the system.
     */
    public String getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The portion of the identifier typically displayed to the user and which is unique within the context of the system.
     */
    public Identifier setValue(String value) {
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
     * @return {@link #period} (Time period during which identifier is/was valid for use.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Identifier.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Time period during which identifier is/was valid for use.)
     */
    public Identifier setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #assigner} (Organization that issued/manages the identifier.)
     */
    public Reference getAssigner() {
        if (this.assigner == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Identifier.assigner");
            else if (Configuration.doAutoCreate())
                // cc
                this.assigner = new Reference();
        return this.assigner;
    }

    public boolean hasAssigner() {
        return this.assigner != null && !this.assigner.isEmpty();
    }

    /**
     * @param value {@link #assigner} (Organization that issued/manages the identifier.)
     */
    public Identifier setAssigner(Reference value) {
        this.assigner = value;
        return this;
    }

    /**
     * @return {@link #assigner} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Organization that issued/manages the identifier.)
     */
    public Organization getAssignerTarget() {
        if (this.assignerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Identifier.assigner");
            else if (Configuration.doAutoCreate())
                // aa
                this.assignerTarget = new Organization();
        return this.assignerTarget;
    }

    /**
     * @param value {@link #assigner} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Organization that issued/manages the identifier.)
     */
    public Identifier setAssignerTarget(Organization value) {
        this.assignerTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("use", "code", "The purpose of this identifier.", 0, java.lang.Integer.MAX_VALUE, use));
        childrenList.add(new Property("type", "CodeableConcept", "A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("system", "uri", "Establishes the namespace in which set of possible id values is unique.", 0, java.lang.Integer.MAX_VALUE, system));
        childrenList.add(new Property("value", "string", "The portion of the identifier typically displayed to the user and which is unique within the context of the system.", 0, java.lang.Integer.MAX_VALUE, value));
        childrenList.add(new Property("period", "Period", "Time period during which identifier is/was valid for use.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("assigner", "Reference(Organization)", "Organization that issued/manages the identifier.", 0, java.lang.Integer.MAX_VALUE, assigner));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("use"))
            // Enumeration<IdentifierUse>
            this.use = new IdentifierUseEnumFactory().fromType(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("system"))
            // UriType
            this.system = castToUri(value);
        else if (name.equals("value"))
            // StringType
            this.value = castToString(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("assigner"))
            // Reference
            this.assigner = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("use")) {
            throw new FHIRException("Cannot call addChild on a primitive type Identifier.use");
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("system")) {
            throw new FHIRException("Cannot call addChild on a primitive type Identifier.system");
        } else if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type Identifier.value");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("assigner")) {
            this.assigner = new Reference();
            return this.assigner;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Identifier";
    }

    public Identifier copy() {
        Identifier dst = new Identifier();
        copyValues(dst);
        dst.use = use == null ? null : use.copy();
        dst.type = type == null ? null : type.copy();
        dst.system = system == null ? null : system.copy();
        dst.value = value == null ? null : value.copy();
        dst.period = period == null ? null : period.copy();
        dst.assigner = assigner == null ? null : assigner.copy();
        return dst;
    }

    protected Identifier typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Identifier))
            return false;
        Identifier o = (Identifier) other;
        return compareDeep(use, o.use, true) && compareDeep(type, o.type, true) && compareDeep(system, o.system, true) && compareDeep(value, o.value, true) && compareDeep(period, o.period, true) && compareDeep(assigner, o.assigner, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Identifier))
            return false;
        Identifier o = (Identifier) other;
        return compareValues(use, o.use, true) && compareValues(system, o.system, true) && compareValues(value, o.value, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (use == null || use.isEmpty()) && (type == null || type.isEmpty()) && (system == null || system.isEmpty()) && (value == null || value.isEmpty()) && (period == null || period.isEmpty()) && (assigner == null || assigner.isEmpty());
    }
}
