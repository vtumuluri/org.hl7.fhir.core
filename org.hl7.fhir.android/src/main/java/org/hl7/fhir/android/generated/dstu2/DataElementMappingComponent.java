package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DataElementEnum.DataElementStringencyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DataElementEnum.DataElementStringency;

public class DataElementMappingComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis.
     */
    protected IdType identity;

    /**
     * An absolute URI that identifies the specification that this mapping is expressed to.
     */
    protected UriType uri;

    /**
     * A name for the specification that is being mapped to.
     */
    protected StringType name;

    /**
     * Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage.
     */
    protected StringType comments;

    private static final long serialVersionUID = 299630820L;

    /*
     * Constructor
     */
    public DataElementMappingComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DataElementMappingComponent(IdType identity) {
        super();
        this.identity = identity;
    }

    /**
     * @return {@link #identity} (An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis.). This is the underlying object with id, value and extensions. The accessor "getIdentity" gives direct access to the value
     */
    public IdType getIdentityElement() {
        if (this.identity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElementMappingComponent.identity");
            else if (Configuration.doAutoCreate())
                // bb
                this.identity = new IdType();
        return this.identity;
    }

    public boolean hasIdentityElement() {
        return this.identity != null && !this.identity.isEmpty();
    }

    public boolean hasIdentity() {
        return this.identity != null && !this.identity.isEmpty();
    }

    /**
     * @param value {@link #identity} (An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis.). This is the underlying object with id, value and extensions. The accessor "getIdentity" gives direct access to the value
     */
    public DataElementMappingComponent setIdentityElement(IdType value) {
        this.identity = value;
        return this;
    }

    /**
     * @return An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis.
     */
    public String getIdentity() {
        return this.identity == null ? null : this.identity.getValue();
    }

    /**
     * @param value An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis.
     */
    public DataElementMappingComponent setIdentity(String value) {
        if (this.identity == null)
            this.identity = new IdType();
        this.identity.setValue(value);
        return this;
    }

    /**
     * @return {@link #uri} (An absolute URI that identifies the specification that this mapping is expressed to.). This is the underlying object with id, value and extensions. The accessor "getUri" gives direct access to the value
     */
    public UriType getUriElement() {
        if (this.uri == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElementMappingComponent.uri");
            else if (Configuration.doAutoCreate())
                // bb
                this.uri = new UriType();
        return this.uri;
    }

    public boolean hasUriElement() {
        return this.uri != null && !this.uri.isEmpty();
    }

    public boolean hasUri() {
        return this.uri != null && !this.uri.isEmpty();
    }

    /**
     * @param value {@link #uri} (An absolute URI that identifies the specification that this mapping is expressed to.). This is the underlying object with id, value and extensions. The accessor "getUri" gives direct access to the value
     */
    public DataElementMappingComponent setUriElement(UriType value) {
        this.uri = value;
        return this;
    }

    /**
     * @return An absolute URI that identifies the specification that this mapping is expressed to.
     */
    public String getUri() {
        return this.uri == null ? null : this.uri.getValue();
    }

    /**
     * @param value An absolute URI that identifies the specification that this mapping is expressed to.
     */
    public DataElementMappingComponent setUri(String value) {
        if (Utilities.noString(value))
            this.uri = null;
        else {
            if (this.uri == null)
                this.uri = new UriType();
            this.uri.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #name} (A name for the specification that is being mapped to.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElementMappingComponent.name");
            else if (Configuration.doAutoCreate())
                // bb
                this.name = new StringType();
        return this.name;
    }

    public boolean hasNameElement() {
        return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A name for the specification that is being mapped to.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public DataElementMappingComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A name for the specification that is being mapped to.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A name for the specification that is being mapped to.
     */
    public DataElementMappingComponent setName(String value) {
        if (Utilities.noString(value))
            this.name = null;
        else {
            if (this.name == null)
                this.name = new StringType();
            this.name.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #comments} (Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage.). This is the underlying object with id, value and extensions. The accessor "getComments" gives direct access to the value
     */
    public StringType getCommentsElement() {
        if (this.comments == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DataElementMappingComponent.comments");
            else if (Configuration.doAutoCreate())
                // bb
                this.comments = new StringType();
        return this.comments;
    }

    public boolean hasCommentsElement() {
        return this.comments != null && !this.comments.isEmpty();
    }

    public boolean hasComments() {
        return this.comments != null && !this.comments.isEmpty();
    }

    /**
     * @param value {@link #comments} (Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage.). This is the underlying object with id, value and extensions. The accessor "getComments" gives direct access to the value
     */
    public DataElementMappingComponent setCommentsElement(StringType value) {
        this.comments = value;
        return this;
    }

    /**
     * @return Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage.
     */
    public String getComments() {
        return this.comments == null ? null : this.comments.getValue();
    }

    /**
     * @param value Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage.
     */
    public DataElementMappingComponent setComments(String value) {
        if (Utilities.noString(value))
            this.comments = null;
        else {
            if (this.comments == null)
                this.comments = new StringType();
            this.comments.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identity", "id", "An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis.", 0, java.lang.Integer.MAX_VALUE, identity));
        childrenList.add(new Property("uri", "uri", "An absolute URI that identifies the specification that this mapping is expressed to.", 0, java.lang.Integer.MAX_VALUE, uri));
        childrenList.add(new Property("name", "string", "A name for the specification that is being mapped to.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("comments", "string", "Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage.", 0, java.lang.Integer.MAX_VALUE, comments));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identity"))
            // IdType
            this.identity = castToId(value);
        else if (name.equals("uri"))
            // UriType
            this.uri = castToUri(value);
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("comments"))
            // StringType
            this.comments = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identity")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.identity");
        } else if (name.equals("uri")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.uri");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.name");
        } else if (name.equals("comments")) {
            throw new FHIRException("Cannot call addChild on a primitive type DataElement.comments");
        } else
            return super.addChild(name);
    }

    public DataElementMappingComponent copy() {
        DataElementMappingComponent dst = new DataElementMappingComponent();
        copyValues(dst);
        dst.identity = identity == null ? null : identity.copy();
        dst.uri = uri == null ? null : uri.copy();
        dst.name = name == null ? null : name.copy();
        dst.comments = comments == null ? null : comments.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DataElementMappingComponent))
            return false;
        DataElementMappingComponent o = (DataElementMappingComponent) other;
        return compareDeep(identity, o.identity, true) && compareDeep(uri, o.uri, true) && compareDeep(name, o.name, true) && compareDeep(comments, o.comments, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DataElementMappingComponent))
            return false;
        DataElementMappingComponent o = (DataElementMappingComponent) other;
        return compareValues(identity, o.identity, true) && compareValues(uri, o.uri, true) && compareValues(name, o.name, true) && compareValues(comments, o.comments, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identity == null || identity.isEmpty()) && (uri == null || uri.isEmpty()) && (name == null || name.isEmpty()) && (comments == null || comments.isEmpty());
    }

    public String fhirType() {
        return "DataElement.mapping";
    }
}
