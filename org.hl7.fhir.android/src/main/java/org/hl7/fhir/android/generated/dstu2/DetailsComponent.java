package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.RemittanceOutcome;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.RemittanceOutcomeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class DetailsComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Code to indicate the nature of the payment, adjustment, funds advance, etc.
     */
    protected Coding type;

    /**
     * The claim or financial resource.
     */
    protected Reference request;

    /**
     * The actual object that is the target of the reference (The claim or financial resource.)
     */
    protected Resource requestTarget;

    /**
     * The claim response resource.
     */
    protected Reference responce;

    /**
     * The actual object that is the target of the reference (The claim response resource.)
     */
    protected Resource responceTarget;

    /**
     * The Organization which submitted the invoice or financial transaction.
     */
    protected Reference submitter;

    /**
     * The actual object that is the target of the reference (The Organization which submitted the invoice or financial transaction.)
     */
    protected Organization submitterTarget;

    /**
     * The organization which is receiving the payment.
     */
    protected Reference payee;

    /**
     * The actual object that is the target of the reference (The organization which is receiving the payment.)
     */
    protected Organization payeeTarget;

    /**
     * The date of the invoice or financial resource.
     */
    protected DateType date;

    /**
     * Amount paid for this detail.
     */
    protected Money amount;

    private static final long serialVersionUID = -1644048062L;

    /*
     * Constructor
     */
    public DetailsComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DetailsComponent(Coding type) {
        super();
        this.type = type;
    }

    /**
     * @return {@link #type} (Code to indicate the nature of the payment, adjustment, funds advance, etc.)
     */
    public Coding getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailsComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new Coding();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Code to indicate the nature of the payment, adjustment, funds advance, etc.)
     */
    public DetailsComponent setType(Coding value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #request} (The claim or financial resource.)
     */
    public Reference getRequest() {
        if (this.request == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailsComponent.request");
            else if (Configuration.doAutoCreate())
                // cc
                this.request = new Reference();
        return this.request;
    }

    public boolean hasRequest() {
        return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (The claim or financial resource.)
     */
    public DetailsComponent setRequest(Reference value) {
        this.request = value;
        return this;
    }

    /**
     * @return {@link #request} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The claim or financial resource.)
     */
    public Resource getRequestTarget() {
        return this.requestTarget;
    }

    /**
     * @param value {@link #request} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The claim or financial resource.)
     */
    public DetailsComponent setRequestTarget(Resource value) {
        this.requestTarget = value;
        return this;
    }

    /**
     * @return {@link #responce} (The claim response resource.)
     */
    public Reference getResponce() {
        if (this.responce == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailsComponent.responce");
            else if (Configuration.doAutoCreate())
                // cc
                this.responce = new Reference();
        return this.responce;
    }

    public boolean hasResponce() {
        return this.responce != null && !this.responce.isEmpty();
    }

    /**
     * @param value {@link #responce} (The claim response resource.)
     */
    public DetailsComponent setResponce(Reference value) {
        this.responce = value;
        return this;
    }

    /**
     * @return {@link #responce} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The claim response resource.)
     */
    public Resource getResponceTarget() {
        return this.responceTarget;
    }

    /**
     * @param value {@link #responce} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The claim response resource.)
     */
    public DetailsComponent setResponceTarget(Resource value) {
        this.responceTarget = value;
        return this;
    }

    /**
     * @return {@link #submitter} (The Organization which submitted the invoice or financial transaction.)
     */
    public Reference getSubmitter() {
        if (this.submitter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailsComponent.submitter");
            else if (Configuration.doAutoCreate())
                // cc
                this.submitter = new Reference();
        return this.submitter;
    }

    public boolean hasSubmitter() {
        return this.submitter != null && !this.submitter.isEmpty();
    }

    /**
     * @param value {@link #submitter} (The Organization which submitted the invoice or financial transaction.)
     */
    public DetailsComponent setSubmitter(Reference value) {
        this.submitter = value;
        return this;
    }

    /**
     * @return {@link #submitter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The Organization which submitted the invoice or financial transaction.)
     */
    public Organization getSubmitterTarget() {
        if (this.submitterTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailsComponent.submitter");
            else if (Configuration.doAutoCreate())
                // aa
                this.submitterTarget = new Organization();
        return this.submitterTarget;
    }

    /**
     * @param value {@link #submitter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The Organization which submitted the invoice or financial transaction.)
     */
    public DetailsComponent setSubmitterTarget(Organization value) {
        this.submitterTarget = value;
        return this;
    }

    /**
     * @return {@link #payee} (The organization which is receiving the payment.)
     */
    public Reference getPayee() {
        if (this.payee == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailsComponent.payee");
            else if (Configuration.doAutoCreate())
                // cc
                this.payee = new Reference();
        return this.payee;
    }

    public boolean hasPayee() {
        return this.payee != null && !this.payee.isEmpty();
    }

    /**
     * @param value {@link #payee} (The organization which is receiving the payment.)
     */
    public DetailsComponent setPayee(Reference value) {
        this.payee = value;
        return this;
    }

    /**
     * @return {@link #payee} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization which is receiving the payment.)
     */
    public Organization getPayeeTarget() {
        if (this.payeeTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailsComponent.payee");
            else if (Configuration.doAutoCreate())
                // aa
                this.payeeTarget = new Organization();
        return this.payeeTarget;
    }

    /**
     * @param value {@link #payee} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization which is receiving the payment.)
     */
    public DetailsComponent setPayeeTarget(Organization value) {
        this.payeeTarget = value;
        return this;
    }

    /**
     * @return {@link #date} (The date of the invoice or financial resource.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailsComponent.date");
            else if (Configuration.doAutoCreate())
                // bb
                this.date = new DateType();
        return this.date;
    }

    public boolean hasDateElement() {
        return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() {
        return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The date of the invoice or financial resource.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DetailsComponent setDateElement(DateType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date of the invoice or financial resource.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date of the invoice or financial resource.
     */
    public DetailsComponent setDate(Date value) {
        if (value == null)
            this.date = null;
        else {
            if (this.date == null)
                this.date = new DateType();
            this.date.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #amount} (Amount paid for this detail.)
     */
    public Money getAmount() {
        if (this.amount == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailsComponent.amount");
            else if (Configuration.doAutoCreate())
                // cc
                this.amount = new Money();
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null && !this.amount.isEmpty();
    }

    /**
     * @param value {@link #amount} (Amount paid for this detail.)
     */
    public DetailsComponent setAmount(Money value) {
        this.amount = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "Coding", "Code to indicate the nature of the payment, adjustment, funds advance, etc.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("request", "Reference(Any)", "The claim or financial resource.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("responce", "Reference(Any)", "The claim response resource.", 0, java.lang.Integer.MAX_VALUE, responce));
        childrenList.add(new Property("submitter", "Reference(Organization)", "The Organization which submitted the invoice or financial transaction.", 0, java.lang.Integer.MAX_VALUE, submitter));
        childrenList.add(new Property("payee", "Reference(Organization)", "The organization which is receiving the payment.", 0, java.lang.Integer.MAX_VALUE, payee));
        childrenList.add(new Property("date", "date", "The date of the invoice or financial resource.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("amount", "Money", "Amount paid for this detail.", 0, java.lang.Integer.MAX_VALUE, amount));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // Coding
            this.type = castToCoding(value);
        else if (name.equals("request"))
            // Reference
            this.request = castToReference(value);
        else if (name.equals("responce"))
            // Reference
            this.responce = castToReference(value);
        else if (name.equals("submitter"))
            // Reference
            this.submitter = castToReference(value);
        else if (name.equals("payee"))
            // Reference
            this.payee = castToReference(value);
        else if (name.equals("date"))
            // DateType
            this.date = castToDate(value);
        else if (name.equals("amount"))
            // Money
            this.amount = castToMoney(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new Coding();
            return this.type;
        } else if (name.equals("request")) {
            this.request = new Reference();
            return this.request;
        } else if (name.equals("responce")) {
            this.responce = new Reference();
            return this.responce;
        } else if (name.equals("submitter")) {
            this.submitter = new Reference();
            return this.submitter;
        } else if (name.equals("payee")) {
            this.payee = new Reference();
            return this.payee;
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type PaymentReconciliation.date");
        } else if (name.equals("amount")) {
            this.amount = new Money();
            return this.amount;
        } else
            return super.addChild(name);
    }

    public DetailsComponent copy() {
        DetailsComponent dst = new DetailsComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.request = request == null ? null : request.copy();
        dst.responce = responce == null ? null : responce.copy();
        dst.submitter = submitter == null ? null : submitter.copy();
        dst.payee = payee == null ? null : payee.copy();
        dst.date = date == null ? null : date.copy();
        dst.amount = amount == null ? null : amount.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DetailsComponent))
            return false;
        DetailsComponent o = (DetailsComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(request, o.request, true) && compareDeep(responce, o.responce, true) && compareDeep(submitter, o.submitter, true) && compareDeep(payee, o.payee, true) && compareDeep(date, o.date, true) && compareDeep(amount, o.amount, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DetailsComponent))
            return false;
        DetailsComponent o = (DetailsComponent) other;
        return compareValues(date, o.date, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (request == null || request.isEmpty()) && (responce == null || responce.isEmpty()) && (submitter == null || submitter.isEmpty()) && (payee == null || payee.isEmpty()) && (date == null || date.isEmpty()) && (amount == null || amount.isEmpty());
    }

    public String fhirType() {
        return "PaymentReconciliation.detail";
    }
}
