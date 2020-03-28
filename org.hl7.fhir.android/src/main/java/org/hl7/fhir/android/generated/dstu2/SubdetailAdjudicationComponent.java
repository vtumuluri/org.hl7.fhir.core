package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.RemittanceOutcome;
import org.hl7.fhir.android.generated.dstu2.Enumerations.RemittanceOutcomeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class SubdetailAdjudicationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     */
    protected Coding code;

    /**
     * Monetary amount associated with the code.
     */
    protected Money amount;

    /**
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     */
    protected DecimalType value;

    private static final long serialVersionUID = -949880587L;

    /*
     * Constructor
     */
    public SubdetailAdjudicationComponent() {
        super();
    }

    /*
     * Constructor
     */
    public SubdetailAdjudicationComponent(Coding code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #code} (Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.)
     */
    public Coding getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubdetailAdjudicationComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new Coding();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.)
     */
    public SubdetailAdjudicationComponent setCode(Coding value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #amount} (Monetary amount associated with the code.)
     */
    public Money getAmount() {
        if (this.amount == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubdetailAdjudicationComponent.amount");
            else if (Configuration.doAutoCreate())
                // cc
                this.amount = new Money();
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null && !this.amount.isEmpty();
    }

    /**
     * @param value {@link #amount} (Monetary amount associated with the code.)
     */
    public SubdetailAdjudicationComponent setAmount(Money value) {
        this.amount = value;
        return this;
    }

    /**
     * @return {@link #value} (A non-monetary value for example a percentage. Mutually exclusive to the amount element above.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public DecimalType getValueElement() {
        if (this.value == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubdetailAdjudicationComponent.value");
            else if (Configuration.doAutoCreate())
                // bb
                this.value = new DecimalType();
        return this.value;
    }

    public boolean hasValueElement() {
        return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
        return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (A non-monetary value for example a percentage. Mutually exclusive to the amount element above.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public SubdetailAdjudicationComponent setValueElement(DecimalType value) {
        this.value = value;
        return this;
    }

    /**
     * @return A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     */
    public BigDecimal getValue() {
        return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     */
    public SubdetailAdjudicationComponent setValue(BigDecimal value) {
        if (value == null)
            this.value = null;
        else {
            if (this.value == null)
                this.value = new DecimalType();
            this.value.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "Coding", "Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("amount", "Money", "Monetary amount associated with the code.", 0, java.lang.Integer.MAX_VALUE, amount));
        childrenList.add(new Property("value", "decimal", "A non-monetary value for example a percentage. Mutually exclusive to the amount element above.", 0, java.lang.Integer.MAX_VALUE, value));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // Coding
            this.code = castToCoding(value);
        else if (name.equals("amount"))
            // Money
            this.amount = castToMoney(value);
        else if (name.equals("value"))
            // DecimalType
            this.value = castToDecimal(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new Coding();
            return this.code;
        } else if (name.equals("amount")) {
            this.amount = new Money();
            return this.amount;
        } else if (name.equals("value")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.value");
        } else
            return super.addChild(name);
    }

    public SubdetailAdjudicationComponent copy() {
        SubdetailAdjudicationComponent dst = new SubdetailAdjudicationComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.amount = amount == null ? null : amount.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SubdetailAdjudicationComponent))
            return false;
        SubdetailAdjudicationComponent o = (SubdetailAdjudicationComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(amount, o.amount, true) && compareDeep(value, o.value, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SubdetailAdjudicationComponent))
            return false;
        SubdetailAdjudicationComponent o = (SubdetailAdjudicationComponent) other;
        return compareValues(value, o.value, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (amount == null || amount.isEmpty()) && (value == null || value.isEmpty());
    }

    public String fhirType() {
        return "ClaimResponse.item.detail.subDetail.adjudication";
    }
}
