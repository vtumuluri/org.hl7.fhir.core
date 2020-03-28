package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class MedicationProductBatchComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The assigned lot number of a batch of the specified product.
     */
    protected StringType lotNumber;

    /**
     * When this specific batch of product will expire.
     */
    protected DateTimeType expirationDate;

    private static final long serialVersionUID = 1982738755L;

    /*
     * Constructor
     */
    public MedicationProductBatchComponent() {
        super();
    }

    /**
     * @return {@link #lotNumber} (The assigned lot number of a batch of the specified product.). This is the underlying object with id, value and extensions. The accessor "getLotNumber" gives direct access to the value
     */
    public StringType getLotNumberElement() {
        if (this.lotNumber == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationProductBatchComponent.lotNumber");
            else if (Configuration.doAutoCreate())
                // bb
                this.lotNumber = new StringType();
        return this.lotNumber;
    }

    public boolean hasLotNumberElement() {
        return this.lotNumber != null && !this.lotNumber.isEmpty();
    }

    public boolean hasLotNumber() {
        return this.lotNumber != null && !this.lotNumber.isEmpty();
    }

    /**
     * @param value {@link #lotNumber} (The assigned lot number of a batch of the specified product.). This is the underlying object with id, value and extensions. The accessor "getLotNumber" gives direct access to the value
     */
    public MedicationProductBatchComponent setLotNumberElement(StringType value) {
        this.lotNumber = value;
        return this;
    }

    /**
     * @return The assigned lot number of a batch of the specified product.
     */
    public String getLotNumber() {
        return this.lotNumber == null ? null : this.lotNumber.getValue();
    }

    /**
     * @param value The assigned lot number of a batch of the specified product.
     */
    public MedicationProductBatchComponent setLotNumber(String value) {
        if (Utilities.noString(value))
            this.lotNumber = null;
        else {
            if (this.lotNumber == null)
                this.lotNumber = new StringType();
            this.lotNumber.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #expirationDate} (When this specific batch of product will expire.). This is the underlying object with id, value and extensions. The accessor "getExpirationDate" gives direct access to the value
     */
    public DateTimeType getExpirationDateElement() {
        if (this.expirationDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MedicationProductBatchComponent.expirationDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.expirationDate = new DateTimeType();
        return this.expirationDate;
    }

    public boolean hasExpirationDateElement() {
        return this.expirationDate != null && !this.expirationDate.isEmpty();
    }

    public boolean hasExpirationDate() {
        return this.expirationDate != null && !this.expirationDate.isEmpty();
    }

    /**
     * @param value {@link #expirationDate} (When this specific batch of product will expire.). This is the underlying object with id, value and extensions. The accessor "getExpirationDate" gives direct access to the value
     */
    public MedicationProductBatchComponent setExpirationDateElement(DateTimeType value) {
        this.expirationDate = value;
        return this;
    }

    /**
     * @return When this specific batch of product will expire.
     */
    public Date getExpirationDate() {
        return this.expirationDate == null ? null : this.expirationDate.getValue();
    }

    /**
     * @param value When this specific batch of product will expire.
     */
    public MedicationProductBatchComponent setExpirationDate(Date value) {
        if (value == null)
            this.expirationDate = null;
        else {
            if (this.expirationDate == null)
                this.expirationDate = new DateTimeType();
            this.expirationDate.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("lotNumber", "string", "The assigned lot number of a batch of the specified product.", 0, java.lang.Integer.MAX_VALUE, lotNumber));
        childrenList.add(new Property("expirationDate", "dateTime", "When this specific batch of product will expire.", 0, java.lang.Integer.MAX_VALUE, expirationDate));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("lotNumber"))
            // StringType
            this.lotNumber = castToString(value);
        else if (name.equals("expirationDate"))
            // DateTimeType
            this.expirationDate = castToDateTime(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("lotNumber")) {
            throw new FHIRException("Cannot call addChild on a primitive type Medication.lotNumber");
        } else if (name.equals("expirationDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Medication.expirationDate");
        } else
            return super.addChild(name);
    }

    public MedicationProductBatchComponent copy() {
        MedicationProductBatchComponent dst = new MedicationProductBatchComponent();
        copyValues(dst);
        dst.lotNumber = lotNumber == null ? null : lotNumber.copy();
        dst.expirationDate = expirationDate == null ? null : expirationDate.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MedicationProductBatchComponent))
            return false;
        MedicationProductBatchComponent o = (MedicationProductBatchComponent) other;
        return compareDeep(lotNumber, o.lotNumber, true) && compareDeep(expirationDate, o.expirationDate, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MedicationProductBatchComponent))
            return false;
        MedicationProductBatchComponent o = (MedicationProductBatchComponent) other;
        return compareValues(lotNumber, o.lotNumber, true) && compareValues(expirationDate, o.expirationDate, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (lotNumber == null || lotNumber.isEmpty()) && (expirationDate == null || expirationDate.isEmpty());
    }

    public String fhirType() {
        return "Medication.product.batch";
    }
}
