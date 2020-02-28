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

public class ElementDefinitionBaseComponent extends Element implements IBaseDatatypeElement {

    /**
     * The Path that identifies the base element - this matches the ElementDefinition.path for that element. Across FHIR, there is only one base definition of any element - that is, an element definition on a [[[StructureDefinition]]] without a StructureDefinition.base.
     */
    protected StringType path;

    /**
     * Minimum cardinality of the base element identified by the path.
     */
    protected IntegerType min;

    /**
     * Maximum cardinality of the base element identified by the path.
     */
    protected StringType max;

    private static final long serialVersionUID = 232204455L;

    /*
     * Constructor
     */
    public ElementDefinitionBaseComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ElementDefinitionBaseComponent(StringType path, IntegerType min, StringType max) {
        super();
        this.path = path;
        this.min = min;
        this.max = max;
    }

    /**
     * @return {@link #path} (The Path that identifies the base element - this matches the ElementDefinition.path for that element. Across FHIR, there is only one base definition of any element - that is, an element definition on a [[[StructureDefinition]]] without a StructureDefinition.base.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
     */
    public StringType getPathElement() {
        if (this.path == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionBaseComponent.path");
            else if (Configuration.doAutoCreate())
                // bb
                this.path = new StringType();
        return this.path;
    }

    public boolean hasPathElement() {
        return this.path != null && !this.path.isEmpty();
    }

    public boolean hasPath() {
        return this.path != null && !this.path.isEmpty();
    }

    /**
     * @param value {@link #path} (The Path that identifies the base element - this matches the ElementDefinition.path for that element. Across FHIR, there is only one base definition of any element - that is, an element definition on a [[[StructureDefinition]]] without a StructureDefinition.base.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
     */
    public ElementDefinitionBaseComponent setPathElement(StringType value) {
        this.path = value;
        return this;
    }

    /**
     * @return The Path that identifies the base element - this matches the ElementDefinition.path for that element. Across FHIR, there is only one base definition of any element - that is, an element definition on a [[[StructureDefinition]]] without a StructureDefinition.base.
     */
    public String getPath() {
        return this.path == null ? null : this.path.getValue();
    }

    /**
     * @param value The Path that identifies the base element - this matches the ElementDefinition.path for that element. Across FHIR, there is only one base definition of any element - that is, an element definition on a [[[StructureDefinition]]] without a StructureDefinition.base.
     */
    public ElementDefinitionBaseComponent setPath(String value) {
        if (this.path == null)
            this.path = new StringType();
        this.path.setValue(value);
        return this;
    }

    /**
     * @return {@link #min} (Minimum cardinality of the base element identified by the path.). This is the underlying object with id, value and extensions. The accessor "getMin" gives direct access to the value
     */
    public IntegerType getMinElement() {
        if (this.min == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionBaseComponent.min");
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
     * @param value {@link #min} (Minimum cardinality of the base element identified by the path.). This is the underlying object with id, value and extensions. The accessor "getMin" gives direct access to the value
     */
    public ElementDefinitionBaseComponent setMinElement(IntegerType value) {
        this.min = value;
        return this;
    }

    /**
     * @return Minimum cardinality of the base element identified by the path.
     */
    public int getMin() {
        return this.min == null || this.min.isEmpty() ? 0 : this.min.getValue();
    }

    /**
     * @param value Minimum cardinality of the base element identified by the path.
     */
    public ElementDefinitionBaseComponent setMin(int value) {
        if (this.min == null)
            this.min = new IntegerType();
        this.min.setValue(value);
        return this;
    }

    /**
     * @return {@link #max} (Maximum cardinality of the base element identified by the path.). This is the underlying object with id, value and extensions. The accessor "getMax" gives direct access to the value
     */
    public StringType getMaxElement() {
        if (this.max == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionBaseComponent.max");
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
     * @param value {@link #max} (Maximum cardinality of the base element identified by the path.). This is the underlying object with id, value and extensions. The accessor "getMax" gives direct access to the value
     */
    public ElementDefinitionBaseComponent setMaxElement(StringType value) {
        this.max = value;
        return this;
    }

    /**
     * @return Maximum cardinality of the base element identified by the path.
     */
    public String getMax() {
        return this.max == null ? null : this.max.getValue();
    }

    /**
     * @param value Maximum cardinality of the base element identified by the path.
     */
    public ElementDefinitionBaseComponent setMax(String value) {
        if (this.max == null)
            this.max = new StringType();
        this.max.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("path", "string", "The Path that identifies the base element - this matches the ElementDefinition.path for that element. Across FHIR, there is only one base definition of any element - that is, an element definition on a [[[StructureDefinition]]] without a StructureDefinition.base.", 0, java.lang.Integer.MAX_VALUE, path));
        childrenList.add(new Property("min", "integer", "Minimum cardinality of the base element identified by the path.", 0, java.lang.Integer.MAX_VALUE, min));
        childrenList.add(new Property("max", "string", "Maximum cardinality of the base element identified by the path.", 0, java.lang.Integer.MAX_VALUE, max));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("path"))
            // StringType
            this.path = castToString(value);
        else if (name.equals("min"))
            // IntegerType
            this.min = castToInteger(value);
        else if (name.equals("max"))
            // StringType
            this.max = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("path")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.path");
        } else if (name.equals("min")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.min");
        } else if (name.equals("max")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.max");
        } else
            return super.addChild(name);
    }

    public ElementDefinitionBaseComponent copy() {
        ElementDefinitionBaseComponent dst = new ElementDefinitionBaseComponent();
        copyValues(dst);
        dst.path = path == null ? null : path.copy();
        dst.min = min == null ? null : min.copy();
        dst.max = max == null ? null : max.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ElementDefinitionBaseComponent))
            return false;
        ElementDefinitionBaseComponent o = (ElementDefinitionBaseComponent) other;
        return compareDeep(path, o.path, true) && compareDeep(min, o.min, true) && compareDeep(max, o.max, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ElementDefinitionBaseComponent))
            return false;
        ElementDefinitionBaseComponent o = (ElementDefinitionBaseComponent) other;
        return compareValues(path, o.path, true) && compareValues(min, o.min, true) && compareValues(max, o.max, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (path == null || path.isEmpty()) && (min == null || min.isEmpty()) && (max == null || max.isEmpty());
    }

    public String fhirType() {
        return "ElementDefinition.base";
    }
}
