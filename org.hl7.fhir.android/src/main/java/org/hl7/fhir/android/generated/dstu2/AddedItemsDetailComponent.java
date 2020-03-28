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

public class AddedItemsDetailComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A code to indicate the Professional Service or Product supplied.
     */
    protected Coding service;

    /**
     * The fee charged for the professional service or product..
     */
    protected Money fee;

    /**
     * The adjudications results.
     */
    protected List<AddedItemDetailAdjudicationComponent> adjudication;

    private static final long serialVersionUID = -2104242020L;

    /*
     * Constructor
     */
    public AddedItemsDetailComponent() {
        super();
    }

    /*
     * Constructor
     */
    public AddedItemsDetailComponent(Coding service) {
        super();
        this.service = service;
    }

    /**
     * @return {@link #service} (A code to indicate the Professional Service or Product supplied.)
     */
    public Coding getService() {
        if (this.service == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AddedItemsDetailComponent.service");
            else if (Configuration.doAutoCreate())
                // cc
                this.service = new Coding();
        return this.service;
    }

    public boolean hasService() {
        return this.service != null && !this.service.isEmpty();
    }

    /**
     * @param value {@link #service} (A code to indicate the Professional Service or Product supplied.)
     */
    public AddedItemsDetailComponent setService(Coding value) {
        this.service = value;
        return this;
    }

    /**
     * @return {@link #fee} (The fee charged for the professional service or product..)
     */
    public Money getFee() {
        if (this.fee == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AddedItemsDetailComponent.fee");
            else if (Configuration.doAutoCreate())
                // cc
                this.fee = new Money();
        return this.fee;
    }

    public boolean hasFee() {
        return this.fee != null && !this.fee.isEmpty();
    }

    /**
     * @param value {@link #fee} (The fee charged for the professional service or product..)
     */
    public AddedItemsDetailComponent setFee(Money value) {
        this.fee = value;
        return this;
    }

    /**
     * @return {@link #adjudication} (The adjudications results.)
     */
    public List<AddedItemDetailAdjudicationComponent> getAdjudication() {
        if (this.adjudication == null)
            this.adjudication = new ArrayList<AddedItemDetailAdjudicationComponent>();
        return this.adjudication;
    }

    public boolean hasAdjudication() {
        if (this.adjudication == null)
            return false;
        for (AddedItemDetailAdjudicationComponent item : this.adjudication) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public AddedItemDetailAdjudicationComponent addAdjudication() {
        // 3
        AddedItemDetailAdjudicationComponent t = new AddedItemDetailAdjudicationComponent();
        if (this.adjudication == null)
            this.adjudication = new ArrayList<AddedItemDetailAdjudicationComponent>();
        this.adjudication.add(t);
        return t;
    }

    // syntactic sugar
    public AddedItemsDetailComponent addAdjudication(AddedItemDetailAdjudicationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.adjudication == null)
            this.adjudication = new ArrayList<AddedItemDetailAdjudicationComponent>();
        this.adjudication.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("service", "Coding", "A code to indicate the Professional Service or Product supplied.", 0, java.lang.Integer.MAX_VALUE, service));
        childrenList.add(new Property("fee", "Money", "The fee charged for the professional service or product..", 0, java.lang.Integer.MAX_VALUE, fee));
        childrenList.add(new Property("adjudication", "", "The adjudications results.", 0, java.lang.Integer.MAX_VALUE, adjudication));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("service"))
            // Coding
            this.service = castToCoding(value);
        else if (name.equals("fee"))
            // Money
            this.fee = castToMoney(value);
        else if (name.equals("adjudication"))
            this.getAdjudication().add((AddedItemDetailAdjudicationComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("service")) {
            this.service = new Coding();
            return this.service;
        } else if (name.equals("fee")) {
            this.fee = new Money();
            return this.fee;
        } else if (name.equals("adjudication")) {
            return addAdjudication();
        } else
            return super.addChild(name);
    }

    public AddedItemsDetailComponent copy() {
        AddedItemsDetailComponent dst = new AddedItemsDetailComponent();
        copyValues(dst);
        dst.service = service == null ? null : service.copy();
        dst.fee = fee == null ? null : fee.copy();
        if (adjudication != null) {
            dst.adjudication = new ArrayList<AddedItemDetailAdjudicationComponent>();
            for (AddedItemDetailAdjudicationComponent i : adjudication) dst.adjudication.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AddedItemsDetailComponent))
            return false;
        AddedItemsDetailComponent o = (AddedItemsDetailComponent) other;
        return compareDeep(service, o.service, true) && compareDeep(fee, o.fee, true) && compareDeep(adjudication, o.adjudication, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AddedItemsDetailComponent))
            return false;
        AddedItemsDetailComponent o = (AddedItemsDetailComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (service == null || service.isEmpty()) && (fee == null || fee.isEmpty()) && (adjudication == null || adjudication.isEmpty());
    }

    public String fhirType() {
        return "ClaimResponse.addItem.detail";
    }
}
