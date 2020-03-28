package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseConformance;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKind;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicy;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatus;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionMode;

public class ConformanceRestComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.
     */
    protected Enumeration<RestfulConformanceMode> mode;

    /**
     * Information about the system's restful capabilities that apply across all applications, such as security.
     */
    protected StringType documentation;

    /**
     * Information about security implementation from an interface perspective - what a client needs to know.
     */
    protected ConformanceRestSecurityComponent security;

    /**
     * A specification of the restful capabilities of the solution for a specific resource type.
     */
    protected List<ConformanceRestResourceComponent> resource;

    /**
     * A specification of restful operations supported by the system.
     */
    protected List<SystemInteractionComponent> interaction;

    /**
     * A code that indicates how transactions are supported.
     */
    protected Enumeration<TransactionMode> transactionMode;

    /**
     * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
     */
    protected List<ConformanceRestResourceSearchParamComponent> searchParam;

    /**
     * Definition of an operation or a named query and with its parameters and their meaning and type.
     */
    protected List<ConformanceRestOperationComponent> operation;

    /**
     * An absolute URI which is a reference to the definition of a compartment hosted by the system.
     */
    protected List<UriType> compartment;

    private static final long serialVersionUID = 931983837L;

    /*
     * Constructor
     */
    public ConformanceRestComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConformanceRestComponent(Enumeration<RestfulConformanceMode> mode) {
        super();
        this.mode = mode;
    }

    /**
     * @return {@link #mode} (Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public Enumeration<RestfulConformanceMode> getModeElement() {
        if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestComponent.mode");
            else if (Configuration.doAutoCreate())
                // bb
                this.mode = new Enumeration<RestfulConformanceMode>(new RestfulConformanceModeEnumFactory());
        return this.mode;
    }

    public boolean hasModeElement() {
        return this.mode != null && !this.mode.isEmpty();
    }

    public boolean hasMode() {
        return this.mode != null && !this.mode.isEmpty();
    }

    /**
     * @param value {@link #mode} (Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public ConformanceRestComponent setModeElement(Enumeration<RestfulConformanceMode> value) {
        this.mode = value;
        return this;
    }

    /**
     * @return Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.
     */
    public RestfulConformanceMode getMode() {
        return this.mode == null ? null : this.mode.getValue();
    }

    /**
     * @param value Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.
     */
    public ConformanceRestComponent setMode(RestfulConformanceMode value) {
        if (this.mode == null)
            this.mode = new Enumeration<RestfulConformanceMode>(new RestfulConformanceModeEnumFactory());
        this.mode.setValue(value);
        return this;
    }

    /**
     * @return {@link #documentation} (Information about the system's restful capabilities that apply across all applications, such as security.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public StringType getDocumentationElement() {
        if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestComponent.documentation");
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
     * @param value {@link #documentation} (Information about the system's restful capabilities that apply across all applications, such as security.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public ConformanceRestComponent setDocumentationElement(StringType value) {
        this.documentation = value;
        return this;
    }

    /**
     * @return Information about the system's restful capabilities that apply across all applications, such as security.
     */
    public String getDocumentation() {
        return this.documentation == null ? null : this.documentation.getValue();
    }

    /**
     * @param value Information about the system's restful capabilities that apply across all applications, such as security.
     */
    public ConformanceRestComponent setDocumentation(String value) {
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
     * @return {@link #security} (Information about security implementation from an interface perspective - what a client needs to know.)
     */
    public ConformanceRestSecurityComponent getSecurity() {
        if (this.security == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestComponent.security");
            else if (Configuration.doAutoCreate())
                // cc
                this.security = new ConformanceRestSecurityComponent();
        return this.security;
    }

    public boolean hasSecurity() {
        return this.security != null && !this.security.isEmpty();
    }

    /**
     * @param value {@link #security} (Information about security implementation from an interface perspective - what a client needs to know.)
     */
    public ConformanceRestComponent setSecurity(ConformanceRestSecurityComponent value) {
        this.security = value;
        return this;
    }

    /**
     * @return {@link #resource} (A specification of the restful capabilities of the solution for a specific resource type.)
     */
    public List<ConformanceRestResourceComponent> getResource() {
        if (this.resource == null)
            this.resource = new ArrayList<ConformanceRestResourceComponent>();
        return this.resource;
    }

    public boolean hasResource() {
        if (this.resource == null)
            return false;
        for (ConformanceRestResourceComponent item : this.resource) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConformanceRestResourceComponent addResource() {
        // 3
        ConformanceRestResourceComponent t = new ConformanceRestResourceComponent();
        if (this.resource == null)
            this.resource = new ArrayList<ConformanceRestResourceComponent>();
        this.resource.add(t);
        return t;
    }

    // syntactic sugar
    public ConformanceRestComponent addResource(ConformanceRestResourceComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.resource == null)
            this.resource = new ArrayList<ConformanceRestResourceComponent>();
        this.resource.add(t);
        return this;
    }

    /**
     * @return {@link #interaction} (A specification of restful operations supported by the system.)
     */
    public List<SystemInteractionComponent> getInteraction() {
        if (this.interaction == null)
            this.interaction = new ArrayList<SystemInteractionComponent>();
        return this.interaction;
    }

    public boolean hasInteraction() {
        if (this.interaction == null)
            return false;
        for (SystemInteractionComponent item : this.interaction) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public SystemInteractionComponent addInteraction() {
        // 3
        SystemInteractionComponent t = new SystemInteractionComponent();
        if (this.interaction == null)
            this.interaction = new ArrayList<SystemInteractionComponent>();
        this.interaction.add(t);
        return t;
    }

    // syntactic sugar
    public ConformanceRestComponent addInteraction(SystemInteractionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.interaction == null)
            this.interaction = new ArrayList<SystemInteractionComponent>();
        this.interaction.add(t);
        return this;
    }

    /**
     * @return {@link #transactionMode} (A code that indicates how transactions are supported.). This is the underlying object with id, value and extensions. The accessor "getTransactionMode" gives direct access to the value
     */
    public Enumeration<TransactionMode> getTransactionModeElement() {
        if (this.transactionMode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestComponent.transactionMode");
            else if (Configuration.doAutoCreate())
                // bb
                this.transactionMode = new Enumeration<TransactionMode>(new TransactionModeEnumFactory());
        return this.transactionMode;
    }

    public boolean hasTransactionModeElement() {
        return this.transactionMode != null && !this.transactionMode.isEmpty();
    }

    public boolean hasTransactionMode() {
        return this.transactionMode != null && !this.transactionMode.isEmpty();
    }

    /**
     * @param value {@link #transactionMode} (A code that indicates how transactions are supported.). This is the underlying object with id, value and extensions. The accessor "getTransactionMode" gives direct access to the value
     */
    public ConformanceRestComponent setTransactionModeElement(Enumeration<TransactionMode> value) {
        this.transactionMode = value;
        return this;
    }

    /**
     * @return A code that indicates how transactions are supported.
     */
    public TransactionMode getTransactionMode() {
        return this.transactionMode == null ? null : this.transactionMode.getValue();
    }

    /**
     * @param value A code that indicates how transactions are supported.
     */
    public ConformanceRestComponent setTransactionMode(TransactionMode value) {
        if (value == null)
            this.transactionMode = null;
        else {
            if (this.transactionMode == null)
                this.transactionMode = new Enumeration<TransactionMode>(new TransactionModeEnumFactory());
            this.transactionMode.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #searchParam} (Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.)
     */
    public List<ConformanceRestResourceSearchParamComponent> getSearchParam() {
        if (this.searchParam == null)
            this.searchParam = new ArrayList<ConformanceRestResourceSearchParamComponent>();
        return this.searchParam;
    }

    public boolean hasSearchParam() {
        if (this.searchParam == null)
            return false;
        for (ConformanceRestResourceSearchParamComponent item : this.searchParam) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConformanceRestResourceSearchParamComponent addSearchParam() {
        // 3
        ConformanceRestResourceSearchParamComponent t = new ConformanceRestResourceSearchParamComponent();
        if (this.searchParam == null)
            this.searchParam = new ArrayList<ConformanceRestResourceSearchParamComponent>();
        this.searchParam.add(t);
        return t;
    }

    // syntactic sugar
    public ConformanceRestComponent addSearchParam(ConformanceRestResourceSearchParamComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.searchParam == null)
            this.searchParam = new ArrayList<ConformanceRestResourceSearchParamComponent>();
        this.searchParam.add(t);
        return this;
    }

    /**
     * @return {@link #operation} (Definition of an operation or a named query and with its parameters and their meaning and type.)
     */
    public List<ConformanceRestOperationComponent> getOperation() {
        if (this.operation == null)
            this.operation = new ArrayList<ConformanceRestOperationComponent>();
        return this.operation;
    }

    public boolean hasOperation() {
        if (this.operation == null)
            return false;
        for (ConformanceRestOperationComponent item : this.operation) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConformanceRestOperationComponent addOperation() {
        // 3
        ConformanceRestOperationComponent t = new ConformanceRestOperationComponent();
        if (this.operation == null)
            this.operation = new ArrayList<ConformanceRestOperationComponent>();
        this.operation.add(t);
        return t;
    }

    // syntactic sugar
    public ConformanceRestComponent addOperation(ConformanceRestOperationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.operation == null)
            this.operation = new ArrayList<ConformanceRestOperationComponent>();
        this.operation.add(t);
        return this;
    }

    /**
     * @return {@link #compartment} (An absolute URI which is a reference to the definition of a compartment hosted by the system.)
     */
    public List<UriType> getCompartment() {
        if (this.compartment == null)
            this.compartment = new ArrayList<UriType>();
        return this.compartment;
    }

    public boolean hasCompartment() {
        if (this.compartment == null)
            return false;
        for (UriType item : this.compartment) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public UriType addCompartmentElement() {
        // 2
        UriType t = new UriType();
        if (this.compartment == null)
            this.compartment = new ArrayList<UriType>();
        this.compartment.add(t);
        return t;
    }

    /**
     * @param value {@link #compartment} (An absolute URI which is a reference to the definition of a compartment hosted by the system.)
     */
    public ConformanceRestComponent addCompartment(String value) {
        // 1
        UriType t = new UriType();
        t.setValue(value);
        if (this.compartment == null)
            this.compartment = new ArrayList<UriType>();
        this.compartment.add(t);
        return this;
    }

    /**
     * @param value {@link #compartment} (An absolute URI which is a reference to the definition of a compartment hosted by the system.)
     */
    public boolean hasCompartment(String value) {
        if (this.compartment == null)
            return false;
        for (UriType v : this.compartment) if (// uri
        v.equals(value))
            return true;
        return false;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("mode", "code", "Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.", 0, java.lang.Integer.MAX_VALUE, mode));
        childrenList.add(new Property("documentation", "string", "Information about the system's restful capabilities that apply across all applications, such as security.", 0, java.lang.Integer.MAX_VALUE, documentation));
        childrenList.add(new Property("security", "", "Information about security implementation from an interface perspective - what a client needs to know.", 0, java.lang.Integer.MAX_VALUE, security));
        childrenList.add(new Property("resource", "", "A specification of the restful capabilities of the solution for a specific resource type.", 0, java.lang.Integer.MAX_VALUE, resource));
        childrenList.add(new Property("interaction", "", "A specification of restful operations supported by the system.", 0, java.lang.Integer.MAX_VALUE, interaction));
        childrenList.add(new Property("transactionMode", "code", "A code that indicates how transactions are supported.", 0, java.lang.Integer.MAX_VALUE, transactionMode));
        childrenList.add(new Property("searchParam", "@Conformance.rest.resource.searchParam", "Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.", 0, java.lang.Integer.MAX_VALUE, searchParam));
        childrenList.add(new Property("operation", "", "Definition of an operation or a named query and with its parameters and their meaning and type.", 0, java.lang.Integer.MAX_VALUE, operation));
        childrenList.add(new Property("compartment", "uri", "An absolute URI which is a reference to the definition of a compartment hosted by the system.", 0, java.lang.Integer.MAX_VALUE, compartment));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("mode"))
            // Enumeration<RestfulConformanceMode>
            this.mode = new RestfulConformanceModeEnumFactory().fromType(value);
        else if (name.equals("documentation"))
            // StringType
            this.documentation = castToString(value);
        else if (name.equals("security"))
            // ConformanceRestSecurityComponent
            this.security = (ConformanceRestSecurityComponent) value;
        else if (name.equals("resource"))
            this.getResource().add((ConformanceRestResourceComponent) value);
        else if (name.equals("interaction"))
            this.getInteraction().add((SystemInteractionComponent) value);
        else if (name.equals("transactionMode"))
            // Enumeration<TransactionMode>
            this.transactionMode = new TransactionModeEnumFactory().fromType(value);
        else if (name.equals("searchParam"))
            this.getSearchParam().add((ConformanceRestResourceSearchParamComponent) value);
        else if (name.equals("operation"))
            this.getOperation().add((ConformanceRestOperationComponent) value);
        else if (name.equals("compartment"))
            this.getCompartment().add(castToUri(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("mode")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.mode");
        } else if (name.equals("documentation")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.documentation");
        } else if (name.equals("security")) {
            this.security = new ConformanceRestSecurityComponent();
            return this.security;
        } else if (name.equals("resource")) {
            return addResource();
        } else if (name.equals("interaction")) {
            return addInteraction();
        } else if (name.equals("transactionMode")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.transactionMode");
        } else if (name.equals("searchParam")) {
            return addSearchParam();
        } else if (name.equals("operation")) {
            return addOperation();
        } else if (name.equals("compartment")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.compartment");
        } else
            return super.addChild(name);
    }

    public ConformanceRestComponent copy() {
        ConformanceRestComponent dst = new ConformanceRestComponent();
        copyValues(dst);
        dst.mode = mode == null ? null : mode.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        dst.security = security == null ? null : security.copy();
        if (resource != null) {
            dst.resource = new ArrayList<ConformanceRestResourceComponent>();
            for (ConformanceRestResourceComponent i : resource) dst.resource.add(i.copy());
        }
        ;
        if (interaction != null) {
            dst.interaction = new ArrayList<SystemInteractionComponent>();
            for (SystemInteractionComponent i : interaction) dst.interaction.add(i.copy());
        }
        ;
        dst.transactionMode = transactionMode == null ? null : transactionMode.copy();
        if (searchParam != null) {
            dst.searchParam = new ArrayList<ConformanceRestResourceSearchParamComponent>();
            for (ConformanceRestResourceSearchParamComponent i : searchParam) dst.searchParam.add(i.copy());
        }
        ;
        if (operation != null) {
            dst.operation = new ArrayList<ConformanceRestOperationComponent>();
            for (ConformanceRestOperationComponent i : operation) dst.operation.add(i.copy());
        }
        ;
        if (compartment != null) {
            dst.compartment = new ArrayList<UriType>();
            for (UriType i : compartment) dst.compartment.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceRestComponent))
            return false;
        ConformanceRestComponent o = (ConformanceRestComponent) other;
        return compareDeep(mode, o.mode, true) && compareDeep(documentation, o.documentation, true) && compareDeep(security, o.security, true) && compareDeep(resource, o.resource, true) && compareDeep(interaction, o.interaction, true) && compareDeep(transactionMode, o.transactionMode, true) && compareDeep(searchParam, o.searchParam, true) && compareDeep(operation, o.operation, true) && compareDeep(compartment, o.compartment, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceRestComponent))
            return false;
        ConformanceRestComponent o = (ConformanceRestComponent) other;
        return compareValues(mode, o.mode, true) && compareValues(documentation, o.documentation, true) && compareValues(transactionMode, o.transactionMode, true) && compareValues(compartment, o.compartment, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (mode == null || mode.isEmpty()) && (documentation == null || documentation.isEmpty()) && (security == null || security.isEmpty()) && (resource == null || resource.isEmpty()) && (interaction == null || interaction.isEmpty()) && (transactionMode == null || transactionMode.isEmpty()) && (searchParam == null || searchParam.isEmpty()) && (operation == null || operation.isEmpty()) && (compartment == null || compartment.isEmpty());
    }

    public String fhirType() {
        return "Conformance.rest";
    }
}
