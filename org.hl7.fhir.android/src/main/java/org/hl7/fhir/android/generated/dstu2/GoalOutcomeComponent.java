package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.GoalEnum.GoalStatus;
import org.hl7.fhir.android.generated.dstu2.GoalEnum.GoalStatusEnumFactory;

public class GoalOutcomeComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Details of what's changed (or not changed).
     */
    protected Type result;

    private static final long serialVersionUID = 1994317639L;

    /*
     * Constructor
     */
    public GoalOutcomeComponent() {
        super();
    }

    /**
     * @return {@link #result} (Details of what's changed (or not changed).)
     */
    public Type getResult() {
        return this.result;
    }

    /**
     * @return {@link #result} (Details of what's changed (or not changed).)
     */
    public CodeableConcept getResultCodeableConcept() throws FHIRException {
        if (!(this.result instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.result.getClass().getName() + " was encountered");
        return (CodeableConcept) this.result;
    }

    public boolean hasResultCodeableConcept() {
        return this.result instanceof CodeableConcept;
    }

    /**
     * @return {@link #result} (Details of what's changed (or not changed).)
     */
    public Reference getResultReference() throws FHIRException {
        if (!(this.result instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.result.getClass().getName() + " was encountered");
        return (Reference) this.result;
    }

    public boolean hasResultReference() {
        return this.result instanceof Reference;
    }

    public boolean hasResult() {
        return this.result != null && !this.result.isEmpty();
    }

    /**
     * @param value {@link #result} (Details of what's changed (or not changed).)
     */
    public GoalOutcomeComponent setResult(Type value) {
        this.result = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("result[x]", "CodeableConcept|Reference(Observation)", "Details of what's changed (or not changed).", 0, java.lang.Integer.MAX_VALUE, result));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("result[x]"))
            // Type
            this.result = (Type) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("resultCodeableConcept")) {
            this.result = new CodeableConcept();
            return this.result;
        } else if (name.equals("resultReference")) {
            this.result = new Reference();
            return this.result;
        } else
            return super.addChild(name);
    }

    public GoalOutcomeComponent copy() {
        GoalOutcomeComponent dst = new GoalOutcomeComponent();
        copyValues(dst);
        dst.result = result == null ? null : result.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof GoalOutcomeComponent))
            return false;
        GoalOutcomeComponent o = (GoalOutcomeComponent) other;
        return compareDeep(result, o.result, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof GoalOutcomeComponent))
            return false;
        GoalOutcomeComponent o = (GoalOutcomeComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (result == null || result.isEmpty());
    }

    public String fhirType() {
        return "Goal.outcome";
    }
}
