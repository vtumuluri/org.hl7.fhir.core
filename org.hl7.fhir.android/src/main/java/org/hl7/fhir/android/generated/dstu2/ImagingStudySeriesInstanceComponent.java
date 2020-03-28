package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ImagingStudyEnum.InstanceAvailabilityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImagingStudyEnum.InstanceAvailability;

public class ImagingStudySeriesInstanceComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The number of instance in the series.
     */
    protected UnsignedIntType number;

    /**
     * Formal identifier for this image or other content.
     */
    protected OidType uid;

    /**
     * DICOM instance  type.
     */
    protected OidType sopClass;

    /**
     * A human-friendly SOP Class name.
     */
    protected StringType type;

    /**
     * The description of the instance.
     */
    protected StringType title;

    /**
     * Content of the instance or a rendering thereof (e.g. a JPEG of an image, or an XML of a structured report). May be represented for example by inline encoding; by a URL reference to a WADO-RS service that makes the instance available; or to a FHIR Resource (e.g. Media, Document, etc.). Multiple content attachments may be used for alternate representations of the instance.
     */
    protected List<Attachment> content;

    private static final long serialVersionUID = -1450403705L;

    /*
     * Constructor
     */
    public ImagingStudySeriesInstanceComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ImagingStudySeriesInstanceComponent(OidType uid, OidType sopClass) {
        super();
        this.uid = uid;
        this.sopClass = sopClass;
    }

    /**
     * @return {@link #number} (The number of instance in the series.). This is the underlying object with id, value and extensions. The accessor "getNumber" gives direct access to the value
     */
    public UnsignedIntType getNumberElement() {
        if (this.number == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesInstanceComponent.number");
            else if (Configuration.doAutoCreate())
                // bb
                this.number = new UnsignedIntType();
        return this.number;
    }

    public boolean hasNumberElement() {
        return this.number != null && !this.number.isEmpty();
    }

    public boolean hasNumber() {
        return this.number != null && !this.number.isEmpty();
    }

    /**
     * @param value {@link #number} (The number of instance in the series.). This is the underlying object with id, value and extensions. The accessor "getNumber" gives direct access to the value
     */
    public ImagingStudySeriesInstanceComponent setNumberElement(UnsignedIntType value) {
        this.number = value;
        return this;
    }

    /**
     * @return The number of instance in the series.
     */
    public int getNumber() {
        return this.number == null || this.number.isEmpty() ? 0 : this.number.getValue();
    }

    /**
     * @param value The number of instance in the series.
     */
    public ImagingStudySeriesInstanceComponent setNumber(int value) {
        if (this.number == null)
            this.number = new UnsignedIntType();
        this.number.setValue(value);
        return this;
    }

    /**
     * @return {@link #uid} (Formal identifier for this image or other content.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public OidType getUidElement() {
        if (this.uid == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesInstanceComponent.uid");
            else if (Configuration.doAutoCreate())
                // bb
                this.uid = new OidType();
        return this.uid;
    }

    public boolean hasUidElement() {
        return this.uid != null && !this.uid.isEmpty();
    }

    public boolean hasUid() {
        return this.uid != null && !this.uid.isEmpty();
    }

    /**
     * @param value {@link #uid} (Formal identifier for this image or other content.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public ImagingStudySeriesInstanceComponent setUidElement(OidType value) {
        this.uid = value;
        return this;
    }

    /**
     * @return Formal identifier for this image or other content.
     */
    public String getUid() {
        return this.uid == null ? null : this.uid.getValue();
    }

    /**
     * @param value Formal identifier for this image or other content.
     */
    public ImagingStudySeriesInstanceComponent setUid(String value) {
        if (this.uid == null)
            this.uid = new OidType();
        this.uid.setValue(value);
        return this;
    }

    /**
     * @return {@link #sopClass} (DICOM instance  type.). This is the underlying object with id, value and extensions. The accessor "getSopClass" gives direct access to the value
     */
    public OidType getSopClassElement() {
        if (this.sopClass == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesInstanceComponent.sopClass");
            else if (Configuration.doAutoCreate())
                // bb
                this.sopClass = new OidType();
        return this.sopClass;
    }

    public boolean hasSopClassElement() {
        return this.sopClass != null && !this.sopClass.isEmpty();
    }

    public boolean hasSopClass() {
        return this.sopClass != null && !this.sopClass.isEmpty();
    }

    /**
     * @param value {@link #sopClass} (DICOM instance  type.). This is the underlying object with id, value and extensions. The accessor "getSopClass" gives direct access to the value
     */
    public ImagingStudySeriesInstanceComponent setSopClassElement(OidType value) {
        this.sopClass = value;
        return this;
    }

    /**
     * @return DICOM instance  type.
     */
    public String getSopClass() {
        return this.sopClass == null ? null : this.sopClass.getValue();
    }

    /**
     * @param value DICOM instance  type.
     */
    public ImagingStudySeriesInstanceComponent setSopClass(String value) {
        if (this.sopClass == null)
            this.sopClass = new OidType();
        this.sopClass.setValue(value);
        return this;
    }

    /**
     * @return {@link #type} (A human-friendly SOP Class name.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public StringType getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesInstanceComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new StringType();
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (A human-friendly SOP Class name.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public ImagingStudySeriesInstanceComponent setTypeElement(StringType value) {
        this.type = value;
        return this;
    }

    /**
     * @return A human-friendly SOP Class name.
     */
    public String getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value A human-friendly SOP Class name.
     */
    public ImagingStudySeriesInstanceComponent setType(String value) {
        if (Utilities.noString(value))
            this.type = null;
        else {
            if (this.type == null)
                this.type = new StringType();
            this.type.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #title} (The description of the instance.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() {
        if (this.title == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesInstanceComponent.title");
            else if (Configuration.doAutoCreate())
                // bb
                this.title = new StringType();
        return this.title;
    }

    public boolean hasTitleElement() {
        return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() {
        return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (The description of the instance.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public ImagingStudySeriesInstanceComponent setTitleElement(StringType value) {
        this.title = value;
        return this;
    }

    /**
     * @return The description of the instance.
     */
    public String getTitle() {
        return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value The description of the instance.
     */
    public ImagingStudySeriesInstanceComponent setTitle(String value) {
        if (Utilities.noString(value))
            this.title = null;
        else {
            if (this.title == null)
                this.title = new StringType();
            this.title.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #content} (Content of the instance or a rendering thereof (e.g. a JPEG of an image, or an XML of a structured report). May be represented for example by inline encoding; by a URL reference to a WADO-RS service that makes the instance available; or to a FHIR Resource (e.g. Media, Document, etc.). Multiple content attachments may be used for alternate representations of the instance.)
     */
    public List<Attachment> getContent() {
        if (this.content == null)
            this.content = new ArrayList<Attachment>();
        return this.content;
    }

    public boolean hasContent() {
        if (this.content == null)
            return false;
        for (Attachment item : this.content) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Attachment addContent() {
        // 3
        Attachment t = new Attachment();
        if (this.content == null)
            this.content = new ArrayList<Attachment>();
        this.content.add(t);
        return t;
    }

    // syntactic sugar
    public ImagingStudySeriesInstanceComponent addContent(Attachment t) {
        // 3
        if (t == null)
            return this;
        if (this.content == null)
            this.content = new ArrayList<Attachment>();
        this.content.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("number", "unsignedInt", "The number of instance in the series.", 0, java.lang.Integer.MAX_VALUE, number));
        childrenList.add(new Property("uid", "oid", "Formal identifier for this image or other content.", 0, java.lang.Integer.MAX_VALUE, uid));
        childrenList.add(new Property("sopClass", "oid", "DICOM instance  type.", 0, java.lang.Integer.MAX_VALUE, sopClass));
        childrenList.add(new Property("type", "string", "A human-friendly SOP Class name.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("title", "string", "The description of the instance.", 0, java.lang.Integer.MAX_VALUE, title));
        childrenList.add(new Property("content", "Attachment", "Content of the instance or a rendering thereof (e.g. a JPEG of an image, or an XML of a structured report). May be represented for example by inline encoding; by a URL reference to a WADO-RS service that makes the instance available; or to a FHIR Resource (e.g. Media, Document, etc.). Multiple content attachments may be used for alternate representations of the instance.", 0, java.lang.Integer.MAX_VALUE, content));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("number"))
            // UnsignedIntType
            this.number = castToUnsignedInt(value);
        else if (name.equals("uid"))
            // OidType
            this.uid = castToOid(value);
        else if (name.equals("sopClass"))
            // OidType
            this.sopClass = castToOid(value);
        else if (name.equals("type"))
            // StringType
            this.type = castToString(value);
        else if (name.equals("title"))
            // StringType
            this.title = castToString(value);
        else if (name.equals("content"))
            this.getContent().add(castToAttachment(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("number")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.number");
        } else if (name.equals("uid")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.uid");
        } else if (name.equals("sopClass")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.sopClass");
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.type");
        } else if (name.equals("title")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.title");
        } else if (name.equals("content")) {
            return addContent();
        } else
            return super.addChild(name);
    }

    public ImagingStudySeriesInstanceComponent copy() {
        ImagingStudySeriesInstanceComponent dst = new ImagingStudySeriesInstanceComponent();
        copyValues(dst);
        dst.number = number == null ? null : number.copy();
        dst.uid = uid == null ? null : uid.copy();
        dst.sopClass = sopClass == null ? null : sopClass.copy();
        dst.type = type == null ? null : type.copy();
        dst.title = title == null ? null : title.copy();
        if (content != null) {
            dst.content = new ArrayList<Attachment>();
            for (Attachment i : content) dst.content.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImagingStudySeriesInstanceComponent))
            return false;
        ImagingStudySeriesInstanceComponent o = (ImagingStudySeriesInstanceComponent) other;
        return compareDeep(number, o.number, true) && compareDeep(uid, o.uid, true) && compareDeep(sopClass, o.sopClass, true) && compareDeep(type, o.type, true) && compareDeep(title, o.title, true) && compareDeep(content, o.content, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImagingStudySeriesInstanceComponent))
            return false;
        ImagingStudySeriesInstanceComponent o = (ImagingStudySeriesInstanceComponent) other;
        return compareValues(number, o.number, true) && compareValues(uid, o.uid, true) && compareValues(sopClass, o.sopClass, true) && compareValues(type, o.type, true) && compareValues(title, o.title, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (number == null || number.isEmpty()) && (uid == null || uid.isEmpty()) && (sopClass == null || sopClass.isEmpty()) && (type == null || type.isEmpty()) && (title == null || title.isEmpty()) && (content == null || content.isEmpty());
    }

    public String fhirType() {
        return "ImagingStudy.series.instance";
    }
}
