package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.BindingStrength;
import org.hl7.fhir.dstu2.model.Enumerations.BindingStrengthEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverity;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentation;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentationEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationMode;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRules;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRulesEnumFactory;

public class ElementDefinitionBindingComponent extends Element implements IBaseDatatypeElement {

    /**
     * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
     */
    protected Enumeration<BindingStrength> strength;

    /**
     * Describes the intended use of this particular set of codes.
     */
    protected StringType description;

    /**
     * Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.
     */
    protected Type valueSet;

    private static final long serialVersionUID = 1355538460L;

    /*
     * Constructor
     */
    public ElementDefinitionBindingComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ElementDefinitionBindingComponent(Enumeration<BindingStrength> strength) {
        super();
        this.strength = strength;
    }

    /**
     * @return {@link #strength} (Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.). This is the underlying object with id, value and extensions. The accessor "getStrength" gives direct access to the value
     */
    public Enumeration<BindingStrength> getStrengthElement() {
        if (this.strength == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionBindingComponent.strength");
            else if (Configuration.doAutoCreate())
                // bb
                this.strength = new Enumeration<BindingStrength>(new BindingStrengthEnumFactory());
        return this.strength;
    }

    public boolean hasStrengthElement() {
        return this.strength != null && !this.strength.isEmpty();
    }

    public boolean hasStrength() {
        return this.strength != null && !this.strength.isEmpty();
    }

    /**
     * @param value {@link #strength} (Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.). This is the underlying object with id, value and extensions. The accessor "getStrength" gives direct access to the value
     */
    public ElementDefinitionBindingComponent setStrengthElement(Enumeration<BindingStrength> value) {
        this.strength = value;
        return this;
    }

    /**
     * @return Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
     */
    public BindingStrength getStrength() {
        return this.strength == null ? null : this.strength.getValue();
    }

    /**
     * @param value Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
     */
    public ElementDefinitionBindingComponent setStrength(BindingStrength value) {
        if (this.strength == null)
            this.strength = new Enumeration<BindingStrength>(new BindingStrengthEnumFactory());
        this.strength.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (Describes the intended use of this particular set of codes.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionBindingComponent.description");
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
     * @param value {@link #description} (Describes the intended use of this particular set of codes.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ElementDefinitionBindingComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Describes the intended use of this particular set of codes.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Describes the intended use of this particular set of codes.
     */
    public ElementDefinitionBindingComponent setDescription(String value) {
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
     * @return {@link #valueSet} (Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.)
     */
    public Type getValueSet() {
        return this.valueSet;
    }

    /**
     * @return {@link #valueSet} (Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.)
     */
    public UriType getValueSetUriType() throws FHIRException {
        if (!(this.valueSet instanceof UriType))
            throw new FHIRException("Type mismatch: the type UriType was expected, but " + this.valueSet.getClass().getName() + " was encountered");
        return (UriType) this.valueSet;
    }

    public boolean hasValueSetUriType() {
        return this.valueSet instanceof UriType;
    }

    /**
     * @return {@link #valueSet} (Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.)
     */
    public Reference getValueSetReference() throws FHIRException {
        if (!(this.valueSet instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.valueSet.getClass().getName() + " was encountered");
        return (Reference) this.valueSet;
    }

    public boolean hasValueSetReference() {
        return this.valueSet instanceof Reference;
    }

    public boolean hasValueSet() {
        return this.valueSet != null && !this.valueSet.isEmpty();
    }

    /**
     * @param value {@link #valueSet} (Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.)
     */
    public ElementDefinitionBindingComponent setValueSet(Type value) {
        this.valueSet = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("strength", "code", "Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.", 0, java.lang.Integer.MAX_VALUE, strength));
        childrenList.add(new Property("description", "string", "Describes the intended use of this particular set of codes.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("valueSet[x]", "uri|Reference(ValueSet)", "Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.", 0, java.lang.Integer.MAX_VALUE, valueSet));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("strength"))
            // Enumeration<BindingStrength>
            this.strength = new BindingStrengthEnumFactory().fromType(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("valueSet[x]"))
            // Type
            this.valueSet = (Type) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("strength")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.strength");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.description");
        } else if (name.equals("valueSetUri")) {
            this.valueSet = new UriType();
            return this.valueSet;
        } else if (name.equals("valueSetReference")) {
            this.valueSet = new Reference();
            return this.valueSet;
        } else
            return super.addChild(name);
    }

    public ElementDefinitionBindingComponent copy() {
        ElementDefinitionBindingComponent dst = new ElementDefinitionBindingComponent();
        copyValues(dst);
        dst.strength = strength == null ? null : strength.copy();
        dst.description = description == null ? null : description.copy();
        dst.valueSet = valueSet == null ? null : valueSet.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ElementDefinitionBindingComponent))
            return false;
        ElementDefinitionBindingComponent o = (ElementDefinitionBindingComponent) other;
        return compareDeep(strength, o.strength, true) && compareDeep(description, o.description, true) && compareDeep(valueSet, o.valueSet, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ElementDefinitionBindingComponent))
            return false;
        ElementDefinitionBindingComponent o = (ElementDefinitionBindingComponent) other;
        return compareValues(strength, o.strength, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (strength == null || strength.isEmpty()) && (description == null || description.isEmpty()) && (valueSet == null || valueSet.isEmpty());
    }

    public String fhirType() {
        return "ElementDefinition.binding";
    }
}
