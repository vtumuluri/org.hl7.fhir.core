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

public class AddedItemComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * List of input service items which this service line is intended to replace.
     */
    protected List<PositiveIntType> sequenceLinkId;

    /**
     * A code to indicate the Professional Service or Product supplied.
     */
    protected Coding service;

    /**
     * The fee charged for the professional service or product..
     */
    protected Money fee;

    /**
     * A list of note references to the notes provided below.
     */
    protected List<PositiveIntType> noteNumberLinkId;

    /**
     * The adjudications results.
     */
    protected List<AddedItemAdjudicationComponent> adjudication;

    /**
     * The second tier service adjudications for payor added services.
     */
    protected List<AddedItemsDetailComponent> detail;

    private static final long serialVersionUID = -1675935854L;

    /*
     * Constructor
     */
    public AddedItemComponent() {
        super();
    }

    /*
     * Constructor
     */
    public AddedItemComponent(Coding service) {
        super();
        this.service = service;
    }

    /**
     * @return {@link #sequenceLinkId} (List of input service items which this service line is intended to replace.)
     */
    public List<PositiveIntType> getSequenceLinkId() {
        if (this.sequenceLinkId == null)
            this.sequenceLinkId = new ArrayList<PositiveIntType>();
        return this.sequenceLinkId;
    }

    public boolean hasSequenceLinkId() {
        if (this.sequenceLinkId == null)
            return false;
        for (PositiveIntType item : this.sequenceLinkId) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public PositiveIntType addSequenceLinkIdElement() {
        // 2
        PositiveIntType t = new PositiveIntType();
        if (this.sequenceLinkId == null)
            this.sequenceLinkId = new ArrayList<PositiveIntType>();
        this.sequenceLinkId.add(t);
        return t;
    }

    /**
     * @param value {@link #sequenceLinkId} (List of input service items which this service line is intended to replace.)
     */
    public AddedItemComponent addSequenceLinkId(int value) {
        // 1
        PositiveIntType t = new PositiveIntType();
        t.setValue(value);
        if (this.sequenceLinkId == null)
            this.sequenceLinkId = new ArrayList<PositiveIntType>();
        this.sequenceLinkId.add(t);
        return this;
    }

    /**
     * @param value {@link #sequenceLinkId} (List of input service items which this service line is intended to replace.)
     */
    public boolean hasSequenceLinkId(int value) {
        if (this.sequenceLinkId == null)
            return false;
        for (PositiveIntType v : this.sequenceLinkId) if (// positiveInt
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #service} (A code to indicate the Professional Service or Product supplied.)
     */
    public Coding getService() {
        if (this.service == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AddedItemComponent.service");
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
    public AddedItemComponent setService(Coding value) {
        this.service = value;
        return this;
    }

    /**
     * @return {@link #fee} (The fee charged for the professional service or product..)
     */
    public Money getFee() {
        if (this.fee == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AddedItemComponent.fee");
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
    public AddedItemComponent setFee(Money value) {
        this.fee = value;
        return this;
    }

    /**
     * @return {@link #noteNumberLinkId} (A list of note references to the notes provided below.)
     */
    public List<PositiveIntType> getNoteNumberLinkId() {
        if (this.noteNumberLinkId == null)
            this.noteNumberLinkId = new ArrayList<PositiveIntType>();
        return this.noteNumberLinkId;
    }

    public boolean hasNoteNumberLinkId() {
        if (this.noteNumberLinkId == null)
            return false;
        for (PositiveIntType item : this.noteNumberLinkId) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public PositiveIntType addNoteNumberLinkIdElement() {
        // 2
        PositiveIntType t = new PositiveIntType();
        if (this.noteNumberLinkId == null)
            this.noteNumberLinkId = new ArrayList<PositiveIntType>();
        this.noteNumberLinkId.add(t);
        return t;
    }

    /**
     * @param value {@link #noteNumberLinkId} (A list of note references to the notes provided below.)
     */
    public AddedItemComponent addNoteNumberLinkId(int value) {
        // 1
        PositiveIntType t = new PositiveIntType();
        t.setValue(value);
        if (this.noteNumberLinkId == null)
            this.noteNumberLinkId = new ArrayList<PositiveIntType>();
        this.noteNumberLinkId.add(t);
        return this;
    }

    /**
     * @param value {@link #noteNumberLinkId} (A list of note references to the notes provided below.)
     */
    public boolean hasNoteNumberLinkId(int value) {
        if (this.noteNumberLinkId == null)
            return false;
        for (PositiveIntType v : this.noteNumberLinkId) if (// positiveInt
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #adjudication} (The adjudications results.)
     */
    public List<AddedItemAdjudicationComponent> getAdjudication() {
        if (this.adjudication == null)
            this.adjudication = new ArrayList<AddedItemAdjudicationComponent>();
        return this.adjudication;
    }

    public boolean hasAdjudication() {
        if (this.adjudication == null)
            return false;
        for (AddedItemAdjudicationComponent item : this.adjudication) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public AddedItemAdjudicationComponent addAdjudication() {
        // 3
        AddedItemAdjudicationComponent t = new AddedItemAdjudicationComponent();
        if (this.adjudication == null)
            this.adjudication = new ArrayList<AddedItemAdjudicationComponent>();
        this.adjudication.add(t);
        return t;
    }

    // syntactic sugar
    public AddedItemComponent addAdjudication(AddedItemAdjudicationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.adjudication == null)
            this.adjudication = new ArrayList<AddedItemAdjudicationComponent>();
        this.adjudication.add(t);
        return this;
    }

    /**
     * @return {@link #detail} (The second tier service adjudications for payor added services.)
     */
    public List<AddedItemsDetailComponent> getDetail() {
        if (this.detail == null)
            this.detail = new ArrayList<AddedItemsDetailComponent>();
        return this.detail;
    }

    public boolean hasDetail() {
        if (this.detail == null)
            return false;
        for (AddedItemsDetailComponent item : this.detail) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public AddedItemsDetailComponent addDetail() {
        // 3
        AddedItemsDetailComponent t = new AddedItemsDetailComponent();
        if (this.detail == null)
            this.detail = new ArrayList<AddedItemsDetailComponent>();
        this.detail.add(t);
        return t;
    }

    // syntactic sugar
    public AddedItemComponent addDetail(AddedItemsDetailComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.detail == null)
            this.detail = new ArrayList<AddedItemsDetailComponent>();
        this.detail.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("sequenceLinkId", "positiveInt", "List of input service items which this service line is intended to replace.", 0, java.lang.Integer.MAX_VALUE, sequenceLinkId));
        childrenList.add(new Property("service", "Coding", "A code to indicate the Professional Service or Product supplied.", 0, java.lang.Integer.MAX_VALUE, service));
        childrenList.add(new Property("fee", "Money", "The fee charged for the professional service or product..", 0, java.lang.Integer.MAX_VALUE, fee));
        childrenList.add(new Property("noteNumberLinkId", "positiveInt", "A list of note references to the notes provided below.", 0, java.lang.Integer.MAX_VALUE, noteNumberLinkId));
        childrenList.add(new Property("adjudication", "", "The adjudications results.", 0, java.lang.Integer.MAX_VALUE, adjudication));
        childrenList.add(new Property("detail", "", "The second tier service adjudications for payor added services.", 0, java.lang.Integer.MAX_VALUE, detail));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequenceLinkId"))
            this.getSequenceLinkId().add(castToPositiveInt(value));
        else if (name.equals("service"))
            // Coding
            this.service = castToCoding(value);
        else if (name.equals("fee"))
            // Money
            this.fee = castToMoney(value);
        else if (name.equals("noteNumberLinkId"))
            this.getNoteNumberLinkId().add(castToPositiveInt(value));
        else if (name.equals("adjudication"))
            this.getAdjudication().add((AddedItemAdjudicationComponent) value);
        else if (name.equals("detail"))
            this.getDetail().add((AddedItemsDetailComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("sequenceLinkId")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.sequenceLinkId");
        } else if (name.equals("service")) {
            this.service = new Coding();
            return this.service;
        } else if (name.equals("fee")) {
            this.fee = new Money();
            return this.fee;
        } else if (name.equals("noteNumberLinkId")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.noteNumberLinkId");
        } else if (name.equals("adjudication")) {
            return addAdjudication();
        } else if (name.equals("detail")) {
            return addDetail();
        } else
            return super.addChild(name);
    }

    public AddedItemComponent copy() {
        AddedItemComponent dst = new AddedItemComponent();
        copyValues(dst);
        if (sequenceLinkId != null) {
            dst.sequenceLinkId = new ArrayList<PositiveIntType>();
            for (PositiveIntType i : sequenceLinkId) dst.sequenceLinkId.add(i.copy());
        }
        ;
        dst.service = service == null ? null : service.copy();
        dst.fee = fee == null ? null : fee.copy();
        if (noteNumberLinkId != null) {
            dst.noteNumberLinkId = new ArrayList<PositiveIntType>();
            for (PositiveIntType i : noteNumberLinkId) dst.noteNumberLinkId.add(i.copy());
        }
        ;
        if (adjudication != null) {
            dst.adjudication = new ArrayList<AddedItemAdjudicationComponent>();
            for (AddedItemAdjudicationComponent i : adjudication) dst.adjudication.add(i.copy());
        }
        ;
        if (detail != null) {
            dst.detail = new ArrayList<AddedItemsDetailComponent>();
            for (AddedItemsDetailComponent i : detail) dst.detail.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AddedItemComponent))
            return false;
        AddedItemComponent o = (AddedItemComponent) other;
        return compareDeep(sequenceLinkId, o.sequenceLinkId, true) && compareDeep(service, o.service, true) && compareDeep(fee, o.fee, true) && compareDeep(noteNumberLinkId, o.noteNumberLinkId, true) && compareDeep(adjudication, o.adjudication, true) && compareDeep(detail, o.detail, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AddedItemComponent))
            return false;
        AddedItemComponent o = (AddedItemComponent) other;
        return compareValues(sequenceLinkId, o.sequenceLinkId, true) && compareValues(noteNumberLinkId, o.noteNumberLinkId, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (sequenceLinkId == null || sequenceLinkId.isEmpty()) && (service == null || service.isEmpty()) && (fee == null || fee.isEmpty()) && (noteNumberLinkId == null || noteNumberLinkId.isEmpty()) && (adjudication == null || adjudication.isEmpty()) && (detail == null || detail.isEmpty());
    }

    public String fhirType() {
        return "ClaimResponse.addItem";
    }
}
