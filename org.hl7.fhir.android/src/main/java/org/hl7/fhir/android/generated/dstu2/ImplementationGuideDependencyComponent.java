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
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuidePageKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuidePageKind;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideDependencyTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideDependencyType;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideResourcePurposeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideResourcePurpose;

public class ImplementationGuideDependencyComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * How the dependency is represented when the guide is published.
     */
    protected Enumeration<GuideDependencyType> type;

    /**
     * Where the dependency is located.
     */
    protected UriType uri;

    private static final long serialVersionUID = 162447098L;

    /*
     * Constructor
     */
    public ImplementationGuideDependencyComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ImplementationGuideDependencyComponent(Enumeration<GuideDependencyType> type, UriType uri) {
        super();
        this.type = type;
        this.uri = uri;
    }

    /**
     * @return {@link #type} (How the dependency is represented when the guide is published.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<GuideDependencyType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuideDependencyComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<GuideDependencyType>(new GuideDependencyTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (How the dependency is represented when the guide is published.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public ImplementationGuideDependencyComponent setTypeElement(Enumeration<GuideDependencyType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return How the dependency is represented when the guide is published.
     */
    public GuideDependencyType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value How the dependency is represented when the guide is published.
     */
    public ImplementationGuideDependencyComponent setType(GuideDependencyType value) {
        if (this.type == null)
            this.type = new Enumeration<GuideDependencyType>(new GuideDependencyTypeEnumFactory());
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #uri} (Where the dependency is located.). This is the underlying object with id, value and extensions. The accessor "getUri" gives direct access to the value
     */
    public UriType getUriElement() {
        if (this.uri == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuideDependencyComponent.uri");
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
     * @param value {@link #uri} (Where the dependency is located.). This is the underlying object with id, value and extensions. The accessor "getUri" gives direct access to the value
     */
    public ImplementationGuideDependencyComponent setUriElement(UriType value) {
        this.uri = value;
        return this;
    }

    /**
     * @return Where the dependency is located.
     */
    public String getUri() {
        return this.uri == null ? null : this.uri.getValue();
    }

    /**
     * @param value Where the dependency is located.
     */
    public ImplementationGuideDependencyComponent setUri(String value) {
        if (this.uri == null)
            this.uri = new UriType();
        this.uri.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "How the dependency is represented when the guide is published.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("uri", "uri", "Where the dependency is located.", 0, java.lang.Integer.MAX_VALUE, uri));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Enumeration<GuideDependencyType>
            this.type = new GuideDependencyTypeEnumFactory().fromType(value);
        else if (name.equals("uri"))
            // UriType
            this.uri = castToUri(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.type");
        } else if (name.equals("uri")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.uri");
        } else
            return super.addChild(name);
    }

    public ImplementationGuideDependencyComponent copy() {
        ImplementationGuideDependencyComponent dst = new ImplementationGuideDependencyComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.uri = uri == null ? null : uri.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImplementationGuideDependencyComponent))
            return false;
        ImplementationGuideDependencyComponent o = (ImplementationGuideDependencyComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(uri, o.uri, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImplementationGuideDependencyComponent))
            return false;
        ImplementationGuideDependencyComponent o = (ImplementationGuideDependencyComponent) other;
        return compareValues(type, o.type, true) && compareValues(uri, o.uri, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (uri == null || uri.isEmpty());
    }

    public String fhirType() {
        return "ImplementationGuide.dependency";
    }
}
