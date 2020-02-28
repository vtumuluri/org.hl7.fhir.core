package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuidePageKind;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuidePageKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideResourcePurpose;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideResourcePurposeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideDependencyType;
import org.hl7.fhir.android.generated.dstu2.ImplementationGuideEnum.GuideDependencyTypeEnumFactory;

public class ImplementationGuidePackageResourceComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Why the resource is included in the guide.
     */
    protected Enumeration<GuideResourcePurpose> purpose;

    /**
     * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
     */
    protected StringType name;

    /**
     * A description of the reason that a resource has been included in the implementation guide.
     */
    protected StringType description;

    /**
     * A short code that may be used to identify the resource throughout the implementation guide.
     */
    protected StringType acronym;

    /**
     * Where this resource is found.
     */
    protected Type source;

    /**
     * Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.
     */
    protected Reference exampleFor;

    /**
     * The actual object that is the target of the reference (Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.)
     */
    protected StructureDefinition exampleForTarget;

    private static final long serialVersionUID = 428339533L;

    /*
     * Constructor
     */
    public ImplementationGuidePackageResourceComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ImplementationGuidePackageResourceComponent(Enumeration<GuideResourcePurpose> purpose, Type source) {
        super();
        this.purpose = purpose;
        this.source = source;
    }

    /**
     * @return {@link #purpose} (Why the resource is included in the guide.). This is the underlying object with id, value and extensions. The accessor "getPurpose" gives direct access to the value
     */
    public Enumeration<GuideResourcePurpose> getPurposeElement() {
        if (this.purpose == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuidePackageResourceComponent.purpose");
            else if (Configuration.doAutoCreate())
                // bb
                this.purpose = new Enumeration<GuideResourcePurpose>(new GuideResourcePurposeEnumFactory());
        return this.purpose;
    }

    public boolean hasPurposeElement() {
        return this.purpose != null && !this.purpose.isEmpty();
    }

    public boolean hasPurpose() {
        return this.purpose != null && !this.purpose.isEmpty();
    }

    /**
     * @param value {@link #purpose} (Why the resource is included in the guide.). This is the underlying object with id, value and extensions. The accessor "getPurpose" gives direct access to the value
     */
    public ImplementationGuidePackageResourceComponent setPurposeElement(Enumeration<GuideResourcePurpose> value) {
        this.purpose = value;
        return this;
    }

    /**
     * @return Why the resource is included in the guide.
     */
    public GuideResourcePurpose getPurpose() {
        return this.purpose == null ? null : this.purpose.getValue();
    }

    /**
     * @param value Why the resource is included in the guide.
     */
    public ImplementationGuidePackageResourceComponent setPurpose(GuideResourcePurpose value) {
        if (this.purpose == null)
            this.purpose = new Enumeration<GuideResourcePurpose>(new GuideResourcePurposeEnumFactory());
        this.purpose.setValue(value);
        return this;
    }

    /**
     * @return {@link #name} (A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuidePackageResourceComponent.name");
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
     * @param value {@link #name} (A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ImplementationGuidePackageResourceComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
     */
    public ImplementationGuidePackageResourceComponent setName(String value) {
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
     * @return {@link #description} (A description of the reason that a resource has been included in the implementation guide.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuidePackageResourceComponent.description");
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
     * @param value {@link #description} (A description of the reason that a resource has been included in the implementation guide.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ImplementationGuidePackageResourceComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A description of the reason that a resource has been included in the implementation guide.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A description of the reason that a resource has been included in the implementation guide.
     */
    public ImplementationGuidePackageResourceComponent setDescription(String value) {
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
     * @return {@link #acronym} (A short code that may be used to identify the resource throughout the implementation guide.). This is the underlying object with id, value and extensions. The accessor "getAcronym" gives direct access to the value
     */
    public StringType getAcronymElement() {
        if (this.acronym == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuidePackageResourceComponent.acronym");
            else if (Configuration.doAutoCreate())
                // bb
                this.acronym = new StringType();
        return this.acronym;
    }

    public boolean hasAcronymElement() {
        return this.acronym != null && !this.acronym.isEmpty();
    }

    public boolean hasAcronym() {
        return this.acronym != null && !this.acronym.isEmpty();
    }

    /**
     * @param value {@link #acronym} (A short code that may be used to identify the resource throughout the implementation guide.). This is the underlying object with id, value and extensions. The accessor "getAcronym" gives direct access to the value
     */
    public ImplementationGuidePackageResourceComponent setAcronymElement(StringType value) {
        this.acronym = value;
        return this;
    }

    /**
     * @return A short code that may be used to identify the resource throughout the implementation guide.
     */
    public String getAcronym() {
        return this.acronym == null ? null : this.acronym.getValue();
    }

    /**
     * @param value A short code that may be used to identify the resource throughout the implementation guide.
     */
    public ImplementationGuidePackageResourceComponent setAcronym(String value) {
        if (Utilities.noString(value))
            this.acronym = null;
        else {
            if (this.acronym == null)
                this.acronym = new StringType();
            this.acronym.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #source} (Where this resource is found.)
     */
    public Type getSource() {
        return this.source;
    }

    /**
     * @return {@link #source} (Where this resource is found.)
     */
    public UriType getSourceUriType() throws FHIRException {
        if (!(this.source instanceof UriType))
            throw new FHIRException("Type mismatch: the type UriType was expected, but " + this.source.getClass().getName() + " was encountered");
        return (UriType) this.source;
    }

    public boolean hasSourceUriType() {
        return this.source instanceof UriType;
    }

    /**
     * @return {@link #source} (Where this resource is found.)
     */
    public Reference getSourceReference() throws FHIRException {
        if (!(this.source instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.source.getClass().getName() + " was encountered");
        return (Reference) this.source;
    }

    public boolean hasSourceReference() {
        return this.source instanceof Reference;
    }

    public boolean hasSource() {
        return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (Where this resource is found.)
     */
    public ImplementationGuidePackageResourceComponent setSource(Type value) {
        this.source = value;
        return this;
    }

    /**
     * @return {@link #exampleFor} (Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.)
     */
    public Reference getExampleFor() {
        if (this.exampleFor == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuidePackageResourceComponent.exampleFor");
            else if (Configuration.doAutoCreate())
                // cc
                this.exampleFor = new Reference();
        return this.exampleFor;
    }

    public boolean hasExampleFor() {
        return this.exampleFor != null && !this.exampleFor.isEmpty();
    }

    /**
     * @param value {@link #exampleFor} (Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.)
     */
    public ImplementationGuidePackageResourceComponent setExampleFor(Reference value) {
        this.exampleFor = value;
        return this;
    }

    /**
     * @return {@link #exampleFor} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.)
     */
    public StructureDefinition getExampleForTarget() {
        if (this.exampleForTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuidePackageResourceComponent.exampleFor");
            else if (Configuration.doAutoCreate())
                // aa
                this.exampleForTarget = new StructureDefinition();
        return this.exampleForTarget;
    }

    /**
     * @param value {@link #exampleFor} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.)
     */
    public ImplementationGuidePackageResourceComponent setExampleForTarget(StructureDefinition value) {
        this.exampleForTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("purpose", "code", "Why the resource is included in the guide.", 0, java.lang.Integer.MAX_VALUE, purpose));
        childrenList.add(new Property("name", "string", "A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("description", "string", "A description of the reason that a resource has been included in the implementation guide.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("acronym", "string", "A short code that may be used to identify the resource throughout the implementation guide.", 0, java.lang.Integer.MAX_VALUE, acronym));
        childrenList.add(new Property("source[x]", "uri|Reference(Any)", "Where this resource is found.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("exampleFor", "Reference(StructureDefinition)", "Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.", 0, java.lang.Integer.MAX_VALUE, exampleFor));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("purpose"))
            // Enumeration<GuideResourcePurpose>
            this.purpose = new GuideResourcePurposeEnumFactory().fromType(value);
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("acronym"))
            // StringType
            this.acronym = castToString(value);
        else if (name.equals("source[x]"))
            // Type
            this.source = (Type) value;
        else if (name.equals("exampleFor"))
            // Reference
            this.exampleFor = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("purpose")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.purpose");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.name");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.description");
        } else if (name.equals("acronym")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.acronym");
        } else if (name.equals("sourceUri")) {
            this.source = new UriType();
            return this.source;
        } else if (name.equals("sourceReference")) {
            this.source = new Reference();
            return this.source;
        } else if (name.equals("exampleFor")) {
            this.exampleFor = new Reference();
            return this.exampleFor;
        } else
            return super.addChild(name);
    }

    public ImplementationGuidePackageResourceComponent copy() {
        ImplementationGuidePackageResourceComponent dst = new ImplementationGuidePackageResourceComponent();
        copyValues(dst);
        dst.purpose = purpose == null ? null : purpose.copy();
        dst.name = name == null ? null : name.copy();
        dst.description = description == null ? null : description.copy();
        dst.acronym = acronym == null ? null : acronym.copy();
        dst.source = source == null ? null : source.copy();
        dst.exampleFor = exampleFor == null ? null : exampleFor.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImplementationGuidePackageResourceComponent))
            return false;
        ImplementationGuidePackageResourceComponent o = (ImplementationGuidePackageResourceComponent) other;
        return compareDeep(purpose, o.purpose, true) && compareDeep(name, o.name, true) && compareDeep(description, o.description, true) && compareDeep(acronym, o.acronym, true) && compareDeep(source, o.source, true) && compareDeep(exampleFor, o.exampleFor, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImplementationGuidePackageResourceComponent))
            return false;
        ImplementationGuidePackageResourceComponent o = (ImplementationGuidePackageResourceComponent) other;
        return compareValues(purpose, o.purpose, true) && compareValues(name, o.name, true) && compareValues(description, o.description, true) && compareValues(acronym, o.acronym, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (purpose == null || purpose.isEmpty()) && (name == null || name.isEmpty()) && (description == null || description.isEmpty()) && (acronym == null || acronym.isEmpty()) && (source == null || source.isEmpty()) && (exampleFor == null || exampleFor.isEmpty());
    }

    public String fhirType() {
        return "ImplementationGuide.package.resource";
    }
}
