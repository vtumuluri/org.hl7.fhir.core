package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MediaEnum.DigitalMediaType;
import org.hl7.fhir.android.generated.dstu2.MediaEnum.DigitalMediaTypeEnumFactory;

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
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
 */
public class Media extends DomainResource {

    /**
     * Whether the media is a photo (still image), an audio recording, or a video recording.
     */
    protected Enumeration<DigitalMediaType> type;

    /**
     * Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.
     */
    protected CodeableConcept subtype;

    /**
     * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.
     */
    protected List<Identifier> identifier;

    /**
     * Who/What this Media is a record of.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Who/What this Media is a record of.)
     */
    protected Resource subjectTarget;

    /**
     * The person who administered the collection of the image.
     */
    protected Reference operator;

    /**
     * The actual object that is the target of the reference (The person who administered the collection of the image.)
     */
    protected Practitioner operatorTarget;

    /**
     * The name of the imaging view e.g. Lateral or Antero-posterior (AP).
     */
    protected CodeableConcept view;

    /**
     * The name of the device / manufacturer of the device  that was used to make the recording.
     */
    protected StringType deviceName;

    /**
     * Height of the image in pixels (photo/video).
     */
    protected PositiveIntType height;

    /**
     * Width of the image in pixels (photo/video).
     */
    protected PositiveIntType width;

    /**
     * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.
     */
    protected PositiveIntType frames;

    /**
     * The duration of the recording in seconds - for audio and video.
     */
    protected UnsignedIntType duration;

    /**
     * The actual content of the media - inline or by direct reference to the media source file.
     */
    protected Attachment content;

    private static final long serialVersionUID = -280764739L;

    /*
   * Constructor
   */
    public Media() {
        super();
    }

    /*
   * Constructor
   */
    public Media(Enumeration<DigitalMediaType> type, Attachment content) {
        super();
        this.type = type;
        this.content = content;
    }

    /**
     * @return {@link #type} (Whether the media is a photo (still image), an audio recording, or a video recording.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<DigitalMediaType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<DigitalMediaType>(new DigitalMediaTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Whether the media is a photo (still image), an audio recording, or a video recording.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Media setTypeElement(Enumeration<DigitalMediaType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return Whether the media is a photo (still image), an audio recording, or a video recording.
     */
    public DigitalMediaType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Whether the media is a photo (still image), an audio recording, or a video recording.
     */
    public Media setType(DigitalMediaType value) {
        if (this.type == null)
            this.type = new Enumeration<DigitalMediaType>(new DigitalMediaTypeEnumFactory());
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #subtype} (Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.)
     */
    public CodeableConcept getSubtype() {
        if (this.subtype == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.subtype");
            else if (Configuration.doAutoCreate())
                // cc
                this.subtype = new CodeableConcept();
        return this.subtype;
    }

    public boolean hasSubtype() {
        return this.subtype != null && !this.subtype.isEmpty();
    }

    /**
     * @param value {@link #subtype} (Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.)
     */
    public Media setSubtype(CodeableConcept value) {
        this.subtype = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.)
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
     * @return {@link #identifier} (Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.)
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
    public Media addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #subject} (Who/What this Media is a record of.)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Who/What this Media is a record of.)
     */
    public Media setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who/What this Media is a record of.)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who/What this Media is a record of.)
     */
    public Media setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #operator} (The person who administered the collection of the image.)
     */
    public Reference getOperator() {
        if (this.operator == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.operator");
            else if (Configuration.doAutoCreate())
                // cc
                this.operator = new Reference();
        return this.operator;
    }

    public boolean hasOperator() {
        return this.operator != null && !this.operator.isEmpty();
    }

    /**
     * @param value {@link #operator} (The person who administered the collection of the image.)
     */
    public Media setOperator(Reference value) {
        this.operator = value;
        return this;
    }

    /**
     * @return {@link #operator} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person who administered the collection of the image.)
     */
    public Practitioner getOperatorTarget() {
        if (this.operatorTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.operator");
            else if (Configuration.doAutoCreate())
                // aa
                this.operatorTarget = new Practitioner();
        return this.operatorTarget;
    }

    /**
     * @param value {@link #operator} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person who administered the collection of the image.)
     */
    public Media setOperatorTarget(Practitioner value) {
        this.operatorTarget = value;
        return this;
    }

    /**
     * @return {@link #view} (The name of the imaging view e.g. Lateral or Antero-posterior (AP).)
     */
    public CodeableConcept getView() {
        if (this.view == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.view");
            else if (Configuration.doAutoCreate())
                // cc
                this.view = new CodeableConcept();
        return this.view;
    }

    public boolean hasView() {
        return this.view != null && !this.view.isEmpty();
    }

    /**
     * @param value {@link #view} (The name of the imaging view e.g. Lateral or Antero-posterior (AP).)
     */
    public Media setView(CodeableConcept value) {
        this.view = value;
        return this;
    }

    /**
     * @return {@link #deviceName} (The name of the device / manufacturer of the device  that was used to make the recording.). This is the underlying object with id, value and extensions. The accessor "getDeviceName" gives direct access to the value
     */
    public StringType getDeviceNameElement() {
        if (this.deviceName == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.deviceName");
            else if (Configuration.doAutoCreate())
                // bb
                this.deviceName = new StringType();
        return this.deviceName;
    }

    public boolean hasDeviceNameElement() {
        return this.deviceName != null && !this.deviceName.isEmpty();
    }

    public boolean hasDeviceName() {
        return this.deviceName != null && !this.deviceName.isEmpty();
    }

    /**
     * @param value {@link #deviceName} (The name of the device / manufacturer of the device  that was used to make the recording.). This is the underlying object with id, value and extensions. The accessor "getDeviceName" gives direct access to the value
     */
    public Media setDeviceNameElement(StringType value) {
        this.deviceName = value;
        return this;
    }

    /**
     * @return The name of the device / manufacturer of the device  that was used to make the recording.
     */
    public String getDeviceName() {
        return this.deviceName == null ? null : this.deviceName.getValue();
    }

    /**
     * @param value The name of the device / manufacturer of the device  that was used to make the recording.
     */
    public Media setDeviceName(String value) {
        if (Utilities.noString(value))
            this.deviceName = null;
        else {
            if (this.deviceName == null)
                this.deviceName = new StringType();
            this.deviceName.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #height} (Height of the image in pixels (photo/video).). This is the underlying object with id, value and extensions. The accessor "getHeight" gives direct access to the value
     */
    public PositiveIntType getHeightElement() {
        if (this.height == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.height");
            else if (Configuration.doAutoCreate())
                // bb
                this.height = new PositiveIntType();
        return this.height;
    }

    public boolean hasHeightElement() {
        return this.height != null && !this.height.isEmpty();
    }

    public boolean hasHeight() {
        return this.height != null && !this.height.isEmpty();
    }

    /**
     * @param value {@link #height} (Height of the image in pixels (photo/video).). This is the underlying object with id, value and extensions. The accessor "getHeight" gives direct access to the value
     */
    public Media setHeightElement(PositiveIntType value) {
        this.height = value;
        return this;
    }

    /**
     * @return Height of the image in pixels (photo/video).
     */
    public int getHeight() {
        return this.height == null || this.height.isEmpty() ? 0 : this.height.getValue();
    }

    /**
     * @param value Height of the image in pixels (photo/video).
     */
    public Media setHeight(int value) {
        if (this.height == null)
            this.height = new PositiveIntType();
        this.height.setValue(value);
        return this;
    }

    /**
     * @return {@link #width} (Width of the image in pixels (photo/video).). This is the underlying object with id, value and extensions. The accessor "getWidth" gives direct access to the value
     */
    public PositiveIntType getWidthElement() {
        if (this.width == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.width");
            else if (Configuration.doAutoCreate())
                // bb
                this.width = new PositiveIntType();
        return this.width;
    }

    public boolean hasWidthElement() {
        return this.width != null && !this.width.isEmpty();
    }

    public boolean hasWidth() {
        return this.width != null && !this.width.isEmpty();
    }

    /**
     * @param value {@link #width} (Width of the image in pixels (photo/video).). This is the underlying object with id, value and extensions. The accessor "getWidth" gives direct access to the value
     */
    public Media setWidthElement(PositiveIntType value) {
        this.width = value;
        return this;
    }

    /**
     * @return Width of the image in pixels (photo/video).
     */
    public int getWidth() {
        return this.width == null || this.width.isEmpty() ? 0 : this.width.getValue();
    }

    /**
     * @param value Width of the image in pixels (photo/video).
     */
    public Media setWidth(int value) {
        if (this.width == null)
            this.width = new PositiveIntType();
        this.width.setValue(value);
        return this;
    }

    /**
     * @return {@link #frames} (The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.). This is the underlying object with id, value and extensions. The accessor "getFrames" gives direct access to the value
     */
    public PositiveIntType getFramesElement() {
        if (this.frames == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.frames");
            else if (Configuration.doAutoCreate())
                // bb
                this.frames = new PositiveIntType();
        return this.frames;
    }

    public boolean hasFramesElement() {
        return this.frames != null && !this.frames.isEmpty();
    }

    public boolean hasFrames() {
        return this.frames != null && !this.frames.isEmpty();
    }

    /**
     * @param value {@link #frames} (The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.). This is the underlying object with id, value and extensions. The accessor "getFrames" gives direct access to the value
     */
    public Media setFramesElement(PositiveIntType value) {
        this.frames = value;
        return this;
    }

    /**
     * @return The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.
     */
    public int getFrames() {
        return this.frames == null || this.frames.isEmpty() ? 0 : this.frames.getValue();
    }

    /**
     * @param value The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.
     */
    public Media setFrames(int value) {
        if (this.frames == null)
            this.frames = new PositiveIntType();
        this.frames.setValue(value);
        return this;
    }

    /**
     * @return {@link #duration} (The duration of the recording in seconds - for audio and video.). This is the underlying object with id, value and extensions. The accessor "getDuration" gives direct access to the value
     */
    public UnsignedIntType getDurationElement() {
        if (this.duration == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.duration");
            else if (Configuration.doAutoCreate())
                // bb
                this.duration = new UnsignedIntType();
        return this.duration;
    }

    public boolean hasDurationElement() {
        return this.duration != null && !this.duration.isEmpty();
    }

    public boolean hasDuration() {
        return this.duration != null && !this.duration.isEmpty();
    }

    /**
     * @param value {@link #duration} (The duration of the recording in seconds - for audio and video.). This is the underlying object with id, value and extensions. The accessor "getDuration" gives direct access to the value
     */
    public Media setDurationElement(UnsignedIntType value) {
        this.duration = value;
        return this;
    }

    /**
     * @return The duration of the recording in seconds - for audio and video.
     */
    public int getDuration() {
        return this.duration == null || this.duration.isEmpty() ? 0 : this.duration.getValue();
    }

    /**
     * @param value The duration of the recording in seconds - for audio and video.
     */
    public Media setDuration(int value) {
        if (this.duration == null)
            this.duration = new UnsignedIntType();
        this.duration.setValue(value);
        return this;
    }

    /**
     * @return {@link #content} (The actual content of the media - inline or by direct reference to the media source file.)
     */
    public Attachment getContent() {
        if (this.content == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Media.content");
            else if (Configuration.doAutoCreate())
                // cc
                this.content = new Attachment();
        return this.content;
    }

    public boolean hasContent() {
        return this.content != null && !this.content.isEmpty();
    }

    /**
     * @param value {@link #content} (The actual content of the media - inline or by direct reference to the media source file.)
     */
    public Media setContent(Attachment value) {
        this.content = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "Whether the media is a photo (still image), an audio recording, or a video recording.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("subtype", "CodeableConcept", "Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.", 0, java.lang.Integer.MAX_VALUE, subtype));
        childrenList.add(new Property("identifier", "Identifier", "Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("subject", "Reference(Patient|Practitioner|Group|Device|Specimen)", "Who/What this Media is a record of.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("operator", "Reference(Practitioner)", "The person who administered the collection of the image.", 0, java.lang.Integer.MAX_VALUE, operator));
        childrenList.add(new Property("view", "CodeableConcept", "The name of the imaging view e.g. Lateral or Antero-posterior (AP).", 0, java.lang.Integer.MAX_VALUE, view));
        childrenList.add(new Property("deviceName", "string", "The name of the device / manufacturer of the device  that was used to make the recording.", 0, java.lang.Integer.MAX_VALUE, deviceName));
        childrenList.add(new Property("height", "positiveInt", "Height of the image in pixels (photo/video).", 0, java.lang.Integer.MAX_VALUE, height));
        childrenList.add(new Property("width", "positiveInt", "Width of the image in pixels (photo/video).", 0, java.lang.Integer.MAX_VALUE, width));
        childrenList.add(new Property("frames", "positiveInt", "The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.", 0, java.lang.Integer.MAX_VALUE, frames));
        childrenList.add(new Property("duration", "unsignedInt", "The duration of the recording in seconds - for audio and video.", 0, java.lang.Integer.MAX_VALUE, duration));
        childrenList.add(new Property("content", "Attachment", "The actual content of the media - inline or by direct reference to the media source file.", 0, java.lang.Integer.MAX_VALUE, content));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Enumeration<DigitalMediaType>
            this.type = new DigitalMediaTypeEnumFactory().fromType(value);
        else if (name.equals("subtype"))
            // CodeableConcept
            this.subtype = castToCodeableConcept(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("operator"))
            // Reference
            this.operator = castToReference(value);
        else if (name.equals("view"))
            // CodeableConcept
            this.view = castToCodeableConcept(value);
        else if (name.equals("deviceName"))
            // StringType
            this.deviceName = castToString(value);
        else if (name.equals("height"))
            // PositiveIntType
            this.height = castToPositiveInt(value);
        else if (name.equals("width"))
            // PositiveIntType
            this.width = castToPositiveInt(value);
        else if (name.equals("frames"))
            // PositiveIntType
            this.frames = castToPositiveInt(value);
        else if (name.equals("duration"))
            // UnsignedIntType
            this.duration = castToUnsignedInt(value);
        else if (name.equals("content"))
            // Attachment
            this.content = castToAttachment(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Media.type");
        } else if (name.equals("subtype")) {
            this.subtype = new CodeableConcept();
            return this.subtype;
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("operator")) {
            this.operator = new Reference();
            return this.operator;
        } else if (name.equals("view")) {
            this.view = new CodeableConcept();
            return this.view;
        } else if (name.equals("deviceName")) {
            throw new FHIRException("Cannot call addChild on a primitive type Media.deviceName");
        } else if (name.equals("height")) {
            throw new FHIRException("Cannot call addChild on a primitive type Media.height");
        } else if (name.equals("width")) {
            throw new FHIRException("Cannot call addChild on a primitive type Media.width");
        } else if (name.equals("frames")) {
            throw new FHIRException("Cannot call addChild on a primitive type Media.frames");
        } else if (name.equals("duration")) {
            throw new FHIRException("Cannot call addChild on a primitive type Media.duration");
        } else if (name.equals("content")) {
            this.content = new Attachment();
            return this.content;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Media";
    }

    public Media copy() {
        Media dst = new Media();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.subtype = subtype == null ? null : subtype.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.subject = subject == null ? null : subject.copy();
        dst.operator = operator == null ? null : operator.copy();
        dst.view = view == null ? null : view.copy();
        dst.deviceName = deviceName == null ? null : deviceName.copy();
        dst.height = height == null ? null : height.copy();
        dst.width = width == null ? null : width.copy();
        dst.frames = frames == null ? null : frames.copy();
        dst.duration = duration == null ? null : duration.copy();
        dst.content = content == null ? null : content.copy();
        return dst;
    }

    protected Media typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Media))
            return false;
        Media o = (Media) other;
        return compareDeep(type, o.type, true) && compareDeep(subtype, o.subtype, true) && compareDeep(identifier, o.identifier, true) && compareDeep(subject, o.subject, true) && compareDeep(operator, o.operator, true) && compareDeep(view, o.view, true) && compareDeep(deviceName, o.deviceName, true) && compareDeep(height, o.height, true) && compareDeep(width, o.width, true) && compareDeep(frames, o.frames, true) && compareDeep(duration, o.duration, true) && compareDeep(content, o.content, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Media))
            return false;
        Media o = (Media) other;
        return compareValues(type, o.type, true) && compareValues(deviceName, o.deviceName, true) && compareValues(height, o.height, true) && compareValues(width, o.width, true) && compareValues(frames, o.frames, true) && compareValues(duration, o.duration, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (subtype == null || subtype.isEmpty()) && (identifier == null || identifier.isEmpty()) && (subject == null || subject.isEmpty()) && (operator == null || operator.isEmpty()) && (view == null || view.isEmpty()) && (deviceName == null || deviceName.isEmpty()) && (height == null || height.isEmpty()) && (width == null || width.isEmpty()) && (frames == null || frames.isEmpty()) && (duration == null || duration.isEmpty()) && (content == null || content.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Media;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_VIEW = "view";

    public static final String SP_SUBTYPE = "subtype";

    public static final String SP_CREATED = "created";

    public static final String SP_SUBJECT = "subject";

    public static final String SP_PATIENT = "patient";

    public static final String SP_TYPE = "type";

    public static final String SP_OPERATOR = "operator";
}
