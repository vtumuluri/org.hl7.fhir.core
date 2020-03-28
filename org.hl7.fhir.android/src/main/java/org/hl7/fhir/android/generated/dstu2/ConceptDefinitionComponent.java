package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperatorEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ValueSetEnum.FilterOperator;

public class ConceptDefinitionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A code - a text symbol - that uniquely identifies the concept within the code system.
     */
    protected CodeType code;

    /**
     * If this code is not for use as a real concept.
     */
    protected BooleanType abstract_;

    /**
     * A human readable string that is the recommended default way to present this concept to a user.
     */
    protected StringType display;

    /**
     * The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.
     */
    protected StringType definition;

    /**
     * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
     */
    protected List<ConceptDefinitionDesignationComponent> designation;

    /**
     * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts.
     */
    protected List<ConceptDefinitionComponent> concept;

    private static final long serialVersionUID = -318560292L;

    /*
     * Constructor
     */
    public ConceptDefinitionComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConceptDefinitionComponent(CodeType code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #code} (A code - a text symbol - that uniquely identifies the concept within the code system.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public CodeType getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptDefinitionComponent.code");
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
     * @param value {@link #code} (A code - a text symbol - that uniquely identifies the concept within the code system.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public ConceptDefinitionComponent setCodeElement(CodeType value) {
        this.code = value;
        return this;
    }

    /**
     * @return A code - a text symbol - that uniquely identifies the concept within the code system.
     */
    public String getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value A code - a text symbol - that uniquely identifies the concept within the code system.
     */
    public ConceptDefinitionComponent setCode(String value) {
        if (this.code == null)
            this.code = new CodeType();
        this.code.setValue(value);
        return this;
    }

    /**
     * @return {@link #abstract_} (If this code is not for use as a real concept.). This is the underlying object with id, value and extensions. The accessor "getAbstract" gives direct access to the value
     */
    public BooleanType getAbstractElement() {
        if (this.abstract_ == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptDefinitionComponent.abstract_");
            else if (Configuration.doAutoCreate())
                // bb
                this.abstract_ = new BooleanType();
        return this.abstract_;
    }

    public boolean hasAbstractElement() {
        return this.abstract_ != null && !this.abstract_.isEmpty();
    }

    public boolean hasAbstract() {
        return this.abstract_ != null && !this.abstract_.isEmpty();
    }

    /**
     * @param value {@link #abstract_} (If this code is not for use as a real concept.). This is the underlying object with id, value and extensions. The accessor "getAbstract" gives direct access to the value
     */
    public ConceptDefinitionComponent setAbstractElement(BooleanType value) {
        this.abstract_ = value;
        return this;
    }

    /**
     * @return If this code is not for use as a real concept.
     */
    public boolean getAbstract() {
        return this.abstract_ == null || this.abstract_.isEmpty() ? false : this.abstract_.getValue();
    }

    /**
     * @param value If this code is not for use as a real concept.
     */
    public ConceptDefinitionComponent setAbstract(boolean value) {
        if (this.abstract_ == null)
            this.abstract_ = new BooleanType();
        this.abstract_.setValue(value);
        return this;
    }

    /**
     * @return {@link #display} (A human readable string that is the recommended default way to present this concept to a user.). This is the underlying object with id, value and extensions. The accessor "getDisplay" gives direct access to the value
     */
    public StringType getDisplayElement() {
        if (this.display == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptDefinitionComponent.display");
            else if (Configuration.doAutoCreate())
                // bb
                this.display = new StringType();
        return this.display;
    }

    public boolean hasDisplayElement() {
        return this.display != null && !this.display.isEmpty();
    }

    public boolean hasDisplay() {
        return this.display != null && !this.display.isEmpty();
    }

    /**
     * @param value {@link #display} (A human readable string that is the recommended default way to present this concept to a user.). This is the underlying object with id, value and extensions. The accessor "getDisplay" gives direct access to the value
     */
    public ConceptDefinitionComponent setDisplayElement(StringType value) {
        this.display = value;
        return this;
    }

    /**
     * @return A human readable string that is the recommended default way to present this concept to a user.
     */
    public String getDisplay() {
        return this.display == null ? null : this.display.getValue();
    }

    /**
     * @param value A human readable string that is the recommended default way to present this concept to a user.
     */
    public ConceptDefinitionComponent setDisplay(String value) {
        if (Utilities.noString(value))
            this.display = null;
        else {
            if (this.display == null)
                this.display = new StringType();
            this.display.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #definition} (The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.). This is the underlying object with id, value and extensions. The accessor "getDefinition" gives direct access to the value
     */
    public StringType getDefinitionElement() {
        if (this.definition == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConceptDefinitionComponent.definition");
            else if (Configuration.doAutoCreate())
                // bb
                this.definition = new StringType();
        return this.definition;
    }

    public boolean hasDefinitionElement() {
        return this.definition != null && !this.definition.isEmpty();
    }

    public boolean hasDefinition() {
        return this.definition != null && !this.definition.isEmpty();
    }

    /**
     * @param value {@link #definition} (The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.). This is the underlying object with id, value and extensions. The accessor "getDefinition" gives direct access to the value
     */
    public ConceptDefinitionComponent setDefinitionElement(StringType value) {
        this.definition = value;
        return this;
    }

    /**
     * @return The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.
     */
    public String getDefinition() {
        return this.definition == null ? null : this.definition.getValue();
    }

    /**
     * @param value The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.
     */
    public ConceptDefinitionComponent setDefinition(String value) {
        if (Utilities.noString(value))
            this.definition = null;
        else {
            if (this.definition == null)
                this.definition = new StringType();
            this.definition.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #designation} (Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.)
     */
    public List<ConceptDefinitionDesignationComponent> getDesignation() {
        if (this.designation == null)
            this.designation = new ArrayList<ConceptDefinitionDesignationComponent>();
        return this.designation;
    }

    public boolean hasDesignation() {
        if (this.designation == null)
            return false;
        for (ConceptDefinitionDesignationComponent item : this.designation) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConceptDefinitionDesignationComponent addDesignation() {
        // 3
        ConceptDefinitionDesignationComponent t = new ConceptDefinitionDesignationComponent();
        if (this.designation == null)
            this.designation = new ArrayList<ConceptDefinitionDesignationComponent>();
        this.designation.add(t);
        return t;
    }

    // syntactic sugar
    public ConceptDefinitionComponent addDesignation(ConceptDefinitionDesignationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.designation == null)
            this.designation = new ArrayList<ConceptDefinitionDesignationComponent>();
        this.designation.add(t);
        return this;
    }

    /**
     * @return {@link #concept} (Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts.)
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
    public ConceptDefinitionComponent addConcept(ConceptDefinitionComponent t) {
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
        childrenList.add(new Property("code", "code", "A code - a text symbol - that uniquely identifies the concept within the code system.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("abstract", "boolean", "If this code is not for use as a real concept.", 0, java.lang.Integer.MAX_VALUE, abstract_));
        childrenList.add(new Property("display", "string", "A human readable string that is the recommended default way to present this concept to a user.", 0, java.lang.Integer.MAX_VALUE, display));
        childrenList.add(new Property("definition", "string", "The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.", 0, java.lang.Integer.MAX_VALUE, definition));
        childrenList.add(new Property("designation", "", "Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.", 0, java.lang.Integer.MAX_VALUE, designation));
        childrenList.add(new Property("concept", "@ValueSet.codeSystem.concept", "Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts.", 0, java.lang.Integer.MAX_VALUE, concept));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeType
            this.code = castToCode(value);
        else if (name.equals("abstract"))
            // BooleanType
            this.abstract_ = castToBoolean(value);
        else if (name.equals("display"))
            // StringType
            this.display = castToString(value);
        else if (name.equals("definition"))
            // StringType
            this.definition = castToString(value);
        else if (name.equals("designation"))
            this.getDesignation().add((ConceptDefinitionDesignationComponent) value);
        else if (name.equals("concept"))
            this.getConcept().add((ConceptDefinitionComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.code");
        } else if (name.equals("abstract")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.abstract");
        } else if (name.equals("display")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.display");
        } else if (name.equals("definition")) {
            throw new FHIRException("Cannot call addChild on a primitive type ValueSet.definition");
        } else if (name.equals("designation")) {
            return addDesignation();
        } else if (name.equals("concept")) {
            return addConcept();
        } else
            return super.addChild(name);
    }

    public ConceptDefinitionComponent copy() {
        ConceptDefinitionComponent dst = new ConceptDefinitionComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.abstract_ = abstract_ == null ? null : abstract_.copy();
        dst.display = display == null ? null : display.copy();
        dst.definition = definition == null ? null : definition.copy();
        if (designation != null) {
            dst.designation = new ArrayList<ConceptDefinitionDesignationComponent>();
            for (ConceptDefinitionDesignationComponent i : designation) dst.designation.add(i.copy());
        }
        ;
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
        if (!(other instanceof ConceptDefinitionComponent))
            return false;
        ConceptDefinitionComponent o = (ConceptDefinitionComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(abstract_, o.abstract_, true) && compareDeep(display, o.display, true) && compareDeep(definition, o.definition, true) && compareDeep(designation, o.designation, true) && compareDeep(concept, o.concept, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConceptDefinitionComponent))
            return false;
        ConceptDefinitionComponent o = (ConceptDefinitionComponent) other;
        return compareValues(code, o.code, true) && compareValues(abstract_, o.abstract_, true) && compareValues(display, o.display, true) && compareValues(definition, o.definition, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (abstract_ == null || abstract_.isEmpty()) && (display == null || display.isEmpty()) && (definition == null || definition.isEmpty()) && (designation == null || designation.isEmpty()) && (concept == null || concept.isEmpty());
    }

    public String fhirType() {
        return "ValueSet.codeSystem.concept";
    }
}
