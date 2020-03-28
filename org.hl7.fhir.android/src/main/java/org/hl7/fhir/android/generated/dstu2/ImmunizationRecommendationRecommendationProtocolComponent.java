package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class ImmunizationRecommendationRecommendationProtocolComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
     */
    protected IntegerType doseSequence;

    /**
     * Contains the description about the protocol under which the vaccine was administered.
     */
    protected StringType description;

    /**
     * Indicates the authority who published the protocol.  For example, ACIP.
     */
    protected Reference authority;

    /**
     * The actual object that is the target of the reference (Indicates the authority who published the protocol.  For example, ACIP.)
     */
    protected Organization authorityTarget;

    /**
     * One possible path to achieve presumed immunity against a disease - within the context of an authority.
     */
    protected StringType series;

    private static final long serialVersionUID = -512702014L;

    /*
     * Constructor
     */
    public ImmunizationRecommendationRecommendationProtocolComponent() {
        super();
    }

    /**
     * @return {@link #doseSequence} (Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.). This is the underlying object with id, value and extensions. The accessor "getDoseSequence" gives direct access to the value
     */
    public IntegerType getDoseSequenceElement() {
        if (this.doseSequence == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationProtocolComponent.doseSequence");
            else if (Configuration.doAutoCreate())
                // bb
                this.doseSequence = new IntegerType();
        return this.doseSequence;
    }

    public boolean hasDoseSequenceElement() {
        return this.doseSequence != null && !this.doseSequence.isEmpty();
    }

    public boolean hasDoseSequence() {
        return this.doseSequence != null && !this.doseSequence.isEmpty();
    }

    /**
     * @param value {@link #doseSequence} (Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.). This is the underlying object with id, value and extensions. The accessor "getDoseSequence" gives direct access to the value
     */
    public ImmunizationRecommendationRecommendationProtocolComponent setDoseSequenceElement(IntegerType value) {
        this.doseSequence = value;
        return this;
    }

    /**
     * @return Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
     */
    public int getDoseSequence() {
        return this.doseSequence == null || this.doseSequence.isEmpty() ? 0 : this.doseSequence.getValue();
    }

    /**
     * @param value Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
     */
    public ImmunizationRecommendationRecommendationProtocolComponent setDoseSequence(int value) {
        if (this.doseSequence == null)
            this.doseSequence = new IntegerType();
        this.doseSequence.setValue(value);
        return this;
    }

    /**
     * @return {@link #description} (Contains the description about the protocol under which the vaccine was administered.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationProtocolComponent.description");
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
    public ImmunizationRecommendationRecommendationProtocolComponent setDescriptionElement(StringType value) {
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
    public ImmunizationRecommendationRecommendationProtocolComponent setDescription(String value) {
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
     * @return {@link #authority} (Indicates the authority who published the protocol.  For example, ACIP.)
     */
    public Reference getAuthority() {
        if (this.authority == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationProtocolComponent.authority");
            else if (Configuration.doAutoCreate())
                // cc
                this.authority = new Reference();
        return this.authority;
    }

    public boolean hasAuthority() {
        return this.authority != null && !this.authority.isEmpty();
    }

    /**
     * @param value {@link #authority} (Indicates the authority who published the protocol.  For example, ACIP.)
     */
    public ImmunizationRecommendationRecommendationProtocolComponent setAuthority(Reference value) {
        this.authority = value;
        return this;
    }

    /**
     * @return {@link #authority} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Indicates the authority who published the protocol.  For example, ACIP.)
     */
    public Organization getAuthorityTarget() {
        if (this.authorityTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationProtocolComponent.authority");
            else if (Configuration.doAutoCreate())
                // aa
                this.authorityTarget = new Organization();
        return this.authorityTarget;
    }

    /**
     * @param value {@link #authority} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Indicates the authority who published the protocol.  For example, ACIP.)
     */
    public ImmunizationRecommendationRecommendationProtocolComponent setAuthorityTarget(Organization value) {
        this.authorityTarget = value;
        return this;
    }

    /**
     * @return {@link #series} (One possible path to achieve presumed immunity against a disease - within the context of an authority.). This is the underlying object with id, value and extensions. The accessor "getSeries" gives direct access to the value
     */
    public StringType getSeriesElement() {
        if (this.series == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationProtocolComponent.series");
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
    public ImmunizationRecommendationRecommendationProtocolComponent setSeriesElement(StringType value) {
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
    public ImmunizationRecommendationRecommendationProtocolComponent setSeries(String value) {
        if (Utilities.noString(value))
            this.series = null;
        else {
            if (this.series == null)
                this.series = new StringType();
            this.series.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("doseSequence", "integer", "Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.", 0, java.lang.Integer.MAX_VALUE, doseSequence));
        childrenList.add(new Property("description", "string", "Contains the description about the protocol under which the vaccine was administered.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("authority", "Reference(Organization)", "Indicates the authority who published the protocol.  For example, ACIP.", 0, java.lang.Integer.MAX_VALUE, authority));
        childrenList.add(new Property("series", "string", "One possible path to achieve presumed immunity against a disease - within the context of an authority.", 0, java.lang.Integer.MAX_VALUE, series));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("doseSequence"))
            // IntegerType
            this.doseSequence = castToInteger(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("authority"))
            // Reference
            this.authority = castToReference(value);
        else if (name.equals("series"))
            // StringType
            this.series = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("doseSequence")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.doseSequence");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.description");
        } else if (name.equals("authority")) {
            this.authority = new Reference();
            return this.authority;
        } else if (name.equals("series")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.series");
        } else
            return super.addChild(name);
    }

    public ImmunizationRecommendationRecommendationProtocolComponent copy() {
        ImmunizationRecommendationRecommendationProtocolComponent dst = new ImmunizationRecommendationRecommendationProtocolComponent();
        copyValues(dst);
        dst.doseSequence = doseSequence == null ? null : doseSequence.copy();
        dst.description = description == null ? null : description.copy();
        dst.authority = authority == null ? null : authority.copy();
        dst.series = series == null ? null : series.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImmunizationRecommendationRecommendationProtocolComponent))
            return false;
        ImmunizationRecommendationRecommendationProtocolComponent o = (ImmunizationRecommendationRecommendationProtocolComponent) other;
        return compareDeep(doseSequence, o.doseSequence, true) && compareDeep(description, o.description, true) && compareDeep(authority, o.authority, true) && compareDeep(series, o.series, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImmunizationRecommendationRecommendationProtocolComponent))
            return false;
        ImmunizationRecommendationRecommendationProtocolComponent o = (ImmunizationRecommendationRecommendationProtocolComponent) other;
        return compareValues(doseSequence, o.doseSequence, true) && compareValues(description, o.description, true) && compareValues(series, o.series, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (doseSequence == null || doseSequence.isEmpty()) && (description == null || description.isEmpty()) && (authority == null || authority.isEmpty()) && (series == null || series.isEmpty());
    }

    public String fhirType() {
        return "ImmunizationRecommendation.recommendation.protocol";
    }
}
