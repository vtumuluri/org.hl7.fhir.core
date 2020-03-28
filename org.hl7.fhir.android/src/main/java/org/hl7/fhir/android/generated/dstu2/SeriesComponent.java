package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class SeriesComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Series instance UID of the SOP instances in the selection.
     */
    protected OidType uid;

    /**
     * WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection.
     */
    protected UriType url;

    /**
     * Identity and locating information of the selected DICOM SOP instances.
     */
    protected List<InstanceComponent> instance;

    private static final long serialVersionUID = 229247770L;

    /*
     * Constructor
     */
    public SeriesComponent() {
        super();
    }

    /**
     * @return {@link #uid} (Series instance UID of the SOP instances in the selection.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public OidType getUidElement() {
        if (this.uid == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SeriesComponent.uid");
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
     * @param value {@link #uid} (Series instance UID of the SOP instances in the selection.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public SeriesComponent setUidElement(OidType value) {
        this.uid = value;
        return this;
    }

    /**
     * @return Series instance UID of the SOP instances in the selection.
     */
    public String getUid() {
        return this.uid == null ? null : this.uid.getValue();
    }

    /**
     * @param value Series instance UID of the SOP instances in the selection.
     */
    public SeriesComponent setUid(String value) {
        if (Utilities.noString(value))
            this.uid = null;
        else {
            if (this.uid == null)
                this.uid = new OidType();
            this.uid.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #url} (WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SeriesComponent.url");
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
     * @param value {@link #url} (WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public SeriesComponent setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection.
     */
    public SeriesComponent setUrl(String value) {
        if (Utilities.noString(value))
            this.url = null;
        else {
            if (this.url == null)
                this.url = new UriType();
            this.url.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #instance} (Identity and locating information of the selected DICOM SOP instances.)
     */
    public List<InstanceComponent> getInstance() {
        if (this.instance == null)
            this.instance = new ArrayList<InstanceComponent>();
        return this.instance;
    }

    public boolean hasInstance() {
        if (this.instance == null)
            return false;
        for (InstanceComponent item : this.instance) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public InstanceComponent addInstance() {
        // 3
        InstanceComponent t = new InstanceComponent();
        if (this.instance == null)
            this.instance = new ArrayList<InstanceComponent>();
        this.instance.add(t);
        return t;
    }

    // syntactic sugar
    public SeriesComponent addInstance(InstanceComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.instance == null)
            this.instance = new ArrayList<InstanceComponent>();
        this.instance.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("uid", "oid", "Series instance UID of the SOP instances in the selection.", 0, java.lang.Integer.MAX_VALUE, uid));
        childrenList.add(new Property("url", "uri", "WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("instance", "", "Identity and locating information of the selected DICOM SOP instances.", 0, java.lang.Integer.MAX_VALUE, instance));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("uid"))
            // OidType
            this.uid = castToOid(value);
        else if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else if (name.equals("instance"))
            this.getInstance().add((InstanceComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("uid")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.uid");
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.url");
        } else if (name.equals("instance")) {
            return addInstance();
        } else
            return super.addChild(name);
    }

    public SeriesComponent copy() {
        SeriesComponent dst = new SeriesComponent();
        copyValues(dst);
        dst.uid = uid == null ? null : uid.copy();
        dst.url = url == null ? null : url.copy();
        if (instance != null) {
            dst.instance = new ArrayList<InstanceComponent>();
            for (InstanceComponent i : instance) dst.instance.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SeriesComponent))
            return false;
        SeriesComponent o = (SeriesComponent) other;
        return compareDeep(uid, o.uid, true) && compareDeep(url, o.url, true) && compareDeep(instance, o.instance, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SeriesComponent))
            return false;
        SeriesComponent o = (SeriesComponent) other;
        return compareValues(uid, o.uid, true) && compareValues(url, o.url, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (uid == null || uid.isEmpty()) && (url == null || url.isEmpty()) && (instance == null || instance.isEmpty());
    }

    public String fhirType() {
        return "ImagingObjectSelection.study.series";
    }
}
