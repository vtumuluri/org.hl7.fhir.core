package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.HealthcareServiceEnum.DaysOfWeek;
import org.hl7.fhir.android.generated.dstu2.HealthcareServiceEnum.DaysOfWeekEnumFactory;

public class ServiceTypeComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The specific type of service being delivered or performed.
     */
    protected CodeableConcept type;

    /**
     * Collection of specialties handled by the service site. This is more of a medical term.
     */
    protected List<CodeableConcept> specialty;

    private static final long serialVersionUID = 1703986174L;

    /*
     * Constructor
     */
    public ServiceTypeComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ServiceTypeComponent(CodeableConcept type) {
        super();
        this.type = type;
    }

    /**
     * @return {@link #type} (The specific type of service being delivered or performed.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ServiceTypeComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The specific type of service being delivered or performed.)
     */
    public ServiceTypeComponent setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #specialty} (Collection of specialties handled by the service site. This is more of a medical term.)
     */
    public List<CodeableConcept> getSpecialty() {
        if (this.specialty == null)
            this.specialty = new ArrayList<CodeableConcept>();
        return this.specialty;
    }

    public boolean hasSpecialty() {
        if (this.specialty == null)
            return false;
        for (CodeableConcept item : this.specialty) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addSpecialty() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.specialty == null)
            this.specialty = new ArrayList<CodeableConcept>();
        this.specialty.add(t);
        return t;
    }

    // syntactic sugar
    public ServiceTypeComponent addSpecialty(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.specialty == null)
            this.specialty = new ArrayList<CodeableConcept>();
        this.specialty.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "The specific type of service being delivered or performed.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("specialty", "CodeableConcept", "Collection of specialties handled by the service site. This is more of a medical term.", 0, java.lang.Integer.MAX_VALUE, specialty));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("specialty"))
            this.getSpecialty().add(castToCodeableConcept(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("specialty")) {
            return addSpecialty();
        } else
            return super.addChild(name);
    }

    public ServiceTypeComponent copy() {
        ServiceTypeComponent dst = new ServiceTypeComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        if (specialty != null) {
            dst.specialty = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : specialty) dst.specialty.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ServiceTypeComponent))
            return false;
        ServiceTypeComponent o = (ServiceTypeComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(specialty, o.specialty, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ServiceTypeComponent))
            return false;
        ServiceTypeComponent o = (ServiceTypeComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (specialty == null || specialty.isEmpty());
    }

    public String fhirType() {
        return "HealthcareService.serviceType";
    }
}
