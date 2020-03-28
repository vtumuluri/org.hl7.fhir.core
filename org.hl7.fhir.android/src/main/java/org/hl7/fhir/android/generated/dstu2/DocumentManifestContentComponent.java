package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DocumentReferenceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DocumentReferenceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class DocumentManifestContentComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.
     */
    protected Type p;

    private static final long serialVersionUID = -347538500L;

    /*
     * Constructor
     */
    public DocumentManifestContentComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DocumentManifestContentComponent(Type p) {
        super();
        this.p = p;
    }

    /**
     * @return {@link #p} (The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.)
     */
    public Type getP() {
        return this.p;
    }

    /**
     * @return {@link #p} (The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.)
     */
    public Attachment getPAttachment() throws FHIRException {
        if (!(this.p instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but " + this.p.getClass().getName() + " was encountered");
        return (Attachment) this.p;
    }

    public boolean hasPAttachment() {
        return this.p instanceof Attachment;
    }

    /**
     * @return {@link #p} (The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.)
     */
    public Reference getPReference() throws FHIRException {
        if (!(this.p instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.p.getClass().getName() + " was encountered");
        return (Reference) this.p;
    }

    public boolean hasPReference() {
        return this.p instanceof Reference;
    }

    public boolean hasP() {
        return this.p != null && !this.p.isEmpty();
    }

    /**
     * @param value {@link #p} (The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.)
     */
    public DocumentManifestContentComponent setP(Type value) {
        this.p = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("p[x]", "Attachment|Reference(Any)", "The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.", 0, java.lang.Integer.MAX_VALUE, p));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("p[x]"))
            // Type
            this.p = (Type) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("pAttachment")) {
            this.p = new Attachment();
            return this.p;
        } else if (name.equals("pReference")) {
            this.p = new Reference();
            return this.p;
        } else
            return super.addChild(name);
    }

    public DocumentManifestContentComponent copy() {
        DocumentManifestContentComponent dst = new DocumentManifestContentComponent();
        copyValues(dst);
        dst.p = p == null ? null : p.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DocumentManifestContentComponent))
            return false;
        DocumentManifestContentComponent o = (DocumentManifestContentComponent) other;
        return compareDeep(p, o.p, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DocumentManifestContentComponent))
            return false;
        DocumentManifestContentComponent o = (DocumentManifestContentComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (p == null || p.isEmpty());
    }

    public String fhirType() {
        return "DocumentManifest.content";
    }
}
