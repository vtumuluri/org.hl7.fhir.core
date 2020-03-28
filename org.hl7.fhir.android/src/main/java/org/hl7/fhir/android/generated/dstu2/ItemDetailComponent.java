package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.RemittanceOutcome;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.RemittanceOutcomeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class ItemDetailComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A service line number.
     */
    protected PositiveIntType sequenceLinkId;

    /**
     * The adjudications results.
     */
    protected List<DetailAdjudicationComponent> adjudication;

    /**
     * The third tier service adjudications for submitted services.
     */
    protected List<SubDetailComponent> subDetail;

    private static final long serialVersionUID = -1751018357L;

    /*
     * Constructor
     */
    public ItemDetailComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ItemDetailComponent(PositiveIntType sequenceLinkId) {
        super();
        this.sequenceLinkId = sequenceLinkId;
    }

    /**
     * @return {@link #sequenceLinkId} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequenceLinkId" gives direct access to the value
     */
    public PositiveIntType getSequenceLinkIdElement() {
        if (this.sequenceLinkId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ItemDetailComponent.sequenceLinkId");
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
    public ItemDetailComponent setSequenceLinkIdElement(PositiveIntType value) {
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
    public ItemDetailComponent setSequenceLinkId(int value) {
        if (this.sequenceLinkId == null)
            this.sequenceLinkId = new PositiveIntType();
        this.sequenceLinkId.setValue(value);
        return this;
    }

    /**
     * @return {@link #adjudication} (The adjudications results.)
     */
    public List<DetailAdjudicationComponent> getAdjudication() {
        if (this.adjudication == null)
            this.adjudication = new ArrayList<DetailAdjudicationComponent>();
        return this.adjudication;
    }

    public boolean hasAdjudication() {
        if (this.adjudication == null)
            return false;
        for (DetailAdjudicationComponent item : this.adjudication) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public DetailAdjudicationComponent addAdjudication() {
        // 3
        DetailAdjudicationComponent t = new DetailAdjudicationComponent();
        if (this.adjudication == null)
            this.adjudication = new ArrayList<DetailAdjudicationComponent>();
        this.adjudication.add(t);
        return t;
    }

    // syntactic sugar
    public ItemDetailComponent addAdjudication(DetailAdjudicationComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.adjudication == null)
            this.adjudication = new ArrayList<DetailAdjudicationComponent>();
        this.adjudication.add(t);
        return this;
    }

    /**
     * @return {@link #subDetail} (The third tier service adjudications for submitted services.)
     */
    public List<SubDetailComponent> getSubDetail() {
        if (this.subDetail == null)
            this.subDetail = new ArrayList<SubDetailComponent>();
        return this.subDetail;
    }

    public boolean hasSubDetail() {
        if (this.subDetail == null)
            return false;
        for (SubDetailComponent item : this.subDetail) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public SubDetailComponent addSubDetail() {
        // 3
        SubDetailComponent t = new SubDetailComponent();
        if (this.subDetail == null)
            this.subDetail = new ArrayList<SubDetailComponent>();
        this.subDetail.add(t);
        return t;
    }

    // syntactic sugar
    public ItemDetailComponent addSubDetail(SubDetailComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.subDetail == null)
            this.subDetail = new ArrayList<SubDetailComponent>();
        this.subDetail.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("sequenceLinkId", "positiveInt", "A service line number.", 0, java.lang.Integer.MAX_VALUE, sequenceLinkId));
        childrenList.add(new Property("adjudication", "", "The adjudications results.", 0, java.lang.Integer.MAX_VALUE, adjudication));
        childrenList.add(new Property("subDetail", "", "The third tier service adjudications for submitted services.", 0, java.lang.Integer.MAX_VALUE, subDetail));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequenceLinkId"))
            // PositiveIntType
            this.sequenceLinkId = castToPositiveInt(value);
        else if (name.equals("adjudication"))
            this.getAdjudication().add((DetailAdjudicationComponent) value);
        else if (name.equals("subDetail"))
            this.getSubDetail().add((SubDetailComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("sequenceLinkId")) {
            throw new FHIRException("Cannot call addChild on a primitive type ClaimResponse.sequenceLinkId");
        } else if (name.equals("adjudication")) {
            return addAdjudication();
        } else if (name.equals("subDetail")) {
            return addSubDetail();
        } else
            return super.addChild(name);
    }

    public ItemDetailComponent copy() {
        ItemDetailComponent dst = new ItemDetailComponent();
        copyValues(dst);
        dst.sequenceLinkId = sequenceLinkId == null ? null : sequenceLinkId.copy();
        if (adjudication != null) {
            dst.adjudication = new ArrayList<DetailAdjudicationComponent>();
            for (DetailAdjudicationComponent i : adjudication) dst.adjudication.add(i.copy());
        }
        ;
        if (subDetail != null) {
            dst.subDetail = new ArrayList<SubDetailComponent>();
            for (SubDetailComponent i : subDetail) dst.subDetail.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ItemDetailComponent))
            return false;
        ItemDetailComponent o = (ItemDetailComponent) other;
        return compareDeep(sequenceLinkId, o.sequenceLinkId, true) && compareDeep(adjudication, o.adjudication, true) && compareDeep(subDetail, o.subDetail, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ItemDetailComponent))
            return false;
        ItemDetailComponent o = (ItemDetailComponent) other;
        return compareValues(sequenceLinkId, o.sequenceLinkId, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (sequenceLinkId == null || sequenceLinkId.isEmpty()) && (adjudication == null || adjudication.isEmpty()) && (subDetail == null || subDetail.isEmpty());
    }

    public String fhirType() {
        return "ClaimResponse.item.detail";
    }
}
