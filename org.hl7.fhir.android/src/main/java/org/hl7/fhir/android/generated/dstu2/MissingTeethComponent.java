package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.Use;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.UseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimType;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimTypeEnumFactory;

public class MissingTeethComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The code identifying which tooth is missing.
     */
    protected Coding tooth;

    /**
     * Missing reason may be: E-extraction, O-other.
     */
    protected Coding reason;

    /**
     * The date of the extraction either known from records or patient reported estimate.
     */
    protected DateType extractionDate;

    private static final long serialVersionUID = 352913313L;

    /*
     * Constructor
     */
    public MissingTeethComponent() {
        super();
    }

    /*
     * Constructor
     */
    public MissingTeethComponent(Coding tooth) {
        super();
        this.tooth = tooth;
    }

    /**
     * @return {@link #tooth} (The code identifying which tooth is missing.)
     */
    public Coding getTooth() {
        if (this.tooth == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MissingTeethComponent.tooth");
            else if (Configuration.doAutoCreate())
                // cc
                this.tooth = new Coding();
        return this.tooth;
    }

    public boolean hasTooth() {
        return this.tooth != null && !this.tooth.isEmpty();
    }

    /**
     * @param value {@link #tooth} (The code identifying which tooth is missing.)
     */
    public MissingTeethComponent setTooth(Coding value) {
        this.tooth = value;
        return this;
    }

    /**
     * @return {@link #reason} (Missing reason may be: E-extraction, O-other.)
     */
    public Coding getReason() {
        if (this.reason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MissingTeethComponent.reason");
            else if (Configuration.doAutoCreate())
                // cc
                this.reason = new Coding();
        return this.reason;
    }

    public boolean hasReason() {
        return this.reason != null && !this.reason.isEmpty();
    }

    /**
     * @param value {@link #reason} (Missing reason may be: E-extraction, O-other.)
     */
    public MissingTeethComponent setReason(Coding value) {
        this.reason = value;
        return this;
    }

    /**
     * @return {@link #extractionDate} (The date of the extraction either known from records or patient reported estimate.). This is the underlying object with id, value and extensions. The accessor "getExtractionDate" gives direct access to the value
     */
    public DateType getExtractionDateElement() {
        if (this.extractionDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MissingTeethComponent.extractionDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.extractionDate = new DateType();
        return this.extractionDate;
    }

    public boolean hasExtractionDateElement() {
        return this.extractionDate != null && !this.extractionDate.isEmpty();
    }

    public boolean hasExtractionDate() {
        return this.extractionDate != null && !this.extractionDate.isEmpty();
    }

    /**
     * @param value {@link #extractionDate} (The date of the extraction either known from records or patient reported estimate.). This is the underlying object with id, value and extensions. The accessor "getExtractionDate" gives direct access to the value
     */
    public MissingTeethComponent setExtractionDateElement(DateType value) {
        this.extractionDate = value;
        return this;
    }

    /**
     * @return The date of the extraction either known from records or patient reported estimate.
     */
    public Date getExtractionDate() {
        return this.extractionDate == null ? null : this.extractionDate.getValue();
    }

    /**
     * @param value The date of the extraction either known from records or patient reported estimate.
     */
    public MissingTeethComponent setExtractionDate(Date value) {
        if (value == null)
            this.extractionDate = null;
        else {
            if (this.extractionDate == null)
                this.extractionDate = new DateType();
            this.extractionDate.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("tooth", "Coding", "The code identifying which tooth is missing.", 0, java.lang.Integer.MAX_VALUE, tooth));
        childrenList.add(new Property("reason", "Coding", "Missing reason may be: E-extraction, O-other.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("extractionDate", "date", "The date of the extraction either known from records or patient reported estimate.", 0, java.lang.Integer.MAX_VALUE, extractionDate));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("tooth"))
            // Coding
            this.tooth = castToCoding(value);
        else if (name.equals("reason"))
            // Coding
            this.reason = castToCoding(value);
        else if (name.equals("extractionDate"))
            // DateType
            this.extractionDate = castToDate(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("tooth")) {
            this.tooth = new Coding();
            return this.tooth;
        } else if (name.equals("reason")) {
            this.reason = new Coding();
            return this.reason;
        } else if (name.equals("extractionDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.extractionDate");
        } else
            return super.addChild(name);
    }

    public MissingTeethComponent copy() {
        MissingTeethComponent dst = new MissingTeethComponent();
        copyValues(dst);
        dst.tooth = tooth == null ? null : tooth.copy();
        dst.reason = reason == null ? null : reason.copy();
        dst.extractionDate = extractionDate == null ? null : extractionDate.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof MissingTeethComponent))
            return false;
        MissingTeethComponent o = (MissingTeethComponent) other;
        return compareDeep(tooth, o.tooth, true) && compareDeep(reason, o.reason, true) && compareDeep(extractionDate, o.extractionDate, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof MissingTeethComponent))
            return false;
        MissingTeethComponent o = (MissingTeethComponent) other;
        return compareValues(extractionDate, o.extractionDate, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (tooth == null || tooth.isEmpty()) && (reason == null || reason.isEmpty()) && (extractionDate == null || extractionDate.isEmpty());
    }

    public String fhirType() {
        return "Claim.missingTeeth";
    }
}
