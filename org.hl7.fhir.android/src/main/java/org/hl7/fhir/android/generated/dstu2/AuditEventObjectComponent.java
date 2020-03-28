package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcome;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventOutcomeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventAction;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventActionEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkType;
import org.hl7.fhir.android.generated.dstu2.AuditEventEnum.AuditEventParticipantNetworkTypeEnumFactory;

public class AuditEventObjectComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Identifies a specific instance of the participant object. The reference should always be version specific.
     */
    protected Identifier identifier;

    /**
     * Identifies a specific instance of the participant object. The reference should always be version specific.
     */
    protected Reference reference;

    /**
     * The actual object that is the target of the reference (Identifies a specific instance of the participant object. The reference should always be version specific.)
     */
    protected Resource referenceTarget;

    /**
     * The type of the object that was involved in this audit event.
     */
    protected Coding type;

    /**
     * Code representing the functional application role of Participant Object being audited.
     */
    protected Coding role;

    /**
     * Identifier for the data life-cycle stage for the participant object.
     */
    protected Coding lifecycle;

    /**
     * Denotes security labels for the identified object.
     */
    protected List<Coding> securityLabel;

    /**
     * An instance-specific descriptor of the Participant Object ID audited, such as a person's name.
     */
    protected StringType name;

    /**
     * Text that describes the object in more detail.
     */
    protected StringType description;

    /**
     * The actual query for a query-type participant object.
     */
    protected Base64BinaryType query;

    /**
     * Additional Information about the Object.
     */
    protected List<AuditEventObjectDetailComponent> detail;

    private static final long serialVersionUID = 997591908L;

    /*
     * Constructor
     */
    public AuditEventObjectComponent() {
        super();
    }

    /**
     * @return {@link #identifier} (Identifies a specific instance of the participant object. The reference should always be version specific.)
     */
    public Identifier getIdentifier() {
        if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventObjectComponent.identifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.identifier = new Identifier();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Identifies a specific instance of the participant object. The reference should always be version specific.)
     */
    public AuditEventObjectComponent setIdentifier(Identifier value) {
        this.identifier = value;
        return this;
    }

    /**
     * @return {@link #reference} (Identifies a specific instance of the participant object. The reference should always be version specific.)
     */
    public Reference getReference() {
        if (this.reference == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventObjectComponent.reference");
            else if (Configuration.doAutoCreate())
                // cc
                this.reference = new Reference();
        return this.reference;
    }

    public boolean hasReference() {
        return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (Identifies a specific instance of the participant object. The reference should always be version specific.)
     */
    public AuditEventObjectComponent setReference(Reference value) {
        this.reference = value;
        return this;
    }

    /**
     * @return {@link #reference} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies a specific instance of the participant object. The reference should always be version specific.)
     */
    public Resource getReferenceTarget() {
        return this.referenceTarget;
    }

    /**
     * @param value {@link #reference} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies a specific instance of the participant object. The reference should always be version specific.)
     */
    public AuditEventObjectComponent setReferenceTarget(Resource value) {
        this.referenceTarget = value;
        return this;
    }

    /**
     * @return {@link #type} (The type of the object that was involved in this audit event.)
     */
    public Coding getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventObjectComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new Coding();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of the object that was involved in this audit event.)
     */
    public AuditEventObjectComponent setType(Coding value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #role} (Code representing the functional application role of Participant Object being audited.)
     */
    public Coding getRole() {
        if (this.role == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventObjectComponent.role");
            else if (Configuration.doAutoCreate())
                // cc
                this.role = new Coding();
        return this.role;
    }

    public boolean hasRole() {
        return this.role != null && !this.role.isEmpty();
    }

    /**
     * @param value {@link #role} (Code representing the functional application role of Participant Object being audited.)
     */
    public AuditEventObjectComponent setRole(Coding value) {
        this.role = value;
        return this;
    }

    /**
     * @return {@link #lifecycle} (Identifier for the data life-cycle stage for the participant object.)
     */
    public Coding getLifecycle() {
        if (this.lifecycle == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventObjectComponent.lifecycle");
            else if (Configuration.doAutoCreate())
                // cc
                this.lifecycle = new Coding();
        return this.lifecycle;
    }

    public boolean hasLifecycle() {
        return this.lifecycle != null && !this.lifecycle.isEmpty();
    }

    /**
     * @param value {@link #lifecycle} (Identifier for the data life-cycle stage for the participant object.)
     */
    public AuditEventObjectComponent setLifecycle(Coding value) {
        this.lifecycle = value;
        return this;
    }

    /**
     * @return {@link #securityLabel} (Denotes security labels for the identified object.)
     */
    public List<Coding> getSecurityLabel() {
        if (this.securityLabel == null)
            this.securityLabel = new ArrayList<Coding>();
        return this.securityLabel;
    }

    public boolean hasSecurityLabel() {
        if (this.securityLabel == null)
            return false;
        for (Coding item : this.securityLabel) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Coding addSecurityLabel() {
        // 3
        Coding t = new Coding();
        if (this.securityLabel == null)
            this.securityLabel = new ArrayList<Coding>();
        this.securityLabel.add(t);
        return t;
    }

    // syntactic sugar
    public AuditEventObjectComponent addSecurityLabel(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.securityLabel == null)
            this.securityLabel = new ArrayList<Coding>();
        this.securityLabel.add(t);
        return this;
    }

    /**
     * @return {@link #name} (An instance-specific descriptor of the Participant Object ID audited, such as a person's name.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventObjectComponent.name");
            else if (Configuration.doAutoCreate())
                // bb
                this.name = new StringType();
        return this.name;
    }

    public boolean hasNameElement() {
        return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (An instance-specific descriptor of the Participant Object ID audited, such as a person's name.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public AuditEventObjectComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return An instance-specific descriptor of the Participant Object ID audited, such as a person's name.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value An instance-specific descriptor of the Participant Object ID audited, such as a person's name.
     */
    public AuditEventObjectComponent setName(String value) {
        if (Utilities.noString(value))
            this.name = null;
        else {
            if (this.name == null)
                this.name = new StringType();
            this.name.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #description} (Text that describes the object in more detail.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventObjectComponent.description");
            else if (Configuration.doAutoCreate())
                // bb
                this.description = new StringType();
        return this.description;
    }

    public boolean hasDescriptionElement() {
        return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Text that describes the object in more detail.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public AuditEventObjectComponent setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Text that describes the object in more detail.
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Text that describes the object in more detail.
     */
    public AuditEventObjectComponent setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #query} (The actual query for a query-type participant object.). This is the underlying object with id, value and extensions. The accessor "getQuery" gives direct access to the value
     */
    public Base64BinaryType getQueryElement() {
        if (this.query == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventObjectComponent.query");
            else if (Configuration.doAutoCreate())
                // bb
                this.query = new Base64BinaryType();
        return this.query;
    }

    public boolean hasQueryElement() {
        return this.query != null && !this.query.isEmpty();
    }

    public boolean hasQuery() {
        return this.query != null && !this.query.isEmpty();
    }

    /**
     * @param value {@link #query} (The actual query for a query-type participant object.). This is the underlying object with id, value and extensions. The accessor "getQuery" gives direct access to the value
     */
    public AuditEventObjectComponent setQueryElement(Base64BinaryType value) {
        this.query = value;
        return this;
    }

    /**
     * @return The actual query for a query-type participant object.
     */
    public byte[] getQuery() {
        return this.query == null ? null : this.query.getValue();
    }

    /**
     * @param value The actual query for a query-type participant object.
     */
    public AuditEventObjectComponent setQuery(byte[] value) {
        if (value == null)
            this.query = null;
        else {
            if (this.query == null)
                this.query = new Base64BinaryType();
            this.query.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #detail} (Additional Information about the Object.)
     */
    public List<AuditEventObjectDetailComponent> getDetail() {
        if (this.detail == null)
            this.detail = new ArrayList<AuditEventObjectDetailComponent>();
        return this.detail;
    }

    public boolean hasDetail() {
        if (this.detail == null)
            return false;
        for (AuditEventObjectDetailComponent item : this.detail) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public AuditEventObjectDetailComponent addDetail() {
        // 3
        AuditEventObjectDetailComponent t = new AuditEventObjectDetailComponent();
        if (this.detail == null)
            this.detail = new ArrayList<AuditEventObjectDetailComponent>();
        this.detail.add(t);
        return t;
    }

    // syntactic sugar
    public AuditEventObjectComponent addDetail(AuditEventObjectDetailComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.detail == null)
            this.detail = new ArrayList<AuditEventObjectDetailComponent>();
        this.detail.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifies a specific instance of the participant object. The reference should always be version specific.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("reference", "Reference(Any)", "Identifies a specific instance of the participant object. The reference should always be version specific.", 0, java.lang.Integer.MAX_VALUE, reference));
        childrenList.add(new Property("type", "Coding", "The type of the object that was involved in this audit event.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("role", "Coding", "Code representing the functional application role of Participant Object being audited.", 0, java.lang.Integer.MAX_VALUE, role));
        childrenList.add(new Property("lifecycle", "Coding", "Identifier for the data life-cycle stage for the participant object.", 0, java.lang.Integer.MAX_VALUE, lifecycle));
        childrenList.add(new Property("securityLabel", "Coding", "Denotes security labels for the identified object.", 0, java.lang.Integer.MAX_VALUE, securityLabel));
        childrenList.add(new Property("name", "string", "An instance-specific descriptor of the Participant Object ID audited, such as a person's name.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("description", "string", "Text that describes the object in more detail.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("query", "base64Binary", "The actual query for a query-type participant object.", 0, java.lang.Integer.MAX_VALUE, query));
        childrenList.add(new Property("detail", "", "Additional Information about the Object.", 0, java.lang.Integer.MAX_VALUE, detail));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            // Identifier
            this.identifier = castToIdentifier(value);
        else if (name.equals("reference"))
            // Reference
            this.reference = castToReference(value);
        else if (name.equals("type"))
            // Coding
            this.type = castToCoding(value);
        else if (name.equals("role"))
            // Coding
            this.role = castToCoding(value);
        else if (name.equals("lifecycle"))
            // Coding
            this.lifecycle = castToCoding(value);
        else if (name.equals("securityLabel"))
            this.getSecurityLabel().add(castToCoding(value));
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("query"))
            // Base64BinaryType
            this.query = castToBase64Binary(value);
        else if (name.equals("detail"))
            this.getDetail().add((AuditEventObjectDetailComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            this.identifier = new Identifier();
            return this.identifier;
        } else if (name.equals("reference")) {
            this.reference = new Reference();
            return this.reference;
        } else if (name.equals("type")) {
            this.type = new Coding();
            return this.type;
        } else if (name.equals("role")) {
            this.role = new Coding();
            return this.role;
        } else if (name.equals("lifecycle")) {
            this.lifecycle = new Coding();
            return this.lifecycle;
        } else if (name.equals("securityLabel")) {
            return addSecurityLabel();
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.name");
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.description");
        } else if (name.equals("query")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.query");
        } else if (name.equals("detail")) {
            return addDetail();
        } else
            return super.addChild(name);
    }

    public AuditEventObjectComponent copy() {
        AuditEventObjectComponent dst = new AuditEventObjectComponent();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.reference = reference == null ? null : reference.copy();
        dst.type = type == null ? null : type.copy();
        dst.role = role == null ? null : role.copy();
        dst.lifecycle = lifecycle == null ? null : lifecycle.copy();
        if (securityLabel != null) {
            dst.securityLabel = new ArrayList<Coding>();
            for (Coding i : securityLabel) dst.securityLabel.add(i.copy());
        }
        ;
        dst.name = name == null ? null : name.copy();
        dst.description = description == null ? null : description.copy();
        dst.query = query == null ? null : query.copy();
        if (detail != null) {
            dst.detail = new ArrayList<AuditEventObjectDetailComponent>();
            for (AuditEventObjectDetailComponent i : detail) dst.detail.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AuditEventObjectComponent))
            return false;
        AuditEventObjectComponent o = (AuditEventObjectComponent) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(reference, o.reference, true) && compareDeep(type, o.type, true) && compareDeep(role, o.role, true) && compareDeep(lifecycle, o.lifecycle, true) && compareDeep(securityLabel, o.securityLabel, true) && compareDeep(name, o.name, true) && compareDeep(description, o.description, true) && compareDeep(query, o.query, true) && compareDeep(detail, o.detail, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AuditEventObjectComponent))
            return false;
        AuditEventObjectComponent o = (AuditEventObjectComponent) other;
        return compareValues(name, o.name, true) && compareValues(description, o.description, true) && compareValues(query, o.query, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (reference == null || reference.isEmpty()) && (type == null || type.isEmpty()) && (role == null || role.isEmpty()) && (lifecycle == null || lifecycle.isEmpty()) && (securityLabel == null || securityLabel.isEmpty()) && (name == null || name.isEmpty()) && (description == null || description.isEmpty()) && (query == null || query.isEmpty()) && (detail == null || detail.isEmpty());
    }

    public String fhirType() {
        return "AuditEvent.object";
    }
}
