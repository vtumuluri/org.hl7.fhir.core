package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class ImmunizationVaccinationProtocolComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Nominal position in a series.
     */
    protected PositiveIntType doseSequence;

    /**
     * Contains the description about the protocol under which the vaccine was administered.
     */
    protected StringType description;

    /**
     * Indicates the authority who published the protocol.  E.g. ACIP.
     */
    protected Reference authority;

    /**
     * The actual object that is the target of the reference (Indicates the authority who published the protocol.  E.g. ACIP.)
     */
    protected Organization authorityTarget;

    /**
     * One possible path to achieve presumed immunity against a disease - within the context of an authority.
     */
    protected StringType series;

    /**
     * The recommended number of doses to achieve immunity.
     */
    protected PositiveIntType seriesDoses;

    /**
     * The targeted disease.
     */
    protected List<CodeableConcept> targetDisease;

    /**
     * Indicates if the immunization event should "count" against  the protocol.
     */
    protected CodeableConcept doseStatus;

    /**
     * Provides an explanation as to why an immunization event should or should not count against the protocol.
     */
    protected CodeableConcept doseStatusReason;

    private static final long serialVersionUID = 386814037L;

    /*
     * Constructor
     */
    public ImmunizationVaccinationProtocolComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ImmunizationVaccinationProtocolComponent(PositiveIntType doseSequence, CodeableConcept doseStatus) {
        super();
        this.doseSequence = doseSequence;
        this.doseStatus = doseStatus;
    }

    /**
     * @return {@link #doseSequence} (Nominal position in a series.). This is the underlying object with id, value and extensions. The accessor "getDoseSequence" gives direct access to the value
     */
    public PositiveIntType getDoseSequenceElement() {
        if (this.doseSequence == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.doseSequence");
            else if (Configuration.doAutoCreate())
                // bb
                this.doseSequence = new PositiveIntType();
        return this.doseSequence;
    }

    public boolean hasDoseSequenceElement() {
        return this.doseSequence != null && !this.doseSequence.isEmpty();
    }

    public boolean hasDoseSequence() {
        return this.doseSequence != null && !this.doseSequence.isEmpty();
    }

    /**
     * @param value {@link #doseSequence} (Nominal position in a series.). This is the underlying object with id, value and extensions. The accessor "getDoseSequence" gives direct access to the value
     */
    public ImmunizationVaccinationProtocolComponent setDoseSequenceElement(PositiveIntType value) {
        this.doseSequence = value;
        return this;
    }

    /**
     * @return Nominal position in a series.
     */
    public int getDoseSequence() {
        return this.doseSequence == null || this.doseSequence.isEmpty() ? 0 : this.doseSequence.getValue();
    }

    /**
     * @param value Nominal position in a series.
     */
    public ImmunizationVaccinationProtocolComponent setDoseSequence(int value) {
        if (this.doseSequence == null)
            this.doseSequence = new PositiveIntType();
        this.doseSequence.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (Contains the description about the protocol under which the vaccine was administered.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.description");
            else if (Configuration.doAutoCreate())
                // bb
                this.description = new StringType();
        return this.description;
    }

    public boolean hasDescriptionElement() {
        return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Contains the description about the protocol under which the vaccine was administered.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ImmunizationVaccinationProtocolComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Contains the description about the protocol under which the vaccine was administered.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Contains the description about the protocol under which the vaccine was administered.
     */
    public ImmunizationVaccinationProtocolComponent setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #authority} (Indicates the authority who published the protocol.  E.g. ACIP.)
     */
    public Reference getAuthority() {
        if (this.authority == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.authority");
            else if (Configuration.doAutoCreate())
                // cc
                this.authority = new Reference();
        return this.authority;
    }

    public boolean hasAuthority() {
        return this.authority != null && !this.authority.isEmpty();
    }

    /**
     * @param value {@link #authority} (Indicates the authority who published the protocol.  E.g. ACIP.)
     */
    public ImmunizationVaccinationProtocolComponent setAuthority(Reference value) {
        this.authority = value;
        return this;
    }

    /**
     * @return {@link #authority} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Indicates the authority who published the protocol.  E.g. ACIP.)
     */
    public Organization getAuthorityTarget() {
        if (this.authorityTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.authority");
            else if (Configuration.doAutoCreate())
                // aa
                this.authorityTarget = new Organization();
        return this.authorityTarget;
    }

    /**
     * @param value {@link #authority} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Indicates the authority who published the protocol.  E.g. ACIP.)
     */
    public ImmunizationVaccinationProtocolComponent setAuthorityTarget(Organization value) {
        this.authorityTarget = value;
        return this;
    }

    /**
     * @return {@link #series} (One possible path to achieve presumed immunity against a disease - within the context of an authority.). This is the underlying object with id, value and extensions. The accessor "getSeries" gives direct access to the value
     */
    public StringType getSeriesElement() {
        if (this.series == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.series");
            else if (Configuration.doAutoCreate())
                // bb
                this.series = new StringType();
        return this.series;
    }

    public boolean hasSeriesElement() {
        return this.series != null && !this.series.isEmpty();
    }

    public boolean hasSeries() {
        return this.series != null && !this.series.isEmpty();
    }

    /**
     * @param value {@link #series} (One possible path to achieve presumed immunity against a disease - within the context of an authority.). This is the underlying object with id, value and extensions. The accessor "getSeries" gives direct access to the value
     */
    public ImmunizationVaccinationProtocolComponent setSeriesElement(StringType value) {
        this.series = value;
        return this;
    }

    /**
     * @return One possible path to achieve presumed immunity against a disease - within the context of an authority.
     */
    public String getSeries() {
        return this.series == null ? null : this.series.getValue();
    }

    /**
     * @param value One possible path to achieve presumed immunity against a disease - within the context of an authority.
     */
    public ImmunizationVaccinationProtocolComponent setSeries(String value) {
        if (Utilities.noString(value))
            this.series = null;
        else {
            if (this.series == null)
                this.series = new StringType();
            this.series.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #seriesDoses} (The recommended number of doses to achieve immunity.). This is the underlying object with id, value and extensions. The accessor "getSeriesDoses" gives direct access to the value
     */
    public PositiveIntType getSeriesDosesElement() {
        if (this.seriesDoses == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.seriesDoses");
            else if (Configuration.doAutoCreate())
                // bb
                this.seriesDoses = new PositiveIntType();
        return this.seriesDoses;
    }

    public boolean hasSeriesDosesElement() {
        return this.seriesDoses != null && !this.seriesDoses.isEmpty();
    }

    public boolean hasSeriesDoses() {
        return this.seriesDoses != null && !this.seriesDoses.isEmpty();
    }

    /**
     * @param value {@link #seriesDoses} (The recommended number of doses to achieve immunity.). This is the underlying object with id, value and extensions. The accessor "getSeriesDoses" gives direct access to the value
     */
    public ImmunizationVaccinationProtocolComponent setSeriesDosesElement(PositiveIntType value) {
        this.seriesDoses = value;
        return this;
    }

    /**
     * @return The recommended number of doses to achieve immunity.
     */
    public int getSeriesDoses() {
        return this.seriesDoses == null || this.seriesDoses.isEmpty() ? 0 : this.seriesDoses.getValue();
    }

    /**
     * @param value The recommended number of doses to achieve immunity.
     */
    public ImmunizationVaccinationProtocolComponent setSeriesDoses(int value) {
        if (this.seriesDoses == null)
            this.seriesDoses = new PositiveIntType();
        this.seriesDoses.setValue(value);
        return this;
    }

    /**
     * @return {@link #targetDisease} (The targeted disease.)
     */
    public List<CodeableConcept> getTargetDisease() {
        if (this.targetDisease == null)
            this.targetDisease = new ArrayList<CodeableConcept>();
        return this.targetDisease;
    }

    public boolean hasTargetDisease() {
        if (this.targetDisease == null)
            return false;
        for (CodeableConcept item : this.targetDisease) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addTargetDisease() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.targetDisease == null)
            this.targetDisease = new ArrayList<CodeableConcept>();
        this.targetDisease.add(t);
        return t;
    }

    // syntactic sugar
    public ImmunizationVaccinationProtocolComponent addTargetDisease(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.targetDisease == null)
            this.targetDisease = new ArrayList<CodeableConcept>();
        this.targetDisease.add(t);
        return this;
    }

    /**
     * @return {@link #doseStatus} (Indicates if the immunization event should "count" against  the protocol.)
     */
    public CodeableConcept getDoseStatus() {
        if (this.doseStatus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.doseStatus");
            else if (Configuration.doAutoCreate())
                // cc
                this.doseStatus = new CodeableConcept();
        return this.doseStatus;
    }

    public boolean hasDoseStatus() {
        return this.doseStatus != null && !this.doseStatus.isEmpty();
    }

    /**
     * @param value {@link #doseStatus} (Indicates if the immunization event should "count" against  the protocol.)
     */
    public ImmunizationVaccinationProtocolComponent setDoseStatus(CodeableConcept value) {
        this.doseStatus = value;
        return this;
    }

    /**
     * @return {@link #doseStatusReason} (Provides an explanation as to why an immunization event should or should not count against the protocol.)
     */
    public CodeableConcept getDoseStatusReason() {
        if (this.doseStatusReason == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationVaccinationProtocolComponent.doseStatusReason");
            else if (Configuration.doAutoCreate())
                // cc
                this.doseStatusReason = new CodeableConcept();
        return this.doseStatusReason;
    }

    public boolean hasDoseStatusReason() {
        return this.doseStatusReason != null && !this.doseStatusReason.isEmpty();
    }

    /**
     * @param value {@link #doseStatusReason} (Provides an explanation as to why an immunization event should or should not count against the protocol.)
     */
    public ImmunizationVaccinationProtocolComponent setDoseStatusReason(CodeableConcept value) {
        this.doseStatusReason = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("doseSequence", "positiveInt", "Nominal position in a series.", 0, java.lang.Integer.MAX_VALUE, doseSequence));
        childrenList.add(new Property("description", "string", "Contains the description about the protocol under which the vaccine was administered.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("authority", "Reference(Organization)", "Indicates the authority who published the protocol.  E.g. ACIP.", 0, java.lang.Integer.MAX_VALUE, authority));
        childrenList.add(new Property("series", "string", "One possible path to achieve presumed immunity against a disease - within the context of an authority.", 0, java.lang.Integer.MAX_VALUE, series));
        childrenList.add(new Property("seriesDoses", "positiveInt", "The recommended number of doses to achieve immunity.", 0, java.lang.Integer.MAX_VALUE, seriesDoses));
        childrenList.add(new Property("targetDisease", "CodeableConcept", "The targeted disease.", 0, java.lang.Integer.MAX_VALUE, targetDisease));
        childrenList.add(new Property("doseStatus", "CodeableConcept", "Indicates if the immunization event should \"count\" against  the protocol.", 0, java.lang.Integer.MAX_VALUE, doseStatus));
        childrenList.add(new Property("doseStatusReason", "CodeableConcept", "Provides an explanation as to why an immunization event should or should not count against the protocol.", 0, java.lang.Integer.MAX_VALUE, doseStatusReason));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("doseSequence"))
            // PositiveIntType
            this.doseSequence = castToPositiveInt(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("authority"))
            // Reference
            this.authority = castToReference(value);
        else if (name.equals("series"))
            // StringType
            this.series = castToString(value);
        else if (name.equals("seriesDoses"))
            // PositiveIntType
            this.seriesDoses = castToPositiveInt(value);
        else if (name.equals("targetDisease"))
            this.getTargetDisease().add(castToCodeableConcept(value));
        else if (name.equals("doseStatus"))
            // CodeableConcept
            this.doseStatus = castToCodeableConcept(value);
        else if (name.equals("doseStatusReason"))
            // CodeableConcept
            this.doseStatusReason = castToCodeableConcept(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("doseSequence")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.doseSequence");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.description");
        } else if (name.equals("authority")) {
            this.authority = new Reference();
            return this.authority;
        } else if (name.equals("series")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.series");
        } else if (name.equals("seriesDoses")) {
            throw new FHIRException("Cannot call addChild on a primitive type Immunization.seriesDoses");
        } else if (name.equals("targetDisease")) {
            return addTargetDisease();
        } else if (name.equals("doseStatus")) {
            this.doseStatus = new CodeableConcept();
            return this.doseStatus;
        } else if (name.equals("doseStatusReason")) {
            this.doseStatusReason = new CodeableConcept();
            return this.doseStatusReason;
        } else
            return super.addChild(name);
    }

    public ImmunizationVaccinationProtocolComponent copy() {
        ImmunizationVaccinationProtocolComponent dst = new ImmunizationVaccinationProtocolComponent();
        copyValues(dst);
        dst.doseSequence = doseSequence == null ? null : doseSequence.copy();
        dst.description = description == null ? null : description.copy();
        dst.authority = authority == null ? null : authority.copy();
        dst.series = series == null ? null : series.copy();
        dst.seriesDoses = seriesDoses == null ? null : seriesDoses.copy();
        if (targetDisease != null) {
            dst.targetDisease = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : targetDisease) dst.targetDisease.add(i.copy());
        }
        ;
        dst.doseStatus = doseStatus == null ? null : doseStatus.copy();
        dst.doseStatusReason = doseStatusReason == null ? null : doseStatusReason.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImmunizationVaccinationProtocolComponent))
            return false;
        ImmunizationVaccinationProtocolComponent o = (ImmunizationVaccinationProtocolComponent) other;
        return compareDeep(doseSequence, o.doseSequence, true) && compareDeep(description, o.description, true) && compareDeep(authority, o.authority, true) && compareDeep(series, o.series, true) && compareDeep(seriesDoses, o.seriesDoses, true) && compareDeep(targetDisease, o.targetDisease, true) && compareDeep(doseStatus, o.doseStatus, true) && compareDeep(doseStatusReason, o.doseStatusReason, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImmunizationVaccinationProtocolComponent))
            return false;
        ImmunizationVaccinationProtocolComponent o = (ImmunizationVaccinationProtocolComponent) other;
        return compareValues(doseSequence, o.doseSequence, true) && compareValues(description, o.description, true) && compareValues(series, o.series, true) && compareValues(seriesDoses, o.seriesDoses, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (doseSequence == null || doseSequence.isEmpty()) && (description == null || description.isEmpty()) && (authority == null || authority.isEmpty()) && (series == null || series.isEmpty()) && (seriesDoses == null || seriesDoses.isEmpty()) && (targetDisease == null || targetDisease.isEmpty()) && (doseStatus == null || doseStatus.isEmpty()) && (doseStatusReason == null || doseStatusReason.isEmpty());
    }

    public String fhirType() {
        return "Immunization.vaccinationProtocol";
    }
}
