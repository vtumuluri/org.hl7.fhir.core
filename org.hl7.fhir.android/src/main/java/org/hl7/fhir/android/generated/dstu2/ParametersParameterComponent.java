package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseParameters;
import org.hl7.fhir.exceptions.FHIRException;

public class ParametersParameterComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The name of the parameter (reference to the operation definition).
     */
    protected StringType name;

    /**
     * If the parameter is a data type.
     */
    protected org.hl7.fhir.dstu2.model.Type value;

    /**
     * If the parameter is a whole resource.
     */
    protected Resource resource;

    /**
     * A named part of a parameter. In many implementation context, a set of named parts is known as a "Tuple".
     */
    protected List<ParametersParameterComponent> part;

    private static final long serialVersionUID = -198518915L;

    /*
     * Constructor
     */
    public ParametersParameterComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ParametersParameterComponent(StringType name) {
        super();
        this.name = name;
    }

    /**
     * @return {@link #name} (The name of the parameter (reference to the operation definition).). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ParametersParameterComponent.name");
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
     * @param value {@link #name} (The name of the parameter (reference to the operation definition).). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ParametersParameterComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return The name of the parameter (reference to the operation definition).
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The name of the parameter (reference to the operation definition).
     */
    public ParametersParameterComponent setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #value} (If the parameter is a data type.)
     */
    public org.hl7.fhir.dstu2.model.Type getValue() {
        return this.value;
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (If the parameter is a data type.)
     */
    public ParametersParameterComponent setValue(org.hl7.fhir.dstu2.model.Type value) {
        this.value = value;
        return this;
    }

    /**
     * @return {@link #resource} (If the parameter is a whole resource.)
     */
    public Resource getResource() {
        return this.resource;
    }

    public boolean hasResource() {
        return this.resource != null && !this.resource.isEmpty();
    }

    /**
     * @param value {@link #resource} (If the parameter is a whole resource.)
     */
    public ParametersParameterComponent setResource(Resource value) {
        this.resource = value;
        return this;
    }

    /**
     * @return {@link #part} (A named part of a parameter. In many implementation context, a set of named parts is known as a "Tuple".)
     */
    public List<ParametersParameterComponent> getPart() {
        if (this.part == null)
            this.part = new ArrayList<ParametersParameterComponent>();
        return this.part;
    }

    public boolean hasPart() {
        if (this.part == null)
            return false;
        for (ParametersParameterComponent item : this.part) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ParametersParameterComponent addPart() {
        // 3
        ParametersParameterComponent t = new ParametersParameterComponent();
        if (this.part == null)
            this.part = new ArrayList<ParametersParameterComponent>();
        this.part.add(t);
        return t;
    }

    // syntactic sugar
    public ParametersParameterComponent addPart(ParametersParameterComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.part == null)
            this.part = new ArrayList<ParametersParameterComponent>();
        this.part.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "The name of the parameter (reference to the operation definition).", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("value[x]", "*", "If the parameter is a data type.", 0, java.lang.Integer.MAX_VALUE, value));
        childrenList.add(new Property("resource", "Resource", "If the parameter is a whole resource.", 0, java.lang.Integer.MAX_VALUE, resource));
        childrenList.add(new Property("part", "@Parameters.parameter", "A named part of a parameter. In many implementation context, a set of named parts is known as a \"Tuple\".", 0, java.lang.Integer.MAX_VALUE, part));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("value[x]"))
            // org.hl7.fhir.dstu2.model.Type
            this.value = (org.hl7.fhir.dstu2.model.Type) value;
        else if (name.equals("resource"))
            // Resource
            this.resource = castToResource(value);
        else if (name.equals("part"))
            this.getPart().add((ParametersParameterComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type Parameters.name");
        } else if (name.equals("valueBoolean")) {
            this.value = new BooleanType();
            return this.value;
        } else if (name.equals("valueInteger")) {
            this.value = new IntegerType();
            return this.value;
        } else if (name.equals("valueDecimal")) {
            this.value = new DecimalType();
            return this.value;
        } else if (name.equals("valueBase64Binary")) {
            this.value = new Base64BinaryType();
            return this.value;
        } else if (name.equals("valueInstant")) {
            this.value = new InstantType();
            return this.value;
        } else if (name.equals("valueString")) {
            this.value = new StringType();
            return this.value;
        } else if (name.equals("valueUri")) {
            this.value = new UriType();
            return this.value;
        } else if (name.equals("valueDate")) {
            this.value = new DateType();
            return this.value;
        } else if (name.equals("valueDateTime")) {
            this.value = new DateTimeType();
            return this.value;
        } else if (name.equals("valueTime")) {
            this.value = new TimeType();
            return this.value;
        } else if (name.equals("valueCode")) {
            this.value = new CodeType();
            return this.value;
        } else if (name.equals("valueOid")) {
            this.value = new OidType();
            return this.value;
        } else if (name.equals("valueId")) {
            this.value = new IdType();
            return this.value;
        } else if (name.equals("valueUnsignedInt")) {
            this.value = new UnsignedIntType();
            return this.value;
        } else if (name.equals("valuePositiveInt")) {
            this.value = new PositiveIntType();
            return this.value;
        } else if (name.equals("valueMarkdown")) {
            this.value = new MarkdownType();
            return this.value;
        } else if (name.equals("valueAnnotation")) {
            this.value = new Annotation();
            return this.value;
        } else if (name.equals("valueAttachment")) {
            this.value = new Attachment();
            return this.value;
        } else if (name.equals("valueIdentifier")) {
            this.value = new Identifier();
            return this.value;
        } else if (name.equals("valueCodeableConcept")) {
            this.value = new CodeableConcept();
            return this.value;
        } else if (name.equals("valueCoding")) {
            this.value = new Coding();
            return this.value;
        } else if (name.equals("valueQuantity")) {
            this.value = new Quantity();
            return this.value;
        } else if (name.equals("valueRange")) {
            this.value = new Range();
            return this.value;
        } else if (name.equals("valuePeriod")) {
            this.value = new Period();
            return this.value;
        } else if (name.equals("valueRatio")) {
            this.value = new Ratio();
            return this.value;
        } else if (name.equals("valueSampledData")) {
            this.value = new SampledData();
            return this.value;
        } else if (name.equals("valueSignature")) {
            this.value = new Signature();
            return this.value;
        } else if (name.equals("valueHumanName")) {
            this.value = new HumanName();
            return this.value;
        } else if (name.equals("valueAddress")) {
            this.value = new Address();
            return this.value;
        } else if (name.equals("valueContactPoint")) {
            this.value = new ContactPoint();
            return this.value;
        } else if (name.equals("valueTiming")) {
            this.value = new Timing();
            return this.value;
        } else if (name.equals("valueReference")) {
            this.value = new Reference();
            return this.value;
        } else if (name.equals("valueMeta")) {
            this.value = new Meta();
            return this.value;
        } else if (name.equals("resource")) {
            throw new FHIRException("Cannot call addChild on an abstract type Parameters.resource");
        } else if (name.equals("part")) {
            return addPart();
        } else
            return super.addChild(name);
    }

    public ParametersParameterComponent copy() {
        ParametersParameterComponent dst = new ParametersParameterComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.value = value == null ? null : value.copy();
        dst.resource = resource == null ? null : resource.copy();
        if (part != null) {
            dst.part = new ArrayList<ParametersParameterComponent>();
            for (ParametersParameterComponent i : part) dst.part.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ParametersParameterComponent))
            return false;
        ParametersParameterComponent o = (ParametersParameterComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(value, o.value, true) && compareDeep(resource, o.resource, true) && compareDeep(part, o.part, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ParametersParameterComponent))
            return false;
        ParametersParameterComponent o = (ParametersParameterComponent) other;
        return compareValues(name, o.name, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (value == null || value.isEmpty()) && (resource == null || resource.isEmpty()) && (part == null || part.isEmpty());
    }

    public String fhirType() {
        return "null";
    }
}
