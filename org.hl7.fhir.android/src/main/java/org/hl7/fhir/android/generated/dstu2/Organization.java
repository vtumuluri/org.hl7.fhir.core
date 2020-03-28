package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

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
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
 */
public class Organization extends DomainResource {

    /**
     * Identifier for the organization that is used to identify the organization across multiple disparate systems.
     */
    protected List<Identifier> identifier;

    /**
     * Whether the organization's record is still in active use.
     */
    protected BooleanType active;

    /**
     * The kind of organization that this is.
     */
    protected CodeableConcept type;

    /**
     * A name associated with the organization.
     */
    protected StringType name;

    /**
     * A contact detail for the organization.
     */
    protected List<ContactPoint> telecom;

    /**
     * An address for the organization.
     */
    protected List<Address> address;

    /**
     * The organization of which this organization forms a part.
     */
    protected Reference partOf;

    /**
     * The actual object that is the target of the reference (The organization of which this organization forms a part.)
     */
    protected Organization partOfTarget;

    /**
     * Contact for the organization for a certain purpose.
     */
    protected List<OrganizationContactComponent> contact;

    private static final long serialVersionUID = -749567123L;

    /*
   * Constructor
   */
    public Organization() {
        super();
    }

    /**
     * @return {@link #identifier} (Identifier for the organization that is used to identify the organization across multiple disparate systems.)
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
     * @return {@link #identifier} (Identifier for the organization that is used to identify the organization across multiple disparate systems.)
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
    public Organization addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #active} (Whether the organization's record is still in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public BooleanType getActiveElement() {
        if (this.active == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Organization.active");
            else if (Configuration.doAutoCreate())
                // bb
                this.active = new BooleanType();
        return this.active;
    }

    public boolean hasActiveElement() {
        return this.active != null && !this.active.isEmpty();
    }

    public boolean hasActive() {
        return this.active != null && !this.active.isEmpty();
    }

    /**
     * @param value {@link #active} (Whether the organization's record is still in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public Organization setActiveElement(BooleanType value) {
        this.active = value;
        return this;
    }

    /**
     * @return Whether the organization's record is still in active use.
     */
    public boolean getActive() {
        return this.active == null || this.active.isEmpty() ? false : this.active.getValue();
    }

    /**
     * @param value Whether the organization's record is still in active use.
     */
    public Organization setActive(boolean value) {
        if (this.active == null)
            this.active = new BooleanType();
        this.active.setValue(value);
        return this;
    }

    /**
     * @return {@link #type} (The kind of organization that this is.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Organization.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The kind of organization that this is.)
     */
    public Organization setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #name} (A name associated with the organization.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Organization.name");
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
     * @param value {@link #name} (A name associated with the organization.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public Organization setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A name associated with the organization.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A name associated with the organization.
     */
    public Organization setName(String value) {
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
     * @return {@link #telecom} (A contact detail for the organization.)
     */
    public List<ContactPoint> getTelecom() {
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        return this.telecom;
    }

    public boolean hasTelecom() {
        if (this.telecom == null)
            return false;
        for (ContactPoint item : this.telecom) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #telecom} (A contact detail for the organization.)
     */
    // syntactic sugar
    public ContactPoint addTelecom() {
        // 3
        ContactPoint t = new ContactPoint();
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return t;
    }

    // syntactic sugar
    public Organization addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    /**
     * @return {@link #address} (An address for the organization.)
     */
    public List<Address> getAddress() {
        if (this.address == null)
            this.address = new ArrayList<Address>();
        return this.address;
    }

    public boolean hasAddress() {
        if (this.address == null)
            return false;
        for (Address item : this.address) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #address} (An address for the organization.)
     */
    // syntactic sugar
    public Address addAddress() {
        // 3
        Address t = new Address();
        if (this.address == null)
            this.address = new ArrayList<Address>();
        this.address.add(t);
        return t;
    }

    // syntactic sugar
    public Organization addAddress(Address t) {
        // 3
        if (t == null)
            return this;
        if (this.address == null)
            this.address = new ArrayList<Address>();
        this.address.add(t);
        return this;
    }

    /**
     * @return {@link #partOf} (The organization of which this organization forms a part.)
     */
    public Reference getPartOf() {
        if (this.partOf == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Organization.partOf");
            else if (Configuration.doAutoCreate())
                // cc
                this.partOf = new Reference();
        return this.partOf;
    }

    public boolean hasPartOf() {
        return this.partOf != null && !this.partOf.isEmpty();
    }

    /**
     * @param value {@link #partOf} (The organization of which this organization forms a part.)
     */
    public Organization setPartOf(Reference value) {
        this.partOf = value;
        return this;
    }

    /**
     * @return {@link #partOf} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization of which this organization forms a part.)
     */
    public Organization getPartOfTarget() {
        if (this.partOfTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Organization.partOf");
            else if (Configuration.doAutoCreate())
                // aa
                this.partOfTarget = new Organization();
        return this.partOfTarget;
    }

    /**
     * @param value {@link #partOf} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization of which this organization forms a part.)
     */
    public Organization setPartOfTarget(Organization value) {
        this.partOfTarget = value;
        return this;
    }

    /**
     * @return {@link #contact} (Contact for the organization for a certain purpose.)
     */
    public List<OrganizationContactComponent> getContact() {
        if (this.contact == null)
            this.contact = new ArrayList<OrganizationContactComponent>();
        return this.contact;
    }

    public boolean hasContact() {
        if (this.contact == null)
            return false;
        for (OrganizationContactComponent item : this.contact) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #contact} (Contact for the organization for a certain purpose.)
     */
    // syntactic sugar
    public OrganizationContactComponent addContact() {
        // 3
        OrganizationContactComponent t = new OrganizationContactComponent();
        if (this.contact == null)
            this.contact = new ArrayList<OrganizationContactComponent>();
        this.contact.add(t);
        return t;
    }

    // syntactic sugar
    public Organization addContact(OrganizationContactComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.contact == null)
            this.contact = new ArrayList<OrganizationContactComponent>();
        this.contact.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifier for the organization that is used to identify the organization across multiple disparate systems.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("active", "boolean", "Whether the organization's record is still in active use.", 0, java.lang.Integer.MAX_VALUE, active));
        childrenList.add(new Property("type", "CodeableConcept", "The kind of organization that this is.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("name", "string", "A name associated with the organization.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("telecom", "ContactPoint", "A contact detail for the organization.", 0, java.lang.Integer.MAX_VALUE, telecom));
        childrenList.add(new Property("address", "Address", "An address for the organization.", 0, java.lang.Integer.MAX_VALUE, address));
        childrenList.add(new Property("partOf", "Reference(Organization)", "The organization of which this organization forms a part.", 0, java.lang.Integer.MAX_VALUE, partOf));
        childrenList.add(new Property("contact", "", "Contact for the organization for a certain purpose.", 0, java.lang.Integer.MAX_VALUE, contact));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("active"))
            // BooleanType
            this.active = castToBoolean(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("telecom"))
            this.getTelecom().add(castToContactPoint(value));
        else if (name.equals("address"))
            this.getAddress().add(castToAddress(value));
        else if (name.equals("partOf"))
            // Reference
            this.partOf = castToReference(value);
        else if (name.equals("contact"))
            this.getContact().add((OrganizationContactComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("active")) {
            throw new FHIRException("Cannot call addChild on a primitive type Organization.active");
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type Organization.name");
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else if (name.equals("address")) {
            return addAddress();
        } else if (name.equals("partOf")) {
            this.partOf = new Reference();
            return this.partOf;
        } else if (name.equals("contact")) {
            return addContact();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Organization";
    }

    public Organization copy() {
        Organization dst = new Organization();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.active = active == null ? null : active.copy();
        dst.type = type == null ? null : type.copy();
        dst.name = name == null ? null : name.copy();
        if (telecom != null) {
            dst.telecom = new ArrayList<ContactPoint>();
            for (ContactPoint i : telecom) dst.telecom.add(i.copy());
        }
        ;
        if (address != null) {
            dst.address = new ArrayList<Address>();
            for (Address i : address) dst.address.add(i.copy());
        }
        ;
        dst.partOf = partOf == null ? null : partOf.copy();
        if (contact != null) {
            dst.contact = new ArrayList<OrganizationContactComponent>();
            for (OrganizationContactComponent i : contact) dst.contact.add(i.copy());
        }
        ;
        return dst;
    }

    protected Organization typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Organization))
            return false;
        Organization o = (Organization) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(active, o.active, true) && compareDeep(type, o.type, true) && compareDeep(name, o.name, true) && compareDeep(telecom, o.telecom, true) && compareDeep(address, o.address, true) && compareDeep(partOf, o.partOf, true) && compareDeep(contact, o.contact, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Organization))
            return false;
        Organization o = (Organization) other;
        return compareValues(active, o.active, true) && compareValues(name, o.name, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (active == null || active.isEmpty()) && (type == null || type.isEmpty()) && (name == null || name.isEmpty()) && (telecom == null || telecom.isEmpty()) && (address == null || address.isEmpty()) && (partOf == null || partOf.isEmpty()) && (contact == null || contact.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Organization;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PARTOF = "partof";

    public static final String SP_PHONETIC = "phonetic";

    public static final String SP_ADDRESS = "address";

    public static final String SP_ADDRESSSTATE = "address-state";

    public static final String SP_NAME = "name";

    public static final String SP_ADDRESSUSE = "address-use";

    public static final String SP_ACTIVE = "active";

    public static final String SP_TYPE = "type";

    public static final String SP_ADDRESSCITY = "address-city";

    public static final String SP_ADDRESSPOSTALCODE = "address-postalcode";

    public static final String SP_ADDRESSCOUNTRY = "address-country";
}
