package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class StudyComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Study instance UID of the SOP instances in the selection.
     */
    protected OidType uid;

    /**
     * WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.
     */
    protected UriType url;

    /**
     * Reference to the Imaging Study in FHIR form.
     */
    protected Reference imagingStudy;

    /**
     * The actual object that is the target of the reference (Reference to the Imaging Study in FHIR form.)
     */
    protected ImagingStudy imagingStudyTarget;

    /**
     * Series identity and locating information of the DICOM SOP instances in the selection.
     */
    protected List<SeriesComponent> series;

    private static final long serialVersionUID = 341246743L;

    /*
     * Constructor
     */
    public StudyComponent() {
        super();
    }

    /*
     * Constructor
     */
    public StudyComponent(OidType uid) {
        super();
        this.uid = uid;
    }

    /**
     * @return {@link #uid} (Study instance UID of the SOP instances in the selection.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public OidType getUidElement() {
        if (this.uid == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create StudyComponent.uid");
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
     * @param value {@link #uid} (Study instance UID of the SOP instances in the selection.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public StudyComponent setUidElement(OidType value) {
        this.uid = value;
        return this;
    }

    /**
     * @return Study instance UID of the SOP instances in the selection.
     */
    public String getUid() {
        return this.uid == null ? null : this.uid.getValue();
    }

    /**
     * @param value Study instance UID of the SOP instances in the selection.
     */
    public StudyComponent setUid(String value) {
        if (this.uid == null)
            this.uid = new OidType();
        this.uid.setValue(value);
        return this;
    }

    /**
     * @return {@link #url} (WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create StudyComponent.url");
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
     * @param value {@link #url} (WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public StudyComponent setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.
     */
    public StudyComponent setUrl(String value) {
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
     * @return {@link #imagingStudy} (Reference to the Imaging Study in FHIR form.)
     */
    public Reference getImagingStudy() {
        if (this.imagingStudy == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create StudyComponent.imagingStudy");
            else if (Configuration.doAutoCreate())
                // cc
                this.imagingStudy = new Reference();
        return this.imagingStudy;
    }

    public boolean hasImagingStudy() {
        return this.imagingStudy != null && !this.imagingStudy.isEmpty();
    }

    /**
     * @param value {@link #imagingStudy} (Reference to the Imaging Study in FHIR form.)
     */
    public StudyComponent setImagingStudy(Reference value) {
        this.imagingStudy = value;
        return this;
    }

    /**
     * @return {@link #imagingStudy} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Reference to the Imaging Study in FHIR form.)
     */
    public ImagingStudy getImagingStudyTarget() {
        if (this.imagingStudyTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create StudyComponent.imagingStudy");
            else if (Configuration.doAutoCreate())
                // aa
                this.imagingStudyTarget = new ImagingStudy();
        return this.imagingStudyTarget;
    }

    /**
     * @param value {@link #imagingStudy} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Reference to the Imaging Study in FHIR form.)
     */
    public StudyComponent setImagingStudyTarget(ImagingStudy value) {
        this.imagingStudyTarget = value;
        return this;
    }

    /**
     * @return {@link #series} (Series identity and locating information of the DICOM SOP instances in the selection.)
     */
    public List<SeriesComponent> getSeries() {
        if (this.series == null)
            this.series = new ArrayList<SeriesComponent>();
        return this.series;
    }

    public boolean hasSeries() {
        if (this.series == null)
            return false;
        for (SeriesComponent item : this.series) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public SeriesComponent addSeries() {
        // 3
        SeriesComponent t = new SeriesComponent();
        if (this.series == null)
            this.series = new ArrayList<SeriesComponent>();
        this.series.add(t);
        return t;
    }

    // syntactic sugar
    public StudyComponent addSeries(SeriesComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.series == null)
            this.series = new ArrayList<SeriesComponent>();
        this.series.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("uid", "oid", "Study instance UID of the SOP instances in the selection.", 0, java.lang.Integer.MAX_VALUE, uid));
        childrenList.add(new Property("url", "uri", "WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("imagingStudy", "Reference(ImagingStudy)", "Reference to the Imaging Study in FHIR form.", 0, java.lang.Integer.MAX_VALUE, imagingStudy));
        childrenList.add(new Property("series", "", "Series identity and locating information of the DICOM SOP instances in the selection.", 0, java.lang.Integer.MAX_VALUE, series));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("uid"))
            // OidType
            this.uid = castToOid(value);
        else if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else if (name.equals("imagingStudy"))
            // Reference
            this.imagingStudy = castToReference(value);
        else if (name.equals("series"))
            this.getSeries().add((SeriesComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("uid")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.uid");
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.url");
        } else if (name.equals("imagingStudy")) {
            this.imagingStudy = new Reference();
            return this.imagingStudy;
        } else if (name.equals("series")) {
            return addSeries();
        } else
            return super.addChild(name);
    }

    public StudyComponent copy() {
        StudyComponent dst = new StudyComponent();
        copyValues(dst);
        dst.uid = uid == null ? null : uid.copy();
        dst.url = url == null ? null : url.copy();
        dst.imagingStudy = imagingStudy == null ? null : imagingStudy.copy();
        if (series != null) {
            dst.series = new ArrayList<SeriesComponent>();
            for (SeriesComponent i : series) dst.series.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof StudyComponent))
            return false;
        StudyComponent o = (StudyComponent) other;
        return compareDeep(uid, o.uid, true) && compareDeep(url, o.url, true) && compareDeep(imagingStudy, o.imagingStudy, true) && compareDeep(series, o.series, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof StudyComponent))
            return false;
        StudyComponent o = (StudyComponent) other;
        return compareValues(uid, o.uid, true) && compareValues(url, o.url, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (uid == null || uid.isEmpty()) && (url == null || url.isEmpty()) && (imagingStudy == null || imagingStudy.isEmpty()) && (series == null || series.isEmpty());
    }

    public String fhirType() {
        return "ImagingObjectSelection.study";
    }
}
