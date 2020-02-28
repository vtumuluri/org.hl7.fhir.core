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

public class DetailComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A service line number.
     */
    protected PositiveIntType sequence;

    /**
     * The type of product or service.
     */
    protected Coding type;

    /**
     * If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied.
     */
    protected Coding service;

    /**
     * The number of repetitions of a service or product.
     */
    protected SimpleQuantity quantity;

    /**
     * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
     */
    protected Money unitPrice;

    /**
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     */
    protected DecimalType factor;

    /**
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     */
    protected DecimalType points;

    /**
     * The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     */
    protected Money net;

    /**
     * List of Unique Device Identifiers associated with this line item.
     */
    protected Coding udi;

    /**
     * Third tier of goods and services.
     */
    protected List<SubDetailComponent> subDetail;

    private static final long serialVersionUID = 5768017L;

    /*
     * Constructor
     */
    public DetailComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DetailComponent(PositiveIntType sequence, Coding type, Coding service) {
        super();
        this.sequence = sequence;
        this.type = type;
        this.service = service;
    }

    /**
     * @return {@link #sequence} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
     */
    public PositiveIntType getSequenceElement() {
        if (this.sequence == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailComponent.sequence");
            else if (Configuration.doAutoCreate())
                // bb
                this.sequence = new PositiveIntType();
        return this.sequence;
    }

    public boolean hasSequenceElement() {
        return this.sequence != null && !this.sequence.isEmpty();
    }

    public boolean hasSequence() {
        return this.sequence != null && !this.sequence.isEmpty();
    }

    /**
     * @param value {@link #sequence} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
     */
    public DetailComponent setSequenceElement(PositiveIntType value) {
        this.sequence = value;
        return this;
    }

    /**
     * @return A service line number.
     */
    public int getSequence() {
        return this.sequence == null || this.sequence.isEmpty() ? 0 : this.sequence.getValue();
    }

    /**
     * @param value A service line number.
     */
    public DetailComponent setSequence(int value) {
        if (this.sequence == null)
            this.sequence = new PositiveIntType();
        this.sequence.setValue(value);
        return this;
    }

    /**
     * @return {@link #type} (The type of product or service.)
     */
    public Coding getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new Coding();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of product or service.)
     */
    public DetailComponent setType(Coding value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #service} (If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied.)
     */
    public Coding getService() {
        if (this.service == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailComponent.service");
            else if (Configuration.doAutoCreate())
                // cc
                this.service = new Coding();
        return this.service;
    }

    public boolean hasService() {
        return this.service != null && !this.service.isEmpty();
    }

    /**
     * @param value {@link #service} (If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied.)
     */
    public DetailComponent setService(Coding value) {
        this.service = value;
        return this;
    }

    /**
     * @return {@link #quantity} (The number of repetitions of a service or product.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailComponent.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The number of repetitions of a service or product.)
     */
    public DetailComponent setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #unitPrice} (If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.)
     */
    public Money getUnitPrice() {
        if (this.unitPrice == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailComponent.unitPrice");
            else if (Configuration.doAutoCreate())
                // cc
                this.unitPrice = new Money();
        return this.unitPrice;
    }

    public boolean hasUnitPrice() {
        return this.unitPrice != null && !this.unitPrice.isEmpty();
    }

    /**
     * @param value {@link #unitPrice} (If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.)
     */
    public DetailComponent setUnitPrice(Money value) {
        this.unitPrice = value;
        return this;
    }

    /**
     * @return {@link #factor} (A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.). This is the underlying object with id, value and extensions. The accessor "getFactor" gives direct access to the value
     */
    public DecimalType getFactorElement() {
        if (this.factor == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailComponent.factor");
            else if (Configuration.doAutoCreate())
                // bb
                this.factor = new DecimalType();
        return this.factor;
    }

    public boolean hasFactorElement() {
        return this.factor != null && !this.factor.isEmpty();
    }

    public boolean hasFactor() {
        return this.factor != null && !this.factor.isEmpty();
    }

    /**
     * @param value {@link #factor} (A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.). This is the underlying object with id, value and extensions. The accessor "getFactor" gives direct access to the value
     */
    public DetailComponent setFactorElement(DecimalType value) {
        this.factor = value;
        return this;
    }

    /**
     * @return A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     */
    public BigDecimal getFactor() {
        return this.factor == null ? null : this.factor.getValue();
    }

    /**
     * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     */
    public DetailComponent setFactor(BigDecimal value) {
        if (value == null)
            this.factor = null;
        else {
            if (this.factor == null)
                this.factor = new DecimalType();
            this.factor.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #points} (An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.). This is the underlying object with id, value and extensions. The accessor "getPoints" gives direct access to the value
     */
    public DecimalType getPointsElement() {
        if (this.points == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailComponent.points");
            else if (Configuration.doAutoCreate())
                // bb
                this.points = new DecimalType();
        return this.points;
    }

    public boolean hasPointsElement() {
        return this.points != null && !this.points.isEmpty();
    }

    public boolean hasPoints() {
        return this.points != null && !this.points.isEmpty();
    }

    /**
     * @param value {@link #points} (An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.). This is the underlying object with id, value and extensions. The accessor "getPoints" gives direct access to the value
     */
    public DetailComponent setPointsElement(DecimalType value) {
        this.points = value;
        return this;
    }

    /**
     * @return An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     */
    public BigDecimal getPoints() {
        return this.points == null ? null : this.points.getValue();
    }

    /**
     * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     */
    public DetailComponent setPoints(BigDecimal value) {
        if (value == null)
            this.points = null;
        else {
            if (this.points == null)
                this.points = new DecimalType();
            this.points.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #net} (The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.)
     */
    public Money getNet() {
        if (this.net == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailComponent.net");
            else if (Configuration.doAutoCreate())
                // cc
                this.net = new Money();
        return this.net;
    }

    public boolean hasNet() {
        return this.net != null && !this.net.isEmpty();
    }

    /**
     * @param value {@link #net} (The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.)
     */
    public DetailComponent setNet(Money value) {
        this.net = value;
        return this;
    }

    /**
     * @return {@link #udi} (List of Unique Device Identifiers associated with this line item.)
     */
    public Coding getUdi() {
        if (this.udi == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetailComponent.udi");
            else if (Configuration.doAutoCreate())
                // cc
                this.udi = new Coding();
        return this.udi;
    }

    public boolean hasUdi() {
        return this.udi != null && !this.udi.isEmpty();
    }

    /**
     * @param value {@link #udi} (List of Unique Device Identifiers associated with this line item.)
     */
    public DetailComponent setUdi(Coding value) {
        this.udi = value;
        return this;
    }

    /**
     * @return {@link #subDetail} (Third tier of goods and services.)
     */
    public List<SubDetailComponent> getSubDetail() {
        if (this.subDetail == null)
            this.subDetail = new ArrayList<SubDetailComponent>();
        return this.subDetail;
    }

    public boolean hasSubDetail() {
        if (this.subDetail == null)
            return false;
        for (SubDetailComponent item : this.subDetail) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public SubDetailComponent addSubDetail() {
        // 3
        SubDetailComponent t = new SubDetailComponent();
        if (this.subDetail == null)
            this.subDetail = new ArrayList<SubDetailComponent>();
        this.subDetail.add(t);
        return t;
    }

    // syntactic sugar
    public DetailComponent addSubDetail(SubDetailComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.subDetail == null)
            this.subDetail = new ArrayList<SubDetailComponent>();
        this.subDetail.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("sequence", "positiveInt", "A service line number.", 0, java.lang.Integer.MAX_VALUE, sequence));
        childrenList.add(new Property("type", "Coding", "The type of product or service.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("service", "Coding", "If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied.", 0, java.lang.Integer.MAX_VALUE, service));
        childrenList.add(new Property("quantity", "SimpleQuantity", "The number of repetitions of a service or product.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("unitPrice", "Money", "If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.", 0, java.lang.Integer.MAX_VALUE, unitPrice));
        childrenList.add(new Property("factor", "decimal", "A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.", 0, java.lang.Integer.MAX_VALUE, factor));
        childrenList.add(new Property("points", "decimal", "An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.", 0, java.lang.Integer.MAX_VALUE, points));
        childrenList.add(new Property("net", "Money", "The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.", 0, java.lang.Integer.MAX_VALUE, net));
        childrenList.add(new Property("udi", "Coding", "List of Unique Device Identifiers associated with this line item.", 0, java.lang.Integer.MAX_VALUE, udi));
        childrenList.add(new Property("subDetail", "", "Third tier of goods and services.", 0, java.lang.Integer.MAX_VALUE, subDetail));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequence"))
            // PositiveIntType
            this.sequence = castToPositiveInt(value);
        else if (name.equals("type"))
            // Coding
            this.type = castToCoding(value);
        else if (name.equals("service"))
            // Coding
            this.service = castToCoding(value);
        else if (name.equals("quantity"))
            // SimpleQuantity
            this.quantity = castToSimpleQuantity(value);
        else if (name.equals("unitPrice"))
            // Money
            this.unitPrice = castToMoney(value);
        else if (name.equals("factor"))
            // DecimalType
            this.factor = castToDecimal(value);
        else if (name.equals("points"))
            // DecimalType
            this.points = castToDecimal(value);
        else if (name.equals("net"))
            // Money
            this.net = castToMoney(value);
        else if (name.equals("udi"))
            // Coding
            this.udi = castToCoding(value);
        else if (name.equals("subDetail"))
            this.getSubDetail().add((SubDetailComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("sequence")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.sequence");
        } else if (name.equals("type")) {
            this.type = new Coding();
            return this.type;
        } else if (name.equals("service")) {
            this.service = new Coding();
            return this.service;
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else if (name.equals("unitPrice")) {
            this.unitPrice = new Money();
            return this.unitPrice;
        } else if (name.equals("factor")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.factor");
        } else if (name.equals("points")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.points");
        } else if (name.equals("net")) {
            this.net = new Money();
            return this.net;
        } else if (name.equals("udi")) {
            this.udi = new Coding();
            return this.udi;
        } else if (name.equals("subDetail")) {
            return addSubDetail();
        } else
            return super.addChild(name);
    }

    public DetailComponent copy() {
        DetailComponent dst = new DetailComponent();
        copyValues(dst);
        dst.sequence = sequence == null ? null : sequence.copy();
        dst.type = type == null ? null : type.copy();
        dst.service = service == null ? null : service.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.unitPrice = unitPrice == null ? null : unitPrice.copy();
        dst.factor = factor == null ? null : factor.copy();
        dst.points = points == null ? null : points.copy();
        dst.net = net == null ? null : net.copy();
        dst.udi = udi == null ? null : udi.copy();
        if (subDetail != null) {
            dst.subDetail = new ArrayList<SubDetailComponent>();
            for (SubDetailComponent i : subDetail) dst.subDetail.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DetailComponent))
            return false;
        DetailComponent o = (DetailComponent) other;
        return compareDeep(sequence, o.sequence, true) && compareDeep(type, o.type, true) && compareDeep(service, o.service, true) && compareDeep(quantity, o.quantity, true) && compareDeep(unitPrice, o.unitPrice, true) && compareDeep(factor, o.factor, true) && compareDeep(points, o.points, true) && compareDeep(net, o.net, true) && compareDeep(udi, o.udi, true) && compareDeep(subDetail, o.subDetail, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DetailComponent))
            return false;
        DetailComponent o = (DetailComponent) other;
        return compareValues(sequence, o.sequence, true) && compareValues(factor, o.factor, true) && compareValues(points, o.points, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (sequence == null || sequence.isEmpty()) && (type == null || type.isEmpty()) && (service == null || service.isEmpty()) && (quantity == null || quantity.isEmpty()) && (unitPrice == null || unitPrice.isEmpty()) && (factor == null || factor.isEmpty()) && (points == null || points.isEmpty()) && (net == null || net.isEmpty()) && (udi == null || udi.isEmpty()) && (subDetail == null || subDetail.isEmpty());
    }

    public String fhirType() {
        return "Claim.item.detail";
    }
}
