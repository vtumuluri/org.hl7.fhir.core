package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemIdentifierTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemIdentifierType;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.NamingSystemEnum.NamingSystemType;

public class NamingSystemUniqueIdComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifies the unique identifier scheme used for this particular identifier.
     */
    protected Enumeration<NamingSystemIdentifierType> type;

    /**
     * The string that should be sent over the wire to identify the code system or identifier system.
     */
    protected StringType value;

    /**
     * Indicates whether this identifier is the "preferred" identifier of this type.
     */
    protected BooleanType preferred;

    /**
     * Identifies the period of time over which this identifier is considered appropriate to refer to the naming system.  Outside of this window, the identifier might be non-deterministic.
     */
    protected Period period;

    private static final long serialVersionUID = -193711840L;

    /*
     * Constructor
     */
    public NamingSystemUniqueIdComponent() {
        super();
    }

    /*
     * Constructor
     */
    public NamingSystemUniqueIdComponent(Enumeration<NamingSystemIdentifierType> type, StringType value) {
        super();
        this.type = type;
        this.value = value;
    }

    /**
     * @return {@link #type} (Identifies the unique identifier scheme used for this particular identifier.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<NamingSystemIdentifierType> getTypeElement() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystemUniqueIdComponent.type");
            else if (Configuration.doAutoCreate())
                // bb
                this.type = new Enumeration<NamingSystemIdentifierType>(new NamingSystemIdentifierTypeEnumFactory());
        return this.type;
    }

    public boolean hasTypeElement() {
        return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Identifies the unique identifier scheme used for this particular identifier.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public NamingSystemUniqueIdComponent setTypeElement(Enumeration<NamingSystemIdentifierType> value) {
        this.type = value;
        return this;
    }

    /**
     * @return Identifies the unique identifier scheme used for this particular identifier.
     */
    public NamingSystemIdentifierType getType() {
        return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Identifies the unique identifier scheme used for this particular identifier.
     */
    public NamingSystemUniqueIdComponent setType(NamingSystemIdentifierType value) {
        if (this.type == null)
            this.type = new Enumeration<NamingSystemIdentifierType>(new NamingSystemIdentifierTypeEnumFactory());
        this.type.setValue(value);
        return this;
    }

    /**
     * @return {@link #value} (The string that should be sent over the wire to identify the code system or identifier system.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public StringType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystemUniqueIdComponent.value");
            else if (Configuration.doAutoCreate())
                // bb
                this.value = new StringType();
        return this.value;
    }

    public boolean hasValueElement() {
        return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The string that should be sent over the wire to identify the code system or identifier system.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public NamingSystemUniqueIdComponent setValueElement(StringType value) {
        this.value = value;
        return this;
    }

    /**
     * @return The string that should be sent over the wire to identify the code system or identifier system.
     */
    public String getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The string that should be sent over the wire to identify the code system or identifier system.
     */
    public NamingSystemUniqueIdComponent setValue(String value) {
        if (this.value == null)
            this.value = new StringType();
        this.value.setValue(value);
        return this;
    }

    /**
     * @return {@link #preferred} (Indicates whether this identifier is the "preferred" identifier of this type.). This is the underlying object with id, value and extensions. The accessor "getPreferred" gives direct access to the value
     */
    public BooleanType getPreferredElement() {
        if (this.preferred == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystemUniqueIdComponent.preferred");
            else if (Configuration.doAutoCreate())
                // bb
                this.preferred = new BooleanType();
        return this.preferred;
    }

    public boolean hasPreferredElement() {
        return this.preferred != null && !this.preferred.isEmpty();
    }

    public boolean hasPreferred() {
        return this.preferred != null && !this.preferred.isEmpty();
    }

    /**
     * @param value {@link #preferred} (Indicates whether this identifier is the "preferred" identifier of this type.). This is the underlying object with id, value and extensions. The accessor "getPreferred" gives direct access to the value
     */
    public NamingSystemUniqueIdComponent setPreferredElement(BooleanType value) {
        this.preferred = value;
        return this;
    }

    /**
     * @return Indicates whether this identifier is the "preferred" identifier of this type.
     */
    public boolean getPreferred() {
        return this.preferred == null || this.preferred.isEmpty() ? false : this.preferred.getValue();
    }

    /**
     * @param value Indicates whether this identifier is the "preferred" identifier of this type.
     */
    public NamingSystemUniqueIdComponent setPreferred(boolean value) {
        if (this.preferred == null)
            this.preferred = new BooleanType();
        this.preferred.setValue(value);
        return this;
    }

    /**
     * @return {@link #period} (Identifies the period of time over which this identifier is considered appropriate to refer to the naming system.  Outside of this window, the identifier might be non-deterministic.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create NamingSystemUniqueIdComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Identifies the period of time over which this identifier is considered appropriate to refer to the naming system.  Outside of this window, the identifier might be non-deterministic.)
     */
    public NamingSystemUniqueIdComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "code", "Identifies the unique identifier scheme used for this particular identifier.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("value", "string", "The string that should be sent over the wire to identify the code system or identifier system.", 0, java.lang.Integer.MAX_VALUE, value));
        childrenList.add(new Property("preferred", "boolean", "Indicates whether this identifier is the \"preferred\" identifier of this type.", 0, java.lang.Integer.MAX_VALUE, preferred));
        childrenList.add(new Property("period", "Period", "Identifies the period of time over which this identifier is considered appropriate to refer to the naming system.  Outside of this window, the identifier might be non-deterministic.", 0, java.lang.Integer.MAX_VALUE, period));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Enumeration<NamingSystemIdentifierType>
            this.type = new NamingSystemIdentifierTypeEnumFactory().fromType(value);
        else if (name.equals("value"))
            // StringType
            this.value = castToString(value);
        else if (name.equals("preferred"))
            // BooleanType
            this.preferred = castToBoolean(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.type");
        } else if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.value");
        } else if (name.equals("preferred")) {
            throw new FHIRException("Cannot call addChild on a primitive type NamingSystem.preferred");
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else
            return super.addChild(name);
    }

    public NamingSystemUniqueIdComponent copy() {
        NamingSystemUniqueIdComponent dst = new NamingSystemUniqueIdComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.value = value == null ? null : value.copy();
        dst.preferred = preferred == null ? null : preferred.copy();
        dst.period = period == null ? null : period.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof NamingSystemUniqueIdComponent))
            return false;
        NamingSystemUniqueIdComponent o = (NamingSystemUniqueIdComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(value, o.value, true) && compareDeep(preferred, o.preferred, true) && compareDeep(period, o.period, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof NamingSystemUniqueIdComponent))
            return false;
        NamingSystemUniqueIdComponent o = (NamingSystemUniqueIdComponent) other;
        return compareValues(type, o.type, true) && compareValues(value, o.value, true) && compareValues(preferred, o.preferred, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (value == null || value.isEmpty()) && (preferred == null || preferred.isEmpty()) && (period == null || period.isEmpty());
    }

    public String fhirType() {
        return "NamingSystem.uniqueId";
    }
}
