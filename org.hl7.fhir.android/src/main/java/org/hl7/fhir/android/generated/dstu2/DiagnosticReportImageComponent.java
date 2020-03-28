package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DiagnosticReportEnum.DiagnosticReportStatus;
import org.hl7.fhir.android.generated.dstu2.DiagnosticReportEnum.DiagnosticReportStatusEnumFactory;

public class DiagnosticReportImageComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.
     */
    protected StringType comment;

    /**
     * Reference to the image source.
     */
    protected Reference link;

    /**
     * The actual object that is the target of the reference (Reference to the image source.)
     */
    protected Media linkTarget;

    private static final long serialVersionUID = 935791940L;

    /*
     * Constructor
     */
    public DiagnosticReportImageComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DiagnosticReportImageComponent(Reference link) {
        super();
        this.link = link;
    }

    /**
     * @return {@link #comment} (A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
     */
    public StringType getCommentElement() {
        if (this.comment == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReportImageComponent.comment");
            else if (Configuration.doAutoCreate())
                // bb
                this.comment = new StringType();
        return this.comment;
    }

    public boolean hasCommentElement() {
        return this.comment != null && !this.comment.isEmpty();
    }

    public boolean hasComment() {
        return this.comment != null && !this.comment.isEmpty();
    }

    /**
     * @param value {@link #comment} (A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
     */
    public DiagnosticReportImageComponent setCommentElement(StringType value) {
        this.comment = value;
        return this;
    }

    /**
     * @return A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.
     */
    public String getComment() {
        return this.comment == null ? null : this.comment.getValue();
    }

    /**
     * @param value A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.
     */
    public DiagnosticReportImageComponent setComment(String value) {
        if (Utilities.noString(value))
            this.comment = null;
        else {
            if (this.comment == null)
                this.comment = new StringType();
            this.comment.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #link} (Reference to the image source.)
     */
    public Reference getLink() {
        if (this.link == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReportImageComponent.link");
            else if (Configuration.doAutoCreate())
                // cc
                this.link = new Reference();
        return this.link;
    }

    public boolean hasLink() {
        return this.link != null && !this.link.isEmpty();
    }

    /**
     * @param value {@link #link} (Reference to the image source.)
     */
    public DiagnosticReportImageComponent setLink(Reference value) {
        this.link = value;
        return this;
    }

    /**
     * @return {@link #link} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Reference to the image source.)
     */
    public Media getLinkTarget() {
        if (this.linkTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DiagnosticReportImageComponent.link");
            else if (Configuration.doAutoCreate())
                // aa
                this.linkTarget = new Media();
        return this.linkTarget;
    }

    /**
     * @param value {@link #link} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Reference to the image source.)
     */
    public DiagnosticReportImageComponent setLinkTarget(Media value) {
        this.linkTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("comment", "string", "A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.", 0, java.lang.Integer.MAX_VALUE, comment));
        childrenList.add(new Property("link", "Reference(Media)", "Reference to the image source.", 0, java.lang.Integer.MAX_VALUE, link));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("comment"))
            // StringType
            this.comment = castToString(value);
        else if (name.equals("link"))
            // Reference
            this.link = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("comment")) {
            throw new FHIRException("Cannot call addChild on a primitive type DiagnosticReport.comment");
        } else if (name.equals("link")) {
            this.link = new Reference();
            return this.link;
        } else
            return super.addChild(name);
    }

    public DiagnosticReportImageComponent copy() {
        DiagnosticReportImageComponent dst = new DiagnosticReportImageComponent();
        copyValues(dst);
        dst.comment = comment == null ? null : comment.copy();
        dst.link = link == null ? null : link.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DiagnosticReportImageComponent))
            return false;
        DiagnosticReportImageComponent o = (DiagnosticReportImageComponent) other;
        return compareDeep(comment, o.comment, true) && compareDeep(link, o.link, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DiagnosticReportImageComponent))
            return false;
        DiagnosticReportImageComponent o = (DiagnosticReportImageComponent) other;
        return compareValues(comment, o.comment, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (comment == null || comment.isEmpty()) && (link == null || link.isEmpty());
    }

    public String fhirType() {
        return "DiagnosticReport.image";
    }
}
