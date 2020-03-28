package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DetectedIssueEnum.DetectedIssueSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DetectedIssueEnum.DetectedIssueSeverity;

public class DetectedIssueMitigationComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with the identified issue.
     */
    protected CodeableConcept action;

    /**
     * Indicates when the mitigating action was documented.
     */
    protected DateTimeType date;

    /**
     * Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.
     */
    protected Reference author;

    /**
     * The actual object that is the target of the reference (Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.)
     */
    protected Practitioner authorTarget;

    private static final long serialVersionUID = -1994768436L;

    /*
     * Constructor
     */
    public DetectedIssueMitigationComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DetectedIssueMitigationComponent(CodeableConcept action) {
        super();
        this.action = action;
    }

    /**
     * @return {@link #action} (Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with the identified issue.)
     */
    public CodeableConcept getAction() {
        if (this.action == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssueMitigationComponent.action");
            else if (Configuration.doAutoCreate())
                // cc
                this.action = new CodeableConcept();
        return this.action;
    }

    public boolean hasAction() {
        return this.action != null && !this.action.isEmpty();
    }

    /**
     * @param value {@link #action} (Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with the identified issue.)
     */
    public DetectedIssueMitigationComponent setAction(CodeableConcept value) {
        this.action = value;
        return this;
    }

    /**
     * @return {@link #date} (Indicates when the mitigating action was documented.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
        if (this.date == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssueMitigationComponent.date");
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
     * @param value {@link #date} (Indicates when the mitigating action was documented.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DetectedIssueMitigationComponent setDateElement(DateTimeType value) {
        this.date = value;
        return this;
    }

    /**
     * @return Indicates when the mitigating action was documented.
     */
    public Date getDate() {
        return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value Indicates when the mitigating action was documented.
     */
    public DetectedIssueMitigationComponent setDate(Date value) {
        if (value == null)
            this.date = null;
        else {
            if (this.date == null)
                this.date = new DateTimeType();
            this.date.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #author} (Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.)
     */
    public Reference getAuthor() {
        if (this.author == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssueMitigationComponent.author");
            else if (Configuration.doAutoCreate())
                // cc
                this.author = new Reference();
        return this.author;
    }

    public boolean hasAuthor() {
        return this.author != null && !this.author.isEmpty();
    }

    /**
     * @param value {@link #author} (Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.)
     */
    public DetectedIssueMitigationComponent setAuthor(Reference value) {
        this.author = value;
        return this;
    }

    /**
     * @return {@link #author} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.)
     */
    public Practitioner getAuthorTarget() {
        if (this.authorTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DetectedIssueMitigationComponent.author");
            else if (Configuration.doAutoCreate())
                // aa
                this.authorTarget = new Practitioner();
        return this.authorTarget;
    }

    /**
     * @param value {@link #author} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.)
     */
    public DetectedIssueMitigationComponent setAuthorTarget(Practitioner value) {
        this.authorTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("action", "CodeableConcept", "Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with the identified issue.", 0, java.lang.Integer.MAX_VALUE, action));
        childrenList.add(new Property("date", "dateTime", "Indicates when the mitigating action was documented.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("author", "Reference(Practitioner)", "Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.", 0, java.lang.Integer.MAX_VALUE, author));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("action"))
            // CodeableConcept
            this.action = castToCodeableConcept(value);
        else if (name.equals("date"))
            // DateTimeType
            this.date = castToDateTime(value);
        else if (name.equals("author"))
            // Reference
            this.author = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("action")) {
            this.action = new CodeableConcept();
            return this.action;
        } else if (name.equals("date")) {
            throw new FHIRException("Cannot call addChild on a primitive type DetectedIssue.date");
        } else if (name.equals("author")) {
            this.author = new Reference();
            return this.author;
        } else
            return super.addChild(name);
    }

    public DetectedIssueMitigationComponent copy() {
        DetectedIssueMitigationComponent dst = new DetectedIssueMitigationComponent();
        copyValues(dst);
        dst.action = action == null ? null : action.copy();
        dst.date = date == null ? null : date.copy();
        dst.author = author == null ? null : author.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DetectedIssueMitigationComponent))
            return false;
        DetectedIssueMitigationComponent o = (DetectedIssueMitigationComponent) other;
        return compareDeep(action, o.action, true) && compareDeep(date, o.date, true) && compareDeep(author, o.author, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DetectedIssueMitigationComponent))
            return false;
        DetectedIssueMitigationComponent o = (DetectedIssueMitigationComponent) other;
        return compareValues(date, o.date, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (action == null || action.isEmpty()) && (date == null || date.isEmpty()) && (author == null || author.isEmpty());
    }

    public String fhirType() {
        return "DetectedIssue.mitigation";
    }
}
