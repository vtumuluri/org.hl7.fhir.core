package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class ComputableLanguageComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).
     */
    protected Type content;

    private static final long serialVersionUID = -1763459053L;

    /*
     * Constructor
     */
    public ComputableLanguageComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ComputableLanguageComponent(Type content) {
        super();
        this.content = content;
    }

    /**
     * @return {@link #content} (Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).)
     */
    public Type getContent() {
        return this.content;
    }

    /**
     * @return {@link #content} (Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).)
     */
    public Attachment getContentAttachment() throws FHIRException {
        if (!(this.content instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but " + this.content.getClass().getName() + " was encountered");
        return (Attachment) this.content;
    }

    public boolean hasContentAttachment() {
        return this.content instanceof Attachment;
    }

    /**
     * @return {@link #content} (Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).)
     */
    public Reference getContentReference() throws FHIRException {
        if (!(this.content instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.content.getClass().getName() + " was encountered");
        return (Reference) this.content;
    }

    public boolean hasContentReference() {
        return this.content instanceof Reference;
    }

    public boolean hasContent() {
        return this.content != null && !this.content.isEmpty();
    }

    /**
     * @param value {@link #content} (Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).)
     */
    public ComputableLanguageComponent setContent(Type value) {
        this.content = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("content[x]", "Attachment|Reference(DocumentReference)", "Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).", 0, java.lang.Integer.MAX_VALUE, content));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("content[x]"))
            // Type
            this.content = (Type) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("contentAttachment")) {
            this.content = new Attachment();
            return this.content;
        } else if (name.equals("contentReference")) {
            this.content = new Reference();
            return this.content;
        } else
            return super.addChild(name);
    }

    public ComputableLanguageComponent copy() {
        ComputableLanguageComponent dst = new ComputableLanguageComponent();
        copyValues(dst);
        dst.content = content == null ? null : content.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ComputableLanguageComponent))
            return false;
        ComputableLanguageComponent o = (ComputableLanguageComponent) other;
        return compareDeep(content, o.content, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ComputableLanguageComponent))
            return false;
        ComputableLanguageComponent o = (ComputableLanguageComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (content == null || content.isEmpty());
    }

    public String fhirType() {
        return "Contract.rule";
    }
}
