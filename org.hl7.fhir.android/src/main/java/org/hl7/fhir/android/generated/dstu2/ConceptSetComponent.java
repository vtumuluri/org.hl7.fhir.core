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

public class ConceptSetComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An absolute URI which is the code system from which the selected codes come from.
     */
    protected UriType system;

    /**
     * The version of the code system that the codes are selected from.
     */
    protected StringType version;

    /**
     * Specifies a concept to be included or excluded.
     */
    protected List<ConceptReferenceComponent> concept;

    /**
     * Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
     */
    protected List<ConceptSetFilterComponent> filter;

    private static final long serialVersionUID = -196054471L;

    /*
     * Constructor
     */
    public ConceptSetComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConceptSetComponent(UriType system) {
        super();
        this.system = system;
    }

    /**
     * @return {@link #system} (An absolute URI which is the code system from which the selected codes come from.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public UriType getSystemElement() {
        if (this.system == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptSetComponent.system");
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
     * @param value {@link #system} (An absolute URI which is the code system from which the selected codes come from.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public ConceptSetComponent setSystemElement(UriType value) {
        this.system = value;
        return this;
    }

    /**
     * @return An absolute URI which is the code system from which the selected codes come from.
     */
    public String getSystem() {
        return this.system == null ? null : this.system.getValue();
    }

    /**
     * @param value An absolute URI which is the code system from which the selected codes come from.
     */
    public ConceptSetComponent setSystem(String value) {
        if (this.system == null)
            this.system = new UriType();
        this.system.setValue(value);
        return this;
    }

    /**
     * @return {@link #version} (The version of the code system that the codes are selected from.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptSetComponent.version");
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
     * @param value {@link #version} (The version of the code system that the codes are selected from.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public ConceptSetComponent setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return The version of the code system that the codes are selected from.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The version of the code system that the codes are selected from.
     */
    public ConceptSetComponent setVersion(String value) {
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
     * @return {@link #concept} (Specifies a concept to be included or excluded.)
     */
    public List<ConceptReferenceComponent> getConcept() {
        if (this.concept == null)
            this.concept = new ArrayList<ConceptReferenceComponent>();
        return this.concept;
    }

    public boolean hasConcept() {
        if (this.concept == null)
            return false;
        for (ConceptReferenceComponent item : this.concept) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConceptReferenceComponent addConcept() {
        // 3
        ConceptReferenceComponent t = new ConceptReferenceComponent();
        if (this.concept == null)
            this.concept = new ArrayList<ConceptReferenceComponent>();
        this.concept.add(t);
        return t;
    }

    // syntactic sugar
    public ConceptSetComponent addConcept(ConceptReferenceComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.concept == null)
            this.concept = new ArrayList<ConceptReferenceComponent>();
        this.concept.add(t);
        return this;
    }

    /**
     * @return {@link #filter} (Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.)
     */
    public List<ConceptSetFilterComponent> getFilter() {
        if (this.filter == null)
            this.filter = new ArrayList<ConceptSetFilterComponent>();
        return this.filter;
    }

    public boolean hasFilter() {
        if (this.filter == null)
            return false;
        for (ConceptSetFilterComponent item : this.filter) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConceptSetFilterComponent addFilter() {
        // 3
        ConceptSetFilterComponent t = new ConceptSetFilterComponent();
        if (this.filter == null)
            this.filter = new ArrayList<ConceptSetFilterComponent>();
        this.filter.add(t);
        return t;
    }

    // syntactic sugar
    public ConceptSetComponent addFilter(ConceptSetFilterComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.filter == null)
            this.filter = new ArrayList<ConceptSetFilterComponent>();
        this.filter.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("system", "uri", "An absolute URI which is the code system from which the selected codes come from.", 0, java.lang.Integer.MAX_VALUE, system));
        childrenList.add(new Property("version", "string", "The version of the code system that the codes are selected from.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("concept", "", "Specifies a concept to be included or excluded.", 0, java.lang.Integer.MAX_VALUE, concept));
        childrenList.add(new Property("filter", "", "Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.", 0, java.lang.Integer.MAX_VALUE, filter));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("system"))
            // UriType
            this.system = castToUri(value);
        else if (name.equals("version"))
            // StringType
            this.version = castToString(value);
        else if (name.equals("concept"))
            this.getConcept().add((ConceptReferenceComponent) value);
        else if (name.equals("filter"))
            this.getFilter().add((ConceptSetFilterComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("system")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.system");
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.version");
        } else if (name.equals("concept")) {
            return addConcept();
        } else if (name.equals("filter")) {
            return addFilter();
        } else
            return super.addChild(name);
    }

    public ConceptSetComponent copy() {
        ConceptSetComponent dst = new ConceptSetComponent();
        copyValues(dst);
        dst.system = system == null ? null : system.copy();
        dst.version = version == null ? null : version.copy();
        if (concept != null) {
            dst.concept = new ArrayList<ConceptReferenceComponent>();
            for (ConceptReferenceComponent i : concept) dst.concept.add(i.copy());
        }
        ;
        if (filter != null) {
            dst.filter = new ArrayList<ConceptSetFilterComponent>();
            for (ConceptSetFilterComponent i : filter) dst.filter.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConceptSetComponent))
            return false;
        ConceptSetComponent o = (ConceptSetComponent) other;
        return compareDeep(system, o.system, true) && compareDeep(version, o.version, true) && compareDeep(concept, o.concept, true) && compareDeep(filter, o.filter, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConceptSetComponent))
            return false;
        ConceptSetComponent o = (ConceptSetComponent) other;
        return compareValues(system, o.system, true) && compareValues(version, o.version, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (system == null || system.isEmpty()) && (version == null || version.isEmpty()) && (concept == null || concept.isEmpty()) && (filter == null || filter.isEmpty());
    }

    public String fhirType() {
        return "ValueSet.compose.include";
    }
}
