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

public class ConformanceRestResourceComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A type of resource exposed via the restful interface.
     */
    protected CodeType type;

    /**
     * A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}.
     */
    protected Reference profile;

    /**
     * The actual object that is the target of the reference (A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    protected StructureDefinition profileTarget;

    /**
     * Identifies a restful operation supported by the solution.
     */
    protected List<ResourceInteractionComponent> interaction;

    /**
     * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
     */
    protected Enumeration<ResourceVersionPolicy> versioning;

    /**
     * A flag for whether the server is able to return past versions as part of the vRead operation.
     */
    protected BooleanType readHistory;

    /**
     * A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
     */
    protected BooleanType updateCreate;

    /**
     * A flag that indicates that the server supports conditional create.
     */
    protected BooleanType conditionalCreate;

    /**
     * A flag that indicates that the server supports conditional update.
     */
    protected BooleanType conditionalUpdate;

    /**
     * A code that indicates how the server supports conditional delete.
     */
    protected Enumeration<ConditionalDeleteStatus> conditionalDelete;

    /**
     * A list of _include values supported by the server.
     */
    protected List<StringType> searchInclude;

    /**
     * A list of _revinclude (reverse include) values supported by the server.
     */
    protected List<StringType> searchRevInclude;

    /**
     * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
     */
    protected List<ConformanceRestResourceSearchParamComponent> searchParam;

    private static final long serialVersionUID = 1781959905L;

    /*
     * Constructor
     */
    public ConformanceRestResourceComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConformanceRestResourceComponent(CodeType type) {
        super();
        this.type = type;
    }

    /**
     * @return {@link #type} (A type of resource exposed via the restful interface.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public CodeType getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new CodeType();
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (A type of resource exposed via the restful interface.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public ConformanceRestResourceComponent setTypeElement(CodeType value) {
        this.type = value;
        return this;
    }

    /**
     * @return A type of resource exposed via the restful interface.
     */
    public String getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value A type of resource exposed via the restful interface.
     */
    public ConformanceRestResourceComponent setType(String value) {
        if (this.type == null)
            this.type = new CodeType();
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #profile} (A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    public Reference getProfile() {
        if (this.profile == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceComponent.profile");
            else if (Configuration.doAutoCreate())
                // cc
                this.profile = new Reference();
        return this.profile;
    }

    public boolean hasProfile() {
        return this.profile != null && !this.profile.isEmpty();
    }

    /**
     * @param value {@link #profile} (A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    public ConformanceRestResourceComponent setProfile(Reference value) {
        this.profile = value;
        return this;
    }

    /**
     * @return {@link #profile} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    public StructureDefinition getProfileTarget() {
        if (this.profileTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceComponent.profile");
            else if (Configuration.doAutoCreate())
                // aa
                this.profileTarget = new StructureDefinition();
        return this.profileTarget;
    }

    /**
     * @param value {@link #profile} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}.)
     */
    public ConformanceRestResourceComponent setProfileTarget(StructureDefinition value) {
        this.profileTarget = value;
        return this;
    }

    /**
     * @return {@link #interaction} (Identifies a restful operation supported by the solution.)
     */
    public List<ResourceInteractionComponent> getInteraction() {
        if (this.interaction == null)
            this.interaction = new ArrayList<ResourceInteractionComponent>();
        return this.interaction;
    }

    public boolean hasInteraction() {
        if (this.interaction == null)
            return false;
        for (ResourceInteractionComponent item : this.interaction) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ResourceInteractionComponent addInteraction() {
        // 3
        ResourceInteractionComponent t = new ResourceInteractionComponent();
        if (this.interaction == null)
            this.interaction = new ArrayList<ResourceInteractionComponent>();
        this.interaction.add(t);
        return t;
    }

    // syntactic sugar
    public ConformanceRestResourceComponent addInteraction(ResourceInteractionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.interaction == null)
            this.interaction = new ArrayList<ResourceInteractionComponent>();
        this.interaction.add(t);
        return this;
    }

    /**
     * @return {@link #versioning} (This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.). This is the underlying object with id, value and extensions. The accessor "getVersioning" gives direct access to the value
     */
    public Enumeration<ResourceVersionPolicy> getVersioningElement() {
        if (this.versioning == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceComponent.versioning");
            else if (Configuration.doAutoCreate())
                // bb
                this.versioning = new Enumeration<ResourceVersionPolicy>(new ResourceVersionPolicyEnumFactory());
        return this.versioning;
    }

    public boolean hasVersioningElement() {
        return this.versioning != null && !this.versioning.isEmpty();
    }

    public boolean hasVersioning() {
        return this.versioning != null && !this.versioning.isEmpty();
    }

    /**
     * @param value {@link #versioning} (This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.). This is the underlying object with id, value and extensions. The accessor "getVersioning" gives direct access to the value
     */
    public ConformanceRestResourceComponent setVersioningElement(Enumeration<ResourceVersionPolicy> value) {
        this.versioning = value;
        return this;
    }

    /**
     * @return This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
     */
    public ResourceVersionPolicy getVersioning() {
        return this.versioning == null ? null : this.versioning.getValue();
    }

    /**
     * @param value This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
     */
    public ConformanceRestResourceComponent setVersioning(ResourceVersionPolicy value) {
        if (value == null)
            this.versioning = null;
        else {
            if (this.versioning == null)
                this.versioning = new Enumeration<ResourceVersionPolicy>(new ResourceVersionPolicyEnumFactory());
            this.versioning.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #readHistory} (A flag for whether the server is able to return past versions as part of the vRead operation.). This is the underlying object with id, value and extensions. The accessor "getReadHistory" gives direct access to the value
     */
    public BooleanType getReadHistoryElement() {
        if (this.readHistory == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceComponent.readHistory");
            else if (Configuration.doAutoCreate())
                // bb
                this.readHistory = new BooleanType();
        return this.readHistory;
    }

    public boolean hasReadHistoryElement() {
        return this.readHistory != null && !this.readHistory.isEmpty();
    }

    public boolean hasReadHistory() {
        return this.readHistory != null && !this.readHistory.isEmpty();
    }

    /**
     * @param value {@link #readHistory} (A flag for whether the server is able to return past versions as part of the vRead operation.). This is the underlying object with id, value and extensions. The accessor "getReadHistory" gives direct access to the value
     */
    public ConformanceRestResourceComponent setReadHistoryElement(BooleanType value) {
        this.readHistory = value;
        return this;
    }

    /**
     * @return A flag for whether the server is able to return past versions as part of the vRead operation.
     */
    public boolean getReadHistory() {
        return this.readHistory == null || this.readHistory.isEmpty() ? false : this.readHistory.getValue();
    }

    /**
     * @param value A flag for whether the server is able to return past versions as part of the vRead operation.
     */
    public ConformanceRestResourceComponent setReadHistory(boolean value) {
        if (this.readHistory == null)
            this.readHistory = new BooleanType();
        this.readHistory.setValue(value);
        return this;
    }

    /**
     * @return {@link #updateCreate} (A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.). This is the underlying object with id, value and extensions. The accessor "getUpdateCreate" gives direct access to the value
     */
    public BooleanType getUpdateCreateElement() {
        if (this.updateCreate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceComponent.updateCreate");
            else if (Configuration.doAutoCreate())
                // bb
                this.updateCreate = new BooleanType();
        return this.updateCreate;
    }

    public boolean hasUpdateCreateElement() {
        return this.updateCreate != null && !this.updateCreate.isEmpty();
    }

    public boolean hasUpdateCreate() {
        return this.updateCreate != null && !this.updateCreate.isEmpty();
    }

    /**
     * @param value {@link #updateCreate} (A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.). This is the underlying object with id, value and extensions. The accessor "getUpdateCreate" gives direct access to the value
     */
    public ConformanceRestResourceComponent setUpdateCreateElement(BooleanType value) {
        this.updateCreate = value;
        return this;
    }

    /**
     * @return A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
     */
    public boolean getUpdateCreate() {
        return this.updateCreate == null || this.updateCreate.isEmpty() ? false : this.updateCreate.getValue();
    }

    /**
     * @param value A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
     */
    public ConformanceRestResourceComponent setUpdateCreate(boolean value) {
        if (this.updateCreate == null)
            this.updateCreate = new BooleanType();
        this.updateCreate.setValue(value);
        return this;
    }

    /**
     * @return {@link #conditionalCreate} (A flag that indicates that the server supports conditional create.). This is the underlying object with id, value and extensions. The accessor "getConditionalCreate" gives direct access to the value
     */
    public BooleanType getConditionalCreateElement() {
        if (this.conditionalCreate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceComponent.conditionalCreate");
            else if (Configuration.doAutoCreate())
                // bb
                this.conditionalCreate = new BooleanType();
        return this.conditionalCreate;
    }

    public boolean hasConditionalCreateElement() {
        return this.conditionalCreate != null && !this.conditionalCreate.isEmpty();
    }

    public boolean hasConditionalCreate() {
        return this.conditionalCreate != null && !this.conditionalCreate.isEmpty();
    }

    /**
     * @param value {@link #conditionalCreate} (A flag that indicates that the server supports conditional create.). This is the underlying object with id, value and extensions. The accessor "getConditionalCreate" gives direct access to the value
     */
    public ConformanceRestResourceComponent setConditionalCreateElement(BooleanType value) {
        this.conditionalCreate = value;
        return this;
    }

    /**
     * @return A flag that indicates that the server supports conditional create.
     */
    public boolean getConditionalCreate() {
        return this.conditionalCreate == null || this.conditionalCreate.isEmpty() ? false : this.conditionalCreate.getValue();
    }

    /**
     * @param value A flag that indicates that the server supports conditional create.
     */
    public ConformanceRestResourceComponent setConditionalCreate(boolean value) {
        if (this.conditionalCreate == null)
            this.conditionalCreate = new BooleanType();
        this.conditionalCreate.setValue(value);
        return this;
    }

    /**
     * @return {@link #conditionalUpdate} (A flag that indicates that the server supports conditional update.). This is the underlying object with id, value and extensions. The accessor "getConditionalUpdate" gives direct access to the value
     */
    public BooleanType getConditionalUpdateElement() {
        if (this.conditionalUpdate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceComponent.conditionalUpdate");
            else if (Configuration.doAutoCreate())
                // bb
                this.conditionalUpdate = new BooleanType();
        return this.conditionalUpdate;
    }

    public boolean hasConditionalUpdateElement() {
        return this.conditionalUpdate != null && !this.conditionalUpdate.isEmpty();
    }

    public boolean hasConditionalUpdate() {
        return this.conditionalUpdate != null && !this.conditionalUpdate.isEmpty();
    }

    /**
     * @param value {@link #conditionalUpdate} (A flag that indicates that the server supports conditional update.). This is the underlying object with id, value and extensions. The accessor "getConditionalUpdate" gives direct access to the value
     */
    public ConformanceRestResourceComponent setConditionalUpdateElement(BooleanType value) {
        this.conditionalUpdate = value;
        return this;
    }

    /**
     * @return A flag that indicates that the server supports conditional update.
     */
    public boolean getConditionalUpdate() {
        return this.conditionalUpdate == null || this.conditionalUpdate.isEmpty() ? false : this.conditionalUpdate.getValue();
    }

    /**
     * @param value A flag that indicates that the server supports conditional update.
     */
    public ConformanceRestResourceComponent setConditionalUpdate(boolean value) {
        if (this.conditionalUpdate == null)
            this.conditionalUpdate = new BooleanType();
        this.conditionalUpdate.setValue(value);
        return this;
    }

    /**
     * @return {@link #conditionalDelete} (A code that indicates how the server supports conditional delete.). This is the underlying object with id, value and extensions. The accessor "getConditionalDelete" gives direct access to the value
     */
    public Enumeration<ConditionalDeleteStatus> getConditionalDeleteElement() {
        if (this.conditionalDelete == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceRestResourceComponent.conditionalDelete");
            else if (Configuration.doAutoCreate())
                // bb
                this.conditionalDelete = new Enumeration<ConditionalDeleteStatus>(new ConditionalDeleteStatusEnumFactory());
        return this.conditionalDelete;
    }

    public boolean hasConditionalDeleteElement() {
        return this.conditionalDelete != null && !this.conditionalDelete.isEmpty();
    }

    public boolean hasConditionalDelete() {
        return this.conditionalDelete != null && !this.conditionalDelete.isEmpty();
    }

    /**
     * @param value {@link #conditionalDelete} (A code that indicates how the server supports conditional delete.). This is the underlying object with id, value and extensions. The accessor "getConditionalDelete" gives direct access to the value
     */
    public ConformanceRestResourceComponent setConditionalDeleteElement(Enumeration<ConditionalDeleteStatus> value) {
        this.conditionalDelete = value;
        return this;
    }

    /**
     * @return A code that indicates how the server supports conditional delete.
     */
    public ConditionalDeleteStatus getConditionalDelete() {
        return this.conditionalDelete == null ? null : this.conditionalDelete.getValue();
    }

    /**
     * @param value A code that indicates how the server supports conditional delete.
     */
    public ConformanceRestResourceComponent setConditionalDelete(ConditionalDeleteStatus value) {
        if (value == null)
            this.conditionalDelete = null;
        else {
            if (this.conditionalDelete == null)
                this.conditionalDelete = new Enumeration<ConditionalDeleteStatus>(new ConditionalDeleteStatusEnumFactory());
            this.conditionalDelete.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #searchInclude} (A list of _include values supported by the server.)
     */
    public List<StringType> getSearchInclude() {
        if (this.searchInclude == null)
            this.searchInclude = new ArrayList<StringType>();
        return this.searchInclude;
    }

    public boolean hasSearchInclude() {
        if (this.searchInclude == null)
            return false;
        for (StringType item : this.searchInclude) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public StringType addSearchIncludeElement() {
        // 2
        StringType t = new StringType();
        if (this.searchInclude == null)
            this.searchInclude = new ArrayList<StringType>();
        this.searchInclude.add(t);
        return t;
    }

    /**
     * @param value {@link #searchInclude} (A list of _include values supported by the server.)
     */
    public ConformanceRestResourceComponent addSearchInclude(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.searchInclude == null)
            this.searchInclude = new ArrayList<StringType>();
        this.searchInclude.add(t);
        return this;
    }

    /**
     * @param value {@link #searchInclude} (A list of _include values supported by the server.)
     */
    public boolean hasSearchInclude(String value) {
        if (this.searchInclude == null)
            return false;
        for (StringType v : this.searchInclude) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #searchRevInclude} (A list of _revinclude (reverse include) values supported by the server.)
     */
    public List<StringType> getSearchRevInclude() {
        if (this.searchRevInclude == null)
            this.searchRevInclude = new ArrayList<StringType>();
        return this.searchRevInclude;
    }

    public boolean hasSearchRevInclude() {
        if (this.searchRevInclude == null)
            return false;
        for (StringType item : this.searchRevInclude) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public StringType addSearchRevIncludeElement() {
        // 2
        StringType t = new StringType();
        if (this.searchRevInclude == null)
            this.searchRevInclude = new ArrayList<StringType>();
        this.searchRevInclude.add(t);
        return t;
    }

    /**
     * @param value {@link #searchRevInclude} (A list of _revinclude (reverse include) values supported by the server.)
     */
    public ConformanceRestResourceComponent addSearchRevInclude(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.searchRevInclude == null)
            this.searchRevInclude = new ArrayList<StringType>();
        this.searchRevInclude.add(t);
        return this;
    }

    /**
     * @param value {@link #searchRevInclude} (A list of _revinclude (reverse include) values supported by the server.)
     */
    public boolean hasSearchRevInclude(String value) {
        if (this.searchRevInclude == null)
            return false;
        for (StringType v : this.searchRevInclude) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #searchParam} (Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.)
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
    public ConformanceRestResourceComponent addSearchParam(ConformanceRestResourceSearchParamComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.searchParam == null)
            this.searchParam = new ArrayList<ConformanceRestResourceSearchParamComponent>();
        this.searchParam.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "A type of resource exposed via the restful interface.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("profile", "Reference(StructureDefinition)", "A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}.", 0, java.lang.Integer.MAX_VALUE, profile));
        childrenList.add(new Property("interaction", "", "Identifies a restful operation supported by the solution.", 0, java.lang.Integer.MAX_VALUE, interaction));
        childrenList.add(new Property("versioning", "code", "This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.", 0, java.lang.Integer.MAX_VALUE, versioning));
        childrenList.add(new Property("readHistory", "boolean", "A flag for whether the server is able to return past versions as part of the vRead operation.", 0, java.lang.Integer.MAX_VALUE, readHistory));
        childrenList.add(new Property("updateCreate", "boolean", "A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.", 0, java.lang.Integer.MAX_VALUE, updateCreate));
        childrenList.add(new Property("conditionalCreate", "boolean", "A flag that indicates that the server supports conditional create.", 0, java.lang.Integer.MAX_VALUE, conditionalCreate));
        childrenList.add(new Property("conditionalUpdate", "boolean", "A flag that indicates that the server supports conditional update.", 0, java.lang.Integer.MAX_VALUE, conditionalUpdate));
        childrenList.add(new Property("conditionalDelete", "code", "A code that indicates how the server supports conditional delete.", 0, java.lang.Integer.MAX_VALUE, conditionalDelete));
        childrenList.add(new Property("searchInclude", "string", "A list of _include values supported by the server.", 0, java.lang.Integer.MAX_VALUE, searchInclude));
        childrenList.add(new Property("searchRevInclude", "string", "A list of _revinclude (reverse include) values supported by the server.", 0, java.lang.Integer.MAX_VALUE, searchRevInclude));
        childrenList.add(new Property("searchParam", "", "Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.", 0, java.lang.Integer.MAX_VALUE, searchParam));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // CodeType
            this.type = castToCode(value);
        else if (name.equals("profile"))
            // Reference
            this.profile = castToReference(value);
        else if (name.equals("interaction"))
            this.getInteraction().add((ResourceInteractionComponent) value);
        else if (name.equals("versioning"))
            // Enumeration<ResourceVersionPolicy>
            this.versioning = new ResourceVersionPolicyEnumFactory().fromType(value);
        else if (name.equals("readHistory"))
            // BooleanType
            this.readHistory = castToBoolean(value);
        else if (name.equals("updateCreate"))
            // BooleanType
            this.updateCreate = castToBoolean(value);
        else if (name.equals("conditionalCreate"))
            // BooleanType
            this.conditionalCreate = castToBoolean(value);
        else if (name.equals("conditionalUpdate"))
            // BooleanType
            this.conditionalUpdate = castToBoolean(value);
        else if (name.equals("conditionalDelete"))
            // Enumeration<ConditionalDeleteStatus>
            this.conditionalDelete = new ConditionalDeleteStatusEnumFactory().fromType(value);
        else if (name.equals("searchInclude"))
            this.getSearchInclude().add(castToString(value));
        else if (name.equals("searchRevInclude"))
            this.getSearchRevInclude().add(castToString(value));
        else if (name.equals("searchParam"))
            this.getSearchParam().add((ConformanceRestResourceSearchParamComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.type");
        } else if (name.equals("profile")) {
            this.profile = new Reference();
            return this.profile;
        } else if (name.equals("interaction")) {
            return addInteraction();
        } else if (name.equals("versioning")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.versioning");
        } else if (name.equals("readHistory")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.readHistory");
        } else if (name.equals("updateCreate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.updateCreate");
        } else if (name.equals("conditionalCreate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.conditionalCreate");
        } else if (name.equals("conditionalUpdate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.conditionalUpdate");
        } else if (name.equals("conditionalDelete")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.conditionalDelete");
        } else if (name.equals("searchInclude")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.searchInclude");
        } else if (name.equals("searchRevInclude")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.searchRevInclude");
        } else if (name.equals("searchParam")) {
            return addSearchParam();
        } else
            return super.addChild(name);
    }

    public ConformanceRestResourceComponent copy() {
        ConformanceRestResourceComponent dst = new ConformanceRestResourceComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.profile = profile == null ? null : profile.copy();
        if (interaction != null) {
            dst.interaction = new ArrayList<ResourceInteractionComponent>();
            for (ResourceInteractionComponent i : interaction) dst.interaction.add(i.copy());
        }
        ;
        dst.versioning = versioning == null ? null : versioning.copy();
        dst.readHistory = readHistory == null ? null : readHistory.copy();
        dst.updateCreate = updateCreate == null ? null : updateCreate.copy();
        dst.conditionalCreate = conditionalCreate == null ? null : conditionalCreate.copy();
        dst.conditionalUpdate = conditionalUpdate == null ? null : conditionalUpdate.copy();
        dst.conditionalDelete = conditionalDelete == null ? null : conditionalDelete.copy();
        if (searchInclude != null) {
            dst.searchInclude = new ArrayList<StringType>();
            for (StringType i : searchInclude) dst.searchInclude.add(i.copy());
        }
        ;
        if (searchRevInclude != null) {
            dst.searchRevInclude = new ArrayList<StringType>();
            for (StringType i : searchRevInclude) dst.searchRevInclude.add(i.copy());
        }
        ;
        if (searchParam != null) {
            dst.searchParam = new ArrayList<ConformanceRestResourceSearchParamComponent>();
            for (ConformanceRestResourceSearchParamComponent i : searchParam) dst.searchParam.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceRestResourceComponent))
            return false;
        ConformanceRestResourceComponent o = (ConformanceRestResourceComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(profile, o.profile, true) && compareDeep(interaction, o.interaction, true) && compareDeep(versioning, o.versioning, true) && compareDeep(readHistory, o.readHistory, true) && compareDeep(updateCreate, o.updateCreate, true) && compareDeep(conditionalCreate, o.conditionalCreate, true) && compareDeep(conditionalUpdate, o.conditionalUpdate, true) && compareDeep(conditionalDelete, o.conditionalDelete, true) && compareDeep(searchInclude, o.searchInclude, true) && compareDeep(searchRevInclude, o.searchRevInclude, true) && compareDeep(searchParam, o.searchParam, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceRestResourceComponent))
            return false;
        ConformanceRestResourceComponent o = (ConformanceRestResourceComponent) other;
        return compareValues(type, o.type, true) && compareValues(versioning, o.versioning, true) && compareValues(readHistory, o.readHistory, true) && compareValues(updateCreate, o.updateCreate, true) && compareValues(conditionalCreate, o.conditionalCreate, true) && compareValues(conditionalUpdate, o.conditionalUpdate, true) && compareValues(conditionalDelete, o.conditionalDelete, true) && compareValues(searchInclude, o.searchInclude, true) && compareValues(searchRevInclude, o.searchRevInclude, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (profile == null || profile.isEmpty()) && (interaction == null || interaction.isEmpty()) && (versioning == null || versioning.isEmpty()) && (readHistory == null || readHistory.isEmpty()) && (updateCreate == null || updateCreate.isEmpty()) && (conditionalCreate == null || conditionalCreate.isEmpty()) && (conditionalUpdate == null || conditionalUpdate.isEmpty()) && (conditionalDelete == null || conditionalDelete.isEmpty()) && (searchInclude == null || searchInclude.isEmpty()) && (searchRevInclude == null || searchRevInclude.isEmpty()) && (searchParam == null || searchParam.isEmpty());
    }

    public String fhirType() {
        return "Conformance.rest.resource";
    }
}
