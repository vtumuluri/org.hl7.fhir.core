package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.GroupEnum.GroupTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.GroupEnum.GroupType;

public class GroupMemberComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A reference to the entity that is a member of the group. Must be consistent with Group.type.
     */
    protected Reference entity;

    /**
     * The actual object that is the target of the reference (A reference to the entity that is a member of the group. Must be consistent with Group.type.)
     */
    protected Resource entityTarget;

    /**
     * The period that the member was in the group, if known.
     */
    protected Period period;

    /**
     * A flag to indicate that the member is no longer in the group, but previously may have been a member.
     */
    protected BooleanType inactive;

    private static final long serialVersionUID = -333869055L;

    /*
     * Constructor
     */
    public GroupMemberComponent() {
        super();
    }

    /*
     * Constructor
     */
    public GroupMemberComponent(Reference entity) {
        super();
        this.entity = entity;
    }

    /**
     * @return {@link #entity} (A reference to the entity that is a member of the group. Must be consistent with Group.type.)
     */
    public Reference getEntity() {
        if (this.entity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create GroupMemberComponent.entity");
            else if (Configuration.doAutoCreate())
                // cc
                this.entity = new Reference();
        return this.entity;
    }

    public boolean hasEntity() {
        return this.entity != null && !this.entity.isEmpty();
    }

    /**
     * @param value {@link #entity} (A reference to the entity that is a member of the group. Must be consistent with Group.type.)
     */
    public GroupMemberComponent setEntity(Reference value) {
        this.entity = value;
        return this;
    }

    /**
     * @return {@link #entity} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to the entity that is a member of the group. Must be consistent with Group.type.)
     */
    public Resource getEntityTarget() {
        return this.entityTarget;
    }

    /**
     * @param value {@link #entity} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to the entity that is a member of the group. Must be consistent with Group.type.)
     */
    public GroupMemberComponent setEntityTarget(Resource value) {
        this.entityTarget = value;
        return this;
    }

    /**
     * @return {@link #period} (The period that the member was in the group, if known.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create GroupMemberComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period that the member was in the group, if known.)
     */
    public GroupMemberComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #inactive} (A flag to indicate that the member is no longer in the group, but previously may have been a member.). This is the underlying object with id, value and extensions. The accessor "getInactive" gives direct access to the value
     */
    public BooleanType getInactiveElement() {
        if (this.inactive == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create GroupMemberComponent.inactive");
            else if (Configuration.doAutoCreate())
                // bb
                this.inactive = new BooleanType();
        return this.inactive;
    }

    public boolean hasInactiveElement() {
        return this.inactive != null && !this.inactive.isEmpty();
    }

    public boolean hasInactive() {
        return this.inactive != null && !this.inactive.isEmpty();
    }

    /**
     * @param value {@link #inactive} (A flag to indicate that the member is no longer in the group, but previously may have been a member.). This is the underlying object with id, value and extensions. The accessor "getInactive" gives direct access to the value
     */
    public GroupMemberComponent setInactiveElement(BooleanType value) {
        this.inactive = value;
        return this;
    }

    /**
     * @return A flag to indicate that the member is no longer in the group, but previously may have been a member.
     */
    public boolean getInactive() {
        return this.inactive == null || this.inactive.isEmpty() ? false : this.inactive.getValue();
    }

    /**
     * @param value A flag to indicate that the member is no longer in the group, but previously may have been a member.
     */
    public GroupMemberComponent setInactive(boolean value) {
        if (this.inactive == null)
            this.inactive = new BooleanType();
        this.inactive.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("entity", "Reference(Patient|Practitioner|Device|Medication|Substance)", "A reference to the entity that is a member of the group. Must be consistent with Group.type.", 0, java.lang.Integer.MAX_VALUE, entity));
        childrenList.add(new Property("period", "Period", "The period that the member was in the group, if known.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("inactive", "boolean", "A flag to indicate that the member is no longer in the group, but previously may have been a member.", 0, java.lang.Integer.MAX_VALUE, inactive));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("entity"))
            // Reference
            this.entity = castToReference(value);
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("inactive"))
            // BooleanType
            this.inactive = castToBoolean(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("entity")) {
            this.entity = new Reference();
            return this.entity;
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("inactive")) {
            throw new FHIRException("Cannot call addChild on a primitive type Group.inactive");
        } else
            return super.addChild(name);
    }

    public GroupMemberComponent copy() {
        GroupMemberComponent dst = new GroupMemberComponent();
        copyValues(dst);
        dst.entity = entity == null ? null : entity.copy();
        dst.period = period == null ? null : period.copy();
        dst.inactive = inactive == null ? null : inactive.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof GroupMemberComponent))
            return false;
        GroupMemberComponent o = (GroupMemberComponent) other;
        return compareDeep(entity, o.entity, true) && compareDeep(period, o.period, true) && compareDeep(inactive, o.inactive, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof GroupMemberComponent))
            return false;
        GroupMemberComponent o = (GroupMemberComponent) other;
        return compareValues(inactive, o.inactive, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (entity == null || entity.isEmpty()) && (period == null || period.isEmpty()) && (inactive == null || inactive.isEmpty());
    }

    public String fhirType() {
        return "Group.member";
    }
}
