package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class InstanceComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * SOP class UID of the selected instance.
     */
    protected OidType sopClass;

    /**
     * SOP Instance UID of the selected instance.
     */
    protected OidType uid;

    /**
     * WADO-RS URL to retrieve the DICOM SOP Instance.
     */
    protected UriType url;

    /**
     * Identity and location information of the frames in the selected instance.
     */
    protected List<FramesComponent> frames;

    private static final long serialVersionUID = 1641180916L;

    /*
     * Constructor
     */
    public InstanceComponent() {
        super();
    }

    /*
     * Constructor
     */
    public InstanceComponent(OidType sopClass, OidType uid, UriType url) {
        super();
        this.sopClass = sopClass;
        this.uid = uid;
        this.url = url;
    }

    /**
     * @return {@link #sopClass} (SOP class UID of the selected instance.). This is the underlying object with id, value and extensions. The accessor "getSopClass" gives direct access to the value
     */
    public OidType getSopClassElement() {
        if (this.sopClass == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create InstanceComponent.sopClass");
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
     * @param value {@link #sopClass} (SOP class UID of the selected instance.). This is the underlying object with id, value and extensions. The accessor "getSopClass" gives direct access to the value
     */
    public InstanceComponent setSopClassElement(OidType value) {
        this.sopClass = value;
        return this;
    }

    /**
     * @return SOP class UID of the selected instance.
     */
    public String getSopClass() {
        return this.sopClass == null ? null : this.sopClass.getValue();
    }

    /**
     * @param value SOP class UID of the selected instance.
     */
    public InstanceComponent setSopClass(String value) {
        if (this.sopClass == null)
            this.sopClass = new OidType();
        this.sopClass.setValue(value);
        return this;
    }

    /**
     * @return {@link #uid} (SOP Instance UID of the selected instance.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public OidType getUidElement() {
        if (this.uid == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create InstanceComponent.uid");
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
     * @param value {@link #uid} (SOP Instance UID of the selected instance.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public InstanceComponent setUidElement(OidType value) {
        this.uid = value;
        return this;
    }

    /**
     * @return SOP Instance UID of the selected instance.
     */
    public String getUid() {
        return this.uid == null ? null : this.uid.getValue();
    }

    /**
     * @param value SOP Instance UID of the selected instance.
     */
    public InstanceComponent setUid(String value) {
        if (this.uid == null)
            this.uid = new OidType();
        this.uid.setValue(value);
        return this;
    }

    /**
     * @return {@link #url} (WADO-RS URL to retrieve the DICOM SOP Instance.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create InstanceComponent.url");
            else if (Configuration.doAutoCreate())
                // bb
                this.url = new UriType();
        return this.url;
    }

    public boolean hasUrlElement() {
        return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() {
        return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (WADO-RS URL to retrieve the DICOM SOP Instance.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public InstanceComponent setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return WADO-RS URL to retrieve the DICOM SOP Instance.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value WADO-RS URL to retrieve the DICOM SOP Instance.
     */
    public InstanceComponent setUrl(String value) {
        if (this.url == null)
            this.url = new UriType();
        this.url.setValue(value);
        return this;
    }

    /**
     * @return {@link #frames} (Identity and location information of the frames in the selected instance.)
     */
    public List<FramesComponent> getFrames() {
        if (this.frames == null)
            this.frames = new ArrayList<FramesComponent>();
        return this.frames;
    }

    public boolean hasFrames() {
        if (this.frames == null)
            return false;
        for (FramesComponent item : this.frames) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public FramesComponent addFrames() {
        // 3
        FramesComponent t = new FramesComponent();
        if (this.frames == null)
            this.frames = new ArrayList<FramesComponent>();
        this.frames.add(t);
        return t;
    }

    // syntactic sugar
    public InstanceComponent addFrames(FramesComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.frames == null)
            this.frames = new ArrayList<FramesComponent>();
        this.frames.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("sopClass", "oid", "SOP class UID of the selected instance.", 0, java.lang.Integer.MAX_VALUE, sopClass));
        childrenList.add(new Property("uid", "oid", "SOP Instance UID of the selected instance.", 0, java.lang.Integer.MAX_VALUE, uid));
        childrenList.add(new Property("url", "uri", "WADO-RS URL to retrieve the DICOM SOP Instance.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("frames", "", "Identity and location information of the frames in the selected instance.", 0, java.lang.Integer.MAX_VALUE, frames));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sopClass"))
            // OidType
            this.sopClass = castToOid(value);
        else if (name.equals("uid"))
            // OidType
            this.uid = castToOid(value);
        else if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else if (name.equals("frames"))
            this.getFrames().add((FramesComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("sopClass")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.sopClass");
        } else if (name.equals("uid")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.uid");
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.url");
        } else if (name.equals("frames")) {
            return addFrames();
        } else
            return super.addChild(name);
    }

    public InstanceComponent copy() {
        InstanceComponent dst = new InstanceComponent();
        copyValues(dst);
        dst.sopClass = sopClass == null ? null : sopClass.copy();
        dst.uid = uid == null ? null : uid.copy();
        dst.url = url == null ? null : url.copy();
        if (frames != null) {
            dst.frames = new ArrayList<FramesComponent>();
            for (FramesComponent i : frames) dst.frames.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof InstanceComponent))
            return false;
        InstanceComponent o = (InstanceComponent) other;
        return compareDeep(sopClass, o.sopClass, true) && compareDeep(uid, o.uid, true) && compareDeep(url, o.url, true) && compareDeep(frames, o.frames, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof InstanceComponent))
            return false;
        InstanceComponent o = (InstanceComponent) other;
        return compareValues(sopClass, o.sopClass, true) && compareValues(uid, o.uid, true) && compareValues(url, o.url, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (sopClass == null || sopClass.isEmpty()) && (uid == null || uid.isEmpty()) && (url == null || url.isEmpty()) && (frames == null || frames.isEmpty());
    }

    public String fhirType() {
        return "ImagingObjectSelection.study.series.instance";
    }
}
