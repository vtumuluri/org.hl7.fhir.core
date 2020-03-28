package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperator;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperatorEnumFactory;

public class ConceptSetFilterComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A code that identifies a property defined in the code system.
     */
    protected CodeType property;

    /**
     * The kind of operation to perform as a part of the filter criteria.
     */
    protected Enumeration<FilterOperator> op;

    /**
     * The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value.
     */
    protected CodeType value;

    private static final long serialVersionUID = 1985515000L;

    /*
     * Constructor
     */
    public ConceptSetFilterComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConceptSetFilterComponent(CodeType property, Enumeration<FilterOperator> op, CodeType value) {
        super();
        this.property = property;
        this.op = op;
        this.value = value;
    }

    /**
     * @return {@link #property} (A code that identifies a property defined in the code system.). This is the underlying object with id, value and extensions. The accessor "getProperty" gives direct access to the value
     */
    public CodeType getPropertyElement() {
        if (this.property == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptSetFilterComponent.property");
            else if (Configuration.doAutoCreate())
                // bb
                this.property = new CodeType();
        return this.property;
    }

    public boolean hasPropertyElement() {
        return this.property != null && !this.property.isEmpty();
    }

    public boolean hasProperty() {
        return this.property != null && !this.property.isEmpty();
    }

    /**
     * @param value {@link #property} (A code that identifies a property defined in the code system.). This is the underlying object with id, value and extensions. The accessor "getProperty" gives direct access to the value
     */
    public ConceptSetFilterComponent setPropertyElement(CodeType value) {
        this.property = value;
        return this;
    }

    /**
     * @return A code that identifies a property defined in the code system.
     */
    public String getProperty() {
        return this.property == null ? null : this.property.getValue();
    }

    /**
     * @param value A code that identifies a property defined in the code system.
     */
    public ConceptSetFilterComponent setProperty(String value) {
        if (this.property == null)
            this.property = new CodeType();
        this.property.setValue(value);
        return this;
    }

    /**
     * @return {@link #op} (The kind of operation to perform as a part of the filter criteria.). This is the underlying object with id, value and extensions. The accessor "getOp" gives direct access to the value
     */
    public Enumeration<FilterOperator> getOpElement() {
        if (this.op == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptSetFilterComponent.op");
            else if (Configuration.doAutoCreate())
                // bb
                this.op = new Enumeration<FilterOperator>(new FilterOperatorEnumFactory());
        return this.op;
    }

    public boolean hasOpElement() {
        return this.op != null && !this.op.isEmpty();
    }

    public boolean hasOp() {
        return this.op != null && !this.op.isEmpty();
    }

    /**
     * @param value {@link #op} (The kind of operation to perform as a part of the filter criteria.). This is the underlying object with id, value and extensions. The accessor "getOp" gives direct access to the value
     */
    public ConceptSetFilterComponent setOpElement(Enumeration<FilterOperator> value) {
        this.op = value;
        return this;
    }

    /**
     * @return The kind of operation to perform as a part of the filter criteria.
     */
    public FilterOperator getOp() {
        return this.op == null ? null : this.op.getValue();
    }

    /**
     * @param value The kind of operation to perform as a part of the filter criteria.
     */
    public ConceptSetFilterComponent setOp(FilterOperator value) {
        if (this.op == null)
            this.op = new Enumeration<FilterOperator>(new FilterOperatorEnumFactory());
        this.op.setValue(value);
        return this;
    }

    /**
     * @return {@link #value} (The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public CodeType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptSetFilterComponent.value");
            else if (Configuration.doAutoCreate())
                // bb
                this.value = new CodeType();
        return this.value;
    }

    public boolean hasValueElement() {
        return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public ConceptSetFilterComponent setValueElement(CodeType value) {
        this.value = value;
        return this;
    }

    /**
     * @return The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value.
     */
    public String getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value.
     */
    public ConceptSetFilterComponent setValue(String value) {
        if (this.value == null)
            this.value = new CodeType();
        this.value.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("property", "code", "A code that identifies a property defined in the code system.", 0, java.lang.Integer.MAX_VALUE, property));
        childrenList.add(new Property("op", "code", "The kind of operation to perform as a part of the filter criteria.", 0, java.lang.Integer.MAX_VALUE, op));
        childrenList.add(new Property("value", "code", "The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value.", 0, java.lang.Integer.MAX_VALUE, value));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("property"))
            // CodeType
            this.property = castToCode(value);
        else if (name.equals("op"))
            // Enumeration<FilterOperator>
            this.op = new FilterOperatorEnumFactory().fromType(value);
        else if (name.equals("value"))
            // CodeType
            this.value = castToCode(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("property")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.property");
        } else if (name.equals("op")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.op");
        } else if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.value");
        } else
            return super.addChild(name);
    }

    public ConceptSetFilterComponent copy() {
        ConceptSetFilterComponent dst = new ConceptSetFilterComponent();
        copyValues(dst);
        dst.property = property == null ? null : property.copy();
        dst.op = op == null ? null : op.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConceptSetFilterComponent))
            return false;
        ConceptSetFilterComponent o = (ConceptSetFilterComponent) other;
        return compareDeep(property, o.property, true) && compareDeep(op, o.op, true) && compareDeep(value, o.value, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConceptSetFilterComponent))
            return false;
        ConceptSetFilterComponent o = (ConceptSetFilterComponent) other;
        return compareValues(property, o.property, true) && compareValues(op, o.op, true) && compareValues(value, o.value, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (property == null || property.isEmpty()) && (op == null || op.isEmpty()) && (value == null || value.isEmpty());
    }

    public String fhirType() {
        return "ValueSet.compose.include.filter";
    }
}
