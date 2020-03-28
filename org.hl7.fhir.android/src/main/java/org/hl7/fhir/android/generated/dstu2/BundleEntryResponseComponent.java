package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerb;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerbEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryMode;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleType;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleTypeEnumFactory;

public class BundleEntryResponseComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The status code returned by processing this entry.
     */
    protected StringType status;

    /**
     * The location header created by processing this operation.
     */
    protected UriType location;

    /**
     * The etag for the resource, it the operation for the entry produced a versioned resource.
     */
    protected StringType etag;

    /**
     * The date/time that the resource was modified on the server.
     */
    protected InstantType lastModified;

    private static final long serialVersionUID = -1526413234L;

    /*
     * Constructor
     */
    public BundleEntryResponseComponent() {
        super();
    }

    /*
     * Constructor
     */
    public BundleEntryResponseComponent(StringType status) {
        super();
        this.status = status;
    }

    /**
     * @return {@link #status} (The status code returned by processing this entry.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public StringType getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryResponseComponent.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new StringType();
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status code returned by processing this entry.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public BundleEntryResponseComponent setStatusElement(StringType value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status code returned by processing this entry.
     */
    public String getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status code returned by processing this entry.
     */
    public BundleEntryResponseComponent setStatus(String value) {
        if (this.status == null)
            this.status = new StringType();
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #location} (The location header created by processing this operation.). This is the underlying object with id, value and extensions. The accessor "getLocation" gives direct access to the value
     */
    public UriType getLocationElement() {
        if (this.location == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryResponseComponent.location");
            else if (Configuration.doAutoCreate())
                // bb
                this.location = new UriType();
        return this.location;
    }

    public boolean hasLocationElement() {
        return this.location != null && !this.location.isEmpty();
    }

    public boolean hasLocation() {
        return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (The location header created by processing this operation.). This is the underlying object with id, value and extensions. The accessor "getLocation" gives direct access to the value
     */
    public BundleEntryResponseComponent setLocationElement(UriType value) {
        this.location = value;
        return this;
    }

    /**
     * @return The location header created by processing this operation.
     */
    public String getLocation() {
        return this.location == null ? null : this.location.getValue();
    }

    /**
     * @param value The location header created by processing this operation.
     */
    public BundleEntryResponseComponent setLocation(String value) {
        if (Utilities.noString(value))
            this.location = null;
        else {
            if (this.location == null)
                this.location = new UriType();
            this.location.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #etag} (The etag for the resource, it the operation for the entry produced a versioned resource.). This is the underlying object with id, value and extensions. The accessor "getEtag" gives direct access to the value
     */
    public StringType getEtagElement() {
        if (this.etag == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryResponseComponent.etag");
            else if (Configuration.doAutoCreate())
                // bb
                this.etag = new StringType();
        return this.etag;
    }

    public boolean hasEtagElement() {
        return this.etag != null && !this.etag.isEmpty();
    }

    public boolean hasEtag() {
        return this.etag != null && !this.etag.isEmpty();
    }

    /**
     * @param value {@link #etag} (The etag for the resource, it the operation for the entry produced a versioned resource.). This is the underlying object with id, value and extensions. The accessor "getEtag" gives direct access to the value
     */
    public BundleEntryResponseComponent setEtagElement(StringType value) {
        this.etag = value;
        return this;
    }

    /**
     * @return The etag for the resource, it the operation for the entry produced a versioned resource.
     */
    public String getEtag() {
        return this.etag == null ? null : this.etag.getValue();
    }

    /**
     * @param value The etag for the resource, it the operation for the entry produced a versioned resource.
     */
    public BundleEntryResponseComponent setEtag(String value) {
        if (Utilities.noString(value))
            this.etag = null;
        else {
            if (this.etag == null)
                this.etag = new StringType();
            this.etag.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #lastModified} (The date/time that the resource was modified on the server.). This is the underlying object with id, value and extensions. The accessor "getLastModified" gives direct access to the value
     */
    public InstantType getLastModifiedElement() {
        if (this.lastModified == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryResponseComponent.lastModified");
            else if (Configuration.doAutoCreate())
                // bb
                this.lastModified = new InstantType();
        return this.lastModified;
    }

    public boolean hasLastModifiedElement() {
        return this.lastModified != null && !this.lastModified.isEmpty();
    }

    public boolean hasLastModified() {
        return this.lastModified != null && !this.lastModified.isEmpty();
    }

    /**
     * @param value {@link #lastModified} (The date/time that the resource was modified on the server.). This is the underlying object with id, value and extensions. The accessor "getLastModified" gives direct access to the value
     */
    public BundleEntryResponseComponent setLastModifiedElement(InstantType value) {
        this.lastModified = value;
        return this;
    }

    /**
     * @return The date/time that the resource was modified on the server.
     */
    public Date getLastModified() {
        return this.lastModified == null ? null : this.lastModified.getValue();
    }

    /**
     * @param value The date/time that the resource was modified on the server.
     */
    public BundleEntryResponseComponent setLastModified(Date value) {
        if (value == null)
            this.lastModified = null;
        else {
            if (this.lastModified == null)
                this.lastModified = new InstantType();
            this.lastModified.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("status", "string", "The status code returned by processing this entry.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("location", "uri", "The location header created by processing this operation.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("etag", "string", "The etag for the resource, it the operation for the entry produced a versioned resource.", 0, java.lang.Integer.MAX_VALUE, etag));
        childrenList.add(new Property("lastModified", "instant", "The date/time that the resource was modified on the server.", 0, java.lang.Integer.MAX_VALUE, lastModified));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("status"))
            // StringType
            this.status = castToString(value);
        else if (name.equals("location"))
            // UriType
            this.location = castToUri(value);
        else if (name.equals("etag"))
            // StringType
            this.etag = castToString(value);
        else if (name.equals("lastModified"))
            // InstantType
            this.lastModified = castToInstant(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.status");
        } else if (name.equals("location")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.location");
        } else if (name.equals("etag")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.etag");
        } else if (name.equals("lastModified")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.lastModified");
        } else
            return super.addChild(name);
    }

    public BundleEntryResponseComponent copy() {
        BundleEntryResponseComponent dst = new BundleEntryResponseComponent();
        copyValues(dst);
        dst.status = status == null ? null : status.copy();
        dst.location = location == null ? null : location.copy();
        dst.etag = etag == null ? null : etag.copy();
        dst.lastModified = lastModified == null ? null : lastModified.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof BundleEntryResponseComponent))
            return false;
        BundleEntryResponseComponent o = (BundleEntryResponseComponent) other;
        return compareDeep(status, o.status, true) && compareDeep(location, o.location, true) && compareDeep(etag, o.etag, true) && compareDeep(lastModified, o.lastModified, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof BundleEntryResponseComponent))
            return false;
        BundleEntryResponseComponent o = (BundleEntryResponseComponent) other;
        return compareValues(status, o.status, true) && compareValues(location, o.location, true) && compareValues(etag, o.etag, true) && compareValues(lastModified, o.lastModified, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (status == null || status.isEmpty()) && (location == null || location.isEmpty()) && (etag == null || etag.isEmpty()) && (lastModified == null || lastModified.isEmpty());
    }

    public String fhirType() {
        return "Bundle.entry.response";
    }
}
