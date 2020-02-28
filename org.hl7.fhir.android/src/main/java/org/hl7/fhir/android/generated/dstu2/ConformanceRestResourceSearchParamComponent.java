package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.dstu2.model.Enumerations.SearchParamType;
import org.hl7.fhir.dstu2.model.Enumerations.SearchParamTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseConformance;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatus;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicy;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKind;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKindEnumFactory;

public class ConformanceRestResourceSearchParamComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The name of the search parameter used in the interface.
     */
    protected StringType name;

    /**
     * An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).
     */
    protected UriType definition;

    /**
     * The type of value a search parameter refers to, and how the content is interpreted.
     */
    protected Enumeration<SearchParamType> type;

    /**
     * This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
     */
    protected StringType documentation;

    /**
     * Types of resource (if a resource is referenced).
     */
    protected List<CodeType> target;

    /**
     * A modifier supported for the search parameter.
     */
    protected List<Enumeration<SearchModifierCode>> modifier;

    /**
     * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type.
     */
    protected List<StringType> chain;

    private static final long serialVersionUID = -1020405086L;

    /*
     * Constructor
     */
    public ConformanceRestResourceSearchParamComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConformanceRestResourceSearchParamComponent(StringType name, Enumeration<SearchParamType> type) {
        super();
        this.name = name;
        this.type = type;
    }

    /**
     * @return {@link #name} (The name of the search parameter used in the interface.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceSearchParamComponent.name");
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
     * @param value {@link #name} (The name of the search parameter used in the interface.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ConformanceRestResourceSearchParamComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return The name of the search parameter used in the interface.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The name of the search parameter used in the interface.
     */
    public ConformanceRestResourceSearchParamComponent setName(String value) {
        if (this.name == null)
            this.name = new StringType();
        this.name.setValue(value);
        return this;
    }

    /**
     * @return {@link #definition} (An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).). This is the underlying object with id, value and extensions. The accessor "getDefinition" gives direct access to the value
     */
    public UriType getDefinitionElement() {
        if (this.definition == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceSearchParamComponent.definition");
            else if (Configuration.doAutoCreate())
                // bb
                this.definition = new UriType();
        return this.definition;
    }

    public boolean hasDefinitionElement() {
        return this.definition != null && !this.definition.isEmpty();
    }

    public boolean hasDefinition() {
        return this.definition != null && !this.definition.isEmpty();
    }

    /**
     * @param value {@link #definition} (An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).). This is the underlying object with id, value and extensions. The accessor "getDefinition" gives direct access to the value
     */
    public ConformanceRestResourceSearchParamComponent setDefinitionElement(UriType value) {
        this.definition = value;
        return this;
    }

    /**
     * @return An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).
     */
    public String getDefinition() {
        return this.definition == null ? null : this.definition.getValue();
    }

    /**
     * @param value An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).
     */
    public ConformanceRestResourceSearchParamComponent setDefinition(String value) {
        if (Utilities.noString(value))
            this.definition = null;
        else {
            if (this.definition == null)
                this.definition = new UriType();
            this.definition.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (The type of value a search parameter refers to, and how the content is interpreted.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<SearchParamType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceSearchParamComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<SearchParamType>(new SearchParamTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of value a search parameter refers to, and how the content is interpreted.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public ConformanceRestResourceSearchParamComponent setTypeElement(Enumeration<SearchParamType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return The type of value a search parameter refers to, and how the content is interpreted.
     */
    public SearchParamType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The type of value a search parameter refers to, and how the content is interpreted.
     */
    public ConformanceRestResourceSearchParamComponent setType(SearchParamType value) {
        if (this.type == null)
            this.type = new Enumeration<SearchParamType>(new SearchParamTypeEnumFactory());
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #documentation} (This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public StringType getDocumentationElement() {
        if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceSearchParamComponent.documentation");
            else if (Configuration.doAutoCreate())
                // bb
                this.documentation = new StringType();
        return this.documentation;
    }

    public boolean hasDocumentationElement() {
        return this.documentation != null && !this.documentation.isEmpty();
    }

    public boolean hasDocumentation() {
        return this.documentation != null && !this.documentation.isEmpty();
    }

    /**
     * @param value {@link #documentation} (This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public ConformanceRestResourceSearchParamComponent setDocumentationElement(StringType value) {
        this.documentation = value;
        return this;
    }

    /**
     * @return This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
     */
    public String getDocumentation() {
        return this.documentation == null ? null : this.documentation.getValue();
    }

    /**
     * @param value This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
     */
    public ConformanceRestResourceSearchParamComponent setDocumentation(String value) {
        if (Utilities.noString(value))
            this.documentation = null;
        else {
            if (this.documentation == null)
                this.documentation = new StringType();
            this.documentation.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #target} (Types of resource (if a resource is referenced).)
     */
    public List<CodeType> getTarget() {
        if (this.target == null)
            this.target = new ArrayList<CodeType>();
        return this.target;
    }

    public boolean hasTarget() {
        if (this.target == null)
            return false;
        for (CodeType item : this.target) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeType addTargetElement() {
        // 2
        CodeType t = new CodeType();
        if (this.target == null)
            this.target = new ArrayList<CodeType>();
        this.target.add(t);
        return t;
    }

    /**
     * @param value {@link #target} (Types of resource (if a resource is referenced).)
     */
    public ConformanceRestResourceSearchParamComponent addTarget(String value) {
        // 1
        CodeType t = new CodeType();
        t.setValue(value);
        if (this.target == null)
            this.target = new ArrayList<CodeType>();
        this.target.add(t);
        return this;
    }

    /**
     * @param value {@link #target} (Types of resource (if a resource is referenced).)
     */
    public boolean hasTarget(String value) {
        if (this.target == null)
            return false;
        for (CodeType v : this.target) if (// code
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #modifier} (A modifier supported for the search parameter.)
     */
    public List<Enumeration<SearchModifierCode>> getModifier() {
        if (this.modifier == null)
            this.modifier = new ArrayList<Enumeration<SearchModifierCode>>();
        return this.modifier;
    }

    public boolean hasModifier() {
        if (this.modifier == null)
            return false;
        for (Enumeration<SearchModifierCode> item : this.modifier) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Enumeration<SearchModifierCode> addModifierElement() {
        // 2
        Enumeration<SearchModifierCode> t = new Enumeration<SearchModifierCode>(new SearchModifierCodeEnumFactory());
        if (this.modifier == null)
            this.modifier = new ArrayList<Enumeration<SearchModifierCode>>();
        this.modifier.add(t);
        return t;
    }

    /**
     * @param value {@link #modifier} (A modifier supported for the search parameter.)
     */
    public ConformanceRestResourceSearchParamComponent addModifier(SearchModifierCode value) {
        // 1
        Enumeration<SearchModifierCode> t = new Enumeration<SearchModifierCode>(new SearchModifierCodeEnumFactory());
        t.setValue(value);
        if (this.modifier == null)
            this.modifier = new ArrayList<Enumeration<SearchModifierCode>>();
        this.modifier.add(t);
        return this;
    }

    /**
     * @param value {@link #modifier} (A modifier supported for the search parameter.)
     */
    public boolean hasModifier(SearchModifierCode value) {
        if (this.modifier == null)
            return false;
        for (Enumeration<SearchModifierCode> v : this.modifier) if (// code
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #chain} (Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type.)
     */
    public List<StringType> getChain() {
        if (this.chain == null)
            this.chain = new ArrayList<StringType>();
        return this.chain;
    }

    public boolean hasChain() {
        if (this.chain == null)
            return false;
        for (StringType item : this.chain) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public StringType addChainElement() {
        // 2
        StringType t = new StringType();
        if (this.chain == null)
            this.chain = new ArrayList<StringType>();
        this.chain.add(t);
        return t;
    }

    /**
     * @param value {@link #chain} (Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type.)
     */
    public ConformanceRestResourceSearchParamComponent addChain(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.chain == null)
            this.chain = new ArrayList<StringType>();
        this.chain.add(t);
        return this;
    }

    /**
     * @param value {@link #chain} (Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type.)
     */
    public boolean hasChain(String value) {
        if (this.chain == null)
            return false;
        for (StringType v : this.chain) if (// string
        v.equals(value))
            return true;
        return false;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "The name of the search parameter used in the interface.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("definition", "uri", "An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).", 0, java.lang.Integer.MAX_VALUE, definition));
        childrenList.add(new Property("type", "code", "The type of value a search parameter refers to, and how the content is interpreted.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("documentation", "string", "This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.", 0, java.lang.Integer.MAX_VALUE, documentation));
        childrenList.add(new Property("target", "code", "Types of resource (if a resource is referenced).", 0, java.lang.Integer.MAX_VALUE, target));
        childrenList.add(new Property("modifier", "code", "A modifier supported for the search parameter.", 0, java.lang.Integer.MAX_VALUE, modifier));
        childrenList.add(new Property("chain", "string", "Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type.", 0, java.lang.Integer.MAX_VALUE, chain));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("definition"))
            // UriType
            this.definition = castToUri(value);
        else if (name.equals("type"))
            // Enumeration<SearchParamType>
            this.type = new SearchParamTypeEnumFactory().fromType(value);
        else if (name.equals("documentation"))
            // StringType
            this.documentation = castToString(value);
        else if (name.equals("target"))
            this.getTarget().add(castToCode(value));
        else if (name.equals("modifier"))
            this.getModifier().add(new SearchModifierCodeEnumFactory().fromType(value));
        else if (name.equals("chain"))
            this.getChain().add(castToString(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.name");
        } else if (name.equals("definition")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.definition");
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.type");
        } else if (name.equals("documentation")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.documentation");
        } else if (name.equals("target")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.target");
        } else if (name.equals("modifier")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.modifier");
        } else if (name.equals("chain")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.chain");
        } else
            return super.addChild(name);
    }

    public ConformanceRestResourceSearchParamComponent copy() {
        ConformanceRestResourceSearchParamComponent dst = new ConformanceRestResourceSearchParamComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.definition = definition == null ? null : definition.copy();
        dst.type = type == null ? null : type.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        if (target != null) {
            dst.target = new ArrayList<CodeType>();
            for (CodeType i : target) dst.target.add(i.copy());
        }
        ;
        if (modifier != null) {
            dst.modifier = new ArrayList<Enumeration<SearchModifierCode>>();
            for (Enumeration<SearchModifierCode> i : modifier) dst.modifier.add(i.copy());
        }
        ;
        if (chain != null) {
            dst.chain = new ArrayList<StringType>();
            for (StringType i : chain) dst.chain.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceRestResourceSearchParamComponent))
            return false;
        ConformanceRestResourceSearchParamComponent o = (ConformanceRestResourceSearchParamComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(definition, o.definition, true) && compareDeep(type, o.type, true) && compareDeep(documentation, o.documentation, true) && compareDeep(target, o.target, true) && compareDeep(modifier, o.modifier, true) && compareDeep(chain, o.chain, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceRestResourceSearchParamComponent))
            return false;
        ConformanceRestResourceSearchParamComponent o = (ConformanceRestResourceSearchParamComponent) other;
        return compareValues(name, o.name, true) && compareValues(definition, o.definition, true) && compareValues(type, o.type, true) && compareValues(documentation, o.documentation, true) && compareValues(target, o.target, true) && compareValues(modifier, o.modifier, true) && compareValues(chain, o.chain, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (definition == null || definition.isEmpty()) && (type == null || type.isEmpty()) && (documentation == null || documentation.isEmpty()) && (target == null || target.isEmpty()) && (modifier == null || modifier.isEmpty()) && (chain == null || chain.isEmpty());
    }

    public String fhirType() {
        return "Conformance.rest.resource.searchParam";
    }
}
