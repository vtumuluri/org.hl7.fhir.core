package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ImagingStudyEnum.InstanceAvailability;
import org.hl7.fhir.android.generated.dstu2.ImagingStudyEnum.InstanceAvailabilityEnumFactory;

public class ImagingStudySeriesComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The Numeric identifier of this series in the study.
     */
    protected UnsignedIntType number;

    /**
     * The modality of this series sequence.
     */
    protected Coding modality;

    /**
     * Formal identifier for this series.
     */
    protected OidType uid;

    /**
     * A description of the series.
     */
    protected StringType description;

    /**
     * Number of SOP Instances in Series.
     */
    protected UnsignedIntType numberOfInstances;

    /**
     * Availability of series (online, offline or nearline).
     */
    protected Enumeration<InstanceAvailability> availability;

    /**
     * URI/URL specifying the location of the referenced series using WADO-RS.
     */
    protected UriType url;

    /**
     * Body part examined. See  DICOM Part 16 Annex L for the mapping from DICOM to Snomed CT.
     */
    protected Coding bodySite;

    /**
     * Laterality if body site is paired anatomic structure and laterality is not pre-coordinated in body site code.
     */
    protected Coding laterality;

    /**
     * The date and time the series was started.
     */
    protected DateTimeType started;

    /**
     * A single SOP Instance within the series, e.g. an image, or presentation state.
     */
    protected List<ImagingStudySeriesInstanceComponent> instance;

    private static final long serialVersionUID = -1798366943L;

    /*
     * Constructor
     */
    public ImagingStudySeriesComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ImagingStudySeriesComponent(Coding modality, OidType uid, UnsignedIntType numberOfInstances) {
        super();
        this.modality = modality;
        this.uid = uid;
        this.numberOfInstances = numberOfInstances;
    }

    /**
     * @return {@link #number} (The Numeric identifier of this series in the study.). This is the underlying object with id, value and extensions. The accessor "getNumber" gives direct access to the value
     */
    public UnsignedIntType getNumberElement() {
        if (this.number == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesComponent.number");
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
     * @param value {@link #number} (The Numeric identifier of this series in the study.). This is the underlying object with id, value and extensions. The accessor "getNumber" gives direct access to the value
     */
    public ImagingStudySeriesComponent setNumberElement(UnsignedIntType value) {
        this.number = value;
        return this;
    }

    /**
     * @return The Numeric identifier of this series in the study.
     */
    public int getNumber() {
        return this.number == null || this.number.isEmpty() ? 0 : this.number.getValue();
    }

    /**
     * @param value The Numeric identifier of this series in the study.
     */
    public ImagingStudySeriesComponent setNumber(int value) {
        if (this.number == null)
            this.number = new UnsignedIntType();
        this.number.setValue(value);
        return this;
    }

    /**
     * @return {@link #modality} (The modality of this series sequence.)
     */
    public Coding getModality() {
        if (this.modality == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesComponent.modality");
            else if (Configuration.doAutoCreate())
                // cc
                this.modality = new Coding();
        return this.modality;
    }

    public boolean hasModality() {
        return this.modality != null && !this.modality.isEmpty();
    }

    /**
     * @param value {@link #modality} (The modality of this series sequence.)
     */
    public ImagingStudySeriesComponent setModality(Coding value) {
        this.modality = value;
        return this;
    }

    /**
     * @return {@link #uid} (Formal identifier for this series.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public OidType getUidElement() {
        if (this.uid == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesComponent.uid");
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
     * @param value {@link #uid} (Formal identifier for this series.). This is the underlying object with id, value and extensions. The accessor "getUid" gives direct access to the value
     */
    public ImagingStudySeriesComponent setUidElement(OidType value) {
        this.uid = value;
        return this;
    }

    /**
     * @return Formal identifier for this series.
     */
    public String getUid() {
        return this.uid == null ? null : this.uid.getValue();
    }

    /**
     * @param value Formal identifier for this series.
     */
    public ImagingStudySeriesComponent setUid(String value) {
        if (this.uid == null)
            this.uid = new OidType();
        this.uid.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (A description of the series.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesComponent.description");
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
     * @param value {@link #description} (A description of the series.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ImagingStudySeriesComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A description of the series.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A description of the series.
     */
    public ImagingStudySeriesComponent setDescription(String value) {
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
     * @return {@link #numberOfInstances} (Number of SOP Instances in Series.). This is the underlying object with id, value and extensions. The accessor "getNumberOfInstances" gives direct access to the value
     */
    public UnsignedIntType getNumberOfInstancesElement() {
        if (this.numberOfInstances == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesComponent.numberOfInstances");
            else if (Configuration.doAutoCreate())
                // bb
                this.numberOfInstances = new UnsignedIntType();
        return this.numberOfInstances;
    }

    public boolean hasNumberOfInstancesElement() {
        return this.numberOfInstances != null && !this.numberOfInstances.isEmpty();
    }

    public boolean hasNumberOfInstances() {
        return this.numberOfInstances != null && !this.numberOfInstances.isEmpty();
    }

    /**
     * @param value {@link #numberOfInstances} (Number of SOP Instances in Series.). This is the underlying object with id, value and extensions. The accessor "getNumberOfInstances" gives direct access to the value
     */
    public ImagingStudySeriesComponent setNumberOfInstancesElement(UnsignedIntType value) {
        this.numberOfInstances = value;
        return this;
    }

    /**
     * @return Number of SOP Instances in Series.
     */
    public int getNumberOfInstances() {
        return this.numberOfInstances == null || this.numberOfInstances.isEmpty() ? 0 : this.numberOfInstances.getValue();
    }

    /**
     * @param value Number of SOP Instances in Series.
     */
    public ImagingStudySeriesComponent setNumberOfInstances(int value) {
        if (this.numberOfInstances == null)
            this.numberOfInstances = new UnsignedIntType();
        this.numberOfInstances.setValue(value);
        return this;
    }

    /**
     * @return {@link #availability} (Availability of series (online, offline or nearline).). This is the underlying object with id, value and extensions. The accessor "getAvailability" gives direct access to the value
     */
    public Enumeration<InstanceAvailability> getAvailabilityElement() {
        if (this.availability == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesComponent.availability");
            else if (Configuration.doAutoCreate())
                // bb
                this.availability = new Enumeration<InstanceAvailability>(new InstanceAvailabilityEnumFactory());
        return this.availability;
    }

    public boolean hasAvailabilityElement() {
        return this.availability != null && !this.availability.isEmpty();
    }

    public boolean hasAvailability() {
        return this.availability != null && !this.availability.isEmpty();
    }

    /**
     * @param value {@link #availability} (Availability of series (online, offline or nearline).). This is the underlying object with id, value and extensions. The accessor "getAvailability" gives direct access to the value
     */
    public ImagingStudySeriesComponent setAvailabilityElement(Enumeration<InstanceAvailability> value) {
        this.availability = value;
        return this;
    }

    /**
     * @return Availability of series (online, offline or nearline).
     */
    public InstanceAvailability getAvailability() {
        return this.availability == null ? null : this.availability.getValue();
    }

    /**
     * @param value Availability of series (online, offline or nearline).
     */
    public ImagingStudySeriesComponent setAvailability(InstanceAvailability value) {
        if (value == null)
            this.availability = null;
        else {
            if (this.availability == null)
                this.availability = new Enumeration<InstanceAvailability>(new InstanceAvailabilityEnumFactory());
            this.availability.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #url} (URI/URL specifying the location of the referenced series using WADO-RS.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesComponent.url");
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
     * @param value {@link #url} (URI/URL specifying the location of the referenced series using WADO-RS.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public ImagingStudySeriesComponent setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return URI/URL specifying the location of the referenced series using WADO-RS.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value URI/URL specifying the location of the referenced series using WADO-RS.
     */
    public ImagingStudySeriesComponent setUrl(String value) {
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
     * @return {@link #bodySite} (Body part examined. See  DICOM Part 16 Annex L for the mapping from DICOM to Snomed CT.)
     */
    public Coding getBodySite() {
        if (this.bodySite == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesComponent.bodySite");
            else if (Configuration.doAutoCreate())
                // cc
                this.bodySite = new Coding();
        return this.bodySite;
    }

    public boolean hasBodySite() {
        return this.bodySite != null && !this.bodySite.isEmpty();
    }

    /**
     * @param value {@link #bodySite} (Body part examined. See  DICOM Part 16 Annex L for the mapping from DICOM to Snomed CT.)
     */
    public ImagingStudySeriesComponent setBodySite(Coding value) {
        this.bodySite = value;
        return this;
    }

    /**
     * @return {@link #laterality} (Laterality if body site is paired anatomic structure and laterality is not pre-coordinated in body site code.)
     */
    public Coding getLaterality() {
        if (this.laterality == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesComponent.laterality");
            else if (Configuration.doAutoCreate())
                // cc
                this.laterality = new Coding();
        return this.laterality;
    }

    public boolean hasLaterality() {
        return this.laterality != null && !this.laterality.isEmpty();
    }

    /**
     * @param value {@link #laterality} (Laterality if body site is paired anatomic structure and laterality is not pre-coordinated in body site code.)
     */
    public ImagingStudySeriesComponent setLaterality(Coding value) {
        this.laterality = value;
        return this;
    }

    /**
     * @return {@link #started} (The date and time the series was started.). This is the underlying object with id, value and extensions. The accessor "getStarted" gives direct access to the value
     */
    public DateTimeType getStartedElement() {
        if (this.started == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImagingStudySeriesComponent.started");
            else if (Configuration.doAutoCreate())
                // bb
                this.started = new DateTimeType();
        return this.started;
    }

    public boolean hasStartedElement() {
        return this.started != null && !this.started.isEmpty();
    }

    public boolean hasStarted() {
        return this.started != null && !this.started.isEmpty();
    }

    /**
     * @param value {@link #started} (The date and time the series was started.). This is the underlying object with id, value and extensions. The accessor "getStarted" gives direct access to the value
     */
    public ImagingStudySeriesComponent setStartedElement(DateTimeType value) {
        this.started = value;
        return this;
    }

    /**
     * @return The date and time the series was started.
     */
    public Date getStarted() {
        return this.started == null ? null : this.started.getValue();
    }

    /**
     * @param value The date and time the series was started.
     */
    public ImagingStudySeriesComponent setStarted(Date value) {
        if (value == null)
            this.started = null;
        else {
            if (this.started == null)
                this.started = new DateTimeType();
            this.started.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #instance} (A single SOP Instance within the series, e.g. an image, or presentation state.)
     */
    public List<ImagingStudySeriesInstanceComponent> getInstance() {
        if (this.instance == null)
            this.instance = new ArrayList<ImagingStudySeriesInstanceComponent>();
        return this.instance;
    }

    public boolean hasInstance() {
        if (this.instance == null)
            return false;
        for (ImagingStudySeriesInstanceComponent item : this.instance) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ImagingStudySeriesInstanceComponent addInstance() {
        // 3
        ImagingStudySeriesInstanceComponent t = new ImagingStudySeriesInstanceComponent();
        if (this.instance == null)
            this.instance = new ArrayList<ImagingStudySeriesInstanceComponent>();
        this.instance.add(t);
        return t;
    }

    // syntactic sugar
    public ImagingStudySeriesComponent addInstance(ImagingStudySeriesInstanceComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.instance == null)
            this.instance = new ArrayList<ImagingStudySeriesInstanceComponent>();
        this.instance.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("number", "unsignedInt", "The Numeric identifier of this series in the study.", 0, java.lang.Integer.MAX_VALUE, number));
        childrenList.add(new Property("modality", "Coding", "The modality of this series sequence.", 0, java.lang.Integer.MAX_VALUE, modality));
        childrenList.add(new Property("uid", "oid", "Formal identifier for this series.", 0, java.lang.Integer.MAX_VALUE, uid));
        childrenList.add(new Property("description", "string", "A description of the series.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("numberOfInstances", "unsignedInt", "Number of SOP Instances in Series.", 0, java.lang.Integer.MAX_VALUE, numberOfInstances));
        childrenList.add(new Property("availability", "code", "Availability of series (online, offline or nearline).", 0, java.lang.Integer.MAX_VALUE, availability));
        childrenList.add(new Property("url", "uri", "URI/URL specifying the location of the referenced series using WADO-RS.", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("bodySite", "Coding", "Body part examined. See  DICOM Part 16 Annex L for the mapping from DICOM to Snomed CT.", 0, java.lang.Integer.MAX_VALUE, bodySite));
        childrenList.add(new Property("laterality", "Coding", "Laterality if body site is paired anatomic structure and laterality is not pre-coordinated in body site code.", 0, java.lang.Integer.MAX_VALUE, laterality));
        childrenList.add(new Property("started", "dateTime", "The date and time the series was started.", 0, java.lang.Integer.MAX_VALUE, started));
        childrenList.add(new Property("instance", "", "A single SOP Instance within the series, e.g. an image, or presentation state.", 0, java.lang.Integer.MAX_VALUE, instance));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("number"))
            // UnsignedIntType
            this.number = castToUnsignedInt(value);
        else if (name.equals("modality"))
            // Coding
            this.modality = castToCoding(value);
        else if (name.equals("uid"))
            // OidType
            this.uid = castToOid(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("numberOfInstances"))
            // UnsignedIntType
            this.numberOfInstances = castToUnsignedInt(value);
        else if (name.equals("availability"))
            // Enumeration<InstanceAvailability>
            this.availability = new InstanceAvailabilityEnumFactory().fromType(value);
        else if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else if (name.equals("bodySite"))
            // Coding
            this.bodySite = castToCoding(value);
        else if (name.equals("laterality"))
            // Coding
            this.laterality = castToCoding(value);
        else if (name.equals("started"))
            // DateTimeType
            this.started = castToDateTime(value);
        else if (name.equals("instance"))
            this.getInstance().add((ImagingStudySeriesInstanceComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("number")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.number");
        } else if (name.equals("modality")) {
            this.modality = new Coding();
            return this.modality;
        } else if (name.equals("uid")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.uid");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.description");
        } else if (name.equals("numberOfInstances")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.numberOfInstances");
        } else if (name.equals("availability")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.availability");
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.url");
        } else if (name.equals("bodySite")) {
            this.bodySite = new Coding();
            return this.bodySite;
        } else if (name.equals("laterality")) {
            this.laterality = new Coding();
            return this.laterality;
        } else if (name.equals("started")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingStudy.started");
        } else if (name.equals("instance")) {
            return addInstance();
        } else
            return super.addChild(name);
    }

    public ImagingStudySeriesComponent copy() {
        ImagingStudySeriesComponent dst = new ImagingStudySeriesComponent();
        copyValues(dst);
        dst.number = number == null ? null : number.copy();
        dst.modality = modality == null ? null : modality.copy();
        dst.uid = uid == null ? null : uid.copy();
        dst.description = description == null ? null : description.copy();
        dst.numberOfInstances = numberOfInstances == null ? null : numberOfInstances.copy();
        dst.availability = availability == null ? null : availability.copy();
        dst.url = url == null ? null : url.copy();
        dst.bodySite = bodySite == null ? null : bodySite.copy();
        dst.laterality = laterality == null ? null : laterality.copy();
        dst.started = started == null ? null : started.copy();
        if (instance != null) {
            dst.instance = new ArrayList<ImagingStudySeriesInstanceComponent>();
            for (ImagingStudySeriesInstanceComponent i : instance) dst.instance.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImagingStudySeriesComponent))
            return false;
        ImagingStudySeriesComponent o = (ImagingStudySeriesComponent) other;
        return compareDeep(number, o.number, true) && compareDeep(modality, o.modality, true) && compareDeep(uid, o.uid, true) && compareDeep(description, o.description, true) && compareDeep(numberOfInstances, o.numberOfInstances, true) && compareDeep(availability, o.availability, true) && compareDeep(url, o.url, true) && compareDeep(bodySite, o.bodySite, true) && compareDeep(laterality, o.laterality, true) && compareDeep(started, o.started, true) && compareDeep(instance, o.instance, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImagingStudySeriesComponent))
            return false;
        ImagingStudySeriesComponent o = (ImagingStudySeriesComponent) other;
        return compareValues(number, o.number, true) && compareValues(uid, o.uid, true) && compareValues(description, o.description, true) && compareValues(numberOfInstances, o.numberOfInstances, true) && compareValues(availability, o.availability, true) && compareValues(url, o.url, true) && compareValues(started, o.started, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (number == null || number.isEmpty()) && (modality == null || modality.isEmpty()) && (uid == null || uid.isEmpty()) && (description == null || description.isEmpty()) && (numberOfInstances == null || numberOfInstances.isEmpty()) && (availability == null || availability.isEmpty()) && (url == null || url.isEmpty()) && (bodySite == null || bodySite.isEmpty()) && (laterality == null || laterality.isEmpty()) && (started == null || started.isEmpty()) && (instance == null || instance.isEmpty());
    }

    public String fhirType() {
        return "ImagingStudy.series";
    }
}
