package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DeviceComponentEnum.MeasmntPrincipleEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceComponentEnum.MeasmntPrinciple;

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
 * Describes the characteristics, operational status and capabilities of a medical-related component of a medical device.
 */
public class DeviceComponent extends DomainResource {

    /**
     * Describes the specific component type as defined in the object-oriented or metric nomenclature partition.
     */
    protected CodeableConcept type;

    /**
     * Describes the local assigned unique identification by the software. For example: handle ID.
     */
    protected Identifier identifier;

    /**
     * Describes the timestamp for the most recent system change which includes device configuration or setting change.
     */
    protected InstantType lastSystemChange;

    /**
     * Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc.
     */
    protected Reference source;

    /**
     * The actual object that is the target of the reference (Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc.)
     */
    protected Device sourceTarget;

    /**
     * Describes the link to the parent resource. For example: Channel is linked to its VMD parent.
     */
    protected Reference parent;

    /**
     * The actual object that is the target of the reference (Describes the link to the parent resource. For example: Channel is linked to its VMD parent.)
     */
    protected DeviceComponent parentTarget;

    /**
     * Indicates current operational status of the device. For example: On, Off, Standby, etc.
     */
    protected List<CodeableConcept> operationalStatus;

    /**
     * Describes the parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular.
     */
    protected CodeableConcept parameterGroup;

    /**
     * Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
     */
    protected Enumeration<MeasmntPrinciple> measurementPrinciple;

    /**
     * Describes the production specification such as component revision, serial number, etc.
     */
    protected List<DeviceComponentProductionSpecificationComponent> productionSpecification;

    /**
     * Describes the language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US.
     */
    protected CodeableConcept languageCode;

    private static final long serialVersionUID = -1742890034L;

    /*
   * Constructor
   */
    public DeviceComponent() {
        super();
    }

    /*
   * Constructor
   */
    public DeviceComponent(CodeableConcept type, Identifier identifier, InstantType lastSystemChange) {
        super();
        this.type = type;
        this.identifier = identifier;
        this.lastSystemChange = lastSystemChange;
    }

    /**
     * @return {@link #type} (Describes the specific component type as defined in the object-oriented or metric nomenclature partition.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Describes the specific component type as defined in the object-oriented or metric nomenclature partition.)
     */
    public DeviceComponent setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Describes the local assigned unique identification by the software. For example: handle ID.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponent.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Describes the local assigned unique identification by the software. For example: handle ID.)
     */
    public DeviceComponent setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #lastSystemChange} (Describes the timestamp for the most recent system change which includes device configuration or setting change.). This is the underlying object with id, value and extensions. The accessor "getLastSystemChange" gives direct access to the value
     */
    public InstantType getLastSystemChangeElement() {
        if (this.lastSystemChange == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponent.lastSystemChange");
            else if (Configuration.doAutoCreate())
                // bb
                this.lastSystemChange = new InstantType();
        return this.lastSystemChange;
    }

    public boolean hasLastSystemChangeElement() {
        return this.lastSystemChange != null && !this.lastSystemChange.isEmpty();
    }

    public boolean hasLastSystemChange() {
        return this.lastSystemChange != null && !this.lastSystemChange.isEmpty();
    }

    /**
     * @param value {@link #lastSystemChange} (Describes the timestamp for the most recent system change which includes device configuration or setting change.). This is the underlying object with id, value and extensions. The accessor "getLastSystemChange" gives direct access to the value
     */
    public DeviceComponent setLastSystemChangeElement(InstantType value) {
        this.lastSystemChange = value;
        return this;
    }

    /**
     * @return Describes the timestamp for the most recent system change which includes device configuration or setting change.
     */
    public Date getLastSystemChange() {
        return this.lastSystemChange == null ? null : this.lastSystemChange.getValue();
    }

    /**
     * @param value Describes the timestamp for the most recent system change which includes device configuration or setting change.
     */
    public DeviceComponent setLastSystemChange(Date value) {
        if (this.lastSystemChange == null)
            this.lastSystemChange = new InstantType();
        this.lastSystemChange.setValue(value);
        return this;
    }

    /**
     * @return {@link #source} (Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc.)
     */
    public Reference getSource() {
        if (this.source == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponent.source");
            else if (Configuration.doAutoCreate())
                // cc
                this.source = new Reference();
        return this.source;
    }

    public boolean hasSource() {
        return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc.)
     */
    public DeviceComponent setSource(Reference value) {
        this.source = value;
        return this;
    }

    /**
     * @return {@link #source} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc.)
     */
    public Device getSourceTarget() {
        if (this.sourceTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponent.source");
            else if (Configuration.doAutoCreate())
                // aa
                this.sourceTarget = new Device();
        return this.sourceTarget;
    }

    /**
     * @param value {@link #source} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc.)
     */
    public DeviceComponent setSourceTarget(Device value) {
        this.sourceTarget = value;
        return this;
    }

    /**
     * @return {@link #parent} (Describes the link to the parent resource. For example: Channel is linked to its VMD parent.)
     */
    public Reference getParent() {
        if (this.parent == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponent.parent");
            else if (Configuration.doAutoCreate())
                // cc
                this.parent = new Reference();
        return this.parent;
    }

    public boolean hasParent() {
        return this.parent != null && !this.parent.isEmpty();
    }

    /**
     * @param value {@link #parent} (Describes the link to the parent resource. For example: Channel is linked to its VMD parent.)
     */
    public DeviceComponent setParent(Reference value) {
        this.parent = value;
        return this;
    }

    /**
     * @return {@link #parent} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Describes the link to the parent resource. For example: Channel is linked to its VMD parent.)
     */
    public DeviceComponent getParentTarget() {
        if (this.parentTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponent.parent");
            else if (Configuration.doAutoCreate())
                // aa
                this.parentTarget = new DeviceComponent();
        return this.parentTarget;
    }

    /**
     * @param value {@link #parent} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Describes the link to the parent resource. For example: Channel is linked to its VMD parent.)
     */
    public DeviceComponent setParentTarget(DeviceComponent value) {
        this.parentTarget = value;
        return this;
    }

    /**
     * @return {@link #operationalStatus} (Indicates current operational status of the device. For example: On, Off, Standby, etc.)
     */
    public List<CodeableConcept> getOperationalStatus() {
        if (this.operationalStatus == null)
            this.operationalStatus = new ArrayList<CodeableConcept>();
        return this.operationalStatus;
    }

    public boolean hasOperationalStatus() {
        if (this.operationalStatus == null)
            return false;
        for (CodeableConcept item : this.operationalStatus) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #operationalStatus} (Indicates current operational status of the device. For example: On, Off, Standby, etc.)
     */
    // syntactic sugar
    public CodeableConcept addOperationalStatus() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.operationalStatus == null)
            this.operationalStatus = new ArrayList<CodeableConcept>();
        this.operationalStatus.add(t);
        return t;
    }

    // syntactic sugar
    public DeviceComponent addOperationalStatus(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.operationalStatus == null)
            this.operationalStatus = new ArrayList<CodeableConcept>();
        this.operationalStatus.add(t);
        return this;
    }

    /**
     * @return {@link #parameterGroup} (Describes the parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular.)
     */
    public CodeableConcept getParameterGroup() {
        if (this.parameterGroup == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponent.parameterGroup");
            else if (Configuration.doAutoCreate())
                // cc
                this.parameterGroup = new CodeableConcept();
        return this.parameterGroup;
    }

    public boolean hasParameterGroup() {
        return this.parameterGroup != null && !this.parameterGroup.isEmpty();
    }

    /**
     * @param value {@link #parameterGroup} (Describes the parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular.)
     */
    public DeviceComponent setParameterGroup(CodeableConcept value) {
        this.parameterGroup = value;
        return this;
    }

    /**
     * @return {@link #measurementPrinciple} (Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.). This is the underlying object with id, value and extensions. The accessor "getMeasurementPrinciple" gives direct access to the value
     */
    public Enumeration<MeasmntPrinciple> getMeasurementPrincipleElement() {
        if (this.measurementPrinciple == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponent.measurementPrinciple");
            else if (Configuration.doAutoCreate())
                // bb
                this.measurementPrinciple = new Enumeration<MeasmntPrinciple>(new MeasmntPrincipleEnumFactory());
        return this.measurementPrinciple;
    }

    public boolean hasMeasurementPrincipleElement() {
        return this.measurementPrinciple != null && !this.measurementPrinciple.isEmpty();
    }

    public boolean hasMeasurementPrinciple() {
        return this.measurementPrinciple != null && !this.measurementPrinciple.isEmpty();
    }

    /**
     * @param value {@link #measurementPrinciple} (Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.). This is the underlying object with id, value and extensions. The accessor "getMeasurementPrinciple" gives direct access to the value
     */
    public DeviceComponent setMeasurementPrincipleElement(Enumeration<MeasmntPrinciple> value) {
        this.measurementPrinciple = value;
        return this;
    }

    /**
     * @return Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
     */
    public MeasmntPrinciple getMeasurementPrinciple() {
        return this.measurementPrinciple == null ? null : this.measurementPrinciple.getValue();
    }

    /**
     * @param value Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
     */
    public DeviceComponent setMeasurementPrinciple(MeasmntPrinciple value) {
        if (value == null)
            this.measurementPrinciple = null;
        else {
            if (this.measurementPrinciple == null)
                this.measurementPrinciple = new Enumeration<MeasmntPrinciple>(new MeasmntPrincipleEnumFactory());
            this.measurementPrinciple.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #productionSpecification} (Describes the production specification such as component revision, serial number, etc.)
     */
    public List<DeviceComponentProductionSpecificationComponent> getProductionSpecification() {
        if (this.productionSpecification == null)
            this.productionSpecification = new ArrayList<DeviceComponentProductionSpecificationComponent>();
        return this.productionSpecification;
    }

    public boolean hasProductionSpecification() {
        if (this.productionSpecification == null)
            return false;
        for (DeviceComponentProductionSpecificationComponent item : this.productionSpecification) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #productionSpecification} (Describes the production specification such as component revision, serial number, etc.)
     */
    // syntactic sugar
    public DeviceComponentProductionSpecificationComponent addProductionSpecification() {
        // 3
        DeviceComponentProductionSpecificationComponent t = new DeviceComponentProductionSpecificationComponent();
        if (this.productionSpecification == null)
            this.productionSpecification = new ArrayList<DeviceComponentProductionSpecificationComponent>();
        this.productionSpecification.add(t);
        return t;
    }

    // syntactic sugar
    public DeviceComponent addProductionSpecification(DeviceComponentProductionSpecificationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.productionSpecification == null)
            this.productionSpecification = new ArrayList<DeviceComponentProductionSpecificationComponent>();
        this.productionSpecification.add(t);
        return this;
    }

    /**
     * @return {@link #languageCode} (Describes the language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US.)
     */
    public CodeableConcept getLanguageCode() {
        if (this.languageCode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceComponent.languageCode");
            else if (Configuration.doAutoCreate())
                // cc
                this.languageCode = new CodeableConcept();
        return this.languageCode;
    }

    public boolean hasLanguageCode() {
        return this.languageCode != null && !this.languageCode.isEmpty();
    }

    /**
     * @param value {@link #languageCode} (Describes the language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US.)
     */
    public DeviceComponent setLanguageCode(CodeableConcept value) {
        this.languageCode = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "Describes the specific component type as defined in the object-oriented or metric nomenclature partition.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("identifier", "Identifier", "Describes the local assigned unique identification by the software. For example: handle ID.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("lastSystemChange", "instant", "Describes the timestamp for the most recent system change which includes device configuration or setting change.", 0, java.lang.Integer.MAX_VALUE, lastSystemChange));
        childrenList.add(new Property("source", "Reference(Device)", "Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("parent", "Reference(DeviceComponent)", "Describes the link to the parent resource. For example: Channel is linked to its VMD parent.", 0, java.lang.Integer.MAX_VALUE, parent));
        childrenList.add(new Property("operationalStatus", "CodeableConcept", "Indicates current operational status of the device. For example: On, Off, Standby, etc.", 0, java.lang.Integer.MAX_VALUE, operationalStatus));
        childrenList.add(new Property("parameterGroup", "CodeableConcept", "Describes the parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular.", 0, java.lang.Integer.MAX_VALUE, parameterGroup));
        childrenList.add(new Property("measurementPrinciple", "code", "Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.", 0, java.lang.Integer.MAX_VALUE, measurementPrinciple));
        childrenList.add(new Property("productionSpecification", "", "Describes the production specification such as component revision, serial number, etc.", 0, java.lang.Integer.MAX_VALUE, productionSpecification));
        childrenList.add(new Property("languageCode", "CodeableConcept", "Describes the language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US.", 0, java.lang.Integer.MAX_VALUE, languageCode));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("lastSystemChange"))
            // InstantType
            this.lastSystemChange = castToInstant(value);
        else if (name.equals("source"))
            // Reference
            this.source = castToReference(value);
        else if (name.equals("parent"))
            // Reference
            this.parent = castToReference(value);
        else if (name.equals("operationalStatus"))
            this.getOperationalStatus().add(castToCodeableConcept(value));
        else if (name.equals("parameterGroup"))
            // CodeableConcept
            this.parameterGroup = castToCodeableConcept(value);
        else if (name.equals("measurementPrinciple"))
            // Enumeration<MeasmntPrinciple>
            this.measurementPrinciple = new MeasmntPrincipleEnumFactory().fromType(value);
        else if (name.equals("productionSpecification"))
            this.getProductionSpecification().add((DeviceComponentProductionSpecificationComponent) value);
        else if (name.equals("languageCode"))
            // CodeableConcept
            this.languageCode = castToCodeableConcept(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("lastSystemChange")) {
            throw new FHIRException("Cannot call addChild on a primitive type DeviceComponent.lastSystemChange");
        } else if (name.equals("source")) {
            this.source = new Reference();
            return this.source;
        } else if (name.equals("parent")) {
            this.parent = new Reference();
            return this.parent;
        } else if (name.equals("operationalStatus")) {
            return addOperationalStatus();
        } else if (name.equals("parameterGroup")) {
            this.parameterGroup = new CodeableConcept();
            return this.parameterGroup;
        } else if (name.equals("measurementPrinciple")) {
            throw new FHIRException("Cannot call addChild on a primitive type DeviceComponent.measurementPrinciple");
        } else if (name.equals("productionSpecification")) {
            return addProductionSpecification();
        } else if (name.equals("languageCode")) {
            this.languageCode = new CodeableConcept();
            return this.languageCode;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "DeviceComponent";
    }

    public DeviceComponent copy() {
        DeviceComponent dst = new DeviceComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.lastSystemChange = lastSystemChange == null ? null : lastSystemChange.copy();
        dst.source = source == null ? null : source.copy();
        dst.parent = parent == null ? null : parent.copy();
        if (operationalStatus != null) {
            dst.operationalStatus = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : operationalStatus) dst.operationalStatus.add(i.copy());
        }
        ;
        dst.parameterGroup = parameterGroup == null ? null : parameterGroup.copy();
        dst.measurementPrinciple = measurementPrinciple == null ? null : measurementPrinciple.copy();
        if (productionSpecification != null) {
            dst.productionSpecification = new ArrayList<DeviceComponentProductionSpecificationComponent>();
            for (DeviceComponentProductionSpecificationComponent i : productionSpecification) dst.productionSpecification.add(i.copy());
        }
        ;
        dst.languageCode = languageCode == null ? null : languageCode.copy();
        return dst;
    }

    protected DeviceComponent typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DeviceComponent))
            return false;
        DeviceComponent o = (DeviceComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(identifier, o.identifier, true) && compareDeep(lastSystemChange, o.lastSystemChange, true) && compareDeep(source, o.source, true) && compareDeep(parent, o.parent, true) && compareDeep(operationalStatus, o.operationalStatus, true) && compareDeep(parameterGroup, o.parameterGroup, true) && compareDeep(measurementPrinciple, o.measurementPrinciple, true) && compareDeep(productionSpecification, o.productionSpecification, true) && compareDeep(languageCode, o.languageCode, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DeviceComponent))
            return false;
        DeviceComponent o = (DeviceComponent) other;
        return compareValues(lastSystemChange, o.lastSystemChange, true) && compareValues(measurementPrinciple, o.measurementPrinciple, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (identifier == null || identifier.isEmpty()) && (lastSystemChange == null || lastSystemChange.isEmpty()) && (source == null || source.isEmpty()) && (parent == null || parent.isEmpty()) && (operationalStatus == null || operationalStatus.isEmpty()) && (parameterGroup == null || parameterGroup.isEmpty()) && (measurementPrinciple == null || measurementPrinciple.isEmpty()) && (productionSpecification == null || productionSpecification.isEmpty()) && (languageCode == null || languageCode.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.DeviceComponent;
    }

    public static final String SP_PARENT = "parent";

    public static final String SP_SOURCE = "source";

    public static final String SP_TYPE = "type";
}
