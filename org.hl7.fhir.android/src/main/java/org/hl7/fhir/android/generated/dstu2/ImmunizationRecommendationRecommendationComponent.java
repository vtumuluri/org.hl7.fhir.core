package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class ImmunizationRecommendationRecommendationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The date the immunization recommendation was created.
     */
    protected DateTimeType date;

    /**
     * Vaccine that pertains to the recommendation.
     */
    protected CodeableConcept vaccineCode;

    /**
     * This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).
     */
    protected PositiveIntType doseNumber;

    /**
     * Vaccine administration status.
     */
    protected CodeableConcept forecastStatus;

    /**
     * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
     */
    protected List<ImmunizationRecommendationRecommendationDateCriterionComponent> dateCriterion;

    /**
     * Contains information about the protocol under which the vaccine was administered.
     */
    protected ImmunizationRecommendationRecommendationProtocolComponent protocol;

    /**
     * Immunization event history that supports the status and recommendation.
     */
    protected List<Reference> supportingImmunization;

    /**
     * The actual objects that are the target of the reference (Immunization event history that supports the status and recommendation.)
     */
    protected List<Immunization> supportingImmunizationTarget;

    /**
     * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
     */
    protected List<Reference> supportingPatientInformation;

    /**
     * The actual objects that are the target of the reference (Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.)
     */
    protected List<Resource> supportingPatientInformationTarget;

    private static final long serialVersionUID = 1501347482L;

    /*
     * Constructor
     */
    public ImmunizationRecommendationRecommendationComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ImmunizationRecommendationRecommendationComponent(DateTimeType date, CodeableConcept vaccineCode, CodeableConcept forecastStatus) {
        super();
        this.date = date;
        this.vaccineCode = vaccineCode;
        this.forecastStatus = forecastStatus;
    }

    /**
     * @return {@link #date} (The date the immunization recommendation was created.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationComponent.date");
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
     * @param value {@link #date} (The date the immunization recommendation was created.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ImmunizationRecommendationRecommendationComponent setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return The date the immunization recommendation was created.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date the immunization recommendation was created.
     */
    public ImmunizationRecommendationRecommendationComponent setDate(Date value) {
        if (this.date == null)
            this.date = new DateTimeType();
        this.date.setValue(value);
        return this;
    }

    /**
     * @return {@link #vaccineCode} (Vaccine that pertains to the recommendation.)
     */
    public CodeableConcept getVaccineCode() {
        if (this.vaccineCode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationComponent.vaccineCode");
            else if (Configuration.doAutoCreate())
                // cc
                this.vaccineCode = new CodeableConcept();
        return this.vaccineCode;
    }

    public boolean hasVaccineCode() {
        return this.vaccineCode != null && !this.vaccineCode.isEmpty();
    }

    /**
     * @param value {@link #vaccineCode} (Vaccine that pertains to the recommendation.)
     */
    public ImmunizationRecommendationRecommendationComponent setVaccineCode(CodeableConcept value) {
        this.vaccineCode = value;
        return this;
    }

    /**
     * @return {@link #doseNumber} (This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).). This is the underlying object with id, value and extensions. The accessor "getDoseNumber" gives direct access to the value
     */
    public PositiveIntType getDoseNumberElement() {
        if (this.doseNumber == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationComponent.doseNumber");
            else if (Configuration.doAutoCreate())
                // bb
                this.doseNumber = new PositiveIntType();
        return this.doseNumber;
    }

    public boolean hasDoseNumberElement() {
        return this.doseNumber != null && !this.doseNumber.isEmpty();
    }

    public boolean hasDoseNumber() {
        return this.doseNumber != null && !this.doseNumber.isEmpty();
    }

    /**
     * @param value {@link #doseNumber} (This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).). This is the underlying object with id, value and extensions. The accessor "getDoseNumber" gives direct access to the value
     */
    public ImmunizationRecommendationRecommendationComponent setDoseNumberElement(PositiveIntType value) {
        this.doseNumber = value;
        return this;
    }

    /**
     * @return This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).
     */
    public int getDoseNumber() {
        return this.doseNumber == null || this.doseNumber.isEmpty() ? 0 : this.doseNumber.getValue();
    }

    /**
     * @param value This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).
     */
    public ImmunizationRecommendationRecommendationComponent setDoseNumber(int value) {
        if (this.doseNumber == null)
            this.doseNumber = new PositiveIntType();
        this.doseNumber.setValue(value);
        return this;
    }

    /**
     * @return {@link #forecastStatus} (Vaccine administration status.)
     */
    public CodeableConcept getForecastStatus() {
        if (this.forecastStatus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationComponent.forecastStatus");
            else if (Configuration.doAutoCreate())
                // cc
                this.forecastStatus = new CodeableConcept();
        return this.forecastStatus;
    }

    public boolean hasForecastStatus() {
        return this.forecastStatus != null && !this.forecastStatus.isEmpty();
    }

    /**
     * @param value {@link #forecastStatus} (Vaccine administration status.)
     */
    public ImmunizationRecommendationRecommendationComponent setForecastStatus(CodeableConcept value) {
        this.forecastStatus = value;
        return this;
    }

    /**
     * @return {@link #dateCriterion} (Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.)
     */
    public List<ImmunizationRecommendationRecommendationDateCriterionComponent> getDateCriterion() {
        if (this.dateCriterion == null)
            this.dateCriterion = new ArrayList<ImmunizationRecommendationRecommendationDateCriterionComponent>();
        return this.dateCriterion;
    }

    public boolean hasDateCriterion() {
        if (this.dateCriterion == null)
            return false;
        for (ImmunizationRecommendationRecommendationDateCriterionComponent item : this.dateCriterion) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ImmunizationRecommendationRecommendationDateCriterionComponent addDateCriterion() {
        // 3
        ImmunizationRecommendationRecommendationDateCriterionComponent t = new ImmunizationRecommendationRecommendationDateCriterionComponent();
        if (this.dateCriterion == null)
            this.dateCriterion = new ArrayList<ImmunizationRecommendationRecommendationDateCriterionComponent>();
        this.dateCriterion.add(t);
        return t;
    }

    // syntactic sugar
    public ImmunizationRecommendationRecommendationComponent addDateCriterion(ImmunizationRecommendationRecommendationDateCriterionComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.dateCriterion == null)
            this.dateCriterion = new ArrayList<ImmunizationRecommendationRecommendationDateCriterionComponent>();
        this.dateCriterion.add(t);
        return this;
    }

    /**
     * @return {@link #protocol} (Contains information about the protocol under which the vaccine was administered.)
     */
    public ImmunizationRecommendationRecommendationProtocolComponent getProtocol() {
        if (this.protocol == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationComponent.protocol");
            else if (Configuration.doAutoCreate())
                // cc
                this.protocol = new ImmunizationRecommendationRecommendationProtocolComponent();
        return this.protocol;
    }

    public boolean hasProtocol() {
        return this.protocol != null && !this.protocol.isEmpty();
    }

    /**
     * @param value {@link #protocol} (Contains information about the protocol under which the vaccine was administered.)
     */
    public ImmunizationRecommendationRecommendationComponent setProtocol(ImmunizationRecommendationRecommendationProtocolComponent value) {
        this.protocol = value;
        return this;
    }

    /**
     * @return {@link #supportingImmunization} (Immunization event history that supports the status and recommendation.)
     */
    public List<Reference> getSupportingImmunization() {
        if (this.supportingImmunization == null)
            this.supportingImmunization = new ArrayList<Reference>();
        return this.supportingImmunization;
    }

    public boolean hasSupportingImmunization() {
        if (this.supportingImmunization == null)
            return false;
        for (Reference item : this.supportingImmunization) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addSupportingImmunization() {
        // 3
        Reference t = new Reference();
        if (this.supportingImmunization == null)
            this.supportingImmunization = new ArrayList<Reference>();
        this.supportingImmunization.add(t);
        return t;
    }

    // syntactic sugar
    public ImmunizationRecommendationRecommendationComponent addSupportingImmunization(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.supportingImmunization == null)
            this.supportingImmunization = new ArrayList<Reference>();
        this.supportingImmunization.add(t);
        return this;
    }

    /**
     * @return {@link #supportingImmunization} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Immunization event history that supports the status and recommendation.)
     */
    public List<Immunization> getSupportingImmunizationTarget() {
        if (this.supportingImmunizationTarget == null)
            this.supportingImmunizationTarget = new ArrayList<Immunization>();
        return this.supportingImmunizationTarget;
    }

    /**
     * @return {@link #supportingImmunization} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Immunization event history that supports the status and recommendation.)
     */
    public Immunization addSupportingImmunizationTarget() {
        Immunization r = new Immunization();
        if (this.supportingImmunizationTarget == null)
            this.supportingImmunizationTarget = new ArrayList<Immunization>();
        this.supportingImmunizationTarget.add(r);
        return r;
    }

    /**
     * @return {@link #supportingPatientInformation} (Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.)
     */
    public List<Reference> getSupportingPatientInformation() {
        if (this.supportingPatientInformation == null)
            this.supportingPatientInformation = new ArrayList<Reference>();
        return this.supportingPatientInformation;
    }

    public boolean hasSupportingPatientInformation() {
        if (this.supportingPatientInformation == null)
            return false;
        for (Reference item : this.supportingPatientInformation) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addSupportingPatientInformation() {
        // 3
        Reference t = new Reference();
        if (this.supportingPatientInformation == null)
            this.supportingPatientInformation = new ArrayList<Reference>();
        this.supportingPatientInformation.add(t);
        return t;
    }

    // syntactic sugar
    public ImmunizationRecommendationRecommendationComponent addSupportingPatientInformation(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.supportingPatientInformation == null)
            this.supportingPatientInformation = new ArrayList<Reference>();
        this.supportingPatientInformation.add(t);
        return this;
    }

    /**
     * @return {@link #supportingPatientInformation} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.)
     */
    public List<Resource> getSupportingPatientInformationTarget() {
        if (this.supportingPatientInformationTarget == null)
            this.supportingPatientInformationTarget = new ArrayList<Resource>();
        return this.supportingPatientInformationTarget;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("date", "dateTime", "The date the immunization recommendation was created.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("vaccineCode", "CodeableConcept", "Vaccine that pertains to the recommendation.", 0, java.lang.Integer.MAX_VALUE, vaccineCode));
        childrenList.add(new Property("doseNumber", "positiveInt", "This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).", 0, java.lang.Integer.MAX_VALUE, doseNumber));
        childrenList.add(new Property("forecastStatus", "CodeableConcept", "Vaccine administration status.", 0, java.lang.Integer.MAX_VALUE, forecastStatus));
        childrenList.add(new Property("dateCriterion", "", "Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.", 0, java.lang.Integer.MAX_VALUE, dateCriterion));
        childrenList.add(new Property("protocol", "", "Contains information about the protocol under which the vaccine was administered.", 0, java.lang.Integer.MAX_VALUE, protocol));
        childrenList.add(new Property("supportingImmunization", "Reference(Immunization)", "Immunization event history that supports the status and recommendation.", 0, java.lang.Integer.MAX_VALUE, supportingImmunization));
        childrenList.add(new Property("supportingPatientInformation", "Reference(Observation|AllergyIntolerance)", "Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.", 0, java.lang.Integer.MAX_VALUE, supportingPatientInformation));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("vaccineCode"))
            // CodeableConcept
            this.vaccineCode = castToCodeableConcept(value);
        else if (name.equals("doseNumber"))
            // PositiveIntType
            this.doseNumber = castToPositiveInt(value);
        else if (name.equals("forecastStatus"))
            // CodeableConcept
            this.forecastStatus = castToCodeableConcept(value);
        else if (name.equals("dateCriterion"))
            this.getDateCriterion().add((ImmunizationRecommendationRecommendationDateCriterionComponent) value);
        else if (name.equals("protocol"))
            // ImmunizationRecommendationRecommendationProtocolComponent
            this.protocol = (ImmunizationRecommendationRecommendationProtocolComponent) value;
        else if (name.equals("supportingImmunization"))
            this.getSupportingImmunization().add(castToReference(value));
        else if (name.equals("supportingPatientInformation"))
            this.getSupportingPatientInformation().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.date");
        } else if (name.equals("vaccineCode")) {
            this.vaccineCode = new CodeableConcept();
            return this.vaccineCode;
        } else if (name.equals("doseNumber")) {
            throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.doseNumber");
        } else if (name.equals("forecastStatus")) {
            this.forecastStatus = new CodeableConcept();
            return this.forecastStatus;
        } else if (name.equals("dateCriterion")) {
            return addDateCriterion();
        } else if (name.equals("protocol")) {
            this.protocol = new ImmunizationRecommendationRecommendationProtocolComponent();
            return this.protocol;
        } else if (name.equals("supportingImmunization")) {
            return addSupportingImmunization();
        } else if (name.equals("supportingPatientInformation")) {
            return addSupportingPatientInformation();
        } else
            return super.addChild(name);
    }

    public ImmunizationRecommendationRecommendationComponent copy() {
        ImmunizationRecommendationRecommendationComponent dst = new ImmunizationRecommendationRecommendationComponent();
        copyValues(dst);
        dst.date = date == null ? null : date.copy();
        dst.vaccineCode = vaccineCode == null ? null : vaccineCode.copy();
        dst.doseNumber = doseNumber == null ? null : doseNumber.copy();
        dst.forecastStatus = forecastStatus == null ? null : forecastStatus.copy();
        if (dateCriterion != null) {
            dst.dateCriterion = new ArrayList<ImmunizationRecommendationRecommendationDateCriterionComponent>();
            for (ImmunizationRecommendationRecommendationDateCriterionComponent i : dateCriterion) dst.dateCriterion.add(i.copy());
        }
        ;
        dst.protocol = protocol == null ? null : protocol.copy();
        if (supportingImmunization != null) {
            dst.supportingImmunization = new ArrayList<Reference>();
            for (Reference i : supportingImmunization) dst.supportingImmunization.add(i.copy());
        }
        ;
        if (supportingPatientInformation != null) {
            dst.supportingPatientInformation = new ArrayList<Reference>();
            for (Reference i : supportingPatientInformation) dst.supportingPatientInformation.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ImmunizationRecommendationRecommendationComponent))
            return false;
        ImmunizationRecommendationRecommendationComponent o = (ImmunizationRecommendationRecommendationComponent) other;
        return compareDeep(date, o.date, true) && compareDeep(vaccineCode, o.vaccineCode, true) && compareDeep(doseNumber, o.doseNumber, true) && compareDeep(forecastStatus, o.forecastStatus, true) && compareDeep(dateCriterion, o.dateCriterion, true) && compareDeep(protocol, o.protocol, true) && compareDeep(supportingImmunization, o.supportingImmunization, true) && compareDeep(supportingPatientInformation, o.supportingPatientInformation, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ImmunizationRecommendationRecommendationComponent))
            return false;
        ImmunizationRecommendationRecommendationComponent o = (ImmunizationRecommendationRecommendationComponent) other;
        return compareValues(date, o.date, true) && compareValues(doseNumber, o.doseNumber, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (date == null || date.isEmpty()) && (vaccineCode == null || vaccineCode.isEmpty()) && (doseNumber == null || doseNumber.isEmpty()) && (forecastStatus == null || forecastStatus.isEmpty()) && (dateCriterion == null || dateCriterion.isEmpty()) && (protocol == null || protocol.isEmpty()) && (supportingImmunization == null || supportingImmunization.isEmpty()) && (supportingPatientInformation == null || supportingPatientInformation.isEmpty());
    }

    public String fhirType() {
        return "ImmunizationRecommendation.recommendation";
    }
}
