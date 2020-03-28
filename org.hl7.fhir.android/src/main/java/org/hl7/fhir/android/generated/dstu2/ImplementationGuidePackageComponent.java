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

public class ImplementationGuidePackageComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The name for the group, as used in page.package.
     */
    protected StringType name;

    /**
     * Human readable text describing the package.
     */
    protected StringType description;

    /**
     * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, conformance statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
     */
    protected List<ImplementationGuidePackageResourceComponent> resource;

    private static final long serialVersionUID = -701846580L;

    /*
     * Constructor
     */
    public ImplementationGuidePackageComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ImplementationGuidePackageComponent(StringType name) {
        super();
        this.name = name;
    }

    /**
     * @return {@link #name} (The name for the group, as used in page.package.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuidePackageComponent.name");
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
     * @param value {@link #name} (The name for the group, as used in page.package.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ImplementationGuidePackageComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return The name for the group, as used in page.package.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The name for the group, as used in page.package.
     */
    public ImplementationGuidePackageComponent setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (Human readable text describing the package.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuidePackageComponent.description");
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
     * @param value {@link #description} (Human readable text describing the package.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ImplementationGuidePackageComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Human readable text describing the package.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Human readable text describing the package.
     */
    public ImplementationGuidePackageComponent setDescription(String value) {
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
     * @return {@link #resource} (A resource that is part of the implementation guide. Conformance resources (value set, structure definition, conformance statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.)
     */
    public List<ImplementationGuidePackageResourceComponent> getResource() {
        if (this.resource == null)
            this.resource = new ArrayList<ImplementationGuidePackageResourceComponent>();
        return this.resource;
    }

    public boolean hasResource() {
        if (this.resource == null)
            return false;
        for (ImplementationGuidePackageResourceComponent item : this.resource) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ImplementationGuidePackageResourceComponent addResource() {
        // 3
        ImplementationGuidePackageResourceComponent t = new ImplementationGuidePackageResourceComponent();
        if (this.resource == null)
            this.resource = new ArrayList<ImplementationGuidePackageResourceComponent>();
        this.resource.add(t);
        return t;
    }

    // syntactic sugar
    public ImplementationGuidePackageComponent addResource(ImplementationGuidePackageResourceComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.resource == null)
            this.resource = new ArrayList<ImplementationGuidePackageResourceComponent>();
        this.resource.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "The name for the group, as used in page.package.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("description", "string", "Human readable text describing the package.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("resource", "", "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, conformance statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.", 0, java.lang.Integer.MAX_VALUE, resource));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("resource"))
            this.getResource().add((ImplementationGuidePackageResourceComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.name");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.description");
        } else if (name.equals("resource")) {
            return addResource();
        } else
            return super.addChild(name);
    }

    public ImplementationGuidePackageComponent copy() {
        ImplementationGuidePackageComponent dst = new ImplementationGuidePackageComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.description = description == null ? null : description.copy();
        if (resource != null) {
            dst.resource = new ArrayList<ImplementationGuidePackageResourceComponent>();
            for (ImplementationGuidePackageResourceComponent i : resource) dst.resource.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImplementationGuidePackageComponent))
            return false;
        ImplementationGuidePackageComponent o = (ImplementationGuidePackageComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(description, o.description, true) && compareDeep(resource, o.resource, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImplementationGuidePackageComponent))
            return false;
        ImplementationGuidePackageComponent o = (ImplementationGuidePackageComponent) other;
        return compareValues(name, o.name, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (description == null || description.isEmpty()) && (resource == null || resource.isEmpty());
    }

    public String fhirType() {
        return "ImplementationGuide.package";
    }
}
