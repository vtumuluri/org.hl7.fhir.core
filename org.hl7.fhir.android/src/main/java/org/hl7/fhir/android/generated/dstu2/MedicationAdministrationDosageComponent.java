package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationAdministrationEnum.MedicationAdministrationStatus;
import org.hl7.fhir.android.generated.dstu2.MedicationAdministrationEnum.MedicationAdministrationStatusEnumFactory;

public class MedicationAdministrationDosageComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
     */
    protected StringType text;

    /**
     * A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm".
     */
    protected Type site;

    /**
     * A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.
     */
    protected CodeableConcept route;

    /**
     * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.
     */
    protected CodeableConcept method;

    /**
     * The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.
     */
    protected SimpleQuantity quantity;

    /**
     * Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Currently we do not specify a default of '1' in the denominator, but this is being discussed.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
     */
    protected Type rate;

    private static final long serialVersionUID = -1772198879L;

    /*
     * Constructor
     */
    public MedicationAdministrationDosageComponent() {
        super();
    }

    /**
     * @return {@link #text} (Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
     */
    public StringType getTextElement() {
        if (this.text == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministrationDosageComponent.text");
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
    public MedicationAdministrationDosageComponent setTextElement(StringType value) {
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
    public MedicationAdministrationDosageComponent setText(String value) {
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
     * @return {@link #site} (A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm".)
     */
    public Type getSite() {
        return this.site;
    }

    /**
     * @return {@link #site} (A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm".)
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
     * @return {@link #site} (A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm".)
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
     * @param value {@link #site} (A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm".)
     */
    public MedicationAdministrationDosageComponent setSite(Type value) {
        this.site = value;
        return this;
    }

    /**
     * @return {@link #route} (A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.)
     */
    public CodeableConcept getRoute() {
        if (this.route == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministrationDosageComponent.route");
            else if (Configuration.doAutoCreate())
                // cc
                this.route = new CodeableConcept();
        return this.route;
    }

    public boolean hasRoute() {
        return this.route != null && !this.route.isEmpty();
    }

    /**
     * @param value {@link #route} (A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.)
     */
    public MedicationAdministrationDosageComponent setRoute(CodeableConcept value) {
        this.route = value;
        return this;
    }

    /**
     * @return {@link #method} (A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.)
     */
    public CodeableConcept getMethod() {
        if (this.method == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministrationDosageComponent.method");
            else if (Configuration.doAutoCreate())
                // cc
                this.method = new CodeableConcept();
        return this.method;
    }

    public boolean hasMethod() {
        return this.method != null && !this.method.isEmpty();
    }

    /**
     * @param value {@link #method} (A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.)
     */
    public MedicationAdministrationDosageComponent setMethod(CodeableConcept value) {
        this.method = value;
        return this;
    }

    /**
     * @return {@link #quantity} (The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationAdministrationDosageComponent.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.)
     */
    public MedicationAdministrationDosageComponent setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #rate} (Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Currently we do not specify a default of '1' in the denominator, but this is being discussed.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
     */
    public Type getRate() {
        return this.rate;
    }

    /**
     * @return {@link #rate} (Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Currently we do not specify a default of '1' in the denominator, but this is being discussed.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
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
     * @return {@link #rate} (Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Currently we do not specify a default of '1' in the denominator, but this is being discussed.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
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
     * @param value {@link #rate} (Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Currently we do not specify a default of '1' in the denominator, but this is being discussed.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
     */
    public MedicationAdministrationDosageComponent setRate(Type value) {
        this.rate = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("text", "string", "Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.", 0, java.lang.Integer.MAX_VALUE, text));
        childrenList.add(new Property("site[x]", "CodeableConcept|Reference(BodySite)", "A coded specification of the anatomic site where the medication first entered the body.  For example, \"left arm\".", 0, java.lang.Integer.MAX_VALUE, site));
        childrenList.add(new Property("route", "CodeableConcept", "A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.", 0, java.lang.Integer.MAX_VALUE, route));
        childrenList.add(new Property("method", "CodeableConcept", "A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.", 0, java.lang.Integer.MAX_VALUE, method));
        childrenList.add(new Property("quantity", "SimpleQuantity", "The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("rate[x]", "Ratio|Range", "Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Currently we do not specify a default of '1' in the denominator, but this is being discussed.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.", 0, java.lang.Integer.MAX_VALUE, rate));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("text"))
            // StringType
            this.text = castToString(value);
        else if (name.equals("site[x]"))
            // Type
            this.site = (Type) value;
        else if (name.equals("route"))
            // CodeableConcept
            this.route = castToCodeableConcept(value);
        else if (name.equals("method"))
            // CodeableConcept
            this.method = castToCodeableConcept(value);
        else if (name.equals("quantity"))
            // SimpleQuantity
            this.quantity = castToSimpleQuantity(value);
        else if (name.equals("rate[x]"))
            // Type
            this.rate = (Type) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("text")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationAdministration.text");
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
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else if (name.equals("rateRatio")) {
            this.rate = new Ratio();
            return this.rate;
        } else if (name.equals("rateRange")) {
            this.rate = new Range();
            return this.rate;
        } else
            return super.addChild(name);
    }

    public MedicationAdministrationDosageComponent copy() {
        MedicationAdministrationDosageComponent dst = new MedicationAdministrationDosageComponent();
        copyValues(dst);
        dst.text = text == null ? null : text.copy();
        dst.site = site == null ? null : site.copy();
        dst.route = route == null ? null : route.copy();
        dst.method = method == null ? null : method.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.rate = rate == null ? null : rate.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationAdministrationDosageComponent))
            return false;
        MedicationAdministrationDosageComponent o = (MedicationAdministrationDosageComponent) other;
        return compareDeep(text, o.text, true) && compareDeep(site, o.site, true) && compareDeep(route, o.route, true) && compareDeep(method, o.method, true) && compareDeep(quantity, o.quantity, true) && compareDeep(rate, o.rate, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationAdministrationDosageComponent))
            return false;
        MedicationAdministrationDosageComponent o = (MedicationAdministrationDosageComponent) other;
        return compareValues(text, o.text, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (text == null || text.isEmpty()) && (site == null || site.isEmpty()) && (route == null || route.isEmpty()) && (method == null || method.isEmpty()) && (quantity == null || quantity.isEmpty()) && (rate == null || rate.isEmpty());
    }

    public String fhirType() {
        return "MedicationAdministration.dosage";
    }
}
