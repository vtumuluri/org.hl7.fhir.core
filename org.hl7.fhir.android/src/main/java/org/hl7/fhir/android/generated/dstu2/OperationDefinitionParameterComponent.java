package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrength;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrengthEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationParameterUseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationParameterUse;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationKind;

public class OperationDefinitionParameterComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The name of used to identify the parameter.
     */
    protected CodeType name;

    /**
     * Whether this is an input or an output parameter.
     */
    protected Enumeration<OperationParameterUse> use;

    /**
     * The minimum number of times this parameter SHALL appear in the request or response.
     */
    protected IntegerType min;

    /**
     * The maximum number of times this element is permitted to appear in the request or response.
     */
    protected StringType max;

    /**
     * Describes the meaning or use of this parameter.
     */
    protected StringType documentation;

    /**
     * The type for this parameter.
     */
    protected CodeType type;

    /**
     * A profile the specifies the rules that this parameter must conform to.
     */
    protected Reference profile;

    /**
     * The actual object that is the target of the reference (A profile the specifies the rules that this parameter must conform to.)
     */
    protected StructureDefinition profileTarget;

    /**
     * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).
     */
    protected OperationDefinitionParameterBindingComponent binding;

    /**
     * The parts of a Tuple Parameter.
     */
    protected List<OperationDefinitionParameterComponent> part;

    private static final long serialVersionUID = -1514145741L;

    /*
     * Constructor
     */
    public OperationDefinitionParameterComponent() {
        super();
    }

    /*
     * Constructor
     */
    public OperationDefinitionParameterComponent(CodeType name, Enumeration<OperationParameterUse> use, IntegerType min, StringType max) {
        super();
        this.name = name;
        this.use = use;
        this.min = min;
        this.max = max;
    }

    /**
     * @return {@link #name} (The name of used to identify the parameter.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public CodeType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinitionParameterComponent.name");
            else if (Configuration.doAutoCreate())
                // bb
                this.name = new CodeType();
        return this.name;
    }

    public boolean hasNameElement() {
        return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (The name of used to identify the parameter.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public OperationDefinitionParameterComponent setNameElement(CodeType value) {
        this.name = value;
        return this;
    }

    /**
     * @return The name of used to identify the parameter.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The name of used to identify the parameter.
     */
    public OperationDefinitionParameterComponent setName(String value) {
        if (this.name == null)
            this.name = new CodeType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #use} (Whether this is an input or an output parameter.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Enumeration<OperationParameterUse> getUseElement() {
        if (this.use == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinitionParameterComponent.use");
            else if (Configuration.doAutoCreate())
                // bb
                this.use = new Enumeration<OperationParameterUse>(new OperationParameterUseEnumFactory());
        return this.use;
    }

    public boolean hasUseElement() {
        return this.use != null && !this.use.isEmpty();
    }

    public boolean hasUse() {
        return this.use != null && !this.use.isEmpty();
    }

    /**
     * @param value {@link #use} (Whether this is an input or an output parameter.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public OperationDefinitionParameterComponent setUseElement(Enumeration<OperationParameterUse> value) {
        this.use = value;
        return this;
    }

    /**
     * @return Whether this is an input or an output parameter.
     */
    public OperationParameterUse getUse() {
        return this.use == null ? null : this.use.getValue();
    }

    /**
     * @param value Whether this is an input or an output parameter.
     */
    public OperationDefinitionParameterComponent setUse(OperationParameterUse value) {
        if (this.use == null)
            this.use = new Enumeration<OperationParameterUse>(new OperationParameterUseEnumFactory());
        this.use.setValue(value);
        return this;
    }

    /**
     * @return {@link #min} (The minimum number of times this parameter SHALL appear in the request or response.). This is the underlying object with id, value and extensions. The accessor "getMin" gives direct access to the value
     */
    public IntegerType getMinElement() {
        if (this.min == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinitionParameterComponent.min");
            else if (Configuration.doAutoCreate())
                // bb
                this.min = new IntegerType();
        return this.min;
    }

    public boolean hasMinElement() {
        return this.min != null && !this.min.isEmpty();
    }

    public boolean hasMin() {
        return this.min != null && !this.min.isEmpty();
    }

    /**
     * @param value {@link #min} (The minimum number of times this parameter SHALL appear in the request or response.). This is the underlying object with id, value and extensions. The accessor "getMin" gives direct access to the value
     */
    public OperationDefinitionParameterComponent setMinElement(IntegerType value) {
        this.min = value;
        return this;
    }

    /**
     * @return The minimum number of times this parameter SHALL appear in the request or response.
     */
    public int getMin() {
        return this.min == null || this.min.isEmpty() ? 0 : this.min.getValue();
    }

    /**
     * @param value The minimum number of times this parameter SHALL appear in the request or response.
     */
    public OperationDefinitionParameterComponent setMin(int value) {
        if (this.min == null)
            this.min = new IntegerType();
        this.min.setValue(value);
        return this;
    }

    /**
     * @return {@link #max} (The maximum number of times this element is permitted to appear in the request or response.). This is the underlying object with id, value and extensions. The accessor "getMax" gives direct access to the value
     */
    public StringType getMaxElement() {
        if (this.max == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinitionParameterComponent.max");
            else if (Configuration.doAutoCreate())
                // bb
                this.max = new StringType();
        return this.max;
    }

    public boolean hasMaxElement() {
        return this.max != null && !this.max.isEmpty();
    }

    public boolean hasMax() {
        return this.max != null && !this.max.isEmpty();
    }

    /**
     * @param value {@link #max} (The maximum number of times this element is permitted to appear in the request or response.). This is the underlying object with id, value and extensions. The accessor "getMax" gives direct access to the value
     */
    public OperationDefinitionParameterComponent setMaxElement(StringType value) {
        this.max = value;
        return this;
    }

    /**
     * @return The maximum number of times this element is permitted to appear in the request or response.
     */
    public String getMax() {
        return this.max == null ? null : this.max.getValue();
    }

    /**
     * @param value The maximum number of times this element is permitted to appear in the request or response.
     */
    public OperationDefinitionParameterComponent setMax(String value) {
        if (this.max == null)
            this.max = new StringType();
        this.max.setValue(value);
        return this;
    }

    /**
     * @return {@link #documentation} (Describes the meaning or use of this parameter.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public StringType getDocumentationElement() {
        if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinitionParameterComponent.documentation");
            else if (Configuration.doAutoCreate())
                // bb
                this.documentation = new StringType();
        return this.documentation;
    }

    public boolean hasDocumentationElement() {
        return this.documentation != null && !this.documentation.isEmpty();
    }

    public boolean hasDocumentation() {
        return this.documentation != null && !this.documentation.isEmpty();
    }

    /**
     * @param value {@link #documentation} (Describes the meaning or use of this parameter.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public OperationDefinitionParameterComponent setDocumentationElement(StringType value) {
        this.documentation = value;
        return this;
    }

    /**
     * @return Describes the meaning or use of this parameter.
     */
    public String getDocumentation() {
        return this.documentation == null ? null : this.documentation.getValue();
    }

    /**
     * @param value Describes the meaning or use of this parameter.
     */
    public OperationDefinitionParameterComponent setDocumentation(String value) {
        if (Utilities.noString(value))
            this.documentation = null;
        else {
            if (this.documentation == null)
                this.documentation = new StringType();
            this.documentation.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (The type for this parameter.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public CodeType getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinitionParameterComponent.type");
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
     * @param value {@link #type} (The type for this parameter.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public OperationDefinitionParameterComponent setTypeElement(CodeType value) {
        this.type = value;
        return this;
    }

    /**
     * @return The type for this parameter.
     */
    public String getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The type for this parameter.
     */
    public OperationDefinitionParameterComponent setType(String value) {
        if (Utilities.noString(value))
            this.type = null;
        else {
            if (this.type == null)
                this.type = new CodeType();
            this.type.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #profile} (A profile the specifies the rules that this parameter must conform to.)
     */
    public Reference getProfile() {
        if (this.profile == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinitionParameterComponent.profile");
            else if (Configuration.doAutoCreate())
                // cc
                this.profile = new Reference();
        return this.profile;
    }

    public boolean hasProfile() {
        return this.profile != null && !this.profile.isEmpty();
    }

    /**
     * @param value {@link #profile} (A profile the specifies the rules that this parameter must conform to.)
     */
    public OperationDefinitionParameterComponent setProfile(Reference value) {
        this.profile = value;
        return this;
    }

    /**
     * @return {@link #profile} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A profile the specifies the rules that this parameter must conform to.)
     */
    public StructureDefinition getProfileTarget() {
        if (this.profileTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinitionParameterComponent.profile");
            else if (Configuration.doAutoCreate())
                // aa
                this.profileTarget = new StructureDefinition();
        return this.profileTarget;
    }

    /**
     * @param value {@link #profile} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A profile the specifies the rules that this parameter must conform to.)
     */
    public OperationDefinitionParameterComponent setProfileTarget(StructureDefinition value) {
        this.profileTarget = value;
        return this;
    }

    /**
     * @return {@link #binding} (Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).)
     */
    public OperationDefinitionParameterBindingComponent getBinding() {
        if (this.binding == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinitionParameterComponent.binding");
            else if (Configuration.doAutoCreate())
                // cc
                this.binding = new OperationDefinitionParameterBindingComponent();
        return this.binding;
    }

    public boolean hasBinding() {
        return this.binding != null && !this.binding.isEmpty();
    }

    /**
     * @param value {@link #binding} (Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).)
     */
    public OperationDefinitionParameterComponent setBinding(OperationDefinitionParameterBindingComponent value) {
        this.binding = value;
        return this;
    }

    /**
     * @return {@link #part} (The parts of a Tuple Parameter.)
     */
    public List<OperationDefinitionParameterComponent> getPart() {
        if (this.part == null)
            this.part = new ArrayList<OperationDefinitionParameterComponent>();
        return this.part;
    }

    public boolean hasPart() {
        if (this.part == null)
            return false;
        for (OperationDefinitionParameterComponent item : this.part) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public OperationDefinitionParameterComponent addPart() {
        // 3
        OperationDefinitionParameterComponent t = new OperationDefinitionParameterComponent();
        if (this.part == null)
            this.part = new ArrayList<OperationDefinitionParameterComponent>();
        this.part.add(t);
        return t;
    }

    // syntactic sugar
    public OperationDefinitionParameterComponent addPart(OperationDefinitionParameterComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.part == null)
            this.part = new ArrayList<OperationDefinitionParameterComponent>();
        this.part.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "code", "The name of used to identify the parameter.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("use", "code", "Whether this is an input or an output parameter.", 0, java.lang.Integer.MAX_VALUE, use));
        childrenList.add(new Property("min", "integer", "The minimum number of times this parameter SHALL appear in the request or response.", 0, java.lang.Integer.MAX_VALUE, min));
        childrenList.add(new Property("max", "string", "The maximum number of times this element is permitted to appear in the request or response.", 0, java.lang.Integer.MAX_VALUE, max));
        childrenList.add(new Property("documentation", "string", "Describes the meaning or use of this parameter.", 0, java.lang.Integer.MAX_VALUE, documentation));
        childrenList.add(new Property("type", "code", "The type for this parameter.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("profile", "Reference(StructureDefinition)", "A profile the specifies the rules that this parameter must conform to.", 0, java.lang.Integer.MAX_VALUE, profile));
        childrenList.add(new Property("binding", "", "Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).", 0, java.lang.Integer.MAX_VALUE, binding));
        childrenList.add(new Property("part", "@OperationDefinition.parameter", "The parts of a Tuple Parameter.", 0, java.lang.Integer.MAX_VALUE, part));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // CodeType
            this.name = castToCode(value);
        else if (name.equals("use"))
            // Enumeration<OperationParameterUse>
            this.use = new OperationParameterUseEnumFactory().fromType(value);
        else if (name.equals("min"))
            // IntegerType
            this.min = castToInteger(value);
        else if (name.equals("max"))
            // StringType
            this.max = castToString(value);
        else if (name.equals("documentation"))
            // StringType
            this.documentation = castToString(value);
        else if (name.equals("type"))
            // CodeType
            this.type = castToCode(value);
        else if (name.equals("profile"))
            // Reference
            this.profile = castToReference(value);
        else if (name.equals("binding"))
            // OperationDefinitionParameterBindingComponent
            this.binding = (OperationDefinitionParameterBindingComponent) value;
        else if (name.equals("part"))
            this.getPart().add((OperationDefinitionParameterComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.name");
        } else if (name.equals("use")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.use");
        } else if (name.equals("min")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.min");
        } else if (name.equals("max")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.max");
        } else if (name.equals("documentation")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.documentation");
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.type");
        } else if (name.equals("profile")) {
            this.profile = new Reference();
            return this.profile;
        } else if (name.equals("binding")) {
            this.binding = new OperationDefinitionParameterBindingComponent();
            return this.binding;
        } else if (name.equals("part")) {
            return addPart();
        } else
            return super.addChild(name);
    }

    public OperationDefinitionParameterComponent copy() {
        OperationDefinitionParameterComponent dst = new OperationDefinitionParameterComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.use = use == null ? null : use.copy();
        dst.min = min == null ? null : min.copy();
        dst.max = max == null ? null : max.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        dst.type = type == null ? null : type.copy();
        dst.profile = profile == null ? null : profile.copy();
        dst.binding = binding == null ? null : binding.copy();
        if (part != null) {
            dst.part = new ArrayList<OperationDefinitionParameterComponent>();
            for (OperationDefinitionParameterComponent i : part) dst.part.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof OperationDefinitionParameterComponent))
            return false;
        OperationDefinitionParameterComponent o = (OperationDefinitionParameterComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(use, o.use, true) && compareDeep(min, o.min, true) && compareDeep(max, o.max, true) && compareDeep(documentation, o.documentation, true) && compareDeep(type, o.type, true) && compareDeep(profile, o.profile, true) && compareDeep(binding, o.binding, true) && compareDeep(part, o.part, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof OperationDefinitionParameterComponent))
            return false;
        OperationDefinitionParameterComponent o = (OperationDefinitionParameterComponent) other;
        return compareValues(name, o.name, true) && compareValues(use, o.use, true) && compareValues(min, o.min, true) && compareValues(max, o.max, true) && compareValues(documentation, o.documentation, true) && compareValues(type, o.type, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (use == null || use.isEmpty()) && (min == null || min.isEmpty()) && (max == null || max.isEmpty()) && (documentation == null || documentation.isEmpty()) && (type == null || type.isEmpty()) && (profile == null || profile.isEmpty()) && (binding == null || binding.isEmpty()) && (part == null || part.isEmpty());
    }

    public String fhirType() {
        return "OperationDefinition.parameter";
    }
}
