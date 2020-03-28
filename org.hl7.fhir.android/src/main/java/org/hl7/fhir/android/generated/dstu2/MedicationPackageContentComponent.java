package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class MedicationPackageContentComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifies one of the items in the package.
     */
    protected Reference item;

    /**
     * The actual object that is the target of the reference (Identifies one of the items in the package.)
     */
    protected Medication itemTarget;

    /**
     * The amount of the product that is in the package.
     */
    protected SimpleQuantity amount;

    private static final long serialVersionUID = -1150048030L;

    /*
     * Constructor
     */
    public MedicationPackageContentComponent() {
        super();
    }

    /*
     * Constructor
     */
    public MedicationPackageContentComponent(Reference item) {
        super();
        this.item = item;
    }

    /**
     * @return {@link #item} (Identifies one of the items in the package.)
     */
    public Reference getItem() {
        if (this.item == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationPackageContentComponent.item");
            else if (Configuration.doAutoCreate())
                // cc
                this.item = new Reference();
        return this.item;
    }

    public boolean hasItem() {
        return this.item != null && !this.item.isEmpty();
    }

    /**
     * @param value {@link #item} (Identifies one of the items in the package.)
     */
    public MedicationPackageContentComponent setItem(Reference value) {
        this.item = value;
        return this;
    }

    /**
     * @return {@link #item} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies one of the items in the package.)
     */
    public Medication getItemTarget() {
        if (this.itemTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationPackageContentComponent.item");
            else if (Configuration.doAutoCreate())
                // aa
                this.itemTarget = new Medication();
        return this.itemTarget;
    }

    /**
     * @param value {@link #item} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies one of the items in the package.)
     */
    public MedicationPackageContentComponent setItemTarget(Medication value) {
        this.itemTarget = value;
        return this;
    }

    /**
     * @return {@link #amount} (The amount of the product that is in the package.)
     */
    public SimpleQuantity getAmount() {
        if (this.amount == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationPackageContentComponent.amount");
            else if (Configuration.doAutoCreate())
                // cc
                this.amount = new SimpleQuantity();
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null && !this.amount.isEmpty();
    }

    /**
     * @param value {@link #amount} (The amount of the product that is in the package.)
     */
    public MedicationPackageContentComponent setAmount(SimpleQuantity value) {
        this.amount = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("item", "Reference(Medication)", "Identifies one of the items in the package.", 0, java.lang.Integer.MAX_VALUE, item));
        childrenList.add(new Property("amount", "SimpleQuantity", "The amount of the product that is in the package.", 0, java.lang.Integer.MAX_VALUE, amount));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("item"))
            // Reference
            this.item = castToReference(value);
        else if (name.equals("amount"))
            // SimpleQuantity
            this.amount = castToSimpleQuantity(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("item")) {
            this.item = new Reference();
            return this.item;
        } else if (name.equals("amount")) {
            this.amount = new SimpleQuantity();
            return this.amount;
        } else
            return super.addChild(name);
    }

    public MedicationPackageContentComponent copy() {
        MedicationPackageContentComponent dst = new MedicationPackageContentComponent();
        copyValues(dst);
        dst.item = item == null ? null : item.copy();
        dst.amount = amount == null ? null : amount.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationPackageContentComponent))
            return false;
        MedicationPackageContentComponent o = (MedicationPackageContentComponent) other;
        return compareDeep(item, o.item, true) && compareDeep(amount, o.amount, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationPackageContentComponent))
            return false;
        MedicationPackageContentComponent o = (MedicationPackageContentComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (item == null || item.isEmpty()) && (amount == null || amount.isEmpty());
    }

    public String fhirType() {
        return "Medication.package.content";
    }
}
