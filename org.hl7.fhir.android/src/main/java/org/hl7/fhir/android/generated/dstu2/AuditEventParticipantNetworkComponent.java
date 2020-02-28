package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcome;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcomeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventAction;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventActionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkType;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkTypeEnumFactory;

public class AuditEventParticipantNetworkComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * An identifier for the network access point of the user device for the audit event.
     */
    protected StringType address;

    /**
     * An identifier for the type of network access point that originated the audit event.
     */
    protected Enumeration<AuditEventParticipantNetworkType> type;

    private static final long serialVersionUID = -1355220390L;

    /*
     * Constructor
     */
    public AuditEventParticipantNetworkComponent() {
        super();
    }

    /**
     * @return {@link #address} (An identifier for the network access point of the user device for the audit event.). This is the underlying object with id, value and extensions. The accessor "getAddress" gives direct access to the value
     */
    public StringType getAddressElement() {
        if (this.address == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantNetworkComponent.address");
            else if (Configuration.doAutoCreate())
                // bb
                this.address = new StringType();
        return this.address;
    }

    public boolean hasAddressElement() {
        return this.address != null && !this.address.isEmpty();
    }

    public boolean hasAddress() {
        return this.address != null && !this.address.isEmpty();
    }

    /**
     * @param value {@link #address} (An identifier for the network access point of the user device for the audit event.). This is the underlying object with id, value and extensions. The accessor "getAddress" gives direct access to the value
     */
    public AuditEventParticipantNetworkComponent setAddressElement(StringType value) {
        this.address = value;
        return this;
    }

    /**
     * @return An identifier for the network access point of the user device for the audit event.
     */
    public String getAddress() {
        return this.address == null ? null : this.address.getValue();
    }

    /**
     * @param value An identifier for the network access point of the user device for the audit event.
     */
    public AuditEventParticipantNetworkComponent setAddress(String value) {
        if (Utilities.noString(value))
            this.address = null;
        else {
            if (this.address == null)
                this.address = new StringType();
            this.address.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #type} (An identifier for the type of network access point that originated the audit event.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<AuditEventParticipantNetworkType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantNetworkComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<AuditEventParticipantNetworkType>(new AuditEventParticipantNetworkTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (An identifier for the type of network access point that originated the audit event.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public AuditEventParticipantNetworkComponent setTypeElement(Enumeration<AuditEventParticipantNetworkType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return An identifier for the type of network access point that originated the audit event.
     */
    public AuditEventParticipantNetworkType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value An identifier for the type of network access point that originated the audit event.
     */
    public AuditEventParticipantNetworkComponent setType(AuditEventParticipantNetworkType value) {
        if (value == null)
            this.type = null;
        else {
            if (this.type == null)
                this.type = new Enumeration<AuditEventParticipantNetworkType>(new AuditEventParticipantNetworkTypeEnumFactory());
            this.type.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("address", "string", "An identifier for the network access point of the user device for the audit event.", 0, java.lang.Integer.MAX_VALUE, address));
        childrenList.add(new Property("type", "code", "An identifier for the type of network access point that originated the audit event.", 0, java.lang.Integer.MAX_VALUE, type));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("address"))
            // StringType
            this.address = castToString(value);
        else if (name.equals("type"))
            // Enumeration<AuditEventParticipantNetworkType>
            this.type = new AuditEventParticipantNetworkTypeEnumFactory().fromType(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("address")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.address");
        } else if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.type");
        } else
            return super.addChild(name);
    }

    public AuditEventParticipantNetworkComponent copy() {
        AuditEventParticipantNetworkComponent dst = new AuditEventParticipantNetworkComponent();
        copyValues(dst);
        dst.address = address == null ? null : address.copy();
        dst.type = type == null ? null : type.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AuditEventParticipantNetworkComponent))
            return false;
        AuditEventParticipantNetworkComponent o = (AuditEventParticipantNetworkComponent) other;
        return compareDeep(address, o.address, true) && compareDeep(type, o.type, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AuditEventParticipantNetworkComponent))
            return false;
        AuditEventParticipantNetworkComponent o = (AuditEventParticipantNetworkComponent) other;
        return compareValues(address, o.address, true) && compareValues(type, o.type, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (address == null || address.isEmpty()) && (type == null || type.isEmpty());
    }

    public String fhirType() {
        return "AuditEvent.participant.network";
    }
}
