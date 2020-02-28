package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum.ClinicalImpressionStatus;
import org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum.ClinicalImpressionStatusEnumFactory;

public class ClinicalImpressionRuledOutComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Specific text of code for diagnosis.
     */
    protected CodeableConcept item;

    /**
     * Grounds for elimination.
     */
    protected StringType reason;

    private static final long serialVersionUID = -1001661243L;

    /*
     * Constructor
     */
    public ClinicalImpressionRuledOutComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ClinicalImpressionRuledOutComponent(CodeableConcept item) {
        super();
        this.item = item;
    }

    /**
     * @return {@link #item} (Specific text of code for diagnosis.)
     */
    public CodeableConcept getItem() {
        if (this.item == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpressionRuledOutComponent.item");
            else if (Configuration.doAutoCreate())
                // cc
                this.item = new CodeableConcept();
        return this.item;
    }

    public boolean hasItem() {
        return this.item != null && !this.item.isEmpty();
    }

    /**
     * @param value {@link #item} (Specific text of code for diagnosis.)
     */
    public ClinicalImpressionRuledOutComponent setItem(CodeableConcept value) {
        this.item = value;
        return this;
    }

    /**
     * @return {@link #reason} (Grounds for elimination.). This is the underlying object with id, value and extensions. The accessor "getReason" gives direct access to the value
     */
    public StringType getReasonElement() {
        if (this.reason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpressionRuledOutComponent.reason");
            else if (Configuration.doAutoCreate())
                // bb
                this.reason = new StringType();
        return this.reason;
    }

    public boolean hasReasonElement() {
        return this.reason != null && !this.reason.isEmpty();
    }

    public boolean hasReason() {
        return this.reason != null && !this.reason.isEmpty();
    }

    /**
     * @param value {@link #reason} (Grounds for elimination.). This is the underlying object with id, value and extensions. The accessor "getReason" gives direct access to the value
     */
    public ClinicalImpressionRuledOutComponent setReasonElement(StringType value) {
        this.reason = value;
        return this;
    }

    /**
     * @return Grounds for elimination.
     */
    public String getReason() {
        return this.reason == null ? null : this.reason.getValue();
    }

    /**
     * @param value Grounds for elimination.
     */
    public ClinicalImpressionRuledOutComponent setReason(String value) {
        if (Utilities.noString(value))
            this.reason = null;
        else {
            if (this.reason == null)
                this.reason = new StringType();
            this.reason.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("item", "CodeableConcept", "Specific text of code for diagnosis.", 0, java.lang.Integer.MAX_VALUE, item));
        childrenList.add(new Property("reason", "string", "Grounds for elimination.", 0, java.lang.Integer.MAX_VALUE, reason));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("item"))
            // CodeableConcept
            this.item = castToCodeableConcept(value);
        else if (name.equals("reason"))
            // StringType
            this.reason = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("item")) {
            this.item = new CodeableConcept();
            return this.item;
        } else if (name.equals("reason")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClinicalImpression.reason");
        } else
            return super.addChild(name);
    }

    public ClinicalImpressionRuledOutComponent copy() {
        ClinicalImpressionRuledOutComponent dst = new ClinicalImpressionRuledOutComponent();
        copyValues(dst);
        dst.item = item == null ? null : item.copy();
        dst.reason = reason == null ? null : reason.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ClinicalImpressionRuledOutComponent))
            return false;
        ClinicalImpressionRuledOutComponent o = (ClinicalImpressionRuledOutComponent) other;
        return compareDeep(item, o.item, true) && compareDeep(reason, o.reason, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ClinicalImpressionRuledOutComponent))
            return false;
        ClinicalImpressionRuledOutComponent o = (ClinicalImpressionRuledOutComponent) other;
        return compareValues(reason, o.reason, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (item == null || item.isEmpty()) && (reason == null || reason.isEmpty());
    }

    public String fhirType() {
        return "ClinicalImpression.ruledOut";
    }
}
