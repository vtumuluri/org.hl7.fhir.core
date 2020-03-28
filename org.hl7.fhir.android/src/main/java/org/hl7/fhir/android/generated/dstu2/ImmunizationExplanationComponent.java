package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class ImmunizationExplanationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Reasons why a vaccine was administered.
     */
    protected List<CodeableConcept> reason;

    /**
     * Reason why a vaccine was not administered.
     */
    protected List<CodeableConcept> reasonNotGiven;

    private static final long serialVersionUID = -539821866L;

    /*
     * Constructor
     */
    public ImmunizationExplanationComponent() {
        super();
    }

    /**
     * @return {@link #reason} (Reasons why a vaccine was administered.)
     */
    public List<CodeableConcept> getReason() {
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        return this.reason;
    }

    public boolean hasReason() {
        if (this.reason == null)
            return false;
        for (CodeableConcept item : this.reason) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addReason() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        this.reason.add(t);
        return t;
    }

    // syntactic sugar
    public ImmunizationExplanationComponent addReason(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reason == null)
            this.reason = new ArrayList<CodeableConcept>();
        this.reason.add(t);
        return this;
    }

    /**
     * @return {@link #reasonNotGiven} (Reason why a vaccine was not administered.)
     */
    public List<CodeableConcept> getReasonNotGiven() {
        if (this.reasonNotGiven == null)
            this.reasonNotGiven = new ArrayList<CodeableConcept>();
        return this.reasonNotGiven;
    }

    public boolean hasReasonNotGiven() {
        if (this.reasonNotGiven == null)
            return false;
        for (CodeableConcept item : this.reasonNotGiven) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addReasonNotGiven() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.reasonNotGiven == null)
            this.reasonNotGiven = new ArrayList<CodeableConcept>();
        this.reasonNotGiven.add(t);
        return t;
    }

    // syntactic sugar
    public ImmunizationExplanationComponent addReasonNotGiven(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.reasonNotGiven == null)
            this.reasonNotGiven = new ArrayList<CodeableConcept>();
        this.reasonNotGiven.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("reason", "CodeableConcept", "Reasons why a vaccine was administered.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("reasonNotGiven", "CodeableConcept", "Reason why a vaccine was not administered.", 0, java.lang.Integer.MAX_VALUE, reasonNotGiven));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("reason"))
            this.getReason().add(castToCodeableConcept(value));
        else if (name.equals("reasonNotGiven"))
            this.getReasonNotGiven().add(castToCodeableConcept(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("reason")) {
            return addReason();
        } else if (name.equals("reasonNotGiven")) {
            return addReasonNotGiven();
        } else
            return super.addChild(name);
    }

    public ImmunizationExplanationComponent copy() {
        ImmunizationExplanationComponent dst = new ImmunizationExplanationComponent();
        copyValues(dst);
        if (reason != null) {
            dst.reason = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reason) dst.reason.add(i.copy());
        }
        ;
        if (reasonNotGiven != null) {
            dst.reasonNotGiven = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : reasonNotGiven) dst.reasonNotGiven.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImmunizationExplanationComponent))
            return false;
        ImmunizationExplanationComponent o = (ImmunizationExplanationComponent) other;
        return compareDeep(reason, o.reason, true) && compareDeep(reasonNotGiven, o.reasonNotGiven, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImmunizationExplanationComponent))
            return false;
        ImmunizationExplanationComponent o = (ImmunizationExplanationComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (reason == null || reason.isEmpty()) && (reasonNotGiven == null || reasonNotGiven.isEmpty());
    }

    public String fhirType() {
        return "Immunization.explanation";
    }
}
