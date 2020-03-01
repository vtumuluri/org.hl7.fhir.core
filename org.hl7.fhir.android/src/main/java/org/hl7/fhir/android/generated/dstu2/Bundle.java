package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerb;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerbEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleType;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryMode;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryModeEnumFactory;

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
 * A container for a collection of resources.
 */
public class Bundle extends Resource implements IBaseBundle {

    /**
     * Indicates the purpose of this bundle- how it was intended to be used.
     */
    protected Enumeration<BundleType> type;

    /**
     * If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle).
     */
    protected UnsignedIntType total;

    /**
     * A series of links that provide context to this bundle.
     */
    protected List<BundleLinkComponent> link;

    /**
     * An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only).
     */
    protected List<BundleEntryComponent> entry;

    /**
     * Digital Signature - base64 encoded. XML DigSIg or a JWT.
     */
    protected Signature signature;

    private static final long serialVersionUID = -2041954721L;

    /*
   * Constructor
   */
    public Bundle() {
        super();
    }

    /*
   * Constructor
   */
    public Bundle(Enumeration<BundleType> type) {
        super();
        this.type = type;
    }

    /**
     * @return {@link #type} (Indicates the purpose of this bundle- how it was intended to be used.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<BundleType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Bundle.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<BundleType>(new BundleTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Indicates the purpose of this bundle- how it was intended to be used.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Bundle setTypeElement(Enumeration<BundleType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return Indicates the purpose of this bundle- how it was intended to be used.
     */
    public BundleType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Indicates the purpose of this bundle- how it was intended to be used.
     */
    public Bundle setType(BundleType value) {
        if (this.type == null)
            this.type = new Enumeration<BundleType>(new BundleTypeEnumFactory());
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #total} (If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle).). This is the underlying object with id, value and extensions. The accessor "getTotal" gives direct access to the value
     */
    public UnsignedIntType getTotalElement() {
        if (this.total == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Bundle.total");
            else if (Configuration.doAutoCreate())
                // bb
                this.total = new UnsignedIntType();
        return this.total;
    }

    public boolean hasTotalElement() {
        return this.total != null && !this.total.isEmpty();
    }

    public boolean hasTotal() {
        return this.total != null && !this.total.isEmpty();
    }

    /**
     * @param value {@link #total} (If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle).). This is the underlying object with id, value and extensions. The accessor "getTotal" gives direct access to the value
     */
    public Bundle setTotalElement(UnsignedIntType value) {
        this.total = value;
        return this;
    }

    /**
     * @return If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle).
     */
    public int getTotal() {
        return this.total == null || this.total.isEmpty() ? 0 : this.total.getValue();
    }

    /**
     * @param value If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle).
     */
    public Bundle setTotal(int value) {
        if (this.total == null)
            this.total = new UnsignedIntType();
        this.total.setValue(value);
        return this;
    }

    /**
     * @return {@link #link} (A series of links that provide context to this bundle.)
     */
    public List<BundleLinkComponent> getLink() {
        if (this.link == null)
            this.link = new ArrayList<BundleLinkComponent>();
        return this.link;
    }

    public boolean hasLink() {
        if (this.link == null)
            return false;
        for (BundleLinkComponent item : this.link) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #link} (A series of links that provide context to this bundle.)
     */
    // syntactic sugar
    public BundleLinkComponent addLink() {
        // 3
        BundleLinkComponent t = new BundleLinkComponent();
        if (this.link == null)
            this.link = new ArrayList<BundleLinkComponent>();
        this.link.add(t);
        return t;
    }

    // syntactic sugar
    public Bundle addLink(BundleLinkComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.link == null)
            this.link = new ArrayList<BundleLinkComponent>();
        this.link.add(t);
        return this;
    }

    /**
     * @return {@link #entry} (An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only).)
     */
    public List<BundleEntryComponent> getEntry() {
        if (this.entry == null)
            this.entry = new ArrayList<BundleEntryComponent>();
        return this.entry;
    }

    public boolean hasEntry() {
        if (this.entry == null)
            return false;
        for (BundleEntryComponent item : this.entry) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #entry} (An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only).)
     */
    // syntactic sugar
    public BundleEntryComponent addEntry() {
        // 3
        BundleEntryComponent t = new BundleEntryComponent();
        if (this.entry == null)
            this.entry = new ArrayList<BundleEntryComponent>();
        this.entry.add(t);
        return t;
    }

    // syntactic sugar
    public Bundle addEntry(BundleEntryComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.entry == null)
            this.entry = new ArrayList<BundleEntryComponent>();
        this.entry.add(t);
        return this;
    }

    /**
     * @return {@link #signature} (Digital Signature - base64 encoded. XML DigSIg or a JWT.)
     */
    public Signature getSignature() {
        if (this.signature == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Bundle.signature");
            else if (Configuration.doAutoCreate())
                // cc
                this.signature = new Signature();
        return this.signature;
    }

    public boolean hasSignature() {
        return this.signature != null && !this.signature.isEmpty();
    }

    /**
     * @param value {@link #signature} (Digital Signature - base64 encoded. XML DigSIg or a JWT.)
     */
    public Bundle setSignature(Signature value) {
        this.signature = value;
        return this;
    }

    /**
     * Returns the {@link #getLink() link} which matches a given {@link BundleLinkComponent#getRelation() relation}.
     * If no link is found which matches the given relation, returns <code>null</code>. If more than one
     * link is found which matches the given relation, returns the first matching BundleLinkComponent.
     *
     * @param theRelation
     *            The relation, such as "next", or "self. See the constants such as {@link IBaseBundle#LINK_SELF} and {@link IBaseBundle#LINK_NEXT}.
     * @return Returns a matching BundleLinkComponent, or <code>null</code>
     * @see IBaseBundle#LINK_NEXT
     * @see IBaseBundle#LINK_PREV
     * @see IBaseBundle#LINK_SELF
     */
    public BundleLinkComponent getLink(String theRelation) {
        org.apache.commons.lang3.Validate.notBlank(theRelation, "theRelation may not be null or empty");
        for (BundleLinkComponent next : getLink()) {
            if (theRelation.equals(next.getRelation())) {
                return next;
            }
        }
        return null;
    }

    /**
     * Returns the {@link #getLink() link} which matches a given {@link BundleLinkComponent#getRelation() relation}.
     * If no link is found which matches the given relation, creates a new BundleLinkComponent with the
     * given relation and adds it to this Bundle. If more than one
     * link is found which matches the given relation, returns the first matching BundleLinkComponent.
     *
     * @param theRelation
     *            The relation, such as "next", or "self. See the constants such as {@link IBaseBundle#LINK_SELF} and {@link IBaseBundle#LINK_NEXT}.
     * @return Returns a matching BundleLinkComponent, or <code>null</code>
     * @see IBaseBundle#LINK_NEXT
     * @see IBaseBundle#LINK_PREV
     * @see IBaseBundle#LINK_SELF
     */
    public BundleLinkComponent getLinkOrCreate(String theRelation) {
        org.apache.commons.lang3.Validate.notBlank(theRelation, "theRelation may not be null or empty");
        for (BundleLinkComponent next : getLink()) {
            if (theRelation.equals(next.getRelation())) {
                return next;
            }
        }
        BundleLinkComponent retVal = new BundleLinkComponent();
        retVal.setRelation(theRelation);
        getLink().add(retVal);
        return retVal;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "Indicates the purpose of this bundle- how it was intended to be used.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("total", "unsignedInt", "If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle).", 0, java.lang.Integer.MAX_VALUE, total));
        childrenList.add(new Property("link", "", "A series of links that provide context to this bundle.", 0, java.lang.Integer.MAX_VALUE, link));
        childrenList.add(new Property("entry", "", "An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only).", 0, java.lang.Integer.MAX_VALUE, entry));
        childrenList.add(new Property("signature", "Signature", "Digital Signature - base64 encoded. XML DigSIg or a JWT.", 0, java.lang.Integer.MAX_VALUE, signature));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Enumeration<BundleType>
            this.type = new BundleTypeEnumFactory().fromType(value);
        else if (name.equals("total"))
            // UnsignedIntType
            this.total = castToUnsignedInt(value);
        else if (name.equals("link"))
            this.getLink().add((BundleLinkComponent) value);
        else if (name.equals("entry"))
            this.getEntry().add((BundleEntryComponent) value);
        else if (name.equals("signature"))
            // Signature
            this.signature = castToSignature(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.type");
        } else if (name.equals("total")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.total");
        } else if (name.equals("link")) {
            return addLink();
        } else if (name.equals("entry")) {
            return addEntry();
        } else if (name.equals("signature")) {
            this.signature = new Signature();
            return this.signature;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Bundle";
    }

    public Bundle copy() {
        Bundle dst = new Bundle();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.total = total == null ? null : total.copy();
        if (link != null) {
            dst.link = new ArrayList<BundleLinkComponent>();
            for (BundleLinkComponent i : link) dst.link.add(i.copy());
        }
        ;
        if (entry != null) {
            dst.entry = new ArrayList<BundleEntryComponent>();
            for (BundleEntryComponent i : entry) dst.entry.add(i.copy());
        }
        ;
        dst.signature = signature == null ? null : signature.copy();
        return dst;
    }

    protected Bundle typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Bundle))
            return false;
        Bundle o = (Bundle) other;
        return compareDeep(type, o.type, true) && compareDeep(total, o.total, true) && compareDeep(link, o.link, true) && compareDeep(entry, o.entry, true) && compareDeep(signature, o.signature, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Bundle))
            return false;
        Bundle o = (Bundle) other;
        return compareValues(type, o.type, true) && compareValues(total, o.total, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (total == null || total.isEmpty()) && (link == null || link.isEmpty()) && (entry == null || entry.isEmpty()) && (signature == null || signature.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Bundle;
    }

    public static final String SP_COMPOSITION = "composition";

    public static final String SP_TYPE = "type";

    public static final String SP_MESSAGE = "message";
}
