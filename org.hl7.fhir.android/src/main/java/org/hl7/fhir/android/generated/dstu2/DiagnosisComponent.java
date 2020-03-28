package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.Use;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.UseEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimType;
import org.hl7.fhir.android.generated.dstu2.ClaimEnum.ClaimTypeEnumFactory;

public class DiagnosisComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Sequence of diagnosis which serves to order and provide a link.
     */
    protected PositiveIntType sequence;

    /**
     * The diagnosis.
     */
    protected Coding diagnosis;

    private static final long serialVersionUID = -795010186L;

    /*
     * Constructor
     */
    public DiagnosisComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DiagnosisComponent(PositiveIntType sequence, Coding diagnosis) {
        super();
        this.sequence = sequence;
        this.diagnosis = diagnosis;
    }

    /**
     * @return {@link #sequence} (Sequence of diagnosis which serves to order and provide a link.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
     */
    public PositiveIntType getSequenceElement() {
        if (this.sequence == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosisComponent.sequence");
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
     * @param value {@link #sequence} (Sequence of diagnosis which serves to order and provide a link.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
     */
    public DiagnosisComponent setSequenceElement(PositiveIntType value) {
        this.sequence = value;
        return this;
    }

    /**
     * @return Sequence of diagnosis which serves to order and provide a link.
     */
    public int getSequence() {
        return this.sequence == null || this.sequence.isEmpty() ? 0 : this.sequence.getValue();
    }

    /**
     * @param value Sequence of diagnosis which serves to order and provide a link.
     */
    public DiagnosisComponent setSequence(int value) {
        if (this.sequence == null)
            this.sequence = new PositiveIntType();
        this.sequence.setValue(value);
        return this;
    }

    /**
     * @return {@link #diagnosis} (The diagnosis.)
     */
    public Coding getDiagnosis() {
        if (this.diagnosis == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosisComponent.diagnosis");
            else if (Configuration.doAutoCreate())
                // cc
                this.diagnosis = new Coding();
        return this.diagnosis;
    }

    public boolean hasDiagnosis() {
        return this.diagnosis != null && !this.diagnosis.isEmpty();
    }

    /**
     * @param value {@link #diagnosis} (The diagnosis.)
     */
    public DiagnosisComponent setDiagnosis(Coding value) {
        this.diagnosis = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("sequence", "positiveInt", "Sequence of diagnosis which serves to order and provide a link.", 0, java.lang.Integer.MAX_VALUE, sequence));
        childrenList.add(new Property("diagnosis", "Coding", "The diagnosis.", 0, java.lang.Integer.MAX_VALUE, diagnosis));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequence"))
            // PositiveIntType
            this.sequence = castToPositiveInt(value);
        else if (name.equals("diagnosis"))
            // Coding
            this.diagnosis = castToCoding(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("sequence")) {
            throw new FHIRException("Cannot call addChild on a primitive type Claim.sequence");
        } else if (name.equals("diagnosis")) {
            this.diagnosis = new Coding();
            return this.diagnosis;
        } else
            return super.addChild(name);
    }

    public DiagnosisComponent copy() {
        DiagnosisComponent dst = new DiagnosisComponent();
        copyValues(dst);
        dst.sequence = sequence == null ? null : sequence.copy();
        dst.diagnosis = diagnosis == null ? null : diagnosis.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DiagnosisComponent))
            return false;
        DiagnosisComponent o = (DiagnosisComponent) other;
        return compareDeep(sequence, o.sequence, true) && compareDeep(diagnosis, o.diagnosis, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DiagnosisComponent))
            return false;
        DiagnosisComponent o = (DiagnosisComponent) other;
        return compareValues(sequence, o.sequence, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (sequence == null || sequence.isEmpty()) && (diagnosis == null || diagnosis.isEmpty());
    }

    public String fhirType() {
        return "Claim.diagnosis";
    }
}
