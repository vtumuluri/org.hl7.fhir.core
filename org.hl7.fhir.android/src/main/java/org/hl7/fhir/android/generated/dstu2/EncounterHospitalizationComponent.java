package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterState;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterStateEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClass;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterClassEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatus;
import org.hl7.fhir.android.generated.dstu2.EncounterEnum.EncounterLocationStatusEnumFactory;

public class EncounterHospitalizationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Pre-admission identifier.
     */
    protected Identifier preAdmissionIdentifier;

    /**
     * The location from which the patient came before admission.
     */
    protected Reference origin;

    /**
     * The actual object that is the target of the reference (The location from which the patient came before admission.)
     */
    protected Location originTarget;

    /**
     * From where patient was admitted (physician referral, transfer).
     */
    protected CodeableConcept admitSource;

    /**
     * The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter.
     */
    protected List<Reference> admittingDiagnosis;

    /**
     * The actual objects that are the target of the reference (The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter.)
     */
    protected List<Condition> admittingDiagnosisTarget;

    /**
     * Whether this hospitalization is a readmission and why if known.
     */
    protected CodeableConcept reAdmission;

    /**
     * Diet preferences reported by the patient.
     */
    protected List<CodeableConcept> dietPreference;

    /**
     * Special courtesies (VIP, board member).
     */
    protected List<CodeableConcept> specialCourtesy;

    /**
     * Wheelchair, translator, stretcher, etc.
     */
    protected List<CodeableConcept> specialArrangement;

    /**
     * Location to which the patient is discharged.
     */
    protected Reference destination;

    /**
     * The actual object that is the target of the reference (Location to which the patient is discharged.)
     */
    protected Location destinationTarget;

    /**
     * Category or kind of location after discharge.
     */
    protected CodeableConcept dischargeDisposition;

    /**
     * The final diagnosis given a patient before release from the hospital after all testing, surgery, and workup are complete.
     */
    protected List<Reference> dischargeDiagnosis;

    /**
     * The actual objects that are the target of the reference (The final diagnosis given a patient before release from the hospital after all testing, surgery, and workup are complete.)
     */
    protected List<Condition> dischargeDiagnosisTarget;

    private static final long serialVersionUID = 164618034L;

    /*
     * Constructor
     */
    public EncounterHospitalizationComponent() {
        super();
    }

    /**
     * @return {@link #preAdmissionIdentifier} (Pre-admission identifier.)
     */
    public Identifier getPreAdmissionIdentifier() {
        if (this.preAdmissionIdentifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterHospitalizationComponent.preAdmissionIdentifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.preAdmissionIdentifier = new Identifier();
        return this.preAdmissionIdentifier;
    }

    public boolean hasPreAdmissionIdentifier() {
        return this.preAdmissionIdentifier != null && !this.preAdmissionIdentifier.isEmpty();
    }

    /**
     * @param value {@link #preAdmissionIdentifier} (Pre-admission identifier.)
     */
    public EncounterHospitalizationComponent setPreAdmissionIdentifier(Identifier value) {
        this.preAdmissionIdentifier = value;
        return this;
    }

    /**
     * @return {@link #origin} (The location from which the patient came before admission.)
     */
    public Reference getOrigin() {
        if (this.origin == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterHospitalizationComponent.origin");
            else if (Configuration.doAutoCreate())
                // cc
                this.origin = new Reference();
        return this.origin;
    }

    public boolean hasOrigin() {
        return this.origin != null && !this.origin.isEmpty();
    }

    /**
     * @param value {@link #origin} (The location from which the patient came before admission.)
     */
    public EncounterHospitalizationComponent setOrigin(Reference value) {
        this.origin = value;
        return this;
    }

    /**
     * @return {@link #origin} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The location from which the patient came before admission.)
     */
    public Location getOriginTarget() {
        if (this.originTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterHospitalizationComponent.origin");
            else if (Configuration.doAutoCreate())
                // aa
                this.originTarget = new Location();
        return this.originTarget;
    }

    /**
     * @param value {@link #origin} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The location from which the patient came before admission.)
     */
    public EncounterHospitalizationComponent setOriginTarget(Location value) {
        this.originTarget = value;
        return this;
    }

    /**
     * @return {@link #admitSource} (From where patient was admitted (physician referral, transfer).)
     */
    public CodeableConcept getAdmitSource() {
        if (this.admitSource == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterHospitalizationComponent.admitSource");
            else if (Configuration.doAutoCreate())
                // cc
                this.admitSource = new CodeableConcept();
        return this.admitSource;
    }

    public boolean hasAdmitSource() {
        return this.admitSource != null && !this.admitSource.isEmpty();
    }

    /**
     * @param value {@link #admitSource} (From where patient was admitted (physician referral, transfer).)
     */
    public EncounterHospitalizationComponent setAdmitSource(CodeableConcept value) {
        this.admitSource = value;
        return this;
    }

    /**
     * @return {@link #admittingDiagnosis} (The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter.)
     */
    public List<Reference> getAdmittingDiagnosis() {
        if (this.admittingDiagnosis == null)
            this.admittingDiagnosis = new ArrayList<Reference>();
        return this.admittingDiagnosis;
    }

    public boolean hasAdmittingDiagnosis() {
        if (this.admittingDiagnosis == null)
            return false;
        for (Reference item : this.admittingDiagnosis) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addAdmittingDiagnosis() {
        // 3
        Reference t = new Reference();
        if (this.admittingDiagnosis == null)
            this.admittingDiagnosis = new ArrayList<Reference>();
        this.admittingDiagnosis.add(t);
        return t;
    }

    // syntactic sugar
    public EncounterHospitalizationComponent addAdmittingDiagnosis(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.admittingDiagnosis == null)
            this.admittingDiagnosis = new ArrayList<Reference>();
        this.admittingDiagnosis.add(t);
        return this;
    }

    /**
     * @return {@link #admittingDiagnosis} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter.)
     */
    public List<Condition> getAdmittingDiagnosisTarget() {
        if (this.admittingDiagnosisTarget == null)
            this.admittingDiagnosisTarget = new ArrayList<Condition>();
        return this.admittingDiagnosisTarget;
    }

    /**
     * @return {@link #admittingDiagnosis} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter.)
     */
    public Condition addAdmittingDiagnosisTarget() {
        Condition r = new Condition();
        if (this.admittingDiagnosisTarget == null)
            this.admittingDiagnosisTarget = new ArrayList<Condition>();
        this.admittingDiagnosisTarget.add(r);
        return r;
    }

    /**
     * @return {@link #reAdmission} (Whether this hospitalization is a readmission and why if known.)
     */
    public CodeableConcept getReAdmission() {
        if (this.reAdmission == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterHospitalizationComponent.reAdmission");
            else if (Configuration.doAutoCreate())
                // cc
                this.reAdmission = new CodeableConcept();
        return this.reAdmission;
    }

    public boolean hasReAdmission() {
        return this.reAdmission != null && !this.reAdmission.isEmpty();
    }

    /**
     * @param value {@link #reAdmission} (Whether this hospitalization is a readmission and why if known.)
     */
    public EncounterHospitalizationComponent setReAdmission(CodeableConcept value) {
        this.reAdmission = value;
        return this;
    }

    /**
     * @return {@link #dietPreference} (Diet preferences reported by the patient.)
     */
    public List<CodeableConcept> getDietPreference() {
        if (this.dietPreference == null)
            this.dietPreference = new ArrayList<CodeableConcept>();
        return this.dietPreference;
    }

    public boolean hasDietPreference() {
        if (this.dietPreference == null)
            return false;
        for (CodeableConcept item : this.dietPreference) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addDietPreference() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.dietPreference == null)
            this.dietPreference = new ArrayList<CodeableConcept>();
        this.dietPreference.add(t);
        return t;
    }

    // syntactic sugar
    public EncounterHospitalizationComponent addDietPreference(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.dietPreference == null)
            this.dietPreference = new ArrayList<CodeableConcept>();
        this.dietPreference.add(t);
        return this;
    }

    /**
     * @return {@link #specialCourtesy} (Special courtesies (VIP, board member).)
     */
    public List<CodeableConcept> getSpecialCourtesy() {
        if (this.specialCourtesy == null)
            this.specialCourtesy = new ArrayList<CodeableConcept>();
        return this.specialCourtesy;
    }

    public boolean hasSpecialCourtesy() {
        if (this.specialCourtesy == null)
            return false;
        for (CodeableConcept item : this.specialCourtesy) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addSpecialCourtesy() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.specialCourtesy == null)
            this.specialCourtesy = new ArrayList<CodeableConcept>();
        this.specialCourtesy.add(t);
        return t;
    }

    // syntactic sugar
    public EncounterHospitalizationComponent addSpecialCourtesy(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.specialCourtesy == null)
            this.specialCourtesy = new ArrayList<CodeableConcept>();
        this.specialCourtesy.add(t);
        return this;
    }

    /**
     * @return {@link #specialArrangement} (Wheelchair, translator, stretcher, etc.)
     */
    public List<CodeableConcept> getSpecialArrangement() {
        if (this.specialArrangement == null)
            this.specialArrangement = new ArrayList<CodeableConcept>();
        return this.specialArrangement;
    }

    public boolean hasSpecialArrangement() {
        if (this.specialArrangement == null)
            return false;
        for (CodeableConcept item : this.specialArrangement) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addSpecialArrangement() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.specialArrangement == null)
            this.specialArrangement = new ArrayList<CodeableConcept>();
        this.specialArrangement.add(t);
        return t;
    }

    // syntactic sugar
    public EncounterHospitalizationComponent addSpecialArrangement(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.specialArrangement == null)
            this.specialArrangement = new ArrayList<CodeableConcept>();
        this.specialArrangement.add(t);
        return this;
    }

    /**
     * @return {@link #destination} (Location to which the patient is discharged.)
     */
    public Reference getDestination() {
        if (this.destination == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterHospitalizationComponent.destination");
            else if (Configuration.doAutoCreate())
                // cc
                this.destination = new Reference();
        return this.destination;
    }

    public boolean hasDestination() {
        return this.destination != null && !this.destination.isEmpty();
    }

    /**
     * @param value {@link #destination} (Location to which the patient is discharged.)
     */
    public EncounterHospitalizationComponent setDestination(Reference value) {
        this.destination = value;
        return this;
    }

    /**
     * @return {@link #destination} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Location to which the patient is discharged.)
     */
    public Location getDestinationTarget() {
        if (this.destinationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterHospitalizationComponent.destination");
            else if (Configuration.doAutoCreate())
                // aa
                this.destinationTarget = new Location();
        return this.destinationTarget;
    }

    /**
     * @param value {@link #destination} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Location to which the patient is discharged.)
     */
    public EncounterHospitalizationComponent setDestinationTarget(Location value) {
        this.destinationTarget = value;
        return this;
    }

    /**
     * @return {@link #dischargeDisposition} (Category or kind of location after discharge.)
     */
    public CodeableConcept getDischargeDisposition() {
        if (this.dischargeDisposition == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create EncounterHospitalizationComponent.dischargeDisposition");
            else if (Configuration.doAutoCreate())
                // cc
                this.dischargeDisposition = new CodeableConcept();
        return this.dischargeDisposition;
    }

    public boolean hasDischargeDisposition() {
        return this.dischargeDisposition != null && !this.dischargeDisposition.isEmpty();
    }

    /**
     * @param value {@link #dischargeDisposition} (Category or kind of location after discharge.)
     */
    public EncounterHospitalizationComponent setDischargeDisposition(CodeableConcept value) {
        this.dischargeDisposition = value;
        return this;
    }

    /**
     * @return {@link #dischargeDiagnosis} (The final diagnosis given a patient before release from the hospital after all testing, surgery, and workup are complete.)
     */
    public List<Reference> getDischargeDiagnosis() {
        if (this.dischargeDiagnosis == null)
            this.dischargeDiagnosis = new ArrayList<Reference>();
        return this.dischargeDiagnosis;
    }

    public boolean hasDischargeDiagnosis() {
        if (this.dischargeDiagnosis == null)
            return false;
        for (Reference item : this.dischargeDiagnosis) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addDischargeDiagnosis() {
        // 3
        Reference t = new Reference();
        if (this.dischargeDiagnosis == null)
            this.dischargeDiagnosis = new ArrayList<Reference>();
        this.dischargeDiagnosis.add(t);
        return t;
    }

    // syntactic sugar
    public EncounterHospitalizationComponent addDischargeDiagnosis(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.dischargeDiagnosis == null)
            this.dischargeDiagnosis = new ArrayList<Reference>();
        this.dischargeDiagnosis.add(t);
        return this;
    }

    /**
     * @return {@link #dischargeDiagnosis} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The final diagnosis given a patient before release from the hospital after all testing, surgery, and workup are complete.)
     */
    public List<Condition> getDischargeDiagnosisTarget() {
        if (this.dischargeDiagnosisTarget == null)
            this.dischargeDiagnosisTarget = new ArrayList<Condition>();
        return this.dischargeDiagnosisTarget;
    }

    /**
     * @return {@link #dischargeDiagnosis} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. The final diagnosis given a patient before release from the hospital after all testing, surgery, and workup are complete.)
     */
    public Condition addDischargeDiagnosisTarget() {
        Condition r = new Condition();
        if (this.dischargeDiagnosisTarget == null)
            this.dischargeDiagnosisTarget = new ArrayList<Condition>();
        this.dischargeDiagnosisTarget.add(r);
        return r;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("preAdmissionIdentifier", "Identifier", "Pre-admission identifier.", 0, java.lang.Integer.MAX_VALUE, preAdmissionIdentifier));
        childrenList.add(new Property("origin", "Reference(Location)", "The location from which the patient came before admission.", 0, java.lang.Integer.MAX_VALUE, origin));
        childrenList.add(new Property("admitSource", "CodeableConcept", "From where patient was admitted (physician referral, transfer).", 0, java.lang.Integer.MAX_VALUE, admitSource));
        childrenList.add(new Property("admittingDiagnosis", "Reference(Condition)", "The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter.", 0, java.lang.Integer.MAX_VALUE, admittingDiagnosis));
        childrenList.add(new Property("reAdmission", "CodeableConcept", "Whether this hospitalization is a readmission and why if known.", 0, java.lang.Integer.MAX_VALUE, reAdmission));
        childrenList.add(new Property("dietPreference", "CodeableConcept", "Diet preferences reported by the patient.", 0, java.lang.Integer.MAX_VALUE, dietPreference));
        childrenList.add(new Property("specialCourtesy", "CodeableConcept", "Special courtesies (VIP, board member).", 0, java.lang.Integer.MAX_VALUE, specialCourtesy));
        childrenList.add(new Property("specialArrangement", "CodeableConcept", "Wheelchair, translator, stretcher, etc.", 0, java.lang.Integer.MAX_VALUE, specialArrangement));
        childrenList.add(new Property("destination", "Reference(Location)", "Location to which the patient is discharged.", 0, java.lang.Integer.MAX_VALUE, destination));
        childrenList.add(new Property("dischargeDisposition", "CodeableConcept", "Category or kind of location after discharge.", 0, java.lang.Integer.MAX_VALUE, dischargeDisposition));
        childrenList.add(new Property("dischargeDiagnosis", "Reference(Condition)", "The final diagnosis given a patient before release from the hospital after all testing, surgery, and workup are complete.", 0, java.lang.Integer.MAX_VALUE, dischargeDiagnosis));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("preAdmissionIdentifier"))
            // Identifier
            this.preAdmissionIdentifier = castToIdentifier(value);
        else if (name.equals("origin"))
            // Reference
            this.origin = castToReference(value);
        else if (name.equals("admitSource"))
            // CodeableConcept
            this.admitSource = castToCodeableConcept(value);
        else if (name.equals("admittingDiagnosis"))
            this.getAdmittingDiagnosis().add(castToReference(value));
        else if (name.equals("reAdmission"))
            // CodeableConcept
            this.reAdmission = castToCodeableConcept(value);
        else if (name.equals("dietPreference"))
            this.getDietPreference().add(castToCodeableConcept(value));
        else if (name.equals("specialCourtesy"))
            this.getSpecialCourtesy().add(castToCodeableConcept(value));
        else if (name.equals("specialArrangement"))
            this.getSpecialArrangement().add(castToCodeableConcept(value));
        else if (name.equals("destination"))
            // Reference
            this.destination = castToReference(value);
        else if (name.equals("dischargeDisposition"))
            // CodeableConcept
            this.dischargeDisposition = castToCodeableConcept(value);
        else if (name.equals("dischargeDiagnosis"))
            this.getDischargeDiagnosis().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("preAdmissionIdentifier")) {
            this.preAdmissionIdentifier = new Identifier();
            return this.preAdmissionIdentifier;
        } else if (name.equals("origin")) {
            this.origin = new Reference();
            return this.origin;
        } else if (name.equals("admitSource")) {
            this.admitSource = new CodeableConcept();
            return this.admitSource;
        } else if (name.equals("admittingDiagnosis")) {
            return addAdmittingDiagnosis();
        } else if (name.equals("reAdmission")) {
            this.reAdmission = new CodeableConcept();
            return this.reAdmission;
        } else if (name.equals("dietPreference")) {
            return addDietPreference();
        } else if (name.equals("specialCourtesy")) {
            return addSpecialCourtesy();
        } else if (name.equals("specialArrangement")) {
            return addSpecialArrangement();
        } else if (name.equals("destination")) {
            this.destination = new Reference();
            return this.destination;
        } else if (name.equals("dischargeDisposition")) {
            this.dischargeDisposition = new CodeableConcept();
            return this.dischargeDisposition;
        } else if (name.equals("dischargeDiagnosis")) {
            return addDischargeDiagnosis();
        } else
            return super.addChild(name);
    }

    public EncounterHospitalizationComponent copy() {
        EncounterHospitalizationComponent dst = new EncounterHospitalizationComponent();
        copyValues(dst);
        dst.preAdmissionIdentifier = preAdmissionIdentifier == null ? null : preAdmissionIdentifier.copy();
        dst.origin = origin == null ? null : origin.copy();
        dst.admitSource = admitSource == null ? null : admitSource.copy();
        if (admittingDiagnosis != null) {
            dst.admittingDiagnosis = new ArrayList<Reference>();
            for (Reference i : admittingDiagnosis) dst.admittingDiagnosis.add(i.copy());
        }
        ;
        dst.reAdmission = reAdmission == null ? null : reAdmission.copy();
        if (dietPreference != null) {
            dst.dietPreference = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : dietPreference) dst.dietPreference.add(i.copy());
        }
        ;
        if (specialCourtesy != null) {
            dst.specialCourtesy = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : specialCourtesy) dst.specialCourtesy.add(i.copy());
        }
        ;
        if (specialArrangement != null) {
            dst.specialArrangement = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : specialArrangement) dst.specialArrangement.add(i.copy());
        }
        ;
        dst.destination = destination == null ? null : destination.copy();
        dst.dischargeDisposition = dischargeDisposition == null ? null : dischargeDisposition.copy();
        if (dischargeDiagnosis != null) {
            dst.dischargeDiagnosis = new ArrayList<Reference>();
            for (Reference i : dischargeDiagnosis) dst.dischargeDiagnosis.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof EncounterHospitalizationComponent))
            return false;
        EncounterHospitalizationComponent o = (EncounterHospitalizationComponent) other;
        return compareDeep(preAdmissionIdentifier, o.preAdmissionIdentifier, true) && compareDeep(origin, o.origin, true) && compareDeep(admitSource, o.admitSource, true) && compareDeep(admittingDiagnosis, o.admittingDiagnosis, true) && compareDeep(reAdmission, o.reAdmission, true) && compareDeep(dietPreference, o.dietPreference, true) && compareDeep(specialCourtesy, o.specialCourtesy, true) && compareDeep(specialArrangement, o.specialArrangement, true) && compareDeep(destination, o.destination, true) && compareDeep(dischargeDisposition, o.dischargeDisposition, true) && compareDeep(dischargeDiagnosis, o.dischargeDiagnosis, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof EncounterHospitalizationComponent))
            return false;
        EncounterHospitalizationComponent o = (EncounterHospitalizationComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (preAdmissionIdentifier == null || preAdmissionIdentifier.isEmpty()) && (origin == null || origin.isEmpty()) && (admitSource == null || admitSource.isEmpty()) && (admittingDiagnosis == null || admittingDiagnosis.isEmpty()) && (reAdmission == null || reAdmission.isEmpty()) && (dietPreference == null || dietPreference.isEmpty()) && (specialCourtesy == null || specialCourtesy.isEmpty()) && (specialArrangement == null || specialArrangement.isEmpty()) && (destination == null || destination.isEmpty()) && (dischargeDisposition == null || dischargeDisposition.isEmpty()) && (dischargeDiagnosis == null || dischargeDiagnosis.isEmpty());
    }

    public String fhirType() {
        return "Encounter.hospitalization";
    }
}
