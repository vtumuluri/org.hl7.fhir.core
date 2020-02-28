package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcome;
import org.hl7.fhir.dstu2.model.Enumerations.RemittanceOutcomeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class CoverageComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A service line item.
     */
    protected PositiveIntType sequence;

    /**
     * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     */
    protected BooleanType focal;

    /**
     * Reference to the program or plan identification, underwriter or payor.
     */
    protected Reference coverage;

    /**
     * The actual object that is the target of the reference (Reference to the program or plan identification, underwriter or payor.)
     */
    protected Coverage coverageTarget;

    /**
     * The contract number of a business agreement which describes the terms and conditions.
     */
    protected StringType businessArrangement;

    /**
     * The relationship of the patient to the subscriber.
     */
    protected Coding relationship;

    /**
     * A list of references from the Insurer to which these services pertain.
     */
    protected List<StringType> preAuthRef;

    /**
     * The Coverages adjudication details.
     */
    protected Reference claimResponse;

    /**
     * The actual object that is the target of the reference (The Coverages adjudication details.)
     */
    protected ClaimResponse claimResponseTarget;

    /**
     * The style (standard) and version of the original material which was converted into this resource.
     */
    protected Coding originalRuleset;

    private static final long serialVersionUID = 621250924L;

    /*
     * Constructor
     */
    public CoverageComponent() {
        super();
    }

    /*
     * Constructor
     */
    public CoverageComponent(PositiveIntType sequence, BooleanType focal, Reference coverage, Coding relationship) {
        super();
        this.sequence = sequence;
        this.focal = focal;
        this.coverage = coverage;
        this.relationship = relationship;
    }

    /**
     * @return {@link #sequence} (A service line item.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
     */
    public PositiveIntType getSequenceElement() {
        if (this.sequence == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CoverageComponent.sequence");
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
     * @param value {@link #sequence} (A service line item.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
     */
    public CoverageComponent setSequenceElement(PositiveIntType value) {
        this.sequence = value;
        return this;
    }

    /**
     * @return A service line item.
     */
    public int getSequence() {
        return this.sequence == null || this.sequence.isEmpty() ? 0 : this.sequence.getValue();
    }

    /**
     * @param value A service line item.
     */
    public CoverageComponent setSequence(int value) {
        if (this.sequence == null)
            this.sequence = new PositiveIntType();
        this.sequence.setValue(value);
        return this;
    }

    /**
     * @return {@link #focal} (The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.). This is the underlying object with id, value and extensions. The accessor "getFocal" gives direct access to the value
     */
    public BooleanType getFocalElement() {
        if (this.focal == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CoverageComponent.focal");
            else if (Configuration.doAutoCreate())
                // bb
                this.focal = new BooleanType();
        return this.focal;
    }

    public boolean hasFocalElement() {
        return this.focal != null && !this.focal.isEmpty();
    }

    public boolean hasFocal() {
        return this.focal != null && !this.focal.isEmpty();
    }

    /**
     * @param value {@link #focal} (The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.). This is the underlying object with id, value and extensions. The accessor "getFocal" gives direct access to the value
     */
    public CoverageComponent setFocalElement(BooleanType value) {
        this.focal = value;
        return this;
    }

    /**
     * @return The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     */
    public boolean getFocal() {
        return this.focal == null || this.focal.isEmpty() ? false : this.focal.getValue();
    }

    /**
     * @param value The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     */
    public CoverageComponent setFocal(boolean value) {
        if (this.focal == null)
            this.focal = new BooleanType();
        this.focal.setValue(value);
        return this;
    }

    /**
     * @return {@link #coverage} (Reference to the program or plan identification, underwriter or payor.)
     */
    public Reference getCoverage() {
        if (this.coverage == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CoverageComponent.coverage");
            else if (Configuration.doAutoCreate())
                // cc
                this.coverage = new Reference();
        return this.coverage;
    }

    public boolean hasCoverage() {
        return this.coverage != null && !this.coverage.isEmpty();
    }

    /**
     * @param value {@link #coverage} (Reference to the program or plan identification, underwriter or payor.)
     */
    public CoverageComponent setCoverage(Reference value) {
        this.coverage = value;
        return this;
    }

    /**
     * @return {@link #coverage} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Reference to the program or plan identification, underwriter or payor.)
     */
    public Coverage getCoverageTarget() {
        if (this.coverageTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CoverageComponent.coverage");
            else if (Configuration.doAutoCreate())
                // aa
                this.coverageTarget = new Coverage();
        return this.coverageTarget;
    }

    /**
     * @param value {@link #coverage} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Reference to the program or plan identification, underwriter or payor.)
     */
    public CoverageComponent setCoverageTarget(Coverage value) {
        this.coverageTarget = value;
        return this;
    }

    /**
     * @return {@link #businessArrangement} (The contract number of a business agreement which describes the terms and conditions.). This is the underlying object with id, value and extensions. The accessor "getBusinessArrangement" gives direct access to the value
     */
    public StringType getBusinessArrangementElement() {
        if (this.businessArrangement == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CoverageComponent.businessArrangement");
            else if (Configuration.doAutoCreate())
                // bb
                this.businessArrangement = new StringType();
        return this.businessArrangement;
    }

    public boolean hasBusinessArrangementElement() {
        return this.businessArrangement != null && !this.businessArrangement.isEmpty();
    }

    public boolean hasBusinessArrangement() {
        return this.businessArrangement != null && !this.businessArrangement.isEmpty();
    }

    /**
     * @param value {@link #businessArrangement} (The contract number of a business agreement which describes the terms and conditions.). This is the underlying object with id, value and extensions. The accessor "getBusinessArrangement" gives direct access to the value
     */
    public CoverageComponent setBusinessArrangementElement(StringType value) {
        this.businessArrangement = value;
        return this;
    }

    /**
     * @return The contract number of a business agreement which describes the terms and conditions.
     */
    public String getBusinessArrangement() {
        return this.businessArrangement == null ? null : this.businessArrangement.getValue();
    }

    /**
     * @param value The contract number of a business agreement which describes the terms and conditions.
     */
    public CoverageComponent setBusinessArrangement(String value) {
        if (Utilities.noString(value))
            this.businessArrangement = null;
        else {
            if (this.businessArrangement == null)
                this.businessArrangement = new StringType();
            this.businessArrangement.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #relationship} (The relationship of the patient to the subscriber.)
     */
    public Coding getRelationship() {
        if (this.relationship == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CoverageComponent.relationship");
            else if (Configuration.doAutoCreate())
                // cc
                this.relationship = new Coding();
        return this.relationship;
    }

    public boolean hasRelationship() {
        return this.relationship != null && !this.relationship.isEmpty();
    }

    /**
     * @param value {@link #relationship} (The relationship of the patient to the subscriber.)
     */
    public CoverageComponent setRelationship(Coding value) {
        this.relationship = value;
        return this;
    }

    /**
     * @return {@link #preAuthRef} (A list of references from the Insurer to which these services pertain.)
     */
    public List<StringType> getPreAuthRef() {
        if (this.preAuthRef == null)
            this.preAuthRef = new ArrayList<StringType>();
        return this.preAuthRef;
    }

    public boolean hasPreAuthRef() {
        if (this.preAuthRef == null)
            return false;
        for (StringType item : this.preAuthRef) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public StringType addPreAuthRefElement() {
        // 2
        StringType t = new StringType();
        if (this.preAuthRef == null)
            this.preAuthRef = new ArrayList<StringType>();
        this.preAuthRef.add(t);
        return t;
    }

    /**
     * @param value {@link #preAuthRef} (A list of references from the Insurer to which these services pertain.)
     */
    public CoverageComponent addPreAuthRef(String value) {
        // 1
        StringType t = new StringType();
        t.setValue(value);
        if (this.preAuthRef == null)
            this.preAuthRef = new ArrayList<StringType>();
        this.preAuthRef.add(t);
        return this;
    }

    /**
     * @param value {@link #preAuthRef} (A list of references from the Insurer to which these services pertain.)
     */
    public boolean hasPreAuthRef(String value) {
        if (this.preAuthRef == null)
            return false;
        for (StringType v : this.preAuthRef) if (// string
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #claimResponse} (The Coverages adjudication details.)
     */
    public Reference getClaimResponse() {
        if (this.claimResponse == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CoverageComponent.claimResponse");
            else if (Configuration.doAutoCreate())
                // cc
                this.claimResponse = new Reference();
        return this.claimResponse;
    }

    public boolean hasClaimResponse() {
        return this.claimResponse != null && !this.claimResponse.isEmpty();
    }

    /**
     * @param value {@link #claimResponse} (The Coverages adjudication details.)
     */
    public CoverageComponent setClaimResponse(Reference value) {
        this.claimResponse = value;
        return this;
    }

    /**
     * @return {@link #claimResponse} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The Coverages adjudication details.)
     */
    public ClaimResponse getClaimResponseTarget() {
        if (this.claimResponseTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CoverageComponent.claimResponse");
            else if (Configuration.doAutoCreate())
                // aa
                this.claimResponseTarget = new ClaimResponse();
        return this.claimResponseTarget;
    }

    /**
     * @param value {@link #claimResponse} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The Coverages adjudication details.)
     */
    public CoverageComponent setClaimResponseTarget(ClaimResponse value) {
        this.claimResponseTarget = value;
        return this;
    }

    /**
     * @return {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public Coding getOriginalRuleset() {
        if (this.originalRuleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create CoverageComponent.originalRuleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.originalRuleset = new Coding();
        return this.originalRuleset;
    }

    public boolean hasOriginalRuleset() {
        return this.originalRuleset != null && !this.originalRuleset.isEmpty();
    }

    /**
     * @param value {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public CoverageComponent setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("sequence", "positiveInt", "A service line item.", 0, java.lang.Integer.MAX_VALUE, sequence));
        childrenList.add(new Property("focal", "boolean", "The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.", 0, java.lang.Integer.MAX_VALUE, focal));
        childrenList.add(new Property("coverage", "Reference(Coverage)", "Reference to the program or plan identification, underwriter or payor.", 0, java.lang.Integer.MAX_VALUE, coverage));
        childrenList.add(new Property("businessArrangement", "string", "The contract number of a business agreement which describes the terms and conditions.", 0, java.lang.Integer.MAX_VALUE, businessArrangement));
        childrenList.add(new Property("relationship", "Coding", "The relationship of the patient to the subscriber.", 0, java.lang.Integer.MAX_VALUE, relationship));
        childrenList.add(new Property("preAuthRef", "string", "A list of references from the Insurer to which these services pertain.", 0, java.lang.Integer.MAX_VALUE, preAuthRef));
        childrenList.add(new Property("claimResponse", "Reference(ClaimResponse)", "The Coverages adjudication details.", 0, java.lang.Integer.MAX_VALUE, claimResponse));
        childrenList.add(new Property("originalRuleset", "Coding", "The style (standard) and version of the original material which was converted into this resource.", 0, java.lang.Integer.MAX_VALUE, originalRuleset));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequence"))
            // PositiveIntType
            this.sequence = castToPositiveInt(value);
        else if (name.equals("focal"))
            // BooleanType
            this.focal = castToBoolean(value);
        else if (name.equals("coverage"))
            // Reference
            this.coverage = castToReference(value);
        else if (name.equals("businessArrangement"))
            // StringType
            this.businessArrangement = castToString(value);
        else if (name.equals("relationship"))
            // Coding
            this.relationship = castToCoding(value);
        else if (name.equals("preAuthRef"))
            this.getPreAuthRef().add(castToString(value));
        else if (name.equals("claimResponse"))
            // Reference
            this.claimResponse = castToReference(value);
        else if (name.equals("originalRuleset"))
            // Coding
            this.originalRuleset = castToCoding(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("sequence")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.sequence");
        } else if (name.equals("focal")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.focal");
        } else if (name.equals("coverage")) {
            this.coverage = new Reference();
            return this.coverage;
        } else if (name.equals("businessArrangement")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.businessArrangement");
        } else if (name.equals("relationship")) {
            this.relationship = new Coding();
            return this.relationship;
        } else if (name.equals("preAuthRef")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.preAuthRef");
        } else if (name.equals("claimResponse")) {
            this.claimResponse = new Reference();
            return this.claimResponse;
        } else if (name.equals("originalRuleset")) {
            this.originalRuleset = new Coding();
            return this.originalRuleset;
        } else
            return super.addChild(name);
    }

    public CoverageComponent copy() {
        CoverageComponent dst = new CoverageComponent();
        copyValues(dst);
        dst.sequence = sequence == null ? null : sequence.copy();
        dst.focal = focal == null ? null : focal.copy();
        dst.coverage = coverage == null ? null : coverage.copy();
        dst.businessArrangement = businessArrangement == null ? null : businessArrangement.copy();
        dst.relationship = relationship == null ? null : relationship.copy();
        if (preAuthRef != null) {
            dst.preAuthRef = new ArrayList<StringType>();
            for (StringType i : preAuthRef) dst.preAuthRef.add(i.copy());
        }
        ;
        dst.claimResponse = claimResponse == null ? null : claimResponse.copy();
        dst.originalRuleset = originalRuleset == null ? null : originalRuleset.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof CoverageComponent))
            return false;
        CoverageComponent o = (CoverageComponent) other;
        return compareDeep(sequence, o.sequence, true) && compareDeep(focal, o.focal, true) && compareDeep(coverage, o.coverage, true) && compareDeep(businessArrangement, o.businessArrangement, true) && compareDeep(relationship, o.relationship, true) && compareDeep(preAuthRef, o.preAuthRef, true) && compareDeep(claimResponse, o.claimResponse, true) && compareDeep(originalRuleset, o.originalRuleset, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof CoverageComponent))
            return false;
        CoverageComponent o = (CoverageComponent) other;
        return compareValues(sequence, o.sequence, true) && compareValues(focal, o.focal, true) && compareValues(businessArrangement, o.businessArrangement, true) && compareValues(preAuthRef, o.preAuthRef, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (sequence == null || sequence.isEmpty()) && (focal == null || focal.isEmpty()) && (coverage == null || coverage.isEmpty()) && (businessArrangement == null || businessArrangement.isEmpty()) && (relationship == null || relationship.isEmpty()) && (preAuthRef == null || preAuthRef.isEmpty()) && (claimResponse == null || claimResponse.isEmpty()) && (originalRuleset == null || originalRuleset.isEmpty());
    }

    public String fhirType() {
        return "ClaimResponse.coverage";
    }
}
