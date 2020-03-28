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
 * A homogeneous material with a definite composition.
 */
public class Substance extends DomainResource {

    /**
     * Unique identifier for the substance.
     */
    protected List<Identifier> identifier;

    /**
     * A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
     */
    protected List<CodeableConcept> category;

    /**
     * A code (or set of codes) that identify this substance.
     */
    protected CodeableConcept code;

    /**
     * A description of the substance - its appearance, handling requirements, and other usage notes.
     */
    protected StringType description;

    /**
     * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
     */
    protected List<SubstanceInstanceComponent> instance;

    /**
     * A substance can be composed of other substances.
     */
    protected List<SubstanceIngredientComponent> ingredient;

    private static final long serialVersionUID = -1653977206L;

    /*
   * Constructor
   */
    public Substance() {
        super();
    }

    /*
   * Constructor
   */
    public Substance(CodeableConcept code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #identifier} (Unique identifier for the substance.)
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
     * @return {@link #identifier} (Unique identifier for the substance.)
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
    public Substance addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #category} (A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.)
     */
    public List<CodeableConcept> getCategory() {
        if (this.category == null)
            this.category = new ArrayList<CodeableConcept>();
        return this.category;
    }

    public boolean hasCategory() {
        if (this.category == null)
            return false;
        for (CodeableConcept item : this.category) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #category} (A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.)
     */
    // syntactic sugar
    public CodeableConcept addCategory() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.category == null)
            this.category = new ArrayList<CodeableConcept>();
        this.category.add(t);
        return t;
    }

    // syntactic sugar
    public Substance addCategory(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.category == null)
            this.category = new ArrayList<CodeableConcept>();
        this.category.add(t);
        return this;
    }

    /**
     * @return {@link #code} (A code (or set of codes) that identify this substance.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Substance.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A code (or set of codes) that identify this substance.)
     */
    public Substance setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #description} (A description of the substance - its appearance, handling requirements, and other usage notes.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Substance.description");
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
     * @param value {@link #description} (A description of the substance - its appearance, handling requirements, and other usage notes.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Substance setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A description of the substance - its appearance, handling requirements, and other usage notes.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A description of the substance - its appearance, handling requirements, and other usage notes.
     */
    public Substance setDescription(String value) {
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
     * @return {@link #instance} (Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.)
     */
    public List<SubstanceInstanceComponent> getInstance() {
        if (this.instance == null)
            this.instance = new ArrayList<SubstanceInstanceComponent>();
        return this.instance;
    }

    public boolean hasInstance() {
        if (this.instance == null)
            return false;
        for (SubstanceInstanceComponent item : this.instance) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #instance} (Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.)
     */
    // syntactic sugar
    public SubstanceInstanceComponent addInstance() {
        // 3
        SubstanceInstanceComponent t = new SubstanceInstanceComponent();
        if (this.instance == null)
            this.instance = new ArrayList<SubstanceInstanceComponent>();
        this.instance.add(t);
        return t;
    }

    // syntactic sugar
    public Substance addInstance(SubstanceInstanceComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.instance == null)
            this.instance = new ArrayList<SubstanceInstanceComponent>();
        this.instance.add(t);
        return this;
    }

    /**
     * @return {@link #ingredient} (A substance can be composed of other substances.)
     */
    public List<SubstanceIngredientComponent> getIngredient() {
        if (this.ingredient == null)
            this.ingredient = new ArrayList<SubstanceIngredientComponent>();
        return this.ingredient;
    }

    public boolean hasIngredient() {
        if (this.ingredient == null)
            return false;
        for (SubstanceIngredientComponent item : this.ingredient) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #ingredient} (A substance can be composed of other substances.)
     */
    // syntactic sugar
    public SubstanceIngredientComponent addIngredient() {
        // 3
        SubstanceIngredientComponent t = new SubstanceIngredientComponent();
        if (this.ingredient == null)
            this.ingredient = new ArrayList<SubstanceIngredientComponent>();
        this.ingredient.add(t);
        return t;
    }

    // syntactic sugar
    public Substance addIngredient(SubstanceIngredientComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.ingredient == null)
            this.ingredient = new ArrayList<SubstanceIngredientComponent>();
        this.ingredient.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Unique identifier for the substance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("category", "CodeableConcept", "A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("code", "CodeableConcept", "A code (or set of codes) that identify this substance.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("description", "string", "A description of the substance - its appearance, handling requirements, and other usage notes.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("instance", "", "Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.", 0, java.lang.Integer.MAX_VALUE, instance));
        childrenList.add(new Property("ingredient", "", "A substance can be composed of other substances.", 0, java.lang.Integer.MAX_VALUE, ingredient));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("category"))
            this.getCategory().add(castToCodeableConcept(value));
        else if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("instance"))
            this.getInstance().add((SubstanceInstanceComponent) value);
        else if (name.equals("ingredient"))
            this.getIngredient().add((SubstanceIngredientComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("category")) {
            return addCategory();
        } else if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type Substance.description");
        } else if (name.equals("instance")) {
            return addInstance();
        } else if (name.equals("ingredient")) {
            return addIngredient();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Substance";
    }

    public Substance copy() {
        Substance dst = new Substance();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        if (category != null) {
            dst.category = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : category) dst.category.add(i.copy());
        }
        ;
        dst.code = code == null ? null : code.copy();
        dst.description = description == null ? null : description.copy();
        if (instance != null) {
            dst.instance = new ArrayList<SubstanceInstanceComponent>();
            for (SubstanceInstanceComponent i : instance) dst.instance.add(i.copy());
        }
        ;
        if (ingredient != null) {
            dst.ingredient = new ArrayList<SubstanceIngredientComponent>();
            for (SubstanceIngredientComponent i : ingredient) dst.ingredient.add(i.copy());
        }
        ;
        return dst;
    }

    protected Substance typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Substance))
            return false;
        Substance o = (Substance) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(category, o.category, true) && compareDeep(code, o.code, true) && compareDeep(description, o.description, true) && compareDeep(instance, o.instance, true) && compareDeep(ingredient, o.ingredient, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Substance))
            return false;
        Substance o = (Substance) other;
        return compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (category == null || category.isEmpty()) && (code == null || code.isEmpty()) && (description == null || description.isEmpty()) && (instance == null || instance.isEmpty()) && (ingredient == null || ingredient.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Substance;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_CONTAINERIDENTIFIER = "container-identifier";

    public static final String SP_CODE = "code";

    public static final String SP_QUANTITY = "quantity";

    public static final String SP_SUBSTANCE = "substance";

    public static final String SP_EXPIRY = "expiry";

    public static final String SP_CATEGORY = "category";
}
