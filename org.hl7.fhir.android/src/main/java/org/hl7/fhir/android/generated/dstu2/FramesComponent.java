package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class FramesComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The frame numbers in the frame set.
     */
    protected List<UnsignedIntType> frameNumbers;

    /**
     * WADO-RS URL to retrieve the DICOM frames.
     */
    protected UriType url;

    private static final long serialVersionUID = -2068206970L;

    /*
     * Constructor
     */
    public FramesComponent() {
        super();
    }

    /*
     * Constructor
     */
    public FramesComponent(UriType url) {
        super();
        this.url = url;
    }

    /**
     * @return {@link #frameNumbers} (The frame numbers in the frame set.)
     */
    public List<UnsignedIntType> getFrameNumbers() {
        if (this.frameNumbers == null)
            this.frameNumbers = new ArrayList<UnsignedIntType>();
        return this.frameNumbers;
    }

    public boolean hasFrameNumbers() {
        if (this.frameNumbers == null)
            return false;
        for (UnsignedIntType item : this.frameNumbers) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public UnsignedIntType addFrameNumbersElement() {
        // 2
        UnsignedIntType t = new UnsignedIntType();
        if (this.frameNumbers == null)
            this.frameNumbers = new ArrayList<UnsignedIntType>();
        this.frameNumbers.add(t);
        return t;
    }

    /**
     * @param value {@link #frameNumbers} (The frame numbers in the frame set.)
     */
    public FramesComponent addFrameNumbers(int value) {
        // 1
        UnsignedIntType t = new UnsignedIntType();
        t.setValue(value);
        if (this.frameNumbers == null)
            this.frameNumbers = new ArrayList<UnsignedIntType>();
        this.frameNumbers.add(t);
        return this;
    }

    /**
     * @param value {@link #frameNumbers} (The frame numbers in the frame set.)
     */
    public boolean hasFrameNumbers(int value) {
        if (this.frameNumbers == null)
            return false;
        for (UnsignedIntType v : this.frameNumbers) if (// unsignedInt
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #url} (WADO-RS URL to retrieve the DICOM frames.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FramesComponent.url");
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
     * @param value {@link #url} (WADO-RS URL to retrieve the DICOM frames.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public FramesComponent setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return WADO-RS URL to retrieve the DICOM frames.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value WADO-RS URL to retrieve the DICOM frames.
     */
    public FramesComponent setUrl(String value) {
        if (this.url == null)
            this.url = new UriType();
        this.url.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("frameNumbers", "unsignedInt", "The frame numbers in the frame set.", 0, java.lang.Integer.MAX_VALUE, frameNumbers));
        childrenList.add(new Property("url", "uri", "WADO-RS URL to retrieve the DICOM frames.", 0, java.lang.Integer.MAX_VALUE, url));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("frameNumbers"))
            this.getFrameNumbers().add(castToUnsignedInt(value));
        else if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("frameNumbers")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.frameNumbers");
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImagingObjectSelection.url");
        } else
            return super.addChild(name);
    }

    public FramesComponent copy() {
        FramesComponent dst = new FramesComponent();
        copyValues(dst);
        if (frameNumbers != null) {
            dst.frameNumbers = new ArrayList<UnsignedIntType>();
            for (UnsignedIntType i : frameNumbers) dst.frameNumbers.add(i.copy());
        }
        ;
        dst.url = url == null ? null : url.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof FramesComponent))
            return false;
        FramesComponent o = (FramesComponent) other;
        return compareDeep(frameNumbers, o.frameNumbers, true) && compareDeep(url, o.url, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof FramesComponent))
            return false;
        FramesComponent o = (FramesComponent) other;
        return compareValues(frameNumbers, o.frameNumbers, true) && compareValues(url, o.url, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (frameNumbers == null || frameNumbers.isEmpty()) && (url == null || url.isEmpty());
    }

    public String fhirType() {
        return "ImagingObjectSelection.study.series.instance.frames";
    }
}
