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

public class AuditEventObjectDetailComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Name of the property.
     */
    protected StringType type;

    /**
     * Property value.
     */
    protected Base64BinaryType value;

    private static final long serialVersionUID = 11139504L;

    /*
     * Constructor
     */
    public AuditEventObjectDetailComponent() {
        super();
    }

    /*
     * Constructor
     */
    public AuditEventObjectDetailComponent(StringType type, Base64BinaryType value) {
        super();
        this.type = type;
        this.value = value;
    }

    /**
     * @return {@link #type} (Name of the property.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public StringType getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventObjectDetailComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new StringType();
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Name of the property.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public AuditEventObjectDetailComponent setTypeElement(StringType value) {
        this.type = value;
        return this;
    }

    /**
     * @return Name of the property.
     */
    public String getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Name of the property.
     */
    public AuditEventObjectDetailComponent setType(String value) {
        if (this.type == null)
            this.type = new StringType();
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #value} (Property value.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public Base64BinaryType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventObjectDetailComponent.value");
            else if (Configuration.doAutoCreate())
                // bb
                this.value = new Base64BinaryType();
        return this.value;
    }

    public boolean hasValueElement() {
        return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (Property value.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public AuditEventObjectDetailComponent setValueElement(Base64BinaryType value) {
        this.value = value;
        return this;
    }

    /**
     * @return Property value.
     */
    public byte[] getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value Property value.
     */
    public AuditEventObjectDetailComponent setValue(byte[] value) {
        if (this.value == null)
            this.value = new Base64BinaryType();
        this.value.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "string", "Name of the property.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("value", "base64Binary", "Property value.", 0, java.lang.Integer.MAX_VALUE, value));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // StringType
            this.type = castToString(value);
        else if (name.equals("value"))
            // Base64BinaryType
            this.value = castToBase64Binary(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.type");
        } else if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.value");
        } else
            return super.addChild(name);
    }

    public AuditEventObjectDetailComponent copy() {
        AuditEventObjectDetailComponent dst = new AuditEventObjectDetailComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AuditEventObjectDetailComponent))
            return false;
        AuditEventObjectDetailComponent o = (AuditEventObjectDetailComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(value, o.value, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AuditEventObjectDetailComponent))
            return false;
        AuditEventObjectDetailComponent o = (AuditEventObjectDetailComponent) other;
        return compareValues(type, o.type, true) && compareValues(value, o.value, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (value == null || value.isEmpty());
    }

    public String fhirType() {
        return "AuditEvent.object.detail";
    }
}
