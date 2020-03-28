package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationDispenseEnum.MedicationDispenseStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.MedicationDispenseEnum.MedicationDispenseStatus;

public class MedicationDispenseDosageInstructionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
     */
    protected StringType text;

    /**
     * Additional instructions such as "Swallow with plenty of water" which may or may not be coded.
     */
    protected CodeableConcept additionalInstructions;

    /**
     * The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions.  For example, "Every  8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:";  "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
     */
    protected Timing timing;

    /**
     *  Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     *
     * Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.
     */
    protected Type asNeeded;

    /**
     * A coded specification of the anatomic site where the medication first enters the body.
     */
    protected Type site;

    /**
     * A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject.
     */
    protected CodeableConcept route;

    /**
     * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.
     */
    protected CodeableConcept method;

    /**
     * The amount of therapeutic or other substance given at one administration event.
     */
    protected Type dose;

    /**
     * Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
     */
    protected Type rate;

    /**
     * The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time,  e.g. 1000mg in 24 hours.
     */
    protected Ratio maxDosePerPeriod;

    private static final long serialVersionUID = -1470136646L;

    /*
     * Constructor
     */
    public MedicationDispenseDosageInstructionComponent() {
        super();
    }

    /**
     * @return {@link #text} (Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public StringType getTextElement() {
        if (this.text == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispenseDosageInstructionComponent.text");
            else if (Configuration.doAutoCreate())
                // bb
                this.text = new StringType();
        return this.text;
    }

    public boolean hasTextElement() {
        return this.text != null && !this.text.isEmpty();
    }

    public boolean hasText() {
        return this.text != null && !this.text.isEmpty();
    }

    /**
     * @param value {@link #text} (Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public MedicationDispenseDosageInstructionComponent setTextElement(StringType value) {
        this.text = value;
        return this;
    }

    /**
     * @return Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
     */
    public String getText() {
        return this.text == null ? null : this.text.getValue();
    }

    /**
     * @param value Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
     */
    public MedicationDispenseDosageInstructionComponent setText(String value) {
        if (Utilities.noString(value))
            this.text = null;
        else {
            if (this.text == null)
                this.text = new StringType();
            this.text.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #additionalInstructions} (Additional instructions such as "Swallow with plenty of water" which may or may not be coded.)
     */
    public CodeableConcept getAdditionalInstructions() {
        if (this.additionalInstructions == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispenseDosageInstructionComponent.additionalInstructions");
            else if (Configuration.doAutoCreate())
                // cc
                this.additionalInstructions = new CodeableConcept();
        return this.additionalInstructions;
    }

    public boolean hasAdditionalInstructions() {
        return this.additionalInstructions != null && !this.additionalInstructions.isEmpty();
    }

    /**
     * @param value {@link #additionalInstructions} (Additional instructions such as "Swallow with plenty of water" which may or may not be coded.)
     */
    public MedicationDispenseDosageInstructionComponent setAdditionalInstructions(CodeableConcept value) {
        this.additionalInstructions = value;
        return this;
    }

    /**
     * @return {@link #timing} (The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions.  For example, "Every  8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:";  "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".)
     */
    public Timing getTiming() {
        if (this.timing == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispenseDosageInstructionComponent.timing");
            else if (Configuration.doAutoCreate())
                // cc
                this.timing = new Timing();
        return this.timing;
    }

    public boolean hasTiming() {
        return this.timing != null && !this.timing.isEmpty();
    }

    /**
     * @param value {@link #timing} (The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions.  For example, "Every  8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:";  "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".)
     */
    public MedicationDispenseDosageInstructionComponent setTiming(Timing value) {
        this.timing = value;
        return this;
    }

    /**
     *  @return {@link #asNeeded} (Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     *
     * Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.)
     */
    public Type getAsNeeded() {
        return this.asNeeded;
    }

    /**
     *  @return {@link #asNeeded} (Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     *
     * Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.)
     */
    public BooleanType getAsNeededBooleanType() throws FHIRException {
        if (!(this.asNeeded instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but " + this.asNeeded.getClass().getName() + " was encountered");
        return (BooleanType) this.asNeeded;
    }

    public boolean hasAsNeededBooleanType() {
        return this.asNeeded instanceof BooleanType;
    }

    /**
     *  @return {@link #asNeeded} (Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     *
     * Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.)
     */
    public CodeableConcept getAsNeededCodeableConcept() throws FHIRException {
        if (!(this.asNeeded instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.asNeeded.getClass().getName() + " was encountered");
        return (CodeableConcept) this.asNeeded;
    }

    public boolean hasAsNeededCodeableConcept() {
        return this.asNeeded instanceof CodeableConcept;
    }

    public boolean hasAsNeeded() {
        return this.asNeeded != null && !this.asNeeded.isEmpty();
    }

    /**
     *  @param value {@link #asNeeded} (Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     *
     * Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.)
     */
    public MedicationDispenseDosageInstructionComponent setAsNeeded(Type value) {
        this.asNeeded = value;
        return this;
    }

    /**
     * @return {@link #site} (A coded specification of the anatomic site where the medication first enters the body.)
     */
    public Type getSite() {
        return this.site;
    }

    /**
     * @return {@link #site} (A coded specification of the anatomic site where the medication first enters the body.)
     */
    public CodeableConcept getSiteCodeableConcept() throws FHIRException {
        if (!(this.site instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.site.getClass().getName() + " was encountered");
        return (CodeableConcept) this.site;
    }

    public boolean hasSiteCodeableConcept() {
        return this.site instanceof CodeableConcept;
    }

    /**
     * @return {@link #site} (A coded specification of the anatomic site where the medication first enters the body.)
     */
    public Reference getSiteReference() throws FHIRException {
        if (!(this.site instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.site.getClass().getName() + " was encountered");
        return (Reference) this.site;
    }

    public boolean hasSiteReference() {
        return this.site instanceof Reference;
    }

    public boolean hasSite() {
        return this.site != null && !this.site.isEmpty();
    }

    /**
     * @param value {@link #site} (A coded specification of the anatomic site where the medication first enters the body.)
     */
    public MedicationDispenseDosageInstructionComponent setSite(Type value) {
        this.site = value;
        return this;
    }

    /**
     * @return {@link #route} (A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject.)
     */
    public CodeableConcept getRoute() {
        if (this.route == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispenseDosageInstructionComponent.route");
            else if (Configuration.doAutoCreate())
                // cc
                this.route = new CodeableConcept();
        return this.route;
    }

    public boolean hasRoute() {
        return this.route != null && !this.route.isEmpty();
    }

    /**
     * @param value {@link #route} (A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject.)
     */
    public MedicationDispenseDosageInstructionComponent setRoute(CodeableConcept value) {
        this.route = value;
        return this;
    }

    /**
     * @return {@link #method} (A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.)
     */
    public CodeableConcept getMethod() {
        if (this.method == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispenseDosageInstructionComponent.method");
            else if (Configuration.doAutoCreate())
                // cc
                this.method = new CodeableConcept();
        return this.method;
    }

    public boolean hasMethod() {
        return this.method != null && !this.method.isEmpty();
    }

    /**
     * @param value {@link #method} (A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.)
     */
    public MedicationDispenseDosageInstructionComponent setMethod(CodeableConcept value) {
        this.method = value;
        return this;
    }

    /**
     * @return {@link #dose} (The amount of therapeutic or other substance given at one administration event.)
     */
    public Type getDose() {
        return this.dose;
    }

    /**
     * @return {@link #dose} (The amount of therapeutic or other substance given at one administration event.)
     */
    public Range getDoseRange() throws FHIRException {
        if (!(this.dose instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.dose.getClass().getName() + " was encountered");
        return (Range) this.dose;
    }

    public boolean hasDoseRange() {
        return this.dose instanceof Range;
    }

    /**
     * @return {@link #dose} (The amount of therapeutic or other substance given at one administration event.)
     */
    public SimpleQuantity getDoseSimpleQuantity() throws FHIRException {
        if (!(this.dose instanceof SimpleQuantity))
            throw new FHIRException("Type mismatch: the type SimpleQuantity was expected, but " + this.dose.getClass().getName() + " was encountered");
        return (SimpleQuantity) this.dose;
    }

    public boolean hasDoseSimpleQuantity() {
        return this.dose instanceof SimpleQuantity;
    }

    public boolean hasDose() {
        return this.dose != null && !this.dose.isEmpty();
    }

    /**
     * @param value {@link #dose} (The amount of therapeutic or other substance given at one administration event.)
     */
    public MedicationDispenseDosageInstructionComponent setDose(Type value) {
        this.dose = value;
        return this;
    }

    /**
     * @return {@link #rate} (Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
     */
    public Type getRate() {
        return this.rate;
    }

    /**
     * @return {@link #rate} (Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
     */
    public Ratio getRateRatio() throws FHIRException {
        if (!(this.rate instanceof Ratio))
            throw new FHIRException("Type mismatch: the type Ratio was expected, but " + this.rate.getClass().getName() + " was encountered");
        return (Ratio) this.rate;
    }

    public boolean hasRateRatio() {
        return this.rate instanceof Ratio;
    }

    /**
     * @return {@link #rate} (Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
     */
    public Range getRateRange() throws FHIRException {
        if (!(this.rate instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.rate.getClass().getName() + " was encountered");
        return (Range) this.rate;
    }

    public boolean hasRateRange() {
        return this.rate instanceof Range;
    }

    public boolean hasRate() {
        return this.rate != null && !this.rate.isEmpty();
    }

    /**
     * @param value {@link #rate} (Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
     */
    public MedicationDispenseDosageInstructionComponent setRate(Type value) {
        this.rate = value;
        return this;
    }

    /**
     * @return {@link #maxDosePerPeriod} (The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time,  e.g. 1000mg in 24 hours.)
     */
    public Ratio getMaxDosePerPeriod() {
        if (this.maxDosePerPeriod == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationDispenseDosageInstructionComponent.maxDosePerPeriod");
            else if (Configuration.doAutoCreate())
                // cc
                this.maxDosePerPeriod = new Ratio();
        return this.maxDosePerPeriod;
    }

    public boolean hasMaxDosePerPeriod() {
        return this.maxDosePerPeriod != null && !this.maxDosePerPeriod.isEmpty();
    }

    /**
     * @param value {@link #maxDosePerPeriod} (The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time,  e.g. 1000mg in 24 hours.)
     */
    public MedicationDispenseDosageInstructionComponent setMaxDosePerPeriod(Ratio value) {
        this.maxDosePerPeriod = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("text", "string", "Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.", 0, java.lang.Integer.MAX_VALUE, text));
        childrenList.add(new Property("additionalInstructions", "CodeableConcept", "Additional instructions such as \"Swallow with plenty of water\" which may or may not be coded.", 0, java.lang.Integer.MAX_VALUE, additionalInstructions));
        childrenList.add(new Property("timing", "Timing", "The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions.  For example, \"Every  8 hours\"; \"Three times a day\"; \"1/2 an hour before breakfast for 10 days from 23-Dec 2011:\";  \"15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\".", 0, java.lang.Integer.MAX_VALUE, timing));
        childrenList.add(new Property("asNeeded[x]", "boolean|CodeableConcept", "Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).  \n\nSpecifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.", 0, java.lang.Integer.MAX_VALUE, asNeeded));
        childrenList.add(new Property("site[x]", "CodeableConcept|Reference(BodySite)", "A coded specification of the anatomic site where the medication first enters the body.", 0, java.lang.Integer.MAX_VALUE, site));
        childrenList.add(new Property("route", "CodeableConcept", "A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject.", 0, java.lang.Integer.MAX_VALUE, route));
        childrenList.add(new Property("method", "CodeableConcept", "A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.", 0, java.lang.Integer.MAX_VALUE, method));
        childrenList.add(new Property("dose[x]", "Range|SimpleQuantity", "The amount of therapeutic or other substance given at one administration event.", 0, java.lang.Integer.MAX_VALUE, dose));
        childrenList.add(new Property("rate[x]", "Ratio|Range", "Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.", 0, java.lang.Integer.MAX_VALUE, rate));
        childrenList.add(new Property("maxDosePerPeriod", "Ratio", "The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time,  e.g. 1000mg in 24 hours.", 0, java.lang.Integer.MAX_VALUE, maxDosePerPeriod));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("text"))
            // StringType
            this.text = castToString(value);
        else if (name.equals("additionalInstructions"))
            // CodeableConcept
            this.additionalInstructions = castToCodeableConcept(value);
        else if (name.equals("timing"))
            // Timing
            this.timing = castToTiming(value);
        else if (name.equals("asNeeded[x]"))
            // Type
            this.asNeeded = (Type) value;
        else if (name.equals("site[x]"))
            // Type
            this.site = (Type) value;
        else if (name.equals("route"))
            // CodeableConcept
            this.route = castToCodeableConcept(value);
        else if (name.equals("method"))
            // CodeableConcept
            this.method = castToCodeableConcept(value);
        else if (name.equals("dose[x]"))
            // Type
            this.dose = (Type) value;
        else if (name.equals("rate[x]"))
            // Type
            this.rate = (Type) value;
        else if (name.equals("maxDosePerPeriod"))
            // Ratio
            this.maxDosePerPeriod = castToRatio(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("text")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationDispense.text");
        } else if (name.equals("additionalInstructions")) {
            this.additionalInstructions = new CodeableConcept();
            return this.additionalInstructions;
        } else if (name.equals("timing")) {
            this.timing = new Timing();
            return this.timing;
        } else if (name.equals("asNeededBoolean")) {
            this.asNeeded = new BooleanType();
            return this.asNeeded;
        } else if (name.equals("asNeededCodeableConcept")) {
            this.asNeeded = new CodeableConcept();
            return this.asNeeded;
        } else if (name.equals("siteCodeableConcept")) {
            this.site = new CodeableConcept();
            return this.site;
        } else if (name.equals("siteReference")) {
            this.site = new Reference();
            return this.site;
        } else if (name.equals("route")) {
            this.route = new CodeableConcept();
            return this.route;
        } else if (name.equals("method")) {
            this.method = new CodeableConcept();
            return this.method;
        } else if (name.equals("doseRange")) {
            this.dose = new Range();
            return this.dose;
        } else if (name.equals("doseSimpleQuantity")) {
            this.dose = new SimpleQuantity();
            return this.dose;
        } else if (name.equals("rateRatio")) {
            this.rate = new Ratio();
            return this.rate;
        } else if (name.equals("rateRange")) {
            this.rate = new Range();
            return this.rate;
        } else if (name.equals("maxDosePerPeriod")) {
            this.maxDosePerPeriod = new Ratio();
            return this.maxDosePerPeriod;
        } else
            return super.addChild(name);
    }

    public MedicationDispenseDosageInstructionComponent copy() {
        MedicationDispenseDosageInstructionComponent dst = new MedicationDispenseDosageInstructionComponent();
        copyValues(dst);
        dst.text = text == null ? null : text.copy();
        dst.additionalInstructions = additionalInstructions == null ? null : additionalInstructions.copy();
        dst.timing = timing == null ? null : timing.copy();
        dst.asNeeded = asNeeded == null ? null : asNeeded.copy();
        dst.site = site == null ? null : site.copy();
        dst.route = route == null ? null : route.copy();
        dst.method = method == null ? null : method.copy();
        dst.dose = dose == null ? null : dose.copy();
        dst.rate = rate == null ? null : rate.copy();
        dst.maxDosePerPeriod = maxDosePerPeriod == null ? null : maxDosePerPeriod.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationDispenseDosageInstructionComponent))
            return false;
        MedicationDispenseDosageInstructionComponent o = (MedicationDispenseDosageInstructionComponent) other;
        return compareDeep(text, o.text, true) && compareDeep(additionalInstructions, o.additionalInstructions, true) && compareDeep(timing, o.timing, true) && compareDeep(asNeeded, o.asNeeded, true) && compareDeep(site, o.site, true) && compareDeep(route, o.route, true) && compareDeep(method, o.method, true) && compareDeep(dose, o.dose, true) && compareDeep(rate, o.rate, true) && compareDeep(maxDosePerPeriod, o.maxDosePerPeriod, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationDispenseDosageInstructionComponent))
            return false;
        MedicationDispenseDosageInstructionComponent o = (MedicationDispenseDosageInstructionComponent) other;
        return compareValues(text, o.text, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (text == null || text.isEmpty()) && (additionalInstructions == null || additionalInstructions.isEmpty()) && (timing == null || timing.isEmpty()) && (asNeeded == null || asNeeded.isEmpty()) && (site == null || site.isEmpty()) && (route == null || route.isEmpty()) && (method == null || method.isEmpty()) && (dose == null || dose.isEmpty()) && (rate == null || rate.isEmpty()) && (maxDosePerPeriod == null || maxDosePerPeriod.isEmpty());
    }

    public String fhirType() {
        return "MedicationDispense.dosageInstruction";
    }
}
