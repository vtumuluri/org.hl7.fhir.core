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
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleType;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerb;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerbEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryMode;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryModeEnumFactory;

public class BundleLinkComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]].
     */
    protected StringType relation;

    /**
     * The reference details for the link.
     */
    protected UriType url;

    private static final long serialVersionUID = -1010386066L;

    /*
     * Constructor
     */
    public BundleLinkComponent() {
        super();
    }

    /*
     * Constructor
     */
    public BundleLinkComponent(StringType relation, UriType url) {
        super();
        this.relation = relation;
        this.url = url;
    }

    /**
     * @return {@link #relation} (A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]].). This is the underlying object with id, value and extensions. The accessor "getRelation" gives direct access to the value
     */
    public StringType getRelationElement() {
        if (this.relation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleLinkComponent.relation");
            else if (Configuration.doAutoCreate())
                // bb
                this.relation = new StringType();
        return this.relation;
    }

    public boolean hasRelationElement() {
        return this.relation != null && !this.relation.isEmpty();
    }

    public boolean hasRelation() {
        return this.relation != null && !this.relation.isEmpty();
    }

    /**
     * @param value {@link #relation} (A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]].). This is the underlying object with id, value and extensions. The accessor "getRelation" gives direct access to the value
     */
    public BundleLinkComponent setRelationElement(StringType value) {
        this.relation = value;
        return this;
    }

    /**
     * @return A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]].
     */
    public String getRelation() {
        return this.relation == null ? null : this.relation.getValue();
    }

    /**
     * @param value A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]].
     */
    public BundleLinkComponent setRelation(String value) {
        if (this.relation == null)
            this.relation = new StringType();
        this.relation.setValue(value);
        return this;
    }

    /**
     * @return {@link #url} (The reference details for the link.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleLinkComponent.url");
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
     * @param value {@link #url} (The reference details for the link.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public BundleLinkComponent setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return The reference details for the link.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value The reference details for the link.
     */
    public BundleLinkComponent setUrl(String value) {
        if (this.url == null)
            this.url = new UriType();
        this.url.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("relation", "string", "A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]].", 0, java.lang.Integer.MAX_VALUE, relation));
        childrenList.add(new Property("url", "uri", "The reference details for the link.", 0, java.lang.Integer.MAX_VALUE, url));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("relation"))
            // StringType
            this.relation = castToString(value);
        else if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("relation")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.relation");
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.url");
        } else
            return super.addChild(name);
    }

    public BundleLinkComponent copy() {
        BundleLinkComponent dst = new BundleLinkComponent();
        copyValues(dst);
        dst.relation = relation == null ? null : relation.copy();
        dst.url = url == null ? null : url.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof BundleLinkComponent))
            return false;
        BundleLinkComponent o = (BundleLinkComponent) other;
        return compareDeep(relation, o.relation, true) && compareDeep(url, o.url, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof BundleLinkComponent))
            return false;
        BundleLinkComponent o = (BundleLinkComponent) other;
        return compareValues(relation, o.relation, true) && compareValues(url, o.url, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (relation == null || relation.isEmpty()) && (url == null || url.isEmpty());
    }

    public String fhirType() {
        return "Bundle.link";
    }
}
