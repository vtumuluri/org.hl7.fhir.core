package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.BindingStrength;
import org.hl7.fhir.dstu2.model.Enumerations.BindingStrengthEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverity;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentation;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentationEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationMode;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRules;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRulesEnumFactory;

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
 * Captures constraints on each element within the resource, profile, or extension.
 */
public class ElementDefinition extends Type implements ICompositeType {

    /**
     * The path identifies the element and is expressed as a "."-separated list of ancestor elements, beginning with the name of the resource or extension.
     */
    protected StringType path;

    /**
     * Codes that define how this element is represented in instances, when the deviation varies from the normal case.
     */
    protected List<Enumeration<PropertyRepresentation>> representation;

    /**
     * The name of this element definition (to refer to it from other element definitions using ElementDefinition.nameReference). This is a unique name referring to a specific set of constraints applied to this element. One use of this is to provide a name to different slices of the same element.
     */
    protected StringType name;

    /**
     * The text to display beside the element indicating its meaning or to use to prompt for the element in a user display or form.
     */
    protected StringType label;

    /**
     * A code that provides the meaning for the element according to a particular terminology.
     */
    protected List<Coding> code;

    /**
     * Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure definition, there are multiple different constraints on a single element in the base resource). Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource with a choice of types. The set of slices is any elements that come after this in the element sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).
     */
    protected ElementDefinitionSlicingComponent slicing;

    /**
     * A concise description of what this element means (e.g. for use in autogenerated summaries).
     */
    protected StringType short_;

    /**
     * Provides a complete explanation of the meaning of the data element for human readability.  For the case of elements derived from existing elements (e.g. constraints), the definition SHALL be consistent with the base definition, but convey the meaning of the element in the particular context of use of the resource.
     */
    protected MarkdownType definition;

    /**
     * Explanatory notes and implementation guidance about the data element, including notes about how to use the data properly, exceptions to proper use, etc.
     */
    protected MarkdownType comments;

    /**
     * This element is for traceability of why the element was created and why the constraints exist as they do. This may be used to point to source materials or specifications that drove the structure of this element.
     */
    protected MarkdownType requirements;

    /**
     * Identifies additional names by which this element might also be known.
     */
    protected List<StringType> alias;

    /**
     * The minimum number of times this element SHALL appear in the instance.
     */
    protected IntegerType min;

    /**
     * The maximum number of times this element is permitted to appear in the instance.
     */
    protected StringType max;

    /**
     * Information about the base definition of the element, provided to make it unncessary for tools to trace the deviation of the element through the derived and related profiles. This information is only provided where the element definition represents a constraint on another element definition, and must be present if there is a base element definition.
     */
    protected ElementDefinitionBaseComponent base;

    /**
     * The data type or resource that the value of this element is permitted to be.
     */
    protected List<TypeRefComponent> type;

    /**
     * Identifies the name of a slice defined elsewhere in the profile whose constraints should be applied to the current element.
     */
    protected StringType nameReference;

    /**
     * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
     */
    protected org.hl7.fhir.dstu2.model.Type defaultValue;

    /**
     * The Implicit meaning that is to be understood when this element is missing (e.g. 'when this element is missing, the period is ongoing'.
     */
    protected MarkdownType meaningWhenMissing;

    /**
     * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.
     */
    protected org.hl7.fhir.dstu2.model.Type fixed;

    /**
     * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  The values of elements present in the pattern must match exactly (case-sensitive, accent-sensitive, etc.).
     */
    protected org.hl7.fhir.dstu2.model.Type pattern;

    /**
     * A sample value for this element demonstrating the type of information that would typically be captured.
     */
    protected org.hl7.fhir.dstu2.model.Type example;

    /**
     * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     */
    protected org.hl7.fhir.dstu2.model.Type minValue;

    /**
     * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
     */
    protected org.hl7.fhir.dstu2.model.Type maxValue;

    /**
     * Indicates the maximum length in characters that is permitted to be present in conformant instances and which is expected to be supported by conformant consumers that support the element.
     */
    protected IntegerType maxLength;

    /**
     * A reference to an invariant that may make additional statements about the cardinality or value in the instance.
     */
    protected List<IdType> condition;

    /**
     * Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.
     */
    protected List<ElementDefinitionConstraintComponent> constraint;

    /**
     * If true, implementations that produce or consume resources SHALL provide "support" for the element in some meaningful way.  If false, the element may be ignored and not supported.
     */
    protected BooleanType mustSupport;

    /**
     * If true, the value of this element affects the interpretation of the element or resource that contains it, and the value of the element cannot be ignored. Typically, this is used for status, negation and qualification codes. The effect of this is that the element cannot be ignored by systems: they SHALL either recognize the element and process it, and/or a pre-determination has been made that it is not relevant to their particular system.
     */
    protected BooleanType isModifier;

    /**
     * Whether the element should be included if a client requests a search with the parameter _summary=true.
     */
    protected BooleanType isSummary;

    /**
     * Binds to a value set if this element is coded (code, Coding, CodeableConcept).
     */
    protected ElementDefinitionBindingComponent binding;

    /**
     * Identifies a concept from an external specification that roughly corresponds to this element.
     */
    protected List<ElementDefinitionMappingComponent> mapping;

    private static final long serialVersionUID = -447087484L;

    /*
   * Constructor
   */
    public ElementDefinition() {
        super();
    }

    /*
   * Constructor
   */
    public ElementDefinition(StringType path) {
        super();
        this.path = path;
    }

    /**
     * @return {@link #path} (The path identifies the element and is expressed as a "."-separated list of ancestor elements, beginning with the name of the resource or extension.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
     */
    public StringType getPathElement() {
        if (this.path == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.path");
            else if (Configuration.doAutoCreate())
                // bb
                this.path = new StringType();
        return this.path;
    }

    public boolean hasPathElement() {
        return this.path != null && !this.path.isEmpty();
    }

    public boolean hasPath() {
        return this.path != null && !this.path.isEmpty();
    }

    /**
     * @param value {@link #path} (The path identifies the element and is expressed as a "."-separated list of ancestor elements, beginning with the name of the resource or extension.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
     */
    public ElementDefinition setPathElement(StringType value) {
        this.path = value;
        return this;
    }

    /**
     * @return The path identifies the element and is expressed as a "."-separated list of ancestor elements, beginning with the name of the resource or extension.
     */
    public String getPath() {
        return this.path == null ? null : this.path.getValue();
    }

    /**
     * @param value The path identifies the element and is expressed as a "."-separated list of ancestor elements, beginning with the name of the resource or extension.
     */
    public ElementDefinition setPath(String value) {
        if (this.path == null)
            this.path = new StringType();
        this.path.setValue(value);
        return this;
    }

    /**
     * @return {@link #representation} (Codes that define how this element is represented in instances, when the deviation varies from the normal case.)
     */
    public List<Enumeration<PropertyRepresentation>> getRepresentation() {
        if (this.representation == null)
            this.representation = new ArrayList<Enumeration<PropertyRepresentation>>();
        return this.representation;
    }

    public ElementDefinition setRepresentation(List<Enumeration<PropertyRepresentation>> representation) {
        this.representation = representation;
        return this;
    }

    public boolean hasRepresentation() {
        if (this.representation == null)
            return false;
        for (Enumeration<PropertyRepresentation> item : this.representation) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #representation} (Codes that define how this element is represented in instances, when the deviation varies from the normal case.)
     */
    // syntactic sugar
    public Enumeration<PropertyRepresentation> addRepresentationElement() {
        // 2
        Enumeration<PropertyRepresentation> t = new Enumeration<PropertyRepresentation>(new PropertyRepresentationEnumFactory());
        if (this.representation == null)
            this.representation = new ArrayList<Enumeration<PropertyRepresentation>>();
        this.representation.add(t);
        return t;
    }

    /**
     * @param value {@link #representation} (Codes that define how this element is represented in instances, when the deviation varies from the normal case.)
     */
    public ElementDefinition addRepresentation(PropertyRepresentation value) {
        // 1
        Enumeration<PropertyRepresentation> t = new Enumeration<PropertyRepresentation>(new PropertyRepresentationEnumFactory());
        t.setValue(value);
        if (this.representation == null)
            this.representation = new ArrayList<Enumeration<PropertyRepresentation>>();
        this.representation.add(t);
        return this;
    }

    /**
     * @param value {@link #representation} (Codes that define how this element is represented in instances, when the deviation varies from the normal case.)
     */
    public boolean hasRepresentation(PropertyRepresentation value) {
        if (this.representation == null)
            return false;
        for (Enumeration<PropertyRepresentation> v : this.representation) if (// code
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #name} (The name of this element definition (to refer to it from other element definitions using ElementDefinition.nameReference). This is a unique name referring to a specific set of constraints applied to this element. One use of this is to provide a name to different slices of the same element.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.name");
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
     * @param value {@link #name} (The name of this element definition (to refer to it from other element definitions using ElementDefinition.nameReference). This is a unique name referring to a specific set of constraints applied to this element. One use of this is to provide a name to different slices of the same element.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ElementDefinition setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return The name of this element definition (to refer to it from other element definitions using ElementDefinition.nameReference). This is a unique name referring to a specific set of constraints applied to this element. One use of this is to provide a name to different slices of the same element.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The name of this element definition (to refer to it from other element definitions using ElementDefinition.nameReference). This is a unique name referring to a specific set of constraints applied to this element. One use of this is to provide a name to different slices of the same element.
     */
    public ElementDefinition setName(String value) {
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
     * @return {@link #label} (The text to display beside the element indicating its meaning or to use to prompt for the element in a user display or form.). This is the underlying object with id, value and extensions. The accessor "getLabel" gives direct access to the value
     */
    public StringType getLabelElement() {
        if (this.label == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.label");
            else if (Configuration.doAutoCreate())
                // bb
                this.label = new StringType();
        return this.label;
    }

    public boolean hasLabelElement() {
        return this.label != null && !this.label.isEmpty();
    }

    public boolean hasLabel() {
        return this.label != null && !this.label.isEmpty();
    }

    /**
     * @param value {@link #label} (The text to display beside the element indicating its meaning or to use to prompt for the element in a user display or form.). This is the underlying object with id, value and extensions. The accessor "getLabel" gives direct access to the value
     */
    public ElementDefinition setLabelElement(StringType value) {
        this.label = value;
        return this;
    }

    /**
     * @return The text to display beside the element indicating its meaning or to use to prompt for the element in a user display or form.
     */
    public String getLabel() {
        return this.label == null ? null : this.label.getValue();
    }

    /**
     * @param value The text to display beside the element indicating its meaning or to use to prompt for the element in a user display or form.
     */
    public ElementDefinition setLabel(String value) {
        if (Utilities.noString(value))
            this.label = null;
        else {
            if (this.label == null)
                this.label = new StringType();
            this.label.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #code} (A code that provides the meaning for the element according to a particular terminology.)
     */
    public List<Coding> getCode() {
        if (this.code == null)
            this.code = new ArrayList<Coding>();
        return this.code;
    }

    public boolean hasCode() {
        if (this.code == null)
            return false;
        for (Coding item : this.code) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #code} (A code that provides the meaning for the element according to a particular terminology.)
     */
    // syntactic sugar
    public Coding addCode() {
        // 3
        Coding t = new Coding();
        if (this.code == null)
            this.code = new ArrayList<Coding>();
        this.code.add(t);
        return t;
    }

    // syntactic sugar
    public ElementDefinition addCode(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.code == null)
            this.code = new ArrayList<Coding>();
        this.code.add(t);
        return this;
    }

    /**
     * @return {@link #slicing} (Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure definition, there are multiple different constraints on a single element in the base resource). Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource with a choice of types. The set of slices is any elements that come after this in the element sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).)
     */
    public ElementDefinitionSlicingComponent getSlicing() {
        if (this.slicing == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.slicing");
            else if (Configuration.doAutoCreate())
                // cc
                this.slicing = new ElementDefinitionSlicingComponent();
        return this.slicing;
    }

    public boolean hasSlicing() {
        return this.slicing != null && !this.slicing.isEmpty();
    }

    /**
     * @param value {@link #slicing} (Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure definition, there are multiple different constraints on a single element in the base resource). Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource with a choice of types. The set of slices is any elements that come after this in the element sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).)
     */
    public ElementDefinition setSlicing(ElementDefinitionSlicingComponent value) {
        this.slicing = value;
        return this;
    }

    /**
     * @return {@link #short_} (A concise description of what this element means (e.g. for use in autogenerated summaries).). This is the underlying object with id, value and extensions. The accessor "getShort" gives direct access to the value
     */
    public StringType getShortElement() {
        if (this.short_ == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.short_");
            else if (Configuration.doAutoCreate())
                // bb
                this.short_ = new StringType();
        return this.short_;
    }

    public boolean hasShortElement() {
        return this.short_ != null && !this.short_.isEmpty();
    }

    public boolean hasShort() {
        return this.short_ != null && !this.short_.isEmpty();
    }

    /**
     * @param value {@link #short_} (A concise description of what this element means (e.g. for use in autogenerated summaries).). This is the underlying object with id, value and extensions. The accessor "getShort" gives direct access to the value
     */
    public ElementDefinition setShortElement(StringType value) {
        this.short_ = value;
        return this;
    }

    /**
     * @return A concise description of what this element means (e.g. for use in autogenerated summaries).
     */
    public String getShort() {
        return this.short_ == null ? null : this.short_.getValue();
    }

    /**
     * @param value A concise description of what this element means (e.g. for use in autogenerated summaries).
     */
    public ElementDefinition setShort(String value) {
        if (Utilities.noString(value))
            this.short_ = null;
        else {
            if (this.short_ == null)
                this.short_ = new StringType();
            this.short_.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #definition} (Provides a complete explanation of the meaning of the data element for human readability.  For the case of elements derived from existing elements (e.g. constraints), the definition SHALL be consistent with the base definition, but convey the meaning of the element in the particular context of use of the resource.). This is the underlying object with id, value and extensions. The accessor "getDefinition" gives direct access to the value
     */
    public MarkdownType getDefinitionElement() {
        if (this.definition == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.definition");
            else if (Configuration.doAutoCreate())
                // bb
                this.definition = new MarkdownType();
        return this.definition;
    }

    public boolean hasDefinitionElement() {
        return this.definition != null && !this.definition.isEmpty();
    }

    public boolean hasDefinition() {
        return this.definition != null && !this.definition.isEmpty();
    }

    /**
     * @param value {@link #definition} (Provides a complete explanation of the meaning of the data element for human readability.  For the case of elements derived from existing elements (e.g. constraints), the definition SHALL be consistent with the base definition, but convey the meaning of the element in the particular context of use of the resource.). This is the underlying object with id, value and extensions. The accessor "getDefinition" gives direct access to the value
     */
    public ElementDefinition setDefinitionElement(MarkdownType value) {
        this.definition = value;
        return this;
    }

    /**
     * @return Provides a complete explanation of the meaning of the data element for human readability.  For the case of elements derived from existing elements (e.g. constraints), the definition SHALL be consistent with the base definition, but convey the meaning of the element in the particular context of use of the resource.
     */
    public String getDefinition() {
        return this.definition == null ? null : this.definition.getValue();
    }

    /**
     * @param value Provides a complete explanation of the meaning of the data element for human readability.  For the case of elements derived from existing elements (e.g. constraints), the definition SHALL be consistent with the base definition, but convey the meaning of the element in the particular context of use of the resource.
     */
    public ElementDefinition setDefinition(String value) {
        if (value == null)
            this.definition = null;
        else {
            if (this.definition == null)
                this.definition = new MarkdownType();
            this.definition.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #comments} (Explanatory notes and implementation guidance about the data element, including notes about how to use the data properly, exceptions to proper use, etc.). This is the underlying object with id, value and extensions. The accessor "getComments" gives direct access to the value
     */
    public MarkdownType getCommentsElement() {
        if (this.comments == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.comments");
            else if (Configuration.doAutoCreate())
                // bb
                this.comments = new MarkdownType();
        return this.comments;
    }

    public boolean hasCommentsElement() {
        return this.comments != null && !this.comments.isEmpty();
    }

    public boolean hasComments() {
        return this.comments != null && !this.comments.isEmpty();
    }

    /**
     * @param value {@link #comments} (Explanatory notes and implementation guidance about the data element, including notes about how to use the data properly, exceptions to proper use, etc.). This is the underlying object with id, value and extensions. The accessor "getComments" gives direct access to the value
     */
    public ElementDefinition setCommentsElement(MarkdownType value) {
        this.comments = value;
        return this;
    }

    /**
     * @return Explanatory notes and implementation guidance about the data element, including notes about how to use the data properly, exceptions to proper use, etc.
     */
    public String getComments() {
        return this.comments == null ? null : this.comments.getValue();
    }

    /**
     * @param value Explanatory notes and implementation guidance about the data element, including notes about how to use the data properly, exceptions to proper use, etc.
     */
    public ElementDefinition setComments(String value) {
        if (value == null)
            this.comments = null;
        else {
            if (this.comments == null)
                this.comments = new MarkdownType();
            this.comments.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #requirements} (This element is for traceability of why the element was created and why the constraints exist as they do. This may be used to point to source materials or specifications that drove the structure of this element.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public MarkdownType getRequirementsElement() {
        if (this.requirements == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.requirements");
            else if (Configuration.doAutoCreate())
                // bb
                this.requirements = new MarkdownType();
        return this.requirements;
    }

    public boolean hasRequirementsElement() {
        return this.requirements != null && !this.requirements.isEmpty();
    }

    public boolean hasRequirements() {
        return this.requirements != null && !this.requirements.isEmpty();
    }

    /**
     * @param value {@link #requirements} (This element is for traceability of why the element was created and why the constraints exist as they do. This may be used to point to source materials or specifications that drove the structure of this element.). This is the underlying object with id, value and extensions. The accessor "getRequirements" gives direct access to the value
     */
    public ElementDefinition setRequirementsElement(MarkdownType value) {
        this.requirements = value;
        return this;
    }

    /**
     * @return This element is for traceability of why the element was created and why the constraints exist as they do. This may be used to point to source materials or specifications that drove the structure of this element.
     */
    public String getRequirements() {
        return this.requirements == null ? null : this.requirements.getValue();
    }

    /**
     * @param value This element is for traceability of why the element was created and why the constraints exist as they do. This may be used to point to source materials or specifications that drove the structure of this element.
     */
    public ElementDefinition setRequirements(String value) {
        if (value == null)
            this.requirements = null;
        else {
            if (this.requirements == null)
                this.requirements = new MarkdownType();
            this.requirements.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #alias} (Identifies additional names by which this element might also be known.)
     */
    public List<StringType> getAlias() {
        if (this.alias == null)
            this.alias = new ArrayList<StringType>();
        return this.alias;
    }

    public boolean hasAlias() {
        if (this.alias == null)
            return false;
        for (StringType item : this.alias) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #alias} (Identifies additional names by which this element might also be known.)
     */
    // syntactic sugar
    public StringType addAliasElement() {
        // 2
        StringType t = new StringType();
        if (this.alias == null)
            this.alias = new ArrayList<StringType>();
        this.alias.add(t);
        return t;
    }

    /**
     * @param value {@link #alias} (Identifies additional names by which this element might also be known.)
     */
    public ElementDefinition addAlias(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.alias == null)
            this.alias = new ArrayList<StringType>();
        this.alias.add(t);
        return this;
    }

    /**
     * @param value {@link #alias} (Identifies additional names by which this element might also be known.)
     */
    public boolean hasAlias(String value) {
        if (this.alias == null)
            return false;
        for (StringType v : this.alias) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #min} (The minimum number of times this element SHALL appear in the instance.). This is the underlying object with id, value and extensions. The accessor "getMin" gives direct access to the value
     */
    public IntegerType getMinElement() {
        if (this.min == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.min");
            else if (Configuration.doAutoCreate())
                // bb
                this.min = new IntegerType();
        return this.min;
    }

    public boolean hasMinElement() {
        return this.min != null && !this.min.isEmpty();
    }

    public boolean hasMin() {
        return this.min != null && !this.min.isEmpty();
    }

    /**
     * @param value {@link #min} (The minimum number of times this element SHALL appear in the instance.). This is the underlying object with id, value and extensions. The accessor "getMin" gives direct access to the value
     */
    public ElementDefinition setMinElement(IntegerType value) {
        this.min = value;
        return this;
    }

    /**
     * @return The minimum number of times this element SHALL appear in the instance.
     */
    public int getMin() {
        return this.min == null || this.min.isEmpty() ? 0 : this.min.getValue();
    }

    /**
     * @param value The minimum number of times this element SHALL appear in the instance.
     */
    public ElementDefinition setMin(int value) {
        if (this.min == null)
            this.min = new IntegerType();
        this.min.setValue(value);
        return this;
    }

    /**
     * @return {@link #max} (The maximum number of times this element is permitted to appear in the instance.). This is the underlying object with id, value and extensions. The accessor "getMax" gives direct access to the value
     */
    public StringType getMaxElement() {
        if (this.max == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.max");
            else if (Configuration.doAutoCreate())
                // bb
                this.max = new StringType();
        return this.max;
    }

    public boolean hasMaxElement() {
        return this.max != null && !this.max.isEmpty();
    }

    public boolean hasMax() {
        return this.max != null && !this.max.isEmpty();
    }

    /**
     * @param value {@link #max} (The maximum number of times this element is permitted to appear in the instance.). This is the underlying object with id, value and extensions. The accessor "getMax" gives direct access to the value
     */
    public ElementDefinition setMaxElement(StringType value) {
        this.max = value;
        return this;
    }

    /**
     * @return The maximum number of times this element is permitted to appear in the instance.
     */
    public String getMax() {
        return this.max == null ? null : this.max.getValue();
    }

    /**
     * @param value The maximum number of times this element is permitted to appear in the instance.
     */
    public ElementDefinition setMax(String value) {
        if (Utilities.noString(value))
            this.max = null;
        else {
            if (this.max == null)
                this.max = new StringType();
            this.max.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #base} (Information about the base definition of the element, provided to make it unncessary for tools to trace the deviation of the element through the derived and related profiles. This information is only provided where the element definition represents a constraint on another element definition, and must be present if there is a base element definition.)
     */
    public ElementDefinitionBaseComponent getBase() {
        if (this.base == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.base");
            else if (Configuration.doAutoCreate())
                // cc
                this.base = new ElementDefinitionBaseComponent();
        return this.base;
    }

    public boolean hasBase() {
        return this.base != null && !this.base.isEmpty();
    }

    /**
     * @param value {@link #base} (Information about the base definition of the element, provided to make it unncessary for tools to trace the deviation of the element through the derived and related profiles. This information is only provided where the element definition represents a constraint on another element definition, and must be present if there is a base element definition.)
     */
    public ElementDefinition setBase(ElementDefinitionBaseComponent value) {
        this.base = value;
        return this;
    }

    /**
     * @return {@link #type} (The data type or resource that the value of this element is permitted to be.)
     */
    public List<TypeRefComponent> getType() {
        if (this.type == null)
            this.type = new ArrayList<TypeRefComponent>();
        return this.type;
    }

    public boolean hasType() {
        if (this.type == null)
            return false;
        for (TypeRefComponent item : this.type) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #type} (The data type or resource that the value of this element is permitted to be.)
     */
    // syntactic sugar
    public TypeRefComponent addType() {
        // 3
        TypeRefComponent t = new TypeRefComponent();
        if (this.type == null)
            this.type = new ArrayList<TypeRefComponent>();
        this.type.add(t);
        return t;
    }

    // syntactic sugar
    public ElementDefinition addType(TypeRefComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.type == null)
            this.type = new ArrayList<TypeRefComponent>();
        this.type.add(t);
        return this;
    }

    /**
     * @return {@link #nameReference} (Identifies the name of a slice defined elsewhere in the profile whose constraints should be applied to the current element.). This is the underlying object with id, value and extensions. The accessor "getNameReference" gives direct access to the value
     */
    public StringType getNameReferenceElement() {
        if (this.nameReference == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.nameReference");
            else if (Configuration.doAutoCreate())
                // bb
                this.nameReference = new StringType();
        return this.nameReference;
    }

    public boolean hasNameReferenceElement() {
        return this.nameReference != null && !this.nameReference.isEmpty();
    }

    public boolean hasNameReference() {
        return this.nameReference != null && !this.nameReference.isEmpty();
    }

    /**
     * @param value {@link #nameReference} (Identifies the name of a slice defined elsewhere in the profile whose constraints should be applied to the current element.). This is the underlying object with id, value and extensions. The accessor "getNameReference" gives direct access to the value
     */
    public ElementDefinition setNameReferenceElement(StringType value) {
        this.nameReference = value;
        return this;
    }

    /**
     * @return Identifies the name of a slice defined elsewhere in the profile whose constraints should be applied to the current element.
     */
    public String getNameReference() {
        return this.nameReference == null ? null : this.nameReference.getValue();
    }

    /**
     * @param value Identifies the name of a slice defined elsewhere in the profile whose constraints should be applied to the current element.
     */
    public ElementDefinition setNameReference(String value) {
        if (Utilities.noString(value))
            this.nameReference = null;
        else {
            if (this.nameReference == null)
                this.nameReference = new StringType();
            this.nameReference.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #defaultValue} (The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').)
     */
    public org.hl7.fhir.dstu2.model.Type getDefaultValue() {
        return this.defaultValue;
    }

    public boolean hasDefaultValue() {
        return this.defaultValue != null && !this.defaultValue.isEmpty();
    }

    /**
     * @param value {@link #defaultValue} (The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').)
     */
    public ElementDefinition setDefaultValue(org.hl7.fhir.dstu2.model.Type value) {
        this.defaultValue = value;
        return this;
    }

    /**
     * @return {@link #meaningWhenMissing} (The Implicit meaning that is to be understood when this element is missing (e.g. 'when this element is missing, the period is ongoing'.). This is the underlying object with id, value and extensions. The accessor "getMeaningWhenMissing" gives direct access to the value
     */
    public MarkdownType getMeaningWhenMissingElement() {
        if (this.meaningWhenMissing == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.meaningWhenMissing");
            else if (Configuration.doAutoCreate())
                // bb
                this.meaningWhenMissing = new MarkdownType();
        return this.meaningWhenMissing;
    }

    public boolean hasMeaningWhenMissingElement() {
        return this.meaningWhenMissing != null && !this.meaningWhenMissing.isEmpty();
    }

    public boolean hasMeaningWhenMissing() {
        return this.meaningWhenMissing != null && !this.meaningWhenMissing.isEmpty();
    }

    /**
     * @param value {@link #meaningWhenMissing} (The Implicit meaning that is to be understood when this element is missing (e.g. 'when this element is missing, the period is ongoing'.). This is the underlying object with id, value and extensions. The accessor "getMeaningWhenMissing" gives direct access to the value
     */
    public ElementDefinition setMeaningWhenMissingElement(MarkdownType value) {
        this.meaningWhenMissing = value;
        return this;
    }

    /**
     * @return The Implicit meaning that is to be understood when this element is missing (e.g. 'when this element is missing, the period is ongoing'.
     */
    public String getMeaningWhenMissing() {
        return this.meaningWhenMissing == null ? null : this.meaningWhenMissing.getValue();
    }

    /**
     * @param value The Implicit meaning that is to be understood when this element is missing (e.g. 'when this element is missing, the period is ongoing'.
     */
    public ElementDefinition setMeaningWhenMissing(String value) {
        if (value == null)
            this.meaningWhenMissing = null;
        else {
            if (this.meaningWhenMissing == null)
                this.meaningWhenMissing = new MarkdownType();
            this.meaningWhenMissing.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #fixed} (Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.)
     */
    public org.hl7.fhir.dstu2.model.Type getFixed() {
        return this.fixed;
    }

    public boolean hasFixed() {
        return this.fixed != null && !this.fixed.isEmpty();
    }

    /**
     * @param value {@link #fixed} (Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.)
     */
    public ElementDefinition setFixed(org.hl7.fhir.dstu2.model.Type value) {
        this.fixed = value;
        return this;
    }

    /**
     * @return {@link #pattern} (Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  The values of elements present in the pattern must match exactly (case-sensitive, accent-sensitive, etc.).)
     */
    public org.hl7.fhir.dstu2.model.Type getPattern() {
        return this.pattern;
    }

    public boolean hasPattern() {
        return this.pattern != null && !this.pattern.isEmpty();
    }

    /**
     * @param value {@link #pattern} (Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  The values of elements present in the pattern must match exactly (case-sensitive, accent-sensitive, etc.).)
     */
    public ElementDefinition setPattern(org.hl7.fhir.dstu2.model.Type value) {
        this.pattern = value;
        return this;
    }

    /**
     * @return {@link #example} (A sample value for this element demonstrating the type of information that would typically be captured.)
     */
    public org.hl7.fhir.dstu2.model.Type getExample() {
        return this.example;
    }

    public boolean hasExample() {
        return this.example != null && !this.example.isEmpty();
    }

    /**
     * @param value {@link #example} (A sample value for this element demonstrating the type of information that would typically be captured.)
     */
    public ElementDefinition setExample(org.hl7.fhir.dstu2.model.Type value) {
        this.example = value;
        return this;
    }

    /**
     * @return {@link #minValue} (The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.)
     */
    public org.hl7.fhir.dstu2.model.Type getMinValue() {
        return this.minValue;
    }

    public boolean hasMinValue() {
        return this.minValue != null && !this.minValue.isEmpty();
    }

    /**
     * @param value {@link #minValue} (The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.)
     */
    public ElementDefinition setMinValue(org.hl7.fhir.dstu2.model.Type value) {
        this.minValue = value;
        return this;
    }

    /**
     * @return {@link #maxValue} (The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.)
     */
    public org.hl7.fhir.dstu2.model.Type getMaxValue() {
        return this.maxValue;
    }

    public boolean hasMaxValue() {
        return this.maxValue != null && !this.maxValue.isEmpty();
    }

    /**
     * @param value {@link #maxValue} (The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.)
     */
    public ElementDefinition setMaxValue(org.hl7.fhir.dstu2.model.Type value) {
        this.maxValue = value;
        return this;
    }

    /**
     * @return {@link #maxLength} (Indicates the maximum length in characters that is permitted to be present in conformant instances and which is expected to be supported by conformant consumers that support the element.). This is the underlying object with id, value and extensions. The accessor "getMaxLength" gives direct access to the value
     */
    public IntegerType getMaxLengthElement() {
        if (this.maxLength == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.maxLength");
            else if (Configuration.doAutoCreate())
                // bb
                this.maxLength = new IntegerType();
        return this.maxLength;
    }

    public boolean hasMaxLengthElement() {
        return this.maxLength != null && !this.maxLength.isEmpty();
    }

    public boolean hasMaxLength() {
        return this.maxLength != null && !this.maxLength.isEmpty();
    }

    /**
     * @param value {@link #maxLength} (Indicates the maximum length in characters that is permitted to be present in conformant instances and which is expected to be supported by conformant consumers that support the element.). This is the underlying object with id, value and extensions. The accessor "getMaxLength" gives direct access to the value
     */
    public ElementDefinition setMaxLengthElement(IntegerType value) {
        this.maxLength = value;
        return this;
    }

    /**
     * @return Indicates the maximum length in characters that is permitted to be present in conformant instances and which is expected to be supported by conformant consumers that support the element.
     */
    public int getMaxLength() {
        return this.maxLength == null || this.maxLength.isEmpty() ? 0 : this.maxLength.getValue();
    }

    /**
     * @param value Indicates the maximum length in characters that is permitted to be present in conformant instances and which is expected to be supported by conformant consumers that support the element.
     */
    public ElementDefinition setMaxLength(int value) {
        if (this.maxLength == null)
            this.maxLength = new IntegerType();
        this.maxLength.setValue(value);
        return this;
    }

    /**
     * @return {@link #condition} (A reference to an invariant that may make additional statements about the cardinality or value in the instance.)
     */
    public List<IdType> getCondition() {
        if (this.condition == null)
            this.condition = new ArrayList<IdType>();
        return this.condition;
    }

    public boolean hasCondition() {
        if (this.condition == null)
            return false;
        for (IdType item : this.condition) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #condition} (A reference to an invariant that may make additional statements about the cardinality or value in the instance.)
     */
    // syntactic sugar
    public IdType addConditionElement() {
        // 2
        IdType t = new IdType();
        if (this.condition == null)
            this.condition = new ArrayList<IdType>();
        this.condition.add(t);
        return t;
    }

    /**
     * @param value {@link #condition} (A reference to an invariant that may make additional statements about the cardinality or value in the instance.)
     */
    public ElementDefinition addCondition(String value) {
        // 1
        IdType t = new IdType();
        t.setValue(value);
        if (this.condition == null)
            this.condition = new ArrayList<IdType>();
        this.condition.add(t);
        return this;
    }

    /**
     * @param value {@link #condition} (A reference to an invariant that may make additional statements about the cardinality or value in the instance.)
     */
    public boolean hasCondition(String value) {
        if (this.condition == null)
            return false;
        for (IdType v : this.condition) if (// id
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #constraint} (Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.)
     */
    public List<ElementDefinitionConstraintComponent> getConstraint() {
        if (this.constraint == null)
            this.constraint = new ArrayList<ElementDefinitionConstraintComponent>();
        return this.constraint;
    }

    public boolean hasConstraint() {
        if (this.constraint == null)
            return false;
        for (ElementDefinitionConstraintComponent item : this.constraint) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #constraint} (Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.)
     */
    // syntactic sugar
    public ElementDefinitionConstraintComponent addConstraint() {
        // 3
        ElementDefinitionConstraintComponent t = new ElementDefinitionConstraintComponent();
        if (this.constraint == null)
            this.constraint = new ArrayList<ElementDefinitionConstraintComponent>();
        this.constraint.add(t);
        return t;
    }

    // syntactic sugar
    public ElementDefinition addConstraint(ElementDefinitionConstraintComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.constraint == null)
            this.constraint = new ArrayList<ElementDefinitionConstraintComponent>();
        this.constraint.add(t);
        return this;
    }

    /**
     * @return {@link #mustSupport} (If true, implementations that produce or consume resources SHALL provide "support" for the element in some meaningful way.  If false, the element may be ignored and not supported.). This is the underlying object with id, value and extensions. The accessor "getMustSupport" gives direct access to the value
     */
    public BooleanType getMustSupportElement() {
        if (this.mustSupport == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.mustSupport");
            else if (Configuration.doAutoCreate())
                // bb
                this.mustSupport = new BooleanType();
        return this.mustSupport;
    }

    public boolean hasMustSupportElement() {
        return this.mustSupport != null && !this.mustSupport.isEmpty();
    }

    public boolean hasMustSupport() {
        return this.mustSupport != null && !this.mustSupport.isEmpty();
    }

    /**
     * @param value {@link #mustSupport} (If true, implementations that produce or consume resources SHALL provide "support" for the element in some meaningful way.  If false, the element may be ignored and not supported.). This is the underlying object with id, value and extensions. The accessor "getMustSupport" gives direct access to the value
     */
    public ElementDefinition setMustSupportElement(BooleanType value) {
        this.mustSupport = value;
        return this;
    }

    /**
     * @return If true, implementations that produce or consume resources SHALL provide "support" for the element in some meaningful way.  If false, the element may be ignored and not supported.
     */
    public boolean getMustSupport() {
        return this.mustSupport == null || this.mustSupport.isEmpty() ? false : this.mustSupport.getValue();
    }

    /**
     * @param value If true, implementations that produce or consume resources SHALL provide "support" for the element in some meaningful way.  If false, the element may be ignored and not supported.
     */
    public ElementDefinition setMustSupport(boolean value) {
        if (this.mustSupport == null)
            this.mustSupport = new BooleanType();
        this.mustSupport.setValue(value);
        return this;
    }

    /**
     * @return {@link #isModifier} (If true, the value of this element affects the interpretation of the element or resource that contains it, and the value of the element cannot be ignored. Typically, this is used for status, negation and qualification codes. The effect of this is that the element cannot be ignored by systems: they SHALL either recognize the element and process it, and/or a pre-determination has been made that it is not relevant to their particular system.). This is the underlying object with id, value and extensions. The accessor "getIsModifier" gives direct access to the value
     */
    public BooleanType getIsModifierElement() {
        if (this.isModifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.isModifier");
            else if (Configuration.doAutoCreate())
                // bb
                this.isModifier = new BooleanType();
        return this.isModifier;
    }

    public boolean hasIsModifierElement() {
        return this.isModifier != null && !this.isModifier.isEmpty();
    }

    public boolean hasIsModifier() {
        return this.isModifier != null && !this.isModifier.isEmpty();
    }

    /**
     * @param value {@link #isModifier} (If true, the value of this element affects the interpretation of the element or resource that contains it, and the value of the element cannot be ignored. Typically, this is used for status, negation and qualification codes. The effect of this is that the element cannot be ignored by systems: they SHALL either recognize the element and process it, and/or a pre-determination has been made that it is not relevant to their particular system.). This is the underlying object with id, value and extensions. The accessor "getIsModifier" gives direct access to the value
     */
    public ElementDefinition setIsModifierElement(BooleanType value) {
        this.isModifier = value;
        return this;
    }

    /**
     * @return If true, the value of this element affects the interpretation of the element or resource that contains it, and the value of the element cannot be ignored. Typically, this is used for status, negation and qualification codes. The effect of this is that the element cannot be ignored by systems: they SHALL either recognize the element and process it, and/or a pre-determination has been made that it is not relevant to their particular system.
     */
    public boolean getIsModifier() {
        return this.isModifier == null || this.isModifier.isEmpty() ? false : this.isModifier.getValue();
    }

    /**
     * @param value If true, the value of this element affects the interpretation of the element or resource that contains it, and the value of the element cannot be ignored. Typically, this is used for status, negation and qualification codes. The effect of this is that the element cannot be ignored by systems: they SHALL either recognize the element and process it, and/or a pre-determination has been made that it is not relevant to their particular system.
     */
    public ElementDefinition setIsModifier(boolean value) {
        if (this.isModifier == null)
            this.isModifier = new BooleanType();
        this.isModifier.setValue(value);
        return this;
    }

    /**
     * @return {@link #isSummary} (Whether the element should be included if a client requests a search with the parameter _summary=true.). This is the underlying object with id, value and extensions. The accessor "getIsSummary" gives direct access to the value
     */
    public BooleanType getIsSummaryElement() {
        if (this.isSummary == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.isSummary");
            else if (Configuration.doAutoCreate())
                // bb
                this.isSummary = new BooleanType();
        return this.isSummary;
    }

    public boolean hasIsSummaryElement() {
        return this.isSummary != null && !this.isSummary.isEmpty();
    }

    public boolean hasIsSummary() {
        return this.isSummary != null && !this.isSummary.isEmpty();
    }

    /**
     * @param value {@link #isSummary} (Whether the element should be included if a client requests a search with the parameter _summary=true.). This is the underlying object with id, value and extensions. The accessor "getIsSummary" gives direct access to the value
     */
    public ElementDefinition setIsSummaryElement(BooleanType value) {
        this.isSummary = value;
        return this;
    }

    /**
     * @return Whether the element should be included if a client requests a search with the parameter _summary=true.
     */
    public boolean getIsSummary() {
        return this.isSummary == null || this.isSummary.isEmpty() ? false : this.isSummary.getValue();
    }

    /**
     * @param value Whether the element should be included if a client requests a search with the parameter _summary=true.
     */
    public ElementDefinition setIsSummary(boolean value) {
        if (this.isSummary == null)
            this.isSummary = new BooleanType();
        this.isSummary.setValue(value);
        return this;
    }

    /**
     * @return {@link #binding} (Binds to a value set if this element is coded (code, Coding, CodeableConcept).)
     */
    public ElementDefinitionBindingComponent getBinding() {
        if (this.binding == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinition.binding");
            else if (Configuration.doAutoCreate())
                // cc
                this.binding = new ElementDefinitionBindingComponent();
        return this.binding;
    }

    public boolean hasBinding() {
        return this.binding != null && !this.binding.isEmpty();
    }

    /**
     * @param value {@link #binding} (Binds to a value set if this element is coded (code, Coding, CodeableConcept).)
     */
    public ElementDefinition setBinding(ElementDefinitionBindingComponent value) {
        this.binding = value;
        return this;
    }

    /**
     * @return {@link #mapping} (Identifies a concept from an external specification that roughly corresponds to this element.)
     */
    public List<ElementDefinitionMappingComponent> getMapping() {
        if (this.mapping == null)
            this.mapping = new ArrayList<ElementDefinitionMappingComponent>();
        return this.mapping;
    }

    public boolean hasMapping() {
        if (this.mapping == null)
            return false;
        for (ElementDefinitionMappingComponent item : this.mapping) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #mapping} (Identifies a concept from an external specification that roughly corresponds to this element.)
     */
    // syntactic sugar
    public ElementDefinitionMappingComponent addMapping() {
        // 3
        ElementDefinitionMappingComponent t = new ElementDefinitionMappingComponent();
        if (this.mapping == null)
            this.mapping = new ArrayList<ElementDefinitionMappingComponent>();
        this.mapping.add(t);
        return t;
    }

    // syntactic sugar
    public ElementDefinition addMapping(ElementDefinitionMappingComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.mapping == null)
            this.mapping = new ArrayList<ElementDefinitionMappingComponent>();
        this.mapping.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("path", "string", "The path identifies the element and is expressed as a \".\"-separated list of ancestor elements, beginning with the name of the resource or extension.", 0, java.lang.Integer.MAX_VALUE, path));
        childrenList.add(new Property("representation", "code", "Codes that define how this element is represented in instances, when the deviation varies from the normal case.", 0, java.lang.Integer.MAX_VALUE, representation));
        childrenList.add(new Property("name", "string", "The name of this element definition (to refer to it from other element definitions using ElementDefinition.nameReference). This is a unique name referring to a specific set of constraints applied to this element. One use of this is to provide a name to different slices of the same element.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("label", "string", "The text to display beside the element indicating its meaning or to use to prompt for the element in a user display or form.", 0, java.lang.Integer.MAX_VALUE, label));
        childrenList.add(new Property("code", "Coding", "A code that provides the meaning for the element according to a particular terminology.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("slicing", "", "Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure definition, there are multiple different constraints on a single element in the base resource). Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource with a choice of types. The set of slices is any elements that come after this in the element sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).", 0, java.lang.Integer.MAX_VALUE, slicing));
        childrenList.add(new Property("short", "string", "A concise description of what this element means (e.g. for use in autogenerated summaries).", 0, java.lang.Integer.MAX_VALUE, short_));
        childrenList.add(new Property("definition", "markdown", "Provides a complete explanation of the meaning of the data element for human readability.  For the case of elements derived from existing elements (e.g. constraints), the definition SHALL be consistent with the base definition, but convey the meaning of the element in the particular context of use of the resource.", 0, java.lang.Integer.MAX_VALUE, definition));
        childrenList.add(new Property("comments", "markdown", "Explanatory notes and implementation guidance about the data element, including notes about how to use the data properly, exceptions to proper use, etc.", 0, java.lang.Integer.MAX_VALUE, comments));
        childrenList.add(new Property("requirements", "markdown", "This element is for traceability of why the element was created and why the constraints exist as they do. This may be used to point to source materials or specifications that drove the structure of this element.", 0, java.lang.Integer.MAX_VALUE, requirements));
        childrenList.add(new Property("alias", "string", "Identifies additional names by which this element might also be known.", 0, java.lang.Integer.MAX_VALUE, alias));
        childrenList.add(new Property("min", "integer", "The minimum number of times this element SHALL appear in the instance.", 0, java.lang.Integer.MAX_VALUE, min));
        childrenList.add(new Property("max", "string", "The maximum number of times this element is permitted to appear in the instance.", 0, java.lang.Integer.MAX_VALUE, max));
        childrenList.add(new Property("base", "", "Information about the base definition of the element, provided to make it unncessary for tools to trace the deviation of the element through the derived and related profiles. This information is only provided where the element definition represents a constraint on another element definition, and must be present if there is a base element definition.", 0, java.lang.Integer.MAX_VALUE, base));
        childrenList.add(new Property("type", "", "The data type or resource that the value of this element is permitted to be.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("nameReference", "string", "Identifies the name of a slice defined elsewhere in the profile whose constraints should be applied to the current element.", 0, java.lang.Integer.MAX_VALUE, nameReference));
        childrenList.add(new Property("defaultValue[x]", "*", "The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').", 0, java.lang.Integer.MAX_VALUE, defaultValue));
        childrenList.add(new Property("meaningWhenMissing", "markdown", "The Implicit meaning that is to be understood when this element is missing (e.g. 'when this element is missing, the period is ongoing'.", 0, java.lang.Integer.MAX_VALUE, meaningWhenMissing));
        childrenList.add(new Property("fixed[x]", "*", "Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing.", 0, java.lang.Integer.MAX_VALUE, fixed));
        childrenList.add(new Property("pattern[x]", "*", "Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  The values of elements present in the pattern must match exactly (case-sensitive, accent-sensitive, etc.).", 0, java.lang.Integer.MAX_VALUE, pattern));
        childrenList.add(new Property("example[x]", "*", "A sample value for this element demonstrating the type of information that would typically be captured.", 0, java.lang.Integer.MAX_VALUE, example));
        childrenList.add(new Property("minValue[x]", "*", "The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.", 0, java.lang.Integer.MAX_VALUE, minValue));
        childrenList.add(new Property("maxValue[x]", "*", "The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.", 0, java.lang.Integer.MAX_VALUE, maxValue));
        childrenList.add(new Property("maxLength", "integer", "Indicates the maximum length in characters that is permitted to be present in conformant instances and which is expected to be supported by conformant consumers that support the element.", 0, java.lang.Integer.MAX_VALUE, maxLength));
        childrenList.add(new Property("condition", "id", "A reference to an invariant that may make additional statements about the cardinality or value in the instance.", 0, java.lang.Integer.MAX_VALUE, condition));
        childrenList.add(new Property("constraint", "", "Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.", 0, java.lang.Integer.MAX_VALUE, constraint));
        childrenList.add(new Property("mustSupport", "boolean", "If true, implementations that produce or consume resources SHALL provide \"support\" for the element in some meaningful way.  If false, the element may be ignored and not supported.", 0, java.lang.Integer.MAX_VALUE, mustSupport));
        childrenList.add(new Property("isModifier", "boolean", "If true, the value of this element affects the interpretation of the element or resource that contains it, and the value of the element cannot be ignored. Typically, this is used for status, negation and qualification codes. The effect of this is that the element cannot be ignored by systems: they SHALL either recognize the element and process it, and/or a pre-determination has been made that it is not relevant to their particular system.", 0, java.lang.Integer.MAX_VALUE, isModifier));
        childrenList.add(new Property("isSummary", "boolean", "Whether the element should be included if a client requests a search with the parameter _summary=true.", 0, java.lang.Integer.MAX_VALUE, isSummary));
        childrenList.add(new Property("binding", "", "Binds to a value set if this element is coded (code, Coding, CodeableConcept).", 0, java.lang.Integer.MAX_VALUE, binding));
        childrenList.add(new Property("mapping", "", "Identifies a concept from an external specification that roughly corresponds to this element.", 0, java.lang.Integer.MAX_VALUE, mapping));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("path"))
            // StringType
            this.path = castToString(value);
        else if (name.equals("representation"))
            this.getRepresentation().add(new PropertyRepresentationEnumFactory().fromType(value));
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("label"))
            // StringType
            this.label = castToString(value);
        else if (name.equals("code"))
            this.getCode().add(castToCoding(value));
        else if (name.equals("slicing"))
            // ElementDefinitionSlicingComponent
            this.slicing = (ElementDefinitionSlicingComponent) value;
        else if (name.equals("short"))
            // StringType
            this.short_ = castToString(value);
        else if (name.equals("definition"))
            // MarkdownType
            this.definition = castToMarkdown(value);
        else if (name.equals("comments"))
            // MarkdownType
            this.comments = castToMarkdown(value);
        else if (name.equals("requirements"))
            // MarkdownType
            this.requirements = castToMarkdown(value);
        else if (name.equals("alias"))
            this.getAlias().add(castToString(value));
        else if (name.equals("min"))
            // IntegerType
            this.min = castToInteger(value);
        else if (name.equals("max"))
            // StringType
            this.max = castToString(value);
        else if (name.equals("base"))
            // ElementDefinitionBaseComponent
            this.base = (ElementDefinitionBaseComponent) value;
        else if (name.equals("type"))
            this.getType().add((TypeRefComponent) value);
        else if (name.equals("nameReference"))
            // StringType
            this.nameReference = castToString(value);
        else if (name.equals("defaultValue[x]"))
            // org.hl7.fhir.dstu2.model.Type
            this.defaultValue = (org.hl7.fhir.dstu2.model.Type) value;
        else if (name.equals("meaningWhenMissing"))
            // MarkdownType
            this.meaningWhenMissing = castToMarkdown(value);
        else if (name.equals("fixed[x]"))
            // org.hl7.fhir.dstu2.model.Type
            this.fixed = (org.hl7.fhir.dstu2.model.Type) value;
        else if (name.equals("pattern[x]"))
            // org.hl7.fhir.dstu2.model.Type
            this.pattern = (org.hl7.fhir.dstu2.model.Type) value;
        else if (name.equals("example[x]"))
            // org.hl7.fhir.dstu2.model.Type
            this.example = (org.hl7.fhir.dstu2.model.Type) value;
        else if (name.equals("minValue[x]"))
            // org.hl7.fhir.dstu2.model.Type
            this.minValue = (org.hl7.fhir.dstu2.model.Type) value;
        else if (name.equals("maxValue[x]"))
            // org.hl7.fhir.dstu2.model.Type
            this.maxValue = (org.hl7.fhir.dstu2.model.Type) value;
        else if (name.equals("maxLength"))
            // IntegerType
            this.maxLength = castToInteger(value);
        else if (name.equals("condition"))
            this.getCondition().add(castToId(value));
        else if (name.equals("constraint"))
            this.getConstraint().add((ElementDefinitionConstraintComponent) value);
        else if (name.equals("mustSupport"))
            // BooleanType
            this.mustSupport = castToBoolean(value);
        else if (name.equals("isModifier"))
            // BooleanType
            this.isModifier = castToBoolean(value);
        else if (name.equals("isSummary"))
            // BooleanType
            this.isSummary = castToBoolean(value);
        else if (name.equals("binding"))
            // ElementDefinitionBindingComponent
            this.binding = (ElementDefinitionBindingComponent) value;
        else if (name.equals("mapping"))
            this.getMapping().add((ElementDefinitionMappingComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("path")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.path");
        } else if (name.equals("representation")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.representation");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.name");
        } else if (name.equals("label")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.label");
        } else if (name.equals("code")) {
            return addCode();
        } else if (name.equals("slicing")) {
            this.slicing = new ElementDefinitionSlicingComponent();
            return this.slicing;
        } else if (name.equals("short")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.short");
        } else if (name.equals("definition")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.definition");
        } else if (name.equals("comments")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.comments");
        } else if (name.equals("requirements")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.requirements");
        } else if (name.equals("alias")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.alias");
        } else if (name.equals("min")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.min");
        } else if (name.equals("max")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.max");
        } else if (name.equals("base")) {
            this.base = new ElementDefinitionBaseComponent();
            return this.base;
        } else if (name.equals("type")) {
            return addType();
        } else if (name.equals("nameReference")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.nameReference");
        } else if (name.equals("defaultValueBoolean")) {
            this.defaultValue = new BooleanType();
            return this.defaultValue;
        } else if (name.equals("defaultValueInteger")) {
            this.defaultValue = new IntegerType();
            return this.defaultValue;
        } else if (name.equals("defaultValueDecimal")) {
            this.defaultValue = new DecimalType();
            return this.defaultValue;
        } else if (name.equals("defaultValueBase64Binary")) {
            this.defaultValue = new Base64BinaryType();
            return this.defaultValue;
        } else if (name.equals("defaultValueInstant")) {
            this.defaultValue = new InstantType();
            return this.defaultValue;
        } else if (name.equals("defaultValueString")) {
            this.defaultValue = new StringType();
            return this.defaultValue;
        } else if (name.equals("defaultValueUri")) {
            this.defaultValue = new UriType();
            return this.defaultValue;
        } else if (name.equals("defaultValueDate")) {
            this.defaultValue = new DateType();
            return this.defaultValue;
        } else if (name.equals("defaultValueDateTime")) {
            this.defaultValue = new DateTimeType();
            return this.defaultValue;
        } else if (name.equals("defaultValueTime")) {
            this.defaultValue = new TimeType();
            return this.defaultValue;
        } else if (name.equals("defaultValueCode")) {
            this.defaultValue = new CodeType();
            return this.defaultValue;
        } else if (name.equals("defaultValueOid")) {
            this.defaultValue = new OidType();
            return this.defaultValue;
        } else if (name.equals("defaultValueId")) {
            this.defaultValue = new IdType();
            return this.defaultValue;
        } else if (name.equals("defaultValueUnsignedInt")) {
            this.defaultValue = new UnsignedIntType();
            return this.defaultValue;
        } else if (name.equals("defaultValuePositiveInt")) {
            this.defaultValue = new PositiveIntType();
            return this.defaultValue;
        } else if (name.equals("defaultValueMarkdown")) {
            this.defaultValue = new MarkdownType();
            return this.defaultValue;
        } else if (name.equals("defaultValueAnnotation")) {
            this.defaultValue = new Annotation();
            return this.defaultValue;
        } else if (name.equals("defaultValueAttachment")) {
            this.defaultValue = new Attachment();
            return this.defaultValue;
        } else if (name.equals("defaultValueIdentifier")) {
            this.defaultValue = new Identifier();
            return this.defaultValue;
        } else if (name.equals("defaultValueCodeableConcept")) {
            this.defaultValue = new CodeableConcept();
            return this.defaultValue;
        } else if (name.equals("defaultValueCoding")) {
            this.defaultValue = new Coding();
            return this.defaultValue;
        } else if (name.equals("defaultValueQuantity")) {
            this.defaultValue = new Quantity();
            return this.defaultValue;
        } else if (name.equals("defaultValueRange")) {
            this.defaultValue = new Range();
            return this.defaultValue;
        } else if (name.equals("defaultValuePeriod")) {
            this.defaultValue = new Period();
            return this.defaultValue;
        } else if (name.equals("defaultValueRatio")) {
            this.defaultValue = new Ratio();
            return this.defaultValue;
        } else if (name.equals("defaultValueSampledData")) {
            this.defaultValue = new SampledData();
            return this.defaultValue;
        } else if (name.equals("defaultValueSignature")) {
            this.defaultValue = new Signature();
            return this.defaultValue;
        } else if (name.equals("defaultValueHumanName")) {
            this.defaultValue = new HumanName();
            return this.defaultValue;
        } else if (name.equals("defaultValueAddress")) {
            this.defaultValue = new Address();
            return this.defaultValue;
        } else if (name.equals("defaultValueContactPoint")) {
            this.defaultValue = new ContactPoint();
            return this.defaultValue;
        } else if (name.equals("defaultValueTiming")) {
            this.defaultValue = new Timing();
            return this.defaultValue;
        } else if (name.equals("defaultValueReference")) {
            this.defaultValue = new Reference();
            return this.defaultValue;
        } else if (name.equals("defaultValueMeta")) {
            this.defaultValue = new Meta();
            return this.defaultValue;
        } else if (name.equals("meaningWhenMissing")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.meaningWhenMissing");
        } else if (name.equals("fixedBoolean")) {
            this.fixed = new BooleanType();
            return this.fixed;
        } else if (name.equals("fixedInteger")) {
            this.fixed = new IntegerType();
            return this.fixed;
        } else if (name.equals("fixedDecimal")) {
            this.fixed = new DecimalType();
            return this.fixed;
        } else if (name.equals("fixedBase64Binary")) {
            this.fixed = new Base64BinaryType();
            return this.fixed;
        } else if (name.equals("fixedInstant")) {
            this.fixed = new InstantType();
            return this.fixed;
        } else if (name.equals("fixedString")) {
            this.fixed = new StringType();
            return this.fixed;
        } else if (name.equals("fixedUri")) {
            this.fixed = new UriType();
            return this.fixed;
        } else if (name.equals("fixedDate")) {
            this.fixed = new DateType();
            return this.fixed;
        } else if (name.equals("fixedDateTime")) {
            this.fixed = new DateTimeType();
            return this.fixed;
        } else if (name.equals("fixedTime")) {
            this.fixed = new TimeType();
            return this.fixed;
        } else if (name.equals("fixedCode")) {
            this.fixed = new CodeType();
            return this.fixed;
        } else if (name.equals("fixedOid")) {
            this.fixed = new OidType();
            return this.fixed;
        } else if (name.equals("fixedId")) {
            this.fixed = new IdType();
            return this.fixed;
        } else if (name.equals("fixedUnsignedInt")) {
            this.fixed = new UnsignedIntType();
            return this.fixed;
        } else if (name.equals("fixedPositiveInt")) {
            this.fixed = new PositiveIntType();
            return this.fixed;
        } else if (name.equals("fixedMarkdown")) {
            this.fixed = new MarkdownType();
            return this.fixed;
        } else if (name.equals("fixedAnnotation")) {
            this.fixed = new Annotation();
            return this.fixed;
        } else if (name.equals("fixedAttachment")) {
            this.fixed = new Attachment();
            return this.fixed;
        } else if (name.equals("fixedIdentifier")) {
            this.fixed = new Identifier();
            return this.fixed;
        } else if (name.equals("fixedCodeableConcept")) {
            this.fixed = new CodeableConcept();
            return this.fixed;
        } else if (name.equals("fixedCoding")) {
            this.fixed = new Coding();
            return this.fixed;
        } else if (name.equals("fixedQuantity")) {
            this.fixed = new Quantity();
            return this.fixed;
        } else if (name.equals("fixedRange")) {
            this.fixed = new Range();
            return this.fixed;
        } else if (name.equals("fixedPeriod")) {
            this.fixed = new Period();
            return this.fixed;
        } else if (name.equals("fixedRatio")) {
            this.fixed = new Ratio();
            return this.fixed;
        } else if (name.equals("fixedSampledData")) {
            this.fixed = new SampledData();
            return this.fixed;
        } else if (name.equals("fixedSignature")) {
            this.fixed = new Signature();
            return this.fixed;
        } else if (name.equals("fixedHumanName")) {
            this.fixed = new HumanName();
            return this.fixed;
        } else if (name.equals("fixedAddress")) {
            this.fixed = new Address();
            return this.fixed;
        } else if (name.equals("fixedContactPoint")) {
            this.fixed = new ContactPoint();
            return this.fixed;
        } else if (name.equals("fixedTiming")) {
            this.fixed = new Timing();
            return this.fixed;
        } else if (name.equals("fixedReference")) {
            this.fixed = new Reference();
            return this.fixed;
        } else if (name.equals("fixedMeta")) {
            this.fixed = new Meta();
            return this.fixed;
        } else if (name.equals("patternBoolean")) {
            this.pattern = new BooleanType();
            return this.pattern;
        } else if (name.equals("patternInteger")) {
            this.pattern = new IntegerType();
            return this.pattern;
        } else if (name.equals("patternDecimal")) {
            this.pattern = new DecimalType();
            return this.pattern;
        } else if (name.equals("patternBase64Binary")) {
            this.pattern = new Base64BinaryType();
            return this.pattern;
        } else if (name.equals("patternInstant")) {
            this.pattern = new InstantType();
            return this.pattern;
        } else if (name.equals("patternString")) {
            this.pattern = new StringType();
            return this.pattern;
        } else if (name.equals("patternUri")) {
            this.pattern = new UriType();
            return this.pattern;
        } else if (name.equals("patternDate")) {
            this.pattern = new DateType();
            return this.pattern;
        } else if (name.equals("patternDateTime")) {
            this.pattern = new DateTimeType();
            return this.pattern;
        } else if (name.equals("patternTime")) {
            this.pattern = new TimeType();
            return this.pattern;
        } else if (name.equals("patternCode")) {
            this.pattern = new CodeType();
            return this.pattern;
        } else if (name.equals("patternOid")) {
            this.pattern = new OidType();
            return this.pattern;
        } else if (name.equals("patternId")) {
            this.pattern = new IdType();
            return this.pattern;
        } else if (name.equals("patternUnsignedInt")) {
            this.pattern = new UnsignedIntType();
            return this.pattern;
        } else if (name.equals("patternPositiveInt")) {
            this.pattern = new PositiveIntType();
            return this.pattern;
        } else if (name.equals("patternMarkdown")) {
            this.pattern = new MarkdownType();
            return this.pattern;
        } else if (name.equals("patternAnnotation")) {
            this.pattern = new Annotation();
            return this.pattern;
        } else if (name.equals("patternAttachment")) {
            this.pattern = new Attachment();
            return this.pattern;
        } else if (name.equals("patternIdentifier")) {
            this.pattern = new Identifier();
            return this.pattern;
        } else if (name.equals("patternCodeableConcept")) {
            this.pattern = new CodeableConcept();
            return this.pattern;
        } else if (name.equals("patternCoding")) {
            this.pattern = new Coding();
            return this.pattern;
        } else if (name.equals("patternQuantity")) {
            this.pattern = new Quantity();
            return this.pattern;
        } else if (name.equals("patternRange")) {
            this.pattern = new Range();
            return this.pattern;
        } else if (name.equals("patternPeriod")) {
            this.pattern = new Period();
            return this.pattern;
        } else if (name.equals("patternRatio")) {
            this.pattern = new Ratio();
            return this.pattern;
        } else if (name.equals("patternSampledData")) {
            this.pattern = new SampledData();
            return this.pattern;
        } else if (name.equals("patternSignature")) {
            this.pattern = new Signature();
            return this.pattern;
        } else if (name.equals("patternHumanName")) {
            this.pattern = new HumanName();
            return this.pattern;
        } else if (name.equals("patternAddress")) {
            this.pattern = new Address();
            return this.pattern;
        } else if (name.equals("patternContactPoint")) {
            this.pattern = new ContactPoint();
            return this.pattern;
        } else if (name.equals("patternTiming")) {
            this.pattern = new Timing();
            return this.pattern;
        } else if (name.equals("patternReference")) {
            this.pattern = new Reference();
            return this.pattern;
        } else if (name.equals("patternMeta")) {
            this.pattern = new Meta();
            return this.pattern;
        } else if (name.equals("exampleBoolean")) {
            this.example = new BooleanType();
            return this.example;
        } else if (name.equals("exampleInteger")) {
            this.example = new IntegerType();
            return this.example;
        } else if (name.equals("exampleDecimal")) {
            this.example = new DecimalType();
            return this.example;
        } else if (name.equals("exampleBase64Binary")) {
            this.example = new Base64BinaryType();
            return this.example;
        } else if (name.equals("exampleInstant")) {
            this.example = new InstantType();
            return this.example;
        } else if (name.equals("exampleString")) {
            this.example = new StringType();
            return this.example;
        } else if (name.equals("exampleUri")) {
            this.example = new UriType();
            return this.example;
        } else if (name.equals("exampleDate")) {
            this.example = new DateType();
            return this.example;
        } else if (name.equals("exampleDateTime")) {
            this.example = new DateTimeType();
            return this.example;
        } else if (name.equals("exampleTime")) {
            this.example = new TimeType();
            return this.example;
        } else if (name.equals("exampleCode")) {
            this.example = new CodeType();
            return this.example;
        } else if (name.equals("exampleOid")) {
            this.example = new OidType();
            return this.example;
        } else if (name.equals("exampleId")) {
            this.example = new IdType();
            return this.example;
        } else if (name.equals("exampleUnsignedInt")) {
            this.example = new UnsignedIntType();
            return this.example;
        } else if (name.equals("examplePositiveInt")) {
            this.example = new PositiveIntType();
            return this.example;
        } else if (name.equals("exampleMarkdown")) {
            this.example = new MarkdownType();
            return this.example;
        } else if (name.equals("exampleAnnotation")) {
            this.example = new Annotation();
            return this.example;
        } else if (name.equals("exampleAttachment")) {
            this.example = new Attachment();
            return this.example;
        } else if (name.equals("exampleIdentifier")) {
            this.example = new Identifier();
            return this.example;
        } else if (name.equals("exampleCodeableConcept")) {
            this.example = new CodeableConcept();
            return this.example;
        } else if (name.equals("exampleCoding")) {
            this.example = new Coding();
            return this.example;
        } else if (name.equals("exampleQuantity")) {
            this.example = new Quantity();
            return this.example;
        } else if (name.equals("exampleRange")) {
            this.example = new Range();
            return this.example;
        } else if (name.equals("examplePeriod")) {
            this.example = new Period();
            return this.example;
        } else if (name.equals("exampleRatio")) {
            this.example = new Ratio();
            return this.example;
        } else if (name.equals("exampleSampledData")) {
            this.example = new SampledData();
            return this.example;
        } else if (name.equals("exampleSignature")) {
            this.example = new Signature();
            return this.example;
        } else if (name.equals("exampleHumanName")) {
            this.example = new HumanName();
            return this.example;
        } else if (name.equals("exampleAddress")) {
            this.example = new Address();
            return this.example;
        } else if (name.equals("exampleContactPoint")) {
            this.example = new ContactPoint();
            return this.example;
        } else if (name.equals("exampleTiming")) {
            this.example = new Timing();
            return this.example;
        } else if (name.equals("exampleReference")) {
            this.example = new Reference();
            return this.example;
        } else if (name.equals("exampleMeta")) {
            this.example = new Meta();
            return this.example;
        } else if (name.equals("minValueBoolean")) {
            this.minValue = new BooleanType();
            return this.minValue;
        } else if (name.equals("minValueInteger")) {
            this.minValue = new IntegerType();
            return this.minValue;
        } else if (name.equals("minValueDecimal")) {
            this.minValue = new DecimalType();
            return this.minValue;
        } else if (name.equals("minValueBase64Binary")) {
            this.minValue = new Base64BinaryType();
            return this.minValue;
        } else if (name.equals("minValueInstant")) {
            this.minValue = new InstantType();
            return this.minValue;
        } else if (name.equals("minValueString")) {
            this.minValue = new StringType();
            return this.minValue;
        } else if (name.equals("minValueUri")) {
            this.minValue = new UriType();
            return this.minValue;
        } else if (name.equals("minValueDate")) {
            this.minValue = new DateType();
            return this.minValue;
        } else if (name.equals("minValueDateTime")) {
            this.minValue = new DateTimeType();
            return this.minValue;
        } else if (name.equals("minValueTime")) {
            this.minValue = new TimeType();
            return this.minValue;
        } else if (name.equals("minValueCode")) {
            this.minValue = new CodeType();
            return this.minValue;
        } else if (name.equals("minValueOid")) {
            this.minValue = new OidType();
            return this.minValue;
        } else if (name.equals("minValueId")) {
            this.minValue = new IdType();
            return this.minValue;
        } else if (name.equals("minValueUnsignedInt")) {
            this.minValue = new UnsignedIntType();
            return this.minValue;
        } else if (name.equals("minValuePositiveInt")) {
            this.minValue = new PositiveIntType();
            return this.minValue;
        } else if (name.equals("minValueMarkdown")) {
            this.minValue = new MarkdownType();
            return this.minValue;
        } else if (name.equals("minValueAnnotation")) {
            this.minValue = new Annotation();
            return this.minValue;
        } else if (name.equals("minValueAttachment")) {
            this.minValue = new Attachment();
            return this.minValue;
        } else if (name.equals("minValueIdentifier")) {
            this.minValue = new Identifier();
            return this.minValue;
        } else if (name.equals("minValueCodeableConcept")) {
            this.minValue = new CodeableConcept();
            return this.minValue;
        } else if (name.equals("minValueCoding")) {
            this.minValue = new Coding();
            return this.minValue;
        } else if (name.equals("minValueQuantity")) {
            this.minValue = new Quantity();
            return this.minValue;
        } else if (name.equals("minValueRange")) {
            this.minValue = new Range();
            return this.minValue;
        } else if (name.equals("minValuePeriod")) {
            this.minValue = new Period();
            return this.minValue;
        } else if (name.equals("minValueRatio")) {
            this.minValue = new Ratio();
            return this.minValue;
        } else if (name.equals("minValueSampledData")) {
            this.minValue = new SampledData();
            return this.minValue;
        } else if (name.equals("minValueSignature")) {
            this.minValue = new Signature();
            return this.minValue;
        } else if (name.equals("minValueHumanName")) {
            this.minValue = new HumanName();
            return this.minValue;
        } else if (name.equals("minValueAddress")) {
            this.minValue = new Address();
            return this.minValue;
        } else if (name.equals("minValueContactPoint")) {
            this.minValue = new ContactPoint();
            return this.minValue;
        } else if (name.equals("minValueTiming")) {
            this.minValue = new Timing();
            return this.minValue;
        } else if (name.equals("minValueReference")) {
            this.minValue = new Reference();
            return this.minValue;
        } else if (name.equals("minValueMeta")) {
            this.minValue = new Meta();
            return this.minValue;
        } else if (name.equals("maxValueBoolean")) {
            this.maxValue = new BooleanType();
            return this.maxValue;
        } else if (name.equals("maxValueInteger")) {
            this.maxValue = new IntegerType();
            return this.maxValue;
        } else if (name.equals("maxValueDecimal")) {
            this.maxValue = new DecimalType();
            return this.maxValue;
        } else if (name.equals("maxValueBase64Binary")) {
            this.maxValue = new Base64BinaryType();
            return this.maxValue;
        } else if (name.equals("maxValueInstant")) {
            this.maxValue = new InstantType();
            return this.maxValue;
        } else if (name.equals("maxValueString")) {
            this.maxValue = new StringType();
            return this.maxValue;
        } else if (name.equals("maxValueUri")) {
            this.maxValue = new UriType();
            return this.maxValue;
        } else if (name.equals("maxValueDate")) {
            this.maxValue = new DateType();
            return this.maxValue;
        } else if (name.equals("maxValueDateTime")) {
            this.maxValue = new DateTimeType();
            return this.maxValue;
        } else if (name.equals("maxValueTime")) {
            this.maxValue = new TimeType();
            return this.maxValue;
        } else if (name.equals("maxValueCode")) {
            this.maxValue = new CodeType();
            return this.maxValue;
        } else if (name.equals("maxValueOid")) {
            this.maxValue = new OidType();
            return this.maxValue;
        } else if (name.equals("maxValueId")) {
            this.maxValue = new IdType();
            return this.maxValue;
        } else if (name.equals("maxValueUnsignedInt")) {
            this.maxValue = new UnsignedIntType();
            return this.maxValue;
        } else if (name.equals("maxValuePositiveInt")) {
            this.maxValue = new PositiveIntType();
            return this.maxValue;
        } else if (name.equals("maxValueMarkdown")) {
            this.maxValue = new MarkdownType();
            return this.maxValue;
        } else if (name.equals("maxValueAnnotation")) {
            this.maxValue = new Annotation();
            return this.maxValue;
        } else if (name.equals("maxValueAttachment")) {
            this.maxValue = new Attachment();
            return this.maxValue;
        } else if (name.equals("maxValueIdentifier")) {
            this.maxValue = new Identifier();
            return this.maxValue;
        } else if (name.equals("maxValueCodeableConcept")) {
            this.maxValue = new CodeableConcept();
            return this.maxValue;
        } else if (name.equals("maxValueCoding")) {
            this.maxValue = new Coding();
            return this.maxValue;
        } else if (name.equals("maxValueQuantity")) {
            this.maxValue = new Quantity();
            return this.maxValue;
        } else if (name.equals("maxValueRange")) {
            this.maxValue = new Range();
            return this.maxValue;
        } else if (name.equals("maxValuePeriod")) {
            this.maxValue = new Period();
            return this.maxValue;
        } else if (name.equals("maxValueRatio")) {
            this.maxValue = new Ratio();
            return this.maxValue;
        } else if (name.equals("maxValueSampledData")) {
            this.maxValue = new SampledData();
            return this.maxValue;
        } else if (name.equals("maxValueSignature")) {
            this.maxValue = new Signature();
            return this.maxValue;
        } else if (name.equals("maxValueHumanName")) {
            this.maxValue = new HumanName();
            return this.maxValue;
        } else if (name.equals("maxValueAddress")) {
            this.maxValue = new Address();
            return this.maxValue;
        } else if (name.equals("maxValueContactPoint")) {
            this.maxValue = new ContactPoint();
            return this.maxValue;
        } else if (name.equals("maxValueTiming")) {
            this.maxValue = new Timing();
            return this.maxValue;
        } else if (name.equals("maxValueReference")) {
            this.maxValue = new Reference();
            return this.maxValue;
        } else if (name.equals("maxValueMeta")) {
            this.maxValue = new Meta();
            return this.maxValue;
        } else if (name.equals("maxLength")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.maxLength");
        } else if (name.equals("condition")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.condition");
        } else if (name.equals("constraint")) {
            return addConstraint();
        } else if (name.equals("mustSupport")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.mustSupport");
        } else if (name.equals("isModifier")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.isModifier");
        } else if (name.equals("isSummary")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.isSummary");
        } else if (name.equals("binding")) {
            this.binding = new ElementDefinitionBindingComponent();
            return this.binding;
        } else if (name.equals("mapping")) {
            return addMapping();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ElementDefinition";
    }

    public ElementDefinition copy() {
        ElementDefinition dst = new ElementDefinition();
        copyValues(dst);
        dst.path = path == null ? null : path.copy();
        if (representation != null) {
            dst.representation = new ArrayList<Enumeration<PropertyRepresentation>>();
            for (Enumeration<PropertyRepresentation> i : representation) dst.representation.add(i.copy());
        }
        ;
        dst.name = name == null ? null : name.copy();
        dst.label = label == null ? null : label.copy();
        if (code != null) {
            dst.code = new ArrayList<Coding>();
            for (Coding i : code) dst.code.add(i.copy());
        }
        ;
        dst.slicing = slicing == null ? null : slicing.copy();
        dst.short_ = short_ == null ? null : short_.copy();
        dst.definition = definition == null ? null : definition.copy();
        dst.comments = comments == null ? null : comments.copy();
        dst.requirements = requirements == null ? null : requirements.copy();
        if (alias != null) {
            dst.alias = new ArrayList<StringType>();
            for (StringType i : alias) dst.alias.add(i.copy());
        }
        ;
        dst.min = min == null ? null : min.copy();
        dst.max = max == null ? null : max.copy();
        dst.base = base == null ? null : base.copy();
        if (type != null) {
            dst.type = new ArrayList<TypeRefComponent>();
            for (TypeRefComponent i : type) dst.type.add(i.copy());
        }
        ;
        dst.nameReference = nameReference == null ? null : nameReference.copy();
        dst.defaultValue = defaultValue == null ? null : defaultValue.copy();
        dst.meaningWhenMissing = meaningWhenMissing == null ? null : meaningWhenMissing.copy();
        dst.fixed = fixed == null ? null : fixed.copy();
        dst.pattern = pattern == null ? null : pattern.copy();
        dst.example = example == null ? null : example.copy();
        dst.minValue = minValue == null ? null : minValue.copy();
        dst.maxValue = maxValue == null ? null : maxValue.copy();
        dst.maxLength = maxLength == null ? null : maxLength.copy();
        if (condition != null) {
            dst.condition = new ArrayList<IdType>();
            for (IdType i : condition) dst.condition.add(i.copy());
        }
        ;
        if (constraint != null) {
            dst.constraint = new ArrayList<ElementDefinitionConstraintComponent>();
            for (ElementDefinitionConstraintComponent i : constraint) dst.constraint.add(i.copy());
        }
        ;
        dst.mustSupport = mustSupport == null ? null : mustSupport.copy();
        dst.isModifier = isModifier == null ? null : isModifier.copy();
        dst.isSummary = isSummary == null ? null : isSummary.copy();
        dst.binding = binding == null ? null : binding.copy();
        if (mapping != null) {
            dst.mapping = new ArrayList<ElementDefinitionMappingComponent>();
            for (ElementDefinitionMappingComponent i : mapping) dst.mapping.add(i.copy());
        }
        ;
        return dst;
    }

    protected ElementDefinition typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ElementDefinition))
            return false;
        ElementDefinition o = (ElementDefinition) other;
        return compareDeep(path, o.path, true) && compareDeep(representation, o.representation, true) && compareDeep(name, o.name, true) && compareDeep(label, o.label, true) && compareDeep(code, o.code, true) && compareDeep(slicing, o.slicing, true) && compareDeep(short_, o.short_, true) && compareDeep(definition, o.definition, true) && compareDeep(comments, o.comments, true) && compareDeep(requirements, o.requirements, true) && compareDeep(alias, o.alias, true) && compareDeep(min, o.min, true) && compareDeep(max, o.max, true) && compareDeep(base, o.base, true) && compareDeep(type, o.type, true) && compareDeep(nameReference, o.nameReference, true) && compareDeep(defaultValue, o.defaultValue, true) && compareDeep(meaningWhenMissing, o.meaningWhenMissing, true) && compareDeep(fixed, o.fixed, true) && compareDeep(pattern, o.pattern, true) && compareDeep(example, o.example, true) && compareDeep(minValue, o.minValue, true) && compareDeep(maxValue, o.maxValue, true) && compareDeep(maxLength, o.maxLength, true) && compareDeep(condition, o.condition, true) && compareDeep(constraint, o.constraint, true) && compareDeep(mustSupport, o.mustSupport, true) && compareDeep(isModifier, o.isModifier, true) && compareDeep(isSummary, o.isSummary, true) && compareDeep(binding, o.binding, true) && compareDeep(mapping, o.mapping, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ElementDefinition))
            return false;
        ElementDefinition o = (ElementDefinition) other;
        return compareValues(path, o.path, true) && compareValues(representation, o.representation, true) && compareValues(name, o.name, true) && compareValues(label, o.label, true) && compareValues(short_, o.short_, true) && compareValues(definition, o.definition, true) && compareValues(comments, o.comments, true) && compareValues(requirements, o.requirements, true) && compareValues(alias, o.alias, true) && compareValues(min, o.min, true) && compareValues(max, o.max, true) && compareValues(nameReference, o.nameReference, true) && compareValues(meaningWhenMissing, o.meaningWhenMissing, true) && compareValues(maxLength, o.maxLength, true) && compareValues(condition, o.condition, true) && compareValues(mustSupport, o.mustSupport, true) && compareValues(isModifier, o.isModifier, true) && compareValues(isSummary, o.isSummary, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (path == null || path.isEmpty()) && (representation == null || representation.isEmpty()) && (name == null || name.isEmpty()) && (label == null || label.isEmpty()) && (code == null || code.isEmpty()) && (slicing == null || slicing.isEmpty()) && (short_ == null || short_.isEmpty()) && (definition == null || definition.isEmpty()) && (comments == null || comments.isEmpty()) && (requirements == null || requirements.isEmpty()) && (alias == null || alias.isEmpty()) && (min == null || min.isEmpty()) && (max == null || max.isEmpty()) && (base == null || base.isEmpty()) && (type == null || type.isEmpty()) && (nameReference == null || nameReference.isEmpty()) && (defaultValue == null || defaultValue.isEmpty()) && (meaningWhenMissing == null || meaningWhenMissing.isEmpty()) && (fixed == null || fixed.isEmpty()) && (pattern == null || pattern.isEmpty()) && (example == null || example.isEmpty()) && (minValue == null || minValue.isEmpty()) && (maxValue == null || maxValue.isEmpty()) && (maxLength == null || maxLength.isEmpty()) && (condition == null || condition.isEmpty()) && (constraint == null || constraint.isEmpty()) && (mustSupport == null || mustSupport.isEmpty()) && (isModifier == null || isModifier.isEmpty()) && (isSummary == null || isSummary.isEmpty()) && (binding == null || binding.isEmpty()) && (mapping == null || mapping.isEmpty());
    }
}
