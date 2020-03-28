package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class ImmunizationReactionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Date of reaction to the immunization.
     */
    protected DateTimeType date;

    /**
     * Details of the reaction.
     */
    protected Reference detail;

    /**
     * The actual object that is the target of the reference (Details of the reaction.)
     */
    protected Observation detailTarget;

    /**
     * Self-reported indicator.
     */
    protected BooleanType reported;

    private static final long serialVersionUID = -1297668556L;

    /*
     * Constructor
     */
    public ImmunizationReactionComponent() {
        super();
    }

    /**
     * @return {@link #date} (Date of reaction to the immunization.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationReactionComponent.date");
            else if (Configuration.doAutoCreate())
                // bb
                this.date = new DateTimeType();
        return this.date;
    }

    public boolean hasDateElement() {
        return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() {
        return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (Date of reaction to the immunization.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ImmunizationReactionComponent setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return Date of reaction to the immunization.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value Date of reaction to the immunization.
     */
    public ImmunizationReactionComponent setDate(Date value) {
        if (value == null)
            this.date = null;
        else {
            if (this.date == null)
                this.date = new DateTimeType();
            this.date.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #detail} (Details of the reaction.)
     */
    public Reference getDetail() {
        if (this.detail == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationReactionComponent.detail");
            else if (Configuration.doAutoCreate())
                // cc
                this.detail = new Reference();
        return this.detail;
    }

    public boolean hasDetail() {
        return this.detail != null && !this.detail.isEmpty();
    }

    /**
     * @param value {@link #detail} (Details of the reaction.)
     */
    public ImmunizationReactionComponent setDetail(Reference value) {
        this.detail = value;
        return this;
    }

    /**
     * @return {@link #detail} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Details of the reaction.)
     */
    public Observation getDetailTarget() {
        if (this.detailTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationReactionComponent.detail");
            else if (Configuration.doAutoCreate())
                // aa
                this.detailTarget = new Observation();
        return this.detailTarget;
    }

    /**
     * @param value {@link #detail} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Details of the reaction.)
     */
    public ImmunizationReactionComponent setDetailTarget(Observation value) {
        this.detailTarget = value;
        return this;
    }

    /**
     * @return {@link #reported} (Self-reported indicator.). This is the underlying object with id, value and extensions. The accessor "getReported" gives direct access to the value
     */
    public BooleanType getReportedElement() {
        if (this.reported == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationReactionComponent.reported");
            else if (Configuration.doAutoCreate())
                // bb
                this.reported = new BooleanType();
        return this.reported;
    }

    public boolean hasReportedElement() {
        return this.reported != null && !this.reported.isEmpty();
    }

    public boolean hasReported() {
        return this.reported != null && !this.reported.isEmpty();
    }

    /**
     * @param value {@link #reported} (Self-reported indicator.). This is the underlying object with id, value and extensions. The accessor "getReported" gives direct access to the value
     */
    public ImmunizationReactionComponent setReportedElement(BooleanType value) {
        this.reported = value;
        return this;
    }

    /**
     * @return Self-reported indicator.
     */
    public boolean getReported() {
        return this.reported == null || this.reported.isEmpty() ? false : this.reported.getValue();
    }

    /**
     * @param value Self-reported indicator.
     */
    public ImmunizationReactionComponent setReported(boolean value) {
        if (this.reported == null)
            this.reported = new BooleanType();
        this.reported.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("date", "dateTime", "Date of reaction to the immunization.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("detail", "Reference(Observation)", "Details of the reaction.", 0, java.lang.Integer.MAX_VALUE, detail));
        childrenList.add(new Property("reported", "boolean", "Self-reported indicator.", 0, java.lang.Integer.MAX_VALUE, reported));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("detail"))
            // Reference
            this.detail = castToReference(value);
        else if (name.equals("reported"))
            // BooleanType
            this.reported = castToBoolean(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.date");
        } else if (name.equals("detail")) {
            this.detail = new Reference();
            return this.detail;
        } else if (name.equals("reported")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.reported");
        } else
            return super.addChild(name);
    }

    public ImmunizationReactionComponent copy() {
        ImmunizationReactionComponent dst = new ImmunizationReactionComponent();
        copyValues(dst);
        dst.date = date == null ? null : date.copy();
        dst.detail = detail == null ? null : detail.copy();
        dst.reported = reported == null ? null : reported.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImmunizationReactionComponent))
            return false;
        ImmunizationReactionComponent o = (ImmunizationReactionComponent) other;
        return compareDeep(date, o.date, true) && compareDeep(detail, o.detail, true) && compareDeep(reported, o.reported, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImmunizationReactionComponent))
            return false;
        ImmunizationReactionComponent o = (ImmunizationReactionComponent) other;
        return compareValues(date, o.date, true) && compareValues(reported, o.reported, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (date == null || date.isEmpty()) && (detail == null || detail.isEmpty()) && (reported == null || reported.isEmpty());
    }

    public String fhirType() {
        return "Immunization.reaction";
    }
}
