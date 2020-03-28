package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConceptMapEquivalence;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConceptMapEquivalenceEnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class TargetElementComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).
     */
    protected UriType codeSystem;

    /**
     * Identity (code or path) or the element/item that the map refers to.
     */
    protected CodeType code;

    /**
     * The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source).
     */
    protected Enumeration<ConceptMapEquivalence> equivalence;

    /**
     * A description of status/issues in mapping that conveys additional information not represented in  the structured data.
     */
    protected StringType comments;

    /**
     * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.
     */
    protected List<OtherElementComponent> dependsOn;

    /**
     * A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on.
     */
    protected List<OtherElementComponent> product;

    private static final long serialVersionUID = -804990059L;

    /*
     * Constructor
     */
    public TargetElementComponent() {
        super();
    }

    /*
     * Constructor
     */
    public TargetElementComponent(Enumeration<ConceptMapEquivalence> equivalence) {
        super();
        this.equivalence = equivalence;
    }

    /**
     * @return {@link #codeSystem} (An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).). This is the underlying object with id, value and extensions. The accessor "getCodeSystem" gives direct access to the value
     */
    public UriType getCodeSystemElement() {
        if (this.codeSystem == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TargetElementComponent.codeSystem");
            else if (Configuration.doAutoCreate())
                // bb
                this.codeSystem = new UriType();
        return this.codeSystem;
    }

    public boolean hasCodeSystemElement() {
        return this.codeSystem != null && !this.codeSystem.isEmpty();
    }

    public boolean hasCodeSystem() {
        return this.codeSystem != null && !this.codeSystem.isEmpty();
    }

    /**
     * @param value {@link #codeSystem} (An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).). This is the underlying object with id, value and extensions. The accessor "getCodeSystem" gives direct access to the value
     */
    public TargetElementComponent setCodeSystemElement(UriType value) {
        this.codeSystem = value;
        return this;
    }

    /**
     * @return An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).
     */
    public String getCodeSystem() {
        return this.codeSystem == null ? null : this.codeSystem.getValue();
    }

    /**
     * @param value An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).
     */
    public TargetElementComponent setCodeSystem(String value) {
        if (Utilities.noString(value))
            this.codeSystem = null;
        else {
            if (this.codeSystem == null)
                this.codeSystem = new UriType();
            this.codeSystem.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #code} (Identity (code or path) or the element/item that the map refers to.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public CodeType getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TargetElementComponent.code");
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
     * @param value {@link #code} (Identity (code or path) or the element/item that the map refers to.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public TargetElementComponent setCodeElement(CodeType value) {
        this.code = value;
        return this;
    }

    /**
     * @return Identity (code or path) or the element/item that the map refers to.
     */
    public String getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value Identity (code or path) or the element/item that the map refers to.
     */
    public TargetElementComponent setCode(String value) {
        if (Utilities.noString(value))
            this.code = null;
        else {
            if (this.code == null)
                this.code = new CodeType();
            this.code.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #equivalence} (The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source).). This is the underlying object with id, value and extensions. The accessor "getEquivalence" gives direct access to the value
     */
    public Enumeration<ConceptMapEquivalence> getEquivalenceElement() {
        if (this.equivalence == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TargetElementComponent.equivalence");
            else if (Configuration.doAutoCreate())
                // bb
                this.equivalence = new Enumeration<ConceptMapEquivalence>(new ConceptMapEquivalenceEnumFactory());
        return this.equivalence;
    }

    public boolean hasEquivalenceElement() {
        return this.equivalence != null && !this.equivalence.isEmpty();
    }

    public boolean hasEquivalence() {
        return this.equivalence != null && !this.equivalence.isEmpty();
    }

    /**
     * @param value {@link #equivalence} (The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source).). This is the underlying object with id, value and extensions. The accessor "getEquivalence" gives direct access to the value
     */
    public TargetElementComponent setEquivalenceElement(Enumeration<ConceptMapEquivalence> value) {
        this.equivalence = value;
        return this;
    }

    /**
     * @return The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source).
     */
    public ConceptMapEquivalence getEquivalence() {
        return this.equivalence == null ? null : this.equivalence.getValue();
    }

    /**
     * @param value The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source).
     */
    public TargetElementComponent setEquivalence(ConceptMapEquivalence value) {
        if (this.equivalence == null)
            this.equivalence = new Enumeration<ConceptMapEquivalence>(new ConceptMapEquivalenceEnumFactory());
        this.equivalence.setValue(value);
        return this;
    }

    /**
     * @return {@link #comments} (A description of status/issues in mapping that conveys additional information not represented in  the structured data.). This is the underlying object with id, value and extensions. The accessor "getComments" gives direct access to the value
     */
    public StringType getCommentsElement() {
        if (this.comments == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create TargetElementComponent.comments");
            else if (Configuration.doAutoCreate())
                // bb
                this.comments = new StringType();
        return this.comments;
    }

    public boolean hasCommentsElement() {
        return this.comments != null && !this.comments.isEmpty();
    }

    public boolean hasComments() {
        return this.comments != null && !this.comments.isEmpty();
    }

    /**
     * @param value {@link #comments} (A description of status/issues in mapping that conveys additional information not represented in  the structured data.). This is the underlying object with id, value and extensions. The accessor "getComments" gives direct access to the value
     */
    public TargetElementComponent setCommentsElement(StringType value) {
        this.comments = value;
        return this;
    }

    /**
     * @return A description of status/issues in mapping that conveys additional information not represented in  the structured data.
     */
    public String getComments() {
        return this.comments == null ? null : this.comments.getValue();
    }

    /**
     * @param value A description of status/issues in mapping that conveys additional information not represented in  the structured data.
     */
    public TargetElementComponent setComments(String value) {
        if (Utilities.noString(value))
            this.comments = null;
        else {
            if (this.comments == null)
                this.comments = new StringType();
            this.comments.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #dependsOn} (A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.)
     */
    public List<OtherElementComponent> getDependsOn() {
        if (this.dependsOn == null)
            this.dependsOn = new ArrayList<OtherElementComponent>();
        return this.dependsOn;
    }

    public boolean hasDependsOn() {
        if (this.dependsOn == null)
            return false;
        for (OtherElementComponent item : this.dependsOn) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public OtherElementComponent addDependsOn() {
        // 3
        OtherElementComponent t = new OtherElementComponent();
        if (this.dependsOn == null)
            this.dependsOn = new ArrayList<OtherElementComponent>();
        this.dependsOn.add(t);
        return t;
    }

    // syntactic sugar
    public TargetElementComponent addDependsOn(OtherElementComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.dependsOn == null)
            this.dependsOn = new ArrayList<OtherElementComponent>();
        this.dependsOn.add(t);
        return this;
    }

    /**
     * @return {@link #product} (A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on.)
     */
    public List<OtherElementComponent> getProduct() {
        if (this.product == null)
            this.product = new ArrayList<OtherElementComponent>();
        return this.product;
    }

    public boolean hasProduct() {
        if (this.product == null)
            return false;
        for (OtherElementComponent item : this.product) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public OtherElementComponent addProduct() {
        // 3
        OtherElementComponent t = new OtherElementComponent();
        if (this.product == null)
            this.product = new ArrayList<OtherElementComponent>();
        this.product.add(t);
        return t;
    }

    // syntactic sugar
    public TargetElementComponent addProduct(OtherElementComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.product == null)
            this.product = new ArrayList<OtherElementComponent>();
        this.product.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("codeSystem", "uri", "An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).", 0, java.lang.Integer.MAX_VALUE, codeSystem));
        childrenList.add(new Property("code", "code", "Identity (code or path) or the element/item that the map refers to.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("equivalence", "code", "The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source).", 0, java.lang.Integer.MAX_VALUE, equivalence));
        childrenList.add(new Property("comments", "string", "A description of status/issues in mapping that conveys additional information not represented in  the structured data.", 0, java.lang.Integer.MAX_VALUE, comments));
        childrenList.add(new Property("dependsOn", "", "A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.", 0, java.lang.Integer.MAX_VALUE, dependsOn));
        childrenList.add(new Property("product", "@ConceptMap.element.target.dependsOn", "A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on.", 0, java.lang.Integer.MAX_VALUE, product));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("codeSystem"))
            // UriType
            this.codeSystem = castToUri(value);
        else if (name.equals("code"))
            // CodeType
            this.code = castToCode(value);
        else if (name.equals("equivalence"))
            // Enumeration<ConceptMapEquivalence>
            this.equivalence = new ConceptMapEquivalenceEnumFactory().fromType(value);
        else if (name.equals("comments"))
            // StringType
            this.comments = castToString(value);
        else if (name.equals("dependsOn"))
            this.getDependsOn().add((OtherElementComponent) value);
        else if (name.equals("product"))
            this.getProduct().add((OtherElementComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("codeSystem")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.codeSystem");
        } else if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.code");
        } else if (name.equals("equivalence")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.equivalence");
        } else if (name.equals("comments")) {
            throw new FHIRException("Cannot call addChild on a primitive type ConceptMap.comments");
        } else if (name.equals("dependsOn")) {
            return addDependsOn();
        } else if (name.equals("product")) {
            return addProduct();
        } else
            return super.addChild(name);
    }

    public TargetElementComponent copy() {
        TargetElementComponent dst = new TargetElementComponent();
        copyValues(dst);
        dst.codeSystem = codeSystem == null ? null : codeSystem.copy();
        dst.code = code == null ? null : code.copy();
        dst.equivalence = equivalence == null ? null : equivalence.copy();
        dst.comments = comments == null ? null : comments.copy();
        if (dependsOn != null) {
            dst.dependsOn = new ArrayList<OtherElementComponent>();
            for (OtherElementComponent i : dependsOn) dst.dependsOn.add(i.copy());
        }
        ;
        if (product != null) {
            dst.product = new ArrayList<OtherElementComponent>();
            for (OtherElementComponent i : product) dst.product.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TargetElementComponent))
            return false;
        TargetElementComponent o = (TargetElementComponent) other;
        return compareDeep(codeSystem, o.codeSystem, true) && compareDeep(code, o.code, true) && compareDeep(equivalence, o.equivalence, true) && compareDeep(comments, o.comments, true) && compareDeep(dependsOn, o.dependsOn, true) && compareDeep(product, o.product, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TargetElementComponent))
            return false;
        TargetElementComponent o = (TargetElementComponent) other;
        return compareValues(codeSystem, o.codeSystem, true) && compareValues(code, o.code, true) && compareValues(equivalence, o.equivalence, true) && compareValues(comments, o.comments, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (codeSystem == null || codeSystem.isEmpty()) && (code == null || code.isEmpty()) && (equivalence == null || equivalence.isEmpty()) && (comments == null || comments.isEmpty()) && (dependsOn == null || dependsOn.isEmpty()) && (product == null || product.isEmpty());
    }

    public String fhirType() {
        return "ConceptMap.element.target";
    }
}
