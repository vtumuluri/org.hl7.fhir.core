package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class ImmunizationRecommendationRecommendationDateCriterionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.
     */
    protected CodeableConcept code;

    /**
     * The date whose meaning is specified by dateCriterion.code.
     */
    protected DateTimeType value;

    private static final long serialVersionUID = 1036994566L;

    /*
     * Constructor
     */
    public ImmunizationRecommendationRecommendationDateCriterionComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ImmunizationRecommendationRecommendationDateCriterionComponent(CodeableConcept code, DateTimeType value) {
        super();
        this.code = code;
        this.value = value;
    }

    /**
     * @return {@link #code} (Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationDateCriterionComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.)
     */
    public ImmunizationRecommendationRecommendationDateCriterionComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #value} (The date whose meaning is specified by dateCriterion.code.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public DateTimeType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationDateCriterionComponent.value");
            else if (Configuration.doAutoCreate())
                // bb
                this.value = new DateTimeType();
        return this.value;
    }

    public boolean hasValueElement() {
        return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The date whose meaning is specified by dateCriterion.code.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public ImmunizationRecommendationRecommendationDateCriterionComponent setValueElement(DateTimeType value) {
        this.value = value;
        return this;
    }

    /**
     * @return The date whose meaning is specified by dateCriterion.code.
     */
    public Date getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The date whose meaning is specified by dateCriterion.code.
     */
    public ImmunizationRecommendationRecommendationDateCriterionComponent setValue(Date value) {
        if (this.value == null)
            this.value = new DateTimeType();
        this.value.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("value", "dateTime", "The date whose meaning is specified by dateCriterion.code.", 0, java.lang.Integer.MAX_VALUE, value));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("value"))
            // DateTimeType
            this.value = castToDateTime(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.value");
        } else
            return super.addChild(name);
    }

    public ImmunizationRecommendationRecommendationDateCriterionComponent copy() {
        ImmunizationRecommendationRecommendationDateCriterionComponent dst = new ImmunizationRecommendationRecommendationDateCriterionComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImmunizationRecommendationRecommendationDateCriterionComponent))
            return false;
        ImmunizationRecommendationRecommendationDateCriterionComponent o = (ImmunizationRecommendationRecommendationDateCriterionComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(value, o.value, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImmunizationRecommendationRecommendationDateCriterionComponent))
            return false;
        ImmunizationRecommendationRecommendationDateCriterionComponent o = (ImmunizationRecommendationRecommendationDateCriterionComponent) other;
        return compareValues(value, o.value, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (value == null || value.isEmpty());
    }

    public String fhirType() {
        return "ImmunizationRecommendation.recommendation.dateCriterion";
    }
}
