package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ProvenanceEnum.ProvenanceEntityRole;
import org.hl7.fhir.android.generated.dstu2.ProvenanceEnum.ProvenanceEntityRoleEnumFactory;

public class ProvenanceAgentComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The function of the agent with respect to the activity.
     */
    protected Coding role;

    /**
     * The individual, device or organization that participated in the event.
     */
    protected Reference actor;

    /**
     * The actual object that is the target of the reference (The individual, device or organization that participated in the event.)
     */
    protected Resource actorTarget;

    /**
     * The identity of the agent as known by the authorization system.
     */
    protected Identifier userId;

    /**
     * A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest.
     */
    protected List<ProvenanceAgentRelatedAgentComponent> relatedAgent;

    private static final long serialVersionUID = 1792758952L;

    /*
     * Constructor
     */
    public ProvenanceAgentComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ProvenanceAgentComponent(Coding role) {
        super();
        this.role = role;
    }

    /**
     * @return {@link #role} (The function of the agent with respect to the activity.)
     */
    public Coding getRole() {
        if (this.role == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProvenanceAgentComponent.role");
            else if (Configuration.doAutoCreate())
                // cc
                this.role = new Coding();
        return this.role;
    }

    public boolean hasRole() {
        return this.role != null && !this.role.isEmpty();
    }

    /**
     * @param value {@link #role} (The function of the agent with respect to the activity.)
     */
    public ProvenanceAgentComponent setRole(Coding value) {
        this.role = value;
        return this;
    }

    /**
     * @return {@link #actor} (The individual, device or organization that participated in the event.)
     */
    public Reference getActor() {
        if (this.actor == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProvenanceAgentComponent.actor");
            else if (Configuration.doAutoCreate())
                // cc
                this.actor = new Reference();
        return this.actor;
    }

    public boolean hasActor() {
        return this.actor != null && !this.actor.isEmpty();
    }

    /**
     * @param value {@link #actor} (The individual, device or organization that participated in the event.)
     */
    public ProvenanceAgentComponent setActor(Reference value) {
        this.actor = value;
        return this;
    }

    /**
     * @return {@link #actor} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The individual, device or organization that participated in the event.)
     */
    public Resource getActorTarget() {
        return this.actorTarget;
    }

    /**
     * @param value {@link #actor} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The individual, device or organization that participated in the event.)
     */
    public ProvenanceAgentComponent setActorTarget(Resource value) {
        this.actorTarget = value;
        return this;
    }

    /**
     * @return {@link #userId} (The identity of the agent as known by the authorization system.)
     */
    public Identifier getUserId() {
        if (this.userId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProvenanceAgentComponent.userId");
            else if (Configuration.doAutoCreate())
                // cc
                this.userId = new Identifier();
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null && !this.userId.isEmpty();
    }

    /**
     * @param value {@link #userId} (The identity of the agent as known by the authorization system.)
     */
    public ProvenanceAgentComponent setUserId(Identifier value) {
        this.userId = value;
        return this;
    }

    /**
     * @return {@link #relatedAgent} (A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest.)
     */
    public List<ProvenanceAgentRelatedAgentComponent> getRelatedAgent() {
        if (this.relatedAgent == null)
            this.relatedAgent = new ArrayList<ProvenanceAgentRelatedAgentComponent>();
        return this.relatedAgent;
    }

    public boolean hasRelatedAgent() {
        if (this.relatedAgent == null)
            return false;
        for (ProvenanceAgentRelatedAgentComponent item : this.relatedAgent) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public ProvenanceAgentRelatedAgentComponent addRelatedAgent() {
        // 3
        ProvenanceAgentRelatedAgentComponent t = new ProvenanceAgentRelatedAgentComponent();
        if (this.relatedAgent == null)
            this.relatedAgent = new ArrayList<ProvenanceAgentRelatedAgentComponent>();
        this.relatedAgent.add(t);
        return t;
    }

    // syntactic sugar
    public ProvenanceAgentComponent addRelatedAgent(ProvenanceAgentRelatedAgentComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.relatedAgent == null)
            this.relatedAgent = new ArrayList<ProvenanceAgentRelatedAgentComponent>();
        this.relatedAgent.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("role", "Coding", "The function of the agent with respect to the activity.", 0, java.lang.Integer.MAX_VALUE, role));
        childrenList.add(new Property("actor", "Reference(Practitioner|RelatedPerson|Patient|Device|Organization)", "The individual, device or organization that participated in the event.", 0, java.lang.Integer.MAX_VALUE, actor));
        childrenList.add(new Property("userId", "Identifier", "The identity of the agent as known by the authorization system.", 0, java.lang.Integer.MAX_VALUE, userId));
        childrenList.add(new Property("relatedAgent", "", "A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest.", 0, java.lang.Integer.MAX_VALUE, relatedAgent));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("role"))
            // Coding
            this.role = castToCoding(value);
        else if (name.equals("actor"))
            // Reference
            this.actor = castToReference(value);
        else if (name.equals("userId"))
            // Identifier
            this.userId = castToIdentifier(value);
        else if (name.equals("relatedAgent"))
            this.getRelatedAgent().add((ProvenanceAgentRelatedAgentComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("role")) {
            this.role = new Coding();
            return this.role;
        } else if (name.equals("actor")) {
            this.actor = new Reference();
            return this.actor;
        } else if (name.equals("userId")) {
            this.userId = new Identifier();
            return this.userId;
        } else if (name.equals("relatedAgent")) {
            return addRelatedAgent();
        } else
            return super.addChild(name);
    }

    public ProvenanceAgentComponent copy() {
        ProvenanceAgentComponent dst = new ProvenanceAgentComponent();
        copyValues(dst);
        dst.role = role == null ? null : role.copy();
        dst.actor = actor == null ? null : actor.copy();
        dst.userId = userId == null ? null : userId.copy();
        if (relatedAgent != null) {
            dst.relatedAgent = new ArrayList<ProvenanceAgentRelatedAgentComponent>();
            for (ProvenanceAgentRelatedAgentComponent i : relatedAgent) dst.relatedAgent.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ProvenanceAgentComponent))
            return false;
        ProvenanceAgentComponent o = (ProvenanceAgentComponent) other;
        return compareDeep(role, o.role, true) && compareDeep(actor, o.actor, true) && compareDeep(userId, o.userId, true) && compareDeep(relatedAgent, o.relatedAgent, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ProvenanceAgentComponent))
            return false;
        ProvenanceAgentComponent o = (ProvenanceAgentComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (role == null || role.isEmpty()) && (actor == null || actor.isEmpty()) && (userId == null || userId.isEmpty()) && (relatedAgent == null || relatedAgent.isEmpty());
    }

    public String fhirType() {
        return "Provenance.agent";
    }
}
