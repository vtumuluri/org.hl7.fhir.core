package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.SubscriptionEnum.SubscriptionChannelTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.SubscriptionEnum.SubscriptionChannelType;
import org.hl7.fhir.android.generated.dstu2.SubscriptionEnum.SubscriptionStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.SubscriptionEnum.SubscriptionStatus;

public class SubscriptionChannelComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The type of channel to send notifications on.
     */
    protected Enumeration<SubscriptionChannelType> type;

    /**
     * The uri that describes the actual end-point to send messages to.
     */
    protected UriType endpoint;

    /**
     * The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.
     */
    protected StringType payload;

    /**
     * Additional headers / information to send as part of the notification.
     */
    protected StringType header;

    private static final long serialVersionUID = -279715391L;

    /*
     * Constructor
     */
    public SubscriptionChannelComponent() {
        super();
    }

    /*
     * Constructor
     */
    public SubscriptionChannelComponent(Enumeration<SubscriptionChannelType> type, StringType payload) {
        super();
        this.type = type;
        this.payload = payload;
    }

    /**
     * @return {@link #type} (The type of channel to send notifications on.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<SubscriptionChannelType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubscriptionChannelComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<SubscriptionChannelType>(new SubscriptionChannelTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of channel to send notifications on.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public SubscriptionChannelComponent setTypeElement(Enumeration<SubscriptionChannelType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return The type of channel to send notifications on.
     */
    public SubscriptionChannelType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The type of channel to send notifications on.
     */
    public SubscriptionChannelComponent setType(SubscriptionChannelType value) {
        if (this.type == null)
            this.type = new Enumeration<SubscriptionChannelType>(new SubscriptionChannelTypeEnumFactory());
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #endpoint} (The uri that describes the actual end-point to send messages to.). This is the underlying object with id, value and extensions. The accessor "getEndpoint" gives direct access to the value
     */
    public UriType getEndpointElement() {
        if (this.endpoint == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubscriptionChannelComponent.endpoint");
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
     * @param value {@link #endpoint} (The uri that describes the actual end-point to send messages to.). This is the underlying object with id, value and extensions. The accessor "getEndpoint" gives direct access to the value
     */
    public SubscriptionChannelComponent setEndpointElement(UriType value) {
        this.endpoint = value;
        return this;
    }

    /**
     * @return The uri that describes the actual end-point to send messages to.
     */
    public String getEndpoint() {
        return this.endpoint == null ? null : this.endpoint.getValue();
    }

    /**
     * @param value The uri that describes the actual end-point to send messages to.
     */
    public SubscriptionChannelComponent setEndpoint(String value) {
        if (Utilities.noString(value))
            this.endpoint = null;
        else {
            if (this.endpoint == null)
                this.endpoint = new UriType();
            this.endpoint.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #payload} (The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.). This is the underlying object with id, value and extensions. The accessor "getPayload" gives direct access to the value
     */
    public StringType getPayloadElement() {
        if (this.payload == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubscriptionChannelComponent.payload");
            else if (Configuration.doAutoCreate())
                // bb
                this.payload = new StringType();
        return this.payload;
    }

    public boolean hasPayloadElement() {
        return this.payload != null && !this.payload.isEmpty();
    }

    public boolean hasPayload() {
        return this.payload != null && !this.payload.isEmpty();
    }

    /**
     * @param value {@link #payload} (The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.). This is the underlying object with id, value and extensions. The accessor "getPayload" gives direct access to the value
     */
    public SubscriptionChannelComponent setPayloadElement(StringType value) {
        this.payload = value;
        return this;
    }

    /**
     * @return The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.
     */
    public String getPayload() {
        return this.payload == null ? null : this.payload.getValue();
    }

    /**
     * @param value The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.
     */
    public SubscriptionChannelComponent setPayload(String value) {
        if (this.payload == null)
            this.payload = new StringType();
        this.payload.setValue(value);
        return this;
    }

    /**
     * @return {@link #header} (Additional headers / information to send as part of the notification.). This is the underlying object with id, value and extensions. The accessor "getHeader" gives direct access to the value
     */
    public StringType getHeaderElement() {
        if (this.header == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubscriptionChannelComponent.header");
            else if (Configuration.doAutoCreate())
                // bb
                this.header = new StringType();
        return this.header;
    }

    public boolean hasHeaderElement() {
        return this.header != null && !this.header.isEmpty();
    }

    public boolean hasHeader() {
        return this.header != null && !this.header.isEmpty();
    }

    /**
     * @param value {@link #header} (Additional headers / information to send as part of the notification.). This is the underlying object with id, value and extensions. The accessor "getHeader" gives direct access to the value
     */
    public SubscriptionChannelComponent setHeaderElement(StringType value) {
        this.header = value;
        return this;
    }

    /**
     * @return Additional headers / information to send as part of the notification.
     */
    public String getHeader() {
        return this.header == null ? null : this.header.getValue();
    }

    /**
     * @param value Additional headers / information to send as part of the notification.
     */
    public SubscriptionChannelComponent setHeader(String value) {
        if (Utilities.noString(value))
            this.header = null;
        else {
            if (this.header == null)
                this.header = new StringType();
            this.header.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "The type of channel to send notifications on.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("endpoint", "uri", "The uri that describes the actual end-point to send messages to.", 0, java.lang.Integer.MAX_VALUE, endpoint));
        childrenList.add(new Property("payload", "string", "The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.", 0, java.lang.Integer.MAX_VALUE, payload));
        childrenList.add(new Property("header", "string", "Additional headers / information to send as part of the notification.", 0, java.lang.Integer.MAX_VALUE, header));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Enumeration<SubscriptionChannelType>
            this.type = new SubscriptionChannelTypeEnumFactory().fromType(value);
        else if (name.equals("endpoint"))
            // UriType
            this.endpoint = castToUri(value);
        else if (name.equals("payload"))
            // StringType
            this.payload = castToString(value);
        else if (name.equals("header"))
            // StringType
            this.header = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type Subscription.type");
        } else if (name.equals("endpoint")) {
            throw new FHIRException("Cannot call addChild on a primitive type Subscription.endpoint");
        } else if (name.equals("payload")) {
            throw new FHIRException("Cannot call addChild on a primitive type Subscription.payload");
        } else if (name.equals("header")) {
            throw new FHIRException("Cannot call addChild on a primitive type Subscription.header");
        } else
            return super.addChild(name);
    }

    public SubscriptionChannelComponent copy() {
        SubscriptionChannelComponent dst = new SubscriptionChannelComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.endpoint = endpoint == null ? null : endpoint.copy();
        dst.payload = payload == null ? null : payload.copy();
        dst.header = header == null ? null : header.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SubscriptionChannelComponent))
            return false;
        SubscriptionChannelComponent o = (SubscriptionChannelComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(endpoint, o.endpoint, true) && compareDeep(payload, o.payload, true) && compareDeep(header, o.header, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SubscriptionChannelComponent))
            return false;
        SubscriptionChannelComponent o = (SubscriptionChannelComponent) other;
        return compareValues(type, o.type, true) && compareValues(endpoint, o.endpoint, true) && compareValues(payload, o.payload, true) && compareValues(header, o.header, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (endpoint == null || endpoint.isEmpty()) && (payload == null || payload.isEmpty()) && (header == null || header.isEmpty());
    }

    public String fhirType() {
        return "Subscription.channel";
    }
}
