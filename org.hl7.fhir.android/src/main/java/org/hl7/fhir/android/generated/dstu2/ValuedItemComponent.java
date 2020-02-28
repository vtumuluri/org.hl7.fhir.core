package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class ValuedItemComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Specific type of Contract Valued Item that may be priced.
     */
    protected Type entity;

    /**
     * Identifies a Contract Valued Item instance.
     */
    protected Identifier identifier;

    /**
     * Indicates the time during which this Contract ValuedItem information is effective.
     */
    protected DateTimeType effectiveTime;

    /**
     * Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances.
     */
    protected SimpleQuantity quantity;

    /**
     * A Contract Valued Item unit valuation measure.
     */
    protected Money unitPrice;

    /**
     * A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     */
    protected DecimalType factor;

    /**
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.
     */
    protected DecimalType points;

    /**
     * Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     */
    protected Money net;

    private static final long serialVersionUID = 1782449516L;

    /*
     * Constructor
     */
    public ValuedItemComponent() {
        super();
    }

    /**
     * @return {@link #entity} (Specific type of Contract Valued Item that may be priced.)
     */
    public Type getEntity() {
        return this.entity;
    }

    /**
     * @return {@link #entity} (Specific type of Contract Valued Item that may be priced.)
     */
    public CodeableConcept getEntityCodeableConcept() throws FHIRException {
        if (!(this.entity instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but " + this.entity.getClass().getName() + " was encountered");
        return (CodeableConcept) this.entity;
    }

    public boolean hasEntityCodeableConcept() {
        return this.entity instanceof CodeableConcept;
    }

    /**
     * @return {@link #entity} (Specific type of Contract Valued Item that may be priced.)
     */
    public Reference getEntityReference() throws FHIRException {
        if (!(this.entity instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.entity.getClass().getName() + " was encountered");
        return (Reference) this.entity;
    }

    public boolean hasEntityReference() {
        return this.entity instanceof Reference;
    }

    public boolean hasEntity() {
        return this.entity != null && !this.entity.isEmpty();
    }

    /**
     * @param value {@link #entity} (Specific type of Contract Valued Item that may be priced.)
     */
    public ValuedItemComponent setEntity(Type value) {
        this.entity = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Identifies a Contract Valued Item instance.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValuedItemComponent.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Identifies a Contract Valued Item instance.)
     */
    public ValuedItemComponent setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #effectiveTime} (Indicates the time during which this Contract ValuedItem information is effective.). This is the underlying object with id, value and extensions. The accessor "getEffectiveTime" gives direct access to the value
     */
    public DateTimeType getEffectiveTimeElement() {
        if (this.effectiveTime == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValuedItemComponent.effectiveTime");
            else if (Configuration.doAutoCreate())
                // bb
                this.effectiveTime = new DateTimeType();
        return this.effectiveTime;
    }

    public boolean hasEffectiveTimeElement() {
        return this.effectiveTime != null && !this.effectiveTime.isEmpty();
    }

    public boolean hasEffectiveTime() {
        return this.effectiveTime != null && !this.effectiveTime.isEmpty();
    }

    /**
     * @param value {@link #effectiveTime} (Indicates the time during which this Contract ValuedItem information is effective.). This is the underlying object with id, value and extensions. The accessor "getEffectiveTime" gives direct access to the value
     */
    public ValuedItemComponent setEffectiveTimeElement(DateTimeType value) {
        this.effectiveTime = value;
        return this;
    }

    /**
     * @return Indicates the time during which this Contract ValuedItem information is effective.
     */
    public Date getEffectiveTime() {
        return this.effectiveTime == null ? null : this.effectiveTime.getValue();
    }

    /**
     * @param value Indicates the time during which this Contract ValuedItem information is effective.
     */
    public ValuedItemComponent setEffectiveTime(Date value) {
        if (value == null)
            this.effectiveTime = null;
        else {
            if (this.effectiveTime == null)
                this.effectiveTime = new DateTimeType();
            this.effectiveTime.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #quantity} (Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances.)
     */
    public SimpleQuantity getQuantity() {
        if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValuedItemComponent.quantity");
            else if (Configuration.doAutoCreate())
                // cc
                this.quantity = new SimpleQuantity();
        return this.quantity;
    }

    public boolean hasQuantity() {
        return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances.)
     */
    public ValuedItemComponent setQuantity(SimpleQuantity value) {
        this.quantity = value;
        return this;
    }

    /**
     * @return {@link #unitPrice} (A Contract Valued Item unit valuation measure.)
     */
    public Money getUnitPrice() {
        if (this.unitPrice == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValuedItemComponent.unitPrice");
            else if (Configuration.doAutoCreate())
                // cc
                this.unitPrice = new Money();
        return this.unitPrice;
    }

    public boolean hasUnitPrice() {
        return this.unitPrice != null && !this.unitPrice.isEmpty();
    }

    /**
     * @param value {@link #unitPrice} (A Contract Valued Item unit valuation measure.)
     */
    public ValuedItemComponent setUnitPrice(Money value) {
        this.unitPrice = value;
        return this;
    }

    /**
     * @return {@link #factor} (A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.). This is the underlying object with id, value and extensions. The accessor "getFactor" gives direct access to the value
     */
    public DecimalType getFactorElement() {
        if (this.factor == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValuedItemComponent.factor");
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
     * @param value {@link #factor} (A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.). This is the underlying object with id, value and extensions. The accessor "getFactor" gives direct access to the value
     */
    public ValuedItemComponent setFactorElement(DecimalType value) {
        this.factor = value;
        return this;
    }

    /**
     * @return A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     */
    public BigDecimal getFactor() {
        return this.factor == null ? null : this.factor.getValue();
    }

    /**
     * @param value A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     */
    public ValuedItemComponent setFactor(BigDecimal value) {
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
     * @return {@link #points} (An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.). This is the underlying object with id, value and extensions. The accessor "getPoints" gives direct access to the value
     */
    public DecimalType getPointsElement() {
        if (this.points == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValuedItemComponent.points");
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
     * @param value {@link #points} (An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.). This is the underlying object with id, value and extensions. The accessor "getPoints" gives direct access to the value
     */
    public ValuedItemComponent setPointsElement(DecimalType value) {
        this.points = value;
        return this;
    }

    /**
     * @return An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.
     */
    public BigDecimal getPoints() {
        return this.points == null ? null : this.points.getValue();
    }

    /**
     * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.
     */
    public ValuedItemComponent setPoints(BigDecimal value) {
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
     * @return {@link #net} (Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.)
     */
    public Money getNet() {
        if (this.net == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ValuedItemComponent.net");
            else if (Configuration.doAutoCreate())
                // cc
                this.net = new Money();
        return this.net;
    }

    public boolean hasNet() {
        return this.net != null && !this.net.isEmpty();
    }

    /**
     * @param value {@link #net} (Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.)
     */
    public ValuedItemComponent setNet(Money value) {
        this.net = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("entity[x]", "CodeableConcept|Reference(Any)", "Specific type of Contract Valued Item that may be priced.", 0, java.lang.Integer.MAX_VALUE, entity));
        childrenList.add(new Property("identifier", "Identifier", "Identifies a Contract Valued Item instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("effectiveTime", "dateTime", "Indicates the time during which this Contract ValuedItem information is effective.", 0, java.lang.Integer.MAX_VALUE, effectiveTime));
        childrenList.add(new Property("quantity", "SimpleQuantity", "Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances.", 0, java.lang.Integer.MAX_VALUE, quantity));
        childrenList.add(new Property("unitPrice", "Money", "A Contract Valued Item unit valuation measure.", 0, java.lang.Integer.MAX_VALUE, unitPrice));
        childrenList.add(new Property("factor", "decimal", "A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.", 0, java.lang.Integer.MAX_VALUE, factor));
        childrenList.add(new Property("points", "decimal", "An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.", 0, java.lang.Integer.MAX_VALUE, points));
        childrenList.add(new Property("net", "Money", "Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.", 0, java.lang.Integer.MAX_VALUE, net));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("entity[x]"))
            // Type
            this.entity = (Type) value;
        else if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("effectiveTime"))
            // DateTimeType
            this.effectiveTime = castToDateTime(value);
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
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("entityCodeableConcept")) {
            this.entity = new CodeableConcept();
            return this.entity;
        } else if (name.equals("entityReference")) {
            this.entity = new Reference();
            return this.entity;
        } else if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("effectiveTime")) {
            throw new FHIRException("Cannot call addChild on a primitive type Contract.effectiveTime");
        } else if (name.equals("quantity")) {
            this.quantity = new SimpleQuantity();
            return this.quantity;
        } else if (name.equals("unitPrice")) {
            this.unitPrice = new Money();
            return this.unitPrice;
        } else if (name.equals("factor")) {
            throw new FHIRException("Cannot call addChild on a primitive type Contract.factor");
        } else if (name.equals("points")) {
            throw new FHIRException("Cannot call addChild on a primitive type Contract.points");
        } else if (name.equals("net")) {
            this.net = new Money();
            return this.net;
        } else
            return super.addChild(name);
    }

    public ValuedItemComponent copy() {
        ValuedItemComponent dst = new ValuedItemComponent();
        copyValues(dst);
        dst.entity = entity == null ? null : entity.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.effectiveTime = effectiveTime == null ? null : effectiveTime.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.unitPrice = unitPrice == null ? null : unitPrice.copy();
        dst.factor = factor == null ? null : factor.copy();
        dst.points = points == null ? null : points.copy();
        dst.net = net == null ? null : net.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ValuedItemComponent))
            return false;
        ValuedItemComponent o = (ValuedItemComponent) other;
        return compareDeep(entity, o.entity, true) && compareDeep(identifier, o.identifier, true) && compareDeep(effectiveTime, o.effectiveTime, true) && compareDeep(quantity, o.quantity, true) && compareDeep(unitPrice, o.unitPrice, true) && compareDeep(factor, o.factor, true) && compareDeep(points, o.points, true) && compareDeep(net, o.net, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ValuedItemComponent))
            return false;
        ValuedItemComponent o = (ValuedItemComponent) other;
        return compareValues(effectiveTime, o.effectiveTime, true) && compareValues(factor, o.factor, true) && compareValues(points, o.points, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (entity == null || entity.isEmpty()) && (identifier == null || identifier.isEmpty()) && (effectiveTime == null || effectiveTime.isEmpty()) && (quantity == null || quantity.isEmpty()) && (unitPrice == null || unitPrice.isEmpty()) && (factor == null || factor.isEmpty()) && (points == null || points.isEmpty()) && (net == null || net.isEmpty());
    }

    public String fhirType() {
        return "Contract.valuedItem";
    }
}
