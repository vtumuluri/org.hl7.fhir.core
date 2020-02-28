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
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperator;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperatorEnumFactory;

public class ValueSetExpansionParameterComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The name of the parameter.
     */
    protected StringType name;

    /**
     * The value of the parameter.
     */
    protected Type value;

    private static final long serialVersionUID = 1172641169L;

    /*
     * Constructor
     */
    public ValueSetExpansionParameterComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ValueSetExpansionParameterComponent(StringType name) {
        super();
        this.name = name;
    }

    /**
     * @return {@link #name} (The name of the parameter.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetExpansionParameterComponent.name");
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
     * @param value {@link #name} (The name of the parameter.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ValueSetExpansionParameterComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return The name of the parameter.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The name of the parameter.
     */
    public ValueSetExpansionParameterComponent setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #value} (The value of the parameter.)
     */
    public Type getValue() {
        return this.value;
    }

    /**
     * @return {@link #value} (The value of the parameter.)
     */
    public StringType getValueStringType() throws FHIRException {
        if (!(this.value instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (StringType) this.value;
    }

    public boolean hasValueStringType() {
        return this.value instanceof StringType;
    }

    /**
     * @return {@link #value} (The value of the parameter.)
     */
    public BooleanType getValueBooleanType() throws FHIRException {
        if (!(this.value instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (BooleanType) this.value;
    }

    public boolean hasValueBooleanType() {
        return this.value instanceof BooleanType;
    }

    /**
     * @return {@link #value} (The value of the parameter.)
     */
    public IntegerType getValueIntegerType() throws FHIRException {
        if (!(this.value instanceof IntegerType))
            throw new FHIRException("Type mismatch: the type IntegerType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (IntegerType) this.value;
    }

    public boolean hasValueIntegerType() {
        return this.value instanceof IntegerType;
    }

    /**
     * @return {@link #value} (The value of the parameter.)
     */
    public DecimalType getValueDecimalType() throws FHIRException {
        if (!(this.value instanceof DecimalType))
            throw new FHIRException("Type mismatch: the type DecimalType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (DecimalType) this.value;
    }

    public boolean hasValueDecimalType() {
        return this.value instanceof DecimalType;
    }

    /**
     * @return {@link #value} (The value of the parameter.)
     */
    public UriType getValueUriType() throws FHIRException {
        if (!(this.value instanceof UriType))
            throw new FHIRException("Type mismatch: the type UriType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (UriType) this.value;
    }

    public boolean hasValueUriType() {
        return this.value instanceof UriType;
    }

    /**
     * @return {@link #value} (The value of the parameter.)
     */
    public CodeType getValueCodeType() throws FHIRException {
        if (!(this.value instanceof CodeType))
            throw new FHIRException("Type mismatch: the type CodeType was expected, but " + this.value.getClass().getName() + " was encountered");
        return (CodeType) this.value;
    }

    public boolean hasValueCodeType() {
        return this.value instanceof CodeType;
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The value of the parameter.)
     */
    public ValueSetExpansionParameterComponent setValue(Type value) {
        this.value = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "The name of the parameter.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("value[x]", "string|boolean|integer|decimal|uri|code", "The value of the parameter.", 0, java.lang.Integer.MAX_VALUE, value));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("value[x]"))
            // Type
            this.value = (Type) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.name");
        } else if (name.equals("valueString")) {
            this.value = new StringType();
            return this.value;
        } else if (name.equals("valueBoolean")) {
            this.value = new BooleanType();
            return this.value;
        } else if (name.equals("valueInteger")) {
            this.value = new IntegerType();
            return this.value;
        } else if (name.equals("valueDecimal")) {
            this.value = new DecimalType();
            return this.value;
        } else if (name.equals("valueUri")) {
            this.value = new UriType();
            return this.value;
        } else if (name.equals("valueCode")) {
            this.value = new CodeType();
            return this.value;
        } else
            return super.addChild(name);
    }

    public ValueSetExpansionParameterComponent copy() {
        ValueSetExpansionParameterComponent dst = new ValueSetExpansionParameterComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ValueSetExpansionParameterComponent))
            return false;
        ValueSetExpansionParameterComponent o = (ValueSetExpansionParameterComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(value, o.value, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ValueSetExpansionParameterComponent))
            return false;
        ValueSetExpansionParameterComponent o = (ValueSetExpansionParameterComponent) other;
        return compareValues(name, o.name, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (value == null || value.isEmpty());
    }

    public String fhirType() {
        return "ValueSet.expansion.parameter";
    }
}
