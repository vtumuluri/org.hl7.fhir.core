package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum.ClinicalImpressionStatus;
import org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum.ClinicalImpressionStatusEnumFactory;

public class ClinicalImpressionFindingComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Specific text of code for finding or diagnosis.
     */
    protected CodeableConcept item;

    /**
     * Which investigations support finding or diagnosis.
     */
    protected StringType cause;

    private static final long serialVersionUID = -888590978L;

    /*
     * Constructor
     */
    public ClinicalImpressionFindingComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ClinicalImpressionFindingComponent(CodeableConcept item) {
        super();
        this.item = item;
    }

    /**
     * @return {@link #item} (Specific text of code for finding or diagnosis.)
     */
    public CodeableConcept getItem() {
        if (this.item == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpressionFindingComponent.item");
            else if (Configuration.doAutoCreate())
                // cc
                this.item = new CodeableConcept();
        return this.item;
    }

    public boolean hasItem() {
        return this.item != null && !this.item.isEmpty();
    }

    /**
     * @param value {@link #item} (Specific text of code for finding or diagnosis.)
     */
    public ClinicalImpressionFindingComponent setItem(CodeableConcept value) {
        this.item = value;
        return this;
    }

    /**
     * @return {@link #cause} (Which investigations support finding or diagnosis.). This is the underlying object with id, value and extensions. The accessor "getCause" gives direct access to the value
     */
    public StringType getCauseElement() {
        if (this.cause == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpressionFindingComponent.cause");
            else if (Configuration.doAutoCreate())
                // bb
                this.cause = new StringType();
        return this.cause;
    }

    public boolean hasCauseElement() {
        return this.cause != null && !this.cause.isEmpty();
    }

    public boolean hasCause() {
        return this.cause != null && !this.cause.isEmpty();
    }

    /**
     * @param value {@link #cause} (Which investigations support finding or diagnosis.). This is the underlying object with id, value and extensions. The accessor "getCause" gives direct access to the value
     */
    public ClinicalImpressionFindingComponent setCauseElement(StringType value) {
        this.cause = value;
        return this;
    }

    /**
     * @return Which investigations support finding or diagnosis.
     */
    public String getCause() {
        return this.cause == null ? null : this.cause.getValue();
    }

    /**
     * @param value Which investigations support finding or diagnosis.
     */
    public ClinicalImpressionFindingComponent setCause(String value) {
        if (Utilities.noString(value))
            this.cause = null;
        else {
            if (this.cause == null)
                this.cause = new StringType();
            this.cause.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("item", "CodeableConcept", "Specific text of code for finding or diagnosis.", 0, java.lang.Integer.MAX_VALUE, item));
        childrenList.add(new Property("cause", "string", "Which investigations support finding or diagnosis.", 0, java.lang.Integer.MAX_VALUE, cause));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("item"))
            // CodeableConcept
            this.item = castToCodeableConcept(value);
        else if (name.equals("cause"))
            // StringType
            this.cause = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("item")) {
            this.item = new CodeableConcept();
            return this.item;
        } else if (name.equals("cause")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClinicalImpression.cause");
        } else
            return super.addChild(name);
    }

    public ClinicalImpressionFindingComponent copy() {
        ClinicalImpressionFindingComponent dst = new ClinicalImpressionFindingComponent();
        copyValues(dst);
        dst.item = item == null ? null : item.copy();
        dst.cause = cause == null ? null : cause.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ClinicalImpressionFindingComponent))
            return false;
        ClinicalImpressionFindingComponent o = (ClinicalImpressionFindingComponent) other;
        return compareDeep(item, o.item, true) && compareDeep(cause, o.cause, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ClinicalImpressionFindingComponent))
            return false;
        ClinicalImpressionFindingComponent o = (ClinicalImpressionFindingComponent) other;
        return compareValues(cause, o.cause, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (item == null || item.isEmpty()) && (cause == null || cause.isEmpty());
    }

    public String fhirType() {
        return "ClinicalImpression.finding";
    }
}
