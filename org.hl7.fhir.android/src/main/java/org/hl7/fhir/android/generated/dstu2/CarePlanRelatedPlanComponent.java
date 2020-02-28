package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanStatus;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanActivityStatus;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanActivityStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanRelationship;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanRelationshipEnumFactory;

public class CarePlanRelatedPlanComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifies the type of relationship this plan has to the target plan.
     */
    protected Enumeration<CarePlanRelationship> code;

    /**
     * A reference to the plan to which a relationship is asserted.
     */
    protected Reference plan;

    /**
     * The actual object that is the target of the reference (A reference to the plan to which a relationship is asserted.)
     */
    protected CarePlan planTarget;

    private static final long serialVersionUID = 1875598050L;

    /*
     * Constructor
     */
    public CarePlanRelatedPlanComponent() {
        super();
    }

    /*
     * Constructor
     */
    public CarePlanRelatedPlanComponent(Reference plan) {
        super();
        this.plan = plan;
    }

    /**
     * @return {@link #code} (Identifies the type of relationship this plan has to the target plan.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public Enumeration<CarePlanRelationship> getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanRelatedPlanComponent.code");
            else if (Configuration.doAutoCreate())
                // bb
                this.code = new Enumeration<CarePlanRelationship>(new CarePlanRelationshipEnumFactory());
        return this.code;
    }

    public boolean hasCodeElement() {
        return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Identifies the type of relationship this plan has to the target plan.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public CarePlanRelatedPlanComponent setCodeElement(Enumeration<CarePlanRelationship> value) {
        this.code = value;
        return this;
    }

    /**
     * @return Identifies the type of relationship this plan has to the target plan.
     */
    public CarePlanRelationship getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value Identifies the type of relationship this plan has to the target plan.
     */
    public CarePlanRelatedPlanComponent setCode(CarePlanRelationship value) {
        if (value == null)
            this.code = null;
        else {
            if (this.code == null)
                this.code = new Enumeration<CarePlanRelationship>(new CarePlanRelationshipEnumFactory());
            this.code.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #plan} (A reference to the plan to which a relationship is asserted.)
     */
    public Reference getPlan() {
        if (this.plan == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanRelatedPlanComponent.plan");
            else if (Configuration.doAutoCreate())
                // cc
                this.plan = new Reference();
        return this.plan;
    }

    public boolean hasPlan() {
        return this.plan != null && !this.plan.isEmpty();
    }

    /**
     * @param value {@link #plan} (A reference to the plan to which a relationship is asserted.)
     */
    public CarePlanRelatedPlanComponent setPlan(Reference value) {
        this.plan = value;
        return this;
    }

    /**
     * @return {@link #plan} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to the plan to which a relationship is asserted.)
     */
    public CarePlan getPlanTarget() {
        if (this.planTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanRelatedPlanComponent.plan");
            else if (Configuration.doAutoCreate())
                // aa
                this.planTarget = new CarePlan();
        return this.planTarget;
    }

    /**
     * @param value {@link #plan} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to the plan to which a relationship is asserted.)
     */
    public CarePlanRelatedPlanComponent setPlanTarget(CarePlan value) {
        this.planTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "code", "Identifies the type of relationship this plan has to the target plan.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("plan", "Reference(CarePlan)", "A reference to the plan to which a relationship is asserted.", 0, java.lang.Integer.MAX_VALUE, plan));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // Enumeration<CarePlanRelationship>
            this.code = new CarePlanRelationshipEnumFactory().fromType(value);
        else if (name.equals("plan"))
            // Reference
            this.plan = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type CarePlan.code");
        } else if (name.equals("plan")) {
            this.plan = new Reference();
            return this.plan;
        } else
            return super.addChild(name);
    }

    public CarePlanRelatedPlanComponent copy() {
        CarePlanRelatedPlanComponent dst = new CarePlanRelatedPlanComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.plan = plan == null ? null : plan.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof CarePlanRelatedPlanComponent))
            return false;
        CarePlanRelatedPlanComponent o = (CarePlanRelatedPlanComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(plan, o.plan, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof CarePlanRelatedPlanComponent))
            return false;
        CarePlanRelatedPlanComponent o = (CarePlanRelatedPlanComponent) other;
        return compareValues(code, o.code, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (plan == null || plan.isEmpty());
    }

    public String fhirType() {
        return "CarePlan.relatedPlan";
    }
}
