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

public class MessageSourceComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Human-readable name for the source system.
     */
    protected StringType name;

    /**
     * May include configuration or other information useful in debugging.
     */
    protected StringType software;

    /**
     * Can convey versions of multiple systems in situations where a message passes through multiple hands.
     */
    protected StringType version;

    /**
     * An e-mail, phone, website or other contact point to use to resolve issues with message communications.
     */
    protected ContactPoint contact;

    /**
     * Identifies the routing target to send acknowledgements to.
     */
    protected UriType endpoint;

    private static final long serialVersionUID = -115878196L;

    /*
     * Constructor
     */
    public MessageSourceComponent() {
        super();
    }

    /*
     * Constructor
     */
    public MessageSourceComponent(UriType endpoint) {
        super();
        this.endpoint = endpoint;
    }

    /**
     * @return {@link #name} (Human-readable name for the source system.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageSourceComponent.name");
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
     * @param value {@link #name} (Human-readable name for the source system.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public MessageSourceComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return Human-readable name for the source system.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Human-readable name for the source system.
     */
    public MessageSourceComponent setName(String value) {
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
     * @return {@link #software} (May include configuration or other information useful in debugging.). This is the underlying object with id, value and extensions. The accessor "getSoftware" gives direct access to the value
     */
    public StringType getSoftwareElement() {
        if (this.software == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageSourceComponent.software");
            else if (Configuration.doAutoCreate())
                // bb
                this.software = new StringType();
        return this.software;
    }

    public boolean hasSoftwareElement() {
        return this.software != null && !this.software.isEmpty();
    }

    public boolean hasSoftware() {
        return this.software != null && !this.software.isEmpty();
    }

    /**
     * @param value {@link #software} (May include configuration or other information useful in debugging.). This is the underlying object with id, value and extensions. The accessor "getSoftware" gives direct access to the value
     */
    public MessageSourceComponent setSoftwareElement(StringType value) {
        this.software = value;
        return this;
    }

    /**
     * @return May include configuration or other information useful in debugging.
     */
    public String getSoftware() {
        return this.software == null ? null : this.software.getValue();
    }

    /**
     * @param value May include configuration or other information useful in debugging.
     */
    public MessageSourceComponent setSoftware(String value) {
        if (Utilities.noString(value))
            this.software = null;
        else {
            if (this.software == null)
                this.software = new StringType();
            this.software.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #version} (Can convey versions of multiple systems in situations where a message passes through multiple hands.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
        if (this.version == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageSourceComponent.version");
            else if (Configuration.doAutoCreate())
                // bb
                this.version = new StringType();
        return this.version;
    }

    public boolean hasVersionElement() {
        return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() {
        return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (Can convey versions of multiple systems in situations where a message passes through multiple hands.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public MessageSourceComponent setVersionElement(StringType value) {
        this.version = value;
        return this;
    }

    /**
     * @return Can convey versions of multiple systems in situations where a message passes through multiple hands.
     */
    public String getVersion() {
        return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value Can convey versions of multiple systems in situations where a message passes through multiple hands.
     */
    public MessageSourceComponent setVersion(String value) {
        if (Utilities.noString(value))
            this.version = null;
        else {
            if (this.version == null)
                this.version = new StringType();
            this.version.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #contact} (An e-mail, phone, website or other contact point to use to resolve issues with message communications.)
     */
    public ContactPoint getContact() {
        if (this.contact == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageSourceComponent.contact");
            else if (Configuration.doAutoCreate())
                // cc
                this.contact = new ContactPoint();
        return this.contact;
    }

    public boolean hasContact() {
        return this.contact != null && !this.contact.isEmpty();
    }

    /**
     * @param value {@link #contact} (An e-mail, phone, website or other contact point to use to resolve issues with message communications.)
     */
    public MessageSourceComponent setContact(ContactPoint value) {
        this.contact = value;
        return this;
    }

    /**
     * @return {@link #endpoint} (Identifies the routing target to send acknowledgements to.). This is the underlying object with id, value and extensions. The accessor "getEndpoint" gives direct access to the value
     */
    public UriType getEndpointElement() {
        if (this.endpoint == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MessageSourceComponent.endpoint");
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
     * @param value {@link #endpoint} (Identifies the routing target to send acknowledgements to.). This is the underlying object with id, value and extensions. The accessor "getEndpoint" gives direct access to the value
     */
    public MessageSourceComponent setEndpointElement(UriType value) {
        this.endpoint = value;
        return this;
    }

    /**
     * @return Identifies the routing target to send acknowledgements to.
     */
    public String getEndpoint() {
        return this.endpoint == null ? null : this.endpoint.getValue();
    }

    /**
     * @param value Identifies the routing target to send acknowledgements to.
     */
    public MessageSourceComponent setEndpoint(String value) {
        if (this.endpoint == null)
            this.endpoint = new UriType();
        this.endpoint.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("name", "string", "Human-readable name for the source system.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("software", "string", "May include configuration or other information useful in debugging.", 0, java.lang.Integer.MAX_VALUE, software));
        childrenList.add(new Property("version", "string", "Can convey versions of multiple systems in situations where a message passes through multiple hands.", 0, java.lang.Integer.MAX_VALUE, version));
        childrenList.add(new Property("contact", "ContactPoint", "An e-mail, phone, website or other contact point to use to resolve issues with message communications.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("endpoint", "uri", "Identifies the routing target to send acknowledgements to.", 0, java.lang.Integer.MAX_VALUE, endpoint));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("software"))
            // StringType
            this.software = castToString(value);
        else if (name.equals("version"))
            // StringType
            this.version = castToString(value);
        else if (name.equals("contact"))
            // ContactPoint
            this.contact = castToContactPoint(value);
        else if (name.equals("endpoint"))
            // UriType
            this.endpoint = castToUri(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type MessageHeader.name");
        } else if (name.equals("software")) {
            throw new FHIRException("Cannot call addChild on a primitive type MessageHeader.software");
        } else if (name.equals("version")) {
            throw new FHIRException("Cannot call addChild on a primitive type MessageHeader.version");
        } else if (name.equals("contact")) {
            this.contact = new ContactPoint();
            return this.contact;
        } else if (name.equals("endpoint")) {
            throw new FHIRException("Cannot call addChild on a primitive type MessageHeader.endpoint");
        } else
            return super.addChild(name);
    }

    public MessageSourceComponent copy() {
        MessageSourceComponent dst = new MessageSourceComponent();
        copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.software = software == null ? null : software.copy();
        dst.version = version == null ? null : version.copy();
        dst.contact = contact == null ? null : contact.copy();
        dst.endpoint = endpoint == null ? null : endpoint.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MessageSourceComponent))
            return false;
        MessageSourceComponent o = (MessageSourceComponent) other;
        return compareDeep(name, o.name, true) && compareDeep(software, o.software, true) && compareDeep(version, o.version, true) && compareDeep(contact, o.contact, true) && compareDeep(endpoint, o.endpoint, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MessageSourceComponent))
            return false;
        MessageSourceComponent o = (MessageSourceComponent) other;
        return compareValues(name, o.name, true) && compareValues(software, o.software, true) && compareValues(version, o.version, true) && compareValues(endpoint, o.endpoint, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (name == null || name.isEmpty()) && (software == null || software.isEmpty()) && (version == null || version.isEmpty()) && (contact == null || contact.isEmpty()) && (endpoint == null || endpoint.isEmpty());
    }

    public String fhirType() {
        return "MessageHeader.source";
    }
}
