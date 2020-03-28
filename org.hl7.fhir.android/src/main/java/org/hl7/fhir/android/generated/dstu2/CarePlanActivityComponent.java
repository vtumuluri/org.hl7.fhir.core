package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanActivityStatus;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanActivityStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanStatus;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanRelationship;
import org.hl7.fhir.android.generated.dstu2.CarePlanEnum.CarePlanRelationshipEnumFactory;

public class CarePlanActivityComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Resources that describe follow-on actions resulting from the plan, such as drug prescriptions, encounter records, appointments, etc.
     */
    protected List<Reference> actionResulting;

    /**
     * The actual objects that are the target of the reference (Resources that describe follow-on actions resulting from the plan, such as drug prescriptions, encounter records, appointments, etc.)
     */
    protected List<Resource> actionResultingTarget;

    /**
     * Notes about the adherence/status/progress of the activity.
     */
    protected List<Annotation> progress;

    /**
     * The details of the proposed activity represented in a specific resource.
     */
    protected Reference reference;

    /**
     * The actual object that is the target of the reference (The details of the proposed activity represented in a specific resource.)
     */
    protected Resource referenceTarget;

    /**
     * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
     */
    protected CarePlanActivityDetailComponent detail;

    private static final long serialVersionUID = 40181608L;

    /*
     * Constructor
     */
    public CarePlanActivityComponent() {
        super();
    }

    /**
     * @return {@link #actionResulting} (Resources that describe follow-on actions resulting from the plan, such as drug prescriptions, encounter records, appointments, etc.)
     */
    public List<Reference> getActionResulting() {
        if (this.actionResulting == null)
            this.actionResulting = new ArrayList<Reference>();
        return this.actionResulting;
    }

    public boolean hasActionResulting() {
        if (this.actionResulting == null)
            return false;
        for (Reference item : this.actionResulting) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addActionResulting() {
        // 3
        Reference t = new Reference();
        if (this.actionResulting == null)
            this.actionResulting = new ArrayList<Reference>();
        this.actionResulting.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlanActivityComponent addActionResulting(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.actionResulting == null)
            this.actionResulting = new ArrayList<Reference>();
        this.actionResulting.add(t);
        return this;
    }

    /**
     * @return {@link #actionResulting} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Resources that describe follow-on actions resulting from the plan, such as drug prescriptions, encounter records, appointments, etc.)
     */
    public List<Resource> getActionResultingTarget() {
        if (this.actionResultingTarget == null)
            this.actionResultingTarget = new ArrayList<Resource>();
        return this.actionResultingTarget;
    }

    /**
     * @return {@link #progress} (Notes about the adherence/status/progress of the activity.)
     */
    public List<Annotation> getProgress() {
        if (this.progress == null)
            this.progress = new ArrayList<Annotation>();
        return this.progress;
    }

    public boolean hasProgress() {
        if (this.progress == null)
            return false;
        for (Annotation item : this.progress) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Annotation addProgress() {
        // 3
        Annotation t = new Annotation();
        if (this.progress == null)
            this.progress = new ArrayList<Annotation>();
        this.progress.add(t);
        return t;
    }

    // syntactic sugar
    public CarePlanActivityComponent addProgress(Annotation t) {
        // 3
        if (t == null)
            return this;
        if (this.progress == null)
            this.progress = new ArrayList<Annotation>();
        this.progress.add(t);
        return this;
    }

    /**
     * @return {@link #reference} (The details of the proposed activity represented in a specific resource.)
     */
    public Reference getReference() {
        if (this.reference == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityComponent.reference");
            else if (Configuration.doAutoCreate())
                // cc
                this.reference = new Reference();
        return this.reference;
    }

    public boolean hasReference() {
        return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (The details of the proposed activity represented in a specific resource.)
     */
    public CarePlanActivityComponent setReference(Reference value) {
        this.reference = value;
        return this;
    }

    /**
     * @return {@link #reference} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The details of the proposed activity represented in a specific resource.)
     */
    public Resource getReferenceTarget() {
        return this.referenceTarget;
    }

    /**
     * @param value {@link #reference} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The details of the proposed activity represented in a specific resource.)
     */
    public CarePlanActivityComponent setReferenceTarget(Resource value) {
        this.referenceTarget = value;
        return this;
    }

    /**
     * @return {@link #detail} (A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.)
     */
    public CarePlanActivityDetailComponent getDetail() {
        if (this.detail == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CarePlanActivityComponent.detail");
            else if (Configuration.doAutoCreate())
                // cc
                this.detail = new CarePlanActivityDetailComponent();
        return this.detail;
    }

    public boolean hasDetail() {
        return this.detail != null && !this.detail.isEmpty();
    }

    /**
     * @param value {@link #detail} (A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.)
     */
    public CarePlanActivityComponent setDetail(CarePlanActivityDetailComponent value) {
        this.detail = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("actionResulting", "Reference(Any)", "Resources that describe follow-on actions resulting from the plan, such as drug prescriptions, encounter records, appointments, etc.", 0, java.lang.Integer.MAX_VALUE, actionResulting));
        childrenList.add(new Property("progress", "Annotation", "Notes about the adherence/status/progress of the activity.", 0, java.lang.Integer.MAX_VALUE, progress));
        childrenList.add(new Property("reference", "Reference(Appointment|CommunicationRequest|DeviceUseRequest|DiagnosticOrder|MedicationOrder|NutritionOrder|Order|ProcedureRequest|ProcessRequest|ReferralRequest|SupplyRequest|VisionPrescription)", "The details of the proposed activity represented in a specific resource.", 0, java.lang.Integer.MAX_VALUE, reference));
        childrenList.add(new Property("detail", "", "A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.", 0, java.lang.Integer.MAX_VALUE, detail));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("actionResulting"))
            this.getActionResulting().add(castToReference(value));
        else if (name.equals("progress"))
            this.getProgress().add(castToAnnotation(value));
        else if (name.equals("reference"))
            // Reference
            this.reference = castToReference(value);
        else if (name.equals("detail"))
            // CarePlanActivityDetailComponent
            this.detail = (CarePlanActivityDetailComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("actionResulting")) {
            return addActionResulting();
        } else if (name.equals("progress")) {
            return addProgress();
        } else if (name.equals("reference")) {
            this.reference = new Reference();
            return this.reference;
        } else if (name.equals("detail")) {
            this.detail = new CarePlanActivityDetailComponent();
            return this.detail;
        } else
            return super.addChild(name);
    }

    public CarePlanActivityComponent copy() {
        CarePlanActivityComponent dst = new CarePlanActivityComponent();
        copyValues(dst);
        if (actionResulting != null) {
            dst.actionResulting = new ArrayList<Reference>();
            for (Reference i : actionResulting) dst.actionResulting.add(i.copy());
        }
        ;
        if (progress != null) {
            dst.progress = new ArrayList<Annotation>();
            for (Annotation i : progress) dst.progress.add(i.copy());
        }
        ;
        dst.reference = reference == null ? null : reference.copy();
        dst.detail = detail == null ? null : detail.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof CarePlanActivityComponent))
            return false;
        CarePlanActivityComponent o = (CarePlanActivityComponent) other;
        return compareDeep(actionResulting, o.actionResulting, true) && compareDeep(progress, o.progress, true) && compareDeep(reference, o.reference, true) && compareDeep(detail, o.detail, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof CarePlanActivityComponent))
            return false;
        CarePlanActivityComponent o = (CarePlanActivityComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (actionResulting == null || actionResulting.isEmpty()) && (progress == null || progress.isEmpty()) && (reference == null || reference.isEmpty()) && (detail == null || detail.isEmpty());
    }

    public String fhirType() {
        return "CarePlan.activity";
    }
}
