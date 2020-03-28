package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionBase;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionBaseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionEyes;
import org.hl7.fhir.android.generated.dstu2.VisionPrescriptionEnum.VisionEyesEnumFactory;

public class VisionPrescriptionDispenseComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifies the type of vision correction product which is required for the patient.
     */
    protected Coding product;

    /**
     * The eye for which the lens applies.
     */
    protected Enumeration<VisionEyes> eye;

    /**
     * Lens power measured in diopters (0.25 units).
     */
    protected DecimalType sphere;

    /**
     * Power adjustment for astigmatism measured in diopters (0.25 units).
     */
    protected DecimalType cylinder;

    /**
     * Adjustment for astigmatism measured in integer degrees.
     */
    protected IntegerType axis;

    /**
     * Amount of prism to compensate for eye alignment in fractional units.
     */
    protected DecimalType prism;

    /**
     * The relative base, or reference lens edge, for the prism.
     */
    protected Enumeration<VisionBase> base;

    /**
     * Power adjustment for multifocal lenses measured in diopters (0.25 units).
     */
    protected DecimalType add;

    /**
     * Contact lens power measured in diopters (0.25 units).
     */
    protected DecimalType power;

    /**
     * Back curvature measured in millimeters.
     */
    protected DecimalType backCurve;

    /**
     * Contact lens diameter measured in millimeters.
     */
    protected DecimalType diameter;

    /**
     * The recommended maximum wear period for the lens.
     */
    protected SimpleQuantity duration;

    /**
     * Special color or pattern.
     */
    protected StringType color;

    /**
     * Brand recommendations or restrictions.
     */
    protected StringType brand;

    /**
     * Notes for special requirements such as coatings and lens materials.
     */
    protected StringType notes;

    private static final long serialVersionUID = -1586392610L;

    /*
     * Constructor
     */
    public VisionPrescriptionDispenseComponent() {
        super();
    }

    /*
     * Constructor
     */
    public VisionPrescriptionDispenseComponent(Coding product) {
        super();
        this.product = product;
    }

    /**
     * @return {@link #product} (Identifies the type of vision correction product which is required for the patient.)
     */
    public Coding getProduct() {
        if (this.product == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.product");
            else if (Configuration.doAutoCreate())
                // cc
                this.product = new Coding();
        return this.product;
    }

    public boolean hasProduct() {
        return this.product != null && !this.product.isEmpty();
    }

    /**
     * @param value {@link #product} (Identifies the type of vision correction product which is required for the patient.)
     */
    public VisionPrescriptionDispenseComponent setProduct(Coding value) {
        this.product = value;
        return this;
    }

    /**
     * @return {@link #eye} (The eye for which the lens applies.). This is the underlying object with id, value and extensions. The accessor "getEye" gives direct access to the value
     */
    public Enumeration<VisionEyes> getEyeElement() {
        if (this.eye == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.eye");
            else if (Configuration.doAutoCreate())
                // bb
                this.eye = new Enumeration<VisionEyes>(new VisionEyesEnumFactory());
        return this.eye;
    }

    public boolean hasEyeElement() {
        return this.eye != null && !this.eye.isEmpty();
    }

    public boolean hasEye() {
        return this.eye != null && !this.eye.isEmpty();
    }

    /**
     * @param value {@link #eye} (The eye for which the lens applies.). This is the underlying object with id, value and extensions. The accessor "getEye" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setEyeElement(Enumeration<VisionEyes> value) {
        this.eye = value;
        return this;
    }

    /**
     * @return The eye for which the lens applies.
     */
    public VisionEyes getEye() {
        return this.eye == null ? null : this.eye.getValue();
    }

    /**
     * @param value The eye for which the lens applies.
     */
    public VisionPrescriptionDispenseComponent setEye(VisionEyes value) {
        if (value == null)
            this.eye = null;
        else {
            if (this.eye == null)
                this.eye = new Enumeration<VisionEyes>(new VisionEyesEnumFactory());
            this.eye.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #sphere} (Lens power measured in diopters (0.25 units).). This is the underlying object with id, value and extensions. The accessor "getSphere" gives direct access to the value
     */
    public DecimalType getSphereElement() {
        if (this.sphere == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.sphere");
            else if (Configuration.doAutoCreate())
                // bb
                this.sphere = new DecimalType();
        return this.sphere;
    }

    public boolean hasSphereElement() {
        return this.sphere != null && !this.sphere.isEmpty();
    }

    public boolean hasSphere() {
        return this.sphere != null && !this.sphere.isEmpty();
    }

    /**
     * @param value {@link #sphere} (Lens power measured in diopters (0.25 units).). This is the underlying object with id, value and extensions. The accessor "getSphere" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setSphereElement(DecimalType value) {
        this.sphere = value;
        return this;
    }

    /**
     * @return Lens power measured in diopters (0.25 units).
     */
    public BigDecimal getSphere() {
        return this.sphere == null ? null : this.sphere.getValue();
    }

    /**
     * @param value Lens power measured in diopters (0.25 units).
     */
    public VisionPrescriptionDispenseComponent setSphere(BigDecimal value) {
        if (value == null)
            this.sphere = null;
        else {
            if (this.sphere == null)
                this.sphere = new DecimalType();
            this.sphere.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #cylinder} (Power adjustment for astigmatism measured in diopters (0.25 units).). This is the underlying object with id, value and extensions. The accessor "getCylinder" gives direct access to the value
     */
    public DecimalType getCylinderElement() {
        if (this.cylinder == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.cylinder");
            else if (Configuration.doAutoCreate())
                // bb
                this.cylinder = new DecimalType();
        return this.cylinder;
    }

    public boolean hasCylinderElement() {
        return this.cylinder != null && !this.cylinder.isEmpty();
    }

    public boolean hasCylinder() {
        return this.cylinder != null && !this.cylinder.isEmpty();
    }

    /**
     * @param value {@link #cylinder} (Power adjustment for astigmatism measured in diopters (0.25 units).). This is the underlying object with id, value and extensions. The accessor "getCylinder" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setCylinderElement(DecimalType value) {
        this.cylinder = value;
        return this;
    }

    /**
     * @return Power adjustment for astigmatism measured in diopters (0.25 units).
     */
    public BigDecimal getCylinder() {
        return this.cylinder == null ? null : this.cylinder.getValue();
    }

    /**
     * @param value Power adjustment for astigmatism measured in diopters (0.25 units).
     */
    public VisionPrescriptionDispenseComponent setCylinder(BigDecimal value) {
        if (value == null)
            this.cylinder = null;
        else {
            if (this.cylinder == null)
                this.cylinder = new DecimalType();
            this.cylinder.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #axis} (Adjustment for astigmatism measured in integer degrees.). This is the underlying object with id, value and extensions. The accessor "getAxis" gives direct access to the value
     */
    public IntegerType getAxisElement() {
        if (this.axis == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.axis");
            else if (Configuration.doAutoCreate())
                // bb
                this.axis = new IntegerType();
        return this.axis;
    }

    public boolean hasAxisElement() {
        return this.axis != null && !this.axis.isEmpty();
    }

    public boolean hasAxis() {
        return this.axis != null && !this.axis.isEmpty();
    }

    /**
     * @param value {@link #axis} (Adjustment for astigmatism measured in integer degrees.). This is the underlying object with id, value and extensions. The accessor "getAxis" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setAxisElement(IntegerType value) {
        this.axis = value;
        return this;
    }

    /**
     * @return Adjustment for astigmatism measured in integer degrees.
     */
    public int getAxis() {
        return this.axis == null || this.axis.isEmpty() ? 0 : this.axis.getValue();
    }

    /**
     * @param value Adjustment for astigmatism measured in integer degrees.
     */
    public VisionPrescriptionDispenseComponent setAxis(int value) {
        if (this.axis == null)
            this.axis = new IntegerType();
        this.axis.setValue(value);
        return this;
    }

    /**
     * @return {@link #prism} (Amount of prism to compensate for eye alignment in fractional units.). This is the underlying object with id, value and extensions. The accessor "getPrism" gives direct access to the value
     */
    public DecimalType getPrismElement() {
        if (this.prism == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.prism");
            else if (Configuration.doAutoCreate())
                // bb
                this.prism = new DecimalType();
        return this.prism;
    }

    public boolean hasPrismElement() {
        return this.prism != null && !this.prism.isEmpty();
    }

    public boolean hasPrism() {
        return this.prism != null && !this.prism.isEmpty();
    }

    /**
     * @param value {@link #prism} (Amount of prism to compensate for eye alignment in fractional units.). This is the underlying object with id, value and extensions. The accessor "getPrism" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setPrismElement(DecimalType value) {
        this.prism = value;
        return this;
    }

    /**
     * @return Amount of prism to compensate for eye alignment in fractional units.
     */
    public BigDecimal getPrism() {
        return this.prism == null ? null : this.prism.getValue();
    }

    /**
     * @param value Amount of prism to compensate for eye alignment in fractional units.
     */
    public VisionPrescriptionDispenseComponent setPrism(BigDecimal value) {
        if (value == null)
            this.prism = null;
        else {
            if (this.prism == null)
                this.prism = new DecimalType();
            this.prism.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #base} (The relative base, or reference lens edge, for the prism.). This is the underlying object with id, value and extensions. The accessor "getBase" gives direct access to the value
     */
    public Enumeration<VisionBase> getBaseElement() {
        if (this.base == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.base");
            else if (Configuration.doAutoCreate())
                // bb
                this.base = new Enumeration<VisionBase>(new VisionBaseEnumFactory());
        return this.base;
    }

    public boolean hasBaseElement() {
        return this.base != null && !this.base.isEmpty();
    }

    public boolean hasBase() {
        return this.base != null && !this.base.isEmpty();
    }

    /**
     * @param value {@link #base} (The relative base, or reference lens edge, for the prism.). This is the underlying object with id, value and extensions. The accessor "getBase" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setBaseElement(Enumeration<VisionBase> value) {
        this.base = value;
        return this;
    }

    /**
     * @return The relative base, or reference lens edge, for the prism.
     */
    public VisionBase getBase() {
        return this.base == null ? null : this.base.getValue();
    }

    /**
     * @param value The relative base, or reference lens edge, for the prism.
     */
    public VisionPrescriptionDispenseComponent setBase(VisionBase value) {
        if (value == null)
            this.base = null;
        else {
            if (this.base == null)
                this.base = new Enumeration<VisionBase>(new VisionBaseEnumFactory());
            this.base.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #add} (Power adjustment for multifocal lenses measured in diopters (0.25 units).). This is the underlying object with id, value and extensions. The accessor "getAdd" gives direct access to the value
     */
    public DecimalType getAddElement() {
        if (this.add == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.add");
            else if (Configuration.doAutoCreate())
                // bb
                this.add = new DecimalType();
        return this.add;
    }

    public boolean hasAddElement() {
        return this.add != null && !this.add.isEmpty();
    }

    public boolean hasAdd() {
        return this.add != null && !this.add.isEmpty();
    }

    /**
     * @param value {@link #add} (Power adjustment for multifocal lenses measured in diopters (0.25 units).). This is the underlying object with id, value and extensions. The accessor "getAdd" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setAddElement(DecimalType value) {
        this.add = value;
        return this;
    }

    /**
     * @return Power adjustment for multifocal lenses measured in diopters (0.25 units).
     */
    public BigDecimal getAdd() {
        return this.add == null ? null : this.add.getValue();
    }

    /**
     * @param value Power adjustment for multifocal lenses measured in diopters (0.25 units).
     */
    public VisionPrescriptionDispenseComponent setAdd(BigDecimal value) {
        if (value == null)
            this.add = null;
        else {
            if (this.add == null)
                this.add = new DecimalType();
            this.add.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #power} (Contact lens power measured in diopters (0.25 units).). This is the underlying object with id, value and extensions. The accessor "getPower" gives direct access to the value
     */
    public DecimalType getPowerElement() {
        if (this.power == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.power");
            else if (Configuration.doAutoCreate())
                // bb
                this.power = new DecimalType();
        return this.power;
    }

    public boolean hasPowerElement() {
        return this.power != null && !this.power.isEmpty();
    }

    public boolean hasPower() {
        return this.power != null && !this.power.isEmpty();
    }

    /**
     * @param value {@link #power} (Contact lens power measured in diopters (0.25 units).). This is the underlying object with id, value and extensions. The accessor "getPower" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setPowerElement(DecimalType value) {
        this.power = value;
        return this;
    }

    /**
     * @return Contact lens power measured in diopters (0.25 units).
     */
    public BigDecimal getPower() {
        return this.power == null ? null : this.power.getValue();
    }

    /**
     * @param value Contact lens power measured in diopters (0.25 units).
     */
    public VisionPrescriptionDispenseComponent setPower(BigDecimal value) {
        if (value == null)
            this.power = null;
        else {
            if (this.power == null)
                this.power = new DecimalType();
            this.power.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #backCurve} (Back curvature measured in millimeters.). This is the underlying object with id, value and extensions. The accessor "getBackCurve" gives direct access to the value
     */
    public DecimalType getBackCurveElement() {
        if (this.backCurve == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.backCurve");
            else if (Configuration.doAutoCreate())
                // bb
                this.backCurve = new DecimalType();
        return this.backCurve;
    }

    public boolean hasBackCurveElement() {
        return this.backCurve != null && !this.backCurve.isEmpty();
    }

    public boolean hasBackCurve() {
        return this.backCurve != null && !this.backCurve.isEmpty();
    }

    /**
     * @param value {@link #backCurve} (Back curvature measured in millimeters.). This is the underlying object with id, value and extensions. The accessor "getBackCurve" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setBackCurveElement(DecimalType value) {
        this.backCurve = value;
        return this;
    }

    /**
     * @return Back curvature measured in millimeters.
     */
    public BigDecimal getBackCurve() {
        return this.backCurve == null ? null : this.backCurve.getValue();
    }

    /**
     * @param value Back curvature measured in millimeters.
     */
    public VisionPrescriptionDispenseComponent setBackCurve(BigDecimal value) {
        if (value == null)
            this.backCurve = null;
        else {
            if (this.backCurve == null)
                this.backCurve = new DecimalType();
            this.backCurve.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #diameter} (Contact lens diameter measured in millimeters.). This is the underlying object with id, value and extensions. The accessor "getDiameter" gives direct access to the value
     */
    public DecimalType getDiameterElement() {
        if (this.diameter == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.diameter");
            else if (Configuration.doAutoCreate())
                // bb
                this.diameter = new DecimalType();
        return this.diameter;
    }

    public boolean hasDiameterElement() {
        return this.diameter != null && !this.diameter.isEmpty();
    }

    public boolean hasDiameter() {
        return this.diameter != null && !this.diameter.isEmpty();
    }

    /**
     * @param value {@link #diameter} (Contact lens diameter measured in millimeters.). This is the underlying object with id, value and extensions. The accessor "getDiameter" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setDiameterElement(DecimalType value) {
        this.diameter = value;
        return this;
    }

    /**
     * @return Contact lens diameter measured in millimeters.
     */
    public BigDecimal getDiameter() {
        return this.diameter == null ? null : this.diameter.getValue();
    }

    /**
     * @param value Contact lens diameter measured in millimeters.
     */
    public VisionPrescriptionDispenseComponent setDiameter(BigDecimal value) {
        if (value == null)
            this.diameter = null;
        else {
            if (this.diameter == null)
                this.diameter = new DecimalType();
            this.diameter.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #duration} (The recommended maximum wear period for the lens.)
     */
    public SimpleQuantity getDuration() {
        if (this.duration == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.duration");
            else if (Configuration.doAutoCreate())
                // cc
                this.duration = new SimpleQuantity();
        return this.duration;
    }

    public boolean hasDuration() {
        return this.duration != null && !this.duration.isEmpty();
    }

    /**
     * @param value {@link #duration} (The recommended maximum wear period for the lens.)
     */
    public VisionPrescriptionDispenseComponent setDuration(SimpleQuantity value) {
        this.duration = value;
        return this;
    }

    /**
     * @return {@link #color} (Special color or pattern.). This is the underlying object with id, value and extensions. The accessor "getColor" gives direct access to the value
     */
    public StringType getColorElement() {
        if (this.color == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.color");
            else if (Configuration.doAutoCreate())
                // bb
                this.color = new StringType();
        return this.color;
    }

    public boolean hasColorElement() {
        return this.color != null && !this.color.isEmpty();
    }

    public boolean hasColor() {
        return this.color != null && !this.color.isEmpty();
    }

    /**
     * @param value {@link #color} (Special color or pattern.). This is the underlying object with id, value and extensions. The accessor "getColor" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setColorElement(StringType value) {
        this.color = value;
        return this;
    }

    /**
     * @return Special color or pattern.
     */
    public String getColor() {
        return this.color == null ? null : this.color.getValue();
    }

    /**
     * @param value Special color or pattern.
     */
    public VisionPrescriptionDispenseComponent setColor(String value) {
        if (Utilities.noString(value))
            this.color = null;
        else {
            if (this.color == null)
                this.color = new StringType();
            this.color.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #brand} (Brand recommendations or restrictions.). This is the underlying object with id, value and extensions. The accessor "getBrand" gives direct access to the value
     */
    public StringType getBrandElement() {
        if (this.brand == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.brand");
            else if (Configuration.doAutoCreate())
                // bb
                this.brand = new StringType();
        return this.brand;
    }

    public boolean hasBrandElement() {
        return this.brand != null && !this.brand.isEmpty();
    }

    public boolean hasBrand() {
        return this.brand != null && !this.brand.isEmpty();
    }

    /**
     * @param value {@link #brand} (Brand recommendations or restrictions.). This is the underlying object with id, value and extensions. The accessor "getBrand" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setBrandElement(StringType value) {
        this.brand = value;
        return this;
    }

    /**
     * @return Brand recommendations or restrictions.
     */
    public String getBrand() {
        return this.brand == null ? null : this.brand.getValue();
    }

    /**
     * @param value Brand recommendations or restrictions.
     */
    public VisionPrescriptionDispenseComponent setBrand(String value) {
        if (Utilities.noString(value))
            this.brand = null;
        else {
            if (this.brand == null)
                this.brand = new StringType();
            this.brand.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #notes} (Notes for special requirements such as coatings and lens materials.). This is the underlying object with id, value and extensions. The accessor "getNotes" gives direct access to the value
     */
    public StringType getNotesElement() {
        if (this.notes == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create VisionPrescriptionDispenseComponent.notes");
            else if (Configuration.doAutoCreate())
                // bb
                this.notes = new StringType();
        return this.notes;
    }

    public boolean hasNotesElement() {
        return this.notes != null && !this.notes.isEmpty();
    }

    public boolean hasNotes() {
        return this.notes != null && !this.notes.isEmpty();
    }

    /**
     * @param value {@link #notes} (Notes for special requirements such as coatings and lens materials.). This is the underlying object with id, value and extensions. The accessor "getNotes" gives direct access to the value
     */
    public VisionPrescriptionDispenseComponent setNotesElement(StringType value) {
        this.notes = value;
        return this;
    }

    /**
     * @return Notes for special requirements such as coatings and lens materials.
     */
    public String getNotes() {
        return this.notes == null ? null : this.notes.getValue();
    }

    /**
     * @param value Notes for special requirements such as coatings and lens materials.
     */
    public VisionPrescriptionDispenseComponent setNotes(String value) {
        if (Utilities.noString(value))
            this.notes = null;
        else {
            if (this.notes == null)
                this.notes = new StringType();
            this.notes.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("product", "Coding", "Identifies the type of vision correction product which is required for the patient.", 0, java.lang.Integer.MAX_VALUE, product));
        childrenList.add(new Property("eye", "code", "The eye for which the lens applies.", 0, java.lang.Integer.MAX_VALUE, eye));
        childrenList.add(new Property("sphere", "decimal", "Lens power measured in diopters (0.25 units).", 0, java.lang.Integer.MAX_VALUE, sphere));
        childrenList.add(new Property("cylinder", "decimal", "Power adjustment for astigmatism measured in diopters (0.25 units).", 0, java.lang.Integer.MAX_VALUE, cylinder));
        childrenList.add(new Property("axis", "integer", "Adjustment for astigmatism measured in integer degrees.", 0, java.lang.Integer.MAX_VALUE, axis));
        childrenList.add(new Property("prism", "decimal", "Amount of prism to compensate for eye alignment in fractional units.", 0, java.lang.Integer.MAX_VALUE, prism));
        childrenList.add(new Property("base", "code", "The relative base, or reference lens edge, for the prism.", 0, java.lang.Integer.MAX_VALUE, base));
        childrenList.add(new Property("add", "decimal", "Power adjustment for multifocal lenses measured in diopters (0.25 units).", 0, java.lang.Integer.MAX_VALUE, add));
        childrenList.add(new Property("power", "decimal", "Contact lens power measured in diopters (0.25 units).", 0, java.lang.Integer.MAX_VALUE, power));
        childrenList.add(new Property("backCurve", "decimal", "Back curvature measured in millimeters.", 0, java.lang.Integer.MAX_VALUE, backCurve));
        childrenList.add(new Property("diameter", "decimal", "Contact lens diameter measured in millimeters.", 0, java.lang.Integer.MAX_VALUE, diameter));
        childrenList.add(new Property("duration", "SimpleQuantity", "The recommended maximum wear period for the lens.", 0, java.lang.Integer.MAX_VALUE, duration));
        childrenList.add(new Property("color", "string", "Special color or pattern.", 0, java.lang.Integer.MAX_VALUE, color));
        childrenList.add(new Property("brand", "string", "Brand recommendations or restrictions.", 0, java.lang.Integer.MAX_VALUE, brand));
        childrenList.add(new Property("notes", "string", "Notes for special requirements such as coatings and lens materials.", 0, java.lang.Integer.MAX_VALUE, notes));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("product"))
            // Coding
            this.product = castToCoding(value);
        else if (name.equals("eye"))
            // Enumeration<VisionEyes>
            this.eye = new VisionEyesEnumFactory().fromType(value);
        else if (name.equals("sphere"))
            // DecimalType
            this.sphere = castToDecimal(value);
        else if (name.equals("cylinder"))
            // DecimalType
            this.cylinder = castToDecimal(value);
        else if (name.equals("axis"))
            // IntegerType
            this.axis = castToInteger(value);
        else if (name.equals("prism"))
            // DecimalType
            this.prism = castToDecimal(value);
        else if (name.equals("base"))
            // Enumeration<VisionBase>
            this.base = new VisionBaseEnumFactory().fromType(value);
        else if (name.equals("add"))
            // DecimalType
            this.add = castToDecimal(value);
        else if (name.equals("power"))
            // DecimalType
            this.power = castToDecimal(value);
        else if (name.equals("backCurve"))
            // DecimalType
            this.backCurve = castToDecimal(value);
        else if (name.equals("diameter"))
            // DecimalType
            this.diameter = castToDecimal(value);
        else if (name.equals("duration"))
            // SimpleQuantity
            this.duration = castToSimpleQuantity(value);
        else if (name.equals("color"))
            // StringType
            this.color = castToString(value);
        else if (name.equals("brand"))
            // StringType
            this.brand = castToString(value);
        else if (name.equals("notes"))
            // StringType
            this.notes = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("product")) {
            this.product = new Coding();
            return this.product;
        } else if (name.equals("eye")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.eye");
        } else if (name.equals("sphere")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.sphere");
        } else if (name.equals("cylinder")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.cylinder");
        } else if (name.equals("axis")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.axis");
        } else if (name.equals("prism")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.prism");
        } else if (name.equals("base")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.base");
        } else if (name.equals("add")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.add");
        } else if (name.equals("power")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.power");
        } else if (name.equals("backCurve")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.backCurve");
        } else if (name.equals("diameter")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.diameter");
        } else if (name.equals("duration")) {
            this.duration = new SimpleQuantity();
            return this.duration;
        } else if (name.equals("color")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.color");
        } else if (name.equals("brand")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.brand");
        } else if (name.equals("notes")) {
            throw new FHIRException("Cannot call addChild on a primitive type VisionPrescription.notes");
        } else
            return super.addChild(name);
    }

    public VisionPrescriptionDispenseComponent copy() {
        VisionPrescriptionDispenseComponent dst = new VisionPrescriptionDispenseComponent();
        copyValues(dst);
        dst.product = product == null ? null : product.copy();
        dst.eye = eye == null ? null : eye.copy();
        dst.sphere = sphere == null ? null : sphere.copy();
        dst.cylinder = cylinder == null ? null : cylinder.copy();
        dst.axis = axis == null ? null : axis.copy();
        dst.prism = prism == null ? null : prism.copy();
        dst.base = base == null ? null : base.copy();
        dst.add = add == null ? null : add.copy();
        dst.power = power == null ? null : power.copy();
        dst.backCurve = backCurve == null ? null : backCurve.copy();
        dst.diameter = diameter == null ? null : diameter.copy();
        dst.duration = duration == null ? null : duration.copy();
        dst.color = color == null ? null : color.copy();
        dst.brand = brand == null ? null : brand.copy();
        dst.notes = notes == null ? null : notes.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof VisionPrescriptionDispenseComponent))
            return false;
        VisionPrescriptionDispenseComponent o = (VisionPrescriptionDispenseComponent) other;
        return compareDeep(product, o.product, true) && compareDeep(eye, o.eye, true) && compareDeep(sphere, o.sphere, true) && compareDeep(cylinder, o.cylinder, true) && compareDeep(axis, o.axis, true) && compareDeep(prism, o.prism, true) && compareDeep(base, o.base, true) && compareDeep(add, o.add, true) && compareDeep(power, o.power, true) && compareDeep(backCurve, o.backCurve, true) && compareDeep(diameter, o.diameter, true) && compareDeep(duration, o.duration, true) && compareDeep(color, o.color, true) && compareDeep(brand, o.brand, true) && compareDeep(notes, o.notes, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof VisionPrescriptionDispenseComponent))
            return false;
        VisionPrescriptionDispenseComponent o = (VisionPrescriptionDispenseComponent) other;
        return compareValues(eye, o.eye, true) && compareValues(sphere, o.sphere, true) && compareValues(cylinder, o.cylinder, true) && compareValues(axis, o.axis, true) && compareValues(prism, o.prism, true) && compareValues(base, o.base, true) && compareValues(add, o.add, true) && compareValues(power, o.power, true) && compareValues(backCurve, o.backCurve, true) && compareValues(diameter, o.diameter, true) && compareValues(color, o.color, true) && compareValues(brand, o.brand, true) && compareValues(notes, o.notes, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (product == null || product.isEmpty()) && (eye == null || eye.isEmpty()) && (sphere == null || sphere.isEmpty()) && (cylinder == null || cylinder.isEmpty()) && (axis == null || axis.isEmpty()) && (prism == null || prism.isEmpty()) && (base == null || base.isEmpty()) && (add == null || add.isEmpty()) && (power == null || power.isEmpty()) && (backCurve == null || backCurve.isEmpty()) && (diameter == null || diameter.isEmpty()) && (duration == null || duration.isEmpty()) && (color == null || color.isEmpty()) && (brand == null || brand.isEmpty()) && (notes == null || notes.isEmpty());
    }

    public String fhirType() {
        return "VisionPrescription.dispense";
    }
}
