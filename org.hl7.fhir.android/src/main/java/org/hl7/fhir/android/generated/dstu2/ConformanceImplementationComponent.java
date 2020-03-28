package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.Enumerations.SearchParamType;
import org.hl7.fhir.android.generated.dstu2.Enumerations.SearchParamTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseConformance;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceEventModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TypeRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.UnknownContentCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.RestfulConformanceModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteraction;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SystemRestfulInteractionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.DocumentModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatus;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConditionalDeleteStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.MessageSignificanceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKind;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ConformanceStatementKindEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicy;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.ResourceVersionPolicyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.SearchModifierCodeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionMode;
import org.hl7.fhir.android.generated.dstu2.ConformanceEnum.TransactionModeEnumFactory;

public class ConformanceImplementationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Information about the specific installation that this conformance statement relates to.
     */
    protected StringType description;

    /**
     * An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
     */
    protected UriType url;

    private static final long serialVersionUID = -289238508L;

    /*
     * Constructor
     */
    public ConformanceImplementationComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConformanceImplementationComponent(StringType description) {
        super();
        this.description = description;
    }

    /**
     * @return {@link #description} (Information about the specific installation that this conformance statement relates to.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceImplementationComponent.description");
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
     * @param value {@link #description} (Information about the specific installation that this conformance statement relates to.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ConformanceImplementationComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Information about the specific installation that this conformance statement relates to.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Information about the specific installation that this conformance statement relates to.
     */
    public ConformanceImplementationComponent setDescription(String value) {
        if (this.description == null)
            this.description = new StringType();
        this.description.setValue(value);
        return this;
    }

    /**
     * @return {@link #url} (An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() {
        if (this.url == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceImplementationComponent.url");
            else if (Configuration.doAutoCreate())
                // bb
                this.url = new UriType();
        return this.url;
    }

    public boolean hasUrlElement() {
        return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() {
        return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public ConformanceImplementationComponent setUrlElement(UriType value) {
        this.url = value;
        return this;
    }

    /**
     * @return An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
     */
    public String getUrl() {
        return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
     */
    public ConformanceImplementationComponent setUrl(String value) {
        if (Utilities.noString(value))
            this.url = null;
        else {
            if (this.url == null)
                this.url = new UriType();
            this.url.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("description", "string", "Information about the specific installation that this conformance statement relates to.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("url", "uri", "An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.", 0, java.lang.Integer.MAX_VALUE, url));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("url"))
            // UriType
            this.url = castToUri(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.description");
        } else if (name.equals("url")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.url");
        } else
            return super.addChild(name);
    }

    public ConformanceImplementationComponent copy() {
        ConformanceImplementationComponent dst = new ConformanceImplementationComponent();
        copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.url = url == null ? null : url.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceImplementationComponent))
            return false;
        ConformanceImplementationComponent o = (ConformanceImplementationComponent) other;
        return compareDeep(description, o.description, true) && compareDeep(url, o.url, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceImplementationComponent))
            return false;
        ConformanceImplementationComponent o = (ConformanceImplementationComponent) other;
        return compareValues(description, o.description, true) && compareValues(url, o.url, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (description == null || description.isEmpty()) && (url == null || url.isEmpty());
    }

    public String fhirType() {
        return "Conformance.implementation";
    }
}
