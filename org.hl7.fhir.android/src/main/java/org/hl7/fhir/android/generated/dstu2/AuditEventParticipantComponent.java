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

public class AuditEventParticipantComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Specification of the role(s) the user plays when performing the event. Usually the codes used in this element are local codes defined by the role-based access control security system used in the local context.
     */
    protected List<CodeableConcept> role;

    /**
     * Direct reference to a resource that identifies the participant.
     */
    protected Reference reference;

    /**
     * The actual object that is the target of the reference (Direct reference to a resource that identifies the participant.)
     */
    protected Resource referenceTarget;

    /**
     * Unique identifier for the user actively participating in the event.
     */
    protected Identifier userId;

    /**
     * Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available.
     */
    protected StringType altId;

    /**
     * Human-meaningful name for the user.
     */
    protected StringType name;

    /**
     * Indicator that the user is or is not the requestor, or initiator, for the event being audited.
     */
    protected BooleanType requestor;

    /**
     * Where the event occurred.
     */
    protected Reference location;

    /**
     * The actual object that is the target of the reference (Where the event occurred.)
     */
    protected Location locationTarget;

    /**
     * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
     */
    protected List<UriType> policy;

    /**
     * Type of media involved. Used when the event is about exporting/importing onto media.
     */
    protected Coding media;

    /**
     * Logical network location for application activity, if the activity has a network location.
     */
    protected AuditEventParticipantNetworkComponent network;

    /**
     * The reason (purpose of use), specific to this participant, that was used during the event being recorded.
     */
    protected List<Coding> purposeOfUse;

    private static final long serialVersionUID = -1783296995L;

    /*
     * Constructor
     */
    public AuditEventParticipantComponent() {
        super();
    }

    /*
     * Constructor
     */
    public AuditEventParticipantComponent(BooleanType requestor) {
        super();
        this.requestor = requestor;
    }

    /**
     * @return {@link #role} (Specification of the role(s) the user plays when performing the event. Usually the codes used in this element are local codes defined by the role-based access control security system used in the local context.)
     */
    public List<CodeableConcept> getRole() {
        if (this.role == null)
            this.role = new ArrayList<CodeableConcept>();
        return this.role;
    }

    public boolean hasRole() {
        if (this.role == null)
            return false;
        for (CodeableConcept item : this.role) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public CodeableConcept addRole() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.role == null)
            this.role = new ArrayList<CodeableConcept>();
        this.role.add(t);
        return t;
    }

    // syntactic sugar
    public AuditEventParticipantComponent addRole(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.role == null)
            this.role = new ArrayList<CodeableConcept>();
        this.role.add(t);
        return this;
    }

    /**
     * @return {@link #reference} (Direct reference to a resource that identifies the participant.)
     */
    public Reference getReference() {
        if (this.reference == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantComponent.reference");
            else if (Configuration.doAutoCreate())
                // cc
                this.reference = new Reference();
        return this.reference;
    }

    public boolean hasReference() {
        return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (Direct reference to a resource that identifies the participant.)
     */
    public AuditEventParticipantComponent setReference(Reference value) {
        this.reference = value;
        return this;
    }

    /**
     * @return {@link #reference} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Direct reference to a resource that identifies the participant.)
     */
    public Resource getReferenceTarget() {
        return this.referenceTarget;
    }

    /**
     * @param value {@link #reference} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Direct reference to a resource that identifies the participant.)
     */
    public AuditEventParticipantComponent setReferenceTarget(Resource value) {
        this.referenceTarget = value;
        return this;
    }

    /**
     * @return {@link #userId} (Unique identifier for the user actively participating in the event.)
     */
    public Identifier getUserId() {
        if (this.userId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantComponent.userId");
            else if (Configuration.doAutoCreate())
                // cc
                this.userId = new Identifier();
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null && !this.userId.isEmpty();
    }

    /**
     * @param value {@link #userId} (Unique identifier for the user actively participating in the event.)
     */
    public AuditEventParticipantComponent setUserId(Identifier value) {
        this.userId = value;
        return this;
    }

    /**
     * @return {@link #altId} (Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available.). This is the underlying object with id, value and extensions. The accessor "getAltId" gives direct access to the value
     */
    public StringType getAltIdElement() {
        if (this.altId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantComponent.altId");
            else if (Configuration.doAutoCreate())
                // bb
                this.altId = new StringType();
        return this.altId;
    }

    public boolean hasAltIdElement() {
        return this.altId != null && !this.altId.isEmpty();
    }

    public boolean hasAltId() {
        return this.altId != null && !this.altId.isEmpty();
    }

    /**
     * @param value {@link #altId} (Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available.). This is the underlying object with id, value and extensions. The accessor "getAltId" gives direct access to the value
     */
    public AuditEventParticipantComponent setAltIdElement(StringType value) {
        this.altId = value;
        return this;
    }

    /**
     * @return Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available.
     */
    public String getAltId() {
        return this.altId == null ? null : this.altId.getValue();
    }

    /**
     * @param value Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available.
     */
    public AuditEventParticipantComponent setAltId(String value) {
        if (Utilities.noString(value))
            this.altId = null;
        else {
            if (this.altId == null)
                this.altId = new StringType();
            this.altId.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #name} (Human-meaningful name for the user.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() {
        if (this.name == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantComponent.name");
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
     * @param value {@link #name} (Human-meaningful name for the user.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public AuditEventParticipantComponent setNameElement(StringType value) {
        this.name = value;
        return this;
    }

    /**
     * @return Human-meaningful name for the user.
     */
    public String getName() {
        return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Human-meaningful name for the user.
     */
    public AuditEventParticipantComponent setName(String value) {
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
     * @return {@link #requestor} (Indicator that the user is or is not the requestor, or initiator, for the event being audited.). This is the underlying object with id, value and extensions. The accessor "getRequestor" gives direct access to the value
     */
    public BooleanType getRequestorElement() {
        if (this.requestor == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantComponent.requestor");
            else if (Configuration.doAutoCreate())
                // bb
                this.requestor = new BooleanType();
        return this.requestor;
    }

    public boolean hasRequestorElement() {
        return this.requestor != null && !this.requestor.isEmpty();
    }

    public boolean hasRequestor() {
        return this.requestor != null && !this.requestor.isEmpty();
    }

    /**
     * @param value {@link #requestor} (Indicator that the user is or is not the requestor, or initiator, for the event being audited.). This is the underlying object with id, value and extensions. The accessor "getRequestor" gives direct access to the value
     */
    public AuditEventParticipantComponent setRequestorElement(BooleanType value) {
        this.requestor = value;
        return this;
    }

    /**
     * @return Indicator that the user is or is not the requestor, or initiator, for the event being audited.
     */
    public boolean getRequestor() {
        return this.requestor == null || this.requestor.isEmpty() ? false : this.requestor.getValue();
    }

    /**
     * @param value Indicator that the user is or is not the requestor, or initiator, for the event being audited.
     */
    public AuditEventParticipantComponent setRequestor(boolean value) {
        if (this.requestor == null)
            this.requestor = new BooleanType();
        this.requestor.setValue(value);
        return this;
    }

    /**
     * @return {@link #location} (Where the event occurred.)
     */
    public Reference getLocation() {
        if (this.location == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantComponent.location");
            else if (Configuration.doAutoCreate())
                // cc
                this.location = new Reference();
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (Where the event occurred.)
     */
    public AuditEventParticipantComponent setLocation(Reference value) {
        this.location = value;
        return this;
    }

    /**
     * @return {@link #location} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Where the event occurred.)
     */
    public Location getLocationTarget() {
        if (this.locationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantComponent.location");
            else if (Configuration.doAutoCreate())
                // aa
                this.locationTarget = new Location();
        return this.locationTarget;
    }

    /**
     * @param value {@link #location} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Where the event occurred.)
     */
    public AuditEventParticipantComponent setLocationTarget(Location value) {
        this.locationTarget = value;
        return this;
    }

    /**
     * @return {@link #policy} (The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.)
     */
    public List<UriType> getPolicy() {
        if (this.policy == null)
            this.policy = new ArrayList<UriType>();
        return this.policy;
    }

    public boolean hasPolicy() {
        if (this.policy == null)
            return false;
        for (UriType item : this.policy) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public UriType addPolicyElement() {
        // 2
        UriType t = new UriType();
        if (this.policy == null)
            this.policy = new ArrayList<UriType>();
        this.policy.add(t);
        return t;
    }

    /**
     * @param value {@link #policy} (The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.)
     */
    public AuditEventParticipantComponent addPolicy(String value) {
        // 1
        UriType t = new UriType();
        t.setValue(value);
        if (this.policy == null)
            this.policy = new ArrayList<UriType>();
        this.policy.add(t);
        return this;
    }

    /**
     * @param value {@link #policy} (The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.)
     */
    public boolean hasPolicy(String value) {
        if (this.policy == null)
            return false;
        for (UriType v : this.policy) if (// uri
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #media} (Type of media involved. Used when the event is about exporting/importing onto media.)
     */
    public Coding getMedia() {
        if (this.media == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantComponent.media");
            else if (Configuration.doAutoCreate())
                // cc
                this.media = new Coding();
        return this.media;
    }

    public boolean hasMedia() {
        return this.media != null && !this.media.isEmpty();
    }

    /**
     * @param value {@link #media} (Type of media involved. Used when the event is about exporting/importing onto media.)
     */
    public AuditEventParticipantComponent setMedia(Coding value) {
        this.media = value;
        return this;
    }

    /**
     * @return {@link #network} (Logical network location for application activity, if the activity has a network location.)
     */
    public AuditEventParticipantNetworkComponent getNetwork() {
        if (this.network == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AuditEventParticipantComponent.network");
            else if (Configuration.doAutoCreate())
                // cc
                this.network = new AuditEventParticipantNetworkComponent();
        return this.network;
    }

    public boolean hasNetwork() {
        return this.network != null && !this.network.isEmpty();
    }

    /**
     * @param value {@link #network} (Logical network location for application activity, if the activity has a network location.)
     */
    public AuditEventParticipantComponent setNetwork(AuditEventParticipantNetworkComponent value) {
        this.network = value;
        return this;
    }

    /**
     * @return {@link #purposeOfUse} (The reason (purpose of use), specific to this participant, that was used during the event being recorded.)
     */
    public List<Coding> getPurposeOfUse() {
        if (this.purposeOfUse == null)
            this.purposeOfUse = new ArrayList<Coding>();
        return this.purposeOfUse;
    }

    public boolean hasPurposeOfUse() {
        if (this.purposeOfUse == null)
            return false;
        for (Coding item : this.purposeOfUse) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public Coding addPurposeOfUse() {
        // 3
        Coding t = new Coding();
        if (this.purposeOfUse == null)
            this.purposeOfUse = new ArrayList<Coding>();
        this.purposeOfUse.add(t);
        return t;
    }

    // syntactic sugar
    public AuditEventParticipantComponent addPurposeOfUse(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.purposeOfUse == null)
            this.purposeOfUse = new ArrayList<Coding>();
        this.purposeOfUse.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("role", "CodeableConcept", "Specification of the role(s) the user plays when performing the event. Usually the codes used in this element are local codes defined by the role-based access control security system used in the local context.", 0, java.lang.Integer.MAX_VALUE, role));
        childrenList.add(new Property("reference", "Reference(Practitioner|Organization|Device|Patient|RelatedPerson)", "Direct reference to a resource that identifies the participant.", 0, java.lang.Integer.MAX_VALUE, reference));
        childrenList.add(new Property("userId", "Identifier", "Unique identifier for the user actively participating in the event.", 0, java.lang.Integer.MAX_VALUE, userId));
        childrenList.add(new Property("altId", "string", "Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available.", 0, java.lang.Integer.MAX_VALUE, altId));
        childrenList.add(new Property("name", "string", "Human-meaningful name for the user.", 0, java.lang.Integer.MAX_VALUE, name));
        childrenList.add(new Property("requestor", "boolean", "Indicator that the user is or is not the requestor, or initiator, for the event being audited.", 0, java.lang.Integer.MAX_VALUE, requestor));
        childrenList.add(new Property("location", "Reference(Location)", "Where the event occurred.", 0, java.lang.Integer.MAX_VALUE, location));
        childrenList.add(new Property("policy", "uri", "The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.", 0, java.lang.Integer.MAX_VALUE, policy));
        childrenList.add(new Property("media", "Coding", "Type of media involved. Used when the event is about exporting/importing onto media.", 0, java.lang.Integer.MAX_VALUE, media));
        childrenList.add(new Property("network", "", "Logical network location for application activity, if the activity has a network location.", 0, java.lang.Integer.MAX_VALUE, network));
        childrenList.add(new Property("purposeOfUse", "Coding", "The reason (purpose of use), specific to this participant, that was used during the event being recorded.", 0, java.lang.Integer.MAX_VALUE, purposeOfUse));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("role"))
            this.getRole().add(castToCodeableConcept(value));
        else if (name.equals("reference"))
            // Reference
            this.reference = castToReference(value);
        else if (name.equals("userId"))
            // Identifier
            this.userId = castToIdentifier(value);
        else if (name.equals("altId"))
            // StringType
            this.altId = castToString(value);
        else if (name.equals("name"))
            // StringType
            this.name = castToString(value);
        else if (name.equals("requestor"))
            // BooleanType
            this.requestor = castToBoolean(value);
        else if (name.equals("location"))
            // Reference
            this.location = castToReference(value);
        else if (name.equals("policy"))
            this.getPolicy().add(castToUri(value));
        else if (name.equals("media"))
            // Coding
            this.media = castToCoding(value);
        else if (name.equals("network"))
            // AuditEventParticipantNetworkComponent
            this.network = (AuditEventParticipantNetworkComponent) value;
        else if (name.equals("purposeOfUse"))
            this.getPurposeOfUse().add(castToCoding(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("role")) {
            return addRole();
        } else if (name.equals("reference")) {
            this.reference = new Reference();
            return this.reference;
        } else if (name.equals("userId")) {
            this.userId = new Identifier();
            return this.userId;
        } else if (name.equals("altId")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.altId");
        } else if (name.equals("name")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.name");
        } else if (name.equals("requestor")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.requestor");
        } else if (name.equals("location")) {
            this.location = new Reference();
            return this.location;
        } else if (name.equals("policy")) {
            throw new FHIRException("Cannot call addChild on a primitive type AuditEvent.policy");
        } else if (name.equals("media")) {
            this.media = new Coding();
            return this.media;
        } else if (name.equals("network")) {
            this.network = new AuditEventParticipantNetworkComponent();
            return this.network;
        } else if (name.equals("purposeOfUse")) {
            return addPurposeOfUse();
        } else
            return super.addChild(name);
    }

    public AuditEventParticipantComponent copy() {
        AuditEventParticipantComponent dst = new AuditEventParticipantComponent();
        copyValues(dst);
        if (role != null) {
            dst.role = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : role) dst.role.add(i.copy());
        }
        ;
        dst.reference = reference == null ? null : reference.copy();
        dst.userId = userId == null ? null : userId.copy();
        dst.altId = altId == null ? null : altId.copy();
        dst.name = name == null ? null : name.copy();
        dst.requestor = requestor == null ? null : requestor.copy();
        dst.location = location == null ? null : location.copy();
        if (policy != null) {
            dst.policy = new ArrayList<UriType>();
            for (UriType i : policy) dst.policy.add(i.copy());
        }
        ;
        dst.media = media == null ? null : media.copy();
        dst.network = network == null ? null : network.copy();
        if (purposeOfUse != null) {
            dst.purposeOfUse = new ArrayList<Coding>();
            for (Coding i : purposeOfUse) dst.purposeOfUse.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AuditEventParticipantComponent))
            return false;
        AuditEventParticipantComponent o = (AuditEventParticipantComponent) other;
        return compareDeep(role, o.role, true) && compareDeep(reference, o.reference, true) && compareDeep(userId, o.userId, true) && compareDeep(altId, o.altId, true) && compareDeep(name, o.name, true) && compareDeep(requestor, o.requestor, true) && compareDeep(location, o.location, true) && compareDeep(policy, o.policy, true) && compareDeep(media, o.media, true) && compareDeep(network, o.network, true) && compareDeep(purposeOfUse, o.purposeOfUse, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AuditEventParticipantComponent))
            return false;
        AuditEventParticipantComponent o = (AuditEventParticipantComponent) other;
        return compareValues(altId, o.altId, true) && compareValues(name, o.name, true) && compareValues(requestor, o.requestor, true) && compareValues(policy, o.policy, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (role == null || role.isEmpty()) && (reference == null || reference.isEmpty()) && (userId == null || userId.isEmpty()) && (altId == null || altId.isEmpty()) && (name == null || name.isEmpty()) && (requestor == null || requestor.isEmpty()) && (location == null || location.isEmpty()) && (policy == null || policy.isEmpty()) && (media == null || media.isEmpty()) && (network == null || network.isEmpty()) && (purposeOfUse == null || purposeOfUse.isEmpty());
    }

    public String fhirType() {
        return "AuditEvent.participant";
    }
}
