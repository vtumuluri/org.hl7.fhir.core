package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
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
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 */
public class Medication extends DomainResource {

    /**
     * A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
     */
    protected CodeableConcept code;

    /**
     * Set to true if the item is attributable to a specific manufacturer.
     */
    protected BooleanType isBrand;

    /**
     * Describes the details of the manufacturer.
     */
    protected Reference manufacturer;

    /**
     * The actual object that is the target of the reference (Describes the details of the manufacturer.)
     */
    protected Organization manufacturerTarget;

    /**
     * Information that only applies to products (not packages).
     */
    protected MedicationProductComponent product;

    /**
     * Information that only applies to packages (not products).
     */
    protected MedicationPackageComponent package_;

    private static final long serialVersionUID = 859308699L;

    /*
   * Constructor
   */
    public Medication() {
        super();
    }

    /**
     * @return {@link #code} (A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Medication.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.)
     */
    public Medication setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #isBrand} (Set to true if the item is attributable to a specific manufacturer.). This is the underlying object with id, value and extensions. The accessor "getIsBrand" gives direct access to the value
     */
    public BooleanType getIsBrandElement() {
        if (this.isBrand == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Medication.isBrand");
            else if (Configuration.doAutoCreate())
                // bb
                this.isBrand = new BooleanType();
        return this.isBrand;
    }

    public boolean hasIsBrandElement() {
        return this.isBrand != null && !this.isBrand.isEmpty();
    }

    public boolean hasIsBrand() {
        return this.isBrand != null && !this.isBrand.isEmpty();
    }

    /**
     * @param value {@link #isBrand} (Set to true if the item is attributable to a specific manufacturer.). This is the underlying object with id, value and extensions. The accessor "getIsBrand" gives direct access to the value
     */
    public Medication setIsBrandElement(BooleanType value) {
        this.isBrand = value;
        return this;
    }

    /**
     * @return Set to true if the item is attributable to a specific manufacturer.
     */
    public boolean getIsBrand() {
        return this.isBrand == null || this.isBrand.isEmpty() ? false : this.isBrand.getValue();
    }

    /**
     * @param value Set to true if the item is attributable to a specific manufacturer.
     */
    public Medication setIsBrand(boolean value) {
        if (this.isBrand == null)
            this.isBrand = new BooleanType();
        this.isBrand.setValue(value);
        return this;
    }

    /**
     * @return {@link #manufacturer} (Describes the details of the manufacturer.)
     */
    public Reference getManufacturer() {
        if (this.manufacturer == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Medication.manufacturer");
            else if (Configuration.doAutoCreate())
                // cc
                this.manufacturer = new Reference();
        return this.manufacturer;
    }

    public boolean hasManufacturer() {
        return this.manufacturer != null && !this.manufacturer.isEmpty();
    }

    /**
     * @param value {@link #manufacturer} (Describes the details of the manufacturer.)
     */
    public Medication setManufacturer(Reference value) {
        this.manufacturer = value;
        return this;
    }

    /**
     * @return {@link #manufacturer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Describes the details of the manufacturer.)
     */
    public Organization getManufacturerTarget() {
        if (this.manufacturerTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Medication.manufacturer");
            else if (Configuration.doAutoCreate())
                // aa
                this.manufacturerTarget = new Organization();
        return this.manufacturerTarget;
    }

    /**
     * @param value {@link #manufacturer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Describes the details of the manufacturer.)
     */
    public Medication setManufacturerTarget(Organization value) {
        this.manufacturerTarget = value;
        return this;
    }

    /**
     * @return {@link #product} (Information that only applies to products (not packages).)
     */
    public MedicationProductComponent getProduct() {
        if (this.product == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Medication.product");
            else if (Configuration.doAutoCreate())
                // cc
                this.product = new MedicationProductComponent();
        return this.product;
    }

    public boolean hasProduct() {
        return this.product != null && !this.product.isEmpty();
    }

    /**
     * @param value {@link #product} (Information that only applies to products (not packages).)
     */
    public Medication setProduct(MedicationProductComponent value) {
        this.product = value;
        return this;
    }

    /**
     * @return {@link #package_} (Information that only applies to packages (not products).)
     */
    public MedicationPackageComponent getPackage() {
        if (this.package_ == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Medication.package_");
            else if (Configuration.doAutoCreate())
                // cc
                this.package_ = new MedicationPackageComponent();
        return this.package_;
    }

    public boolean hasPackage() {
        return this.package_ != null && !this.package_.isEmpty();
    }

    /**
     * @param value {@link #package_} (Information that only applies to packages (not products).)
     */
    public Medication setPackage(MedicationPackageComponent value) {
        this.package_ = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("isBrand", "boolean", "Set to true if the item is attributable to a specific manufacturer.", 0, java.lang.Integer.MAX_VALUE, isBrand));
        childrenList.add(new Property("manufacturer", "Reference(Organization)", "Describes the details of the manufacturer.", 0, java.lang.Integer.MAX_VALUE, manufacturer));
        childrenList.add(new Property("product", "", "Information that only applies to products (not packages).", 0, java.lang.Integer.MAX_VALUE, product));
        childrenList.add(new Property("package", "", "Information that only applies to packages (not products).", 0, java.lang.Integer.MAX_VALUE, package_));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("isBrand"))
            // BooleanType
            this.isBrand = castToBoolean(value);
        else if (name.equals("manufacturer"))
            // Reference
            this.manufacturer = castToReference(value);
        else if (name.equals("product"))
            // MedicationProductComponent
            this.product = (MedicationProductComponent) value;
        else if (name.equals("package"))
            // MedicationPackageComponent
            this.package_ = (MedicationPackageComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("isBrand")) {
            throw new FHIRException("Cannot call addChild on a primitive type Medication.isBrand");
        } else if (name.equals("manufacturer")) {
            this.manufacturer = new Reference();
            return this.manufacturer;
        } else if (name.equals("product")) {
            this.product = new MedicationProductComponent();
            return this.product;
        } else if (name.equals("package")) {
            this.package_ = new MedicationPackageComponent();
            return this.package_;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Medication";
    }

    public Medication copy() {
        Medication dst = new Medication();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.isBrand = isBrand == null ? null : isBrand.copy();
        dst.manufacturer = manufacturer == null ? null : manufacturer.copy();
        dst.product = product == null ? null : product.copy();
        dst.package_ = package_ == null ? null : package_.copy();
        return dst;
    }

    protected Medication typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Medication))
            return false;
        Medication o = (Medication) other;
        return compareDeep(code, o.code, true) && compareDeep(isBrand, o.isBrand, true) && compareDeep(manufacturer, o.manufacturer, true) && compareDeep(product, o.product, true) && compareDeep(package_, o.package_, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Medication))
            return false;
        Medication o = (Medication) other;
        return compareValues(isBrand, o.isBrand, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (isBrand == null || isBrand.isEmpty()) && (manufacturer == null || manufacturer.isEmpty()) && (product == null || product.isEmpty()) && (package_ == null || package_.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Medication;
    }

    public static final String SP_CONTAINER = "container";

    public static final String SP_CODE = "code";

    public static final String SP_INGREDIENT = "ingredient";

    public static final String SP_FORM = "form";

    public static final String SP_CONTENT = "content";

    public static final String SP_MANUFACTURER = "manufacturer";
}
