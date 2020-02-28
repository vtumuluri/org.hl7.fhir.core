package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.BindingStrength;
import org.hl7.fhir.dstu2.model.Enumerations.BindingStrengthEnumFactory;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationParameterUse;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationParameterUseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationKind;
import org.hl7.fhir.android.generated.dstu2.OperationDefinitionEnum.OperationKindEnumFactory;

public class OperationDefinitionParameterBindingComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
     */
    protected Enumeration<BindingStrength> strength;

    /**
     * Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.
     */
    protected Type valueSet;

    private static final long serialVersionUID = 857140521L;

    /*
     * Constructor
     */
    public OperationDefinitionParameterBindingComponent() {
        super();
    }

    /*
     * Constructor
     */
    public OperationDefinitionParameterBindingComponent(Enumeration<BindingStrength> strength, Type valueSet) {
        super();
        this.strength = strength;
        this.valueSet = valueSet;
    }

    /**
     * @return {@link #strength} (Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.). This is the underlying object with id, value and extensions. The accessor "getStrength" gives direct access to the value
     */
    public Enumeration<BindingStrength> getStrengthElement() {
        if (this.strength == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create OperationDefinitionParameterBindingComponent.strength");
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
    public OperationDefinitionParameterBindingComponent setStrengthElement(Enumeration<BindingStrength> value) {
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
    public OperationDefinitionParameterBindingComponent setStrength(BindingStrength value) {
        if (this.strength == null)
            this.strength = new Enumeration<BindingStrength>(new BindingStrengthEnumFactory());
        this.strength.setValue(value);
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
    public OperationDefinitionParameterBindingComponent setValueSet(Type value) {
        this.valueSet = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("strength", "code", "Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.", 0, java.lang.Integer.MAX_VALUE, strength));
        childrenList.add(new Property("valueSet[x]", "uri|Reference(ValueSet)", "Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.", 0, java.lang.Integer.MAX_VALUE, valueSet));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("strength"))
            // Enumeration<BindingStrength>
            this.strength = new BindingStrengthEnumFactory().fromType(value);
        else if (name.equals("valueSet[x]"))
            // Type
            this.valueSet = (Type) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("strength")) {
            throw new FHIRException("Cannot call addChild on a primitive type OperationDefinition.strength");
        } else if (name.equals("valueSetUri")) {
            this.valueSet = new UriType();
            return this.valueSet;
        } else if (name.equals("valueSetReference")) {
            this.valueSet = new Reference();
            return this.valueSet;
        } else
            return super.addChild(name);
    }

    public OperationDefinitionParameterBindingComponent copy() {
        OperationDefinitionParameterBindingComponent dst = new OperationDefinitionParameterBindingComponent();
        copyValues(dst);
        dst.strength = strength == null ? null : strength.copy();
        dst.valueSet = valueSet == null ? null : valueSet.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof OperationDefinitionParameterBindingComponent))
            return false;
        OperationDefinitionParameterBindingComponent o = (OperationDefinitionParameterBindingComponent) other;
        return compareDeep(strength, o.strength, true) && compareDeep(valueSet, o.valueSet, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof OperationDefinitionParameterBindingComponent))
            return false;
        OperationDefinitionParameterBindingComponent o = (OperationDefinitionParameterBindingComponent) other;
        return compareValues(strength, o.strength, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (strength == null || strength.isEmpty()) && (valueSet == null || valueSet.isEmpty());
    }

    public String fhirType() {
        return "OperationDefinition.parameter.binding";
    }
}
