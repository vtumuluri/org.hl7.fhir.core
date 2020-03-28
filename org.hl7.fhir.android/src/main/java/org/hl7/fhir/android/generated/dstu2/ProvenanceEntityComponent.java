package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.ProvenanceEnum.ProvenanceEntityRoleEnumFactory;
import org.hl7.fhir.android.generated.dstu2.ProvenanceEnum.ProvenanceEntityRole;

public class ProvenanceEntityComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * How the entity was used during the activity.
     */
    protected Enumeration<ProvenanceEntityRole> role;

    /**
     * The type of the entity. If the entity is a resource, then this is a resource type.
     */
    protected Coding type;

    /**
     * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
     */
    protected UriType reference;

    /**
     * Human-readable description of the entity.
     */
    protected StringType display;

    /**
     * The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.
     */
    protected ProvenanceAgentComponent agent;

    private static final long serialVersionUID = 1533729633L;

    /*
     * Constructor
     */
    public ProvenanceEntityComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ProvenanceEntityComponent(Enumeration<ProvenanceEntityRole> role, Coding type, UriType reference) {
        super();
        this.role = role;
        this.type = type;
        this.reference = reference;
    }

    /**
     * @return {@link #role} (How the entity was used during the activity.). This is the underlying object with id, value and extensions. The accessor "getRole" gives direct access to the value
     */
    public Enumeration<ProvenanceEntityRole> getRoleElement() {
        if (this.role == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProvenanceEntityComponent.role");
            else if (Configuration.doAutoCreate())
                // bb
                this.role = new Enumeration<ProvenanceEntityRole>(new ProvenanceEntityRoleEnumFactory());
        return this.role;
    }

    public boolean hasRoleElement() {
        return this.role != null && !this.role.isEmpty();
    }

    public boolean hasRole() {
        return this.role != null && !this.role.isEmpty();
    }

    /**
     * @param value {@link #role} (How the entity was used during the activity.). This is the underlying object with id, value and extensions. The accessor "getRole" gives direct access to the value
     */
    public ProvenanceEntityComponent setRoleElement(Enumeration<ProvenanceEntityRole> value) {
        this.role = value;
        return this;
    }

    /**
     * @return How the entity was used during the activity.
     */
    public ProvenanceEntityRole getRole() {
        return this.role == null ? null : this.role.getValue();
    }

    /**
     * @param value How the entity was used during the activity.
     */
    public ProvenanceEntityComponent setRole(ProvenanceEntityRole value) {
        if (this.role == null)
            this.role = new Enumeration<ProvenanceEntityRole>(new ProvenanceEntityRoleEnumFactory());
        this.role.setValue(value);
        return this;
    }

    /**
     * @return {@link #type} (The type of the entity. If the entity is a resource, then this is a resource type.)
     */
    public Coding getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProvenanceEntityComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new Coding();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of the entity. If the entity is a resource, then this is a resource type.)
     */
    public ProvenanceEntityComponent setType(Coding value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #reference} (Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.). This is the underlying object with id, value and extensions. The accessor "getReference" gives direct access to the value
     */
    public UriType getReferenceElement() {
        if (this.reference == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProvenanceEntityComponent.reference");
            else if (Configuration.doAutoCreate())
                // bb
                this.reference = new UriType();
        return this.reference;
    }

    public boolean hasReferenceElement() {
        return this.reference != null && !this.reference.isEmpty();
    }

    public boolean hasReference() {
        return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.). This is the underlying object with id, value and extensions. The accessor "getReference" gives direct access to the value
     */
    public ProvenanceEntityComponent setReferenceElement(UriType value) {
        this.reference = value;
        return this;
    }

    /**
     * @return Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
     */
    public String getReference() {
        return this.reference == null ? null : this.reference.getValue();
    }

    /**
     * @param value Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
     */
    public ProvenanceEntityComponent setReference(String value) {
        if (this.reference == null)
            this.reference = new UriType();
        this.reference.setValue(value);
        return this;
    }

    /**
     * @return {@link #display} (Human-readable description of the entity.). This is the underlying object with id, value and extensions. The accessor "getDisplay" gives direct access to the value
     */
    public StringType getDisplayElement() {
        if (this.display == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProvenanceEntityComponent.display");
            else if (Configuration.doAutoCreate())
                // bb
                this.display = new StringType();
        return this.display;
    }

    public boolean hasDisplayElement() {
        return this.display != null && !this.display.isEmpty();
    }

    public boolean hasDisplay() {
        return this.display != null && !this.display.isEmpty();
    }

    /**
     * @param value {@link #display} (Human-readable description of the entity.). This is the underlying object with id, value and extensions. The accessor "getDisplay" gives direct access to the value
     */
    public ProvenanceEntityComponent setDisplayElement(StringType value) {
        this.display = value;
        return this;
    }

    /**
     * @return Human-readable description of the entity.
     */
    public String getDisplay() {
        return this.display == null ? null : this.display.getValue();
    }

    /**
     * @param value Human-readable description of the entity.
     */
    public ProvenanceEntityComponent setDisplay(String value) {
        if (Utilities.noString(value))
            this.display = null;
        else {
            if (this.display == null)
                this.display = new StringType();
            this.display.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #agent} (The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.)
     */
    public ProvenanceAgentComponent getAgent() {
        if (this.agent == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProvenanceEntityComponent.agent");
            else if (Configuration.doAutoCreate())
                // cc
                this.agent = new ProvenanceAgentComponent();
        return this.agent;
    }

    public boolean hasAgent() {
        return this.agent != null && !this.agent.isEmpty();
    }

    /**
     * @param value {@link #agent} (The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.)
     */
    public ProvenanceEntityComponent setAgent(ProvenanceAgentComponent value) {
        this.agent = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("role", "code", "How the entity was used during the activity.", 0, java.lang.Integer.MAX_VALUE, role));
        childrenList.add(new Property("type", "Coding", "The type of the entity. If the entity is a resource, then this is a resource type.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("reference", "uri", "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.", 0, java.lang.Integer.MAX_VALUE, reference));
        childrenList.add(new Property("display", "string", "Human-readable description of the entity.", 0, java.lang.Integer.MAX_VALUE, display));
        childrenList.add(new Property("agent", "@Provenance.agent", "The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.", 0, java.lang.Integer.MAX_VALUE, agent));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("role"))
            // Enumeration<ProvenanceEntityRole>
            this.role = new ProvenanceEntityRoleEnumFactory().fromType(value);
        else if (name.equals("type"))
            // Coding
            this.type = castToCoding(value);
        else if (name.equals("reference"))
            // UriType
            this.reference = castToUri(value);
        else if (name.equals("display"))
            // StringType
            this.display = castToString(value);
        else if (name.equals("agent"))
            // ProvenanceAgentComponent
            this.agent = (ProvenanceAgentComponent) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("role")) {
            throw new FHIRException("Cannot call addChild on a primitive type Provenance.role");
        } else if (name.equals("type")) {
            this.type = new Coding();
            return this.type;
        } else if (name.equals("reference")) {
            throw new FHIRException("Cannot call addChild on a primitive type Provenance.reference");
        } else if (name.equals("display")) {
            throw new FHIRException("Cannot call addChild on a primitive type Provenance.display");
        } else if (name.equals("agent")) {
            this.agent = new ProvenanceAgentComponent();
            return this.agent;
        } else
            return super.addChild(name);
    }

    public ProvenanceEntityComponent copy() {
        ProvenanceEntityComponent dst = new ProvenanceEntityComponent();
        copyValues(dst);
        dst.role = role == null ? null : role.copy();
        dst.type = type == null ? null : type.copy();
        dst.reference = reference == null ? null : reference.copy();
        dst.display = display == null ? null : display.copy();
        dst.agent = agent == null ? null : agent.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ProvenanceEntityComponent))
            return false;
        ProvenanceEntityComponent o = (ProvenanceEntityComponent) other;
        return compareDeep(role, o.role, true) && compareDeep(type, o.type, true) && compareDeep(reference, o.reference, true) && compareDeep(display, o.display, true) && compareDeep(agent, o.agent, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ProvenanceEntityComponent))
            return false;
        ProvenanceEntityComponent o = (ProvenanceEntityComponent) other;
        return compareValues(role, o.role, true) && compareValues(reference, o.reference, true) && compareValues(display, o.display, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (role == null || role.isEmpty()) && (type == null || type.isEmpty()) && (reference == null || reference.isEmpty()) && (display == null || display.isEmpty()) && (agent == null || agent.isEmpty());
    }

    public String fhirType() {
        return "Provenance.entity";
    }
}
