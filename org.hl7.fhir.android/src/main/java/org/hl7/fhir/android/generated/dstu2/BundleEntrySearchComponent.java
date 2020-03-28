package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerbEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.HTTPVerb;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryModeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.SearchEntryMode;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.BundleEnum.BundleType;

public class BundleEntrySearchComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Why this entry is in the result set - whether it's included as a match or because of an _include requirement.
     */
    protected Enumeration<SearchEntryMode> mode;

    /**
     * When searching, the server's search ranking score for the entry.
     */
    protected DecimalType score;

    private static final long serialVersionUID = 837739866L;

    /*
     * Constructor
     */
    public BundleEntrySearchComponent() {
        super();
    }

    /**
     * @return {@link #mode} (Why this entry is in the result set - whether it's included as a match or because of an _include requirement.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public Enumeration<SearchEntryMode> getModeElement() {
        if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntrySearchComponent.mode");
            else if (Configuration.doAutoCreate())
                // bb
                this.mode = new Enumeration<SearchEntryMode>(new SearchEntryModeEnumFactory());
        return this.mode;
    }

    public boolean hasModeElement() {
        return this.mode != null && !this.mode.isEmpty();
    }

    public boolean hasMode() {
        return this.mode != null && !this.mode.isEmpty();
    }

    /**
     * @param value {@link #mode} (Why this entry is in the result set - whether it's included as a match or because of an _include requirement.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
     */
    public BundleEntrySearchComponent setModeElement(Enumeration<SearchEntryMode> value) {
        this.mode = value;
        return this;
    }

    /**
     * @return Why this entry is in the result set - whether it's included as a match or because of an _include requirement.
     */
    public SearchEntryMode getMode() {
        return this.mode == null ? null : this.mode.getValue();
    }

    /**
     * @param value Why this entry is in the result set - whether it's included as a match or because of an _include requirement.
     */
    public BundleEntrySearchComponent setMode(SearchEntryMode value) {
        if (value == null)
            this.mode = null;
        else {
            if (this.mode == null)
                this.mode = new Enumeration<SearchEntryMode>(new SearchEntryModeEnumFactory());
            this.mode.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #score} (When searching, the server's search ranking score for the entry.). This is the underlying object with id, value and extensions. The accessor "getScore" gives direct access to the value
     */
    public DecimalType getScoreElement() {
        if (this.score == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create BundleEntrySearchComponent.score");
            else if (Configuration.doAutoCreate())
                // bb
                this.score = new DecimalType();
        return this.score;
    }

    public boolean hasScoreElement() {
        return this.score != null && !this.score.isEmpty();
    }

    public boolean hasScore() {
        return this.score != null && !this.score.isEmpty();
    }

    /**
     * @param value {@link #score} (When searching, the server's search ranking score for the entry.). This is the underlying object with id, value and extensions. The accessor "getScore" gives direct access to the value
     */
    public BundleEntrySearchComponent setScoreElement(DecimalType value) {
        this.score = value;
        return this;
    }

    /**
     * @return When searching, the server's search ranking score for the entry.
     */
    public BigDecimal getScore() {
        return this.score == null ? null : this.score.getValue();
    }

    /**
     * @param value When searching, the server's search ranking score for the entry.
     */
    public BundleEntrySearchComponent setScore(BigDecimal value) {
        if (value == null)
            this.score = null;
        else {
            if (this.score == null)
                this.score = new DecimalType();
            this.score.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("mode", "code", "Why this entry is in the result set - whether it's included as a match or because of an _include requirement.", 0, java.lang.Integer.MAX_VALUE, mode));
        childrenList.add(new Property("score", "decimal", "When searching, the server's search ranking score for the entry.", 0, java.lang.Integer.MAX_VALUE, score));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("mode"))
            // Enumeration<SearchEntryMode>
            this.mode = new SearchEntryModeEnumFactory().fromType(value);
        else if (name.equals("score"))
            // DecimalType
            this.score = castToDecimal(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("mode")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.mode");
        } else if (name.equals("score")) {
            throw new FHIRException("Cannot call addChild on a primitive type Bundle.score");
        } else
            return super.addChild(name);
    }

    public BundleEntrySearchComponent copy() {
        BundleEntrySearchComponent dst = new BundleEntrySearchComponent();
        copyValues(dst);
        dst.mode = mode == null ? null : mode.copy();
        dst.score = score == null ? null : score.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof BundleEntrySearchComponent))
            return false;
        BundleEntrySearchComponent o = (BundleEntrySearchComponent) other;
        return compareDeep(mode, o.mode, true) && compareDeep(score, o.score, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof BundleEntrySearchComponent))
            return false;
        BundleEntrySearchComponent o = (BundleEntrySearchComponent) other;
        return compareValues(mode, o.mode, true) && compareValues(score, o.score, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (mode == null || mode.isEmpty()) && (score == null || score.isEmpty());
    }

    public String fhirType() {
        return "Bundle.entry.search";
    }
}
