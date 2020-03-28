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

public class ProvenanceAgentRelatedAgentComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * The type of relationship between agents.
     */
    protected CodeableConcept type;

    /**
     * An internal reference to another agent listed in this provenance by its identifier.
     */
    protected UriType target;

    private static final long serialVersionUID = 794181198L;

    /*
     * Constructor
     */
    public ProvenanceAgentRelatedAgentComponent() {
        super();
    }

    /*
     * Constructor
     */
    public ProvenanceAgentRelatedAgentComponent(CodeableConcept type, UriType target) {
        super();
        this.type = type;
        this.target = target;
    }

    /**
     * @return {@link #type} (The type of relationship between agents.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProvenanceAgentRelatedAgentComponent.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of relationship between agents.)
     */
    public ProvenanceAgentRelatedAgentComponent setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #target} (An internal reference to another agent listed in this provenance by its identifier.). This is the underlying object with id, value and extensions. The accessor "getTarget" gives direct access to the value
     */
    public UriType getTargetElement() {
        if (this.target == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProvenanceAgentRelatedAgentComponent.target");
            else if (Configuration.doAutoCreate())
                // bb
                this.target = new UriType();
        return this.target;
    }

    public boolean hasTargetElement() {
        return this.target != null && !this.target.isEmpty();
    }

    public boolean hasTarget() {
        return this.target != null && !this.target.isEmpty();
    }

    /**
     * @param value {@link #target} (An internal reference to another agent listed in this provenance by its identifier.). This is the underlying object with id, value and extensions. The accessor "getTarget" gives direct access to the value
     */
    public ProvenanceAgentRelatedAgentComponent setTargetElement(UriType value) {
        this.target = value;
        return this;
    }

    /**
     * @return An internal reference to another agent listed in this provenance by its identifier.
     */
    public String getTarget() {
        return this.target == null ? null : this.target.getValue();
    }

    /**
     * @param value An internal reference to another agent listed in this provenance by its identifier.
     */
    public ProvenanceAgentRelatedAgentComponent setTarget(String value) {
        if (this.target == null)
            this.target = new UriType();
        this.target.setValue(value);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "The type of relationship between agents.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("target", "uri", "An internal reference to another agent listed in this provenance by its identifier.", 0, java.lang.Integer.MAX_VALUE, target));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("target"))
            // UriType
            this.target = castToUri(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("target")) {
            throw new FHIRException("Cannot call addChild on a primitive type Provenance.target");
        } else
            return super.addChild(name);
    }

    public ProvenanceAgentRelatedAgentComponent copy() {
        ProvenanceAgentRelatedAgentComponent dst = new ProvenanceAgentRelatedAgentComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.target = target == null ? null : target.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ProvenanceAgentRelatedAgentComponent))
            return false;
        ProvenanceAgentRelatedAgentComponent o = (ProvenanceAgentRelatedAgentComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(target, o.target, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ProvenanceAgentRelatedAgentComponent))
            return false;
        ProvenanceAgentRelatedAgentComponent o = (ProvenanceAgentRelatedAgentComponent) other;
        return compareValues(target, o.target, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (target == null || target.isEmpty());
    }

    public String fhirType() {
        return "Provenance.agent.relatedAgent";
    }
}
