package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimType;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.Use;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.UseEnumFactory;

public class ProsthesisComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Indicates whether this is the initial placement of a fixed prosthesis.
     */
    protected BooleanType initial;

    /**
     * Date of the initial placement.
     */
    protected DateType priorDate;

    /**
     * Material of the prior denture or bridge prosthesis. (Oral).
     */
    protected Coding priorMaterial;

    private static final long serialVersionUID = 1739349641L;

    /*
     * Constructor
     */
    public ProsthesisComponent() {
        super();
    }

    /**
     * @return {@link #initial} (Indicates whether this is the initial placement of a fixed prosthesis.). This is the underlying object with id, value and extensions. The accessor "getInitial" gives direct access to the value
     */
    public BooleanType getInitialElement() {
        if (this.initial == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProsthesisComponent.initial");
            else if (Configuration.doAutoCreate())
                // bb
                this.initial = new BooleanType();
        return this.initial;
    }

    public boolean hasInitialElement() {
        return this.initial != null && !this.initial.isEmpty();
    }

    public boolean hasInitial() {
        return this.initial != null && !this.initial.isEmpty();
    }

    /**
     * @param value {@link #initial} (Indicates whether this is the initial placement of a fixed prosthesis.). This is the underlying object with id, value and extensions. The accessor "getInitial" gives direct access to the value
     */
    public ProsthesisComponent setInitialElement(BooleanType value) {
        this.initial = value;
        return this;
    }

    /**
     * @return Indicates whether this is the initial placement of a fixed prosthesis.
     */
    public boolean getInitial() {
        return this.initial == null || this.initial.isEmpty() ? false : this.initial.getValue();
    }

    /**
     * @param value Indicates whether this is the initial placement of a fixed prosthesis.
     */
    public ProsthesisComponent setInitial(boolean value) {
        if (this.initial == null)
            this.initial = new BooleanType();
        this.initial.setValue(value);
        return this;
    }

    /**
     * @return {@link #priorDate} (Date of the initial placement.). This is the underlying object with id, value and extensions. The accessor "getPriorDate" gives direct access to the value
     */
    public DateType getPriorDateElement() {
        if (this.priorDate == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProsthesisComponent.priorDate");
            else if (Configuration.doAutoCreate())
                // bb
                this.priorDate = new DateType();
        return this.priorDate;
    }

    public boolean hasPriorDateElement() {
        return this.priorDate != null && !this.priorDate.isEmpty();
    }

    public boolean hasPriorDate() {
        return this.priorDate != null && !this.priorDate.isEmpty();
    }

    /**
     * @param value {@link #priorDate} (Date of the initial placement.). This is the underlying object with id, value and extensions. The accessor "getPriorDate" gives direct access to the value
     */
    public ProsthesisComponent setPriorDateElement(DateType value) {
        this.priorDate = value;
        return this;
    }

    /**
     * @return Date of the initial placement.
     */
    public Date getPriorDate() {
        return this.priorDate == null ? null : this.priorDate.getValue();
    }

    /**
     * @param value Date of the initial placement.
     */
    public ProsthesisComponent setPriorDate(Date value) {
        if (value == null)
            this.priorDate = null;
        else {
            if (this.priorDate == null)
                this.priorDate = new DateType();
            this.priorDate.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #priorMaterial} (Material of the prior denture or bridge prosthesis. (Oral).)
     */
    public Coding getPriorMaterial() {
        if (this.priorMaterial == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProsthesisComponent.priorMaterial");
            else if (Configuration.doAutoCreate())
                // cc
                this.priorMaterial = new Coding();
        return this.priorMaterial;
    }

    public boolean hasPriorMaterial() {
        return this.priorMaterial != null && !this.priorMaterial.isEmpty();
    }

    /**
     * @param value {@link #priorMaterial} (Material of the prior denture or bridge prosthesis. (Oral).)
     */
    public ProsthesisComponent setPriorMaterial(Coding value) {
        this.priorMaterial = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("initial", "boolean", "Indicates whether this is the initial placement of a fixed prosthesis.", 0, java.lang.Integer.MAX_VALUE, initial));
        childrenList.add(new Property("priorDate", "date", "Date of the initial placement.", 0, java.lang.Integer.MAX_VALUE, priorDate));
        childrenList.add(new Property("priorMaterial", "Coding", "Material of the prior denture or bridge prosthesis. (Oral).", 0, java.lang.Integer.MAX_VALUE, priorMaterial));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("initial"))
            // BooleanType
            this.initial = castToBoolean(value);
        else if (name.equals("priorDate"))
            // DateType
            this.priorDate = castToDate(value);
        else if (name.equals("priorMaterial"))
            // Coding
            this.priorMaterial = castToCoding(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("initial")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.initial");
        } else if (name.equals("priorDate")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.priorDate");
        } else if (name.equals("priorMaterial")) {
            this.priorMaterial = new Coding();
            return this.priorMaterial;
        } else
            return super.addChild(name);
    }

    public ProsthesisComponent copy() {
        ProsthesisComponent dst = new ProsthesisComponent();
        copyValues(dst);
        dst.initial = initial == null ? null : initial.copy();
        dst.priorDate = priorDate == null ? null : priorDate.copy();
        dst.priorMaterial = priorMaterial == null ? null : priorMaterial.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ProsthesisComponent))
            return false;
        ProsthesisComponent o = (ProsthesisComponent) other;
        return compareDeep(initial, o.initial, true) && compareDeep(priorDate, o.priorDate, true) && compareDeep(priorMaterial, o.priorMaterial, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ProsthesisComponent))
            return false;
        ProsthesisComponent o = (ProsthesisComponent) other;
        return compareValues(initial, o.initial, true) && compareValues(priorDate, o.priorDate, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (initial == null || initial.isEmpty()) && (priorDate == null || priorDate.isEmpty()) && (priorMaterial == null || priorMaterial.isEmpty());
    }

    public String fhirType() {
        return "Claim.item.prosthesis";
    }
}
