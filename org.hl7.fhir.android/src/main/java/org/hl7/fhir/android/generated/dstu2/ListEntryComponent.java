package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.List_Enum.ListModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.List_Enum.ListMode;
import org.hl7.fhir.android.generated.dstu2.List_Enum.ListStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.List_Enum.ListStatus;

public class ListEntryComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The flag allows the system constructing the list to indicate the role and significance of the item in the list.
     */
    protected CodeableConcept flag;

    /**
     * True if this item is marked as deleted in the list.
     */
    protected BooleanType deleted;

    /**
     * When this item was added to the list.
     */
    protected DateTimeType date;

    /**
     * A reference to the actual resource from which data was derived.
     */
    protected Reference item;

    /**
     * The actual object that is the target of the reference (A reference to the actual resource from which data was derived.)
     */
    protected Resource itemTarget;

    private static final long serialVersionUID = -758164425L;

    /*
     * Constructor
     */
    public ListEntryComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ListEntryComponent(Reference item) {
        super();
        this.item = item;
    }

    /**
     * @return {@link #flag} (The flag allows the system constructing the list to indicate the role and significance of the item in the list.)
     */
    public CodeableConcept getFlag() {
        if (this.flag == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ListEntryComponent.flag");
            else if (Configuration.doAutoCreate())
                // cc
                this.flag = new CodeableConcept();
        return this.flag;
    }

    public boolean hasFlag() {
        return this.flag != null && !this.flag.isEmpty();
    }

    /**
     * @param value {@link #flag} (The flag allows the system constructing the list to indicate the role and significance of the item in the list.)
     */
    public ListEntryComponent setFlag(CodeableConcept value) {
        this.flag = value;
        return this;
    }

    /**
     * @return {@link #deleted} (True if this item is marked as deleted in the list.). This is the underlying object with id, value and extensions. The accessor "getDeleted" gives direct access to the value
     */
    public BooleanType getDeletedElement() {
        if (this.deleted == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ListEntryComponent.deleted");
            else if (Configuration.doAutoCreate())
                // bb
                this.deleted = new BooleanType();
        return this.deleted;
    }

    public boolean hasDeletedElement() {
        return this.deleted != null && !this.deleted.isEmpty();
    }

    public boolean hasDeleted() {
        return this.deleted != null && !this.deleted.isEmpty();
    }

    /**
     * @param value {@link #deleted} (True if this item is marked as deleted in the list.). This is the underlying object with id, value and extensions. The accessor "getDeleted" gives direct access to the value
     */
    public ListEntryComponent setDeletedElement(BooleanType value) {
        this.deleted = value;
        return this;
    }

    /**
     * @return True if this item is marked as deleted in the list.
     */
    public boolean getDeleted() {
        return this.deleted == null || this.deleted.isEmpty() ? false : this.deleted.getValue();
    }

    /**
     * @param value True if this item is marked as deleted in the list.
     */
    public ListEntryComponent setDeleted(boolean value) {
        if (this.deleted == null)
            this.deleted = new BooleanType();
        this.deleted.setValue(value);
        return this;
    }

    /**
     * @return {@link #date} (When this item was added to the list.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ListEntryComponent.date");
            else if (Configuration.doAutoCreate())
                // bb
                this.date = new DateTimeType();
        return this.date;
    }

    public boolean hasDateElement() {
        return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() {
        return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (When this item was added to the list.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ListEntryComponent setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return When this item was added to the list.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value When this item was added to the list.
     */
    public ListEntryComponent setDate(Date value) {
        if (value == null)
            this.date = null;
        else {
            if (this.date == null)
                this.date = new DateTimeType();
            this.date.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #item} (A reference to the actual resource from which data was derived.)
     */
    public Reference getItem() {
        if (this.item == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ListEntryComponent.item");
            else if (Configuration.doAutoCreate())
                // cc
                this.item = new Reference();
        return this.item;
    }

    public boolean hasItem() {
        return this.item != null && !this.item.isEmpty();
    }

    /**
     * @param value {@link #item} (A reference to the actual resource from which data was derived.)
     */
    public ListEntryComponent setItem(Reference value) {
        this.item = value;
        return this;
    }

    /**
     * @return {@link #item} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to the actual resource from which data was derived.)
     */
    public Resource getItemTarget() {
        return this.itemTarget;
    }

    /**
     * @param value {@link #item} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to the actual resource from which data was derived.)
     */
    public ListEntryComponent setItemTarget(Resource value) {
        this.itemTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("flag", "CodeableConcept", "The flag allows the system constructing the list to indicate the role and significance of the item in the list.", 0, java.lang.Integer.MAX_VALUE, flag));
        childrenList.add(new Property("deleted", "boolean", "True if this item is marked as deleted in the list.", 0, java.lang.Integer.MAX_VALUE, deleted));
        childrenList.add(new Property("date", "dateTime", "When this item was added to the list.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("item", "Reference(Any)", "A reference to the actual resource from which data was derived.", 0, java.lang.Integer.MAX_VALUE, item));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("flag"))
            // CodeableConcept
            this.flag = castToCodeableConcept(value);
        else if (name.equals("deleted"))
            // BooleanType
            this.deleted = castToBoolean(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("item"))
            // Reference
            this.item = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("flag")) {
            this.flag = new CodeableConcept();
            return this.flag;
        } else if (name.equals("deleted")) {
            throw new FHIRException("Cannot call addChild on a primitive type List_.deleted");
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type List_.date");
        } else if (name.equals("item")) {
            this.item = new Reference();
            return this.item;
        } else
            return super.addChild(name);
    }

    public ListEntryComponent copy() {
        ListEntryComponent dst = new ListEntryComponent();
        copyValues(dst);
        dst.flag = flag == null ? null : flag.copy();
        dst.deleted = deleted == null ? null : deleted.copy();
        dst.date = date == null ? null : date.copy();
        dst.item = item == null ? null : item.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ListEntryComponent))
            return false;
        ListEntryComponent o = (ListEntryComponent) other;
        return compareDeep(flag, o.flag, true) && compareDeep(deleted, o.deleted, true) && compareDeep(date, o.date, true) && compareDeep(item, o.item, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ListEntryComponent))
            return false;
        ListEntryComponent o = (ListEntryComponent) other;
        return compareValues(deleted, o.deleted, true) && compareValues(date, o.date, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (flag == null || flag.isEmpty()) && (deleted == null || deleted.isEmpty()) && (date == null || date.isEmpty()) && (item == null || item.isEmpty());
    }

    public String fhirType() {
        return "List.entry";
    }
}
