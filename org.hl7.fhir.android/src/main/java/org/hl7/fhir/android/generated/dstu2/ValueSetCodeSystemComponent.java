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

public class ValueSetCodeSystemComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system.
     */
    protected UriType system;

    /**
     * The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked.
     */
    protected StringType version;

    /**
     * If code comparison is case sensitive when codes within this system are compared to each other.
     */
    protected BooleanType caseSensitive;

    /**
     * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are.
     */
    protected List<ConceptDefinitionComponent> concept;

    private static final long serialVersionUID = -1109401192L;

    /*
     * Constructor
     */
    public ValueSetCodeSystemComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ValueSetCodeSystemComponent(UriType system) {
        super();
        this.system = system;
    }

    /**
     * @return {@link #system} (An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public UriType getSystemElement() {
        if (this.system == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetCodeSystemComponent.system");
            else if (Configuration.doAutoCreate())
                // bb
                this.system = new UriType();
        return this.system;
    }

    public boolean hasSystemElement() {
        return this.system != null && !this.system.isEmpty();
    }

    public boolean hasSystem() {
        return this.system != null && !this.system.isEmpty();
    }

    /**
     * @param value {@link #system} (An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public ValueSetCodeSystemComponent setSystemElement(UriType value) {
        this.system = value;
        return this;
    }

    /**
     * @return An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system.
     */
    public String getSystem() {
        return this.system == null ? null : this.system.getValue();
    }

    /**
     * @param value An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system.
     */
    public ValueSetCodeSystemComponent setSystem(String value) {
        if (this.system == null)
            this.system = new UriType();
        this.system.setValue(value);
        return this;
    }

    /**
     * @return {@link #version} (The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetCodeSystemComponent.version");
            else if (Configuration.doAutoCreate())
                // bb
                this.version = new StringType();
        return this.version;
    }

    public boolean hasVersionElement() {
        return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() {
        return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public ValueSetCodeSystemComponent setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked.
     */
    public ValueSetCodeSystemComponent setVersion(String value) {
        if (Utilities.noString(value))
            this.version = null;
        else {
            if (this.version == null)
                this.version = new StringType();
            this.version.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #caseSensitive} (If code comparison is case sensitive when codes within this system are compared to each other.). This is the underlying object with id, value and extensions. The accessor "getCaseSensitive" gives direct access to the value
     */
    public BooleanType getCaseSensitiveElement() {
        if (this.caseSensitive == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValueSetCodeSystemComponent.caseSensitive");
            else if (Configuration.doAutoCreate())
                // bb
                this.caseSensitive = new BooleanType();
        return this.caseSensitive;
    }

    public boolean hasCaseSensitiveElement() {
        return this.caseSensitive != null && !this.caseSensitive.isEmpty();
    }

    public boolean hasCaseSensitive() {
        return this.caseSensitive != null && !this.caseSensitive.isEmpty();
    }

    /**
     * @param value {@link #caseSensitive} (If code comparison is case sensitive when codes within this system are compared to each other.). This is the underlying object with id, value and extensions. The accessor "getCaseSensitive" gives direct access to the value
     */
    public ValueSetCodeSystemComponent setCaseSensitiveElement(BooleanType value) {
        this.caseSensitive = value;
        return this;
    }

    /**
     * @return If code comparison is case sensitive when codes within this system are compared to each other.
     */
    public boolean getCaseSensitive() {
        return this.caseSensitive == null || this.caseSensitive.isEmpty() ? false : this.caseSensitive.getValue();
    }

    /**
     * @param value If code comparison is case sensitive when codes within this system are compared to each other.
     */
    public ValueSetCodeSystemComponent setCaseSensitive(boolean value) {
        if (this.caseSensitive == null)
            this.caseSensitive = new BooleanType();
        this.caseSensitive.setValue(value);
        return this;
    }

    /**
     * @return {@link #concept} (Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are.)
     */
    public List<ConceptDefinitionComponent> getConcept() {
        if (this.concept == null)
            this.concept = new ArrayList<ConceptDefinitionComponent>();
        return this.concept;
    }

    public boolean hasConcept() {
        if (this.concept == null)
            return false;
        for (ConceptDefinitionComponent item : this.concept) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConceptDefinitionComponent addConcept() {
        // 3
        ConceptDefinitionComponent t = new ConceptDefinitionComponent();
        if (this.concept == null)
            this.concept = new ArrayList<ConceptDefinitionComponent>();
        this.concept.add(t);
        return t;
    }

    // syntactic sugar
    public ValueSetCodeSystemComponent addConcept(ConceptDefinitionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.concept == null)
            this.concept = new ArrayList<ConceptDefinitionComponent>();
        this.concept.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("system", "uri", "An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system.", 0, java.lang.Integer.MAX_VALUE, system));
        childrenList.add(new Property("version", "string", "The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("caseSensitive", "boolean", "If code comparison is case sensitive when codes within this system are compared to each other.", 0, java.lang.Integer.MAX_VALUE, caseSensitive));
        childrenList.add(new Property("concept", "", "Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are.", 0, java.lang.Integer.MAX_VALUE, concept));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("system"))
            // UriType
            this.system = castToUri(value);
        else if (name.equals("version"))
            // StringType
            this.version = castToString(value);
        else if (name.equals("caseSensitive"))
            // BooleanType
            this.caseSensitive = castToBoolean(value);
        else if (name.equals("concept"))
            this.getConcept().add((ConceptDefinitionComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("system")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.system");
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.version");
        } else if (name.equals("caseSensitive")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.caseSensitive");
        } else if (name.equals("concept")) {
            return addConcept();
        } else
            return super.addChild(name);
    }

    public ValueSetCodeSystemComponent copy() {
        ValueSetCodeSystemComponent dst = new ValueSetCodeSystemComponent();
        copyValues(dst);
        dst.system = system == null ? null : system.copy();
        dst.version = version == null ? null : version.copy();
        dst.caseSensitive = caseSensitive == null ? null : caseSensitive.copy();
        if (concept != null) {
            dst.concept = new ArrayList<ConceptDefinitionComponent>();
            for (ConceptDefinitionComponent i : concept) dst.concept.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ValueSetCodeSystemComponent))
            return false;
        ValueSetCodeSystemComponent o = (ValueSetCodeSystemComponent) other;
        return compareDeep(system, o.system, true) && compareDeep(version, o.version, true) && compareDeep(caseSensitive, o.caseSensitive, true) && compareDeep(concept, o.concept, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ValueSetCodeSystemComponent))
            return false;
        ValueSetCodeSystemComponent o = (ValueSetCodeSystemComponent) other;
        return compareValues(system, o.system, true) && compareValues(version, o.version, true) && compareValues(caseSensitive, o.caseSensitive, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (system == null || system.isEmpty()) && (version == null || version.isEmpty()) && (caseSensitive == null || caseSensitive.isEmpty()) && (concept == null || concept.isEmpty());
    }

    public String fhirType() {
        return "ValueSet.codeSystem";
    }
}
