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
import java.util.Date;
import java.util.List;
import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricColor;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricColorEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCategory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationType;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationState;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricCalibrationStateEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricOperationalStatus;
import org.hl7.fhir.android.generated.dstu2.DeviceMetricEnum.DeviceMetricOperationalStatusEnumFactory;

/**
 * Describes a measurement, calculation or setting capability of a medical device.
 */
@ResourceDef(name = "DeviceMetric", profile = "http://hl7.org/fhir/Profile/DeviceMetric")
public class DeviceMetric extends DomainResource {

    @Block()
    public static class DeviceMetricCalibrationComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * Describes the type of the calibration method.
         */
        @Child(name = "type", type = { CodeType.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "unspecified | offset | gain | two-point", formalDefinition = "Describes the type of the calibration method.")
        protected Enumeration<DeviceMetricCalibrationType> type;

        /**
         * Describes the state of the calibration.
         */
        @Child(name = "state", type = { CodeType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "not-calibrated | calibration-required | calibrated | unspecified", formalDefinition = "Describes the state of the calibration.")
        protected Enumeration<DeviceMetricCalibrationState> state;

        /**
         * Describes the time last calibration has been performed.
         */
        @Child(name = "time", type = { InstantType.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Describes the time last calibration has been performed", formalDefinition = "Describes the time last calibration has been performed.")
        protected InstantType time;

        private static final long serialVersionUID = 1163986578L;

        /*
     * Constructor
     */
        public DeviceMetricCalibrationComponent() {
            super();
        }

        /**
         * @return {@link #type} (Describes the type of the calibration method.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public Enumeration<DeviceMetricCalibrationType> getTypeElement() {
            if (this.type == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.type");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.type = new Enumeration<DeviceMetricCalibrationType>(new DeviceMetricCalibrationTypeEnumFactory());
            return this.type;
        }

        public boolean hasTypeElement() {
            return this.type != null && !this.type.isEmpty();
        }

        public boolean hasType() {
            return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Describes the type of the calibration method.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public DeviceMetricCalibrationComponent setTypeElement(Enumeration<DeviceMetricCalibrationType> value) {
            this.type = value;
            return this;
        }

        /**
         * @return Describes the type of the calibration method.
         */
        public DeviceMetricCalibrationType getType() {
            return this.type == null ? null : this.type.getValue();
        }

        /**
         * @param value Describes the type of the calibration method.
         */
        public DeviceMetricCalibrationComponent setType(DeviceMetricCalibrationType value) {
            if (value == null)
                this.type = null;
            else {
                if (this.type == null)
                    this.type = new Enumeration<DeviceMetricCalibrationType>(new DeviceMetricCalibrationTypeEnumFactory());
                this.type.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #state} (Describes the state of the calibration.). This is the underlying object with id, value and extensions. The accessor "getState" gives direct access to the value
         */
        public Enumeration<DeviceMetricCalibrationState> getStateElement() {
            if (this.state == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.state");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.state = new Enumeration<DeviceMetricCalibrationState>(new DeviceMetricCalibrationStateEnumFactory());
            return this.state;
        }

        public boolean hasStateElement() {
            return this.state != null && !this.state.isEmpty();
        }

        public boolean hasState() {
            return this.state != null && !this.state.isEmpty();
        }

        /**
         * @param value {@link #state} (Describes the state of the calibration.). This is the underlying object with id, value and extensions. The accessor "getState" gives direct access to the value
         */
        public DeviceMetricCalibrationComponent setStateElement(Enumeration<DeviceMetricCalibrationState> value) {
            this.state = value;
            return this;
        }

        /**
         * @return Describes the state of the calibration.
         */
        public DeviceMetricCalibrationState getState() {
            return this.state == null ? null : this.state.getValue();
        }

        /**
         * @param value Describes the state of the calibration.
         */
        public DeviceMetricCalibrationComponent setState(DeviceMetricCalibrationState value) {
            if (value == null)
                this.state = null;
            else {
                if (this.state == null)
                    this.state = new Enumeration<DeviceMetricCalibrationState>(new DeviceMetricCalibrationStateEnumFactory());
                this.state.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #time} (Describes the time last calibration has been performed.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
         */
        public InstantType getTimeElement() {
            if (this.time == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.time");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.time = new InstantType();
            return this.time;
        }

        public boolean hasTimeElement() {
            return this.time != null && !this.time.isEmpty();
        }

        public boolean hasTime() {
            return this.time != null && !this.time.isEmpty();
        }

        /**
         * @param value {@link #time} (Describes the time last calibration has been performed.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
         */
        public DeviceMetricCalibrationComponent setTimeElement(InstantType value) {
            this.time = value;
            return this;
        }

        /**
         * @return Describes the time last calibration has been performed.
         */
        public Date getTime() {
            return this.time == null ? null : this.time.getValue();
        }

        /**
         * @param value Describes the time last calibration has been performed.
         */
        public DeviceMetricCalibrationComponent setTime(Date value) {
            if (value == null)
                this.time = null;
            else {
                if (this.time == null)
                    this.time = new InstantType();
                this.time.setValue(value);
            }
            return this;
        }

        protected void listChildren(List<Property> childrenList) {
            super.listChildren(childrenList);
            childrenList.add(new Property("type", "code", "Describes the type of the calibration method.", 0, java.lang.Integer.MAX_VALUE, type));
            childrenList.add(new Property("state", "code", "Describes the state of the calibration.", 0, java.lang.Integer.MAX_VALUE, state));
            childrenList.add(new Property("time", "instant", "Describes the time last calibration has been performed.", 0, java.lang.Integer.MAX_VALUE, time));
        }

        @Override
        public void setProperty(String name, Base value) throws FHIRException {
            if (name.equals("type"))
                // Enumeration<DeviceMetricCalibrationType>
                this.type = new DeviceMetricCalibrationTypeEnumFactory().fromType(value);
            else if (name.equals("state"))
                // Enumeration<DeviceMetricCalibrationState>
                this.state = new DeviceMetricCalibrationStateEnumFactory().fromType(value);
            else if (name.equals("time"))
                // InstantType
                this.time = castToInstant(value);
            else
                super.setProperty(name, value);
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("type")) {
                throw new FHIRException("Cannot call addChild on a primitive type DeviceMetric.type");
            } else if (name.equals("state")) {
                throw new FHIRException("Cannot call addChild on a primitive type DeviceMetric.state");
            } else if (name.equals("time")) {
                throw new FHIRException("Cannot call addChild on a primitive type DeviceMetric.time");
            } else
                return super.addChild(name);
        }

        public DeviceMetricCalibrationComponent copy() {
            DeviceMetricCalibrationComponent dst = new DeviceMetricCalibrationComponent();
            copyValues(dst);
            dst.type = type == null ? null : type.copy();
            dst.state = state == null ? null : state.copy();
            dst.time = time == null ? null : time.copy();
            return dst;
        }

        @Override
        public boolean equalsDeep(Base other) {
            if (!super.equalsDeep(other))
                return false;
            if (!(other instanceof DeviceMetricCalibrationComponent))
                return false;
            DeviceMetricCalibrationComponent o = (DeviceMetricCalibrationComponent) other;
            return compareDeep(type, o.type, true) && compareDeep(state, o.state, true) && compareDeep(time, o.time, true);
        }

        @Override
        public boolean equalsShallow(Base other) {
            if (!super.equalsShallow(other))
                return false;
            if (!(other instanceof DeviceMetricCalibrationComponent))
                return false;
            DeviceMetricCalibrationComponent o = (DeviceMetricCalibrationComponent) other;
            return compareValues(type, o.type, true) && compareValues(state, o.state, true) && compareValues(time, o.time, true);
        }

        public boolean isEmpty() {
            return super.isEmpty() && (type == null || type.isEmpty()) && (state == null || state.isEmpty()) && (time == null || time.isEmpty());
        }

        public String fhirType() {
            return "DeviceMetric.calibration";
        }
    }

    /**
     * Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
     */
    @Child(name = "type", type = { CodeableConcept.class }, order = 0, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Type of metric", formalDefinition = "Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.")
    protected CodeableConcept type;

    /**
     * Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.
     */
    @Child(name = "identifier", type = { Identifier.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Unique identifier of this DeviceMetric", formalDefinition = "Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.")
    protected Identifier identifier;

    /**
     * Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.
     */
    @Child(name = "unit", type = { CodeableConcept.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Unit of metric", formalDefinition = "Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.")
    protected CodeableConcept unit;

    /**
     * Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.
     */
    @Child(name = "source", type = { Device.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Describes the link to the source Device", formalDefinition = "Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.")
    protected Reference source;

    /**
     * The actual object that is the target of the reference (Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.)
     */
    protected Device sourceTarget;

    /**
     * Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.
     */
    @Child(name = "parent", type = { DeviceComponent.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Describes the link to the parent DeviceComponent", formalDefinition = "Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.")
    protected Reference parent;

    /**
     * The actual object that is the target of the reference (Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.)
     */
    protected DeviceComponent parentTarget;

    /**
     * Indicates current operational state of the device. For example: On, Off, Standby, etc.
     */
    @Child(name = "operationalStatus", type = { CodeType.class }, order = 5, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "on | off | standby", formalDefinition = "Indicates current operational state of the device. For example: On, Off, Standby, etc.")
    protected Enumeration<DeviceMetricOperationalStatus> operationalStatus;

    /**
     * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     */
    @Child(name = "color", type = { CodeType.class }, order = 6, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "black | red | green | yellow | blue | magenta | cyan | white", formalDefinition = "Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.")
    protected Enumeration<DeviceMetricColor> color;

    /**
     * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     */
    @Child(name = "category", type = { CodeType.class }, order = 7, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "measurement | setting | calculation | unspecified", formalDefinition = "Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.")
    protected Enumeration<DeviceMetricCategory> category;

    /**
     * Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.
     */
    @Child(name = "measurementPeriod", type = { Timing.class }, order = 8, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Describes the measurement repetition time", formalDefinition = "Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.")
    protected Timing measurementPeriod;

    /**
     * Describes the calibrations that have been performed or that are required to be performed.
     */
    @Child(name = "calibration", type = {}, order = 9, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Describes the calibrations that have been performed or that are required to be performed", formalDefinition = "Describes the calibrations that have been performed or that are required to be performed.")
    protected List<DeviceMetricCalibrationComponent> calibration;

    private static final long serialVersionUID = 1786401018L;

    /*
   * Constructor
   */
    public DeviceMetric() {
        super();
    }

    /*
   * Constructor
   */
    public DeviceMetric(CodeableConcept type, Identifier identifier, Enumeration<DeviceMetricCategory> category) {
        super();
        this.type = type;
        this.identifier = identifier;
        this.category = category;
    }

    /**
     * @return {@link #type} (Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.)
     */
    public DeviceMetric setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.)
     */
    public DeviceMetric setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #unit} (Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.)
     */
    public CodeableConcept getUnit() {
        if (this.unit == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.unit");
            else if (Configuration.doAutoCreate())
                // cc
                this.unit = new CodeableConcept();
        return this.unit;
    }

    public boolean hasUnit() {
        return this.unit != null && !this.unit.isEmpty();
    }

    /**
     * @param value {@link #unit} (Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.)
     */
    public DeviceMetric setUnit(CodeableConcept value) {
        this.unit = value;
        return this;
    }

    /**
     * @return {@link #source} (Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.)
     */
    public Reference getSource() {
        if (this.source == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.source");
            else if (Configuration.doAutoCreate())
                // cc
                this.source = new Reference();
        return this.source;
    }

    public boolean hasSource() {
        return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.)
     */
    public DeviceMetric setSource(Reference value) {
        this.source = value;
        return this;
    }

    /**
     * @return {@link #source} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.)
     */
    public Device getSourceTarget() {
        if (this.sourceTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.source");
            else if (Configuration.doAutoCreate())
                // aa
                this.sourceTarget = new Device();
        return this.sourceTarget;
    }

    /**
     * @param value {@link #source} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.)
     */
    public DeviceMetric setSourceTarget(Device value) {
        this.sourceTarget = value;
        return this;
    }

    /**
     * @return {@link #parent} (Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.)
     */
    public Reference getParent() {
        if (this.parent == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.parent");
            else if (Configuration.doAutoCreate())
                // cc
                this.parent = new Reference();
        return this.parent;
    }

    public boolean hasParent() {
        return this.parent != null && !this.parent.isEmpty();
    }

    /**
     * @param value {@link #parent} (Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.)
     */
    public DeviceMetric setParent(Reference value) {
        this.parent = value;
        return this;
    }

    /**
     * @return {@link #parent} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.)
     */
    public DeviceComponent getParentTarget() {
        if (this.parentTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.parent");
            else if (Configuration.doAutoCreate())
                // aa
                this.parentTarget = new DeviceComponent();
        return this.parentTarget;
    }

    /**
     * @param value {@link #parent} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.)
     */
    public DeviceMetric setParentTarget(DeviceComponent value) {
        this.parentTarget = value;
        return this;
    }

    /**
     * @return {@link #operationalStatus} (Indicates current operational state of the device. For example: On, Off, Standby, etc.). This is the underlying object with id, value and extensions. The accessor "getOperationalStatus" gives direct access to the value
     */
    public Enumeration<DeviceMetricOperationalStatus> getOperationalStatusElement() {
        if (this.operationalStatus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.operationalStatus");
            else if (Configuration.doAutoCreate())
                // bb
                this.operationalStatus = new Enumeration<DeviceMetricOperationalStatus>(new DeviceMetricOperationalStatusEnumFactory());
        return this.operationalStatus;
    }

    public boolean hasOperationalStatusElement() {
        return this.operationalStatus != null && !this.operationalStatus.isEmpty();
    }

    public boolean hasOperationalStatus() {
        return this.operationalStatus != null && !this.operationalStatus.isEmpty();
    }

    /**
     * @param value {@link #operationalStatus} (Indicates current operational state of the device. For example: On, Off, Standby, etc.). This is the underlying object with id, value and extensions. The accessor "getOperationalStatus" gives direct access to the value
     */
    public DeviceMetric setOperationalStatusElement(Enumeration<DeviceMetricOperationalStatus> value) {
        this.operationalStatus = value;
        return this;
    }

    /**
     * @return Indicates current operational state of the device. For example: On, Off, Standby, etc.
     */
    public DeviceMetricOperationalStatus getOperationalStatus() {
        return this.operationalStatus == null ? null : this.operationalStatus.getValue();
    }

    /**
     * @param value Indicates current operational state of the device. For example: On, Off, Standby, etc.
     */
    public DeviceMetric setOperationalStatus(DeviceMetricOperationalStatus value) {
        if (value == null)
            this.operationalStatus = null;
        else {
            if (this.operationalStatus == null)
                this.operationalStatus = new Enumeration<DeviceMetricOperationalStatus>(new DeviceMetricOperationalStatusEnumFactory());
            this.operationalStatus.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #color} (Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.). This is the underlying object with id, value and extensions. The accessor "getColor" gives direct access to the value
     */
    public Enumeration<DeviceMetricColor> getColorElement() {
        if (this.color == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.color");
            else if (Configuration.doAutoCreate())
                // bb
                this.color = new Enumeration<DeviceMetricColor>(new DeviceMetricColorEnumFactory());
        return this.color;
    }

    public boolean hasColorElement() {
        return this.color != null && !this.color.isEmpty();
    }

    public boolean hasColor() {
        return this.color != null && !this.color.isEmpty();
    }

    /**
     * @param value {@link #color} (Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.). This is the underlying object with id, value and extensions. The accessor "getColor" gives direct access to the value
     */
    public DeviceMetric setColorElement(Enumeration<DeviceMetricColor> value) {
        this.color = value;
        return this;
    }

    /**
     * @return Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     */
    public DeviceMetricColor getColor() {
        return this.color == null ? null : this.color.getValue();
    }

    /**
     * @param value Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     */
    public DeviceMetric setColor(DeviceMetricColor value) {
        if (value == null)
            this.color = null;
        else {
            if (this.color == null)
                this.color = new Enumeration<DeviceMetricColor>(new DeviceMetricColorEnumFactory());
            this.color.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #category} (Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
     */
    public Enumeration<DeviceMetricCategory> getCategoryElement() {
        if (this.category == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.category");
            else if (Configuration.doAutoCreate())
                // bb
                this.category = new Enumeration<DeviceMetricCategory>(new DeviceMetricCategoryEnumFactory());
        return this.category;
    }

    public boolean hasCategoryElement() {
        return this.category != null && !this.category.isEmpty();
    }

    public boolean hasCategory() {
        return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
     */
    public DeviceMetric setCategoryElement(Enumeration<DeviceMetricCategory> value) {
        this.category = value;
        return this;
    }

    /**
     * @return Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     */
    public DeviceMetricCategory getCategory() {
        return this.category == null ? null : this.category.getValue();
    }

    /**
     * @param value Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     */
    public DeviceMetric setCategory(DeviceMetricCategory value) {
        if (this.category == null)
            this.category = new Enumeration<DeviceMetricCategory>(new DeviceMetricCategoryEnumFactory());
        this.category.setValue(value);
        return this;
    }

    /**
     * @return {@link #measurementPeriod} (Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.)
     */
    public Timing getMeasurementPeriod() {
        if (this.measurementPeriod == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DeviceMetric.measurementPeriod");
            else if (Configuration.doAutoCreate())
                // cc
                this.measurementPeriod = new Timing();
        return this.measurementPeriod;
    }

    public boolean hasMeasurementPeriod() {
        return this.measurementPeriod != null && !this.measurementPeriod.isEmpty();
    }

    /**
     * @param value {@link #measurementPeriod} (Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.)
     */
    public DeviceMetric setMeasurementPeriod(Timing value) {
        this.measurementPeriod = value;
        return this;
    }

    /**
     * @return {@link #calibration} (Describes the calibrations that have been performed or that are required to be performed.)
     */
    public List<DeviceMetricCalibrationComponent> getCalibration() {
        if (this.calibration == null)
            this.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
        return this.calibration;
    }

    public boolean hasCalibration() {
        if (this.calibration == null)
            return false;
        for (DeviceMetricCalibrationComponent item : this.calibration) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #calibration} (Describes the calibrations that have been performed or that are required to be performed.)
     */
    // syntactic sugar
    public DeviceMetricCalibrationComponent addCalibration() {
        // 3
        DeviceMetricCalibrationComponent t = new DeviceMetricCalibrationComponent();
        if (this.calibration == null)
            this.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
        this.calibration.add(t);
        return t;
    }

    // syntactic sugar
    public DeviceMetric addCalibration(DeviceMetricCalibrationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.calibration == null)
            this.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
        this.calibration.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("identifier", "Identifier", "Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("unit", "CodeableConcept", "Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.", 0, java.lang.Integer.MAX_VALUE, unit));
        childrenList.add(new Property("source", "Reference(Device)", "Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("parent", "Reference(DeviceComponent)", "Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.", 0, java.lang.Integer.MAX_VALUE, parent));
        childrenList.add(new Property("operationalStatus", "code", "Indicates current operational state of the device. For example: On, Off, Standby, etc.", 0, java.lang.Integer.MAX_VALUE, operationalStatus));
        childrenList.add(new Property("color", "code", "Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.", 0, java.lang.Integer.MAX_VALUE, color));
        childrenList.add(new Property("category", "code", "Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("measurementPeriod", "Timing", "Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.", 0, java.lang.Integer.MAX_VALUE, measurementPeriod));
        childrenList.add(new Property("calibration", "", "Describes the calibrations that have been performed or that are required to be performed.", 0, java.lang.Integer.MAX_VALUE, calibration));
    }

    @Override
    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("unit"))
            // CodeableConcept
            this.unit = castToCodeableConcept(value);
        else if (name.equals("source"))
            // Reference
            this.source = castToReference(value);
        else if (name.equals("parent"))
            // Reference
            this.parent = castToReference(value);
        else if (name.equals("operationalStatus"))
            // Enumeration<DeviceMetricOperationalStatus>
            this.operationalStatus = new DeviceMetricOperationalStatusEnumFactory().fromType(value);
        else if (name.equals("color"))
            // Enumeration<DeviceMetricColor>
            this.color = new DeviceMetricColorEnumFactory().fromType(value);
        else if (name.equals("category"))
            // Enumeration<DeviceMetricCategory>
            this.category = new DeviceMetricCategoryEnumFactory().fromType(value);
        else if (name.equals("measurementPeriod"))
            // Timing
            this.measurementPeriod = castToTiming(value);
        else if (name.equals("calibration"))
            this.getCalibration().add((DeviceMetricCalibrationComponent) value);
        else
            super.setProperty(name, value);
    }

    @Override
    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("unit")) {
            this.unit = new CodeableConcept();
            return this.unit;
        } else if (name.equals("source")) {
            this.source = new Reference();
            return this.source;
        } else if (name.equals("parent")) {
            this.parent = new Reference();
            return this.parent;
        } else if (name.equals("operationalStatus")) {
            throw new FHIRException("Cannot call addChild on a primitive type DeviceMetric.operationalStatus");
        } else if (name.equals("color")) {
            throw new FHIRException("Cannot call addChild on a primitive type DeviceMetric.color");
        } else if (name.equals("category")) {
            throw new FHIRException("Cannot call addChild on a primitive type DeviceMetric.category");
        } else if (name.equals("measurementPeriod")) {
            this.measurementPeriod = new Timing();
            return this.measurementPeriod;
        } else if (name.equals("calibration")) {
            return addCalibration();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "DeviceMetric";
    }

    public DeviceMetric copy() {
        DeviceMetric dst = new DeviceMetric();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.unit = unit == null ? null : unit.copy();
        dst.source = source == null ? null : source.copy();
        dst.parent = parent == null ? null : parent.copy();
        dst.operationalStatus = operationalStatus == null ? null : operationalStatus.copy();
        dst.color = color == null ? null : color.copy();
        dst.category = category == null ? null : category.copy();
        dst.measurementPeriod = measurementPeriod == null ? null : measurementPeriod.copy();
        if (calibration != null) {
            dst.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
            for (DeviceMetricCalibrationComponent i : calibration) dst.calibration.add(i.copy());
        }
        ;
        return dst;
    }

    protected DeviceMetric typedCopy() {
        return copy();
    }

    @Override
    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DeviceMetric))
            return false;
        DeviceMetric o = (DeviceMetric) other;
        return compareDeep(type, o.type, true) && compareDeep(identifier, o.identifier, true) && compareDeep(unit, o.unit, true) && compareDeep(source, o.source, true) && compareDeep(parent, o.parent, true) && compareDeep(operationalStatus, o.operationalStatus, true) && compareDeep(color, o.color, true) && compareDeep(category, o.category, true) && compareDeep(measurementPeriod, o.measurementPeriod, true) && compareDeep(calibration, o.calibration, true);
    }

    @Override
    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DeviceMetric))
            return false;
        DeviceMetric o = (DeviceMetric) other;
        return compareValues(operationalStatus, o.operationalStatus, true) && compareValues(color, o.color, true) && compareValues(category, o.category, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (identifier == null || identifier.isEmpty()) && (unit == null || unit.isEmpty()) && (source == null || source.isEmpty()) && (parent == null || parent.isEmpty()) && (operationalStatus == null || operationalStatus.isEmpty()) && (color == null || color.isEmpty()) && (category == null || category.isEmpty()) && (measurementPeriod == null || measurementPeriod.isEmpty()) && (calibration == null || calibration.isEmpty());
    }

    @Override
    public ResourceType getResourceType() {
        return ResourceType.DeviceMetric;
    }

    @SearchParamDefinition(name = "parent", path = "DeviceMetric.parent", description = "The parent DeviceMetric resource", type = "reference")
    public static final String SP_PARENT = "parent";

    @SearchParamDefinition(name = "identifier", path = "DeviceMetric.identifier", description = "The identifier of the metric", type = "token")
    public static final String SP_IDENTIFIER = "identifier";

    @SearchParamDefinition(name = "source", path = "DeviceMetric.source", description = "The device resource", type = "reference")
    public static final String SP_SOURCE = "source";

    @SearchParamDefinition(name = "type", path = "DeviceMetric.type", description = "The component type", type = "token")
    public static final String SP_TYPE = "type";

    @SearchParamDefinition(name = "category", path = "DeviceMetric.category", description = "The category of the metric", type = "token")
    public static final String SP_CATEGORY = "category";
}
