package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum.ClinicalImpressionStatus;
import org.hl7.fhir.android.generated.dstu2.ClinicalImpressionEnum.ClinicalImpressionStatusEnumFactory;

public class ClinicalImpressionInvestigationsComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A name/code for the group ("set") of investigations. Typically, this will be something like "signs", "symptoms", "clinical", "diagnostic", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.
     */
    protected CodeableConcept code;

    /**
     * A record of a specific investigation that was undertaken.
     */
    protected List<Reference> item;

    /**
     * The actual objects that are the target of the reference (A record of a specific investigation that was undertaken.)
     */
    protected List<Resource> itemTarget;

    private static final long serialVersionUID = -301363326L;

    /*
     * Constructor
     */
    public ClinicalImpressionInvestigationsComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ClinicalImpressionInvestigationsComponent(CodeableConcept code) {
        super();
        this.code = code;
    }

    /**
     * @return {@link #code} (A name/code for the group ("set") of investigations. Typically, this will be something like "signs", "symptoms", "clinical", "diagnostic", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.)
     */
    public CodeableConcept getCode() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ClinicalImpressionInvestigationsComponent.code");
            else if (Configuration.doAutoCreate())
                // cc
                this.code = new CodeableConcept();
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A name/code for the group ("set") of investigations. Typically, this will be something like "signs", "symptoms", "clinical", "diagnostic", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.)
     */
    public ClinicalImpressionInvestigationsComponent setCode(CodeableConcept value) {
        this.code = value;
        return this;
    }

    /**
     * @return {@link #item} (A record of a specific investigation that was undertaken.)
     */
    public List<Reference> getItem() {
        if (this.item == null)
            this.item = new ArrayList<Reference>();
        return this.item;
    }

    public boolean hasItem() {
        if (this.item == null)
            return false;
        for (Reference item : this.item) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Reference addItem() {
        // 3
        Reference t = new Reference();
        if (this.item == null)
            this.item = new ArrayList<Reference>();
        this.item.add(t);
        return t;
    }

    // syntactic sugar
    public ClinicalImpressionInvestigationsComponent addItem(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.item == null)
            this.item = new ArrayList<Reference>();
        this.item.add(t);
        return this;
    }

    /**
     * @return {@link #item} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. A record of a specific investigation that was undertaken.)
     */
    public List<Resource> getItemTarget() {
        if (this.itemTarget == null)
            this.itemTarget = new ArrayList<Resource>();
        return this.itemTarget;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "CodeableConcept", "A name/code for the group (\"set\") of investigations. Typically, this will be something like \"signs\", \"symptoms\", \"clinical\", \"diagnostic\", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("item", "Reference(Observation|QuestionnaireResponse|FamilyMemberHistory|DiagnosticReport)", "A record of a specific investigation that was undertaken.", 0, java.lang.Integer.MAX_VALUE, item));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // CodeableConcept
            this.code = castToCodeableConcept(value);
        else if (name.equals("item"))
            this.getItem().add(castToReference(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            this.code = new CodeableConcept();
            return this.code;
        } else if (name.equals("item")) {
            return addItem();
        } else
            return super.addChild(name);
    }

    public ClinicalImpressionInvestigationsComponent copy() {
        ClinicalImpressionInvestigationsComponent dst = new ClinicalImpressionInvestigationsComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        if (item != null) {
            dst.item = new ArrayList<Reference>();
            for (Reference i : item) dst.item.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ClinicalImpressionInvestigationsComponent))
            return false;
        ClinicalImpressionInvestigationsComponent o = (ClinicalImpressionInvestigationsComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(item, o.item, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ClinicalImpressionInvestigationsComponent))
            return false;
        ClinicalImpressionInvestigationsComponent o = (ClinicalImpressionInvestigationsComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (item == null || item.isEmpty());
    }

    public String fhirType() {
        return "ClinicalImpression.investigations";
    }
}
