package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrength;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrengthEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.ConstraintSeverity;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentationEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.PropertyRepresentation;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.AggregationMode;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRulesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ElementDefinitionEnum.SlicingRules;

public class ElementDefinitionSlicingComponent extends Element implements IBaseDatatypeElement {

    /**
     * Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.
     */
    protected List<StringType> discriminator;

    /**
     * A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated.
     */
    protected StringType description;

    /**
     * If the matching elements have to occur in the same order as defined in the profile.
     */
    protected BooleanType ordered;

    /**
     * Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end.
     */
    protected Enumeration<SlicingRules> rules;

    private static final long serialVersionUID = 233544215L;

    /*
     * Constructor
     */
    public ElementDefinitionSlicingComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ElementDefinitionSlicingComponent(Enumeration<SlicingRules> rules) {
        super();
        this.rules = rules;
    }

    /**
     * @return {@link #discriminator} (Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.)
     */
    public List<StringType> getDiscriminator() {
        if (this.discriminator == null)
            this.discriminator = new ArrayList<StringType>();
        return this.discriminator;
    }

    public boolean hasDiscriminator() {
        if (this.discriminator == null)
            return false;
        for (StringType item : this.discriminator) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public StringType addDiscriminatorElement() {
        // 2
        StringType t = new StringType();
        if (this.discriminator == null)
            this.discriminator = new ArrayList<StringType>();
        this.discriminator.add(t);
        return t;
    }

    /**
     * @param value {@link #discriminator} (Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.)
     */
    public ElementDefinitionSlicingComponent addDiscriminator(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.discriminator == null)
            this.discriminator = new ArrayList<StringType>();
        this.discriminator.add(t);
        return this;
    }

    /**
     * @param value {@link #discriminator} (Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.)
     */
    public boolean hasDiscriminator(String value) {
        if (this.discriminator == null)
            return false;
        for (StringType v : this.discriminator) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #description} (A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionSlicingComponent.description");
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
     * @param value {@link #description} (A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ElementDefinitionSlicingComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated.
     */
    public ElementDefinitionSlicingComponent setDescription(String value) {
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
     * @return {@link #ordered} (If the matching elements have to occur in the same order as defined in the profile.). This is the underlying object with id, value and extensions. The accessor "getOrdered" gives direct access to the value
     */
    public BooleanType getOrderedElement() {
        if (this.ordered == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionSlicingComponent.ordered");
            else if (Configuration.doAutoCreate())
                // bb
                this.ordered = new BooleanType();
        return this.ordered;
    }

    public boolean hasOrderedElement() {
        return this.ordered != null && !this.ordered.isEmpty();
    }

    public boolean hasOrdered() {
        return this.ordered != null && !this.ordered.isEmpty();
    }

    /**
     * @param value {@link #ordered} (If the matching elements have to occur in the same order as defined in the profile.). This is the underlying object with id, value and extensions. The accessor "getOrdered" gives direct access to the value
     */
    public ElementDefinitionSlicingComponent setOrderedElement(BooleanType value) {
        this.ordered = value;
        return this;
    }

    /**
     * @return If the matching elements have to occur in the same order as defined in the profile.
     */
    public boolean getOrdered() {
        return this.ordered == null || this.ordered.isEmpty() ? false : this.ordered.getValue();
    }

    /**
     * @param value If the matching elements have to occur in the same order as defined in the profile.
     */
    public ElementDefinitionSlicingComponent setOrdered(boolean value) {
        if (this.ordered == null)
            this.ordered = new BooleanType();
        this.ordered.setValue(value);
        return this;
    }

    /**
     * @return {@link #rules} (Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end.). This is the underlying object with id, value and extensions. The accessor "getRules" gives direct access to the value
     */
    public Enumeration<SlicingRules> getRulesElement() {
        if (this.rules == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ElementDefinitionSlicingComponent.rules");
            else if (Configuration.doAutoCreate())
                // bb
                this.rules = new Enumeration<SlicingRules>(new SlicingRulesEnumFactory());
        return this.rules;
    }

    public boolean hasRulesElement() {
        return this.rules != null && !this.rules.isEmpty();
    }

    public boolean hasRules() {
        return this.rules != null && !this.rules.isEmpty();
    }

    /**
     * @param value {@link #rules} (Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end.). This is the underlying object with id, value and extensions. The accessor "getRules" gives direct access to the value
     */
    public ElementDefinitionSlicingComponent setRulesElement(Enumeration<SlicingRules> value) {
        this.rules = value;
        return this;
    }

    /**
     * @return Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end.
     */
    public SlicingRules getRules() {
        return this.rules == null ? null : this.rules.getValue();
    }

    /**
     * @param value Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end.
     */
    public ElementDefinitionSlicingComponent setRules(SlicingRules value) {
        if (this.rules == null)
            this.rules = new Enumeration<SlicingRules>(new SlicingRulesEnumFactory());
        this.rules.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("discriminator", "string", "Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.", 0, java.lang.Integer.MAX_VALUE, discriminator));
        childrenList.add(new Property("description", "string", "A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("ordered", "boolean", "If the matching elements have to occur in the same order as defined in the profile.", 0, java.lang.Integer.MAX_VALUE, ordered));
        childrenList.add(new Property("rules", "code", "Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end.", 0, java.lang.Integer.MAX_VALUE, rules));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("discriminator"))
            this.getDiscriminator().add(castToString(value));
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("ordered"))
            // BooleanType
            this.ordered = castToBoolean(value);
        else if (name.equals("rules"))
            // Enumeration<SlicingRules>
            this.rules = new SlicingRulesEnumFactory().fromType(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("discriminator")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.discriminator");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.description");
        } else if (name.equals("ordered")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.ordered");
        } else if (name.equals("rules")) {
            throw new FHIRException("Cannot call addChild on a primitive type ElementDefinition.rules");
        } else
            return super.addChild(name);
    }

    public ElementDefinitionSlicingComponent copy() {
        ElementDefinitionSlicingComponent dst = new ElementDefinitionSlicingComponent();
        copyValues(dst);
        if (discriminator != null) {
            dst.discriminator = new ArrayList<StringType>();
            for (StringType i : discriminator) dst.discriminator.add(i.copy());
        }
        ;
        dst.description = description == null ? null : description.copy();
        dst.ordered = ordered == null ? null : ordered.copy();
        dst.rules = rules == null ? null : rules.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ElementDefinitionSlicingComponent))
            return false;
        ElementDefinitionSlicingComponent o = (ElementDefinitionSlicingComponent) other;
        return compareDeep(discriminator, o.discriminator, true) && compareDeep(description, o.description, true) && compareDeep(ordered, o.ordered, true) && compareDeep(rules, o.rules, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ElementDefinitionSlicingComponent))
            return false;
        ElementDefinitionSlicingComponent o = (ElementDefinitionSlicingComponent) other;
        return compareValues(discriminator, o.discriminator, true) && compareValues(description, o.description, true) && compareValues(ordered, o.ordered, true) && compareValues(rules, o.rules, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (discriminator == null || discriminator.isEmpty()) && (description == null || description.isEmpty()) && (ordered == null || ordered.isEmpty()) && (rules == null || rules.isEmpty());
    }

    public String fhirType() {
        return "ElementDefinition.slicing";
    }
}
