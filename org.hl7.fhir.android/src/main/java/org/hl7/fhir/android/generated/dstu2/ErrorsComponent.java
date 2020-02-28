package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcome;
import org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcomeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class ErrorsComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.
     */
    protected PositiveIntType sequenceLinkId;

    /**
     * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     */
    protected PositiveIntType detailSequenceLinkId;

    /**
     * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     */
    protected PositiveIntType subdetailSequenceLinkId;

    /**
     * An error code,froma specified code system, which details why the claim could not be adjudicated.
     */
    protected Coding code;

    private static final long serialVersionUID = -1893641175L;

    /*
     * Constructor
     */
    public ErrorsComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ErrorsComponent(Coding code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #sequenceLinkId} (The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.). This is the underlying object with id, value and extensions. The accessor "getSequenceLinkId" gives direct access to the value
     */
    public PositiveIntType getSequenceLinkIdElement() {
        if (this.sequenceLinkId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ErrorsComponent.sequenceLinkId");
            else if (Configuration.doAutoCreate())
                // bb
                this.sequenceLinkId = new PositiveIntType();
        return this.sequenceLinkId;
    }

    public boolean hasSequenceLinkIdElement() {
        return this.sequenceLinkId != null && !this.sequenceLinkId.isEmpty();
    }

    public boolean hasSequenceLinkId() {
        return this.sequenceLinkId != null && !this.sequenceLinkId.isEmpty();
    }

    /**
     * @param value {@link #sequenceLinkId} (The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.). This is the underlying object with id, value and extensions. The accessor "getSequenceLinkId" gives direct access to the value
     */
    public ErrorsComponent setSequenceLinkIdElement(PositiveIntType value) {
        this.sequenceLinkId = value;
        return this;
    }

    /**
     * @return The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.
     */
    public int getSequenceLinkId() {
        return this.sequenceLinkId == null || this.sequenceLinkId.isEmpty() ? 0 : this.sequenceLinkId.getValue();
    }

    /**
     * @param value The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.
     */
    public ErrorsComponent setSequenceLinkId(int value) {
        if (this.sequenceLinkId == null)
            this.sequenceLinkId = new PositiveIntType();
        this.sequenceLinkId.setValue(value);
        return this;
    }

    /**
     * @return {@link #detailSequenceLinkId} (The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.). This is the underlying object with id, value and extensions. The accessor "getDetailSequenceLinkId" gives direct access to the value
     */
    public PositiveIntType getDetailSequenceLinkIdElement() {
        if (this.detailSequenceLinkId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ErrorsComponent.detailSequenceLinkId");
            else if (Configuration.doAutoCreate())
                // bb
                this.detailSequenceLinkId = new PositiveIntType();
        return this.detailSequenceLinkId;
    }

    public boolean hasDetailSequenceLinkIdElement() {
        return this.detailSequenceLinkId != null && !this.detailSequenceLinkId.isEmpty();
    }

    public boolean hasDetailSequenceLinkId() {
        return this.detailSequenceLinkId != null && !this.detailSequenceLinkId.isEmpty();
    }

    /**
     * @param value {@link #detailSequenceLinkId} (The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.). This is the underlying object with id, value and extensions. The accessor "getDetailSequenceLinkId" gives direct access to the value
     */
    public ErrorsComponent setDetailSequenceLinkIdElement(PositiveIntType value) {
        this.detailSequenceLinkId = value;
        return this;
    }

    /**
     * @return The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     */
    public int getDetailSequenceLinkId() {
        return this.detailSequenceLinkId == null || this.detailSequenceLinkId.isEmpty() ? 0 : this.detailSequenceLinkId.getValue();
    }

    /**
     * @param value The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     */
    public ErrorsComponent setDetailSequenceLinkId(int value) {
        if (this.detailSequenceLinkId == null)
            this.detailSequenceLinkId = new PositiveIntType();
        this.detailSequenceLinkId.setValue(value);
        return this;
    }

    /**
     * @return {@link #subdetailSequenceLinkId} (The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.). This is the underlying object with id, value and extensions. The accessor "getSubdetailSequenceLinkId" gives direct access to the value
     */
    public PositiveIntType getSubdetailSequenceLinkIdElement() {
        if (this.subdetailSequenceLinkId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ErrorsComponent.subdetailSequenceLinkId");
            else if (Configuration.doAutoCreate())
                // bb
                this.subdetailSequenceLinkId = new PositiveIntType();
        return this.subdetailSequenceLinkId;
    }

    public boolean hasSubdetailSequenceLinkIdElement() {
        return this.subdetailSequenceLinkId != null && !this.subdetailSequenceLinkId.isEmpty();
    }

    public boolean hasSubdetailSequenceLinkId() {
        return this.subdetailSequenceLinkId != null && !this.subdetailSequenceLinkId.isEmpty();
    }

    /**
     * @param value {@link #subdetailSequenceLinkId} (The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.). This is the underlying object with id, value and extensions. The accessor "getSubdetailSequenceLinkId" gives direct access to the value
     */
    public ErrorsComponent setSubdetailSequenceLinkIdElement(PositiveIntType value) {
        this.subdetailSequenceLinkId = value;
        return this;
    }

    /**
     * @return The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     */
    public int getSubdetailSequenceLinkId() {
        return this.subdetailSequenceLinkId == null || this.subdetailSequenceLinkId.isEmpty() ? 0 : this.subdetailSequenceLinkId.getValue();
    }

    /**
     * @param value The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     */
    public ErrorsComponent setSubdetailSequenceLinkId(int value) {
        if (this.subdetailSequenceLinkId == null)
            this.subdetailSequenceLinkId = new PositiveIntType();
        this.subdetailSequenceLinkId.setValue(value);
        return this;
    }

    /**
     * @return {@link #code} (An error code,froma specified code system, which details why the claim could not be adjudicated.)
     */
    public Coding getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ErrorsComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new Coding();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (An error code,froma specified code system, which details why the claim could not be adjudicated.)
     */
    public ErrorsComponent setCode(Coding value) {
        this.code = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("sequenceLinkId", "positiveInt", "The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.", 0, java.lang.Integer.MAX_VALUE, sequenceLinkId));
        childrenList.add(new Property("detailSequenceLinkId", "positiveInt", "The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.", 0, java.lang.Integer.MAX_VALUE, detailSequenceLinkId));
        childrenList.add(new Property("subdetailSequenceLinkId", "positiveInt", "The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.", 0, java.lang.Integer.MAX_VALUE, subdetailSequenceLinkId));
        childrenList.add(new Property("code", "Coding", "An error code,froma specified code system, which details why the claim could not be adjudicated.", 0, java.lang.Integer.MAX_VALUE, code));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequenceLinkId"))
            // PositiveIntType
            this.sequenceLinkId = castToPositiveInt(value);
        else if (name.equals("detailSequenceLinkId"))
            // PositiveIntType
            this.detailSequenceLinkId = castToPositiveInt(value);
        else if (name.equals("subdetailSequenceLinkId"))
            // PositiveIntType
            this.subdetailSequenceLinkId = castToPositiveInt(value);
        else if (name.equals("code"))
            // Coding
            this.code = castToCoding(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("sequenceLinkId")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.sequenceLinkId");
        } else if (name.equals("detailSequenceLinkId")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.detailSequenceLinkId");
        } else if (name.equals("subdetailSequenceLinkId")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.subdetailSequenceLinkId");
        } else if (name.equals("code")) {
            this.code = new Coding();
            return this.code;
        } else
            return super.addChild(name);
    }

    public ErrorsComponent copy() {
        ErrorsComponent dst = new ErrorsComponent();
        copyValues(dst);
        dst.sequenceLinkId = sequenceLinkId == null ? null : sequenceLinkId.copy();
        dst.detailSequenceLinkId = detailSequenceLinkId == null ? null : detailSequenceLinkId.copy();
        dst.subdetailSequenceLinkId = subdetailSequenceLinkId == null ? null : subdetailSequenceLinkId.copy();
        dst.code = code == null ? null : code.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ErrorsComponent))
            return false;
        ErrorsComponent o = (ErrorsComponent) other;
        return compareDeep(sequenceLinkId, o.sequenceLinkId, true) && compareDeep(detailSequenceLinkId, o.detailSequenceLinkId, true) && compareDeep(subdetailSequenceLinkId, o.subdetailSequenceLinkId, true) && compareDeep(code, o.code, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ErrorsComponent))
            return false;
        ErrorsComponent o = (ErrorsComponent) other;
        return compareValues(sequenceLinkId, o.sequenceLinkId, true) && compareValues(detailSequenceLinkId, o.detailSequenceLinkId, true) && compareValues(subdetailSequenceLinkId, o.subdetailSequenceLinkId, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (sequenceLinkId == null || sequenceLinkId.isEmpty()) && (detailSequenceLinkId == null || detailSequenceLinkId.isEmpty()) && (subdetailSequenceLinkId == null || subdetailSequenceLinkId.isEmpty()) && (code == null || code.isEmpty());
    }

    public String fhirType() {
        return "ClaimResponse.error";
    }
}
