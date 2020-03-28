package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.RemittanceOutcome;
import org.hl7.fhir.android.generated.dstu2.Enumerations.RemittanceOutcomeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class SubDetailComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A service line number.
     */
    protected PositiveIntType sequenceLinkId;

    /**
     * The adjudications results.
     */
    protected List<SubdetailAdjudicationComponent> adjudication;

    private static final long serialVersionUID = 1780202110L;

    /*
     * Constructor
     */
    public SubDetailComponent() {
        super();
    }

    /*
     * Constructor
     */
    public SubDetailComponent(PositiveIntType sequenceLinkId) {
        super();
        this.sequenceLinkId = sequenceLinkId;
    }

    /**
     * @return {@link #sequenceLinkId} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequenceLinkId" gives direct access to the value
     */
    public PositiveIntType getSequenceLinkIdElement() {
        if (this.sequenceLinkId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create SubDetailComponent.sequenceLinkId");
            else if (Configuration.doAutoCreate())
                // bb
                this.sequenceLinkId = new PositiveIntType();
        return this.sequenceLinkId;
    }

    public boolean hasSequenceLinkIdElement() {
        return this.sequenceLinkId != null && !this.sequenceLinkId.isEmpty();
    }

    public boolean hasSequenceLinkId() {
        return this.sequenceLinkId != null && !this.sequenceLinkId.isEmpty();
    }

    /**
     * @param value {@link #sequenceLinkId} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequenceLinkId" gives direct access to the value
     */
    public SubDetailComponent setSequenceLinkIdElement(PositiveIntType value) {
        this.sequenceLinkId = value;
        return this;
    }

    /**
     * @return A service line number.
     */
    public int getSequenceLinkId() {
        return this.sequenceLinkId == null || this.sequenceLinkId.isEmpty() ? 0 : this.sequenceLinkId.getValue();
    }

    /**
     * @param value A service line number.
     */
    public SubDetailComponent setSequenceLinkId(int value) {
        if (this.sequenceLinkId == null)
            this.sequenceLinkId = new PositiveIntType();
        this.sequenceLinkId.setValue(value);
        return this;
    }

    /**
     * @return {@link #adjudication} (The adjudications results.)
     */
    public List<SubdetailAdjudicationComponent> getAdjudication() {
        if (this.adjudication == null)
            this.adjudication = new ArrayList<SubdetailAdjudicationComponent>();
        return this.adjudication;
    }

    public boolean hasAdjudication() {
        if (this.adjudication == null)
            return false;
        for (SubdetailAdjudicationComponent item : this.adjudication) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public SubdetailAdjudicationComponent addAdjudication() {
        // 3
        SubdetailAdjudicationComponent t = new SubdetailAdjudicationComponent();
        if (this.adjudication == null)
            this.adjudication = new ArrayList<SubdetailAdjudicationComponent>();
        this.adjudication.add(t);
        return t;
    }

    // syntactic sugar
    public SubDetailComponent addAdjudication(SubdetailAdjudicationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.adjudication == null)
            this.adjudication = new ArrayList<SubdetailAdjudicationComponent>();
        this.adjudication.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("sequenceLinkId", "positiveInt", "A service line number.", 0, java.lang.Integer.MAX_VALUE, sequenceLinkId));
        childrenList.add(new Property("adjudication", "", "The adjudications results.", 0, java.lang.Integer.MAX_VALUE, adjudication));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequenceLinkId"))
            // PositiveIntType
            this.sequenceLinkId = castToPositiveInt(value);
        else if (name.equals("adjudication"))
            this.getAdjudication().add((SubdetailAdjudicationComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("sequenceLinkId")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.sequenceLinkId");
        } else if (name.equals("adjudication")) {
            return addAdjudication();
        } else
            return super.addChild(name);
    }

    public SubDetailComponent copy() {
        SubDetailComponent dst = new SubDetailComponent();
        copyValues(dst);
        dst.sequenceLinkId = sequenceLinkId == null ? null : sequenceLinkId.copy();
        if (adjudication != null) {
            dst.adjudication = new ArrayList<SubdetailAdjudicationComponent>();
            for (SubdetailAdjudicationComponent i : adjudication) dst.adjudication.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof SubDetailComponent))
            return false;
        SubDetailComponent o = (SubDetailComponent) other;
        return compareDeep(sequenceLinkId, o.sequenceLinkId, true) && compareDeep(adjudication, o.adjudication, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof SubDetailComponent))
            return false;
        SubDetailComponent o = (SubDetailComponent) other;
        return compareValues(sequenceLinkId, o.sequenceLinkId, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (sequenceLinkId == null || sequenceLinkId.isEmpty()) && (adjudication == null || adjudication.isEmpty());
    }

    public String fhirType() {
        return "ClaimResponse.item.detail.subDetail";
    }
}
