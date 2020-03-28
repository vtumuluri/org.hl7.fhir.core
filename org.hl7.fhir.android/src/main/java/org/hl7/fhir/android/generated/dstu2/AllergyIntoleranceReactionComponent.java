package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceSeverity;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCriticality;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCriticalityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceStatus;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCertainty;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCertaintyEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCategory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceCategoryEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceType;
import org.hl7.fhir.android.generated.dstu2.AllergyIntoleranceEnum.AllergyIntoleranceTypeEnumFactory;

public class AllergyIntoleranceReactionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.
     */
    protected CodeableConcept substance;

    /**
     * Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.
     */
    protected Enumeration<AllergyIntoleranceCertainty> certainty;

    /**
     * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.
     */
    protected List<CodeableConcept> manifestation;

    /**
     * Text description about the reaction as a whole, including details of the manifestation if required.
     */
    protected StringType description;

    /**
     * Record of the date and/or time of the onset of the Reaction.
     */
    protected DateTimeType onset;

    /**
     * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
     */
    protected Enumeration<AllergyIntoleranceSeverity> severity;

    /**
     * Identification of the route by which the subject was exposed to the substance.
     */
    protected CodeableConcept exposureRoute;

    /**
     * Additional text about the adverse reaction event not captured in other fields.
     */
    protected Annotation note;

    private static final long serialVersionUID = -765664367L;

    /*
     * Constructor
     */
    public AllergyIntoleranceReactionComponent() {
        super();
    }

    /**
     * @return {@link #substance} (Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.)
     */
    public CodeableConcept getSubstance() {
        if (this.substance == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.substance");
            else if (Configuration.doAutoCreate())
                // cc
                this.substance = new CodeableConcept();
        return this.substance;
    }

    public boolean hasSubstance() {
        return this.substance != null && !this.substance.isEmpty();
    }

    /**
     * @param value {@link #substance} (Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.)
     */
    public AllergyIntoleranceReactionComponent setSubstance(CodeableConcept value) {
        this.substance = value;
        return this;
    }

    /**
     * @return {@link #certainty} (Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.). This is the underlying object with id, value and extensions. The accessor "getCertainty" gives direct access to the value
     */
    public Enumeration<AllergyIntoleranceCertainty> getCertaintyElement() {
        if (this.certainty == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.certainty");
            else if (Configuration.doAutoCreate())
                // bb
                this.certainty = new Enumeration<AllergyIntoleranceCertainty>(new AllergyIntoleranceCertaintyEnumFactory());
        return this.certainty;
    }

    public boolean hasCertaintyElement() {
        return this.certainty != null && !this.certainty.isEmpty();
    }

    public boolean hasCertainty() {
        return this.certainty != null && !this.certainty.isEmpty();
    }

    /**
     * @param value {@link #certainty} (Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.). This is the underlying object with id, value and extensions. The accessor "getCertainty" gives direct access to the value
     */
    public AllergyIntoleranceReactionComponent setCertaintyElement(Enumeration<AllergyIntoleranceCertainty> value) {
        this.certainty = value;
        return this;
    }

    /**
     * @return Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.
     */
    public AllergyIntoleranceCertainty getCertainty() {
        return this.certainty == null ? null : this.certainty.getValue();
    }

    /**
     * @param value Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.
     */
    public AllergyIntoleranceReactionComponent setCertainty(AllergyIntoleranceCertainty value) {
        if (value == null)
            this.certainty = null;
        else {
            if (this.certainty == null)
                this.certainty = new Enumeration<AllergyIntoleranceCertainty>(new AllergyIntoleranceCertaintyEnumFactory());
            this.certainty.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #manifestation} (Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.)
     */
    public List<CodeableConcept> getManifestation() {
        if (this.manifestation == null)
            this.manifestation = new ArrayList<CodeableConcept>();
        return this.manifestation;
    }

    public boolean hasManifestation() {
        if (this.manifestation == null)
            return false;
        for (CodeableConcept item : this.manifestation) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addManifestation() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.manifestation == null)
            this.manifestation = new ArrayList<CodeableConcept>();
        this.manifestation.add(t);
        return t;
    }

    // syntactic sugar
    public AllergyIntoleranceReactionComponent addManifestation(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.manifestation == null)
            this.manifestation = new ArrayList<CodeableConcept>();
        this.manifestation.add(t);
        return this;
    }

    /**
     * @return {@link #description} (Text description about the reaction as a whole, including details of the manifestation if required.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.description");
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
     * @param value {@link #description} (Text description about the reaction as a whole, including details of the manifestation if required.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public AllergyIntoleranceReactionComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Text description about the reaction as a whole, including details of the manifestation if required.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Text description about the reaction as a whole, including details of the manifestation if required.
     */
    public AllergyIntoleranceReactionComponent setDescription(String value) {
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
     * @return {@link #onset} (Record of the date and/or time of the onset of the Reaction.). This is the underlying object with id, value and extensions. The accessor "getOnset" gives direct access to the value
     */
    public DateTimeType getOnsetElement() {
        if (this.onset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.onset");
            else if (Configuration.doAutoCreate())
                // bb
                this.onset = new DateTimeType();
        return this.onset;
    }

    public boolean hasOnsetElement() {
        return this.onset != null && !this.onset.isEmpty();
    }

    public boolean hasOnset() {
        return this.onset != null && !this.onset.isEmpty();
    }

    /**
     * @param value {@link #onset} (Record of the date and/or time of the onset of the Reaction.). This is the underlying object with id, value and extensions. The accessor "getOnset" gives direct access to the value
     */
    public AllergyIntoleranceReactionComponent setOnsetElement(DateTimeType value) {
        this.onset = value;
        return this;
    }

    /**
     * @return Record of the date and/or time of the onset of the Reaction.
     */
    public Date getOnset() {
        return this.onset == null ? null : this.onset.getValue();
    }

    /**
     * @param value Record of the date and/or time of the onset of the Reaction.
     */
    public AllergyIntoleranceReactionComponent setOnset(Date value) {
        if (value == null)
            this.onset = null;
        else {
            if (this.onset == null)
                this.onset = new DateTimeType();
            this.onset.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #severity} (Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.). This is the underlying object with id, value and extensions. The accessor "getSeverity" gives direct access to the value
     */
    public Enumeration<AllergyIntoleranceSeverity> getSeverityElement() {
        if (this.severity == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.severity");
            else if (Configuration.doAutoCreate())
                // bb
                this.severity = new Enumeration<AllergyIntoleranceSeverity>(new AllergyIntoleranceSeverityEnumFactory());
        return this.severity;
    }

    public boolean hasSeverityElement() {
        return this.severity != null && !this.severity.isEmpty();
    }

    public boolean hasSeverity() {
        return this.severity != null && !this.severity.isEmpty();
    }

    /**
     * @param value {@link #severity} (Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.). This is the underlying object with id, value and extensions. The accessor "getSeverity" gives direct access to the value
     */
    public AllergyIntoleranceReactionComponent setSeverityElement(Enumeration<AllergyIntoleranceSeverity> value) {
        this.severity = value;
        return this;
    }

    /**
     * @return Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
     */
    public AllergyIntoleranceSeverity getSeverity() {
        return this.severity == null ? null : this.severity.getValue();
    }

    /**
     * @param value Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
     */
    public AllergyIntoleranceReactionComponent setSeverity(AllergyIntoleranceSeverity value) {
        if (value == null)
            this.severity = null;
        else {
            if (this.severity == null)
                this.severity = new Enumeration<AllergyIntoleranceSeverity>(new AllergyIntoleranceSeverityEnumFactory());
            this.severity.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #exposureRoute} (Identification of the route by which the subject was exposed to the substance.)
     */
    public CodeableConcept getExposureRoute() {
        if (this.exposureRoute == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.exposureRoute");
            else if (Configuration.doAutoCreate())
                // cc
                this.exposureRoute = new CodeableConcept();
        return this.exposureRoute;
    }

    public boolean hasExposureRoute() {
        return this.exposureRoute != null && !this.exposureRoute.isEmpty();
    }

    /**
     * @param value {@link #exposureRoute} (Identification of the route by which the subject was exposed to the substance.)
     */
    public AllergyIntoleranceReactionComponent setExposureRoute(CodeableConcept value) {
        this.exposureRoute = value;
        return this;
    }

    /**
     * @return {@link #note} (Additional text about the adverse reaction event not captured in other fields.)
     */
    public Annotation getNote() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AllergyIntoleranceReactionComponent.note");
            else if (Configuration.doAutoCreate())
                // cc
                this.note = new Annotation();
        return this.note;
    }

    public boolean hasNote() {
        return this.note != null && !this.note.isEmpty();
    }

    /**
     * @param value {@link #note} (Additional text about the adverse reaction event not captured in other fields.)
     */
    public AllergyIntoleranceReactionComponent setNote(Annotation value) {
        this.note = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("substance", "CodeableConcept", "Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.", 0, java.lang.Integer.MAX_VALUE, substance));
        childrenList.add(new Property("certainty", "code", "Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.", 0, java.lang.Integer.MAX_VALUE, certainty));
        childrenList.add(new Property("manifestation", "CodeableConcept", "Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.", 0, java.lang.Integer.MAX_VALUE, manifestation));
        childrenList.add(new Property("description", "string", "Text description about the reaction as a whole, including details of the manifestation if required.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("onset", "dateTime", "Record of the date and/or time of the onset of the Reaction.", 0, java.lang.Integer.MAX_VALUE, onset));
        childrenList.add(new Property("severity", "code", "Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.", 0, java.lang.Integer.MAX_VALUE, severity));
        childrenList.add(new Property("exposureRoute", "CodeableConcept", "Identification of the route by which the subject was exposed to the substance.", 0, java.lang.Integer.MAX_VALUE, exposureRoute));
        childrenList.add(new Property("note", "Annotation", "Additional text about the adverse reaction event not captured in other fields.", 0, java.lang.Integer.MAX_VALUE, note));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("substance"))
            // CodeableConcept
            this.substance = castToCodeableConcept(value);
        else if (name.equals("certainty"))
            // Enumeration<AllergyIntoleranceCertainty>
            this.certainty = new AllergyIntoleranceCertaintyEnumFactory().fromType(value);
        else if (name.equals("manifestation"))
            this.getManifestation().add(castToCodeableConcept(value));
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("onset"))
            // DateTimeType
            this.onset = castToDateTime(value);
        else if (name.equals("severity"))
            // Enumeration<AllergyIntoleranceSeverity>
            this.severity = new AllergyIntoleranceSeverityEnumFactory().fromType(value);
        else if (name.equals("exposureRoute"))
            // CodeableConcept
            this.exposureRoute = castToCodeableConcept(value);
        else if (name.equals("note"))
            // Annotation
            this.note = castToAnnotation(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("substance")) {
            this.substance = new CodeableConcept();
            return this.substance;
        } else if (name.equals("certainty")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.certainty");
        } else if (name.equals("manifestation")) {
            return addManifestation();
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.description");
        } else if (name.equals("onset")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.onset");
        } else if (name.equals("severity")) {
            throw new FHIRException("Cannot call addChild on a primitive type AllergyIntolerance.severity");
        } else if (name.equals("exposureRoute")) {
            this.exposureRoute = new CodeableConcept();
            return this.exposureRoute;
        } else if (name.equals("note")) {
            this.note = new Annotation();
            return this.note;
        } else
            return super.addChild(name);
    }

    public AllergyIntoleranceReactionComponent copy() {
        AllergyIntoleranceReactionComponent dst = new AllergyIntoleranceReactionComponent();
        copyValues(dst);
        dst.substance = substance == null ? null : substance.copy();
        dst.certainty = certainty == null ? null : certainty.copy();
        if (manifestation != null) {
            dst.manifestation = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : manifestation) dst.manifestation.add(i.copy());
        }
        ;
        dst.description = description == null ? null : description.copy();
        dst.onset = onset == null ? null : onset.copy();
        dst.severity = severity == null ? null : severity.copy();
        dst.exposureRoute = exposureRoute == null ? null : exposureRoute.copy();
        dst.note = note == null ? null : note.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AllergyIntoleranceReactionComponent))
            return false;
        AllergyIntoleranceReactionComponent o = (AllergyIntoleranceReactionComponent) other;
        return compareDeep(substance, o.substance, true) && compareDeep(certainty, o.certainty, true) && compareDeep(manifestation, o.manifestation, true) && compareDeep(description, o.description, true) && compareDeep(onset, o.onset, true) && compareDeep(severity, o.severity, true) && compareDeep(exposureRoute, o.exposureRoute, true) && compareDeep(note, o.note, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AllergyIntoleranceReactionComponent))
            return false;
        AllergyIntoleranceReactionComponent o = (AllergyIntoleranceReactionComponent) other;
        return compareValues(certainty, o.certainty, true) && compareValues(description, o.description, true) && compareValues(onset, o.onset, true) && compareValues(severity, o.severity, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (substance == null || substance.isEmpty()) && (certainty == null || certainty.isEmpty()) && (manifestation == null || manifestation.isEmpty()) && (description == null || description.isEmpty()) && (onset == null || onset.isEmpty()) && (severity == null || severity.isEmpty()) && (exposureRoute == null || exposureRoute.isEmpty()) && (note == null || note.isEmpty());
    }

    public String fhirType() {
        return "AllergyIntolerance.reaction";
    }
}
