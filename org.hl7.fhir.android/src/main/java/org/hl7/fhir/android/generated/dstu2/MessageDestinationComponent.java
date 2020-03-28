package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MessageHeaderEnum.ResponseTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.MessageHeaderEnum.ResponseType;

public class MessageDestinationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Human-readable name for the target system.
     */
    protected StringType name;

    /**
     * Identifies the target end system in situations where the initial message transmission is to an intermediary system.
     */
    protected Reference target;

    /**
     * The actual object that is the target of the reference (Identifies the target end system in situations where the initial message transmission is to an intermediary system.)
     */
    protected Device targetTarget;

    /**
     * Indicates where the message should be routed to.
     */
    protected UriType endpoint;

    private static final long serialVersionUID = -2097633309L;

    /*
     * Constructor
     */
    public MessageDestinationComponent() {
        super();
    }

    /*
     * Constructor
     */
    public MessageDestinationComponent(UriType endpoint) {
        super();
        this.endpoint = endpoint;
    }

    /**
     * @return {@link #name} (Human-readable name for the target system.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageDestinationComponent.name");
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
     * @param value {@link #name} (Human-readable name for the target system.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public MessageDestinationComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return Human-readable name for the target system.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Human-readable name for the target system.
     */
    public MessageDestinationComponent setName(String value) {
        if (Utilities.noString(value))
            this.name = null;
        else {
            if (this.name == null)
                this.name = new StringType();
            this.name.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #target} (Identifies the target end system in situations where the initial message transmission is to an intermediary system.)
     */
    public Reference getTarget() {
        if (this.target == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageDestinationComponent.target");
            else if (Configuration.doAutoCreate())
                // cc
                this.target = new Reference();
        return this.target;
    }

    public boolean hasTarget() {
        return this.target != null && !this.target.isEmpty();
    }

    /**
     * @param value {@link #target} (Identifies the target end system in situations where the initial message transmission is to an intermediary system.)
     */
    public MessageDestinationComponent setTarget(Reference value) {
        this.target = value;
        return this;
    }

    /**
     * @return {@link #target} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies the target end system in situations where the initial message transmission is to an intermediary system.)
     */
    public Device getTargetTarget() {
        if (this.targetTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageDestinationComponent.target");
            else if (Configuration.doAutoCreate())
                // aa
                this.targetTarget = new Device();
        return this.targetTarget;
    }

    /**
     * @param value {@link #target} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies the target end system in situations where the initial message transmission is to an intermediary system.)
     */
    public MessageDestinationComponent setTargetTarget(Device value) {
        this.targetTarget = value;
        return this;
    }

    /**
     * @return {@link #endpoint} (Indicates where the message should be routed to.). This is the underlying object with id, value and extensions. The accessor "getEndpoint" gives direct access to the value
     */
    public UriType getEndpointElement() {
        if (this.endpoint == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageDestinationComponent.endpoint");
            else if (Configuration.doAutoCreate())
                // bb
                this.endpoint = new UriType();
        return this.endpoint;
    }

    public boolean hasEndpointElement() {
        return this.endpoint != null && !this.endpoint.isEmpty();
    }

    public boolean hasEndpoint() {
        return this.endpoint != null && !this.endpoint.isEmpty();
    }

    /**
     * @param value {@link #endpoint} (Indicates where the message should be routed to.). This is the underlying object with id, value and extensions. The accessor "getEndpoint" gives direct access to the value
     */
    public MessageDestinationComponent setEndpointElement(UriType value) {
        this.endpoint = value;
        return this;
    }

    /**
     * @return Indicates where the message should be routed to.
     */
    public String getEndpoint() {
        return this.endpoint == null ? null : this.endpoint.getValue();
    }

    /**
     * @param value Indicates where the message should be routed to.
     */
    public MessageDestinationComponent setEndpoint(String value) {
        if (this.endpoint == null)
            this.endpoint = new UriType();
        this.endpoint.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "Human-readable name for the target system.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("target", "Reference(Device)", "Identifies the target end system in situations where the initial message transmission is to an intermediary system.", 0, java.lang.Integer.MAX_VALUE, target));
        childrenList.add(new Property("endpoint", "uri", "Indicates where the message should be routed to.", 0, java.lang.Integer.MAX_VALUE, endpoint));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("target"))
            // Reference
            this.target = castToReference(value);
        else if (name.equals("endpoint"))
            // UriType
            this.endpoint = castToUri(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type MessageHeader.name");
        } else if (name.equals("target")) {
            this.target = new Reference();
            return this.target;
        } else if (name.equals("endpoint")) {
            throw new FHIRException("Cannot call addChild on a primitive type MessageHeader.endpoint");
        } else
            return super.addChild(name);
    }

    public MessageDestinationComponent copy() {
        MessageDestinationComponent dst = new MessageDestinationComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.target = target == null ? null : target.copy();
        dst.endpoint = endpoint == null ? null : endpoint.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MessageDestinationComponent))
            return false;
        MessageDestinationComponent o = (MessageDestinationComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(target, o.target, true) && compareDeep(endpoint, o.endpoint, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MessageDestinationComponent))
            return false;
        MessageDestinationComponent o = (MessageDestinationComponent) other;
        return compareValues(name, o.name, true) && compareValues(endpoint, o.endpoint, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (target == null || target.isEmpty()) && (endpoint == null || endpoint.isEmpty());
    }

    public String fhirType() {
        return "MessageHeader.destination";
    }
}
