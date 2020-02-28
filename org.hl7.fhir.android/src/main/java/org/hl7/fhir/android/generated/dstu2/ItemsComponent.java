package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ProcessRequestEnum.ActionList;
import org.hl7.fhir.android.generated.dstu2.ProcessRequestEnum.ActionListEnumFactory;

public class ItemsComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A service line number.
     */
    protected IntegerType sequenceLinkId;

    private static final long serialVersionUID = -1598360600L;

    /*
     * Constructor
     */
    public ItemsComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ItemsComponent(IntegerType sequenceLinkId) {
        super();
        this.sequenceLinkId = sequenceLinkId;
    }

    /**
     * @return {@link #sequenceLinkId} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequenceLinkId" gives direct access to the value
     */
    public IntegerType getSequenceLinkIdElement() {
        if (this.sequenceLinkId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ItemsComponent.sequenceLinkId");
            else if (Configuration.doAutoCreate())
                // bb
                this.sequenceLinkId = new IntegerType();
        return this.sequenceLinkId;
    }

    public boolean hasSequenceLinkIdElement() {
        return this.sequenceLinkId != null && !this.sequenceLinkId.isEmpty();
    }

    public boolean hasSequenceLinkId() {
        return this.sequenceLinkId != null && !this.sequenceLinkId.isEmpty();
    }

    /**
     * @param value {@link #sequenceLinkId} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequenceLinkId" gives direct access to the value
     */
    public ItemsComponent setSequenceLinkIdElement(IntegerType value) {
        this.sequenceLinkId = value;
        return this;
    }

    /**
     * @return A service line number.
     */
    public int getSequenceLinkId() {
        return this.sequenceLinkId == null || this.sequenceLinkId.isEmpty() ? 0 : this.sequenceLinkId.getValue();
    }

    /**
     * @param value A service line number.
     */
    public ItemsComponent setSequenceLinkId(int value) {
        if (this.sequenceLinkId == null)
            this.sequenceLinkId = new IntegerType();
        this.sequenceLinkId.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("sequenceLinkId", "integer", "A service line number.", 0, java.lang.Integer.MAX_VALUE, sequenceLinkId));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequenceLinkId"))
            // IntegerType
            this.sequenceLinkId = castToInteger(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("sequenceLinkId")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcessRequest.sequenceLinkId");
        } else
            return super.addChild(name);
    }

    public ItemsComponent copy() {
        ItemsComponent dst = new ItemsComponent();
        copyValues(dst);
        dst.sequenceLinkId = sequenceLinkId == null ? null : sequenceLinkId.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ItemsComponent))
            return false;
        ItemsComponent o = (ItemsComponent) other;
        return compareDeep(sequenceLinkId, o.sequenceLinkId, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ItemsComponent))
            return false;
        ItemsComponent o = (ItemsComponent) other;
        return compareValues(sequenceLinkId, o.sequenceLinkId, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (sequenceLinkId == null || sequenceLinkId.isEmpty());
    }

    public String fhirType() {
        return "ProcessRequest.item";
    }
}
