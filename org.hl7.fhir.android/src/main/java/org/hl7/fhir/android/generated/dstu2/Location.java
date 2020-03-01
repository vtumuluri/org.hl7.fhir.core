package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationStatus;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationMode;
import org.hl7.fhir.android.generated.dstu2.LocationEnum.LocationModeEnumFactory;

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
 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
 */
public class Location extends DomainResource {

    /**
     * Unique code or number identifying the location to its users.
     */
    protected List<Identifier> identifier;

    /**
     * active | suspended | inactive.
     */
    protected Enumeration<LocationStatus> status;

    /**
     * Name of the location as used by humans. Does not need to be unique.
     */
    protected StringType name;

    /**
     * Description of the Location, which helps in finding or referencing the place.
     */
    protected StringType description;

    /**
     * Indicates whether a resource instance represents a specific location or a class of locations.
     */
    protected Enumeration<LocationMode> mode;

    /**
     * Indicates the type of function performed at the location.
     */
    protected CodeableConcept type;

    /**
     * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
     */
    protected List<ContactPoint> telecom;

    /**
     * Physical location.
     */
    protected Address address;

    /**
     * Physical form of the location, e.g. building, room, vehicle, road.
     */
    protected CodeableConcept physicalType;

    /**
     * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).
     */
    protected LocationPositionComponent position;

    /**
     * The organization responsible for the provisioning and upkeep of the location.
     */
    protected Reference managingOrganization;

    /**
     * The actual object that is the target of the reference (The organization responsible for the provisioning and upkeep of the location.)
     */
    protected Organization managingOrganizationTarget;

    /**
     * Another Location which this Location is physically part of.
     */
    protected Reference partOf;

    /**
     * The actual object that is the target of the reference (Another Location which this Location is physically part of.)
     */
    protected Location partOfTarget;

    private static final long serialVersionUID = -2100435761L;

    /*
   * Constructor
   */
    public Location() {
        super();
    }

    /**
     * @return {@link #identifier} (Unique code or number identifying the location to its users.)
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
     * @return {@link #identifier} (Unique code or number identifying the location to its users.)
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
    public Location addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #status} (active | suspended | inactive.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<LocationStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<LocationStatus>(new LocationStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (active | suspended | inactive.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Location setStatusElement(Enumeration<LocationStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return active | suspended | inactive.
     */
    public LocationStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value active | suspended | inactive.
     */
    public Location setStatus(LocationStatus value) {
        if (value == null)
            this.status = null;
        else {
            if (this.status == null)
                this.status = new Enumeration<LocationStatus>(new LocationStatusEnumFactory());
            this.status.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #name} (Name of the location as used by humans. Does not need to be unique.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.name");
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
     * @param value {@link #name} (Name of the location as used by humans. Does not need to be unique.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public Location setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return Name of the location as used by humans. Does not need to be unique.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Name of the location as used by humans. Does not need to be unique.
     */
    public Location setName(String value) {
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
     * @return {@link #description} (Description of the Location, which helps in finding or referencing the place.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.description");
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
     * @param value {@link #description} (Description of the Location, which helps in finding or referencing the place.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Location setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Description of the Location, which helps in finding or referencing the place.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Description of the Location, which helps in finding or referencing the place.
     */
    public Location setDescription(String value) {
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
     * @return {@link #mode} (Indicates whether a resource instance represents a specific location or a class of locations.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public Enumeration<LocationMode> getModeElement() {
        if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.mode");
            else if (Configuration.doAutoCreate())
                // bb
                this.mode = new Enumeration<LocationMode>(new LocationModeEnumFactory());
        return this.mode;
    }

    public boolean hasModeElement() {
        return this.mode != null && !this.mode.isEmpty();
    }

    public boolean hasMode() {
        return this.mode != null && !this.mode.isEmpty();
    }

    /**
     * @param value {@link #mode} (Indicates whether a resource instance represents a specific location or a class of locations.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public Location setModeElement(Enumeration<LocationMode> value) {
        this.mode = value;
        return this;
    }

    /**
     * @return Indicates whether a resource instance represents a specific location or a class of locations.
     */
    public LocationMode getMode() {
        return this.mode == null ? null : this.mode.getValue();
    }

    /**
     * @param value Indicates whether a resource instance represents a specific location or a class of locations.
     */
    public Location setMode(LocationMode value) {
        if (value == null)
            this.mode = null;
        else {
            if (this.mode == null)
                this.mode = new Enumeration<LocationMode>(new LocationModeEnumFactory());
            this.mode.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (Indicates the type of function performed at the location.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Indicates the type of function performed at the location.)
     */
    public Location setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #telecom} (The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.)
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
     * @return {@link #telecom} (The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.)
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
    public Location addTelecom(ContactPoint t) {
        // 3
        if (t == null)
            return this;
        if (this.telecom == null)
            this.telecom = new ArrayList<ContactPoint>();
        this.telecom.add(t);
        return this;
    }

    /**
     * @return {@link #address} (Physical location.)
     */
    public Address getAddress() {
        if (this.address == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.address");
            else if (Configuration.doAutoCreate())
                // cc
                this.address = new Address();
        return this.address;
    }

    public boolean hasAddress() {
        return this.address != null && !this.address.isEmpty();
    }

    /**
     * @param value {@link #address} (Physical location.)
     */
    public Location setAddress(Address value) {
        this.address = value;
        return this;
    }

    /**
     * @return {@link #physicalType} (Physical form of the location, e.g. building, room, vehicle, road.)
     */
    public CodeableConcept getPhysicalType() {
        if (this.physicalType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.physicalType");
            else if (Configuration.doAutoCreate())
                // cc
                this.physicalType = new CodeableConcept();
        return this.physicalType;
    }

    public boolean hasPhysicalType() {
        return this.physicalType != null && !this.physicalType.isEmpty();
    }

    /**
     * @param value {@link #physicalType} (Physical form of the location, e.g. building, room, vehicle, road.)
     */
    public Location setPhysicalType(CodeableConcept value) {
        this.physicalType = value;
        return this;
    }

    /**
     * @return {@link #position} (The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).)
     */
    public LocationPositionComponent getPosition() {
        if (this.position == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.position");
            else if (Configuration.doAutoCreate())
                // cc
                this.position = new LocationPositionComponent();
        return this.position;
    }

    public boolean hasPosition() {
        return this.position != null && !this.position.isEmpty();
    }

    /**
     * @param value {@link #position} (The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).)
     */
    public Location setPosition(LocationPositionComponent value) {
        this.position = value;
        return this;
    }

    /**
     * @return {@link #managingOrganization} (The organization responsible for the provisioning and upkeep of the location.)
     */
    public Reference getManagingOrganization() {
        if (this.managingOrganization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.managingOrganization");
            else if (Configuration.doAutoCreate())
                // cc
                this.managingOrganization = new Reference();
        return this.managingOrganization;
    }

    public boolean hasManagingOrganization() {
        return this.managingOrganization != null && !this.managingOrganization.isEmpty();
    }

    /**
     * @param value {@link #managingOrganization} (The organization responsible for the provisioning and upkeep of the location.)
     */
    public Location setManagingOrganization(Reference value) {
        this.managingOrganization = value;
        return this;
    }

    /**
     * @return {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization responsible for the provisioning and upkeep of the location.)
     */
    public Organization getManagingOrganizationTarget() {
        if (this.managingOrganizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.managingOrganization");
            else if (Configuration.doAutoCreate())
                // aa
                this.managingOrganizationTarget = new Organization();
        return this.managingOrganizationTarget;
    }

    /**
     * @param value {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization responsible for the provisioning and upkeep of the location.)
     */
    public Location setManagingOrganizationTarget(Organization value) {
        this.managingOrganizationTarget = value;
        return this;
    }

    /**
     * @return {@link #partOf} (Another Location which this Location is physically part of.)
     */
    public Reference getPartOf() {
        if (this.partOf == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.partOf");
            else if (Configuration.doAutoCreate())
                // cc
                this.partOf = new Reference();
        return this.partOf;
    }

    public boolean hasPartOf() {
        return this.partOf != null && !this.partOf.isEmpty();
    }

    /**
     * @param value {@link #partOf} (Another Location which this Location is physically part of.)
     */
    public Location setPartOf(Reference value) {
        this.partOf = value;
        return this;
    }

    /**
     * @return {@link #partOf} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Another Location which this Location is physically part of.)
     */
    public Location getPartOfTarget() {
        if (this.partOfTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Location.partOf");
            else if (Configuration.doAutoCreate())
                // aa
                this.partOfTarget = new Location();
        return this.partOfTarget;
    }

    /**
     * @param value {@link #partOf} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Another Location which this Location is physically part of.)
     */
    public Location setPartOfTarget(Location value) {
        this.partOfTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Unique code or number identifying the location to its users.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "active | suspended | inactive.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("name", "string", "Name of the location as used by humans. Does not need to be unique.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("description", "string", "Description of the Location, which helps in finding or referencing the place.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("mode", "code", "Indicates whether a resource instance represents a specific location or a class of locations.", 0, java.lang.Integer.MAX_VALUE, mode));
        childrenList.add(new Property("type", "CodeableConcept", "Indicates the type of function performed at the location.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("telecom", "ContactPoint", "The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.", 0, java.lang.Integer.MAX_VALUE, telecom));
        childrenList.add(new Property("address", "Address", "Physical location.", 0, java.lang.Integer.MAX_VALUE, address));
        childrenList.add(new Property("physicalType", "CodeableConcept", "Physical form of the location, e.g. building, room, vehicle, road.", 0, java.lang.Integer.MAX_VALUE, physicalType));
        childrenList.add(new Property("position", "", "The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).", 0, java.lang.Integer.MAX_VALUE, position));
        childrenList.add(new Property("managingOrganization", "Reference(Organization)", "The organization responsible for the provisioning and upkeep of the location.", 0, java.lang.Integer.MAX_VALUE, managingOrganization));
        childrenList.add(new Property("partOf", "Reference(Location)", "Another Location which this Location is physically part of.", 0, java.lang.Integer.MAX_VALUE, partOf));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
            // Enumeration<LocationStatus>
            this.status = new LocationStatusEnumFactory().fromType(value);
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("mode"))
            // Enumeration<LocationMode>
            this.mode = new LocationModeEnumFactory().fromType(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("telecom"))
            this.getTelecom().add(castToContactPoint(value));
        else if (name.equals("address"))
            // Address
            this.address = castToAddress(value);
        else if (name.equals("physicalType"))
            // CodeableConcept
            this.physicalType = castToCodeableConcept(value);
        else if (name.equals("position"))
            // LocationPositionComponent
            this.position = (LocationPositionComponent) value;
        else if (name.equals("managingOrganization"))
            // Reference
            this.managingOrganization = castToReference(value);
        else if (name.equals("partOf"))
            // Reference
            this.partOf = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Location.status");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type Location.name");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type Location.description");
        } else if (name.equals("mode")) {
            throw new FHIRException("Cannot call addChild on a primitive type Location.mode");
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("telecom")) {
            return addTelecom();
        } else if (name.equals("address")) {
            this.address = new Address();
            return this.address;
        } else if (name.equals("physicalType")) {
            this.physicalType = new CodeableConcept();
            return this.physicalType;
        } else if (name.equals("position")) {
            this.position = new LocationPositionComponent();
            return this.position;
        } else if (name.equals("managingOrganization")) {
            this.managingOrganization = new Reference();
            return this.managingOrganization;
        } else if (name.equals("partOf")) {
            this.partOf = new Reference();
            return this.partOf;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Location";
    }

    public Location copy() {
        Location dst = new Location();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.status = status == null ? null : status.copy();
        dst.name = name == null ? null : name.copy();
        dst.description = description == null ? null : description.copy();
        dst.mode = mode == null ? null : mode.copy();
        dst.type = type == null ? null : type.copy();
        if (telecom != null) {
            dst.telecom = new ArrayList<ContactPoint>();
            for (ContactPoint i : telecom) dst.telecom.add(i.copy());
        }
        ;
        dst.address = address == null ? null : address.copy();
        dst.physicalType = physicalType == null ? null : physicalType.copy();
        dst.position = position == null ? null : position.copy();
        dst.managingOrganization = managingOrganization == null ? null : managingOrganization.copy();
        dst.partOf = partOf == null ? null : partOf.copy();
        return dst;
    }

    protected Location typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Location))
            return false;
        Location o = (Location) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(name, o.name, true) && compareDeep(description, o.description, true) && compareDeep(mode, o.mode, true) && compareDeep(type, o.type, true) && compareDeep(telecom, o.telecom, true) && compareDeep(address, o.address, true) && compareDeep(physicalType, o.physicalType, true) && compareDeep(position, o.position, true) && compareDeep(managingOrganization, o.managingOrganization, true) && compareDeep(partOf, o.partOf, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Location))
            return false;
        Location o = (Location) other;
        return compareValues(status, o.status, true) && compareValues(name, o.name, true) && compareValues(description, o.description, true) && compareValues(mode, o.mode, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (status == null || status.isEmpty()) && (name == null || name.isEmpty()) && (description == null || description.isEmpty()) && (mode == null || mode.isEmpty()) && (type == null || type.isEmpty()) && (telecom == null || telecom.isEmpty()) && (address == null || address.isEmpty()) && (physicalType == null || physicalType.isEmpty()) && (position == null || position.isEmpty()) && (managingOrganization == null || managingOrganization.isEmpty()) && (partOf == null || partOf.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Location;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PARTOF = "partof";

    public static final String SP_NEARDISTANCE = "near-distance";

    public static final String SP_ADDRESS = "address";

    public static final String SP_ADDRESSSTATE = "address-state";

    public static final String SP_TYPE = "type";

    public static final String SP_ADDRESSPOSTALCODE = "address-postalcode";

    public static final String SP_ADDRESSCOUNTRY = "address-country";

    public static final String SP_ORGANIZATION = "organization";

    public static final String SP_NAME = "name";

    public static final String SP_ADDRESSUSE = "address-use";

    public static final String SP_NEAR = "near";

    public static final String SP_ADDRESSCITY = "address-city";

    public static final String SP_STATUS = "status";
}
