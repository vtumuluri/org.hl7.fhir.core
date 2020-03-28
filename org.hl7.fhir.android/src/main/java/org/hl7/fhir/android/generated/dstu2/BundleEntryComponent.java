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

public class BundleEntryComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A series of links that provide context to this entry.
     */
    protected List<BundleLinkComponent> link;

    /**
     * The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource.
     */
    protected UriType fullUrl;

    /**
     * The Resources for the entry.
     */
    protected Resource resource;

    /**
     * Information about the search process that lead to the creation of this entry.
     */
    protected BundleEntrySearchComponent search;

    /**
     * Additional information about how this entry should be processed as part of a transaction.
     */
    protected BundleEntryRequestComponent request;

    /**
     * Additional information about how this entry should be processed as part of a transaction.
     */
    protected BundleEntryResponseComponent response;

    private static final long serialVersionUID = 517783054L;

    /*
     * Constructor
     */
    public BundleEntryComponent() {
        super();
    }

    /**
     * @return {@link #link} (A series of links that provide context to this entry.)
     */
    public List<BundleLinkComponent> getLink() {
        if (this.link == null)
            this.link = new ArrayList<BundleLinkComponent>();
        return this.link;
    }

    public boolean hasLink() {
        if (this.link == null)
            return false;
        for (BundleLinkComponent item : this.link) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public BundleLinkComponent addLink() {
        // 3
        BundleLinkComponent t = new BundleLinkComponent();
        if (this.link == null)
            this.link = new ArrayList<BundleLinkComponent>();
        this.link.add(t);
        return t;
    }

    // syntactic sugar
    public BundleEntryComponent addLink(BundleLinkComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.link == null)
            this.link = new ArrayList<BundleLinkComponent>();
        this.link.add(t);
        return this;
    }

    /**
     * @return {@link #fullUrl} (The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource.). This is the underlying object with id, value and extensions. The accessor "getFullUrl" gives direct access to the value
     */
    public UriType getFullUrlElement() {
        if (this.fullUrl == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryComponent.fullUrl");
            else if (Configuration.doAutoCreate())
                // bb
                this.fullUrl = new UriType();
        return this.fullUrl;
    }

    public boolean hasFullUrlElement() {
        return this.fullUrl != null && !this.fullUrl.isEmpty();
    }

    public boolean hasFullUrl() {
        return this.fullUrl != null && !this.fullUrl.isEmpty();
    }

    /**
     * @param value {@link #fullUrl} (The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource.). This is the underlying object with id, value and extensions. The accessor "getFullUrl" gives direct access to the value
     */
    public BundleEntryComponent setFullUrlElement(UriType value) {
        this.fullUrl = value;
        return this;
    }

    /**
     * @return The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource.
     */
    public String getFullUrl() {
        return this.fullUrl == null ? null : this.fullUrl.getValue();
    }

    /**
     * @param value The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource.
     */
    public BundleEntryComponent setFullUrl(String value) {
        if (Utilities.noString(value))
            this.fullUrl = null;
        else {
            if (this.fullUrl == null)
                this.fullUrl = new UriType();
            this.fullUrl.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #resource} (The Resources for the entry.)
     */
    public Resource getResource() {
        return this.resource;
    }

    public boolean hasResource() {
        return this.resource != null && !this.resource.isEmpty();
    }

    /**
     * @param value {@link #resource} (The Resources for the entry.)
     */
    public BundleEntryComponent setResource(Resource value) {
        this.resource = value;
        return this;
    }

    /**
     * @return {@link #search} (Information about the search process that lead to the creation of this entry.)
     */
    public BundleEntrySearchComponent getSearch() {
        if (this.search == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryComponent.search");
            else if (Configuration.doAutoCreate())
                // cc
                this.search = new BundleEntrySearchComponent();
        return this.search;
    }

    public boolean hasSearch() {
        return this.search != null && !this.search.isEmpty();
    }

    /**
     * @param value {@link #search} (Information about the search process that lead to the creation of this entry.)
     */
    public BundleEntryComponent setSearch(BundleEntrySearchComponent value) {
        this.search = value;
        return this;
    }

    /**
     * @return {@link #request} (Additional information about how this entry should be processed as part of a transaction.)
     */
    public BundleEntryRequestComponent getRequest() {
        if (this.request == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryComponent.request");
            else if (Configuration.doAutoCreate())
                // cc
                this.request = new BundleEntryRequestComponent();
        return this.request;
    }

    public boolean hasRequest() {
        return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (Additional information about how this entry should be processed as part of a transaction.)
     */
    public BundleEntryComponent setRequest(BundleEntryRequestComponent value) {
        this.request = value;
        return this;
    }

    /**
     * @return {@link #response} (Additional information about how this entry should be processed as part of a transaction.)
     */
    public BundleEntryResponseComponent getResponse() {
        if (this.response == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntryComponent.response");
            else if (Configuration.doAutoCreate())
                // cc
                this.response = new BundleEntryResponseComponent();
        return this.response;
    }

    public boolean hasResponse() {
        return this.response != null && !this.response.isEmpty();
    }

    /**
     * @param value {@link #response} (Additional information about how this entry should be processed as part of a transaction.)
     */
    public BundleEntryComponent setResponse(BundleEntryResponseComponent value) {
        this.response = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("link", "@Bundle.link", "A series of links that provide context to this entry.", 0, java.lang.Integer.MAX_VALUE, link));
        childrenList.add(new Property("fullUrl", "uri", "The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource.", 0, java.lang.Integer.MAX_VALUE, fullUrl));
        childrenList.add(new Property("resource", "Resource", "The Resources for the entry.", 0, java.lang.Integer.MAX_VALUE, resource));
        childrenList.add(new Property("search", "", "Information about the search process that lead to the creation of this entry.", 0, java.lang.Integer.MAX_VALUE, search));
        childrenList.add(new Property("request", "", "Additional information about how this entry should be processed as part of a transaction.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("response", "", "Additional information about how this entry should be processed as part of a transaction.", 0, java.lang.Integer.MAX_VALUE, response));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("link"))
            this.getLink().add((BundleLinkComponent) value);
        else if (name.equals("fullUrl"))
            // UriType
            this.fullUrl = castToUri(value);
        else if (name.equals("resource"))
            // Resource
            this.resource = castToResource(value);
        else if (name.equals("search"))
            // BundleEntrySearchComponent
            this.search = (BundleEntrySearchComponent) value;
        else if (name.equals("request"))
            // BundleEntryRequestComponent
            this.request = (BundleEntryRequestComponent) value;
        else if (name.equals("response"))
            // BundleEntryResponseComponent
            this.response = (BundleEntryResponseComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("link")) {
            return addLink();
        } else if (name.equals("fullUrl")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.fullUrl");
        } else if (name.equals("resource")) {
            throw new FHIRException("Cannot call addChild on an abstract type Bundle.resource");
        } else if (name.equals("search")) {
            this.search = new BundleEntrySearchComponent();
            return this.search;
        } else if (name.equals("request")) {
            this.request = new BundleEntryRequestComponent();
            return this.request;
        } else if (name.equals("response")) {
            this.response = new BundleEntryResponseComponent();
            return this.response;
        } else
            return super.addChild(name);
    }

    public BundleEntryComponent copy() {
        BundleEntryComponent dst = new BundleEntryComponent();
        copyValues(dst);
        if (link != null) {
            dst.link = new ArrayList<BundleLinkComponent>();
            for (BundleLinkComponent i : link) dst.link.add(i.copy());
        }
        ;
        dst.fullUrl = fullUrl == null ? null : fullUrl.copy();
        dst.resource = resource == null ? null : resource.copy();
        dst.search = search == null ? null : search.copy();
        dst.request = request == null ? null : request.copy();
        dst.response = response == null ? null : response.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof BundleEntryComponent))
            return false;
        BundleEntryComponent o = (BundleEntryComponent) other;
        return compareDeep(link, o.link, true) && compareDeep(fullUrl, o.fullUrl, true) && compareDeep(resource, o.resource, true) && compareDeep(search, o.search, true) && compareDeep(request, o.request, true) && compareDeep(response, o.response, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof BundleEntryComponent))
            return false;
        BundleEntryComponent o = (BundleEntryComponent) other;
        return compareValues(fullUrl, o.fullUrl, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (link == null || link.isEmpty()) && (fullUrl == null || fullUrl.isEmpty()) && (resource == null || resource.isEmpty()) && (search == null || search.isEmpty()) && (request == null || request.isEmpty()) && (response == null || response.isEmpty());
    }

    public String fhirType() {
        return "Bundle.entry";
    }
}
