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

public class ImplementationGuideGlobalComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The type of resource that all instances must conform to.
     */
    protected CodeType type;

    /**
     * A reference to the profile that all instances must conform to.
     */
    protected Reference profile;

    /**
     * The actual object that is the target of the reference (A reference to the profile that all instances must conform to.)
     */
    protected StructureDefinition profileTarget;

    private static final long serialVersionUID = 2011731959L;

    /*
     * Constructor
     */
    public ImplementationGuideGlobalComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ImplementationGuideGlobalComponent(CodeType type, Reference profile) {
        super();
        this.type = type;
        this.profile = profile;
    }

    /**
     * @return {@link #type} (The type of resource that all instances must conform to.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public CodeType getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuideGlobalComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new CodeType();
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of resource that all instances must conform to.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public ImplementationGuideGlobalComponent setTypeElement(CodeType value) {
        this.type = value;
        return this;
    }

    /**
     * @return The type of resource that all instances must conform to.
     */
    public String getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The type of resource that all instances must conform to.
     */
    public ImplementationGuideGlobalComponent setType(String value) {
        if (this.type == null)
            this.type = new CodeType();
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #profile} (A reference to the profile that all instances must conform to.)
     */
    public Reference getProfile() {
        if (this.profile == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuideGlobalComponent.profile");
            else if (Configuration.doAutoCreate())
                // cc
                this.profile = new Reference();
        return this.profile;
    }

    public boolean hasProfile() {
        return this.profile != null && !this.profile.isEmpty();
    }

    /**
     * @param value {@link #profile} (A reference to the profile that all instances must conform to.)
     */
    public ImplementationGuideGlobalComponent setProfile(Reference value) {
        this.profile = value;
        return this;
    }

    /**
     * @return {@link #profile} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to the profile that all instances must conform to.)
     */
    public StructureDefinition getProfileTarget() {
        if (this.profileTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImplementationGuideGlobalComponent.profile");
            else if (Configuration.doAutoCreate())
                // aa
                this.profileTarget = new StructureDefinition();
        return this.profileTarget;
    }

    /**
     * @param value {@link #profile} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to the profile that all instances must conform to.)
     */
    public ImplementationGuideGlobalComponent setProfileTarget(StructureDefinition value) {
        this.profileTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "The type of resource that all instances must conform to.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("profile", "Reference(StructureDefinition)", "A reference to the profile that all instances must conform to.", 0, java.lang.Integer.MAX_VALUE, profile));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // CodeType
            this.type = castToCode(value);
        else if (name.equals("profile"))
            // Reference
            this.profile = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImplementationGuide.type");
        } else if (name.equals("profile")) {
            this.profile = new Reference();
            return this.profile;
        } else
            return super.addChild(name);
    }

    public ImplementationGuideGlobalComponent copy() {
        ImplementationGuideGlobalComponent dst = new ImplementationGuideGlobalComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.profile = profile == null ? null : profile.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImplementationGuideGlobalComponent))
            return false;
        ImplementationGuideGlobalComponent o = (ImplementationGuideGlobalComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(profile, o.profile, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImplementationGuideGlobalComponent))
            return false;
        ImplementationGuideGlobalComponent o = (ImplementationGuideGlobalComponent) other;
        return compareValues(type, o.type, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (profile == null || profile.isEmpty());
    }

    public String fhirType() {
        return "ImplementationGuide.global";
    }
}
