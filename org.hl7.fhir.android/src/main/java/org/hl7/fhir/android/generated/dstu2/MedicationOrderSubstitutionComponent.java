package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationOrderEnum.MedicationOrderStatus;
import org.hl7.fhir.android.generated.dstu2.MedicationOrderEnum.MedicationOrderStatusEnumFactory;

public class MedicationOrderSubstitutionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A code signifying whether a different drug should be dispensed from what was prescribed.
     */
    protected CodeableConcept type;

    /**
     * Indicates the reason for the substitution, or why substitution must or must not be performed.
     */
    protected CodeableConcept reason;

    private static final long serialVersionUID = 1693602518L;

    /*
     * Constructor
     */
    public MedicationOrderSubstitutionComponent() {
        super();
    }

    /*
     * Constructor
     */
    public MedicationOrderSubstitutionComponent(CodeableConcept type) {
        super();
        this.type = type;
    }

    /**
     * @return {@link #type} (A code signifying whether a different drug should be dispensed from what was prescribed.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrderSubstitutionComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (A code signifying whether a different drug should be dispensed from what was prescribed.)
     */
    public MedicationOrderSubstitutionComponent setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #reason} (Indicates the reason for the substitution, or why substitution must or must not be performed.)
     */
    public CodeableConcept getReason() {
        if (this.reason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrderSubstitutionComponent.reason");
            else if (Configuration.doAutoCreate())
                // cc
                this.reason = new CodeableConcept();
        return this.reason;
    }

    public boolean hasReason() {
        return this.reason != null && !this.reason.isEmpty();
    }

    /**
     * @param value {@link #reason} (Indicates the reason for the substitution, or why substitution must or must not be performed.)
     */
    public MedicationOrderSubstitutionComponent setReason(CodeableConcept value) {
        this.reason = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "A code signifying whether a different drug should be dispensed from what was prescribed.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("reason", "CodeableConcept", "Indicates the reason for the substitution, or why substitution must or must not be performed.", 0, java.lang.Integer.MAX_VALUE, reason));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("reason"))
            // CodeableConcept
            this.reason = castToCodeableConcept(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("reason")) {
            this.reason = new CodeableConcept();
            return this.reason;
        } else
            return super.addChild(name);
    }

    public MedicationOrderSubstitutionComponent copy() {
        MedicationOrderSubstitutionComponent dst = new MedicationOrderSubstitutionComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.reason = reason == null ? null : reason.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationOrderSubstitutionComponent))
            return false;
        MedicationOrderSubstitutionComponent o = (MedicationOrderSubstitutionComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(reason, o.reason, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationOrderSubstitutionComponent))
            return false;
        MedicationOrderSubstitutionComponent o = (MedicationOrderSubstitutionComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (reason == null || reason.isEmpty());
    }

    public String fhirType() {
        return "MedicationOrder.substitution";
    }
}
