package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerbEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerb;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryMode;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleType;

public class BundleEntryRequestComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The HTTP verb for this entry in either a update history, or a transaction/ transaction response.
     */
    protected Enumeration<HTTPVerb> method;

    /**
     * The URL for this entry, relative to the root (the address to which the request is posted).
     */
    protected UriType url;

    /**
     * If the ETag values match, return a 304 Not modified status. See the API documentation for ["Conditional Read"](http.html#cread).
     */
    protected StringType ifNoneMatch;

    /**
     * Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).
     */
    protected InstantType ifModifiedSince;

    /**
     * Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).
     */
    protected StringType ifMatch;

    /**
     * Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").
     */
    protected StringType ifNoneExist;

    private static final long serialVersionUID = -1349769744L;

    /*
     * Constructor
     */
    public BundleEntryRequestComponent() {
        super();
    }

    /*
     * Constructor
     */
    public BundleEntryRequestComponent(Enumeration<HTTPVerb> method, UriType url) {
        super();
        this.method = method;
        this.url = url;
    }

    /**
     * @return {@link #method} (The HTTP verb for this entry in either a update history, or a transaction/ transaction response.). This is the underlying object with id, value and extensions. The accessor "getMethod" gives direct access to the value
     */
    public Enumeration<HTTPVerb> getMethodElement() {
        if (this.method == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryRequestComponent.method");
            else if (Configuration.doAutoCreate())
                // bb
                this.method = new Enumeration<HTTPVerb>(new HTTPVerbEnumFactory());
        return this.method;
    }

    public boolean hasMethodElement() {
        return this.method != null && !this.method.isEmpty();
    }

    public boolean hasMethod() {
        return this.method != null && !this.method.isEmpty();
    }

    /**
     * @param value {@link #method} (The HTTP verb for this entry in either a update history, or a transaction/ transaction response.). This is the underlying object with id, value and extensions. The accessor "getMethod" gives direct access to the value
     */
    public BundleEntryRequestComponent setMethodElement(Enumeration<HTTPVerb> value) {
        this.method = value;
        return this;
    }

    /**
     * @return The HTTP verb for this entry in either a update history, or a transaction/ transaction response.
     */
    public HTTPVerb getMethod() {
        return this.method == null ? null : this.method.getValue();
    }

    /**
     * @param value The HTTP verb for this entry in either a update history, or a transaction/ transaction response.
     */
    public BundleEntryRequestComponent setMethod(HTTPVerb value) {
        if (this.method == null)
            this.method = new Enumeration<HTTPVerb>(new HTTPVerbEnumFactory());
        this.method.setValue(value);
        return this;
    }

    /**
     * @return {@link #url} (The URL for this entry, relative to the root (the address to which the request is posted).). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryRequestComponent.url");
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
     * @param value {@link #url} (The URL for this entry, relative to the root (the address to which the request is posted).). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public BundleEntryRequestComponent setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return The URL for this entry, relative to the root (the address to which the request is posted).
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value The URL for this entry, relative to the root (the address to which the request is posted).
     */
    public BundleEntryRequestComponent setUrl(String value) {
        if (this.url == null)
            this.url = new UriType();
        this.url.setValue(value);
        return this;
    }

    /**
     * @return {@link #ifNoneMatch} (If the ETag values match, return a 304 Not modified status. See the API documentation for ["Conditional Read"](http.html#cread).). This is the underlying object with id, value and extensions. The accessor "getIfNoneMatch" gives direct access to the value
     */
    public StringType getIfNoneMatchElement() {
        if (this.ifNoneMatch == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryRequestComponent.ifNoneMatch");
            else if (Configuration.doAutoCreate())
                // bb
                this.ifNoneMatch = new StringType();
        return this.ifNoneMatch;
    }

    public boolean hasIfNoneMatchElement() {
        return this.ifNoneMatch != null && !this.ifNoneMatch.isEmpty();
    }

    public boolean hasIfNoneMatch() {
        return this.ifNoneMatch != null && !this.ifNoneMatch.isEmpty();
    }

    /**
     * @param value {@link #ifNoneMatch} (If the ETag values match, return a 304 Not modified status. See the API documentation for ["Conditional Read"](http.html#cread).). This is the underlying object with id, value and extensions. The accessor "getIfNoneMatch" gives direct access to the value
     */
    public BundleEntryRequestComponent setIfNoneMatchElement(StringType value) {
        this.ifNoneMatch = value;
        return this;
    }

    /**
     * @return If the ETag values match, return a 304 Not modified status. See the API documentation for ["Conditional Read"](http.html#cread).
     */
    public String getIfNoneMatch() {
        return this.ifNoneMatch == null ? null : this.ifNoneMatch.getValue();
    }

    /**
     * @param value If the ETag values match, return a 304 Not modified status. See the API documentation for ["Conditional Read"](http.html#cread).
     */
    public BundleEntryRequestComponent setIfNoneMatch(String value) {
        if (Utilities.noString(value))
            this.ifNoneMatch = null;
        else {
            if (this.ifNoneMatch == null)
                this.ifNoneMatch = new StringType();
            this.ifNoneMatch.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #ifModifiedSince} (Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).). This is the underlying object with id, value and extensions. The accessor "getIfModifiedSince" gives direct access to the value
     */
    public InstantType getIfModifiedSinceElement() {
        if (this.ifModifiedSince == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryRequestComponent.ifModifiedSince");
            else if (Configuration.doAutoCreate())
                // bb
                this.ifModifiedSince = new InstantType();
        return this.ifModifiedSince;
    }

    public boolean hasIfModifiedSinceElement() {
        return this.ifModifiedSince != null && !this.ifModifiedSince.isEmpty();
    }

    public boolean hasIfModifiedSince() {
        return this.ifModifiedSince != null && !this.ifModifiedSince.isEmpty();
    }

    /**
     * @param value {@link #ifModifiedSince} (Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).). This is the underlying object with id, value and extensions. The accessor "getIfModifiedSince" gives direct access to the value
     */
    public BundleEntryRequestComponent setIfModifiedSinceElement(InstantType value) {
        this.ifModifiedSince = value;
        return this;
    }

    /**
     * @return Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).
     */
    public Date getIfModifiedSince() {
        return this.ifModifiedSince == null ? null : this.ifModifiedSince.getValue();
    }

    /**
     * @param value Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).
     */
    public BundleEntryRequestComponent setIfModifiedSince(Date value) {
        if (value == null)
            this.ifModifiedSince = null;
        else {
            if (this.ifModifiedSince == null)
                this.ifModifiedSince = new InstantType();
            this.ifModifiedSince.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #ifMatch} (Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).). This is the underlying object with id, value and extensions. The accessor "getIfMatch" gives direct access to the value
     */
    public StringType getIfMatchElement() {
        if (this.ifMatch == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryRequestComponent.ifMatch");
            else if (Configuration.doAutoCreate())
                // bb
                this.ifMatch = new StringType();
        return this.ifMatch;
    }

    public boolean hasIfMatchElement() {
        return this.ifMatch != null && !this.ifMatch.isEmpty();
    }

    public boolean hasIfMatch() {
        return this.ifMatch != null && !this.ifMatch.isEmpty();
    }

    /**
     * @param value {@link #ifMatch} (Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).). This is the underlying object with id, value and extensions. The accessor "getIfMatch" gives direct access to the value
     */
    public BundleEntryRequestComponent setIfMatchElement(StringType value) {
        this.ifMatch = value;
        return this;
    }

    /**
     * @return Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).
     */
    public String getIfMatch() {
        return this.ifMatch == null ? null : this.ifMatch.getValue();
    }

    /**
     * @param value Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).
     */
    public BundleEntryRequestComponent setIfMatch(String value) {
        if (Utilities.noString(value))
            this.ifMatch = null;
        else {
            if (this.ifMatch == null)
                this.ifMatch = new StringType();
            this.ifMatch.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #ifNoneExist} (Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").). This is the underlying object with id, value and extensions. The accessor "getIfNoneExist" gives direct access to the value
     */
    public StringType getIfNoneExistElement() {
        if (this.ifNoneExist == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryRequestComponent.ifNoneExist");
            else if (Configuration.doAutoCreate())
                // bb
                this.ifNoneExist = new StringType();
        return this.ifNoneExist;
    }

    public boolean hasIfNoneExistElement() {
        return this.ifNoneExist != null && !this.ifNoneExist.isEmpty();
    }

    public boolean hasIfNoneExist() {
        return this.ifNoneExist != null && !this.ifNoneExist.isEmpty();
    }

    /**
     * @param value {@link #ifNoneExist} (Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").). This is the underlying object with id, value and extensions. The accessor "getIfNoneExist" gives direct access to the value
     */
    public BundleEntryRequestComponent setIfNoneExistElement(StringType value) {
        this.ifNoneExist = value;
        return this;
    }

    /**
     * @return Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").
     */
    public String getIfNoneExist() {
        return this.ifNoneExist == null ? null : this.ifNoneExist.getValue();
    }

    /**
     * @param value Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").
     */
    public BundleEntryRequestComponent setIfNoneExist(String value) {
        if (Utilities.noString(value))
            this.ifNoneExist = null;
        else {
            if (this.ifNoneExist == null)
                this.ifNoneExist = new StringType();
            this.ifNoneExist.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("method", "code", "The HTTP verb for this entry in either a update history, or a transaction/ transaction response.", 0, java.lang.Integer.MAX_VALUE, method));
        childrenList.add(new Property("url", "uri", "The URL for this entry, relative to the root (the address to which the request is posted).", 0, java.lang.Integer.MAX_VALUE, url));
        childrenList.add(new Property("ifNoneMatch", "string", "If the ETag values match, return a 304 Not modified status. See the API documentation for [\"Conditional Read\"](http.html#cread).", 0, java.lang.Integer.MAX_VALUE, ifNoneMatch));
        childrenList.add(new Property("ifModifiedSince", "instant", "Only perform the operation if the last updated date matches. See the API documentation for [\"Conditional Read\"](http.html#cread).", 0, java.lang.Integer.MAX_VALUE, ifModifiedSince));
        childrenList.add(new Property("ifMatch", "string", "Only perform the operation if the Etag value matches. For more information, see the API section [\"Managing Resource Contention\"](http.html#concurrency).", 0, java.lang.Integer.MAX_VALUE, ifMatch));
        childrenList.add(new Property("ifNoneExist", "string", "Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\"Conditional Create\"](http.html#ccreate). This is just the query portion of the URL - what follows the \"?\" (not including the \"?\").", 0, java.lang.Integer.MAX_VALUE, ifNoneExist));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("method"))
            // Enumeration<HTTPVerb>
            this.method = new HTTPVerbEnumFactory().fromType(value);
        else if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else if (name.equals("ifNoneMatch"))
            // StringType
            this.ifNoneMatch = castToString(value);
        else if (name.equals("ifModifiedSince"))
            // InstantType
            this.ifModifiedSince = castToInstant(value);
        else if (name.equals("ifMatch"))
            // StringType
            this.ifMatch = castToString(value);
        else if (name.equals("ifNoneExist"))
            // StringType
            this.ifNoneExist = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("method")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.method");
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.url");
        } else if (name.equals("ifNoneMatch")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.ifNoneMatch");
        } else if (name.equals("ifModifiedSince")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.ifModifiedSince");
        } else if (name.equals("ifMatch")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.ifMatch");
        } else if (name.equals("ifNoneExist")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.ifNoneExist");
        } else
            return super.addChild(name);
    }

    public BundleEntryRequestComponent copy() {
        BundleEntryRequestComponent dst = new BundleEntryRequestComponent();
        copyValues(dst);
        dst.method = method == null ? null : method.copy();
        dst.url = url == null ? null : url.copy();
        dst.ifNoneMatch = ifNoneMatch == null ? null : ifNoneMatch.copy();
        dst.ifModifiedSince = ifModifiedSince == null ? null : ifModifiedSince.copy();
        dst.ifMatch = ifMatch == null ? null : ifMatch.copy();
        dst.ifNoneExist = ifNoneExist == null ? null : ifNoneExist.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof BundleEntryRequestComponent))
            return false;
        BundleEntryRequestComponent o = (BundleEntryRequestComponent) other;
        return compareDeep(method, o.method, true) && compareDeep(url, o.url, true) && compareDeep(ifNoneMatch, o.ifNoneMatch, true) && compareDeep(ifModifiedSince, o.ifModifiedSince, true) && compareDeep(ifMatch, o.ifMatch, true) && compareDeep(ifNoneExist, o.ifNoneExist, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof BundleEntryRequestComponent))
            return false;
        BundleEntryRequestComponent o = (BundleEntryRequestComponent) other;
        return compareValues(method, o.method, true) && compareValues(url, o.url, true) && compareValues(ifNoneMatch, o.ifNoneMatch, true) && compareValues(ifModifiedSince, o.ifModifiedSince, true) && compareValues(ifMatch, o.ifMatch, true) && compareValues(ifNoneExist, o.ifNoneExist, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (method == null || method.isEmpty()) && (url == null || url.isEmpty()) && (ifNoneMatch == null || ifNoneMatch.isEmpty()) && (ifModifiedSince == null || ifModifiedSince.isEmpty()) && (ifMatch == null || ifMatch.isEmpty()) && (ifNoneExist == null || ifNoneExist.isEmpty());
    }

    public String fhirType() {
        return "Bundle.entry.request";
    }
}
