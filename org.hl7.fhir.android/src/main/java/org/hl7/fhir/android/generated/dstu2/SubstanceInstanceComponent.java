package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class SubstanceInstanceComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifier associated with the package/container (usually a label affixed directly).
     */
    protected Identifier identifier;

    /**
     * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
     */
    protected DateTimeType expiry;

    /**
     * The amount of the substance.
     */
    protected SimpleQuantity quantity;

    private static final long serialVersionUID = -794314734L;

    /*
     * Constructor
     */
    public SubstanceInstanceComponent() {
        super();
    }

    /**
     * @return {@link #identifier} (Identifier associated with the package/container (usually a label affixed directly).)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubstanceInstanceComponent.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Identifier associated with the package/container (usually a label affixed directly).)
     */
    public SubstanceInstanceComponent setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #expiry} (When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.). This is the underlying object with id, value and extensions. The accessor "getExpiry" gives direct access to the value
     */
    public DateTimeType getExpiryElement() {
        if (this.expiry == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubstanceInstanceComponent.expiry");
            else if (Configuration.doAutoCreate())
                // bb
                this.expiry = new DateTimeType();
        return this.expiry;
    }

    public boolean hasExpiryElement() {
        return this.expiry != null && !this.expiry.isEmpty();
    }

    public boolean hasExpiry() {
        return this.expiry != null && !this.expiry.isEmpty();
    }

    /**
     * @param value {@link #expiry} (When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.). This is the underlying object with id, value and extensions. The accessor "getExpiry" gives direct access to the value
     */
    public SubstanceInstanceComponent setExpiryElement(DateTimeType value) {
        this.expiry = value;
        return this;
    }

    /**
     * @return When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
     */
    public Date getExpiry() {
        return this.expiry == null ? null : this.expiry.getValue();
    }

    /**
     * @param value When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
     */
    public SubstanceInstanceComponent setExpiry(Date value) {
        if (value == null)
            this.expiry = null;
        else {
            if (this.expiry == null)
                this.expiry = new DateTimeType();
            this.expiry.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #quantity} (The amount of the substance.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubstanceInstanceComponent.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The amount of the substance.)
     */
    public SubstanceInstanceComponent setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifier associated with the package/container (usually a label affixed directly).", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("expiry", "dateTime", "When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.", 0, java.lang.Integer.MAX_VALUE, expiry));
        childrenList.add(new Property("quantity", "SimpleQuantity", "The amount of the substance.", 0, java.lang.Integer.MAX_VALUE, quantity));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("expiry"))
            // DateTimeType
            this.expiry = castToDateTime(value);
        else if (name.equals("quantity"))
            // SimpleQuantity
            this.quantity = castToSimpleQuantity(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("expiry")) {
            throw new FHIRException("Cannot call addChild on a primitive type Substance.expiry");
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else
            return super.addChild(name);
    }

    public SubstanceInstanceComponent copy() {
        SubstanceInstanceComponent dst = new SubstanceInstanceComponent();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.expiry = expiry == null ? null : expiry.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SubstanceInstanceComponent))
            return false;
        SubstanceInstanceComponent o = (SubstanceInstanceComponent) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(expiry, o.expiry, true) && compareDeep(quantity, o.quantity, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SubstanceInstanceComponent))
            return false;
        SubstanceInstanceComponent o = (SubstanceInstanceComponent) other;
        return compareValues(expiry, o.expiry, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (expiry == null || expiry.isEmpty()) && (quantity == null || quantity.isEmpty());
    }

    public String fhirType() {
        return "Substance.instance";
    }
}
