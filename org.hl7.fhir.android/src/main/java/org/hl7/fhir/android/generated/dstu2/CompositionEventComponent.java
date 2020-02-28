package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionAttestationMode;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionAttestationModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionStatus;
import org.hl7.fhir.android.generated.dstu2.CompositionEnum.CompositionStatusEnumFactory;

public class CompositionEventComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
     */
    protected List<CodeableConcept> code;

    /**
     * The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.
     */
    protected Period period;

    /**
     * The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.
     */
    protected List<Reference> detail;

    /**
     * The actual objects that are the target of the reference (The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.)
     */
    protected List<Resource> detailTarget;

    private static final long serialVersionUID = -1581379774L;

    /*
     * Constructor
     */
    public CompositionEventComponent() {
        super();
    }

    /**
     * @return {@link #code} (This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.)
     */
    public List<CodeableConcept> getCode() {
        if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
        return this.code;
    }

    public boolean hasCode() {
        if (this.code == null)
            return false;
        for (CodeableConcept item : this.code) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addCode() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
        this.code.add(t);
        return t;
    }

    // syntactic sugar
    public CompositionEventComponent addCode(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
        this.code.add(t);
        return this;
    }

    /**
     * @return {@link #period} (The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.)
     */
    public Period getPeriod() {
        if (this.period == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CompositionEventComponent.period");
            else if (Configuration.doAutoCreate())
                // cc
                this.period = new Period();
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.)
     */
    public CompositionEventComponent setPeriod(Period value) {
        this.period = value;
        return this;
    }

    /**
     * @return {@link #detail} (The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.)
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
    public CompositionEventComponent addDetail(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.detail == null)
            this.detail = new ArrayList<Reference>();
        this.detail.add(t);
        return this;
    }

    /**
     * @return {@link #detail} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.)
     */
    public List<Resource> getDetailTarget() {
        if (this.detailTarget == null)
            this.detailTarget = new ArrayList<Resource>();
        return this.detailTarget;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("period", "Period", "The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("detail", "Reference(Any)", "The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.", 0, java.lang.Integer.MAX_VALUE, detail));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            this.getCode().add(castToCodeableConcept(value));
        else if (name.equals("period"))
            // Period
            this.period = castToPeriod(value);
        else if (name.equals("detail"))
            this.getDetail().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            return addCode();
        } else if (name.equals("period")) {
            this.period = new Period();
            return this.period;
        } else if (name.equals("detail")) {
            return addDetail();
        } else
            return super.addChild(name);
    }

    public CompositionEventComponent copy() {
        CompositionEventComponent dst = new CompositionEventComponent();
        copyValues(dst);
        if (code != null) {
            dst.code = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : code) dst.code.add(i.copy());
        }
        ;
        dst.period = period == null ? null : period.copy();
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
        if (!(other instanceof CompositionEventComponent))
            return false;
        CompositionEventComponent o = (CompositionEventComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(period, o.period, true) && compareDeep(detail, o.detail, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof CompositionEventComponent))
            return false;
        CompositionEventComponent o = (CompositionEventComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (period == null || period.isEmpty()) && (detail == null || detail.isEmpty());
    }

    public String fhirType() {
        return "Composition.event";
    }
}
