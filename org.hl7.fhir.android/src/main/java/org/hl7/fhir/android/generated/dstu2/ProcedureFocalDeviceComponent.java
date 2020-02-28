package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.ProcedureEnum.ProcedureStatus;
import org.hl7.fhir.android.generated.dstu2.ProcedureEnum.ProcedureStatusEnumFactory;

public class ProcedureFocalDeviceComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The kind of change that happened to the device during the procedure.
     */
    protected CodeableConcept action;

    /**
     * The device that was manipulated (changed) during the procedure.
     */
    protected Reference manipulated;

    /**
     * The actual object that is the target of the reference (The device that was manipulated (changed) during the procedure.)
     */
    protected Device manipulatedTarget;

    private static final long serialVersionUID = 1779937807L;

    /*
     * Constructor
     */
    public ProcedureFocalDeviceComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ProcedureFocalDeviceComponent(Reference manipulated) {
        super();
        this.manipulated = manipulated;
    }

    /**
     * @return {@link #action} (The kind of change that happened to the device during the procedure.)
     */
    public CodeableConcept getAction() {
        if (this.action == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureFocalDeviceComponent.action");
            else if (Configuration.doAutoCreate())
                // cc
                this.action = new CodeableConcept();
        return this.action;
    }

    public boolean hasAction() {
        return this.action != null && !this.action.isEmpty();
    }

    /**
     * @param value {@link #action} (The kind of change that happened to the device during the procedure.)
     */
    public ProcedureFocalDeviceComponent setAction(CodeableConcept value) {
        this.action = value;
        return this;
    }

    /**
     * @return {@link #manipulated} (The device that was manipulated (changed) during the procedure.)
     */
    public Reference getManipulated() {
        if (this.manipulated == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureFocalDeviceComponent.manipulated");
            else if (Configuration.doAutoCreate())
                // cc
                this.manipulated = new Reference();
        return this.manipulated;
    }

    public boolean hasManipulated() {
        return this.manipulated != null && !this.manipulated.isEmpty();
    }

    /**
     * @param value {@link #manipulated} (The device that was manipulated (changed) during the procedure.)
     */
    public ProcedureFocalDeviceComponent setManipulated(Reference value) {
        this.manipulated = value;
        return this;
    }

    /**
     * @return {@link #manipulated} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The device that was manipulated (changed) during the procedure.)
     */
    public Device getManipulatedTarget() {
        if (this.manipulatedTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcedureFocalDeviceComponent.manipulated");
            else if (Configuration.doAutoCreate())
                // aa
                this.manipulatedTarget = new Device();
        return this.manipulatedTarget;
    }

    /**
     * @param value {@link #manipulated} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The device that was manipulated (changed) during the procedure.)
     */
    public ProcedureFocalDeviceComponent setManipulatedTarget(Device value) {
        this.manipulatedTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("action", "CodeableConcept", "The kind of change that happened to the device during the procedure.", 0, java.lang.Integer.MAX_VALUE, action));
        childrenList.add(new Property("manipulated", "Reference(Device)", "The device that was manipulated (changed) during the procedure.", 0, java.lang.Integer.MAX_VALUE, manipulated));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("action"))
            // CodeableConcept
            this.action = castToCodeableConcept(value);
        else if (name.equals("manipulated"))
            // Reference
            this.manipulated = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("action")) {
            this.action = new CodeableConcept();
            return this.action;
        } else if (name.equals("manipulated")) {
            this.manipulated = new Reference();
            return this.manipulated;
        } else
            return super.addChild(name);
    }

    public ProcedureFocalDeviceComponent copy() {
        ProcedureFocalDeviceComponent dst = new ProcedureFocalDeviceComponent();
        copyValues(dst);
        dst.action = action == null ? null : action.copy();
        dst.manipulated = manipulated == null ? null : manipulated.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ProcedureFocalDeviceComponent))
            return false;
        ProcedureFocalDeviceComponent o = (ProcedureFocalDeviceComponent) other;
        return compareDeep(action, o.action, true) && compareDeep(manipulated, o.manipulated, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ProcedureFocalDeviceComponent))
            return false;
        ProcedureFocalDeviceComponent o = (ProcedureFocalDeviceComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (action == null || action.isEmpty()) && (manipulated == null || manipulated.isEmpty());
    }

    public String fhirType() {
        return "Procedure.focalDevice";
    }
}
