package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.GroupEnum.GroupType;
import org.hl7.fhir.android.generated.dstu2.GroupEnum.GroupTypeEnumFactory;

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
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
 */
public class Group extends DomainResource {

    /**
     * A unique business identifier for this group.
     */
    protected List<Identifier> identifier;

    /**
     * Identifies the broad classification of the kind of resources the group includes.
     */
    protected Enumeration<GroupType> type;

    /**
     * If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.
     */
    protected BooleanType actual;

    /**
     * Provides a specific type of resource the group includes; e.g. "cow", "syringe", etc.
     */
    protected CodeableConcept code;

    /**
     * A label assigned to the group for human identification and communication.
     */
    protected StringType name;

    /**
     * A count of the number of resource instances that are part of the group.
     */
    protected UnsignedIntType quantity;

    /**
     * Identifies the traits shared by members of the group.
     */
    protected List<GroupCharacteristicComponent> characteristic;

    /**
     * Identifies the resource instances that are members of the group.
     */
    protected List<GroupMemberComponent> member;

    private static final long serialVersionUID = 1401345819L;

    /*
   * Constructor
   */
    public Group() {
        super();
    }

    /*
   * Constructor
   */
    public Group(Enumeration<GroupType> type, BooleanType actual) {
        super();
        this.type = type;
        this.actual = actual;
    }

    /**
     * @return {@link #identifier} (A unique business identifier for this group.)
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
     * @return {@link #identifier} (A unique business identifier for this group.)
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
    public Group addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #type} (Identifies the broad classification of the kind of resources the group includes.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<GroupType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Group.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<GroupType>(new GroupTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Identifies the broad classification of the kind of resources the group includes.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Group setTypeElement(Enumeration<GroupType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return Identifies the broad classification of the kind of resources the group includes.
     */
    public GroupType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Identifies the broad classification of the kind of resources the group includes.
     */
    public Group setType(GroupType value) {
        if (this.type == null)
            this.type = new Enumeration<GroupType>(new GroupTypeEnumFactory());
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #actual} (If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.). This is the underlying object with id, value and extensions. The accessor "getActual" gives direct access to the value
     */
    public BooleanType getActualElement() {
        if (this.actual == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Group.actual");
            else if (Configuration.doAutoCreate())
                // bb
                this.actual = new BooleanType();
        return this.actual;
    }

    public boolean hasActualElement() {
        return this.actual != null && !this.actual.isEmpty();
    }

    public boolean hasActual() {
        return this.actual != null && !this.actual.isEmpty();
    }

    /**
     * @param value {@link #actual} (If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.). This is the underlying object with id, value and extensions. The accessor "getActual" gives direct access to the value
     */
    public Group setActualElement(BooleanType value) {
        this.actual = value;
        return this;
    }

    /**
     * @return If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.
     */
    public boolean getActual() {
        return this.actual == null || this.actual.isEmpty() ? false : this.actual.getValue();
    }

    /**
     * @param value If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.
     */
    public Group setActual(boolean value) {
        if (this.actual == null)
            this.actual = new BooleanType();
        this.actual.setValue(value);
        return this;
    }

    /**
     * @return {@link #code} (Provides a specific type of resource the group includes; e.g. "cow", "syringe", etc.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Group.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Provides a specific type of resource the group includes; e.g. "cow", "syringe", etc.)
     */
    public Group setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #name} (A label assigned to the group for human identification and communication.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Group.name");
            else if (Configuration.doAutoCreate())
                // bb
                this.name = new StringType();
        return this.name;
    }

    public boolean hasNameElement() {
        return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A label assigned to the group for human identification and communication.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public Group setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A label assigned to the group for human identification and communication.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A label assigned to the group for human identification and communication.
     */
    public Group setName(String value) {
        if (Utilities.noString(value))
            this.name = null;
        else {
            if (this.name == null)
                this.name = new StringType();
            this.name.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #quantity} (A count of the number of resource instances that are part of the group.). This is the underlying object with id, value and extensions. The accessor "getQuantity" gives direct access to the value
     */
    public UnsignedIntType getQuantityElement() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Group.quantity");
            else if (Configuration.doAutoCreate())
                // bb
                this.quantity = new UnsignedIntType();
        return this.quantity;
    }

    public boolean hasQuantityElement() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (A count of the number of resource instances that are part of the group.). This is the underlying object with id, value and extensions. The accessor "getQuantity" gives direct access to the value
     */
    public Group setQuantityElement(UnsignedIntType value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return A count of the number of resource instances that are part of the group.
     */
    public int getQuantity() {
        return this.quantity == null || this.quantity.isEmpty() ? 0 : this.quantity.getValue();
    }

    /**
     * @param value A count of the number of resource instances that are part of the group.
     */
    public Group setQuantity(int value) {
        if (this.quantity == null)
            this.quantity = new UnsignedIntType();
        this.quantity.setValue(value);
        return this;
    }

    /**
     * @return {@link #characteristic} (Identifies the traits shared by members of the group.)
     */
    public List<GroupCharacteristicComponent> getCharacteristic() {
        if (this.characteristic == null)
            this.characteristic = new ArrayList<GroupCharacteristicComponent>();
        return this.characteristic;
    }

    public boolean hasCharacteristic() {
        if (this.characteristic == null)
            return false;
        for (GroupCharacteristicComponent item : this.characteristic) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #characteristic} (Identifies the traits shared by members of the group.)
     */
    // syntactic sugar
    public GroupCharacteristicComponent addCharacteristic() {
        // 3
        GroupCharacteristicComponent t = new GroupCharacteristicComponent();
        if (this.characteristic == null)
            this.characteristic = new ArrayList<GroupCharacteristicComponent>();
        this.characteristic.add(t);
        return t;
    }

    // syntactic sugar
    public Group addCharacteristic(GroupCharacteristicComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.characteristic == null)
            this.characteristic = new ArrayList<GroupCharacteristicComponent>();
        this.characteristic.add(t);
        return this;
    }

    /**
     * @return {@link #member} (Identifies the resource instances that are members of the group.)
     */
    public List<GroupMemberComponent> getMember() {
        if (this.member == null)
            this.member = new ArrayList<GroupMemberComponent>();
        return this.member;
    }

    public boolean hasMember() {
        if (this.member == null)
            return false;
        for (GroupMemberComponent item : this.member) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #member} (Identifies the resource instances that are members of the group.)
     */
    // syntactic sugar
    public GroupMemberComponent addMember() {
        // 3
        GroupMemberComponent t = new GroupMemberComponent();
        if (this.member == null)
            this.member = new ArrayList<GroupMemberComponent>();
        this.member.add(t);
        return t;
    }

    // syntactic sugar
    public Group addMember(GroupMemberComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.member == null)
            this.member = new ArrayList<GroupMemberComponent>();
        this.member.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "A unique business identifier for this group.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("type", "code", "Identifies the broad classification of the kind of resources the group includes.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("actual", "boolean", "If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.", 0, java.lang.Integer.MAX_VALUE, actual));
        childrenList.add(new Property("code", "CodeableConcept", "Provides a specific type of resource the group includes; e.g. \"cow\", \"syringe\", etc.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("name", "string", "A label assigned to the group for human identification and communication.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("quantity", "unsignedInt", "A count of the number of resource instances that are part of the group.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("characteristic", "", "Identifies the traits shared by members of the group.", 0, java.lang.Integer.MAX_VALUE, characteristic));
        childrenList.add(new Property("member", "", "Identifies the resource instances that are members of the group.", 0, java.lang.Integer.MAX_VALUE, member));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("type"))
            // Enumeration<GroupType>
            this.type = new GroupTypeEnumFactory().fromType(value);
        else if (name.equals("actual"))
            // BooleanType
            this.actual = castToBoolean(value);
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("quantity"))
            // UnsignedIntType
            this.quantity = castToUnsignedInt(value);
        else if (name.equals("characteristic"))
            this.getCharacteristic().add((GroupCharacteristicComponent) value);
        else if (name.equals("member"))
            this.getMember().add((GroupMemberComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Group.type");
        } else if (name.equals("actual")) {
            throw new FHIRException("Cannot call addChild on a primitive type Group.actual");
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type Group.name");
        } else if (name.equals("quantity")) {
            throw new FHIRException("Cannot call addChild on a primitive type Group.quantity");
        } else if (name.equals("characteristic")) {
            return addCharacteristic();
        } else if (name.equals("member")) {
            return addMember();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Group";
    }

    public Group copy() {
        Group dst = new Group();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.type = type == null ? null : type.copy();
        dst.actual = actual == null ? null : actual.copy();
        dst.code = code == null ? null : code.copy();
        dst.name = name == null ? null : name.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        if (characteristic != null) {
            dst.characteristic = new ArrayList<GroupCharacteristicComponent>();
            for (GroupCharacteristicComponent i : characteristic) dst.characteristic.add(i.copy());
        }
        ;
        if (member != null) {
            dst.member = new ArrayList<GroupMemberComponent>();
            for (GroupMemberComponent i : member) dst.member.add(i.copy());
        }
        ;
        return dst;
    }

    protected Group typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Group))
            return false;
        Group o = (Group) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true) && compareDeep(actual, o.actual, true) && compareDeep(code, o.code, true) && compareDeep(name, o.name, true) && compareDeep(quantity, o.quantity, true) && compareDeep(characteristic, o.characteristic, true) && compareDeep(member, o.member, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Group))
            return false;
        Group o = (Group) other;
        return compareValues(type, o.type, true) && compareValues(actual, o.actual, true) && compareValues(name, o.name, true) && compareValues(quantity, o.quantity, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (type == null || type.isEmpty()) && (actual == null || actual.isEmpty()) && (code == null || code.isEmpty()) && (name == null || name.isEmpty()) && (quantity == null || quantity.isEmpty()) && (characteristic == null || characteristic.isEmpty()) && (member == null || member.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Group;
    }

    public static final String SP_ACTUAL = "actual";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CHARACTERISTICVALUE = "characteristic-value";

    public static final String SP_CODE = "code";

    public static final String SP_MEMBER = "member";

    public static final String SP_EXCLUDE = "exclude";

    public static final String SP_TYPE = "type";

    public static final String SP_VALUE = "value";

    public static final String SP_CHARACTERISTIC = "characteristic";
}
