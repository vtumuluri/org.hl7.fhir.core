package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipType;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipTypeEnumFactory;

public class DocumentReferenceRelatesToComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The type of relationship that this document has with anther document.
     */
    protected Enumeration<DocumentRelationshipType> code;

    /**
     * The target document of this relationship.
     */
    protected Reference target;

    /**
     * The actual object that is the target of the reference (The target document of this relationship.)
     */
    protected DocumentReference targetTarget;

    private static final long serialVersionUID = -347257495L;

    /*
     * Constructor
     */
    public DocumentReferenceRelatesToComponent() {
        super();
    }

    /*
     * Constructor
     */
    public DocumentReferenceRelatesToComponent(Enumeration<DocumentRelationshipType> code, Reference target) {
        super();
        this.code = code;
        this.target = target;
    }

    /**
     * @return {@link #code} (The type of relationship that this document has with anther document.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public Enumeration<DocumentRelationshipType> getCodeElement() {
        if (this.code == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceRelatesToComponent.code");
            else if (Configuration.doAutoCreate())
                // bb
                this.code = new Enumeration<DocumentRelationshipType>(new DocumentRelationshipTypeEnumFactory());
        return this.code;
    }

    public boolean hasCodeElement() {
        return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
        return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (The type of relationship that this document has with anther document.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public DocumentReferenceRelatesToComponent setCodeElement(Enumeration<DocumentRelationshipType> value) {
        this.code = value;
        return this;
    }

    /**
     * @return The type of relationship that this document has with anther document.
     */
    public DocumentRelationshipType getCode() {
        return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value The type of relationship that this document has with anther document.
     */
    public DocumentReferenceRelatesToComponent setCode(DocumentRelationshipType value) {
        if (this.code == null)
            this.code = new Enumeration<DocumentRelationshipType>(new DocumentRelationshipTypeEnumFactory());
        this.code.setValue(value);
        return this;
    }

    /**
     * @return {@link #target} (The target document of this relationship.)
     */
    public Reference getTarget() {
        if (this.target == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceRelatesToComponent.target");
            else if (Configuration.doAutoCreate())
                // cc
                this.target = new Reference();
        return this.target;
    }

    public boolean hasTarget() {
        return this.target != null && !this.target.isEmpty();
    }

    /**
     * @param value {@link #target} (The target document of this relationship.)
     */
    public DocumentReferenceRelatesToComponent setTarget(Reference value) {
        this.target = value;
        return this;
    }

    /**
     * @return {@link #target} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The target document of this relationship.)
     */
    public DocumentReference getTargetTarget() {
        if (this.targetTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceRelatesToComponent.target");
            else if (Configuration.doAutoCreate())
                // aa
                this.targetTarget = new DocumentReference();
        return this.targetTarget;
    }

    /**
     * @param value {@link #target} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The target document of this relationship.)
     */
    public DocumentReferenceRelatesToComponent setTargetTarget(DocumentReference value) {
        this.targetTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("code", "code", "The type of relationship that this document has with anther document.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("target", "Reference(DocumentReference)", "The target document of this relationship.", 0, java.lang.Integer.MAX_VALUE, target));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code"))
            // Enumeration<DocumentRelationshipType>
            this.code = new DocumentRelationshipTypeEnumFactory().fromType(value);
        else if (name.equals("target"))
            // Reference
            this.target = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentReference.code");
        } else if (name.equals("target")) {
            this.target = new Reference();
            return this.target;
        } else
            return super.addChild(name);
    }

    public DocumentReferenceRelatesToComponent copy() {
        DocumentReferenceRelatesToComponent dst = new DocumentReferenceRelatesToComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.target = target == null ? null : target.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DocumentReferenceRelatesToComponent))
            return false;
        DocumentReferenceRelatesToComponent o = (DocumentReferenceRelatesToComponent) other;
        return compareDeep(code, o.code, true) && compareDeep(target, o.target, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DocumentReferenceRelatesToComponent))
            return false;
        DocumentReferenceRelatesToComponent o = (DocumentReferenceRelatesToComponent) other;
        return compareValues(code, o.code, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (code == null || code.isEmpty()) && (target == null || target.isEmpty());
    }

    public String fhirType() {
        return "DocumentReference.relatesTo";
    }
}
