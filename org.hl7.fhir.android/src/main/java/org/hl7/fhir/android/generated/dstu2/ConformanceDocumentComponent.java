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

public class ConformanceDocumentComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Mode of this document declaration - whether application is producer or consumer.
     */
    protected Enumeration<DocumentMode> mode;

    /**
     * A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.
     */
    protected StringType documentation;

    /**
     * A constraint on a resource used in the document.
     */
    protected Reference profile;

    /**
     * The actual object that is the target of the reference (A constraint on a resource used in the document.)
     */
    protected StructureDefinition profileTarget;

    private static final long serialVersionUID = -1059555053L;

    /*
     * Constructor
     */
    public ConformanceDocumentComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConformanceDocumentComponent(Enumeration<DocumentMode> mode, Reference profile) {
        super();
        this.mode = mode;
        this.profile = profile;
    }

    /**
     * @return {@link #mode} (Mode of this document declaration - whether application is producer or consumer.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public Enumeration<DocumentMode> getModeElement() {
        if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceDocumentComponent.mode");
            else if (Configuration.doAutoCreate())
                // bb
                this.mode = new Enumeration<DocumentMode>(new DocumentModeEnumFactory());
        return this.mode;
    }

    public boolean hasModeElement() {
        return this.mode != null && !this.mode.isEmpty();
    }

    public boolean hasMode() {
        return this.mode != null && !this.mode.isEmpty();
    }

    /**
     * @param value {@link #mode} (Mode of this document declaration - whether application is producer or consumer.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public ConformanceDocumentComponent setModeElement(Enumeration<DocumentMode> value) {
        this.mode = value;
        return this;
    }

    /**
     * @return Mode of this document declaration - whether application is producer or consumer.
     */
    public DocumentMode getMode() {
        return this.mode == null ? null : this.mode.getValue();
    }

    /**
     * @param value Mode of this document declaration - whether application is producer or consumer.
     */
    public ConformanceDocumentComponent setMode(DocumentMode value) {
        if (this.mode == null)
            this.mode = new Enumeration<DocumentMode>(new DocumentModeEnumFactory());
        this.mode.setValue(value);
        return this;
    }

    /**
     * @return {@link #documentation} (A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public StringType getDocumentationElement() {
        if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceDocumentComponent.documentation");
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
     * @param value {@link #documentation} (A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public ConformanceDocumentComponent setDocumentationElement(StringType value) {
        this.documentation = value;
        return this;
    }

    /**
     * @return A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.
     */
    public String getDocumentation() {
        return this.documentation == null ? null : this.documentation.getValue();
    }

    /**
     * @param value A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.
     */
    public ConformanceDocumentComponent setDocumentation(String value) {
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
     * @return {@link #profile} (A constraint on a resource used in the document.)
     */
    public Reference getProfile() {
        if (this.profile == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceDocumentComponent.profile");
            else if (Configuration.doAutoCreate())
                // cc
                this.profile = new Reference();
        return this.profile;
    }

    public boolean hasProfile() {
        return this.profile != null && !this.profile.isEmpty();
    }

    /**
     * @param value {@link #profile} (A constraint on a resource used in the document.)
     */
    public ConformanceDocumentComponent setProfile(Reference value) {
        this.profile = value;
        return this;
    }

    /**
     * @return {@link #profile} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A constraint on a resource used in the document.)
     */
    public StructureDefinition getProfileTarget() {
        if (this.profileTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceDocumentComponent.profile");
            else if (Configuration.doAutoCreate())
                // aa
                this.profileTarget = new StructureDefinition();
        return this.profileTarget;
    }

    /**
     * @param value {@link #profile} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A constraint on a resource used in the document.)
     */
    public ConformanceDocumentComponent setProfileTarget(StructureDefinition value) {
        this.profileTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("mode", "code", "Mode of this document declaration - whether application is producer or consumer.", 0, java.lang.Integer.MAX_VALUE, mode));
        childrenList.add(new Property("documentation", "string", "A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.", 0, java.lang.Integer.MAX_VALUE, documentation));
        childrenList.add(new Property("profile", "Reference(StructureDefinition)", "A constraint on a resource used in the document.", 0, java.lang.Integer.MAX_VALUE, profile));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("mode"))
            // Enumeration<DocumentMode>
            this.mode = new DocumentModeEnumFactory().fromType(value);
        else if (name.equals("documentation"))
            // StringType
            this.documentation = castToString(value);
        else if (name.equals("profile"))
            // Reference
            this.profile = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("mode")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.mode");
        } else if (name.equals("documentation")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.documentation");
        } else if (name.equals("profile")) {
            this.profile = new Reference();
            return this.profile;
        } else
            return super.addChild(name);
    }

    public ConformanceDocumentComponent copy() {
        ConformanceDocumentComponent dst = new ConformanceDocumentComponent();
        copyValues(dst);
        dst.mode = mode == null ? null : mode.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        dst.profile = profile == null ? null : profile.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceDocumentComponent))
            return false;
        ConformanceDocumentComponent o = (ConformanceDocumentComponent) other;
        return compareDeep(mode, o.mode, true) && compareDeep(documentation, o.documentation, true) && compareDeep(profile, o.profile, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceDocumentComponent))
            return false;
        ConformanceDocumentComponent o = (ConformanceDocumentComponent) other;
        return compareValues(mode, o.mode, true) && compareValues(documentation, o.documentation, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (mode == null || mode.isEmpty()) && (documentation == null || documentation.isEmpty()) && (profile == null || profile.isEmpty());
    }

    public String fhirType() {
        return "Conformance.document";
    }
}
