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

public class ConformanceMessagingComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An endpoint (network accessible address) to which messages and/or replies are to be sent.
     */
    protected List<ConformanceMessagingEndpointComponent> endpoint;

    /**
     * Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).
     */
    protected UnsignedIntType reliableCache;

    /**
     * Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
     */
    protected StringType documentation;

    /**
     * A description of the solution's support for an event at this end-point.
     */
    protected List<ConformanceMessagingEventComponent> event;

    private static final long serialVersionUID = -712362545L;

    /*
     * Constructor
     */
    public ConformanceMessagingComponent() {
        super();
    }

    /**
     * @return {@link #endpoint} (An endpoint (network accessible address) to which messages and/or replies are to be sent.)
     */
    public List<ConformanceMessagingEndpointComponent> getEndpoint() {
        if (this.endpoint == null)
            this.endpoint = new ArrayList<ConformanceMessagingEndpointComponent>();
        return this.endpoint;
    }

    public boolean hasEndpoint() {
        if (this.endpoint == null)
            return false;
        for (ConformanceMessagingEndpointComponent item : this.endpoint) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConformanceMessagingEndpointComponent addEndpoint() {
        // 3
        ConformanceMessagingEndpointComponent t = new ConformanceMessagingEndpointComponent();
        if (this.endpoint == null)
            this.endpoint = new ArrayList<ConformanceMessagingEndpointComponent>();
        this.endpoint.add(t);
        return t;
    }

    // syntactic sugar
    public ConformanceMessagingComponent addEndpoint(ConformanceMessagingEndpointComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.endpoint == null)
            this.endpoint = new ArrayList<ConformanceMessagingEndpointComponent>();
        this.endpoint.add(t);
        return this;
    }

    /**
     * @return {@link #reliableCache} (Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).). This is the underlying object with id, value and extensions. The accessor "getReliableCache" gives direct access to the value
     */
    public UnsignedIntType getReliableCacheElement() {
        if (this.reliableCache == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingComponent.reliableCache");
            else if (Configuration.doAutoCreate())
                // bb
                this.reliableCache = new UnsignedIntType();
        return this.reliableCache;
    }

    public boolean hasReliableCacheElement() {
        return this.reliableCache != null && !this.reliableCache.isEmpty();
    }

    public boolean hasReliableCache() {
        return this.reliableCache != null && !this.reliableCache.isEmpty();
    }

    /**
     * @param value {@link #reliableCache} (Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).). This is the underlying object with id, value and extensions. The accessor "getReliableCache" gives direct access to the value
     */
    public ConformanceMessagingComponent setReliableCacheElement(UnsignedIntType value) {
        this.reliableCache = value;
        return this;
    }

    /**
     * @return Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).
     */
    public int getReliableCache() {
        return this.reliableCache == null || this.reliableCache.isEmpty() ? 0 : this.reliableCache.getValue();
    }

    /**
     * @param value Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).
     */
    public ConformanceMessagingComponent setReliableCache(int value) {
        if (this.reliableCache == null)
            this.reliableCache = new UnsignedIntType();
        this.reliableCache.setValue(value);
        return this;
    }

    /**
     * @return {@link #documentation} (Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public StringType getDocumentationElement() {
        if (this.documentation == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingComponent.documentation");
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
     * @param value {@link #documentation} (Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.). This is the underlying object with id, value and extensions. The accessor "getDocumentation" gives direct access to the value
     */
    public ConformanceMessagingComponent setDocumentationElement(StringType value) {
        this.documentation = value;
        return this;
    }

    /**
     * @return Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
     */
    public String getDocumentation() {
        return this.documentation == null ? null : this.documentation.getValue();
    }

    /**
     * @param value Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
     */
    public ConformanceMessagingComponent setDocumentation(String value) {
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
     * @return {@link #event} (A description of the solution's support for an event at this end-point.)
     */
    public List<ConformanceMessagingEventComponent> getEvent() {
        if (this.event == null)
            this.event = new ArrayList<ConformanceMessagingEventComponent>();
        return this.event;
    }

    public boolean hasEvent() {
        if (this.event == null)
            return false;
        for (ConformanceMessagingEventComponent item : this.event) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ConformanceMessagingEventComponent addEvent() {
        // 3
        ConformanceMessagingEventComponent t = new ConformanceMessagingEventComponent();
        if (this.event == null)
            this.event = new ArrayList<ConformanceMessagingEventComponent>();
        this.event.add(t);
        return t;
    }

    // syntactic sugar
    public ConformanceMessagingComponent addEvent(ConformanceMessagingEventComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.event == null)
            this.event = new ArrayList<ConformanceMessagingEventComponent>();
        this.event.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("endpoint", "", "An endpoint (network accessible address) to which messages and/or replies are to be sent.", 0, java.lang.Integer.MAX_VALUE, endpoint));
        childrenList.add(new Property("reliableCache", "unsignedInt", "Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).", 0, java.lang.Integer.MAX_VALUE, reliableCache));
        childrenList.add(new Property("documentation", "string", "Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.", 0, java.lang.Integer.MAX_VALUE, documentation));
        childrenList.add(new Property("event", "", "A description of the solution's support for an event at this end-point.", 0, java.lang.Integer.MAX_VALUE, event));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("endpoint"))
            this.getEndpoint().add((ConformanceMessagingEndpointComponent) value);
        else if (name.equals("reliableCache"))
            // UnsignedIntType
            this.reliableCache = castToUnsignedInt(value);
        else if (name.equals("documentation"))
            // StringType
            this.documentation = castToString(value);
        else if (name.equals("event"))
            this.getEvent().add((ConformanceMessagingEventComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("endpoint")) {
            return addEndpoint();
        } else if (name.equals("reliableCache")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.reliableCache");
        } else if (name.equals("documentation")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.documentation");
        } else if (name.equals("event")) {
            return addEvent();
        } else
            return super.addChild(name);
    }

    public ConformanceMessagingComponent copy() {
        ConformanceMessagingComponent dst = new ConformanceMessagingComponent();
        copyValues(dst);
        if (endpoint != null) {
            dst.endpoint = new ArrayList<ConformanceMessagingEndpointComponent>();
            for (ConformanceMessagingEndpointComponent i : endpoint) dst.endpoint.add(i.copy());
        }
        ;
        dst.reliableCache = reliableCache == null ? null : reliableCache.copy();
        dst.documentation = documentation == null ? null : documentation.copy();
        if (event != null) {
            dst.event = new ArrayList<ConformanceMessagingEventComponent>();
            for (ConformanceMessagingEventComponent i : event) dst.event.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceMessagingComponent))
            return false;
        ConformanceMessagingComponent o = (ConformanceMessagingComponent) other;
        return compareDeep(endpoint, o.endpoint, true) && compareDeep(reliableCache, o.reliableCache, true) && compareDeep(documentation, o.documentation, true) && compareDeep(event, o.event, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceMessagingComponent))
            return false;
        ConformanceMessagingComponent o = (ConformanceMessagingComponent) other;
        return compareValues(reliableCache, o.reliableCache, true) && compareValues(documentation, o.documentation, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (endpoint == null || endpoint.isEmpty()) && (reliableCache == null || reliableCache.isEmpty()) && (documentation == null || documentation.isEmpty()) && (event == null || event.isEmpty());
    }

    public String fhirType() {
        return "Conformance.messaging";
    }
}
