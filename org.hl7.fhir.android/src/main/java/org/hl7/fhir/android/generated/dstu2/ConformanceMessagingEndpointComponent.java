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

public class ConformanceMessagingEndpointComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A list of the messaging transport protocol(s) identifiers, supported by this endpoint.
     */
    protected Coding protocol;

    /**
     * The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.
     */
    protected UriType address;

    private static final long serialVersionUID = 1294656428L;

    /*
     * Constructor
     */
    public ConformanceMessagingEndpointComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ConformanceMessagingEndpointComponent(Coding protocol, UriType address) {
        super();
        this.protocol = protocol;
        this.address = address;
    }

    /**
     * @return {@link #protocol} (A list of the messaging transport protocol(s) identifiers, supported by this endpoint.)
     */
    public Coding getProtocol() {
        if (this.protocol == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEndpointComponent.protocol");
            else if (Configuration.doAutoCreate())
                // cc
                this.protocol = new Coding();
        return this.protocol;
    }

    public boolean hasProtocol() {
        return this.protocol != null && !this.protocol.isEmpty();
    }

    /**
     * @param value {@link #protocol} (A list of the messaging transport protocol(s) identifiers, supported by this endpoint.)
     */
    public ConformanceMessagingEndpointComponent setProtocol(Coding value) {
        this.protocol = value;
        return this;
    }

    /**
     * @return {@link #address} (The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.). This is the underlying object with id, value and extensions. The accessor "getAddress" gives direct access to the value
     */
    public UriType getAddressElement() {
        if (this.address == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConformanceMessagingEndpointComponent.address");
            else if (Configuration.doAutoCreate())
                // bb
                this.address = new UriType();
        return this.address;
    }

    public boolean hasAddressElement() {
        return this.address != null && !this.address.isEmpty();
    }

    public boolean hasAddress() {
        return this.address != null && !this.address.isEmpty();
    }

    /**
     * @param value {@link #address} (The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.). This is the underlying object with id, value and extensions. The accessor "getAddress" gives direct access to the value
     */
    public ConformanceMessagingEndpointComponent setAddressElement(UriType value) {
        this.address = value;
        return this;
    }

    /**
     * @return The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.
     */
    public String getAddress() {
        return this.address == null ? null : this.address.getValue();
    }

    /**
     * @param value The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.
     */
    public ConformanceMessagingEndpointComponent setAddress(String value) {
        if (this.address == null)
            this.address = new UriType();
        this.address.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("protocol", "Coding", "A list of the messaging transport protocol(s) identifiers, supported by this endpoint.", 0, java.lang.Integer.MAX_VALUE, protocol));
        childrenList.add(new Property("address", "uri", "The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.", 0, java.lang.Integer.MAX_VALUE, address));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("protocol"))
            // Coding
            this.protocol = castToCoding(value);
        else if (name.equals("address"))
            // UriType
            this.address = castToUri(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("protocol")) {
            this.protocol = new Coding();
            return this.protocol;
        } else if (name.equals("address")) {
            throw new FHIRException("Cannot call addChild on a primitive type Conformance.address");
        } else
            return super.addChild(name);
    }

    public ConformanceMessagingEndpointComponent copy() {
        ConformanceMessagingEndpointComponent dst = new ConformanceMessagingEndpointComponent();
        copyValues(dst);
        dst.protocol = protocol == null ? null : protocol.copy();
        dst.address = address == null ? null : address.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConformanceMessagingEndpointComponent))
            return false;
        ConformanceMessagingEndpointComponent o = (ConformanceMessagingEndpointComponent) other;
        return compareDeep(protocol, o.protocol, true) && compareDeep(address, o.address, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConformanceMessagingEndpointComponent))
            return false;
        ConformanceMessagingEndpointComponent o = (ConformanceMessagingEndpointComponent) other;
        return compareValues(address, o.address, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (protocol == null || protocol.isEmpty()) && (address == null || address.isEmpty());
    }

    public String fhirType() {
        return "Conformance.messaging.endpoint";
    }
}
