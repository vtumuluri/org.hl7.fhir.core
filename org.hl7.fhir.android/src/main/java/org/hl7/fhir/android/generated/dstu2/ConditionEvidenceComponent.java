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

public class ConditionEvidenceComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A manifestation or symptom that led to the recording of this condition.
     */
    protected CodeableConcept code;

    /**
     * Links to other relevant information, including pathology reports.
     */
    protected List<Reference> detail;

    /**
     * The actual objects that are the target of the reference (Links to other relevant information, including pathology reports.)
     */
    protected List<Resource> detailTarget;

    private static final long serialVersionUID = 945689926L;

    /*
     * Constructor
     */
    public ConditionEvidenceComponent() {
        super();
    }

    /**
     * @return {@link #code} (A manifestation or symptom that led to the recording of this condition.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ConditionEvidenceComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A manifestation or symptom that led to the recording of this condition.)
     */
    public ConditionEvidenceComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #detail} (Links to other relevant information, including pathology reports.)
     */
    public List<Reference> getDetail() {
        if (this.detail == null)
            this.detail = new ArrayList<Reference>();
        return this.detail;
    }

    public boolean hasDetail() {
        if (this.detail == null)
            return false;
        for (Reference item : this.detail) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addDetail() {
        // 3
        Reference t = new Reference();
        if (this.detail == null)
            this.detail = new ArrayList<Reference>();
        this.detail.add(t);
        return t;
    }

    // syntactic sugar
    public ConditionEvidenceComponent addDetail(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.detail == null)
            this.detail = new ArrayList<Reference>();
        this.detail.add(t);
        return this;
    }

    /**
     * @return {@link #detail} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Links to other relevant information, including pathology reports.)
     */
    public List<Resource> getDetailTarget() {
        if (this.detailTarget == null)
            this.detailTarget = new ArrayList<Resource>();
        return this.detailTarget;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "A manifestation or symptom that led to the recording of this condition.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("detail", "Reference(Any)", "Links to other relevant information, including pathology reports.", 0, java.lang.Integer.MAX_VALUE, detail));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("detail"))
            this.getDetail().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("detail")) {
            return addDetail();
        } else
            return super.addChild(name);
    }

    public ConditionEvidenceComponent copy() {
        ConditionEvidenceComponent dst = new ConditionEvidenceComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        if (detail != null) {
            dst.detail = new ArrayList<Reference>();
            for (Reference i : detail) dst.detail.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ConditionEvidenceComponent))
            return false;
        ConditionEvidenceComponent o = (ConditionEvidenceComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(detail, o.detail, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ConditionEvidenceComponent))
            return false;
        ConditionEvidenceComponent o = (ConditionEvidenceComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (detail == null || detail.isEmpty());
    }

    public String fhirType() {
        return "Condition.evidence";
    }
}
