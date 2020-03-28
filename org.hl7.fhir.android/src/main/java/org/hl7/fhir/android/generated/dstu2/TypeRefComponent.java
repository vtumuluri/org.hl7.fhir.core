package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.BindingStrength;
import org.hl7.fhir.android.generated.dstu2.Enumerations.BindingStrengthEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentation;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentationEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRules;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRulesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationMode;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverity;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverityEnumFactory;

public class TypeRefComponent extends Element implements IBaseDatatypeElement {

    /**
     * Name of Data type or Resource that is a(or the) type used for this element.
     */
    protected CodeType code;

    /**
     * Identifies a profile structure or implementation Guide that SHALL hold for resources or datatypes referenced as the type of this element. Can be a local reference - to another structure in this profile, or a reference to a structure in another profile. When more than one profile is specified, the content must conform to all of them. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.
     */
    protected List<UriType> profile;

    /**
     * If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.
     */
    protected List<Enumeration<AggregationMode>> aggregation;

    private static final long serialVersionUID = -988693373L;

    /*
     * Constructor
     */
    public TypeRefComponent() {
        super();
    }

    /*
     * Constructor
     */
    public TypeRefComponent(CodeType code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #code} (Name of Data type or Resource that is a(or the) type used for this element.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public CodeType getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TypeRefComponent.code");
            else if (Configuration.doAutoCreate())
                // bb
                this.code = new CodeType();
        return this.code;
    }

    public boolean hasCodeElement() {
        return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Name of Data type or Resource that is a(or the) type used for this element.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public TypeRefComponent setCodeElement(CodeType value) {
        this.code = value;
        return this;
    }

    /**
     * @return Name of Data type or Resource that is a(or the) type used for this element.
     */
    public String getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value Name of Data type or Resource that is a(or the) type used for this element.
     */
    public TypeRefComponent setCode(String value) {
        if (this.code == null)
            this.code = new CodeType();
        this.code.setValue(value);
        return this;
    }

    /**
     * @return {@link #profile} (Identifies a profile structure or implementation Guide that SHALL hold for resources or datatypes referenced as the type of this element. Can be a local reference - to another structure in this profile, or a reference to a structure in another profile. When more than one profile is specified, the content must conform to all of them. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.)
     */
    public List<UriType> getProfile() {
        if (this.profile == null)
            this.profile = new ArrayList<UriType>();
        return this.profile;
    }

    public boolean hasProfile() {
        if (this.profile == null)
            return false;
        for (UriType item : this.profile) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public UriType addProfileElement() {
        // 2
        UriType t = new UriType();
        if (this.profile == null)
            this.profile = new ArrayList<UriType>();
        this.profile.add(t);
        return t;
    }

    /**
     * @param value {@link #profile} (Identifies a profile structure or implementation Guide that SHALL hold for resources or datatypes referenced as the type of this element. Can be a local reference - to another structure in this profile, or a reference to a structure in another profile. When more than one profile is specified, the content must conform to all of them. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.)
     */
    public TypeRefComponent addProfile(String value) {
        // 1
        UriType t = new UriType();
        t.setValue(value);
        if (this.profile == null)
            this.profile = new ArrayList<UriType>();
        this.profile.add(t);
        return this;
    }

    /**
     * @param value {@link #profile} (Identifies a profile structure or implementation Guide that SHALL hold for resources or datatypes referenced as the type of this element. Can be a local reference - to another structure in this profile, or a reference to a structure in another profile. When more than one profile is specified, the content must conform to all of them. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.)
     */
    public boolean hasProfile(String value) {
        if (this.profile == null)
            return false;
        for (UriType v : this.profile) if (// uri
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #aggregation} (If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.)
     */
    public List<Enumeration<AggregationMode>> getAggregation() {
        if (this.aggregation == null)
            this.aggregation = new ArrayList<Enumeration<AggregationMode>>();
        return this.aggregation;
    }

    public TypeRefComponent setAggregation(List<Enumeration<AggregationMode>> aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    public boolean hasAggregation() {
        if (this.aggregation == null)
            return false;
        for (Enumeration<AggregationMode> item : this.aggregation) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Enumeration<AggregationMode> addAggregationElement() {
        // 2
        Enumeration<AggregationMode> t = new Enumeration<AggregationMode>(new AggregationModeEnumFactory());
        if (this.aggregation == null)
            this.aggregation = new ArrayList<Enumeration<AggregationMode>>();
        this.aggregation.add(t);
        return t;
    }

    /**
     * @param value {@link #aggregation} (If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.)
     */
    public TypeRefComponent addAggregation(AggregationMode value) {
        // 1
        Enumeration<AggregationMode> t = new Enumeration<AggregationMode>(new AggregationModeEnumFactory());
        t.setValue(value);
        if (this.aggregation == null)
            this.aggregation = new ArrayList<Enumeration<AggregationMode>>();
        this.aggregation.add(t);
        return this;
    }

    /**
     * @param value {@link #aggregation} (If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.)
     */
    public boolean hasAggregation(AggregationMode value) {
        if (this.aggregation == null)
            return false;
        for (Enumeration<AggregationMode> v : this.aggregation) if (// code
        v.equals(value))
            return true;
        return false;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "code", "Name of Data type or Resource that is a(or the) type used for this element.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("profile", "uri", "Identifies a profile structure or implementation Guide that SHALL hold for resources or datatypes referenced as the type of this element. Can be a local reference - to another structure in this profile, or a reference to a structure in another profile. When more than one profile is specified, the content must conform to all of them. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide.", 0, java.lang.Integer.MAX_VALUE, profile));
        childrenList.add(new Property("aggregation", "code", "If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle.", 0, java.lang.Integer.MAX_VALUE, aggregation));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeType
            this.code = castToCode(value);
        else if (name.equals("profile"))
            this.getProfile().add(castToUri(value));
        else if (name.equals("aggregation"))
            this.getAggregation().add(new AggregationModeEnumFactory().fromType(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.code");
        } else if (name.equals("profile")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.profile");
        } else if (name.equals("aggregation")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.aggregation");
        } else
            return super.addChild(name);
    }

    public TypeRefComponent copy() {
        TypeRefComponent dst = new TypeRefComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        if (profile != null) {
            dst.profile = new ArrayList<UriType>();
            for (UriType i : profile) dst.profile.add(i.copy());
        }
        ;
        if (aggregation != null) {
            dst.aggregation = new ArrayList<Enumeration<AggregationMode>>();
            for (Enumeration<AggregationMode> i : aggregation) dst.aggregation.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TypeRefComponent))
            return false;
        TypeRefComponent o = (TypeRefComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(profile, o.profile, true) && compareDeep(aggregation, o.aggregation, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TypeRefComponent))
            return false;
        TypeRefComponent o = (TypeRefComponent) other;
        return compareValues(code, o.code, true) && compareValues(profile, o.profile, true) && compareValues(aggregation, o.aggregation, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (profile == null || profile.isEmpty()) && (aggregation == null || aggregation.isEmpty());
    }

    public String fhirType() {
        return "ElementDefinition.type";
    }

    public boolean hasTarget() {
        return Utilities.existsInList(getCode(), "Reference");
    }
}
