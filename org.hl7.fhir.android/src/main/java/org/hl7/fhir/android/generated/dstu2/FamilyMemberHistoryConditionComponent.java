package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.dstu2.model.Enumerations.AdministrativeGenderEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.FamilyMemberHistoryEnum.FamilyHistoryStatus;
import org.hl7.fhir.android.generated.dstu2.FamilyMemberHistoryEnum.FamilyHistoryStatusEnumFactory;

public class FamilyMemberHistoryConditionComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.
     */
    protected CodeableConcept code;

    /**
     * Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.
     */
    protected CodeableConcept outcome;

    /**
     * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
     */
    protected Type onset;

    /**
     * An area where general notes can be placed about this specific condition.
     */
    protected Annotation note;

    private static final long serialVersionUID = -1221569121L;

    /*
     * Constructor
     */
    public FamilyMemberHistoryConditionComponent() {
        super();
    }

    /*
     * Constructor
     */
    public FamilyMemberHistoryConditionComponent(CodeableConcept code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #code} (The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistoryConditionComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.)
     */
    public FamilyMemberHistoryConditionComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #outcome} (Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.)
     */
    public CodeableConcept getOutcome() {
        if (this.outcome == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistoryConditionComponent.outcome");
            else if (Configuration.doAutoCreate())
                // cc
                this.outcome = new CodeableConcept();
        return this.outcome;
    }

    public boolean hasOutcome() {
        return this.outcome != null && !this.outcome.isEmpty();
    }

    /**
     * @param value {@link #outcome} (Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.)
     */
    public FamilyMemberHistoryConditionComponent setOutcome(CodeableConcept value) {
        this.outcome = value;
        return this;
    }

    /**
     * @return {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
     */
    public Type getOnset() {
        return this.onset;
    }

    /**
     * @return {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
     */
    public Age getOnsetAge() throws FHIRException {
        if (!(this.onset instanceof Age))
            throw new FHIRException("Type mismatch: the type Age was expected, but " + this.onset.getClass().getName() + " was encountered");
        return (Age) this.onset;
    }

    public boolean hasOnsetAge() {
        return this.onset instanceof Age;
    }

    /**
     * @return {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
     */
    public Range getOnsetRange() throws FHIRException {
        if (!(this.onset instanceof Range))
            throw new FHIRException("Type mismatch: the type Range was expected, but " + this.onset.getClass().getName() + " was encountered");
        return (Range) this.onset;
    }

    public boolean hasOnsetRange() {
        return this.onset instanceof Range;
    }

    /**
     * @return {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
     */
    public Period getOnsetPeriod() throws FHIRException {
        if (!(this.onset instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but " + this.onset.getClass().getName() + " was encountered");
        return (Period) this.onset;
    }

    public boolean hasOnsetPeriod() {
        return this.onset instanceof Period;
    }

    /**
     * @return {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
     */
    public StringType getOnsetStringType() throws FHIRException {
        if (!(this.onset instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.onset.getClass().getName() + " was encountered");
        return (StringType) this.onset;
    }

    public boolean hasOnsetStringType() {
        return this.onset instanceof StringType;
    }

    public boolean hasOnset() {
        return this.onset != null && !this.onset.isEmpty();
    }

    /**
     * @param value {@link #onset} (Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.)
     */
    public FamilyMemberHistoryConditionComponent setOnset(Type value) {
        this.onset = value;
        return this;
    }

    /**
     * @return {@link #note} (An area where general notes can be placed about this specific condition.)
     */
    public Annotation getNote() {
        if (this.note == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create FamilyMemberHistoryConditionComponent.note");
            else if (Configuration.doAutoCreate())
                // cc
                this.note = new Annotation();
        return this.note;
    }

    public boolean hasNote() {
        return this.note != null && !this.note.isEmpty();
    }

    /**
     * @param value {@link #note} (An area where general notes can be placed about this specific condition.)
     */
    public FamilyMemberHistoryConditionComponent setNote(Annotation value) {
        this.note = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("outcome", "CodeableConcept", "Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.", 0, java.lang.Integer.MAX_VALUE, outcome));
        childrenList.add(new Property("onset[x]", "Age|Range|Period|string", "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.", 0, java.lang.Integer.MAX_VALUE, onset));
        childrenList.add(new Property("note", "Annotation", "An area where general notes can be placed about this specific condition.", 0, java.lang.Integer.MAX_VALUE, note));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("outcome"))
            // CodeableConcept
            this.outcome = castToCodeableConcept(value);
        else if (name.equals("onset[x]"))
            // Type
            this.onset = (Type) value;
        else if (name.equals("note"))
            // Annotation
            this.note = castToAnnotation(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("outcome")) {
            this.outcome = new CodeableConcept();
            return this.outcome;
        } else if (name.equals("onsetAge")) {
            this.onset = new Age();
            return this.onset;
        } else if (name.equals("onsetRange")) {
            this.onset = new Range();
            return this.onset;
        } else if (name.equals("onsetPeriod")) {
            this.onset = new Period();
            return this.onset;
        } else if (name.equals("onsetString")) {
            this.onset = new StringType();
            return this.onset;
        } else if (name.equals("note")) {
            this.note = new Annotation();
            return this.note;
        } else
            return super.addChild(name);
    }

    public FamilyMemberHistoryConditionComponent copy() {
        FamilyMemberHistoryConditionComponent dst = new FamilyMemberHistoryConditionComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.onset = onset == null ? null : onset.copy();
        dst.note = note == null ? null : note.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof FamilyMemberHistoryConditionComponent))
            return false;
        FamilyMemberHistoryConditionComponent o = (FamilyMemberHistoryConditionComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(outcome, o.outcome, true) && compareDeep(onset, o.onset, true) && compareDeep(note, o.note, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof FamilyMemberHistoryConditionComponent))
            return false;
        FamilyMemberHistoryConditionComponent o = (FamilyMemberHistoryConditionComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (outcome == null || outcome.isEmpty()) && (onset == null || onset.isEmpty()) && (note == null || note.isEmpty());
    }

    public String fhirType() {
        return "FamilyMemberHistory.condition";
    }
}
