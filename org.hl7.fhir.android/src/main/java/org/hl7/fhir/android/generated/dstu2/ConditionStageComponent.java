package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ConditionEnum.ConditionVerificationStatus;
import org.hl7.fhir.android.generated.dstu2.ConditionEnum.ConditionVerificationStatusEnumFactory;

public class ConditionStageComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A simple summary of the stage such as "Stage 3". The determination of the stage is disease-specific.
     */
    protected CodeableConcept summary;

    /**
     * Reference to a formal record of the evidence on which the staging assessment is based.
     */
    protected List<Reference> assessment;

    /**
     * The actual objects that are the target of the reference (Reference to a formal record of the evidence on which the staging assessment is based.)
     */
    protected List<Resource> assessmentTarget;

    private static final long serialVersionUID = -1961530405L;

    /*
     * Constructor
     */
    public ConditionStageComponent() {
        super();
    }

    /**
     * @return {@link #summary} (A simple summary of the stage such as "Stage 3". The determination of the stage is disease-specific.)
     */
    public CodeableConcept getSummary() {
        if (this.summary == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConditionStageComponent.summary");
            else if (Configuration.doAutoCreate())
                // cc
                this.summary = new CodeableConcept();
        return this.summary;
    }

    public boolean hasSummary() {
        return this.summary != null && !this.summary.isEmpty();
    }

    /**
     * @param value {@link #summary} (A simple summary of the stage such as "Stage 3". The determination of the stage is disease-specific.)
     */
    public ConditionStageComponent setSummary(CodeableConcept value) {
        this.summary = value;
        return this;
    }

    /**
     * @return {@link #assessment} (Reference to a formal record of the evidence on which the staging assessment is based.)
     */
    public List<Reference> getAssessment() {
        if (this.assessment == null)
            this.assessment = new ArrayList<Reference>();
        return this.assessment;
    }

    public boolean hasAssessment() {
        if (this.assessment == null)
            return false;
        for (Reference item : this.assessment) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addAssessment() {
        // 3
        Reference t = new Reference();
        if (this.assessment == null)
            this.assessment = new ArrayList<Reference>();
        this.assessment.add(t);
        return t;
    }

    // syntactic sugar
    public ConditionStageComponent addAssessment(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.assessment == null)
            this.assessment = new ArrayList<Reference>();
        this.assessment.add(t);
        return this;
    }

    /**
     * @return {@link #assessment} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Reference to a formal record of the evidence on which the staging assessment is based.)
     */
    public List<Resource> getAssessmentTarget() {
        if (this.assessmentTarget == null)
            this.assessmentTarget = new ArrayList<Resource>();
        return this.assessmentTarget;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("summary", "CodeableConcept", "A simple summary of the stage such as \"Stage 3\". The determination of the stage is disease-specific.", 0, java.lang.Integer.MAX_VALUE, summary));
        childrenList.add(new Property("assessment", "Reference(ClinicalImpression|DiagnosticReport|Observation)", "Reference to a formal record of the evidence on which the staging assessment is based.", 0, java.lang.Integer.MAX_VALUE, assessment));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("summary"))
            // CodeableConcept
            this.summary = castToCodeableConcept(value);
        else if (name.equals("assessment"))
            this.getAssessment().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("summary")) {
            this.summary = new CodeableConcept();
            return this.summary;
        } else if (name.equals("assessment")) {
            return addAssessment();
        } else
            return super.addChild(name);
    }

    public ConditionStageComponent copy() {
        ConditionStageComponent dst = new ConditionStageComponent();
        copyValues(dst);
        dst.summary = summary == null ? null : summary.copy();
        if (assessment != null) {
            dst.assessment = new ArrayList<Reference>();
            for (Reference i : assessment) dst.assessment.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConditionStageComponent))
            return false;
        ConditionStageComponent o = (ConditionStageComponent) other;
        return compareDeep(summary, o.summary, true) && compareDeep(assessment, o.assessment, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConditionStageComponent))
            return false;
        ConditionStageComponent o = (ConditionStageComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (summary == null || summary.isEmpty()) && (assessment == null || assessment.isEmpty());
    }

    public String fhirType() {
        return "Condition.stage";
    }
}
