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
import org.hl7.fhir.android.generated.dstu2.HumanNameEnum.NameUse;
import org.hl7.fhir.android.generated.dstu2.HumanNameEnum.NameUseEnumFactory;

/**
 * A human's name with the ability to identify parts and usage.
 */
public class HumanName extends Type implements ICompositeType {

    /**
     * Identifies the purpose for this name.
     */
    protected Enumeration<NameUse> use;

    /**
     * A full text representation of the name.
     */
    protected StringType text;

    /**
     * The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.
     */
    protected List<StringType> family;

    /**
     * Given name.
     */
    protected List<StringType> given;

    /**
     * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.
     */
    protected List<StringType> prefix;

    /**
     * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.
     */
    protected List<StringType> suffix;

    /**
     * Indicates the period of time when this name was valid for the named person.
     */
    protected Period period;

    private static final long serialVersionUID = -210174642L;

    /*
   * Constructor
   */
    public HumanName() {
        super();
    }

    /**
     * @return {@link #use} (Identifies the purpose for this name.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Enumeration<NameUse> getUseElement() {
        if (this.use == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HumanName.use");
            else if (Configuration.doAutoCreate())
                // bb
                this.use = new Enumeration<NameUse>(new NameUseEnumFactory());
        return this.use;
    }

    public boolean hasUseElement() {
        return this.use != null && !this.use.isEmpty();
    }

    public boolean hasUse() {
        return this.use != null && !this.use.isEmpty();
    }

    /**
     * @param value {@link #use} (Identifies the purpose for this name.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public HumanName setUseElement(Enumeration<NameUse> value) {
        this.use = value;
        return this;
    }

    /**
     * @return Identifies the purpose for this name.
     */
    public NameUse getUse() {
        return this.use == null ? null : this.use.getValue();
    }

    /**
     * @param value Identifies the purpose for this name.
     */
    public HumanName setUse(NameUse value) {
        if (value == null)
            this.use = null;
        else {
            if (this.use == null)
                this.use = new Enumeration<NameUse>(new NameUseEnumFactory());
            this.use.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #text} (A full text representation of the name.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public StringType getTextElement() {
        if (this.text == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HumanName.text");
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
     * @param value {@link #text} (A full text representation of the name.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public HumanName setTextElement(StringType value) {
        this.text = value;
        return this;
    }

    /**
     * @return A full text representation of the name.
     */
    public String getText() {
        return this.text == null ? null : this.text.getValue();
    }

    /**
     * @param value A full text representation of the name.
     */
    public HumanName setText(String value) {
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
     * @return {@link #family} (The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.)
     */
    public List<StringType> getFamily() {
        if (this.family == null)
            this.family = new ArrayList<StringType>();
        return this.family;
    }

    public boolean hasFamily() {
        if (this.family == null)
            return false;
        for (StringType item : this.family) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #family} (The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.)
     */
    // syntactic sugar
    public StringType addFamilyElement() {
        // 2
        StringType t = new StringType();
        if (this.family == null)
            this.family = new ArrayList<StringType>();
        this.family.add(t);
        return t;
    }

    /**
     * @param value {@link #family} (The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.)
     */
    public HumanName addFamily(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.family == null)
            this.family = new ArrayList<StringType>();
        this.family.add(t);
        return this;
    }

    /**
     * @param value {@link #family} (The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.)
     */
    public boolean hasFamily(String value) {
        if (this.family == null)
            return false;
        for (StringType v : this.family) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #given} (Given name.)
     */
    public List<StringType> getGiven() {
        if (this.given == null)
            this.given = new ArrayList<StringType>();
        return this.given;
    }

    public boolean hasGiven() {
        if (this.given == null)
            return false;
        for (StringType item : this.given) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #given} (Given name.)
     */
    // syntactic sugar
    public StringType addGivenElement() {
        // 2
        StringType t = new StringType();
        if (this.given == null)
            this.given = new ArrayList<StringType>();
        this.given.add(t);
        return t;
    }

    /**
     * @param value {@link #given} (Given name.)
     */
    public HumanName addGiven(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.given == null)
            this.given = new ArrayList<StringType>();
        this.given.add(t);
        return this;
    }

    /**
     * @param value {@link #given} (Given name.)
     */
    public boolean hasGiven(String value) {
        if (this.given == null)
            return false;
        for (StringType v : this.given) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #prefix} (Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.)
     */
    public List<StringType> getPrefix() {
        if (this.prefix == null)
            this.prefix = new ArrayList<StringType>();
        return this.prefix;
    }

    public boolean hasPrefix() {
        if (this.prefix == null)
            return false;
        for (StringType item : this.prefix) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #prefix} (Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.)
     */
    // syntactic sugar
    public StringType addPrefixElement() {
        // 2
        StringType t = new StringType();
        if (this.prefix == null)
            this.prefix = new ArrayList<StringType>();
        this.prefix.add(t);
        return t;
    }

    /**
     * @param value {@link #prefix} (Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.)
     */
    public HumanName addPrefix(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.prefix == null)
            this.prefix = new ArrayList<StringType>();
        this.prefix.add(t);
        return this;
    }

    /**
     * @param value {@link #prefix} (Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.)
     */
    public boolean hasPrefix(String value) {
        if (this.prefix == null)
            return false;
        for (StringType v : this.prefix) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #suffix} (Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.)
     */
    public List<StringType> getSuffix() {
        if (this.suffix == null)
            this.suffix = new ArrayList<StringType>();
        return this.suffix;
    }

    public boolean hasSuffix() {
        if (this.suffix == null)
            return false;
        for (StringType item : this.suffix) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #suffix} (Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.)
     */
    // syntactic sugar
    public StringType addSuffixElement() {
        // 2
        StringType t = new StringType();
        if (this.suffix == null)
            this.suffix = new ArrayList<StringType>();
        this.suffix.add(t);
        return t;
    }

    /**
     * @param value {@link #suffix} (Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.)
     */
    public HumanName addSuffix(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.suffix == null)
            this.suffix = new ArrayList<StringType>();
        this.suffix.add(t);
        return this;
    }

    /**
     * @param value {@link #suffix} (Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.)
     */
    public boolean hasSuffix(String value) {
        if (this.suffix == null)
            return false;
        for (StringType v : this.suffix) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #period} (Indicates the period of time when this name was valid for the named person.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create HumanName.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Indicates the period of time when this name was valid for the named person.)
     */
    public HumanName setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("use", "code", "Identifies the purpose for this name.", 0, java.lang.Integer.MAX_VALUE, use));
        childrenList.add(new Property("text", "string", "A full text representation of the name.", 0, java.lang.Integer.MAX_VALUE, text));
        childrenList.add(new Property("family", "string", "The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.", 0, java.lang.Integer.MAX_VALUE, family));
        childrenList.add(new Property("given", "string", "Given name.", 0, java.lang.Integer.MAX_VALUE, given));
        childrenList.add(new Property("prefix", "string", "Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.", 0, java.lang.Integer.MAX_VALUE, prefix));
        childrenList.add(new Property("suffix", "string", "Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.", 0, java.lang.Integer.MAX_VALUE, suffix));
        childrenList.add(new Property("period", "Period", "Indicates the period of time when this name was valid for the named person.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("use"))
            // Enumeration<NameUse>
            this.use = new NameUseEnumFactory().fromType(value);
        else if (name.equals("text"))
            // StringType
            this.text = castToString(value);
        else if (name.equals("family"))
            this.getFamily().add(castToString(value));
        else if (name.equals("given"))
            this.getGiven().add(castToString(value));
        else if (name.equals("prefix"))
            this.getPrefix().add(castToString(value));
        else if (name.equals("suffix"))
            this.getSuffix().add(castToString(value));
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("use")) {
            throw new FHIRException("Cannot call addChild on a primitive type HumanName.use");
        } else if (name.equals("text")) {
            throw new FHIRException("Cannot call addChild on a primitive type HumanName.text");
        } else if (name.equals("family")) {
            throw new FHIRException("Cannot call addChild on a primitive type HumanName.family");
        } else if (name.equals("given")) {
            throw new FHIRException("Cannot call addChild on a primitive type HumanName.given");
        } else if (name.equals("prefix")) {
            throw new FHIRException("Cannot call addChild on a primitive type HumanName.prefix");
        } else if (name.equals("suffix")) {
            throw new FHIRException("Cannot call addChild on a primitive type HumanName.suffix");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "HumanName";
    }

    public HumanName copy() {
        HumanName dst = new HumanName();
        copyValues(dst);
        dst.use = use == null ? null : use.copy();
        dst.text = text == null ? null : text.copy();
        if (family != null) {
            dst.family = new ArrayList<StringType>();
            for (StringType i : family) dst.family.add(i.copy());
        }
        ;
        if (given != null) {
            dst.given = new ArrayList<StringType>();
            for (StringType i : given) dst.given.add(i.copy());
        }
        ;
        if (prefix != null) {
            dst.prefix = new ArrayList<StringType>();
            for (StringType i : prefix) dst.prefix.add(i.copy());
        }
        ;
        if (suffix != null) {
            dst.suffix = new ArrayList<StringType>();
            for (StringType i : suffix) dst.suffix.add(i.copy());
        }
        ;
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    protected HumanName typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof HumanName))
            return false;
        HumanName o = (HumanName) other;
        return compareDeep(use, o.use, true) && compareDeep(text, o.text, true) && compareDeep(family, o.family, true) && compareDeep(given, o.given, true) && compareDeep(prefix, o.prefix, true) && compareDeep(suffix, o.suffix, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof HumanName))
            return false;
        HumanName o = (HumanName) other;
        return compareValues(use, o.use, true) && compareValues(text, o.text, true) && compareValues(family, o.family, true) && compareValues(given, o.given, true) && compareValues(prefix, o.prefix, true) && compareValues(suffix, o.suffix, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (use == null || use.isEmpty()) && (text == null || text.isEmpty()) && (family == null || family.isEmpty()) && (given == null || given.isEmpty()) && (prefix == null || prefix.isEmpty()) && (suffix == null || suffix.isEmpty()) && (period == null || period.isEmpty());
    }
}
