package org.hl7.fhir.android.generated.dstu2;

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
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AddressEnum.AddressType;
import org.hl7.fhir.android.generated.dstu2.AddressEnum.AddressTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AddressEnum.AddressUse;
import org.hl7.fhir.android.generated.dstu2.AddressEnum.AddressUseEnumFactory;

/**
 * There is a variety of postal address formats defined around the world. This format defines a superset that is the basis for all addresses around the world.
 */
public class Address extends Type implements ICompositeType {

    /**
     * The purpose of this address.
     */
    protected Enumeration<AddressUse> use;

    /**
     * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
     */
    protected Enumeration<AddressType> type;

    /**
     * A full text representation of the address.
     */
    protected StringType text;

    /**
     * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.
     */
    protected List<StringType> line;

    /**
     * The name of the city, town, village or other community or delivery center.
     */
    protected StringType city;

    /**
     * The name of the administrative area (county).
     */
    protected StringType district;

    /**
     * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).
     */
    protected StringType state;

    /**
     * A postal code designating a region defined by the postal service.
     */
    protected StringType postalCode;

    /**
     * Country - a nation as commonly understood or generally accepted.
     */
    protected StringType country;

    /**
     * Time period when address was/is in use.
     */
    protected Period period;

    private static final long serialVersionUID = 561490318L;

    /*
   * Constructor
   */
    public Address() {
        super();
    }

    /**
     * @return {@link #use} (The purpose of this address.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Enumeration<AddressUse> getUseElement() {
        if (this.use == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Address.use");
            else if (Configuration.doAutoCreate())
                // bb
                this.use = new Enumeration<AddressUse>(new AddressUseEnumFactory());
        return this.use;
    }

    public boolean hasUseElement() {
        return this.use != null && !this.use.isEmpty();
    }

    public boolean hasUse() {
        return this.use != null && !this.use.isEmpty();
    }

    /**
     * @param value {@link #use} (The purpose of this address.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Address setUseElement(Enumeration<AddressUse> value) {
        this.use = value;
        return this;
    }

    /**
     * @return The purpose of this address.
     */
    public AddressUse getUse() {
        return this.use == null ? null : this.use.getValue();
    }

    /**
     * @param value The purpose of this address.
     */
    public Address setUse(AddressUse value) {
        if (value == null)
            this.use = null;
        else {
            if (this.use == null)
                this.use = new Enumeration<AddressUse>(new AddressUseEnumFactory());
            this.use.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<AddressType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Address.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<AddressType>(new AddressTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Address setTypeElement(Enumeration<AddressType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
     */
    public AddressType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
     */
    public Address setType(AddressType value) {
        if (value == null)
            this.type = null;
        else {
            if (this.type == null)
                this.type = new Enumeration<AddressType>(new AddressTypeEnumFactory());
            this.type.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #text} (A full text representation of the address.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public StringType getTextElement() {
        if (this.text == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Address.text");
            else if (Configuration.doAutoCreate())
                // bb
                this.text = new StringType();
        return this.text;
    }

    public boolean hasTextElement() {
        return this.text != null && !this.text.isEmpty();
    }

    public boolean hasText() {
        return this.text != null && !this.text.isEmpty();
    }

    /**
     * @param value {@link #text} (A full text representation of the address.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public Address setTextElement(StringType value) {
        this.text = value;
        return this;
    }

    /**
     * @return A full text representation of the address.
     */
    public String getText() {
        return this.text == null ? null : this.text.getValue();
    }

    /**
     * @param value A full text representation of the address.
     */
    public Address setText(String value) {
        if (Utilities.noString(value))
            this.text = null;
        else {
            if (this.text == null)
                this.text = new StringType();
            this.text.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #line} (This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.)
     */
    public List<StringType> getLine() {
        if (this.line == null)
            this.line = new ArrayList<StringType>();
        return this.line;
    }

    public boolean hasLine() {
        if (this.line == null)
            return false;
        for (StringType item : this.line) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #line} (This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.)
     */
    // syntactic sugar
    public StringType addLineElement() {
        // 2
        StringType t = new StringType();
        if (this.line == null)
            this.line = new ArrayList<StringType>();
        this.line.add(t);
        return t;
    }

    /**
     * @param value {@link #line} (This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.)
     */
    public Address addLine(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.line == null)
            this.line = new ArrayList<StringType>();
        this.line.add(t);
        return this;
    }

    /**
     * @param value {@link #line} (This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.)
     */
    public boolean hasLine(String value) {
        if (this.line == null)
            return false;
        for (StringType v : this.line) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #city} (The name of the city, town, village or other community or delivery center.). This is the underlying object with id, value and extensions. The accessor "getCity" gives direct access to the value
     */
    public StringType getCityElement() {
        if (this.city == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Address.city");
            else if (Configuration.doAutoCreate())
                // bb
                this.city = new StringType();
        return this.city;
    }

    public boolean hasCityElement() {
        return this.city != null && !this.city.isEmpty();
    }

    public boolean hasCity() {
        return this.city != null && !this.city.isEmpty();
    }

    /**
     * @param value {@link #city} (The name of the city, town, village or other community or delivery center.). This is the underlying object with id, value and extensions. The accessor "getCity" gives direct access to the value
     */
    public Address setCityElement(StringType value) {
        this.city = value;
        return this;
    }

    /**
     * @return The name of the city, town, village or other community or delivery center.
     */
    public String getCity() {
        return this.city == null ? null : this.city.getValue();
    }

    /**
     * @param value The name of the city, town, village or other community or delivery center.
     */
    public Address setCity(String value) {
        if (Utilities.noString(value))
            this.city = null;
        else {
            if (this.city == null)
                this.city = new StringType();
            this.city.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #district} (The name of the administrative area (county).). This is the underlying object with id, value and extensions. The accessor "getDistrict" gives direct access to the value
     */
    public StringType getDistrictElement() {
        if (this.district == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Address.district");
            else if (Configuration.doAutoCreate())
                // bb
                this.district = new StringType();
        return this.district;
    }

    public boolean hasDistrictElement() {
        return this.district != null && !this.district.isEmpty();
    }

    public boolean hasDistrict() {
        return this.district != null && !this.district.isEmpty();
    }

    /**
     * @param value {@link #district} (The name of the administrative area (county).). This is the underlying object with id, value and extensions. The accessor "getDistrict" gives direct access to the value
     */
    public Address setDistrictElement(StringType value) {
        this.district = value;
        return this;
    }

    /**
     * @return The name of the administrative area (county).
     */
    public String getDistrict() {
        return this.district == null ? null : this.district.getValue();
    }

    /**
     * @param value The name of the administrative area (county).
     */
    public Address setDistrict(String value) {
        if (Utilities.noString(value))
            this.district = null;
        else {
            if (this.district == null)
                this.district = new StringType();
            this.district.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #state} (Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).). This is the underlying object with id, value and extensions. The accessor "getState" gives direct access to the value
     */
    public StringType getStateElement() {
        if (this.state == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Address.state");
            else if (Configuration.doAutoCreate())
                // bb
                this.state = new StringType();
        return this.state;
    }

    public boolean hasStateElement() {
        return this.state != null && !this.state.isEmpty();
    }

    public boolean hasState() {
        return this.state != null && !this.state.isEmpty();
    }

    /**
     * @param value {@link #state} (Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).). This is the underlying object with id, value and extensions. The accessor "getState" gives direct access to the value
     */
    public Address setStateElement(StringType value) {
        this.state = value;
        return this;
    }

    /**
     * @return Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).
     */
    public String getState() {
        return this.state == null ? null : this.state.getValue();
    }

    /**
     * @param value Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).
     */
    public Address setState(String value) {
        if (Utilities.noString(value))
            this.state = null;
        else {
            if (this.state == null)
                this.state = new StringType();
            this.state.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #postalCode} (A postal code designating a region defined by the postal service.). This is the underlying object with id, value and extensions. The accessor "getPostalCode" gives direct access to the value
     */
    public StringType getPostalCodeElement() {
        if (this.postalCode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Address.postalCode");
            else if (Configuration.doAutoCreate())
                // bb
                this.postalCode = new StringType();
        return this.postalCode;
    }

    public boolean hasPostalCodeElement() {
        return this.postalCode != null && !this.postalCode.isEmpty();
    }

    public boolean hasPostalCode() {
        return this.postalCode != null && !this.postalCode.isEmpty();
    }

    /**
     * @param value {@link #postalCode} (A postal code designating a region defined by the postal service.). This is the underlying object with id, value and extensions. The accessor "getPostalCode" gives direct access to the value
     */
    public Address setPostalCodeElement(StringType value) {
        this.postalCode = value;
        return this;
    }

    /**
     * @return A postal code designating a region defined by the postal service.
     */
    public String getPostalCode() {
        return this.postalCode == null ? null : this.postalCode.getValue();
    }

    /**
     * @param value A postal code designating a region defined by the postal service.
     */
    public Address setPostalCode(String value) {
        if (Utilities.noString(value))
            this.postalCode = null;
        else {
            if (this.postalCode == null)
                this.postalCode = new StringType();
            this.postalCode.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #country} (Country - a nation as commonly understood or generally accepted.). This is the underlying object with id, value and extensions. The accessor "getCountry" gives direct access to the value
     */
    public StringType getCountryElement() {
        if (this.country == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Address.country");
            else if (Configuration.doAutoCreate())
                // bb
                this.country = new StringType();
        return this.country;
    }

    public boolean hasCountryElement() {
        return this.country != null && !this.country.isEmpty();
    }

    public boolean hasCountry() {
        return this.country != null && !this.country.isEmpty();
    }

    /**
     * @param value {@link #country} (Country - a nation as commonly understood or generally accepted.). This is the underlying object with id, value and extensions. The accessor "getCountry" gives direct access to the value
     */
    public Address setCountryElement(StringType value) {
        this.country = value;
        return this;
    }

    /**
     * @return Country - a nation as commonly understood or generally accepted.
     */
    public String getCountry() {
        return this.country == null ? null : this.country.getValue();
    }

    /**
     * @param value Country - a nation as commonly understood or generally accepted.
     */
    public Address setCountry(String value) {
        if (Utilities.noString(value))
            this.country = null;
        else {
            if (this.country == null)
                this.country = new StringType();
            this.country.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #period} (Time period when address was/is in use.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Address.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Time period when address was/is in use.)
     */
    public Address setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("use", "code", "The purpose of this address.", 0, java.lang.Integer.MAX_VALUE, use));
        childrenList.add(new Property("type", "code", "Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("text", "string", "A full text representation of the address.", 0, java.lang.Integer.MAX_VALUE, text));
        childrenList.add(new Property("line", "string", "This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.", 0, java.lang.Integer.MAX_VALUE, line));
        childrenList.add(new Property("city", "string", "The name of the city, town, village or other community or delivery center.", 0, java.lang.Integer.MAX_VALUE, city));
        childrenList.add(new Property("district", "string", "The name of the administrative area (county).", 0, java.lang.Integer.MAX_VALUE, district));
        childrenList.add(new Property("state", "string", "Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).", 0, java.lang.Integer.MAX_VALUE, state));
        childrenList.add(new Property("postalCode", "string", "A postal code designating a region defined by the postal service.", 0, java.lang.Integer.MAX_VALUE, postalCode));
        childrenList.add(new Property("country", "string", "Country - a nation as commonly understood or generally accepted.", 0, java.lang.Integer.MAX_VALUE, country));
        childrenList.add(new Property("period", "Period", "Time period when address was/is in use.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("use"))
            // Enumeration<AddressUse>
            this.use = new AddressUseEnumFactory().fromType(value);
        else if (name.equals("type"))
            // Enumeration<AddressType>
            this.type = new AddressTypeEnumFactory().fromType(value);
        else if (name.equals("text"))
            // StringType
            this.text = castToString(value);
        else if (name.equals("line"))
            this.getLine().add(castToString(value));
        else if (name.equals("city"))
            // StringType
            this.city = castToString(value);
        else if (name.equals("district"))
            // StringType
            this.district = castToString(value);
        else if (name.equals("state"))
            // StringType
            this.state = castToString(value);
        else if (name.equals("postalCode"))
            // StringType
            this.postalCode = castToString(value);
        else if (name.equals("country"))
            // StringType
            this.country = castToString(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("use")) {
            throw new FHIRException("Cannot call addChild on a primitive type Address.use");
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Address.type");
        } else if (name.equals("text")) {
            throw new FHIRException("Cannot call addChild on a primitive type Address.text");
        } else if (name.equals("line")) {
            throw new FHIRException("Cannot call addChild on a primitive type Address.line");
        } else if (name.equals("city")) {
            throw new FHIRException("Cannot call addChild on a primitive type Address.city");
        } else if (name.equals("district")) {
            throw new FHIRException("Cannot call addChild on a primitive type Address.district");
        } else if (name.equals("state")) {
            throw new FHIRException("Cannot call addChild on a primitive type Address.state");
        } else if (name.equals("postalCode")) {
            throw new FHIRException("Cannot call addChild on a primitive type Address.postalCode");
        } else if (name.equals("country")) {
            throw new FHIRException("Cannot call addChild on a primitive type Address.country");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Address";
    }

    public Address copy() {
        Address dst = new Address();
        copyValues(dst);
        dst.use = use == null ? null : use.copy();
        dst.type = type == null ? null : type.copy();
        dst.text = text == null ? null : text.copy();
        if (line != null) {
            dst.line = new ArrayList<StringType>();
            for (StringType i : line) dst.line.add(i.copy());
        }
        ;
        dst.city = city == null ? null : city.copy();
        dst.district = district == null ? null : district.copy();
        dst.state = state == null ? null : state.copy();
        dst.postalCode = postalCode == null ? null : postalCode.copy();
        dst.country = country == null ? null : country.copy();
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    protected Address typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Address))
            return false;
        Address o = (Address) other;
        return compareDeep(use, o.use, true) && compareDeep(type, o.type, true) && compareDeep(text, o.text, true) && compareDeep(line, o.line, true) && compareDeep(city, o.city, true) && compareDeep(district, o.district, true) && compareDeep(state, o.state, true) && compareDeep(postalCode, o.postalCode, true) && compareDeep(country, o.country, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Address))
            return false;
        Address o = (Address) other;
        return compareValues(use, o.use, true) && compareValues(type, o.type, true) && compareValues(text, o.text, true) && compareValues(line, o.line, true) && compareValues(city, o.city, true) && compareValues(district, o.district, true) && compareValues(state, o.state, true) && compareValues(postalCode, o.postalCode, true) && compareValues(country, o.country, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (use == null || use.isEmpty()) && (type == null || type.isEmpty()) && (text == null || text.isEmpty()) && (line == null || line.isEmpty()) && (city == null || city.isEmpty()) && (district == null || district.isEmpty()) && (state == null || state.isEmpty()) && (postalCode == null || postalCode.isEmpty()) && (country == null || country.isEmpty()) && (period == null || period.isEmpty());
    }
}
