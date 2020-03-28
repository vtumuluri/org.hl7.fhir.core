package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.Enumerations.DocumentReferenceStatus;
import org.hl7.fhir.android.generated.dstu2.Enumerations.DocumentReferenceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipType;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipTypeEnumFactory;

public class DocumentReferenceContentComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The document or url of the document along with critical metadata to prove content has integrity.
     */
    protected Attachment attachment;

    /**
     * An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.
     */
    protected List<Coding> format;

    private static final long serialVersionUID = -1412643085L;

    /*
     * Constructor
     */
    public DocumentReferenceContentComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DocumentReferenceContentComponent(Attachment attachment) {
        super();
        this.attachment = attachment;
    }

    /**
     * @return {@link #attachment} (The document or url of the document along with critical metadata to prove content has integrity.)
     */
    public Attachment getAttachment() {
        if (this.attachment == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceContentComponent.attachment");
            else if (Configuration.doAutoCreate())
                // cc
                this.attachment = new Attachment();
        return this.attachment;
    }

    public boolean hasAttachment() {
        return this.attachment != null && !this.attachment.isEmpty();
    }

    /**
     * @param value {@link #attachment} (The document or url of the document along with critical metadata to prove content has integrity.)
     */
    public DocumentReferenceContentComponent setAttachment(Attachment value) {
        this.attachment = value;
        return this;
    }

    /**
     * @return {@link #format} (An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.)
     */
    public List<Coding> getFormat() {
        if (this.format == null)
            this.format = new ArrayList<Coding>();
        return this.format;
    }

    public boolean hasFormat() {
        if (this.format == null)
            return false;
        for (Coding item : this.format) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Coding addFormat() {
        // 3
        Coding t = new Coding();
        if (this.format == null)
            this.format = new ArrayList<Coding>();
        this.format.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReferenceContentComponent addFormat(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.format == null)
            this.format = new ArrayList<Coding>();
        this.format.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("attachment", "Attachment", "The document or url of the document along with critical metadata to prove content has integrity.", 0, java.lang.Integer.MAX_VALUE, attachment));
        childrenList.add(new Property("format", "Coding", "An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.", 0, java.lang.Integer.MAX_VALUE, format));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("attachment"))
            // Attachment
            this.attachment = castToAttachment(value);
        else if (name.equals("format"))
            this.getFormat().add(castToCoding(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("attachment")) {
            this.attachment = new Attachment();
            return this.attachment;
        } else if (name.equals("format")) {
            return addFormat();
        } else
            return super.addChild(name);
    }

    public DocumentReferenceContentComponent copy() {
        DocumentReferenceContentComponent dst = new DocumentReferenceContentComponent();
        copyValues(dst);
        dst.attachment = attachment == null ? null : attachment.copy();
        if (format != null) {
            dst.format = new ArrayList<Coding>();
            for (Coding i : format) dst.format.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DocumentReferenceContentComponent))
            return false;
        DocumentReferenceContentComponent o = (DocumentReferenceContentComponent) other;
        return compareDeep(attachment, o.attachment, true) && compareDeep(format, o.format, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DocumentReferenceContentComponent))
            return false;
        DocumentReferenceContentComponent o = (DocumentReferenceContentComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (attachment == null || attachment.isEmpty()) && (format == null || format.isEmpty());
    }

    public String fhirType() {
        return "DocumentReference.content";
    }
}
