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
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipType;

public class DocumentReferenceContextRelatedComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.
     */
    protected Identifier identifier;

    /**
     * Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.
     */
    protected Reference ref;

    /**
     * The actual object that is the target of the reference (Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
     */
    protected Resource refTarget;

    private static final long serialVersionUID = -1670123330L;

    /*
     * Constructor
     */
    public DocumentReferenceContextRelatedComponent() {
        super();
    }

    /**
     * @return {@link #identifier} (Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceContextRelatedComponent.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
     */
    public DocumentReferenceContextRelatedComponent setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #ref} (Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
     */
    public Reference getRef() {
        if (this.ref == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReferenceContextRelatedComponent.ref");
            else if (Configuration.doAutoCreate())
                // cc
                this.ref = new Reference();
        return this.ref;
    }

    public boolean hasRef() {
        return this.ref != null && !this.ref.isEmpty();
    }

    /**
     * @param value {@link #ref} (Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
     */
    public DocumentReferenceContextRelatedComponent setRef(Reference value) {
        this.ref = value;
        return this;
    }

    /**
     * @return {@link #ref} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
     */
    public Resource getRefTarget() {
        return this.refTarget;
    }

    /**
     * @param value {@link #ref} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
     */
    public DocumentReferenceContextRelatedComponent setRefTarget(Resource value) {
        this.refTarget = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("ref", "Reference(Any)", "Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.", 0, java.lang.Integer.MAX_VALUE, ref));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("ref"))
            // Reference
            this.ref = castToReference(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("ref")) {
            this.ref = new Reference();
            return this.ref;
        } else
            return super.addChild(name);
    }

    public DocumentReferenceContextRelatedComponent copy() {
        DocumentReferenceContextRelatedComponent dst = new DocumentReferenceContextRelatedComponent();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.ref = ref == null ? null : ref.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DocumentReferenceContextRelatedComponent))
            return false;
        DocumentReferenceContextRelatedComponent o = (DocumentReferenceContextRelatedComponent) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(ref, o.ref, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DocumentReferenceContextRelatedComponent))
            return false;
        DocumentReferenceContextRelatedComponent o = (DocumentReferenceContextRelatedComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (ref == null || ref.isEmpty());
    }

    public String fhirType() {
        return "DocumentReference.context.related";
    }
}
