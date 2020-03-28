package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class RiskAssessmentPredictionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * One of the potential outcomes for the patient (e.g. remission, death,  a particular condition).
     */
    protected CodeableConcept outcome;

    /**
     * How likely is the outcome (in the specified timeframe).
     */
    protected Type probability;

    /**
     * Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).
     */
    protected DecimalType relativeRisk;

    /**
     * Indicates the period of time or age range of the subject to which the specified probability applies.
     */
    protected Type when;

    /**
     * Additional information explaining the basis for the prediction.
     */
    protected StringType rationale;

    private static final long serialVersionUID = 647967428L;

    /*
     * Constructor
     */
    public RiskAssessmentPredictionComponent() {
        super();
    }

    /*
     * Constructor
     */
    public RiskAssessmentPredictionComponent(CodeableConcept outcome) {
        super();
        this.outcome = outcome;
    }

    /**
     * @return {@link #outcome} (One of the potential outcomes for the patient (e.g. remission, death,  a particular condition).)
     */
    public CodeableConcept getOutcome() {
        if (this.outcome == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessmentPredictionComponent.outcome");
            else if (Configuration.doAutoCreate())
                // cc
                this.outcome = new CodeableConcept();
        return this.outcome;
    }

    public boolean hasOutcome() {
        return this.outcome != null && !this.outcome.isEmpty();
    }

    /**
     * @param value {@link #outcome} (One of the potential outcomes for the patient (e.g. remission, death,  a particular condition).)
     */
    public RiskAssessmentPredictionComponent setOutcome(CodeableConcept value) {
        this.outcome = value;
        return this;
    }

    /**
     * @return {@link #probability} (How likely is the outcome (in the specified timeframe).)
     */
    public Type getProbability() {
        return this.probability;
    }

    /**
     * @return {@link #probability} (How likely is the outcome (in the specified timeframe).)
     */
    public DecimalType getProbabilityDecimalType() throws FHIRException {
        if (!(this.probability instanceof DecimalType))
            throw new FHIRException("Type mismatch: the type DecimalType was expected, but " + this.probability.getClass().getName() + " was encountered");
        return (DecimalType) this.probability;
    }

    public boolean hasProbabilityDecimalType() {
        return this.probability instanceof DecimalType;
    }

    /**
     * @return {@link #probability} (How likely is the outcome (in the specified timeframe).)
     */
    public Range getProbabilityRange() throws FHIRException {
        if (!(this.probability instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.probability.getClass().getName() + " was encountered");
        return (Range) this.probability;
    }

    public boolean hasProbabilityRange() {
        return this.probability instanceof Range;
    }

    /**
     * @return {@link #probability} (How likely is the outcome (in the specified timeframe).)
     */
    public CodeableConcept getProbabilityCodeableConcept() throws FHIRException {
        if (!(this.probability instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.probability.getClass().getName() + " was encountered");
        return (CodeableConcept) this.probability;
    }

    public boolean hasProbabilityCodeableConcept() {
        return this.probability instanceof CodeableConcept;
    }

    public boolean hasProbability() {
        return this.probability != null && !this.probability.isEmpty();
    }

    /**
     * @param value {@link #probability} (How likely is the outcome (in the specified timeframe).)
     */
    public RiskAssessmentPredictionComponent setProbability(Type value) {
        this.probability = value;
        return this;
    }

    /**
     * @return {@link #relativeRisk} (Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).). This is the underlying object with id, value and extensions. The accessor "getRelativeRisk" gives direct access to the value
     */
    public DecimalType getRelativeRiskElement() {
        if (this.relativeRisk == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessmentPredictionComponent.relativeRisk");
            else if (Configuration.doAutoCreate())
                // bb
                this.relativeRisk = new DecimalType();
        return this.relativeRisk;
    }

    public boolean hasRelativeRiskElement() {
        return this.relativeRisk != null && !this.relativeRisk.isEmpty();
    }

    public boolean hasRelativeRisk() {
        return this.relativeRisk != null && !this.relativeRisk.isEmpty();
    }

    /**
     * @param value {@link #relativeRisk} (Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).). This is the underlying object with id, value and extensions. The accessor "getRelativeRisk" gives direct access to the value
     */
    public RiskAssessmentPredictionComponent setRelativeRiskElement(DecimalType value) {
        this.relativeRisk = value;
        return this;
    }

    /**
     * @return Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).
     */
    public BigDecimal getRelativeRisk() {
        return this.relativeRisk == null ? null : this.relativeRisk.getValue();
    }

    /**
     * @param value Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).
     */
    public RiskAssessmentPredictionComponent setRelativeRisk(BigDecimal value) {
        if (value == null)
            this.relativeRisk = null;
        else {
            if (this.relativeRisk == null)
                this.relativeRisk = new DecimalType();
            this.relativeRisk.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #when} (Indicates the period of time or age range of the subject to which the specified probability applies.)
     */
    public Type getWhen() {
        return this.when;
    }

    /**
     * @return {@link #when} (Indicates the period of time or age range of the subject to which the specified probability applies.)
     */
    public Period getWhenPeriod() throws FHIRException {
        if (!(this.when instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.when.getClass().getName() + " was encountered");
        return (Period) this.when;
    }

    public boolean hasWhenPeriod() {
        return this.when instanceof Period;
    }

    /**
     * @return {@link #when} (Indicates the period of time or age range of the subject to which the specified probability applies.)
     */
    public Range getWhenRange() throws FHIRException {
        if (!(this.when instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.when.getClass().getName() + " was encountered");
        return (Range) this.when;
    }

    public boolean hasWhenRange() {
        return this.when instanceof Range;
    }

    public boolean hasWhen() {
        return this.when != null && !this.when.isEmpty();
    }

    /**
     * @param value {@link #when} (Indicates the period of time or age range of the subject to which the specified probability applies.)
     */
    public RiskAssessmentPredictionComponent setWhen(Type value) {
        this.when = value;
        return this;
    }

    /**
     * @return {@link #rationale} (Additional information explaining the basis for the prediction.). This is the underlying object with id, value and extensions. The accessor "getRationale" gives direct access to the value
     */
    public StringType getRationaleElement() {
        if (this.rationale == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create RiskAssessmentPredictionComponent.rationale");
            else if (Configuration.doAutoCreate())
                // bb
                this.rationale = new StringType();
        return this.rationale;
    }

    public boolean hasRationaleElement() {
        return this.rationale != null && !this.rationale.isEmpty();
    }

    public boolean hasRationale() {
        return this.rationale != null && !this.rationale.isEmpty();
    }

    /**
     * @param value {@link #rationale} (Additional information explaining the basis for the prediction.). This is the underlying object with id, value and extensions. The accessor "getRationale" gives direct access to the value
     */
    public RiskAssessmentPredictionComponent setRationaleElement(StringType value) {
        this.rationale = value;
        return this;
    }

    /**
     * @return Additional information explaining the basis for the prediction.
     */
    public String getRationale() {
        return this.rationale == null ? null : this.rationale.getValue();
    }

    /**
     * @param value Additional information explaining the basis for the prediction.
     */
    public RiskAssessmentPredictionComponent setRationale(String value) {
        if (Utilities.noString(value))
            this.rationale = null;
        else {
            if (this.rationale == null)
                this.rationale = new StringType();
            this.rationale.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("outcome", "CodeableConcept", "One of the potential outcomes for the patient (e.g. remission, death,  a particular condition).", 0, java.lang.Integer.MAX_VALUE, outcome));
        childrenList.add(new Property("probability[x]", "decimal|Range|CodeableConcept", "How likely is the outcome (in the specified timeframe).", 0, java.lang.Integer.MAX_VALUE, probability));
        childrenList.add(new Property("relativeRisk", "decimal", "Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).", 0, java.lang.Integer.MAX_VALUE, relativeRisk));
        childrenList.add(new Property("when[x]", "Period|Range", "Indicates the period of time or age range of the subject to which the specified probability applies.", 0, java.lang.Integer.MAX_VALUE, when));
        childrenList.add(new Property("rationale", "string", "Additional information explaining the basis for the prediction.", 0, java.lang.Integer.MAX_VALUE, rationale));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("outcome"))
            // CodeableConcept
            this.outcome = castToCodeableConcept(value);
        else if (name.equals("probability[x]"))
            // Type
            this.probability = (Type) value;
        else if (name.equals("relativeRisk"))
            // DecimalType
            this.relativeRisk = castToDecimal(value);
        else if (name.equals("when[x]"))
            // Type
            this.when = (Type) value;
        else if (name.equals("rationale"))
            // StringType
            this.rationale = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("outcome")) {
            this.outcome = new CodeableConcept();
            return this.outcome;
        } else if (name.equals("probabilityDecimal")) {
            this.probability = new DecimalType();
            return this.probability;
        } else if (name.equals("probabilityRange")) {
            this.probability = new Range();
            return this.probability;
        } else if (name.equals("probabilityCodeableConcept")) {
            this.probability = new CodeableConcept();
            return this.probability;
        } else if (name.equals("relativeRisk")) {
            throw new FHIRException("Cannot call addChild on a primitive type RiskAssessment.relativeRisk");
        } else if (name.equals("whenPeriod")) {
            this.when = new Period();
            return this.when;
        } else if (name.equals("whenRange")) {
            this.when = new Range();
            return this.when;
        } else if (name.equals("rationale")) {
            throw new FHIRException("Cannot call addChild on a primitive type RiskAssessment.rationale");
        } else
            return super.addChild(name);
    }

    public RiskAssessmentPredictionComponent copy() {
        RiskAssessmentPredictionComponent dst = new RiskAssessmentPredictionComponent();
        copyValues(dst);
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.probability = probability == null ? null : probability.copy();
        dst.relativeRisk = relativeRisk == null ? null : relativeRisk.copy();
        dst.when = when == null ? null : when.copy();
        dst.rationale = rationale == null ? null : rationale.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof RiskAssessmentPredictionComponent))
            return false;
        RiskAssessmentPredictionComponent o = (RiskAssessmentPredictionComponent) other;
        return compareDeep(outcome, o.outcome, true) && compareDeep(probability, o.probability, true) && compareDeep(relativeRisk, o.relativeRisk, true) && compareDeep(when, o.when, true) && compareDeep(rationale, o.rationale, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof RiskAssessmentPredictionComponent))
            return false;
        RiskAssessmentPredictionComponent o = (RiskAssessmentPredictionComponent) other;
        return compareValues(relativeRisk, o.relativeRisk, true) && compareValues(rationale, o.rationale, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (outcome == null || outcome.isEmpty()) && (probability == null || probability.isEmpty()) && (relativeRisk == null || relativeRisk.isEmpty()) && (when == null || when.isEmpty()) && (rationale == null || rationale.isEmpty());
    }

    public String fhirType() {
        return "RiskAssessment.prediction";
    }
}
