package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.MedicationOrderEnum.MedicationOrderStatus;
import org.hl7.fhir.android.generated.dstu2.MedicationOrderEnum.MedicationOrderStatusEnumFactory;

public class MedicationOrderDispenseRequestComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
     */
    protected Type medication;

    /**
     * This indicates the validity period of a prescription (stale dating the Prescription).
     */
    protected Period validityPeriod;

    /**
     * An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
     */
    protected PositiveIntType numberOfRepeatsAllowed;

    /**
     * The amount that is to be dispensed for one fill.
     */
    protected SimpleQuantity quantity;

    /**
     * Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.
     */
    protected Duration expectedSupplyDuration;

    private static final long serialVersionUID = -1690502728L;

    /*
     * Constructor
     */
    public MedicationOrderDispenseRequestComponent() {
        super();
    }

    /**
     * @return {@link #medication} (Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public Type getMedication() {
        return this.medication;
    }

    /**
     * @return {@link #medication} (Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public CodeableConcept getMedicationCodeableConcept() throws FHIRException {
        if (!(this.medication instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.medication.getClass().getName() + " was encountered");
        return (CodeableConcept) this.medication;
    }

    public boolean hasMedicationCodeableConcept() {
        return this.medication instanceof CodeableConcept;
    }

    /**
     * @return {@link #medication} (Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public Reference getMedicationReference() throws FHIRException {
        if (!(this.medication instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.medication.getClass().getName() + " was encountered");
        return (Reference) this.medication;
    }

    public boolean hasMedicationReference() {
        return this.medication instanceof Reference;
    }

    public boolean hasMedication() {
        return this.medication != null && !this.medication.isEmpty();
    }

    /**
     * @param value {@link #medication} (Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.)
     */
    public MedicationOrderDispenseRequestComponent setMedication(Type value) {
        this.medication = value;
        return this;
    }

    /**
     * @return {@link #validityPeriod} (This indicates the validity period of a prescription (stale dating the Prescription).)
     */
    public Period getValidityPeriod() {
        if (this.validityPeriod == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrderDispenseRequestComponent.validityPeriod");
            else if (Configuration.doAutoCreate())
                // cc
                this.validityPeriod = new Period();
        return this.validityPeriod;
    }

    public boolean hasValidityPeriod() {
        return this.validityPeriod != null && !this.validityPeriod.isEmpty();
    }

    /**
     * @param value {@link #validityPeriod} (This indicates the validity period of a prescription (stale dating the Prescription).)
     */
    public MedicationOrderDispenseRequestComponent setValidityPeriod(Period value) {
        this.validityPeriod = value;
        return this;
    }

    /**
     * @return {@link #numberOfRepeatsAllowed} (An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.). This is the underlying object with id, value and extensions. The accessor "getNumberOfRepeatsAllowed" gives direct access to the value
     */
    public PositiveIntType getNumberOfRepeatsAllowedElement() {
        if (this.numberOfRepeatsAllowed == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrderDispenseRequestComponent.numberOfRepeatsAllowed");
            else if (Configuration.doAutoCreate())
                // bb
                this.numberOfRepeatsAllowed = new PositiveIntType();
        return this.numberOfRepeatsAllowed;
    }

    public boolean hasNumberOfRepeatsAllowedElement() {
        return this.numberOfRepeatsAllowed != null && !this.numberOfRepeatsAllowed.isEmpty();
    }

    public boolean hasNumberOfRepeatsAllowed() {
        return this.numberOfRepeatsAllowed != null && !this.numberOfRepeatsAllowed.isEmpty();
    }

    /**
     * @param value {@link #numberOfRepeatsAllowed} (An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.). This is the underlying object with id, value and extensions. The accessor "getNumberOfRepeatsAllowed" gives direct access to the value
     */
    public MedicationOrderDispenseRequestComponent setNumberOfRepeatsAllowedElement(PositiveIntType value) {
        this.numberOfRepeatsAllowed = value;
        return this;
    }

    /**
     * @return An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
     */
    public int getNumberOfRepeatsAllowed() {
        return this.numberOfRepeatsAllowed == null || this.numberOfRepeatsAllowed.isEmpty() ? 0 : this.numberOfRepeatsAllowed.getValue();
    }

    /**
     * @param value An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
     */
    public MedicationOrderDispenseRequestComponent setNumberOfRepeatsAllowed(int value) {
        if (this.numberOfRepeatsAllowed == null)
            this.numberOfRepeatsAllowed = new PositiveIntType();
        this.numberOfRepeatsAllowed.setValue(value);
        return this;
    }

    /**
     * @return {@link #quantity} (The amount that is to be dispensed for one fill.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrderDispenseRequestComponent.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The amount that is to be dispensed for one fill.)
     */
    public MedicationOrderDispenseRequestComponent setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #expectedSupplyDuration} (Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.)
     */
    public Duration getExpectedSupplyDuration() {
        if (this.expectedSupplyDuration == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationOrderDispenseRequestComponent.expectedSupplyDuration");
            else if (Configuration.doAutoCreate())
                // cc
                this.expectedSupplyDuration = new Duration();
        return this.expectedSupplyDuration;
    }

    public boolean hasExpectedSupplyDuration() {
        return this.expectedSupplyDuration != null && !this.expectedSupplyDuration.isEmpty();
    }

    /**
     * @param value {@link #expectedSupplyDuration} (Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.)
     */
    public MedicationOrderDispenseRequestComponent setExpectedSupplyDuration(Duration value) {
        this.expectedSupplyDuration = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.", 0, java.lang.Integer.MAX_VALUE, medication));
        childrenList.add(new Property("validityPeriod", "Period", "This indicates the validity period of a prescription (stale dating the Prescription).", 0, java.lang.Integer.MAX_VALUE, validityPeriod));
        childrenList.add(new Property("numberOfRepeatsAllowed", "positiveInt", "An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  \"3 repeats\", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.", 0, java.lang.Integer.MAX_VALUE, numberOfRepeatsAllowed));
        childrenList.add(new Property("quantity", "SimpleQuantity", "The amount that is to be dispensed for one fill.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("expectedSupplyDuration", "Duration", "Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.", 0, java.lang.Integer.MAX_VALUE, expectedSupplyDuration));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("medication[x]"))
            // Type
            this.medication = (Type) value;
        else if (name.equals("validityPeriod"))
            // Period
            this.validityPeriod = castToPeriod(value);
        else if (name.equals("numberOfRepeatsAllowed"))
            // PositiveIntType
            this.numberOfRepeatsAllowed = castToPositiveInt(value);
        else if (name.equals("quantity"))
            // SimpleQuantity
            this.quantity = castToSimpleQuantity(value);
        else if (name.equals("expectedSupplyDuration"))
            // Duration
            this.expectedSupplyDuration = castToDuration(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("medicationCodeableConcept")) {
            this.medication = new CodeableConcept();
            return this.medication;
        } else if (name.equals("medicationReference")) {
            this.medication = new Reference();
            return this.medication;
        } else if (name.equals("validityPeriod")) {
            this.validityPeriod = new Period();
            return this.validityPeriod;
        } else if (name.equals("numberOfRepeatsAllowed")) {
            throw new FHIRException("Cannot call addChild on a primitive type MedicationOrder.numberOfRepeatsAllowed");
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else if (name.equals("expectedSupplyDuration")) {
            this.expectedSupplyDuration = new Duration();
            return this.expectedSupplyDuration;
        } else
            return super.addChild(name);
    }

    public MedicationOrderDispenseRequestComponent copy() {
        MedicationOrderDispenseRequestComponent dst = new MedicationOrderDispenseRequestComponent();
        copyValues(dst);
        dst.medication = medication == null ? null : medication.copy();
        dst.validityPeriod = validityPeriod == null ? null : validityPeriod.copy();
        dst.numberOfRepeatsAllowed = numberOfRepeatsAllowed == null ? null : numberOfRepeatsAllowed.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.expectedSupplyDuration = expectedSupplyDuration == null ? null : expectedSupplyDuration.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationOrderDispenseRequestComponent))
            return false;
        MedicationOrderDispenseRequestComponent o = (MedicationOrderDispenseRequestComponent) other;
        return compareDeep(medication, o.medication, true) && compareDeep(validityPeriod, o.validityPeriod, true) && compareDeep(numberOfRepeatsAllowed, o.numberOfRepeatsAllowed, true) && compareDeep(quantity, o.quantity, true) && compareDeep(expectedSupplyDuration, o.expectedSupplyDuration, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationOrderDispenseRequestComponent))
            return false;
        MedicationOrderDispenseRequestComponent o = (MedicationOrderDispenseRequestComponent) other;
        return compareValues(numberOfRepeatsAllowed, o.numberOfRepeatsAllowed, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (medication == null || medication.isEmpty()) && (validityPeriod == null || validityPeriod.isEmpty()) && (numberOfRepeatsAllowed == null || numberOfRepeatsAllowed.isEmpty()) && (quantity == null || quantity.isEmpty()) && (expectedSupplyDuration == null || expectedSupplyDuration.isEmpty());
    }

    public String fhirType() {
        return "MedicationOrder.dispenseRequest";
    }
}
